(ns drawing (:require [quil.core :as q]))

(defn draw []
  (q/background 221)

  (q/fill 1 222 111)

  (q/rect 70 70 100 100)
  (q/fill  255 11 255)
  (q/rect 140 140 100 100)

  ; semitransparent cyan
  (q/fill  10 255 255 120)
  (q/rect 210 210 100 100)

  (q/line 20 400 300 400)
  (q/line 400 100 400 400)

  (q/fill 255)
  (q/ellipse 500 400 100 200)
  (q/triangle 200 500 300 600 400 500)

  (q/fill 1 222 111)
  (q/text "Hey, hey, hey!" 544 544))

(q/defsketch my
  :size [700 700]
  :features [:keep-on-top :resizable]
  :draw draw)

(defn drawingsystem []
  (q/background 200)
  (q/fill 120 50 200)
  (q/triangle 400 200 500 100 400 0))

(defn drawingsystem []
  (q/background 190)
  (q/fill 120 50 200)
  (q/line 0 0 500 500))

(mapv (fn [x]
        (q/triangle 200 250 300 350 400 450)) (range 10 400 50))
;;          30  100  50    80
;;           x   y  width heigt
;; the evalueting of a drawing can only be in drawingsystem

;; call it when the drawing system is defined with rules 
(q/defsketch mydrawssystem
;;   :host "host"
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw drawingsystem) 

(defn drawImage [position]   
  (q/background 221)
  (q/fill 1 222 111)
  (q/text "Hey, hey, hey!" position position)) 

(q/defsketch mydrawssystem
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw draw)  
    
(mapv (fn [x]        
        (q/background 221)
        (q/fill 1 222 111)
        (q/text "Hey, hey, hey!" x x) 
        ) [(range 10 500 20)]
      ) 

(q/defsketch my
  :size [700 700]
  :features [:keep-on-top :resizable]
  :draw drawImage) 
  
(defn draw []
  (mapv (fn [x] (q/text "hey" x x)) (range 10 500 20))
  (q/fill 1 222 111))
  
(q/defsketch mydrawssystem
;;   :host "host"
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw draw)


(defn draw2 []
  (mapv (fn [x]
          (q/fill 120)
          (q/text (str x ", " x) x x))
        (range 10 500 20)))   
  
(q/defsketch mydrawssystem
;;   :host "host"
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw draw2)  

(defn draw []
  (q/fill 120)
  (mapv (fn [x]
   #_x  (q/point (+ 97 x)  (* x x)))
        (range -100 100 1)))
 
(q/defsketch mydrawssystem
;;   :host "host"
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw draw) 


 
(defn draw []
  (q/fill 1 222 111)
  (q/stroke-weight 3)
  (mapv (fn [x] 
          (q/point (+ 97 x) (+ Math/sin x 174))) 
        (range -100 100 1))  
  )
   
(q/defsketch mydrawssystem
;;   :host "host"
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw draw)

(defn draw [] (mapv (fn [x w h] (q/rect x x w h)) (range 10 500 20) (range 10 500 20) (range 20 400 20))   (q/fill 1 222 111))
  
(q/defsketch mydrawssystem
;;   :host "host"
  :size [700 700]
  :feature [:keep-on-top :resizable]
  :draw draw)


