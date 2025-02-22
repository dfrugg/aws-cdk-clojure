(ns cdk.api.services.apigateway-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.apigateway package. "
  (:require [cdk.api.services.apigateway :refer [api-key-source-type
                                                 authorization-type
                                                 connection-type
                                                 content-handling
                                                 endpoint-type
                                                 integration-type
                                                 json-schema-type
                                                 json-schema-version
                                                 method-logging-level
                                                 passthrough-behavior
                                                 period
                                                 security-policy]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.apigateway ApiKeySourceType
                                                       AuthorizationType
                                                       ConnectionType
                                                       ContentHandling
                                                       EndpointType
                                                       IntegrationType
                                                       JsonSchemaType
                                                       JsonSchemaVersion
                                                       MethodLoggingLevel
                                                       PassthroughBehavior
                                                       Period
                                                       SecurityPolicy]))


(deftest api-key-source-type-test
  (testing "Testing enum function api-key-source-type"
    (is (= ApiKeySourceType/AUTHORIZER (api-key-source-type {:item ApiKeySourceType/AUTHORIZER} "test" :item)))
    (is (= ApiKeySourceType/AUTHORIZER (api-key-source-type {:test/item ApiKeySourceType/AUTHORIZER} "test" :item)))
    (is (= ApiKeySourceType/HEADER (api-key-source-type {:item ApiKeySourceType/HEADER} "test" :item)))
    (is (= ApiKeySourceType/HEADER (api-key-source-type {:test/item ApiKeySourceType/HEADER} "test" :item)))
    (is (= ApiKeySourceType/AUTHORIZER (api-key-source-type {:item :authorizer} "test" :item)))
    (is (= ApiKeySourceType/AUTHORIZER (api-key-source-type {:test/item :authorizer} "test" :item)))
    (is (= ApiKeySourceType/HEADER (api-key-source-type {:item :header} "test" :item)))
    (is (= ApiKeySourceType/HEADER (api-key-source-type {:test/item :header} "test" :item)))))


(deftest authorization-type-test
  (testing "Testing enum function authorization-type"
    (is (= AuthorizationType/NONE (authorization-type {:item AuthorizationType/NONE} "test" :item)))
    (is (= AuthorizationType/NONE (authorization-type {:test/item AuthorizationType/NONE} "test" :item)))
    (is (= AuthorizationType/IAM (authorization-type {:item AuthorizationType/IAM} "test" :item)))
    (is (= AuthorizationType/IAM (authorization-type {:test/item AuthorizationType/IAM} "test" :item)))
    (is (= AuthorizationType/COGNITO (authorization-type {:item AuthorizationType/COGNITO} "test" :item)))
    (is (= AuthorizationType/COGNITO (authorization-type {:test/item AuthorizationType/COGNITO} "test" :item)))
    (is (= AuthorizationType/CUSTOM (authorization-type {:item AuthorizationType/CUSTOM} "test" :item)))
    (is (= AuthorizationType/CUSTOM (authorization-type {:test/item AuthorizationType/CUSTOM} "test" :item)))
    (is (= AuthorizationType/NONE (authorization-type {:item :none} "test" :item)))
    (is (= AuthorizationType/NONE (authorization-type {:test/item :none} "test" :item)))
    (is (= AuthorizationType/IAM (authorization-type {:item :iam} "test" :item)))
    (is (= AuthorizationType/IAM (authorization-type {:test/item :iam} "test" :item)))
    (is (= AuthorizationType/COGNITO (authorization-type {:item :cognito} "test" :item)))
    (is (= AuthorizationType/COGNITO (authorization-type {:test/item :cognito} "test" :item)))
    (is (= AuthorizationType/CUSTOM (authorization-type {:item :custom} "test" :item)))
    (is (= AuthorizationType/CUSTOM (authorization-type {:test/item :custom} "test" :item)))))


(deftest connection-type-test
  (testing "Testing enum function connection-type"
    (is (= ConnectionType/VPC_LINK (connection-type {:item ConnectionType/VPC_LINK} "test" :item)))
    (is (= ConnectionType/VPC_LINK (connection-type {:test/item ConnectionType/VPC_LINK} "test" :item)))
    (is (= ConnectionType/INTERNET (connection-type {:item ConnectionType/INTERNET} "test" :item)))
    (is (= ConnectionType/INTERNET (connection-type {:test/item ConnectionType/INTERNET} "test" :item)))
    (is (= ConnectionType/VPC_LINK (connection-type {:item :vpc-link} "test" :item)))
    (is (= ConnectionType/VPC_LINK (connection-type {:test/item :vpc-link} "test" :item)))
    (is (= ConnectionType/INTERNET (connection-type {:item :internet} "test" :item)))
    (is (= ConnectionType/INTERNET (connection-type {:test/item :internet} "test" :item)))))


