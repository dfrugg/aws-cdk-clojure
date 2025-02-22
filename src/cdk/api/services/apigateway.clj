(ns cdk.api.services.apigateway
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.apigateway package. "
  (:require [cdk.api :refer [asset-hash-type
                             ignore-mode
                             removal-policy
                             symlink-follow-mode]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.apigateway AccessLogDestinationConfig$Builder
                                                       AddApiKeyOptions$Builder
                                                       ApiDefinitionConfig$Builder
                                                       ApiDefinitionS3Location$Builder
                                                       ApiKey$Builder
                                                       ApiKeyOptions$Builder
                                                       ApiKeyProps$Builder
                                                       ApiKeySourceType
                                                       ApiMappingOptions$Builder
                                                       AssetApiDefinition$Builder
                                                       AuthorizationType
                                                       AwsIntegration$Builder
                                                       AwsIntegrationProps$Builder
                                                       BasePathMapping$Builder
                                                       BasePathMappingOptions$Builder
                                                       BasePathMappingProps$Builder
                                                       CfnAccount$Builder
                                                       CfnAccountProps$Builder
                                                       CfnApiKey$Builder
                                                       CfnApiKey$StageKeyProperty$Builder
                                                       CfnApiKeyProps$Builder
                                                       CfnAuthorizer$Builder
                                                       CfnAuthorizerProps$Builder
                                                       CfnBasePathMapping$Builder
                                                       CfnBasePathMappingProps$Builder
                                                       CfnClientCertificate$Builder
                                                       CfnClientCertificateProps$Builder
                                                       CfnDeployment$AccessLogSettingProperty$Builder
                                                       CfnDeployment$Builder
                                                       CfnDeployment$CanarySettingProperty$Builder
                                                       CfnDeployment$DeploymentCanarySettingsProperty$Builder
                                                       CfnDeployment$MethodSettingProperty$Builder
                                                       CfnDeployment$StageDescriptionProperty$Builder
                                                       CfnDeploymentProps$Builder
                                                       CfnDocumentationPart$Builder
                                                       CfnDocumentationPart$LocationProperty$Builder
                                                       CfnDocumentationPartProps$Builder
                                                       CfnDocumentationVersion$Builder
                                                       CfnDocumentationVersionProps$Builder
                                                       CfnDomainName$Builder
                                                       CfnDomainName$EndpointConfigurationProperty$Builder
                                                       CfnDomainName$MutualTlsAuthenticationProperty$Builder
                                                       CfnDomainNameProps$Builder
                                                       CfnGatewayResponse$Builder
                                                       CfnGatewayResponseProps$Builder
                                                       CfnMethod$Builder
                                                       CfnMethod$IntegrationProperty$Builder
                                                       CfnMethod$IntegrationResponseProperty$Builder
                                                       CfnMethod$MethodResponseProperty$Builder
                                                       CfnMethodProps$Builder
                                                       CfnModel$Builder
                                                       CfnModelProps$Builder
                                                       CfnRequestValidator$Builder
                                                       CfnRequestValidatorProps$Builder
                                                       CfnResource$Builder
                                                       CfnResourceProps$Builder
                                                       CfnRestApi$Builder
                                                       CfnRestApi$EndpointConfigurationProperty$Builder
                                                       CfnRestApi$S3LocationProperty$Builder
                                                       CfnRestApiProps$Builder
                                                       CfnStage$AccessLogSettingProperty$Builder
                                                       CfnStage$Builder
                                                       CfnStage$CanarySettingProperty$Builder
                                                       CfnStage$MethodSettingProperty$Builder
                                                       CfnStageProps$Builder
                                                       CfnUsagePlan$ApiStageProperty$Builder
                                                       CfnUsagePlan$Builder
                                                       CfnUsagePlan$QuotaSettingsProperty$Builder
                                                       CfnUsagePlan$ThrottleSettingsProperty$Builder
                                                       CfnUsagePlanKey$Builder
                                                       CfnUsagePlanKeyProps$Builder
                                                       CfnUsagePlanProps$Builder
                                                       CfnVpcLink$Builder
                                                       CfnVpcLinkProps$Builder
                                                       CognitoUserPoolsAuthorizer$Builder
                                                       CognitoUserPoolsAuthorizerProps$Builder
                                                       ConnectionType
                                                       ContentHandling
                                                       CorsOptions$Builder
                                                       Deployment$Builder
                                                       DeploymentProps$Builder
                                                       DomainName$Builder
                                                       DomainNameAttributes$Builder
                                                       DomainNameOptions$Builder
                                                       DomainNameProps$Builder
                                                       EndpointConfiguration$Builder
                                                       EndpointType
                                                       GatewayResponse$Builder
                                                       GatewayResponseOptions$Builder
                                                       GatewayResponseProps$Builder
                                                       HttpIntegration$Builder
                                                       HttpIntegrationProps$Builder
                                                       Integration$Builder
                                                       IntegrationConfig$Builder
                                                       IntegrationOptions$Builder
                                                       IntegrationProps$Builder
                                                       IntegrationResponse$Builder
                                                       IntegrationType
                                                       JsonSchema$Builder
                                                       JsonSchemaType
                                                       JsonSchemaVersion
                                                       JsonWithStandardFieldProps$Builder
                                                       LambdaAuthorizerProps$Builder
                                                       LambdaIntegration$Builder
                                                       LambdaIntegrationOptions$Builder
                                                       LambdaRestApi$Builder
                                                       LambdaRestApiProps$Builder
                                                       MTLSConfig$Builder
                                                       Method$Builder
                                                       MethodDeploymentOptions$Builder
                                                       MethodLoggingLevel
                                                       MethodOptions$Builder
                                                       MethodProps$Builder
                                                       MethodResponse$Builder
                                                       MockIntegration$Builder
                                                       Model$Builder
                                                       ModelOptions$Builder
                                                       ModelProps$Builder
                                                       PassthroughBehavior
                                                       Period
                                                       ProxyResource$Builder
                                                       ProxyResourceOptions$Builder
                                                       ProxyResourceProps$Builder
                                                       QuotaSettings$Builder
                                                       RateLimitedApiKey$Builder
                                                       RateLimitedApiKeyProps$Builder
                                                       RequestAuthorizer$Builder
                                                       RequestAuthorizerProps$Builder
                                                       RequestContext$Builder
                                                       RequestValidator$Builder
                                                       RequestValidatorOptions$Builder
                                                       RequestValidatorProps$Builder
                                                       Resource$Builder
                                                       ResourceAttributes$Builder
                                                       ResourceOptions$Builder
                                                       ResourceProps$Builder
                                                       RestApi$Builder
                                                       RestApiAttributes$Builder
                                                       RestApiBaseProps$Builder
                                                       RestApiProps$Builder
                                                       SagemakerIntegration$Builder
                                                       SagemakerIntegrationOptions$Builder
                                                       SecurityPolicy
                                                       SpecRestApi$Builder
                                                       SpecRestApiProps$Builder
                                                       Stage$Builder
                                                       StageAttributes$Builder
                                                       StageOptions$Builder
                                                       StageProps$Builder
                                                       StepFunctionsExecutionIntegrationOptions$Builder
                                                       StepFunctionsRestApi$Builder
                                                       StepFunctionsRestApiProps$Builder
                                                       ThrottleSettings$Builder
                                                       ThrottlingPerMethod$Builder
                                                       TokenAuthorizer$Builder
                                                       TokenAuthorizerProps$Builder
                                                       UsagePlan$Builder
                                                       UsagePlanPerApiStage$Builder
                                                       UsagePlanProps$Builder
                                                       VpcLink$Builder
                                                       VpcLinkProps$Builder]))


(defn api-key-source-type
  "The `api-key-source-type` function data interprets values in the provided config data into a 
`ApiKeySourceType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ApiKeySourceType` - the value is returned.
* is `:authorizer` - `ApiKeySourceType/AUTHORIZER` is returned
* is `:header` - `ApiKeySourceType/HEADER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ApiKeySourceType data) data
      (= :authorizer data) ApiKeySourceType/AUTHORIZER
      (= :header data) ApiKeySourceType/HEADER)))


(defn authorization-type
  "The `authorization-type` function data interprets values in the provided config data into a 
`AuthorizationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AuthorizationType` - the value is returned.
* is `:none` - `AuthorizationType/NONE` is returned
* is `:iam` - `AuthorizationType/IAM` is returned
* is `:cognito` - `AuthorizationType/COGNITO` is returned
* is `:custom` - `AuthorizationType/CUSTOM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AuthorizationType data) data
      (= :none data) AuthorizationType/NONE
      (= :iam data) AuthorizationType/IAM
      (= :cognito data) AuthorizationType/COGNITO
      (= :custom data) AuthorizationType/CUSTOM)))


(defn connection-type
  "The `connection-type` function data interprets values in the provided config data into a 
`ConnectionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ConnectionType` - the value is returned.
* is `:vpc-link` - `ConnectionType/VPC_LINK` is returned
* is `:internet` - `ConnectionType/INTERNET` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ConnectionType data) data
      (= :vpc-link data) ConnectionType/VPC_LINK
      (= :internet data) ConnectionType/INTERNET)))


(defn content-handling
  "The `content-handling` function data interprets values in the provided config data into a 
`ContentHandling` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ContentHandling` - the value is returned.
* is `:convert-to-binary` - `ContentHandling/CONVERT_TO_BINARY` is returned
* is `:convert-to-text` - `ContentHandling/CONVERT_TO_TEXT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ContentHandling data) data
      (= :convert-to-binary data) ContentHandling/CONVERT_TO_BINARY
      (= :convert-to-text data) ContentHandling/CONVERT_TO_TEXT)))


(defn endpoint-type
  "The `endpoint-type` function data interprets values in the provided config data into a 
`EndpointType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EndpointType` - the value is returned.
* is `:edge` - `EndpointType/EDGE` is returned
* is `:private` - `EndpointType/PRIVATE` is returned
* is `:regional` - `EndpointType/REGIONAL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EndpointType data) data
      (= :edge data) EndpointType/EDGE
      (= :private data) EndpointType/PRIVATE
      (= :regional data) EndpointType/REGIONAL)))


(defn integration-type
  "The `integration-type` function data interprets values in the provided config data into a 
`IntegrationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IntegrationType` - the value is returned.
* is `:http-proxy` - `IntegrationType/HTTP_PROXY` is returned
* is `:mock` - `IntegrationType/MOCK` is returned
* is `:aws` - `IntegrationType/AWS` is returned
* is `:aws-proxy` - `IntegrationType/AWS_PROXY` is returned
* is `:http` - `IntegrationType/HTTP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IntegrationType data) data
      (= :http-proxy data) IntegrationType/HTTP_PROXY
      (= :mock data) IntegrationType/MOCK
      (= :aws data) IntegrationType/AWS
      (= :aws-proxy data) IntegrationType/AWS_PROXY
      (= :http data) IntegrationType/HTTP)))


(defn json-schema-type
  "The `json-schema-type` function data interprets values in the provided config data into a 
`JsonSchemaType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `JsonSchemaType` - the value is returned.
* is `:array` - `JsonSchemaType/ARRAY` is returned
* is `:number` - `JsonSchemaType/NUMBER` is returned
* is `:null` - `JsonSchemaType/NULL` is returned
* is `:boolean` - `JsonSchemaType/BOOLEAN` is returned
* is `:integer` - `JsonSchemaType/INTEGER` is returned
* is `:object` - `JsonSchemaType/OBJECT` is returned
* is `:string` - `JsonSchemaType/STRING` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? JsonSchemaType data) data
      (= :array data) JsonSchemaType/ARRAY
      (= :number data) JsonSchemaType/NUMBER
      (= :null data) JsonSchemaType/NULL
      (= :boolean data) JsonSchemaType/BOOLEAN
      (= :integer data) JsonSchemaType/INTEGER
      (= :object data) JsonSchemaType/OBJECT
      (= :string data) JsonSchemaType/STRING)))


(defn json-schema-version
  "The `json-schema-version` function data interprets values in the provided config data into a 
`JsonSchemaVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `JsonSchemaVersion` - the value is returned.
* is `:draft4` - `JsonSchemaVersion/DRAFT4` is returned
* is `:draft7` - `JsonSchemaVersion/DRAFT7` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? JsonSchemaVersion data) data
      (= :draft4 data) JsonSchemaVersion/DRAFT4
      (= :draft7 data) JsonSchemaVersion/DRAFT7)))


(defn method-logging-level
  "The `method-logging-level` function data interprets values in the provided config data into a 
`MethodLoggingLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MethodLoggingLevel` - the value is returned.
* is `:off` - `MethodLoggingLevel/OFF` is returned
* is `:info` - `MethodLoggingLevel/INFO` is returned
* is `:error` - `MethodLoggingLevel/ERROR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MethodLoggingLevel data) data
      (= :off data) MethodLoggingLevel/OFF
      (= :info data) MethodLoggingLevel/INFO
      (= :error data) MethodLoggingLevel/ERROR)))


(defn passthrough-behavior
  "The `passthrough-behavior` function data interprets values in the provided config data into a 
`PassthroughBehavior` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PassthroughBehavior` - the value is returned.
* is `:never` - `PassthroughBehavior/NEVER` is returned
* is `:when-no-match` - `PassthroughBehavior/WHEN_NO_MATCH` is returned
* is `:when-no-templates` - `PassthroughBehavior/WHEN_NO_TEMPLATES` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PassthroughBehavior data) data
      (= :never data) PassthroughBehavior/NEVER
      (= :when-no-match data) PassthroughBehavior/WHEN_NO_MATCH
      (= :when-no-templates data) PassthroughBehavior/WHEN_NO_TEMPLATES)))


