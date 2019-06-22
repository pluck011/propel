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
