(ns advent2017.core
  (:require [clojure.edn :refer [read-string]]))

(defn captcha [s shift]
  (let [rotated (concat (drop shift s) (take shift s))
        digits (map
                 (fn [x y]
                   (if (= x y)
                     (read-string (str x))
                     0))
                 s
                 rotated)]
    (apply + digits)))

(defn d01 [s]
  (captcha s 1))

(defn d01-2 [s]
  (captcha s (/ (count s) 2)))
