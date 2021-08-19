(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "fib-finder"
  (it "finds the value of the nth term in the Fibonacci Sequence"
    ; 1 1 2 3 5 8 13 21 34 55 89
    (should= 1 (fib-finder 1))
    (should= 1 (fib-finder 2))
    (should= 2 (fib-finder 3))
    (should= 3 (fib-finder 4))
    ))

(describe "Euler Problem #2"

  (it "Solves #2"
    (should= -1 (euler-2 -1)))
  )

(run-specs)