(deftest content-handling-test
  (testing "Testing enum function content-handling"
    (is (= ContentHandling/CONVERT_TO_BINARY (content-handling {:item ContentHandling/CONVERT_TO_BINARY} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_BINARY (content-handling {:test/item ContentHandling/CONVERT_TO_BINARY} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_TEXT (content-handling {:item ContentHandling/CONVERT_TO_TEXT} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_TEXT (content-handling {:test/item ContentHandling/CONVERT_TO_TEXT} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_BINARY (content-handling {:item :convert-to-binary} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_BINARY (content-handling {:test/item :convert-to-binary} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_TEXT (content-handling {:item :convert-to-text} "test" :item)))
    (is (= ContentHandling/CONVERT_TO_TEXT (content-handling {:test/item :convert-to-text} "test" :item)))))


(deftest endpoint-type-test
  (testing "Testing enum function endpoint-type"
    (is (= EndpointType/EDGE (endpoint-type {:item EndpointType/EDGE} "test" :item)))
    (is (= EndpointType/EDGE (endpoint-type {:test/item EndpointType/EDGE} "test" :item)))
    (is (= EndpointType/PRIVATE (endpoint-type {:item EndpointType/PRIVATE} "test" :item)))
    (is (= EndpointType/PRIVATE (endpoint-type {:test/item EndpointType/PRIVATE} "test" :item)))
    (is (= EndpointType/REGIONAL (endpoint-type {:item EndpointType/REGIONAL} "test" :item)))
    (is (= EndpointType/REGIONAL (endpoint-type {:test/item EndpointType/REGIONAL} "test" :item)))
    (is (= EndpointType/EDGE (endpoint-type {:item :edge} "test" :item)))
    (is (= EndpointType/EDGE (endpoint-type {:test/item :edge} "test" :item)))
    (is (= EndpointType/PRIVATE (endpoint-type {:item :private} "test" :item)))
    (is (= EndpointType/PRIVATE (endpoint-type {:test/item :private} "test" :item)))
    (is (= EndpointType/REGIONAL (endpoint-type {:item :regional} "test" :item)))
    (is (= EndpointType/REGIONAL (endpoint-type {:test/item :regional} "test" :item)))))


(deftest integration-type-test
  (testing "Testing enum function integration-type"
    (is (= IntegrationType/HTTP_PROXY (integration-type {:item IntegrationType/HTTP_PROXY} "test" :item)))
    (is (= IntegrationType/HTTP_PROXY (integration-type {:test/item IntegrationType/HTTP_PROXY} "test" :item)))
    (is (= IntegrationType/MOCK (integration-type {:item IntegrationType/MOCK} "test" :item)))
    (is (= IntegrationType/MOCK (integration-type {:test/item IntegrationType/MOCK} "test" :item)))
    (is (= IntegrationType/AWS (integration-type {:item IntegrationType/AWS} "test" :item)))
    (is (= IntegrationType/AWS (integration-type {:test/item IntegrationType/AWS} "test" :item)))
    (is (= IntegrationType/AWS_PROXY (integration-type {:item IntegrationType/AWS_PROXY} "test" :item)))
    (is (= IntegrationType/AWS_PROXY (integration-type {:test/item IntegrationType/AWS_PROXY} "test" :item)))
    (is (= IntegrationType/HTTP (integration-type {:item IntegrationType/HTTP} "test" :item)))
    (is (= IntegrationType/HTTP (integration-type {:test/item IntegrationType/HTTP} "test" :item)))
    (is (= IntegrationType/HTTP_PROXY (integration-type {:item :http-proxy} "test" :item)))
    (is (= IntegrationType/HTTP_PROXY (integration-type {:test/item :http-proxy} "test" :item)))
    (is (= IntegrationType/MOCK (integration-type {:item :mock} "test" :item)))
    (is (= IntegrationType/MOCK (integration-type {:test/item :mock} "test" :item)))
    (is (= IntegrationType/AWS (integration-type {:item :aws} "test" :item)))
    (is (= IntegrationType/AWS (integration-type {:test/item :aws} "test" :item)))
    (is (= IntegrationType/AWS_PROXY (integration-type {:item :aws-proxy} "test" :item)))
    (is (= IntegrationType/AWS_PROXY (integration-type {:test/item :aws-proxy} "test" :item)))
    (is (= IntegrationType/HTTP (integration-type {:item :http} "test" :item)))
    (is (= IntegrationType/HTTP (integration-type {:test/item :http} "test" :item)))))


(deftest json-schema-type-test
  (testing "Testing enum function json-schema-type"
    (is (= JsonSchemaType/ARRAY (json-schema-type {:item JsonSchemaType/ARRAY} "test" :item)))
    (is (= JsonSchemaType/ARRAY (json-schema-type {:test/item JsonSchemaType/ARRAY} "test" :item)))
    (is (= JsonSchemaType/NUMBER (json-schema-type {:item JsonSchemaType/NUMBER} "test" :item)))
    (is (= JsonSchemaType/NUMBER (json-schema-type {:test/item JsonSchemaType/NUMBER} "test" :item)))
    (is (= JsonSchemaType/NULL (json-schema-type {:item JsonSchemaType/NULL} "test" :item)))
    (is (= JsonSchemaType/NULL (json-schema-type {:test/item JsonSchemaType/NULL} "test" :item)))
    (is (= JsonSchemaType/BOOLEAN (json-schema-type {:item JsonSchemaType/BOOLEAN} "test" :item)))
    (is (= JsonSchemaType/BOOLEAN (json-schema-type {:test/item JsonSchemaType/BOOLEAN} "test" :item)))
    (is (= JsonSchemaType/INTEGER (json-schema-type {:item JsonSchemaType/INTEGER} "test" :item)))
    (is (= JsonSchemaType/INTEGER (json-schema-type {:test/item JsonSchemaType/INTEGER} "test" :item)))
    (is (= JsonSchemaType/OBJECT (json-schema-type {:item JsonSchemaType/OBJECT} "test" :item)))
    (is (= JsonSchemaType/OBJECT (json-schema-type {:test/item JsonSchemaType/OBJECT} "test" :item)))
    (is (= JsonSchemaType/STRING (json-schema-type {:item JsonSchemaType/STRING} "test" :item)))
    (is (= JsonSchemaType/STRING (json-schema-type {:test/item JsonSchemaType/STRING} "test" :item)))
    (is (= JsonSchemaType/ARRAY (json-schema-type {:item :array} "test" :item)))
    (is (= JsonSchemaType/ARRAY (json-schema-type {:test/item :array} "test" :item)))
    (is (= JsonSchemaType/NUMBER (json-schema-type {:item :number} "test" :item)))
    (is (= JsonSchemaType/NUMBER (json-schema-type {:test/item :number} "test" :item)))
    (is (= JsonSchemaType/NULL (json-schema-type {:item :null} "test" :item)))
    (is (= JsonSchemaType/NULL (json-schema-type {:test/item :null} "test" :item)))
    (is (= JsonSchemaType/BOOLEAN (json-schema-type {:item :boolean} "test" :item)))
    (is (= JsonSchemaType/BOOLEAN (json-schema-type {:test/item :boolean} "test" :item)))
    (is (= JsonSchemaType/INTEGER (json-schema-type {:item :integer} "test" :item)))
    (is (= JsonSchemaType/INTEGER (json-schema-type {:test/item :integer} "test" :item)))
    (is (= JsonSchemaType/OBJECT (json-schema-type {:item :object} "test" :item)))
    (is (= JsonSchemaType/OBJECT (json-schema-type {:test/item :object} "test" :item)))
    (is (= JsonSchemaType/STRING (json-schema-type {:item :string} "test" :item)))
    (is (= JsonSchemaType/STRING (json-schema-type {:test/item :string} "test" :item)))))


(deftest json-schema-version-test
  (testing "Testing enum function json-schema-version"
    (is (= JsonSchemaVersion/DRAFT4 (json-schema-version {:item JsonSchemaVersion/DRAFT4} "test" :item)))
    (is (= JsonSchemaVersion/DRAFT4 (json-schema-version {:test/item JsonSchemaVersion/DRAFT4} "test" :item)))
    (is (= JsonSchemaVersion/DRAFT7 (json-schema-version {:item JsonSchemaVersion/DRAFT7} "test" :item)))
    (is (= JsonSchemaVersion/DRAFT7 (json-schema-version {:test/item JsonSchemaVersion/DRAFT7} "test" :item)))
    (is (= JsonSchemaVersion/DRAFT4 (json-schema-version {:item :draft4} "test" :item)))
    (is (= JsonSchemaVersion/DRAFT4 (json-schema-version {:test/item :draft4} "test" :item)))
    (is (= JsonSchemaVersion/DRAFT7 (json-schema-version {:item :draft7} "test" :item)))
    (is (= JsonSchemaVersion/DRAFT7 (json-schema-version {:test/item :draft7} "test" :item)))))


(deftest method-logging-level-test
  (testing "Testing enum function method-logging-level"
    (is (= MethodLoggingLevel/OFF (method-logging-level {:item MethodLoggingLevel/OFF} "test" :item)))
    (is (= MethodLoggingLevel/OFF (method-logging-level {:test/item MethodLoggingLevel/OFF} "test" :item)))
    (is (= MethodLoggingLevel/INFO (method-logging-level {:item MethodLoggingLevel/INFO} "test" :item)))
    (is (= MethodLoggingLevel/INFO (method-logging-level {:test/item MethodLoggingLevel/INFO} "test" :item)))
    (is (= MethodLoggingLevel/ERROR (method-logging-level {:item MethodLoggingLevel/ERROR} "test" :item)))
    (is (= MethodLoggingLevel/ERROR (method-logging-level {:test/item MethodLoggingLevel/ERROR} "test" :item)))
    (is (= MethodLoggingLevel/OFF (method-logging-level {:item :off} "test" :item)))
    (is (= MethodLoggingLevel/OFF (method-logging-level {:test/item :off} "test" :item)))
    (is (= MethodLoggingLevel/INFO (method-logging-level {:item :info} "test" :item)))
    (is (= MethodLoggingLevel/INFO (method-logging-level {:test/item :info} "test" :item)))
    (is (= MethodLoggingLevel/ERROR (method-logging-level {:item :error} "test" :item)))
    (is (= MethodLoggingLevel/ERROR (method-logging-level {:test/item :error} "test" :item)))))


(deftest passthrough-behavior-test
  (testing "Testing enum function passthrough-behavior"
    (is (= PassthroughBehavior/NEVER (passthrough-behavior {:item PassthroughBehavior/NEVER} "test" :item)))
    (is (= PassthroughBehavior/NEVER (passthrough-behavior {:test/item PassthroughBehavior/NEVER} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_MATCH (passthrough-behavior {:item PassthroughBehavior/WHEN_NO_MATCH} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_MATCH (passthrough-behavior {:test/item PassthroughBehavior/WHEN_NO_MATCH} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_TEMPLATES (passthrough-behavior {:item PassthroughBehavior/WHEN_NO_TEMPLATES} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_TEMPLATES (passthrough-behavior {:test/item PassthroughBehavior/WHEN_NO_TEMPLATES} "test" :item)))
    (is (= PassthroughBehavior/NEVER (passthrough-behavior {:item :never} "test" :item)))
    (is (= PassthroughBehavior/NEVER (passthrough-behavior {:test/item :never} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_MATCH (passthrough-behavior {:item :when-no-match} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_MATCH (passthrough-behavior {:test/item :when-no-match} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_TEMPLATES (passthrough-behavior {:item :when-no-templates} "test" :item)))
    (is (= PassthroughBehavior/WHEN_NO_TEMPLATES (passthrough-behavior {:test/item :when-no-templates} "test" :item)))))


(deftest period-test
  (testing "Testing enum function period"
    (is (= Period/DAY (period {:item Period/DAY} "test" :item)))
    (is (= Period/DAY (period {:test/item Period/DAY} "test" :item)))
    (is (= Period/WEEK (period {:item Period/WEEK} "test" :item)))
    (is (= Period/WEEK (period {:test/item Period/WEEK} "test" :item)))
    (is (= Period/MONTH (period {:item Period/MONTH} "test" :item)))
    (is (= Period/MONTH (period {:test/item Period/MONTH} "test" :item)))
    (is (= Period/DAY (period {:item :day} "test" :item)))
    (is (= Period/DAY (period {:test/item :day} "test" :item)))
    (is (= Period/WEEK (period {:item :week} "test" :item)))
    (is (= Period/WEEK (period {:test/item :week} "test" :item)))
    (is (= Period/MONTH (period {:item :month} "test" :item)))
    (is (= Period/MONTH (period {:test/item :month} "test" :item)))))


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