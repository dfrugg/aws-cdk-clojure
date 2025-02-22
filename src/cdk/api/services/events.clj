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


(defn build-api-destination-attributes-builder
  "The build-api-destination-attributes-builder function updates a ApiDestinationAttributes$Builder instance using the provided configuration.
  The function takes the ApiDestinationAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiDestinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-destination-arn` |
| `connection` | software.amazon.awscdk.services.events.IConnection | [[cdk.support/lookup-entry]] | `:connection` |
"
  [^ApiDestinationAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :api-destination-arn)]
    (. builder apiDestinationArn data))
  (when-let [data (lookup-entry config id :connection)]
    (. builder connection data))
  (.build builder))


(defn build-api-destination-builder
  "The build-api-destination-builder function updates a ApiDestination$Builder instance using the provided configuration.
  The function takes the ApiDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-destination-name` |
| `connection` | software.amazon.awscdk.services.events.IConnection | [[cdk.support/lookup-entry]] | `:connection` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `httpMethod` | software.amazon.awscdk.services.events.HttpMethod | [[cdk.api.services.events/http-method]] | `:http-method` |
| `rateLimitPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit-per-second` |
"
  [^ApiDestination$Builder builder id config]
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
  (.build builder))


(defn build-api-destination-props-builder
  "The build-api-destination-props-builder function updates a ApiDestinationProps$Builder instance using the provided configuration.
  The function takes the ApiDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-destination-name` |
| `connection` | software.amazon.awscdk.services.events.IConnection | [[cdk.support/lookup-entry]] | `:connection` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `httpMethod` | software.amazon.awscdk.services.events.HttpMethod | [[cdk.api.services.events/http-method]] | `:http-method` |
| `rateLimitPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit-per-second` |
"
  [^ApiDestinationProps$Builder builder id config]
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
  (.build builder))


(defn build-archive-builder
  "The build-archive-builder function updates a Archive$Builder instance using the provided configuration.
  The function takes the Archive$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |
| `sourceEventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:source-event-bus` |
"
  [^Archive$Builder builder id config]
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
  (.build builder))


(defn build-archive-props-builder
  "The build-archive-props-builder function updates a ArchiveProps$Builder instance using the provided configuration.
  The function takes the ArchiveProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |
| `sourceEventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:source-event-bus` |
"
  [^ArchiveProps$Builder builder id config]
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
  (.build builder))


(defn build-base-archive-props-builder
  "The build-base-archive-props-builder function updates a BaseArchiveProps$Builder instance using the provided configuration.
  The function takes the BaseArchiveProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |
"
  [^BaseArchiveProps$Builder builder id config]
  (when-let [data (lookup-entry config id :archive-name)]
    (. builder archiveName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :event-pattern)]
    (. builder eventPattern data))
  (when-let [data (lookup-entry config id :retention)]
    (. builder retention data))
  (.build builder))


(defn build-cfn-api-destination-builder
  "The build-cfn-api-destination-builder function updates a CfnApiDestination$Builder instance using the provided configuration.
  The function takes the CfnApiDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `invocationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-endpoint` |
| `invocationRateLimitPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:invocation-rate-limit-per-second` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnApiDestination$Builder builder id config]
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
  (.build builder))


(defn build-cfn-api-destination-props-builder
  "The build-cfn-api-destination-props-builder function updates a CfnApiDestinationProps$Builder instance using the provided configuration.
  The function takes the CfnApiDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `invocationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-endpoint` |
| `invocationRateLimitPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:invocation-rate-limit-per-second` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnApiDestinationProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-archive-builder
  "The build-cfn-archive-builder function updates a CfnArchive$Builder instance using the provided configuration.
  The function takes the CfnArchive$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-days` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^CfnArchive$Builder builder id config]
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
  (.build builder))


