(ns cdk.api.services.events
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.events package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.events ApiDestination$Builder
                                                   ApiDestinationAttributes$Builder
                                                   ApiDestinationProps$Builder
                                                   Archive$Builder
                                                   ArchiveProps$Builder
                                                   BaseArchiveProps$Builder
                                                   CfnApiDestination$Builder
                                                   CfnApiDestinationProps$Builder
                                                   CfnArchive$Builder
                                                   CfnArchiveProps$Builder
                                                   CfnConnection$ApiKeyAuthParametersProperty$Builder
                                                   CfnConnection$AuthParametersProperty$Builder
                                                   CfnConnection$BasicAuthParametersProperty$Builder
                                                   CfnConnection$Builder
                                                   CfnConnection$ClientParametersProperty$Builder
                                                   CfnConnection$ConnectionHttpParametersProperty$Builder
                                                   CfnConnection$OAuthParametersProperty$Builder
                                                   CfnConnection$ParameterProperty$Builder
                                                   CfnConnectionProps$Builder
                                                   CfnEndpoint$Builder
                                                   CfnEndpoint$EndpointEventBusProperty$Builder
                                                   CfnEndpoint$FailoverConfigProperty$Builder
                                                   CfnEndpoint$PrimaryProperty$Builder
                                                   CfnEndpoint$ReplicationConfigProperty$Builder
                                                   CfnEndpoint$RoutingConfigProperty$Builder
                                                   CfnEndpoint$SecondaryProperty$Builder
                                                   CfnEndpointProps$Builder
                                                   CfnEventBus$Builder
                                                   CfnEventBus$DeadLetterConfigProperty$Builder
                                                   CfnEventBusPolicy$Builder
                                                   CfnEventBusPolicy$ConditionProperty$Builder
                                                   CfnEventBusPolicyProps$Builder
                                                   CfnEventBusProps$Builder
                                                   CfnRule$AppSyncParametersProperty$Builder
                                                   CfnRule$AwsVpcConfigurationProperty$Builder
                                                   CfnRule$BatchArrayPropertiesProperty$Builder
                                                   CfnRule$BatchParametersProperty$Builder
                                                   CfnRule$BatchRetryStrategyProperty$Builder
                                                   CfnRule$Builder
                                                   CfnRule$CapacityProviderStrategyItemProperty$Builder
                                                   CfnRule$DeadLetterConfigProperty$Builder
                                                   CfnRule$EcsParametersProperty$Builder
                                                   CfnRule$HttpParametersProperty$Builder
                                                   CfnRule$InputTransformerProperty$Builder
                                                   CfnRule$KinesisParametersProperty$Builder
                                                   CfnRule$NetworkConfigurationProperty$Builder
                                                   CfnRule$PlacementConstraintProperty$Builder
                                                   CfnRule$PlacementStrategyProperty$Builder
                                                   CfnRule$RedshiftDataParametersProperty$Builder
                                                   CfnRule$RetryPolicyProperty$Builder
                                                   CfnRule$RunCommandParametersProperty$Builder
                                                   CfnRule$RunCommandTargetProperty$Builder
                                                   CfnRule$SageMakerPipelineParameterProperty$Builder
                                                   CfnRule$SageMakerPipelineParametersProperty$Builder
                                                   CfnRule$SqsParametersProperty$Builder
                                                   CfnRule$TagProperty$Builder
                                                   CfnRule$TargetProperty$Builder
                                                   CfnRuleProps$Builder
                                                   Connection$Builder
                                                   ConnectionAttributes$Builder
                                                   ConnectionProps$Builder
                                                   CronOptions$Builder
                                                   EventBus$Builder
                                                   EventBusAttributes$Builder
                                                   EventBusPolicy$Builder
                                                   EventBusPolicyProps$Builder
                                                   EventBusProps$Builder
                                                   EventCommonOptions$Builder
                                                   EventPattern$Builder
                                                   HttpMethod
                                                   OAuthAuthorizationProps$Builder
                                                   OnEventOptions$Builder
                                                   Rule$Builder
                                                   RuleProps$Builder
                                                   RuleTargetConfig$Builder
                                                   RuleTargetInputProperties$Builder]))


(defn http-method
  "The `http-method` function data interprets values in the provided config data into a 
`HttpMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpMethod` - the value is returned.
* is `:get` - `HttpMethod/GET` is returned
* is `:patch` - `HttpMethod/PATCH` is returned
* is `:put` - `HttpMethod/PUT` is returned
* is `:post` - `HttpMethod/POST` is returned
* is `:head` - `HttpMethod/HEAD` is returned
* is `:delete` - `HttpMethod/DELETE` is returned
* is `:options` - `HttpMethod/OPTIONS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpMethod data) data
      (= :get data) HttpMethod/GET
      (= :patch data) HttpMethod/PATCH
      (= :put data) HttpMethod/PUT
      (= :post data) HttpMethod/POST
      (= :head data) HttpMethod/HEAD
      (= :delete data) HttpMethod/DELETE
      (= :options data) HttpMethod/OPTIONS)))


(defn api-destination-attributes-builder
  "The api-destination-attributes-builder function buildes out new instances of 
ApiDestinationAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiDestinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-destination-arn` |
| `connection` | software.amazon.awscdk.services.events.IConnection | [[cdk.support/lookup-entry]] | `:connection` |"
  [stack id config]
  (let [builder (ApiDestinationAttributes$Builder.)]
    (when-let [data (lookup-entry config id :api-destination-arn)]
      (. builder apiDestinationArn data))
    (when-let [data (lookup-entry config id :connection)]
      (. builder connection data))
    (.build builder)))


