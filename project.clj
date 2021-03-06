(defproject org.clojure/math.combinatorics "0.1.2-SNAPSHOT"
  :description ""
  :url "https://github.com/clojure/math.combinatorics"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :global-vars {*warn-on-reflection* true}
  :monkeypatch-clojure-test false
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/core.typed "0.3.33-SNAPSHOT"]
                 [org.clojure/test.check "0.9.0"]
                 ]
  :injections [(require 'clojure.core.typed)
               (clojure.core.typed/install
                 #{:load})]
  :repl-options {:timeout 3000000})
