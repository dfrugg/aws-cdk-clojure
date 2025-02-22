(ns cdk.api.services.apigatewayv2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.apigatewayv2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.apigatewayv2 AddRoutesOptions$Builder
                                                         ApiMapping$Builder
                                                         ApiMappingAttributes$Builder
                                                         ApiMappingProps$Builder
                                                         AuthorizerPayloadVersion
                                                         BatchHttpRouteOptions$Builder
                                                         CfnApi$BodyS3LocationProperty$Builder
                                                         CfnApi$Builder
                                                         CfnApi$CorsProperty$Builder
                                                         CfnApiGatewayManagedOverrides$AccessLogSettingsProperty$Builder
                                                         CfnApiGatewayManagedOverrides$Builder
                                                         CfnApiGatewayManagedOverrides$IntegrationOverridesProperty$Builder
                                                         CfnApiGatewayManagedOverrides$RouteOverridesProperty$Builder
                                                         CfnApiGatewayManagedOverrides$RouteSettingsProperty$Builder
                                                         CfnApiGatewayManagedOverrides$StageOverridesProperty$Builder
                                                         CfnApiGatewayManagedOverridesProps$Builder
                                                         CfnApiMapping$Builder
                                                         CfnApiMappingProps$Builder
                                                         CfnApiProps$Builder
                                                         CfnAuthorizer$Builder
                                                         CfnAuthorizer$JWTConfigurationProperty$Builder
                                                         CfnAuthorizerProps$Builder
                                                         CfnDeployment$Builder
                                                         CfnDeploymentProps$Builder
                                                         CfnDomainName$Builder
                                                         CfnDomainName$DomainNameConfigurationProperty$Builder
                                                         CfnDomainName$MutualTlsAuthenticationProperty$Builder
                                                         CfnDomainNameProps$Builder
                                                         CfnIntegration$Builder
                                                         CfnIntegration$ResponseParameterListProperty$Builder
                                                         CfnIntegration$ResponseParameterProperty$Builder
                                                         CfnIntegration$TlsConfigProperty$Builder
                                                         CfnIntegrationProps$Builder
                                                         CfnIntegrationResponse$Builder
                                                         CfnIntegrationResponseProps$Builder
                                                         CfnModel$Builder
                                                         CfnModelProps$Builder
                                                         CfnRoute$Builder
                                                         CfnRoute$ParameterConstraintsProperty$Builder
                                                         CfnRouteProps$Builder
                                                         CfnRouteResponse$Builder
                                                         CfnRouteResponse$ParameterConstraintsProperty$Builder
                                                         CfnRouteResponseProps$Builder
                                                         CfnStage$AccessLogSettingsProperty$Builder
                                                         CfnStage$Builder
                                                         CfnStage$RouteSettingsProperty$Builder
                                                         CfnStageProps$Builder
                                                         CfnVpcLink$Builder
                                                         CfnVpcLinkProps$Builder
                                                         ContentHandling
                                                         CorsHttpMethod
                                                         CorsPreflightOptions$Builder
                                                         DomainMappingOptions$Builder
                                                         DomainName$Builder
                                                         DomainNameAttributes$Builder
                                                         DomainNameProps$Builder
                                                         EndpointOptions$Builder
                                                         EndpointType
                                                         GrantInvokeOptions$Builder
                                                         HttpApi$Builder
                                                         HttpApiAttributes$Builder
                                                         HttpApiProps$Builder
                                                         HttpAuthorizer$Builder
                                                         HttpAuthorizerAttributes$Builder
                                                         HttpAuthorizerProps$Builder
                                                         HttpAuthorizerType
                                                         HttpConnectionType
                                                         HttpIntegration$Builder
                                                         HttpIntegrationProps$Builder
                                                         HttpIntegrationSubtype
                                                         HttpIntegrationType
                                                         HttpMethod
                                                         HttpRoute$Builder
                                                         HttpRouteAuthorizerBindOptions$Builder
                                                         HttpRouteAuthorizerConfig$Builder
                                                         HttpRouteIntegrationBindOptions$Builder
                                                         HttpRouteIntegrationConfig$Builder
                                                         HttpRouteProps$Builder
                                                         HttpStage$Builder
                                                         HttpStageAttributes$Builder
                                                         HttpStageOptions$Builder
                                                         HttpStageProps$Builder
                                                         MTLSConfig$Builder
                                                         PassthroughBehavior
                                                         SecurityPolicy
                                                         StageAttributes$Builder
                                                         StageOptions$Builder
                                                         ThrottleSettings$Builder
                                                         VpcLink$Builder
                                                         VpcLinkAttributes$Builder
                                                         VpcLinkProps$Builder
                                                         WebSocketApi$Builder
                                                         WebSocketApiAttributes$Builder
                                                         WebSocketApiProps$Builder
                                                         WebSocketAuthorizer$Builder
                                                         WebSocketAuthorizerAttributes$Builder
                                                         WebSocketAuthorizerProps$Builder
                                                         WebSocketAuthorizerType
                                                         WebSocketIntegration$Builder
                                                         WebSocketIntegrationProps$Builder
                                                         WebSocketIntegrationType
                                                         WebSocketRoute$Builder
                                                         WebSocketRouteAuthorizerBindOptions$Builder
                                                         WebSocketRouteAuthorizerConfig$Builder
                                                         WebSocketRouteIntegrationBindOptions$Builder
                                                         WebSocketRouteIntegrationConfig$Builder
                                                         WebSocketRouteOptions$Builder
                                                         WebSocketRouteProps$Builder
                                                         WebSocketStage$Builder
                                                         WebSocketStageAttributes$Builder
                                                         WebSocketStageProps$Builder]))


(defn authorizer-payload-version
  "The `authorizer-payload-version` function data interprets values in the provided config data into a 
`AuthorizerPayloadVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AuthorizerPayloadVersion` - the value is returned.
* is `:version-1-0` - `AuthorizerPayloadVersion/VERSION_1_0` is returned
* is `:version-2-0` - `AuthorizerPayloadVersion/VERSION_2_0` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AuthorizerPayloadVersion data) data
      (= :version-1-0 data) AuthorizerPayloadVersion/VERSION_1_0
      (= :version-2-0 data) AuthorizerPayloadVersion/VERSION_2_0)))


(defn content-handling
  "The `content-handling` function data interprets values in the provided config data into a 
`ContentHandling` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ContentHandling` - the value is returned.
* is `:convert-to-text` - `ContentHandling/CONVERT_TO_TEXT` is returned
* is `:convert-to-binary` - `ContentHandling/CONVERT_TO_BINARY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ContentHandling data) data
      (= :convert-to-text data) ContentHandling/CONVERT_TO_TEXT
      (= :convert-to-binary data) ContentHandling/CONVERT_TO_BINARY)))


(defn cors-http-method
  "The `cors-http-method` function data interprets values in the provided config data into a 
`CorsHttpMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CorsHttpMethod` - the value is returned.
* is `:post` - `CorsHttpMethod/POST` is returned
* is `:head` - `CorsHttpMethod/HEAD` is returned
* is `:delete` - `CorsHttpMethod/DELETE` is returned
* is `:options` - `CorsHttpMethod/OPTIONS` is returned
* is `:patch` - `CorsHttpMethod/PATCH` is returned
* is `:get` - `CorsHttpMethod/GET` is returned
* is `:put` - `CorsHttpMethod/PUT` is returned
* is `:any` - `CorsHttpMethod/ANY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CorsHttpMethod data) data
      (= :post data) CorsHttpMethod/POST
      (= :head data) CorsHttpMethod/HEAD
      (= :delete data) CorsHttpMethod/DELETE
      (= :options data) CorsHttpMethod/OPTIONS
      (= :patch data) CorsHttpMethod/PATCH
      (= :get data) CorsHttpMethod/GET
      (= :put data) CorsHttpMethod/PUT
      (= :any data) CorsHttpMethod/ANY)))


(defn endpoint-type
  "The `endpoint-type` function data interprets values in the provided config data into a 
`EndpointType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EndpointType` - the value is returned.
* is `:regional` - `EndpointType/REGIONAL` is returned
* is `:edge` - `EndpointType/EDGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EndpointType data) data
      (= :regional data) EndpointType/REGIONAL
      (= :edge data) EndpointType/EDGE)))


(defn http-authorizer-type
  "The `http-authorizer-type` function data interprets values in the provided config data into a 
`HttpAuthorizerType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpAuthorizerType` - the value is returned.
* is `:lambda` - `HttpAuthorizerType/LAMBDA` is returned
* is `:jwt` - `HttpAuthorizerType/JWT` is returned
* is `:iam` - `HttpAuthorizerType/IAM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpAuthorizerType data) data
      (= :lambda data) HttpAuthorizerType/LAMBDA
      (= :jwt data) HttpAuthorizerType/JWT
      (= :iam data) HttpAuthorizerType/IAM)))


(defn http-connection-type
  "The `http-connection-type` function data interprets values in the provided config data into a 
`HttpConnectionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpConnectionType` - the value is returned.
* is `:internet` - `HttpConnectionType/INTERNET` is returned
* is `:vpc-link` - `HttpConnectionType/VPC_LINK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpConnectionType data) data
      (= :internet data) HttpConnectionType/INTERNET
      (= :vpc-link data) HttpConnectionType/VPC_LINK)))