(defn api-destination-builder
  "The api-destination-builder function buildes out new instances of 
ApiDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-destination-name` |
| `connection` | software.amazon.awscdk.services.events.IConnection | [[cdk.support/lookup-entry]] | `:connection` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `httpMethod` | software.amazon.awscdk.services.events.HttpMethod | [[cdk.api.services.events/http-method]] | `:http-method` |
| `rateLimitPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit-per-second` |"
  [stack id config]
  (let [builder (ApiDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-destination-name)]
      (. builder apiDestinationName data))
    (when-let [data (lookup-entry config id :connection)]
      (. builder connection data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (http-method config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :rate-limit-per-second)]
      (. builder rateLimitPerSecond data))
    (.build builder)))


(defn api-destination-props-builder
  "The api-destination-props-builder function buildes out new instances of 
ApiDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-destination-name` |
| `connection` | software.amazon.awscdk.services.events.IConnection | [[cdk.support/lookup-entry]] | `:connection` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `httpMethod` | software.amazon.awscdk.services.events.HttpMethod | [[cdk.api.services.events/http-method]] | `:http-method` |
| `rateLimitPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit-per-second` |"
  [stack id config]
  (let [builder (ApiDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :api-destination-name)]
      (. builder apiDestinationName data))
    (when-let [data (lookup-entry config id :connection)]
      (. builder connection data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (http-method config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :rate-limit-per-second)]
      (. builder rateLimitPerSecond data))
    (.build builder)))


(defn archive-builder
  "The archive-builder function buildes out new instances of 
Archive$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |
| `sourceEventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:source-event-bus` |"
  [stack id config]
  (let [builder (Archive$Builder/create stack id)]
    (when-let [data (lookup-entry config id :archive-name)]
      (. builder archiveName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :retention)]
      (. builder retention data))
    (when-let [data (lookup-entry config id :source-event-bus)]
      (. builder sourceEventBus data))
    (.build builder)))


(defn archive-props-builder
  "The archive-props-builder function buildes out new instances of 
ArchiveProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |
| `sourceEventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:source-event-bus` |"
  [stack id config]
  (let [builder (ArchiveProps$Builder.)]
    (when-let [data (lookup-entry config id :archive-name)]
      (. builder archiveName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :retention)]
      (. builder retention data))
    (when-let [data (lookup-entry config id :source-event-bus)]
      (. builder sourceEventBus data))
    (.build builder)))


(defn base-archive-props-builder
  "The base-archive-props-builder function buildes out new instances of 
BaseArchiveProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |"
  [stack id config]
  (let [builder (BaseArchiveProps$Builder.)]
    (when-let [data (lookup-entry config id :archive-name)]
      (. builder archiveName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :retention)]
      (. builder retention data))
    (.build builder)))


