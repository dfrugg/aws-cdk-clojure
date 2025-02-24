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


(defn build-access-log-destination-config-builder
  "The build-access-log-destination-config-builder function updates a AccessLogDestinationConfig$Builder instance using the provided configuration.
  The function takes the AccessLogDestinationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
"
  [^AccessLogDestinationConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (.build builder))


(defn access-log-destination-config-builder
  ""
  [id config]
  (build-access-log-destination-config-builder (new AccessLogDestinationConfig$Builder) id config))


(defn build-add-api-key-options-builder
  "The build-add-api-key-options-builder function updates a AddApiKeyOptions$Builder instance using the provided configuration.
  The function takes the AddApiKeyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrideLogicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:override-logical-id` |
"
  [^AddApiKeyOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :override-logical-id)]
    (. builder overrideLogicalId data))
  (.build builder))


(defn add-api-key-options-builder
  ""
  [id config]
  (build-add-api-key-options-builder (new AddApiKeyOptions$Builder) id config))


(defn build-api-definition-config-builder
  "The build-api-definition-config-builder function updates a ApiDefinitionConfig$Builder instance using the provided configuration.
  The function takes the ApiDefinitionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineDefinition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:inline-definition` |
| `s3Location` | software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^ApiDefinitionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :inline-definition)]
    (. builder inlineDefinition data))
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn api-definition-config-builder
  ""
  [id config]
  (build-api-definition-config-builder (new ApiDefinitionConfig$Builder) id config))


(defn build-api-definition-s3-location-builder
  "The build-api-definition-s3-location-builder function updates a ApiDefinitionS3Location$Builder instance using the provided configuration.
  The function takes the ApiDefinitionS3Location$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^ApiDefinitionS3Location$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn api-definition-s3-location-builder
  ""
  [id config]
  (build-api-definition-s3-location-builder (new ApiDefinitionS3Location$Builder) id config))


(defn build-api-key-builder
  "The build-api-key-builder function updates a ApiKey$Builder instance using the provided configuration.
  The function takes the ApiKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^ApiKey$Builder builder id config]
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
  (.build builder))


(defn api-key-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-api-key-builder (ApiKey$Builder/create scope (name id)) id config))


(defn build-api-key-options-builder
  "The build-api-key-options-builder function updates a ApiKeyOptions$Builder instance using the provided configuration.
  The function takes the ApiKeyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-name` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^ApiKeyOptions$Builder builder id config]
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
  (.build builder))


(defn api-key-options-builder
  ""
  [id config]
  (build-api-key-options-builder (new ApiKeyOptions$Builder) id config))


(defn build-api-key-props-builder
  "The build-api-key-props-builder function updates a ApiKeyProps$Builder instance using the provided configuration.
  The function takes the ApiKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^ApiKeyProps$Builder builder id config]
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
  (.build builder))


(defn api-key-props-builder
  ""
  [id config]
  (build-api-key-props-builder (new ApiKeyProps$Builder) id config))


(defn build-api-mapping-options-builder
  "The build-api-mapping-options-builder function updates a ApiMappingOptions$Builder instance using the provided configuration.
  The function takes the ApiMappingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
"
  [^ApiMappingOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :base-path)]
    (. builder basePath data))
  (.build builder))


(defn api-mapping-options-builder
  ""
  [id config]
  (build-api-mapping-options-builder (new ApiMappingOptions$Builder) id config))


(defn build-asset-api-definition-builder
  "The build-asset-api-definition-builder function updates a AssetApiDefinition$Builder instance using the provided configuration.
  The function takes the AssetApiDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
"
  [^AssetApiDefinition$Builder builder id config]
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
  (.build builder))


(defn build-aws-integration-builder
  "The build-aws-integration-builder function updates a AwsIntegration$Builder instance using the provided configuration.
  The function takes the AwsIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `subdomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdomain` |
"
  [^AwsIntegration$Builder builder id config]
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
  (.build builder))


(defn aws-integration-builder
  ""
  [id config]
  (build-aws-integration-builder (AwsIntegration$Builder/create) id config))


(defn build-aws-integration-props-builder
  "The build-aws-integration-props-builder function updates a AwsIntegrationProps$Builder instance using the provided configuration.
  The function takes the AwsIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `subdomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdomain` |
"
  [^AwsIntegrationProps$Builder builder id config]
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
  (.build builder))


(defn aws-integration-props-builder
  ""
  [id config]
  (build-aws-integration-props-builder (new AwsIntegrationProps$Builder) id config))


(defn build-base-path-mapping-builder
  "The build-base-path-mapping-builder function updates a BasePathMapping$Builder instance using the provided configuration.
  The function takes the BasePathMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachToStage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:attach-to-stage` |
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `domainName` | software.amazon.awscdk.services.apigateway.IDomainName | [[cdk.support/lookup-entry]] | `:domain-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `stage` | software.amazon.awscdk.services.apigateway.Stage | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^BasePathMapping$Builder builder id config]
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
  (.build builder))


(defn base-path-mapping-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-base-path-mapping-builder (BasePathMapping$Builder/create scope (name id)) id config))


(defn build-base-path-mapping-options-builder
  "The build-base-path-mapping-options-builder function updates a BasePathMappingOptions$Builder instance using the provided configuration.
  The function takes the BasePathMappingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachToStage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:attach-to-stage` |
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `stage` | software.amazon.awscdk.services.apigateway.Stage | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^BasePathMappingOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :attach-to-stage)]
    (. builder attachToStage data))
  (when-let [data (lookup-entry config id :base-path)]
    (. builder basePath data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn base-path-mapping-options-builder
  ""
  [id config]
  (build-base-path-mapping-options-builder (new BasePathMappingOptions$Builder) id config))


(defn build-base-path-mapping-props-builder
  "The build-base-path-mapping-props-builder function updates a BasePathMappingProps$Builder instance using the provided configuration.
  The function takes the BasePathMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachToStage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:attach-to-stage` |
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `domainName` | software.amazon.awscdk.services.apigateway.IDomainName | [[cdk.support/lookup-entry]] | `:domain-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `stage` | software.amazon.awscdk.services.apigateway.Stage | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^BasePathMappingProps$Builder builder id config]
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
  (.build builder))


(defn base-path-mapping-props-builder
  ""
  [id config]
  (build-base-path-mapping-props-builder (new BasePathMappingProps$Builder) id config))


(defn build-cfn-account-builder
  "The build-cfn-account-builder function updates a CfnAccount$Builder instance using the provided configuration.
  The function takes the CfnAccount$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-role-arn` |
"
  [^CfnAccount$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-role-arn)]
    (. builder cloudWatchRoleArn data))
  (.build builder))


(defn cfn-account-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-account-builder (CfnAccount$Builder/create scope (name id)) id config))


(defn build-cfn-account-props-builder
  "The build-cfn-account-props-builder function updates a CfnAccountProps$Builder instance using the provided configuration.
  The function takes the CfnAccountProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-role-arn` |
"
  [^CfnAccountProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-role-arn)]
    (. builder cloudWatchRoleArn data))
  (.build builder))


(defn cfn-account-props-builder
  ""
  [id config]
  (build-cfn-account-props-builder (new CfnAccountProps$Builder) id config))


(defn build-cfn-api-key-builder
  "The build-cfn-api-key-builder function updates a CfnApiKey$Builder instance using the provided configuration.
  The function takes the CfnApiKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `generateDistinctId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-distinct-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stageKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:stage-keys` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnApiKey$Builder builder id config]
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
  (.build builder))


(defn cfn-api-key-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-api-key-builder (CfnApiKey$Builder/create scope (name id)) id config))


(defn build-cfn-api-key-props-builder
  "The build-cfn-api-key-props-builder function updates a CfnApiKeyProps$Builder instance using the provided configuration.
  The function takes the CfnApiKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `generateDistinctId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-distinct-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stageKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:stage-keys` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnApiKeyProps$Builder builder id config]
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
  (.build builder))


(defn cfn-api-key-props-builder
  ""
  [id config]
  (build-cfn-api-key-props-builder (new CfnApiKeyProps$Builder) id config))


(defn build-cfn-api-key-stage-key-property-builder
  "The build-cfn-api-key-stage-key-property-builder function updates a CfnApiKey$StageKeyProperty$Builder instance using the provided configuration.
  The function takes the CfnApiKey$StageKeyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^CfnApiKey$StageKeyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn cfn-api-key-stage-key-property-builder
  ""
  [id config]
  (build-cfn-api-key-stage-key-property-builder (new CfnApiKey$StageKeyProperty$Builder) id config))


(defn build-cfn-authorizer-builder
  "The build-cfn-authorizer-builder function updates a CfnAuthorizer$Builder instance using the provided configuration.
  The function takes the CfnAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAuthorizer$Builder builder id config]
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
  (.build builder))


(defn cfn-authorizer-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-authorizer-builder (CfnAuthorizer$Builder/create scope (name id)) id config))


(defn build-cfn-authorizer-props-builder
  "The build-cfn-authorizer-props-builder function updates a CfnAuthorizerProps$Builder instance using the provided configuration.
  The function takes the CfnAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAuthorizerProps$Builder builder id config]
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
  (.build builder))


(defn cfn-authorizer-props-builder
  ""
  [id config]
  (build-cfn-authorizer-props-builder (new CfnAuthorizerProps$Builder) id config))


(defn build-cfn-base-path-mapping-builder
  "The build-cfn-base-path-mapping-builder function updates a CfnBasePathMapping$Builder instance using the provided configuration.
  The function takes the CfnBasePathMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^CfnBasePathMapping$Builder builder id config]
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
  (.build builder))