(defn http-integration-subtype
  "The `http-integration-subtype` function data interprets values in the provided config data into a 
`HttpIntegrationSubtype` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpIntegrationSubtype` - the value is returned.
* is `:sqs-receive-message` - `HttpIntegrationSubtype/SQS_RECEIVE_MESSAGE` is returned
* is `:sqs-send-message` - `HttpIntegrationSubtype/SQS_SEND_MESSAGE` is returned
* is `:eventbridge-put-events` - `HttpIntegrationSubtype/EVENTBRIDGE_PUT_EVENTS` is returned
* is `:stepfunctions-start-execution` - `HttpIntegrationSubtype/STEPFUNCTIONS_START_EXECUTION` is returned
* is `:sqs-purge-queue` - `HttpIntegrationSubtype/SQS_PURGE_QUEUE` is returned
* is `:stepfunctions-stop-execution` - `HttpIntegrationSubtype/STEPFUNCTIONS_STOP_EXECUTION` is returned
* is `:stepfunctions-start-sync-execution` - `HttpIntegrationSubtype/STEPFUNCTIONS_START_SYNC_EXECUTION` is returned
* is `:kinesis-put-record` - `HttpIntegrationSubtype/KINESIS_PUT_RECORD` is returned
* is `:appconfig-get-configuration` - `HttpIntegrationSubtype/APPCONFIG_GET_CONFIGURATION` is returned
* is `:sqs-delete-message` - `HttpIntegrationSubtype/SQS_DELETE_MESSAGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpIntegrationSubtype data) data
      (= :sqs-receive-message data) HttpIntegrationSubtype/SQS_RECEIVE_MESSAGE
      (= :sqs-send-message data) HttpIntegrationSubtype/SQS_SEND_MESSAGE
      (= :eventbridge-put-events data) HttpIntegrationSubtype/EVENTBRIDGE_PUT_EVENTS
      (= :stepfunctions-start-execution data) HttpIntegrationSubtype/STEPFUNCTIONS_START_EXECUTION
      (= :sqs-purge-queue data) HttpIntegrationSubtype/SQS_PURGE_QUEUE
      (= :stepfunctions-stop-execution data) HttpIntegrationSubtype/STEPFUNCTIONS_STOP_EXECUTION
      (= :stepfunctions-start-sync-execution data) HttpIntegrationSubtype/STEPFUNCTIONS_START_SYNC_EXECUTION
      (= :kinesis-put-record data) HttpIntegrationSubtype/KINESIS_PUT_RECORD
      (= :appconfig-get-configuration data) HttpIntegrationSubtype/APPCONFIG_GET_CONFIGURATION
      (= :sqs-delete-message data) HttpIntegrationSubtype/SQS_DELETE_MESSAGE)))


(defn http-integration-type
  "The `http-integration-type` function data interprets values in the provided config data into a 
`HttpIntegrationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpIntegrationType` - the value is returned.
* is `:aws-proxy` - `HttpIntegrationType/AWS_PROXY` is returned
* is `:http-proxy` - `HttpIntegrationType/HTTP_PROXY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpIntegrationType data) data
      (= :aws-proxy data) HttpIntegrationType/AWS_PROXY
      (= :http-proxy data) HttpIntegrationType/HTTP_PROXY)))


(defn http-method
  "The `http-method` function data interprets values in the provided config data into a 
`HttpMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpMethod` - the value is returned.
* is `:any` - `HttpMethod/ANY` is returned
* is `:delete` - `HttpMethod/DELETE` is returned
* is `:head` - `HttpMethod/HEAD` is returned
* is `:options` - `HttpMethod/OPTIONS` is returned
* is `:post` - `HttpMethod/POST` is returned
* is `:get` - `HttpMethod/GET` is returned
* is `:patch` - `HttpMethod/PATCH` is returned
* is `:put` - `HttpMethod/PUT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpMethod data) data
      (= :any data) HttpMethod/ANY
      (= :delete data) HttpMethod/DELETE
      (= :head data) HttpMethod/HEAD
      (= :options data) HttpMethod/OPTIONS
      (= :post data) HttpMethod/POST
      (= :get data) HttpMethod/GET
      (= :patch data) HttpMethod/PATCH
      (= :put data) HttpMethod/PUT)))


(defn passthrough-behavior
  "The `passthrough-behavior` function data interprets values in the provided config data into a 
`PassthroughBehavior` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PassthroughBehavior` - the value is returned.
* is `:never` - `PassthroughBehavior/NEVER` is returned
* is `:when-no-templates` - `PassthroughBehavior/WHEN_NO_TEMPLATES` is returned
* is `:when-no-match` - `PassthroughBehavior/WHEN_NO_MATCH` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PassthroughBehavior data) data
      (= :never data) PassthroughBehavior/NEVER
      (= :when-no-templates data) PassthroughBehavior/WHEN_NO_TEMPLATES
      (= :when-no-match data) PassthroughBehavior/WHEN_NO_MATCH)))


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


(defn web-socket-authorizer-type
  "The `web-socket-authorizer-type` function data interprets values in the provided config data into a 
`WebSocketAuthorizerType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `WebSocketAuthorizerType` - the value is returned.
* is `:iam` - `WebSocketAuthorizerType/IAM` is returned
* is `:lambda` - `WebSocketAuthorizerType/LAMBDA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? WebSocketAuthorizerType data) data
      (= :iam data) WebSocketAuthorizerType/IAM
      (= :lambda data) WebSocketAuthorizerType/LAMBDA)))


(defn web-socket-integration-type
  "The `web-socket-integration-type` function data interprets values in the provided config data into a 
`WebSocketIntegrationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `WebSocketIntegrationType` - the value is returned.
* is `:mock` - `WebSocketIntegrationType/MOCK` is returned
* is `:aws` - `WebSocketIntegrationType/AWS` is returned
* is `:aws-proxy` - `WebSocketIntegrationType/AWS_PROXY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? WebSocketIntegrationType data) data
      (= :mock data) WebSocketIntegrationType/MOCK
      (= :aws data) WebSocketIntegrationType/AWS
      (= :aws-proxy data) WebSocketIntegrationType/AWS_PROXY)))


(defn build-add-routes-options-builder
  "The build-add-routes-options-builder function updates a AddRoutesOptions$Builder instance using the provided configuration.
  The function takes the AddRoutesOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizer` | software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer | [[cdk.support/lookup-entry]] | `:authorizer` |
| `integration` | software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration | [[cdk.support/lookup-entry]] | `:integration` |
| `methods` | java.util.List | [[cdk.support/lookup-entry]] | `:methods` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^AddRoutesOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :methods)]
    (. builder methods data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn build-api-mapping-attributes-builder
  "The build-api-mapping-attributes-builder function updates a ApiMappingAttributes$Builder instance using the provided configuration.
  The function takes the ApiMappingAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiMappingId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-mapping-id` |
"
  [^ApiMappingAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :api-mapping-id)]
    (. builder apiMappingId data))
  (.build builder))


(defn build-api-mapping-builder
  "The build-api-mapping-builder function updates a ApiMapping$Builder instance using the provided configuration.
  The function takes the ApiMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigatewayv2.IApi | [[cdk.support/lookup-entry]] | `:api` |
| `apiMappingKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-mapping-key` |
| `domainName` | software.amazon.awscdk.services.apigatewayv2.IDomainName | [[cdk.support/lookup-entry]] | `:domain-name` |
| `stage` | software.amazon.awscdk.services.apigatewayv2.IStage | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^ApiMapping$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :api-mapping-key)]
    (. builder apiMappingKey data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-api-mapping-props-builder
  "The build-api-mapping-props-builder function updates a ApiMappingProps$Builder instance using the provided configuration.
  The function takes the ApiMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigatewayv2.IApi | [[cdk.support/lookup-entry]] | `:api` |
| `apiMappingKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-mapping-key` |
| `domainName` | software.amazon.awscdk.services.apigatewayv2.IDomainName | [[cdk.support/lookup-entry]] | `:domain-name` |
| `stage` | software.amazon.awscdk.services.apigatewayv2.IStage | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^ApiMappingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :api-mapping-key)]
    (. builder apiMappingKey data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-batch-http-route-options-builder
  "The build-batch-http-route-options-builder function updates a BatchHttpRouteOptions$Builder instance using the provided configuration.
  The function takes the BatchHttpRouteOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `integration` | software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration | [[cdk.support/lookup-entry]] | `:integration` |
"
  [^BatchHttpRouteOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (.build builder))


(defn build-cfn-api-body-s3-location-property-builder
  "The build-cfn-api-body-s3-location-property-builder function updates a CfnApi$BodyS3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$BodyS3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `etag` | java.lang.String | [[cdk.support/lookup-entry]] | `:etag` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnApi$BodyS3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :etag)]
    (. builder etag data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn build-cfn-api-builder
  "The build-cfn-api-builder function updates a CfnApi$Builder instance using the provided configuration.
  The function takes the CfnApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-selection-expression` |
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `body` | java.lang.Object | [[cdk.support/lookup-entry]] | `:body` |
| `bodyS3Location` | software.amazon.awscdk.services.apigatewayv2.CfnApi$BodyS3LocationProperty | [[cdk.support/lookup-entry]] | `:body-s3-location` |
| `corsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors-configuration` |
| `credentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `disableSchemaValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-schema-validation` |
| `failOnWarnings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocolType` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-type` |
| `routeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-key` |
| `routeSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-selection-expression` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnApi$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-selection-expression)]
    (. builder apiKeySelectionExpression data))
  (when-let [data (lookup-entry config id :base-path)]
    (. builder basePath data))
  (when-let [data (lookup-entry config id :body)]
    (. builder body data))
  (when-let [data (lookup-entry config id :body-s3-location)]
    (. builder bodyS3Location data))
  (when-let [data (lookup-entry config id :cors-configuration)]
    (. builder corsConfiguration data))
  (when-let [data (lookup-entry config id :credentials-arn)]
    (. builder credentialsArn data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
    (. builder disableExecuteApiEndpoint data))
  (when-let [data (lookup-entry config id :disable-schema-validation)]
    (. builder disableSchemaValidation data))
  (when-let [data (lookup-entry config id :fail-on-warnings)]
    (. builder failOnWarnings data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :protocol-type)]
    (. builder protocolType data))
  (when-let [data (lookup-entry config id :route-key)]
    (. builder routeKey data))
  (when-let [data (lookup-entry config id :route-selection-expression)]
    (. builder routeSelectionExpression data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn build-cfn-api-cors-property-builder
  "The build-cfn-api-cors-property-builder function updates a CfnApi$CorsProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$CorsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-origins` |
| `exposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:expose-headers` |
| `maxAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age` |
"
  [^CfnApi$CorsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-credentials)]
    (. builder allowCredentials data))
  (when-let [data (lookup-entry config id :allow-headers)]
    (. builder allowHeaders data))
  (when-let [data (lookup-entry config id :allow-methods)]
    (. builder allowMethods data))
  (when-let [data (lookup-entry config id :allow-origins)]
    (. builder allowOrigins data))
  (when-let [data (lookup-entry config id :expose-headers)]
    (. builder exposeHeaders data))
  (when-let [data (lookup-entry config id :max-age)]
    (. builder maxAge data))
  (.build builder))


