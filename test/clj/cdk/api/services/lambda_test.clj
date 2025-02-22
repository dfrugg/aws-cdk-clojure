(ns cdk.api.services.lambda-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda package. "
  (:require [cdk.api.services.lambda :refer [adot-lambda-exec-wrapper
                                             application-log-level
                                             destination-type
                                             function-url-auth-type
                                             http-method
                                             invoke-mode
                                             log-format
                                             logging-format
                                             params-and-secrets-log-level
                                             params-and-secrets-versions
                                             runtime-family
                                             starting-position
                                             system-log-level
                                             tracing
                                             untrusted-artifact-on-deployment]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.lambda AdotLambdaExecWrapper
                                                   ApplicationLogLevel
                                                   DestinationType
                                                   FunctionUrlAuthType
                                                   HttpMethod
                                                   InvokeMode
                                                   LogFormat
                                                   LoggingFormat
                                                   ParamsAndSecretsLogLevel
                                                   ParamsAndSecretsVersions
                                                   RuntimeFamily
                                                   StartingPosition
                                                   SystemLogLevel
                                                   Tracing
                                                   UntrustedArtifactOnDeployment]))


(deftest adot-lambda-exec-wrapper-test
  (testing "Testing enum function adot-lambda-exec-wrapper"
    (is (= AdotLambdaExecWrapper/REGULAR_HANDLER (adot-lambda-exec-wrapper {:item AdotLambdaExecWrapper/REGULAR_HANDLER} "test" :item)))
    (is (= AdotLambdaExecWrapper/REGULAR_HANDLER (adot-lambda-exec-wrapper {:test/item AdotLambdaExecWrapper/REGULAR_HANDLER} "test" :item)))
    (is (= AdotLambdaExecWrapper/STREAM_HANDLER (adot-lambda-exec-wrapper {:item AdotLambdaExecWrapper/STREAM_HANDLER} "test" :item)))
    (is (= AdotLambdaExecWrapper/STREAM_HANDLER (adot-lambda-exec-wrapper {:test/item AdotLambdaExecWrapper/STREAM_HANDLER} "test" :item)))
    (is (= AdotLambdaExecWrapper/PROXY_HANDLER (adot-lambda-exec-wrapper {:item AdotLambdaExecWrapper/PROXY_HANDLER} "test" :item)))
    (is (= AdotLambdaExecWrapper/PROXY_HANDLER (adot-lambda-exec-wrapper {:test/item AdotLambdaExecWrapper/PROXY_HANDLER} "test" :item)))
    (is (= AdotLambdaExecWrapper/INSTRUMENT_HANDLER (adot-lambda-exec-wrapper {:item AdotLambdaExecWrapper/INSTRUMENT_HANDLER} "test" :item)))
    (is (= AdotLambdaExecWrapper/INSTRUMENT_HANDLER (adot-lambda-exec-wrapper {:test/item AdotLambdaExecWrapper/INSTRUMENT_HANDLER} "test" :item)))
    (is (= AdotLambdaExecWrapper/REGULAR_HANDLER (adot-lambda-exec-wrapper {:item :regular-handler} "test" :item)))
    (is (= AdotLambdaExecWrapper/REGULAR_HANDLER (adot-lambda-exec-wrapper {:test/item :regular-handler} "test" :item)))
    (is (= AdotLambdaExecWrapper/STREAM_HANDLER (adot-lambda-exec-wrapper {:item :stream-handler} "test" :item)))
    (is (= AdotLambdaExecWrapper/STREAM_HANDLER (adot-lambda-exec-wrapper {:test/item :stream-handler} "test" :item)))
    (is (= AdotLambdaExecWrapper/PROXY_HANDLER (adot-lambda-exec-wrapper {:item :proxy-handler} "test" :item)))
    (is (= AdotLambdaExecWrapper/PROXY_HANDLER (adot-lambda-exec-wrapper {:test/item :proxy-handler} "test" :item)))
    (is (= AdotLambdaExecWrapper/INSTRUMENT_HANDLER (adot-lambda-exec-wrapper {:item :instrument-handler} "test" :item)))
    (is (= AdotLambdaExecWrapper/INSTRUMENT_HANDLER (adot-lambda-exec-wrapper {:test/item :instrument-handler} "test" :item)))))