(defn cfn-base-path-mapping-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-base-path-mapping-builder (CfnBasePathMapping$Builder/create scope (name id)) id config))


(defn build-cfn-base-path-mapping-props-builder
  "The build-cfn-base-path-mapping-props-builder function updates a CfnBasePathMappingProps$Builder instance using the provided configuration.
  The function takes the CfnBasePathMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^CfnBasePathMappingProps$Builder builder id config]
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
  (.build builder))


(defn cfn-base-path-mapping-props-builder
  ""
  [id config]
  (build-cfn-base-path-mapping-props-builder (new CfnBasePathMappingProps$Builder) id config))


(defn build-cfn-client-certificate-builder
  "The build-cfn-client-certificate-builder function updates a CfnClientCertificate$Builder instance using the provided configuration.
  The function takes the CfnClientCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClientCertificate$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-client-certificate-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-client-certificate-builder (CfnClientCertificate$Builder/create scope (name id)) id config))


(defn build-cfn-client-certificate-props-builder
  "The build-cfn-client-certificate-props-builder function updates a CfnClientCertificateProps$Builder instance using the provided configuration.
  The function takes the CfnClientCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClientCertificateProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-client-certificate-props-builder
  ""
  [id config]
  (build-cfn-client-certificate-props-builder (new CfnClientCertificateProps$Builder) id config))


(defn build-cfn-deployment-access-log-setting-property-builder
  "The build-cfn-deployment-access-log-setting-property-builder function updates a CfnDeployment$AccessLogSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$AccessLogSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
"
  [^CfnDeployment$AccessLogSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (.build builder))


(defn cfn-deployment-access-log-setting-property-builder
  ""
  [id config]
  (build-cfn-deployment-access-log-setting-property-builder (new CfnDeployment$AccessLogSettingProperty$Builder) id config))


(defn build-cfn-deployment-builder
  "The build-cfn-deployment-builder function updates a CfnDeployment$Builder instance using the provided configuration.
  The function takes the CfnDeployment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentCanarySettings` | software.amazon.awscdk.services.apigateway.CfnDeployment$DeploymentCanarySettingsProperty | [[cdk.support/lookup-entry]] | `:deployment-canary-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stageDescription` | software.amazon.awscdk.services.apigateway.CfnDeployment$StageDescriptionProperty | [[cdk.support/lookup-entry]] | `:stage-description` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^CfnDeployment$Builder builder id config]
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
  (.build builder))


(defn cfn-deployment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-deployment-builder (CfnDeployment$Builder/create scope (name id)) id config))


(defn build-cfn-deployment-canary-setting-property-builder
  "The build-cfn-deployment-canary-setting-property-builder function updates a CfnDeployment$CanarySettingProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$CanarySettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `percentTraffic` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percent-traffic` |
| `stageVariableOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stage-variable-overrides` |
| `useStageCache` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-stage-cache` |
"
  [^CfnDeployment$CanarySettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :percent-traffic)]
    (. builder percentTraffic data))
  (when-let [data (lookup-entry config id :stage-variable-overrides)]
    (. builder stageVariableOverrides data))
  (when-let [data (lookup-entry config id :use-stage-cache)]
    (. builder useStageCache data))
  (.build builder))


(defn cfn-deployment-canary-setting-property-builder
  ""
  [id config]
  (build-cfn-deployment-canary-setting-property-builder (new CfnDeployment$CanarySettingProperty$Builder) id config))


(defn build-cfn-deployment-deployment-canary-settings-property-builder
  "The build-cfn-deployment-deployment-canary-settings-property-builder function updates a CfnDeployment$DeploymentCanarySettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$DeploymentCanarySettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `percentTraffic` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percent-traffic` |
| `stageVariableOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:stage-variable-overrides` |
| `useStageCache` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-stage-cache` |
"
  [^CfnDeployment$DeploymentCanarySettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :percent-traffic)]
    (. builder percentTraffic data))
  (when-let [data (lookup-entry config id :stage-variable-overrides)]
    (. builder stageVariableOverrides data))
  (when-let [data (lookup-entry config id :use-stage-cache)]
    (. builder useStageCache data))
  (.build builder))


(defn cfn-deployment-deployment-canary-settings-property-builder
  ""
  [id config]
  (build-cfn-deployment-deployment-canary-settings-property-builder (new CfnDeployment$DeploymentCanarySettingsProperty$Builder) id config))


(defn build-cfn-deployment-method-setting-property-builder
  "The build-cfn-deployment-method-setting-property-builder function updates a CfnDeployment$MethodSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$MethodSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
"
  [^CfnDeployment$MethodSettingProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-deployment-method-setting-property-builder
  ""
  [id config]
  (build-cfn-deployment-method-setting-property-builder (new CfnDeployment$MethodSettingProperty$Builder) id config))


(defn build-cfn-deployment-props-builder
  "The build-cfn-deployment-props-builder function updates a CfnDeploymentProps$Builder instance using the provided configuration.
  The function takes the CfnDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentCanarySettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-canary-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `stageDescription` | software.amazon.awscdk.services.apigateway.CfnDeployment$StageDescriptionProperty | [[cdk.support/lookup-entry]] | `:stage-description` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^CfnDeploymentProps$Builder builder id config]
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
  (.build builder))


(defn cfn-deployment-props-builder
  ""
  [id config]
  (build-cfn-deployment-props-builder (new CfnDeploymentProps$Builder) id config))


(defn build-cfn-deployment-stage-description-property-builder
  "The build-cfn-deployment-stage-description-property-builder function updates a CfnDeployment$StageDescriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$StageDescriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnDeployment$StageDescriptionProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-deployment-stage-description-property-builder
  ""
  [id config]
  (build-cfn-deployment-stage-description-property-builder (new CfnDeployment$StageDescriptionProperty$Builder) id config))


(defn build-cfn-documentation-part-builder
  "The build-cfn-documentation-part-builder function updates a CfnDocumentationPart$Builder instance using the provided configuration.
  The function takes the CfnDocumentationPart$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.apigateway.CfnDocumentationPart$LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `properties` | java.lang.String | [[cdk.support/lookup-entry]] | `:properties` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnDocumentationPart$Builder builder id config]
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (.build builder))


(defn cfn-documentation-part-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-documentation-part-builder (CfnDocumentationPart$Builder/create scope (name id)) id config))


(defn build-cfn-documentation-part-location-property-builder
  "The build-cfn-documentation-part-location-property-builder function updates a CfnDocumentationPart$LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnDocumentationPart$LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDocumentationPart$LocationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-documentation-part-location-property-builder
  ""
  [id config]
  (build-cfn-documentation-part-location-property-builder (new CfnDocumentationPart$LocationProperty$Builder) id config))


(defn build-cfn-documentation-part-props-builder
  "The build-cfn-documentation-part-props-builder function updates a CfnDocumentationPartProps$Builder instance using the provided configuration.
  The function takes the CfnDocumentationPartProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.apigateway.CfnDocumentationPart$LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `properties` | java.lang.String | [[cdk.support/lookup-entry]] | `:properties` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnDocumentationPartProps$Builder builder id config]
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (.build builder))


(defn cfn-documentation-part-props-builder
  ""
  [id config]
  (build-cfn-documentation-part-props-builder (new CfnDocumentationPartProps$Builder) id config))


(defn build-cfn-documentation-version-builder
  "The build-cfn-documentation-version-builder function updates a CfnDocumentationVersion$Builder instance using the provided configuration.
  The function takes the CfnDocumentationVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnDocumentationVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :documentation-version)]
    (. builder documentationVersion data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (.build builder))


(defn cfn-documentation-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-documentation-version-builder (CfnDocumentationVersion$Builder/create scope (name id)) id config))


(defn build-cfn-documentation-version-props-builder
  "The build-cfn-documentation-version-props-builder function updates a CfnDocumentationVersionProps$Builder instance using the provided configuration.
  The function takes the CfnDocumentationVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:documentation-version` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnDocumentationVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :documentation-version)]
    (. builder documentationVersion data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (.build builder))


(defn cfn-documentation-version-props-builder
  ""
  [id config]
  (build-cfn-documentation-version-props-builder (new CfnDocumentationVersionProps$Builder) id config))


(defn build-cfn-domain-name-builder
  "The build-cfn-domain-name-builder function updates a CfnDomainName$Builder instance using the provided configuration.
  The function takes the CfnDomainName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `ownershipVerificationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ownership-verification-certificate-arn` |
| `regionalCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:regional-certificate-arn` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomainName$Builder builder id config]
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
  (.build builder))


(defn cfn-domain-name-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-domain-name-builder (CfnDomainName$Builder/create scope (name id)) id config))


(defn build-cfn-domain-name-endpoint-configuration-property-builder
  "The build-cfn-domain-name-endpoint-configuration-property-builder function updates a CfnDomainName$EndpointConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainName$EndpointConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `types` | java.util.List | [[cdk.support/lookup-entry]] | `:types` |
"
  [^CfnDomainName$EndpointConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :types)]
    (. builder types data))
  (.build builder))


(defn cfn-domain-name-endpoint-configuration-property-builder
  ""
  [id config]
  (build-cfn-domain-name-endpoint-configuration-property-builder (new CfnDomainName$EndpointConfigurationProperty$Builder) id config))


