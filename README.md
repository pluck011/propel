# propel

Bill Tozier's fork of Lee Spector's Plushy fork of Tom Helmuth's little PushGP implementation in Clojure.

## project goals

This fork (Bill's) exists because he's prepping it to be embedded in a ClojureScript web app for demonstration and tutorial purposes. That is, one wants a single `.cljc` file that will run from the command line or in a Clojure REPL, or ClojureScript suitable for use in a web app.

Aside from various refactoring moves and clarifications, an important change is the move to a Clojure[script] `atom` for storing the state of the population of evolving solutions, and the removal of most "automatic" search functions. While there's still a command-line option to run the program for pedagogical reasons, the invoked function now (1) runs for exactly 100 generations, and (2) does not stop when a good solution is discovered.

The intended use case is to add the `propel.cljc` file (once it's been fixed for ClojureScript) into a project, build and populate the requisite atoms with `propel-setup!`, and launch a separate process which invokes `propel-population-step` to build a "next" population one generation at a time, and then manually `reset!` the exposed `atom`.

Note: neither of those two functions actually produces visible output, by design.

## Usage

To run PushGP on the default genetic programming problem from command line using the default arguments, execute `lein run`.

Command-line arguments may be provided to override the defaults specified in `-main`, for example, `lein run :population-size 100`.

Or for more fun try `lein run :target-problem :birthday-quadratic :max-generations 2 :parent-selection :lexicase`.

The default arguments at present are:

- `:instructions default-instructions`
    - cannot be changed in CLI; pass in a collection of instruction symbols when calling programmatically
- `:target-problem :simple-cubic`
    - `:simple-quadratic`
    - `:birthday-quadratic` (fit a simple quadratic with large constants)
    - `:contains-T?` (does the given string contain a `T`?)
    - `:contains-TA-or-AT?` (does the given string contain either substring?)
    - (**note**: earlier versions of this code permitted symbols as arguments, but not any more)
- `:population-size 200`
- `:max-initial-plushy-size 50`
- `:step-limit 100` (max number of steps to allow each program to run)
- `:parent-selection :tournament`
  - :`lexicase`
- `:misbehavior-penalty 1000000` ("fine" for not producing the desired behavior (item on a stack specified in the problem definition))
- `:tournament-size 5` (only useful when `:parent-selection :tournament`)

### cljs.main

To open a web-repl, invoke `clj -m cljs.main` in a shell in the project folder. This will open a (for the moment, unused) browser window, and a REPL. This does not automatically load the project into the REPL, so you should try something like this (although *be patient* because the printed report will not emit until after the entire run is finished!):

```
cljs.user=> (require '[propel.core :as p])

nil

cljs.user=> (p/collect-the-args! p/args-atom :override-hash {:max-generations 10}) ;; load arg defaults and merge specified overrides

{:max-initial-plushy-size 50, :misbehavior-penalty 1000000, :target-problem :simple-cubic, :instructions (integer_- integer_+ in1 boolean_or string_= integer_= exec_dup string_reverse boolean_= integer_% string_concat string_drop string_take integer_* exec_if boolean_not string_includes? boolean_and string_length close 0 1 10 100 true false "" "ABCDEFGHIJKLMNOPQRSTUVWXYZ" "A" "C" "G" "T"), :max-generations 10, :parent-selection :tournament, :training-function {:fxn #object[Function], :args (-10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 3 4 5 6 7 8 9 10), :behavior :integer, :error-function #object[propel$core$regression_error_function]}, :tournament-size 5, :step-limit 100, :error-function #object[propel$core$regression_error_function], :population-size 200}

cljs.user=> (apply p/propel-gp! (mapcat seq @p/args-atom)) ;; invoke propel-gp! on the argument hash stored in the atom state

Starting GP with args: {:max-initial-plushy-size 50, :misbehavior-penalty 1000000, :target-problem :simple-cubic, :instructions (integer_- integer_+ in1 boolean_or string_= integer_= exec_dup string_reverse boolean_= integer_% string_concat string_drop string_take integer_* exec_if boolean_not string_includes? boolean_and string_length close 0 1 10 100 true false  ABCDEFGHIJKLMNOPQRSTUVWXYZ A C G T), :max-generations 10, :parent-selection :tournament, :training-function {:fxn #object[Function], :args (-10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 3 4 5 6 7 8 9 10), :behavior :integer, :error-function #object[propel$core$regression_error_function]}, :tournament-size 5, :step-limit 100, :error-function #object[propel$core$regression_error_function], :population-size 200}
-------------------------------------------------------
               Report for Generation 0
-------------------------------------------------------
Best plushy: (integer_+ string_includes? string_includes? string_= string_take false string_length integer_% "ABCDEFGHIJKLMNOPQRSTUVWXYZ" boolean_= string_includes? exec_dup string_= 0 100 integer_+ "G" "ABCDEFGHIJKLMNOPQRSTUVWXYZ" "" in1 string_= integer_* "G" exec_dup "ABCDEFGHIJKLMNOPQRSTUVWXYZ" "")
Best program: (integer_+ string_includes? string_includes? string_= string_take false string_length integer_% "ABCDEFGHIJKLMNOPQRSTUVWXYZ" boolean_= string_includes? exec_dup (string_= 0 100 integer_+ "G" "ABCDEFGHIJKLMNOPQRSTUVWXYZ" "" in1 string_= integer_* "G" exec_dup ("ABCDEFGHIJKLMNOPQRSTUVWXYZ" "")))
Best total error: 4883
Best errors: (7 165 283 353 381 373 335 273 193 101 3 95 187 267 329 367 375 347 277 159 13)
Best behaviors: (-1000 -900 -800 -700 -600 -500 -400 -300 -200 -100 0 100 200 300 400 500 600 700 800 900 1000)

-------------------------------------------------------
               Report for Generation 1
-------------------------------------------------------
Best plushy: (integer_+ string_includes? string_includes? string_= string_take false string_length integer_% "ABCDEFGHIJKLMNOPQRSTUVWXYZ" boolean_= string_includes? exec_dup string_= integer_- 0 100 integer_+ "G" "ABCDEFGHIJKLMNOPQRSTUVWXYZ" "" in1 string_= integer_* "G" exec_dup "ABCDEFGHIJKLMNOPQRSTUVWXYZ" "")
Best program: (integer_+ string_includes? string_includes? string_= string_take false string_length integer_% "ABCDEFGHIJKLMNOPQRSTUVWXYZ" boolean_= string_includes? exec_dup (string_= integer_- 0 100 integer_+ "G" "ABCDEFGHIJKLMNOPQRSTUVWXYZ" "" in1 string_= integer_* "G" exec_dup ("ABCDEFGHIJKLMNOPQRSTUVWXYZ" "")))
Best total error: 4883
Best errors: (7 165 283 353 381 373 335 273 193 101 3 95 187 267 329 367 375 347 277 159 13)
Best behaviors: (-1000 -900 -800 -700 -600 -500 -400 -300 -200 -100 0 100 200 300 400 500 600 700 800 900 1000)
...

```

Or, if you just want to see it work in a REPL, there's a simple `repl-main` function that runs a quick setup-and-couple-of-steps for you, taking no arguments:

```
cljs.user=> (p/repl-main)

Starting GP with args: {:max-initial-plushy-size 50, :misbehavior-penalty 1000000, :target-problem :simple-cubic, :instructions (integer_- integer_+ in1 boolean_or string_= integer_= exec_dup string_reverse boolean_= integer_% string_concat string_drop string_take integer_* exec_if boolean_not string_includes? boolean_and string_length close 0 1 10 100 true false  ABCDEFGHIJKLMNOPQRSTUVWXYZ A C G T), :max-generations 3, :parent-selection :tournament, :training-function {:fxn #object[Function], :args (-10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 3 4 5 6 7 8 9 10), :behavior :integer, :error-function #object[propel$core$regression_error_function]}, :tournament-size 5, :step-limit 100, :error-function #object[propel$core$regression_error_function], :population-size 200}
-------------------------------------------------------
               Report for Generation 0
-------------------------------------------------------
Best plushy: (exec_if string_concat string_includes? string_concat 10 in1 in1 0 integer_+ string_drop boolean_or integer_+ "T")
Best program: (exec_if (string_concat string_includes? string_concat 10 in1 in1 0 integer_+ string_drop boolean_or integer_+ "T") ())
Best total error: 5949
Best errors: (987 717 501 333 207 117 57 21 3 3 3 3 9 27 63 123 213 339 507 723 993)
Best behaviors: (-20 -18 -16 -14 -12 -10 -8 -6 -4 -2 0 2 4 6 8 10 12 14 16 18 20)

-------------------------------------------------------
               Report for Generation 1
-------------------------------------------------------
Best plushy: ("C" false exec_dup 1 string_includes? string_take string_drop string_= in1 1 string_concat string_reverse integer_- integer_- "T" integer_* "T" "ABCDEFGHIJKLMNOPQRSTUVWXYZ" integer_% string_includes?)
Best program: ("C" false exec_dup (1 string_includes? string_take string_drop string_= in1 1 string_concat string_reverse integer_- integer_- "T" integer_* "T" "ABCDEFGHIJKLMNOPQRSTUVWXYZ" integer_% string_includes?))
Best total error: 5859
Best errors: (875 625 427 275 163 85 35 7 5 7 5 5 13 35 77 145 245 383 565 797 1085)
Best behaviors: (-132 -110 -90 -72 -56 -42 -30 -20 -12 -6 -2 0 0 -2 -6 -12 -20 -30 -42 -56 -72)

-------------------------------------------------------
               Report for Generation 2
-------------------------------------------------------
Best plushy: (string_reverse string_drop exec_if integer_* boolean_= string_concat in1 in1 integer_* in1 integer_* exec_dup string_length false 0 integer_- false true string_drop)
Best program: (string_reverse string_drop exec_if (integer_* boolean_= string_concat in1 in1 integer_* in1 integer_* exec_dup (string_length false 0 integer_- false true string_drop)) ())
Best total error: 119
Best errors: (7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13)
Best behaviors: (-1000 -729 -512 -343 -216 -125 -64 -27 -8 -1 0 1 8 27 64 125 216 343 512 729 1000)

nil
```

### Including it in a `cljs` project

Should just work? `¯\_(ツ)_/¯`

## Description

Propel is a minimalist implementation of the Push programming language and the PushGP genetic programming system in Clojure.

For more information on Push and PushGP see [http://pushlanguage.org](http://pushlanguage.org).

Propel was developed largely as a teaching tool, with the goal of conveying the core concepts of Push and PushGP as clearly and concisely as possible.

As of this writing, only a few data types and instructions are provided, but the intention is for these to serve as models for additions.

All of the code is in [src/propel/core.clj](https://github.com/lspector/propel/blob/master/src/propel/core.clj), while a [Gorilla REPL](http://gorilla-repl.org) worksheet showing a few examples (to which you can add in your copy) is in [worksheet.clj](https://github.com/lspector/propel/blob/master/worksheet.clj). You can view the repository's version of the worksheet, formatted (read-only), [here](http://viewer.gorilla-repl.org/view.html?source=github&user=lspector&repo=propel&path=worksheet.clj).

### The Plushy Part

In a genetic programming system, programs are randomly varied and recombined, with the goal of finding a program that serves a specified purpose.

In what form should the programs be represented for the sake of random variation and recombination?

Push programs are parenthesized lists of instructions and values, which can include sub-programs in sub-lists.

In early versions of PushGP, Push programs were varied and recombined in their "natural" form, as possibly-nested lists of instructions and values that could be added, deleted, and replaced at any level of nesting.

Later, however, linear (un-nested) representations of Push programs were developed, which:

- Provide better support for *uniform* variation operators (in which each program component has an equal likelihood of being affected).

- Increase the likelihood that programs will be nested where nesting matters, to form code blocks that are executed conditionally or repeatedly.

When these linear representations are used, they are translated into ordinary, possibly-nested Push programs prior to execution. The placement of opening parentheses is determined implicitly, by the positions of instructions that make use of nested code blocks. The placement of closing parentheses is indicated explicitly, as part of the linear representation.

In the [Plush](https://push-language.hampshire.edu/t/plush-genomes/279) representation that is used in [Clojush](https://github.com/lspector/Clojush) and [PyshGP](https://github.com/erp12/pyshgp), markers are attached to instructions to indicate how many closing parentheses should be inserted after that instruction is translated.

Here, we instead use the "Plushy" representation, in which we allow `close` instructions to be included in the linear sequences of instructions. These are converted into closing parentheses during translation to Push programs.
