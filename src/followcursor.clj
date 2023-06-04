(ns followcursor (:require [quil.core :as q]))

(defn draw []  
  (q/color-mode :rgb 30 30 30)
  (q/background 250)

  (q/fill (mod (q/frame-count) 255) 255 125) 

  (q/with-fill [212 25 30]
    (q/rect 30 30 75 75)
    (q/rect 81 81 101 101)
  )

  (let [x (q/mouse-x)
        y (q/mouse-y)
        width (q/width)
        height (q/height)
        middle_x (/ width 2)
        middle_y (/ height 2)
        x_less (- x 20)
        y_less (- y 20)
        x_more (+ x 126)
        y_more (+ y 126)] 
     
    (q/stroke 0) (q/stroke-weight 10) (q/point middle_x middle_y)

    (if (even? x)
      (q/stroke 305, 100, 50)
      (q/stroke 189, 100, 50))
    (q/stroke-weight 2) (q/line x y x_more y_more) 
 
    ;; (q/stroke-weight 2) (q/line x y x_less y_more)
    ;; (q/stroke-weight 2) (q/line x y x_more y_more) 

    (q/stroke 0) (q/stroke-weight 10) (q/point x y) 

    (q/text-font (q/create-font "consolas", 16))
    (q/text (str "x: " x ", y: " y) (- width 200) 25))) 
  
(q/defsketch mydrawssystem
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw draw)  
  


(defn draw []
  (q/color-mode :rgb 30 30 30)
  (q/background 250)

  (q/fill 216 216 237)
  (mapv (fn [x] (q/rotate q/PI) (q/rect x 30 97 97))
    (range 10 190 15)
  )) 
   
 
(q/defsketch mydrawssystem
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw draw)
  