(defn build-cfn-domain-name-mutual-tls-authentication-property-builder
  "The build-cfn-domain-name-mutual-tls-authentication-property-builder function updates a CfnDomainName$MutualTlsAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainName$MutualTlsAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `truststoreUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-uri` |
| `truststoreVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-version` |
"
  [^CfnDomainName$MutualTlsAuthenticationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :truststore-uri)]
    (. builder truststoreUri data))
  (when-let [data (lookup-entry config id :truststore-version)]
    (. builder truststoreVersion data))
  (.build builder))


(defn cfn-domain-name-mutual-tls-authentication-property-builder
  ""
  [id config]
  (build-cfn-domain-name-mutual-tls-authentication-property-builder (new CfnDomainName$MutualTlsAuthenticationProperty$Builder) id config))


(defn build-cfn-domain-name-props-builder
  "The build-cfn-domain-name-props-builder function updates a CfnDomainNameProps$Builder instance using the provided configuration.
  The function takes the CfnDomainNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `ownershipVerificationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ownership-verification-certificate-arn` |
| `regionalCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:regional-certificate-arn` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomainNameProps$Builder builder id config]
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
  (.build builder))


(defn cfn-domain-name-props-builder
  ""
  [id config]
  (build-cfn-domain-name-props-builder (new CfnDomainNameProps$Builder) id config))


(defn build-cfn-gateway-response-builder
  "The build-cfn-gateway-response-builder function updates a CfnGatewayResponse$Builder instance using the provided configuration.
  The function takes the CfnGatewayResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-templates` |
| `responseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-type` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnGatewayResponse$Builder builder id config]
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
  (.build builder))


(defn cfn-gateway-response-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-gateway-response-builder (CfnGatewayResponse$Builder/create scope (name id)) id config))


(defn build-cfn-gateway-response-props-builder
  "The build-cfn-gateway-response-props-builder function updates a CfnGatewayResponseProps$Builder instance using the provided configuration.
  The function takes the CfnGatewayResponseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-templates` |
| `responseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-type` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnGatewayResponseProps$Builder builder id config]
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
  (.build builder))


(defn cfn-gateway-response-props-builder
  ""
  [id config]
  (build-cfn-gateway-response-props-builder (new CfnGatewayResponseProps$Builder) id config))


(defn build-cfn-method-builder
  "The build-cfn-method-builder function updates a CfnMethod$Builder instance using the provided configuration.
  The function takes the CfnMethod$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnMethod$Builder builder id config]
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
  (.build builder))


(defn cfn-method-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-method-builder (CfnMethod$Builder/create scope (name id)) id config))


(defn build-cfn-method-integration-property-builder
  "The build-cfn-method-integration-property-builder function updates a CfnMethod$IntegrationProperty$Builder instance using the provided configuration.
  The function takes the CfnMethod$IntegrationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnMethod$IntegrationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-method-integration-property-builder
  ""
  [id config]
  (build-cfn-method-integration-property-builder (new CfnMethod$IntegrationProperty$Builder) id config))


(defn build-cfn-method-integration-response-property-builder
  "The build-cfn-method-integration-response-property-builder function updates a CfnMethod$IntegrationResponseProperty$Builder instance using the provided configuration.
  The function takes the CfnMethod$IntegrationResponseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-handling` |
| `responseParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-templates` |
| `selectionPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-pattern` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnMethod$IntegrationResponseProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-method-integration-response-property-builder
  ""
  [id config]
  (build-cfn-method-integration-response-property-builder (new CfnMethod$IntegrationResponseProperty$Builder) id config))


(defn build-cfn-method-method-response-property-builder
  "The build-cfn-method-method-response-property-builder function updates a CfnMethod$MethodResponseProperty$Builder instance using the provided configuration.
  The function takes the CfnMethod$MethodResponseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseModels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-models` |
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnMethod$MethodResponseProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :response-models)]
    (. builder responseModels data))
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (when-let [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn cfn-method-method-response-property-builder
  ""
  [id config]
  (build-cfn-method-method-response-property-builder (new CfnMethod$MethodResponseProperty$Builder) id config))


(defn build-cfn-method-props-builder
  "The build-cfn-method-props-builder function updates a CfnMethodProps$Builder instance using the provided configuration.
  The function takes the CfnMethodProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnMethodProps$Builder builder id config]
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
  (.build builder))


(defn cfn-method-props-builder
  ""
  [id config]
  (build-cfn-method-props-builder (new CfnMethodProps$Builder) id config))


(defn build-cfn-model-builder
  "The build-cfn-model-builder function updates a CfnModel$Builder instance using the provided configuration.
  The function takes the CfnModel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnModel$Builder builder id config]
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
  (.build builder))


(defn cfn-model-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-model-builder (CfnModel$Builder/create scope (name id)) id config))


(defn build-cfn-model-props-builder
  "The build-cfn-model-props-builder function updates a CfnModelProps$Builder instance using the provided configuration.
  The function takes the CfnModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnModelProps$Builder builder id config]
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
  (.build builder))


(defn cfn-model-props-builder
  ""
  [id config]
  (build-cfn-model-props-builder (new CfnModelProps$Builder) id config))


(defn build-cfn-request-validator-builder
  "The build-cfn-request-validator-builder function updates a CfnRequestValidator$Builder instance using the provided configuration.
  The function takes the CfnRequestValidator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `validateRequestBody` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |
"
  [^CfnRequestValidator$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (when-let [data (lookup-entry config id :validate-request-body)]
    (. builder validateRequestBody data))
  (when-let [data (lookup-entry config id :validate-request-parameters)]
    (. builder validateRequestParameters data))
  (.build builder))


(defn cfn-request-validator-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-request-validator-builder (CfnRequestValidator$Builder/create scope (name id)) id config))


(defn build-cfn-request-validator-props-builder
  "The build-cfn-request-validator-props-builder function updates a CfnRequestValidatorProps$Builder instance using the provided configuration.
  The function takes the CfnRequestValidatorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `validateRequestBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |
"
  [^CfnRequestValidatorProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (when-let [data (lookup-entry config id :validate-request-body)]
    (. builder validateRequestBody data))
  (when-let [data (lookup-entry config id :validate-request-parameters)]
    (. builder validateRequestParameters data))
  (.build builder))


(defn cfn-request-validator-props-builder
  ""
  [id config]
  (build-cfn-request-validator-props-builder (new CfnRequestValidatorProps$Builder) id config))


(defn build-cfn-resource-builder
  "The build-cfn-resource-builder function updates a CfnResource$Builder instance using the provided configuration.
  The function takes the CfnResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-id` |
| `pathPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-part` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnResource$Builder builder id config]
  (when-let [data (lookup-entry config id :parent-id)]
    (. builder parentId data))
  (when-let [data (lookup-entry config id :path-part)]
    (. builder pathPart data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (.build builder))


(defn cfn-resource-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-builder (CfnResource$Builder/create scope (name id)) id config))


(defn build-cfn-resource-props-builder
  "The build-cfn-resource-props-builder function updates a CfnResourceProps$Builder instance using the provided configuration.
  The function takes the CfnResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-id` |
| `pathPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-part` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnResourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :parent-id)]
    (. builder parentId data))
  (when-let [data (lookup-entry config id :path-part)]
    (. builder pathPart data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (.build builder))


(defn cfn-resource-props-builder
  ""
  [id config]
  (build-cfn-resource-props-builder (new CfnResourceProps$Builder) id config))


(defn build-cfn-rest-api-builder
  "The build-cfn-rest-api-builder function updates a CfnRestApi$Builder instance using the provided configuration.
  The function takes the CfnRestApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRestApi$Builder builder id config]
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
  (.build builder))


(defn cfn-rest-api-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-rest-api-builder (CfnRestApi$Builder/create scope (name id)) id config))


(defn build-cfn-rest-api-endpoint-configuration-property-builder
  "The build-cfn-rest-api-endpoint-configuration-property-builder function updates a CfnRestApi$EndpointConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRestApi$EndpointConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `types` | java.util.List | [[cdk.support/lookup-entry]] | `:types` |
| `vpcEndpointIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoint-ids` |
"
  [^CfnRestApi$EndpointConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :types)]
    (. builder types data))
  (when-let [data (lookup-entry config id :vpc-endpoint-ids)]
    (. builder vpcEndpointIds data))
  (.build builder))


(defn cfn-rest-api-endpoint-configuration-property-builder
  ""
  [id config]
  (build-cfn-rest-api-endpoint-configuration-property-builder (new CfnRestApi$EndpointConfigurationProperty$Builder) id config))


(defn build-cfn-rest-api-props-builder
  "The build-cfn-rest-api-props-builder function updates a CfnRestApiProps$Builder instance using the provided configuration.
  The function takes the CfnRestApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRestApiProps$Builder builder id config]
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
  (.build builder))


(defn cfn-rest-api-props-builder
  ""
  [id config]
  (build-cfn-rest-api-props-builder (new CfnRestApiProps$Builder) id config))


(defn build-cfn-rest-api-s3-location-property-builder
  "The build-cfn-rest-api-s3-location-property-builder function updates a CfnRestApi$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnRestApi$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `eTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:e-tag` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnRestApi$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :e-tag)]
    (. builder eTag data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-rest-api-s3-location-property-builder
  ""
  [id config]
  (build-cfn-rest-api-s3-location-property-builder (new CfnRestApi$S3LocationProperty$Builder) id config))


(defn build-cfn-stage-access-log-setting-property-builder
  "The build-cfn-stage-access-log-setting-property-builder function updates a CfnStage$AccessLogSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnStage$AccessLogSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
"
  [^CfnStage$AccessLogSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (.build builder))


(defn cfn-stage-access-log-setting-property-builder
  ""
  [id config]
  (build-cfn-stage-access-log-setting-property-builder (new CfnStage$AccessLogSettingProperty$Builder) id config))


(defn build-cfn-stage-builder
  "The build-cfn-stage-builder function updates a CfnStage$Builder instance using the provided configuration.
  The function takes the CfnStage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnStage$Builder builder id config]
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
  (.build builder))


(defn cfn-stage-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-stage-builder (CfnStage$Builder/create scope (name id)) id config))


(defn build-cfn-stage-canary-setting-property-builder
  "The build-cfn-stage-canary-setting-property-builder function updates a CfnStage$CanarySettingProperty$Builder instance using the provided configuration.
  The function takes the CfnStage$CanarySettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-id` |
| `percentTraffic` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percent-traffic` |
| `stageVariableOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stage-variable-overrides` |
| `useStageCache` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-stage-cache` |
"
  [^CfnStage$CanarySettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-id)]
    (. builder deploymentId data))
  (when-let [data (lookup-entry config id :percent-traffic)]
    (. builder percentTraffic data))
  (when-let [data (lookup-entry config id :stage-variable-overrides)]
    (. builder stageVariableOverrides data))
  (when-let [data (lookup-entry config id :use-stage-cache)]
    (. builder useStageCache data))
  (.build builder))


