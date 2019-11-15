(ns propel.simple-expression-grammar
  (:require [propel.util :as u]))

(def expr-grammar-instructions
  ['S->Dot
   'S->Digit
   'S->Whitespace
   'S->Word
   'S->Char
   'S->Star
   'S->Plus
   'S->Append
   'Char->Open-paren
   'Char->Close-paren
   'Char->Space
   'Char->Dash
   'close])

(defn S->Dot
  [state]
  (u/make-push-instruction state (constantly ".") [] :regex))

(defn S->Digit
  [state]
  (u/make-push-instruction state (constantly "\d") [] :regex))

(defn S->Whitespace
  [state]
  (u/make-push-instruction state (constantly "\s") [] :regex))

(defn S->Word
  [state]
  (u/make-push-instruction state (constantly "\w") [] :regex))

(defn S->Char
  [state]
  (u/make-push-instruction state indentity [:string] :regex))

(defn S->Star
  [state]
  (u/make-push-instruction state #(str % "*") [:regex] :regex))

(defn S->Plus
  [state]
  (u/make-push-instruction state #(str % "+") [:regex] :regex))

(defn S->Append
  [state]
  (u/make-push-instruction state str [:regex :regex] :regex))

(defn Char->Open-paren
  [state]
  (u/make-push-instruction state (constantly "\(") [] :string))

(defn Char->Close-paren
  [state]
  (u/make-push-instruction state (constantly "\)") [] :string))

(defn Char->Space
  [state]
  (u/make-push-instruction state (constantly " ") [] :string))

(defn Char->Dash
  [state]
  (u/make-push-instruction state (constantly "\-") [] :string))

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

(def phone-test-cases
  [["(320) 589-6320" true]
   ["(320) 5896320" false]
   ])

(defn regex-error-function
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