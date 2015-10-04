(ns fizzbuzz.core-test
  (:require [fizzbuzz.core :refer :all]
            [expectations :refer :all]))


(expect '() (fizzbuzz 0))

(expect '(1 2) (fizzbuzz 2))

(expect '(1 2 :fizz) (fizzbuzz 3))

(expect '(1 2 :fizz 4 :buzz) (fizzbuzz 5))

(expect '(1 2 :fizz 4 :buzz :fizz 7 8 :fizz :buzz 11 :fizz 13 14 :fizzbuzz) (fizzbuzz 15))