(defn cfn-stage-canary-setting-property-builder
  ""
  [id config]
  (build-cfn-stage-canary-setting-property-builder (new CfnStage$CanarySettingProperty$Builder) id config))


(defn build-cfn-stage-method-setting-property-builder
  "The build-cfn-stage-method-setting-property-builder function updates a CfnStage$MethodSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnStage$MethodSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
"
  [^CfnStage$MethodSettingProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-stage-method-setting-property-builder
  ""
  [id config]
  (build-cfn-stage-method-setting-property-builder (new CfnStage$MethodSettingProperty$Builder) id config))


(defn build-cfn-stage-props-builder
  "The build-cfn-stage-props-builder function updates a CfnStageProps$Builder instance using the provided configuration.
  The function takes the CfnStageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnStageProps$Builder builder id config]
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
  (.build builder))


(defn cfn-stage-props-builder
  ""
  [id config]
  (build-cfn-stage-props-builder (new CfnStageProps$Builder) id config))


(defn build-cfn-usage-plan-api-stage-property-builder
  "The build-cfn-usage-plan-api-stage-property-builder function updates a CfnUsagePlan$ApiStageProperty$Builder instance using the provided configuration.
  The function takes the CfnUsagePlan$ApiStageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
| `throttle` | java.util.Map | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^CfnUsagePlan$ApiStageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (.build builder))


(defn cfn-usage-plan-api-stage-property-builder
  ""
  [id config]
  (build-cfn-usage-plan-api-stage-property-builder (new CfnUsagePlan$ApiStageProperty$Builder) id config))


(defn build-cfn-usage-plan-builder
  "The build-cfn-usage-plan-builder function updates a CfnUsagePlan$Builder instance using the provided configuration.
  The function takes the CfnUsagePlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiStages` | java.util.List | [[cdk.support/lookup-entry]] | `:api-stages` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `quota` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:quota` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throttle` | software.amazon.awscdk.services.apigateway.CfnUsagePlan$ThrottleSettingsProperty | [[cdk.support/lookup-entry]] | `:throttle` |
| `usagePlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-plan-name` |
"
  [^CfnUsagePlan$Builder builder id config]
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
  (.build builder))


(defn cfn-usage-plan-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-usage-plan-builder (CfnUsagePlan$Builder/create scope (name id)) id config))


(defn build-cfn-usage-plan-key-builder
  "The build-cfn-usage-plan-key-builder function updates a CfnUsagePlanKey$Builder instance using the provided configuration.
  The function takes the CfnUsagePlanKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `usagePlanId` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-plan-id` |
"
  [^CfnUsagePlanKey$Builder builder id config]
  (when-let [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (when-let [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (when-let [data (lookup-entry config id :usage-plan-id)]
    (. builder usagePlanId data))
  (.build builder))


(defn cfn-usage-plan-key-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-usage-plan-key-builder (CfnUsagePlanKey$Builder/create scope (name id)) id config))


(defn build-cfn-usage-plan-key-props-builder
  "The build-cfn-usage-plan-key-props-builder function updates a CfnUsagePlanKeyProps$Builder instance using the provided configuration.
  The function takes the CfnUsagePlanKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `usagePlanId` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-plan-id` |
"
  [^CfnUsagePlanKeyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (when-let [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (when-let [data (lookup-entry config id :usage-plan-id)]
    (. builder usagePlanId data))
  (.build builder))


(defn cfn-usage-plan-key-props-builder
  ""
  [id config]
  (build-cfn-usage-plan-key-props-builder (new CfnUsagePlanKeyProps$Builder) id config))


(defn build-cfn-usage-plan-props-builder
  "The build-cfn-usage-plan-props-builder function updates a CfnUsagePlanProps$Builder instance using the provided configuration.
  The function takes the CfnUsagePlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiStages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-stages` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `quota` | software.amazon.awscdk.services.apigateway.CfnUsagePlan$QuotaSettingsProperty | [[cdk.support/lookup-entry]] | `:quota` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throttle` | software.amazon.awscdk.services.apigateway.CfnUsagePlan$ThrottleSettingsProperty | [[cdk.support/lookup-entry]] | `:throttle` |
| `usagePlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-plan-name` |
"
  [^CfnUsagePlanProps$Builder builder id config]
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
  (.build builder))


(defn cfn-usage-plan-props-builder
  ""
  [id config]
  (build-cfn-usage-plan-props-builder (new CfnUsagePlanProps$Builder) id config))


(defn build-cfn-usage-plan-quota-settings-property-builder
  "The build-cfn-usage-plan-quota-settings-property-builder function updates a CfnUsagePlan$QuotaSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUsagePlan$QuotaSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `offset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:offset` |
| `period` | java.lang.String | [[cdk.support/lookup-entry]] | `:period` |
"
  [^CfnUsagePlan$QuotaSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :limit)]
    (. builder limit data))
  (when-let [data (lookup-entry config id :offset)]
    (. builder offset data))
  (when-let [data (lookup-entry config id :period)]
    (. builder period data))
  (.build builder))


(defn cfn-usage-plan-quota-settings-property-builder
  ""
  [id config]
  (build-cfn-usage-plan-quota-settings-property-builder (new CfnUsagePlan$QuotaSettingsProperty$Builder) id config))


(defn build-cfn-usage-plan-throttle-settings-property-builder
  "The build-cfn-usage-plan-throttle-settings-property-builder function updates a CfnUsagePlan$ThrottleSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUsagePlan$ThrottleSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `burstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:burst-limit` |
| `rateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit` |
"
  [^CfnUsagePlan$ThrottleSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :burst-limit)]
    (. builder burstLimit data))
  (when-let [data (lookup-entry config id :rate-limit)]
    (. builder rateLimit data))
  (.build builder))


(defn cfn-usage-plan-throttle-settings-property-builder
  ""
  [id config]
  (build-cfn-usage-plan-throttle-settings-property-builder (new CfnUsagePlan$ThrottleSettingsProperty$Builder) id config))


(defn build-cfn-vpc-link-builder
  "The build-cfn-vpc-link-builder function updates a CfnVpcLink$Builder instance using the provided configuration.
  The function takes the CfnVpcLink$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-arns` |
"
  [^CfnVpcLink$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-arns)]
    (. builder targetArns data))
  (.build builder))


(defn cfn-vpc-link-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-vpc-link-builder (CfnVpcLink$Builder/create scope (name id)) id config))


(defn build-cfn-vpc-link-props-builder
  "The build-cfn-vpc-link-props-builder function updates a CfnVpcLinkProps$Builder instance using the provided configuration.
  The function takes the CfnVpcLinkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-arns` |
"
  [^CfnVpcLinkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-arns)]
    (. builder targetArns data))
  (.build builder))


(defn cfn-vpc-link-props-builder
  ""
  [id config]
  (build-cfn-vpc-link-props-builder (new CfnVpcLinkProps$Builder) id config))


(defn build-cognito-user-pools-authorizer-builder
  "The build-cognito-user-pools-authorizer-builder function updates a CognitoUserPoolsAuthorizer$Builder instance using the provided configuration.
  The function takes the CognitoUserPoolsAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `cognitoUserPools` | java.util.List | [[cdk.support/lookup-entry]] | `:cognito-user-pools` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
"
  [^CognitoUserPoolsAuthorizer$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :cognito-user-pools)]
    (. builder cognitoUserPools data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :results-cache-ttl)]
    (. builder resultsCacheTtl data))
  (.build builder))


(defn cognito-user-pools-authorizer-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cognito-user-pools-authorizer-builder (CognitoUserPoolsAuthorizer$Builder/create scope (name id)) id config))


(defn build-cognito-user-pools-authorizer-props-builder
  "The build-cognito-user-pools-authorizer-props-builder function updates a CognitoUserPoolsAuthorizerProps$Builder instance using the provided configuration.
  The function takes the CognitoUserPoolsAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `cognitoUserPools` | java.util.List | [[cdk.support/lookup-entry]] | `:cognito-user-pools` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
"
  [^CognitoUserPoolsAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :cognito-user-pools)]
    (. builder cognitoUserPools data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :results-cache-ttl)]
    (. builder resultsCacheTtl data))
  (.build builder))


(defn cognito-user-pools-authorizer-props-builder
  ""
  [id config]
  (build-cognito-user-pools-authorizer-props-builder (new CognitoUserPoolsAuthorizerProps$Builder) id config))


(defn build-cors-options-builder
  "The build-cors-options-builder function updates a CorsOptions$Builder instance using the provided configuration.
  The function takes the CorsOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-origins` |
| `disableCache` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-cache` |
| `exposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:expose-headers` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |
| `statusCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CorsOptions$Builder builder id config]
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
  (.build builder))


