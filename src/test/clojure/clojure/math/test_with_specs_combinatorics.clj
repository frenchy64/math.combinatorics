(ns clojure.math.test-with-specs-combinatorics
  (:require [clojure.math.infer-combinatorics :as i]
            [clojure.math.test-combinatorics :as t]
            [clojure.math.combinatorics :as c]
            [clojure.test :as test]))

(println "Activated specs:\n" (t/activate-specs))
(println "To prove specs are actually enabled, here is a bad call to (subsets 1)")
(println
  (try (c/subsets 1)
       (catch Throwable e e)))

(prn "The above lines should show a spec error from a bad call to (subsets 1)")

(test/run-tests 'clojure.math.test-combinatorics)