(defn build-cfn-api-gateway-managed-overrides-access-log-settings-property-builder
  "The build-cfn-api-gateway-managed-overrides-access-log-settings-property-builder function updates a CfnApiGatewayManagedOverrides$AccessLogSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnApiGatewayManagedOverrides$AccessLogSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
"
  [^CfnApiGatewayManagedOverrides$AccessLogSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (.build builder))


(defn build-cfn-api-gateway-managed-overrides-builder
  "The build-cfn-api-gateway-managed-overrides-builder function updates a CfnApiGatewayManagedOverrides$Builder instance using the provided configuration.
  The function takes the CfnApiGatewayManagedOverrides$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `integration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:integration` |
| `route` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route` |
| `stage` | software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides$StageOverridesProperty | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^CfnApiGatewayManagedOverrides$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :route)]
    (. builder route data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-cfn-api-gateway-managed-overrides-integration-overrides-property-builder
  "The build-cfn-api-gateway-managed-overrides-integration-overrides-property-builder function updates a CfnApiGatewayManagedOverrides$IntegrationOverridesProperty$Builder instance using the provided configuration.
  The function takes the CfnApiGatewayManagedOverrides$IntegrationOverridesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `integrationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-method` |
| `payloadFormatVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-format-version` |
| `timeoutInMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-millis` |
"
  [^CfnApiGatewayManagedOverrides$IntegrationOverridesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :integration-method)]
    (. builder integrationMethod data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :timeout-in-millis)]
    (. builder timeoutInMillis data))
  (.build builder))


(defn build-cfn-api-gateway-managed-overrides-props-builder
  "The build-cfn-api-gateway-managed-overrides-props-builder function updates a CfnApiGatewayManagedOverridesProps$Builder instance using the provided configuration.
  The function takes the CfnApiGatewayManagedOverridesProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `integration` | software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides$IntegrationOverridesProperty | [[cdk.support/lookup-entry]] | `:integration` |
| `route` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route` |
| `stage` | software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides$StageOverridesProperty | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^CfnApiGatewayManagedOverridesProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :route)]
    (. builder route data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-cfn-api-gateway-managed-overrides-route-overrides-property-builder
  "The build-cfn-api-gateway-managed-overrides-route-overrides-property-builder function updates a CfnApiGatewayManagedOverrides$RouteOverridesProperty$Builder instance using the provided configuration.
  The function takes the CfnApiGatewayManagedOverrides$RouteOverridesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
| `operationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-name` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnApiGatewayManagedOverrides$RouteOverridesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :authorizer-id)]
    (. builder authorizerId data))
  (when-let [data (lookup-entry config id :operation-name)]
    (. builder operationName data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn build-cfn-api-gateway-managed-overrides-route-settings-property-builder
  "The build-cfn-api-gateway-managed-overrides-route-settings-property-builder function updates a CfnApiGatewayManagedOverrides$RouteSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnApiGatewayManagedOverrides$RouteSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `detailedMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:detailed-metrics-enabled` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
"
  [^CfnApiGatewayManagedOverrides$RouteSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-trace-enabled)]
    (. builder dataTraceEnabled data))
  (when-let [data (lookup-entry config id :detailed-metrics-enabled)]
    (. builder detailedMetricsEnabled data))
  (when-let [data (lookup-entry config id :logging-level)]
    (. builder loggingLevel data))
  (when-let [data (lookup-entry config id :throttling-burst-limit)]
    (. builder throttlingBurstLimit data))
  (when-let [data (lookup-entry config id :throttling-rate-limit)]
    (. builder throttlingRateLimit data))
  (.build builder))


(defn build-cfn-api-gateway-managed-overrides-stage-overrides-property-builder
  "The build-cfn-api-gateway-managed-overrides-stage-overrides-property-builder function updates a CfnApiGatewayManagedOverrides$StageOverridesProperty$Builder instance using the provided configuration.
  The function takes the CfnApiGatewayManagedOverrides$StageOverridesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-log-settings` |
| `autoDeploy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `defaultRouteSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-route-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `routeSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:route-settings` |
| `stageVariables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:stage-variables` |
"
  [^CfnApiGatewayManagedOverrides$StageOverridesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log-settings)]
    (. builder accessLogSettings data))
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :default-route-settings)]
    (. builder defaultRouteSettings data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :route-settings)]
    (. builder routeSettings data))
  (when-let [data (lookup-entry config id :stage-variables)]
    (. builder stageVariables data))
  (.build builder))


(defn build-cfn-api-mapping-builder
  "The build-cfn-api-mapping-builder function updates a CfnApiMapping$Builder instance using the provided configuration.
  The function takes the CfnApiMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `apiMappingKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-mapping-key` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^CfnApiMapping$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :api-mapping-key)]
    (. builder apiMappingKey data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-cfn-api-mapping-props-builder
  "The build-cfn-api-mapping-props-builder function updates a CfnApiMappingProps$Builder instance using the provided configuration.
  The function takes the CfnApiMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `apiMappingKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-mapping-key` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^CfnApiMappingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :api-mapping-key)]
    (. builder apiMappingKey data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-cfn-api-props-builder
  "The build-cfn-api-props-builder function updates a CfnApiProps$Builder instance using the provided configuration.
  The function takes the CfnApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-selection-expression` |
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `body` | java.lang.Object | [[cdk.support/lookup-entry]] | `:body` |
| `bodyS3Location` | software.amazon.awscdk.services.apigatewayv2.CfnApi$BodyS3LocationProperty | [[cdk.support/lookup-entry]] | `:body-s3-location` |
| `corsConfiguration` | software.amazon.awscdk.services.apigatewayv2.CfnApi$CorsProperty | [[cdk.support/lookup-entry]] | `:cors-configuration` |
| `credentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `disableSchemaValidation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-schema-validation` |
| `failOnWarnings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocolType` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-type` |
| `routeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-key` |
| `routeSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-selection-expression` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnApiProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-selection-expression)]
    (. builder apiKeySelectionExpression data))
  (when-let [data (lookup-entry config id :base-path)]
    (. builder basePath data))
  (when-let [data (lookup-entry config id :body)]
    (. builder body data))
  (when-let [data (lookup-entry config id :body-s3-location)]
    (. builder bodyS3Location data))
  (when-let [data (lookup-entry config id :cors-configuration)]
    (. builder corsConfiguration data))
  (when-let [data (lookup-entry config id :credentials-arn)]
    (. builder credentialsArn data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
    (. builder disableExecuteApiEndpoint data))
  (when-let [data (lookup-entry config id :disable-schema-validation)]
    (. builder disableSchemaValidation data))
  (when-let [data (lookup-entry config id :fail-on-warnings)]
    (. builder failOnWarnings data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :protocol-type)]
    (. builder protocolType data))
  (when-let [data (lookup-entry config id :route-key)]
    (. builder routeKey data))
  (when-let [data (lookup-entry config id :route-selection-expression)]
    (. builder routeSelectionExpression data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn build-cfn-authorizer-builder
  "The build-cfn-authorizer-builder function updates a CfnAuthorizer$Builder instance using the provided configuration.
  The function takes the CfnAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `authorizerCredentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-credentials-arn` |
| `authorizerPayloadFormatVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-payload-format-version` |
| `authorizerResultTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:authorizer-result-ttl-in-seconds` |
| `authorizerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-type` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `enableSimpleResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-simple-responses` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `identityValidationExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-validation-expression` |
| `jwtConfiguration` | software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer$JWTConfigurationProperty | [[cdk.support/lookup-entry]] | `:jwt-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnAuthorizer$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :authorizer-credentials-arn)]
    (. builder authorizerCredentialsArn data))
  (when-let [data (lookup-entry config id :authorizer-payload-format-version)]
    (. builder authorizerPayloadFormatVersion data))
  (when-let [data (lookup-entry config id :authorizer-result-ttl-in-seconds)]
    (. builder authorizerResultTtlInSeconds data))
  (when-let [data (lookup-entry config id :authorizer-type)]
    (. builder authorizerType data))
  (when-let [data (lookup-entry config id :authorizer-uri)]
    (. builder authorizerUri data))
  (when-let [data (lookup-entry config id :enable-simple-responses)]
    (. builder enableSimpleResponses data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :identity-validation-expression)]
    (. builder identityValidationExpression data))
  (when-let [data (lookup-entry config id :jwt-configuration)]
    (. builder jwtConfiguration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-authorizer-jwt-configuration-property-builder
  "The build-cfn-authorizer-jwt-configuration-property-builder function updates a CfnAuthorizer$JWTConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAuthorizer$JWTConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audience` | java.util.List | [[cdk.support/lookup-entry]] | `:audience` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |
"
  [^CfnAuthorizer$JWTConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audience)]
    (. builder audience data))
  (when-let [data (lookup-entry config id :issuer)]
    (. builder issuer data))
  (.build builder))