(defn cors-options-builder
  ""
  [id config]
  (build-cors-options-builder (new CorsOptions$Builder) id config))


(defn build-deployment-builder
  "The build-deployment-builder function updates a Deployment$Builder instance using the provided configuration.
  The function takes the Deployment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^Deployment$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :retain-deployments)]
    (. builder retainDeployments data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn deployment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-deployment-builder (Deployment$Builder/create scope (name id)) id config))


(defn build-deployment-props-builder
  "The build-deployment-props-builder function updates a DeploymentProps$Builder instance using the provided configuration.
  The function takes the DeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^DeploymentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :retain-deployments)]
    (. builder retainDeployments data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn deployment-props-builder
  ""
  [id config]
  (build-deployment-props-builder (new DeploymentProps$Builder) id config))


(defn build-domain-name-attributes-builder
  "The build-domain-name-attributes-builder function updates a DomainNameAttributes$Builder instance using the provided configuration.
  The function takes the DomainNameAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainNameAliasHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name-alias-hosted-zone-id` |
| `domainNameAliasTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name-alias-target` |
"
  [^DomainNameAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :domain-name-alias-hosted-zone-id)]
    (. builder domainNameAliasHostedZoneId data))
  (when-let [data (lookup-entry config id :domain-name-alias-target)]
    (. builder domainNameAliasTarget data))
  (.build builder))


(defn domain-name-attributes-builder
  ""
  [id config]
  (build-domain-name-attributes-builder (new DomainNameAttributes$Builder) id config))


(defn build-domain-name-builder
  "The build-domain-name-builder function updates a DomainName$Builder instance using the provided configuration.
  The function takes the DomainName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointType` | software.amazon.awscdk.services.apigateway.EndpointType | [[cdk.api.services.apigateway/endpoint-type]] | `:endpoint-type` |
| `mapping` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:mapping` |
| `mtls` | software.amazon.awscdk.services.apigateway.MTLSConfig | [[cdk.support/lookup-entry]] | `:mtls` |
| `securityPolicy` | software.amazon.awscdk.services.apigateway.SecurityPolicy | [[cdk.api.services.apigateway/security-policy]] | `:security-policy` |
"
  [^DomainName$Builder builder id config]
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
  (.build builder))


(defn domain-name-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-domain-name-builder (DomainName$Builder/create scope (name id)) id config))


(defn build-domain-name-options-builder
  "The build-domain-name-options-builder function updates a DomainNameOptions$Builder instance using the provided configuration.
  The function takes the DomainNameOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointType` | software.amazon.awscdk.services.apigateway.EndpointType | [[cdk.api.services.apigateway/endpoint-type]] | `:endpoint-type` |
| `mtls` | software.amazon.awscdk.services.apigateway.MTLSConfig | [[cdk.support/lookup-entry]] | `:mtls` |
| `securityPolicy` | software.amazon.awscdk.services.apigateway.SecurityPolicy | [[cdk.api.services.apigateway/security-policy]] | `:security-policy` |
"
  [^DomainNameOptions$Builder builder id config]
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
  (.build builder))


(defn domain-name-options-builder
  ""
  [id config]
  (build-domain-name-options-builder (new DomainNameOptions$Builder) id config))


(defn build-domain-name-props-builder
  "The build-domain-name-props-builder function updates a DomainNameProps$Builder instance using the provided configuration.
  The function takes the DomainNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointType` | software.amazon.awscdk.services.apigateway.EndpointType | [[cdk.api.services.apigateway/endpoint-type]] | `:endpoint-type` |
| `mapping` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:mapping` |
| `mtls` | software.amazon.awscdk.services.apigateway.MTLSConfig | [[cdk.support/lookup-entry]] | `:mtls` |
| `securityPolicy` | software.amazon.awscdk.services.apigateway.SecurityPolicy | [[cdk.api.services.apigateway/security-policy]] | `:security-policy` |
"
  [^DomainNameProps$Builder builder id config]
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
  (.build builder))


(defn domain-name-props-builder
  ""
  [id config]
  (build-domain-name-props-builder (new DomainNameProps$Builder) id config))


(defn build-endpoint-configuration-builder
  "The build-endpoint-configuration-builder function updates a EndpointConfiguration$Builder instance using the provided configuration.
  The function takes the EndpointConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `types` | java.util.List | [[cdk.support/lookup-entry]] | `:types` |
| `vpcEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoints` |
"
  [^EndpointConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :types)]
    (. builder types data))
  (when-let [data (lookup-entry config id :vpc-endpoints)]
    (. builder vpcEndpoints data))
  (.build builder))


(defn endpoint-configuration-builder
  ""
  [id config]
  (build-endpoint-configuration-builder (new EndpointConfiguration$Builder) id config))


(defn build-gateway-response-builder
  "The build-gateway-response-builder function updates a GatewayResponse$Builder instance using the provided configuration.
  The function takes the GatewayResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-headers` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `templates` | java.util.Map | [[cdk.support/lookup-entry]] | `:templates` |
| `type` | software.amazon.awscdk.services.apigateway.ResponseType | [[cdk.support/lookup-entry]] | `:type` |
"
  [^GatewayResponse$Builder builder id config]
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
  (.build builder))


(defn gateway-response-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-gateway-response-builder (GatewayResponse$Builder/create scope (name id)) id config))


(defn build-gateway-response-options-builder
  "The build-gateway-response-options-builder function updates a GatewayResponseOptions$Builder instance using the provided configuration.
  The function takes the GatewayResponseOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-headers` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `templates` | java.util.Map | [[cdk.support/lookup-entry]] | `:templates` |
| `type` | software.amazon.awscdk.services.apigateway.ResponseType | [[cdk.support/lookup-entry]] | `:type` |
"
  [^GatewayResponseOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :response-headers)]
    (. builder responseHeaders data))
  (when-let [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (when-let [data (lookup-entry config id :templates)]
    (. builder templates data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn gateway-response-options-builder
  ""
  [id config]
  (build-gateway-response-options-builder (new GatewayResponseOptions$Builder) id config))


(defn build-gateway-response-props-builder
  "The build-gateway-response-props-builder function updates a GatewayResponseProps$Builder instance using the provided configuration.
  The function takes the GatewayResponseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-headers` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `templates` | java.util.Map | [[cdk.support/lookup-entry]] | `:templates` |
| `type` | software.amazon.awscdk.services.apigateway.ResponseType | [[cdk.support/lookup-entry]] | `:type` |
"
  [^GatewayResponseProps$Builder builder id config]
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
  (.build builder))


(defn gateway-response-props-builder
  ""
  [id config]
  (build-gateway-response-props-builder (new GatewayResponseProps$Builder) id config))


(defn build-http-integration-builder
  "The build-http-integration-builder function updates a HttpIntegration$Builder instance using the provided configuration.
  The function takes the HttpIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |
"
  [^HttpIntegration$Builder builder id config]
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :proxy)]
    (. builder proxy data))
  (.build builder))


(defn build-http-integration-props-builder
  "The build-http-integration-props-builder function updates a HttpIntegrationProps$Builder instance using the provided configuration.
  The function takes the HttpIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `proxy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:proxy` |
"
  [^HttpIntegrationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :proxy)]
    (. builder proxy data))
  (.build builder))


(defn http-integration-props-builder
  ""
  [id config]
  (build-http-integration-props-builder (new HttpIntegrationProps$Builder) id config))


(defn build-integration-builder
  "The build-integration-builder function updates a Integration$Builder instance using the provided configuration.
  The function takes the Integration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `type` | software.amazon.awscdk.services.apigateway.IntegrationType | [[cdk.api.services.apigateway/integration-type]] | `:type` |
| `uri` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^Integration$Builder builder id config]
  (when-let [data (lookup-entry config id :integration-http-method)]
    (. builder integrationHttpMethod data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (integration-type config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn integration-builder
  ""
  [id config]
  (build-integration-builder (Integration$Builder/create) id config))


(defn build-integration-config-builder
  "The build-integration-config-builder function updates a IntegrationConfig$Builder instance using the provided configuration.
  The function takes the IntegrationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-token` |
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `type` | software.amazon.awscdk.services.apigateway.IntegrationType | [[cdk.api.services.apigateway/integration-type]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^IntegrationConfig$Builder builder id config]
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
  (.build builder))


(defn integration-config-builder
  ""
  [id config]
  (build-integration-config-builder (new IntegrationConfig$Builder) id config))


(defn build-integration-options-builder
  "The build-integration-options-builder function updates a IntegrationOptions$Builder instance using the provided configuration.
  The function takes the IntegrationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^IntegrationOptions$Builder builder id config]
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
  (.build builder))


(defn integration-options-builder
  ""
  [id config]
  (build-integration-options-builder (new IntegrationOptions$Builder) id config))


(defn build-integration-props-builder
  "The build-integration-props-builder function updates a IntegrationProps$Builder instance using the provided configuration.
  The function takes the IntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `integrationHttpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-http-method` |
| `options` | software.amazon.awscdk.services.apigateway.IntegrationOptions | [[cdk.support/lookup-entry]] | `:options` |
| `type` | software.amazon.awscdk.services.apigateway.IntegrationType | [[cdk.api.services.apigateway/integration-type]] | `:type` |
| `uri` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^IntegrationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :integration-http-method)]
    (. builder integrationHttpMethod data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (integration-type config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn integration-props-builder
  ""
  [id config]
  (build-integration-props-builder (new IntegrationProps$Builder) id config))


(defn build-integration-response-builder
  "The build-integration-response-builder function updates a IntegrationResponse$Builder instance using the provided configuration.
  The function takes the IntegrationResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigateway.ContentHandling | [[cdk.api.services.apigateway/content-handling]] | `:content-handling` |
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-templates` |
| `selectionPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-pattern` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^IntegrationResponse$Builder builder id config]
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
  (.build builder))


(defn integration-response-builder
  ""
  [id config]
  (build-integration-response-builder (new IntegrationResponse$Builder) id config))


(defn build-json-schema-builder
  "The build-json-schema-builder function updates a JsonSchema$Builder instance using the provided configuration.
  The function takes the JsonSchema$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `uniqueItems` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:unique-items` |
"
  [^JsonSchema$Builder builder id config]
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
  (.build builder))


(defn json-schema-builder
  ""
  [id config]
  (build-json-schema-builder (new JsonSchema$Builder) id config))


(defn build-json-with-standard-field-props-builder
  "The build-json-with-standard-field-props-builder function updates a JsonWithStandardFieldProps$Builder instance using the provided configuration.
  The function takes the JsonWithStandardFieldProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `user` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user` |
"
  [^JsonWithStandardFieldProps$Builder builder id config]
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
  (.build builder))


(defn json-with-standard-field-props-builder
  ""
  [id config]
  (build-json-with-standard-field-props-builder (new JsonWithStandardFieldProps$Builder) id config))


(defn build-lambda-authorizer-props-builder
  "The build-lambda-authorizer-props-builder function updates a LambdaAuthorizerProps$Builder instance using the provided configuration.
  The function takes the LambdaAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
"
  [^LambdaAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :assume-role)]
    (. builder assumeRole data))
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :results-cache-ttl)]
    (. builder resultsCacheTtl data))
  (.build builder))


(defn lambda-authorizer-props-builder
  ""
  [id config]
  (build-lambda-authorizer-props-builder (new LambdaAuthorizerProps$Builder) id config))


(defn build-lambda-integration-builder
  "The build-lambda-integration-builder function updates a LambdaIntegration$Builder instance using the provided configuration.
  The function takes the LambdaIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^LambdaIntegration$Builder builder id config]
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
  (.build builder))


(defn build-lambda-integration-options-builder
  "The build-lambda-integration-options-builder function updates a LambdaIntegrationOptions$Builder instance using the provided configuration.
  The function takes the LambdaIntegrationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^LambdaIntegrationOptions$Builder builder id config]
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
  (.build builder))


(defn lambda-integration-options-builder
  ""
  [id config]
  (build-lambda-integration-options-builder (new LambdaIntegrationOptions$Builder) id config))


(defn build-lambda-rest-api-builder
  "The build-lambda-rest-api-builder function updates a LambdaRestApi$Builder instance using the provided configuration.
  The function takes the LambdaRestApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
"
  [^LambdaRestApi$Builder builder id config]
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
  (.build builder))


(defn lambda-rest-api-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-lambda-rest-api-builder (LambdaRestApi$Builder/create scope (name id)) id config))


(defn build-lambda-rest-api-props-builder
  "The build-lambda-rest-api-props-builder function updates a LambdaRestApiProps$Builder instance using the provided configuration.
  The function takes the LambdaRestApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
"
  [^LambdaRestApiProps$Builder builder id config]
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
  (.build builder))


(defn lambda-rest-api-props-builder
  ""
  [id config]
  (build-lambda-rest-api-props-builder (new LambdaRestApiProps$Builder) id config))


(defn build-method-builder
  "The build-method-builder function updates a Method$Builder instance using the provided configuration.
  The function takes the Method$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `integration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:integration` |
| `options` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:options` |
| `resource` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^Method$Builder builder id config]
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn method-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-method-builder (Method$Builder/create scope (name id)) id config))


