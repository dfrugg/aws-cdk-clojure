(defproject io.github.dfrugg/aws-cdk-clojure "2.144.0-beta0"
  :description "AWS CDK support library for clojure."
  :url "https://github.com/dfrugg/aws-cdk-clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}

  :test-paths ["test/clj"]

  :dependencies [[org.clojure/clojure "1.11.3"]
                 [environ "1.2.0"]

                 ; Since aws-cdk-lib uses ranges for it's transitives, we are going to eliminate that version guessing
                 ; and take the latest available with least issues.
                 [javax.annotation/javax.annotation-api "1.3.2"]
                 [org.jetbrains/annotations "20.0.0"]
                 [com.fasterxml.jackson.core/jackson-core "2.14.3"]
                 [com.fasterxml.jackson.core/jackson-databind "2.14.3"]
                 [com.fasterxml.jackson.datatype/jackson-datatype-jsr310 "2.14.3"]

                 [software.amazon.jsii/jsii-runtime "1.99.0" :exclusions [javax.annotation/javax.annotation-api
                                                                          org.jetbrains/annotations
                                                                          com.fasterxml.jackson.core/jackson-core
                                                                          com.fasterxml.jackson.core/jackson-databind
                                                                          com.fasterxml.jackson.datatype/jackson-datatype-jsr310]]

                 [software.amazon.awscdk/cdk-asset-awscli-v1 "2.2.202" :exclusions [javax.annotation/javax.annotation-api
                                                                                    org.jetbrains/annotations
                                                                                    software.amazon.jsii/jsii-runtime]]

                 [software.amazon.awscdk/cdk-asset-kubectl-v20 "2.1.2" :exclusions [javax.annotation/javax.annotation-api
                                                                                    org.jetbrains/annotations
                                                                                    software.amazon.jsii/jsii-runtime]]

                 [software.amazon.awscdk/cdk-asset-node-proxy-agent-v6 "2.0.3" :exclusions [javax.annotation/javax.annotation-api
                                                                                            org.jetbrains/annotations
                                                                                            software.amazon.jsii/jsii-runtime]]

                 [software.constructs/constructs "10.3.0" :exclusions [javax.annotation/javax.annotation-api
                                                                       org.jetbrains/annotations
                                                                       software.amazon.jsii/jsii-runtime]]

                 [software.amazon.awscdk/aws-cdk-lib "2.144.0" :exclusions [javax.annotation/javax.annotation-api
                                                                            org.jetbrains/annotations
                                                                            software.amazon.awscdk/cdk-asset-awscli-v1
                                                                            software.amazon.awscdk/cdk-asset-kubectl-v20
                                                                            software.amazon.awscdk/cdk-asset-node-proxy-agent-v6
                                                                            software.amazon.jsii/jsii-runtime
                                                                            software.constructs/constructs]]]


  :repl-options {:init-ns main}

  :profiles {:repl {:resource-paths ["gen/resources"]
                    :source-paths ["gen/clj"]
                    :dependencies [[org.reflections/reflections "0.9.11"]
                                   [javax.servlet/servlet-api "2.5"]]}
             :test {:resource-paths ["test/resources"]}})