(defn cfn-api-destination-builder
  "The cfn-api-destination-builder function buildes out new instances of 
CfnApiDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `invocationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-endpoint` |
| `invocationRateLimitPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:invocation-rate-limit-per-second` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnApiDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :invocation-endpoint)]
      (. builder invocationEndpoint data))
    (when-let [data (lookup-entry config id :invocation-rate-limit-per-second)]
      (. builder invocationRateLimitPerSecond data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-api-destination-props-builder
  "The cfn-api-destination-props-builder function buildes out new instances of 
CfnApiDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `invocationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-endpoint` |
| `invocationRateLimitPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:invocation-rate-limit-per-second` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnApiDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :invocation-endpoint)]
      (. builder invocationEndpoint data))
    (when-let [data (lookup-entry config id :invocation-rate-limit-per-second)]
      (. builder invocationRateLimitPerSecond data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-archive-builder
  "The cfn-archive-builder function buildes out new instances of 
CfnArchive$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-days` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |"
  [stack id config]
  (let [builder (CfnArchive$Builder/create stack id)]
    (when-let [data (lookup-entry config id :archive-name)]
      (. builder archiveName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :retention-days)]
      (. builder retentionDays data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (.build builder)))


(defn cfn-archive-props-builder
  "The cfn-archive-props-builder function buildes out new instances of 
CfnArchiveProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-days` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |"
  [stack id config]
  (let [builder (CfnArchiveProps$Builder.)]
    (when-let [data (lookup-entry config id :archive-name)]
      (. builder archiveName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :retention-days)]
      (. builder retentionDays data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (.build builder)))


(defn cfn-connection-api-key-auth-parameters-property-builder
  "The cfn-connection-api-key-auth-parameters-property-builder function buildes out new instances of 
CfnConnection$ApiKeyAuthParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-name` |
| `apiKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-value` |"
  [stack id config]
  (let [builder (CfnConnection$ApiKeyAuthParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-key-name)]
      (. builder apiKeyName data))
    (when-let [data (lookup-entry config id :api-key-value)]
      (. builder apiKeyValue data))
    (.build builder)))


(defn cfn-connection-auth-parameters-property-builder
  "The cfn-connection-auth-parameters-property-builder function buildes out new instances of 
CfnConnection$AuthParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyAuthParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key-auth-parameters` |
| `basicAuthParameters` | software.amazon.awscdk.services.events.CfnConnection$BasicAuthParametersProperty | [[cdk.support/lookup-entry]] | `:basic-auth-parameters` |
| `invocationHttpParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invocation-http-parameters` |
| `oAuthParameters` | software.amazon.awscdk.services.events.CfnConnection$OAuthParametersProperty | [[cdk.support/lookup-entry]] | `:o-auth-parameters` |"
  [stack id config]
  (let [builder (CfnConnection$AuthParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-key-auth-parameters)]
      (. builder apiKeyAuthParameters data))
    (when-let [data (lookup-entry config id :basic-auth-parameters)]
      (. builder basicAuthParameters data))
    (when-let [data (lookup-entry config id :invocation-http-parameters)]
      (. builder invocationHttpParameters data))
    (when-let [data (lookup-entry config id :o-auth-parameters)]
      (. builder oAuthParameters data))
    (.build builder)))


(defn cfn-connection-basic-auth-parameters-property-builder
  "The cfn-connection-basic-auth-parameters-property-builder function buildes out new instances of 
CfnConnection$BasicAuthParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnConnection$BasicAuthParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-connection-builder
  "The cfn-connection-builder function buildes out new instances of 
CfnConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth-parameters` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auth-parameters)]
      (. builder authParameters data))
    (when-let [data (lookup-entry config id :authorization-type)]
      (. builder authorizationType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-connection-client-parameters-property-builder
  "The cfn-connection-client-parameters-property-builder function buildes out new instances of 
CfnConnection$ClientParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |"
  [stack id config]
  (let [builder (CfnConnection$ClientParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (.build builder)))


(defn cfn-connection-connection-http-parameters-property-builder
  "The cfn-connection-connection-http-parameters-property-builder function buildes out new instances of 
CfnConnection$ConnectionHttpParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bodyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:body-parameters` |
| `headerParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `queryStringParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-string-parameters` |"
  [stack id config]
  (let [builder (CfnConnection$ConnectionHttpParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :body-parameters)]
      (. builder bodyParameters data))
    (when-let [data (lookup-entry config id :header-parameters)]
      (. builder headerParameters data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (.build builder)))


(defn cfn-connection-o-auth-parameters-property-builder
  "The cfn-connection-o-auth-parameters-property-builder function buildes out new instances of 
CfnConnection$OAuthParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-endpoint` |
| `clientParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-parameters` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `oAuthHttpParameters` | software.amazon.awscdk.services.events.CfnConnection$ConnectionHttpParametersProperty | [[cdk.support/lookup-entry]] | `:o-auth-http-parameters` |"
  [stack id config]
  (let [builder (CfnConnection$OAuthParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-endpoint)]
      (. builder authorizationEndpoint data))
    (when-let [data (lookup-entry config id :client-parameters)]
      (. builder clientParameters data))
    (when-let [data (lookup-entry config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :o-auth-http-parameters)]
      (. builder oAuthHttpParameters data))
    (.build builder)))


(defn cfn-connection-parameter-property-builder
  "The cfn-connection-parameter-property-builder function buildes out new instances of 
CfnConnection$ParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isValueSecret` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-value-secret` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnConnection$ParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-value-secret)]
      (. builder isValueSecret data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-connection-props-builder
  "The cfn-connection-props-builder function buildes out new instances of 
CfnConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth-parameters` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :auth-parameters)]
      (. builder authParameters data))
    (when-let [data (lookup-entry config id :authorization-type)]
      (. builder authorizationType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-endpoint-builder
  "The cfn-endpoint-builder function buildes out new instances of 
CfnEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBuses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-buses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicationConfig` | software.amazon.awscdk.services.events.CfnEndpoint$ReplicationConfigProperty | [[cdk.support/lookup-entry]] | `:replication-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `routingConfig` | software.amazon.awscdk.services.events.CfnEndpoint$RoutingConfigProperty | [[cdk.support/lookup-entry]] | `:routing-config` |"
  [stack id config]
  (let [builder (CfnEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-buses)]
      (. builder eventBuses data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :replication-config)]
      (. builder replicationConfig data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :routing-config)]
      (. builder routingConfig data))
    (.build builder)))


(defn cfn-endpoint-endpoint-event-bus-property-builder
  "The cfn-endpoint-endpoint-event-bus-property-builder function buildes out new instances of 
CfnEndpoint$EndpointEventBusProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-arn` |"
  [stack id config]
  (let [builder (CfnEndpoint$EndpointEventBusProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-bus-arn)]
      (. builder eventBusArn data))
    (.build builder)))


