(defproject ring-middleware-format "0.3.0-SNAPSHOT"
  :description "Ring middleware for parsing parameters and emitting
  responses in various formats."
  :url "https://github.com/ngrunwald/ring-middleware-format"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/core.memoize "0.5.2"]
                 [ring "1.1.5"]
                 [cheshire "4.0.2"]
                 [com.ibm.icu/icu4j "4.8.1.1"]
                 [clj-yaml "0.4.0"]])