(defn period
  "The `period` function data interprets values in the provided config data into a 
`Period` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Period` - the value is returned.
* is `:day` - `Period/DAY` is returned
* is `:week` - `Period/WEEK` is returned
* is `:month` - `Period/MONTH` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Period data) data
      (= :day data) Period/DAY
      (= :week data) Period/WEEK
      (= :month data) Period/MONTH)))


(defn security-policy
  "The `security-policy` function data interprets values in the provided config data into a 
`SecurityPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SecurityPolicy` - the value is returned.
* is `:tls-1-0` - `SecurityPolicy/TLS_1_0` is returned
* is `:tls-1-2` - `SecurityPolicy/TLS_1_2` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SecurityPolicy data) data
      (= :tls-1-0 data) SecurityPolicy/TLS_1_0
      (= :tls-1-2 data) SecurityPolicy/TLS_1_2)))


(defn access-log-destination-config-builder
  "The access-log-destination-config-builder function buildes out new instances of 
AccessLogDestinationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |"
  [stack id config]
  (let [builder (AccessLogDestinationConfig$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (.build builder)))


(defn add-api-key-options-builder
  "The add-api-key-options-builder function buildes out new instances of 
AddApiKeyOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrideLogicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:override-logical-id` |"
  [stack id config]
  (let [builder (AddApiKeyOptions$Builder.)]
    (when-let [data (lookup-entry config id :override-logical-id)]
      (. builder overrideLogicalId data))
    (.build builder)))


(defn api-definition-config-builder
  "The api-definition-config-builder function buildes out new instances of 
ApiDefinitionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineDefinition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:inline-definition` |
| `s3Location` | software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (ApiDefinitionConfig$Builder.)]
    (when-let [data (lookup-entry config id :inline-definition)]
      (. builder inlineDefinition data))
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn api-definition-s3-location-builder
  "The api-definition-s3-location-builder function buildes out new instances of 
ApiDefinitionS3Location$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (ApiDefinitionS3Location$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn api-key-builder
  "The api-key-builder function buildes out new instances of 
ApiKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-name` |
| `customerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-id` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `generateDistinctId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-distinct-id` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (ApiKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-key-name)]
      (. builder apiKeyName data))
    (when-let [data (lookup-entry config id :customer-id)]
      (. builder customerId data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :generate-distinct-id)]
      (. builder generateDistinctId data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn api-key-options-builder
  "The api-key-options-builder function buildes out new instances of 
ApiKeyOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-name` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (ApiKeyOptions$Builder.)]
    (when-let [data (lookup-entry config id :api-key-name)]
      (. builder apiKeyName data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn api-key-props-builder
  "The api-key-props-builder function buildes out new instances of 
ApiKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-name` |
| `customerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-id` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `generateDistinctId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-distinct-id` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (ApiKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :api-key-name)]
      (. builder apiKeyName data))
    (when-let [data (lookup-entry config id :customer-id)]
      (. builder customerId data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :generate-distinct-id)]
      (. builder generateDistinctId data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn api-mapping-options-builder
  "The api-mapping-options-builder function buildes out new instances of 
ApiMappingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |"
  [stack id config]
  (let [builder (ApiMappingOptions$Builder.)]
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (.build builder)))


(defn asset-api-definition-builder
  "The asset-api-definition-builder function buildes out new instances of 
AssetApiDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |"
  [stack id config ^java.lang.String path]
  (let [builder (AssetApiDefinition$Builder/create ^java.lang.String path)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (when-let [data (lookup-entry config id :deploy-time)]
      (. builder deployTime data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (.build builder)))


(defn aws-integration-builder
  "The aws-integration-builder function buildes out new instances of 
AwsIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `actionParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:action-parameters` |
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `subdomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdomain` |"
  [stack id config]
  (let [builder (AwsIntegration$Builder/create)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :action-parameters)]
      (. builder actionParameters data))
    (when-let [data (lookup-entry config id :integration-http-method)]
      (. builder integrationHttpMethod data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :proxy)]
      (. builder proxy data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :subdomain)]
      (. builder subdomain data))
    (.build builder)))


(defn aws-integration-props-builder
  "The aws-integration-props-builder function buildes out new instances of 
AwsIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `actionParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:action-parameters` |
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `subdomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdomain` |"
  [stack id config]
  (let [builder (AwsIntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :action-parameters)]
      (. builder actionParameters data))
    (when-let [data (lookup-entry config id :integration-http-method)]
      (. builder integrationHttpMethod data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :proxy)]
      (. builder proxy data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :subdomain)]
      (. builder subdomain data))
    (.build builder)))


(defn base-path-mapping-builder
  "The base-path-mapping-builder function buildes out new instances of 
BasePathMapping$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachToStage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:attach-to-stage` |
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `domainName` | software.amazon.awscdk.services.apigateway.IDomainName | [[cdk.support/lookup-entry]] | `:domain-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `stage` | software.amazon.awscdk.services.apigateway.Stage | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (BasePathMapping$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attach-to-stage)]
      (. builder attachToStage data))
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (.build builder)))


(defn base-path-mapping-options-builder
  "The base-path-mapping-options-builder function buildes out new instances of 
BasePathMappingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachToStage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:attach-to-stage` |
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `stage` | software.amazon.awscdk.services.apigateway.Stage | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (BasePathMappingOptions$Builder.)]
    (when-let [data (lookup-entry config id :attach-to-stage)]
      (. builder attachToStage data))
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (.build builder)))


(defn base-path-mapping-props-builder
  "The base-path-mapping-props-builder function buildes out new instances of 
BasePathMappingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachToStage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:attach-to-stage` |
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `domainName` | software.amazon.awscdk.services.apigateway.IDomainName | [[cdk.support/lookup-entry]] | `:domain-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `stage` | software.amazon.awscdk.services.apigateway.Stage | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (BasePathMappingProps$Builder.)]
    (when-let [data (lookup-entry config id :attach-to-stage)]
      (. builder attachToStage data))
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (.build builder)))


(defn cfn-account-builder
  "The cfn-account-builder function buildes out new instances of 
CfnAccount$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-role-arn` |"
  [stack id config]
  (let [builder (CfnAccount$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cloud-watch-role-arn)]
      (. builder cloudWatchRoleArn data))
    (.build builder)))


(defn cfn-account-props-builder
  "The cfn-account-props-builder function buildes out new instances of 
CfnAccountProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-role-arn` |"
  [stack id config]
  (let [builder (CfnAccountProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-role-arn)]
      (. builder cloudWatchRoleArn data))
    (.build builder)))


(defn cfn-api-key-builder
  "The cfn-api-key-builder function buildes out new instances of 
CfnApiKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `generateDistinctId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-distinct-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stageKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:stage-keys` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnApiKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :customer-id)]
      (. builder customerId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :generate-distinct-id)]
      (. builder generateDistinctId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :stage-keys)]
      (. builder stageKeys data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-api-key-props-builder
  "The cfn-api-key-props-builder function buildes out new instances of 
CfnApiKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `generateDistinctId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-distinct-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stageKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:stage-keys` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnApiKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :customer-id)]
      (. builder customerId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :generate-distinct-id)]
      (. builder generateDistinctId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :stage-keys)]
      (. builder stageKeys data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-api-key-stage-key-property-builder
  "The cfn-api-key-stage-key-property-builder function buildes out new instances of 
CfnApiKey$StageKeyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (CfnApiKey$StageKeyProperty$Builder.)]
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn cfn-authorizer-builder
  "The cfn-authorizer-builder function buildes out new instances of 
CfnAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `authorizerCredentials` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-credentials` |
| `authorizerResultTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:authorizer-result-ttl-in-seconds` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `identityValidationExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-validation-expression` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `providerArns` | java.util.List | [[cdk.support/lookup-entry]] | `:provider-arns` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAuthorizer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :authorizer-credentials)]
      (. builder authorizerCredentials data))
    (when-let [data (lookup-entry config id :authorizer-result-ttl-in-seconds)]
      (. builder authorizerResultTtlInSeconds data))
    (when-let [data (lookup-entry config id :authorizer-uri)]
      (. builder authorizerUri data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :identity-validation-expression)]
      (. builder identityValidationExpression data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :provider-arns)]
      (. builder providerArns data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-authorizer-props-builder
  "The cfn-authorizer-props-builder function buildes out new instances of 
CfnAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `authorizerCredentials` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-credentials` |
| `authorizerResultTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:authorizer-result-ttl-in-seconds` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `identityValidationExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-validation-expression` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `providerArns` | java.util.List | [[cdk.support/lookup-entry]] | `:provider-arns` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :authorizer-credentials)]
      (. builder authorizerCredentials data))
    (when-let [data (lookup-entry config id :authorizer-result-ttl-in-seconds)]
      (. builder authorizerResultTtlInSeconds data))
    (when-let [data (lookup-entry config id :authorizer-uri)]
      (. builder authorizerUri data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :identity-validation-expression)]
      (. builder identityValidationExpression data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :provider-arns)]
      (. builder providerArns data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-base-path-mapping-builder
  "The cfn-base-path-mapping-builder function buildes out new instances of 
CfnBasePathMapping$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (CfnBasePathMapping$Builder/create stack id)]
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (.build builder)))


(defn cfn-base-path-mapping-props-builder
  "The cfn-base-path-mapping-props-builder function buildes out new instances of 
CfnBasePathMappingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (CfnBasePathMappingProps$Builder.)]
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (.build builder)))


(defn cfn-client-certificate-builder
  "The cfn-client-certificate-builder function buildes out new instances of 
CfnClientCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClientCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-client-certificate-props-builder
  "The cfn-client-certificate-props-builder function buildes out new instances of 
CfnClientCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClientCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-deployment-access-log-setting-property-builder
  "The cfn-deployment-access-log-setting-property-builder function buildes out new instances of 
CfnDeployment$AccessLogSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |"
  [stack id config]
  (let [builder (CfnDeployment$AccessLogSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (.build builder)))


(defn cfn-deployment-builder
  "The cfn-deployment-builder function buildes out new instances of 
CfnDeployment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentCanarySettings` | software.amazon.awscdk.services.apigateway.CfnDeployment$DeploymentCanarySettingsProperty | [[cdk.support/lookup-entry]] | `:deployment-canary-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stageDescription` | software.amazon.awscdk.services.apigateway.CfnDeployment$StageDescriptionProperty | [[cdk.support/lookup-entry]] | `:stage-description` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (CfnDeployment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deployment-canary-settings)]
      (. builder deploymentCanarySettings data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :stage-description)]
      (. builder stageDescription data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn cfn-deployment-canary-setting-property-builder
  "The cfn-deployment-canary-setting-property-builder function buildes out new instances of 
CfnDeployment$CanarySettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `percentTraffic` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percent-traffic` |
| `stageVariableOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stage-variable-overrides` |
| `useStageCache` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-stage-cache` |"
  [stack id config]
  (let [builder (CfnDeployment$CanarySettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :percent-traffic)]
      (. builder percentTraffic data))
    (when-let [data (lookup-entry config id :stage-variable-overrides)]
      (. builder stageVariableOverrides data))
    (when-let [data (lookup-entry config id :use-stage-cache)]
      (. builder useStageCache data))
    (.build builder)))


(defn cfn-deployment-deployment-canary-settings-property-builder
  "The cfn-deployment-deployment-canary-settings-property-builder function buildes out new instances of 
CfnDeployment$DeploymentCanarySettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `percentTraffic` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percent-traffic` |
| `stageVariableOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:stage-variable-overrides` |
| `useStageCache` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-stage-cache` |"
  [stack id config]
  (let [builder (CfnDeployment$DeploymentCanarySettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :percent-traffic)]
      (. builder percentTraffic data))
    (when-let [data (lookup-entry config id :stage-variable-overrides)]
      (. builder stageVariableOverrides data))
    (when-let [data (lookup-entry config id :use-stage-cache)]
      (. builder useStageCache data))
    (.build builder)))


(defn cfn-deployment-method-setting-property-builder
  "The cfn-deployment-method-setting-property-builder function buildes out new instances of 
CfnDeployment$MethodSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheDataEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-data-encrypted` |
| `cacheTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cache-ttl-in-seconds` |
| `cachingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:caching-enabled` |
| `dataTraceEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `metricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metrics-enabled` |
| `resourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-path` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |"
  [stack id config]
  (let [builder (CfnDeployment$MethodSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :cache-data-encrypted)]
      (. builder cacheDataEncrypted data))
    (when-let [data (lookup-entry config id :cache-ttl-in-seconds)]
      (. builder cacheTtlInSeconds data))
    (when-let [data (lookup-entry config id :caching-enabled)]
      (. builder cachingEnabled data))
    (when-let [data (lookup-entry config id :data-trace-enabled)]
      (. builder dataTraceEnabled data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :logging-level)]
      (. builder loggingLevel data))
    (when-let [data (lookup-entry config id :metrics-enabled)]
      (. builder metricsEnabled data))
    (when-let [data (lookup-entry config id :resource-path)]
      (. builder resourcePath data))
    (when-let [data (lookup-entry config id :throttling-burst-limit)]
      (. builder throttlingBurstLimit data))
    (when-let [data (lookup-entry config id :throttling-rate-limit)]
      (. builder throttlingRateLimit data))
    (.build builder)))


