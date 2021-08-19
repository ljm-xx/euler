(ns euler.level1.problem001)

(defn mult-of-three-or-five [n]
  (filter #(or (zero? (rem % 3)) (zero? (rem % 5))) (range 1 n)))


(defn euler-1 [n]
  (reduce + (mult-of-three-or-five n)))