(defn build-cfn-authorizer-props-builder
  "The build-cfn-authorizer-props-builder function updates a CfnAuthorizerProps$Builder instance using the provided configuration.
  The function takes the CfnAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `authorizerCredentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-credentials-arn` |
| `authorizerPayloadFormatVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-payload-format-version` |
| `authorizerResultTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:authorizer-result-ttl-in-seconds` |
| `authorizerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-type` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `enableSimpleResponses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-simple-responses` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `identityValidationExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-validation-expression` |
| `jwtConfiguration` | software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer$JWTConfigurationProperty | [[cdk.support/lookup-entry]] | `:jwt-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :authorizer-credentials-arn)]
    (. builder authorizerCredentialsArn data))
  (when-let [data (lookup-entry config id :authorizer-payload-format-version)]
    (. builder authorizerPayloadFormatVersion data))
  (when-let [data (lookup-entry config id :authorizer-result-ttl-in-seconds)]
    (. builder authorizerResultTtlInSeconds data))
  (when-let [data (lookup-entry config id :authorizer-type)]
    (. builder authorizerType data))
  (when-let [data (lookup-entry config id :authorizer-uri)]
    (. builder authorizerUri data))
  (when-let [data (lookup-entry config id :enable-simple-responses)]
    (. builder enableSimpleResponses data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :identity-validation-expression)]
    (. builder identityValidationExpression data))
  (when-let [data (lookup-entry config id :jwt-configuration)]
    (. builder jwtConfiguration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-deployment-builder
  "The build-cfn-deployment-builder function updates a CfnDeployment$Builder instance using the provided configuration.
  The function takes the CfnDeployment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^CfnDeployment$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn build-cfn-deployment-props-builder
  "The build-cfn-deployment-props-builder function updates a CfnDeploymentProps$Builder instance using the provided configuration.
  The function takes the CfnDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^CfnDeploymentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn build-cfn-domain-name-builder
  "The build-cfn-domain-name-builder function updates a CfnDomainName$Builder instance using the provided configuration.
  The function takes the CfnDomainName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainNameConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain-name-configurations` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomainName$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :domain-name-configurations)]
    (. builder domainNameConfigurations data))
  (when-let [data (lookup-entry config id :mutual-tls-authentication)]
    (. builder mutualTlsAuthentication data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-domain-name-domain-name-configuration-property-builder
  "The build-cfn-domain-name-domain-name-configuration-property-builder function updates a CfnDomainName$DomainNameConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainName$DomainNameConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `ownershipVerificationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ownership-verification-certificate-arn` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
"
  [^CfnDomainName$DomainNameConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-let [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-let [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :ownership-verification-certificate-arn)]
    (. builder ownershipVerificationCertificateArn data))
  (when-let [data (lookup-entry config id :security-policy)]
    (. builder securityPolicy data))
  (.build builder))


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


(defn build-cfn-domain-name-props-builder
  "The build-cfn-domain-name-props-builder function updates a CfnDomainNameProps$Builder instance using the provided configuration.
  The function takes the CfnDomainNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainNameConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-name-configurations` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomainNameProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :domain-name-configurations)]
    (. builder domainNameConfigurations data))
  (when-let [data (lookup-entry config id :mutual-tls-authentication)]
    (. builder mutualTlsAuthentication data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-integration-builder
  "The build-cfn-integration-builder function updates a CfnIntegration$Builder instance using the provided configuration.
  The function takes the CfnIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `connectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-id` |
| `connectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-type` |
| `contentHandlingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-handling-strategy` |
| `credentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `integrationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-method` |
| `integrationSubtype` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-subtype` |
| `integrationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-type` |
| `integrationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-uri` |
| `passthroughBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:passthrough-behavior` |
| `payloadFormatVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-format-version` |
| `requestParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.lang.Object | [[cdk.support/lookup-entry]] | `:request-templates` |
| `responseParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
| `timeoutInMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-millis` |
| `tlsConfig` | software.amazon.awscdk.services.apigatewayv2.CfnIntegration$TlsConfigProperty | [[cdk.support/lookup-entry]] | `:tls-config` |
"
  [^CfnIntegration$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :connection-id)]
    (. builder connectionId data))
  (when-let [data (lookup-entry config id :connection-type)]
    (. builder connectionType data))
  (when-let [data (lookup-entry config id :content-handling-strategy)]
    (. builder contentHandlingStrategy data))
  (when-let [data (lookup-entry config id :credentials-arn)]
    (. builder credentialsArn data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :integration-method)]
    (. builder integrationMethod data))
  (when-let [data (lookup-entry config id :integration-subtype)]
    (. builder integrationSubtype data))
  (when-let [data (lookup-entry config id :integration-type)]
    (. builder integrationType data))
  (when-let [data (lookup-entry config id :integration-uri)]
    (. builder integrationUri data))
  (when-let [data (lookup-entry config id :passthrough-behavior)]
    (. builder passthroughBehavior data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :request-templates)]
    (. builder requestTemplates data))
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (when-let [data (lookup-entry config id :timeout-in-millis)]
    (. builder timeoutInMillis data))
  (when-let [data (lookup-entry config id :tls-config)]
    (. builder tlsConfig data))
  (.build builder))


(defn build-cfn-integration-props-builder
  "The build-cfn-integration-props-builder function updates a CfnIntegrationProps$Builder instance using the provided configuration.
  The function takes the CfnIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `connectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-id` |
| `connectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-type` |
| `contentHandlingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-handling-strategy` |
| `credentialsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `integrationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-method` |
| `integrationSubtype` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-subtype` |
| `integrationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-type` |
| `integrationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-uri` |
| `passthroughBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:passthrough-behavior` |
| `payloadFormatVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-format-version` |
| `requestParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.lang.Object | [[cdk.support/lookup-entry]] | `:request-templates` |
| `responseParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
| `timeoutInMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-millis` |
| `tlsConfig` | software.amazon.awscdk.services.apigatewayv2.CfnIntegration$TlsConfigProperty | [[cdk.support/lookup-entry]] | `:tls-config` |
"
  [^CfnIntegrationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :connection-id)]
    (. builder connectionId data))
  (when-let [data (lookup-entry config id :connection-type)]
    (. builder connectionType data))
  (when-let [data (lookup-entry config id :content-handling-strategy)]
    (. builder contentHandlingStrategy data))
  (when-let [data (lookup-entry config id :credentials-arn)]
    (. builder credentialsArn data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :integration-method)]
    (. builder integrationMethod data))
  (when-let [data (lookup-entry config id :integration-subtype)]
    (. builder integrationSubtype data))
  (when-let [data (lookup-entry config id :integration-type)]
    (. builder integrationType data))
  (when-let [data (lookup-entry config id :integration-uri)]
    (. builder integrationUri data))
  (when-let [data (lookup-entry config id :passthrough-behavior)]
    (. builder passthroughBehavior data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :request-templates)]
    (. builder requestTemplates data))
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (when-let [data (lookup-entry config id :timeout-in-millis)]
    (. builder timeoutInMillis data))
  (when-let [data (lookup-entry config id :tls-config)]
    (. builder tlsConfig data))
  (.build builder))


(defn build-cfn-integration-response-builder
  "The build-cfn-integration-response-builder function updates a CfnIntegrationResponse$Builder instance using the provided configuration.
  The function takes the CfnIntegrationResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `contentHandlingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-handling-strategy` |
| `integrationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-id` |
| `integrationResponseKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-response-key` |
| `responseParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | java.lang.Object | [[cdk.support/lookup-entry]] | `:response-templates` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
"
  [^CfnIntegrationResponse$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :content-handling-strategy)]
    (. builder contentHandlingStrategy data))
  (when-let [data (lookup-entry config id :integration-id)]
    (. builder integrationId data))
  (when-let [data (lookup-entry config id :integration-response-key)]
    (. builder integrationResponseKey data))
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (when-let [data (lookup-entry config id :response-templates)]
    (. builder responseTemplates data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (.build builder))


(defn build-cfn-integration-response-parameter-list-property-builder
  "The build-cfn-integration-response-parameter-list-property-builder function updates a CfnIntegration$ResponseParameterListProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$ResponseParameterListProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-parameters` |
"
  [^CfnIntegration$ResponseParameterListProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (.build builder))


(defn build-cfn-integration-response-parameter-property-builder
  "The build-cfn-integration-response-parameter-property-builder function updates a CfnIntegration$ResponseParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$ResponseParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnIntegration$ResponseParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn build-cfn-integration-response-props-builder
  "The build-cfn-integration-response-props-builder function updates a CfnIntegrationResponseProps$Builder instance using the provided configuration.
  The function takes the CfnIntegrationResponseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `contentHandlingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-handling-strategy` |
| `integrationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-id` |
| `integrationResponseKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-response-key` |
| `responseParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `responseTemplates` | java.lang.Object | [[cdk.support/lookup-entry]] | `:response-templates` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
"
  [^CfnIntegrationResponseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :content-handling-strategy)]
    (. builder contentHandlingStrategy data))
  (when-let [data (lookup-entry config id :integration-id)]
    (. builder integrationId data))
  (when-let [data (lookup-entry config id :integration-response-key)]
    (. builder integrationResponseKey data))
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (when-let [data (lookup-entry config id :response-templates)]
    (. builder responseTemplates data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (.build builder))


(defn build-cfn-integration-tls-config-property-builder
  "The build-cfn-integration-tls-config-property-builder function updates a CfnIntegration$TlsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$TlsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serverNameToVerify` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name-to-verify` |
"
  [^CfnIntegration$TlsConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :server-name-to-verify)]
    (. builder serverNameToVerify data))
  (.build builder))


(defn build-cfn-model-builder
  "The build-cfn-model-builder function updates a CfnModel$Builder instance using the provided configuration.
  The function takes the CfnModel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnModel$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn build-cfn-model-props-builder
  "The build-cfn-model-props-builder function updates a CfnModelProps$Builder instance using the provided configuration.
  The function takes the CfnModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnModelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn build-cfn-route-builder
  "The build-cfn-route-builder function updates a CfnRoute$Builder instance using the provided configuration.
  The function takes the CfnRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `apiKeyRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
| `modelSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-selection-expression` |
| `operationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-name` |
| `requestModels` | java.lang.Object | [[cdk.support/lookup-entry]] | `:request-models` |
| `requestParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `routeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-key` |
| `routeResponseSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-response-selection-expression` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnRoute$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :api-key-required)]
    (. builder apiKeyRequired data))
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :authorizer-id)]
    (. builder authorizerId data))
  (when-let [data (lookup-entry config id :model-selection-expression)]
    (. builder modelSelectionExpression data))
  (when-let [data (lookup-entry config id :operation-name)]
    (. builder operationName data))
  (when-let [data (lookup-entry config id :request-models)]
    (. builder requestModels data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :route-key)]
    (. builder routeKey data))
  (when-let [data (lookup-entry config id :route-response-selection-expression)]
    (. builder routeResponseSelectionExpression data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn build-cfn-route-parameter-constraints-property-builder
  "The build-cfn-route-parameter-constraints-property-builder function updates a CfnRoute$ParameterConstraintsProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$ParameterConstraintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `required` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required` |
"
  [^CfnRoute$ParameterConstraintsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :required)]
    (. builder required data))
  (.build builder))