(defn cfn-deployment-props-builder
  "The cfn-deployment-props-builder function buildes out new instances of 
CfnDeploymentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentCanarySettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-canary-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stageDescription` | software.amazon.awscdk.services.apigateway.CfnDeployment$StageDescriptionProperty | [[cdk.support/lookup-entry]] | `:stage-description` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (CfnDeploymentProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-canary-settings)]
      (. builder deploymentCanarySettings data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :stage-description)]
      (. builder stageDescription data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn cfn-deployment-stage-description-property-builder
  "The cfn-deployment-stage-description-property-builder function buildes out new instances of 
CfnDeployment$StageDescriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSetting` | software.amazon.awscdk.services.apigateway.CfnDeployment$AccessLogSettingProperty | [[cdk.support/lookup-entry]] | `:access-log-setting` |
| `cacheClusterEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-cluster-enabled` |
| `cacheClusterSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-cluster-size` |
| `cacheDataEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-data-encrypted` |
| `cacheTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cache-ttl-in-seconds` |
| `cachingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caching-enabled` |
| `canarySetting` | software.amazon.awscdk.services.apigateway.CfnDeployment$CanarySettingProperty | [[cdk.support/lookup-entry]] | `:canary-setting` |
| `clientCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-id` |
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `methodSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:method-settings` |
| `metricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metrics-enabled` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnDeployment$StageDescriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-log-setting)]
      (. builder accessLogSetting data))
    (when-let [data (lookup-entry config id :cache-cluster-enabled)]
      (. builder cacheClusterEnabled data))
    (when-let [data (lookup-entry config id :cache-cluster-size)]
      (. builder cacheClusterSize data))
    (when-let [data (lookup-entry config id :cache-data-encrypted)]
      (. builder cacheDataEncrypted data))
    (when-let [data (lookup-entry config id :cache-ttl-in-seconds)]
      (. builder cacheTtlInSeconds data))
    (when-let [data (lookup-entry config id :caching-enabled)]
      (. builder cachingEnabled data))
    (when-let [data (lookup-entry config id :canary-setting)]
      (. builder canarySetting data))
    (when-let [data (lookup-entry config id :client-certificate-id)]
      (. builder clientCertificateId data))
    (when-let [data (lookup-entry config id :data-trace-enabled)]
      (. builder dataTraceEnabled data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :documentation-version)]
      (. builder documentationVersion data))
    (when-let [data (lookup-entry config id :logging-level)]
      (. builder loggingLevel data))
    (when-let [data (lookup-entry config id :method-settings)]
      (. builder methodSettings data))
    (when-let [data (lookup-entry config id :metrics-enabled)]
      (. builder metricsEnabled data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :throttling-burst-limit)]
      (. builder throttlingBurstLimit data))
    (when-let [data (lookup-entry config id :throttling-rate-limit)]
      (. builder throttlingRateLimit data))
    (when-let [data (lookup-entry config id :tracing-enabled)]
      (. builder tracingEnabled data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-documentation-part-builder
  "The cfn-documentation-part-builder function buildes out new instances of 
CfnDocumentationPart$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.apigateway.CfnDocumentationPart$LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `properties` | java.lang.String | [[cdk.support/lookup-entry]] | `:properties` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnDocumentationPart$Builder/create stack id)]
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-documentation-part-location-property-builder
  "The cfn-documentation-part-location-property-builder function buildes out new instances of 
CfnDocumentationPart$LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDocumentationPart$LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-documentation-part-props-builder
  "The cfn-documentation-part-props-builder function buildes out new instances of 
CfnDocumentationPartProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.apigateway.CfnDocumentationPart$LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `properties` | java.lang.String | [[cdk.support/lookup-entry]] | `:properties` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnDocumentationPartProps$Builder.)]
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-documentation-version-builder
  "The cfn-documentation-version-builder function buildes out new instances of 
CfnDocumentationVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnDocumentationVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :documentation-version)]
      (. builder documentationVersion data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-documentation-version-props-builder
  "The cfn-documentation-version-props-builder function buildes out new instances of 
CfnDocumentationVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnDocumentationVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :documentation-version)]
      (. builder documentationVersion data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-domain-name-builder
  "The cfn-domain-name-builder function buildes out new instances of 
CfnDomainName$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `ownershipVerificationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ownership-verification-certificate-arn` |
| `regionalCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:regional-certificate-arn` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDomainName$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :mutual-tls-authentication)]
      (. builder mutualTlsAuthentication data))
    (when-let [data (lookup-entry config id :ownership-verification-certificate-arn)]
      (. builder ownershipVerificationCertificateArn data))
    (when-let [data (lookup-entry config id :regional-certificate-arn)]
      (. builder regionalCertificateArn data))
    (when-let [data (lookup-entry config id :security-policy)]
      (. builder securityPolicy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-domain-name-endpoint-configuration-property-builder
  "The cfn-domain-name-endpoint-configuration-property-builder function buildes out new instances of 
CfnDomainName$EndpointConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `types` | java.util.List | [[cdk.support/lookup-entry]] | `:types` |"
  [stack id config]
  (let [builder (CfnDomainName$EndpointConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :types)]
      (. builder types data))
    (.build builder)))


(defn cfn-domain-name-mutual-tls-authentication-property-builder
  "The cfn-domain-name-mutual-tls-authentication-property-builder function buildes out new instances of 
CfnDomainName$MutualTlsAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `truststoreUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-uri` |
| `truststoreVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-version` |"
  [stack id config]
  (let [builder (CfnDomainName$MutualTlsAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :truststore-uri)]
      (. builder truststoreUri data))
    (when-let [data (lookup-entry config id :truststore-version)]
      (. builder truststoreVersion data))
    (.build builder)))


(defn cfn-domain-name-props-builder
  "The cfn-domain-name-props-builder function buildes out new instances of 
CfnDomainNameProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `ownershipVerificationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ownership-verification-certificate-arn` |
| `regionalCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:regional-certificate-arn` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDomainNameProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :mutual-tls-authentication)]
      (. builder mutualTlsAuthentication data))
    (when-let [data (lookup-entry config id :ownership-verification-certificate-arn)]
      (. builder ownershipVerificationCertificateArn data))
    (when-let [data (lookup-entry config id :regional-certificate-arn)]
      (. builder regionalCertificateArn data))
    (when-let [data (lookup-entry config id :security-policy)]
      (. builder securityPolicy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-gateway-response-builder
  "The cfn-gateway-response-builder function buildes out new instances of 
CfnGatewayResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-templates` |
| `responseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-type` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnGatewayResponse$Builder/create stack id)]
    (when-let [data (lookup-entry config id :response-parameters)]
      (. builder responseParameters data))
    (when-let [data (lookup-entry config id :response-templates)]
      (. builder responseTemplates data))
    (when-let [data (lookup-entry config id :response-type)]
      (. builder responseType data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-gateway-response-props-builder
  "The cfn-gateway-response-props-builder function buildes out new instances of 
CfnGatewayResponseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-templates` |
| `responseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-type` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnGatewayResponseProps$Builder.)]
    (when-let [data (lookup-entry config id :response-parameters)]
      (. builder responseParameters data))
    (when-let [data (lookup-entry config id :response-templates)]
      (. builder responseTemplates data))
    (when-let [data (lookup-entry config id :response-type)]
      (. builder responseType data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-method-builder
  "The cfn-method-builder function buildes out new instances of 
CfnMethod$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `integration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:integration` |
| `methodResponses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:method-responses` |
| `operationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-name` |
| `requestModels` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-models` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestValidatorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-validator-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnMethod$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-key-required)]
      (. builder apiKeyRequired data))
    (when-let [data (lookup-entry config id :authorization-scopes)]
      (. builder authorizationScopes data))
    (when-let [data (lookup-entry config id :authorization-type)]
      (. builder authorizationType data))
    (when-let [data (lookup-entry config id :authorizer-id)]
      (. builder authorizerId data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :integration)]
      (. builder integration data))
    (when-let [data (lookup-entry config id :method-responses)]
      (. builder methodResponses data))
    (when-let [data (lookup-entry config id :operation-name)]
      (. builder operationName data))
    (when-let [data (lookup-entry config id :request-models)]
      (. builder requestModels data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-validator-id)]
      (. builder requestValidatorId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-method-integration-property-builder
  "The cfn-method-integration-property-builder function buildes out new instances of 
CfnMethod$IntegrationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheKeyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-key-parameters` |
| `cacheNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-namespace` |
| `connectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-id` |
| `connectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-type` |
| `contentHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-handling` |
| `credentials` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials` |
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `integrationResponses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:integration-responses` |
| `passthroughBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:passthrough-behavior` |
| `requestParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-templates` |
| `timeoutInMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-millis` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnMethod$IntegrationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cache-key-parameters)]
      (. builder cacheKeyParameters data))
    (when-let [data (lookup-entry config id :cache-namespace)]
      (. builder cacheNamespace data))
    (when-let [data (lookup-entry config id :connection-id)]
      (. builder connectionId data))
    (when-let [data (lookup-entry config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (lookup-entry config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :integration-http-method)]
      (. builder integrationHttpMethod data))
    (when-let [data (lookup-entry config id :integration-responses)]
      (. builder integrationResponses data))
    (when-let [data (lookup-entry config id :passthrough-behavior)]
      (. builder passthroughBehavior data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-templates)]
      (. builder requestTemplates data))
    (when-let [data (lookup-entry config id :timeout-in-millis)]
      (. builder timeoutInMillis data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-method-integration-response-property-builder
  "The cfn-method-integration-response-property-builder function buildes out new instances of 
CfnMethod$IntegrationResponseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-handling` |
| `responseParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-templates` |
| `selectionPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-pattern` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnMethod$IntegrationResponseProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :response-parameters)]
      (. builder responseParameters data))
    (when-let [data (lookup-entry config id :response-templates)]
      (. builder responseTemplates data))
    (when-let [data (lookup-entry config id :selection-pattern)]
      (. builder selectionPattern data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-method-method-response-property-builder
  "The cfn-method-method-response-property-builder function buildes out new instances of 
CfnMethod$MethodResponseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseModels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-models` |
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnMethod$MethodResponseProperty$Builder.)]
    (when-let [data (lookup-entry config id :response-models)]
      (. builder responseModels data))
    (when-let [data (lookup-entry config id :response-parameters)]
      (. builder responseParameters data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-method-props-builder
  "The cfn-method-props-builder function buildes out new instances of 
CfnMethodProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `integration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:integration` |
| `methodResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:method-responses` |
| `operationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-name` |
| `requestModels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-models` |
| `requestParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestValidatorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-validator-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnMethodProps$Builder.)]
    (when-let [data (lookup-entry config id :api-key-required)]
      (. builder apiKeyRequired data))
    (when-let [data (lookup-entry config id :authorization-scopes)]
      (. builder authorizationScopes data))
    (when-let [data (lookup-entry config id :authorization-type)]
      (. builder authorizationType data))
    (when-let [data (lookup-entry config id :authorizer-id)]
      (. builder authorizerId data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :integration)]
      (. builder integration data))
    (when-let [data (lookup-entry config id :method-responses)]
      (. builder methodResponses data))
    (when-let [data (lookup-entry config id :operation-name)]
      (. builder operationName data))
    (when-let [data (lookup-entry config id :request-models)]
      (. builder requestModels data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-validator-id)]
      (. builder requestValidatorId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-model-builder
  "The cfn-model-builder function buildes out new instances of 
CfnModel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (CfnModel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn cfn-model-props-builder
  "The cfn-model-props-builder function buildes out new instances of 
CfnModelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (CfnModelProps$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn cfn-request-validator-builder
  "The cfn-request-validator-builder function buildes out new instances of 
CfnRequestValidator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `validateRequestBody` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |"
  [stack id config]
  (let [builder (CfnRequestValidator$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :validate-request-body)]
      (. builder validateRequestBody data))
    (when-let [data (lookup-entry config id :validate-request-parameters)]
      (. builder validateRequestParameters data))
    (.build builder)))


(defn cfn-request-validator-props-builder
  "The cfn-request-validator-props-builder function buildes out new instances of 
CfnRequestValidatorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `validateRequestBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |"
  [stack id config]
  (let [builder (CfnRequestValidatorProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :validate-request-body)]
      (. builder validateRequestBody data))
    (when-let [data (lookup-entry config id :validate-request-parameters)]
      (. builder validateRequestParameters data))
    (.build builder)))


(defn cfn-resource-builder
  "The cfn-resource-builder function buildes out new instances of 
CfnResource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-id` |
| `pathPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-part` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnResource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :parent-id)]
      (. builder parentId data))
    (when-let [data (lookup-entry config id :path-part)]
      (. builder pathPart data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-resource-props-builder
  "The cfn-resource-props-builder function buildes out new instances of 
CfnResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-id` |
| `pathPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-part` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnResourceProps$Builder.)]
    (when-let [data (lookup-entry config id :parent-id)]
      (. builder parentId data))
    (when-let [data (lookup-entry config id :path-part)]
      (. builder pathPart data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-rest-api-builder
  "The cfn-rest-api-builder function buildes out new instances of 
CfnRestApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-source-type` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `body` | java.lang.Object | [[cdk.support/lookup-entry]] | `:body` |
| `bodyS3Location` | software.amazon.awscdk.services.apigateway.CfnRestApi$S3LocationProperty | [[cdk.support/lookup-entry]] | `:body-s3-location` |
| `cloneFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:clone-from` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `endpointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRestApi$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-key-source-type)]
      (. builder apiKeySourceType data))
    (when-let [data (lookup-entry config id :binary-media-types)]
      (. builder binaryMediaTypes data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :body-s3-location)]
      (. builder bodyS3Location data))
    (when-let [data (lookup-entry config id :clone-from)]
      (. builder cloneFrom data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :minimum-compression-size)]
      (. builder minimumCompressionSize data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-rest-api-endpoint-configuration-property-builder
  "The cfn-rest-api-endpoint-configuration-property-builder function buildes out new instances of 
CfnRestApi$EndpointConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `types` | java.util.List | [[cdk.support/lookup-entry]] | `:types` |
| `vpcEndpointIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoint-ids` |"
  [stack id config]
  (let [builder (CfnRestApi$EndpointConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :types)]
      (. builder types data))
    (when-let [data (lookup-entry config id :vpc-endpoint-ids)]
      (. builder vpcEndpointIds data))
    (.build builder)))


(defn cfn-rest-api-props-builder
  "The cfn-rest-api-props-builder function buildes out new instances of 
CfnRestApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-source-type` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `body` | java.lang.Object | [[cdk.support/lookup-entry]] | `:body` |
| `bodyS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:body-s3-location` |
| `cloneFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:clone-from` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `endpointConfiguration` | software.amazon.awscdk.services.apigateway.CfnRestApi$EndpointConfigurationProperty | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `failOnWarnings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRestApiProps$Builder.)]
    (when-let [data (lookup-entry config id :api-key-source-type)]
      (. builder apiKeySourceType data))
    (when-let [data (lookup-entry config id :binary-media-types)]
      (. builder binaryMediaTypes data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :body-s3-location)]
      (. builder bodyS3Location data))
    (when-let [data (lookup-entry config id :clone-from)]
      (. builder cloneFrom data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :minimum-compression-size)]
      (. builder minimumCompressionSize data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-rest-api-s3-location-property-builder
  "The cfn-rest-api-s3-location-property-builder function buildes out new instances of 
CfnRestApi$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `eTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:e-tag` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnRestApi$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :e-tag)]
      (. builder eTag data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-stage-access-log-setting-property-builder
  "The cfn-stage-access-log-setting-property-builder function buildes out new instances of 
CfnStage$AccessLogSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |"
  [stack id config]
  (let [builder (CfnStage$AccessLogSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (.build builder)))


(defn cfn-stage-builder
  "The cfn-stage-builder function buildes out new instances of 
CfnStage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSetting` | software.amazon.awscdk.services.apigateway.CfnStage$AccessLogSettingProperty | [[cdk.support/lookup-entry]] | `:access-log-setting` |
| `cacheClusterEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-cluster-enabled` |
| `cacheClusterSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-cluster-size` |
| `canarySetting` | software.amazon.awscdk.services.apigateway.CfnStage$CanarySettingProperty | [[cdk.support/lookup-entry]] | `:canary-setting` |
| `clientCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-id` |
| `deploymentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `methodSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:method-settings` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tracingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnStage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-log-setting)]
      (. builder accessLogSetting data))
    (when-let [data (lookup-entry config id :cache-cluster-enabled)]
      (. builder cacheClusterEnabled data))
    (when-let [data (lookup-entry config id :cache-cluster-size)]
      (. builder cacheClusterSize data))
    (when-let [data (lookup-entry config id :canary-setting)]
      (. builder canarySetting data))
    (when-let [data (lookup-entry config id :client-certificate-id)]
      (. builder clientCertificateId data))
    (when-let [data (lookup-entry config id :deployment-id)]
      (. builder deploymentId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :documentation-version)]
      (. builder documentationVersion data))
    (when-let [data (lookup-entry config id :method-settings)]
      (. builder methodSettings data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracing-enabled)]
      (. builder tracingEnabled data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-stage-canary-setting-property-builder
  "The cfn-stage-canary-setting-property-builder function buildes out new instances of 
CfnStage$CanarySettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-id` |
| `percentTraffic` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percent-traffic` |
| `stageVariableOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stage-variable-overrides` |
| `useStageCache` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-stage-cache` |"
  [stack id config]
  (let [builder (CfnStage$CanarySettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :deployment-id)]
      (. builder deploymentId data))
    (when-let [data (lookup-entry config id :percent-traffic)]
      (. builder percentTraffic data))
    (when-let [data (lookup-entry config id :stage-variable-overrides)]
      (. builder stageVariableOverrides data))
    (when-let [data (lookup-entry config id :use-stage-cache)]
      (. builder useStageCache data))
    (.build builder)))


