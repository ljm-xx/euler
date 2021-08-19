(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "prime-factors"

  (it "finds prime factors of n"
    (should= [] (prime-factors 1))
    (should= [2] (prime-factors 2))
    (should= [3] (prime-factors 3))
    (should= [2 2] (prime-factors 4))
    (should= [5] (prime-factors 5))
    (should= [2 3] (prime-factors 6))
    (should= [7] (prime-factors 7))
    (should= [2 2 2] (prime-factors 8))
    (should= [3 3] (prime-factors 9))
    (should= [71 839 1471 6857] (prime-factors 600851475143)))

  (it "euler-3"
    (should= 2 (euler-3 2))
    (should= 3 (euler-3 3))
    (should= 3 (euler-3 6))
    (should= 6857 (euler-3 600851475143)))


  )


(run-specs)
