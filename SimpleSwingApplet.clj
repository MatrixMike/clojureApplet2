;; http://juliangamble.com/blog/2011/11/27/applets-in-clojure-and-counterclockwise/

(ns demo.applet.SimpleSwingApplet
      (:import
        (javax.swing JApplet JPanel JLabel JFrame))
      (:gen-class
        :post-init post-init
        :extends javax.swing.JApplet))
 
(defn -post-init [this]
  (def jpanel (JPanel.))
  (.add jpanel (JLabel. "This is my first applet"))
  (.setContentPane this jpanel))
  
  