(defn cfn-stage-method-setting-property-builder
  "The cfn-stage-method-setting-property-builder function buildes out new instances of 
CfnStage$MethodSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheDataEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-data-encrypted` |
| `cacheTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cache-ttl-in-seconds` |
| `cachingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:caching-enabled` |
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `metricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metrics-enabled` |
| `resourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-path` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |"
  [stack id config]
  (let [builder (CfnStage$MethodSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :cache-data-encrypted)]
      (. builder cacheDataEncrypted data))
    (when-let [data (lookup-entry config id :cache-ttl-in-seconds)]
      (. builder cacheTtlInSeconds data))
    (when-let [data (lookup-entry config id :caching-enabled)]
      (. builder cachingEnabled data))
    (when-let [data (lookup-entry config id :data-trace-enabled)]
      (. builder dataTraceEnabled data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :logging-level)]
      (. builder loggingLevel data))
    (when-let [data (lookup-entry config id :metrics-enabled)]
      (. builder metricsEnabled data))
    (when-let [data (lookup-entry config id :resource-path)]
      (. builder resourcePath data))
    (when-let [data (lookup-entry config id :throttling-burst-limit)]
      (. builder throttlingBurstLimit data))
    (when-let [data (lookup-entry config id :throttling-rate-limit)]
      (. builder throttlingRateLimit data))
    (.build builder)))


(defn cfn-stage-props-builder
  "The cfn-stage-props-builder function buildes out new instances of 
CfnStageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSetting` | software.amazon.awscdk.services.apigateway.CfnStage$AccessLogSettingProperty | [[cdk.support/lookup-entry]] | `:access-log-setting` |
| `cacheClusterEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-cluster-enabled` |
| `cacheClusterSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-cluster-size` |
| `canarySetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:canary-setting` |
| `clientCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-id` |
| `deploymentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `methodSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:method-settings` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnStageProps$Builder.)]
    (when-let [data (lookup-entry config id :access-log-setting)]
      (. builder accessLogSetting data))
    (when-let [data (lookup-entry config id :cache-cluster-enabled)]
      (. builder cacheClusterEnabled data))
    (when-let [data (lookup-entry config id :cache-cluster-size)]
      (. builder cacheClusterSize data))
    (when-let [data (lookup-entry config id :canary-setting)]
      (. builder canarySetting data))
    (when-let [data (lookup-entry config id :client-certificate-id)]
      (. builder clientCertificateId data))
    (when-let [data (lookup-entry config id :deployment-id)]
      (. builder deploymentId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :documentation-version)]
      (. builder documentationVersion data))
    (when-let [data (lookup-entry config id :method-settings)]
      (. builder methodSettings data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracing-enabled)]
      (. builder tracingEnabled data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-usage-plan-api-stage-property-builder
  "The cfn-usage-plan-api-stage-property-builder function buildes out new instances of 
CfnUsagePlan$ApiStageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
| `throttle` | java.util.Map | [[cdk.support/lookup-entry]] | `:throttle` |"
  [stack id config]
  (let [builder (CfnUsagePlan$ApiStageProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (.build builder)))


(defn cfn-usage-plan-builder
  "The cfn-usage-plan-builder function buildes out new instances of 
CfnUsagePlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiStages` | java.util.List | [[cdk.support/lookup-entry]] | `:api-stages` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `quota` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:quota` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throttle` | software.amazon.awscdk.services.apigateway.CfnUsagePlan$ThrottleSettingsProperty | [[cdk.support/lookup-entry]] | `:throttle` |
| `usagePlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-plan-name` |"
  [stack id config]
  (let [builder (CfnUsagePlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-stages)]
      (. builder apiStages data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :quota)]
      (. builder quota data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (when-let [data (lookup-entry config id :usage-plan-name)]
      (. builder usagePlanName data))
    (.build builder)))


(defn cfn-usage-plan-key-builder
  "The cfn-usage-plan-key-builder function buildes out new instances of 
CfnUsagePlanKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `usagePlanId` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-plan-id` |"
  [stack id config]
  (let [builder (CfnUsagePlanKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :key-id)]
      (. builder keyId data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (when-let [data (lookup-entry config id :usage-plan-id)]
      (. builder usagePlanId data))
    (.build builder)))


(defn cfn-usage-plan-key-props-builder
  "The cfn-usage-plan-key-props-builder function buildes out new instances of 
CfnUsagePlanKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `usagePlanId` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-plan-id` |"
  [stack id config]
  (let [builder (CfnUsagePlanKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :key-id)]
      (. builder keyId data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (when-let [data (lookup-entry config id :usage-plan-id)]
      (. builder usagePlanId data))
    (.build builder)))


(defn cfn-usage-plan-props-builder
  "The cfn-usage-plan-props-builder function buildes out new instances of 
CfnUsagePlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiStages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-stages` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `quota` | software.amazon.awscdk.services.apigateway.CfnUsagePlan$QuotaSettingsProperty | [[cdk.support/lookup-entry]] | `:quota` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throttle` | software.amazon.awscdk.services.apigateway.CfnUsagePlan$ThrottleSettingsProperty | [[cdk.support/lookup-entry]] | `:throttle` |
| `usagePlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-plan-name` |"
  [stack id config]
  (let [builder (CfnUsagePlanProps$Builder.)]
    (when-let [data (lookup-entry config id :api-stages)]
      (. builder apiStages data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :quota)]
      (. builder quota data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (when-let [data (lookup-entry config id :usage-plan-name)]
      (. builder usagePlanName data))
    (.build builder)))


(defn cfn-usage-plan-quota-settings-property-builder
  "The cfn-usage-plan-quota-settings-property-builder function buildes out new instances of 
CfnUsagePlan$QuotaSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `offset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:offset` |
| `period` | java.lang.String | [[cdk.support/lookup-entry]] | `:period` |"
  [stack id config]
  (let [builder (CfnUsagePlan$QuotaSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :limit)]
      (. builder limit data))
    (when-let [data (lookup-entry config id :offset)]
      (. builder offset data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (.build builder)))


(defn cfn-usage-plan-throttle-settings-property-builder
  "The cfn-usage-plan-throttle-settings-property-builder function buildes out new instances of 
CfnUsagePlan$ThrottleSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `burstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:burst-limit` |
| `rateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit` |"
  [stack id config]
  (let [builder (CfnUsagePlan$ThrottleSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :burst-limit)]
      (. builder burstLimit data))
    (when-let [data (lookup-entry config id :rate-limit)]
      (. builder rateLimit data))
    (.build builder)))


(defn cfn-vpc-link-builder
  "The cfn-vpc-link-builder function buildes out new instances of 
CfnVpcLink$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-arns` |"
  [stack id config]
  (let [builder (CfnVpcLink$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arns)]
      (. builder targetArns data))
    (.build builder)))


(defn cfn-vpc-link-props-builder
  "The cfn-vpc-link-props-builder function buildes out new instances of 
CfnVpcLinkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-arns` |"
  [stack id config]
  (let [builder (CfnVpcLinkProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arns)]
      (. builder targetArns data))
    (.build builder)))


(defn cognito-user-pools-authorizer-builder
  "The cognito-user-pools-authorizer-builder function buildes out new instances of 
CognitoUserPoolsAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `cognitoUserPools` | java.util.List | [[cdk.support/lookup-entry]] | `:cognito-user-pools` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |"
  [stack id config]
  (let [builder (CognitoUserPoolsAuthorizer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :cognito-user-pools)]
      (. builder cognitoUserPools data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (.build builder)))


(defn cognito-user-pools-authorizer-props-builder
  "The cognito-user-pools-authorizer-props-builder function buildes out new instances of 
CognitoUserPoolsAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `cognitoUserPools` | java.util.List | [[cdk.support/lookup-entry]] | `:cognito-user-pools` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |"
  [stack id config]
  (let [builder (CognitoUserPoolsAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :cognito-user-pools)]
      (. builder cognitoUserPools data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (.build builder)))


(defn cors-options-builder
  "The cors-options-builder function buildes out new instances of 
CorsOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-origins` |
| `disableCache` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-cache` |
| `exposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:expose-headers` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |
| `statusCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CorsOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-credentials)]
      (. builder allowCredentials data))
    (when-let [data (lookup-entry config id :allow-headers)]
      (. builder allowHeaders data))
    (when-let [data (lookup-entry config id :allow-methods)]
      (. builder allowMethods data))
    (when-let [data (lookup-entry config id :allow-origins)]
      (. builder allowOrigins data))
    (when-let [data (lookup-entry config id :disable-cache)]
      (. builder disableCache data))
    (when-let [data (lookup-entry config id :expose-headers)]
      (. builder exposeHeaders data))
    (when-let [data (lookup-entry config id :max-age)]
      (. builder maxAge data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn deployment-builder
  "The deployment-builder function buildes out new instances of 
Deployment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (Deployment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn deployment-props-builder
  "The deployment-props-builder function buildes out new instances of 
DeploymentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (DeploymentProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn domain-name-attributes-builder
  "The domain-name-attributes-builder function buildes out new instances of 
DomainNameAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainNameAliasHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name-alias-hosted-zone-id` |
| `domainNameAliasTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name-alias-target` |"
  [stack id config]
  (let [builder (DomainNameAttributes$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-name-alias-hosted-zone-id)]
      (. builder domainNameAliasHostedZoneId data))
    (when-let [data (lookup-entry config id :domain-name-alias-target)]
      (. builder domainNameAliasTarget data))
    (.build builder)))


(defn domain-name-builder
  "The domain-name-builder function buildes out new instances of 
DomainName$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointType` | software.amazon.awscdk.services.apigateway.EndpointType | [[cdk.api.services.apigateway/endpoint-type]] | `:endpoint-type` |
| `mapping` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:mapping` |
| `mtls` | software.amazon.awscdk.services.apigateway.MTLSConfig | [[cdk.support/lookup-entry]] | `:mtls` |
| `securityPolicy` | software.amazon.awscdk.services.apigateway.SecurityPolicy | [[cdk.api.services.apigateway/security-policy]] | `:security-policy` |"
  [stack id config]
  (let [builder (DomainName$Builder/create stack id)]
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (endpoint-type config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :mapping)]
      (. builder mapping data))
    (when-let [data (lookup-entry config id :mtls)]
      (. builder mtls data))
    (when-let [data (security-policy config id :security-policy)]
      (. builder securityPolicy data))
    (.build builder)))