(defn build-cfn-route-props-builder
  "The build-cfn-route-props-builder function updates a CfnRouteProps$Builder instance using the provided configuration.
  The function takes the CfnRouteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `apiKeyRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
| `modelSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-selection-expression` |
| `operationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-name` |
| `requestModels` | java.lang.Object | [[cdk.support/lookup-entry]] | `:request-models` |
| `requestParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `routeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-key` |
| `routeResponseSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-response-selection-expression` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnRouteProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :api-key-required)]
    (. builder apiKeyRequired data))
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :authorizer-id)]
    (. builder authorizerId data))
  (when-let [data (lookup-entry config id :model-selection-expression)]
    (. builder modelSelectionExpression data))
  (when-let [data (lookup-entry config id :operation-name)]
    (. builder operationName data))
  (when-let [data (lookup-entry config id :request-models)]
    (. builder requestModels data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :route-key)]
    (. builder routeKey data))
  (when-let [data (lookup-entry config id :route-response-selection-expression)]
    (. builder routeResponseSelectionExpression data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn build-cfn-route-response-builder
  "The build-cfn-route-response-builder function updates a CfnRouteResponse$Builder instance using the provided configuration.
  The function takes the CfnRouteResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `modelSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-selection-expression` |
| `responseModels` | java.lang.Object | [[cdk.support/lookup-entry]] | `:response-models` |
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `routeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-id` |
| `routeResponseKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-response-key` |
"
  [^CfnRouteResponse$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :model-selection-expression)]
    (. builder modelSelectionExpression data))
  (when-let [data (lookup-entry config id :response-models)]
    (. builder responseModels data))
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (when-let [data (lookup-entry config id :route-id)]
    (. builder routeId data))
  (when-let [data (lookup-entry config id :route-response-key)]
    (. builder routeResponseKey data))
  (.build builder))


(defn build-cfn-route-response-parameter-constraints-property-builder
  "The build-cfn-route-response-parameter-constraints-property-builder function updates a CfnRouteResponse$ParameterConstraintsProperty$Builder instance using the provided configuration.
  The function takes the CfnRouteResponse$ParameterConstraintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `required` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required` |
"
  [^CfnRouteResponse$ParameterConstraintsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :required)]
    (. builder required data))
  (.build builder))


(defn build-cfn-route-response-props-builder
  "The build-cfn-route-response-props-builder function updates a CfnRouteResponseProps$Builder instance using the provided configuration.
  The function takes the CfnRouteResponseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `modelSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-selection-expression` |
| `responseModels` | java.lang.Object | [[cdk.support/lookup-entry]] | `:response-models` |
| `responseParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:response-parameters` |
| `routeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-id` |
| `routeResponseKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-response-key` |
"
  [^CfnRouteResponseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :model-selection-expression)]
    (. builder modelSelectionExpression data))
  (when-let [data (lookup-entry config id :response-models)]
    (. builder responseModels data))
  (when-let [data (lookup-entry config id :response-parameters)]
    (. builder responseParameters data))
  (when-let [data (lookup-entry config id :route-id)]
    (. builder routeId data))
  (when-let [data (lookup-entry config id :route-response-key)]
    (. builder routeResponseKey data))
  (.build builder))


(defn build-cfn-stage-access-log-settings-property-builder
  "The build-cfn-stage-access-log-settings-property-builder function updates a CfnStage$AccessLogSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnStage$AccessLogSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
"
  [^CfnStage$AccessLogSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (.build builder))


(defn build-cfn-stage-builder
  "The build-cfn-stage-builder function updates a CfnStage$Builder instance using the provided configuration.
  The function takes the CfnStage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSettings` | software.amazon.awscdk.services.apigatewayv2.CfnStage$AccessLogSettingsProperty | [[cdk.support/lookup-entry]] | `:access-log-settings` |
| `accessPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-policy-id` |
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `autoDeploy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `clientCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-id` |
| `defaultRouteSettings` | software.amazon.awscdk.services.apigatewayv2.CfnStage$RouteSettingsProperty | [[cdk.support/lookup-entry]] | `:default-route-settings` |
| `deploymentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `routeSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:route-settings` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `stageVariables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:stage-variables` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStage$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log-settings)]
    (. builder accessLogSettings data))
  (when-let [data (lookup-entry config id :access-policy-id)]
    (. builder accessPolicyId data))
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :client-certificate-id)]
    (. builder clientCertificateId data))
  (when-let [data (lookup-entry config id :default-route-settings)]
    (. builder defaultRouteSettings data))
  (when-let [data (lookup-entry config id :deployment-id)]
    (. builder deploymentId data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :route-settings)]
    (. builder routeSettings data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :stage-variables)]
    (. builder stageVariables data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-stage-props-builder
  "The build-cfn-stage-props-builder function updates a CfnStageProps$Builder instance using the provided configuration.
  The function takes the CfnStageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSettings` | software.amazon.awscdk.services.apigatewayv2.CfnStage$AccessLogSettingsProperty | [[cdk.support/lookup-entry]] | `:access-log-settings` |
| `accessPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-policy-id` |
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `autoDeploy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `clientCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-id` |
| `defaultRouteSettings` | software.amazon.awscdk.services.apigatewayv2.CfnStage$RouteSettingsProperty | [[cdk.support/lookup-entry]] | `:default-route-settings` |
| `deploymentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `routeSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:route-settings` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `stageVariables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:stage-variables` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStageProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log-settings)]
    (. builder accessLogSettings data))
  (when-let [data (lookup-entry config id :access-policy-id)]
    (. builder accessPolicyId data))
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :client-certificate-id)]
    (. builder clientCertificateId data))
  (when-let [data (lookup-entry config id :default-route-settings)]
    (. builder defaultRouteSettings data))
  (when-let [data (lookup-entry config id :deployment-id)]
    (. builder deploymentId data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :route-settings)]
    (. builder routeSettings data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :stage-variables)]
    (. builder stageVariables data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-stage-route-settings-property-builder
  "The build-cfn-stage-route-settings-property-builder function updates a CfnStage$RouteSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnStage$RouteSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `detailedMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:detailed-metrics-enabled` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
"
  [^CfnStage$RouteSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-trace-enabled)]
    (. builder dataTraceEnabled data))
  (when-let [data (lookup-entry config id :detailed-metrics-enabled)]
    (. builder detailedMetricsEnabled data))
  (when-let [data (lookup-entry config id :logging-level)]
    (. builder loggingLevel data))
  (when-let [data (lookup-entry config id :throttling-burst-limit)]
    (. builder throttlingBurstLimit data))
  (when-let [data (lookup-entry config id :throttling-rate-limit)]
    (. builder throttlingRateLimit data))
  (.build builder))


(defn build-cfn-vpc-link-builder
  "The build-cfn-vpc-link-builder function updates a CfnVpcLink$Builder instance using the provided configuration.
  The function takes the CfnVpcLink$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVpcLink$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-vpc-link-props-builder
  "The build-cfn-vpc-link-props-builder function updates a CfnVpcLinkProps$Builder instance using the provided configuration.
  The function takes the CfnVpcLinkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVpcLinkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cors-preflight-options-builder
  "The build-cors-preflight-options-builder function updates a CorsPreflightOptions$Builder instance using the provided configuration.
  The function takes the CorsPreflightOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-origins` |
| `exposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:expose-headers` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |
"
  [^CorsPreflightOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-credentials)]
    (. builder allowCredentials data))
  (when-let [data (lookup-entry config id :allow-headers)]
    (. builder allowHeaders data))
  (when-let [data (lookup-entry config id :allow-methods)]
    (. builder allowMethods data))
  (when-let [data (lookup-entry config id :allow-origins)]
    (. builder allowOrigins data))
  (when-let [data (lookup-entry config id :expose-headers)]
    (. builder exposeHeaders data))
  (when-let [data (lookup-entry config id :max-age)]
    (. builder maxAge data))
  (.build builder))


(defn build-domain-mapping-options-builder
  "The build-domain-mapping-options-builder function updates a DomainMappingOptions$Builder instance using the provided configuration.
  The function takes the DomainMappingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | software.amazon.awscdk.services.apigatewayv2.IDomainName | [[cdk.support/lookup-entry]] | `:domain-name` |
| `mappingKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping-key` |
"
  [^DomainMappingOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :mapping-key)]
    (. builder mappingKey data))
  (.build builder))


(defn build-domain-name-attributes-builder
  "The build-domain-name-attributes-builder function updates a DomainNameAttributes$Builder instance using the provided configuration.
  The function takes the DomainNameAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regionalDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:regional-domain-name` |
| `regionalHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:regional-hosted-zone-id` |
"
  [^DomainNameAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :regional-domain-name)]
    (. builder regionalDomainName data))
  (when-let [data (lookup-entry config id :regional-hosted-zone-id)]
    (. builder regionalHostedZoneId data))
  (.build builder))


(defn build-domain-name-builder
  "The build-domain-name-builder function updates a DomainName$Builder instance using the provided configuration.
  The function takes the DomainName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointType` | software.amazon.awscdk.services.apigatewayv2.EndpointType | [[cdk.api.services.apigatewayv2/endpoint-type]] | `:endpoint-type` |
| `mtls` | software.amazon.awscdk.services.apigatewayv2.MTLSConfig | [[cdk.support/lookup-entry]] | `:mtls` |
| `ownershipCertificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:ownership-certificate` |
| `securityPolicy` | software.amazon.awscdk.services.apigatewayv2.SecurityPolicy | [[cdk.api.services.apigatewayv2/security-policy]] | `:security-policy` |
"
  [^DomainName$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (endpoint-type config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :mtls)]
    (. builder mtls data))
  (when-let [data (lookup-entry config id :ownership-certificate)]
    (. builder ownershipCertificate data))
  (when-let [data (security-policy config id :security-policy)]
    (. builder securityPolicy data))
  (.build builder))


(defn build-domain-name-props-builder
  "The build-domain-name-props-builder function updates a DomainNameProps$Builder instance using the provided configuration.
  The function takes the DomainNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointType` | software.amazon.awscdk.services.apigatewayv2.EndpointType | [[cdk.api.services.apigatewayv2/endpoint-type]] | `:endpoint-type` |
| `mtls` | software.amazon.awscdk.services.apigatewayv2.MTLSConfig | [[cdk.support/lookup-entry]] | `:mtls` |
| `ownershipCertificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:ownership-certificate` |
| `securityPolicy` | software.amazon.awscdk.services.apigatewayv2.SecurityPolicy | [[cdk.api.services.apigatewayv2/security-policy]] | `:security-policy` |
"
  [^DomainNameProps$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (endpoint-type config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :mtls)]
    (. builder mtls data))
  (when-let [data (lookup-entry config id :ownership-certificate)]
    (. builder ownershipCertificate data))
  (when-let [data (security-policy config id :security-policy)]
    (. builder securityPolicy data))
  (.build builder))


(defn build-endpoint-options-builder
  "The build-endpoint-options-builder function updates a EndpointOptions$Builder instance using the provided configuration.
  The function takes the EndpointOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `endpointType` | software.amazon.awscdk.services.apigatewayv2.EndpointType | [[cdk.api.services.apigatewayv2/endpoint-type]] | `:endpoint-type` |
| `ownershipCertificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:ownership-certificate` |
| `securityPolicy` | software.amazon.awscdk.services.apigatewayv2.SecurityPolicy | [[cdk.api.services.apigatewayv2/security-policy]] | `:security-policy` |
"
  [^EndpointOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-let [data (endpoint-type config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :ownership-certificate)]
    (. builder ownershipCertificate data))
  (when-let [data (security-policy config id :security-policy)]
    (. builder securityPolicy data))
  (.build builder))


(defn build-grant-invoke-options-builder
  "The build-grant-invoke-options-builder function updates a GrantInvokeOptions$Builder instance using the provided configuration.
  The function takes the GrantInvokeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:http-methods` |
"
  [^GrantInvokeOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :http-methods)]
    (. builder httpMethods data))
  (.build builder))