(defn build-method-deployment-options-builder
  "The build-method-deployment-options-builder function updates a MethodDeploymentOptions$Builder instance using the provided configuration.
  The function takes the MethodDeploymentOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheDataEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-data-encrypted` |
| `cacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cache-ttl` |
| `cachingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caching-enabled` |
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `loggingLevel` | software.amazon.awscdk.services.apigateway.MethodLoggingLevel | [[cdk.api.services.apigateway/method-logging-level]] | `:logging-level` |
| `metricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metrics-enabled` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
"
  [^MethodDeploymentOptions$Builder builder id config]
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
  (.build builder))


(defn method-deployment-options-builder
  ""
  [id config]
  (build-method-deployment-options-builder (new MethodDeploymentOptions$Builder) id config))


(defn build-method-options-builder
  "The build-method-options-builder function updates a MethodOptions$Builder instance using the provided configuration.
  The function takes the MethodOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `requestValidatorOptions` | software.amazon.awscdk.services.apigateway.RequestValidatorOptions | [[cdk.support/lookup-entry]] | `:request-validator-options` |
"
  [^MethodOptions$Builder builder id config]
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
  (.build builder))


(defn method-options-builder
  ""
  [id config]
  (build-method-options-builder (new MethodOptions$Builder) id config))


(defn build-method-props-builder
  "The build-method-props-builder function updates a MethodProps$Builder instance using the provided configuration.
  The function takes the MethodProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `integration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:integration` |
| `options` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:options` |
| `resource` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^MethodProps$Builder builder id config]
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn method-props-builder
  ""
  [id config]
  (build-method-props-builder (new MethodProps$Builder) id config))


(defn build-method-response-builder
  "The build-method-response-builder function updates a MethodResponse$Builder instance using the provided configuration.
  The function takes the MethodResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseModels` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-models` |
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^MethodResponse$Builder builder id config]
  (when-let [data (lookup-entry config id :response-models)]
    (. builder responseModels data))
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (when-let [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn method-response-builder
  ""
  [id config]
  (build-method-response-builder (new MethodResponse$Builder) id config))


(defn build-mock-integration-builder
  "The build-mock-integration-builder function updates a MockIntegration$Builder instance using the provided configuration.
  The function takes the MockIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^MockIntegration$Builder builder id config]
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
  (.build builder))


(defn mock-integration-builder
  ""
  [id config]
  (build-mock-integration-builder (MockIntegration$Builder/create) id config))


(defn build-model-builder
  "The build-model-builder function updates a Model$Builder instance using the provided configuration.
  The function takes the Model$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `schema` | software.amazon.awscdk.services.apigateway.JsonSchema | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^Model$Builder builder id config]
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
  (.build builder))


(defn model-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-model-builder (Model$Builder/create scope (name id)) id config))


(defn build-model-options-builder
  "The build-model-options-builder function updates a ModelOptions$Builder instance using the provided configuration.
  The function takes the ModelOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `schema` | software.amazon.awscdk.services.apigateway.JsonSchema | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^ModelOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-let [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn model-options-builder
  ""
  [id config]
  (build-model-options-builder (new ModelOptions$Builder) id config))


(defn build-model-props-builder
  "The build-model-props-builder function updates a ModelProps$Builder instance using the provided configuration.
  The function takes the ModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `schema` | software.amazon.awscdk.services.apigateway.JsonSchema | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^ModelProps$Builder builder id config]
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
  (.build builder))


(defn model-props-builder
  ""
  [id config]
  (build-model-props-builder (new ModelProps$Builder) id config))


(defn build-mtls-config-builder
  "The build-mtls-config-builder function updates a MTLSConfig$Builder instance using the provided configuration.
  The function takes the MTLSConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^MTLSConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn mtls-config-builder
  ""
  [id config]
  (build-mtls-config-builder (new MTLSConfig$Builder) id config))


(defn build-proxy-resource-builder
  "The build-proxy-resource-builder function updates a ProxyResource$Builder instance using the provided configuration.
  The function takes the ProxyResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anyMethod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:any-method` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `parent` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:parent` |
"
  [^ProxyResource$Builder builder id config]
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
  (.build builder))


(defn proxy-resource-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-proxy-resource-builder (ProxyResource$Builder/create scope (name id)) id config))


