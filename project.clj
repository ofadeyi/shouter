(defproject shouter "0.1.0-SNAPSHOT"
  :description "Tutorial: Building a Database-Backed Clojure Web Application"
  :url "https://devcenter.heroku.com/articles/clojure-web-application"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/java.jdbc "0.7.0-alpha2"]
                 [org.postgresql/postgresql "42.0.0"]
                 [compojure "1.5.2"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [hiccup "1.0.5"]
                 [ring/ring-defaults "0.2.3"]]

  :main ^:skip-aot shouter.web
  :uberjar-name "shouter-standalone.jar"
  :plugins [[lein-ring "0.11.0"]]
  :ring {:handler shouter.web/application
         :init shouter.models.migration/migrate}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring-mock "0.1.5"]]}
             :uberjar {:aot :all}})
