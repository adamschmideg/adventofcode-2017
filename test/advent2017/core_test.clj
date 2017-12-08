(ns advent2017.core-test
  (:require [clojure.test :refer :all]
            [advent2017.core :refer :all]))

(deftest d01-test
  (are [in out] (= (d01 in) out)
    "1122" 3
    "1111" 4
    "1234" 0
    "91212129" 9))

(deftest d01-2-test
  (are [in out] (= (d01-2 in) out)
    "1212" 6
    "1221" 0
    "123425" 4
    "123123" 12
    "12131415" 4))

(run-tests)
