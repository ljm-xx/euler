(ns euler.level1.problem003)

(defn prime-factors [n]
  (loop [n n, div 2, primes []]
    (cond (= n 1) primes
          (zero? (rem n div)) (recur (/ n div) div (conj primes div))
          :else (recur n (inc div) primes))))

(defn euler-3 [n]
  (apply max (prime-factors n)))