(defn build-cfn-archive-props-builder
  "The build-cfn-archive-props-builder function updates a CfnArchiveProps$Builder instance using the provided configuration.
  The function takes the CfnArchiveProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveName` | java.lang.String | [[cdk.support/lookup-entry]] | `:archive-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `retentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-days` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^CfnArchiveProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-connection-api-key-auth-parameters-property-builder
  "The build-cfn-connection-api-key-auth-parameters-property-builder function updates a CfnConnection$ApiKeyAuthParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$ApiKeyAuthParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-name` |
| `apiKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key-value` |
"
  [^CfnConnection$ApiKeyAuthParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-name)]
    (. builder apiKeyName data))
  (when-let [data (lookup-entry config id :api-key-value)]
    (. builder apiKeyValue data))
  (.build builder))


(defn build-cfn-connection-auth-parameters-property-builder
  "The build-cfn-connection-auth-parameters-property-builder function updates a CfnConnection$AuthParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$AuthParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyAuthParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key-auth-parameters` |
| `basicAuthParameters` | software.amazon.awscdk.services.events.CfnConnection$BasicAuthParametersProperty | [[cdk.support/lookup-entry]] | `:basic-auth-parameters` |
| `invocationHttpParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invocation-http-parameters` |
| `oAuthParameters` | software.amazon.awscdk.services.events.CfnConnection$OAuthParametersProperty | [[cdk.support/lookup-entry]] | `:o-auth-parameters` |
"
  [^CfnConnection$AuthParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-auth-parameters)]
    (. builder apiKeyAuthParameters data))
  (when-let [data (lookup-entry config id :basic-auth-parameters)]
    (. builder basicAuthParameters data))
  (when-let [data (lookup-entry config id :invocation-http-parameters)]
    (. builder invocationHttpParameters data))
  (when-let [data (lookup-entry config id :o-auth-parameters)]
    (. builder oAuthParameters data))
  (.build builder))


(defn build-cfn-connection-basic-auth-parameters-property-builder
  "The build-cfn-connection-basic-auth-parameters-property-builder function updates a CfnConnection$BasicAuthParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$BasicAuthParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnConnection$BasicAuthParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :password)]
    (. builder password data))
  (when-let [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn build-cfn-connection-builder
  "The build-cfn-connection-builder function updates a CfnConnection$Builder instance using the provided configuration.
  The function takes the CfnConnection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth-parameters` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnConnection$Builder builder id config]
  (when-let [data (lookup-entry config id :auth-parameters)]
    (. builder authParameters data))
  (when-let [data (lookup-entry config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-connection-client-parameters-property-builder
  "The build-cfn-connection-client-parameters-property-builder function updates a CfnConnection$ClientParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$ClientParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
"
  [^CfnConnection$ClientParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-let [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (.build builder))


(defn build-cfn-connection-connection-http-parameters-property-builder
  "The build-cfn-connection-connection-http-parameters-property-builder function updates a CfnConnection$ConnectionHttpParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$ConnectionHttpParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bodyParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:body-parameters` |
| `headerParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `queryStringParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
"
  [^CfnConnection$ConnectionHttpParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :body-parameters)]
    (. builder bodyParameters data))
  (when-let [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-let [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (.build builder))


(defn build-cfn-connection-o-auth-parameters-property-builder
  "The build-cfn-connection-o-auth-parameters-property-builder function updates a CfnConnection$OAuthParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$OAuthParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-endpoint` |
| `clientParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-parameters` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `oAuthHttpParameters` | software.amazon.awscdk.services.events.CfnConnection$ConnectionHttpParametersProperty | [[cdk.support/lookup-entry]] | `:o-auth-http-parameters` |
"
  [^CfnConnection$OAuthParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-endpoint)]
    (. builder authorizationEndpoint data))
  (when-let [data (lookup-entry config id :client-parameters)]
    (. builder clientParameters data))
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :o-auth-http-parameters)]
    (. builder oAuthHttpParameters data))
  (.build builder))


