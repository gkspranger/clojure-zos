(defproject hello "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot hello.core
  :target-path "target/%s"
  :profiles {:uberjar
             {:aot :all
              :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :provided
             {:dependencies [[com.ibm.jzos/ibmjzos "2.4.11.2"]]}})
