(ns propel.simple-expression-grammar
  (:require [propel.util :as u]))

(def expr-grammar-instructions
  [
    'S->Num
    'S->x
    'S->Plus
    'S->Minus
    'S->Times
    'S->Divide
    'Num->0
    'Num->1])

(defn S->Num
  [state]
  (u/make-push-instruction state identity [:num-expr] :expr))

(defn S->x
  [state]
  (u/make-push-instruction state (constantly 'x) [] :expr))

(defn make-binary-expr-instruction
  [func]
  (fn [state]
    (u/make-push-instruction state (partial list func) [:expr :expr] :expr)))

(defn protected-division [x y]
  (if (zero? y) 1 (quot x y)))

(def S->Plus (make-binary-expr-instruction '+'))
(def S->Minus (make-binary-expr-instruction '-'))
(def S->Times (make-binary-expr-instruction '*'))
(def S->Divide (make-binary-expr-instruction 'g/protected-division))

(defn Num->0
  [state]
  (u/make-push-instruction state (constantly 0) [] :num-expr))

(defn Num->1
  [state]
  (u/make-push-instruction state (constantly 1) [] :num-expr))

(defmacro def-func [arg-name body]
  `(fn [~arg-name] ~body))

(defmacro body->function [body]
  (list 'fn '[x] body))

(defn gen-fn
  [n as b]
  (let [n        (symbol n)
        as       (vec (map symbol as))
        fn-value (eval `(fn ~n ~as ~b))]
    (intern *ns* n fn-value)))

(defn gen-anon-fn
  [args body]
  (eval `(fn ~args ~body)))

(defn regression-error-function
  "Finds the behaviors and errors of the individual using a grammar."
  [target-function argmap individual]
  (let [grammar-productions (u/push-from-plushy (:plushy individual))
        program (u/peek-stack
                  (u/interpret-program
                    grammar-productions
                    u/empty-push-state
                    (:step-limit argmap))
                  :expr)
        func (gen-anon-fn '[x] program)
        inputs (range -10 11)
        target-outputs (map target-function inputs)
        actual-outputs (map func inputs)
        errors (map (fn [target-output actual-output]
                      (if (= actual-output :no-stack-item)
                        1000000
                        (u/abs (-' target-output actual-output))))
                    target-outputs
                    actual-outputs)]
    (assoc individual
           :behaviors actual-outputs
           :errors errors
           :total-error (apply +' errors))))

; Evolved solution to `target-function-hard`:
; (g/S->Plus g/S->Minus g/S->Plus exec_dup (exec_dup (g/S->Times g/S->Num g/S->Minus g/S->Times g/S->Minus g/S->Divide g/S->Divide g/S->Minus g/S->Plus g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->Num g/S->Plus g/S->x g/S->x g/S->Plus exec_dup (g/Num->1 g/S->Plus g/Num->0 g/S->Minus g/Num->1 g/Num->1 g/S->x g/S->Num g/S->Minus g/S->Num g/S->Minus)))))
; pop size 1,000, lexicase selection, solution found in generation 183.
; When run this generates the following expression:
; (-' (-' x 1) 1) (+' (+' (+' (+' (+' (+' (+' (-' (*' (+' (+' (+' (+' (+' (+' (+' (-' (*' (+' (+' (+' (+' (+' (+' (+' (-' (*' (+' (+' (+' (+' (+' (+' x x) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) (+' x x)) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) 1) (+' x x)) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) (+' x x)) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) 1) (+' x x)) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) (+' x x)) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) 1) (+' x x)) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) (+' x x)) (-' (-' x 1) 1))

; Actually, I'm not sure how this possible "succeeds".
; Here's the whole report for the last generation:
;
; -------------------------------------------------------
;                Report for Generation 183
; -------------------------------------------------------
; Best plushy: (g/S->Plus g/S->Minus g/S->Plus exec_dup exec_dup g/S->Times g/S->Num g/S->Minus g/S->Times g/S->Minus g/S->Divide g/S->Divide g/S->Minus g/S->Plus g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->Num g/S->Plus g/S->x g/S->x g/S->Plus exec_dup g/Num->1 g/S->Plus g/Num->0 g/S->Minus g/Num->1 g/Num->1 g/S->x g/S->Num g/S->Minus g/S->Num g/S->Minus)
; Best program: (g/S->Plus g/S->Minus g/S->Plus exec_dup (exec_dup (g/S->Times g/S->Num g/S->Minus g/S->Times g/S->Minus g/S->Divide g/S->Divide g/S->Minus g/S->Plus g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->Num g/S->Plus g/S->x g/S->x g/S->Plus exec_dup (g/Num->1 g/S->Plus g/Num->0 g/S->Minus g/Num->1 g/Num->1 g/S->x g/S->Num g/S->Minus g/S->Num g/S->Minus)))))
; Best total error: 0
; Best errors: (0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0)
; Best behaviors: (913 760 621 496 385 288 205 136 81 40 13 0 1 16 45 88 145 216 301 400 513)
;
; SUCCESS
;

; Actually, this is totally dependent on the step limit being only 100. If you run
; it to completion, you end up with two things on the :expr stack, and the top one
; is tiny. If you limit it to just 100 steps, the top of the :exec stack is:

; (+' (-' (*' (+' (+' (+' (+' (+' (+' x x) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) (+' x x)) (-' (-' x 1) 1)) (-' (-' x 1) 1)) 0) 1)

; This converts to infix as:

; (((((((((x+x)+((x-1)-1))+((x-1)-1))+0)+(x+x))+((x-1)-1))*((x-1)-1))-0)+1)

; which does simplify to 7x^2-20x+13, which was the target.

; This is weird because it's not using anything close to all the `exec-dup instructions,
; so I'm not really sure what's happening here as far as modules are concerned.

; Let's simplify:

; (((((((((x+x)+((x-1)-1))+((x-1)-1))+0)+(x+x))+((x-1)-1))*((x-1)-1))-0)+1)

; =

; ((((((((2x+((x-1)-1))+((x-1)-1))+0)+2x)+((x-1)-1))*((x-1)-1))-0)+1)

; =

; ((((((((2x+(x-2))+(x-2))+0)+2x)+(x-2))*(x-2))-0)+1)

; =

; ((((((2x+(x-2))+(x-2))+2x)+(x-2))*(x-2))+1)

; =

; (((2x+(x-2)+(x-2)+2x+(x-2))*(x-2))+1)

; =

; (7x-6)(x-2)+1

; =

; 7x^2 -20x + 13

; So we ended up with two instances of 2x and four instances of x-2; this
; all includes two instances of 2x+x-2.

;;;;;;;;;;;;;;;

; Some other runs on the hard problem, using lexicase selection and
; step-limit of 1000.

; Success in generation 126
; (g/S->Minus g/S->x g/S->Times g/Num->1 g/S->Plus g/S->x g/S->x g/S->x g/S->x g/S->Plus g/S->x exec_dup (g/Num->0 g/S->x g/S->Minus g/S->Num g/Num->0 g/S->x g/S->Times g/S->Num exec_dup (exec_dup (g/S->Plus exec_dup (g/S->x g/S->Num g/S->Minus g/S->Minus g/S->Times g/S->Divide g/S->Minus exec_dup (g/S->Minus g/S->Minus g/S->Divide exec_dup (exec_dup (g/Num->1))))))))

; Success in generation 241
; (g/S->Times g/S->Times g/S->x g/S->Divide g/S->Minus g/S->Times g/S->x g/S->x g/S->Times g/S->Divide g/S->Divide g/Num->1 g/Num->1 g/S->Minus g/S->Divide g/S->Plus g/S->Num g/S->x g/S->Plus g/S->Plus g/S->Plus g/S->Plus g/S->Plus g/S->Plus g/S->Times g/S->Times g/S->Num g/S->Num g/S->Divide g/S->x g/S->Num g/S->x g/S->Num g/S->Times g/Num->1 g/S->Minus g/S->Num g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus g/S->Times g/S->x g/S->Minus g/S->Divide g/S->Num g/S->Num g/Num->1 g/S->Num g/S->Num exec_dup (exec_dup (g/S->Divide g/Num->1 g/Num->1 g/Num->0 g/S->Times g/S->Num g/S->Minus g/S->x g/Num->1 exec_dup (g/S->Minus g/S->Times g/S->x g/S->x g/S->Times g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->x g/S->Minus g/S->Minus exec_dup (g/S->Num exec_dup (g/S->Plus))))))

; Success in generation 61
; (g/S->Divide g/S->x g/Num->0 g/Num->1 g/S->Plus g/S->Plus exec_dup (exec_dup (g/S->Divide g/S->Minus exec_dup (g/S->x g/S->Minus g/S->x g/S->x g/S->Times exec_dup (g/Num->0 g/S->Num g/S->Plus g/S->Plus g/Num->1 g/S->x g/S->Minus g/S->Minus g/S->Plus g/S->Plus g/S->Minus g/S->Minus g/S->Minus g/Num->0 g/S->Divide exec_dup (exec_dup (exec_dup (g/S->Num g/S->Num g/S->Minus g/S->Minus))))))))

; Success in generation 59
; (g/Num->1 g/Num->1 exec_dup (g/Num->1 g/Num->1 g/S->Divide g/S->Divide exec_dup (exec_dup (g/S->x g/S->x g/S->Times g/S->x g/Num->1 g/Num->0 g/S->Plus g/S->Plus exec_dup (g/S->Divide g/S->Plus g/S->Plus exec_dup (g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->Plus exec_dup (g/S->Num g/S->Plus))))))))

; Two or three failures in a throw

; Success in generation 196
;  (g/S->x g/S->Plus g/Num->1 g/S->Num g/S->Plus g/Num->0 g/S->Minus g/S->Minus g/S->Times g/S->Num g/S->x g/Num->1 g/Num->1 g/S->Num exec_dup (g/S->Minus g/S->Minus g/S->Times g/S->Times g/S->Divide g/S->Divide g/S->Times exec_dup (g/S->x g/Num->1 g/S->Num exec_dup (g/S->Plus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->x g/S->x g/S->Times g/S->Minus g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Minus g/Num->0 g/Num->0 g/Num->1 g/Num->1)))))

;;;;;;;;;;;;;;;

; I think all the following are with the easy target.

; A quick solution evolved later in 67 generations with pop size 200,
; :step-size 1000, and tournament selection:
; (g/S->Divide g/S->Minus g/S->Times exec_dup (g/S->x g/S->Minus g/S->Divide g/S->Divide g/S->x g/S->Times g/S->x g/S->Plus g/S->Num g/S->Num g/S->Num exec_dup (exec_dup (g/S->Plus g/Num->1 exec_dup (exec_dup ())))))

; Another quick soution, 32 generations same setup:
; (g/Num->1 g/S->Num g/S->Num g/S->Num g/Num->1 g/Num->1 g/S->Plus g/S->Num g/S->Num g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup (g/S->Plus g/S->Plus g/S->Plus))

; Super fast, 7 generations:
; (g/Num->1 g/S->Plus g/S->Minus g/Num->1 g/S->Minus g/S->Plus g/S->x exec_dup (g/S->Minus g/S->Plus g/S->x g/S->Times g/S->Times g/S->Times g/Num->0 g/S->Plus g/S->Times g/S->Divide g/Num->1 g/S->Num g/Num->0 g/S->Times g/S->Times g/S->Plus g/S->Times g/Num->1 g/S->Num exec_dup (exec_dup (g/S->Minus g/S->Num g/S->Minus g/Num->1 g/S->Plus g/S->Times g/S->Times g/S->Plus g/S->Num exec_dup (g/S->Plus g/S->Plus g/S->Minus)))))
