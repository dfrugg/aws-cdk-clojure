(ns cdk.api.services.sam
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sam package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.sam CfnApi$AccessLogSettingProperty$Builder
                                                CfnApi$AuthProperty$Builder
                                                CfnApi$Builder
                                                CfnApi$CanarySettingProperty$Builder
                                                CfnApi$CorsConfigurationProperty$Builder
                                                CfnApi$DomainConfigurationProperty$Builder
                                                CfnApi$EndpointConfigurationProperty$Builder
                                                CfnApi$MutualTlsAuthenticationProperty$Builder
                                                CfnApi$Route53ConfigurationProperty$Builder
                                                CfnApi$S3LocationProperty$Builder
                                                CfnApiProps$Builder
                                                CfnApplication$ApplicationLocationProperty$Builder
                                                CfnApplication$Builder
                                                CfnApplicationProps$Builder
                                                CfnFunction$AlexaSkillEventProperty$Builder
                                                CfnFunction$ApiEventProperty$Builder
                                                CfnFunction$AuthProperty$Builder
                                                CfnFunction$AuthResourcePolicyProperty$Builder
                                                CfnFunction$BucketSAMPTProperty$Builder
                                                CfnFunction$Builder
                                                CfnFunction$CloudWatchEventEventProperty$Builder
                                                CfnFunction$CloudWatchLogsEventProperty$Builder
                                                CfnFunction$CognitoEventProperty$Builder
                                                CfnFunction$CollectionSAMPTProperty$Builder
                                                CfnFunction$CorsConfigurationProperty$Builder
                                                CfnFunction$DeadLetterQueueProperty$Builder
                                                CfnFunction$DeploymentPreferenceProperty$Builder
                                                CfnFunction$DestinationConfigProperty$Builder
                                                CfnFunction$DestinationProperty$Builder
                                                CfnFunction$DomainSAMPTProperty$Builder
                                                CfnFunction$DynamoDBEventProperty$Builder
                                                CfnFunction$EmptySAMPTProperty$Builder
                                                CfnFunction$EphemeralStorageProperty$Builder
                                                CfnFunction$EventBridgeRuleEventProperty$Builder
                                                CfnFunction$EventInvokeConfigProperty$Builder
                                                CfnFunction$EventInvokeDestinationConfigProperty$Builder
                                                CfnFunction$EventSourceProperty$Builder
                                                CfnFunction$FileSystemConfigProperty$Builder
                                                CfnFunction$FunctionEnvironmentProperty$Builder
                                                CfnFunction$FunctionSAMPTProperty$Builder
                                                CfnFunction$FunctionUrlConfigProperty$Builder
                                                CfnFunction$HooksProperty$Builder
                                                CfnFunction$HttpApiEventProperty$Builder
                                                CfnFunction$HttpApiFunctionAuthProperty$Builder
                                                CfnFunction$IAMPolicyDocumentProperty$Builder
                                                CfnFunction$IdentitySAMPTProperty$Builder
                                                CfnFunction$ImageConfigProperty$Builder
                                                CfnFunction$IoTRuleEventProperty$Builder
                                                CfnFunction$KeySAMPTProperty$Builder
                                                CfnFunction$KinesisEventProperty$Builder
                                                CfnFunction$LogGroupSAMPTProperty$Builder
                                                CfnFunction$ParameterNameSAMPTProperty$Builder
                                                CfnFunction$ProvisionedConcurrencyConfigProperty$Builder
                                                CfnFunction$QueueSAMPTProperty$Builder
                                                CfnFunction$RequestModelProperty$Builder
                                                CfnFunction$RequestParameterProperty$Builder
                                                CfnFunction$RouteSettingsProperty$Builder
                                                CfnFunction$S3EventProperty$Builder
                                                CfnFunction$S3KeyFilterProperty$Builder
                                                CfnFunction$S3KeyFilterRuleProperty$Builder
                                                CfnFunction$S3LocationProperty$Builder
                                                CfnFunction$S3NotificationFilterProperty$Builder
                                                CfnFunction$SAMPolicyTemplateProperty$Builder
                                                CfnFunction$SNSEventProperty$Builder
                                                CfnFunction$SQSEventProperty$Builder
                                                CfnFunction$ScheduleEventProperty$Builder
                                                CfnFunction$SecretArnSAMPTProperty$Builder
                                                CfnFunction$StateMachineSAMPTProperty$Builder
                                                CfnFunction$StreamSAMPTProperty$Builder
                                                CfnFunction$TableSAMPTProperty$Builder
                                                CfnFunction$TableStreamSAMPTProperty$Builder
                                                CfnFunction$TopicSAMPTProperty$Builder
                                                CfnFunction$VpcConfigProperty$Builder
                                                CfnFunctionProps$Builder
                                                CfnHttpApi$AccessLogSettingProperty$Builder
                                                CfnHttpApi$Builder
                                                CfnHttpApi$CorsConfigurationObjectProperty$Builder
                                                CfnHttpApi$HttpApiAuthProperty$Builder
                                                CfnHttpApi$HttpApiDomainConfigurationProperty$Builder
                                                CfnHttpApi$MutualTlsAuthenticationProperty$Builder
                                                CfnHttpApi$Route53ConfigurationProperty$Builder
                                                CfnHttpApi$RouteSettingsProperty$Builder
                                                CfnHttpApi$S3LocationProperty$Builder
                                                CfnHttpApiProps$Builder
                                                CfnLayerVersion$Builder
                                                CfnLayerVersion$S3LocationProperty$Builder
                                                CfnLayerVersionProps$Builder
                                                CfnSimpleTable$Builder
                                                CfnSimpleTable$PrimaryKeyProperty$Builder
                                                CfnSimpleTable$ProvisionedThroughputProperty$Builder
                                                CfnSimpleTable$SSESpecificationProperty$Builder
                                                CfnSimpleTableProps$Builder
                                                CfnStateMachine$ApiEventProperty$Builder
                                                CfnStateMachine$Builder
                                                CfnStateMachine$CloudWatchEventEventProperty$Builder
                                                CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder
                                                CfnStateMachine$EventBridgeRuleEventProperty$Builder
                                                CfnStateMachine$EventSourceProperty$Builder
                                                CfnStateMachine$FunctionSAMPTProperty$Builder
                                                CfnStateMachine$IAMPolicyDocumentProperty$Builder
                                                CfnStateMachine$LogDestinationProperty$Builder
                                                CfnStateMachine$LoggingConfigurationProperty$Builder
                                                CfnStateMachine$S3LocationProperty$Builder
                                                CfnStateMachine$SAMPolicyTemplateProperty$Builder
                                                CfnStateMachine$ScheduleEventProperty$Builder
                                                CfnStateMachine$StateMachineSAMPTProperty$Builder
                                                CfnStateMachine$TracingConfigurationProperty$Builder
                                                CfnStateMachineProps$Builder]))


(defn build-cfn-api-access-log-setting-property-builder
  "The build-cfn-api-access-log-setting-property-builder function updates a CfnApi$AccessLogSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$AccessLogSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
"
  [^CfnApi$AccessLogSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (.build builder))


(defn cfn-api-access-log-setting-property-builder
  "Creates a  `CfnApi$AccessLogSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-access-log-setting-property-builder (new CfnApi$AccessLogSettingProperty$Builder) id config))


(defn build-cfn-api-auth-property-builder
  "The build-cfn-api-auth-property-builder function updates a CfnApi$AuthProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$AuthProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addDefaultAuthorizerToCorsPreflight` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-default-authorizer-to-cors-preflight` |
| `authorizers` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authorizers` |
| `defaultAuthorizer` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authorizer` |
"
  [^CfnApi$AuthProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :add-default-authorizer-to-cors-preflight)]
    (. builder addDefaultAuthorizerToCorsPreflight data))
  (when-let [data (lookup-entry config id :authorizers)]
    (. builder authorizers data))
  (when-let [data (lookup-entry config id :default-authorizer)]
    (. builder defaultAuthorizer data))
  (.build builder))


(defn cfn-api-auth-property-builder
  "Creates a  `CfnApi$AuthProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-auth-property-builder (new CfnApi$AuthProperty$Builder) id config))


(defn build-cfn-api-builder
  "The build-cfn-api-builder function updates a CfnApi$Builder instance using the provided configuration.
  The function takes the CfnApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSetting` | software.amazon.awscdk.services.sam.CfnApi$AccessLogSettingProperty | [[cdk.support/lookup-entry]] | `:access-log-setting` |
| `alwaysDeploy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:always-deploy` |
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `cacheClusterEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-cluster-enabled` |
| `cacheClusterSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-cluster-size` |
| `canarySetting` | software.amazon.awscdk.services.sam.CfnApi$CanarySettingProperty | [[cdk.support/lookup-entry]] | `:canary-setting` |
| `cors` | java.lang.String | [[cdk.support/lookup-entry]] | `:cors` |
| `definitionBody` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition-body` |
| `definitionUri` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domain` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain` |
| `endpointConfiguration` | software.amazon.awscdk.services.sam.CfnApi$EndpointConfigurationProperty | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `gatewayResponses` | java.lang.Object | [[cdk.support/lookup-entry]] | `:gateway-responses` |
| `methodSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:method-settings` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `models` | java.lang.Object | [[cdk.support/lookup-entry]] | `:models` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `openApiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:open-api-version` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tracingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnApi$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log-setting)]
    (. builder accessLogSetting data))
  (when-let [data (lookup-entry config id :always-deploy)]
    (. builder alwaysDeploy data))
  (when-let [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-let [data (lookup-entry config id :binary-media-types)]
    (. builder binaryMediaTypes data))
  (when-let [data (lookup-entry config id :cache-cluster-enabled)]
    (. builder cacheClusterEnabled data))
  (when-let [data (lookup-entry config id :cache-cluster-size)]
    (. builder cacheClusterSize data))
  (when-let [data (lookup-entry config id :canary-setting)]
    (. builder canarySetting data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (lookup-entry config id :definition-body)]
    (. builder definitionBody data))
  (when-let [data (lookup-entry config id :definition-uri)]
    (. builder definitionUri data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
    (. builder disableExecuteApiEndpoint data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :endpoint-configuration)]
    (. builder endpointConfiguration data))
  (when-let [data (lookup-entry config id :gateway-responses)]
    (. builder gatewayResponses data))
  (when-let [data (lookup-entry config id :method-settings)]
    (. builder methodSettings data))
  (when-let [data (lookup-entry config id :minimum-compression-size)]
    (. builder minimumCompressionSize data))
  (when-let [data (lookup-entry config id :models)]
    (. builder models data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :open-api-version)]
    (. builder openApiVersion data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tracing-enabled)]
    (. builder tracingEnabled data))
  (when-let [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn cfn-api-builder
  "Creates a  `CfnApi$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-api-builder (CfnApi$Builder/create scope (name id)) id config))


(defn build-cfn-api-canary-setting-property-builder
  "The build-cfn-api-canary-setting-property-builder function updates a CfnApi$CanarySettingProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$CanarySettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-id` |
| `percentTraffic` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percent-traffic` |
| `stageVariableOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:stage-variable-overrides` |
| `useStageCache` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-stage-cache` |
"
  [^CfnApi$CanarySettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-id)]
    (. builder deploymentId data))
  (when-let [data (lookup-entry config id :percent-traffic)]
    (. builder percentTraffic data))
  (when-let [data (lookup-entry config id :stage-variable-overrides)]
    (. builder stageVariableOverrides data))
  (when-let [data (lookup-entry config id :use-stage-cache)]
    (. builder useStageCache data))
  (.build builder))