(defn build-cfn-connection-parameter-property-builder
  "The build-cfn-connection-parameter-property-builder function updates a CfnConnection$ParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$ParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isValueSecret` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-value-secret` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnConnection$ParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-value-secret)]
    (. builder isValueSecret data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-connection-props-builder
  "The build-cfn-connection-props-builder function updates a CfnConnectionProps$Builder instance using the provided configuration.
  The function takes the CfnConnectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth-parameters` |
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnConnectionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auth-parameters)]
    (. builder authParameters data))
  (when-let [data (lookup-entry config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-endpoint-builder
  "The build-cfn-endpoint-builder function updates a CfnEndpoint$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBuses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-buses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicationConfig` | software.amazon.awscdk.services.events.CfnEndpoint$ReplicationConfigProperty | [[cdk.support/lookup-entry]] | `:replication-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `routingConfig` | software.amazon.awscdk.services.events.CfnEndpoint$RoutingConfigProperty | [[cdk.support/lookup-entry]] | `:routing-config` |
"
  [^CfnEndpoint$Builder builder id config]
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
  (.build builder))


(defn build-cfn-endpoint-endpoint-event-bus-property-builder
  "The build-cfn-endpoint-endpoint-event-bus-property-builder function updates a CfnEndpoint$EndpointEventBusProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$EndpointEventBusProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-arn` |
"
  [^CfnEndpoint$EndpointEventBusProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus-arn)]
    (. builder eventBusArn data))
  (.build builder))


(defn build-cfn-endpoint-failover-config-property-builder
  "The build-cfn-endpoint-failover-config-property-builder function updates a CfnEndpoint$FailoverConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$FailoverConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primary` | software.amazon.awscdk.services.events.CfnEndpoint$PrimaryProperty | [[cdk.support/lookup-entry]] | `:primary` |
| `secondary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary` |
"
  [^CfnEndpoint$FailoverConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :primary)]
    (. builder primary data))
  (when-let [data (lookup-entry config id :secondary)]
    (. builder secondary data))
  (.build builder))


(defn build-cfn-endpoint-primary-property-builder
  "The build-cfn-endpoint-primary-property-builder function updates a CfnEndpoint$PrimaryProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$PrimaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheck` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check` |
"
  [^CfnEndpoint$PrimaryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (.build builder))


(defn build-cfn-endpoint-props-builder
  "The build-cfn-endpoint-props-builder function updates a CfnEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBuses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-buses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicationConfig` | software.amazon.awscdk.services.events.CfnEndpoint$ReplicationConfigProperty | [[cdk.support/lookup-entry]] | `:replication-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `routingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-config` |
"
  [^CfnEndpointProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-endpoint-replication-config-property-builder
  "The build-cfn-endpoint-replication-config-property-builder function updates a CfnEndpoint$ReplicationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$ReplicationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnEndpoint$ReplicationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn build-cfn-endpoint-routing-config-property-builder
  "The build-cfn-endpoint-routing-config-property-builder function updates a CfnEndpoint$RoutingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$RoutingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverConfig` | software.amazon.awscdk.services.events.CfnEndpoint$FailoverConfigProperty | [[cdk.support/lookup-entry]] | `:failover-config` |
"
  [^CfnEndpoint$RoutingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failover-config)]
    (. builder failoverConfig data))
  (.build builder))


(defn build-cfn-endpoint-secondary-property-builder
  "The build-cfn-endpoint-secondary-property-builder function updates a CfnEndpoint$SecondaryProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$SecondaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `route` | java.lang.String | [[cdk.support/lookup-entry]] | `:route` |
"
  [^CfnEndpoint$SecondaryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :route)]
    (. builder route data))
  (.build builder))