(defn domain-name-options-builder
  "The domain-name-options-builder function buildes out new instances of 
DomainNameOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointType` | software.amazon.awscdk.services.apigateway.EndpointType | [[cdk.api.services.apigateway/endpoint-type]] | `:endpoint-type` |
| `mtls` | software.amazon.awscdk.services.apigateway.MTLSConfig | [[cdk.support/lookup-entry]] | `:mtls` |
| `securityPolicy` | software.amazon.awscdk.services.apigateway.SecurityPolicy | [[cdk.api.services.apigateway/security-policy]] | `:security-policy` |"
  [stack id config]
  (let [builder (DomainNameOptions$Builder.)]
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (endpoint-type config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :mtls)]
      (. builder mtls data))
    (when-let [data (security-policy config id :security-policy)]
      (. builder securityPolicy data))
    (.build builder)))


(defn domain-name-props-builder
  "The domain-name-props-builder function buildes out new instances of 
DomainNameProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointType` | software.amazon.awscdk.services.apigateway.EndpointType | [[cdk.api.services.apigateway/endpoint-type]] | `:endpoint-type` |
| `mapping` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:mapping` |
| `mtls` | software.amazon.awscdk.services.apigateway.MTLSConfig | [[cdk.support/lookup-entry]] | `:mtls` |
| `securityPolicy` | software.amazon.awscdk.services.apigateway.SecurityPolicy | [[cdk.api.services.apigateway/security-policy]] | `:security-policy` |"
  [stack id config]
  (let [builder (DomainNameProps$Builder.)]
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (endpoint-type config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :mapping)]
      (. builder mapping data))
    (when-let [data (lookup-entry config id :mtls)]
      (. builder mtls data))
    (when-let [data (security-policy config id :security-policy)]
      (. builder securityPolicy data))
    (.build builder)))


(defn endpoint-configuration-builder
  "The endpoint-configuration-builder function buildes out new instances of 
EndpointConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `types` | java.util.List | [[cdk.support/lookup-entry]] | `:types` |
| `vpcEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoints` |"
  [stack id config]
  (let [builder (EndpointConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :types)]
      (. builder types data))
    (when-let [data (lookup-entry config id :vpc-endpoints)]
      (. builder vpcEndpoints data))
    (.build builder)))


(defn gateway-response-builder
  "The gateway-response-builder function buildes out new instances of 
GatewayResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-headers` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `templates` | java.util.Map | [[cdk.support/lookup-entry]] | `:templates` |
| `type` | software.amazon.awscdk.services.apigateway.ResponseType | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (GatewayResponse$Builder/create stack id)]
    (when-let [data (lookup-entry config id :response-headers)]
      (. builder responseHeaders data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (when-let [data (lookup-entry config id :templates)]
      (. builder templates data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn gateway-response-options-builder
  "The gateway-response-options-builder function buildes out new instances of 
GatewayResponseOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-headers` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `templates` | java.util.Map | [[cdk.support/lookup-entry]] | `:templates` |
| `type` | software.amazon.awscdk.services.apigateway.ResponseType | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (GatewayResponseOptions$Builder.)]
    (when-let [data (lookup-entry config id :response-headers)]
      (. builder responseHeaders data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (when-let [data (lookup-entry config id :templates)]
      (. builder templates data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn gateway-response-props-builder
  "The gateway-response-props-builder function buildes out new instances of 
GatewayResponseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-headers` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `templates` | java.util.Map | [[cdk.support/lookup-entry]] | `:templates` |
| `type` | software.amazon.awscdk.services.apigateway.ResponseType | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (GatewayResponseProps$Builder.)]
    (when-let [data (lookup-entry config id :response-headers)]
      (. builder responseHeaders data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (when-let [data (lookup-entry config id :templates)]
      (. builder templates data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn http-integration-builder
  "The http-integration-builder function buildes out new instances of 
HttpIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |"
  [stack id config ^java.lang.String url]
  (let [builder (HttpIntegration$Builder/create ^java.lang.String url)]
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :proxy)]
      (. builder proxy data))
    (.build builder)))


(defn http-integration-props-builder
  "The http-integration-props-builder function buildes out new instances of 
HttpIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |"
  [stack id config]
  (let [builder (HttpIntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :proxy)]
      (. builder proxy data))
    (.build builder)))


(defn integration-builder
  "The integration-builder function buildes out new instances of 
Integration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `type` | software.amazon.awscdk.services.apigateway.IntegrationType | [[cdk.api.services.apigateway/integration-type]] | `:type` |
| `uri` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (Integration$Builder/create)]
    (when-let [data (lookup-entry config id :integration-http-method)]
      (. builder integrationHttpMethod data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (integration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn integration-config-builder
  "The integration-config-builder function buildes out new instances of 
IntegrationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-token` |
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `type` | software.amazon.awscdk.services.apigateway.IntegrationType | [[cdk.api.services.apigateway/integration-type]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (IntegrationConfig$Builder.)]
    (when-let [data (lookup-entry config id :deployment-token)]
      (. builder deploymentToken data))
    (when-let [data (lookup-entry config id :integration-http-method)]
      (. builder integrationHttpMethod data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (integration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn integration-options-builder
  "The integration-options-builder function buildes out new instances of 
IntegrationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheKeyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-key-parameters` |
| `cacheNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-namespace` |
| `connectionType` | software.amazon.awscdk.services.apigateway.ConnectionType | [[cdk.api.services.apigateway/connection-type]] | `:connection-type` |
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `credentialsPassthrough` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:credentials-passthrough` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:integration-responses` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigateway.PassthroughBehavior | [[cdk.api.services.apigateway/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (IntegrationOptions$Builder.)]
    (when-let [data (lookup-entry config id :cache-key-parameters)]
      (. builder cacheKeyParameters data))
    (when-let [data (lookup-entry config id :cache-namespace)]
      (. builder cacheNamespace data))
    (when-let [data (connection-type config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :credentials-passthrough)]
      (. builder credentialsPassthrough data))
    (when-let [data (lookup-entry config id :credentials-role)]
      (. builder credentialsRole data))
    (when-let [data (lookup-entry config id :integration-responses)]
      (. builder integrationResponses data))
    (when-let [data (passthrough-behavior config id :passthrough-behavior)]
      (. builder passthroughBehavior data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-templates)]
      (. builder requestTemplates data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn integration-props-builder
  "The integration-props-builder function buildes out new instances of 
IntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `type` | software.amazon.awscdk.services.apigateway.IntegrationType | [[cdk.api.services.apigateway/integration-type]] | `:type` |
| `uri` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (IntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :integration-http-method)]
      (. builder integrationHttpMethod data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (integration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn integration-response-builder
  "The integration-response-builder function buildes out new instances of 
IntegrationResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-templates` |
| `selectionPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-pattern` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (IntegrationResponse$Builder.)]
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :response-parameters)]
      (. builder responseParameters data))
    (when-let [data (lookup-entry config id :response-templates)]
      (. builder responseTemplates data))
    (when-let [data (lookup-entry config id :selection-pattern)]
      (. builder selectionPattern data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn json-schema-builder
  "The json-schema-builder function buildes out new instances of 
JsonSchema$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalItems` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-items` |
| `additionalProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:additional-properties` |
| `allOf` | java.util.List | [[cdk.support/lookup-entry]] | `:all-of` |
| `anyOf` | java.util.List | [[cdk.support/lookup-entry]] | `:any-of` |
| `contains` | java.util.List | [[cdk.support/lookup-entry]] | `:contains` |
| `defaultValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-value` |
| `definitions` | java.util.Map | [[cdk.support/lookup-entry]] | `:definitions` |
| `dependencies` | java.util.Map | [[cdk.support/lookup-entry]] | `:dependencies` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enumValue` | java.util.List | [[cdk.support/lookup-entry]] | `:enum-value` |
| `exclusiveMaximum` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclusive-maximum` |
| `exclusiveMinimum` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclusive-minimum` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
| `maxLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length` |
| `maxProperties` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-properties` |
| `maximum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum` |
| `minItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-items` |
| `minLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-length` |
| `minProperties` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-properties` |
| `minimum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum` |
| `multipleOf` | java.lang.Number | [[cdk.support/lookup-entry]] | `:multiple-of` |
| `not` | software.amazon.awscdk.services.apigateway.JsonSchema | [[cdk.support/lookup-entry]] | `:not` |
| `oneOf` | java.util.List | [[cdk.support/lookup-entry]] | `:one-of` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `patternProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:pattern-properties` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `propertyNames` | software.amazon.awscdk.services.apigateway.JsonSchema | [[cdk.support/lookup-entry]] | `:property-names` |
| `ref` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref` |
| `required` | java.util.List | [[cdk.support/lookup-entry]] | `:required` |
| `schema` | software.amazon.awscdk.services.apigateway.JsonSchemaVersion | [[cdk.api.services.apigateway/json-schema-version]] | `:schema` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `type` | java.util.List | [[cdk.support/lookup-entry]] | `:type` |
| `uniqueItems` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:unique-items` |"
  [stack id config]
  (let [builder (JsonSchema$Builder.)]
    (when-let [data (lookup-entry config id :additional-items)]
      (. builder additionalItems data))
    (when-let [data (lookup-entry config id :additional-properties)]
      (. builder additionalProperties data))
    (when-let [data (lookup-entry config id :all-of)]
      (. builder allOf data))
    (when-let [data (lookup-entry config id :any-of)]
      (. builder anyOf data))
    (when-let [data (lookup-entry config id :contains)]
      (. builder contains data))
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :definitions)]
      (. builder definitions data))
    (when-let [data (lookup-entry config id :dependencies)]
      (. builder dependencies data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enum-value)]
      (. builder enumValue data))
    (when-let [data (lookup-entry config id :exclusive-maximum)]
      (. builder exclusiveMaximum data))
    (when-let [data (lookup-entry config id :exclusive-minimum)]
      (. builder exclusiveMinimum data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (when-let [data (lookup-entry config id :max-length)]
      (. builder maxLength data))
    (when-let [data (lookup-entry config id :max-properties)]
      (. builder maxProperties data))
    (when-let [data (lookup-entry config id :maximum)]
      (. builder maximum data))
    (when-let [data (lookup-entry config id :min-items)]
      (. builder minItems data))
    (when-let [data (lookup-entry config id :min-length)]
      (. builder minLength data))
    (when-let [data (lookup-entry config id :min-properties)]
      (. builder minProperties data))
    (when-let [data (lookup-entry config id :minimum)]
      (. builder minimum data))
    (when-let [data (lookup-entry config id :multiple-of)]
      (. builder multipleOf data))
    (when-let [data (lookup-entry config id :not)]
      (. builder not data))
    (when-let [data (lookup-entry config id :one-of)]
      (. builder oneOf data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :pattern-properties)]
      (. builder patternProperties data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :property-names)]
      (. builder propertyNames data))
    (when-let [data (lookup-entry config id :ref)]
      (. builder ref data))
    (when-let [data (lookup-entry config id :required)]
      (. builder required data))
    (when-let [data (json-schema-version config id :schema)]
      (. builder schema data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :unique-items)]
      (. builder uniqueItems data))
    (.build builder)))


(defn json-with-standard-field-props-builder
  "The json-with-standard-field-props-builder function buildes out new instances of 
JsonWithStandardFieldProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caller` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caller` |
| `httpMethod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:http-method` |
| `ip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ip` |
| `protocol` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:protocol` |
| `requestTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:request-time` |
| `resourcePath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:resource-path` |
| `responseLength` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:response-length` |
| `status` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:status` |
| `user` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (JsonWithStandardFieldProps$Builder.)]
    (when-let [data (lookup-entry config id :caller)]
      (. builder caller data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :ip)]
      (. builder ip data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :request-time)]
      (. builder requestTime data))
    (when-let [data (lookup-entry config id :resource-path)]
      (. builder resourcePath data))
    (when-let [data (lookup-entry config id :response-length)]
      (. builder responseLength data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn lambda-authorizer-props-builder
  "The lambda-authorizer-props-builder function buildes out new instances of 
LambdaAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |"
  [stack id config]
  (let [builder (LambdaAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :assume-role)]
      (. builder assumeRole data))
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (.build builder)))


(defn lambda-integration-builder
  "The lambda-integration-builder function buildes out new instances of 
LambdaIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowTestInvoke` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-test-invoke` |
| `cacheKeyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-key-parameters` |
| `cacheNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-namespace` |
| `connectionType` | software.amazon.awscdk.services.apigateway.ConnectionType | [[cdk.api.services.apigateway/connection-type]] | `:connection-type` |
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `credentialsPassthrough` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:credentials-passthrough` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:integration-responses` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigateway.PassthroughBehavior | [[cdk.api.services.apigateway/passthrough-behavior]] | `:passthrough-behavior` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction handler-function]
  (let [builder (LambdaIntegration$Builder/create ^software.amazon.awscdk.services.lambda.IFunction handler-function)]
    (when-let [data (lookup-entry config id :allow-test-invoke)]
      (. builder allowTestInvoke data))
    (when-let [data (lookup-entry config id :cache-key-parameters)]
      (. builder cacheKeyParameters data))
    (when-let [data (lookup-entry config id :cache-namespace)]
      (. builder cacheNamespace data))
    (when-let [data (connection-type config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :credentials-passthrough)]
      (. builder credentialsPassthrough data))
    (when-let [data (lookup-entry config id :credentials-role)]
      (. builder credentialsRole data))
    (when-let [data (lookup-entry config id :integration-responses)]
      (. builder integrationResponses data))
    (when-let [data (passthrough-behavior config id :passthrough-behavior)]
      (. builder passthroughBehavior data))
    (when-let [data (lookup-entry config id :proxy)]
      (. builder proxy data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-templates)]
      (. builder requestTemplates data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn lambda-integration-options-builder
  "The lambda-integration-options-builder function buildes out new instances of 
LambdaIntegrationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowTestInvoke` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-test-invoke` |
| `cacheKeyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-key-parameters` |
| `cacheNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-namespace` |
| `connectionType` | software.amazon.awscdk.services.apigateway.ConnectionType | [[cdk.api.services.apigateway/connection-type]] | `:connection-type` |
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `credentialsPassthrough` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:credentials-passthrough` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:integration-responses` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigateway.PassthroughBehavior | [[cdk.api.services.apigateway/passthrough-behavior]] | `:passthrough-behavior` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (LambdaIntegrationOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-test-invoke)]
      (. builder allowTestInvoke data))
    (when-let [data (lookup-entry config id :cache-key-parameters)]
      (. builder cacheKeyParameters data))
    (when-let [data (lookup-entry config id :cache-namespace)]
      (. builder cacheNamespace data))
    (when-let [data (connection-type config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :credentials-passthrough)]
      (. builder credentialsPassthrough data))
    (when-let [data (lookup-entry config id :credentials-role)]
      (. builder credentialsRole data))
    (when-let [data (lookup-entry config id :integration-responses)]
      (. builder integrationResponses data))
    (when-let [data (passthrough-behavior config id :passthrough-behavior)]
      (. builder passthroughBehavior data))
    (when-let [data (lookup-entry config id :proxy)]
      (. builder proxy data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-templates)]
      (. builder requestTemplates data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn lambda-rest-api-builder
  "The lambda-rest-api-builder function buildes out new instances of 
LambdaRestApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySourceType` | software.amazon.awscdk.services.apigateway.ApiKeySourceType | [[cdk.api.services.apigateway/api-key-source-type]] | `:api-key-source-type` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `cloneFrom` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:clone-from` |
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.services.apigateway.EndpointConfiguration | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `integrationOptions` | software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions | [[cdk.support/lookup-entry]] | `:integration-options` |
| `minCompressionSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:min-compression-size` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |"
  [stack id config]
  (let [builder (LambdaRestApi$Builder/create stack id)]
    (when-let [data (api-key-source-type config id :api-key-source-type)]
      (. builder apiKeySourceType data))
    (when-let [data (lookup-entry config id :binary-media-types)]
      (. builder binaryMediaTypes data))
    (when-let [data (lookup-entry config id :clone-from)]
      (. builder cloneFrom data))
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :integration-options)]
      (. builder integrationOptions data))
    (when-let [data (lookup-entry config id :min-compression-size)]
      (. builder minCompressionSize data))
    (when-let [data (lookup-entry config id :minimum-compression-size)]
      (. builder minimumCompressionSize data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :proxy)]
      (. builder proxy data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (.build builder)))


(defn lambda-rest-api-props-builder
  "The lambda-rest-api-props-builder function buildes out new instances of 
LambdaRestApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySourceType` | software.amazon.awscdk.services.apigateway.ApiKeySourceType | [[cdk.api.services.apigateway/api-key-source-type]] | `:api-key-source-type` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `cloneFrom` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:clone-from` |
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.services.apigateway.EndpointConfiguration | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `integrationOptions` | software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions | [[cdk.support/lookup-entry]] | `:integration-options` |
| `minCompressionSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:min-compression-size` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |"
  [stack id config]
  (let [builder (LambdaRestApiProps$Builder.)]
    (when-let [data (api-key-source-type config id :api-key-source-type)]
      (. builder apiKeySourceType data))
    (when-let [data (lookup-entry config id :binary-media-types)]
      (. builder binaryMediaTypes data))
    (when-let [data (lookup-entry config id :clone-from)]
      (. builder cloneFrom data))
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :integration-options)]
      (. builder integrationOptions data))
    (when-let [data (lookup-entry config id :min-compression-size)]
      (. builder minCompressionSize data))
    (when-let [data (lookup-entry config id :minimum-compression-size)]
      (. builder minimumCompressionSize data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :proxy)]
      (. builder proxy data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (.build builder)))


(defn method-builder
  "The method-builder function buildes out new instances of 
Method$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `integration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:integration` |
| `options` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:options` |
| `resource` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (Method$Builder/create stack id)]
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :integration)]
      (. builder integration data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn method-deployment-options-builder
  "The method-deployment-options-builder function buildes out new instances of 
MethodDeploymentOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheDataEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-data-encrypted` |
| `cacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cache-ttl` |
| `cachingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caching-enabled` |
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `loggingLevel` | software.amazon.awscdk.services.apigateway.MethodLoggingLevel | [[cdk.api.services.apigateway/method-logging-level]] | `:logging-level` |
| `metricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metrics-enabled` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |"
  [stack id config]
  (let [builder (MethodDeploymentOptions$Builder.)]
    (when-let [data (lookup-entry config id :cache-data-encrypted)]
      (. builder cacheDataEncrypted data))
    (when-let [data (lookup-entry config id :cache-ttl)]
      (. builder cacheTtl data))
    (when-let [data (lookup-entry config id :caching-enabled)]
      (. builder cachingEnabled data))
    (when-let [data (lookup-entry config id :data-trace-enabled)]
      (. builder dataTraceEnabled data))
    (when-let [data (method-logging-level config id :logging-level)]
      (. builder loggingLevel data))
    (when-let [data (lookup-entry config id :metrics-enabled)]
      (. builder metricsEnabled data))
    (when-let [data (lookup-entry config id :throttling-burst-limit)]
      (. builder throttlingBurstLimit data))
    (when-let [data (lookup-entry config id :throttling-rate-limit)]
      (. builder throttlingRateLimit data))
    (.build builder)))


(defn method-options-builder
  "The method-options-builder function buildes out new instances of 
MethodOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizationType` | software.amazon.awscdk.services.apigateway.AuthorizationType | [[cdk.api.services.apigateway/authorization-type]] | `:authorization-type` |
| `authorizer` | software.amazon.awscdk.services.apigateway.IAuthorizer | [[cdk.support/lookup-entry]] | `:authorizer` |
| `methodResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:method-responses` |
| `operationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-name` |
| `requestModels` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-models` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestValidator` | software.amazon.awscdk.services.apigateway.IRequestValidator | [[cdk.support/lookup-entry]] | `:request-validator` |
| `requestValidatorOptions` | software.amazon.awscdk.services.apigateway.RequestValidatorOptions | [[cdk.support/lookup-entry]] | `:request-validator-options` |"
  [stack id config]
  (let [builder (MethodOptions$Builder.)]
    (when-let [data (lookup-entry config id :api-key-required)]
      (. builder apiKeyRequired data))
    (when-let [data (lookup-entry config id :authorization-scopes)]
      (. builder authorizationScopes data))
    (when-let [data (authorization-type config id :authorization-type)]
      (. builder authorizationType data))
    (when-let [data (lookup-entry config id :authorizer)]
      (. builder authorizer data))
    (when-let [data (lookup-entry config id :method-responses)]
      (. builder methodResponses data))
    (when-let [data (lookup-entry config id :operation-name)]
      (. builder operationName data))
    (when-let [data (lookup-entry config id :request-models)]
      (. builder requestModels data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-validator)]
      (. builder requestValidator data))
    (when-let [data (lookup-entry config id :request-validator-options)]
      (. builder requestValidatorOptions data))
    (.build builder)))