(defn cfn-endpoint-failover-config-property-builder
  "The cfn-endpoint-failover-config-property-builder function buildes out new instances of 
CfnEndpoint$FailoverConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primary` | software.amazon.awscdk.services.events.CfnEndpoint$PrimaryProperty | [[cdk.support/lookup-entry]] | `:primary` |
| `secondary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary` |"
  [stack id config]
  (let [builder (CfnEndpoint$FailoverConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :primary)]
      (. builder primary data))
    (when-let [data (lookup-entry config id :secondary)]
      (. builder secondary data))
    (.build builder)))


(defn cfn-endpoint-primary-property-builder
  "The cfn-endpoint-primary-property-builder function buildes out new instances of 
CfnEndpoint$PrimaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheck` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check` |"
  [stack id config]
  (let [builder (CfnEndpoint$PrimaryProperty$Builder.)]
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (.build builder)))


(defn cfn-endpoint-props-builder
  "The cfn-endpoint-props-builder function buildes out new instances of 
CfnEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBuses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-buses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicationConfig` | software.amazon.awscdk.services.events.CfnEndpoint$ReplicationConfigProperty | [[cdk.support/lookup-entry]] | `:replication-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `routingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-config` |"
  [stack id config]
  (let [builder (CfnEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-buses)]
      (. builder eventBuses data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :replication-config)]
      (. builder replicationConfig data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :routing-config)]
      (. builder routingConfig data))
    (.build builder)))


(defn cfn-endpoint-replication-config-property-builder
  "The cfn-endpoint-replication-config-property-builder function buildes out new instances of 
CfnEndpoint$ReplicationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnEndpoint$ReplicationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-endpoint-routing-config-property-builder
  "The cfn-endpoint-routing-config-property-builder function buildes out new instances of 
CfnEndpoint$RoutingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverConfig` | software.amazon.awscdk.services.events.CfnEndpoint$FailoverConfigProperty | [[cdk.support/lookup-entry]] | `:failover-config` |"
  [stack id config]
  (let [builder (CfnEndpoint$RoutingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :failover-config)]
      (. builder failoverConfig data))
    (.build builder)))


(defn cfn-endpoint-secondary-property-builder
  "The cfn-endpoint-secondary-property-builder function buildes out new instances of 
CfnEndpoint$SecondaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `route` | java.lang.String | [[cdk.support/lookup-entry]] | `:route` |"
  [stack id config]
  (let [builder (CfnEndpoint$SecondaryProperty$Builder.)]
    (when-let [data (lookup-entry config id :route)]
      (. builder route data))
    (.build builder)))


(defn cfn-event-bus-builder
  "The cfn-event-bus-builder function buildes out new instances of 
CfnEventBus$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterConfig` | software.amazon.awscdk.services.events.CfnEventBus$DeadLetterConfigProperty | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventBus$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dead-letter-config)]
      (. builder deadLetterConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-source-name)]
      (. builder eventSourceName data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-event-bus-dead-letter-config-property-builder
  "The cfn-event-bus-dead-letter-config-property-builder function buildes out new instances of 
CfnEventBus$DeadLetterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnEventBus$DeadLetterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-event-bus-policy-builder
  "The cfn-event-bus-policy-builder function buildes out new instances of 
CfnEventBusPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `condition` | software.amazon.awscdk.services.events.CfnEventBusPolicy$ConditionProperty | [[cdk.support/lookup-entry]] | `:condition` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `statement` | java.lang.Object | [[cdk.support/lookup-entry]] | `:statement` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |"
  [stack id config]
  (let [builder (CfnEventBusPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (when-let [data (lookup-entry config id :statement-id)]
      (. builder statementId data))
    (.build builder)))


(defn cfn-event-bus-policy-condition-property-builder
  "The cfn-event-bus-policy-condition-property-builder function buildes out new instances of 
CfnEventBusPolicy$ConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEventBusPolicy$ConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-event-bus-policy-props-builder
  "The cfn-event-bus-policy-props-builder function buildes out new instances of 
CfnEventBusPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `condition` | software.amazon.awscdk.services.events.CfnEventBusPolicy$ConditionProperty | [[cdk.support/lookup-entry]] | `:condition` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `statement` | java.lang.Object | [[cdk.support/lookup-entry]] | `:statement` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |"
  [stack id config]
  (let [builder (CfnEventBusPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (when-let [data (lookup-entry config id :statement-id)]
      (. builder statementId data))
    (.build builder)))


(defn cfn-event-bus-props-builder
  "The cfn-event-bus-props-builder function buildes out new instances of 
CfnEventBusProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventBusProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-config)]
      (. builder deadLetterConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-source-name)]
      (. builder eventSourceName data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-rule-app-sync-parameters-property-builder
  "The cfn-rule-app-sync-parameters-property-builder function buildes out new instances of 
CfnRule$AppSyncParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `graphQlOperation` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-ql-operation` |"
  [stack id config]
  (let [builder (CfnRule$AppSyncParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :graph-ql-operation)]
      (. builder graphQlOperation data))
    (.build builder)))


(defn cfn-rule-aws-vpc-configuration-property-builder
  "The cfn-rule-aws-vpc-configuration-property-builder function buildes out new instances of 
CfnRule$AwsVpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnRule$AwsVpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-rule-batch-array-properties-property-builder
  "The cfn-rule-batch-array-properties-property-builder function buildes out new instances of 
CfnRule$BatchArrayPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (CfnRule$BatchArrayPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (.build builder)))