(defn build-cfn-event-bus-builder
  "The build-cfn-event-bus-builder function updates a CfnEventBus$Builder instance using the provided configuration.
  The function takes the CfnEventBus$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterConfig` | software.amazon.awscdk.services.events.CfnEventBus$DeadLetterConfigProperty | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventBus$Builder builder id config]
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
  (.build builder))


(defn build-cfn-event-bus-dead-letter-config-property-builder
  "The build-cfn-event-bus-dead-letter-config-property-builder function updates a CfnEventBus$DeadLetterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEventBus$DeadLetterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnEventBus$DeadLetterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn build-cfn-event-bus-policy-builder
  "The build-cfn-event-bus-policy-builder function updates a CfnEventBusPolicy$Builder instance using the provided configuration.
  The function takes the CfnEventBusPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `condition` | software.amazon.awscdk.services.events.CfnEventBusPolicy$ConditionProperty | [[cdk.support/lookup-entry]] | `:condition` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `statement` | java.lang.Object | [[cdk.support/lookup-entry]] | `:statement` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |
"
  [^CfnEventBusPolicy$Builder builder id config]
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
  (.build builder))


(defn build-cfn-event-bus-policy-condition-property-builder
  "The build-cfn-event-bus-policy-condition-property-builder function updates a CfnEventBusPolicy$ConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnEventBusPolicy$ConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEventBusPolicy$ConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-event-bus-policy-props-builder
  "The build-cfn-event-bus-policy-props-builder function updates a CfnEventBusPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnEventBusPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `condition` | software.amazon.awscdk.services.events.CfnEventBusPolicy$ConditionProperty | [[cdk.support/lookup-entry]] | `:condition` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `statement` | java.lang.Object | [[cdk.support/lookup-entry]] | `:statement` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |
"
  [^CfnEventBusPolicyProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-event-bus-props-builder
  "The build-cfn-event-bus-props-builder function updates a CfnEventBusProps$Builder instance using the provided configuration.
  The function takes the CfnEventBusProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventBusProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-rule-app-sync-parameters-property-builder
  "The build-cfn-rule-app-sync-parameters-property-builder function updates a CfnRule$AppSyncParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$AppSyncParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `graphQlOperation` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-ql-operation` |
"
  [^CfnRule$AppSyncParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :graph-ql-operation)]
    (. builder graphQlOperation data))
  (.build builder))


(defn build-cfn-rule-aws-vpc-configuration-property-builder
  "The build-cfn-rule-aws-vpc-configuration-property-builder function updates a CfnRule$AwsVpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$AwsVpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnRule$AwsVpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn build-cfn-rule-batch-array-properties-property-builder
  "The build-cfn-rule-batch-array-properties-property-builder function updates a CfnRule$BatchArrayPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$BatchArrayPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^CfnRule$BatchArrayPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn build-cfn-rule-batch-parameters-property-builder
  "The build-cfn-rule-batch-parameters-property-builder function updates a CfnRule$BatchParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$BatchParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arrayProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:array-properties` |
| `jobDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `retryStrategy` | software.amazon.awscdk.services.events.CfnRule$BatchRetryStrategyProperty | [[cdk.support/lookup-entry]] | `:retry-strategy` |
"
  [^CfnRule$BatchParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :array-properties)]
    (. builder arrayProperties data))
  (when-let [data (lookup-entry config id :job-definition)]
    (. builder jobDefinition data))
  (when-let [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-let [data (lookup-entry config id :retry-strategy)]
    (. builder retryStrategy data))
  (.build builder))


(defn build-cfn-rule-batch-retry-strategy-property-builder
  "The build-cfn-rule-batch-retry-strategy-property-builder function updates a CfnRule$BatchRetryStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$BatchRetryStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
"
  [^CfnRule$BatchRetryStrategyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (.build builder))


(defn build-cfn-rule-builder
  "The build-cfn-rule-builder function updates a CfnRule$Builder instance using the provided configuration.
  The function takes the CfnRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventPattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnRule$Builder builder id config]
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
  (.build builder))


(defn build-cfn-rule-capacity-provider-strategy-item-property-builder
  "The build-cfn-rule-capacity-provider-strategy-item-property-builder function updates a CfnRule$CapacityProviderStrategyItemProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$CapacityProviderStrategyItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnRule$CapacityProviderStrategyItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base)]
    (. builder base data))
  (when-let [data (lookup-entry config id :capacity-provider)]
    (. builder capacityProvider data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn build-cfn-rule-dead-letter-config-property-builder
  "The build-cfn-rule-dead-letter-config-property-builder function updates a CfnRule$DeadLetterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$DeadLetterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnRule$DeadLetterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn build-cfn-rule-ecs-parameters-property-builder
  "The build-cfn-rule-ecs-parameters-property-builder function updates a CfnRule$EcsParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$EcsParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
"
  [^CfnRule$EcsParametersProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-rule-http-parameters-property-builder
  "The build-cfn-rule-http-parameters-property-builder function updates a CfnRule$HttpParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$HttpParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
"
  [^CfnRule$HttpParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-let [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-let [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (.build builder))


(defn build-cfn-rule-input-transformer-property-builder
  "The build-cfn-rule-input-transformer-property-builder function updates a CfnRule$InputTransformerProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$InputTransformerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputPathsMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-paths-map` |
| `inputTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-template` |
"
  [^CfnRule$InputTransformerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-paths-map)]
    (. builder inputPathsMap data))
  (when-let [data (lookup-entry config id :input-template)]
    (. builder inputTemplate data))
  (.build builder))


