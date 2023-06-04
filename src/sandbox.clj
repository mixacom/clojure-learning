(ns sandbox)

(def myHobby [{:hobby "smotret televizor" :skill-level "9.5"}
              {:hobby "chetat" :skill-level "9.5"}
              {:school "istoriya" :skill-level "9.5"}
              {:hobby "igratj" :skill-level "8.5"}])

(map (fn [a]
       (+ 10 a)) [1 2 3])

(mapv (fn [a]
        [a (+ 10 a)]) [1 2 3])

(map last
     [[1 11] [2 12] [3 13]])

(mapv (fn [a]
        (hash-map a (+ 10 a))) [1 2 3 4])

(def hobby1 {:hobby "smotret televizor"
             :skill-level "9.5"})
(def hobby2 {:hobby "chetat"
             :skill-level "9.5"})
(def Shobbl1 {:school "istoriya"
              :skill-level "9.5"})
(def hobby34 {:hobby "igratj"
              :skill-level "8.5"})
(def Shobbl2
  [hobby1 hobby2 Shobbl1 hobby34])
:hobby hobby1
(map str [1 2 3 4 5])
(map print [1 2 3 4 5])
(map println [1 2 3 4 5])









(map count myHobby)

(defn myKey [myMap]
  (assoc myMap :name "Ivan"))

(map myKey myHobby)

(defn twoKeys [myMap]
  (assoc myMap :name "Ivan" :currentDate "22.01"))

(map twoKeys myHobby)