(defn method-props-builder
  "The method-props-builder function buildes out new instances of 
MethodProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `integration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:integration` |
| `options` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:options` |
| `resource` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (MethodProps$Builder.)]
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :integration)]
      (. builder integration data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn method-response-builder
  "The method-response-builder function buildes out new instances of 
MethodResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseModels` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-models` |
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (MethodResponse$Builder.)]
    (when-let [data (lookup-entry config id :response-models)]
      (. builder responseModels data))
    (when-let [data (lookup-entry config id :response-parameters)]
      (. builder responseParameters data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn mock-integration-builder
  "The mock-integration-builder function buildes out new instances of 
MockIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheKeyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-key-parameters` |
| `cacheNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-namespace` |
| `connectionType` | software.amazon.awscdk.services.apigateway.ConnectionType | [[cdk.api.services.apigateway/connection-type]] | `:connection-type` |
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `credentialsPassthrough` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:credentials-passthrough` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:integration-responses` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigateway.PassthroughBehavior | [[cdk.api.services.apigateway/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (MockIntegration$Builder/create)]
    (when-let [data (lookup-entry config id :cache-key-parameters)]
      (. builder cacheKeyParameters data))
    (when-let [data (lookup-entry config id :cache-namespace)]
      (. builder cacheNamespace data))
    (when-let [data (connection-type config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :credentials-passthrough)]
      (. builder credentialsPassthrough data))
    (when-let [data (lookup-entry config id :credentials-role)]
      (. builder credentialsRole data))
    (when-let [data (lookup-entry config id :integration-responses)]
      (. builder integrationResponses data))
    (when-let [data (passthrough-behavior config id :passthrough-behavior)]
      (. builder passthroughBehavior data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-templates)]
      (. builder requestTemplates data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn model-builder
  "The model-builder function buildes out new instances of 
Model$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `schema` | software.amazon.awscdk.services.apigateway.JsonSchema | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (Model$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn model-options-builder
  "The model-options-builder function buildes out new instances of 
ModelOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `schema` | software.amazon.awscdk.services.apigateway.JsonSchema | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (ModelOptions$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn model-props-builder
  "The model-props-builder function buildes out new instances of 
ModelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `schema` | software.amazon.awscdk.services.apigateway.JsonSchema | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (ModelProps$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn mtls-config-builder
  "The mtls-config-builder function buildes out new instances of 
MTLSConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (MTLSConfig$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn proxy-resource-builder
  "The proxy-resource-builder function buildes out new instances of 
ProxyResource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anyMethod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:any-method` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `parent` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:parent` |"
  [stack id config]
  (let [builder (ProxyResource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :any-method)]
      (. builder anyMethod data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :parent)]
      (. builder parent data))
    (.build builder)))


(defn proxy-resource-options-builder
  "The proxy-resource-options-builder function buildes out new instances of 
ProxyResourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anyMethod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:any-method` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |"
  [stack id config]
  (let [builder (ProxyResourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :any-method)]
      (. builder anyMethod data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (.build builder)))


(defn proxy-resource-props-builder
  "The proxy-resource-props-builder function buildes out new instances of 
ProxyResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anyMethod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:any-method` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `parent` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:parent` |"
  [stack id config]
  (let [builder (ProxyResourceProps$Builder.)]
    (when-let [data (lookup-entry config id :any-method)]
      (. builder anyMethod data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :parent)]
      (. builder parent data))
    (.build builder)))


(defn quota-settings-builder
  "The quota-settings-builder function buildes out new instances of 
QuotaSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `offset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:offset` |
| `period` | software.amazon.awscdk.services.apigateway.Period | [[cdk.api.services.apigateway/period]] | `:period` |"
  [stack id config]
  (let [builder (QuotaSettings$Builder.)]
    (when-let [data (lookup-entry config id :limit)]
      (. builder limit data))
    (when-let [data (lookup-entry config id :offset)]
      (. builder offset data))
    (when-let [data (period config id :period)]
      (. builder period data))
    (.build builder)))


(defn rate-limited-api-key-builder
  "The rate-limited-api-key-builder function buildes out new instances of 
RateLimitedApiKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-name` |
| `apiStages` | java.util.List | [[cdk.support/lookup-entry]] | `:api-stages` |
| `customerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-id` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `generateDistinctId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-distinct-id` |
| `quota` | software.amazon.awscdk.services.apigateway.QuotaSettings | [[cdk.support/lookup-entry]] | `:quota` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
| `throttle` | software.amazon.awscdk.services.apigateway.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (RateLimitedApiKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-key-name)]
      (. builder apiKeyName data))
    (when-let [data (lookup-entry config id :api-stages)]
      (. builder apiStages data))
    (when-let [data (lookup-entry config id :customer-id)]
      (. builder customerId data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :generate-distinct-id)]
      (. builder generateDistinctId data))
    (when-let [data (lookup-entry config id :quota)]
      (. builder quota data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn rate-limited-api-key-props-builder
  "The rate-limited-api-key-props-builder function buildes out new instances of 
RateLimitedApiKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-name` |
| `apiStages` | java.util.List | [[cdk.support/lookup-entry]] | `:api-stages` |
| `customerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-id` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `generateDistinctId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-distinct-id` |
| `quota` | software.amazon.awscdk.services.apigateway.QuotaSettings | [[cdk.support/lookup-entry]] | `:quota` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
| `throttle` | software.amazon.awscdk.services.apigateway.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (RateLimitedApiKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :api-key-name)]
      (. builder apiKeyName data))
    (when-let [data (lookup-entry config id :api-stages)]
      (. builder apiStages data))
    (when-let [data (lookup-entry config id :customer-id)]
      (. builder customerId data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :generate-distinct-id)]
      (. builder generateDistinctId data))
    (when-let [data (lookup-entry config id :quota)]
      (. builder quota data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn request-authorizer-builder
  "The request-authorizer-builder function buildes out new instances of 
RequestAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `identitySources` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-sources` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |"
  [stack id config]
  (let [builder (RequestAuthorizer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assume-role)]
      (. builder assumeRole data))
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :identity-sources)]
      (. builder identitySources data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (.build builder)))


(defn request-authorizer-props-builder
  "The request-authorizer-props-builder function buildes out new instances of 
RequestAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `identitySources` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-sources` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |"
  [stack id config]
  (let [builder (RequestAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :assume-role)]
      (. builder assumeRole data))
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :identity-sources)]
      (. builder identitySources data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (.build builder)))


(defn request-context-builder
  "The request-context-builder function buildes out new instances of 
RequestContext$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:account-id` |
| `apiId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:api-id` |
| `apiKey` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:api-key` |
| `authorizerPrincipalId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorizer-principal-id` |
| `caller` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caller` |
| `cognitoAuthenticationProvider` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cognito-authentication-provider` |
| `cognitoAuthenticationType` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cognito-authentication-type` |
| `cognitoIdentityId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cognito-identity-id` |
| `cognitoIdentityPoolId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cognito-identity-pool-id` |
| `httpMethod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:http-method` |
| `requestId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:request-id` |
| `resourceId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:resource-id` |
| `resourcePath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:resource-path` |
| `sourceIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:source-ip` |
| `stage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stage` |
| `user` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user` |
| `userAgent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-agent` |
| `userArn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-arn` |"
  [stack id config]
  (let [builder (RequestContext$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :authorizer-principal-id)]
      (. builder authorizerPrincipalId data))
    (when-let [data (lookup-entry config id :caller)]
      (. builder caller data))
    (when-let [data (lookup-entry config id :cognito-authentication-provider)]
      (. builder cognitoAuthenticationProvider data))
    (when-let [data (lookup-entry config id :cognito-authentication-type)]
      (. builder cognitoAuthenticationType data))
    (when-let [data (lookup-entry config id :cognito-identity-id)]
      (. builder cognitoIdentityId data))
    (when-let [data (lookup-entry config id :cognito-identity-pool-id)]
      (. builder cognitoIdentityPoolId data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :request-id)]
      (. builder requestId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :resource-path)]
      (. builder resourcePath data))
    (when-let [data (lookup-entry config id :source-ip)]
      (. builder sourceIp data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :user-agent)]
      (. builder userAgent data))
    (when-let [data (lookup-entry config id :user-arn)]
      (. builder userArn data))
    (.build builder)))


(defn request-validator-builder
  "The request-validator-builder function buildes out new instances of 
RequestValidator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestValidatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-validator-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `validateRequestBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |"
  [stack id config]
  (let [builder (RequestValidator$Builder/create stack id)]
    (when-let [data (lookup-entry config id :request-validator-name)]
      (. builder requestValidatorName data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :validate-request-body)]
      (. builder validateRequestBody data))
    (when-let [data (lookup-entry config id :validate-request-parameters)]
      (. builder validateRequestParameters data))
    (.build builder)))


