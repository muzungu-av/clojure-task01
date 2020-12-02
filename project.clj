(defproject csvdb "0.1.0-SNAPSHOT"
  :description "The application is a simple file database"
  :url "https://github.com/muzungu-av/clojure-task01-csvdb"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clojure-csv "2.0.1"]]
  :repl-options {:init-ns csvdb.core}
  :resource-paths ["resources"]
  :plugins [[lein-cloverage "1.0.7-SNAPSHOT"]])