(defn build-proxy-resource-options-builder
  "The build-proxy-resource-options-builder function updates a ProxyResourceOptions$Builder instance using the provided configuration.
  The function takes the ProxyResourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anyMethod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:any-method` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
"
  [^ProxyResourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :any-method)]
    (. builder anyMethod data))
  (when-let [data (lookup-entry config id :default-cors-preflight-options)]
    (. builder defaultCorsPreflightOptions data))
  (when-let [data (lookup-entry config id :default-integration)]
    (. builder defaultIntegration data))
  (when-let [data (lookup-entry config id :default-method-options)]
    (. builder defaultMethodOptions data))
  (.build builder))


(defn proxy-resource-options-builder
  ""
  [id config]
  (build-proxy-resource-options-builder (new ProxyResourceOptions$Builder) id config))


(defn build-proxy-resource-props-builder
  "The build-proxy-resource-props-builder function updates a ProxyResourceProps$Builder instance using the provided configuration.
  The function takes the ProxyResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anyMethod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:any-method` |
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `parent` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:parent` |
"
  [^ProxyResourceProps$Builder builder id config]
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
  (.build builder))


(defn proxy-resource-props-builder
  ""
  [id config]
  (build-proxy-resource-props-builder (new ProxyResourceProps$Builder) id config))


(defn build-quota-settings-builder
  "The build-quota-settings-builder function updates a QuotaSettings$Builder instance using the provided configuration.
  The function takes the QuotaSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `offset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:offset` |
| `period` | software.amazon.awscdk.services.apigateway.Period | [[cdk.api.services.apigateway/period]] | `:period` |
"
  [^QuotaSettings$Builder builder id config]
  (when-let [data (lookup-entry config id :limit)]
    (. builder limit data))
  (when-let [data (lookup-entry config id :offset)]
    (. builder offset data))
  (when-let [data (period config id :period)]
    (. builder period data))
  (.build builder))


(defn quota-settings-builder
  ""
  [id config]
  (build-quota-settings-builder (new QuotaSettings$Builder) id config))


(defn build-rate-limited-api-key-builder
  "The build-rate-limited-api-key-builder function updates a RateLimitedApiKey$Builder instance using the provided configuration.
  The function takes the RateLimitedApiKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^RateLimitedApiKey$Builder builder id config]
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
  (.build builder))


(defn rate-limited-api-key-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-rate-limited-api-key-builder (RateLimitedApiKey$Builder/create scope (name id)) id config))


(defn build-rate-limited-api-key-props-builder
  "The build-rate-limited-api-key-props-builder function updates a RateLimitedApiKeyProps$Builder instance using the provided configuration.
  The function takes the RateLimitedApiKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^RateLimitedApiKeyProps$Builder builder id config]
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
  (.build builder))


(defn rate-limited-api-key-props-builder
  ""
  [id config]
  (build-rate-limited-api-key-props-builder (new RateLimitedApiKeyProps$Builder) id config))


(defn build-request-authorizer-builder
  "The build-request-authorizer-builder function updates a RequestAuthorizer$Builder instance using the provided configuration.
  The function takes the RequestAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `identitySources` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-sources` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
"
  [^RequestAuthorizer$Builder builder id config]
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
  (.build builder))


(defn request-authorizer-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-request-authorizer-builder (RequestAuthorizer$Builder/create scope (name id)) id config))


(defn build-request-authorizer-props-builder
  "The build-request-authorizer-props-builder function updates a RequestAuthorizerProps$Builder instance using the provided configuration.
  The function takes the RequestAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `identitySources` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-sources` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
"
  [^RequestAuthorizerProps$Builder builder id config]
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
  (.build builder))


(defn request-authorizer-props-builder
  ""
  [id config]
  (build-request-authorizer-props-builder (new RequestAuthorizerProps$Builder) id config))


(defn build-request-context-builder
  "The build-request-context-builder function updates a RequestContext$Builder instance using the provided configuration.
  The function takes the RequestContext$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `userArn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-arn` |
"
  [^RequestContext$Builder builder id config]
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
  (.build builder))


(defn request-context-builder
  ""
  [id config]
  (build-request-context-builder (new RequestContext$Builder) id config))


(defn build-request-validator-builder
  "The build-request-validator-builder function updates a RequestValidator$Builder instance using the provided configuration.
  The function takes the RequestValidator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestValidatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-validator-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `validateRequestBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |
"
  [^RequestValidator$Builder builder id config]
  (when-let [data (lookup-entry config id :request-validator-name)]
    (. builder requestValidatorName data))
  (when-let [data (lookup-entry config id :rest-api)]
    (. builder restApi data))
  (when-let [data (lookup-entry config id :validate-request-body)]
    (. builder validateRequestBody data))
  (when-let [data (lookup-entry config id :validate-request-parameters)]
    (. builder validateRequestParameters data))
  (.build builder))


(defn request-validator-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-request-validator-builder (RequestValidator$Builder/create scope (name id)) id config))


(defn build-request-validator-options-builder
  "The build-request-validator-options-builder function updates a RequestValidatorOptions$Builder instance using the provided configuration.
  The function takes the RequestValidatorOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestValidatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-validator-name` |
| `validateRequestBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |
"
  [^RequestValidatorOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :request-validator-name)]
    (. builder requestValidatorName data))
  (when-let [data (lookup-entry config id :validate-request-body)]
    (. builder validateRequestBody data))
  (when-let [data (lookup-entry config id :validate-request-parameters)]
    (. builder validateRequestParameters data))
  (.build builder))


(defn request-validator-options-builder
  ""
  [id config]
  (build-request-validator-options-builder (new RequestValidatorOptions$Builder) id config))


(defn build-request-validator-props-builder
  "The build-request-validator-props-builder function updates a RequestValidatorProps$Builder instance using the provided configuration.
  The function takes the RequestValidatorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestValidatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-validator-name` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `validateRequestBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-body` |
| `validateRequestParameters` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-request-parameters` |
"
  [^RequestValidatorProps$Builder builder id config]
  (when-let [data (lookup-entry config id :request-validator-name)]
    (. builder requestValidatorName data))
  (when-let [data (lookup-entry config id :rest-api)]
    (. builder restApi data))
  (when-let [data (lookup-entry config id :validate-request-body)]
    (. builder validateRequestBody data))
  (when-let [data (lookup-entry config id :validate-request-parameters)]
    (. builder validateRequestParameters data))
  (.build builder))


(defn request-validator-props-builder
  ""
  [id config]
  (build-request-validator-props-builder (new RequestValidatorProps$Builder) id config))


(defn build-resource-attributes-builder
  "The build-resource-attributes-builder function updates a ResourceAttributes$Builder instance using the provided configuration.
  The function takes the ResourceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
"
  [^ResourceAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :rest-api)]
    (. builder restApi data))
  (.build builder))


(defn resource-attributes-builder
  ""
  [id config]
  (build-resource-attributes-builder (new ResourceAttributes$Builder) id config))


(defn build-resource-builder
  "The build-resource-builder function updates a Resource$Builder instance using the provided configuration.
  The function takes the Resource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `parent` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:parent` |
| `pathPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-part` |
"
  [^Resource$Builder builder id config]
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
  (.build builder))


(defn resource-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-resource-builder (Resource$Builder/create scope (name id)) id config))


(defn build-resource-options-builder
  "The build-resource-options-builder function updates a ResourceOptions$Builder instance using the provided configuration.
  The function takes the ResourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
"
  [^ResourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :default-cors-preflight-options)]
    (. builder defaultCorsPreflightOptions data))
  (when-let [data (lookup-entry config id :default-integration)]
    (. builder defaultIntegration data))
  (when-let [data (lookup-entry config id :default-method-options)]
    (. builder defaultMethodOptions data))
  (.build builder))


(defn resource-options-builder
  ""
  [id config]
  (build-resource-options-builder (new ResourceOptions$Builder) id config))


(defn build-resource-props-builder
  "The build-resource-props-builder function updates a ResourceProps$Builder instance using the provided configuration.
  The function takes the ResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultCorsPreflightOptions` | software.amazon.awscdk.services.apigateway.CorsOptions | [[cdk.support/lookup-entry]] | `:default-cors-preflight-options` |
| `defaultIntegration` | software.amazon.awscdk.services.apigateway.Integration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `defaultMethodOptions` | software.amazon.awscdk.services.apigateway.MethodOptions | [[cdk.support/lookup-entry]] | `:default-method-options` |
| `parent` | software.amazon.awscdk.services.apigateway.IResource | [[cdk.support/lookup-entry]] | `:parent` |
| `pathPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-part` |
"
  [^ResourceProps$Builder builder id config]
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
  (.build builder))


(defn resource-props-builder
  ""
  [id config]
  (build-resource-props-builder (new ResourceProps$Builder) id config))


(defn build-rest-api-attributes-builder
  "The build-rest-api-attributes-builder function updates a RestApiAttributes$Builder instance using the provided configuration.
  The function takes the RestApiAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
| `restApiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-name` |
| `rootResourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-resource-id` |
"
  [^RestApiAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (when-let [data (lookup-entry config id :rest-api-name)]
    (. builder restApiName data))
  (when-let [data (lookup-entry config id :root-resource-id)]
    (. builder rootResourceId data))
  (.build builder))


(defn rest-api-attributes-builder
  ""
  [id config]
  (build-rest-api-attributes-builder (new RestApiAttributes$Builder) id config))


(defn build-rest-api-base-props-builder
  "The build-rest-api-base-props-builder function updates a RestApiBaseProps$Builder instance using the provided configuration.
  The function takes the RestApiBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
"
  [^RestApiBaseProps$Builder builder id config]
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
  (.build builder))


(defn rest-api-base-props-builder
  ""
  [id config]
  (build-rest-api-base-props-builder (new RestApiBaseProps$Builder) id config))


(defn build-rest-api-builder
  "The build-rest-api-builder function updates a RestApi$Builder instance using the provided configuration.
  The function takes the RestApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
"
  [^RestApi$Builder builder id config]
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
  (.build builder))


(defn rest-api-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-rest-api-builder (RestApi$Builder/create scope (name id)) id config))


(defn build-rest-api-props-builder
  "The build-rest-api-props-builder function updates a RestApiProps$Builder instance using the provided configuration.
  The function takes the RestApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
"
  [^RestApiProps$Builder builder id config]
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
  (.build builder))


(defn rest-api-props-builder
  ""
  [id config]
  (build-rest-api-props-builder (new RestApiProps$Builder) id config))


