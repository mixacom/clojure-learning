(ns lesson-march)

(let [x [1 2 3 4]
      y [:a :b :c]
      digits [1 2 3 4 5 6 7 8 9]
      size (mapv str digits)
      pp (println size)]
  
  [x y digits size pp])

(def x [1 2 3 4])
(def y [:a :b :c])

(let [x1 1 x2 2 x3 3] 
  (+ x1 x2 x3) 
  )

(let [x1 1 x2 2 x3 3]
  [(* x1 x1) (Math/pow x2 2) (* x3 x3)]
  ) 


(mapv #(let [x %] [x (* x x)] ) (range 10 35))

(mapv #(let [x %] {x (* x x)}) (range 10 35)) 

(mapv #(Math/pow % 2) (filter even? (range 10 35)) ) 
