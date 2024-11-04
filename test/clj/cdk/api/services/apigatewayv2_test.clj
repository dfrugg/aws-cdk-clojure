(ns cdk.api.services.apigatewayv2-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.apigatewayv2 package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.apigatewayv2 :refer [authorizer-payload-version
                                                   content-handling
                                                   cors-http-method
                                                   endpoint-type
                                                   http-authorizer-type
                                                   http-connection-type
                                                   http-integration-subtype
                                                   http-integration-type
                                                   http-method
                                                   passthrough-behavior
                                                   security-policy
                                                   web-socket-authorizer-type
                                                   web-socket-integration-type]])
  (:import [software.amazon.awscdk.services.apigatewayv2 AuthorizerPayloadVersion
                                                         ContentHandling
                                                         CorsHttpMethod
                                                         EndpointType
                                                         HttpAuthorizerType
                                                         HttpConnectionType
                                                         HttpIntegrationSubtype
                                                         HttpIntegrationType
                                                         HttpMethod
                                                         PassthroughBehavior
                                                         SecurityPolicy
                                                         WebSocketAuthorizerType
                                                         WebSocketIntegrationType]))


(deftest authorizer-payload-version-test
  (testing "Testing enum function authorizer-payload-version"
    (is (= AuthorizerPayloadVersion/VERSION_1_0 (authorizer-payload-version {:item AuthorizerPayloadVersion/VERSION_1_0} "test" :item)))
    (is (= AuthorizerPayloadVersion/VERSION_1_0 (authorizer-payload-version {:test/item AuthorizerPayloadVersion/VERSION_1_0} "test" :item)))
    (is (= AuthorizerPayloadVersion/VERSION_2_0 (authorizer-payload-version {:item AuthorizerPayloadVersion/VERSION_2_0} "test" :item)))
    (is (= AuthorizerPayloadVersion/VERSION_2_0 (authorizer-payload-version {:test/item AuthorizerPayloadVersion/VERSION_2_0} "test" :item)))
    (is (= AuthorizerPayloadVersion/VERSION_1_0 (authorizer-payload-version {:item :version-1-0} "test" :item)))
    (is (= AuthorizerPayloadVersion/VERSION_1_0 (authorizer-payload-version {:test/item :version-1-0} "test" :item)))
    (is (= AuthorizerPayloadVersion/VERSION_2_0 (authorizer-payload-version {:item :version-2-0} "test" :item)))
    (is (= AuthorizerPayloadVersion/VERSION_2_0 (authorizer-payload-version {:test/item :version-2-0} "test" :item)))))