(defn request-validator-options-builder
  "The request-validator-options-builder function buildes out new instances of 
RequestValidatorOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestValidatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-validator-name` |
| `validateRequestBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |"
  [stack id config]
  (let [builder (RequestValidatorOptions$Builder.)]
    (when-let [data (lookup-entry config id :request-validator-name)]
      (. builder requestValidatorName data))
    (when-let [data (lookup-entry config id :validate-request-body)]
      (. builder validateRequestBody data))
    (when-let [data (lookup-entry config id :validate-request-parameters)]
      (. builder validateRequestParameters data))
    (.build builder)))


(defn request-validator-props-builder
  "The request-validator-props-builder function buildes out new instances of 
RequestValidatorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestValidatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-validator-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `validateRequestBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |"
  [stack id config]
  (let [builder (RequestValidatorProps$Builder.)]
    (when-let [data (lookup-entry config id :request-validator-name)]
      (. builder requestValidatorName data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :validate-request-body)]
      (. builder validateRequestBody data))
    (when-let [data (lookup-entry config id :validate-request-parameters)]
      (. builder validateRequestParameters data))
    (.build builder)))


(defn resource-attributes-builder
  "The resource-attributes-builder function buildes out new instances of 
ResourceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |"
  [stack id config]
  (let [builder (ResourceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (.build builder)))


(defn resource-builder
  "The resource-builder function buildes out new instances of 
Resource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `parent` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:parent` |
| `pathPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-part` |"
  [stack id config]
  (let [builder (Resource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :parent)]
      (. builder parent data))
    (when-let [data (lookup-entry config id :path-part)]
      (. builder pathPart data))
    (.build builder)))


(defn resource-options-builder
  "The resource-options-builder function buildes out new instances of 
ResourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |"
  [stack id config]
  (let [builder (ResourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (.build builder)))


(defn resource-props-builder
  "The resource-props-builder function buildes out new instances of 
ResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `parent` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:parent` |
| `pathPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-part` |"
  [stack id config]
  (let [builder (ResourceProps$Builder.)]
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :parent)]
      (. builder parent data))
    (when-let [data (lookup-entry config id :path-part)]
      (. builder pathPart data))
    (.build builder)))


(defn rest-api-attributes-builder
  "The rest-api-attributes-builder function buildes out new instances of 
RestApiAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `rootResourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-resource-id` |"
  [stack id config]
  (let [builder (RestApiAttributes$Builder.)]
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :root-resource-id)]
      (. builder rootResourceId data))
    (.build builder)))


(defn rest-api-base-props-builder
  "The rest-api-base-props-builder function buildes out new instances of 
RestApiBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |"
  [stack id config]
  (let [builder (RestApiBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (.build builder)))


(defn rest-api-builder
  "The rest-api-builder function buildes out new instances of 
RestApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySourceType` | software.amazon.awscdk.services.apigateway.ApiKeySourceType | [[cdk.api.services.apigateway/api-key-source-type]] | `:api-key-source-type` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `cloneFrom` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:clone-from` |
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.services.apigateway.EndpointConfiguration | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `minCompressionSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:min-compression-size` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |"
  [stack id config]
  (let [builder (RestApi$Builder/create stack id)]
    (when-let [data (api-key-source-type config id :api-key-source-type)]
      (. builder apiKeySourceType data))
    (when-let [data (lookup-entry config id :binary-media-types)]
      (. builder binaryMediaTypes data))
    (when-let [data (lookup-entry config id :clone-from)]
      (. builder cloneFrom data))
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :min-compression-size)]
      (. builder minCompressionSize data))
    (when-let [data (lookup-entry config id :minimum-compression-size)]
      (. builder minimumCompressionSize data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (.build builder)))


(defn rest-api-props-builder
  "The rest-api-props-builder function buildes out new instances of 
RestApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySourceType` | software.amazon.awscdk.services.apigateway.ApiKeySourceType | [[cdk.api.services.apigateway/api-key-source-type]] | `:api-key-source-type` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `cloneFrom` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:clone-from` |
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.services.apigateway.EndpointConfiguration | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `minCompressionSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:min-compression-size` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |"
  [stack id config]
  (let [builder (RestApiProps$Builder.)]
    (when-let [data (api-key-source-type config id :api-key-source-type)]
      (. builder apiKeySourceType data))
    (when-let [data (lookup-entry config id :binary-media-types)]
      (. builder binaryMediaTypes data))
    (when-let [data (lookup-entry config id :clone-from)]
      (. builder cloneFrom data))
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :min-compression-size)]
      (. builder minCompressionSize data))
    (when-let [data (lookup-entry config id :minimum-compression-size)]
      (. builder minimumCompressionSize data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (.build builder)))


(defn sagemaker-integration-builder
  "The sagemaker-integration-builder function buildes out new instances of 
SagemakerIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheKeyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-key-parameters` |
| `cacheNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-namespace` |
| `connectionType` | software.amazon.awscdk.services.apigateway.ConnectionType | [[cdk.api.services.apigateway/connection-type]] | `:connection-type` |
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `credentialsPassthrough` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:credentials-passthrough` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:integration-responses` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigateway.PassthroughBehavior | [[cdk.api.services.apigateway/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config ^software.amazon.awscdk.services.sagemaker.IEndpoint endpoint]
  (let [builder (SagemakerIntegration$Builder/create ^software.amazon.awscdk.services.sagemaker.IEndpoint endpoint)]
    (when-let [data (lookup-entry config id :cache-key-parameters)]
      (. builder cacheKeyParameters data))
    (when-let [data (lookup-entry config id :cache-namespace)]
      (. builder cacheNamespace data))
    (when-let [data (connection-type config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :credentials-passthrough)]
      (. builder credentialsPassthrough data))
    (when-let [data (lookup-entry config id :credentials-role)]
      (. builder credentialsRole data))
    (when-let [data (lookup-entry config id :integration-responses)]
      (. builder integrationResponses data))
    (when-let [data (passthrough-behavior config id :passthrough-behavior)]
      (. builder passthroughBehavior data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-templates)]
      (. builder requestTemplates data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn sagemaker-integration-options-builder
  "The sagemaker-integration-options-builder function buildes out new instances of 
SagemakerIntegrationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheKeyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-key-parameters` |
| `cacheNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-namespace` |
| `connectionType` | software.amazon.awscdk.services.apigateway.ConnectionType | [[cdk.api.services.apigateway/connection-type]] | `:connection-type` |
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `credentialsPassthrough` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:credentials-passthrough` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:integration-responses` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigateway.PassthroughBehavior | [[cdk.api.services.apigateway/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (SagemakerIntegrationOptions$Builder.)]
    (when-let [data (lookup-entry config id :cache-key-parameters)]
      (. builder cacheKeyParameters data))
    (when-let [data (lookup-entry config id :cache-namespace)]
      (. builder cacheNamespace data))
    (when-let [data (connection-type config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :credentials-passthrough)]
      (. builder credentialsPassthrough data))
    (when-let [data (lookup-entry config id :credentials-role)]
      (. builder credentialsRole data))
    (when-let [data (lookup-entry config id :integration-responses)]
      (. builder integrationResponses data))
    (when-let [data (passthrough-behavior config id :passthrough-behavior)]
      (. builder passthroughBehavior data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-templates)]
      (. builder requestTemplates data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn spec-rest-api-builder
  "The spec-rest-api-builder function buildes out new instances of 
SpecRestApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiDefinition` | software.amazon.awscdk.services.apigateway.ApiDefinition | [[cdk.support/lookup-entry]] | `:api-definition` |
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `minCompressionSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:min-compression-size` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |"
  [stack id config]
  (let [builder (SpecRestApi$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-definition)]
      (. builder apiDefinition data))
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :min-compression-size)]
      (. builder minCompressionSize data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (.build builder)))


(defn spec-rest-api-props-builder
  "The spec-rest-api-props-builder function buildes out new instances of 
SpecRestApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiDefinition` | software.amazon.awscdk.services.apigateway.ApiDefinition | [[cdk.support/lookup-entry]] | `:api-definition` |
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `minCompressionSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:min-compression-size` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |"
  [stack id config]
  (let [builder (SpecRestApiProps$Builder.)]
    (when-let [data (lookup-entry config id :api-definition)]
      (. builder apiDefinition data))
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :min-compression-size)]
      (. builder minCompressionSize data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (.build builder)))


(defn stage-attributes-builder
  "The stage-attributes-builder function buildes out new instances of 
StageAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (StageAttributes$Builder.)]
    (when-let [data (lookup-entry config id :rest-api)]
      (. builder restApi data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn stage-builder
  "The stage-builder function buildes out new instances of 
Stage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogDestination` | software.amazon.awscdk.services.apigateway.IAccessLogDestination | [[cdk.support/lookup-entry]] | `:access-log-destination` |
| `accessLogFormat` | software.amazon.awscdk.services.apigateway.AccessLogFormat | [[cdk.support/lookup-entry]] | `:access-log-format` |
| `cacheClusterEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-cluster-enabled` |
| `cacheClusterSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-cluster-size` |
| `cacheDataEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-data-encrypted` |
| `cacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cache-ttl` |
| `cachingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caching-enabled` |
| `clientCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-id` |
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `deployment` | software.amazon.awscdk.services.apigateway.Deployment | [[cdk.support/lookup-entry]] | `:deployment` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `loggingLevel` | software.amazon.awscdk.services.apigateway.MethodLoggingLevel | [[cdk.api.services.apigateway/method-logging-level]] | `:logging-level` |
| `methodOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:method-options` |
| `metricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metrics-enabled` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (Stage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-log-destination)]
      (. builder accessLogDestination data))
    (when-let [data (lookup-entry config id :access-log-format)]
      (. builder accessLogFormat data))
    (when-let [data (lookup-entry config id :cache-cluster-enabled)]
      (. builder cacheClusterEnabled data))
    (when-let [data (lookup-entry config id :cache-cluster-size)]
      (. builder cacheClusterSize data))
    (when-let [data (lookup-entry config id :cache-data-encrypted)]
      (. builder cacheDataEncrypted data))
    (when-let [data (lookup-entry config id :cache-ttl)]
      (. builder cacheTtl data))
    (when-let [data (lookup-entry config id :caching-enabled)]
      (. builder cachingEnabled data))
    (when-let [data (lookup-entry config id :client-certificate-id)]
      (. builder clientCertificateId data))
    (when-let [data (lookup-entry config id :data-trace-enabled)]
      (. builder dataTraceEnabled data))
    (when-let [data (lookup-entry config id :deployment)]
      (. builder deployment data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :documentation-version)]
      (. builder documentationVersion data))
    (when-let [data (method-logging-level config id :logging-level)]
      (. builder loggingLevel data))
    (when-let [data (lookup-entry config id :method-options)]
      (. builder methodOptions data))
    (when-let [data (lookup-entry config id :metrics-enabled)]
      (. builder metricsEnabled data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :throttling-burst-limit)]
      (. builder throttlingBurstLimit data))
    (when-let [data (lookup-entry config id :throttling-rate-limit)]
      (. builder throttlingRateLimit data))
    (when-let [data (lookup-entry config id :tracing-enabled)]
      (. builder tracingEnabled data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn stage-options-builder
  "The stage-options-builder function buildes out new instances of 
StageOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogDestination` | software.amazon.awscdk.services.apigateway.IAccessLogDestination | [[cdk.support/lookup-entry]] | `:access-log-destination` |
| `accessLogFormat` | software.amazon.awscdk.services.apigateway.AccessLogFormat | [[cdk.support/lookup-entry]] | `:access-log-format` |
| `cacheClusterEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-cluster-enabled` |
| `cacheClusterSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-cluster-size` |
| `cacheDataEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-data-encrypted` |
| `cacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cache-ttl` |
| `cachingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caching-enabled` |
| `clientCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-id` |
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `loggingLevel` | software.amazon.awscdk.services.apigateway.MethodLoggingLevel | [[cdk.api.services.apigateway/method-logging-level]] | `:logging-level` |
| `methodOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:method-options` |
| `metricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metrics-enabled` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (StageOptions$Builder.)]
    (when-let [data (lookup-entry config id :access-log-destination)]
      (. builder accessLogDestination data))
    (when-let [data (lookup-entry config id :access-log-format)]
      (. builder accessLogFormat data))
    (when-let [data (lookup-entry config id :cache-cluster-enabled)]
      (. builder cacheClusterEnabled data))
    (when-let [data (lookup-entry config id :cache-cluster-size)]
      (. builder cacheClusterSize data))
    (when-let [data (lookup-entry config id :cache-data-encrypted)]
      (. builder cacheDataEncrypted data))
    (when-let [data (lookup-entry config id :cache-ttl)]
      (. builder cacheTtl data))
    (when-let [data (lookup-entry config id :caching-enabled)]
      (. builder cachingEnabled data))
    (when-let [data (lookup-entry config id :client-certificate-id)]
      (. builder clientCertificateId data))
    (when-let [data (lookup-entry config id :data-trace-enabled)]
      (. builder dataTraceEnabled data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :documentation-version)]
      (. builder documentationVersion data))
    (when-let [data (method-logging-level config id :logging-level)]
      (. builder loggingLevel data))
    (when-let [data (lookup-entry config id :method-options)]
      (. builder methodOptions data))
    (when-let [data (lookup-entry config id :metrics-enabled)]
      (. builder metricsEnabled data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :throttling-burst-limit)]
      (. builder throttlingBurstLimit data))
    (when-let [data (lookup-entry config id :throttling-rate-limit)]
      (. builder throttlingRateLimit data))
    (when-let [data (lookup-entry config id :tracing-enabled)]
      (. builder tracingEnabled data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn stage-props-builder
  "The stage-props-builder function buildes out new instances of 
StageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogDestination` | software.amazon.awscdk.services.apigateway.IAccessLogDestination | [[cdk.support/lookup-entry]] | `:access-log-destination` |
| `accessLogFormat` | software.amazon.awscdk.services.apigateway.AccessLogFormat | [[cdk.support/lookup-entry]] | `:access-log-format` |
| `cacheClusterEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-cluster-enabled` |
| `cacheClusterSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-cluster-size` |
| `cacheDataEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-data-encrypted` |
| `cacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cache-ttl` |
| `cachingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caching-enabled` |
| `clientCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-id` |
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `deployment` | software.amazon.awscdk.services.apigateway.Deployment | [[cdk.support/lookup-entry]] | `:deployment` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `loggingLevel` | software.amazon.awscdk.services.apigateway.MethodLoggingLevel | [[cdk.api.services.apigateway/method-logging-level]] | `:logging-level` |
| `methodOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:method-options` |
| `metricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metrics-enabled` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (StageProps$Builder.)]
    (when-let [data (lookup-entry config id :access-log-destination)]
      (. builder accessLogDestination data))
    (when-let [data (lookup-entry config id :access-log-format)]
      (. builder accessLogFormat data))
    (when-let [data (lookup-entry config id :cache-cluster-enabled)]
      (. builder cacheClusterEnabled data))
    (when-let [data (lookup-entry config id :cache-cluster-size)]
      (. builder cacheClusterSize data))
    (when-let [data (lookup-entry config id :cache-data-encrypted)]
      (. builder cacheDataEncrypted data))
    (when-let [data (lookup-entry config id :cache-ttl)]
      (. builder cacheTtl data))
    (when-let [data (lookup-entry config id :caching-enabled)]
      (. builder cachingEnabled data))
    (when-let [data (lookup-entry config id :client-certificate-id)]
      (. builder clientCertificateId data))
    (when-let [data (lookup-entry config id :data-trace-enabled)]
      (. builder dataTraceEnabled data))
    (when-let [data (lookup-entry config id :deployment)]
      (. builder deployment data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :documentation-version)]
      (. builder documentationVersion data))
    (when-let [data (method-logging-level config id :logging-level)]
      (. builder loggingLevel data))
    (when-let [data (lookup-entry config id :method-options)]
      (. builder methodOptions data))
    (when-let [data (lookup-entry config id :metrics-enabled)]
      (. builder metricsEnabled data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :throttling-burst-limit)]
      (. builder throttlingBurstLimit data))
    (when-let [data (lookup-entry config id :throttling-rate-limit)]
      (. builder throttlingRateLimit data))
    (when-let [data (lookup-entry config id :tracing-enabled)]
      (. builder tracingEnabled data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn step-functions-execution-integration-options-builder
  "The step-functions-execution-integration-options-builder function buildes out new instances of 
StepFunctionsExecutionIntegrationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorizer` |
| `cacheKeyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-key-parameters` |
| `cacheNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-namespace` |
| `connectionType` | software.amazon.awscdk.services.apigateway.ConnectionType | [[cdk.api.services.apigateway/connection-type]] | `:connection-type` |
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `credentialsPassthrough` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:credentials-passthrough` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `headers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:headers` |
| `integrationResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:integration-responses` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigateway.PassthroughBehavior | [[cdk.api.services.apigateway/passthrough-behavior]] | `:passthrough-behavior` |
| `path` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:path` |
| `querystring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:querystring` |
| `requestContext` | software.amazon.awscdk.services.apigateway.RequestContext | [[cdk.support/lookup-entry]] | `:request-context` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useDefaultMethodResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-default-method-responses` |
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |"
  [stack id config]
  (let [builder (StepFunctionsExecutionIntegrationOptions$Builder.)]
    (when-let [data (lookup-entry config id :authorizer)]
      (. builder authorizer data))
    (when-let [data (lookup-entry config id :cache-key-parameters)]
      (. builder cacheKeyParameters data))
    (when-let [data (lookup-entry config id :cache-namespace)]
      (. builder cacheNamespace data))
    (when-let [data (connection-type config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (content-handling config id :content-handling)]
      (. builder contentHandling data))
    (when-let [data (lookup-entry config id :credentials-passthrough)]
      (. builder credentialsPassthrough data))
    (when-let [data (lookup-entry config id :credentials-role)]
      (. builder credentialsRole data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :integration-responses)]
      (. builder integrationResponses data))
    (when-let [data (passthrough-behavior config id :passthrough-behavior)]
      (. builder passthroughBehavior data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :querystring)]
      (. builder querystring data))
    (when-let [data (lookup-entry config id :request-context)]
      (. builder requestContext data))
    (when-let [data (lookup-entry config id :request-parameters)]
      (. builder requestParameters data))
    (when-let [data (lookup-entry config id :request-templates)]
      (. builder requestTemplates data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :use-default-method-responses)]
      (. builder useDefaultMethodResponses data))
    (when-let [data (lookup-entry config id :vpc-link)]
      (. builder vpcLink data))
    (.build builder)))


