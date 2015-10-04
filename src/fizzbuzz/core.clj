(ns fizzbuzz.core)

(defn by3? [num] (= 0 (mod num 3)))

(defn by5? [num] (= 0 (mod num 5)))

(defn by3and5? [num] (and (by3? num) (by5? num)))

(defn fizzbuzz
  "the fizzbuzz program under 30 min"
  [stopnum]
   (loop [thelist `() counter stopnum]
      (cond
         (= counter 0) thelist
         (by3and5? counter)
                 (recur (conj thelist :fizzbuzz)
                    (dec counter))
         (by3? counter)
                 (recur (conj thelist :fizz)
                    (dec counter))
         (by5? counter)
                 (recur (conj thelist :buzz)
                    (dec counter))
         :else
                 (recur (conj thelist counter)
                    (dec counter)))))
