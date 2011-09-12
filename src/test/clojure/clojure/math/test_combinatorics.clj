(ns clojure.math.test-combinatorics
  (:use clojure.test
        clojure.math.combinatorics))

(deftest test-combinations
  (are [x y] (= x y)
       (combinations [1 2 3] 2) '((1 2) (1 3) (2 3))))

(deftest test-subsets
  (are [x y] (= x y)
       (subsets [1 2 3]) '(() (1) (2) (3) (1 2) (1 3) (2 3) (1 2 3))))

(deftest test-cartesian-product
  (are [x y] (= x y)
       (cartesian-product [1 2] [3 4]) '((1 3) (1 4) (2 3) (2 4))))

(deftest test-selections
  (are [x y] (= x y)
       (selections [1 2] 3) '((1 1 1) (1 1 2) (1 2 1) (1 2 2) (2 1 1) (2 1 2) (2 2 1) (2 2 2))))

(deftest test-permutations
  (are [x y] (= x y)
       (permutations [1 2 3]) '((1 2 3) (1 3 2) (2 1 3) (2 3 1) (3 1 2) (3 2 1))))

(deftest tes-lex-permutations
  (are [x y] (= x y)
       (lex-permutations [1 1 2]) '([1 1 2] [1 2 1] [2 1 1])))