(defn cfn-rule-batch-parameters-property-builder
  "The cfn-rule-batch-parameters-property-builder function buildes out new instances of 
CfnRule$BatchParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arrayProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:array-properties` |
| `jobDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `retryStrategy` | software.amazon.awscdk.services.events.CfnRule$BatchRetryStrategyProperty | [[cdk.support/lookup-entry]] | `:retry-strategy` |"
  [stack id config]
  (let [builder (CfnRule$BatchParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :array-properties)]
      (. builder arrayProperties data))
    (when-let [data (lookup-entry config id :job-definition)]
      (. builder jobDefinition data))
    (when-let [data (lookup-entry config id :job-name)]
      (. builder jobName data))
    (when-let [data (lookup-entry config id :retry-strategy)]
      (. builder retryStrategy data))
    (.build builder)))


(defn cfn-rule-batch-retry-strategy-property-builder
  "The cfn-rule-batch-retry-strategy-property-builder function buildes out new instances of 
CfnRule$BatchRetryStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |"
  [stack id config]
  (let [builder (CfnRule$BatchRetryStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :attempts)]
      (. builder attempts data))
    (.build builder)))


(defn cfn-rule-builder
  "The cfn-rule-builder function buildes out new instances of 
CfnRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventPattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-rule-capacity-provider-strategy-item-property-builder
  "The cfn-rule-capacity-provider-strategy-item-property-builder function buildes out new instances of 
CfnRule$CapacityProviderStrategyItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnRule$CapacityProviderStrategyItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :capacity-provider)]
      (. builder capacityProvider data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-rule-dead-letter-config-property-builder
  "The cfn-rule-dead-letter-config-property-builder function buildes out new instances of 
CfnRule$DeadLetterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnRule$DeadLetterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-rule-ecs-parameters-property-builder
  "The cfn-rule-ecs-parameters-property-builder function buildes out new instances of 
CfnRule$EcsParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity-provider-strategy` |
| `enableEcsManagedTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `group` | java.lang.String | [[cdk.support/lookup-entry]] | `:group` |
| `launchType` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-type` |
| `networkConfiguration` | software.amazon.awscdk.services.events.CfnRule$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
| `propagateTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `referenceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-id` |
| `tagList` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-list` |
| `taskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:task-count` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |"
  [stack id config]
  (let [builder (CfnRule$EcsParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategy)]
      (. builder capacityProviderStrategy data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :group)]
      (. builder group data))
    (when-let [data (lookup-entry config id :launch-type)]
      (. builder launchType data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (lookup-entry config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :reference-id)]
      (. builder referenceId data))
    (when-let [data (lookup-entry config id :tag-list)]
      (. builder tagList data))
    (when-let [data (lookup-entry config id :task-count)]
      (. builder taskCount data))
    (when-let [data (lookup-entry config id :task-definition-arn)]
      (. builder taskDefinitionArn data))
    (.build builder)))


(defn cfn-rule-http-parameters-property-builder
  "The cfn-rule-http-parameters-property-builder function buildes out new instances of 
CfnRule$HttpParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-string-parameters` |"
  [stack id config]
  (let [builder (CfnRule$HttpParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-parameters)]
      (. builder headerParameters data))
    (when-let [data (lookup-entry config id :path-parameter-values)]
      (. builder pathParameterValues data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (.build builder)))


(defn cfn-rule-input-transformer-property-builder
  "The cfn-rule-input-transformer-property-builder function buildes out new instances of 
CfnRule$InputTransformerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputPathsMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-paths-map` |
| `inputTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-template` |"
  [stack id config]
  (let [builder (CfnRule$InputTransformerProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-paths-map)]
      (. builder inputPathsMap data))
    (when-let [data (lookup-entry config id :input-template)]
      (. builder inputTemplate data))
    (.build builder)))


(defn cfn-rule-kinesis-parameters-property-builder
  "The cfn-rule-kinesis-parameters-property-builder function buildes out new instances of 
CfnRule$KinesisParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKeyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key-path` |"
  [stack id config]
  (let [builder (CfnRule$KinesisParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :partition-key-path)]
      (. builder partitionKeyPath data))
    (.build builder)))


