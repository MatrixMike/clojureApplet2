;; http://juliangamble.com/blog/2011/11/27/applets-in-clojure-and-counterclockwise/

(ns game.applet.SimpleSwingAppletRunner
  (:import
        (javax.swing JApplet JPanel JLabel JFrame)))
 
;------
(compile 'game.applet.SimpleSwingApplet)
 
(defn -main [s]
  (let [applet (new demo.applet.SimpleSwingApplet)]
    (doto (JFrame. "MyApplet")
      (.add (.getContentPane applet))
      (.pack)
      (.setLocationByPlatform true)
      (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
      (.setVisible true))     
    ))
 
(-main "s")
(ns game.applet.SimpleSwingAppletRunner
  (:import
        (javax.swing JApplet JPanel JLabel JFrame)))
 
;------
(compile 'game.applet.SimpleSwingApplet)
 
(defn -main [s]
  (let [applet (new demo.applet.SimpleSwingApplet)]
    (doto (JFrame. "MyApplet")
      (.add (.getContentPane applet))
      (.pack)
      (.setLocationByPlatform true)
      (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
      (.setVisible true))     
    ))
 
(-main "s")