(defn step-functions-rest-api-builder
  "The step-functions-rest-api-builder function buildes out new instances of 
StepFunctionsRestApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySourceType` | software.amazon.awscdk.services.apigateway.ApiKeySourceType | [[cdk.api.services.apigateway/api-key-source-type]] | `:api-key-source-type` |
| `authorizer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorizer` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `cloneFrom` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:clone-from` |
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.services.apigateway.EndpointConfiguration | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `headers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:headers` |
| `minCompressionSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:min-compression-size` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `path` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:path` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `querystring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:querystring` |
| `requestContext` | software.amazon.awscdk.services.apigateway.RequestContext | [[cdk.support/lookup-entry]] | `:request-context` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.IStateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `useDefaultMethodResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-default-method-responses` |"
  [stack id config]
  (let [builder (StepFunctionsRestApi$Builder/create stack id)]
    (when-let [data (api-key-source-type config id :api-key-source-type)]
      (. builder apiKeySourceType data))
    (when-let [data (lookup-entry config id :authorizer)]
      (. builder authorizer data))
    (when-let [data (lookup-entry config id :binary-media-types)]
      (. builder binaryMediaTypes data))
    (when-let [data (lookup-entry config id :clone-from)]
      (. builder cloneFrom data))
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :min-compression-size)]
      (. builder minCompressionSize data))
    (when-let [data (lookup-entry config id :minimum-compression-size)]
      (. builder minimumCompressionSize data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :querystring)]
      (. builder querystring data))
    (when-let [data (lookup-entry config id :request-context)]
      (. builder requestContext data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-machine)]
      (. builder stateMachine data))
    (when-let [data (lookup-entry config id :use-default-method-responses)]
      (. builder useDefaultMethodResponses data))
    (.build builder)))


(defn step-functions-rest-api-props-builder
  "The step-functions-rest-api-props-builder function buildes out new instances of 
StepFunctionsRestApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySourceType` | software.amazon.awscdk.services.apigateway.ApiKeySourceType | [[cdk.api.services.apigateway/api-key-source-type]] | `:api-key-source-type` |
| `authorizer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorizer` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `cloneFrom` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:clone-from` |
| `cloudWatchRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-role` |
| `cloudWatchRoleRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:cloud-watch-role-removal-policy` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `deploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy` |
| `deployOptions` | software.amazon.awscdk.services.apigateway.StageOptions | [[cdk.support/lookup-entry]] | `:deploy-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domainName` | software.amazon.awscdk.services.apigateway.DomainNameOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.services.apigateway.EndpointConfiguration | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `endpointExportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-export-name` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `headers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:headers` |
| `minCompressionSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:min-compression-size` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `path` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:path` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `querystring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:querystring` |
| `requestContext` | software.amazon.awscdk.services.apigateway.RequestContext | [[cdk.support/lookup-entry]] | `:request-context` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.IStateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `useDefaultMethodResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-default-method-responses` |"
  [stack id config]
  (let [builder (StepFunctionsRestApiProps$Builder.)]
    (when-let [data (api-key-source-type config id :api-key-source-type)]
      (. builder apiKeySourceType data))
    (when-let [data (lookup-entry config id :authorizer)]
      (. builder authorizer data))
    (when-let [data (lookup-entry config id :binary-media-types)]
      (. builder binaryMediaTypes data))
    (when-let [data (lookup-entry config id :clone-from)]
      (. builder cloneFrom data))
    (when-let [data (lookup-entry config id :cloud-watch-role)]
      (. builder cloudWatchRole data))
    (when-let [data (removal-policy config id :cloud-watch-role-removal-policy)]
      (. builder cloudWatchRoleRemovalPolicy data))
    (when-let [data (lookup-entry config id :default-cors-preflight-options)]
      (. builder defaultCorsPreflightOptions data))
    (when-let [data (lookup-entry config id :default-integration)]
      (. builder defaultIntegration data))
    (when-let [data (lookup-entry config id :default-method-options)]
      (. builder defaultMethodOptions data))
    (when-let [data (lookup-entry config id :deploy)]
      (. builder deploy data))
    (when-let [data (lookup-entry config id :deploy-options)]
      (. builder deployOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
      (. builder disableExecuteApiEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :endpoint-export-name)]
      (. builder endpointExportName data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (when-let [data (lookup-entry config id :fail-on-warnings)]
      (. builder failOnWarnings data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :min-compression-size)]
      (. builder minCompressionSize data))
    (when-let [data (lookup-entry config id :minimum-compression-size)]
      (. builder minimumCompressionSize data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :querystring)]
      (. builder querystring data))
    (when-let [data (lookup-entry config id :request-context)]
      (. builder requestContext data))
    (when-let [data (lookup-entry config id :rest-api-name)]
      (. builder restApiName data))
    (when-let [data (lookup-entry config id :retain-deployments)]
      (. builder retainDeployments data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-machine)]
      (. builder stateMachine data))
    (when-let [data (lookup-entry config id :use-default-method-responses)]
      (. builder useDefaultMethodResponses data))
    (.build builder)))


(defn throttle-settings-builder
  "The throttle-settings-builder function buildes out new instances of 
ThrottleSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `burstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:burst-limit` |
| `rateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit` |"
  [stack id config]
  (let [builder (ThrottleSettings$Builder.)]
    (when-let [data (lookup-entry config id :burst-limit)]
      (. builder burstLimit data))
    (when-let [data (lookup-entry config id :rate-limit)]
      (. builder rateLimit data))
    (.build builder)))


(defn throttling-per-method-builder
  "The throttling-per-method-builder function buildes out new instances of 
ThrottlingPerMethod$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigateway.Method | [[cdk.support/lookup-entry]] | `:method` |
| `throttle` | software.amazon.awscdk.services.apigateway.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |"
  [stack id config]
  (let [builder (ThrottlingPerMethod$Builder.)]
    (when-let [data (lookup-entry config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (.build builder)))


(defn token-authorizer-builder
  "The token-authorizer-builder function buildes out new instances of 
TokenAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
| `validationRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-regex` |"
  [stack id config]
  (let [builder (TokenAuthorizer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assume-role)]
      (. builder assumeRole data))
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (when-let [data (lookup-entry config id :validation-regex)]
      (. builder validationRegex data))
    (.build builder)))


(defn token-authorizer-props-builder
  "The token-authorizer-props-builder function buildes out new instances of 
TokenAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
| `validationRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-regex` |"
  [stack id config]
  (let [builder (TokenAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :assume-role)]
      (. builder assumeRole data))
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (when-let [data (lookup-entry config id :validation-regex)]
      (. builder validationRegex data))
    (.build builder)))


(defn usage-plan-builder
  "The usage-plan-builder function buildes out new instances of 
UsagePlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiStages` | java.util.List | [[cdk.support/lookup-entry]] | `:api-stages` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quota` | software.amazon.awscdk.services.apigateway.QuotaSettings | [[cdk.support/lookup-entry]] | `:quota` |
| `throttle` | software.amazon.awscdk.services.apigateway.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |"
  [stack id config]
  (let [builder (UsagePlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-stages)]
      (. builder apiStages data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :quota)]
      (. builder quota data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (.build builder)))


(defn usage-plan-per-api-stage-builder
  "The usage-plan-per-api-stage-builder function buildes out new instances of 
UsagePlanPerApiStage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:api` |
| `stage` | software.amazon.awscdk.services.apigateway.Stage | [[cdk.support/lookup-entry]] | `:stage` |
| `throttle` | java.util.List | [[cdk.support/lookup-entry]] | `:throttle` |"
  [stack id config]
  (let [builder (UsagePlanPerApiStage$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (.build builder)))


(defn usage-plan-props-builder
  "The usage-plan-props-builder function buildes out new instances of 
UsagePlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiStages` | java.util.List | [[cdk.support/lookup-entry]] | `:api-stages` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quota` | software.amazon.awscdk.services.apigateway.QuotaSettings | [[cdk.support/lookup-entry]] | `:quota` |
| `throttle` | software.amazon.awscdk.services.apigateway.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |"
  [stack id config]
  (let [builder (UsagePlanProps$Builder.)]
    (when-let [data (lookup-entry config id :api-stages)]
      (. builder apiStages data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :quota)]
      (. builder quota data))
    (when-let [data (lookup-entry config id :throttle)]
      (. builder throttle data))
    (.build builder)))


(defn vpc-link-builder
  "The vpc-link-builder function buildes out new instances of 
VpcLink$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpcLinkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-link-name` |"
  [stack id config]
  (let [builder (VpcLink$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :vpc-link-name)]
      (. builder vpcLinkName data))
    (.build builder)))


(defn vpc-link-props-builder
  "The vpc-link-props-builder function buildes out new instances of 
VpcLinkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpcLinkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-link-name` |"
  [stack id config]
  (let [builder (VpcLinkProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :vpc-link-name)]
      (. builder vpcLinkName data))
    (.build builder)))