(defn cfn-rule-network-configuration-property-builder
  "The cfn-rule-network-configuration-property-builder function buildes out new instances of 
CfnRule$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsVpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-vpc-configuration` |"
  [stack id config]
  (let [builder (CfnRule$NetworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-vpc-configuration)]
      (. builder awsVpcConfiguration data))
    (.build builder)))


(defn cfn-rule-placement-constraint-property-builder
  "The cfn-rule-placement-constraint-property-builder function buildes out new instances of 
CfnRule$PlacementConstraintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRule$PlacementConstraintProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-rule-placement-strategy-property-builder
  "The cfn-rule-placement-strategy-property-builder function buildes out new instances of 
CfnRule$PlacementStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRule$PlacementStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :field)]
      (. builder field data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-rule-props-builder
  "The cfn-rule-props-builder function buildes out new instances of 
CfnRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventPattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-rule-redshift-data-parameters-property-builder
  "The cfn-rule-redshift-data-parameters-property-builder function buildes out new instances of 
CfnRule$RedshiftDataParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `dbUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-user` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `sql` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql` |
| `sqls` | java.util.List | [[cdk.support/lookup-entry]] | `:sqls` |
| `statementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-name` |
| `withEvent` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:with-event` |"
  [stack id config]
  (let [builder (CfnRule$RedshiftDataParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :database)]
      (. builder database data))
    (when-let [data (lookup-entry config id :db-user)]
      (. builder dbUser data))
    (when-let [data (lookup-entry config id :secret-manager-arn)]
      (. builder secretManagerArn data))
    (when-let [data (lookup-entry config id :sql)]
      (. builder sql data))
    (when-let [data (lookup-entry config id :sqls)]
      (. builder sqls data))
    (when-let [data (lookup-entry config id :statement-name)]
      (. builder statementName data))
    (when-let [data (lookup-entry config id :with-event)]
      (. builder withEvent data))
    (.build builder)))


(defn cfn-rule-retry-policy-property-builder
  "The cfn-rule-retry-policy-property-builder function buildes out new instances of 
CfnRule$RetryPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |"
  [stack id config]
  (let [builder (CfnRule$RetryPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-event-age-in-seconds)]
      (. builder maximumEventAgeInSeconds data))
    (when-let [data (lookup-entry config id :maximum-retry-attempts)]
      (. builder maximumRetryAttempts data))
    (.build builder)))


(defn cfn-rule-run-command-parameters-property-builder
  "The cfn-rule-run-command-parameters-property-builder function buildes out new instances of 
CfnRule$RunCommandParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `runCommandTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:run-command-targets` |"
  [stack id config]
  (let [builder (CfnRule$RunCommandParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :run-command-targets)]
      (. builder runCommandTargets data))
    (.build builder)))


(defn cfn-rule-run-command-target-property-builder
  "The cfn-rule-run-command-target-property-builder function buildes out new instances of 
CfnRule$RunCommandTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnRule$RunCommandTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-rule-sage-maker-pipeline-parameter-property-builder
  "The cfn-rule-sage-maker-pipeline-parameter-property-builder function buildes out new instances of 
CfnRule$SageMakerPipelineParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRule$SageMakerPipelineParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-rule-sage-maker-pipeline-parameters-property-builder
  "The cfn-rule-sage-maker-pipeline-parameters-property-builder function buildes out new instances of 
CfnRule$SageMakerPipelineParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineParameterList` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-parameter-list` |"
  [stack id config]
  (let [builder (CfnRule$SageMakerPipelineParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :pipeline-parameter-list)]
      (. builder pipelineParameterList data))
    (.build builder)))


(defn cfn-rule-sqs-parameters-property-builder
  "The cfn-rule-sqs-parameters-property-builder function buildes out new instances of 
CfnRule$SqsParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |"
  [stack id config]
  (let [builder (CfnRule$SqsParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :message-group-id)]
      (. builder messageGroupId data))
    (.build builder)))


(defn cfn-rule-tag-property-builder
  "The cfn-rule-tag-property-builder function buildes out new instances of 
CfnRule$TagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRule$TagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-rule-target-property-builder
  "The cfn-rule-target-property-builder function buildes out new instances of 
CfnRule$TargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appSyncParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-sync-parameters` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `batchParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-parameters` |
| `deadLetterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `ecsParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ecs-parameters` |
| `httpParameters` | software.amazon.awscdk.services.events.CfnRule$HttpParametersProperty | [[cdk.support/lookup-entry]] | `:http-parameters` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `inputTransformer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-transformer` |
| `kinesisParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-parameters` |
| `redshiftDataParameters` | software.amazon.awscdk.services.events.CfnRule$RedshiftDataParametersProperty | [[cdk.support/lookup-entry]] | `:redshift-data-parameters` |
| `retryPolicy` | software.amazon.awscdk.services.events.CfnRule$RetryPolicyProperty | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `runCommandParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:run-command-parameters` |
| `sageMakerPipelineParameters` | software.amazon.awscdk.services.events.CfnRule$SageMakerPipelineParametersProperty | [[cdk.support/lookup-entry]] | `:sage-maker-pipeline-parameters` |
| `sqsParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-parameters` |"
  [stack id config]
  (let [builder (CfnRule$TargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-sync-parameters)]
      (. builder appSyncParameters data))
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :batch-parameters)]
      (. builder batchParameters data))
    (when-let [data (lookup-entry config id :dead-letter-config)]
      (. builder deadLetterConfig data))
    (when-let [data (lookup-entry config id :ecs-parameters)]
      (. builder ecsParameters data))
    (when-let [data (lookup-entry config id :http-parameters)]
      (. builder httpParameters data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :input-transformer)]
      (. builder inputTransformer data))
    (when-let [data (lookup-entry config id :kinesis-parameters)]
      (. builder kinesisParameters data))
    (when-let [data (lookup-entry config id :redshift-data-parameters)]
      (. builder redshiftDataParameters data))
    (when-let [data (lookup-entry config id :retry-policy)]
      (. builder retryPolicy data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :run-command-parameters)]
      (. builder runCommandParameters data))
    (when-let [data (lookup-entry config id :sage-maker-pipeline-parameters)]
      (. builder sageMakerPipelineParameters data))
    (when-let [data (lookup-entry config id :sqs-parameters)]
      (. builder sqsParameters data))
    (.build builder)))


(defn connection-attributes-builder
  "The connection-attributes-builder function buildes out new instances of 
ConnectionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `connectionSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-secret-arn` |"
  [stack id config]
  (let [builder (ConnectionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :connection-secret-arn)]
      (. builder connectionSecretArn data))
    (.build builder)))


(defn connection-builder
  "The connection-builder function buildes out new instances of 
Connection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.services.events.Authorization | [[cdk.support/lookup-entry]] | `:authorization` |
| `bodyParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:body-parameters` |
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |"
  [stack id config]
  (let [builder (Connection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authorization)]
      (. builder authorization data))
    (when-let [data (lookup-entry config id :body-parameters)]
      (. builder bodyParameters data))
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :header-parameters)]
      (. builder headerParameters data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (.build builder)))


(defn connection-props-builder
  "The connection-props-builder function buildes out new instances of 
ConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.services.events.Authorization | [[cdk.support/lookup-entry]] | `:authorization` |
| `bodyParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:body-parameters` |
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |"
  [stack id config]
  (let [builder (ConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :authorization)]
      (. builder authorization data))
    (when-let [data (lookup-entry config id :body-parameters)]
      (. builder bodyParameters data))
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :header-parameters)]
      (. builder headerParameters data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (.build builder)))


(defn cron-options-builder
  "The cron-options-builder function buildes out new instances of 
CronOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `hour` | java.lang.String | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.String | [[cdk.support/lookup-entry]] | `:minute` |
| `month` | java.lang.String | [[cdk.support/lookup-entry]] | `:month` |
| `weekDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:week-day` |
| `year` | java.lang.String | [[cdk.support/lookup-entry]] | `:year` |"
  [stack id config]
  (let [builder (CronOptions$Builder.)]
    (when-let [data (lookup-entry config id :day)]
      (. builder day data))
    (when-let [data (lookup-entry config id :hour)]
      (. builder hour data))
    (when-let [data (lookup-entry config id :minute)]
      (. builder minute data))
    (when-let [data (lookup-entry config id :month)]
      (. builder month data))
    (when-let [data (lookup-entry config id :week-day)]
      (. builder weekDay data))
    (when-let [data (lookup-entry config id :year)]
      (. builder year data))
    (.build builder)))


(defn event-bus-attributes-builder
  "The event-bus-attributes-builder function buildes out new instances of 
EventBusAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-arn` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventBusPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-policy` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |"
  [stack id config]
  (let [builder (EventBusAttributes$Builder.)]
    (when-let [data (lookup-entry config id :event-bus-arn)]
      (. builder eventBusArn data))
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :event-bus-policy)]
      (. builder eventBusPolicy data))
    (when-let [data (lookup-entry config id :event-source-name)]
      (. builder eventSourceName data))
    (.build builder)))


(defn event-bus-builder
  "The event-bus-builder function buildes out new instances of 
EventBus$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |"
  [stack id config]
  (let [builder (EventBus$Builder/create stack id)]
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :event-source-name)]
      (. builder eventSourceName data))
    (.build builder)))


(defn event-bus-policy-builder
  "The event-bus-policy-builder function buildes out new instances of 
EventBusPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `statement` | software.amazon.awscdk.services.iam.PolicyStatement | [[cdk.support/lookup-entry]] | `:statement` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |"
  [stack id config]
  (let [builder (EventBusPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :event-bus)]
      (. builder eventBus data))
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (when-let [data (lookup-entry config id :statement-id)]
      (. builder statementId data))
    (.build builder)))


(defn event-bus-policy-props-builder
  "The event-bus-policy-props-builder function buildes out new instances of 
EventBusPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `statement` | software.amazon.awscdk.services.iam.PolicyStatement | [[cdk.support/lookup-entry]] | `:statement` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |"
  [stack id config]
  (let [builder (EventBusPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :event-bus)]
      (. builder eventBus data))
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (when-let [data (lookup-entry config id :statement-id)]
      (. builder statementId data))
    (.build builder)))


(defn event-bus-props-builder
  "The event-bus-props-builder function buildes out new instances of 
EventBusProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |"
  [stack id config]
  (let [builder (EventBusProps$Builder.)]
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :event-source-name)]
      (. builder eventSourceName data))
    (.build builder)))


(defn event-common-options-builder
  "The event-common-options-builder function buildes out new instances of 
EventCommonOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |"
  [stack id config]
  (let [builder (EventCommonOptions$Builder.)]
    (when-let [data (lookup-entry config id :cross-stack-scope)]
      (. builder crossStackScope data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (.build builder)))


(defn event-pattern-builder
  "The event-pattern-builder function buildes out new instances of 
EventPattern$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.util.List | [[cdk.support/lookup-entry]] | `:account` |
| `detail` | java.util.Map | [[cdk.support/lookup-entry]] | `:detail` |
| `detailType` | java.util.List | [[cdk.support/lookup-entry]] | `:detail-type` |
| `id` | java.util.List | [[cdk.support/lookup-entry]] | `:id` |
| `region` | java.util.List | [[cdk.support/lookup-entry]] | `:region` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `source` | java.util.List | [[cdk.support/lookup-entry]] | `:source` |
| `time` | java.util.List | [[cdk.support/lookup-entry]] | `:time` |
| `version` | java.util.List | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (EventPattern$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :detail)]
      (. builder detail data))
    (when-let [data (lookup-entry config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :time)]
      (. builder time data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn o-auth-authorization-props-builder
  "The o-auth-authorization-props-builder function buildes out new instances of 
OAuthAuthorizationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-endpoint` |
| `bodyParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:body-parameters` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:client-secret` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `httpMethod` | software.amazon.awscdk.services.events.HttpMethod | [[cdk.api.services.events/http-method]] | `:http-method` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |"
  [stack id config]
  (let [builder (OAuthAuthorizationProps$Builder.)]
    (when-let [data (lookup-entry config id :authorization-endpoint)]
      (. builder authorizationEndpoint data))
    (when-let [data (lookup-entry config id :body-parameters)]
      (. builder bodyParameters data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :header-parameters)]
      (. builder headerParameters data))
    (when-let [data (http-method config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (.build builder)))


(defn on-event-options-builder
  "The on-event-options-builder function buildes out new instances of 
OnEventOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `target` | software.amazon.awscdk.services.events.IRuleTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (OnEventOptions$Builder.)]
    (when-let [data (lookup-entry config id :cross-stack-scope)]
      (. builder crossStackScope data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn rule-builder
  "The rule-builder function buildes out new instances of 
Rule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `schedule` | software.amazon.awscdk.services.events.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (Rule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cross-stack-scope)]
      (. builder crossStackScope data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event-bus)]
      (. builder eventBus data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn rule-props-builder
  "The rule-props-builder function buildes out new instances of 
RuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `schedule` | software.amazon.awscdk.services.events.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (RuleProps$Builder.)]
    (when-let [data (lookup-entry config id :cross-stack-scope)]
      (. builder crossStackScope data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event-bus)]
      (. builder eventBus data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn rule-target-config-builder
  "The rule-target-config-builder function buildes out new instances of 
RuleTargetConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appSyncParameters` | software.amazon.awscdk.services.events.CfnRule$AppSyncParametersProperty | [[cdk.support/lookup-entry]] | `:app-sync-parameters` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `batchParameters` | software.amazon.awscdk.services.events.CfnRule$BatchParametersProperty | [[cdk.support/lookup-entry]] | `:batch-parameters` |
| `deadLetterConfig` | software.amazon.awscdk.services.events.CfnRule$DeadLetterConfigProperty | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `ecsParameters` | software.amazon.awscdk.services.events.CfnRule$EcsParametersProperty | [[cdk.support/lookup-entry]] | `:ecs-parameters` |
| `httpParameters` | software.amazon.awscdk.services.events.CfnRule$HttpParametersProperty | [[cdk.support/lookup-entry]] | `:http-parameters` |
| `input` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:input` |
| `kinesisParameters` | software.amazon.awscdk.services.events.CfnRule$KinesisParametersProperty | [[cdk.support/lookup-entry]] | `:kinesis-parameters` |
| `retryPolicy` | software.amazon.awscdk.services.events.CfnRule$RetryPolicyProperty | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runCommandParameters` | software.amazon.awscdk.services.events.CfnRule$RunCommandParametersProperty | [[cdk.support/lookup-entry]] | `:run-command-parameters` |
| `sqsParameters` | software.amazon.awscdk.services.events.CfnRule$SqsParametersProperty | [[cdk.support/lookup-entry]] | `:sqs-parameters` |
| `targetResource` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:target-resource` |"
  [stack id config]
  (let [builder (RuleTargetConfig$Builder.)]
    (when-let [data (lookup-entry config id :app-sync-parameters)]
      (. builder appSyncParameters data))
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :batch-parameters)]
      (. builder batchParameters data))
    (when-let [data (lookup-entry config id :dead-letter-config)]
      (. builder deadLetterConfig data))
    (when-let [data (lookup-entry config id :ecs-parameters)]
      (. builder ecsParameters data))
    (when-let [data (lookup-entry config id :http-parameters)]
      (. builder httpParameters data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :kinesis-parameters)]
      (. builder kinesisParameters data))
    (when-let [data (lookup-entry config id :retry-policy)]
      (. builder retryPolicy data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-command-parameters)]
      (. builder runCommandParameters data))
    (when-let [data (lookup-entry config id :sqs-parameters)]
      (. builder sqsParameters data))
    (when-let [data (lookup-entry config id :target-resource)]
      (. builder targetResource data))
    (.build builder)))


(defn rule-target-input-properties-builder
  "The rule-target-input-properties-builder function buildes out new instances of 
RuleTargetInputProperties$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `inputPathsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-paths-map` |
| `inputTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-template` |"
  [stack id config]
  (let [builder (RuleTargetInputProperties$Builder.)]
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :input-paths-map)]
      (. builder inputPathsMap data))
    (when-let [data (lookup-entry config id :input-template)]
      (. builder inputTemplate data))
    (.build builder)))