(deftest application-log-level-test
  (testing "Testing enum function application-log-level"
    (is (= ApplicationLogLevel/TRACE (application-log-level {:item ApplicationLogLevel/TRACE} "test" :item)))
    (is (= ApplicationLogLevel/TRACE (application-log-level {:test/item ApplicationLogLevel/TRACE} "test" :item)))
    (is (= ApplicationLogLevel/DEBUG (application-log-level {:item ApplicationLogLevel/DEBUG} "test" :item)))
    (is (= ApplicationLogLevel/DEBUG (application-log-level {:test/item ApplicationLogLevel/DEBUG} "test" :item)))
    (is (= ApplicationLogLevel/INFO (application-log-level {:item ApplicationLogLevel/INFO} "test" :item)))
    (is (= ApplicationLogLevel/INFO (application-log-level {:test/item ApplicationLogLevel/INFO} "test" :item)))
    (is (= ApplicationLogLevel/FATAL (application-log-level {:item ApplicationLogLevel/FATAL} "test" :item)))
    (is (= ApplicationLogLevel/FATAL (application-log-level {:test/item ApplicationLogLevel/FATAL} "test" :item)))
    (is (= ApplicationLogLevel/ERROR (application-log-level {:item ApplicationLogLevel/ERROR} "test" :item)))
    (is (= ApplicationLogLevel/ERROR (application-log-level {:test/item ApplicationLogLevel/ERROR} "test" :item)))
    (is (= ApplicationLogLevel/WARN (application-log-level {:item ApplicationLogLevel/WARN} "test" :item)))
    (is (= ApplicationLogLevel/WARN (application-log-level {:test/item ApplicationLogLevel/WARN} "test" :item)))
    (is (= ApplicationLogLevel/TRACE (application-log-level {:item :trace} "test" :item)))
    (is (= ApplicationLogLevel/TRACE (application-log-level {:test/item :trace} "test" :item)))
    (is (= ApplicationLogLevel/DEBUG (application-log-level {:item :debug} "test" :item)))
    (is (= ApplicationLogLevel/DEBUG (application-log-level {:test/item :debug} "test" :item)))
    (is (= ApplicationLogLevel/INFO (application-log-level {:item :info} "test" :item)))
    (is (= ApplicationLogLevel/INFO (application-log-level {:test/item :info} "test" :item)))
    (is (= ApplicationLogLevel/FATAL (application-log-level {:item :fatal} "test" :item)))
    (is (= ApplicationLogLevel/FATAL (application-log-level {:test/item :fatal} "test" :item)))
    (is (= ApplicationLogLevel/ERROR (application-log-level {:item :error} "test" :item)))
    (is (= ApplicationLogLevel/ERROR (application-log-level {:test/item :error} "test" :item)))
    (is (= ApplicationLogLevel/WARN (application-log-level {:item :warn} "test" :item)))
    (is (= ApplicationLogLevel/WARN (application-log-level {:test/item :warn} "test" :item)))))


(deftest destination-type-test
  (testing "Testing enum function destination-type"
    (is (= DestinationType/SUCCESS (destination-type {:item DestinationType/SUCCESS} "test" :item)))
    (is (= DestinationType/SUCCESS (destination-type {:test/item DestinationType/SUCCESS} "test" :item)))
    (is (= DestinationType/FAILURE (destination-type {:item DestinationType/FAILURE} "test" :item)))
    (is (= DestinationType/FAILURE (destination-type {:test/item DestinationType/FAILURE} "test" :item)))
    (is (= DestinationType/SUCCESS (destination-type {:item :success} "test" :item)))
    (is (= DestinationType/SUCCESS (destination-type {:test/item :success} "test" :item)))
    (is (= DestinationType/FAILURE (destination-type {:item :failure} "test" :item)))
    (is (= DestinationType/FAILURE (destination-type {:test/item :failure} "test" :item)))))