(defn build-http-api-attributes-builder
  "The build-http-api-attributes-builder function updates a HttpApiAttributes$Builder instance using the provided configuration.
  The function takes the HttpApiAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-endpoint` |
| `httpApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-api-id` |
"
  [^HttpApiAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :api-endpoint)]
    (. builder apiEndpoint data))
  (when-let [data (lookup-entry config id :http-api-id)]
    (. builder httpApiId data))
  (.build builder))


(defn build-http-api-builder
  "The build-http-api-builder function updates a HttpApi$Builder instance using the provided configuration.
  The function takes the HttpApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-name` |
| `corsPreflight` | software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions | [[cdk.support/lookup-entry]] | `:cors-preflight` |
| `createDefaultStage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-default-stage` |
| `defaultAuthorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:default-authorization-scopes` |
| `defaultAuthorizer` | software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer | [[cdk.support/lookup-entry]] | `:default-authorizer` |
| `defaultDomainMapping` | software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions | [[cdk.support/lookup-entry]] | `:default-domain-mapping` |
| `defaultIntegration` | software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
"
  [^HttpApi$Builder builder id config]
  (when-let [data (lookup-entry config id :api-name)]
    (. builder apiName data))
  (when-let [data (lookup-entry config id :cors-preflight)]
    (. builder corsPreflight data))
  (when-let [data (lookup-entry config id :create-default-stage)]
    (. builder createDefaultStage data))
  (when-let [data (lookup-entry config id :default-authorization-scopes)]
    (. builder defaultAuthorizationScopes data))
  (when-let [data (lookup-entry config id :default-authorizer)]
    (. builder defaultAuthorizer data))
  (when-let [data (lookup-entry config id :default-domain-mapping)]
    (. builder defaultDomainMapping data))
  (when-let [data (lookup-entry config id :default-integration)]
    (. builder defaultIntegration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
    (. builder disableExecuteApiEndpoint data))
  (.build builder))


(defn build-http-api-props-builder
  "The build-http-api-props-builder function updates a HttpApiProps$Builder instance using the provided configuration.
  The function takes the HttpApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-name` |
| `corsPreflight` | software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions | [[cdk.support/lookup-entry]] | `:cors-preflight` |
| `createDefaultStage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-default-stage` |
| `defaultAuthorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:default-authorization-scopes` |
| `defaultAuthorizer` | software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer | [[cdk.support/lookup-entry]] | `:default-authorizer` |
| `defaultDomainMapping` | software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions | [[cdk.support/lookup-entry]] | `:default-domain-mapping` |
| `defaultIntegration` | software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration | [[cdk.support/lookup-entry]] | `:default-integration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
"
  [^HttpApiProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-name)]
    (. builder apiName data))
  (when-let [data (lookup-entry config id :cors-preflight)]
    (. builder corsPreflight data))
  (when-let [data (lookup-entry config id :create-default-stage)]
    (. builder createDefaultStage data))
  (when-let [data (lookup-entry config id :default-authorization-scopes)]
    (. builder defaultAuthorizationScopes data))
  (when-let [data (lookup-entry config id :default-authorizer)]
    (. builder defaultAuthorizer data))
  (when-let [data (lookup-entry config id :default-domain-mapping)]
    (. builder defaultDomainMapping data))
  (when-let [data (lookup-entry config id :default-integration)]
    (. builder defaultIntegration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
    (. builder disableExecuteApiEndpoint data))
  (.build builder))


(defn build-http-authorizer-attributes-builder
  "The build-http-authorizer-attributes-builder function updates a HttpAuthorizerAttributes$Builder instance using the provided configuration.
  The function takes the HttpAuthorizerAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
| `authorizerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-type` |
"
  [^HttpAuthorizerAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-id)]
    (. builder authorizerId data))
  (when-let [data (lookup-entry config id :authorizer-type)]
    (. builder authorizerType data))
  (.build builder))


(defn build-http-authorizer-builder
  "The build-http-authorizer-builder function updates a HttpAuthorizer$Builder instance using the provided configuration.
  The function takes the HttpAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `enableSimpleResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-simple-responses` |
| `httpApi` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:http-api` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `jwtAudience` | java.util.List | [[cdk.support/lookup-entry]] | `:jwt-audience` |
| `jwtIssuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:jwt-issuer` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion | [[cdk.api.services.apigatewayv2/authorizer-payload-version]] | `:payload-format-version` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
| `type` | software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType | [[cdk.api.services.apigatewayv2/http-authorizer-type]] | `:type` |
"
  [^HttpAuthorizer$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :authorizer-uri)]
    (. builder authorizerUri data))
  (when-let [data (lookup-entry config id :enable-simple-responses)]
    (. builder enableSimpleResponses data))
  (when-let [data (lookup-entry config id :http-api)]
    (. builder httpApi data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :jwt-audience)]
    (. builder jwtAudience data))
  (when-let [data (lookup-entry config id :jwt-issuer)]
    (. builder jwtIssuer data))
  (when-let [data (authorizer-payload-version config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :results-cache-ttl)]
    (. builder resultsCacheTtl data))
  (when-let [data (http-authorizer-type config id :type)]
    (. builder type data))
  (.build builder))


(defn build-http-authorizer-props-builder
  "The build-http-authorizer-props-builder function updates a HttpAuthorizerProps$Builder instance using the provided configuration.
  The function takes the HttpAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `enableSimpleResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-simple-responses` |
| `httpApi` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:http-api` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `jwtAudience` | java.util.List | [[cdk.support/lookup-entry]] | `:jwt-audience` |
| `jwtIssuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:jwt-issuer` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion | [[cdk.api.services.apigatewayv2/authorizer-payload-version]] | `:payload-format-version` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
| `type` | software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerType | [[cdk.api.services.apigatewayv2/http-authorizer-type]] | `:type` |
"
  [^HttpAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :authorizer-uri)]
    (. builder authorizerUri data))
  (when-let [data (lookup-entry config id :enable-simple-responses)]
    (. builder enableSimpleResponses data))
  (when-let [data (lookup-entry config id :http-api)]
    (. builder httpApi data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :jwt-audience)]
    (. builder jwtAudience data))
  (when-let [data (lookup-entry config id :jwt-issuer)]
    (. builder jwtIssuer data))
  (when-let [data (authorizer-payload-version config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :results-cache-ttl)]
    (. builder resultsCacheTtl data))
  (when-let [data (http-authorizer-type config id :type)]
    (. builder type data))
  (.build builder))


(defn build-http-integration-builder
  "The build-http-integration-builder function updates a HttpIntegration$Builder instance using the provided configuration.
  The function takes the HttpIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-id` |
| `connectionType` | software.amazon.awscdk.services.apigatewayv2.HttpConnectionType | [[cdk.api.services.apigatewayv2/http-connection-type]] | `:connection-type` |
| `credentials` | software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `httpApi` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:http-api` |
| `integrationSubtype` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype | [[cdk.api.services.apigatewayv2/http-integration-subtype]] | `:integration-subtype` |
| `integrationType` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType | [[cdk.api.services.apigatewayv2/http-integration-type]] | `:integration-type` |
| `integrationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-uri` |
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion | [[cdk.support/lookup-entry]] | `:payload-format-version` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
"
  [^HttpIntegration$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-id)]
    (. builder connectionId data))
  (when-let [data (http-connection-type config id :connection-type)]
    (. builder connectionType data))
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (lookup-entry config id :http-api)]
    (. builder httpApi data))
  (when-let [data (http-integration-subtype config id :integration-subtype)]
    (. builder integrationSubtype data))
  (when-let [data (http-integration-type config id :integration-type)]
    (. builder integrationType data))
  (when-let [data (lookup-entry config id :integration-uri)]
    (. builder integrationUri data))
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (.build builder))


(defn build-http-integration-props-builder
  "The build-http-integration-props-builder function updates a HttpIntegrationProps$Builder instance using the provided configuration.
  The function takes the HttpIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-id` |
| `connectionType` | software.amazon.awscdk.services.apigatewayv2.HttpConnectionType | [[cdk.api.services.apigatewayv2/http-connection-type]] | `:connection-type` |
| `credentials` | software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `httpApi` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:http-api` |
| `integrationSubtype` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype | [[cdk.api.services.apigatewayv2/http-integration-subtype]] | `:integration-subtype` |
| `integrationType` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType | [[cdk.api.services.apigatewayv2/http-integration-type]] | `:integration-type` |
| `integrationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-uri` |
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion | [[cdk.support/lookup-entry]] | `:payload-format-version` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
"
  [^HttpIntegrationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-id)]
    (. builder connectionId data))
  (when-let [data (http-connection-type config id :connection-type)]
    (. builder connectionType data))
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (lookup-entry config id :http-api)]
    (. builder httpApi data))
  (when-let [data (http-integration-subtype config id :integration-subtype)]
    (. builder integrationSubtype data))
  (when-let [data (http-integration-type config id :integration-type)]
    (. builder integrationType data))
  (when-let [data (lookup-entry config id :integration-uri)]
    (. builder integrationUri data))
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (.build builder))


