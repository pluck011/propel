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
    'Num->1
  ]
)

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
(def S->Divide (make-binary-expr-instruction 'protected-division))

(defn Num->0
  [state]
  (u/make-push-instruction state (constantly 0) [] :num-expr))

(defn Num->1
  [state]
  (u/make-push-instruction state (constantly 1) [] :num-expr))

(defmacro body->function [body]
  (list 'fn '[x] body))

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
        func (body->function program)
        inputs (range -10 11)
        target-outputs (map target-function inputs)
        actual-outputs (map func inputs)
        errors (map (fn [target-output actual-output]
                      (if (= actual-output :no-stack-item)
                        1000000
                        (u/abs (- target-output actual-output))))
                    target-outputs
                    actual-outputs)]
    (assoc individual
           :behaviors actual-outputs
           :errors errors
           :total-error (apply +' errors))))
