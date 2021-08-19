(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "finds multiples of 3 or 5 below n"
    (should= [] (mult-of-three-or-five 1))
    (should= [] (mult-of-three-or-five 3))
    (should= [3] (mult-of-three-or-five 5))
    (should= [3 5] (mult-of-three-or-five 6))
    (should= [3 5 6] (mult-of-three-or-five 9))
    (should= [3 5 6 9] (mult-of-three-or-five 10)))


  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 78 (euler-1 20))
    (should= 233168 (euler-1 1000)) ;; too complicated right now

    )
  )

(run-specs)