(defn build-http-route-authorizer-bind-options-builder
  "The build-http-route-authorizer-bind-options-builder function updates a HttpRouteAuthorizerBindOptions$Builder instance using the provided configuration.
  The function takes the HttpRouteAuthorizerBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `route` | software.amazon.awscdk.services.apigatewayv2.IHttpRoute | [[cdk.support/lookup-entry]] | `:route` |
| `scope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^HttpRouteAuthorizerBindOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :route)]
    (. builder route data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn build-http-route-authorizer-config-builder
  "The build-http-route-authorizer-config-builder function updates a HttpRouteAuthorizerConfig$Builder instance using the provided configuration.
  The function takes the HttpRouteAuthorizerConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
"
  [^HttpRouteAuthorizerConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :authorizer-id)]
    (. builder authorizerId data))
  (.build builder))


(defn build-http-route-builder
  "The build-http-route-builder function updates a HttpRoute$Builder instance using the provided configuration.
  The function takes the HttpRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizer` | software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer | [[cdk.support/lookup-entry]] | `:authorizer` |
| `httpApi` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:http-api` |
| `integration` | software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration | [[cdk.support/lookup-entry]] | `:integration` |
| `routeKey` | software.amazon.awscdk.services.apigatewayv2.HttpRouteKey | [[cdk.support/lookup-entry]] | `:route-key` |
"
  [^HttpRoute$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-let [data (lookup-entry config id :http-api)]
    (. builder httpApi data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :route-key)]
    (. builder routeKey data))
  (.build builder))


(defn build-http-route-integration-bind-options-builder
  "The build-http-route-integration-bind-options-builder function updates a HttpRouteIntegrationBindOptions$Builder instance using the provided configuration.
  The function takes the HttpRouteIntegrationBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `route` | software.amazon.awscdk.services.apigatewayv2.IHttpRoute | [[cdk.support/lookup-entry]] | `:route` |
| `scope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^HttpRouteIntegrationBindOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :route)]
    (. builder route data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn build-http-route-integration-config-builder
  "The build-http-route-integration-config-builder function updates a HttpRouteIntegrationConfig$Builder instance using the provided configuration.
  The function takes the HttpRouteIntegrationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-id` |
| `connectionType` | software.amazon.awscdk.services.apigatewayv2.HttpConnectionType | [[cdk.api.services.apigatewayv2/http-connection-type]] | `:connection-type` |
| `credentials` | software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `method` | software.amazon.awscdk.services.apigatewayv2.HttpMethod | [[cdk.api.services.apigatewayv2/http-method]] | `:method` |
| `parameterMapping` | software.amazon.awscdk.services.apigatewayv2.ParameterMapping | [[cdk.support/lookup-entry]] | `:parameter-mapping` |
| `payloadFormatVersion` | software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion | [[cdk.support/lookup-entry]] | `:payload-format-version` |
| `secureServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-server-name` |
| `subtype` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype | [[cdk.api.services.apigatewayv2/http-integration-subtype]] | `:subtype` |
| `type` | software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType | [[cdk.api.services.apigatewayv2/http-integration-type]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^HttpRouteIntegrationConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-id)]
    (. builder connectionId data))
  (when-let [data (http-connection-type config id :connection-type)]
    (. builder connectionType data))
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (http-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :parameter-mapping)]
    (. builder parameterMapping data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :secure-server-name)]
    (. builder secureServerName data))
  (when-let [data (http-integration-subtype config id :subtype)]
    (. builder subtype data))
  (when-let [data (http-integration-type config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn build-http-route-props-builder
  "The build-http-route-props-builder function updates a HttpRouteProps$Builder instance using the provided configuration.
  The function takes the HttpRouteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizer` | software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer | [[cdk.support/lookup-entry]] | `:authorizer` |
| `httpApi` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:http-api` |
| `integration` | software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration | [[cdk.support/lookup-entry]] | `:integration` |
| `routeKey` | software.amazon.awscdk.services.apigatewayv2.HttpRouteKey | [[cdk.support/lookup-entry]] | `:route-key` |
"
  [^HttpRouteProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-let [data (lookup-entry config id :http-api)]
    (. builder httpApi data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :route-key)]
    (. builder routeKey data))
  (.build builder))


(defn build-http-stage-attributes-builder
  "The build-http-stage-attributes-builder function updates a HttpStageAttributes$Builder instance using the provided configuration.
  The function takes the HttpStageAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:api` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^HttpStageAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn build-http-stage-builder
  "The build-http-stage-builder function updates a HttpStage$Builder instance using the provided configuration.
  The function takes the HttpStage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `domainMapping` | software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions | [[cdk.support/lookup-entry]] | `:domain-mapping` |
| `httpApi` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:http-api` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `throttle` | software.amazon.awscdk.services.apigatewayv2.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^HttpStage$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :domain-mapping)]
    (. builder domainMapping data))
  (when-let [data (lookup-entry config id :http-api)]
    (. builder httpApi data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (.build builder))


(defn build-http-stage-options-builder
  "The build-http-stage-options-builder function updates a HttpStageOptions$Builder instance using the provided configuration.
  The function takes the HttpStageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `domainMapping` | software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions | [[cdk.support/lookup-entry]] | `:domain-mapping` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `throttle` | software.amazon.awscdk.services.apigatewayv2.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^HttpStageOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :domain-mapping)]
    (. builder domainMapping data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (.build builder))


(defn build-http-stage-props-builder
  "The build-http-stage-props-builder function updates a HttpStageProps$Builder instance using the provided configuration.
  The function takes the HttpStageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `domainMapping` | software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions | [[cdk.support/lookup-entry]] | `:domain-mapping` |
| `httpApi` | software.amazon.awscdk.services.apigatewayv2.IHttpApi | [[cdk.support/lookup-entry]] | `:http-api` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `throttle` | software.amazon.awscdk.services.apigatewayv2.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^HttpStageProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :domain-mapping)]
    (. builder domainMapping data))
  (when-let [data (lookup-entry config id :http-api)]
    (. builder httpApi data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (.build builder))


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


(defn build-stage-attributes-builder
  "The build-stage-attributes-builder function updates a StageAttributes$Builder instance using the provided configuration.
  The function takes the StageAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^StageAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn build-stage-options-builder
  "The build-stage-options-builder function updates a StageOptions$Builder instance using the provided configuration.
  The function takes the StageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `domainMapping` | software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions | [[cdk.support/lookup-entry]] | `:domain-mapping` |
| `throttle` | software.amazon.awscdk.services.apigatewayv2.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
"
  [^StageOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :domain-mapping)]
    (. builder domainMapping data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (.build builder))


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


(defn build-vpc-link-attributes-builder
  "The build-vpc-link-attributes-builder function updates a VpcLinkAttributes$Builder instance using the provided configuration.
  The function takes the VpcLinkAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcLinkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-link-id` |
"
  [^VpcLinkAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-link-id)]
    (. builder vpcLinkId data))
  (.build builder))


(defn build-vpc-link-builder
  "The build-vpc-link-builder function updates a VpcLink$Builder instance using the provided configuration.
  The function takes the VpcLink$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcLinkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-link-name` |
"
  [^VpcLink$Builder builder id config]
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-link-name)]
    (. builder vpcLinkName data))
  (.build builder))


(defn build-vpc-link-props-builder
  "The build-vpc-link-props-builder function updates a VpcLinkProps$Builder instance using the provided configuration.
  The function takes the VpcLinkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcLinkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-link-name` |
"
  [^VpcLinkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-link-name)]
    (. builder vpcLinkName data))
  (.build builder))


(defn build-web-socket-api-attributes-builder
  "The build-web-socket-api-attributes-builder function updates a WebSocketApiAttributes$Builder instance using the provided configuration.
  The function takes the WebSocketApiAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-endpoint` |
| `webSocketId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-socket-id` |
"
  [^WebSocketApiAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :api-endpoint)]
    (. builder apiEndpoint data))
  (when-let [data (lookup-entry config id :web-socket-id)]
    (. builder webSocketId data))
  (.build builder))


(defn build-web-socket-api-builder
  "The build-web-socket-api-builder function updates a WebSocketApi$Builder instance using the provided configuration.
  The function takes the WebSocketApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySelectionExpression` | software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression | [[cdk.support/lookup-entry]] | `:api-key-selection-expression` |
| `apiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-name` |
| `connectRouteOptions` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions | [[cdk.support/lookup-entry]] | `:connect-route-options` |
| `defaultRouteOptions` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions | [[cdk.support/lookup-entry]] | `:default-route-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disconnectRouteOptions` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions | [[cdk.support/lookup-entry]] | `:disconnect-route-options` |
| `routeSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-selection-expression` |
"
  [^WebSocketApi$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-selection-expression)]
    (. builder apiKeySelectionExpression data))
  (when-let [data (lookup-entry config id :api-name)]
    (. builder apiName data))
  (when-let [data (lookup-entry config id :connect-route-options)]
    (. builder connectRouteOptions data))
  (when-let [data (lookup-entry config id :default-route-options)]
    (. builder defaultRouteOptions data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disconnect-route-options)]
    (. builder disconnectRouteOptions data))
  (when-let [data (lookup-entry config id :route-selection-expression)]
    (. builder routeSelectionExpression data))
  (.build builder))


(defn build-web-socket-api-props-builder
  "The build-web-socket-api-props-builder function updates a WebSocketApiProps$Builder instance using the provided configuration.
  The function takes the WebSocketApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeySelectionExpression` | software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression | [[cdk.support/lookup-entry]] | `:api-key-selection-expression` |
| `apiName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-name` |
| `connectRouteOptions` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions | [[cdk.support/lookup-entry]] | `:connect-route-options` |
| `defaultRouteOptions` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions | [[cdk.support/lookup-entry]] | `:default-route-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disconnectRouteOptions` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions | [[cdk.support/lookup-entry]] | `:disconnect-route-options` |
| `routeSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-selection-expression` |
"
  [^WebSocketApiProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-selection-expression)]
    (. builder apiKeySelectionExpression data))
  (when-let [data (lookup-entry config id :api-name)]
    (. builder apiName data))
  (when-let [data (lookup-entry config id :connect-route-options)]
    (. builder connectRouteOptions data))
  (when-let [data (lookup-entry config id :default-route-options)]
    (. builder defaultRouteOptions data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disconnect-route-options)]
    (. builder disconnectRouteOptions data))
  (when-let [data (lookup-entry config id :route-selection-expression)]
    (. builder routeSelectionExpression data))
  (.build builder))


(defn build-web-socket-authorizer-attributes-builder
  "The build-web-socket-authorizer-attributes-builder function updates a WebSocketAuthorizerAttributes$Builder instance using the provided configuration.
  The function takes the WebSocketAuthorizerAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
| `authorizerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-type` |
"
  [^WebSocketAuthorizerAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-id)]
    (. builder authorizerId data))
  (when-let [data (lookup-entry config id :authorizer-type)]
    (. builder authorizerType data))
  (.build builder))


(defn build-web-socket-authorizer-builder
  "The build-web-socket-authorizer-builder function updates a WebSocketAuthorizer$Builder instance using the provided configuration.
  The function takes the WebSocketAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `type` | software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType | [[cdk.api.services.apigatewayv2/web-socket-authorizer-type]] | `:type` |
| `webSocketApi` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:web-socket-api` |
"
  [^WebSocketAuthorizer$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :authorizer-uri)]
    (. builder authorizerUri data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (web-socket-authorizer-type config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :web-socket-api)]
    (. builder webSocketApi data))
  (.build builder))