(deftest function-url-auth-type-test
  (testing "Testing enum function function-url-auth-type"
    (is (= FunctionUrlAuthType/AWS_IAM (function-url-auth-type {:item FunctionUrlAuthType/AWS_IAM} "test" :item)))
    (is (= FunctionUrlAuthType/AWS_IAM (function-url-auth-type {:test/item FunctionUrlAuthType/AWS_IAM} "test" :item)))
    (is (= FunctionUrlAuthType/NONE (function-url-auth-type {:item FunctionUrlAuthType/NONE} "test" :item)))
    (is (= FunctionUrlAuthType/NONE (function-url-auth-type {:test/item FunctionUrlAuthType/NONE} "test" :item)))
    (is (= FunctionUrlAuthType/AWS_IAM (function-url-auth-type {:item :aws-iam} "test" :item)))
    (is (= FunctionUrlAuthType/AWS_IAM (function-url-auth-type {:test/item :aws-iam} "test" :item)))
    (is (= FunctionUrlAuthType/NONE (function-url-auth-type {:item :none} "test" :item)))
    (is (= FunctionUrlAuthType/NONE (function-url-auth-type {:test/item :none} "test" :item)))))


(deftest http-method-test
  (testing "Testing enum function http-method"
    (is (= HttpMethod/PUT (http-method {:item HttpMethod/PUT} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:test/item HttpMethod/PUT} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:item HttpMethod/DELETE} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:test/item HttpMethod/DELETE} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:item HttpMethod/HEAD} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:test/item HttpMethod/HEAD} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:item HttpMethod/OPTIONS} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:test/item HttpMethod/OPTIONS} "test" :item)))
    (is (= HttpMethod/ALL (http-method {:item HttpMethod/ALL} "test" :item)))
    (is (= HttpMethod/ALL (http-method {:test/item HttpMethod/ALL} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:item HttpMethod/PATCH} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:test/item HttpMethod/PATCH} "test" :item)))
    (is (= HttpMethod/GET (http-method {:item HttpMethod/GET} "test" :item)))
    (is (= HttpMethod/GET (http-method {:test/item HttpMethod/GET} "test" :item)))
    (is (= HttpMethod/POST (http-method {:item HttpMethod/POST} "test" :item)))
    (is (= HttpMethod/POST (http-method {:test/item HttpMethod/POST} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:item :put} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:test/item :put} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:item :delete} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:test/item :delete} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:item :head} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:test/item :head} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:item :options} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:test/item :options} "test" :item)))
    (is (= HttpMethod/ALL (http-method {:item :all} "test" :item)))
    (is (= HttpMethod/ALL (http-method {:test/item :all} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:item :patch} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:test/item :patch} "test" :item)))
    (is (= HttpMethod/GET (http-method {:item :get} "test" :item)))
    (is (= HttpMethod/GET (http-method {:test/item :get} "test" :item)))
    (is (= HttpMethod/POST (http-method {:item :post} "test" :item)))
    (is (= HttpMethod/POST (http-method {:test/item :post} "test" :item)))))


(deftest invoke-mode-test
  (testing "Testing enum function invoke-mode"
    (is (= InvokeMode/RESPONSE_STREAM (invoke-mode {:item InvokeMode/RESPONSE_STREAM} "test" :item)))
    (is (= InvokeMode/RESPONSE_STREAM (invoke-mode {:test/item InvokeMode/RESPONSE_STREAM} "test" :item)))
    (is (= InvokeMode/BUFFERED (invoke-mode {:item InvokeMode/BUFFERED} "test" :item)))
    (is (= InvokeMode/BUFFERED (invoke-mode {:test/item InvokeMode/BUFFERED} "test" :item)))
    (is (= InvokeMode/RESPONSE_STREAM (invoke-mode {:item :response-stream} "test" :item)))
    (is (= InvokeMode/RESPONSE_STREAM (invoke-mode {:test/item :response-stream} "test" :item)))
    (is (= InvokeMode/BUFFERED (invoke-mode {:item :buffered} "test" :item)))
    (is (= InvokeMode/BUFFERED (invoke-mode {:test/item :buffered} "test" :item)))))


(deftest log-format-test
  (testing "Testing enum function log-format"
    (is (= LogFormat/TEXT (log-format {:item LogFormat/TEXT} "test" :item)))
    (is (= LogFormat/TEXT (log-format {:test/item LogFormat/TEXT} "test" :item)))
    (is (= LogFormat/JSON (log-format {:item LogFormat/JSON} "test" :item)))
    (is (= LogFormat/JSON (log-format {:test/item LogFormat/JSON} "test" :item)))
    (is (= LogFormat/TEXT (log-format {:item :text} "test" :item)))
    (is (= LogFormat/TEXT (log-format {:test/item :text} "test" :item)))
    (is (= LogFormat/JSON (log-format {:item :json} "test" :item)))
    (is (= LogFormat/JSON (log-format {:test/item :json} "test" :item)))))


