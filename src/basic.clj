(+ 1 1)                                                     ;2
(mod 5 4)                                                   ;1
(/ (/ 24 2) (* 2 2))                                        ;3
(* 5 4 3 2 1)                                               ;120

(str "one: " 1 " two: " 2)                                  ;"one: 1 two: 2"

(= \a "a")                                                  ;false
(= (str \a) "a")                                            ;true

(= 1 1)                                                     ;true
(class (= 1 1))                                             ;java.lang.Boolean

(defn doubler
  [value]
  (* value 2))                                              ;a function to double a value

(doubler 4)                                                 ;8


(defn factorial
  [n]
  (if (= n 0)
    1
    (* n (factorial (- n 1)))))

