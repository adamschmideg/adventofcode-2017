(ns advent2017.core
  (:require [clojure.edn :refer [read-string]]))

(defn captcha [s]
  (let [rotated (conj (butlast s) (last s))
        digits (map
                 (fn [x y]
                   (if (= x y)
                     (read-string (str x))
                     0))
                 s
                 rotated)]
    (apply + digits)))