(defn build-sagemaker-integration-builder
  "The build-sagemaker-integration-builder function updates a SagemakerIntegration$Builder instance using the provided configuration.
  The function takes the SagemakerIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^SagemakerIntegration$Builder builder id config]
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
  (.build builder))


(defn build-sagemaker-integration-options-builder
  "The build-sagemaker-integration-options-builder function updates a SagemakerIntegrationOptions$Builder instance using the provided configuration.
  The function takes the SagemakerIntegrationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^SagemakerIntegrationOptions$Builder builder id config]
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
  (.build builder))


(defn sagemaker-integration-options-builder
  ""
  [id config]
  (build-sagemaker-integration-options-builder (new SagemakerIntegrationOptions$Builder) id config))


(defn build-spec-rest-api-builder
  "The build-spec-rest-api-builder function updates a SpecRestApi$Builder instance using the provided configuration.
  The function takes the SpecRestApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
"
  [^SpecRestApi$Builder builder id config]
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
  (.build builder))


(defn spec-rest-api-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-spec-rest-api-builder (SpecRestApi$Builder/create scope (name id)) id config))


(defn build-spec-rest-api-props-builder
  "The build-spec-rest-api-props-builder function updates a SpecRestApiProps$Builder instance using the provided configuration.
  The function takes the SpecRestApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `retainDeployments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployments` |
"
  [^SpecRestApiProps$Builder builder id config]
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
  (.build builder))


(defn spec-rest-api-props-builder
  ""
  [id config]
  (build-spec-rest-api-props-builder (new SpecRestApiProps$Builder) id config))


(defn build-stage-attributes-builder
  "The build-stage-attributes-builder function updates a StageAttributes$Builder instance using the provided configuration.
  The function takes the StageAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `restApi` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:rest-api` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^StageAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :rest-api)]
    (. builder restApi data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn stage-attributes-builder
  ""
  [id config]
  (build-stage-attributes-builder (new StageAttributes$Builder) id config))


(defn build-stage-builder
  "The build-stage-builder function updates a Stage$Builder instance using the provided configuration.
  The function takes the Stage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^Stage$Builder builder id config]
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
  (.build builder))


(defn stage-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-stage-builder (Stage$Builder/create scope (name id)) id config))


(defn build-stage-options-builder
  "The build-stage-options-builder function updates a StageOptions$Builder instance using the provided configuration.
  The function takes the StageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^StageOptions$Builder builder id config]
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
  (.build builder))


(defn stage-options-builder
  ""
  [id config]
  (build-stage-options-builder (new StageOptions$Builder) id config))


(defn build-stage-props-builder
  "The build-stage-props-builder function updates a StageProps$Builder instance using the provided configuration.
  The function takes the StageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^StageProps$Builder builder id config]
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
  (.build builder))


(defn stage-props-builder
  ""
  [id config]
  (build-stage-props-builder (new StageProps$Builder) id config))


(defn build-step-functions-execution-integration-options-builder
  "The build-step-functions-execution-integration-options-builder function updates a StepFunctionsExecutionIntegrationOptions$Builder instance using the provided configuration.
  The function takes the StepFunctionsExecutionIntegrationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcLink` | software.amazon.awscdk.services.apigateway.IVpcLink | [[cdk.support/lookup-entry]] | `:vpc-link` |
"
  [^StepFunctionsExecutionIntegrationOptions$Builder builder id config]
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
  (.build builder))


(defn step-functions-execution-integration-options-builder
  ""
  [id config]
  (build-step-functions-execution-integration-options-builder (new StepFunctionsExecutionIntegrationOptions$Builder) id config))


(defn build-step-functions-rest-api-builder
  "The build-step-functions-rest-api-builder function updates a StepFunctionsRestApi$Builder instance using the provided configuration.
  The function takes the StepFunctionsRestApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `useDefaultMethodResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-default-method-responses` |
"
  [^StepFunctionsRestApi$Builder builder id config]
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
  (.build builder))


(defn step-functions-rest-api-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-step-functions-rest-api-builder (StepFunctionsRestApi$Builder/create scope (name id)) id config))


(defn build-step-functions-rest-api-props-builder
  "The build-step-functions-rest-api-props-builder function updates a StepFunctionsRestApiProps$Builder instance using the provided configuration.
  The function takes the StepFunctionsRestApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `useDefaultMethodResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-default-method-responses` |
"
  [^StepFunctionsRestApiProps$Builder builder id config]
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
  (.build builder))


(defn step-functions-rest-api-props-builder
  ""
  [id config]
  (build-step-functions-rest-api-props-builder (new StepFunctionsRestApiProps$Builder) id config))


(defn build-throttle-settings-builder
  "The build-throttle-settings-builder function updates a ThrottleSettings$Builder instance using the provided configuration.
  The function takes the ThrottleSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `burstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:burst-limit` |
| `rateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit` |
"
  [^ThrottleSettings$Builder builder id config]
  (when-let [data (lookup-entry config id :burst-limit)]
    (. builder burstLimit data))
  (when-let [data (lookup-entry config id :rate-limit)]
    (. builder rateLimit data))
  (.build builder))


(defn throttle-settings-builder
  ""
  [id config]
  (build-throttle-settings-builder (new ThrottleSettings$Builder) id config))


(defn build-throttling-per-method-builder
  "The build-throttling-per-method-builder function updates a ThrottlingPerMethod$Builder instance using the provided configuration.
  The function takes the ThrottlingPerMethod$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | software.amazon.awscdk.services.apigateway.Method | [[cdk.support/lookup-entry]] | `:method` |
| `throttle` | software.amazon.awscdk.services.apigateway.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^ThrottlingPerMethod$Builder builder id config]
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (.build builder))


(defn throttling-per-method-builder
  ""
  [id config]
  (build-throttling-per-method-builder (new ThrottlingPerMethod$Builder) id config))


(defn build-token-authorizer-builder
  "The build-token-authorizer-builder function updates a TokenAuthorizer$Builder instance using the provided configuration.
  The function takes the TokenAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
| `validationRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-regex` |
"
  [^TokenAuthorizer$Builder builder id config]
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
  (.build builder))


(defn token-authorizer-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-token-authorizer-builder (TokenAuthorizer$Builder/create scope (name id)) id config))


(defn build-token-authorizer-props-builder
  "The build-token-authorizer-props-builder function updates a TokenAuthorizerProps$Builder instance using the provided configuration.
  The function takes the TokenAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `identitySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-source` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
| `validationRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-regex` |
"
  [^TokenAuthorizerProps$Builder builder id config]
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
  (.build builder))


(defn token-authorizer-props-builder
  ""
  [id config]
  (build-token-authorizer-props-builder (new TokenAuthorizerProps$Builder) id config))


(defn build-usage-plan-builder
  "The build-usage-plan-builder function updates a UsagePlan$Builder instance using the provided configuration.
  The function takes the UsagePlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiStages` | java.util.List | [[cdk.support/lookup-entry]] | `:api-stages` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quota` | software.amazon.awscdk.services.apigateway.QuotaSettings | [[cdk.support/lookup-entry]] | `:quota` |
| `throttle` | software.amazon.awscdk.services.apigateway.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^UsagePlan$Builder builder id config]
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
  (.build builder))


(defn usage-plan-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-usage-plan-builder (UsagePlan$Builder/create scope (name id)) id config))


(defn build-usage-plan-per-api-stage-builder
  "The build-usage-plan-per-api-stage-builder function updates a UsagePlanPerApiStage$Builder instance using the provided configuration.
  The function takes the UsagePlanPerApiStage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:api` |
| `stage` | software.amazon.awscdk.services.apigateway.Stage | [[cdk.support/lookup-entry]] | `:stage` |
| `throttle` | java.util.List | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^UsagePlanPerApiStage$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (.build builder))


(defn usage-plan-per-api-stage-builder
  ""
  [id config]
  (build-usage-plan-per-api-stage-builder (new UsagePlanPerApiStage$Builder) id config))


(defn build-usage-plan-props-builder
  "The build-usage-plan-props-builder function updates a UsagePlanProps$Builder instance using the provided configuration.
  The function takes the UsagePlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiStages` | java.util.List | [[cdk.support/lookup-entry]] | `:api-stages` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quota` | software.amazon.awscdk.services.apigateway.QuotaSettings | [[cdk.support/lookup-entry]] | `:quota` |
| `throttle` | software.amazon.awscdk.services.apigateway.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^UsagePlanProps$Builder builder id config]
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
  (.build builder))


(defn usage-plan-props-builder
  ""
  [id config]
  (build-usage-plan-props-builder (new UsagePlanProps$Builder) id config))


(defn build-vpc-link-builder
  "The build-vpc-link-builder function updates a VpcLink$Builder instance using the provided configuration.
  The function takes the VpcLink$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpcLinkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-link-name` |
"
  [^VpcLink$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-let [data (lookup-entry config id :vpc-link-name)]
    (. builder vpcLinkName data))
  (.build builder))


(defn vpc-link-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-vpc-link-builder (VpcLink$Builder/create scope (name id)) id config))


(defn build-vpc-link-props-builder
  "The build-vpc-link-props-builder function updates a VpcLinkProps$Builder instance using the provided configuration.
  The function takes the VpcLinkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpcLinkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-link-name` |
"
  [^VpcLinkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-let [data (lookup-entry config id :vpc-link-name)]
    (. builder vpcLinkName data))
  (.build builder))


(defn vpc-link-props-builder
  ""
  [id config]
  (build-vpc-link-props-builder (new VpcLinkProps$Builder) id config))