(ns previous (:require [quil.core :as q])) 

(defn draw []
  (q/background 255)
  (q/fill 0)
  (q/text  (str "x" (q/mouse-x)) 150 120)
  (q/text  (str "y" (q/mouse-y)) 185 120)) 
(q/defsketch mydrawssystem
;;   :host "host"
  :size [900 900]
  :feature [:keep-on-top :resizable]
  :draw draw)

(defn draw []
  (q/background 255)
  (q/image "C:\\Users\\pavel\\CODE\\CAT.jpeg" (q/mouse-x) (q/mouse-y) 100 100)
  ;; (+ (q/mouse-x) 50) (q/mouse-y)
  ;; (+ 25 (q/mouse-x)) (+ -50 (q/mouse-y ))
  ) 
(q/defsketch mydrawssystem
;;   :host "host"
  :size [900 900]
  :feature [:keep-on-top :resizable]
  :draw draw)

(defn draw []
  (q/background 255)
  (let [im (q/state :image)]
    (when (q/loaded? im) (q/image im (q/mouse-x) (q/mouse-y) 100 100))))
(q/defsketch mydrawssystem
;;   :host "host"
  :size [900 900]
  :draw draw)

(defn draw []
  (q/fill (q/mouse-x) (q/mouse-x) (q/mouse-y))
  (q/text (str "x" (q/mouse-x) "y" (q/mouse-y)) (q/mouse-x) (q/mouse-y)))
(q/defsketch mydrawssystem
;;   :host "host"
  :size [900 900]
  :feature [:keep-on-top :resizable]
  :draw draw)
    