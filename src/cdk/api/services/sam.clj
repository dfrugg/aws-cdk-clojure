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


(defn cfn-api-access-log-setting-property-builder
  "The cfn-api-access-log-setting-property-builder function buildes out new instances of 
CfnApi$AccessLogSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |"
  [stack id config]
  (let [builder (CfnApi$AccessLogSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (.build builder)))


(defn cfn-api-auth-property-builder
  "The cfn-api-auth-property-builder function buildes out new instances of 
CfnApi$AuthProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addDefaultAuthorizerToCorsPreflight` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-default-authorizer-to-cors-preflight` |
| `authorizers` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authorizers` |
| `defaultAuthorizer` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authorizer` |"
  [stack id config]
  (let [builder (CfnApi$AuthProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-default-authorizer-to-cors-preflight)]
      (. builder addDefaultAuthorizerToCorsPreflight data))
    (when-let [data (lookup-entry config id :authorizers)]
      (. builder authorizers data))
    (when-let [data (lookup-entry config id :default-authorizer)]
      (. builder defaultAuthorizer data))
    (.build builder)))


(defn cfn-api-builder
  "The cfn-api-builder function buildes out new instances of 
CfnApi$Builder using the provided configuration.  Each field is set as follows:

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
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnApi$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-api-canary-setting-property-builder
  "The cfn-api-canary-setting-property-builder function buildes out new instances of 
CfnApi$CanarySettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-id` |
| `percentTraffic` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percent-traffic` |
| `stageVariableOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:stage-variable-overrides` |
| `useStageCache` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-stage-cache` |"
  [stack id config]
  (let [builder (CfnApi$CanarySettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :deployment-id)]
      (. builder deploymentId data))
    (when-let [data (lookup-entry config id :percent-traffic)]
      (. builder percentTraffic data))
    (when-let [data (lookup-entry config id :stage-variable-overrides)]
      (. builder stageVariableOverrides data))
    (when-let [data (lookup-entry config id :use-stage-cache)]
      (. builder useStageCache data))
    (.build builder)))


(defn cfn-api-cors-configuration-property-builder
  "The cfn-api-cors-configuration-property-builder function buildes out new instances of 
CfnApi$CorsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigin` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-origin` |
| `maxAge` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-age` |"
  [stack id config]
  (let [builder (CfnApi$CorsConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-api-domain-configuration-property-builder
  "The cfn-api-domain-configuration-property-builder function buildes out new instances of 
CfnApi$DomainConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.util.List | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `ownershipVerificationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ownership-verification-certificate-arn` |
| `route53` | software.amazon.awscdk.services.sam.CfnApi$Route53ConfigurationProperty | [[cdk.support/lookup-entry]] | `:route53` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |"
  [stack id config]
  (let [builder (CfnApi$DomainConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-api-endpoint-configuration-property-builder
  "The cfn-api-endpoint-configuration-property-builder function buildes out new instances of 
CfnApi$EndpointConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vpcEndpointIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoint-ids` |"
  [stack id config]
  (let [builder (CfnApi$EndpointConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :vpc-endpoint-ids)]
      (. builder vpcEndpointIds data))
    (.build builder)))


(defn cfn-api-mutual-tls-authentication-property-builder
  "The cfn-api-mutual-tls-authentication-property-builder function buildes out new instances of 
CfnApi$MutualTlsAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `truststoreUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-uri` |
| `truststoreVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-version` |"
  [stack id config]
  (let [builder (CfnApi$MutualTlsAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :truststore-uri)]
      (. builder truststoreUri data))
    (when-let [data (lookup-entry config id :truststore-version)]
      (. builder truststoreVersion data))
    (.build builder)))


(defn cfn-api-props-builder
  "The cfn-api-props-builder function buildes out new instances of 
CfnApiProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnApiProps$Builder.)]
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
    (.build builder)))


(defn cfn-api-route53-configuration-property-builder
  "The cfn-api-route53-configuration-property-builder function buildes out new instances of 
CfnApi$Route53ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributedDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributed-domain-name` |
| `evaluateTargetHealth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:evaluate-target-health` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `ipV6` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-v6` |"
  [stack id config]
  (let [builder (CfnApi$Route53ConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-api-s3-location-property-builder
  "The cfn-api-s3-location-property-builder function buildes out new instances of 
CfnApi$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnApi$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-application-application-location-property-builder
  "The cfn-application-application-location-property-builder function buildes out new instances of 
CfnApplication$ApplicationLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `semanticVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:semantic-version` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :semantic-version)]
      (. builder semanticVersion data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.sam.CfnApplication$ApplicationLocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.sam.CfnApplication$ApplicationLocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
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
    (.build builder)))


(defn cfn-function-alexa-skill-event-property-builder
  "The cfn-function-alexa-skill-event-property-builder function buildes out new instances of 
CfnFunction$AlexaSkillEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skillId` | java.lang.String | [[cdk.support/lookup-entry]] | `:skill-id` |"
  [stack id config]
  (let [builder (CfnFunction$AlexaSkillEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :skill-id)]
      (. builder skillId data))
    (.build builder)))


(defn cfn-function-api-event-property-builder
  "The cfn-function-api-event-property-builder function buildes out new instances of 
CfnFunction$ApiEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `requestModel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-model` |
| `requestParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnFunction$ApiEventProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-auth-property-builder
  "The cfn-function-auth-property-builder function buildes out new instances of 
CfnFunction$AuthProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizer` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer` |
| `resourcePolicy` | software.amazon.awscdk.services.sam.CfnFunction$AuthResourcePolicyProperty | [[cdk.support/lookup-entry]] | `:resource-policy` |"
  [stack id config]
  (let [builder (CfnFunction$AuthProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-key-required)]
      (. builder apiKeyRequired data))
    (when-let [data (lookup-entry config id :authorization-scopes)]
      (. builder authorizationScopes data))
    (when-let [data (lookup-entry config id :authorizer)]
      (. builder authorizer data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (.build builder)))


(defn cfn-function-auth-resource-policy-property-builder
  "The cfn-function-auth-resource-policy-property-builder function buildes out new instances of 
CfnFunction$AuthResourcePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `sourceVpcWhitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:source-vpc-whitelist` |"
  [stack id config]
  (let [builder (CfnFunction$AuthResourcePolicyProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-bucket-sampt-property-builder
  "The cfn-function-bucket-sampt-property-builder function buildes out new instances of 
CfnFunction$BucketSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |"
  [stack id config]
  (let [builder (CfnFunction$BucketSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (.build builder)))


(defn cfn-function-builder
  "The cfn-function-builder function buildes out new instances of 
CfnFunction$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.sam.CfnFunction$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnFunction$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-function-cloud-watch-event-event-property-builder
  "The cfn-function-cloud-watch-event-event-property-builder function buildes out new instances of 
CfnFunction$CloudWatchEventEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `pattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pattern` |"
  [stack id config]
  (let [builder (CfnFunction$CloudWatchEventEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (.build builder)))


(defn cfn-function-cloud-watch-logs-event-property-builder
  "The cfn-function-cloud-watch-logs-event-property-builder function buildes out new instances of 
CfnFunction$CloudWatchLogsEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |"
  [stack id config]
  (let [builder (CfnFunction$CloudWatchLogsEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (.build builder)))


(defn cfn-function-cognito-event-property-builder
  "The cfn-function-cognito-event-property-builder function buildes out new instances of 
CfnFunction$CognitoEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `trigger` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger` |
| `userPool` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool` |"
  [stack id config]
  (let [builder (CfnFunction$CognitoEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :trigger)]
      (. builder trigger data))
    (when-let [data (lookup-entry config id :user-pool)]
      (. builder userPool data))
    (.build builder)))


(defn cfn-function-collection-sampt-property-builder
  "The cfn-function-collection-sampt-property-builder function buildes out new instances of 
CfnFunction$CollectionSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |"
  [stack id config]
  (let [builder (CfnFunction$CollectionSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :collection-id)]
      (. builder collectionId data))
    (.build builder)))


(defn cfn-function-cors-configuration-property-builder
  "The cfn-function-cors-configuration-property-builder function buildes out new instances of 
CfnFunction$CorsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigin` | java.lang.String | [[cdk.support/lookup-entry]] | `:allow-origin` |
| `maxAge` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-age` |"
  [stack id config]
  (let [builder (CfnFunction$CorsConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-dead-letter-queue-property-builder
  "The cfn-function-dead-letter-queue-property-builder function buildes out new instances of 
CfnFunction$DeadLetterQueueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnFunction$DeadLetterQueueProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-function-deployment-preference-property-builder
  "The cfn-function-deployment-preference-property-builder function buildes out new instances of 
CfnFunction$DeploymentPreferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `hooks` | software.amazon.awscdk.services.sam.CfnFunction$HooksProperty | [[cdk.support/lookup-entry]] | `:hooks` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnFunction$DeploymentPreferenceProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-destination-config-property-builder
  "The cfn-function-destination-config-property-builder function buildes out new instances of 
CfnFunction$DestinationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-failure` |"
  [stack id config]
  (let [builder (CfnFunction$DestinationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (.build builder)))


(defn cfn-function-destination-property-builder
  "The cfn-function-destination-property-builder function buildes out new instances of 
CfnFunction$DestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnFunction$DestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-function-domain-sampt-property-builder
  "The cfn-function-domain-sampt-property-builder function buildes out new instances of 
CfnFunction$DomainSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |"
  [stack id config]
  (let [builder (CfnFunction$DomainSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (.build builder)))


(defn cfn-function-dynamo-db-event-property-builder
  "The cfn-function-dynamo-db-event-property-builder function buildes out new instances of 
CfnFunction$DynamoDBEventProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `stream` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream` |"
  [stack id config]
  (let [builder (CfnFunction$DynamoDBEventProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-empty-sampt-property-builder
  "The cfn-function-empty-sampt-property-builder function buildes out new instances of 
CfnFunction$EmptySAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnFunction$EmptySAMPTProperty$Builder.)]
    (.build builder)))


(defn cfn-function-ephemeral-storage-property-builder
  "The cfn-function-ephemeral-storage-property-builder function buildes out new instances of 
CfnFunction$EphemeralStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (CfnFunction$EphemeralStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (.build builder)))


(defn cfn-function-event-bridge-rule-event-property-builder
  "The cfn-function-event-bridge-rule-event-property-builder function buildes out new instances of 
CfnFunction$EventBridgeRuleEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `pattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pattern` |"
  [stack id config]
  (let [builder (CfnFunction$EventBridgeRuleEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (.build builder)))


(defn cfn-function-event-invoke-config-property-builder
  "The cfn-function-event-invoke-config-property-builder function buildes out new instances of 
CfnFunction$EventInvokeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfig` | software.amazon.awscdk.services.sam.CfnFunction$EventInvokeDestinationConfigProperty | [[cdk.support/lookup-entry]] | `:destination-config` |
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |"
  [stack id config]
  (let [builder (CfnFunction$EventInvokeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-config)]
      (. builder destinationConfig data))
    (when-let [data (lookup-entry config id :maximum-event-age-in-seconds)]
      (. builder maximumEventAgeInSeconds data))
    (when-let [data (lookup-entry config id :maximum-retry-attempts)]
      (. builder maximumRetryAttempts data))
    (.build builder)))


(defn cfn-function-event-invoke-destination-config-property-builder
  "The cfn-function-event-invoke-destination-config-property-builder function buildes out new instances of 
CfnFunction$EventInvokeDestinationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-success` |"
  [stack id config]
  (let [builder (CfnFunction$EventInvokeDestinationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (when-let [data (lookup-entry config id :on-success)]
      (. builder onSuccess data))
    (.build builder)))


(defn cfn-function-event-source-property-builder
  "The cfn-function-event-source-property-builder function buildes out new instances of 
CfnFunction$EventSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | software.amazon.awscdk.services.sam.CfnFunction$KinesisEventProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnFunction$EventSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-function-file-system-config-property-builder
  "The cfn-function-file-system-config-property-builder function buildes out new instances of 
CfnFunction$FileSystemConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `localMountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-mount-path` |"
  [stack id config]
  (let [builder (CfnFunction$FileSystemConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :local-mount-path)]
      (. builder localMountPath data))
    (.build builder)))


(defn cfn-function-function-environment-property-builder
  "The cfn-function-function-environment-property-builder function buildes out new instances of 
CfnFunction$FunctionEnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `variables` | java.util.Map | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnFunction$FunctionEnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-function-function-sampt-property-builder
  "The cfn-function-function-sampt-property-builder function buildes out new instances of 
CfnFunction$FunctionSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |"
  [stack id config]
  (let [builder (CfnFunction$FunctionSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (.build builder)))


(defn cfn-function-function-url-config-property-builder
  "The cfn-function-function-url-config-property-builder function buildes out new instances of 
CfnFunction$FunctionUrlConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `cors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors` |
| `invokeMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:invoke-mode` |"
  [stack id config]
  (let [builder (CfnFunction$FunctionUrlConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :cors)]
      (. builder cors data))
    (when-let [data (lookup-entry config id :invoke-mode)]
      (. builder invokeMode data))
    (.build builder)))


(defn cfn-function-hooks-property-builder
  "The cfn-function-hooks-property-builder function buildes out new instances of 
CfnFunction$HooksProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `postTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-traffic` |
| `preTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-traffic` |"
  [stack id config]
  (let [builder (CfnFunction$HooksProperty$Builder.)]
    (when-let [data (lookup-entry config id :post-traffic)]
      (. builder postTraffic data))
    (when-let [data (lookup-entry config id :pre-traffic)]
      (. builder preTraffic data))
    (.build builder)))


(defn cfn-function-http-api-event-property-builder
  "The cfn-function-http-api-event-property-builder function buildes out new instances of 
CfnFunction$HttpApiEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `payloadFormatVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-format-version` |
| `routeSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route-settings` |
| `timeoutInMillis` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-millis` |"
  [stack id config]
  (let [builder (CfnFunction$HttpApiEventProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-http-api-function-auth-property-builder
  "The cfn-function-http-api-function-auth-property-builder function buildes out new instances of 
CfnFunction$HttpApiFunctionAuthProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizer` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer` |"
  [stack id config]
  (let [builder (CfnFunction$HttpApiFunctionAuthProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-scopes)]
      (. builder authorizationScopes data))
    (when-let [data (lookup-entry config id :authorizer)]
      (. builder authorizer data))
    (.build builder)))


(defn cfn-function-iam-policy-document-property-builder
  "The cfn-function-iam-policy-document-property-builder function buildes out new instances of 
CfnFunction$IAMPolicyDocumentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statement` | java.lang.Object | [[cdk.support/lookup-entry]] | `:statement` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnFunction$IAMPolicyDocumentProperty$Builder.)]
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-function-identity-sampt-property-builder
  "The cfn-function-identity-sampt-property-builder function buildes out new instances of 
CfnFunction$IdentitySAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-name` |"
  [stack id config]
  (let [builder (CfnFunction$IdentitySAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :identity-name)]
      (. builder identityName data))
    (.build builder)))


(defn cfn-function-image-config-property-builder
  "The cfn-function-image-config-property-builder function buildes out new instances of 
CfnFunction$ImageConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnFunction$ImageConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-function-io-t-rule-event-property-builder
  "The cfn-function-io-t-rule-event-property-builder function buildes out new instances of 
CfnFunction$IoTRuleEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsIotSqlVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-iot-sql-version` |
| `sql` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql` |"
  [stack id config]
  (let [builder (CfnFunction$IoTRuleEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-iot-sql-version)]
      (. builder awsIotSqlVersion data))
    (when-let [data (lookup-entry config id :sql)]
      (. builder sql data))
    (.build builder)))


(defn cfn-function-key-sampt-property-builder
  "The cfn-function-key-sampt-property-builder function buildes out new instances of 
CfnFunction$KeySAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |"
  [stack id config]
  (let [builder (CfnFunction$KeySAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-id)]
      (. builder keyId data))
    (.build builder)))


(defn cfn-function-kinesis-event-property-builder
  "The cfn-function-kinesis-event-property-builder function buildes out new instances of 
CfnFunction$KinesisEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `functionResponseTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:function-response-types` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `stream` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream` |"
  [stack id config]
  (let [builder (CfnFunction$KinesisEventProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-log-group-sampt-property-builder
  "The cfn-function-log-group-sampt-property-builder function buildes out new instances of 
CfnFunction$LogGroupSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |"
  [stack id config]
  (let [builder (CfnFunction$LogGroupSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (.build builder)))


(defn cfn-function-parameter-name-sampt-property-builder
  "The cfn-function-parameter-name-sampt-property-builder function buildes out new instances of 
CfnFunction$ParameterNameSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |"
  [stack id config]
  (let [builder (CfnFunction$ParameterNameSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (.build builder)))


(defn cfn-function-props-builder
  "The cfn-function-props-builder function buildes out new instances of 
CfnFunctionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.sam.CfnFunction$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnFunctionProps$Builder.)]
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
    (.build builder)))


(defn cfn-function-provisioned-concurrency-config-property-builder
  "The cfn-function-provisioned-concurrency-config-property-builder function buildes out new instances of 
CfnFunction$ProvisionedConcurrencyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedConcurrentExecutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |"
  [stack id config]
  (let [builder (CfnFunction$ProvisionedConcurrencyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
      (. builder provisionedConcurrentExecutions data))
    (.build builder)))


(defn cfn-function-queue-sampt-property-builder
  "The cfn-function-queue-sampt-property-builder function buildes out new instances of 
CfnFunction$QueueSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |"
  [stack id config]
  (let [builder (CfnFunction$QueueSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :queue-name)]
      (. builder queueName data))
    (.build builder)))


(defn cfn-function-request-model-property-builder
  "The cfn-function-request-model-property-builder function buildes out new instances of 
CfnFunction$RequestModelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `required` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required` |
| `validateBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-body` |
| `validateParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validate-parameters` |"
  [stack id config]
  (let [builder (CfnFunction$RequestModelProperty$Builder.)]
    (when-let [data (lookup-entry config id :model)]
      (. builder model data))
    (when-let [data (lookup-entry config id :required)]
      (. builder required data))
    (when-let [data (lookup-entry config id :validate-body)]
      (. builder validateBody data))
    (when-let [data (lookup-entry config id :validate-parameters)]
      (. builder validateParameters data))
    (.build builder)))


(defn cfn-function-request-parameter-property-builder
  "The cfn-function-request-parameter-property-builder function buildes out new instances of 
CfnFunction$RequestParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caching` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caching` |
| `required` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required` |"
  [stack id config]
  (let [builder (CfnFunction$RequestParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :caching)]
      (. builder caching data))
    (when-let [data (lookup-entry config id :required)]
      (. builder required data))
    (.build builder)))


(defn cfn-function-route-settings-property-builder
  "The cfn-function-route-settings-property-builder function buildes out new instances of 
CfnFunction$RouteSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTraceEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `detailedMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detailed-metrics-enabled` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |"
  [stack id config]
  (let [builder (CfnFunction$RouteSettingsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-s3-event-property-builder
  "The cfn-function-s3-event-property-builder function buildes out new instances of 
CfnFunction$S3EventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `events` | java.lang.String | [[cdk.support/lookup-entry]] | `:events` |
| `filter` | software.amazon.awscdk.services.sam.CfnFunction$S3NotificationFilterProperty | [[cdk.support/lookup-entry]] | `:filter` |"
  [stack id config]
  (let [builder (CfnFunction$S3EventProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (.build builder)))


(defn cfn-function-s3-key-filter-property-builder
  "The cfn-function-s3-key-filter-property-builder function buildes out new instances of 
CfnFunction$S3KeyFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnFunction$S3KeyFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn cfn-function-s3-key-filter-rule-property-builder
  "The cfn-function-s3-key-filter-rule-property-builder function buildes out new instances of 
CfnFunction$S3KeyFilterRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnFunction$S3KeyFilterRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-function-s3-location-property-builder
  "The cfn-function-s3-location-property-builder function buildes out new instances of 
CfnFunction$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnFunction$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-function-s3-notification-filter-property-builder
  "The cfn-function-s3-notification-filter-property-builder function buildes out new instances of 
CfnFunction$S3NotificationFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Key` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-key` |"
  [stack id config]
  (let [builder (CfnFunction$S3NotificationFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (.build builder)))


(defn cfn-function-sam-policy-template-property-builder
  "The cfn-function-sam-policy-template-property-builder function buildes out new instances of 
CfnFunction$SAMPolicyTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcAccessPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-access-policy` |"
  [stack id config]
  (let [builder (CfnFunction$SAMPolicyTemplateProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-schedule-event-property-builder
  "The cfn-function-schedule-event-property-builder function buildes out new instances of 
CfnFunction$ScheduleEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |"
  [stack id config]
  (let [builder (CfnFunction$ScheduleEventProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-secret-arn-sampt-property-builder
  "The cfn-function-secret-arn-sampt-property-builder function buildes out new instances of 
CfnFunction$SecretArnSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnFunction$SecretArnSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (.build builder)))


(defn cfn-function-sns-event-property-builder
  "The cfn-function-sns-event-property-builder function buildes out new instances of 
CfnFunction$SNSEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (CfnFunction$SNSEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn cfn-function-sqs-event-property-builder
  "The cfn-function-sqs-event-property-builder function buildes out new instances of 
CfnFunction$SQSEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |"
  [stack id config]
  (let [builder (CfnFunction$SQSEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-size)]
      (. builder batchSize data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (.build builder)))


(defn cfn-function-state-machine-sampt-property-builder
  "The cfn-function-state-machine-sampt-property-builder function buildes out new instances of 
CfnFunction$StateMachineSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |"
  [stack id config]
  (let [builder (CfnFunction$StateMachineSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :state-machine-name)]
      (. builder stateMachineName data))
    (.build builder)))


(defn cfn-function-stream-sampt-property-builder
  "The cfn-function-stream-sampt-property-builder function buildes out new instances of 
CfnFunction$StreamSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |"
  [stack id config]
  (let [builder (CfnFunction$StreamSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :stream-name)]
      (. builder streamName data))
    (.build builder)))


(defn cfn-function-table-sampt-property-builder
  "The cfn-function-table-sampt-property-builder function buildes out new instances of 
CfnFunction$TableSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnFunction$TableSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-function-table-stream-sampt-property-builder
  "The cfn-function-table-stream-sampt-property-builder function buildes out new instances of 
CfnFunction$TableStreamSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnFunction$TableStreamSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :stream-name)]
      (. builder streamName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-function-topic-sampt-property-builder
  "The cfn-function-topic-sampt-property-builder function buildes out new instances of 
CfnFunction$TopicSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |"
  [stack id config]
  (let [builder (CfnFunction$TopicSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :topic-name)]
      (. builder topicName data))
    (.build builder)))


(defn cfn-function-vpc-config-property-builder
  "The cfn-function-vpc-config-property-builder function buildes out new instances of 
CfnFunction$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnFunction$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-http-api-access-log-setting-property-builder
  "The cfn-http-api-access-log-setting-property-builder function buildes out new instances of 
CfnHttpApi$AccessLogSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |"
  [stack id config]
  (let [builder (CfnHttpApi$AccessLogSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (.build builder)))


(defn cfn-http-api-builder
  "The cfn-http-api-builder function buildes out new instances of 
CfnHttpApi$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnHttpApi$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-http-api-cors-configuration-object-property-builder
  "The cfn-http-api-cors-configuration-object-property-builder function buildes out new instances of 
CfnHttpApi$CorsConfigurationObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-origins` |
| `exposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:expose-headers` |
| `maxAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age` |"
  [stack id config]
  (let [builder (CfnHttpApi$CorsConfigurationObjectProperty$Builder.)]
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
    (.build builder)))


(defn cfn-http-api-http-api-auth-property-builder
  "The cfn-http-api-http-api-auth-property-builder function buildes out new instances of 
CfnHttpApi$HttpApiAuthProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizers` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authorizers` |
| `defaultAuthorizer` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authorizer` |"
  [stack id config]
  (let [builder (CfnHttpApi$HttpApiAuthProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorizers)]
      (. builder authorizers data))
    (when-let [data (lookup-entry config id :default-authorizer)]
      (. builder defaultAuthorizer data))
    (.build builder)))


(defn cfn-http-api-http-api-domain-configuration-property-builder
  "The cfn-http-api-http-api-domain-configuration-property-builder function buildes out new instances of 
CfnHttpApi$HttpApiDomainConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `mutualTlsAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-tls-authentication` |
| `route53` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route53` |
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |"
  [stack id config]
  (let [builder (CfnHttpApi$HttpApiDomainConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-http-api-mutual-tls-authentication-property-builder
  "The cfn-http-api-mutual-tls-authentication-property-builder function buildes out new instances of 
CfnHttpApi$MutualTlsAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `truststoreUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:truststore-uri` |
| `truststoreVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:truststore-version` |"
  [stack id config]
  (let [builder (CfnHttpApi$MutualTlsAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :truststore-uri)]
      (. builder truststoreUri data))
    (when-let [data (lookup-entry config id :truststore-version)]
      (. builder truststoreVersion data))
    (.build builder)))


(defn cfn-http-api-props-builder
  "The cfn-http-api-props-builder function buildes out new instances of 
CfnHttpApiProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnHttpApiProps$Builder.)]
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
    (.build builder)))


(defn cfn-http-api-route-settings-property-builder
  "The cfn-http-api-route-settings-property-builder function buildes out new instances of 
CfnHttpApi$RouteSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTraceEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-trace-enabled` |
| `detailedMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detailed-metrics-enabled` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `throttlingBurstLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-burst-limit` |
| `throttlingRateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throttling-rate-limit` |"
  [stack id config]
  (let [builder (CfnHttpApi$RouteSettingsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-http-api-route53-configuration-property-builder
  "The cfn-http-api-route53-configuration-property-builder function buildes out new instances of 
CfnHttpApi$Route53ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributedDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributed-domain-name` |
| `evaluateTargetHealth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:evaluate-target-health` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `ipV6` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-v6` |"
  [stack id config]
  (let [builder (CfnHttpApi$Route53ConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-http-api-s3-location-property-builder
  "The cfn-http-api-s3-location-property-builder function buildes out new instances of 
CfnHttpApi$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnHttpApi$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-layer-version-builder
  "The cfn-layer-version-builder function buildes out new instances of 
CfnLayerVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `contentUri` | software.amazon.awscdk.services.sam.CfnLayerVersion$S3LocationProperty | [[cdk.support/lookup-entry]] | `:content-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-name` |
| `licenseInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-info` |
| `retentionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:retention-policy` |"
  [stack id config]
  (let [builder (CfnLayerVersion$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-layer-version-props-builder
  "The cfn-layer-version-props-builder function buildes out new instances of 
CfnLayerVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `contentUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-name` |
| `licenseInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-info` |
| `retentionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:retention-policy` |"
  [stack id config]
  (let [builder (CfnLayerVersionProps$Builder.)]
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
    (.build builder)))


(defn cfn-layer-version-s3-location-property-builder
  "The cfn-layer-version-s3-location-property-builder function buildes out new instances of 
CfnLayerVersion$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnLayerVersion$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-simple-table-builder
  "The cfn-simple-table-builder function buildes out new instances of 
CfnSimpleTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primaryKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-key` |
| `provisionedThroughput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
| `sseSpecification` | software.amazon.awscdk.services.sam.CfnSimpleTable$SSESpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSimpleTable$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-simple-table-primary-key-property-builder
  "The cfn-simple-table-primary-key-property-builder function buildes out new instances of 
CfnSimpleTable$PrimaryKeyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSimpleTable$PrimaryKeyProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-simple-table-props-builder
  "The cfn-simple-table-props-builder function buildes out new instances of 
CfnSimpleTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primaryKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-key` |
| `provisionedThroughput` | software.amazon.awscdk.services.sam.CfnSimpleTable$ProvisionedThroughputProperty | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
| `sseSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSimpleTableProps$Builder.)]
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
    (.build builder)))


(defn cfn-simple-table-provisioned-throughput-property-builder
  "The cfn-simple-table-provisioned-throughput-property-builder function buildes out new instances of 
CfnSimpleTable$ProvisionedThroughputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity-units` |
| `writeCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity-units` |"
  [stack id config]
  (let [builder (CfnSimpleTable$ProvisionedThroughputProperty$Builder.)]
    (when-let [data (lookup-entry config id :read-capacity-units)]
      (. builder readCapacityUnits data))
    (when-let [data (lookup-entry config id :write-capacity-units)]
      (. builder writeCapacityUnits data))
    (.build builder)))


(defn cfn-simple-table-sse-specification-property-builder
  "The cfn-simple-table-sse-specification-property-builder function buildes out new instances of 
CfnSimpleTable$SSESpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sseEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sse-enabled` |"
  [stack id config]
  (let [builder (CfnSimpleTable$SSESpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sse-enabled)]
      (. builder sseEnabled data))
    (.build builder)))


(defn cfn-state-machine-api-event-property-builder
  "The cfn-state-machine-api-event-property-builder function buildes out new instances of 
CfnStateMachine$ApiEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `restApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rest-api-id` |"
  [stack id config]
  (let [builder (CfnStateMachine$ApiEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :rest-api-id)]
      (. builder restApiId data))
    (.build builder)))


(defn cfn-state-machine-builder
  "The cfn-state-machine-builder function buildes out new instances of 
CfnStateMachine$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnStateMachine$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-state-machine-cloud-watch-event-event-property-builder
  "The cfn-state-machine-cloud-watch-event-event-property-builder function buildes out new instances of 
CfnStateMachine$CloudWatchEventEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `pattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pattern` |"
  [stack id config]
  (let [builder (CfnStateMachine$CloudWatchEventEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (.build builder)))


(defn cfn-state-machine-cloud-watch-logs-log-group-property-builder
  "The cfn-state-machine-cloud-watch-logs-log-group-property-builder function buildes out new instances of 
CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |"
  [stack id config]
  (let [builder (CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-arn)]
      (. builder logGroupArn data))
    (.build builder)))


(defn cfn-state-machine-event-bridge-rule-event-property-builder
  "The cfn-state-machine-event-bridge-rule-event-property-builder function buildes out new instances of 
CfnStateMachine$EventBridgeRuleEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-name` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `pattern` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pattern` |"
  [stack id config]
  (let [builder (CfnStateMachine$EventBridgeRuleEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-bus-name)]
      (. builder eventBusName data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (.build builder)))


(defn cfn-state-machine-event-source-property-builder
  "The cfn-state-machine-event-source-property-builder function buildes out new instances of 
CfnStateMachine$EventSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | software.amazon.awscdk.services.sam.CfnStateMachine$ApiEventProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnStateMachine$EventSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-state-machine-function-sampt-property-builder
  "The cfn-state-machine-function-sampt-property-builder function buildes out new instances of 
CfnStateMachine$FunctionSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |"
  [stack id config]
  (let [builder (CfnStateMachine$FunctionSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (.build builder)))


(defn cfn-state-machine-iam-policy-document-property-builder
  "The cfn-state-machine-iam-policy-document-property-builder function buildes out new instances of 
CfnStateMachine$IAMPolicyDocumentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statement` | java.lang.Object | [[cdk.support/lookup-entry]] | `:statement` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnStateMachine$IAMPolicyDocumentProperty$Builder.)]
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-state-machine-log-destination-property-builder
  "The cfn-state-machine-log-destination-property-builder function buildes out new instances of 
CfnStateMachine$LogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsLogGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group` |"
  [stack id config]
  (let [builder (CfnStateMachine$LogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs-log-group)]
      (. builder cloudWatchLogsLogGroup data))
    (.build builder)))


(defn cfn-state-machine-logging-configuration-property-builder
  "The cfn-state-machine-logging-configuration-property-builder function buildes out new instances of 
CfnStateMachine$LoggingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `includeExecutionData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |"
  [stack id config]
  (let [builder (CfnStateMachine$LoggingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destinations)]
      (. builder destinations data))
    (when-let [data (lookup-entry config id :include-execution-data)]
      (. builder includeExecutionData data))
    (when-let [data (lookup-entry config id :level)]
      (. builder level data))
    (.build builder)))


(defn cfn-state-machine-props-builder
  "The cfn-state-machine-props-builder function buildes out new instances of 
CfnStateMachineProps$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnStateMachineProps$Builder.)]
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
    (.build builder)))


(defn cfn-state-machine-s3-location-property-builder
  "The cfn-state-machine-s3-location-property-builder function buildes out new instances of 
CfnStateMachine$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnStateMachine$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-state-machine-sam-policy-template-property-builder
  "The cfn-state-machine-sam-policy-template-property-builder function buildes out new instances of 
CfnStateMachine$SAMPolicyTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaInvokePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-invoke-policy` |
| `stepFunctionsExecutionPolicy` | software.amazon.awscdk.services.sam.CfnStateMachine$StateMachineSAMPTProperty | [[cdk.support/lookup-entry]] | `:step-functions-execution-policy` |"
  [stack id config]
  (let [builder (CfnStateMachine$SAMPolicyTemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-invoke-policy)]
      (. builder lambdaInvokePolicy data))
    (when-let [data (lookup-entry config id :step-functions-execution-policy)]
      (. builder stepFunctionsExecutionPolicy data))
    (.build builder)))


(defn cfn-state-machine-schedule-event-property-builder
  "The cfn-state-machine-schedule-event-property-builder function buildes out new instances of 
CfnStateMachine$ScheduleEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |"
  [stack id config]
  (let [builder (CfnStateMachine$ScheduleEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (.build builder)))


(defn cfn-state-machine-state-machine-sampt-property-builder
  "The cfn-state-machine-state-machine-sampt-property-builder function buildes out new instances of 
CfnStateMachine$StateMachineSAMPTProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |"
  [stack id config]
  (let [builder (CfnStateMachine$StateMachineSAMPTProperty$Builder.)]
    (when-let [data (lookup-entry config id :state-machine-name)]
      (. builder stateMachineName data))
    (.build builder)))


(defn cfn-state-machine-tracing-configuration-property-builder
  "The cfn-state-machine-tracing-configuration-property-builder function buildes out new instances of 
CfnStateMachine$TracingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnStateMachine$TracingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))