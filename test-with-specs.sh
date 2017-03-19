#!/bin/sh

echo 'Disabling :lang on clojure.math.combinatorics\n'
perl -pi -e 's/:lang :core.typed/;:lang :core.typed/g' src/main/clojure/clojure/math/combinatorics.clj
lein test :only clojure.math.test-with-specs-combinatorics
perl -pi -e 's/;:lang :core.typed/:lang :core.typed/g' src/main/clojure/clojure/math/combinatorics.clj