(defn cfn-api-canary-setting-property-builder
  "Creates a  `CfnApi$CanarySettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-canary-setting-property-builder (new CfnApi$CanarySettingProperty$Builder) id config))


(defn build-cfn-api-cors-configuration-property-builder
  "The build-cfn-api-cors-configuration-property-builder function updates a CfnApi$CorsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$CorsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigin` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-origin` |
| `maxAge` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-age` |
"
  [^CfnApi$CorsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-credentials)]
    (. builder allowCredentials data))
  (when-let [data (lookup-entry config id :allow-headers)]
    (. builder allowHeaders data))
  (when-let [data (lookup-entry config id :allow-methods)]
    (. builder allowMethods data))
  (when-let [data (lookup-entry config id :allow-origin)]
    (. builder allowOrigin data))
  (when-let [data (lookup-entry config id :max-age)]
    (. builder maxAge data))
  (.build builder))


(defn cfn-api-cors-configuration-property-builder
  "Creates a  `CfnApi$CorsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-cors-configuration-property-builder (new CfnApi$CorsConfigurationProperty$Builder) id config))


(defn build-cfn-api-domain-configuration-property-builder
  "The build-cfn-api-domain-configuration-property-builder function updates a CfnApi$DomainConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$DomainConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.util.List | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `ownershipVerificationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ownership-verification-certificate-arn` |
| `route53` | software.amazon.awscdk.services.sam.CfnApi$Route53ConfigurationProperty | [[cdk.support/lookup-entry]] | `:route53` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
"
  [^CfnApi$DomainConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base-path)]
    (. builder basePath data))
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
  (when-let [data (lookup-entry config id :route53)]
    (. builder route53 data))
  (when-let [data (lookup-entry config id :security-policy)]
    (. builder securityPolicy data))
  (.build builder))


(defn cfn-api-domain-configuration-property-builder
  "Creates a  `CfnApi$DomainConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-domain-configuration-property-builder (new CfnApi$DomainConfigurationProperty$Builder) id config))


(defn build-cfn-api-endpoint-configuration-property-builder
  "The build-cfn-api-endpoint-configuration-property-builder function updates a CfnApi$EndpointConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$EndpointConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vpcEndpointIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoint-ids` |
"
  [^CfnApi$EndpointConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :vpc-endpoint-ids)]
    (. builder vpcEndpointIds data))
  (.build builder))


(defn cfn-api-endpoint-configuration-property-builder
  "Creates a  `CfnApi$EndpointConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-endpoint-configuration-property-builder (new CfnApi$EndpointConfigurationProperty$Builder) id config))


(defn build-cfn-api-mutual-tls-authentication-property-builder
  "The build-cfn-api-mutual-tls-authentication-property-builder function updates a CfnApi$MutualTlsAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$MutualTlsAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `truststoreUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-uri` |
| `truststoreVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-version` |
"
  [^CfnApi$MutualTlsAuthenticationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :truststore-uri)]
    (. builder truststoreUri data))
  (when-let [data (lookup-entry config id :truststore-version)]
    (. builder truststoreVersion data))
  (.build builder))


(defn cfn-api-mutual-tls-authentication-property-builder
  "Creates a  `CfnApi$MutualTlsAuthenticationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-mutual-tls-authentication-property-builder (new CfnApi$MutualTlsAuthenticationProperty$Builder) id config))


(defn build-cfn-api-props-builder
  "The build-cfn-api-props-builder function updates a CfnApiProps$Builder instance using the provided configuration.
  The function takes the CfnApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-log-setting` |
| `alwaysDeploy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:always-deploy` |
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `binaryMediaTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:binary-media-types` |
| `cacheClusterEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-cluster-enabled` |
| `cacheClusterSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-cluster-size` |
| `canarySetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:canary-setting` |
| `cors` | java.lang.String | [[cdk.support/lookup-entry]] | `:cors` |
| `definitionBody` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition-body` |
| `definitionUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domain` | software.amazon.awscdk.services.sam.CfnApi$DomainConfigurationProperty | [[cdk.support/lookup-entry]] | `:domain` |
| `endpointConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `gatewayResponses` | java.lang.Object | [[cdk.support/lookup-entry]] | `:gateway-responses` |
| `methodSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:method-settings` |
| `minimumCompressionSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-compression-size` |
| `models` | java.lang.Object | [[cdk.support/lookup-entry]] | `:models` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `openApiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:open-api-version` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tracingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnApiProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log-setting)]
    (. builder accessLogSetting data))
  (when-let [data (lookup-entry config id :always-deploy)]
    (. builder alwaysDeploy data))
  (when-let [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-let [data (lookup-entry config id :binary-media-types)]
    (. builder binaryMediaTypes data))
  (when-let [data (lookup-entry config id :cache-cluster-enabled)]
    (. builder cacheClusterEnabled data))
  (when-let [data (lookup-entry config id :cache-cluster-size)]
    (. builder cacheClusterSize data))
  (when-let [data (lookup-entry config id :canary-setting)]
    (. builder canarySetting data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (lookup-entry config id :definition-body)]
    (. builder definitionBody data))
  (when-let [data (lookup-entry config id :definition-uri)]
    (. builder definitionUri data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
    (. builder disableExecuteApiEndpoint data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :endpoint-configuration)]
    (. builder endpointConfiguration data))
  (when-let [data (lookup-entry config id :gateway-responses)]
    (. builder gatewayResponses data))
  (when-let [data (lookup-entry config id :method-settings)]
    (. builder methodSettings data))
  (when-let [data (lookup-entry config id :minimum-compression-size)]
    (. builder minimumCompressionSize data))
  (when-let [data (lookup-entry config id :models)]
    (. builder models data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :open-api-version)]
    (. builder openApiVersion data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tracing-enabled)]
    (. builder tracingEnabled data))
  (when-let [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn cfn-api-props-builder
  "Creates a  `CfnApiProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-props-builder (new CfnApiProps$Builder) id config))


(defn build-cfn-api-route53-configuration-property-builder
  "The build-cfn-api-route53-configuration-property-builder function updates a CfnApi$Route53ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$Route53ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributedDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributed-domain-name` |
| `evaluateTargetHealth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:evaluate-target-health` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `ipV6` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-v6` |
"
  [^CfnApi$Route53ConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :distributed-domain-name)]
    (. builder distributedDomainName data))
  (when-let [data (lookup-entry config id :evaluate-target-health)]
    (. builder evaluateTargetHealth data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :hosted-zone-name)]
    (. builder hostedZoneName data))
  (when-let [data (lookup-entry config id :ip-v6)]
    (. builder ipV6 data))
  (.build builder))


(defn cfn-api-route53-configuration-property-builder
  "Creates a  `CfnApi$Route53ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-route53-configuration-property-builder (new CfnApi$Route53ConfigurationProperty$Builder) id config))


(defn build-cfn-api-s3-location-property-builder
  "The build-cfn-api-s3-location-property-builder function updates a CfnApi$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnApi$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnApi$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-api-s3-location-property-builder
  "Creates a  `CfnApi$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-api-s3-location-property-builder (new CfnApi$S3LocationProperty$Builder) id config))


(defn build-cfn-application-application-location-property-builder
  "The build-cfn-application-application-location-property-builder function updates a CfnApplication$ApplicationLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `semanticVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:semantic-version` |
"
  [^CfnApplication$ApplicationLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :semantic-version)]
    (. builder semanticVersion data))
  (.build builder))


(defn cfn-application-application-location-property-builder
  "Creates a  `CfnApplication$ApplicationLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-application-location-property-builder (new CfnApplication$ApplicationLocationProperty$Builder) id config))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.sam.CfnApplication$ApplicationLocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
"
  [^CfnApplication$Builder builder id config]
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-builder (CfnApplication$Builder/create scope (name id)) id config))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.sam.CfnApplication$ApplicationLocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-props-builder (new CfnApplicationProps$Builder) id config))


(defn build-cfn-function-alexa-skill-event-property-builder
  "The build-cfn-function-alexa-skill-event-property-builder function updates a CfnFunction$AlexaSkillEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$AlexaSkillEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skillId` | java.lang.String | [[cdk.support/lookup-entry]] | `:skill-id` |
"
  [^CfnFunction$AlexaSkillEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :skill-id)]
    (. builder skillId data))
  (.build builder))


(defn cfn-function-alexa-skill-event-property-builder
  "Creates a  `CfnFunction$AlexaSkillEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-alexa-skill-event-property-builder (new CfnFunction$AlexaSkillEventProperty$Builder) id config))


(defn build-cfn-function-api-event-property-builder
  "The build-cfn-function-api-event-property-builder function updates a CfnFunction$ApiEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$ApiEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `requestModel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-model` |
| `requestParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnFunction$ApiEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :request-model)]
    (. builder requestModel data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (.build builder))


(defn cfn-function-api-event-property-builder
  "Creates a  `CfnFunction$ApiEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-api-event-property-builder (new CfnFunction$ApiEventProperty$Builder) id config))


(defn build-cfn-function-auth-property-builder
  "The build-cfn-function-auth-property-builder function updates a CfnFunction$AuthProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$AuthProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizer` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer` |
| `resourcePolicy` | software.amazon.awscdk.services.sam.CfnFunction$AuthResourcePolicyProperty | [[cdk.support/lookup-entry]] | `:resource-policy` |
"
  [^CfnFunction$AuthProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key-required)]
    (. builder apiKeyRequired data))
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-let [data (lookup-entry config id :resource-policy)]
    (. builder resourcePolicy data))
  (.build builder))


(defn cfn-function-auth-property-builder
  "Creates a  `CfnFunction$AuthProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-auth-property-builder (new CfnFunction$AuthProperty$Builder) id config))


(defn build-cfn-function-auth-resource-policy-property-builder
  "The build-cfn-function-auth-resource-policy-property-builder function updates a CfnFunction$AuthResourcePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$AuthResourcePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountBlacklist` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-account-blacklist` |
| `awsAccountWhitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-account-whitelist` |
| `customStatements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-statements` |
| `intrinsicVpcBlacklist` | java.util.List | [[cdk.support/lookup-entry]] | `:intrinsic-vpc-blacklist` |
| `intrinsicVpcWhitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:intrinsic-vpc-whitelist` |
| `intrinsicVpceBlacklist` | java.util.List | [[cdk.support/lookup-entry]] | `:intrinsic-vpce-blacklist` |
| `intrinsicVpceWhitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:intrinsic-vpce-whitelist` |
| `ipRangeBlacklist` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-range-blacklist` |
| `ipRangeWhitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-range-whitelist` |
| `sourceVpcBlacklist` | java.util.List | [[cdk.support/lookup-entry]] | `:source-vpc-blacklist` |
| `sourceVpcWhitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:source-vpc-whitelist` |
"
  [^CfnFunction$AuthResourcePolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-account-blacklist)]
    (. builder awsAccountBlacklist data))
  (when-let [data (lookup-entry config id :aws-account-whitelist)]
    (. builder awsAccountWhitelist data))
  (when-let [data (lookup-entry config id :custom-statements)]
    (. builder customStatements data))
  (when-let [data (lookup-entry config id :intrinsic-vpc-blacklist)]
    (. builder intrinsicVpcBlacklist data))
  (when-let [data (lookup-entry config id :intrinsic-vpc-whitelist)]
    (. builder intrinsicVpcWhitelist data))
  (when-let [data (lookup-entry config id :intrinsic-vpce-blacklist)]
    (. builder intrinsicVpceBlacklist data))
  (when-let [data (lookup-entry config id :intrinsic-vpce-whitelist)]
    (. builder intrinsicVpceWhitelist data))
  (when-let [data (lookup-entry config id :ip-range-blacklist)]
    (. builder ipRangeBlacklist data))
  (when-let [data (lookup-entry config id :ip-range-whitelist)]
    (. builder ipRangeWhitelist data))
  (when-let [data (lookup-entry config id :source-vpc-blacklist)]
    (. builder sourceVpcBlacklist data))
  (when-let [data (lookup-entry config id :source-vpc-whitelist)]
    (. builder sourceVpcWhitelist data))
  (.build builder))


(defn cfn-function-auth-resource-policy-property-builder
  "Creates a  `CfnFunction$AuthResourcePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-auth-resource-policy-property-builder (new CfnFunction$AuthResourcePolicyProperty$Builder) id config))


