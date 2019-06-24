```
McPhee-Gilbert-iMac:propel mcphee$ lein run :error-function "(partial propel.simple-expression-grammar/regression-error-function target-function-hard)" :step-limit 1000 :parent-selection :lexicase
Starting GP with args: {:instructions [exec_dup g/S->Num g/S->x g/S->Plus g/S->Minus g/S->Times g/S->Divide g/Num->0 g/Num->1], :error-function #object[clojure.core$partial$fn__4759 0x3576ddc2 clojure.core$partial$fn__4759@3576ddc2], :max-generations 500, :population-size 200, :max-initial-plushy-size 50, :step-limit 1000, :parent-selection :lexicase, :tournament-size 5}
-------------------------------------------------------
               Report for Generation 0
-------------------------------------------------------
Best plushy: (g/S->Times exec_dup g/S->x g/S->x g/Num->1 g/S->Times exec_dup exec_dup g/S->Plus g/S->Plus exec_dup g/Num->1 g/Num->0 g/S->Divide g/Num->0 g/S->Minus g/S->Num g/S->Plus g/S->Minus exec_dup)
Best program: (g/S->Times exec_dup (g/S->x g/S->x g/Num->1 g/S->Times exec_dup (exec_dup (g/S->Plus g/S->Plus exec_dup (g/Num->1 g/Num->0 g/S->Divide g/Num->0 g/S->Minus g/S->Num g/S->Plus g/S->Minus exec_dup ())))))
Best total error: 4145
Best errors: (713 598 493 398 313 238 173 118 73 38 13 2 7 2 13 38 73 118 173 238 313)
Best behaviors: (200 162 128 98 72 50 32 18 8 2 0 2 8 18 32 50 72 98 128 162 200)

-------------------------------------------------------
               Report for Generation 1
-------------------------------------------------------
Best plushy: (g/S->x g/Num->1 g/S->Divide g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->Minus g/S->Minus g/Num->0 g/S->Minus exec_dup g/Num->1 g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/Num->1 g/S->x g/S->Plus g/S->Num exec_dup g/S->Num g/S->x g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup g/S->Minus exec_dup g/S->Num g/S->Divide g/S->Num g/S->Num g/S->x g/S->Num g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->x g/Num->1 g/S->Divide g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->Minus g/S->Minus g/Num->0 g/S->Minus exec_dup (g/Num->1 g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/Num->1 g/S->x g/S->Plus g/S->Num exec_dup (g/S->Num g/S->x g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup (g/S->Minus exec_dup (g/S->Num g/S->Divide g/S->Num g/S->Num g/S->x g/S->Num g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1))))))
Best total error: 2723
Best errors: (513 436 365 300 241 188 141 100 65 36 13 4 15 20 19 12 1 20 45 76 113)
Best behaviors: (400 324 256 196 144 100 64 36 16 4 0 4 16 36 64 100 144 196 256 324 400)

-------------------------------------------------------
               Report for Generation 2
-------------------------------------------------------
Best plushy: (g/S->Num g/S->x g/Num->1 g/S->Divide g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->Minus g/S->Minus g/Num->0 g/S->Minus exec_dup g/Num->1 g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/Num->1 g/S->x g/S->Plus g/S->Num exec_dup g/S->Num g/S->x g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup g/S->Minus exec_dup g/S->Num g/S->Divide g/S->Num g/S->Num g/S->x g/S->Num g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->x g/Num->1 g/S->Divide g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->Minus g/S->Minus g/Num->0 g/S->Minus exec_dup (g/Num->1 g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/Num->1 g/S->x g/S->Plus g/S->Num exec_dup (g/S->Num g/S->x g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup (g/S->Minus exec_dup (g/S->Num g/S->Divide g/S->Num g/S->Num g/S->x g/S->Num g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1))))))
Best total error: 2723
Best errors: (513 436 365 300 241 188 141 100 65 36 13 4 15 20 19 12 1 20 45 76 113)
Best behaviors: (400 324 256 196 144 100 64 36 16 4 0 4 16 36 64 100 144 196 256 324 400)

-------------------------------------------------------
               Report for Generation 3
-------------------------------------------------------
Best plushy: (g/S->x g/Num->1 g/S->Divide g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->Minus g/S->Minus g/Num->0 g/S->Minus exec_dup g/Num->1 g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/S->Divide g/Num->1 g/S->x g/S->Plus g/S->Num exec_dup g/S->Num g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup g/S->Minus exec_dup g/S->Num g/S->Divide g/S->Num g/S->x g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->x g/Num->1 g/S->Divide g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->Minus g/S->Minus g/Num->0 g/S->Minus exec_dup (g/Num->1 g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/S->Divide g/Num->1 g/S->x g/S->Plus g/S->Num exec_dup (g/S->Num g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup (g/S->Minus exec_dup (g/S->Num g/S->Divide g/S->Num g/S->x g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1))))))
Best total error: 2723
Best errors: (513 436 365 300 241 188 141 100 65 36 13 4 15 20 19 12 1 20 45 76 113)
Best behaviors: (400 324 256 196 144 100 64 36 16 4 0 4 16 36 64 100 144 196 256 324 400)

-------------------------------------------------------
               Report for Generation 4
-------------------------------------------------------
Best plushy: (g/S->Num g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->Minus g/S->Minus g/S->Minus exec_dup g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/Num->1 g/S->Plus g/S->Num exec_dup g/S->Num g/S->x g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup g/S->Minus exec_dup g/S->Num g/S->Divide g/S->Num g/S->Num g/S->x g/S->Num g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->Minus g/S->Minus g/S->Minus exec_dup (g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/Num->1 g/S->Plus g/S->Num exec_dup (g/S->Num g/S->x g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup (g/S->Minus exec_dup (g/S->Num g/S->Divide g/S->Num g/S->Num g/S->x g/S->Num g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1))))))
Best total error: 2723
Best errors: (513 436 365 300 241 188 141 100 65 36 13 4 15 20 19 12 1 20 45 76 113)
Best behaviors: (400 324 256 196 144 100 64 36 16 4 0 4 16 36 64 100 144 196 256 324 400)

-------------------------------------------------------
               Report for Generation 5
-------------------------------------------------------
Best plushy: (g/S->Num g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->Minus g/S->Minus exec_dup g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/Num->1 g/S->Plus g/S->Num exec_dup g/S->Num g/S->x g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup g/S->Minus exec_dup g/S->Num g/S->Divide g/S->Num g/S->x g/S->Num g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->Minus g/S->Minus exec_dup (g/S->Plus g/S->Divide g/S->Divide g/S->Minus g/S->Divide g/Num->0 g/Num->1 g/S->Plus g/S->Num exec_dup (g/S->Num g/S->x g/S->Times g/S->Plus g/Num->0 g/Num->0 exec_dup (g/S->Minus exec_dup (g/S->Num g/S->Divide g/S->Num g/S->x g/S->Num g/S->Num g/S->x g/S->Plus g/S->Times g/Num->1))))))
Best total error: 2723
Best errors: (513 436 365 300 241 188 141 100 65 36 13 4 15 20 19 12 1 20 45 76 113)
Best behaviors: (400 324 256 196 144 100 64 36 16 4 0 4 16 36 64 100 144 196 256 324 400)

-------------------------------------------------------
               Report for Generation 6
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 7
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 8
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 9
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Minus g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Minus g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 10
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Minus g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->Minus g/S->Plus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Minus g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Times g/Num->0 g/S->Divide g/S->Minus g/S->Plus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 11
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1))))))
Best total error: 741
Best errors: (141 117 95 75 57 41 27 15 5 3 9 13 15 15 13 9 3 5 15 27 41)
Best behaviors: (1054 877 716 571 442 329 232 151 86 37 4 -13 -14 1 32 79 142 221 316 427 554)

-------------------------------------------------------
               Report for Generation 12
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/Num->1 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/Num->1 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 13
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/Num->0 g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/Num->0 g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 14
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Minus g/S->Plus g/Num->1 g/Num->0 g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Minus g/S->Plus g/Num->1 g/Num->0 g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 15
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/Num->0 g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/Num->1 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/Num->0 g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/S->Divide g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1))))))
Best total error: 693
Best errors: (129 106 85 66 49 34 21 10 1 6 11 14 15 14 11 6 1 10 21 34 49)
Best behaviors: (1042 866 706 562 434 322 226 146 82 34 2 -14 -14 2 34 82 146 226 322 434 562)

-------------------------------------------------------
               Report for Generation 16
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Times exec_dup g/Num->0 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->0 g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Times exec_dup (g/Num->0 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->0 g/Num->1 g/S->Times g/S->Times g/Num->1))))))
Best total error: 665
Best errors: (71 54 39 26 15 6 1 6 9 10 9 6 1 6 15 26 39 54 71 90 111)
Best behaviors: (984 814 660 522 400 294 204 130 72 30 4 -6 0 22 60 114 184 270 372 490 624)

-------------------------------------------------------
               Report for Generation 17
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->Divide g/S->Num g/Num->1 g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1 g/Num->1)
Best program: (g/S->Plus g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->Divide g/S->Num g/Num->1 g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1 g/Num->1))))))
Best total error: 273
Best errors: (3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23)
Best behaviors: (910 756 616 490 378 280 196 126 70 28 0 -14 -14 0 28 70 126 196 280 378 490)

-------------------------------------------------------
               Report for Generation 18
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Num g/Num->1 g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1 g/Num->1)
Best program: (g/S->Plus g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Num g/Num->1 g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1 g/Num->1))))))
Best total error: 273
Best errors: (3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23)
Best behaviors: (910 756 616 490 378 280 196 126 70 28 0 -14 -14 0 28 70 126 196 280 378 490)

-------------------------------------------------------
               Report for Generation 19
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Divide exec_dup g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Num g/Num->1 g/S->Num g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1 g/Num->1)
Best program: (g/S->Plus g/S->Minus g/S->Divide exec_dup (g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->Times g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Num g/Num->1 g/S->Num g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1 g/Num->1))))))
Best total error: 273
Best errors: (3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23)
Best behaviors: (910 756 616 490 378 280 196 126 70 28 0 -14 -14 0 28 70 126 196 280 378 490)

-------------------------------------------------------
               Report for Generation 20
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/Num->1 g/S->Divide g/S->Divide exec_dup g/Num->0 g/Num->1 g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num exec_dup g/Num->0 g/Num->0 g/S->Num g/Num->0 g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/Num->1 g/S->Divide g/S->Divide exec_dup (g/Num->0 g/Num->1 g/Num->0 g/S->Divide g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num exec_dup (g/Num->0 g/Num->0 g/S->Num g/Num->0 g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 680
Best errors: (48 33 20 9 0 7 12 15 16 15 6 7 0 9 20 33 48 65 84 105 128)
Best behaviors: (961 793 641 505 385 281 193 121 65 25 7 -7 1 25 65 121 193 281 385 505 641)

-------------------------------------------------------
               Report for Generation 21
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Minus g/Num->1 exec_dup g/Num->0 g/S->Plus g/S->Num g/Num->0 g/S->Times g/Num->0 g/S->Divide g/S->Times g/S->x g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Minus g/S->Minus g/Num->1 exec_dup (g/Num->0 g/S->Plus g/S->Num g/Num->0 g/S->Times g/Num->0 g/S->Divide g/S->Times g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Times g/S->Times g/Num->1))))))
Best total error: 270
Best errors: (10 8 6 4 2 0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 3 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 22
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Minus exec_dup g/Num->0 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Times g/S->Num g/S->x g/S->Minus g/S->Divide exec_dup g/S->Times g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Minus g/S->Minus exec_dup (g/Num->0 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Times g/S->Num g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Times g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Times g/S->Times g/Num->1))))))
Best total error: 266
Best errors: (10 8 6 4 2 0 2 4 6 8 6 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 7 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 23
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Minus exec_dup g/Num->0 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Times g/S->Num g/S->x g/S->Minus g/S->Divide exec_dup g/S->Times g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Minus g/S->Minus exec_dup (g/Num->0 g/S->Plus g/S->Num g/S->Times g/Num->0 g/S->Divide g/S->Times g/S->Num g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Times g/S->Divide g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Times g/S->Times g/Num->1))))))
Best total error: 266
Best errors: (10 8 6 4 2 0 2 4 6 8 6 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 7 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 24
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide exec_dup g/Num->0 g/S->Plus g/Num->1 g/S->Times g/S->Divide g/S->Num g/Num->0 g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide exec_dup (g/Num->0 g/S->Plus g/Num->1 g/S->Times g/S->Divide g/S->Num g/Num->0 g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1))))))
Best total error: 265
Best errors: (10 8 6 4 2 0 2 4 6 8 5 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 25
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide exec_dup g/Num->0 g/S->Plus g/Num->1 g/S->Times g/S->Divide g/S->Num g/Num->0 g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide exec_dup (g/Num->0 g/S->Plus g/Num->1 g/S->Times g/S->Divide g/S->Num g/Num->0 g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1))))))
Best total error: 265
Best errors: (10 8 6 4 2 0 2 4 6 8 5 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 26
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/Num->0 g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/Num->0 g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)))))
Best total error: 265
Best errors: (10 8 6 4 2 0 2 4 6 8 5 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 27
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide exec_dup g/S->Plus g/S->Times g/S->Divide g/S->Num g/Num->0 g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide exec_dup (g/S->Plus g/S->Times g/S->Divide g/S->Num g/Num->0 g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1))))))
Best total error: 265
Best errors: (10 8 6 4 2 0 2 4 6 8 5 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 28
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 29
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 30
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/Num->1)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 31
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Plus exec_dup g/Num->1 g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Divide g/S->Minus g/S->Divide exec_dup g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num g/S->x exec_dup g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->Minus g/S->Plus g/S->Plus exec_dup g/S->Times g/S->Times g/Num->1)
Best program: (g/S->Minus exec_dup (g/S->Plus exec_dup (g/Num->1 g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Divide g/S->Minus g/S->Divide exec_dup (g/S->Divide g/S->Num g/Num->1 g/S->Divide g/S->Num g/S->Num g/S->Num g/S->x exec_dup (g/S->Times g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->Minus g/S->Plus g/S->Plus exec_dup (g/S->Times g/S->Times g/Num->1))))))))
Best total error: 168
Best errors: (8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8)
Best behaviors: (905 752 613 488 377 280 197 128 73 32 5 -8 -7 8 37 80 137 208 293 392 505)

-------------------------------------------------------
               Report for Generation 32
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup g/Num->0 exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (g/Num->0 exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/Num->1)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 33
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup g/Num->0 exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/Num->1)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (g/Num->0 exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/Num->1)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 34
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 35
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 36
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Plus g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Num g/Num->1 exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Plus g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Num g/Num->1 exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 37
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 38
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times)
Best program: (g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->0 g/S->x exec_dup (exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 39
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/S->x g/Num->0 g/S->Times g/S->x exec_dup exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times)
Best program: (g/S->Divide g/S->Plus g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/S->x g/Num->0 g/S->Times g/S->x exec_dup (exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/Num->1 g/S->Times)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 40
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/S->x g/Num->0 g/S->Times g/S->x exec_dup exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times)
Best program: (g/S->Divide g/S->Divide g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/Num->1 g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num g/S->Times g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/S->x g/Num->0 g/S->Times g/S->x exec_dup (exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/Num->1 g/S->Times)))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 41
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/S->Plus g/Num->1 g/S->Plus g/S->Minus g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times)
Best program: (g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/S->Plus g/Num->1 g/S->Plus g/S->Minus g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 42
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/S->Plus g/Num->1 g/S->Plus g/S->Minus g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/S->Plus g/Num->1 g/S->Plus g/S->Minus g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 43
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/S->Plus g/Num->1 g/S->Plus g/S->Minus g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/S->Plus g/Num->1 g/S->Plus g/S->Minus g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Divide g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 44
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 45
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 46
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/Num->0 g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/Num->1 g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/Num->0 g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/Num->1 g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 47
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/Num->0 g/S->Times g/S->Minus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/Num->1 g/Num->0 g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/Num->1 g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/Num->0 g/S->Times g/S->Minus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/Num->1 g/Num->0 g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/Num->1 g/S->Plus g/Num->1 g/S->Times g/S->Times g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 48
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 49
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 50
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 51
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 52
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 53
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 54
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->Plus g/S->x g/Num->0 exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Minus g/Num->1 g/S->Times g/S->Minus g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->Plus g/S->x g/Num->0 exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 55
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Minus g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/S->x g/S->Divide g/S->Plus g/S->x g/Num->0 exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Plus g/S->Minus g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/S->x g/S->Divide g/S->Plus g/S->x g/Num->0 exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 56
-------------------------------------------------------
Best plushy: (g/Num->1 g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/Num->0 g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 g/Num->1 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/S->Times)
Best program: (g/Num->1 g/S->Plus g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/Num->0 g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 g/Num->1 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 57
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Minus g/S->Minus g/S->Divide g/Num->1 g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/Num->0 g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup exec_dup g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Minus g/S->Minus g/S->Divide g/Num->1 g/S->Plus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/Num->0 g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (exec_dup (g/S->Plus g/S->Plus g/S->Times)))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 58
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Num g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Minus g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/S->x g/S->Divide g/S->Plus g/S->x g/Num->0 exec_dup g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/Num->1 g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/Num->1 g/S->Num g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Minus g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/S->x g/S->Divide g/S->Plus g/S->x g/Num->0 exec_dup (g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/Num->1 g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 59
-------------------------------------------------------
Best plushy: (g/Num->1 g/S->Plus g/Num->1 g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/S->Times)
Best program: (g/Num->1 g/S->Plus g/Num->1 g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 60
-------------------------------------------------------
Best plushy: (g/Num->1 g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/Num->0 g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/S->Times)
Best program: (g/Num->1 g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->x g/Num->0 g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/S->Times))))))
Best total error: 255
Best errors: (10 8 6 4 2 0 2 4 6 2 1 12 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 38 14 -12 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 61
-------------------------------------------------------
Best plushy: (g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->Minus g/S->Times g/S->Num g/Num->1 g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Num g/S->Minus g/S->Times g/S->Num g/S->Divide g/S->Times g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x exec_dup g/S->Minus exec_dup exec_dup g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->Minus g/S->Times g/S->Num g/Num->1 g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Num g/S->Minus g/S->Times g/S->Num g/S->Divide g/S->Times g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x exec_dup (g/S->Minus exec_dup (exec_dup (g/S->Plus g/S->Plus g/S->Times))))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 62
-------------------------------------------------------
Best plushy: (g/S->Plus g/Num->1 g/Num->1 g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/S->Plus g/Num->1 g/S->x g/S->Divide g/S->x exec_dup g/S->Divide g/S->Divide g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Plus g/Num->1 g/Num->1 g/S->Minus g/S->Minus g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Num g/S->Divide g/S->Times g/S->Plus g/Num->1 g/S->x g/S->Divide g/S->x exec_dup (g/S->Divide g/S->Divide g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Plus g/S->Times))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 63
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 263
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 15 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 1 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 64
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 263
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 15 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 1 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 65
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 263
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 15 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 1 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 66
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->1 g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 g/Num->0 exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/Num->1 g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 g/Num->0 exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 263
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 15 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 1 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 67
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->Num g/S->Divide g/Num->1 g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 263
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 15 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 1 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 68
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Num g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Num g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 263
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 15 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 1 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 69
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Num g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Num g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 263
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 15 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 1 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 70
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 71
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 239
Best errors: (10 8 6 4 2 0 2 4 6 19 5 15 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 21 8 -15 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 72
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 237
Best errors: (10 8 6 4 2 0 2 4 6 19 5 13 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 21 8 -13 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 73
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 237
Best errors: (10 8 6 4 2 0 2 4 6 19 5 13 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 21 8 -13 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 74
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 237
Best errors: (10 8 6 4 2 0 2 4 6 19 5 13 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 21 8 -13 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 75
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/S->Times g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/S->Times g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 237
Best errors: (10 8 6 4 2 0 2 4 6 19 5 13 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 21 8 -13 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 76
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 237
Best errors: (10 8 6 4 2 0 2 4 6 19 5 13 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 21 8 -13 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 77
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 237
Best errors: (10 8 6 4 2 0 2 4 6 19 5 13 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 21 8 -13 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 78
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 237
Best errors: (10 8 6 4 2 0 2 4 6 19 5 13 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 21 8 -13 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 79
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 80
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 81
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/Num->1 g/S->Times g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 82
-------------------------------------------------------
Best plushy: (g/S->Divide g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Plus g/S->Num exec_dup g/S->Plus g/Num->0 g/Num->1 g/S->Num g/Num->0 exec_dup g/Num->0 exec_dup g/S->Num g/S->x exec_dup g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Times g/Num->1 g/Num->0)
Best program: (g/S->Divide g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Plus g/S->Num exec_dup (g/S->Plus g/Num->0 g/Num->1 g/S->Num g/Num->0 exec_dup (g/Num->0 exec_dup (g/S->Num g/S->x exec_dup (g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Times g/Num->1 g/Num->0)))))
Best total error: 674
Best errors: (48 33 20 9 0 7 12 15 16 15 0 7 0 9 20 33 48 65 84 105 128)
Best behaviors: (961 793 641 505 385 281 193 121 65 25 13 -7 1 25 65 121 193 281 385 505 641)

-------------------------------------------------------
               Report for Generation 83
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/S->Divide g/S->Minus g/S->Num g/S->Divide g/S->Divide g/S->Times g/S->Divide g/S->Times exec_dup g/S->Divide g/S->Minus g/S->Num g/S->x g/S->Plus g/S->Num g/S->Num g/Num->1 exec_dup g/S->Minus g/S->Plus g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->Times g/S->Num g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Times g/Num->1 g/S->Minus g/S->Times)
Best program: (g/S->Minus g/S->Plus g/S->Divide g/Num->1 g/S->Divide g/S->Minus g/S->Num g/S->Divide g/S->Divide g/S->Times g/S->Divide g/S->Times exec_dup (g/S->Divide g/S->Minus g/S->Num g/S->x g/S->Plus g/S->Num g/S->Num g/Num->1 exec_dup (g/S->Minus g/S->Plus g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->Times g/S->Num g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Times g/Num->1 g/S->Minus g/S->Times)))))
Best total error: 671
Best errors: (43 28 15 4 5 12 17 20 21 20 17 12 5 4 15 28 43 60 79 100 123)
Best behaviors: (956 788 636 500 380 276 188 116 60 20 -4 -12 -4 20 60 116 188 276 380 500 636)

-------------------------------------------------------
               Report for Generation 84
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 85
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 86
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Times g/S->Minus g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 87
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 88
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 89
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 90
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 91
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 92
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 93
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 94
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 95
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 96
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 97
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Divide g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Divide g/S->Minus g/S->Times g/S->Plus g/S->Divide g/S->Times g/Num->0 g/S->x g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 98
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup)
Best program: (g/S->Times g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times exec_dup ())))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 99
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Minus g/S->Divide g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Minus g/S->Divide g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 100
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 101
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 102
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 103
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 104
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 105
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Times g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Times g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/S->Times g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 106
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 107
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 108
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 109
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 110
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 111
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 112
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 113
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 114
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 115
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 116
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 117
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Plus g/S->Divide g/S->Times g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Plus g/S->Divide g/S->Times g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 118
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Plus g/S->Divide g/S->Times g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)
Best program: (g/S->Num g/S->Minus g/S->Times g/S->Times g/S->Plus g/S->Plus g/S->Divide g/S->Times g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 119
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/Num->0 g/S->Num g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/Num->0 g/S->Num g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 120
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/Num->0 g/S->Num g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/Num->0 g/S->Num g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 224
Best errors: (10 8 6 4 2 0 2 4 6 8 5 11 14 13 14 17 18 19 20 21 22)
Best behaviors: (923 768 627 500 387 288 203 132 75 32 8 -11 -13 3 31 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 121
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/S->Divide g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 243
Best errors: (2 3 4 5 6 7 8 9 10 11 5 11 14 15 16 17 18 19 20 21 22)
Best behaviors: (911 757 617 491 379 281 197 127 71 29 8 -11 -13 1 29 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 122
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 243
Best errors: (2 3 4 5 6 7 8 9 10 11 5 11 14 15 16 17 18 19 20 21 22)
Best behaviors: (911 757 617 491 379 281 197 127 71 29 8 -11 -13 1 29 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 123
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 243
Best errors: (2 3 4 5 6 7 8 9 10 11 5 11 14 15 16 17 18 19 20 21 22)
Best behaviors: (911 757 617 491 379 281 197 127 71 29 8 -11 -13 1 29 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 124
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 243
Best errors: (2 3 4 5 6 7 8 9 10 11 5 11 14 15 16 17 18 19 20 21 22)
Best behaviors: (911 757 617 491 379 281 197 127 71 29 8 -11 -13 1 29 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 125
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 243
Best errors: (2 3 4 5 6 7 8 9 10 11 5 11 14 15 16 17 18 19 20 21 22)
Best behaviors: (911 757 617 491 379 281 197 127 71 29 8 -11 -13 1 29 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 126
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 243
Best errors: (2 3 4 5 6 7 8 9 10 11 5 11 14 15 16 17 18 19 20 21 22)
Best behaviors: (911 757 617 491 379 281 197 127 71 29 8 -11 -13 1 29 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 127
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 243
Best errors: (2 3 4 5 6 7 8 9 10 11 5 11 14 15 16 17 18 19 20 21 22)
Best behaviors: (911 757 617 491 379 281 197 127 71 29 8 -11 -13 1 29 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 128
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup exec_dup g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)
Best program: (g/S->Num g/S->Minus g/S->Divide g/S->Times g/S->Plus g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Divide g/Num->1 g/S->Times g/S->Num g/S->Minus g/S->x g/S->x exec_dup (g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x exec_dup (exec_dup (g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/Num->1)))))
Best total error: 243
Best errors: (2 3 4 5 6 7 8 9 10 11 5 11 14 15 16 17 18 19 20 21 22)
Best behaviors: (911 757 617 491 379 281 197 127 71 29 8 -11 -13 1 29 71 127 197 281 379 491)

-------------------------------------------------------
               Report for Generation 129
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Num g/S->Num g/Num->1 exec_dup g/S->Minus g/S->Divide g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Minus g/S->x g/S->Divide g/Num->1 g/Num->0 g/S->Num g/S->Divide g/S->Divide g/S->Minus g/S->Minus g/S->x g/S->x g/Num->1 exec_dup g/S->Times g/S->Divide g/S->Num exec_dup g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup exec_dup g/Num->0 g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/S->Minus g/Num->1)
Best program: (g/S->Divide g/S->Num g/S->Num g/Num->1 exec_dup (g/S->Minus g/S->Divide g/S->Times g/S->Times g/S->Plus g/S->Divide g/Num->0 g/Num->0 g/S->x g/S->Divide g/Num->1 g/S->Minus g/S->x g/S->Divide g/Num->1 g/Num->0 g/S->Num g/S->Divide g/S->Divide g/S->Minus g/S->Minus g/S->x g/S->x g/Num->1 exec_dup (g/S->Times g/S->Divide g/S->Num exec_dup (g/S->Num g/Num->0 g/S->Num g/Num->1 g/S->x g/Num->0 exec_dup (exec_dup (g/Num->0 g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Plus g/S->Plus g/S->Times g/S->Minus g/Num->1))))))
Best total error: 256
Best errors: (10 8 6 4 2 0 2 4 6 1 4 11 14 16 18 20 22 24 26 28 30)
Best behaviors: (923 768 627 500 387 288 203 132 75 41 17 -11 -13 0 27 68 123 192 275 372 483)

-------------------------------------------------------
               Report for Generation 130
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/Num->0 g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->Minus g/S->Minus g/S->x g/S->Minus g/Num->1 g/S->x g/Num->1 g/Num->0 g/S->Times g/S->Times exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/Num->0 g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->Minus g/S->Minus g/S->x g/S->Minus g/Num->1 g/S->x g/Num->1 g/Num->0 g/S->Times g/S->Times exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 273
Best errors: (23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3)
Best behaviors: (890 738 600 476 366 270 188 120 66 26 0 -12 -10 6 36 80 138 210 296 396 510)

-------------------------------------------------------
               Report for Generation 131
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Minus g/Num->0 exec_dup g/Num->0 g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->Minus g/S->Minus g/S->x g/S->Minus g/Num->1 g/S->x g/Num->1 g/Num->0 g/S->Times g/S->Times exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/S->Minus g/Num->0 exec_dup (g/Num->0 g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->Minus g/S->Minus g/S->x g/S->Minus g/Num->1 g/S->x g/Num->1 g/Num->0 g/S->Times g/S->Times exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 273
Best errors: (23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3)
Best behaviors: (890 738 600 476 366 270 188 120 66 26 0 -12 -10 6 36 80 138 210 296 396 510)

-------------------------------------------------------
               Report for Generation 132
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/Num->0 g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->Minus g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/Num->0 g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->Minus g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 272
Best errors: (23 22 21 20 19 18 17 16 15 14 12 12 11 10 9 8 7 6 5 4 3)
Best behaviors: (890 738 600 476 366 270 188 120 66 26 1 -12 -10 6 36 80 138 210 296 396 510)

-------------------------------------------------------
               Report for Generation 133
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/Num->0 g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->Minus g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/S->Plus g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->1 g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/Num->0 g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->Minus g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/S->Plus g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->1 g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 272
Best errors: (23 22 21 20 19 18 17 16 15 14 12 12 11 10 9 8 7 6 5 4 3)
Best behaviors: (890 738 600 476 366 270 188 120 66 26 1 -12 -10 6 36 80 138 210 296 396 510)

-------------------------------------------------------
               Report for Generation 134
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 135
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 136
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 137
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 138
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->Num g/S->x g/Num->1 g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/Num->0 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/Num->0 g/S->Times exec_dup g/S->x g/S->x exec_dup g/Num->1 g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->Num g/S->x g/Num->1 g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/Num->0 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/Num->0 g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/Num->1 g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 139
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 140
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->x g/Num->0 g/Num->1 g/S->Plus g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Num g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->x g/Num->0 g/Num->1 g/S->Plus g/S->Minus g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (12 12 12 12 12 12 12 12 12 12 13 12 12 12 12 12 12 12 12 12 12)
Best behaviors: (901 748 609 484 373 276 193 124 69 28 0 -12 -11 4 33 76 133 204 289 388 501)

-------------------------------------------------------
               Report for Generation 141
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 142
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->Plus g/S->Times g/S->Divide exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->Plus g/S->Times g/S->Divide exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 252
Best errors: (12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12 12)
Best behaviors: (901 748 609 484 373 276 193 124 69 28 1 -12 -11 4 33 76 133 204 289 388 501)

-------------------------------------------------------
               Report for Generation 143
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 144
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/Num->1 g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times g/S->Times g/Num->1 g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 145
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->1 exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->1 exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 146
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->1 exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->1 exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->1 g/S->Minus g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 147
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->x g/S->Times g/S->Divide g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/Num->0 g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->x g/S->Times g/S->Divide g/Num->0 g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/Num->0 g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 148
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->x g/S->Times g/S->Divide g/Num->0 g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Num g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/Num->0 g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->x g/S->Times g/S->Divide g/Num->0 g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Num g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/Num->0 g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 149
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->x g/S->Times g/S->Divide g/Num->0 g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Num g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/Num->0 g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->x g/S->Times g/S->Divide g/Num->0 g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Num g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/Num->0 g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 150
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->x g/S->Times g/S->Divide g/Num->0 g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Num g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/Num->0 g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->x g/S->Times g/S->Divide g/Num->0 g/S->Times g/Num->0 g/S->Num g/S->Divide g/S->Times g/Num->1 g/S->Num g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->x g/S->x g/Num->1 g/S->x g/Num->0 g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/Num->0 g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 151
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/Num->0 g/S->Divide exec_dup g/S->Num g/S->Divide g/S->Times g/S->Minus g/S->Plus g/Num->1 g/S->Minus g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->x g/S->Minus g/S->Divide g/S->Times exec_dup g/S->x g/S->x g/Num->1 exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/Num->0 g/S->Divide exec_dup (g/S->Num g/S->Divide g/S->Times g/S->Minus g/S->Plus g/Num->1 g/S->Minus g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->x g/S->Minus g/S->Divide g/S->Times exec_dup (g/S->x g/S->x g/Num->1 exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)))))))
Best total error: 293
Best errors: (8 6 4 2 0 2 4 6 8 10 13 14 16 18 20 22 24 26 28 30 32)
Best behaviors: (921 766 625 498 385 286 201 130 73 30 0 -14 -15 -2 25 66 121 190 273 370 481)

-------------------------------------------------------
               Report for Generation 152
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->x g/S->Minus)))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 153
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->Divide g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->x g/S->Minus)))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 154
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Divide g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Plus g/S->Times g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times g/S->Divide g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Plus g/S->Times g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Times g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->x g/S->Minus)))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 155
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Divide g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Plus g/S->Times g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus g/S->Times g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times g/S->Divide g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Plus g/S->Times g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus g/S->Times g/Num->1 g/S->Divide g/S->Minus g/Num->1 g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->x g/S->Minus)))))
Best total error: 253
Best errors: (22 21 20 19 18 17 16 15 14 13 13 11 10 9 8 7 6 5 4 3 2)
Best behaviors: (891 739 601 477 367 271 189 121 67 27 0 -11 -9 7 37 81 139 211 297 397 511)

-------------------------------------------------------
               Report for Generation 156
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/S->Times g/S->x g/S->x g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/S->Times g/S->x g/S->x g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)))))
Best total error: 305
Best errors: (33 31 29 27 25 23 21 19 17 15 13 11 9 7 5 3 1 1 3 5 7)
Best behaviors: (880 729 592 469 360 265 184 117 64 25 0 -11 -8 9 40 85 144 217 304 405 520)

-------------------------------------------------------
               Report for Generation 157
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Num g/S->Minus g/S->Times g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/Num->0 g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Num g/S->Minus g/S->Times g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->x g/S->x g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/Num->0 g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)))))
Best total error: 272
Best errors: (3 4 5 6 7 8 9 10 11 12 12 14 15 16 17 18 19 20 21 22 23)
Best behaviors: (910 756 616 490 378 280 196 126 70 28 1 -14 -14 0 28 70 126 196 280 378 490)

-------------------------------------------------------
               Report for Generation 158
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->Num g/S->Minus g/S->Times g/S->x g/S->x g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->Num g/S->Minus g/S->Times g/S->x g/S->x g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)))))
Best total error: 318
Best errors: (34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6)
Best behaviors: (879 728 591 468 359 264 183 116 63 24 -1 -12 -9 8 39 84 143 216 303 404 519)

-------------------------------------------------------
               Report for Generation 159
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->Num g/S->Minus g/S->Times g/S->x g/S->x g/S->x exec_dup g/Num->1 g/S->Divide exec_dup g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->Num g/S->Minus g/S->Times g/S->x g/S->x g/S->x exec_dup (g/Num->1 g/S->Divide exec_dup (g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)))))
Best total error: 318
Best errors: (34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6)
Best behaviors: (879 728 591 468 359 264 183 116 63 24 -1 -12 -9 8 39 84 143 216 303 404 519)

-------------------------------------------------------
               Report for Generation 160
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Minus g/S->Num g/S->Plus g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->x exec_dup g/Num->1 g/S->Divide g/Num->0 exec_dup g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Minus g/S->Num g/S->Plus g/S->Minus g/S->Times g/S->x g/S->x g/S->x g/S->x exec_dup (g/Num->1 g/S->Divide g/Num->0 exec_dup (g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)))))
Best total error: 292
Best errors: (32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8)
Best behaviors: (881 730 593 470 361 266 185 118 65 26 1 -10 -7 10 41 86 145 218 305 406 521)

-------------------------------------------------------
               Report for Generation 161
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/S->Num g/S->Plus g/S->Times g/S->x g/S->x g/S->x g/S->x exec_dup g/Num->1 g/S->Divide g/Num->0 exec_dup g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/S->Num g/S->Plus g/S->Times g/S->x g/S->x g/S->x g/S->x exec_dup (g/Num->1 g/S->Divide g/Num->0 exec_dup (g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)))))
Best total error: 292
Best errors: (32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8)
Best behaviors: (881 730 593 470 361 266 185 118 65 26 1 -10 -7 10 41 86 145 218 305 406 521)

-------------------------------------------------------
               Report for Generation 162
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->Num g/S->Plus g/S->Times g/S->x g/S->x g/S->x g/S->x exec_dup g/Num->1 g/S->Divide g/Num->0 exec_dup g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/Num->1 g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times g/Num->0 g/Num->1 g/S->Divide g/S->Num g/S->Divide g/S->Times g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->Num g/S->Plus g/S->Times g/S->x g/S->x g/S->x g/S->x exec_dup (g/Num->1 g/S->Divide g/Num->0 exec_dup (g/Num->0 g/S->x g/S->Num g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/Num->1 g/S->Minus g/S->Num g/S->Divide g/S->Times exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/Num->0 g/S->Plus g/S->x g/S->Minus)))))
Best total error: 273
Best errors: (23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3)
Best behaviors: (890 738 600 476 366 270 188 120 66 26 0 -12 -10 6 36 80 138 210 296 396 510)

-------------------------------------------------------
               Report for Generation 163
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Divide exec_dup g/S->Times g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Divide)
Best program: (g/S->Minus g/S->Divide exec_dup (g/S->Times g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Divide))))))
Best total error: 334
Best errors: (35 33 31 29 27 25 23 21 19 17 16 13 11 9 7 5 3 1 1 3 5)
Best behaviors: (878 727 590 467 358 263 182 115 62 23 -3 -13 -10 7 38 83 142 215 302 403 518)

-------------------------------------------------------
               Report for Generation 164
-------------------------------------------------------
Best plushy: (g/S->Minus g/S->Divide exec_dup g/S->Times g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Divide)
Best program: (g/S->Minus g/S->Divide exec_dup (g/S->Times g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Minus g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus g/S->Divide))))))
Best total error: 306
Best errors: (33 31 29 27 25 23 21 19 17 15 14 11 9 7 5 3 1 1 3 5 7)
Best behaviors: (880 729 592 469 360 265 184 117 64 25 -1 -11 -8 9 40 85 144 217 304 405 520)

-------------------------------------------------------
               Report for Generation 165
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Minus g/S->Times g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/S->Minus g/S->Minus g/Num->1 g/S->Minus g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/S->Divide g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Minus g/S->Times g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/S->Minus g/S->Minus g/Num->1 g/S->Minus g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Minus g/S->Divide g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 306
Best errors: (33 31 29 27 25 23 21 19 17 15 14 11 9 7 5 3 1 1 3 5 7)
Best behaviors: (880 729 592 469 360 265 184 117 64 25 -1 -11 -8 9 40 85 144 217 304 405 520)

-------------------------------------------------------
               Report for Generation 166
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/S->Minus g/S->Minus g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Num g/S->Times g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/S->Minus g/S->Minus g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->Minus g/S->Minus g/S->Num g/S->Times g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 306
Best errors: (33 31 29 27 25 23 21 19 17 15 14 11 9 7 5 3 1 1 3 5 7)
Best behaviors: (880 729 592 469 360 265 184 117 64 25 -1 -11 -8 9 40 85 144 217 304 405 520)

-------------------------------------------------------
               Report for Generation 167
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/S->Plus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Times g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/Num->1 g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Times g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/Num->1 g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 282
Best errors: (31 29 27 25 23 21 19 17 15 13 12 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 1 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 168
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/S->Plus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/Num->1 g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/Num->1 g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 270
Best errors: (30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8 10)
Best behaviors: (883 732 595 472 363 268 187 120 67 28 3 -8 -5 12 43 88 147 220 307 408 523)

-------------------------------------------------------
               Report for Generation 169
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/S->Plus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup g/Num->1 exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/Num->1 g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/S->Times g/S->x exec_dup (g/Num->1 exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/Num->1 g/S->Minus g/Num->1 g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 270
Best errors: (30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8 10)
Best behaviors: (883 732 595 472 363 268 187 120 67 28 3 -8 -5 12 43 88 147 220 307 408 523)

-------------------------------------------------------
               Report for Generation 170
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times exec_dup g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup g/S->Plus g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times exec_dup (g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup (g/S->Plus g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)))))))
Best total error: 270
Best errors: (30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8 10)
Best behaviors: (883 732 595 472 363 268 187 120 67 28 3 -8 -5 12 43 88 147 220 307 408 523)

-------------------------------------------------------
               Report for Generation 171
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times exec_dup g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup g/S->Plus g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->1 g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times exec_dup (g/S->Num g/S->Times g/Num->0 g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup (g/S->Plus g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->1 g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)))))))
Best total error: 270
Best errors: (30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8 10)
Best behaviors: (883 732 595 472 363 268 187 120 67 28 3 -8 -5 12 43 88 147 220 307 408 523)

-------------------------------------------------------
               Report for Generation 172
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Num g/S->Times g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup g/S->Plus g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Num g/S->Times g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup (g/S->Plus g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 270
Best errors: (30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8 10)
Best behaviors: (883 732 595 472 363 268 187 120 67 28 3 -8 -5 12 43 88 147 220 307 408 523)

-------------------------------------------------------
               Report for Generation 173
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Num g/S->Times g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup g/S->Plus g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Num g/S->Times g/S->Times g/Num->1 g/S->Minus g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup (g/S->Plus g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 270
Best errors: (30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8 10)
Best behaviors: (883 732 595 472 363 268 187 120 67 28 3 -8 -5 12 43 88 147 220 307 408 523)

-------------------------------------------------------
               Report for Generation 174
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Num g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup g/S->Plus g/S->Divide g/Num->1 exec_dup g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Num g/S->Times g/Num->1 g/S->Divide g/S->Times g/S->Minus g/S->Plus g/S->x g/S->x g/S->x g/Num->0 g/Num->1 g/S->Times g/S->Times g/S->x g/S->x exec_dup (g/S->Plus g/S->Divide g/Num->1 exec_dup (g/Num->0 g/S->x g/Num->0 g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 270
Best errors: (30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 2 4 6 8 10)
Best behaviors: (883 732 595 472 363 268 187 120 67 28 3 -8 -5 12 43 88 147 220 307 408 523)

-------------------------------------------------------
               Report for Generation 175
-------------------------------------------------------
Best plushy: (g/S->Times exec_dup g/S->Times g/S->Num g/S->Times g/Num->0 g/S->Minus g/Num->1 g/S->Minus g/Num->0 g/S->Num g/S->x g/S->x g/Num->0 g/S->Times exec_dup g/Num->1 exec_dup g/Num->0 g/S->x g/S->Num g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times exec_dup (g/S->Times g/S->Num g/S->Times g/Num->0 g/S->Minus g/Num->1 g/S->Minus g/Num->0 g/S->Num g/S->x g/S->x g/Num->0 g/S->Times exec_dup (g/Num->1 exec_dup (g/Num->0 g/S->x g/S->Num g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 273
Best errors: (13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13)
Best behaviors: (900 747 608 483 372 275 192 123 68 27 0 -13 -12 3 32 75 132 203 288 387 500)

-------------------------------------------------------
               Report for Generation 176
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/Num->1 g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/Num->1 g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 281
Best errors: (31 29 27 25 23 21 19 17 15 13 11 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 2 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 177
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 281
Best errors: (31 29 27 25 23 21 19 17 15 13 11 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 2 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 178
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 281
Best errors: (31 29 27 25 23 21 19 17 15 13 11 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 2 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 179
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 281
Best errors: (31 29 27 25 23 21 19 17 15 13 11 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 2 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 180
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 280
Best errors: (31 29 27 25 23 21 19 17 15 13 10 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 3 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 181
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 280
Best errors: (31 29 27 25 23 21 19 17 15 13 10 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 3 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 182
-------------------------------------------------------
Best plushy: (g/S->Times exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/S->Num g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/S->Num g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 209
Best errors: (10 10 10 10 10 10 10 10 10 10 9 10 10 10 10 10 10 10 10 10 10)
Best behaviors: (903 750 611 486 375 278 195 126 71 30 4 -10 -9 6 35 78 135 206 291 390 503)

-------------------------------------------------------
               Report for Generation 183
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 280
Best errors: (31 29 27 25 23 21 19 17 15 13 10 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 3 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 184
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 280
Best errors: (31 29 27 25 23 21 19 17 15 13 10 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 3 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 185
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 280
Best errors: (31 29 27 25 23 21 19 17 15 13 10 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 3 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 186
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 280
Best errors: (31 29 27 25 23 21 19 17 15 13 10 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 3 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 187
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 280
Best errors: (31 29 27 25 23 21 19 17 15 13 10 9 7 5 3 1 1 3 5 7 9)
Best behaviors: (882 731 594 471 362 267 186 119 66 27 3 -9 -6 11 42 87 146 219 306 407 522)

-------------------------------------------------------
               Report for Generation 188
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 189
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 190
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->1 g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->1 g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 191
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 192
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 193
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/Num->1 g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->0 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 194
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Num g/S->Minus exec_dup g/S->Num g/S->Times g/Num->0 g/S->Minus g/S->x g/S->Num g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Num g/S->Num g/S->Minus exec_dup (g/S->Num g/S->Times g/Num->0 g/S->Minus g/S->x g/S->Num g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 210
Best errors: (10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10)
Best behaviors: (903 750 611 486 375 278 195 126 71 30 3 -10 -9 6 35 78 135 206 291 390 503)

-------------------------------------------------------
               Report for Generation 195
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->Times g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->Times g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 196
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 197
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 189
Best errors: (9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9)
Best behaviors: (904 751 612 487 376 279 196 127 72 31 4 -9 -8 7 36 79 136 207 292 391 504)

-------------------------------------------------------
               Report for Generation 198
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 189
Best errors: (9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9)
Best behaviors: (904 751 612 487 376 279 196 127 72 31 4 -9 -8 7 36 79 136 207 292 391 504)

-------------------------------------------------------
               Report for Generation 199
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 230
Best errors: (21 20 19 18 17 16 15 14 13 12 10 10 9 8 7 6 5 4 3 2 1)
Best behaviors: (892 740 602 478 368 272 190 122 68 28 3 -10 -8 8 38 82 140 212 298 398 512)

-------------------------------------------------------
               Report for Generation 200
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 190
Best errors: (1 0 1 2 3 4 5 6 7 8 8 10 11 12 13 14 15 16 17 18 19)
Best behaviors: (914 760 620 494 382 284 200 130 74 32 5 -10 -10 4 32 74 130 200 284 382 494)

-------------------------------------------------------
               Report for Generation 201
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)))))
Best total error: 189
Best errors: (9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9)
Best behaviors: (904 751 612 487 376 279 196 127 72 31 4 -9 -8 7 36 79 136 207 292 391 504)

-------------------------------------------------------
               Report for Generation 202
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 188
Best errors: (9 9 9 9 9 9 9 9 9 9 8 9 9 9 9 9 9 9 9 9 9)
Best behaviors: (904 751 612 487 376 279 196 127 72 31 5 -9 -8 7 36 79 136 207 292 391 504)

-------------------------------------------------------
               Report for Generation 203
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 190
Best errors: (1 0 1 2 3 4 5 6 7 8 8 10 11 12 13 14 15 16 17 18 19)
Best behaviors: (914 760 620 494 382 284 200 130 74 32 5 -10 -10 4 32 74 130 200 284 382 494)

-------------------------------------------------------
               Report for Generation 204
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 190
Best errors: (1 0 1 2 3 4 5 6 7 8 8 10 11 12 13 14 15 16 17 18 19)
Best behaviors: (914 760 620 494 382 284 200 130 74 32 5 -10 -10 4 32 74 130 200 284 382 494)

-------------------------------------------------------
               Report for Generation 205
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 189
Best errors: (9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9)
Best behaviors: (904 751 612 487 376 279 196 127 72 31 4 -9 -8 7 36 79 136 207 292 391 504)

-------------------------------------------------------
               Report for Generation 206
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 190
Best errors: (1 0 1 2 3 4 5 6 7 8 8 10 11 12 13 14 15 16 17 18 19)
Best behaviors: (914 760 620 494 382 284 200 130 74 32 5 -10 -10 4 32 74 130 200 284 382 494)

-------------------------------------------------------
               Report for Generation 207
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus))))))
Best total error: 190
Best errors: (1 0 1 2 3 4 5 6 7 8 8 10 11 12 13 14 15 16 17 18 19)
Best behaviors: (914 760 620 494 382 284 200 130 74 32 5 -10 -10 4 32 74 130 200 284 382 494)

-------------------------------------------------------
               Report for Generation 208
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/Num->1 g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/Num->0 g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/Num->1 g/S->Minus g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/Num->0 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 188
Best errors: (9 9 9 9 9 9 9 9 9 9 8 9 9 9 9 9 9 9 9 9 9)
Best behaviors: (904 751 612 487 376 279 196 127 72 31 5 -9 -8 7 36 79 136 207 292 391 504)

-------------------------------------------------------
               Report for Generation 209
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->0 g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->0 g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 174
Best errors: (2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18)
Best behaviors: (915 761 621 495 383 285 201 131 75 33 5 -9 -9 5 33 75 131 201 285 383 495)

-------------------------------------------------------
               Report for Generation 210
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->0 g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->0 g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 174
Best errors: (2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18)
Best behaviors: (915 761 621 495 383 285 201 131 75 33 5 -9 -9 5 33 75 131 201 285 383 495)

-------------------------------------------------------
               Report for Generation 211
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->0 g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->0 g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 174
Best errors: (2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18)
Best behaviors: (915 761 621 495 383 285 201 131 75 33 5 -9 -9 5 33 75 131 201 285 383 495)

-------------------------------------------------------
               Report for Generation 212
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->0 g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->0 g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 174
Best errors: (2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18)
Best behaviors: (915 761 621 495 383 285 201 131 75 33 5 -9 -9 5 33 75 131 201 285 383 495)

-------------------------------------------------------
               Report for Generation 213
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->0 g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->0 g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 174
Best errors: (2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18)
Best behaviors: (915 761 621 495 383 285 201 131 75 33 5 -9 -9 5 33 75 131 201 285 383 495)

-------------------------------------------------------
               Report for Generation 214
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/Num->0 g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 174
Best errors: (2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18)
Best behaviors: (915 761 621 495 383 285 201 131 75 33 5 -9 -9 5 33 75 131 201 285 383 495)

-------------------------------------------------------
               Report for Generation 215
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 216
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 217
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 218
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 219
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 220
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 221
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->1 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->1 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/Num->1 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 105
Best errors: (5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5)
Best behaviors: (908 755 616 491 380 283 200 131 76 35 8 -5 -4 11 40 83 140 211 296 395 508)

-------------------------------------------------------
               Report for Generation 222
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 122
Best errors: (3 3 4 4 5 5 5 6 6 7 9 7 4 5 6 6 7 7 7 8 8)
Best behaviors: (910 757 617 492 380 283 200 130 75 33 4 -7 -3 11 39 82 138 209 294 392 505)

-------------------------------------------------------
               Report for Generation 223
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->x g/S->Times g/S->x g/S->Num g/Num->1 g/S->Times g/S->Divide g/S->x g/Num->0 g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->0 g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->x g/S->Times g/S->x g/S->Num g/Num->1 g/S->Times g/S->Divide g/S->x g/Num->0 g/S->x g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Num g/Num->1 g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->0 g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Minus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 145
Best errors: (15 14 13 12 10 9 8 7 5 5 8 11 8 5 4 2 1 0 1 3 4)
Best behaviors: (898 746 608 484 375 279 197 129 76 35 5 -11 -7 11 41 86 144 216 302 403 517)

-------------------------------------------------------
               Report for Generation 224
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 225
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Plus g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 226
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Plus g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 227
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Plus g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 228
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->Times g/S->Num g/Num->0 g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Plus g/S->Times g/S->Num g/Num->0 g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 229
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->x g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 230
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus exec_dup)
Best program: (exec_dup (g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus exec_dup ()))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 231
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus exec_dup)
Best program: (exec_dup (g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Divide g/S->Minus exec_dup ()))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 232
-------------------------------------------------------
Best plushy: (exec_dup g/Num->0 g/S->Times g/S->Num g/S->x g/S->Num g/S->x g/S->x g/S->Times g/Num->1 g/S->Plus g/Num->0 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/Num->1 g/S->x g/Num->1 g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide)
Best program: (exec_dup (g/Num->0 g/S->Times g/S->Num g/S->x g/S->Num g/S->x g/S->x g/S->Times g/Num->1 g/S->Plus g/Num->0 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/Num->1 g/S->x g/Num->1 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide))))))
Best total error: 96
Best errors: (2 2 2 3 3 3 4 4 5 5 8 3 5 5 5 5 6 6 6 7 7)
Best behaviors: (911 758 619 493 382 285 201 132 76 35 5 -3 -4 11 40 83 139 210 295 393 506)

-------------------------------------------------------
               Report for Generation 233
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus g/S->Minus exec_dup)
Best program: (exec_dup (g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus g/S->Minus exec_dup ()))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 234
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus g/S->Minus exec_dup)
Best program: (exec_dup (g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus g/S->Minus exec_dup ()))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 235
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus)
Best program: (exec_dup (g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 236
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus)
Best program: (exec_dup (g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/Num->0 g/S->x g/S->Times g/Num->1 g/Num->0 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 237
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 238
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/Num->1 g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/Num->1 g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus))))))
Best total error: 159
Best errors: (3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17)
Best behaviors: (916 762 622 496 384 286 202 132 76 34 6 -8 -8 6 34 76 132 202 286 384 496)

-------------------------------------------------------
               Report for Generation 239
-------------------------------------------------------
Best plushy: (exec_dup g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/S->x g/S->Times g/Num->1 exec_dup g/Num->1 exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Plus g/S->x g/S->Times g/S->Num g/S->Times g/S->x g/S->Num g/S->x g/Num->0 g/S->x g/S->Times g/Num->1 exec_dup (g/Num->1 exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/S->Plus g/S->x g/S->Minus g/Num->0 g/S->Minus g/S->Minus))))))
Best total error: 159
Best errors: (17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3)
Best behaviors: (896 744 606 482 372 276 194 126 72 32 6 -6 -4 12 42 86 144 216 302 402 516)

-------------------------------------------------------
               Report for Generation 240
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 241
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 242
-------------------------------------------------------
Best plushy: (exec_dup g/Num->0 g/S->Num g/S->Times g/S->Num g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/Num->0 g/S->Num g/S->Times g/S->Num g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 126
Best errors: (6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6)
Best behaviors: (907 754 615 490 379 282 199 130 75 34 7 -6 -5 10 39 82 139 210 295 394 507)

-------------------------------------------------------
               Report for Generation 243
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 244
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 245
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/Num->1 g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/Num->1 g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 246
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/S->Plus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 247
-------------------------------------------------------
Best plushy: (g/S->x exec_dup g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/Num->1 g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->x exec_dup (g/S->Num g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/Num->1 g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 248
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 249
-------------------------------------------------------
Best plushy: (g/S->Divide exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x exec_dup g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Divide exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x exec_dup (g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 250
-------------------------------------------------------
Best plushy: (g/S->Divide exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x exec_dup g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Divide exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x exec_dup (g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 251
-------------------------------------------------------
Best plushy: (g/S->Divide exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x exec_dup g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Divide exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x exec_dup (g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 252
-------------------------------------------------------
Best plushy: (g/S->Divide exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup g/Num->1 g/S->Minus g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x exec_dup g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Divide exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/S->Num g/S->Minus g/S->Minus exec_dup (g/Num->1 g/S->Minus g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x exec_dup (g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 135
Best errors: (5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 8 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 253
-------------------------------------------------------
Best plushy: (g/S->x exec_dup g/S->Minus g/S->Minus g/S->Num g/S->Times g/Num->0 g/S->x g/S->Num g/S->Num g/S->x g/S->Times g/S->Divide g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->x g/S->Times g/Num->1 g/S->Plus g/Num->1 exec_dup exec_dup g/S->x g/Num->1 g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/Num->0 g/S->Minus g/Num->1 exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->0)
Best program: (g/S->x exec_dup (g/S->Minus g/S->Minus g/S->Num g/S->Times g/Num->0 g/S->x g/S->Num g/S->Num g/S->x g/S->Times g/S->Divide g/Num->0 g/S->x g/Num->0 g/Num->1 g/S->x g/S->Times g/Num->1 g/S->Plus g/Num->1 exec_dup (exec_dup (g/S->x g/Num->1 g/S->Num g/Num->1 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/Num->0 g/S->Minus g/Num->1 exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->0))))))
Best total error: 134
Best errors: (5 4 3 2 1 0 1 2 3 4 4 6 7 8 9 10 11 12 13 14 15)
Best behaviors: (918 764 624 498 386 288 204 134 78 36 9 -6 -6 8 36 78 134 204 288 386 498)

-------------------------------------------------------
               Report for Generation 254
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->1 g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->1 g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 125
Best errors: (10 8 7 5 3 1 2 8 23 10 6 11 8 5 3 2 0 1 3 4 5)
Best behaviors: (903 752 614 491 382 287 207 144 104 30 7 -11 -7 11 42 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 255
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->1 g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->1 g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 125
Best errors: (10 8 7 5 3 1 2 8 23 10 6 11 8 5 3 2 0 1 3 4 5)
Best behaviors: (903 752 614 491 382 287 207 144 104 30 7 -11 -7 11 42 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 256
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->1 g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x g/Num->1 exec_dup g/Num->0 g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->1 g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x g/Num->1 exec_dup (g/Num->0 g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 125
Best errors: (10 8 7 5 3 1 2 8 23 10 6 11 8 5 3 2 0 1 3 4 5)
Best behaviors: (903 752 614 491 382 287 207 144 104 30 7 -11 -7 11 42 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 257
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->1 g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x g/Num->1 exec_dup g/Num->0 g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->1 g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x g/Num->1 exec_dup (g/Num->0 g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 125
Best errors: (10 8 7 5 3 1 2 8 23 10 6 11 8 5 3 2 0 1 3 4 5)
Best behaviors: (903 752 614 491 382 287 207 144 104 30 7 -11 -7 11 42 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 258
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 exec_dup g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 exec_dup (g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 139
Best errors: (7 6 5 3 2 0 2 4 9 19 12 11 22 8 3 0 2 4 5 7 8)
Best behaviors: (906 754 616 493 383 288 207 140 90 59 1 -11 -21 8 42 88 147 220 306 407 521)

-------------------------------------------------------
               Report for Generation 259
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 exec_dup g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 exec_dup (g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 139
Best errors: (7 6 5 3 2 0 2 4 9 19 12 11 22 8 3 0 2 4 5 7 8)
Best behaviors: (906 754 616 493 383 288 207 140 90 59 1 -11 -21 8 42 88 147 220 306 407 521)

-------------------------------------------------------
               Report for Generation 260
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x exec_dup g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x exec_dup (g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)))))))
Best total error: 139
Best errors: (7 6 5 3 2 0 2 4 9 19 12 11 22 8 3 0 2 4 5 7 8)
Best behaviors: (906 754 616 493 383 288 207 140 90 59 1 -11 -21 8 42 88 147 220 306 407 521)

-------------------------------------------------------
               Report for Generation 261
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 exec_dup g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 exec_dup (g/S->x g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 135
Best errors: (7 6 5 4 2 1 1 4 8 17 12 11 21 7 3 0 2 4 5 7 8)
Best behaviors: (906 754 616 492 383 287 206 140 89 57 1 -11 -20 9 42 88 147 220 306 407 521)

-------------------------------------------------------
               Report for Generation 262
-------------------------------------------------------
Best plushy: (exec_dup g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->1 g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->1 g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 126
Best errors: (14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6)
Best behaviors: (927 773 633 507 395 297 213 143 87 45 17 3 3 17 45 87 143 213 297 395 507)

-------------------------------------------------------
               Report for Generation 263
-------------------------------------------------------
Best plushy: (exec_dup g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 126
Best errors: (14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6)
Best behaviors: (927 773 633 507 395 297 213 143 87 45 17 3 3 17 45 87 143 213 297 395 507)

-------------------------------------------------------
               Report for Generation 264
-------------------------------------------------------
Best plushy: (exec_dup g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 126
Best errors: (14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6)
Best behaviors: (927 773 633 507 395 297 213 143 87 45 17 3 3 17 45 87 143 213 297 395 507)

-------------------------------------------------------
               Report for Generation 265
-------------------------------------------------------
Best plushy: (exec_dup g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 126
Best errors: (14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6)
Best behaviors: (927 773 633 507 395 297 213 143 87 45 17 3 3 17 45 87 143 213 297 395 507)

-------------------------------------------------------
               Report for Generation 266
-------------------------------------------------------
Best plushy: (exec_dup g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 126
Best errors: (14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6)
Best behaviors: (927 773 633 507 395 297 213 143 87 45 17 3 3 17 45 87 143 213 297 395 507)

-------------------------------------------------------
               Report for Generation 267
-------------------------------------------------------
Best plushy: (exec_dup g/Num->1 g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->Num g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->x g/S->x exec_dup g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Times g/S->Minus g/S->Minus)
Best program: (exec_dup (g/Num->1 g/S->x g/S->Times g/S->Num g/S->Plus g/S->Num g/S->Divide g/S->Num g/S->x g/Num->0 g/Num->0 g/Num->0 g/S->x g/S->x g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus g/Num->0 g/S->Minus g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->x g/S->x exec_dup (g/Num->0 g/S->Times g/S->Plus g/S->Minus g/Num->1 g/S->Num g/S->Plus g/S->x g/S->Minus g/S->Times g/S->Minus g/S->Minus))))))
Best total error: 119
Best errors: (13 12 11 10 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7)
Best behaviors: (926 772 632 506 394 296 212 142 86 44 16 2 2 16 44 86 142 212 296 394 506)

-------------------------------------------------------
               Report for Generation 268
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 5 4 2 0 5 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 45 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 269
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 5 4 2 0 5 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 45 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 270
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 5 4 2 0 5 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 45 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 271
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 5 4 2 0 5 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 45 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 272
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 5 4 2 0 5 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 45 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 273
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 6 4 3 1 0 5 16 9 5 2 0 1 2 4 5 6)
Best behaviors: (902 750 612 488 378 282 201 133 80 40 8 -16 -8 11 43 88 146 218 305 405 519)

-------------------------------------------------------
               Report for Generation 274
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 6 4 3 1 0 5 16 9 5 2 0 1 2 4 5 6)
Best behaviors: (902 750 612 488 378 282 201 133 80 40 8 -16 -8 11 43 88 146 218 305 405 519)

-------------------------------------------------------
               Report for Generation 275
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 113
Best errors: (11 10 9 8 7 5 4 2 0 4 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 44 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 276
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 113
Best errors: (11 10 9 8 7 5 4 2 0 4 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 44 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 277
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->1 g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 113
Best errors: (11 10 9 8 7 5 4 2 0 4 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 44 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 278
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 6 4 3 1 0 5 16 9 5 2 0 1 2 4 5 6)
Best behaviors: (902 750 612 488 378 282 201 133 80 40 8 -16 -8 11 43 88 146 218 305 405 519)

-------------------------------------------------------
               Report for Generation 279
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 6 4 3 1 0 5 16 9 5 2 0 1 2 4 5 6)
Best behaviors: (902 750 612 488 378 282 201 133 80 40 8 -16 -8 11 43 88 146 218 305 405 519)

-------------------------------------------------------
               Report for Generation 280
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 114
Best errors: (11 10 9 8 7 5 4 2 0 5 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 45 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 281
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->Num g/S->Num g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Plus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->Num g/S->Num g/S->x g/S->Minus g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Plus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 102
Best errors: (8 7 6 5 4 2 1 1 4 9 6 5 5 1 1 3 4 6 7 8 9)
Best behaviors: (905 753 615 491 381 286 204 137 85 49 7 -5 -4 15 46 91 149 222 308 408 522)

-------------------------------------------------------
               Report for Generation 282
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 113
Best errors: (11 10 9 8 7 5 4 2 0 4 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 44 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 283
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 113
Best errors: (11 10 9 8 7 5 4 2 0 4 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 44 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 284
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Num g/S->Plus g/Num->1 g/S->Times g/S->Divide g/S->x g/Num->0 g/Num->1 g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->Times g/S->x g/S->Minus g/S->Minus g/Num->1)
Best program: (exec_dup (g/S->Num g/S->Num g/S->Plus g/Num->1 g/S->Times g/S->Divide g/S->x g/Num->0 g/Num->1 g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->Times g/S->x g/S->Minus g/S->Minus g/Num->1))))))
Best total error: 105
Best errors: (10 9 8 6 5 4 2 0 2 5 2 16 8 4 2 0 2 3 4 6 7)
Best behaviors: (903 751 613 490 380 284 203 136 83 45 11 -16 -7 12 43 88 147 219 305 406 520)

-------------------------------------------------------
               Report for Generation 285
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Num g/S->Plus g/Num->1 g/S->Times g/S->Divide g/S->x g/Num->0 g/Num->1 g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->Times g/S->x g/S->Minus g/S->Minus g/Num->1)
Best program: (exec_dup (g/S->Num g/S->Num g/S->Plus g/Num->1 g/S->Times g/S->Divide g/S->x g/Num->0 g/Num->1 g/S->Num g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->Times g/S->Times g/S->x g/S->Minus g/S->Minus g/Num->1))))))
Best total error: 105
Best errors: (10 9 8 6 5 4 2 0 2 5 2 16 8 4 2 0 2 3 4 6 7)
Best behaviors: (903 751 613 490 380 284 203 136 83 45 11 -16 -7 12 43 88 147 219 305 406 520)

-------------------------------------------------------
               Report for Generation 286
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/Num->0 g/Num->0 g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Divide g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 113
Best errors: (11 10 9 8 7 5 4 2 0 4 9 8 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 44 4 -8 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 287
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->x g/S->Minus g/Num->1)
Best program: (g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup (g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->x g/S->Minus g/Num->1))))))
Best total error: 127
Best errors: (11 10 9 8 6 5 3 1 3 20 13 0 13 4 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 379 283 202 135 84 60 0 0 -12 12 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 288
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->x g/S->Minus g/Num->1)
Best program: (g/S->Divide g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup (g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->x g/S->Minus g/Num->1))))))
Best total error: 127
Best errors: (11 10 9 8 6 5 3 1 3 20 13 0 13 4 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 379 283 202 135 84 60 0 0 -12 12 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 289
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1)
Best program: (g/S->Divide g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup (g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1))))))
Best total error: 127
Best errors: (11 10 9 8 6 5 3 1 3 20 13 0 13 4 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 379 283 202 135 84 60 0 0 -12 12 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 290
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1)
Best program: (g/S->Divide g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup (g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1))))))
Best total error: 127
Best errors: (11 10 9 8 6 5 3 1 3 20 13 0 13 4 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 379 283 202 135 84 60 0 0 -12 12 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 291
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup g/S->Divide g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1)
Best program: (g/S->Divide g/S->Divide g/S->Plus g/S->Num g/S->Num exec_dup (g/S->Divide g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1))))))
Best total error: 122
Best errors: (11 10 9 8 7 6 4 3 2 1 7 18 9 5 3 1 1 2 4 5 6)
Best behaviors: (902 750 612 488 378 282 201 133 79 39 6 -18 -8 11 42 87 146 218 305 405 519)

-------------------------------------------------------
               Report for Generation 292
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup g/Num->0 exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup (g/Num->0 exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 123
Best errors: (12 11 10 9 8 6 5 3 1 3 10 9 12 6 3 1 0 2 3 4 5)
Best behaviors: (901 749 611 487 377 282 200 133 80 43 3 -9 -11 10 42 87 145 218 304 404 518)

-------------------------------------------------------
               Report for Generation 293
-------------------------------------------------------
Best plushy: (g/S->Divide g/S->Divide g/S->x g/S->Plus g/S->Num g/S->Num exec_dup g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1)
Best program: (g/S->Divide g/S->Divide g/S->x g/S->Plus g/S->Num g/S->Num exec_dup (g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Minus g/Num->1 g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1))))))
Best total error: 126
Best errors: (12 10 9 8 7 6 4 2 1 17 13 3 7 3 1 1 2 3 4 6 7)
Best behaviors: (901 750 612 488 378 282 201 134 82 57 0 -3 -6 13 44 89 147 219 305 406 520)

-------------------------------------------------------
               Report for Generation 294
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 136
Best errors: (7 6 5 4 2 1 1 4 8 17 12 11 22 7 3 0 2 4 5 7 8)
Best behaviors: (906 754 616 492 383 287 206 140 89 57 1 -11 -21 9 42 88 147 220 306 407 521)

-------------------------------------------------------
               Report for Generation 295
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/Num->0 g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 136
Best errors: (7 6 5 4 2 1 1 4 8 17 12 11 22 7 3 0 2 4 5 7 8)
Best behaviors: (906 754 616 492 383 287 206 140 89 57 1 -11 -21 9 42 88 147 220 306 407 521)

-------------------------------------------------------
               Report for Generation 296
-------------------------------------------------------
Best plushy: (g/S->Num g/Num->0 g/S->Times g/S->Times g/S->x g/S->Times g/S->Divide exec_dup g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Num g/Num->0 g/S->Times g/S->Times g/S->x g/S->Times g/S->Divide exec_dup (g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus))))))
Best total error: 128
Best errors: (12 11 10 9 8 7 5 4 3 2 6 17 10 6 3 2 0 1 3 4 5)
Best behaviors: (901 749 611 487 377 281 200 132 78 38 7 -17 -9 10 42 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 297
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Plus g/S->Num g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Times g/S->Plus g/S->Num g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 119
Best errors: (11 10 9 8 7 6 4 3 2 1 6 17 9 5 2 1 1 2 4 5 6)
Best behaviors: (902 750 612 488 378 282 201 133 79 39 7 -17 -8 11 43 87 146 218 305 405 519)

-------------------------------------------------------
               Report for Generation 298
-------------------------------------------------------
Best plushy: (exec_dup g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Plus g/S->Divide g/S->Num g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Times g/S->Num g/S->Minus g/Num->0 exec_dup g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1 g/S->Minus g/S->Divide)
Best program: (exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Divide g/S->Plus g/S->Divide g/S->Num g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Times g/S->Num g/S->Minus g/Num->0 exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1 g/S->Minus g/S->Divide))))))
Best total error: 131
Best errors: (10 8 7 5 3 1 2 8 23 10 9 12 8 6 4 2 0 1 3 4 5)
Best behaviors: (903 752 614 491 382 287 207 144 104 30 4 -12 -7 10 41 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 299
-------------------------------------------------------
Best plushy: (exec_dup g/S->Divide g/S->Num g/S->Times g/S->Plus g/S->Divide g/S->Num g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Times g/S->Num g/Num->0 g/S->Minus g/Num->0 exec_dup g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1 g/S->Minus g/S->Divide)
Best program: (exec_dup (g/S->Divide g/S->Num g/S->Times g/S->Plus g/S->Divide g/S->Num g/S->Divide g/S->x g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/Num->0 g/S->Minus g/S->Times g/S->Num g/Num->0 g/S->Minus g/Num->0 exec_dup (g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Plus g/S->Divide g/S->x g/S->Minus g/Num->1 g/S->Minus g/S->Divide))))))
Best total error: 131
Best errors: (10 8 7 5 3 1 2 8 23 10 9 12 8 6 4 2 0 1 3 4 5)
Best behaviors: (903 752 614 491 382 287 207 144 104 30 4 -12 -7 10 41 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 300
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/Num->1 g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/Num->1 g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 137
Best errors: (5 3 2 1 1 2 4 6 8 10 1 34 12 4 0 3 5 7 8 10 11)
Best behaviors: (908 757 619 495 386 290 209 142 89 50 12 -34 -11 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 301
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/Num->0 g/S->Times exec_dup g/S->Minus g/S->Times g/S->Plus g/S->Times g/S->Times g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Num g/S->Minus g/Num->0 g/S->Times exec_dup (g/S->Minus g/S->Times g/S->Plus g/S->Times g/S->Times g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/Num->0 g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus)))))))
Best total error: 130
Best errors: (12 11 10 9 7 6 4 2 1 14 9 8 13 6 3 1 0 2 3 4 5)
Best behaviors: (901 749 611 487 378 282 201 134 82 54 4 -8 -12 10 42 87 145 218 304 404 518)

-------------------------------------------------------
               Report for Generation 302
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Times g/Num->1 g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Num g/S->Minus g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Times g/Num->1 g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 119
Best errors: (11 10 9 8 7 6 4 3 2 1 6 17 9 5 2 1 1 2 4 5 6)
Best behaviors: (902 750 612 488 378 282 201 133 79 39 7 -17 -8 11 43 87 146 218 305 405 519)

-------------------------------------------------------
               Report for Generation 303
-------------------------------------------------------
Best plushy: (g/S->Times exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/Num->1 g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Times exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/Num->1 g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 137
Best errors: (5 3 2 1 1 2 4 6 8 10 1 34 12 4 0 3 5 7 8 10 11)
Best behaviors: (908 757 619 495 386 290 209 142 89 50 12 -34 -11 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 304
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Plus g/S->Times g/S->x g/S->x g/S->Divide g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Divide g/S->Minus)
Best program: (exec_dup (g/S->Num g/S->Plus g/S->Times g/S->x g/S->x g/S->Divide g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus g/S->Divide g/S->Minus))))))
Best total error: 131
Best errors: (10 8 7 5 3 1 3 8 24 10 9 11 8 6 3 2 0 1 3 4 5)
Best behaviors: (903 752 614 491 382 287 208 144 105 30 4 -11 -7 10 42 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 305
-------------------------------------------------------
Best plushy: (g/S->Times exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->Times exec_dup exec_dup g/Num->1 g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Times exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->Times exec_dup (exec_dup (g/Num->1 g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 118
Best errors: (12 11 10 9 7 6 4 2 0 4 1 19 9 6 3 2 0 1 3 4 5)
Best behaviors: (901 749 611 487 378 282 201 134 81 44 12 -19 -8 10 42 86 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 306
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Minus g/S->Plus g/S->Num g/S->x g/Num->1 g/Num->1 exec_dup g/S->x g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Minus g/S->Plus g/S->Num g/S->x g/Num->1 g/Num->1 exec_dup (g/S->x g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 134
Best errors: (5 3 2 1 0 2 3 5 8 10 2 33 11 4 1 3 5 7 8 10 11)
Best behaviors: (908 757 619 495 385 290 208 141 89 50 11 -33 -10 12 46 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 307
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Times g/S->Num g/S->x g/Num->1 g/S->x exec_dup g/S->x g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Times g/S->Num g/S->x g/Num->1 g/S->x exec_dup (g/S->x g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 137
Best errors: (4 3 2 1 1 2 4 6 8 11 0 35 12 4 0 3 5 7 8 10 11)
Best behaviors: (909 757 619 495 386 290 209 142 89 51 13 -35 -11 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 308
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 g/S->x exec_dup g/S->x g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 g/S->x exec_dup (g/S->x g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 132
Best errors: (5 4 2 1 0 2 3 5 7 9 1 32 10 3 1 4 6 7 9 10 11)
Best behaviors: (908 756 619 495 385 290 208 141 88 49 12 -32 -9 13 46 92 151 223 310 410 524)

-------------------------------------------------------
               Report for Generation 309
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 g/S->x exec_dup g/S->x g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 g/S->x exec_dup (g/S->x g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 132
Best errors: (5 4 2 1 0 2 3 5 7 9 1 32 10 3 1 4 6 7 9 10 11)
Best behaviors: (908 756 619 495 385 290 208 141 88 49 12 -32 -9 13 46 92 151 223 310 410 524)

-------------------------------------------------------
               Report for Generation 310
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 g/S->x exec_dup g/S->Plus g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/Num->1 g/S->x exec_dup (g/S->Plus g/S->Plus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 128
Best errors: (12 11 10 9 8 7 5 4 2 1 1 23 13 5 3 1 0 1 3 4 5)
Best behaviors: (901 749 611 487 377 281 200 132 79 39 12 -23 -12 11 42 87 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 311
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Times g/Num->0 g/S->x g/S->Plus g/S->Num g/S->x g/Num->1 g/S->Divide exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Times g/Num->0 g/S->x g/S->Plus g/S->Num g/S->x g/Num->1 g/S->Divide exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->Divide g/S->Plus g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 136
Best errors: (7 6 5 3 2 0 2 4 8 17 12 11 22 8 3 0 2 4 5 7 8)
Best behaviors: (906 754 616 493 383 288 207 140 89 57 1 -11 -21 8 42 88 147 220 306 407 521)

-------------------------------------------------------
               Report for Generation 312
-------------------------------------------------------
Best plushy: (exec_dup g/S->Num g/S->Times g/S->Plus g/S->Num g/Num->1 g/S->Divide g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Plus g/S->x g/Num->1 g/S->Minus exec_dup g/S->Divide)
Best program: (exec_dup (g/S->Num g/S->Times g/S->Plus g/S->Num g/Num->1 g/S->Divide g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Plus g/S->x g/Num->1 g/S->Minus exec_dup (g/S->Divide)))))))
Best total error: 119
Best errors: (11 10 9 8 7 6 4 3 2 1 6 17 9 5 2 1 1 2 4 5 6)
Best behaviors: (902 750 612 488 378 282 201 133 79 39 7 -17 -8 11 43 87 146 218 305 405 519)

-------------------------------------------------------
               Report for Generation 313
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->x exec_dup g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->x exec_dup (g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 120
Best errors: (12 11 10 9 8 7 5 4 2 1 1 17 10 6 3 1 0 1 3 4 5)
Best behaviors: (901 749 611 487 377 281 200 132 79 39 12 -17 -9 10 42 87 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 314
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->x exec_dup g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->x exec_dup (g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 120
Best errors: (12 11 10 9 8 7 5 4 2 1 1 17 10 6 3 1 0 1 3 4 5)
Best behaviors: (901 749 611 487 377 281 200 132 79 39 12 -17 -9 10 42 87 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 315
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Plus g/S->Num g/S->x g/S->x g/S->Plus g/S->Plus exec_dup g/S->x g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/Num->0 g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Plus g/S->Num g/S->x g/S->x g/S->Plus g/S->Plus exec_dup (g/S->x g/S->x g/S->Minus g/S->Plus g/Num->1 g/S->x g/S->x g/S->x g/S->Minus g/Num->0 g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 121
Best errors: (12 11 10 9 8 6 5 3 1 4 9 8 13 4 3 1 0 2 3 4 5)
Best behaviors: (901 749 611 487 377 282 200 133 80 44 4 -8 -12 12 42 87 145 218 304 404 518)

-------------------------------------------------------
               Report for Generation 316
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Num g/S->x g/S->x g/S->Plus exec_dup g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Num g/S->x g/S->x g/S->Plus exec_dup (g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 133
Best errors: (5 3 2 1 1 2 4 6 8 10 2 30 11 4 0 3 5 7 8 10 11)
Best behaviors: (908 757 619 495 386 290 209 142 89 50 11 -30 -10 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 317
-------------------------------------------------------
Best plushy: (g/S->Num exec_dup g/S->Times g/Num->0 g/S->Num g/S->x g/S->x g/S->Plus g/S->Times exec_dup g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Num exec_dup (g/S->Times g/Num->0 g/S->Num g/S->x g/S->x g/S->Plus g/S->Times exec_dup (g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 125
Best errors: (12 11 10 9 8 7 5 4 2 1 6 17 10 6 3 1 0 1 3 4 5)
Best behaviors: (901 749 611 487 377 281 200 132 79 39 7 -17 -9 10 42 87 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 318
-------------------------------------------------------
Best plushy: (g/S->Num exec_dup g/S->Times g/Num->0 g/S->Num g/S->x g/S->x g/S->Plus g/S->Times exec_dup g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Num exec_dup (g/S->Times g/Num->0 g/S->Num g/S->x g/S->x g/S->Plus g/S->Times exec_dup (g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 125
Best errors: (12 11 10 9 8 7 5 4 2 1 6 17 10 6 3 1 0 1 3 4 5)
Best behaviors: (901 749 611 487 377 281 200 132 79 39 7 -17 -9 10 42 87 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 319
-------------------------------------------------------
Best plushy: (g/S->Num exec_dup g/S->Times g/Num->0 g/S->Num g/S->x g/S->x g/S->Plus g/S->Times exec_dup g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Num exec_dup (g/S->Times g/Num->0 g/S->Num g/S->x g/S->x g/S->Plus g/S->Times exec_dup (g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 125
Best errors: (12 11 10 9 8 7 5 4 2 1 6 17 10 6 3 1 0 1 3 4 5)
Best behaviors: (901 749 611 487 377 281 200 132 79 39 7 -17 -9 10 42 87 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 320
-------------------------------------------------------
Best plushy: (g/S->Num exec_dup g/S->Minus g/S->Times g/Num->0 g/S->Num g/S->x g/S->x g/S->Plus g/S->Times exec_dup g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Num exec_dup (g/S->Minus g/S->Times g/Num->0 g/S->Num g/S->x g/S->x g/S->Plus g/S->Times exec_dup (g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 125
Best errors: (12 11 10 9 8 7 5 4 2 1 6 17 10 6 3 1 0 1 3 4 5)
Best behaviors: (901 749 611 487 377 281 200 132 79 39 7 -17 -9 10 42 87 145 217 304 404 518)

-------------------------------------------------------
               Report for Generation 321
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Divide g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times exec_dup g/S->Divide exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times g/S->Divide g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times exec_dup (g/S->Divide exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 116
Best errors: (11 10 9 8 7 5 4 2 0 1 6 17 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 39 7 -17 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 322
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Divide g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times exec_dup g/S->Divide exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times g/S->Divide g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times exec_dup (g/S->Divide exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 116
Best errors: (11 10 9 8 7 5 4 2 0 1 6 17 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 39 7 -17 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 323
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Divide g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times exec_dup g/S->Divide exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times g/S->Divide g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times exec_dup (g/S->Divide exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 116
Best errors: (11 10 9 8 7 5 4 2 0 1 6 17 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 39 7 -17 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 324
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times exec_dup g/S->Divide exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times exec_dup (g/S->Divide exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 116
Best errors: (11 10 9 8 7 5 4 2 0 1 6 17 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 39 7 -17 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 325
-------------------------------------------------------
Best plushy: (g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 g/Num->1 exec_dup g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times g/Num->0 exec_dup g/S->Divide exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus)
Best program: (g/S->Times g/S->Plus g/S->Plus g/S->Num g/Num->1 g/Num->1 g/Num->1 exec_dup (g/Num->1 g/S->x g/S->x g/S->x g/S->x g/S->Times g/Num->0 g/S->Times g/Num->0 exec_dup (g/S->Divide exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Plus g/S->x g/S->Minus))))))
Best total error: 116
Best errors: (11 10 9 8 7 5 4 2 0 1 6 17 10 5 2 0 1 3 4 5 6)
Best behaviors: (902 750 612 488 378 283 201 134 81 39 7 -17 -9 11 43 88 146 219 305 405 519)

-------------------------------------------------------
               Report for Generation 326
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/Num->0 g/S->Plus g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/Num->0 exec_dup (g/Num->0 g/S->Plus g/S->Plus g/S->Times g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 99
Best errors: (8 7 6 5 4 3 1 0 2 3 2 13 6 2 1 3 4 5 7 8 9)
Best behaviors: (905 753 615 491 381 285 204 136 83 43 11 -13 -5 14 46 91 149 221 308 408 522)

-------------------------------------------------------
               Report for Generation 327
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/Num->0 g/S->Plus g/S->Plus g/S->Times g/S->Minus g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/Num->0 exec_dup (g/Num->0 g/S->Plus g/S->Plus g/S->Times g/S->Minus g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 99
Best errors: (8 7 6 5 4 3 1 0 2 3 2 13 6 2 1 3 4 5 7 8 9)
Best behaviors: (905 753 615 491 381 285 204 136 83 43 11 -13 -5 14 46 91 149 221 308 408 522)

-------------------------------------------------------
               Report for Generation 328
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Minus g/Num->0 g/S->Plus g/S->Plus g/S->Times g/S->Minus g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Minus g/Num->0 g/S->Plus g/S->Plus g/S->Times g/S->Minus g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 99
Best errors: (8 7 6 5 4 3 1 0 2 3 2 13 6 2 1 3 4 5 7 8 9)
Best behaviors: (905 753 615 491 381 285 204 136 83 43 11 -13 -5 14 46 91 149 221 308 408 522)

-------------------------------------------------------
               Report for Generation 329
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/Num->0 g/S->Plus g/S->Plus g/S->Times g/S->Minus g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/Num->0 exec_dup (g/Num->0 g/S->Plus g/S->Plus g/S->Times g/S->Minus g/S->Num g/S->x g/Num->1 g/S->Divide g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 99
Best errors: (8 7 6 5 4 3 1 0 2 3 2 13 6 2 1 3 4 5 7 8 9)
Best behaviors: (905 753 615 491 381 285 204 136 83 43 11 -13 -5 14 46 91 149 221 308 408 522)

-------------------------------------------------------
               Report for Generation 330
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 114
Best errors: (5 3 2 1 0 2 3 4 6 5 7 19 11 5 0 2 5 6 8 9 11)
Best behaviors: (908 757 619 495 385 290 208 140 87 45 6 -19 -10 11 45 90 150 222 309 409 524)

-------------------------------------------------------
               Report for Generation 331
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 114
Best errors: (5 3 2 1 0 2 3 4 6 5 7 19 11 5 0 2 5 6 8 9 11)
Best behaviors: (908 757 619 495 385 290 208 140 87 45 6 -19 -10 11 45 90 150 222 309 409 524)

-------------------------------------------------------
               Report for Generation 332
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 114
Best errors: (5 3 2 1 0 2 3 4 6 5 7 19 11 5 0 2 5 6 8 9 11)
Best behaviors: (908 757 619 495 385 290 208 140 87 45 6 -19 -10 11 45 90 150 222 309 409 524)

-------------------------------------------------------
               Report for Generation 333
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 114
Best errors: (5 3 2 1 0 2 3 4 6 5 7 19 11 5 0 2 5 6 8 9 11)
Best behaviors: (908 757 619 495 385 290 208 140 87 45 6 -19 -10 11 45 90 150 222 309 409 524)

-------------------------------------------------------
               Report for Generation 334
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->Num g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 114
Best errors: (5 3 2 1 0 2 3 4 6 5 7 19 11 5 0 2 5 6 8 9 11)
Best behaviors: (908 757 619 495 385 290 208 140 87 45 6 -19 -10 11 45 90 150 222 309 409 524)

-------------------------------------------------------
               Report for Generation 335
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 336
-------------------------------------------------------
Best plushy: (exec_dup g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 337
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Minus g/Num->0 g/S->Plus g/S->Times g/S->Minus g/S->Num g/Num->1 g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Minus g/Num->0 g/S->Plus g/S->Times g/S->Minus g/S->Num g/Num->1 g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 99
Best errors: (8 7 6 5 4 3 1 0 2 3 2 13 6 2 1 3 4 5 7 8 9)
Best behaviors: (905 753 615 491 381 285 204 136 83 43 11 -13 -5 14 46 91 149 221 308 408 522)

-------------------------------------------------------
               Report for Generation 338
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Minus g/Num->0 g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Minus g/Num->0 g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 99
Best errors: (8 7 6 5 4 3 1 0 2 3 2 13 6 2 1 3 4 5 7 8 9)
Best behaviors: (905 753 615 491 381 285 204 136 83 43 11 -13 -5 14 46 91 149 221 308 408 522)

-------------------------------------------------------
               Report for Generation 339
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Minus g/Num->0 g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->x g/S->x g/S->Minus g/S->Times exec_dup exec_dup g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Minus g/Num->0 g/S->Plus g/S->Times g/S->Num g/Num->1 g/S->x g/S->x g/S->Minus g/S->Times exec_dup (exec_dup (g/S->x g/S->Num g/S->Num g/S->Num g/S->Minus g/S->Plus g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 99
Best errors: (8 7 6 5 4 3 1 0 2 3 2 13 6 2 1 3 4 5 7 8 9)
Best behaviors: (905 753 615 491 381 285 204 136 83 43 11 -13 -5 14 46 91 149 221 308 408 522)

-------------------------------------------------------
               Report for Generation 340
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 341
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 342
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 343
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 344
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 345
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 346
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 347
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 348
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 349
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Minus g/Num->0 g/Num->0 g/S->x g/Num->1 g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Minus g/Num->0 g/Num->0 g/S->x g/Num->1 g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 350
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 351
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide g/Num->1 exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide g/Num->1 exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 352
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Minus g/Num->0 g/Num->0 g/S->x g/Num->1 g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Minus g/Num->0 g/Num->0 g/S->x g/Num->1 g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 353
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 354
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Plus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 355
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->Minus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->Minus g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 356
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 357
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 358
-------------------------------------------------------
Best plushy: (g/Num->0 g/S->Num exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 g/S->Num exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 359
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 113
Best errors: (4 3 2 1 0 2 3 5 6 5 6 19 11 5 1 2 4 6 8 9 11)
Best behaviors: (909 757 619 495 385 290 208 141 87 45 7 -19 -10 11 44 90 149 222 309 409 524)

-------------------------------------------------------
               Report for Generation 360
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 113
Best errors: (4 3 2 1 0 2 3 5 6 5 6 19 11 5 1 2 4 6 8 9 11)
Best behaviors: (909 757 619 495 385 290 208 141 87 45 7 -19 -10 11 44 90 149 222 309 409 524)

-------------------------------------------------------
               Report for Generation 361
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 113
Best errors: (4 3 2 1 0 2 3 5 6 5 6 19 11 5 1 2 4 6 8 9 11)
Best behaviors: (909 757 619 495 385 290 208 141 87 45 7 -19 -10 11 44 90 149 222 309 409 524)

-------------------------------------------------------
               Report for Generation 362
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 113
Best errors: (4 3 2 1 0 2 3 5 6 5 6 19 11 5 1 2 4 6 8 9 11)
Best behaviors: (909 757 619 495 385 290 208 141 87 45 7 -19 -10 11 44 90 149 222 309 409 524)

-------------------------------------------------------
               Report for Generation 363
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup (g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 113
Best errors: (4 3 2 1 0 2 3 5 6 5 6 19 11 5 1 2 4 6 8 9 11)
Best behaviors: (909 757 619 495 385 290 208 141 87 45 7 -19 -10 11 44 90 149 222 309 409 524)

-------------------------------------------------------
               Report for Generation 364
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 365
-------------------------------------------------------
Best plushy: (g/Num->0 g/S->Minus exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup g/S->Plus g/S->x g/Num->1 g/Num->0 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 g/S->Minus exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->0 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 366
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 367
-------------------------------------------------------
Best plushy: (g/S->Num g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x g/Num->0 exec_dup g/S->Plus g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Num g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/S->x g/Num->0 exec_dup (g/S->Plus g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 368
-------------------------------------------------------
Best plushy: (g/S->Num g/Num->0 exec_dup g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/Num->0 exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Num g/Num->0 exec_dup (g/S->Times g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/Num->0 exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 369
-------------------------------------------------------
Best plushy: (g/S->Num g/Num->0 exec_dup g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/Num->0 exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Num g/Num->0 exec_dup (g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/S->x g/Num->0 exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 370
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Minus g/Num->0 g/S->Minus g/S->Times g/S->Plus g/S->Plus g/S->Num g/S->Minus g/Num->1 g/S->x g/S->Plus g/Num->1 g/S->x g/Num->0 g/S->x exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->1 exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Minus g/Num->0 g/S->Minus g/S->Times g/S->Plus g/S->Plus g/S->Num g/S->Minus g/Num->1 g/S->x g/S->Plus g/Num->1 g/S->x g/Num->0 g/S->x exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->1 exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 371
-------------------------------------------------------
Best plushy: (g/S->Num g/Num->0 exec_dup g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/Num->0 exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Num g/Num->0 exec_dup (g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/Num->0 exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 372
-------------------------------------------------------
Best plushy: (g/S->Num g/Num->0 exec_dup g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/Num->0 exec_dup g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)
Best program: (g/S->Num g/Num->0 exec_dup (g/S->Minus g/Num->0 g/S->x g/S->Plus g/Num->1 g/S->x g/Num->0 exec_dup (g/S->x g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/Num->1 g/S->Divide g/S->x g/S->Minus g/S->Minus g/S->Minus)))))))
Best total error: 112
Best errors: (5 4 2 1 0 1 3 4 5 4 7 18 10 4 0 3 5 7 8 10 11)
Best behaviors: (908 756 619 495 385 289 208 140 86 44 6 -18 -9 12 45 91 150 223 309 410 524)

-------------------------------------------------------
               Report for Generation 373
-------------------------------------------------------
Best plushy: (g/Num->0 exec_dup g/S->Plus g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/S->Num g/Num->0 g/S->Plus g/S->Divide g/S->Num g/S->x g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/S->x g/Num->0 g/S->x exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->Plus g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/Num->0 exec_dup (g/S->Plus g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/S->Num g/Num->0 g/S->Plus g/S->Divide g/S->Num g/S->x g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/S->x g/Num->0 g/S->x exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->Plus g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)))))))
Best total error: 111
Best errors: (12 11 9 8 7 5 4 2 0 1 8 12 8 6 4 2 1 1 2 3 5)
Best behaviors: (901 749 612 488 378 283 201 134 81 41 5 -12 -7 10 41 86 144 217 303 403 518)

-------------------------------------------------------
               Report for Generation 374
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Plus g/S->Num g/S->x g/S->x g/S->x g/Num->1 exec_dup exec_dup g/S->x g/Num->0 g/Num->1 g/Num->0 g/S->Num g/Num->1 g/S->Num g/S->Minus g/S->Plus g/S->Minus g/S->Times exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Plus g/S->Num g/S->x g/S->x g/S->x g/Num->1 exec_dup (exec_dup (g/S->x g/Num->0 g/Num->1 g/Num->0 g/S->Num g/Num->1 g/S->Num g/S->Minus g/S->Plus g/S->Minus g/S->Times exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Divide g/S->x g/S->Minus))))))
Best total error: 106
Best errors: (11 9 8 7 6 4 2 0 2 4 7 13 8 6 3 1 0 2 3 4 6)
Best behaviors: (902 751 613 489 379 284 203 136 83 44 6 -13 -7 10 42 87 145 218 304 404 519)

-------------------------------------------------------
               Report for Generation 375
-------------------------------------------------------
Best plushy: (g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/S->Num g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->1 g/S->x g/Num->0 g/S->x exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup exec_dup g/S->Plus g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/Num->0 g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/S->Num g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->1 g/S->x g/Num->0 g/S->x exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (exec_dup (g/S->Plus g/S->x g/S->Num g/Num->0 g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 99
Best errors: (10 9 8 6 5 4 2 1 0 1 8 10 8 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 613 490 380 284 203 135 81 39 5 -10 -7 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 376
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Plus g/S->Num g/S->x g/S->x g/S->x g/Num->1 exec_dup exec_dup g/S->x g/Num->0 g/Num->1 g/Num->0 g/S->Num g/Num->1 g/S->Num g/S->Minus g/S->Plus g/S->Minus g/S->Times exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Plus g/S->Num g/S->x g/S->x g/S->x g/Num->1 exec_dup (exec_dup (g/S->x g/Num->0 g/Num->1 g/Num->0 g/S->Num g/Num->1 g/S->Num g/S->Minus g/S->Plus g/S->Minus g/S->Times exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Divide g/S->x g/S->Minus))))))
Best total error: 106
Best errors: (11 9 8 7 6 4 2 0 2 4 7 13 8 6 3 1 0 2 3 4 6)
Best behaviors: (902 751 613 489 379 284 203 136 83 44 6 -13 -7 10 42 87 145 218 304 404 519)

-------------------------------------------------------
               Report for Generation 377
-------------------------------------------------------
Best plushy: (g/S->Minus g/Num->0 exec_dup g/S->Plus g/S->Num g/S->x g/S->x g/S->x g/Num->1 exec_dup exec_dup g/S->x g/Num->0 g/Num->1 g/Num->0 g/S->Num g/Num->1 g/S->Num g/S->Minus g/S->Plus g/S->Minus g/S->Times exec_dup g/S->Minus g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->Minus g/Num->0 exec_dup (g/S->Plus g/S->Num g/S->x g/S->x g/S->x g/Num->1 exec_dup (exec_dup (g/S->x g/Num->0 g/Num->1 g/Num->0 g/S->Num g/Num->1 g/S->Num g/S->Minus g/S->Plus g/S->Minus g/S->Times exec_dup (g/S->Minus g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Divide g/S->x g/S->Minus))))))
Best total error: 106
Best errors: (11 9 8 7 6 4 2 0 2 4 7 13 8 6 3 1 0 2 3 4 6)
Best behaviors: (902 751 613 489 379 284 203 136 83 44 6 -13 -7 10 42 87 145 218 304 404 519)

-------------------------------------------------------
               Report for Generation 378
-------------------------------------------------------
Best plushy: (g/Num->0 g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide g/Num->0 exec_dup g/S->Plus g/S->x g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/Num->0 g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide g/Num->0 exec_dup (g/S->Plus g/S->x g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 104
Best errors: (11 9 8 7 6 4 2 0 2 4 6 12 8 6 3 1 0 2 3 4 6)
Best behaviors: (902 751 613 489 379 284 203 136 83 44 7 -12 -7 10 42 87 145 218 304 404 519)

-------------------------------------------------------
               Report for Generation 379
-------------------------------------------------------
Best plushy: (g/Num->0 g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide g/Num->0 exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/Num->0 g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide g/Num->0 exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 380
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide g/Num->0 exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide g/Num->0 exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 381
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 382
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 383
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 384
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 385
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->1 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Minus g/Num->0)
Best program: (exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->1 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Minus g/Num->0))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 386
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 387
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/Num->0 g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/Num->1 g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Minus g/S->Plus g/S->Plus g/Num->0 g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/Num->1 g/S->Plus g/Num->0 g/Num->0 g/Num->1 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 388
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 389
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->0 g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->0 g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 390
-------------------------------------------------------
Best plushy: (exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 exec_dup g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 exec_dup (g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 391
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->0 g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->0 g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Minus))))))
Best total error: 93
Best errors: (10 9 7 6 5 3 2 0 1 1 6 9 7 5 2 0 1 3 4 5 7)
Best behaviors: (903 751 614 490 380 285 203 136 82 41 7 -9 -6 11 43 88 146 219 305 405 520)

-------------------------------------------------------
               Report for Generation 392
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 100
Best errors: (11 10 8 7 6 5 3 1 0 1 7 10 7 5 3 1 0 2 3 4 6)
Best behaviors: (902 750 613 489 379 283 202 135 81 39 6 -10 -6 11 42 87 145 218 304 404 519)

-------------------------------------------------------
               Report for Generation 393
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup g/Num->1 g/Num->0 g/Num->1 g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/Num->1 g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Times g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 100
Best errors: (11 10 8 7 6 5 3 1 0 1 7 10 7 5 3 1 0 2 3 4 6)
Best behaviors: (902 750 613 489 379 283 202 135 81 39 6 -10 -6 11 42 87 145 218 304 404 519)

-------------------------------------------------------
               Report for Generation 394
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 85
Best errors: (2 1 1 1 1 1 1 1 1 2 7 13 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -13 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 395
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus g/Num->0 g/Num->0 exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 85
Best errors: (2 1 1 1 1 1 1 1 1 2 7 13 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -13 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 396
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 85
Best errors: (2 1 1 1 1 1 1 1 1 2 7 13 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -13 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 397
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 85
Best errors: (2 1 1 1 1 1 1 1 1 2 7 13 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -13 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 398
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 85
Best errors: (2 1 1 1 1 1 1 1 1 2 7 13 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -13 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 399
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 85
Best errors: (2 1 1 1 1 1 1 1 1 2 7 13 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -13 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 400
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 85
Best errors: (2 1 1 1 1 1 1 1 1 2 7 13 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -13 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 401
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/S->x g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 85
Best errors: (2 1 1 1 1 1 1 1 1 2 7 13 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -13 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 402
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/Num->1 g/S->x g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Plus g/S->Num g/Num->1 g/Num->1 g/S->x g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 84
Best errors: (2 1 1 1 1 1 1 1 1 2 7 12 10 8 7 6 5 5 4 4 4)
Best behaviors: (911 759 620 495 384 287 204 135 80 38 6 -12 -9 8 38 82 140 211 297 396 509)

-------------------------------------------------------
               Report for Generation 403
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 404
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 405
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 406
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/Num->0 g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/Num->1 g/S->x g/S->x g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/Num->0 g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/Num->1 g/S->x g/S->x g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 407
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Minus g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 408
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 409
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/Num->1 g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 410
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 411
-------------------------------------------------------
Best plushy: (g/S->Num g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/S->Num g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 412
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/Num->0 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/Num->0 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 413
-------------------------------------------------------
Best plushy: (g/S->Minus exec_dup g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus)
Best program: (g/S->Minus exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->0 g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus))))))
Best total error: 66
Best errors: (0 0 0 0 0 0 0 0 0 2 7 11 9 8 6 5 4 4 4 3 3)
Best behaviors: (913 760 621 496 385 288 205 136 81 38 6 -11 -8 8 39 83 141 212 297 397 510)

-------------------------------------------------------
               Report for Generation 414
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 415
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 416
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 417
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 418
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 419
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 420
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/S->x g/S->x g/S->x g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 421
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus g/Num->0 exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus g/Num->0 exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 422
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 423
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus g/Num->0 exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus g/Num->0 exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 424
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Plus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/Num->0 g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 425
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 426
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 427
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 428
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 429
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 430
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 431
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 432
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 433
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Minus g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/S->Num g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Minus g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/Num->0 g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 434
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Plus g/S->Minus g/S->x g/S->Num g/Num->0 g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/Num->0 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/Num->1 g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Plus g/S->Minus g/S->x g/S->Num g/Num->0 g/S->Plus g/Num->0 g/S->Num g/Num->1 g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/Num->1 g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/Num->0 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/Num->1 g/Num->0 g/S->x g/Num->0 g/Num->0 g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 435
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 436
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 437
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 438
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 439
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 440
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 441
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 442
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 443
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 444
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 445
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 64
Best errors: (1 0 0 0 0 0 0 0 0 1 6 12 9 7 6 5 4 4 3 3 3)
Best behaviors: (912 760 621 496 385 288 205 136 81 39 7 -12 -8 9 39 83 141 212 298 397 510)

-------------------------------------------------------
               Report for Generation 446
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 62
Best errors: (0 1 1 1 1 1 1 1 1 0 6 12 9 6 5 4 3 3 2 2 2)
Best behaviors: (913 761 622 497 386 289 206 137 82 40 7 -12 -8 10 40 84 142 213 299 398 511)

-------------------------------------------------------
               Report for Generation 447
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 62
Best errors: (0 1 1 1 1 1 1 1 1 0 6 12 9 6 5 4 3 3 2 2 2)
Best behaviors: (913 761 622 497 386 289 206 137 82 40 7 -12 -8 10 40 84 142 213 299 398 511)

-------------------------------------------------------
               Report for Generation 448
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 62
Best errors: (0 1 1 1 1 1 1 1 1 0 6 12 9 6 5 4 3 3 2 2 2)
Best behaviors: (913 761 622 497 386 289 206 137 82 40 7 -12 -8 10 40 84 142 213 299 398 511)

-------------------------------------------------------
               Report for Generation 449
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 450
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 451
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 452
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->Num g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->Num g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 1 1 1 1 1 2 4 8 11 9 6 4 3 2 2 2 1 1)
Best behaviors: (913 760 621 495 384 287 204 135 79 36 5 -11 -8 10 41 85 143 214 299 399 512)

-------------------------------------------------------
               Report for Generation 453
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 454
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 455
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->Divide g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/Num->1 g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->Divide g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/Num->1 g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 456
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 457
-------------------------------------------------------
Best plushy: (g/S->x g/Num->0 g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/Num->1 g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/Num->0 g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/Num->1 g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 458
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 459
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 460
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->x g/S->x exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->x g/S->x exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 461
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/Num->1 g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus exec_dup)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/Num->1 g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus exec_dup ()))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 462
-------------------------------------------------------
Best plushy: (g/S->x g/S->x g/S->Num exec_dup g/S->Times g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus g/Num->1 exec_dup g/S->Minus g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->x g/S->Num exec_dup (g/S->Times g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus g/Num->1 exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 463
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 464
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 465
-------------------------------------------------------
Best plushy: (g/S->x g/Num->1 g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/S->Num g/Num->0 g/S->Times g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/Num->1 g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/S->Num g/Num->0 g/S->Times g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 466
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/Num->0 g/S->Minus g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 467
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 468
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 469
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 470
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/Num->1)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/Num->1))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 471
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 472
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 473
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 474
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 475
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 476
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 477
-------------------------------------------------------
Best plushy: (g/S->x g/S->Minus g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->Minus g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 478
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/Num->1 g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 479
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 480
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 481
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 482
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 483
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 484
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 485
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 486
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 487
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus g/Num->1)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus g/Num->1))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 488
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 489
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 490
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 491
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/S->Minus g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/S->Minus g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 492
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 493
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 494
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 495
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 496
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 497
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 498
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 499
-------------------------------------------------------
Best plushy: (g/Num->0 g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus)
Best program: (g/Num->0 g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/S->Plus g/Num->1 g/S->Minus g/S->x g/S->Minus g/S->Plus))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)

-------------------------------------------------------
               Report for Generation 500
-------------------------------------------------------
Best plushy: (g/S->x g/S->x exec_dup g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/S->x g/S->Minus g/S->Minus g/S->Plus exec_dup)
Best program: (g/S->x g/S->x exec_dup (g/S->Times g/S->Minus g/S->x g/S->Num g/S->Plus g/S->Num g/Num->1 g/S->Plus exec_dup (g/Num->1 g/Num->1 g/Num->1 g/Num->1 g/S->x g/S->Minus g/Num->1 g/S->x g/S->x g/S->x g/Num->1 g/S->Minus g/Num->0 g/S->Divide exec_dup (g/S->Plus g/S->x g/Num->0 g/Num->1 g/Num->1 g/S->Num g/S->Minus exec_dup (g/S->Minus g/Num->0 g/S->x g/S->x g/Num->0 exec_dup (g/S->Times g/Num->1 g/S->Plus g/S->Divide g/S->Plus g/S->Plus g/S->Minus g/S->x g/S->Minus g/S->Minus g/S->Plus exec_dup ()))))))
Best total error: 60
Best errors: (0 0 0 0 0 0 0 0 1 3 8 10 9 7 5 4 3 3 3 2 2)
Best behaviors: (913 760 621 496 385 288 205 136 80 37 5 -10 -8 9 40 84 142 213 298 398 511)
```
