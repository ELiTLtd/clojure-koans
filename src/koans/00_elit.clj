(ns koans.00-elit
  (:require [koan-engine.core :refer :all]))

(defn square [n] (* n n))

(meditations
 "You can combine and nest expressions for evaluation"
 (= (+ 3 4) 7 (+ 2 __))

 "Keywords can be used as functions to do map lookups"
 (= __ (:a {:a 1 :b 2}))

 "Conditionals can be very terse"
 (= __ (if (false? (= 4 5))
         :a
         :b))

 "Calling a function is like giving it a hug with parentheses"
 (= __ (square 9))

 "The map function relates a sequence to another"
 (= [__ __ __] (map (fn [x] (* 4 x)) [1 2 3]))

 "Reducing can accumulate a result"
 (= __ (reduce (fn [a b] (* a b)) [1 2 3 4])))
