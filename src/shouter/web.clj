(ns shouter.web
  (:require [compojure.core :refer [defroutes GET]]
            [ring.adapter.jetty :as ring]
            [hiccup.page :as page]))

;; Defining an index function using hiccup
(defn index []
  (page/html5
    [:head
     [:title "Hello World"]]
    [:body
     [:div {:id "content"} "Hello World"]]))

;; Defining a simple compojure route
(defroutes routes
           (GET "/" [] (index)))

(defn -main []
  (ring/run-jetty #'routes {:port 8080 :join? false}))