(defn build-cfn-rule-kinesis-parameters-property-builder
  "The build-cfn-rule-kinesis-parameters-property-builder function updates a CfnRule$KinesisParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$KinesisParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKeyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key-path` |
"
  [^CfnRule$KinesisParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :partition-key-path)]
    (. builder partitionKeyPath data))
  (.build builder))


(defn build-cfn-rule-network-configuration-property-builder
  "The build-cfn-rule-network-configuration-property-builder function updates a CfnRule$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsVpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-vpc-configuration` |
"
  [^CfnRule$NetworkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-vpc-configuration)]
    (. builder awsVpcConfiguration data))
  (.build builder))


(defn build-cfn-rule-placement-constraint-property-builder
  "The build-cfn-rule-placement-constraint-property-builder function updates a CfnRule$PlacementConstraintProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$PlacementConstraintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRule$PlacementConstraintProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-rule-placement-strategy-property-builder
  "The build-cfn-rule-placement-strategy-property-builder function updates a CfnRule$PlacementStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$PlacementStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRule$PlacementStrategyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-rule-props-builder
  "The build-cfn-rule-props-builder function updates a CfnRuleProps$Builder instance using the provided configuration.
  The function takes the CfnRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventPattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnRuleProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-rule-redshift-data-parameters-property-builder
  "The build-cfn-rule-redshift-data-parameters-property-builder function updates a CfnRule$RedshiftDataParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$RedshiftDataParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `dbUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-user` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `sql` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql` |
| `sqls` | java.util.List | [[cdk.support/lookup-entry]] | `:sqls` |
| `statementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-name` |
| `withEvent` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:with-event` |
"
  [^CfnRule$RedshiftDataParametersProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-rule-retry-policy-property-builder
  "The build-cfn-rule-retry-policy-property-builder function updates a CfnRule$RetryPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$RetryPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
"
  [^CfnRule$RetryPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-event-age-in-seconds)]
    (. builder maximumEventAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (.build builder))


(defn build-cfn-rule-run-command-parameters-property-builder
  "The build-cfn-rule-run-command-parameters-property-builder function updates a CfnRule$RunCommandParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$RunCommandParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `runCommandTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:run-command-targets` |
"
  [^CfnRule$RunCommandParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :run-command-targets)]
    (. builder runCommandTargets data))
  (.build builder))


(defn build-cfn-rule-run-command-target-property-builder
  "The build-cfn-rule-run-command-target-property-builder function updates a CfnRule$RunCommandTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$RunCommandTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnRule$RunCommandTargetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-rule-sage-maker-pipeline-parameter-property-builder
  "The build-cfn-rule-sage-maker-pipeline-parameter-property-builder function updates a CfnRule$SageMakerPipelineParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$SageMakerPipelineParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRule$SageMakerPipelineParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-rule-sage-maker-pipeline-parameters-property-builder
  "The build-cfn-rule-sage-maker-pipeline-parameters-property-builder function updates a CfnRule$SageMakerPipelineParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$SageMakerPipelineParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineParameterList` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-parameter-list` |
"
  [^CfnRule$SageMakerPipelineParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pipeline-parameter-list)]
    (. builder pipelineParameterList data))
  (.build builder))


(defn build-cfn-rule-sqs-parameters-property-builder
  "The build-cfn-rule-sqs-parameters-property-builder function updates a CfnRule$SqsParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$SqsParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
"
  [^CfnRule$SqsParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (.build builder))


(defn build-cfn-rule-tag-property-builder
  "The build-cfn-rule-tag-property-builder function updates a CfnRule$TagProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$TagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRule$TagProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-rule-target-property-builder
  "The build-cfn-rule-target-property-builder function updates a CfnRule$TargetProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$TargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `sqsParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-parameters` |
"
  [^CfnRule$TargetProperty$Builder builder id config]
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
  (.build builder))


(defn build-connection-attributes-builder
  "The build-connection-attributes-builder function updates a ConnectionAttributes$Builder instance using the provided configuration.
  The function takes the ConnectionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `connectionSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-secret-arn` |
"
  [^ConnectionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-let [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-let [data (lookup-entry config id :connection-secret-arn)]
    (. builder connectionSecretArn data))
  (.build builder))


(defn build-connection-builder
  "The build-connection-builder function updates a Connection$Builder instance using the provided configuration.
  The function takes the Connection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.services.events.Authorization | [[cdk.support/lookup-entry]] | `:authorization` |
| `bodyParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:body-parameters` |
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
"
  [^Connection$Builder builder id config]
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
  (.build builder))


(defn build-connection-props-builder
  "The build-connection-props-builder function updates a ConnectionProps$Builder instance using the provided configuration.
  The function takes the ConnectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.services.events.Authorization | [[cdk.support/lookup-entry]] | `:authorization` |
| `bodyParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:body-parameters` |
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
"
  [^ConnectionProps$Builder builder id config]
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
  (.build builder))


(defn build-cron-options-builder
  "The build-cron-options-builder function updates a CronOptions$Builder instance using the provided configuration.
  The function takes the CronOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `hour` | java.lang.String | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.String | [[cdk.support/lookup-entry]] | `:minute` |
| `month` | java.lang.String | [[cdk.support/lookup-entry]] | `:month` |
| `weekDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:week-day` |
| `year` | java.lang.String | [[cdk.support/lookup-entry]] | `:year` |
"
  [^CronOptions$Builder builder id config]
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
  (.build builder))


(defn build-event-bus-attributes-builder
  "The build-event-bus-attributes-builder function updates a EventBusAttributes$Builder instance using the provided configuration.
  The function takes the EventBusAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-arn` |
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventBusPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-policy` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
"
  [^EventBusAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus-arn)]
    (. builder eventBusArn data))
  (when-let [data (lookup-entry config id :event-bus-name)]
    (. builder eventBusName data))
  (when-let [data (lookup-entry config id :event-bus-policy)]
    (. builder eventBusPolicy data))
  (when-let [data (lookup-entry config id :event-source-name)]
    (. builder eventSourceName data))
  (.build builder))


(defn build-event-bus-builder
  "The build-event-bus-builder function updates a EventBus$Builder instance using the provided configuration.
  The function takes the EventBus$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
"
  [^EventBus$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus-name)]
    (. builder eventBusName data))
  (when-let [data (lookup-entry config id :event-source-name)]
    (. builder eventSourceName data))
  (.build builder))


(defn build-event-bus-policy-builder
  "The build-event-bus-policy-builder function updates a EventBusPolicy$Builder instance using the provided configuration.
  The function takes the EventBusPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `statement` | software.amazon.awscdk.services.iam.PolicyStatement | [[cdk.support/lookup-entry]] | `:statement` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |
"
  [^EventBusPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus)]
    (. builder eventBus data))
  (when-let [data (lookup-entry config id :statement)]
    (. builder statement data))
  (when-let [data (lookup-entry config id :statement-id)]
    (. builder statementId data))
  (.build builder))


(defn build-event-bus-policy-props-builder
  "The build-event-bus-policy-props-builder function updates a EventBusPolicyProps$Builder instance using the provided configuration.
  The function takes the EventBusPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `statement` | software.amazon.awscdk.services.iam.PolicyStatement | [[cdk.support/lookup-entry]] | `:statement` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |
"
  [^EventBusPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus)]
    (. builder eventBus data))
  (when-let [data (lookup-entry config id :statement)]
    (. builder statement data))
  (when-let [data (lookup-entry config id :statement-id)]
    (. builder statementId data))
  (.build builder))


(defn build-event-bus-props-builder
  "The build-event-bus-props-builder function updates a EventBusProps$Builder instance using the provided configuration.
  The function takes the EventBusProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
"
  [^EventBusProps$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus-name)]
    (. builder eventBusName data))
  (when-let [data (lookup-entry config id :event-source-name)]
    (. builder eventSourceName data))
  (.build builder))


(defn build-event-common-options-builder
  "The build-event-common-options-builder function updates a EventCommonOptions$Builder instance using the provided configuration.
  The function takes the EventCommonOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
"
  [^EventCommonOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :cross-stack-scope)]
    (. builder crossStackScope data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :event-pattern)]
    (. builder eventPattern data))
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (.build builder))


(defn build-event-pattern-builder
  "The build-event-pattern-builder function updates a EventPattern$Builder instance using the provided configuration.
  The function takes the EventPattern$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `version` | java.util.List | [[cdk.support/lookup-entry]] | `:version` |
"
  [^EventPattern$Builder builder id config]
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
  (.build builder))


(defn build-o-auth-authorization-props-builder
  "The build-o-auth-authorization-props-builder function updates a OAuthAuthorizationProps$Builder instance using the provided configuration.
  The function takes the OAuthAuthorizationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-endpoint` |
| `bodyParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:body-parameters` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:client-secret` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `httpMethod` | software.amazon.awscdk.services.events.HttpMethod | [[cdk.api.services.events/http-method]] | `:http-method` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
"
  [^OAuthAuthorizationProps$Builder builder id config]
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
  (.build builder))


(defn build-on-event-options-builder
  "The build-on-event-options-builder function updates a OnEventOptions$Builder instance using the provided configuration.
  The function takes the OnEventOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `target` | software.amazon.awscdk.services.events.IRuleTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^OnEventOptions$Builder builder id config]
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
  (.build builder))


(defn build-rule-builder
  "The build-rule-builder function updates a Rule$Builder instance using the provided configuration.
  The function takes the Rule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `schedule` | software.amazon.awscdk.services.events.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^Rule$Builder builder id config]
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
  (.build builder))


(defn build-rule-props-builder
  "The build-rule-props-builder function updates a RuleProps$Builder instance using the provided configuration.
  The function takes the RuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `schedule` | software.amazon.awscdk.services.events.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^RuleProps$Builder builder id config]
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
  (.build builder))


(defn build-rule-target-config-builder
  "The build-rule-target-config-builder function updates a RuleTargetConfig$Builder instance using the provided configuration.
  The function takes the RuleTargetConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `targetResource` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:target-resource` |
"
  [^RuleTargetConfig$Builder builder id config]
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
  (.build builder))


(defn build-rule-target-input-properties-builder
  "The build-rule-target-input-properties-builder function updates a RuleTargetInputProperties$Builder instance using the provided configuration.
  The function takes the RuleTargetInputProperties$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `inputPathsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-paths-map` |
| `inputTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-template` |
"
  [^RuleTargetInputProperties$Builder builder id config]
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-let [data (lookup-entry config id :input-paths-map)]
    (. builder inputPathsMap data))
  (when-let [data (lookup-entry config id :input-template)]
    (. builder inputTemplate data))
  (.build builder))