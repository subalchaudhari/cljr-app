(ns cljr.lang.lr.looping)

(defn sample-loop-1
  "sample function for looping"
  []
  (loop [result [] x 5]
    (if (zero? x)
      result
      (recur (conj result x) (dec x)))))

(defn sample-loop-2
  "sample function for looping"
  []
  (loop [result [] x 1]
    (if-not (> x 10)
      (do
        ;;(print x " ")
        (recur (conj result x) (inc x)))
      result)))

(defn countdown [result x]
  (if (zero? x)
    result
    (recur (conj result x) (dec x))))

