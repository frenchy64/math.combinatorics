(defproject org.clojure/math.combinatorics "0.1.5-SNAPSHOT"
  :description ""
  :url "https://github.com/clojure/math.combinatorics"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :global-vars {*warn-on-reflection* true}
  :monkeypatch-clojure-test false
  :dependencies [[org.clojure/clojure "1.9.0-beta2"]
                 [org.clojure/core.typed "0.4.2-SNAPSHOT"
                  :exclusions [org.clojure/math.combinatorics]]
                 [org.clojure/test.check "0.9.0"]
                 ]
  :repl-options {:timeout 3000000})