(deftest content-handling-test
  (testing "Testing enum function content-handling"
    (is (= ContentHandling/CONVERT_TO_TEXT (content-handling {:item ContentHandling/CONVERT_TO_TEXT} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_TEXT (content-handling {:test/item ContentHandling/CONVERT_TO_TEXT} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_BINARY (content-handling {:item ContentHandling/CONVERT_TO_BINARY} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_BINARY (content-handling {:test/item ContentHandling/CONVERT_TO_BINARY} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_TEXT (content-handling {:item :convert-to-text} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_TEXT (content-handling {:test/item :convert-to-text} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_BINARY (content-handling {:item :convert-to-binary} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_BINARY (content-handling {:test/item :convert-to-binary} "test" :item)))))


(deftest cors-http-method-test
  (testing "Testing enum function cors-http-method"
    (is (= CorsHttpMethod/POST (cors-http-method {:item CorsHttpMethod/POST} "test" :item)))
    (is (= CorsHttpMethod/POST (cors-http-method {:test/item CorsHttpMethod/POST} "test" :item)))
    (is (= CorsHttpMethod/HEAD (cors-http-method {:item CorsHttpMethod/HEAD} "test" :item)))
    (is (= CorsHttpMethod/HEAD (cors-http-method {:test/item CorsHttpMethod/HEAD} "test" :item)))
    (is (= CorsHttpMethod/DELETE (cors-http-method {:item CorsHttpMethod/DELETE} "test" :item)))
    (is (= CorsHttpMethod/DELETE (cors-http-method {:test/item CorsHttpMethod/DELETE} "test" :item)))
    (is (= CorsHttpMethod/OPTIONS (cors-http-method {:item CorsHttpMethod/OPTIONS} "test" :item)))
    (is (= CorsHttpMethod/OPTIONS (cors-http-method {:test/item CorsHttpMethod/OPTIONS} "test" :item)))
    (is (= CorsHttpMethod/PATCH (cors-http-method {:item CorsHttpMethod/PATCH} "test" :item)))
    (is (= CorsHttpMethod/PATCH (cors-http-method {:test/item CorsHttpMethod/PATCH} "test" :item)))
    (is (= CorsHttpMethod/GET (cors-http-method {:item CorsHttpMethod/GET} "test" :item)))
    (is (= CorsHttpMethod/GET (cors-http-method {:test/item CorsHttpMethod/GET} "test" :item)))
    (is (= CorsHttpMethod/PUT (cors-http-method {:item CorsHttpMethod/PUT} "test" :item)))
    (is (= CorsHttpMethod/PUT (cors-http-method {:test/item CorsHttpMethod/PUT} "test" :item)))
    (is (= CorsHttpMethod/ANY (cors-http-method {:item CorsHttpMethod/ANY} "test" :item)))
    (is (= CorsHttpMethod/ANY (cors-http-method {:test/item CorsHttpMethod/ANY} "test" :item)))
    (is (= CorsHttpMethod/POST (cors-http-method {:item :post} "test" :item)))
    (is (= CorsHttpMethod/POST (cors-http-method {:test/item :post} "test" :item)))
    (is (= CorsHttpMethod/HEAD (cors-http-method {:item :head} "test" :item)))
    (is (= CorsHttpMethod/HEAD (cors-http-method {:test/item :head} "test" :item)))
    (is (= CorsHttpMethod/DELETE (cors-http-method {:item :delete} "test" :item)))
    (is (= CorsHttpMethod/DELETE (cors-http-method {:test/item :delete} "test" :item)))
    (is (= CorsHttpMethod/OPTIONS (cors-http-method {:item :options} "test" :item)))
    (is (= CorsHttpMethod/OPTIONS (cors-http-method {:test/item :options} "test" :item)))
    (is (= CorsHttpMethod/PATCH (cors-http-method {:item :patch} "test" :item)))
    (is (= CorsHttpMethod/PATCH (cors-http-method {:test/item :patch} "test" :item)))
    (is (= CorsHttpMethod/GET (cors-http-method {:item :get} "test" :item)))
    (is (= CorsHttpMethod/GET (cors-http-method {:test/item :get} "test" :item)))
    (is (= CorsHttpMethod/PUT (cors-http-method {:item :put} "test" :item)))
    (is (= CorsHttpMethod/PUT (cors-http-method {:test/item :put} "test" :item)))
    (is (= CorsHttpMethod/ANY (cors-http-method {:item :any} "test" :item)))
    (is (= CorsHttpMethod/ANY (cors-http-method {:test/item :any} "test" :item)))))


(deftest endpoint-type-test
  (testing "Testing enum function endpoint-type"
    (is (= EndpointType/REGIONAL (endpoint-type {:item EndpointType/REGIONAL} "test" :item)))
    (is (= EndpointType/REGIONAL (endpoint-type {:test/item EndpointType/REGIONAL} "test" :item)))
    (is (= EndpointType/EDGE (endpoint-type {:item EndpointType/EDGE} "test" :item)))
    (is (= EndpointType/EDGE (endpoint-type {:test/item EndpointType/EDGE} "test" :item)))
    (is (= EndpointType/REGIONAL (endpoint-type {:item :regional} "test" :item)))
    (is (= EndpointType/REGIONAL (endpoint-type {:test/item :regional} "test" :item)))
    (is (= EndpointType/EDGE (endpoint-type {:item :edge} "test" :item)))
    (is (= EndpointType/EDGE (endpoint-type {:test/item :edge} "test" :item)))))


(deftest http-authorizer-type-test
  (testing "Testing enum function http-authorizer-type"
    (is (= HttpAuthorizerType/LAMBDA (http-authorizer-type {:item HttpAuthorizerType/LAMBDA} "test" :item)))
    (is (= HttpAuthorizerType/LAMBDA (http-authorizer-type {:test/item HttpAuthorizerType/LAMBDA} "test" :item)))
    (is (= HttpAuthorizerType/JWT (http-authorizer-type {:item HttpAuthorizerType/JWT} "test" :item)))
    (is (= HttpAuthorizerType/JWT (http-authorizer-type {:test/item HttpAuthorizerType/JWT} "test" :item)))
    (is (= HttpAuthorizerType/IAM (http-authorizer-type {:item HttpAuthorizerType/IAM} "test" :item)))
    (is (= HttpAuthorizerType/IAM (http-authorizer-type {:test/item HttpAuthorizerType/IAM} "test" :item)))
    (is (= HttpAuthorizerType/LAMBDA (http-authorizer-type {:item :lambda} "test" :item)))
    (is (= HttpAuthorizerType/LAMBDA (http-authorizer-type {:test/item :lambda} "test" :item)))
    (is (= HttpAuthorizerType/JWT (http-authorizer-type {:item :jwt} "test" :item)))
    (is (= HttpAuthorizerType/JWT (http-authorizer-type {:test/item :jwt} "test" :item)))
    (is (= HttpAuthorizerType/IAM (http-authorizer-type {:item :iam} "test" :item)))
    (is (= HttpAuthorizerType/IAM (http-authorizer-type {:test/item :iam} "test" :item)))))


(deftest http-connection-type-test
  (testing "Testing enum function http-connection-type"
    (is (= HttpConnectionType/INTERNET (http-connection-type {:item HttpConnectionType/INTERNET} "test" :item)))
    (is (= HttpConnectionType/INTERNET (http-connection-type {:test/item HttpConnectionType/INTERNET} "test" :item)))
    (is (= HttpConnectionType/VPC_LINK (http-connection-type {:item HttpConnectionType/VPC_LINK} "test" :item)))
    (is (= HttpConnectionType/VPC_LINK (http-connection-type {:test/item HttpConnectionType/VPC_LINK} "test" :item)))
    (is (= HttpConnectionType/INTERNET (http-connection-type {:item :internet} "test" :item)))
    (is (= HttpConnectionType/INTERNET (http-connection-type {:test/item :internet} "test" :item)))
    (is (= HttpConnectionType/VPC_LINK (http-connection-type {:item :vpc-link} "test" :item)))
    (is (= HttpConnectionType/VPC_LINK (http-connection-type {:test/item :vpc-link} "test" :item)))))


(deftest http-integration-subtype-test
  (testing "Testing enum function http-integration-subtype"
    (is (= HttpIntegrationSubtype/SQS_RECEIVE_MESSAGE (http-integration-subtype {:item HttpIntegrationSubtype/SQS_RECEIVE_MESSAGE} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_RECEIVE_MESSAGE (http-integration-subtype {:test/item HttpIntegrationSubtype/SQS_RECEIVE_MESSAGE} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_SEND_MESSAGE (http-integration-subtype {:item HttpIntegrationSubtype/SQS_SEND_MESSAGE} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_SEND_MESSAGE (http-integration-subtype {:test/item HttpIntegrationSubtype/SQS_SEND_MESSAGE} "test" :item)))
    (is (= HttpIntegrationSubtype/EVENTBRIDGE_PUT_EVENTS (http-integration-subtype {:item HttpIntegrationSubtype/EVENTBRIDGE_PUT_EVENTS} "test" :item)))
    (is (= HttpIntegrationSubtype/EVENTBRIDGE_PUT_EVENTS (http-integration-subtype {:test/item HttpIntegrationSubtype/EVENTBRIDGE_PUT_EVENTS} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_START_EXECUTION (http-integration-subtype {:item HttpIntegrationSubtype/STEPFUNCTIONS_START_EXECUTION} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_START_EXECUTION (http-integration-subtype {:test/item HttpIntegrationSubtype/STEPFUNCTIONS_START_EXECUTION} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_PURGE_QUEUE (http-integration-subtype {:item HttpIntegrationSubtype/SQS_PURGE_QUEUE} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_PURGE_QUEUE (http-integration-subtype {:test/item HttpIntegrationSubtype/SQS_PURGE_QUEUE} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_STOP_EXECUTION (http-integration-subtype {:item HttpIntegrationSubtype/STEPFUNCTIONS_STOP_EXECUTION} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_STOP_EXECUTION (http-integration-subtype {:test/item HttpIntegrationSubtype/STEPFUNCTIONS_STOP_EXECUTION} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_START_SYNC_EXECUTION (http-integration-subtype {:item HttpIntegrationSubtype/STEPFUNCTIONS_START_SYNC_EXECUTION} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_START_SYNC_EXECUTION (http-integration-subtype {:test/item HttpIntegrationSubtype/STEPFUNCTIONS_START_SYNC_EXECUTION} "test" :item)))
    (is (= HttpIntegrationSubtype/KINESIS_PUT_RECORD (http-integration-subtype {:item HttpIntegrationSubtype/KINESIS_PUT_RECORD} "test" :item)))
    (is (= HttpIntegrationSubtype/KINESIS_PUT_RECORD (http-integration-subtype {:test/item HttpIntegrationSubtype/KINESIS_PUT_RECORD} "test" :item)))
    (is (= HttpIntegrationSubtype/APPCONFIG_GET_CONFIGURATION (http-integration-subtype {:item HttpIntegrationSubtype/APPCONFIG_GET_CONFIGURATION} "test" :item)))
    (is (= HttpIntegrationSubtype/APPCONFIG_GET_CONFIGURATION (http-integration-subtype {:test/item HttpIntegrationSubtype/APPCONFIG_GET_CONFIGURATION} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_DELETE_MESSAGE (http-integration-subtype {:item HttpIntegrationSubtype/SQS_DELETE_MESSAGE} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_DELETE_MESSAGE (http-integration-subtype {:test/item HttpIntegrationSubtype/SQS_DELETE_MESSAGE} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_RECEIVE_MESSAGE (http-integration-subtype {:item :sqs-receive-message} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_RECEIVE_MESSAGE (http-integration-subtype {:test/item :sqs-receive-message} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_SEND_MESSAGE (http-integration-subtype {:item :sqs-send-message} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_SEND_MESSAGE (http-integration-subtype {:test/item :sqs-send-message} "test" :item)))
    (is (= HttpIntegrationSubtype/EVENTBRIDGE_PUT_EVENTS (http-integration-subtype {:item :eventbridge-put-events} "test" :item)))
    (is (= HttpIntegrationSubtype/EVENTBRIDGE_PUT_EVENTS (http-integration-subtype {:test/item :eventbridge-put-events} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_START_EXECUTION (http-integration-subtype {:item :stepfunctions-start-execution} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_START_EXECUTION (http-integration-subtype {:test/item :stepfunctions-start-execution} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_PURGE_QUEUE (http-integration-subtype {:item :sqs-purge-queue} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_PURGE_QUEUE (http-integration-subtype {:test/item :sqs-purge-queue} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_STOP_EXECUTION (http-integration-subtype {:item :stepfunctions-stop-execution} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_STOP_EXECUTION (http-integration-subtype {:test/item :stepfunctions-stop-execution} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_START_SYNC_EXECUTION (http-integration-subtype {:item :stepfunctions-start-sync-execution} "test" :item)))
    (is (= HttpIntegrationSubtype/STEPFUNCTIONS_START_SYNC_EXECUTION (http-integration-subtype {:test/item :stepfunctions-start-sync-execution} "test" :item)))
    (is (= HttpIntegrationSubtype/KINESIS_PUT_RECORD (http-integration-subtype {:item :kinesis-put-record} "test" :item)))
    (is (= HttpIntegrationSubtype/KINESIS_PUT_RECORD (http-integration-subtype {:test/item :kinesis-put-record} "test" :item)))
    (is (= HttpIntegrationSubtype/APPCONFIG_GET_CONFIGURATION (http-integration-subtype {:item :appconfig-get-configuration} "test" :item)))
    (is (= HttpIntegrationSubtype/APPCONFIG_GET_CONFIGURATION (http-integration-subtype {:test/item :appconfig-get-configuration} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_DELETE_MESSAGE (http-integration-subtype {:item :sqs-delete-message} "test" :item)))
    (is (= HttpIntegrationSubtype/SQS_DELETE_MESSAGE (http-integration-subtype {:test/item :sqs-delete-message} "test" :item)))))


(deftest http-integration-type-test
  (testing "Testing enum function http-integration-type"
    (is (= HttpIntegrationType/AWS_PROXY (http-integration-type {:item HttpIntegrationType/AWS_PROXY} "test" :item)))
    (is (= HttpIntegrationType/AWS_PROXY (http-integration-type {:test/item HttpIntegrationType/AWS_PROXY} "test" :item)))
    (is (= HttpIntegrationType/HTTP_PROXY (http-integration-type {:item HttpIntegrationType/HTTP_PROXY} "test" :item)))
    (is (= HttpIntegrationType/HTTP_PROXY (http-integration-type {:test/item HttpIntegrationType/HTTP_PROXY} "test" :item)))
    (is (= HttpIntegrationType/AWS_PROXY (http-integration-type {:item :aws-proxy} "test" :item)))
    (is (= HttpIntegrationType/AWS_PROXY (http-integration-type {:test/item :aws-proxy} "test" :item)))
    (is (= HttpIntegrationType/HTTP_PROXY (http-integration-type {:item :http-proxy} "test" :item)))
    (is (= HttpIntegrationType/HTTP_PROXY (http-integration-type {:test/item :http-proxy} "test" :item)))))


(deftest http-method-test
  (testing "Testing enum function http-method"
    (is (= HttpMethod/ANY (http-method {:item HttpMethod/ANY} "test" :item)))
    (is (= HttpMethod/ANY (http-method {:test/item HttpMethod/ANY} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:item HttpMethod/DELETE} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:test/item HttpMethod/DELETE} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:item HttpMethod/HEAD} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:test/item HttpMethod/HEAD} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:item HttpMethod/OPTIONS} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:test/item HttpMethod/OPTIONS} "test" :item)))
    (is (= HttpMethod/POST (http-method {:item HttpMethod/POST} "test" :item)))
    (is (= HttpMethod/POST (http-method {:test/item HttpMethod/POST} "test" :item)))
    (is (= HttpMethod/GET (http-method {:item HttpMethod/GET} "test" :item)))
    (is (= HttpMethod/GET (http-method {:test/item HttpMethod/GET} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:item HttpMethod/PATCH} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:test/item HttpMethod/PATCH} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:item HttpMethod/PUT} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:test/item HttpMethod/PUT} "test" :item)))
    (is (= HttpMethod/ANY (http-method {:item :any} "test" :item)))
    (is (= HttpMethod/ANY (http-method {:test/item :any} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:item :delete} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:test/item :delete} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:item :head} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:test/item :head} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:item :options} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:test/item :options} "test" :item)))
    (is (= HttpMethod/POST (http-method {:item :post} "test" :item)))
    (is (= HttpMethod/POST (http-method {:test/item :post} "test" :item)))
    (is (= HttpMethod/GET (http-method {:item :get} "test" :item)))
    (is (= HttpMethod/GET (http-method {:test/item :get} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:item :patch} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:test/item :patch} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:item :put} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:test/item :put} "test" :item)))))


(deftest passthrough-behavior-test
  (testing "Testing enum function passthrough-behavior"
    (is (= PassthroughBehavior/NEVER (passthrough-behavior {:item PassthroughBehavior/NEVER} "test" :item)))
    (is (= PassthroughBehavior/NEVER (passthrough-behavior {:test/item PassthroughBehavior/NEVER} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_TEMPLATES (passthrough-behavior {:item PassthroughBehavior/WHEN_NO_TEMPLATES} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_TEMPLATES (passthrough-behavior {:test/item PassthroughBehavior/WHEN_NO_TEMPLATES} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_MATCH (passthrough-behavior {:item PassthroughBehavior/WHEN_NO_MATCH} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_MATCH (passthrough-behavior {:test/item PassthroughBehavior/WHEN_NO_MATCH} "test" :item)))
    (is (= PassthroughBehavior/NEVER (passthrough-behavior {:item :never} "test" :item)))
    (is (= PassthroughBehavior/NEVER (passthrough-behavior {:test/item :never} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_TEMPLATES (passthrough-behavior {:item :when-no-templates} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_TEMPLATES (passthrough-behavior {:test/item :when-no-templates} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_MATCH (passthrough-behavior {:item :when-no-match} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_MATCH (passthrough-behavior {:test/item :when-no-match} "test" :item)))))


(deftest security-policy-test
  (testing "Testing enum function security-policy"
    (is (= SecurityPolicy/TLS_1_0 (security-policy {:item SecurityPolicy/TLS_1_0} "test" :item)))
    (is (= SecurityPolicy/TLS_1_0 (security-policy {:test/item SecurityPolicy/TLS_1_0} "test" :item)))
    (is (= SecurityPolicy/TLS_1_2 (security-policy {:item SecurityPolicy/TLS_1_2} "test" :item)))
    (is (= SecurityPolicy/TLS_1_2 (security-policy {:test/item SecurityPolicy/TLS_1_2} "test" :item)))
    (is (= SecurityPolicy/TLS_1_0 (security-policy {:item :tls-1-0} "test" :item)))
    (is (= SecurityPolicy/TLS_1_0 (security-policy {:test/item :tls-1-0} "test" :item)))
    (is (= SecurityPolicy/TLS_1_2 (security-policy {:item :tls-1-2} "test" :item)))
    (is (= SecurityPolicy/TLS_1_2 (security-policy {:test/item :tls-1-2} "test" :item)))))


(deftest web-socket-authorizer-type-test
  (testing "Testing enum function web-socket-authorizer-type"
    (is (= WebSocketAuthorizerType/IAM (web-socket-authorizer-type {:item WebSocketAuthorizerType/IAM} "test" :item)))
    (is (= WebSocketAuthorizerType/IAM (web-socket-authorizer-type {:test/item WebSocketAuthorizerType/IAM} "test" :item)))
    (is (= WebSocketAuthorizerType/LAMBDA (web-socket-authorizer-type {:item WebSocketAuthorizerType/LAMBDA} "test" :item)))
    (is (= WebSocketAuthorizerType/LAMBDA (web-socket-authorizer-type {:test/item WebSocketAuthorizerType/LAMBDA} "test" :item)))
    (is (= WebSocketAuthorizerType/IAM (web-socket-authorizer-type {:item :iam} "test" :item)))
    (is (= WebSocketAuthorizerType/IAM (web-socket-authorizer-type {:test/item :iam} "test" :item)))
    (is (= WebSocketAuthorizerType/LAMBDA (web-socket-authorizer-type {:item :lambda} "test" :item)))
    (is (= WebSocketAuthorizerType/LAMBDA (web-socket-authorizer-type {:test/item :lambda} "test" :item)))))


(deftest web-socket-integration-type-test
  (testing "Testing enum function web-socket-integration-type"
    (is (= WebSocketIntegrationType/MOCK (web-socket-integration-type {:item WebSocketIntegrationType/MOCK} "test" :item)))
    (is (= WebSocketIntegrationType/MOCK (web-socket-integration-type {:test/item WebSocketIntegrationType/MOCK} "test" :item)))
    (is (= WebSocketIntegrationType/AWS (web-socket-integration-type {:item WebSocketIntegrationType/AWS} "test" :item)))
    (is (= WebSocketIntegrationType/AWS (web-socket-integration-type {:test/item WebSocketIntegrationType/AWS} "test" :item)))
    (is (= WebSocketIntegrationType/AWS_PROXY (web-socket-integration-type {:item WebSocketIntegrationType/AWS_PROXY} "test" :item)))
    (is (= WebSocketIntegrationType/AWS_PROXY (web-socket-integration-type {:test/item WebSocketIntegrationType/AWS_PROXY} "test" :item)))
    (is (= WebSocketIntegrationType/MOCK (web-socket-integration-type {:item :mock} "test" :item)))
    (is (= WebSocketIntegrationType/MOCK (web-socket-integration-type {:test/item :mock} "test" :item)))
    (is (= WebSocketIntegrationType/AWS (web-socket-integration-type {:item :aws} "test" :item)))
    (is (= WebSocketIntegrationType/AWS (web-socket-integration-type {:test/item :aws} "test" :item)))
    (is (= WebSocketIntegrationType/AWS_PROXY (web-socket-integration-type {:item :aws-proxy} "test" :item)))
    (is (= WebSocketIntegrationType/AWS_PROXY (web-socket-integration-type {:test/item :aws-proxy} "test" :item)))))