(deftest logging-format-test
  (testing "Testing enum function logging-format"
    (is (= LoggingFormat/TEXT (logging-format {:item LoggingFormat/TEXT} "test" :item)))
    (is (= LoggingFormat/TEXT (logging-format {:test/item LoggingFormat/TEXT} "test" :item)))
    (is (= LoggingFormat/JSON (logging-format {:item LoggingFormat/JSON} "test" :item)))
    (is (= LoggingFormat/JSON (logging-format {:test/item LoggingFormat/JSON} "test" :item)))
    (is (= LoggingFormat/TEXT (logging-format {:item :text} "test" :item)))
    (is (= LoggingFormat/TEXT (logging-format {:test/item :text} "test" :item)))
    (is (= LoggingFormat/JSON (logging-format {:item :json} "test" :item)))
    (is (= LoggingFormat/JSON (logging-format {:test/item :json} "test" :item)))))


(deftest params-and-secrets-log-level-test
  (testing "Testing enum function params-and-secrets-log-level"
    (is (= ParamsAndSecretsLogLevel/WARN (params-and-secrets-log-level {:item ParamsAndSecretsLogLevel/WARN} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/WARN (params-and-secrets-log-level {:test/item ParamsAndSecretsLogLevel/WARN} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/INFO (params-and-secrets-log-level {:item ParamsAndSecretsLogLevel/INFO} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/INFO (params-and-secrets-log-level {:test/item ParamsAndSecretsLogLevel/INFO} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/ERROR (params-and-secrets-log-level {:item ParamsAndSecretsLogLevel/ERROR} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/ERROR (params-and-secrets-log-level {:test/item ParamsAndSecretsLogLevel/ERROR} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/DEBUG (params-and-secrets-log-level {:item ParamsAndSecretsLogLevel/DEBUG} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/DEBUG (params-and-secrets-log-level {:test/item ParamsAndSecretsLogLevel/DEBUG} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/NONE (params-and-secrets-log-level {:item ParamsAndSecretsLogLevel/NONE} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/NONE (params-and-secrets-log-level {:test/item ParamsAndSecretsLogLevel/NONE} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/WARN (params-and-secrets-log-level {:item :warn} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/WARN (params-and-secrets-log-level {:test/item :warn} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/INFO (params-and-secrets-log-level {:item :info} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/INFO (params-and-secrets-log-level {:test/item :info} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/ERROR (params-and-secrets-log-level {:item :error} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/ERROR (params-and-secrets-log-level {:test/item :error} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/DEBUG (params-and-secrets-log-level {:item :debug} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/DEBUG (params-and-secrets-log-level {:test/item :debug} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/NONE (params-and-secrets-log-level {:item :none} "test" :item)))
    (is (= ParamsAndSecretsLogLevel/NONE (params-and-secrets-log-level {:test/item :none} "test" :item)))))


(deftest params-and-secrets-versions-test
  (testing "Testing enum function params-and-secrets-versions"
    (is (= ParamsAndSecretsVersions/V1_0_103 (params-and-secrets-versions {:item ParamsAndSecretsVersions/V1_0_103} "test" :item)))
    (is (= ParamsAndSecretsVersions/V1_0_103 (params-and-secrets-versions {:test/item ParamsAndSecretsVersions/V1_0_103} "test" :item)))
    (is (= ParamsAndSecretsVersions/V1_0_103 (params-and-secrets-versions {:item :v1-0-103} "test" :item)))
    (is (= ParamsAndSecretsVersions/V1_0_103 (params-and-secrets-versions {:test/item :v1-0-103} "test" :item)))))


(deftest runtime-family-test
  (testing "Testing enum function runtime-family"
    (is (= RuntimeFamily/RUBY (runtime-family {:item RuntimeFamily/RUBY} "test" :item)))
    (is (= RuntimeFamily/RUBY (runtime-family {:test/item RuntimeFamily/RUBY} "test" :item)))
    (is (= RuntimeFamily/DOTNET_CORE (runtime-family {:item RuntimeFamily/DOTNET_CORE} "test" :item)))
    (is (= RuntimeFamily/DOTNET_CORE (runtime-family {:test/item RuntimeFamily/DOTNET_CORE} "test" :item)))
    (is (= RuntimeFamily/PYTHON (runtime-family {:item RuntimeFamily/PYTHON} "test" :item)))
    (is (= RuntimeFamily/PYTHON (runtime-family {:test/item RuntimeFamily/PYTHON} "test" :item)))
    (is (= RuntimeFamily/JAVA (runtime-family {:item RuntimeFamily/JAVA} "test" :item)))
    (is (= RuntimeFamily/JAVA (runtime-family {:test/item RuntimeFamily/JAVA} "test" :item)))
    (is (= RuntimeFamily/GO (runtime-family {:item RuntimeFamily/GO} "test" :item)))
    (is (= RuntimeFamily/GO (runtime-family {:test/item RuntimeFamily/GO} "test" :item)))
    (is (= RuntimeFamily/NODEJS (runtime-family {:item RuntimeFamily/NODEJS} "test" :item)))
    (is (= RuntimeFamily/NODEJS (runtime-family {:test/item RuntimeFamily/NODEJS} "test" :item)))
    (is (= RuntimeFamily/OTHER (runtime-family {:item RuntimeFamily/OTHER} "test" :item)))
    (is (= RuntimeFamily/OTHER (runtime-family {:test/item RuntimeFamily/OTHER} "test" :item)))
    (is (= RuntimeFamily/RUBY (runtime-family {:item :ruby} "test" :item)))
    (is (= RuntimeFamily/RUBY (runtime-family {:test/item :ruby} "test" :item)))
    (is (= RuntimeFamily/DOTNET_CORE (runtime-family {:item :dotnet-core} "test" :item)))
    (is (= RuntimeFamily/DOTNET_CORE (runtime-family {:test/item :dotnet-core} "test" :item)))
    (is (= RuntimeFamily/PYTHON (runtime-family {:item :python} "test" :item)))
    (is (= RuntimeFamily/PYTHON (runtime-family {:test/item :python} "test" :item)))
    (is (= RuntimeFamily/JAVA (runtime-family {:item :java} "test" :item)))
    (is (= RuntimeFamily/JAVA (runtime-family {:test/item :java} "test" :item)))
    (is (= RuntimeFamily/GO (runtime-family {:item :go} "test" :item)))
    (is (= RuntimeFamily/GO (runtime-family {:test/item :go} "test" :item)))
    (is (= RuntimeFamily/NODEJS (runtime-family {:item :nodejs} "test" :item)))
    (is (= RuntimeFamily/NODEJS (runtime-family {:test/item :nodejs} "test" :item)))
    (is (= RuntimeFamily/OTHER (runtime-family {:item :other} "test" :item)))
    (is (= RuntimeFamily/OTHER (runtime-family {:test/item :other} "test" :item)))))


(deftest starting-position-test
  (testing "Testing enum function starting-position"
    (is (= StartingPosition/LATEST (starting-position {:item StartingPosition/LATEST} "test" :item)))
    (is (= StartingPosition/LATEST (starting-position {:test/item StartingPosition/LATEST} "test" :item)))
    (is (= StartingPosition/TRIM_HORIZON (starting-position {:item StartingPosition/TRIM_HORIZON} "test" :item)))
    (is (= StartingPosition/TRIM_HORIZON (starting-position {:test/item StartingPosition/TRIM_HORIZON} "test" :item)))
    (is (= StartingPosition/AT_TIMESTAMP (starting-position {:item StartingPosition/AT_TIMESTAMP} "test" :item)))
    (is (= StartingPosition/AT_TIMESTAMP (starting-position {:test/item StartingPosition/AT_TIMESTAMP} "test" :item)))
    (is (= StartingPosition/LATEST (starting-position {:item :latest} "test" :item)))
    (is (= StartingPosition/LATEST (starting-position {:test/item :latest} "test" :item)))
    (is (= StartingPosition/TRIM_HORIZON (starting-position {:item :trim-horizon} "test" :item)))
    (is (= StartingPosition/TRIM_HORIZON (starting-position {:test/item :trim-horizon} "test" :item)))
    (is (= StartingPosition/AT_TIMESTAMP (starting-position {:item :at-timestamp} "test" :item)))
    (is (= StartingPosition/AT_TIMESTAMP (starting-position {:test/item :at-timestamp} "test" :item)))))


(deftest system-log-level-test
  (testing "Testing enum function system-log-level"
    (is (= SystemLogLevel/WARN (system-log-level {:item SystemLogLevel/WARN} "test" :item)))
    (is (= SystemLogLevel/WARN (system-log-level {:test/item SystemLogLevel/WARN} "test" :item)))
    (is (= SystemLogLevel/INFO (system-log-level {:item SystemLogLevel/INFO} "test" :item)))
    (is (= SystemLogLevel/INFO (system-log-level {:test/item SystemLogLevel/INFO} "test" :item)))
    (is (= SystemLogLevel/DEBUG (system-log-level {:item SystemLogLevel/DEBUG} "test" :item)))
    (is (= SystemLogLevel/DEBUG (system-log-level {:test/item SystemLogLevel/DEBUG} "test" :item)))
    (is (= SystemLogLevel/WARN (system-log-level {:item :warn} "test" :item)))
    (is (= SystemLogLevel/WARN (system-log-level {:test/item :warn} "test" :item)))
    (is (= SystemLogLevel/INFO (system-log-level {:item :info} "test" :item)))
    (is (= SystemLogLevel/INFO (system-log-level {:test/item :info} "test" :item)))
    (is (= SystemLogLevel/DEBUG (system-log-level {:item :debug} "test" :item)))
    (is (= SystemLogLevel/DEBUG (system-log-level {:test/item :debug} "test" :item)))))


(deftest tracing-test
  (testing "Testing enum function tracing"
    (is (= Tracing/PASS_THROUGH (tracing {:item Tracing/PASS_THROUGH} "test" :item)))
    (is (= Tracing/PASS_THROUGH (tracing {:test/item Tracing/PASS_THROUGH} "test" :item)))
    (is (= Tracing/DISABLED (tracing {:item Tracing/DISABLED} "test" :item)))
    (is (= Tracing/DISABLED (tracing {:test/item Tracing/DISABLED} "test" :item)))
    (is (= Tracing/ACTIVE (tracing {:item Tracing/ACTIVE} "test" :item)))
    (is (= Tracing/ACTIVE (tracing {:test/item Tracing/ACTIVE} "test" :item)))
    (is (= Tracing/PASS_THROUGH (tracing {:item :pass-through} "test" :item)))
    (is (= Tracing/PASS_THROUGH (tracing {:test/item :pass-through} "test" :item)))
    (is (= Tracing/DISABLED (tracing {:item :disabled} "test" :item)))
    (is (= Tracing/DISABLED (tracing {:test/item :disabled} "test" :item)))
    (is (= Tracing/ACTIVE (tracing {:item :active} "test" :item)))
    (is (= Tracing/ACTIVE (tracing {:test/item :active} "test" :item)))))


(deftest untrusted-artifact-on-deployment-test
  (testing "Testing enum function untrusted-artifact-on-deployment"
    (is (= UntrustedArtifactOnDeployment/ENFORCE (untrusted-artifact-on-deployment {:item UntrustedArtifactOnDeployment/ENFORCE} "test" :item)))
    (is (= UntrustedArtifactOnDeployment/ENFORCE (untrusted-artifact-on-deployment {:test/item UntrustedArtifactOnDeployment/ENFORCE} "test" :item)))
    (is (= UntrustedArtifactOnDeployment/WARN (untrusted-artifact-on-deployment {:item UntrustedArtifactOnDeployment/WARN} "test" :item)))
    (is (= UntrustedArtifactOnDeployment/WARN (untrusted-artifact-on-deployment {:test/item UntrustedArtifactOnDeployment/WARN} "test" :item)))
    (is (= UntrustedArtifactOnDeployment/ENFORCE (untrusted-artifact-on-deployment {:item :enforce} "test" :item)))
    (is (= UntrustedArtifactOnDeployment/ENFORCE (untrusted-artifact-on-deployment {:test/item :enforce} "test" :item)))
    (is (= UntrustedArtifactOnDeployment/WARN (untrusted-artifact-on-deployment {:item :warn} "test" :item)))
    (is (= UntrustedArtifactOnDeployment/WARN (untrusted-artifact-on-deployment {:test/item :warn} "test" :item)))))