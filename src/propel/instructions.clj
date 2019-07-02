(ns propel.instructions)

;;;;;;;;;
;; Utilities

(def empty-push-state
  {:exec '()
   :integer '()
   :string '()
   :boolean '()
   :input {}})

(defn abs
  "Absolute value."
  [x]
  (if (neg? x)
    (- x)
    x))

(defn push-to-stack
  "Pushes item onto stack in state"
  [state stack item]
  (update state stack conj item))

(defn pop-stack
  "Removes top item of stack."
  [state stack]
  (update state stack rest))

(defn peek-stack
  "Returns top item on a stack."
  [state stack]
  (if (empty? (get state stack))
    :no-stack-item
    (first (get state stack))))

(defn empty-stack?
  "Returns true if the stack is empty."
  [state stack]
  (empty? (get state stack)))

(defn get-args-from-stacks
  "Takes a state and a list of stacks to take args from. If there are enough args
  on each of the desired stacks, returns a map of the form {:state :args}, where
  :state is the new state and :args is a list of args from the stacks. If there
  aren't enough args on the stacks, returns :not-enough-args."
  [state stacks]
  (loop [state state
         stacks (reverse stacks)
         args '()]
    (if (empty? stacks)
      {:state state :args args}
      (let [stack (first stacks)]
        (if (empty-stack? state stack)
          :not-enough-args
          (recur (pop-stack state stack)
                 (rest stacks)
                 (conj args (peek-stack state stack))))))))

(defn make-push-instruction
  "A utility function for making Push instructions. Takes a state, the function
  to apply to the args, the stacks to take the args from, and the stack to return
  the result to. Applies the function to the args (taken from the stacks) and pushes
  the return value onto return-stack."
  [state function arg-stacks return-stack]
  (let [args-pop-result (get-args-from-stacks state arg-stacks)]
    (if (= args-pop-result :not-enough-args)
      state
      (let [result (apply function (:args args-pop-result))
            new-state (:state args-pop-result)]
        (push-to-stack new-state return-stack result)))))

;;;;;;;;;
;; Instructions

(defn in1
  "Pushes the input labeled :in1 on the inputs map onto the :exec stack."
  [state]
  (push-to-stack state :exec (:in1 (:input state))))

(defn integer_+
  [state]
  (make-push-instruction state +' [:integer :integer] :integer))

(defn integer_-
  [state]
  (make-push-instruction state -' [:integer :integer] :integer))

(defn integer_*
  [state]
  (make-push-instruction state *' [:integer :integer] :integer))

(defn integer_%
  [state]
  (make-push-instruction state
                         (fn [int1 int2]
                           (if (zero? int2)
                             int1
                             (quot int1 int2)))
                         [:integer :integer]
                         :integer))

(defn integer_=
  [state]
  (make-push-instruction state = [:integer :integer] :boolean))

(defn exec_dup
  [state]
  (if (empty-stack? state :exec)
    state
    (push-to-stack state :exec (first (:exec state)))))

(defn exec_if
  [state]
  (make-push-instruction state
                         #(if %1 %3 %2)
                         [:boolean :exec :exec]
                         :exec))

(defn boolean_and
  [state]
  (make-push-instruction state #(and %1 %2) [:boolean :boolean] :boolean))

(defn boolean_or
  [state]
  (make-push-instruction state #(or %1 %2) [:boolean :boolean] :boolean))

(defn boolean_not
  [state]
  (make-push-instruction state not [:boolean] :boolean))

(defn boolean_=
  [state]
  (make-push-instruction state = [:boolean :boolean] :boolean))

(defn string_=
  [state]
  (make-push-instruction state = [:string :string] :boolean))

(defn string_take
  [state]
  (make-push-instruction state
                         #(apply str (take %1 %2))
                         [:integer :string]
                         :string))

(defn string_drop
  [state]
  (make-push-instruction state
                         #(apply str (drop %1 %2))
                         [:integer :string]
                         :string))

(defn string_reverse
  [state]
  (make-push-instruction state
                         #(apply str (reverse %))
                         [:string]
                         :string))

(defn string_concat
  [state]
  (make-push-instruction state
                         #(apply str (concat %1 %2))
                         [:string :string]
                         :string))

(defn string_length
  [state]
  (make-push-instruction state count [:string] :integer))

(defn string_includes?
  [state]
  (make-push-instruction state clojure.string/includes? [:string :string] :boolean))


  ; Instructions must all be either functions that take one Push state and return another
  ; or constant literals.
  ; TMH: ERCs?

  (def default-instructions
    `[in1
     integer_+
     integer_-
     integer_*
     integer_%
     integer_=
     exec_dup
     exec_if
     boolean_and
     boolean_or
     boolean_not
     boolean_=
     string_=
     string_take
     string_drop
     string_reverse
     string_concat
     string_length
     string_includes?
     :close
     0
     1
     10
     100
     true
     false
     ""
     "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
     "A"
     "C"
     "G"
     "T"
     ])

  (def opens ; number of blocks opened by instructions (default = 0)
    {'exec_dup 1
     'exec_if 2})


  ;;;;;;;;;
  ;; Interpreter

  (defn interpret-one-step
    "Takes a Push state and executes the next instruction on the exec stack."
    [state]
    (let [popped-state (pop-stack state :exec)
          first-instruction (first (:exec state))]

      (cond
        (symbol? first-instruction)
        (first-instruction popped-state)
        ;
        (integer? first-instruction)
        (push-to-stack popped-state :integer first-instruction)
        ;
        (string? first-instruction)
        (push-to-stack popped-state :string first-instruction)
        ;
        (seq? first-instruction)
        (update popped-state :exec #(concat %2 %1) first-instruction)
        ;
        (or (= first-instruction true) (= first-instruction false))
        (push-to-stack popped-state :boolean first-instruction)
        ;
        :else
        (throw (js/Error. (str "Unrecognized Push instruction in program: "
                                first-instruction
                                ))))))

  (defn interpret-program
    "Runs the given problem starting with the stacks in start-state."
    [program start-state step-limit]
    (loop [state (assoc start-state :exec program :step 1)]
      (if (or (empty? (:exec state))
              (> (:step state) step-limit))
        state
        (recur (update (interpret-one-step state) :step inc)))))

  (defn push-from-plushy
    "Returns the Push program expressed by the given plushy representation."
    [plushy]
    (let [opener? #(and (vector? %) (= (first %) 'open))] ;; [open <n>] marks opens
      (loop [push () ;; iteratively build the Push program from the plushy
             plushy (mapcat #(if-let [n (get opens %)] [% ['open n]] [%]) plushy)]
        (if (empty? plushy)       ;; maybe we're done?
          (if (some opener? push) ;; done with plushy, but unclosed open
            (recur push (list :close)) ;; recur with one more close
            push)                 ;; otherwise, really done, return push
          (let [i (first plushy)]
            (if (= i :close)
              (if (some opener? push) ;; process a close when there's an open
                (recur (let [post-open (reverse (take-while (comp not opener?)
                                                            (reverse push)))
                             open-index (- (count push) (count post-open) 1)
                             num-open (second (nth push open-index))
                             pre-open (take open-index push)]
                         (if (= 1 num-open)
                           (concat pre-open [post-open])
                           (concat pre-open [post-open ['open (dec num-open)]])))
                       (rest plushy))
                (recur push (rest plushy))) ;; unmatched close, ignore
              (recur (concat push [i]) (rest plushy)))))))) ;; anything else
