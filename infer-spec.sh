#!/bin/sh

lein typed infer-spec clojure.math.combinatorics :test-timeout-ms 1000