(defn build-cfn-function-bucket-sampt-property-builder
  "The build-cfn-function-bucket-sampt-property-builder function updates a CfnFunction$BucketSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$BucketSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
"
  [^CfnFunction$BucketSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (.build builder))


(defn cfn-function-bucket-sampt-property-builder
  "Creates a  `CfnFunction$BucketSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-bucket-sampt-property-builder (new CfnFunction$BucketSAMPTProperty$Builder) id config))


(defn build-cfn-function-builder
  "The build-cfn-function-builder function updates a CfnFunction$Builder instance using the provided configuration.
  The function takes the CfnFunction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architectures` | java.util.List | [[cdk.support/lookup-entry]] | `:architectures` |
| `assumeRolePolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:assume-role-policy-document` |
| `autoPublishAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-publish-alias` |
| `autoPublishCodeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-publish-code-sha256` |
| `codeSigningConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-signing-config-arn` |
| `codeUri` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-uri` |
| `deadLetterQueue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deploymentPreference` | software.amazon.awscdk.services.sam.CfnFunction$DeploymentPreferenceProperty | [[cdk.support/lookup-entry]] | `:deployment-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | software.amazon.awscdk.services.sam.CfnFunction$FunctionEnvironmentProperty | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorage` | software.amazon.awscdk.services.sam.CfnFunction$EphemeralStorageProperty | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `eventInvokeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-invoke-config` |
| `events` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:events` |
| `fileSystemConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-configs` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionUrlConfig` | software.amazon.awscdk.services.sam.CfnFunction$FunctionUrlConfigProperty | [[cdk.support/lookup-entry]] | `:function-url-config` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `imageConfig` | software.amazon.awscdk.services.sam.CfnFunction$ImageConfigProperty | [[cdk.support/lookup-entry]] | `:image-config` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `inlineCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-code` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `packageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-type` |
| `permissionsBoundary` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policies` | software.amazon.awscdk.services.sam.CfnFunction$IAMPolicyDocumentProperty | [[cdk.support/lookup-entry]] | `:policies` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracing` |
| `versionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-description` |
| `vpcConfig` | software.amazon.awscdk.services.sam.CfnFunction$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnFunction$Builder builder id config]
  (when-let [data (lookup-entry config id :architectures)]
    (. builder architectures data))
  (when-let [data (lookup-entry config id :assume-role-policy-document)]
    (. builder assumeRolePolicyDocument data))
  (when-let [data (lookup-entry config id :auto-publish-alias)]
    (. builder autoPublishAlias data))
  (when-let [data (lookup-entry config id :auto-publish-code-sha256)]
    (. builder autoPublishCodeSha256 data))
  (when-let [data (lookup-entry config id :code-signing-config-arn)]
    (. builder codeSigningConfigArn data))
  (when-let [data (lookup-entry config id :code-uri)]
    (. builder codeUri data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :deployment-preference)]
    (. builder deploymentPreference data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :ephemeral-storage)]
    (. builder ephemeralStorage data))
  (when-let [data (lookup-entry config id :event-invoke-config)]
    (. builder eventInvokeConfig data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :file-system-configs)]
    (. builder fileSystemConfigs data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :function-url-config)]
    (. builder functionUrlConfig data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :image-config)]
    (. builder imageConfig data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-let [data (lookup-entry config id :inline-code)]
    (. builder inlineCode data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :package-type)]
    (. builder packageType data))
  (when-let [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-let [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-let [data (lookup-entry config id :provisioned-concurrency-config)]
    (. builder provisionedConcurrencyConfig data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :version-description)]
    (. builder versionDescription data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-function-builder
  "Creates a  `CfnFunction$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-function-builder (CfnFunction$Builder/create scope (name id)) id config))


(defn build-cfn-function-cloud-watch-event-event-property-builder
  "The build-cfn-function-cloud-watch-event-event-property-builder function updates a CfnFunction$CloudWatchEventEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$CloudWatchEventEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `pattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pattern` |
"
  [^CfnFunction$CloudWatchEventEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (.build builder))


(defn cfn-function-cloud-watch-event-event-property-builder
  "Creates a  `CfnFunction$CloudWatchEventEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-cloud-watch-event-event-property-builder (new CfnFunction$CloudWatchEventEventProperty$Builder) id config))


(defn build-cfn-function-cloud-watch-logs-event-property-builder
  "The build-cfn-function-cloud-watch-logs-event-property-builder function updates a CfnFunction$CloudWatchLogsEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$CloudWatchLogsEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
"
  [^CfnFunction$CloudWatchLogsEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (.build builder))


(defn cfn-function-cloud-watch-logs-event-property-builder
  "Creates a  `CfnFunction$CloudWatchLogsEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-cloud-watch-logs-event-property-builder (new CfnFunction$CloudWatchLogsEventProperty$Builder) id config))


(defn build-cfn-function-cognito-event-property-builder
  "The build-cfn-function-cognito-event-property-builder function updates a CfnFunction$CognitoEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$CognitoEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `trigger` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger` |
| `userPool` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^CfnFunction$CognitoEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :trigger)]
    (. builder trigger data))
  (when-let [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn cfn-function-cognito-event-property-builder
  "Creates a  `CfnFunction$CognitoEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-cognito-event-property-builder (new CfnFunction$CognitoEventProperty$Builder) id config))


(defn build-cfn-function-collection-sampt-property-builder
  "The build-cfn-function-collection-sampt-property-builder function updates a CfnFunction$CollectionSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$CollectionSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
"
  [^CfnFunction$CollectionSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :collection-id)]
    (. builder collectionId data))
  (.build builder))


(defn cfn-function-collection-sampt-property-builder
  "Creates a  `CfnFunction$CollectionSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-collection-sampt-property-builder (new CfnFunction$CollectionSAMPTProperty$Builder) id config))


(defn build-cfn-function-cors-configuration-property-builder
  "The build-cfn-function-cors-configuration-property-builder function updates a CfnFunction$CorsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$CorsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigin` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-origin` |
| `maxAge` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-age` |
"
  [^CfnFunction$CorsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-credentials)]
    (. builder allowCredentials data))
  (when-let [data (lookup-entry config id :allow-headers)]
    (. builder allowHeaders data))
  (when-let [data (lookup-entry config id :allow-methods)]
    (. builder allowMethods data))
  (when-let [data (lookup-entry config id :allow-origin)]
    (. builder allowOrigin data))
  (when-let [data (lookup-entry config id :max-age)]
    (. builder maxAge data))
  (.build builder))


(defn cfn-function-cors-configuration-property-builder
  "Creates a  `CfnFunction$CorsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-cors-configuration-property-builder (new CfnFunction$CorsConfigurationProperty$Builder) id config))


(defn build-cfn-function-dead-letter-queue-property-builder
  "The build-cfn-function-dead-letter-queue-property-builder function updates a CfnFunction$DeadLetterQueueProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$DeadLetterQueueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnFunction$DeadLetterQueueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-function-dead-letter-queue-property-builder
  "Creates a  `CfnFunction$DeadLetterQueueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-dead-letter-queue-property-builder (new CfnFunction$DeadLetterQueueProperty$Builder) id config))


(defn build-cfn-function-deployment-preference-property-builder
  "The build-cfn-function-deployment-preference-property-builder function updates a CfnFunction$DeploymentPreferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$DeploymentPreferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `hooks` | software.amazon.awscdk.services.sam.CfnFunction$HooksProperty | [[cdk.support/lookup-entry]] | `:hooks` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnFunction$DeploymentPreferenceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :hooks)]
    (. builder hooks data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-function-deployment-preference-property-builder
  "Creates a  `CfnFunction$DeploymentPreferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-deployment-preference-property-builder (new CfnFunction$DeploymentPreferenceProperty$Builder) id config))


(defn build-cfn-function-destination-config-property-builder
  "The build-cfn-function-destination-config-property-builder function updates a CfnFunction$DestinationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$DestinationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-failure` |
"
  [^CfnFunction$DestinationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (.build builder))


(defn cfn-function-destination-config-property-builder
  "Creates a  `CfnFunction$DestinationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-destination-config-property-builder (new CfnFunction$DestinationConfigProperty$Builder) id config))


(defn build-cfn-function-destination-property-builder
  "The build-cfn-function-destination-property-builder function updates a CfnFunction$DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnFunction$DestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-function-destination-property-builder
  "Creates a  `CfnFunction$DestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-destination-property-builder (new CfnFunction$DestinationProperty$Builder) id config))


(defn build-cfn-function-domain-sampt-property-builder
  "The build-cfn-function-domain-sampt-property-builder function updates a CfnFunction$DomainSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$DomainSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^CfnFunction$DomainSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn cfn-function-domain-sampt-property-builder
  "Creates a  `CfnFunction$DomainSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-domain-sampt-property-builder (new CfnFunction$DomainSAMPTProperty$Builder) id config))


(defn build-cfn-function-dynamo-db-event-property-builder
  "The build-cfn-function-dynamo-db-event-property-builder function updates a CfnFunction$DynamoDBEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$DynamoDBEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnFunctionError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-function-error` |
| `destinationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-config` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `maximumRecordAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-record-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `stream` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream` |
"
  [^CfnFunction$DynamoDBEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-function-error)]
    (. builder bisectBatchOnFunctionError data))
  (when-let [data (lookup-entry config id :destination-config)]
    (. builder destinationConfig data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :maximum-record-age-in-seconds)]
    (. builder maximumRecordAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :stream)]
    (. builder stream data))
  (.build builder))


(defn cfn-function-dynamo-db-event-property-builder
  "Creates a  `CfnFunction$DynamoDBEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-dynamo-db-event-property-builder (new CfnFunction$DynamoDBEventProperty$Builder) id config))


(defn build-cfn-function-empty-sampt-property-builder
  "The build-cfn-function-empty-sampt-property-builder function updates a CfnFunction$EmptySAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$EmptySAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnFunction$EmptySAMPTProperty$Builder builder id config]
  (.build builder))


(defn cfn-function-empty-sampt-property-builder
  "Creates a  `CfnFunction$EmptySAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-empty-sampt-property-builder (new CfnFunction$EmptySAMPTProperty$Builder) id config))


(defn build-cfn-function-ephemeral-storage-property-builder
  "The build-cfn-function-ephemeral-storage-property-builder function updates a CfnFunction$EphemeralStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$EphemeralStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^CfnFunction$EphemeralStorageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn cfn-function-ephemeral-storage-property-builder
  "Creates a  `CfnFunction$EphemeralStorageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-ephemeral-storage-property-builder (new CfnFunction$EphemeralStorageProperty$Builder) id config))


(defn build-cfn-function-event-bridge-rule-event-property-builder
  "The build-cfn-function-event-bridge-rule-event-property-builder function updates a CfnFunction$EventBridgeRuleEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$EventBridgeRuleEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `pattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pattern` |
"
  [^CfnFunction$EventBridgeRuleEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus-name)]
    (. builder eventBusName data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (.build builder))


(defn cfn-function-event-bridge-rule-event-property-builder
  "Creates a  `CfnFunction$EventBridgeRuleEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-event-bridge-rule-event-property-builder (new CfnFunction$EventBridgeRuleEventProperty$Builder) id config))


(defn build-cfn-function-event-invoke-config-property-builder
  "The build-cfn-function-event-invoke-config-property-builder function updates a CfnFunction$EventInvokeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$EventInvokeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfig` | software.amazon.awscdk.services.sam.CfnFunction$EventInvokeDestinationConfigProperty | [[cdk.support/lookup-entry]] | `:destination-config` |
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
"
  [^CfnFunction$EventInvokeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-config)]
    (. builder destinationConfig data))
  (when-let [data (lookup-entry config id :maximum-event-age-in-seconds)]
    (. builder maximumEventAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (.build builder))


(defn cfn-function-event-invoke-config-property-builder
  "Creates a  `CfnFunction$EventInvokeConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-event-invoke-config-property-builder (new CfnFunction$EventInvokeConfigProperty$Builder) id config))


(defn build-cfn-function-event-invoke-destination-config-property-builder
  "The build-cfn-function-event-invoke-destination-config-property-builder function updates a CfnFunction$EventInvokeDestinationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$EventInvokeDestinationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-success` |
"
  [^CfnFunction$EventInvokeDestinationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (.build builder))


(defn cfn-function-event-invoke-destination-config-property-builder
  "Creates a  `CfnFunction$EventInvokeDestinationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-event-invoke-destination-config-property-builder (new CfnFunction$EventInvokeDestinationConfigProperty$Builder) id config))


(defn build-cfn-function-event-source-property-builder
  "The build-cfn-function-event-source-property-builder function updates a CfnFunction$EventSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$EventSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | software.amazon.awscdk.services.sam.CfnFunction$KinesisEventProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnFunction$EventSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-function-event-source-property-builder
  "Creates a  `CfnFunction$EventSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-event-source-property-builder (new CfnFunction$EventSourceProperty$Builder) id config))


(defn build-cfn-function-file-system-config-property-builder
  "The build-cfn-function-file-system-config-property-builder function updates a CfnFunction$FileSystemConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$FileSystemConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `localMountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-mount-path` |
"
  [^CfnFunction$FileSystemConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :local-mount-path)]
    (. builder localMountPath data))
  (.build builder))


(defn cfn-function-file-system-config-property-builder
  "Creates a  `CfnFunction$FileSystemConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-file-system-config-property-builder (new CfnFunction$FileSystemConfigProperty$Builder) id config))


(defn build-cfn-function-function-environment-property-builder
  "The build-cfn-function-function-environment-property-builder function updates a CfnFunction$FunctionEnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$FunctionEnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnFunction$FunctionEnvironmentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn cfn-function-function-environment-property-builder
  "Creates a  `CfnFunction$FunctionEnvironmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-function-environment-property-builder (new CfnFunction$FunctionEnvironmentProperty$Builder) id config))


(defn build-cfn-function-function-sampt-property-builder
  "The build-cfn-function-function-sampt-property-builder function updates a CfnFunction$FunctionSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$FunctionSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
"
  [^CfnFunction$FunctionSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (.build builder))


(defn cfn-function-function-sampt-property-builder
  "Creates a  `CfnFunction$FunctionSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-function-sampt-property-builder (new CfnFunction$FunctionSAMPTProperty$Builder) id config))


(defn build-cfn-function-function-url-config-property-builder
  "The build-cfn-function-function-url-config-property-builder function updates a CfnFunction$FunctionUrlConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$FunctionUrlConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `cors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors` |
| `invokeMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:invoke-mode` |
"
  [^CfnFunction$FunctionUrlConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (lookup-entry config id :invoke-mode)]
    (. builder invokeMode data))
  (.build builder))


(defn cfn-function-function-url-config-property-builder
  "Creates a  `CfnFunction$FunctionUrlConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-function-url-config-property-builder (new CfnFunction$FunctionUrlConfigProperty$Builder) id config))


(defn build-cfn-function-hooks-property-builder
  "The build-cfn-function-hooks-property-builder function updates a CfnFunction$HooksProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$HooksProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `postTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-traffic` |
| `preTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-traffic` |
"
  [^CfnFunction$HooksProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :post-traffic)]
    (. builder postTraffic data))
  (when-let [data (lookup-entry config id :pre-traffic)]
    (. builder preTraffic data))
  (.build builder))


(defn cfn-function-hooks-property-builder
  "Creates a  `CfnFunction$HooksProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-hooks-property-builder (new CfnFunction$HooksProperty$Builder) id config))


(defn build-cfn-function-http-api-event-property-builder
  "The build-cfn-function-http-api-event-property-builder function updates a CfnFunction$HttpApiEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$HttpApiEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `payloadFormatVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-format-version` |
| `routeSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route-settings` |
| `timeoutInMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-millis` |
"
  [^CfnFunction$HttpApiEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :payload-format-version)]
    (. builder payloadFormatVersion data))
  (when-let [data (lookup-entry config id :route-settings)]
    (. builder routeSettings data))
  (when-let [data (lookup-entry config id :timeout-in-millis)]
    (. builder timeoutInMillis data))
  (.build builder))


(defn cfn-function-http-api-event-property-builder
  "Creates a  `CfnFunction$HttpApiEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-http-api-event-property-builder (new CfnFunction$HttpApiEventProperty$Builder) id config))


(defn build-cfn-function-http-api-function-auth-property-builder
  "The build-cfn-function-http-api-function-auth-property-builder function updates a CfnFunction$HttpApiFunctionAuthProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$HttpApiFunctionAuthProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizer` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer` |
"
  [^CfnFunction$HttpApiFunctionAuthProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (.build builder))


(defn cfn-function-http-api-function-auth-property-builder
  "Creates a  `CfnFunction$HttpApiFunctionAuthProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-http-api-function-auth-property-builder (new CfnFunction$HttpApiFunctionAuthProperty$Builder) id config))


(defn build-cfn-function-iam-policy-document-property-builder
  "The build-cfn-function-iam-policy-document-property-builder function updates a CfnFunction$IAMPolicyDocumentProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$IAMPolicyDocumentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statement` | java.lang.Object | [[cdk.support/lookup-entry]] | `:statement` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnFunction$IAMPolicyDocumentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statement)]
    (. builder statement data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-function-iam-policy-document-property-builder
  "Creates a  `CfnFunction$IAMPolicyDocumentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-iam-policy-document-property-builder (new CfnFunction$IAMPolicyDocumentProperty$Builder) id config))


(defn build-cfn-function-identity-sampt-property-builder
  "The build-cfn-function-identity-sampt-property-builder function updates a CfnFunction$IdentitySAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$IdentitySAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-name` |
"
  [^CfnFunction$IdentitySAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :identity-name)]
    (. builder identityName data))
  (.build builder))


(defn cfn-function-identity-sampt-property-builder
  "Creates a  `CfnFunction$IdentitySAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-identity-sampt-property-builder (new CfnFunction$IdentitySAMPTProperty$Builder) id config))


(defn build-cfn-function-image-config-property-builder
  "The build-cfn-function-image-config-property-builder function updates a CfnFunction$ImageConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$ImageConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnFunction$ImageConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :command)]
    (. builder command data))
  (when-let [data (lookup-entry config id :entry-point)]
    (. builder entryPoint data))
  (when-let [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn cfn-function-image-config-property-builder
  "Creates a  `CfnFunction$ImageConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-image-config-property-builder (new CfnFunction$ImageConfigProperty$Builder) id config))


(defn build-cfn-function-io-t-rule-event-property-builder
  "The build-cfn-function-io-t-rule-event-property-builder function updates a CfnFunction$IoTRuleEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$IoTRuleEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsIotSqlVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-iot-sql-version` |
| `sql` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql` |
"
  [^CfnFunction$IoTRuleEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-iot-sql-version)]
    (. builder awsIotSqlVersion data))
  (when-let [data (lookup-entry config id :sql)]
    (. builder sql data))
  (.build builder))


(defn cfn-function-io-t-rule-event-property-builder
  "Creates a  `CfnFunction$IoTRuleEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-io-t-rule-event-property-builder (new CfnFunction$IoTRuleEventProperty$Builder) id config))


(defn build-cfn-function-key-sampt-property-builder
  "The build-cfn-function-key-sampt-property-builder function updates a CfnFunction$KeySAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$KeySAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
"
  [^CfnFunction$KeySAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (.build builder))


(defn cfn-function-key-sampt-property-builder
  "Creates a  `CfnFunction$KeySAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-key-sampt-property-builder (new CfnFunction$KeySAMPTProperty$Builder) id config))


(defn build-cfn-function-kinesis-event-property-builder
  "The build-cfn-function-kinesis-event-property-builder function updates a CfnFunction$KinesisEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$KinesisEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `functionResponseTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:function-response-types` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `stream` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream` |
"
  [^CfnFunction$KinesisEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :function-response-types)]
    (. builder functionResponseTypes data))
  (when-let [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :stream)]
    (. builder stream data))
  (.build builder))


(defn cfn-function-kinesis-event-property-builder
  "Creates a  `CfnFunction$KinesisEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-kinesis-event-property-builder (new CfnFunction$KinesisEventProperty$Builder) id config))


(defn build-cfn-function-log-group-sampt-property-builder
  "The build-cfn-function-log-group-sampt-property-builder function updates a CfnFunction$LogGroupSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$LogGroupSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
"
  [^CfnFunction$LogGroupSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (.build builder))


(defn cfn-function-log-group-sampt-property-builder
  "Creates a  `CfnFunction$LogGroupSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-log-group-sampt-property-builder (new CfnFunction$LogGroupSAMPTProperty$Builder) id config))


(defn build-cfn-function-parameter-name-sampt-property-builder
  "The build-cfn-function-parameter-name-sampt-property-builder function updates a CfnFunction$ParameterNameSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$ParameterNameSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
"
  [^CfnFunction$ParameterNameSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (.build builder))


(defn cfn-function-parameter-name-sampt-property-builder
  "Creates a  `CfnFunction$ParameterNameSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-parameter-name-sampt-property-builder (new CfnFunction$ParameterNameSAMPTProperty$Builder) id config))


(defn build-cfn-function-props-builder
  "The build-cfn-function-props-builder function updates a CfnFunctionProps$Builder instance using the provided configuration.
  The function takes the CfnFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architectures` | java.util.List | [[cdk.support/lookup-entry]] | `:architectures` |
| `assumeRolePolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:assume-role-policy-document` |
| `autoPublishAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-publish-alias` |
| `autoPublishCodeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-publish-code-sha256` |
| `codeSigningConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-signing-config-arn` |
| `codeUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-uri` |
| `deadLetterQueue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deploymentPreference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | software.amazon.awscdk.services.sam.CfnFunction$FunctionEnvironmentProperty | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorage` | software.amazon.awscdk.services.sam.CfnFunction$EphemeralStorageProperty | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `eventInvokeConfig` | software.amazon.awscdk.services.sam.CfnFunction$EventInvokeConfigProperty | [[cdk.support/lookup-entry]] | `:event-invoke-config` |
| `events` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:events` |
| `fileSystemConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-configs` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionUrlConfig` | software.amazon.awscdk.services.sam.CfnFunction$FunctionUrlConfigProperty | [[cdk.support/lookup-entry]] | `:function-url-config` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `imageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-config` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `inlineCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-code` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `packageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-type` |
| `permissionsBoundary` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policies` | java.util.List | [[cdk.support/lookup-entry]] | `:policies` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.services.sam.CfnFunction$ProvisionedConcurrencyConfigProperty | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracing` |
| `versionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-description` |
| `vpcConfig` | software.amazon.awscdk.services.sam.CfnFunction$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnFunctionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :architectures)]
    (. builder architectures data))
  (when-let [data (lookup-entry config id :assume-role-policy-document)]
    (. builder assumeRolePolicyDocument data))
  (when-let [data (lookup-entry config id :auto-publish-alias)]
    (. builder autoPublishAlias data))
  (when-let [data (lookup-entry config id :auto-publish-code-sha256)]
    (. builder autoPublishCodeSha256 data))
  (when-let [data (lookup-entry config id :code-signing-config-arn)]
    (. builder codeSigningConfigArn data))
  (when-let [data (lookup-entry config id :code-uri)]
    (. builder codeUri data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :deployment-preference)]
    (. builder deploymentPreference data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :ephemeral-storage)]
    (. builder ephemeralStorage data))
  (when-let [data (lookup-entry config id :event-invoke-config)]
    (. builder eventInvokeConfig data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :file-system-configs)]
    (. builder fileSystemConfigs data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :function-url-config)]
    (. builder functionUrlConfig data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :image-config)]
    (. builder imageConfig data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-let [data (lookup-entry config id :inline-code)]
    (. builder inlineCode data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :package-type)]
    (. builder packageType data))
  (when-let [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-let [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-let [data (lookup-entry config id :provisioned-concurrency-config)]
    (. builder provisionedConcurrencyConfig data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :version-description)]
    (. builder versionDescription data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-function-props-builder
  "Creates a  `CfnFunctionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-props-builder (new CfnFunctionProps$Builder) id config))


(defn build-cfn-function-provisioned-concurrency-config-property-builder
  "The build-cfn-function-provisioned-concurrency-config-property-builder function updates a CfnFunction$ProvisionedConcurrencyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$ProvisionedConcurrencyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedConcurrentExecutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
"
  [^CfnFunction$ProvisionedConcurrencyConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (.build builder))


(defn cfn-function-provisioned-concurrency-config-property-builder
  "Creates a  `CfnFunction$ProvisionedConcurrencyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-provisioned-concurrency-config-property-builder (new CfnFunction$ProvisionedConcurrencyConfigProperty$Builder) id config))


(defn build-cfn-function-queue-sampt-property-builder
  "The build-cfn-function-queue-sampt-property-builder function updates a CfnFunction$QueueSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$QueueSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
"
  [^CfnFunction$QueueSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :queue-name)]
    (. builder queueName data))
  (.build builder))


(defn cfn-function-queue-sampt-property-builder
  "Creates a  `CfnFunction$QueueSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-queue-sampt-property-builder (new CfnFunction$QueueSAMPTProperty$Builder) id config))


(defn build-cfn-function-request-model-property-builder
  "The build-cfn-function-request-model-property-builder function updates a CfnFunction$RequestModelProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$RequestModelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `required` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required` |
| `validateBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-body` |
| `validateParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validate-parameters` |
"
  [^CfnFunction$RequestModelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :model)]
    (. builder model data))
  (when-let [data (lookup-entry config id :required)]
    (. builder required data))
  (when-let [data (lookup-entry config id :validate-body)]
    (. builder validateBody data))
  (when-let [data (lookup-entry config id :validate-parameters)]
    (. builder validateParameters data))
  (.build builder))


(defn cfn-function-request-model-property-builder
  "Creates a  `CfnFunction$RequestModelProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-request-model-property-builder (new CfnFunction$RequestModelProperty$Builder) id config))


(defn build-cfn-function-request-parameter-property-builder
  "The build-cfn-function-request-parameter-property-builder function updates a CfnFunction$RequestParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$RequestParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caching` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caching` |
| `required` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required` |
"
  [^CfnFunction$RequestParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :caching)]
    (. builder caching data))
  (when-let [data (lookup-entry config id :required)]
    (. builder required data))
  (.build builder))


(defn cfn-function-request-parameter-property-builder
  "Creates a  `CfnFunction$RequestParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-request-parameter-property-builder (new CfnFunction$RequestParameterProperty$Builder) id config))


(defn build-cfn-function-route-settings-property-builder
  "The build-cfn-function-route-settings-property-builder function updates a CfnFunction$RouteSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$RouteSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTraceEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `detailedMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detailed-metrics-enabled` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
"
  [^CfnFunction$RouteSettingsProperty$Builder builder id config]
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


(defn cfn-function-route-settings-property-builder
  "Creates a  `CfnFunction$RouteSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-route-settings-property-builder (new CfnFunction$RouteSettingsProperty$Builder) id config))


(defn build-cfn-function-s3-event-property-builder
  "The build-cfn-function-s3-event-property-builder function updates a CfnFunction$S3EventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$S3EventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `events` | java.lang.String | [[cdk.support/lookup-entry]] | `:events` |
| `filter` | software.amazon.awscdk.services.sam.CfnFunction$S3NotificationFilterProperty | [[cdk.support/lookup-entry]] | `:filter` |
"
  [^CfnFunction$S3EventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (.build builder))


(defn cfn-function-s3-event-property-builder
  "Creates a  `CfnFunction$S3EventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-s3-event-property-builder (new CfnFunction$S3EventProperty$Builder) id config))


(defn build-cfn-function-s3-key-filter-property-builder
  "The build-cfn-function-s3-key-filter-property-builder function updates a CfnFunction$S3KeyFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$S3KeyFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnFunction$S3KeyFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-function-s3-key-filter-property-builder
  "Creates a  `CfnFunction$S3KeyFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-s3-key-filter-property-builder (new CfnFunction$S3KeyFilterProperty$Builder) id config))


(defn build-cfn-function-s3-key-filter-rule-property-builder
  "The build-cfn-function-s3-key-filter-rule-property-builder function updates a CfnFunction$S3KeyFilterRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$S3KeyFilterRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnFunction$S3KeyFilterRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-function-s3-key-filter-rule-property-builder
  "Creates a  `CfnFunction$S3KeyFilterRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-s3-key-filter-rule-property-builder (new CfnFunction$S3KeyFilterRuleProperty$Builder) id config))


(defn build-cfn-function-s3-location-property-builder
  "The build-cfn-function-s3-location-property-builder function updates a CfnFunction$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnFunction$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-function-s3-location-property-builder
  "Creates a  `CfnFunction$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-s3-location-property-builder (new CfnFunction$S3LocationProperty$Builder) id config))


(defn build-cfn-function-s3-notification-filter-property-builder
  "The build-cfn-function-s3-notification-filter-property-builder function updates a CfnFunction$S3NotificationFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$S3NotificationFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Key` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-key` |
"
  [^CfnFunction$S3NotificationFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (.build builder))


(defn cfn-function-s3-notification-filter-property-builder
  "Creates a  `CfnFunction$S3NotificationFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-s3-notification-filter-property-builder (new CfnFunction$S3NotificationFilterProperty$Builder) id config))


(defn build-cfn-function-sam-policy-template-property-builder
  "The build-cfn-function-sam-policy-template-property-builder function updates a CfnFunction$SAMPolicyTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$SAMPolicyTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiDescribePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ami-describe-policy` |
| `awsSecretsManagerGetSecretValuePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-secrets-manager-get-secret-value-policy` |
| `cloudFormationDescribeStacksPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-formation-describe-stacks-policy` |
| `cloudWatchPutMetricPolicy` | software.amazon.awscdk.services.sam.CfnFunction$EmptySAMPTProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-put-metric-policy` |
| `dynamoDbCrudPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-db-crud-policy` |
| `dynamoDbReadPolicy` | software.amazon.awscdk.services.sam.CfnFunction$TableSAMPTProperty | [[cdk.support/lookup-entry]] | `:dynamo-db-read-policy` |
| `dynamoDbStreamReadPolicy` | software.amazon.awscdk.services.sam.CfnFunction$TableStreamSAMPTProperty | [[cdk.support/lookup-entry]] | `:dynamo-db-stream-read-policy` |
| `dynamoDbWritePolicy` | software.amazon.awscdk.services.sam.CfnFunction$TableSAMPTProperty | [[cdk.support/lookup-entry]] | `:dynamo-db-write-policy` |
| `ec2DescribePolicy` | software.amazon.awscdk.services.sam.CfnFunction$EmptySAMPTProperty | [[cdk.support/lookup-entry]] | `:ec2-describe-policy` |
| `elasticsearchHttpPostPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elasticsearch-http-post-policy` |
| `filterLogEventsPolicy` | software.amazon.awscdk.services.sam.CfnFunction$LogGroupSAMPTProperty | [[cdk.support/lookup-entry]] | `:filter-log-events-policy` |
| `kinesisCrudPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-crud-policy` |
| `kinesisStreamReadPolicy` | software.amazon.awscdk.services.sam.CfnFunction$StreamSAMPTProperty | [[cdk.support/lookup-entry]] | `:kinesis-stream-read-policy` |
| `kmsDecryptPolicy` | software.amazon.awscdk.services.sam.CfnFunction$KeySAMPTProperty | [[cdk.support/lookup-entry]] | `:kms-decrypt-policy` |
| `lambdaInvokePolicy` | software.amazon.awscdk.services.sam.CfnFunction$FunctionSAMPTProperty | [[cdk.support/lookup-entry]] | `:lambda-invoke-policy` |
| `rekognitionDetectOnlyPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rekognition-detect-only-policy` |
| `rekognitionLabelsPolicy` | software.amazon.awscdk.services.sam.CfnFunction$EmptySAMPTProperty | [[cdk.support/lookup-entry]] | `:rekognition-labels-policy` |
| `rekognitionNoDataAccessPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rekognition-no-data-access-policy` |
| `rekognitionReadPolicy` | software.amazon.awscdk.services.sam.CfnFunction$CollectionSAMPTProperty | [[cdk.support/lookup-entry]] | `:rekognition-read-policy` |
| `rekognitionWriteOnlyAccessPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rekognition-write-only-access-policy` |
| `s3CrudPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-crud-policy` |
| `s3ReadPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-read-policy` |
| `s3WritePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-write-policy` |
| `sesBulkTemplatedCrudPolicy` | software.amazon.awscdk.services.sam.CfnFunction$IdentitySAMPTProperty | [[cdk.support/lookup-entry]] | `:ses-bulk-templated-crud-policy` |
| `sesCrudPolicy` | software.amazon.awscdk.services.sam.CfnFunction$IdentitySAMPTProperty | [[cdk.support/lookup-entry]] | `:ses-crud-policy` |
| `sesEmailTemplateCrudPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ses-email-template-crud-policy` |
| `sesSendBouncePolicy` | software.amazon.awscdk.services.sam.CfnFunction$IdentitySAMPTProperty | [[cdk.support/lookup-entry]] | `:ses-send-bounce-policy` |
| `snsCrudPolicy` | software.amazon.awscdk.services.sam.CfnFunction$TopicSAMPTProperty | [[cdk.support/lookup-entry]] | `:sns-crud-policy` |
| `snsPublishMessagePolicy` | software.amazon.awscdk.services.sam.CfnFunction$TopicSAMPTProperty | [[cdk.support/lookup-entry]] | `:sns-publish-message-policy` |
| `sqsPollerPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-poller-policy` |
| `sqsSendMessagePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-send-message-policy` |
| `ssmParameterReadPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ssm-parameter-read-policy` |
| `stepFunctionsExecutionPolicy` | software.amazon.awscdk.services.sam.CfnFunction$StateMachineSAMPTProperty | [[cdk.support/lookup-entry]] | `:step-functions-execution-policy` |
| `vpcAccessPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-access-policy` |
"
  [^CfnFunction$SAMPolicyTemplateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ami-describe-policy)]
    (. builder amiDescribePolicy data))
  (when-let [data (lookup-entry config id :aws-secrets-manager-get-secret-value-policy)]
    (. builder awsSecretsManagerGetSecretValuePolicy data))
  (when-let [data (lookup-entry config id :cloud-formation-describe-stacks-policy)]
    (. builder cloudFormationDescribeStacksPolicy data))
  (when-let [data (lookup-entry config id :cloud-watch-put-metric-policy)]
    (. builder cloudWatchPutMetricPolicy data))
  (when-let [data (lookup-entry config id :dynamo-db-crud-policy)]
    (. builder dynamoDbCrudPolicy data))
  (when-let [data (lookup-entry config id :dynamo-db-read-policy)]
    (. builder dynamoDbReadPolicy data))
  (when-let [data (lookup-entry config id :dynamo-db-stream-read-policy)]
    (. builder dynamoDbStreamReadPolicy data))
  (when-let [data (lookup-entry config id :dynamo-db-write-policy)]
    (. builder dynamoDbWritePolicy data))
  (when-let [data (lookup-entry config id :ec2-describe-policy)]
    (. builder ec2DescribePolicy data))
  (when-let [data (lookup-entry config id :elasticsearch-http-post-policy)]
    (. builder elasticsearchHttpPostPolicy data))
  (when-let [data (lookup-entry config id :filter-log-events-policy)]
    (. builder filterLogEventsPolicy data))
  (when-let [data (lookup-entry config id :kinesis-crud-policy)]
    (. builder kinesisCrudPolicy data))
  (when-let [data (lookup-entry config id :kinesis-stream-read-policy)]
    (. builder kinesisStreamReadPolicy data))
  (when-let [data (lookup-entry config id :kms-decrypt-policy)]
    (. builder kmsDecryptPolicy data))
  (when-let [data (lookup-entry config id :lambda-invoke-policy)]
    (. builder lambdaInvokePolicy data))
  (when-let [data (lookup-entry config id :rekognition-detect-only-policy)]
    (. builder rekognitionDetectOnlyPolicy data))
  (when-let [data (lookup-entry config id :rekognition-labels-policy)]
    (. builder rekognitionLabelsPolicy data))
  (when-let [data (lookup-entry config id :rekognition-no-data-access-policy)]
    (. builder rekognitionNoDataAccessPolicy data))
  (when-let [data (lookup-entry config id :rekognition-read-policy)]
    (. builder rekognitionReadPolicy data))
  (when-let [data (lookup-entry config id :rekognition-write-only-access-policy)]
    (. builder rekognitionWriteOnlyAccessPolicy data))
  (when-let [data (lookup-entry config id :s3-crud-policy)]
    (. builder s3CrudPolicy data))
  (when-let [data (lookup-entry config id :s3-read-policy)]
    (. builder s3ReadPolicy data))
  (when-let [data (lookup-entry config id :s3-write-policy)]
    (. builder s3WritePolicy data))
  (when-let [data (lookup-entry config id :ses-bulk-templated-crud-policy)]
    (. builder sesBulkTemplatedCrudPolicy data))
  (when-let [data (lookup-entry config id :ses-crud-policy)]
    (. builder sesCrudPolicy data))
  (when-let [data (lookup-entry config id :ses-email-template-crud-policy)]
    (. builder sesEmailTemplateCrudPolicy data))
  (when-let [data (lookup-entry config id :ses-send-bounce-policy)]
    (. builder sesSendBouncePolicy data))
  (when-let [data (lookup-entry config id :sns-crud-policy)]
    (. builder snsCrudPolicy data))
  (when-let [data (lookup-entry config id :sns-publish-message-policy)]
    (. builder snsPublishMessagePolicy data))
  (when-let [data (lookup-entry config id :sqs-poller-policy)]
    (. builder sqsPollerPolicy data))
  (when-let [data (lookup-entry config id :sqs-send-message-policy)]
    (. builder sqsSendMessagePolicy data))
  (when-let [data (lookup-entry config id :ssm-parameter-read-policy)]
    (. builder ssmParameterReadPolicy data))
  (when-let [data (lookup-entry config id :step-functions-execution-policy)]
    (. builder stepFunctionsExecutionPolicy data))
  (when-let [data (lookup-entry config id :vpc-access-policy)]
    (. builder vpcAccessPolicy data))
  (.build builder))


(defn cfn-function-sam-policy-template-property-builder
  "Creates a  `CfnFunction$SAMPolicyTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-sam-policy-template-property-builder (new CfnFunction$SAMPolicyTemplateProperty$Builder) id config))


(defn build-cfn-function-schedule-event-property-builder
  "The build-cfn-function-schedule-event-property-builder function updates a CfnFunction$ScheduleEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$ScheduleEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
"
  [^CfnFunction$ScheduleEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (.build builder))


(defn cfn-function-schedule-event-property-builder
  "Creates a  `CfnFunction$ScheduleEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-schedule-event-property-builder (new CfnFunction$ScheduleEventProperty$Builder) id config))


(defn build-cfn-function-secret-arn-sampt-property-builder
  "The build-cfn-function-secret-arn-sampt-property-builder function updates a CfnFunction$SecretArnSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$SecretArnSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnFunction$SecretArnSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-function-secret-arn-sampt-property-builder
  "Creates a  `CfnFunction$SecretArnSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-secret-arn-sampt-property-builder (new CfnFunction$SecretArnSAMPTProperty$Builder) id config))


(defn build-cfn-function-sns-event-property-builder
  "The build-cfn-function-sns-event-property-builder function updates a CfnFunction$SNSEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$SNSEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^CfnFunction$SNSEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn cfn-function-sns-event-property-builder
  "Creates a  `CfnFunction$SNSEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-sns-event-property-builder (new CfnFunction$SNSEventProperty$Builder) id config))


(defn build-cfn-function-sqs-event-property-builder
  "The build-cfn-function-sqs-event-property-builder function updates a CfnFunction$SQSEventProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$SQSEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |
"
  [^CfnFunction$SQSEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :queue)]
    (. builder queue data))
  (.build builder))


(defn cfn-function-sqs-event-property-builder
  "Creates a  `CfnFunction$SQSEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-sqs-event-property-builder (new CfnFunction$SQSEventProperty$Builder) id config))


(defn build-cfn-function-state-machine-sampt-property-builder
  "The build-cfn-function-state-machine-sampt-property-builder function updates a CfnFunction$StateMachineSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$StateMachineSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |
"
  [^CfnFunction$StateMachineSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :state-machine-name)]
    (. builder stateMachineName data))
  (.build builder))


(defn cfn-function-state-machine-sampt-property-builder
  "Creates a  `CfnFunction$StateMachineSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-state-machine-sampt-property-builder (new CfnFunction$StateMachineSAMPTProperty$Builder) id config))


(defn build-cfn-function-stream-sampt-property-builder
  "The build-cfn-function-stream-sampt-property-builder function updates a CfnFunction$StreamSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$StreamSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
"
  [^CfnFunction$StreamSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (.build builder))


(defn cfn-function-stream-sampt-property-builder
  "Creates a  `CfnFunction$StreamSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-stream-sampt-property-builder (new CfnFunction$StreamSAMPTProperty$Builder) id config))


(defn build-cfn-function-table-sampt-property-builder
  "The build-cfn-function-table-sampt-property-builder function updates a CfnFunction$TableSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$TableSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnFunction$TableSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-function-table-sampt-property-builder
  "Creates a  `CfnFunction$TableSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-table-sampt-property-builder (new CfnFunction$TableSAMPTProperty$Builder) id config))


(defn build-cfn-function-table-stream-sampt-property-builder
  "The build-cfn-function-table-stream-sampt-property-builder function updates a CfnFunction$TableStreamSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$TableStreamSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnFunction$TableStreamSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-function-table-stream-sampt-property-builder
  "Creates a  `CfnFunction$TableStreamSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-table-stream-sampt-property-builder (new CfnFunction$TableStreamSAMPTProperty$Builder) id config))


(defn build-cfn-function-topic-sampt-property-builder
  "The build-cfn-function-topic-sampt-property-builder function updates a CfnFunction$TopicSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$TopicSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
"
  [^CfnFunction$TopicSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (.build builder))


(defn cfn-function-topic-sampt-property-builder
  "Creates a  `CfnFunction$TopicSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-topic-sampt-property-builder (new CfnFunction$TopicSAMPTProperty$Builder) id config))


(defn build-cfn-function-vpc-config-property-builder
  "The build-cfn-function-vpc-config-property-builder function updates a CfnFunction$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnFunction$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-function-vpc-config-property-builder
  "Creates a  `CfnFunction$VpcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-vpc-config-property-builder (new CfnFunction$VpcConfigProperty$Builder) id config))


(defn build-cfn-http-api-access-log-setting-property-builder
  "The build-cfn-http-api-access-log-setting-property-builder function updates a CfnHttpApi$AccessLogSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$AccessLogSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
"
  [^CfnHttpApi$AccessLogSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (.build builder))


(defn cfn-http-api-access-log-setting-property-builder
  "Creates a  `CfnHttpApi$AccessLogSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-access-log-setting-property-builder (new CfnHttpApi$AccessLogSettingProperty$Builder) id config))


(defn build-cfn-http-api-builder
  "The build-cfn-http-api-builder function updates a CfnHttpApi$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-log-setting` |
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `corsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors-configuration` |
| `defaultRouteSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-route-settings` |
| `definitionBody` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition-body` |
| `definitionUri` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domain` | software.amazon.awscdk.services.sam.CfnHttpApi$HttpApiDomainConfigurationProperty | [[cdk.support/lookup-entry]] | `:domain` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `routeSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route-settings` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `stageVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:stage-variables` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnHttpApi$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log-setting)]
    (. builder accessLogSetting data))
  (when-let [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-let [data (lookup-entry config id :cors-configuration)]
    (. builder corsConfiguration data))
  (when-let [data (lookup-entry config id :default-route-settings)]
    (. builder defaultRouteSettings data))
  (when-let [data (lookup-entry config id :definition-body)]
    (. builder definitionBody data))
  (when-let [data (lookup-entry config id :definition-uri)]
    (. builder definitionUri data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
    (. builder disableExecuteApiEndpoint data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :fail-on-warnings)]
    (. builder failOnWarnings data))
  (when-let [data (lookup-entry config id :route-settings)]
    (. builder routeSettings data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :stage-variables)]
    (. builder stageVariables data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-http-api-builder
  "Creates a  `CfnHttpApi$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-http-api-builder (CfnHttpApi$Builder/create scope (name id)) id config))


(defn build-cfn-http-api-cors-configuration-object-property-builder
  "The build-cfn-http-api-cors-configuration-object-property-builder function updates a CfnHttpApi$CorsConfigurationObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$CorsConfigurationObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
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
  [^CfnHttpApi$CorsConfigurationObjectProperty$Builder builder id config]
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


(defn cfn-http-api-cors-configuration-object-property-builder
  "Creates a  `CfnHttpApi$CorsConfigurationObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-cors-configuration-object-property-builder (new CfnHttpApi$CorsConfigurationObjectProperty$Builder) id config))


(defn build-cfn-http-api-http-api-auth-property-builder
  "The build-cfn-http-api-http-api-auth-property-builder function updates a CfnHttpApi$HttpApiAuthProperty$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$HttpApiAuthProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizers` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authorizers` |
| `defaultAuthorizer` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authorizer` |
"
  [^CfnHttpApi$HttpApiAuthProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizers)]
    (. builder authorizers data))
  (when-let [data (lookup-entry config id :default-authorizer)]
    (. builder defaultAuthorizer data))
  (.build builder))


(defn cfn-http-api-http-api-auth-property-builder
  "Creates a  `CfnHttpApi$HttpApiAuthProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-http-api-auth-property-builder (new CfnHttpApi$HttpApiAuthProperty$Builder) id config))


(defn build-cfn-http-api-http-api-domain-configuration-property-builder
  "The build-cfn-http-api-http-api-domain-configuration-property-builder function updates a CfnHttpApi$HttpApiDomainConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$HttpApiDomainConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `route53` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route53` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
"
  [^CfnHttpApi$HttpApiDomainConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base-path)]
    (. builder basePath data))
  (when-let [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :endpoint-configuration)]
    (. builder endpointConfiguration data))
  (when-let [data (lookup-entry config id :mutual-tls-authentication)]
    (. builder mutualTlsAuthentication data))
  (when-let [data (lookup-entry config id :route53)]
    (. builder route53 data))
  (when-let [data (lookup-entry config id :security-policy)]
    (. builder securityPolicy data))
  (.build builder))


(defn cfn-http-api-http-api-domain-configuration-property-builder
  "Creates a  `CfnHttpApi$HttpApiDomainConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-http-api-domain-configuration-property-builder (new CfnHttpApi$HttpApiDomainConfigurationProperty$Builder) id config))


(defn build-cfn-http-api-mutual-tls-authentication-property-builder
  "The build-cfn-http-api-mutual-tls-authentication-property-builder function updates a CfnHttpApi$MutualTlsAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$MutualTlsAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `truststoreUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-uri` |
| `truststoreVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:truststore-version` |
"
  [^CfnHttpApi$MutualTlsAuthenticationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :truststore-uri)]
    (. builder truststoreUri data))
  (when-let [data (lookup-entry config id :truststore-version)]
    (. builder truststoreVersion data))
  (.build builder))


(defn cfn-http-api-mutual-tls-authentication-property-builder
  "Creates a  `CfnHttpApi$MutualTlsAuthenticationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-mutual-tls-authentication-property-builder (new CfnHttpApi$MutualTlsAuthenticationProperty$Builder) id config))


(defn build-cfn-http-api-props-builder
  "The build-cfn-http-api-props-builder function updates a CfnHttpApiProps$Builder instance using the provided configuration.
  The function takes the CfnHttpApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLogSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-log-setting` |
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `corsConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cors-configuration` |
| `defaultRouteSettings` | software.amazon.awscdk.services.sam.CfnHttpApi$RouteSettingsProperty | [[cdk.support/lookup-entry]] | `:default-route-settings` |
| `definitionBody` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition-body` |
| `definitionUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableExecuteApiEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-execute-api-endpoint` |
| `domain` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain` |
| `failOnWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-on-warnings` |
| `routeSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route-settings` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `stageVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stage-variables` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnHttpApiProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-log-setting)]
    (. builder accessLogSetting data))
  (when-let [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-let [data (lookup-entry config id :cors-configuration)]
    (. builder corsConfiguration data))
  (when-let [data (lookup-entry config id :default-route-settings)]
    (. builder defaultRouteSettings data))
  (when-let [data (lookup-entry config id :definition-body)]
    (. builder definitionBody data))
  (when-let [data (lookup-entry config id :definition-uri)]
    (. builder definitionUri data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-execute-api-endpoint)]
    (. builder disableExecuteApiEndpoint data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :fail-on-warnings)]
    (. builder failOnWarnings data))
  (when-let [data (lookup-entry config id :route-settings)]
    (. builder routeSettings data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :stage-variables)]
    (. builder stageVariables data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-http-api-props-builder
  "Creates a  `CfnHttpApiProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-props-builder (new CfnHttpApiProps$Builder) id config))


(defn build-cfn-http-api-route-settings-property-builder
  "The build-cfn-http-api-route-settings-property-builder function updates a CfnHttpApi$RouteSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$RouteSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `detailedMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detailed-metrics-enabled` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |
"
  [^CfnHttpApi$RouteSettingsProperty$Builder builder id config]
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


(defn cfn-http-api-route-settings-property-builder
  "Creates a  `CfnHttpApi$RouteSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-route-settings-property-builder (new CfnHttpApi$RouteSettingsProperty$Builder) id config))


(defn build-cfn-http-api-route53-configuration-property-builder
  "The build-cfn-http-api-route53-configuration-property-builder function updates a CfnHttpApi$Route53ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$Route53ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributedDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributed-domain-name` |
| `evaluateTargetHealth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:evaluate-target-health` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `ipV6` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-v6` |
"
  [^CfnHttpApi$Route53ConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :distributed-domain-name)]
    (. builder distributedDomainName data))
  (when-let [data (lookup-entry config id :evaluate-target-health)]
    (. builder evaluateTargetHealth data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :hosted-zone-name)]
    (. builder hostedZoneName data))
  (when-let [data (lookup-entry config id :ip-v6)]
    (. builder ipV6 data))
  (.build builder))


(defn cfn-http-api-route53-configuration-property-builder
  "Creates a  `CfnHttpApi$Route53ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-route53-configuration-property-builder (new CfnHttpApi$Route53ConfigurationProperty$Builder) id config))


(defn build-cfn-http-api-s3-location-property-builder
  "The build-cfn-http-api-s3-location-property-builder function updates a CfnHttpApi$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnHttpApi$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnHttpApi$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-http-api-s3-location-property-builder
  "Creates a  `CfnHttpApi$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-api-s3-location-property-builder (new CfnHttpApi$S3LocationProperty$Builder) id config))


(defn build-cfn-layer-version-builder
  "The build-cfn-layer-version-builder function updates a CfnLayerVersion$Builder instance using the provided configuration.
  The function takes the CfnLayerVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `contentUri` | software.amazon.awscdk.services.sam.CfnLayerVersion$S3LocationProperty | [[cdk.support/lookup-entry]] | `:content-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-name` |
| `licenseInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-info` |
| `retentionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:retention-policy` |
"
  [^CfnLayerVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :compatible-runtimes)]
    (. builder compatibleRuntimes data))
  (when-let [data (lookup-entry config id :content-uri)]
    (. builder contentUri data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :layer-name)]
    (. builder layerName data))
  (when-let [data (lookup-entry config id :license-info)]
    (. builder licenseInfo data))
  (when-let [data (lookup-entry config id :retention-policy)]
    (. builder retentionPolicy data))
  (.build builder))


(defn cfn-layer-version-builder
  "Creates a  `CfnLayerVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-layer-version-builder (CfnLayerVersion$Builder/create scope (name id)) id config))


(defn build-cfn-layer-version-props-builder
  "The build-cfn-layer-version-props-builder function updates a CfnLayerVersionProps$Builder instance using the provided configuration.
  The function takes the CfnLayerVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `contentUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-name` |
| `licenseInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-info` |
| `retentionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:retention-policy` |
"
  [^CfnLayerVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :compatible-runtimes)]
    (. builder compatibleRuntimes data))
  (when-let [data (lookup-entry config id :content-uri)]
    (. builder contentUri data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :layer-name)]
    (. builder layerName data))
  (when-let [data (lookup-entry config id :license-info)]
    (. builder licenseInfo data))
  (when-let [data (lookup-entry config id :retention-policy)]
    (. builder retentionPolicy data))
  (.build builder))


(defn cfn-layer-version-props-builder
  "Creates a  `CfnLayerVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-layer-version-props-builder (new CfnLayerVersionProps$Builder) id config))


(defn build-cfn-layer-version-s3-location-property-builder
  "The build-cfn-layer-version-s3-location-property-builder function updates a CfnLayerVersion$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnLayerVersion$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnLayerVersion$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-layer-version-s3-location-property-builder
  "Creates a  `CfnLayerVersion$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-layer-version-s3-location-property-builder (new CfnLayerVersion$S3LocationProperty$Builder) id config))


(defn build-cfn-simple-table-builder
  "The build-cfn-simple-table-builder function updates a CfnSimpleTable$Builder instance using the provided configuration.
  The function takes the CfnSimpleTable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primaryKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-key` |
| `provisionedThroughput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
| `sseSpecification` | software.amazon.awscdk.services.sam.CfnSimpleTable$SSESpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSimpleTable$Builder builder id config]
  (when-let [data (lookup-entry config id :primary-key)]
    (. builder primaryKey data))
  (when-let [data (lookup-entry config id :provisioned-throughput)]
    (. builder provisionedThroughput data))
  (when-let [data (lookup-entry config id :sse-specification)]
    (. builder sseSpecification data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-simple-table-builder
  "Creates a  `CfnSimpleTable$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-simple-table-builder (CfnSimpleTable$Builder/create scope (name id)) id config))


(defn build-cfn-simple-table-primary-key-property-builder
  "The build-cfn-simple-table-primary-key-property-builder function updates a CfnSimpleTable$PrimaryKeyProperty$Builder instance using the provided configuration.
  The function takes the CfnSimpleTable$PrimaryKeyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSimpleTable$PrimaryKeyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-simple-table-primary-key-property-builder
  "Creates a  `CfnSimpleTable$PrimaryKeyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-simple-table-primary-key-property-builder (new CfnSimpleTable$PrimaryKeyProperty$Builder) id config))


(defn build-cfn-simple-table-props-builder
  "The build-cfn-simple-table-props-builder function updates a CfnSimpleTableProps$Builder instance using the provided configuration.
  The function takes the CfnSimpleTableProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primaryKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-key` |
| `provisionedThroughput` | software.amazon.awscdk.services.sam.CfnSimpleTable$ProvisionedThroughputProperty | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
| `sseSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSimpleTableProps$Builder builder id config]
  (when-let [data (lookup-entry config id :primary-key)]
    (. builder primaryKey data))
  (when-let [data (lookup-entry config id :provisioned-throughput)]
    (. builder provisionedThroughput data))
  (when-let [data (lookup-entry config id :sse-specification)]
    (. builder sseSpecification data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-simple-table-props-builder
  "Creates a  `CfnSimpleTableProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-simple-table-props-builder (new CfnSimpleTableProps$Builder) id config))


(defn build-cfn-simple-table-provisioned-throughput-property-builder
  "The build-cfn-simple-table-provisioned-throughput-property-builder function updates a CfnSimpleTable$ProvisionedThroughputProperty$Builder instance using the provided configuration.
  The function takes the CfnSimpleTable$ProvisionedThroughputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity-units` |
| `writeCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity-units` |
"
  [^CfnSimpleTable$ProvisionedThroughputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :read-capacity-units)]
    (. builder readCapacityUnits data))
  (when-let [data (lookup-entry config id :write-capacity-units)]
    (. builder writeCapacityUnits data))
  (.build builder))


(defn cfn-simple-table-provisioned-throughput-property-builder
  "Creates a  `CfnSimpleTable$ProvisionedThroughputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-simple-table-provisioned-throughput-property-builder (new CfnSimpleTable$ProvisionedThroughputProperty$Builder) id config))


(defn build-cfn-simple-table-sse-specification-property-builder
  "The build-cfn-simple-table-sse-specification-property-builder function updates a CfnSimpleTable$SSESpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnSimpleTable$SSESpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sseEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sse-enabled` |
"
  [^CfnSimpleTable$SSESpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sse-enabled)]
    (. builder sseEnabled data))
  (.build builder))


(defn cfn-simple-table-sse-specification-property-builder
  "Creates a  `CfnSimpleTable$SSESpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-simple-table-sse-specification-property-builder (new CfnSimpleTable$SSESpecificationProperty$Builder) id config))


(defn build-cfn-state-machine-api-event-property-builder
  "The build-cfn-state-machine-api-event-property-builder function updates a CfnStateMachine$ApiEventProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$ApiEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |
"
  [^CfnStateMachine$ApiEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :rest-api-id)]
    (. builder restApiId data))
  (.build builder))


(defn cfn-state-machine-api-event-property-builder
  "Creates a  `CfnStateMachine$ApiEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-api-event-property-builder (new CfnStateMachine$ApiEventProperty$Builder) id config))


(defn build-cfn-state-machine-builder
  "The build-cfn-state-machine-builder function updates a CfnStateMachine$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionSubstitutions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition-substitutions` |
| `definitionUri` | software.amazon.awscdk.services.sam.CfnStateMachine$S3LocationProperty | [[cdk.support/lookup-entry]] | `:definition-uri` |
| `events` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:events` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsBoundaries` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundaries` |
| `policies` | software.amazon.awscdk.services.sam.CfnStateMachine$IAMPolicyDocumentProperty | [[cdk.support/lookup-entry]] | `:policies` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tracing` | software.amazon.awscdk.services.sam.CfnStateMachine$TracingConfigurationProperty | [[cdk.support/lookup-entry]] | `:tracing` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnStateMachine$Builder builder id config]
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :definition-substitutions)]
    (. builder definitionSubstitutions data))
  (when-let [data (lookup-entry config id :definition-uri)]
    (. builder definitionUri data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :permissions-boundaries)]
    (. builder permissionsBoundaries data))
  (when-let [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-state-machine-builder
  "Creates a  `CfnStateMachine$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-state-machine-builder (CfnStateMachine$Builder/create scope (name id)) id config))


(defn build-cfn-state-machine-cloud-watch-event-event-property-builder
  "The build-cfn-state-machine-cloud-watch-event-event-property-builder function updates a CfnStateMachine$CloudWatchEventEventProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$CloudWatchEventEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `pattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pattern` |
"
  [^CfnStateMachine$CloudWatchEventEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus-name)]
    (. builder eventBusName data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (.build builder))


(defn cfn-state-machine-cloud-watch-event-event-property-builder
  "Creates a  `CfnStateMachine$CloudWatchEventEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-cloud-watch-event-event-property-builder (new CfnStateMachine$CloudWatchEventEventProperty$Builder) id config))


(defn build-cfn-state-machine-cloud-watch-logs-log-group-property-builder
  "The build-cfn-state-machine-cloud-watch-logs-log-group-property-builder function updates a CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
"
  [^CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-arn)]
    (. builder logGroupArn data))
  (.build builder))


(defn cfn-state-machine-cloud-watch-logs-log-group-property-builder
  "Creates a  `CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-cloud-watch-logs-log-group-property-builder (new CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder) id config))


(defn build-cfn-state-machine-event-bridge-rule-event-property-builder
  "The build-cfn-state-machine-event-bridge-rule-event-property-builder function updates a CfnStateMachine$EventBridgeRuleEventProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$EventBridgeRuleEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `pattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pattern` |
"
  [^CfnStateMachine$EventBridgeRuleEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus-name)]
    (. builder eventBusName data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (.build builder))


(defn cfn-state-machine-event-bridge-rule-event-property-builder
  "Creates a  `CfnStateMachine$EventBridgeRuleEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-event-bridge-rule-event-property-builder (new CfnStateMachine$EventBridgeRuleEventProperty$Builder) id config))


(defn build-cfn-state-machine-event-source-property-builder
  "The build-cfn-state-machine-event-source-property-builder function updates a CfnStateMachine$EventSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$EventSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | software.amazon.awscdk.services.sam.CfnStateMachine$ApiEventProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnStateMachine$EventSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-state-machine-event-source-property-builder
  "Creates a  `CfnStateMachine$EventSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-event-source-property-builder (new CfnStateMachine$EventSourceProperty$Builder) id config))


(defn build-cfn-state-machine-function-sampt-property-builder
  "The build-cfn-state-machine-function-sampt-property-builder function updates a CfnStateMachine$FunctionSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$FunctionSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
"
  [^CfnStateMachine$FunctionSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (.build builder))


(defn cfn-state-machine-function-sampt-property-builder
  "Creates a  `CfnStateMachine$FunctionSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-function-sampt-property-builder (new CfnStateMachine$FunctionSAMPTProperty$Builder) id config))


(defn build-cfn-state-machine-iam-policy-document-property-builder
  "The build-cfn-state-machine-iam-policy-document-property-builder function updates a CfnStateMachine$IAMPolicyDocumentProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$IAMPolicyDocumentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statement` | java.lang.Object | [[cdk.support/lookup-entry]] | `:statement` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnStateMachine$IAMPolicyDocumentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statement)]
    (. builder statement data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-state-machine-iam-policy-document-property-builder
  "Creates a  `CfnStateMachine$IAMPolicyDocumentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-iam-policy-document-property-builder (new CfnStateMachine$IAMPolicyDocumentProperty$Builder) id config))


(defn build-cfn-state-machine-log-destination-property-builder
  "The build-cfn-state-machine-log-destination-property-builder function updates a CfnStateMachine$LogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$LogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsLogGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group` |
"
  [^CfnStateMachine$LogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-logs-log-group)]
    (. builder cloudWatchLogsLogGroup data))
  (.build builder))


(defn cfn-state-machine-log-destination-property-builder
  "Creates a  `CfnStateMachine$LogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-log-destination-property-builder (new CfnStateMachine$LogDestinationProperty$Builder) id config))


(defn build-cfn-state-machine-logging-configuration-property-builder
  "The build-cfn-state-machine-logging-configuration-property-builder function updates a CfnStateMachine$LoggingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$LoggingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `includeExecutionData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
"
  [^CfnStateMachine$LoggingConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :include-execution-data)]
    (. builder includeExecutionData data))
  (when-let [data (lookup-entry config id :level)]
    (. builder level data))
  (.build builder))


(defn cfn-state-machine-logging-configuration-property-builder
  "Creates a  `CfnStateMachine$LoggingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-logging-configuration-property-builder (new CfnStateMachine$LoggingConfigurationProperty$Builder) id config))


(defn build-cfn-state-machine-props-builder
  "The build-cfn-state-machine-props-builder function updates a CfnStateMachineProps$Builder instance using the provided configuration.
  The function takes the CfnStateMachineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionSubstitutions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition-substitutions` |
| `definitionUri` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition-uri` |
| `events` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:events` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsBoundaries` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundaries` |
| `policies` | software.amazon.awscdk.services.sam.CfnStateMachine$IAMPolicyDocumentProperty | [[cdk.support/lookup-entry]] | `:policies` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tracing` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnStateMachineProps$Builder builder id config]
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :definition-substitutions)]
    (. builder definitionSubstitutions data))
  (when-let [data (lookup-entry config id :definition-uri)]
    (. builder definitionUri data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :permissions-boundaries)]
    (. builder permissionsBoundaries data))
  (when-let [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-state-machine-props-builder
  "Creates a  `CfnStateMachineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-props-builder (new CfnStateMachineProps$Builder) id config))


(defn build-cfn-state-machine-s3-location-property-builder
  "The build-cfn-state-machine-s3-location-property-builder function updates a CfnStateMachine$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnStateMachine$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-state-machine-s3-location-property-builder
  "Creates a  `CfnStateMachine$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-s3-location-property-builder (new CfnStateMachine$S3LocationProperty$Builder) id config))


(defn build-cfn-state-machine-sam-policy-template-property-builder
  "The build-cfn-state-machine-sam-policy-template-property-builder function updates a CfnStateMachine$SAMPolicyTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$SAMPolicyTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaInvokePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-invoke-policy` |
| `stepFunctionsExecutionPolicy` | software.amazon.awscdk.services.sam.CfnStateMachine$StateMachineSAMPTProperty | [[cdk.support/lookup-entry]] | `:step-functions-execution-policy` |
"
  [^CfnStateMachine$SAMPolicyTemplateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda-invoke-policy)]
    (. builder lambdaInvokePolicy data))
  (when-let [data (lookup-entry config id :step-functions-execution-policy)]
    (. builder stepFunctionsExecutionPolicy data))
  (.build builder))


(defn cfn-state-machine-sam-policy-template-property-builder
  "Creates a  `CfnStateMachine$SAMPolicyTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-sam-policy-template-property-builder (new CfnStateMachine$SAMPolicyTemplateProperty$Builder) id config))


(defn build-cfn-state-machine-schedule-event-property-builder
  "The build-cfn-state-machine-schedule-event-property-builder function updates a CfnStateMachine$ScheduleEventProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$ScheduleEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
"
  [^CfnStateMachine$ScheduleEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (.build builder))


(defn cfn-state-machine-schedule-event-property-builder
  "Creates a  `CfnStateMachine$ScheduleEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-schedule-event-property-builder (new CfnStateMachine$ScheduleEventProperty$Builder) id config))


(defn build-cfn-state-machine-state-machine-sampt-property-builder
  "The build-cfn-state-machine-state-machine-sampt-property-builder function updates a CfnStateMachine$StateMachineSAMPTProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$StateMachineSAMPTProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |
"
  [^CfnStateMachine$StateMachineSAMPTProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :state-machine-name)]
    (. builder stateMachineName data))
  (.build builder))


(defn cfn-state-machine-state-machine-sampt-property-builder
  "Creates a  `CfnStateMachine$StateMachineSAMPTProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-state-machine-sampt-property-builder (new CfnStateMachine$StateMachineSAMPTProperty$Builder) id config))


(defn build-cfn-state-machine-tracing-configuration-property-builder
  "The build-cfn-state-machine-tracing-configuration-property-builder function updates a CfnStateMachine$TracingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$TracingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnStateMachine$TracingConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-state-machine-tracing-configuration-property-builder
  "Creates a  `CfnStateMachine$TracingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-tracing-configuration-property-builder (new CfnStateMachine$TracingConfigurationProperty$Builder) id config))