(defn build-web-socket-authorizer-props-builder
  "The build-web-socket-authorizer-props-builder function updates a WebSocketAuthorizerProps$Builder instance using the provided configuration.
  The function takes the WebSocketAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `type` | software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerType | [[cdk.api.services.apigatewayv2/web-socket-authorizer-type]] | `:type` |
| `webSocketApi` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:web-socket-api` |
"
  [^WebSocketAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :authorizer-uri)]
    (. builder authorizerUri data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (web-socket-authorizer-type config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :web-socket-api)]
    (. builder webSocketApi data))
  (.build builder))


(defn build-web-socket-integration-builder
  "The build-web-socket-integration-builder function updates a WebSocketIntegration$Builder instance using the provided configuration.
  The function takes the WebSocketIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-method` |
| `integrationType` | software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType | [[cdk.api.services.apigatewayv2/web-socket-integration-type]] | `:integration-type` |
| `integrationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-uri` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior | [[cdk.api.services.apigatewayv2/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `webSocketApi` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:web-socket-api` |
"
  [^WebSocketIntegration$Builder builder id config]
  (when-let [data (content-handling config id :content-handling)]
    (. builder contentHandling data))
  (when-let [data (lookup-entry config id :credentials-role)]
    (. builder credentialsRole data))
  (when-let [data (lookup-entry config id :integration-method)]
    (. builder integrationMethod data))
  (when-let [data (web-socket-integration-type config id :integration-type)]
    (. builder integrationType data))
  (when-let [data (lookup-entry config id :integration-uri)]
    (. builder integrationUri data))
  (when-let [data (passthrough-behavior config id :passthrough-behavior)]
    (. builder passthroughBehavior data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :request-templates)]
    (. builder requestTemplates data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :web-socket-api)]
    (. builder webSocketApi data))
  (.build builder))


(defn build-web-socket-integration-props-builder
  "The build-web-socket-integration-props-builder function updates a WebSocketIntegrationProps$Builder instance using the provided configuration.
  The function takes the WebSocketIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `integrationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-method` |
| `integrationType` | software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType | [[cdk.api.services.apigatewayv2/web-socket-integration-type]] | `:integration-type` |
| `integrationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-uri` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior | [[cdk.api.services.apigatewayv2/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `webSocketApi` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:web-socket-api` |
"
  [^WebSocketIntegrationProps$Builder builder id config]
  (when-let [data (content-handling config id :content-handling)]
    (. builder contentHandling data))
  (when-let [data (lookup-entry config id :credentials-role)]
    (. builder credentialsRole data))
  (when-let [data (lookup-entry config id :integration-method)]
    (. builder integrationMethod data))
  (when-let [data (web-socket-integration-type config id :integration-type)]
    (. builder integrationType data))
  (when-let [data (lookup-entry config id :integration-uri)]
    (. builder integrationUri data))
  (when-let [data (passthrough-behavior config id :passthrough-behavior)]
    (. builder passthroughBehavior data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :request-templates)]
    (. builder requestTemplates data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :web-socket-api)]
    (. builder webSocketApi data))
  (.build builder))


(defn build-web-socket-route-authorizer-bind-options-builder
  "The build-web-socket-route-authorizer-bind-options-builder function updates a WebSocketRouteAuthorizerBindOptions$Builder instance using the provided configuration.
  The function takes the WebSocketRouteAuthorizerBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `route` | software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute | [[cdk.support/lookup-entry]] | `:route` |
| `scope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^WebSocketRouteAuthorizerBindOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :route)]
    (. builder route data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn build-web-socket-route-authorizer-config-builder
  "The build-web-socket-route-authorizer-config-builder function updates a WebSocketRouteAuthorizerConfig$Builder instance using the provided configuration.
  The function takes the WebSocketRouteAuthorizerConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `authorizerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-id` |
"
  [^WebSocketRouteAuthorizerConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :authorizer-id)]
    (. builder authorizerId data))
  (.build builder))


(defn build-web-socket-route-builder
  "The build-web-socket-route-builder function updates a WebSocketRoute$Builder instance using the provided configuration.
  The function takes the WebSocketRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizer` | software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer | [[cdk.support/lookup-entry]] | `:authorizer` |
| `integration` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration | [[cdk.support/lookup-entry]] | `:integration` |
| `returnResponse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-response` |
| `routeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-key` |
| `webSocketApi` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:web-socket-api` |
"
  [^WebSocketRoute$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-required)]
    (. builder apiKeyRequired data))
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :return-response)]
    (. builder returnResponse data))
  (when-let [data (lookup-entry config id :route-key)]
    (. builder routeKey data))
  (when-let [data (lookup-entry config id :web-socket-api)]
    (. builder webSocketApi data))
  (.build builder))


(defn build-web-socket-route-integration-bind-options-builder
  "The build-web-socket-route-integration-bind-options-builder function updates a WebSocketRouteIntegrationBindOptions$Builder instance using the provided configuration.
  The function takes the WebSocketRouteIntegrationBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `route` | software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute | [[cdk.support/lookup-entry]] | `:route` |
| `scope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^WebSocketRouteIntegrationBindOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :route)]
    (. builder route data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn build-web-socket-route-integration-config-builder
  "The build-web-socket-route-integration-config-builder function updates a WebSocketRouteIntegrationConfig$Builder instance using the provided configuration.
  The function takes the WebSocketRouteIntegrationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentHandling` | software.amazon.awscdk.services.apigatewayv2.ContentHandling | [[cdk.api.services.apigatewayv2/content-handling]] | `:content-handling` |
| `credentialsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:credentials-role` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `passthroughBehavior` | software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior | [[cdk.api.services.apigatewayv2/passthrough-behavior]] | `:passthrough-behavior` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestTemplates` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-templates` |
| `templateSelectionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-selection-expression` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `type` | software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType | [[cdk.api.services.apigatewayv2/web-socket-integration-type]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^WebSocketRouteIntegrationConfig$Builder builder id config]
  (when-let [data (content-handling config id :content-handling)]
    (. builder contentHandling data))
  (when-let [data (lookup-entry config id :credentials-role)]
    (. builder credentialsRole data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (passthrough-behavior config id :passthrough-behavior)]
    (. builder passthroughBehavior data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :request-templates)]
    (. builder requestTemplates data))
  (when-let [data (lookup-entry config id :template-selection-expression)]
    (. builder templateSelectionExpression data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (web-socket-integration-type config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn build-web-socket-route-options-builder
  "The build-web-socket-route-options-builder function updates a WebSocketRouteOptions$Builder instance using the provided configuration.
  The function takes the WebSocketRouteOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizer` | software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer | [[cdk.support/lookup-entry]] | `:authorizer` |
| `integration` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration | [[cdk.support/lookup-entry]] | `:integration` |
| `returnResponse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-response` |
"
  [^WebSocketRouteOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :return-response)]
    (. builder returnResponse data))
  (.build builder))


(defn build-web-socket-route-props-builder
  "The build-web-socket-route-props-builder function updates a WebSocketRouteProps$Builder instance using the provided configuration.
  The function takes the WebSocketRouteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizer` | software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer | [[cdk.support/lookup-entry]] | `:authorizer` |
| `integration` | software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration | [[cdk.support/lookup-entry]] | `:integration` |
| `returnResponse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-response` |
| `routeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-key` |
| `webSocketApi` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:web-socket-api` |
"
  [^WebSocketRouteProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-required)]
    (. builder apiKeyRequired data))
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-let [data (lookup-entry config id :integration)]
    (. builder integration data))
  (when-let [data (lookup-entry config id :return-response)]
    (. builder returnResponse data))
  (when-let [data (lookup-entry config id :route-key)]
    (. builder routeKey data))
  (when-let [data (lookup-entry config id :web-socket-api)]
    (. builder webSocketApi data))
  (.build builder))


(defn build-web-socket-stage-attributes-builder
  "The build-web-socket-stage-attributes-builder function updates a WebSocketStageAttributes$Builder instance using the provided configuration.
  The function takes the WebSocketStageAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:api` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^WebSocketStageAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn build-web-socket-stage-builder
  "The build-web-socket-stage-builder function updates a WebSocketStage$Builder instance using the provided configuration.
  The function takes the WebSocketStage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `domainMapping` | software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions | [[cdk.support/lookup-entry]] | `:domain-mapping` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `throttle` | software.amazon.awscdk.services.apigatewayv2.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
| `webSocketApi` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:web-socket-api` |
"
  [^WebSocketStage$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :domain-mapping)]
    (. builder domainMapping data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (when-let [data (lookup-entry config id :web-socket-api)]
    (. builder webSocketApi data))
  (.build builder))


(defn build-web-socket-stage-props-builder
  "The build-web-socket-stage-props-builder function updates a WebSocketStageProps$Builder instance using the provided configuration.
  The function takes the WebSocketStageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-deploy` |
| `domainMapping` | software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions | [[cdk.support/lookup-entry]] | `:domain-mapping` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `throttle` | software.amazon.awscdk.services.apigatewayv2.ThrottleSettings | [[cdk.support/lookup-entry]] | `:throttle` |
| `webSocketApi` | software.amazon.awscdk.services.apigatewayv2.IWebSocketApi | [[cdk.support/lookup-entry]] | `:web-socket-api` |
"
  [^WebSocketStageProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-deploy)]
    (. builder autoDeploy data))
  (when-let [data (lookup-entry config id :domain-mapping)]
    (. builder domainMapping data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :throttle)]
    (. builder throttle data))
  (when-let [data (lookup-entry config id :web-socket-api)]
    (. builder webSocketApi data))
  (.build builder))