(defproject io.github.dfrugg/aws-cdk-clojure "2.144.0-beta2"
  :description "AWS CDK support library for clojure."
  :url "https://github.com/dfrugg/aws-cdk-clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}

  :test-paths ["test/clj"]

  :dependencies [[org.clojure/clojure "1.11.3"]
                 [environ "1.2.0"]
                 [software.amazon.awscdk/aws-cdk-lib "2.144.0"]]


  :repl-options {:init-ns main}

  :profiles {:repl {:resource-paths ["gen/resources"]
                    :source-paths ["gen/clj"]
                    :dependencies [[org.reflections/reflections "0.9.11"]
                                   [javax.servlet/servlet-api "2.5"]]}
             :test {:resource-paths ["test/resources"]}})
