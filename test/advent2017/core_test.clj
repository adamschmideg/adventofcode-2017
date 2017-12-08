(ns advent2017.core-test
  (:require [clojure.test :refer :all]
            [advent2017.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest d01
  (are [in out] (= (captcha in) out)
    "1122" 3
    "1111" 4
    "1234" 0
    "91212129" 9))

(run-tests)
