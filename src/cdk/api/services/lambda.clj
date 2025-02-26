(ns cdk.api.services.lambda
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda package. "
  (:require [cdk.api :refer [asset-hash-type
                             ignore-mode
                             removal-policy
                             symlink-follow-mode]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ecr IRepository]
           [software.amazon.awscdk.services.lambda AdotInstrumentationConfig$Builder
                                                   AdotLambdaExecWrapper
                                                   Alias$Builder
                                                   AliasAttributes$Builder
                                                   AliasOptions$Builder
                                                   AliasProps$Builder
                                                   ApplicationLogLevel
                                                   AssetCode$Builder
                                                   AssetImageCode$Builder
                                                   AssetImageCodeProps$Builder
                                                   AutoScalingOptions$Builder
                                                   CfnAlias$AliasRoutingConfigurationProperty$Builder
                                                   CfnAlias$Builder
                                                   CfnAlias$ProvisionedConcurrencyConfigurationProperty$Builder
                                                   CfnAlias$VersionWeightProperty$Builder
                                                   CfnAliasProps$Builder
                                                   CfnCodeSigningConfig$AllowedPublishersProperty$Builder
                                                   CfnCodeSigningConfig$Builder
                                                   CfnCodeSigningConfig$CodeSigningPoliciesProperty$Builder
                                                   CfnCodeSigningConfigProps$Builder
                                                   CfnEventInvokeConfig$Builder
                                                   CfnEventInvokeConfig$DestinationConfigProperty$Builder
                                                   CfnEventInvokeConfig$OnFailureProperty$Builder
                                                   CfnEventInvokeConfig$OnSuccessProperty$Builder
                                                   CfnEventInvokeConfigProps$Builder
                                                   CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty$Builder
                                                   CfnEventSourceMapping$Builder
                                                   CfnEventSourceMapping$DestinationConfigProperty$Builder
                                                   CfnEventSourceMapping$DocumentDBEventSourceConfigProperty$Builder
                                                   CfnEventSourceMapping$EndpointsProperty$Builder
                                                   CfnEventSourceMapping$FilterCriteriaProperty$Builder
                                                   CfnEventSourceMapping$FilterProperty$Builder
                                                   CfnEventSourceMapping$OnFailureProperty$Builder
                                                   CfnEventSourceMapping$ScalingConfigProperty$Builder
                                                   CfnEventSourceMapping$SelfManagedEventSourceProperty$Builder
                                                   CfnEventSourceMapping$SelfManagedKafkaEventSourceConfigProperty$Builder
                                                   CfnEventSourceMapping$SourceAccessConfigurationProperty$Builder
                                                   CfnEventSourceMappingProps$Builder
                                                   CfnFunction$Builder
                                                   CfnFunction$CodeProperty$Builder
                                                   CfnFunction$DeadLetterConfigProperty$Builder
                                                   CfnFunction$EnvironmentProperty$Builder
                                                   CfnFunction$EphemeralStorageProperty$Builder
                                                   CfnFunction$FileSystemConfigProperty$Builder
                                                   CfnFunction$ImageConfigProperty$Builder
                                                   CfnFunction$LoggingConfigProperty$Builder
                                                   CfnFunction$RuntimeManagementConfigProperty$Builder
                                                   CfnFunction$SnapStartProperty$Builder
                                                   CfnFunction$SnapStartResponseProperty$Builder
                                                   CfnFunction$TracingConfigProperty$Builder
                                                   CfnFunction$VpcConfigProperty$Builder
                                                   CfnFunctionProps$Builder
                                                   CfnLayerVersion$Builder
                                                   CfnLayerVersion$ContentProperty$Builder
                                                   CfnLayerVersionPermission$Builder
                                                   CfnLayerVersionPermissionProps$Builder
                                                   CfnLayerVersionProps$Builder
                                                   CfnParametersCode$Builder
                                                   CfnParametersCodeProps$Builder
                                                   CfnPermission$Builder
                                                   CfnPermissionProps$Builder
                                                   CfnUrl$Builder
                                                   CfnUrl$CorsProperty$Builder
                                                   CfnUrlProps$Builder
                                                   CfnVersion$Builder
                                                   CfnVersion$ProvisionedConcurrencyConfigurationProperty$Builder
                                                   CfnVersion$RuntimePolicyProperty$Builder
                                                   CfnVersionProps$Builder
                                                   CodeConfig$Builder
                                                   CodeImageConfig$Builder
                                                   CodeSigningConfig$Builder
                                                   CodeSigningConfigProps$Builder
                                                   CustomCommandOptions$Builder
                                                   DestinationConfig$Builder
                                                   DestinationOptions$Builder
                                                   DestinationType
                                                   DlqDestinationConfig$Builder
                                                   DockerBuildAssetOptions$Builder
                                                   DockerImageFunction$Builder
                                                   DockerImageFunctionProps$Builder
                                                   EcrImageCode$Builder
                                                   EcrImageCodeProps$Builder
                                                   EnvironmentOptions$Builder
                                                   EventInvokeConfig$Builder
                                                   EventInvokeConfigOptions$Builder
                                                   EventInvokeConfigProps$Builder
                                                   EventSourceMapping$Builder
                                                   EventSourceMappingOptions$Builder
                                                   EventSourceMappingProps$Builder
                                                   FileSystemConfig$Builder
                                                   Function$Builder
                                                   FunctionAttributes$Builder
                                                   FunctionOptions$Builder
                                                   FunctionProps$Builder
                                                   FunctionUrl$Builder
                                                   FunctionUrlAuthType
                                                   FunctionUrlCorsOptions$Builder
                                                   FunctionUrlOptions$Builder
                                                   FunctionUrlProps$Builder
                                                   HttpMethod
                                                   InvokeMode
                                                   LambdaRuntimeProps$Builder
                                                   LayerVersion$Builder
                                                   LayerVersionAttributes$Builder
                                                   LayerVersionOptions$Builder
                                                   LayerVersionPermission$Builder
                                                   LayerVersionProps$Builder
                                                   LogFormat
                                                   LogRetentionRetryOptions$Builder
                                                   LoggingFormat
                                                   ParamsAndSecretsLogLevel
                                                   ParamsAndSecretsOptions$Builder
                                                   ParamsAndSecretsVersions
                                                   Permission$Builder
                                                   ResourceBindOptions$Builder
                                                   Runtime$Builder
                                                   RuntimeFamily
                                                   SingletonFunction$Builder
                                                   SingletonFunctionProps$Builder
                                                   SourceAccessConfiguration$Builder
                                                   StartingPosition
                                                   SystemLogLevel
                                                   Tracing
                                                   UntrustedArtifactOnDeployment
                                                   UtilizationScalingOptions$Builder
                                                   Version$Builder
                                                   VersionAttributes$Builder
                                                   VersionOptions$Builder
                                                   VersionProps$Builder
                                                   VersionWeight$Builder]))


(defn adot-lambda-exec-wrapper
  "The `adot-lambda-exec-wrapper` function data interprets values in the provided config data into a 
`AdotLambdaExecWrapper` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AdotLambdaExecWrapper` - the value is returned.
* is `:regular-handler` - `AdotLambdaExecWrapper/REGULAR_HANDLER` is returned
* is `:stream-handler` - `AdotLambdaExecWrapper/STREAM_HANDLER` is returned
* is `:proxy-handler` - `AdotLambdaExecWrapper/PROXY_HANDLER` is returned
* is `:instrument-handler` - `AdotLambdaExecWrapper/INSTRUMENT_HANDLER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AdotLambdaExecWrapper data) data
      (= :regular-handler data) AdotLambdaExecWrapper/REGULAR_HANDLER
      (= :stream-handler data) AdotLambdaExecWrapper/STREAM_HANDLER
      (= :proxy-handler data) AdotLambdaExecWrapper/PROXY_HANDLER
      (= :instrument-handler data) AdotLambdaExecWrapper/INSTRUMENT_HANDLER)))


(defn application-log-level
  "The `application-log-level` function data interprets values in the provided config data into a 
`ApplicationLogLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ApplicationLogLevel` - the value is returned.
* is `:trace` - `ApplicationLogLevel/TRACE` is returned
* is `:debug` - `ApplicationLogLevel/DEBUG` is returned
* is `:info` - `ApplicationLogLevel/INFO` is returned
* is `:fatal` - `ApplicationLogLevel/FATAL` is returned
* is `:error` - `ApplicationLogLevel/ERROR` is returned
* is `:warn` - `ApplicationLogLevel/WARN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ApplicationLogLevel data) data
      (= :trace data) ApplicationLogLevel/TRACE
      (= :debug data) ApplicationLogLevel/DEBUG
      (= :info data) ApplicationLogLevel/INFO
      (= :fatal data) ApplicationLogLevel/FATAL
      (= :error data) ApplicationLogLevel/ERROR
      (= :warn data) ApplicationLogLevel/WARN)))


(defn destination-type
  "The `destination-type` function data interprets values in the provided config data into a 
`DestinationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DestinationType` - the value is returned.
* is `:success` - `DestinationType/SUCCESS` is returned
* is `:failure` - `DestinationType/FAILURE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DestinationType data) data
      (= :success data) DestinationType/SUCCESS
      (= :failure data) DestinationType/FAILURE)))


(defn function-url-auth-type
  "The `function-url-auth-type` function data interprets values in the provided config data into a 
`FunctionUrlAuthType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FunctionUrlAuthType` - the value is returned.
* is `:aws-iam` - `FunctionUrlAuthType/AWS_IAM` is returned
* is `:none` - `FunctionUrlAuthType/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FunctionUrlAuthType data) data
      (= :aws-iam data) FunctionUrlAuthType/AWS_IAM
      (= :none data) FunctionUrlAuthType/NONE)))


(defn http-method
  "The `http-method` function data interprets values in the provided config data into a 
`HttpMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpMethod` - the value is returned.
* is `:put` - `HttpMethod/PUT` is returned
* is `:delete` - `HttpMethod/DELETE` is returned
* is `:head` - `HttpMethod/HEAD` is returned
* is `:options` - `HttpMethod/OPTIONS` is returned
* is `:all` - `HttpMethod/ALL` is returned
* is `:patch` - `HttpMethod/PATCH` is returned
* is `:get` - `HttpMethod/GET` is returned
* is `:post` - `HttpMethod/POST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpMethod data) data
      (= :put data) HttpMethod/PUT
      (= :delete data) HttpMethod/DELETE
      (= :head data) HttpMethod/HEAD
      (= :options data) HttpMethod/OPTIONS
      (= :all data) HttpMethod/ALL
      (= :patch data) HttpMethod/PATCH
      (= :get data) HttpMethod/GET
      (= :post data) HttpMethod/POST)))


(defn invoke-mode
  "The `invoke-mode` function data interprets values in the provided config data into a 
`InvokeMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InvokeMode` - the value is returned.
* is `:response-stream` - `InvokeMode/RESPONSE_STREAM` is returned
* is `:buffered` - `InvokeMode/BUFFERED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InvokeMode data) data
      (= :response-stream data) InvokeMode/RESPONSE_STREAM
      (= :buffered data) InvokeMode/BUFFERED)))


(defn log-format
  "The `log-format` function data interprets values in the provided config data into a 
`LogFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LogFormat` - the value is returned.
* is `:text` - `LogFormat/TEXT` is returned
* is `:json` - `LogFormat/JSON` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LogFormat data) data
      (= :text data) LogFormat/TEXT
      (= :json data) LogFormat/JSON)))


(defn logging-format
  "The `logging-format` function data interprets values in the provided config data into a 
`LoggingFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LoggingFormat` - the value is returned.
* is `:text` - `LoggingFormat/TEXT` is returned
* is `:json` - `LoggingFormat/JSON` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LoggingFormat data) data
      (= :text data) LoggingFormat/TEXT
      (= :json data) LoggingFormat/JSON)))


(defn params-and-secrets-log-level
  "The `params-and-secrets-log-level` function data interprets values in the provided config data into a 
`ParamsAndSecretsLogLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ParamsAndSecretsLogLevel` - the value is returned.
* is `:warn` - `ParamsAndSecretsLogLevel/WARN` is returned
* is `:info` - `ParamsAndSecretsLogLevel/INFO` is returned
* is `:error` - `ParamsAndSecretsLogLevel/ERROR` is returned
* is `:debug` - `ParamsAndSecretsLogLevel/DEBUG` is returned
* is `:none` - `ParamsAndSecretsLogLevel/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ParamsAndSecretsLogLevel data) data
      (= :warn data) ParamsAndSecretsLogLevel/WARN
      (= :info data) ParamsAndSecretsLogLevel/INFO
      (= :error data) ParamsAndSecretsLogLevel/ERROR
      (= :debug data) ParamsAndSecretsLogLevel/DEBUG
      (= :none data) ParamsAndSecretsLogLevel/NONE)))


(defn params-and-secrets-versions
  "The `params-and-secrets-versions` function data interprets values in the provided config data into a 
`ParamsAndSecretsVersions` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ParamsAndSecretsVersions` - the value is returned.
* is `:v1-0-103` - `ParamsAndSecretsVersions/V1_0_103` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ParamsAndSecretsVersions data) data
      (= :v1-0-103 data) ParamsAndSecretsVersions/V1_0_103)))


(defn runtime-family
  "The `runtime-family` function data interprets values in the provided config data into a 
`RuntimeFamily` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RuntimeFamily` - the value is returned.
* is `:ruby` - `RuntimeFamily/RUBY` is returned
* is `:dotnet-core` - `RuntimeFamily/DOTNET_CORE` is returned
* is `:python` - `RuntimeFamily/PYTHON` is returned
* is `:java` - `RuntimeFamily/JAVA` is returned
* is `:go` - `RuntimeFamily/GO` is returned
* is `:nodejs` - `RuntimeFamily/NODEJS` is returned
* is `:other` - `RuntimeFamily/OTHER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RuntimeFamily data) data
      (= :ruby data) RuntimeFamily/RUBY
      (= :dotnet-core data) RuntimeFamily/DOTNET_CORE
      (= :python data) RuntimeFamily/PYTHON
      (= :java data) RuntimeFamily/JAVA
      (= :go data) RuntimeFamily/GO
      (= :nodejs data) RuntimeFamily/NODEJS
      (= :other data) RuntimeFamily/OTHER)))


(defn starting-position
  "The `starting-position` function data interprets values in the provided config data into a 
`StartingPosition` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `StartingPosition` - the value is returned.
* is `:latest` - `StartingPosition/LATEST` is returned
* is `:trim-horizon` - `StartingPosition/TRIM_HORIZON` is returned
* is `:at-timestamp` - `StartingPosition/AT_TIMESTAMP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? StartingPosition data) data
      (= :latest data) StartingPosition/LATEST
      (= :trim-horizon data) StartingPosition/TRIM_HORIZON
      (= :at-timestamp data) StartingPosition/AT_TIMESTAMP)))


(defn system-log-level
  "The `system-log-level` function data interprets values in the provided config data into a 
`SystemLogLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SystemLogLevel` - the value is returned.
* is `:warn` - `SystemLogLevel/WARN` is returned
* is `:info` - `SystemLogLevel/INFO` is returned
* is `:debug` - `SystemLogLevel/DEBUG` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SystemLogLevel data) data
      (= :warn data) SystemLogLevel/WARN
      (= :info data) SystemLogLevel/INFO
      (= :debug data) SystemLogLevel/DEBUG)))


(defn tracing
  "The `tracing` function data interprets values in the provided config data into a 
`Tracing` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Tracing` - the value is returned.
* is `:pass-through` - `Tracing/PASS_THROUGH` is returned
* is `:disabled` - `Tracing/DISABLED` is returned
* is `:active` - `Tracing/ACTIVE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Tracing data) data
      (= :pass-through data) Tracing/PASS_THROUGH
      (= :disabled data) Tracing/DISABLED
      (= :active data) Tracing/ACTIVE)))


(defn untrusted-artifact-on-deployment
  "The `untrusted-artifact-on-deployment` function data interprets values in the provided config data into a 
`UntrustedArtifactOnDeployment` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `UntrustedArtifactOnDeployment` - the value is returned.
* is `:enforce` - `UntrustedArtifactOnDeployment/ENFORCE` is returned
* is `:warn` - `UntrustedArtifactOnDeployment/WARN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? UntrustedArtifactOnDeployment data) data
      (= :enforce data) UntrustedArtifactOnDeployment/ENFORCE
      (= :warn data) UntrustedArtifactOnDeployment/WARN)))


(defn build-adot-instrumentation-config-builder
  "The build-adot-instrumentation-config-builder function updates a AdotInstrumentationConfig$Builder instance using the provided configuration.
  The function takes the AdotInstrumentationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `execWrapper` | software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper | [[cdk.api.services.lambda/adot-lambda-exec-wrapper]] | `:exec-wrapper` |
| `layerVersion` | software.amazon.awscdk.services.lambda.AdotLayerVersion | [[cdk.support/lookup-entry]] | `:layer-version` |
"
  [^AdotInstrumentationConfig$Builder builder id config]
  (when-let [data (adot-lambda-exec-wrapper config id :exec-wrapper)]
    (. builder execWrapper data))
  (when-let [data (lookup-entry config id :layer-version)]
    (. builder layerVersion data))
  (.build builder))


(defn adot-instrumentation-config-builder
  "Creates a  `AdotInstrumentationConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-adot-instrumentation-config-builder (new AdotInstrumentationConfig$Builder) id config))


(defn build-alias-attributes-builder
  "The build-alias-attributes-builder function updates a AliasAttributes$Builder instance using the provided configuration.
  The function takes the AliasAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `aliasVersion` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:alias-version` |
"
  [^AliasAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-let [data (lookup-entry config id :alias-version)]
    (. builder aliasVersion data))
  (.build builder))


(defn alias-attributes-builder
  "Creates a  `AliasAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-alias-attributes-builder (new AliasAttributes$Builder) id config))


(defn build-alias-builder
  "The build-alias-builder function updates a Alias$Builder instance using the provided configuration.
  The function takes the Alias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-versions` |
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `version` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^Alias$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-versions)]
    (. builder additionalVersions data))
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn alias-builder
  "Creates a  `Alias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-alias-builder (Alias$Builder/create scope (name id)) id config))


(defn build-alias-options-builder
  "The build-alias-options-builder function updates a AliasOptions$Builder instance using the provided configuration.
  The function takes the AliasOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-versions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^AliasOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-versions)]
    (. builder additionalVersions data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn alias-options-builder
  "Creates a  `AliasOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-alias-options-builder (new AliasOptions$Builder) id config))


(defn build-alias-props-builder
  "The build-alias-props-builder function updates a AliasProps$Builder instance using the provided configuration.
  The function takes the AliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-versions` |
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `version` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AliasProps$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-versions)]
    (. builder additionalVersions data))
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn alias-props-builder
  "Creates a  `AliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-alias-props-builder (new AliasProps$Builder) id config))


(defn build-asset-code-builder
  "The build-asset-code-builder function updates a AssetCode$Builder instance using the provided configuration.
  The function takes the AssetCode$Builder instance, an optional namespace to use when looking up a value in the configuration,
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
  [^AssetCode$Builder builder id config]
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


(defn asset-code-builder
  "Creates a  `AssetCode$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| path | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^String path id config]
  (build-asset-code-builder (AssetCode$Builder/create path) id config))


(defn build-asset-image-code-builder
  "The build-asset-image-code-builder function updates a AssetImageCode$Builder instance using the provided configuration.
  The function takes the AssetImageCode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.services.ecr.assets.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `cmd` | java.util.List | [[cdk.support/lookup-entry]] | `:cmd` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `invalidation` | software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions | [[cdk.support/lookup-entry]] | `:invalidation` |
| `networkMode` | software.amazon.awscdk.services.ecr.assets.NetworkMode | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `platform` | software.amazon.awscdk.services.ecr.assets.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^AssetImageCode$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-name)]
    (. builder assetName data))
  (when-let [data (lookup-entry config id :build-args)]
    (. builder buildArgs data))
  (when-let [data (lookup-entry config id :build-secrets)]
    (. builder buildSecrets data))
  (when-let [data (lookup-entry config id :build-ssh)]
    (. builder buildSsh data))
  (when-let [data (lookup-entry config id :cache-disabled)]
    (. builder cacheDisabled data))
  (when-let [data (lookup-entry config id :cache-from)]
    (. builder cacheFrom data))
  (when-let [data (lookup-entry config id :cache-to)]
    (. builder cacheTo data))
  (when-let [data (lookup-entry config id :cmd)]
    (. builder cmd data))
  (when-let [data (lookup-entry config id :entrypoint)]
    (. builder entrypoint data))
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (lookup-entry config id :extra-hash)]
    (. builder extraHash data))
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-let [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (when-let [data (lookup-entry config id :invalidation)]
    (. builder invalidation data))
  (when-let [data (lookup-entry config id :network-mode)]
    (. builder networkMode data))
  (when-let [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-let [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn asset-image-code-builder
  "Creates a  `AssetImageCode$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| directory | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^String directory id config]
  (build-asset-image-code-builder (AssetImageCode$Builder/create directory) id config))


(defn build-asset-image-code-props-builder
  "The build-asset-image-code-props-builder function updates a AssetImageCodeProps$Builder instance using the provided configuration.
  The function takes the AssetImageCodeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.services.ecr.assets.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `cmd` | java.util.List | [[cdk.support/lookup-entry]] | `:cmd` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `invalidation` | software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions | [[cdk.support/lookup-entry]] | `:invalidation` |
| `networkMode` | software.amazon.awscdk.services.ecr.assets.NetworkMode | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `platform` | software.amazon.awscdk.services.ecr.assets.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^AssetImageCodeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-name)]
    (. builder assetName data))
  (when-let [data (lookup-entry config id :build-args)]
    (. builder buildArgs data))
  (when-let [data (lookup-entry config id :build-secrets)]
    (. builder buildSecrets data))
  (when-let [data (lookup-entry config id :build-ssh)]
    (. builder buildSsh data))
  (when-let [data (lookup-entry config id :cache-disabled)]
    (. builder cacheDisabled data))
  (when-let [data (lookup-entry config id :cache-from)]
    (. builder cacheFrom data))
  (when-let [data (lookup-entry config id :cache-to)]
    (. builder cacheTo data))
  (when-let [data (lookup-entry config id :cmd)]
    (. builder cmd data))
  (when-let [data (lookup-entry config id :entrypoint)]
    (. builder entrypoint data))
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (lookup-entry config id :extra-hash)]
    (. builder extraHash data))
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-let [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (when-let [data (lookup-entry config id :invalidation)]
    (. builder invalidation data))
  (when-let [data (lookup-entry config id :network-mode)]
    (. builder networkMode data))
  (when-let [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-let [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn asset-image-code-props-builder
  "Creates a  `AssetImageCodeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-asset-image-code-props-builder (new AssetImageCodeProps$Builder) id config))


(defn build-auto-scaling-options-builder
  "The build-auto-scaling-options-builder function updates a AutoScalingOptions$Builder instance using the provided configuration.
  The function takes the AutoScalingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
"
  [^AutoScalingOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (.build builder))


(defn auto-scaling-options-builder
  "Creates a  `AutoScalingOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-auto-scaling-options-builder (new AutoScalingOptions$Builder) id config))


(defn build-cfn-alias-alias-routing-configuration-property-builder
  "The build-cfn-alias-alias-routing-configuration-property-builder function updates a CfnAlias$AliasRoutingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAlias$AliasRoutingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalVersionWeights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-version-weights` |
"
  [^CfnAlias$AliasRoutingConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-version-weights)]
    (. builder additionalVersionWeights data))
  (.build builder))


(defn cfn-alias-alias-routing-configuration-property-builder
  "Creates a  `CfnAlias$AliasRoutingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alias-alias-routing-configuration-property-builder (new CfnAlias$AliasRoutingConfigurationProperty$Builder) id config))


(defn build-cfn-alias-builder
  "The build-cfn-alias-builder function updates a CfnAlias$Builder instance using the provided configuration.
  The function takes the CfnAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `routingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-config` |
"
  [^CfnAlias$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :function-version)]
    (. builder functionVersion data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :provisioned-concurrency-config)]
    (. builder provisionedConcurrencyConfig data))
  (when-let [data (lookup-entry config id :routing-config)]
    (. builder routingConfig data))
  (.build builder))


(defn cfn-alias-builder
  "Creates a  `CfnAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-alias-builder (CfnAlias$Builder/create scope (name id)) id config))


(defn build-cfn-alias-props-builder
  "The build-cfn-alias-props-builder function updates a CfnAliasProps$Builder instance using the provided configuration.
  The function takes the CfnAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `routingConfig` | software.amazon.awscdk.services.lambda.CfnAlias$AliasRoutingConfigurationProperty | [[cdk.support/lookup-entry]] | `:routing-config` |
"
  [^CfnAliasProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :function-version)]
    (. builder functionVersion data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :provisioned-concurrency-config)]
    (. builder provisionedConcurrencyConfig data))
  (when-let [data (lookup-entry config id :routing-config)]
    (. builder routingConfig data))
  (.build builder))


(defn cfn-alias-props-builder
  "Creates a  `CfnAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alias-props-builder (new CfnAliasProps$Builder) id config))


(defn build-cfn-alias-provisioned-concurrency-configuration-property-builder
  "The build-cfn-alias-provisioned-concurrency-configuration-property-builder function updates a CfnAlias$ProvisionedConcurrencyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAlias$ProvisionedConcurrencyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
"
  [^CfnAlias$ProvisionedConcurrencyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (.build builder))


(defn cfn-alias-provisioned-concurrency-configuration-property-builder
  "Creates a  `CfnAlias$ProvisionedConcurrencyConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alias-provisioned-concurrency-configuration-property-builder (new CfnAlias$ProvisionedConcurrencyConfigurationProperty$Builder) id config))


(defn build-cfn-alias-version-weight-property-builder
  "The build-cfn-alias-version-weight-property-builder function updates a CfnAlias$VersionWeightProperty$Builder instance using the provided configuration.
  The function takes the CfnAlias$VersionWeightProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-version` |
| `functionWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:function-weight` |
"
  [^CfnAlias$VersionWeightProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function-version)]
    (. builder functionVersion data))
  (when-let [data (lookup-entry config id :function-weight)]
    (. builder functionWeight data))
  (.build builder))


(defn cfn-alias-version-weight-property-builder
  "Creates a  `CfnAlias$VersionWeightProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alias-version-weight-property-builder (new CfnAlias$VersionWeightProperty$Builder) id config))


(defn build-cfn-code-signing-config-allowed-publishers-property-builder
  "The build-cfn-code-signing-config-allowed-publishers-property-builder function updates a CfnCodeSigningConfig$AllowedPublishersProperty$Builder instance using the provided configuration.
  The function takes the CfnCodeSigningConfig$AllowedPublishersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingProfileVersionArns` | java.util.List | [[cdk.support/lookup-entry]] | `:signing-profile-version-arns` |
"
  [^CfnCodeSigningConfig$AllowedPublishersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :signing-profile-version-arns)]
    (. builder signingProfileVersionArns data))
  (.build builder))


(defn cfn-code-signing-config-allowed-publishers-property-builder
  "Creates a  `CfnCodeSigningConfig$AllowedPublishersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-code-signing-config-allowed-publishers-property-builder (new CfnCodeSigningConfig$AllowedPublishersProperty$Builder) id config))


(defn build-cfn-code-signing-config-builder
  "The build-cfn-code-signing-config-builder function updates a CfnCodeSigningConfig$Builder instance using the provided configuration.
  The function takes the CfnCodeSigningConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPublishers` | software.amazon.awscdk.services.lambda.CfnCodeSigningConfig$AllowedPublishersProperty | [[cdk.support/lookup-entry]] | `:allowed-publishers` |
| `codeSigningPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-signing-policies` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnCodeSigningConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-publishers)]
    (. builder allowedPublishers data))
  (when-let [data (lookup-entry config id :code-signing-policies)]
    (. builder codeSigningPolicies data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-code-signing-config-builder
  "Creates a  `CfnCodeSigningConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-code-signing-config-builder (CfnCodeSigningConfig$Builder/create scope (name id)) id config))


(defn build-cfn-code-signing-config-code-signing-policies-property-builder
  "The build-cfn-code-signing-config-code-signing-policies-property-builder function updates a CfnCodeSigningConfig$CodeSigningPoliciesProperty$Builder instance using the provided configuration.
  The function takes the CfnCodeSigningConfig$CodeSigningPoliciesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `untrustedArtifactOnDeployment` | java.lang.String | [[cdk.support/lookup-entry]] | `:untrusted-artifact-on-deployment` |
"
  [^CfnCodeSigningConfig$CodeSigningPoliciesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :untrusted-artifact-on-deployment)]
    (. builder untrustedArtifactOnDeployment data))
  (.build builder))


(defn cfn-code-signing-config-code-signing-policies-property-builder
  "Creates a  `CfnCodeSigningConfig$CodeSigningPoliciesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-code-signing-config-code-signing-policies-property-builder (new CfnCodeSigningConfig$CodeSigningPoliciesProperty$Builder) id config))


(defn build-cfn-code-signing-config-props-builder
  "The build-cfn-code-signing-config-props-builder function updates a CfnCodeSigningConfigProps$Builder instance using the provided configuration.
  The function takes the CfnCodeSigningConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPublishers` | software.amazon.awscdk.services.lambda.CfnCodeSigningConfig$AllowedPublishersProperty | [[cdk.support/lookup-entry]] | `:allowed-publishers` |
| `codeSigningPolicies` | software.amazon.awscdk.services.lambda.CfnCodeSigningConfig$CodeSigningPoliciesProperty | [[cdk.support/lookup-entry]] | `:code-signing-policies` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnCodeSigningConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-publishers)]
    (. builder allowedPublishers data))
  (when-let [data (lookup-entry config id :code-signing-policies)]
    (. builder codeSigningPolicies data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-code-signing-config-props-builder
  "Creates a  `CfnCodeSigningConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-code-signing-config-props-builder (new CfnCodeSigningConfigProps$Builder) id config))


(defn build-cfn-event-invoke-config-builder
  "The build-cfn-event-invoke-config-builder function updates a CfnEventInvokeConfig$Builder instance using the provided configuration.
  The function takes the CfnEventInvokeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfig` | software.amazon.awscdk.services.lambda.CfnEventInvokeConfig$DestinationConfigProperty | [[cdk.support/lookup-entry]] | `:destination-config` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
"
  [^CfnEventInvokeConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-config)]
    (. builder destinationConfig data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :maximum-event-age-in-seconds)]
    (. builder maximumEventAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (when-let [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (.build builder))


(defn cfn-event-invoke-config-builder
  "Creates a  `CfnEventInvokeConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-event-invoke-config-builder (CfnEventInvokeConfig$Builder/create scope (name id)) id config))


(defn build-cfn-event-invoke-config-destination-config-property-builder
  "The build-cfn-event-invoke-config-destination-config-property-builder function updates a CfnEventInvokeConfig$DestinationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEventInvokeConfig$DestinationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-success` |
"
  [^CfnEventInvokeConfig$DestinationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (.build builder))


(defn cfn-event-invoke-config-destination-config-property-builder
  "Creates a  `CfnEventInvokeConfig$DestinationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-invoke-config-destination-config-property-builder (new CfnEventInvokeConfig$DestinationConfigProperty$Builder) id config))


(defn build-cfn-event-invoke-config-on-failure-property-builder
  "The build-cfn-event-invoke-config-on-failure-property-builder function updates a CfnEventInvokeConfig$OnFailureProperty$Builder instance using the provided configuration.
  The function takes the CfnEventInvokeConfig$OnFailureProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
"
  [^CfnEventInvokeConfig$OnFailureProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (.build builder))


(defn cfn-event-invoke-config-on-failure-property-builder
  "Creates a  `CfnEventInvokeConfig$OnFailureProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-invoke-config-on-failure-property-builder (new CfnEventInvokeConfig$OnFailureProperty$Builder) id config))


(defn build-cfn-event-invoke-config-on-success-property-builder
  "The build-cfn-event-invoke-config-on-success-property-builder function updates a CfnEventInvokeConfig$OnSuccessProperty$Builder instance using the provided configuration.
  The function takes the CfnEventInvokeConfig$OnSuccessProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
"
  [^CfnEventInvokeConfig$OnSuccessProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (.build builder))


(defn cfn-event-invoke-config-on-success-property-builder
  "Creates a  `CfnEventInvokeConfig$OnSuccessProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-invoke-config-on-success-property-builder (new CfnEventInvokeConfig$OnSuccessProperty$Builder) id config))


(defn build-cfn-event-invoke-config-props-builder
  "The build-cfn-event-invoke-config-props-builder function updates a CfnEventInvokeConfigProps$Builder instance using the provided configuration.
  The function takes the CfnEventInvokeConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-config` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
"
  [^CfnEventInvokeConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-config)]
    (. builder destinationConfig data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :maximum-event-age-in-seconds)]
    (. builder maximumEventAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (when-let [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (.build builder))


(defn cfn-event-invoke-config-props-builder
  "Creates a  `CfnEventInvokeConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-invoke-config-props-builder (new CfnEventInvokeConfigProps$Builder) id config))


(defn build-cfn-event-source-mapping-amazon-managed-kafka-event-source-config-property-builder
  "The build-cfn-event-source-mapping-amazon-managed-kafka-event-source-config-property-builder function updates a CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
"
  [^CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (.build builder))


(defn cfn-event-source-mapping-amazon-managed-kafka-event-source-config-property-builder
  "Creates a  `CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-amazon-managed-kafka-event-source-config-property-builder (new CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty$Builder) id config))


(defn build-cfn-event-source-mapping-builder
  "The build-cfn-event-source-mapping-builder function updates a CfnEventSourceMapping$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonManagedKafkaEventSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:amazon-managed-kafka-event-source-config` |
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnFunctionError` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bisect-batch-on-function-error` |
| `destinationConfig` | software.amazon.awscdk.services.lambda.CfnEventSourceMapping$DestinationConfigProperty | [[cdk.support/lookup-entry]] | `:destination-config` |
| `documentDbEventSourceConfig` | software.amazon.awscdk.services.lambda.CfnEventSourceMapping$DocumentDBEventSourceConfigProperty | [[cdk.support/lookup-entry]] | `:document-db-event-source-config` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-arn` |
| `filterCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-criteria` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionResponseTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:function-response-types` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `maximumRecordAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-record-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `queues` | java.util.List | [[cdk.support/lookup-entry]] | `:queues` |
| `scalingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scaling-config` |
| `selfManagedEventSource` | software.amazon.awscdk.services.lambda.CfnEventSourceMapping$SelfManagedEventSourceProperty | [[cdk.support/lookup-entry]] | `:self-managed-event-source` |
| `selfManagedKafkaEventSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:self-managed-kafka-event-source-config` |
| `sourceAccessConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:source-access-configurations` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `startingPositionTimestamp` | java.lang.Number | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |
| `tumblingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tumbling-window-in-seconds` |
"
  [^CfnEventSourceMapping$Builder builder id config]
  (when-let [data (lookup-entry config id :amazon-managed-kafka-event-source-config)]
    (. builder amazonManagedKafkaEventSourceConfig data))
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-function-error)]
    (. builder bisectBatchOnFunctionError data))
  (when-let [data (lookup-entry config id :destination-config)]
    (. builder destinationConfig data))
  (when-let [data (lookup-entry config id :document-db-event-source-config)]
    (. builder documentDbEventSourceConfig data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :event-source-arn)]
    (. builder eventSourceArn data))
  (when-let [data (lookup-entry config id :filter-criteria)]
    (. builder filterCriteria data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :function-response-types)]
    (. builder functionResponseTypes data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :maximum-record-age-in-seconds)]
    (. builder maximumRecordAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :queues)]
    (. builder queues data))
  (when-let [data (lookup-entry config id :scaling-config)]
    (. builder scalingConfig data))
  (when-let [data (lookup-entry config id :self-managed-event-source)]
    (. builder selfManagedEventSource data))
  (when-let [data (lookup-entry config id :self-managed-kafka-event-source-config)]
    (. builder selfManagedKafkaEventSourceConfig data))
  (when-let [data (lookup-entry config id :source-access-configurations)]
    (. builder sourceAccessConfigurations data))
  (when-let [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-let [data (lookup-entry config id :topics)]
    (. builder topics data))
  (when-let [data (lookup-entry config id :tumbling-window-in-seconds)]
    (. builder tumblingWindowInSeconds data))
  (.build builder))


(defn cfn-event-source-mapping-builder
  "Creates a  `CfnEventSourceMapping$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-event-source-mapping-builder (CfnEventSourceMapping$Builder/create scope (name id)) id config))


(defn build-cfn-event-source-mapping-destination-config-property-builder
  "The build-cfn-event-source-mapping-destination-config-property-builder function updates a CfnEventSourceMapping$DestinationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$DestinationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-failure` |
"
  [^CfnEventSourceMapping$DestinationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (.build builder))


(defn cfn-event-source-mapping-destination-config-property-builder
  "Creates a  `CfnEventSourceMapping$DestinationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-destination-config-property-builder (new CfnEventSourceMapping$DestinationConfigProperty$Builder) id config))


(defn build-cfn-event-source-mapping-document-db-event-source-config-property-builder
  "The build-cfn-event-source-mapping-document-db-event-source-config-property-builder function updates a CfnEventSourceMapping$DocumentDBEventSourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$DocumentDBEventSourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-name` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `fullDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:full-document` |
"
  [^CfnEventSourceMapping$DocumentDBEventSourceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :collection-name)]
    (. builder collectionName data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :full-document)]
    (. builder fullDocument data))
  (.build builder))


(defn cfn-event-source-mapping-document-db-event-source-config-property-builder
  "Creates a  `CfnEventSourceMapping$DocumentDBEventSourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-document-db-event-source-config-property-builder (new CfnEventSourceMapping$DocumentDBEventSourceConfigProperty$Builder) id config))


(defn build-cfn-event-source-mapping-endpoints-property-builder
  "The build-cfn-event-source-mapping-endpoints-property-builder function updates a CfnEventSourceMapping$EndpointsProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$EndpointsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kafkaBootstrapServers` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-bootstrap-servers` |
"
  [^CfnEventSourceMapping$EndpointsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kafka-bootstrap-servers)]
    (. builder kafkaBootstrapServers data))
  (.build builder))


(defn cfn-event-source-mapping-endpoints-property-builder
  "Creates a  `CfnEventSourceMapping$EndpointsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-endpoints-property-builder (new CfnEventSourceMapping$EndpointsProperty$Builder) id config))


(defn build-cfn-event-source-mapping-filter-criteria-property-builder
  "The build-cfn-event-source-mapping-filter-criteria-property-builder function updates a CfnEventSourceMapping$FilterCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$FilterCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^CfnEventSourceMapping$FilterCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn cfn-event-source-mapping-filter-criteria-property-builder
  "Creates a  `CfnEventSourceMapping$FilterCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-filter-criteria-property-builder (new CfnEventSourceMapping$FilterCriteriaProperty$Builder) id config))


(defn build-cfn-event-source-mapping-filter-property-builder
  "The build-cfn-event-source-mapping-filter-property-builder function updates a CfnEventSourceMapping$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
"
  [^CfnEventSourceMapping$FilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (.build builder))


(defn cfn-event-source-mapping-filter-property-builder
  "Creates a  `CfnEventSourceMapping$FilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-filter-property-builder (new CfnEventSourceMapping$FilterProperty$Builder) id config))


(defn build-cfn-event-source-mapping-on-failure-property-builder
  "The build-cfn-event-source-mapping-on-failure-property-builder function updates a CfnEventSourceMapping$OnFailureProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$OnFailureProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
"
  [^CfnEventSourceMapping$OnFailureProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (.build builder))


(defn cfn-event-source-mapping-on-failure-property-builder
  "Creates a  `CfnEventSourceMapping$OnFailureProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-on-failure-property-builder (new CfnEventSourceMapping$OnFailureProperty$Builder) id config))


(defn build-cfn-event-source-mapping-props-builder
  "The build-cfn-event-source-mapping-props-builder function updates a CfnEventSourceMappingProps$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonManagedKafkaEventSourceConfig` | software.amazon.awscdk.services.lambda.CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty | [[cdk.support/lookup-entry]] | `:amazon-managed-kafka-event-source-config` |
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnFunctionError` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bisect-batch-on-function-error` |
| `destinationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-config` |
| `documentDbEventSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:document-db-event-source-config` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-arn` |
| `filterCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-criteria` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionResponseTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:function-response-types` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `maximumRecordAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-record-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `queues` | java.util.List | [[cdk.support/lookup-entry]] | `:queues` |
| `scalingConfig` | software.amazon.awscdk.services.lambda.CfnEventSourceMapping$ScalingConfigProperty | [[cdk.support/lookup-entry]] | `:scaling-config` |
| `selfManagedEventSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:self-managed-event-source` |
| `selfManagedKafkaEventSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:self-managed-kafka-event-source-config` |
| `sourceAccessConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:source-access-configurations` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `startingPositionTimestamp` | java.lang.Number | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |
| `tumblingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tumbling-window-in-seconds` |
"
  [^CfnEventSourceMappingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :amazon-managed-kafka-event-source-config)]
    (. builder amazonManagedKafkaEventSourceConfig data))
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-function-error)]
    (. builder bisectBatchOnFunctionError data))
  (when-let [data (lookup-entry config id :destination-config)]
    (. builder destinationConfig data))
  (when-let [data (lookup-entry config id :document-db-event-source-config)]
    (. builder documentDbEventSourceConfig data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :event-source-arn)]
    (. builder eventSourceArn data))
  (when-let [data (lookup-entry config id :filter-criteria)]
    (. builder filterCriteria data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :function-response-types)]
    (. builder functionResponseTypes data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :maximum-record-age-in-seconds)]
    (. builder maximumRecordAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :queues)]
    (. builder queues data))
  (when-let [data (lookup-entry config id :scaling-config)]
    (. builder scalingConfig data))
  (when-let [data (lookup-entry config id :self-managed-event-source)]
    (. builder selfManagedEventSource data))
  (when-let [data (lookup-entry config id :self-managed-kafka-event-source-config)]
    (. builder selfManagedKafkaEventSourceConfig data))
  (when-let [data (lookup-entry config id :source-access-configurations)]
    (. builder sourceAccessConfigurations data))
  (when-let [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-let [data (lookup-entry config id :topics)]
    (. builder topics data))
  (when-let [data (lookup-entry config id :tumbling-window-in-seconds)]
    (. builder tumblingWindowInSeconds data))
  (.build builder))


(defn cfn-event-source-mapping-props-builder
  "Creates a  `CfnEventSourceMappingProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-props-builder (new CfnEventSourceMappingProps$Builder) id config))


(defn build-cfn-event-source-mapping-scaling-config-property-builder
  "The build-cfn-event-source-mapping-scaling-config-property-builder function updates a CfnEventSourceMapping$ScalingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$ScalingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-concurrency` |
"
  [^CfnEventSourceMapping$ScalingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-concurrency)]
    (. builder maximumConcurrency data))
  (.build builder))


(defn cfn-event-source-mapping-scaling-config-property-builder
  "Creates a  `CfnEventSourceMapping$ScalingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-scaling-config-property-builder (new CfnEventSourceMapping$ScalingConfigProperty$Builder) id config))


(defn build-cfn-event-source-mapping-self-managed-event-source-property-builder
  "The build-cfn-event-source-mapping-self-managed-event-source-property-builder function updates a CfnEventSourceMapping$SelfManagedEventSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$SelfManagedEventSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoints` | software.amazon.awscdk.services.lambda.CfnEventSourceMapping$EndpointsProperty | [[cdk.support/lookup-entry]] | `:endpoints` |
"
  [^CfnEventSourceMapping$SelfManagedEventSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoints)]
    (. builder endpoints data))
  (.build builder))


(defn cfn-event-source-mapping-self-managed-event-source-property-builder
  "Creates a  `CfnEventSourceMapping$SelfManagedEventSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-self-managed-event-source-property-builder (new CfnEventSourceMapping$SelfManagedEventSourceProperty$Builder) id config))


(defn build-cfn-event-source-mapping-self-managed-kafka-event-source-config-property-builder
  "The build-cfn-event-source-mapping-self-managed-kafka-event-source-config-property-builder function updates a CfnEventSourceMapping$SelfManagedKafkaEventSourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$SelfManagedKafkaEventSourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
"
  [^CfnEventSourceMapping$SelfManagedKafkaEventSourceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (.build builder))


(defn cfn-event-source-mapping-self-managed-kafka-event-source-config-property-builder
  "Creates a  `CfnEventSourceMapping$SelfManagedKafkaEventSourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-self-managed-kafka-event-source-config-property-builder (new CfnEventSourceMapping$SelfManagedKafkaEventSourceConfigProperty$Builder) id config))


(defn build-cfn-event-source-mapping-source-access-configuration-property-builder
  "The build-cfn-event-source-mapping-source-access-configuration-property-builder function updates a CfnEventSourceMapping$SourceAccessConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEventSourceMapping$SourceAccessConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnEventSourceMapping$SourceAccessConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-event-source-mapping-source-access-configuration-property-builder
  "Creates a  `CfnEventSourceMapping$SourceAccessConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-source-mapping-source-access-configuration-property-builder (new CfnEventSourceMapping$SourceAccessConfigurationProperty$Builder) id config))


(defn build-cfn-function-builder
  "The build-cfn-function-builder function updates a CfnFunction$Builder instance using the provided configuration.
  The function takes the CfnFunction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architectures` | java.util.List | [[cdk.support/lookup-entry]] | `:architectures` |
| `code` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-signing-config-arn` |
| `deadLetterConfig` | software.amazon.awscdk.services.lambda.CfnFunction$DeadLetterConfigProperty | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | software.amazon.awscdk.services.lambda.CfnFunction$EnvironmentProperty | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorage` | software.amazon.awscdk.services.lambda.CfnFunction$EphemeralStorageProperty | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `fileSystemConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-configs` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `imageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-config` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `packageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-type` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeManagementConfig` | software.amazon.awscdk.services.lambda.CfnFunction$RuntimeManagementConfigProperty | [[cdk.support/lookup-entry]] | `:runtime-management-config` |
| `snapStart` | software.amazon.awscdk.services.lambda.CfnFunction$SnapStartProperty | [[cdk.support/lookup-entry]] | `:snap-start` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing-config` |
| `vpcConfig` | software.amazon.awscdk.services.lambda.CfnFunction$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnFunction$Builder builder id config]
  (when-let [data (lookup-entry config id :architectures)]
    (. builder architectures data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :code-signing-config-arn)]
    (. builder codeSigningConfigArn data))
  (when-let [data (lookup-entry config id :dead-letter-config)]
    (. builder deadLetterConfig data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :ephemeral-storage)]
    (. builder ephemeralStorage data))
  (when-let [data (lookup-entry config id :file-system-configs)]
    (. builder fileSystemConfigs data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :image-config)]
    (. builder imageConfig data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :package-type)]
    (. builder packageType data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :runtime-management-config)]
    (. builder runtimeManagementConfig data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tracing-config)]
    (. builder tracingConfig data))
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


(defn build-cfn-function-code-property-builder
  "The build-cfn-function-code-property-builder function updates a CfnFunction$CodeProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$CodeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |
| `zipFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:zip-file` |
"
  [^CfnFunction$CodeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (when-let [data (lookup-entry config id :s3-object-version)]
    (. builder s3ObjectVersion data))
  (when-let [data (lookup-entry config id :zip-file)]
    (. builder zipFile data))
  (.build builder))


(defn cfn-function-code-property-builder
  "Creates a  `CfnFunction$CodeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-code-property-builder (new CfnFunction$CodeProperty$Builder) id config))


(defn build-cfn-function-dead-letter-config-property-builder
  "The build-cfn-function-dead-letter-config-property-builder function updates a CfnFunction$DeadLetterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$DeadLetterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnFunction$DeadLetterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-function-dead-letter-config-property-builder
  "Creates a  `CfnFunction$DeadLetterConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-dead-letter-config-property-builder (new CfnFunction$DeadLetterConfigProperty$Builder) id config))


(defn build-cfn-function-environment-property-builder
  "The build-cfn-function-environment-property-builder function updates a CfnFunction$EnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$EnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnFunction$EnvironmentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn cfn-function-environment-property-builder
  "Creates a  `CfnFunction$EnvironmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-environment-property-builder (new CfnFunction$EnvironmentProperty$Builder) id config))


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


(defn build-cfn-function-logging-config-property-builder
  "The build-cfn-function-logging-config-property-builder function updates a CfnFunction$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
"
  [^CfnFunction$LoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-log-level)]
    (. builder applicationLogLevel data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (lookup-entry config id :system-log-level)]
    (. builder systemLogLevel data))
  (.build builder))


(defn cfn-function-logging-config-property-builder
  "Creates a  `CfnFunction$LoggingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-logging-config-property-builder (new CfnFunction$LoggingConfigProperty$Builder) id config))


(defn build-cfn-function-props-builder
  "The build-cfn-function-props-builder function updates a CfnFunctionProps$Builder instance using the provided configuration.
  The function takes the CfnFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architectures` | java.util.List | [[cdk.support/lookup-entry]] | `:architectures` |
| `code` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-signing-config-arn` |
| `deadLetterConfig` | software.amazon.awscdk.services.lambda.CfnFunction$DeadLetterConfigProperty | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | software.amazon.awscdk.services.lambda.CfnFunction$EnvironmentProperty | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `fileSystemConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file-system-configs` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `imageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-config` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `packageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-type` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeManagementConfig` | software.amazon.awscdk.services.lambda.CfnFunction$RuntimeManagementConfigProperty | [[cdk.support/lookup-entry]] | `:runtime-management-config` |
| `snapStart` | software.amazon.awscdk.services.lambda.CfnFunction$SnapStartProperty | [[cdk.support/lookup-entry]] | `:snap-start` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracingConfig` | software.amazon.awscdk.services.lambda.CfnFunction$TracingConfigProperty | [[cdk.support/lookup-entry]] | `:tracing-config` |
| `vpcConfig` | software.amazon.awscdk.services.lambda.CfnFunction$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnFunctionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :architectures)]
    (. builder architectures data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :code-signing-config-arn)]
    (. builder codeSigningConfigArn data))
  (when-let [data (lookup-entry config id :dead-letter-config)]
    (. builder deadLetterConfig data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :ephemeral-storage)]
    (. builder ephemeralStorage data))
  (when-let [data (lookup-entry config id :file-system-configs)]
    (. builder fileSystemConfigs data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :image-config)]
    (. builder imageConfig data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :package-type)]
    (. builder packageType data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :runtime-management-config)]
    (. builder runtimeManagementConfig data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :tracing-config)]
    (. builder tracingConfig data))
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


(defn build-cfn-function-runtime-management-config-property-builder
  "The build-cfn-function-runtime-management-config-property-builder function updates a CfnFunction$RuntimeManagementConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$RuntimeManagementConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `runtimeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version-arn` |
| `updateRuntimeOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-runtime-on` |
"
  [^CfnFunction$RuntimeManagementConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :runtime-version-arn)]
    (. builder runtimeVersionArn data))
  (when-let [data (lookup-entry config id :update-runtime-on)]
    (. builder updateRuntimeOn data))
  (.build builder))


(defn cfn-function-runtime-management-config-property-builder
  "Creates a  `CfnFunction$RuntimeManagementConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-runtime-management-config-property-builder (new CfnFunction$RuntimeManagementConfigProperty$Builder) id config))


(defn build-cfn-function-snap-start-property-builder
  "The build-cfn-function-snap-start-property-builder function updates a CfnFunction$SnapStartProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$SnapStartProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-on` |
"
  [^CfnFunction$SnapStartProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :apply-on)]
    (. builder applyOn data))
  (.build builder))


(defn cfn-function-snap-start-property-builder
  "Creates a  `CfnFunction$SnapStartProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-snap-start-property-builder (new CfnFunction$SnapStartProperty$Builder) id config))


(defn build-cfn-function-snap-start-response-property-builder
  "The build-cfn-function-snap-start-response-property-builder function updates a CfnFunction$SnapStartResponseProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$SnapStartResponseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-on` |
| `optimizationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:optimization-status` |
"
  [^CfnFunction$SnapStartResponseProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :apply-on)]
    (. builder applyOn data))
  (when-let [data (lookup-entry config id :optimization-status)]
    (. builder optimizationStatus data))
  (.build builder))


(defn cfn-function-snap-start-response-property-builder
  "Creates a  `CfnFunction$SnapStartResponseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-snap-start-response-property-builder (new CfnFunction$SnapStartResponseProperty$Builder) id config))


(defn build-cfn-function-tracing-config-property-builder
  "The build-cfn-function-tracing-config-property-builder function updates a CfnFunction$TracingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$TracingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnFunction$TracingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn cfn-function-tracing-config-property-builder
  "Creates a  `CfnFunction$TracingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-tracing-config-property-builder (new CfnFunction$TracingConfigProperty$Builder) id config))


(defn build-cfn-function-vpc-config-property-builder
  "The build-cfn-function-vpc-config-property-builder function updates a CfnFunction$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6AllowedForDualStack` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnFunction$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
    (. builder ipv6AllowedForDualStack data))
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


(defn build-cfn-layer-version-builder
  "The build-cfn-layer-version-builder function updates a CfnLayerVersion$Builder instance using the provided configuration.
  The function takes the CfnLayerVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleArchitectures` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-architectures` |
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `content` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-name` |
| `licenseInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-info` |
"
  [^CfnLayerVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :compatible-architectures)]
    (. builder compatibleArchitectures data))
  (when-let [data (lookup-entry config id :compatible-runtimes)]
    (. builder compatibleRuntimes data))
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :layer-name)]
    (. builder layerName data))
  (when-let [data (lookup-entry config id :license-info)]
    (. builder licenseInfo data))
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


(defn build-cfn-layer-version-content-property-builder
  "The build-cfn-layer-version-content-property-builder function updates a CfnLayerVersion$ContentProperty$Builder instance using the provided configuration.
  The function takes the CfnLayerVersion$ContentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |
"
  [^CfnLayerVersion$ContentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (when-let [data (lookup-entry config id :s3-object-version)]
    (. builder s3ObjectVersion data))
  (.build builder))


(defn cfn-layer-version-content-property-builder
  "Creates a  `CfnLayerVersion$ContentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-layer-version-content-property-builder (new CfnLayerVersion$ContentProperty$Builder) id config))


(defn build-cfn-layer-version-permission-builder
  "The build-cfn-layer-version-permission-builder function updates a CfnLayerVersionPermission$Builder instance using the provided configuration.
  The function takes the CfnLayerVersionPermission$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `layerVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-arn` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnLayerVersionPermission$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :layer-version-arn)]
    (. builder layerVersionArn data))
  (when-let [data (lookup-entry config id :organization-id)]
    (. builder organizationId data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn cfn-layer-version-permission-builder
  "Creates a  `CfnLayerVersionPermission$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-layer-version-permission-builder (CfnLayerVersionPermission$Builder/create scope (name id)) id config))


(defn build-cfn-layer-version-permission-props-builder
  "The build-cfn-layer-version-permission-props-builder function updates a CfnLayerVersionPermissionProps$Builder instance using the provided configuration.
  The function takes the CfnLayerVersionPermissionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `layerVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-arn` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnLayerVersionPermissionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :layer-version-arn)]
    (. builder layerVersionArn data))
  (when-let [data (lookup-entry config id :organization-id)]
    (. builder organizationId data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn cfn-layer-version-permission-props-builder
  "Creates a  `CfnLayerVersionPermissionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-layer-version-permission-props-builder (new CfnLayerVersionPermissionProps$Builder) id config))


(defn build-cfn-layer-version-props-builder
  "The build-cfn-layer-version-props-builder function updates a CfnLayerVersionProps$Builder instance using the provided configuration.
  The function takes the CfnLayerVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleArchitectures` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-architectures` |
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `content` | software.amazon.awscdk.services.lambda.CfnLayerVersion$ContentProperty | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-name` |
| `licenseInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-info` |
"
  [^CfnLayerVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :compatible-architectures)]
    (. builder compatibleArchitectures data))
  (when-let [data (lookup-entry config id :compatible-runtimes)]
    (. builder compatibleRuntimes data))
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :layer-name)]
    (. builder layerName data))
  (when-let [data (lookup-entry config id :license-info)]
    (. builder licenseInfo data))
  (.build builder))


(defn cfn-layer-version-props-builder
  "Creates a  `CfnLayerVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-layer-version-props-builder (new CfnLayerVersionProps$Builder) id config))


(defn build-cfn-parameters-code-builder
  "The build-cfn-parameters-code-builder function updates a CfnParametersCode$Builder instance using the provided configuration.
  The function takes the CfnParametersCode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketNameParam` | software.amazon.awscdk.CfnParameter | [[cdk.support/lookup-entry]] | `:bucket-name-param` |
| `objectKeyParam` | software.amazon.awscdk.CfnParameter | [[cdk.support/lookup-entry]] | `:object-key-param` |
"
  [^CfnParametersCode$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name-param)]
    (. builder bucketNameParam data))
  (when-let [data (lookup-entry config id :object-key-param)]
    (. builder objectKeyParam data))
  (.build builder))


(defn cfn-parameters-code-builder
  "Creates a  `CfnParametersCode$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-parameters-code-builder (CfnParametersCode$Builder/create) id config))


(defn build-cfn-parameters-code-props-builder
  "The build-cfn-parameters-code-props-builder function updates a CfnParametersCodeProps$Builder instance using the provided configuration.
  The function takes the CfnParametersCodeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketNameParam` | software.amazon.awscdk.CfnParameter | [[cdk.support/lookup-entry]] | `:bucket-name-param` |
| `objectKeyParam` | software.amazon.awscdk.CfnParameter | [[cdk.support/lookup-entry]] | `:object-key-param` |
"
  [^CfnParametersCodeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name-param)]
    (. builder bucketNameParam data))
  (when-let [data (lookup-entry config id :object-key-param)]
    (. builder objectKeyParam data))
  (.build builder))


(defn cfn-parameters-code-props-builder
  "Creates a  `CfnParametersCodeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-parameters-code-props-builder (new CfnParametersCodeProps$Builder) id config))


(defn build-cfn-permission-builder
  "The build-cfn-permission-builder function updates a CfnPermission$Builder instance using the provided configuration.
  The function takes the CfnPermission$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `eventSourceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-token` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionUrlAuthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-url-auth-type` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `principalOrgId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-org-id` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^CfnPermission$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :event-source-token)]
    (. builder eventSourceToken data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :function-url-auth-type)]
    (. builder functionUrlAuthType data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :principal-org-id)]
    (. builder principalOrgId data))
  (when-let [data (lookup-entry config id :source-account)]
    (. builder sourceAccount data))
  (when-let [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (.build builder))


(defn cfn-permission-builder
  "Creates a  `CfnPermission$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-permission-builder (CfnPermission$Builder/create scope (name id)) id config))


(defn build-cfn-permission-props-builder
  "The build-cfn-permission-props-builder function updates a CfnPermissionProps$Builder instance using the provided configuration.
  The function takes the CfnPermissionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `eventSourceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-token` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionUrlAuthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-url-auth-type` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `principalOrgId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-org-id` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^CfnPermissionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :event-source-token)]
    (. builder eventSourceToken data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :function-url-auth-type)]
    (. builder functionUrlAuthType data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :principal-org-id)]
    (. builder principalOrgId data))
  (when-let [data (lookup-entry config id :source-account)]
    (. builder sourceAccount data))
  (when-let [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (.build builder))


(defn cfn-permission-props-builder
  "Creates a  `CfnPermissionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-permission-props-builder (new CfnPermissionProps$Builder) id config))


(defn build-cfn-url-builder
  "The build-cfn-url-builder function updates a CfnUrl$Builder instance using the provided configuration.
  The function takes the CfnUrl$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `cors` | software.amazon.awscdk.services.lambda.CfnUrl$CorsProperty | [[cdk.support/lookup-entry]] | `:cors` |
| `invokeMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:invoke-mode` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `targetFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-function-arn` |
"
  [^CfnUrl$Builder builder id config]
  (when-let [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (lookup-entry config id :invoke-mode)]
    (. builder invokeMode data))
  (when-let [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (when-let [data (lookup-entry config id :target-function-arn)]
    (. builder targetFunctionArn data))
  (.build builder))


(defn cfn-url-builder
  "Creates a  `CfnUrl$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-url-builder (CfnUrl$Builder/create scope (name id)) id config))


(defn build-cfn-url-cors-property-builder
  "The build-cfn-url-cors-property-builder function updates a CfnUrl$CorsProperty$Builder instance using the provided configuration.
  The function takes the CfnUrl$CorsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-origins` |
| `exposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:expose-headers` |
| `maxAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age` |
"
  [^CfnUrl$CorsProperty$Builder builder id config]
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


(defn cfn-url-cors-property-builder
  "Creates a  `CfnUrl$CorsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-url-cors-property-builder (new CfnUrl$CorsProperty$Builder) id config))


(defn build-cfn-url-props-builder
  "The build-cfn-url-props-builder function updates a CfnUrlProps$Builder instance using the provided configuration.
  The function takes the CfnUrlProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `cors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors` |
| `invokeMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:invoke-mode` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `targetFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-function-arn` |
"
  [^CfnUrlProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (lookup-entry config id :invoke-mode)]
    (. builder invokeMode data))
  (when-let [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (when-let [data (lookup-entry config id :target-function-arn)]
    (. builder targetFunctionArn data))
  (.build builder))


(defn cfn-url-props-builder
  "Creates a  `CfnUrlProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-url-props-builder (new CfnUrlProps$Builder) id config))


(defn build-cfn-version-builder
  "The build-cfn-version-builder function updates a CfnVersion$Builder instance using the provided configuration.
  The function takes the CfnVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-sha256` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.services.lambda.CfnVersion$ProvisionedConcurrencyConfigurationProperty | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `runtimePolicy` | software.amazon.awscdk.services.lambda.CfnVersion$RuntimePolicyProperty | [[cdk.support/lookup-entry]] | `:runtime-policy` |
"
  [^CfnVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :code-sha256)]
    (. builder codeSha256 data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :provisioned-concurrency-config)]
    (. builder provisionedConcurrencyConfig data))
  (when-let [data (lookup-entry config id :runtime-policy)]
    (. builder runtimePolicy data))
  (.build builder))


(defn cfn-version-builder
  "Creates a  `CfnVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-version-builder (CfnVersion$Builder/create scope (name id)) id config))


(defn build-cfn-version-props-builder
  "The build-cfn-version-props-builder function updates a CfnVersionProps$Builder instance using the provided configuration.
  The function takes the CfnVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-sha256` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.services.lambda.CfnVersion$ProvisionedConcurrencyConfigurationProperty | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `runtimePolicy` | software.amazon.awscdk.services.lambda.CfnVersion$RuntimePolicyProperty | [[cdk.support/lookup-entry]] | `:runtime-policy` |
"
  [^CfnVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :code-sha256)]
    (. builder codeSha256 data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :provisioned-concurrency-config)]
    (. builder provisionedConcurrencyConfig data))
  (when-let [data (lookup-entry config id :runtime-policy)]
    (. builder runtimePolicy data))
  (.build builder))


(defn cfn-version-props-builder
  "Creates a  `CfnVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-version-props-builder (new CfnVersionProps$Builder) id config))


(defn build-cfn-version-provisioned-concurrency-configuration-property-builder
  "The build-cfn-version-provisioned-concurrency-configuration-property-builder function updates a CfnVersion$ProvisionedConcurrencyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnVersion$ProvisionedConcurrencyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
"
  [^CfnVersion$ProvisionedConcurrencyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (.build builder))


(defn cfn-version-provisioned-concurrency-configuration-property-builder
  "Creates a  `CfnVersion$ProvisionedConcurrencyConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-version-provisioned-concurrency-configuration-property-builder (new CfnVersion$ProvisionedConcurrencyConfigurationProperty$Builder) id config))


(defn build-cfn-version-runtime-policy-property-builder
  "The build-cfn-version-runtime-policy-property-builder function updates a CfnVersion$RuntimePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnVersion$RuntimePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `runtimeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version-arn` |
| `updateRuntimeOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-runtime-on` |
"
  [^CfnVersion$RuntimePolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :runtime-version-arn)]
    (. builder runtimeVersionArn data))
  (when-let [data (lookup-entry config id :update-runtime-on)]
    (. builder updateRuntimeOn data))
  (.build builder))


(defn cfn-version-runtime-policy-property-builder
  "Creates a  `CfnVersion$RuntimePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-version-runtime-policy-property-builder (new CfnVersion$RuntimePolicyProperty$Builder) id config))


(defn build-code-config-builder
  "The build-code-config-builder function updates a CodeConfig$Builder instance using the provided configuration.
  The function takes the CodeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `image` | software.amazon.awscdk.services.lambda.CodeImageConfig | [[cdk.support/lookup-entry]] | `:image` |
| `inlineCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-code` |
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^CodeConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :image)]
    (. builder image data))
  (when-let [data (lookup-entry config id :inline-code)]
    (. builder inlineCode data))
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn code-config-builder
  "Creates a  `CodeConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-code-config-builder (new CodeConfig$Builder) id config))


(defn build-code-image-config-builder
  "The build-code-image-config-builder function updates a CodeImageConfig$Builder instance using the provided configuration.
  The function takes the CodeImageConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmd` | java.util.List | [[cdk.support/lookup-entry]] | `:cmd` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CodeImageConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :cmd)]
    (. builder cmd data))
  (when-let [data (lookup-entry config id :entrypoint)]
    (. builder entrypoint data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-let [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn code-image-config-builder
  "Creates a  `CodeImageConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-code-image-config-builder (new CodeImageConfig$Builder) id config))


(defn build-code-signing-config-builder
  "The build-code-signing-config-builder function updates a CodeSigningConfig$Builder instance using the provided configuration.
  The function takes the CodeSigningConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `signingProfiles` | java.util.List | [[cdk.support/lookup-entry]] | `:signing-profiles` |
| `untrustedArtifactOnDeployment` | software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment | [[cdk.api.services.lambda/untrusted-artifact-on-deployment]] | `:untrusted-artifact-on-deployment` |
"
  [^CodeSigningConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :signing-profiles)]
    (. builder signingProfiles data))
  (when-let [data (untrusted-artifact-on-deployment config id :untrusted-artifact-on-deployment)]
    (. builder untrustedArtifactOnDeployment data))
  (.build builder))


(defn code-signing-config-builder
  "Creates a  `CodeSigningConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-code-signing-config-builder (CodeSigningConfig$Builder/create scope (name id)) id config))


(defn build-code-signing-config-props-builder
  "The build-code-signing-config-props-builder function updates a CodeSigningConfigProps$Builder instance using the provided configuration.
  The function takes the CodeSigningConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `signingProfiles` | java.util.List | [[cdk.support/lookup-entry]] | `:signing-profiles` |
| `untrustedArtifactOnDeployment` | software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment | [[cdk.api.services.lambda/untrusted-artifact-on-deployment]] | `:untrusted-artifact-on-deployment` |
"
  [^CodeSigningConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :signing-profiles)]
    (. builder signingProfiles data))
  (when-let [data (untrusted-artifact-on-deployment config id :untrusted-artifact-on-deployment)]
    (. builder untrustedArtifactOnDeployment data))
  (.build builder))


(defn code-signing-config-props-builder
  "Creates a  `CodeSigningConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-code-signing-config-props-builder (new CodeSigningConfigProps$Builder) id config))


(defn build-custom-command-options-builder
  "The build-custom-command-options-builder function updates a CustomCommandOptions$Builder instance using the provided configuration.
  The function takes the CustomCommandOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `commandOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:command-options` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
"
  [^CustomCommandOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-let [data (asset-hash-type config id :asset-hash-type)]
    (. builder assetHashType data))
  (when-let [data (lookup-entry config id :bundling)]
    (. builder bundling data))
  (when-let [data (lookup-entry config id :command-options)]
    (. builder commandOptions data))
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


(defn custom-command-options-builder
  "Creates a  `CustomCommandOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-custom-command-options-builder (new CustomCommandOptions$Builder) id config))


(defn build-destination-config-builder
  "The build-destination-config-builder function updates a DestinationConfig$Builder instance using the provided configuration.
  The function takes the DestinationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
"
  [^DestinationConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (.build builder))


(defn destination-config-builder
  "Creates a  `DestinationConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-destination-config-builder (new DestinationConfig$Builder) id config))


(defn build-destination-options-builder
  "The build-destination-options-builder function updates a DestinationOptions$Builder instance using the provided configuration.
  The function takes the DestinationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | software.amazon.awscdk.services.lambda.DestinationType | [[cdk.api.services.lambda/destination-type]] | `:type` |
"
  [^DestinationOptions$Builder builder id config]
  (when-let [data (destination-type config id :type)]
    (. builder type data))
  (.build builder))


(defn destination-options-builder
  "Creates a  `DestinationOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-destination-options-builder (new DestinationOptions$Builder) id config))


(defn build-dlq-destination-config-builder
  "The build-dlq-destination-config-builder function updates a DlqDestinationConfig$Builder instance using the provided configuration.
  The function takes the DlqDestinationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
"
  [^DlqDestinationConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (.build builder))


(defn dlq-destination-config-builder
  "Creates a  `DlqDestinationConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-dlq-destination-config-builder (new DlqDestinationConfig$Builder) id config))


(defn build-docker-build-asset-options-builder
  "The build-docker-build-asset-options-builder function updates a DockerBuildAssetOptions$Builder instance using the provided configuration.
  The function takes the DockerBuildAssetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `imagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `targetStage` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-stage` |
"
  [^DockerBuildAssetOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :build-args)]
    (. builder buildArgs data))
  (when-let [data (lookup-entry config id :cache-disabled)]
    (. builder cacheDisabled data))
  (when-let [data (lookup-entry config id :cache-from)]
    (. builder cacheFrom data))
  (when-let [data (lookup-entry config id :cache-to)]
    (. builder cacheTo data))
  (when-let [data (lookup-entry config id :file)]
    (. builder file data))
  (when-let [data (lookup-entry config id :image-path)]
    (. builder imagePath data))
  (when-let [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-let [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-let [data (lookup-entry config id :target-stage)]
    (. builder targetStage data))
  (.build builder))


(defn docker-build-asset-options-builder
  "Creates a  `DockerBuildAssetOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-docker-build-asset-options-builder (new DockerBuildAssetOptions$Builder) id config))


(defn build-docker-image-function-builder
  "The build-docker-image-function-builder function updates a DockerImageFunction$Builder instance using the provided configuration.
  The function takes the DockerImageFunction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `code` | software.amazon.awscdk.services.lambda.DockerImageCode | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DockerImageFunction$Builder builder id config]
  (when-let [data (lookup-entry config id :adot-instrumentation)]
    (. builder adotInstrumentation data))
  (when-let [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-let [data (lookup-entry config id :allow-public-subnet)]
    (. builder allowPublicSubnet data))
  (when-let [data (lookup-entry config id :application-log-level)]
    (. builder applicationLogLevel data))
  (when-let [data (application-log-level config id :application-log-level-v2)]
    (. builder applicationLogLevelV2 data))
  (when-let [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :code-signing-config)]
    (. builder codeSigningConfig data))
  (when-let [data (lookup-entry config id :current-version-options)]
    (. builder currentVersionOptions data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
    (. builder deadLetterQueueEnabled data))
  (when-let [data (lookup-entry config id :dead-letter-topic)]
    (. builder deadLetterTopic data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filesystem)]
    (. builder filesystem data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :initial-policy)]
    (. builder initialPolicy data))
  (when-let [data (lookup-entry config id :insights-version)]
    (. builder insightsVersion data))
  (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
    (. builder ipv6AllowedForDualStack data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-let [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-let [data (logging-format config id :logging-format)]
    (. builder loggingFormat data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :params-and-secrets)]
    (. builder paramsAndSecrets data))
  (when-let [data (lookup-entry config id :profiling)]
    (. builder profiling data))
  (when-let [data (lookup-entry config id :profiling-group)]
    (. builder profilingGroup data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime-management-mode)]
    (. builder runtimeManagementMode data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :system-log-level)]
    (. builder systemLogLevel data))
  (when-let [data (system-log-level config id :system-log-level-v2)]
    (. builder systemLogLevelV2 data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (tracing config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn docker-image-function-builder
  "Creates a  `DockerImageFunction$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-docker-image-function-builder (DockerImageFunction$Builder/create scope (name id)) id config))


(defn build-docker-image-function-props-builder
  "The build-docker-image-function-props-builder function updates a DockerImageFunctionProps$Builder instance using the provided configuration.
  The function takes the DockerImageFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `code` | software.amazon.awscdk.services.lambda.DockerImageCode | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DockerImageFunctionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :adot-instrumentation)]
    (. builder adotInstrumentation data))
  (when-let [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-let [data (lookup-entry config id :allow-public-subnet)]
    (. builder allowPublicSubnet data))
  (when-let [data (lookup-entry config id :application-log-level)]
    (. builder applicationLogLevel data))
  (when-let [data (application-log-level config id :application-log-level-v2)]
    (. builder applicationLogLevelV2 data))
  (when-let [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :code-signing-config)]
    (. builder codeSigningConfig data))
  (when-let [data (lookup-entry config id :current-version-options)]
    (. builder currentVersionOptions data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
    (. builder deadLetterQueueEnabled data))
  (when-let [data (lookup-entry config id :dead-letter-topic)]
    (. builder deadLetterTopic data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filesystem)]
    (. builder filesystem data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :initial-policy)]
    (. builder initialPolicy data))
  (when-let [data (lookup-entry config id :insights-version)]
    (. builder insightsVersion data))
  (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
    (. builder ipv6AllowedForDualStack data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-let [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-let [data (logging-format config id :logging-format)]
    (. builder loggingFormat data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :params-and-secrets)]
    (. builder paramsAndSecrets data))
  (when-let [data (lookup-entry config id :profiling)]
    (. builder profiling data))
  (when-let [data (lookup-entry config id :profiling-group)]
    (. builder profilingGroup data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime-management-mode)]
    (. builder runtimeManagementMode data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :system-log-level)]
    (. builder systemLogLevel data))
  (when-let [data (system-log-level config id :system-log-level-v2)]
    (. builder systemLogLevelV2 data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (tracing config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn docker-image-function-props-builder
  "Creates a  `DockerImageFunctionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-docker-image-function-props-builder (new DockerImageFunctionProps$Builder) id config))


(defn build-ecr-image-code-builder
  "The build-ecr-image-code-builder function updates a EcrImageCode$Builder instance using the provided configuration.
  The function takes the EcrImageCode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmd` | java.util.List | [[cdk.support/lookup-entry]] | `:cmd` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `tagOrDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-or-digest` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^EcrImageCode$Builder builder id config]
  (when-let [data (lookup-entry config id :cmd)]
    (. builder cmd data))
  (when-let [data (lookup-entry config id :entrypoint)]
    (. builder entrypoint data))
  (when-let [data (lookup-entry config id :tag)]
    (. builder tag data))
  (when-let [data (lookup-entry config id :tag-or-digest)]
    (. builder tagOrDigest data))
  (when-let [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn ecr-image-code-builder
  "Creates a  `EcrImageCode$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.ecr.IRepository]___
| Argument | DataType | Description |
|---|---|---|
| repository | software.amazon.awscdk.services.ecr.IRepository |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^IRepository repository id config]
  (build-ecr-image-code-builder (EcrImageCode$Builder/create repository) id config))


(defn build-ecr-image-code-props-builder
  "The build-ecr-image-code-props-builder function updates a EcrImageCodeProps$Builder instance using the provided configuration.
  The function takes the EcrImageCodeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmd` | java.util.List | [[cdk.support/lookup-entry]] | `:cmd` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `tagOrDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-or-digest` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^EcrImageCodeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cmd)]
    (. builder cmd data))
  (when-let [data (lookup-entry config id :entrypoint)]
    (. builder entrypoint data))
  (when-let [data (lookup-entry config id :tag)]
    (. builder tag data))
  (when-let [data (lookup-entry config id :tag-or-digest)]
    (. builder tagOrDigest data))
  (when-let [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn ecr-image-code-props-builder
  "Creates a  `EcrImageCodeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecr-image-code-props-builder (new EcrImageCodeProps$Builder) id config))


(defn build-environment-options-builder
  "The build-environment-options-builder function updates a EnvironmentOptions$Builder instance using the provided configuration.
  The function takes the EnvironmentOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `removeInEdge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-in-edge` |
"
  [^EnvironmentOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :remove-in-edge)]
    (. builder removeInEdge data))
  (.build builder))


(defn environment-options-builder
  "Creates a  `EnvironmentOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-environment-options-builder (new EnvironmentOptions$Builder) id config))


(defn build-event-invoke-config-builder
  "The build-event-invoke-config-builder function updates a EventInvokeConfig$Builder instance using the provided configuration.
  The function takes the EventInvokeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^EventInvokeConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :function)]
    (. builder function data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn event-invoke-config-builder
  "Creates a  `EventInvokeConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-event-invoke-config-builder (EventInvokeConfig$Builder/create scope (name id)) id config))


(defn build-event-invoke-config-options-builder
  "The build-event-invoke-config-options-builder function updates a EventInvokeConfigOptions$Builder instance using the provided configuration.
  The function takes the EventInvokeConfigOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^EventInvokeConfigOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn event-invoke-config-options-builder
  "Creates a  `EventInvokeConfigOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-event-invoke-config-options-builder (new EventInvokeConfigOptions$Builder) id config))


(defn build-event-invoke-config-props-builder
  "The build-event-invoke-config-props-builder function updates a EventInvokeConfigProps$Builder instance using the provided configuration.
  The function takes the EventInvokeConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^EventInvokeConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :function)]
    (. builder function data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn event-invoke-config-props-builder
  "Creates a  `EventInvokeConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-event-invoke-config-props-builder (new EventInvokeConfigProps$Builder) id config))


(defn build-event-source-mapping-builder
  "The build-event-source-mapping-builder function updates a EventSourceMapping$Builder instance using the provided configuration.
  The function takes the EventSourceMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-error` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-arn` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `kafkaBootstrapServers` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-bootstrap-servers` |
| `kafkaConsumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-consumer-group-id` |
| `kafkaTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-topic` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxRecordAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-record-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `sourceAccessConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:source-access-configurations` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `startingPositionTimestamp` | java.lang.Number | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |
| `supportS3OnFailureDestination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:support-s3-on-failure-destination` |
| `target` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:target` |
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |
"
  [^EventSourceMapping$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :event-source-arn)]
    (. builder eventSourceArn data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :kafka-bootstrap-servers)]
    (. builder kafkaBootstrapServers data))
  (when-let [data (lookup-entry config id :kafka-consumer-group-id)]
    (. builder kafkaConsumerGroupId data))
  (when-let [data (lookup-entry config id :kafka-topic)]
    (. builder kafkaTopic data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-let [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :source-access-configurations)]
    (. builder sourceAccessConfigurations data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-let [data (lookup-entry config id :support-s3-on-failure-destination)]
    (. builder supportS3OnFailureDestination data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn event-source-mapping-builder
  "Creates a  `EventSourceMapping$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-event-source-mapping-builder (EventSourceMapping$Builder/create scope (name id)) id config))


(defn build-event-source-mapping-options-builder
  "The build-event-source-mapping-options-builder function updates a EventSourceMappingOptions$Builder instance using the provided configuration.
  The function takes the EventSourceMappingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-error` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-arn` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `kafkaBootstrapServers` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-bootstrap-servers` |
| `kafkaConsumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-consumer-group-id` |
| `kafkaTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-topic` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxRecordAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-record-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `sourceAccessConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:source-access-configurations` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `startingPositionTimestamp` | java.lang.Number | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |
| `supportS3OnFailureDestination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:support-s3-on-failure-destination` |
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |
"
  [^EventSourceMappingOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :event-source-arn)]
    (. builder eventSourceArn data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :kafka-bootstrap-servers)]
    (. builder kafkaBootstrapServers data))
  (when-let [data (lookup-entry config id :kafka-consumer-group-id)]
    (. builder kafkaConsumerGroupId data))
  (when-let [data (lookup-entry config id :kafka-topic)]
    (. builder kafkaTopic data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-let [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :source-access-configurations)]
    (. builder sourceAccessConfigurations data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-let [data (lookup-entry config id :support-s3-on-failure-destination)]
    (. builder supportS3OnFailureDestination data))
  (when-let [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn event-source-mapping-options-builder
  "Creates a  `EventSourceMappingOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-event-source-mapping-options-builder (new EventSourceMappingOptions$Builder) id config))


(defn build-event-source-mapping-props-builder
  "The build-event-source-mapping-props-builder function updates a EventSourceMappingProps$Builder instance using the provided configuration.
  The function takes the EventSourceMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-error` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-arn` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `kafkaBootstrapServers` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-bootstrap-servers` |
| `kafkaConsumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-consumer-group-id` |
| `kafkaTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-topic` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxRecordAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-record-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `sourceAccessConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:source-access-configurations` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `startingPositionTimestamp` | java.lang.Number | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |
| `supportS3OnFailureDestination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:support-s3-on-failure-destination` |
| `target` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:target` |
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |
"
  [^EventSourceMappingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :event-source-arn)]
    (. builder eventSourceArn data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :kafka-bootstrap-servers)]
    (. builder kafkaBootstrapServers data))
  (when-let [data (lookup-entry config id :kafka-consumer-group-id)]
    (. builder kafkaConsumerGroupId data))
  (when-let [data (lookup-entry config id :kafka-topic)]
    (. builder kafkaTopic data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-let [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :source-access-configurations)]
    (. builder sourceAccessConfigurations data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-let [data (lookup-entry config id :support-s3-on-failure-destination)]
    (. builder supportS3OnFailureDestination data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn event-source-mapping-props-builder
  "Creates a  `EventSourceMappingProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-event-source-mapping-props-builder (new EventSourceMappingProps$Builder) id config))


(defn build-file-system-config-builder
  "The build-file-system-config-builder function updates a FileSystemConfig$Builder instance using the provided configuration.
  The function takes the FileSystemConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `connections` | software.amazon.awscdk.services.ec2.Connections | [[cdk.support/lookup-entry]] | `:connections` |
| `dependency` | java.util.List | [[cdk.support/lookup-entry]] | `:dependency` |
| `localMountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-mount-path` |
| `policies` | java.util.List | [[cdk.support/lookup-entry]] | `:policies` |
"
  [^FileSystemConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :connections)]
    (. builder connections data))
  (when-let [data (lookup-entry config id :dependency)]
    (. builder dependency data))
  (when-let [data (lookup-entry config id :local-mount-path)]
    (. builder localMountPath data))
  (when-let [data (lookup-entry config id :policies)]
    (. builder policies data))
  (.build builder))


(defn file-system-config-builder
  "Creates a  `FileSystemConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-file-system-config-builder (new FileSystemConfig$Builder) id config))


(defn build-function-attributes-builder
  "The build-function-attributes-builder function updates a FunctionAttributes$Builder instance using the provided configuration.
  The function takes the FunctionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `sameEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:same-environment` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `skipPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-permissions` |
"
  [^FunctionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :same-environment)]
    (. builder sameEnvironment data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (lookup-entry config id :skip-permissions)]
    (. builder skipPermissions data))
  (.build builder))


(defn function-attributes-builder
  "Creates a  `FunctionAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-function-attributes-builder (new FunctionAttributes$Builder) id config))


(defn build-function-builder
  "The build-function-builder function updates a Function$Builder instance using the provided configuration.
  The function takes the Function$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | software.amazon.awscdk.services.lambda.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^Function$Builder builder id config]
  (when-let [data (lookup-entry config id :adot-instrumentation)]
    (. builder adotInstrumentation data))
  (when-let [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-let [data (lookup-entry config id :allow-public-subnet)]
    (. builder allowPublicSubnet data))
  (when-let [data (lookup-entry config id :application-log-level)]
    (. builder applicationLogLevel data))
  (when-let [data (application-log-level config id :application-log-level-v2)]
    (. builder applicationLogLevelV2 data))
  (when-let [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :code-signing-config)]
    (. builder codeSigningConfig data))
  (when-let [data (lookup-entry config id :current-version-options)]
    (. builder currentVersionOptions data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
    (. builder deadLetterQueueEnabled data))
  (when-let [data (lookup-entry config id :dead-letter-topic)]
    (. builder deadLetterTopic data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filesystem)]
    (. builder filesystem data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :initial-policy)]
    (. builder initialPolicy data))
  (when-let [data (lookup-entry config id :insights-version)]
    (. builder insightsVersion data))
  (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
    (. builder ipv6AllowedForDualStack data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-let [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-let [data (logging-format config id :logging-format)]
    (. builder loggingFormat data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :params-and-secrets)]
    (. builder paramsAndSecrets data))
  (when-let [data (lookup-entry config id :profiling)]
    (. builder profiling data))
  (when-let [data (lookup-entry config id :profiling-group)]
    (. builder profilingGroup data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :runtime-management-mode)]
    (. builder runtimeManagementMode data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :system-log-level)]
    (. builder systemLogLevel data))
  (when-let [data (system-log-level config id :system-log-level-v2)]
    (. builder systemLogLevelV2 data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (tracing config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn function-builder
  "Creates a  `Function$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-function-builder (Function$Builder/create scope (name id)) id config))


(defn build-function-options-builder
  "The build-function-options-builder function updates a FunctionOptions$Builder instance using the provided configuration.
  The function takes the FunctionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FunctionOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :adot-instrumentation)]
    (. builder adotInstrumentation data))
  (when-let [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-let [data (lookup-entry config id :allow-public-subnet)]
    (. builder allowPublicSubnet data))
  (when-let [data (lookup-entry config id :application-log-level)]
    (. builder applicationLogLevel data))
  (when-let [data (application-log-level config id :application-log-level-v2)]
    (. builder applicationLogLevelV2 data))
  (when-let [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :code-signing-config)]
    (. builder codeSigningConfig data))
  (when-let [data (lookup-entry config id :current-version-options)]
    (. builder currentVersionOptions data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
    (. builder deadLetterQueueEnabled data))
  (when-let [data (lookup-entry config id :dead-letter-topic)]
    (. builder deadLetterTopic data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filesystem)]
    (. builder filesystem data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :initial-policy)]
    (. builder initialPolicy data))
  (when-let [data (lookup-entry config id :insights-version)]
    (. builder insightsVersion data))
  (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
    (. builder ipv6AllowedForDualStack data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-let [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-let [data (logging-format config id :logging-format)]
    (. builder loggingFormat data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :params-and-secrets)]
    (. builder paramsAndSecrets data))
  (when-let [data (lookup-entry config id :profiling)]
    (. builder profiling data))
  (when-let [data (lookup-entry config id :profiling-group)]
    (. builder profilingGroup data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime-management-mode)]
    (. builder runtimeManagementMode data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :system-log-level)]
    (. builder systemLogLevel data))
  (when-let [data (system-log-level config id :system-log-level-v2)]
    (. builder systemLogLevelV2 data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (tracing config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn function-options-builder
  "Creates a  `FunctionOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-function-options-builder (new FunctionOptions$Builder) id config))


(defn build-function-props-builder
  "The build-function-props-builder function updates a FunctionProps$Builder instance using the provided configuration.
  The function takes the FunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | software.amazon.awscdk.services.lambda.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FunctionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :adot-instrumentation)]
    (. builder adotInstrumentation data))
  (when-let [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-let [data (lookup-entry config id :allow-public-subnet)]
    (. builder allowPublicSubnet data))
  (when-let [data (lookup-entry config id :application-log-level)]
    (. builder applicationLogLevel data))
  (when-let [data (application-log-level config id :application-log-level-v2)]
    (. builder applicationLogLevelV2 data))
  (when-let [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :code-signing-config)]
    (. builder codeSigningConfig data))
  (when-let [data (lookup-entry config id :current-version-options)]
    (. builder currentVersionOptions data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
    (. builder deadLetterQueueEnabled data))
  (when-let [data (lookup-entry config id :dead-letter-topic)]
    (. builder deadLetterTopic data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filesystem)]
    (. builder filesystem data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :initial-policy)]
    (. builder initialPolicy data))
  (when-let [data (lookup-entry config id :insights-version)]
    (. builder insightsVersion data))
  (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
    (. builder ipv6AllowedForDualStack data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-let [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-let [data (logging-format config id :logging-format)]
    (. builder loggingFormat data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :params-and-secrets)]
    (. builder paramsAndSecrets data))
  (when-let [data (lookup-entry config id :profiling)]
    (. builder profiling data))
  (when-let [data (lookup-entry config id :profiling-group)]
    (. builder profilingGroup data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :runtime-management-mode)]
    (. builder runtimeManagementMode data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :system-log-level)]
    (. builder systemLogLevel data))
  (when-let [data (system-log-level config id :system-log-level-v2)]
    (. builder systemLogLevelV2 data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (tracing config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn function-props-builder
  "Creates a  `FunctionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-function-props-builder (new FunctionProps$Builder) id config))


(defn build-function-url-builder
  "The build-function-url-builder function updates a FunctionUrl$Builder instance using the provided configuration.
  The function takes the FunctionUrl$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | software.amazon.awscdk.services.lambda.FunctionUrlAuthType | [[cdk.api.services.lambda/function-url-auth-type]] | `:auth-type` |
| `cors` | software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions | [[cdk.support/lookup-entry]] | `:cors` |
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `invokeMode` | software.amazon.awscdk.services.lambda.InvokeMode | [[cdk.api.services.lambda/invoke-mode]] | `:invoke-mode` |
"
  [^FunctionUrl$Builder builder id config]
  (when-let [data (function-url-auth-type config id :auth-type)]
    (. builder authType data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (lookup-entry config id :function)]
    (. builder function data))
  (when-let [data (invoke-mode config id :invoke-mode)]
    (. builder invokeMode data))
  (.build builder))


(defn function-url-builder
  "Creates a  `FunctionUrl$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-function-url-builder (FunctionUrl$Builder/create scope (name id)) id config))


(defn build-function-url-cors-options-builder
  "The build-function-url-cors-options-builder function updates a FunctionUrlCorsOptions$Builder instance using the provided configuration.
  The function takes the FunctionUrlCorsOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-headers` |
| `allowedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `exposedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:exposed-headers` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |
"
  [^FunctionUrlCorsOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-credentials)]
    (. builder allowCredentials data))
  (when-let [data (lookup-entry config id :allowed-headers)]
    (. builder allowedHeaders data))
  (when-let [data (lookup-entry config id :allowed-methods)]
    (. builder allowedMethods data))
  (when-let [data (lookup-entry config id :allowed-origins)]
    (. builder allowedOrigins data))
  (when-let [data (lookup-entry config id :exposed-headers)]
    (. builder exposedHeaders data))
  (when-let [data (lookup-entry config id :max-age)]
    (. builder maxAge data))
  (.build builder))


(defn function-url-cors-options-builder
  "Creates a  `FunctionUrlCorsOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-function-url-cors-options-builder (new FunctionUrlCorsOptions$Builder) id config))


(defn build-function-url-options-builder
  "The build-function-url-options-builder function updates a FunctionUrlOptions$Builder instance using the provided configuration.
  The function takes the FunctionUrlOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | software.amazon.awscdk.services.lambda.FunctionUrlAuthType | [[cdk.api.services.lambda/function-url-auth-type]] | `:auth-type` |
| `cors` | software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions | [[cdk.support/lookup-entry]] | `:cors` |
| `invokeMode` | software.amazon.awscdk.services.lambda.InvokeMode | [[cdk.api.services.lambda/invoke-mode]] | `:invoke-mode` |
"
  [^FunctionUrlOptions$Builder builder id config]
  (when-let [data (function-url-auth-type config id :auth-type)]
    (. builder authType data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (invoke-mode config id :invoke-mode)]
    (. builder invokeMode data))
  (.build builder))


(defn function-url-options-builder
  "Creates a  `FunctionUrlOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-function-url-options-builder (new FunctionUrlOptions$Builder) id config))


(defn build-function-url-props-builder
  "The build-function-url-props-builder function updates a FunctionUrlProps$Builder instance using the provided configuration.
  The function takes the FunctionUrlProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | software.amazon.awscdk.services.lambda.FunctionUrlAuthType | [[cdk.api.services.lambda/function-url-auth-type]] | `:auth-type` |
| `cors` | software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions | [[cdk.support/lookup-entry]] | `:cors` |
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `invokeMode` | software.amazon.awscdk.services.lambda.InvokeMode | [[cdk.api.services.lambda/invoke-mode]] | `:invoke-mode` |
"
  [^FunctionUrlProps$Builder builder id config]
  (when-let [data (function-url-auth-type config id :auth-type)]
    (. builder authType data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (lookup-entry config id :function)]
    (. builder function data))
  (when-let [data (invoke-mode config id :invoke-mode)]
    (. builder invokeMode data))
  (.build builder))


(defn function-url-props-builder
  "Creates a  `FunctionUrlProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-function-url-props-builder (new FunctionUrlProps$Builder) id config))


(defn build-lambda-runtime-props-builder
  "The build-lambda-runtime-props-builder function updates a LambdaRuntimeProps$Builder instance using the provided configuration.
  The function takes the LambdaRuntimeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundlingDockerImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundling-docker-image` |
| `isVariable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-variable` |
| `supportsCodeGuruProfiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-code-guru-profiling` |
| `supportsInlineCode` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-inline-code` |
| `supportsSnapStart` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-snap-start` |
"
  [^LambdaRuntimeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bundling-docker-image)]
    (. builder bundlingDockerImage data))
  (when-let [data (lookup-entry config id :is-variable)]
    (. builder isVariable data))
  (when-let [data (lookup-entry config id :supports-code-guru-profiling)]
    (. builder supportsCodeGuruProfiling data))
  (when-let [data (lookup-entry config id :supports-inline-code)]
    (. builder supportsInlineCode data))
  (when-let [data (lookup-entry config id :supports-snap-start)]
    (. builder supportsSnapStart data))
  (.build builder))


(defn lambda-runtime-props-builder
  "Creates a  `LambdaRuntimeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lambda-runtime-props-builder (new LambdaRuntimeProps$Builder) id config))


(defn build-layer-version-attributes-builder
  "The build-layer-version-attributes-builder function updates a LayerVersionAttributes$Builder instance using the provided configuration.
  The function takes the LayerVersionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `layerVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-arn` |
"
  [^LayerVersionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :compatible-runtimes)]
    (. builder compatibleRuntimes data))
  (when-let [data (lookup-entry config id :layer-version-arn)]
    (. builder layerVersionArn data))
  (.build builder))


(defn layer-version-attributes-builder
  "Creates a  `LayerVersionAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-layer-version-attributes-builder (new LayerVersionAttributes$Builder) id config))


(defn build-layer-version-builder
  "The build-layer-version-builder function updates a LayerVersion$Builder instance using the provided configuration.
  The function takes the LayerVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `compatibleArchitectures` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-architectures` |
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-name` |
| `license` | java.lang.String | [[cdk.support/lookup-entry]] | `:license` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^LayerVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :compatible-architectures)]
    (. builder compatibleArchitectures data))
  (when-let [data (lookup-entry config id :compatible-runtimes)]
    (. builder compatibleRuntimes data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :layer-version-name)]
    (. builder layerVersionName data))
  (when-let [data (lookup-entry config id :license)]
    (. builder license data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn layer-version-builder
  "Creates a  `LayerVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-layer-version-builder (LayerVersion$Builder/create scope (name id)) id config))


(defn build-layer-version-options-builder
  "The build-layer-version-options-builder function updates a LayerVersionOptions$Builder instance using the provided configuration.
  The function takes the LayerVersionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-name` |
| `license` | java.lang.String | [[cdk.support/lookup-entry]] | `:license` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^LayerVersionOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :layer-version-name)]
    (. builder layerVersionName data))
  (when-let [data (lookup-entry config id :license)]
    (. builder license data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn layer-version-options-builder
  "Creates a  `LayerVersionOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-layer-version-options-builder (new LayerVersionOptions$Builder) id config))


(defn build-layer-version-permission-builder
  "The build-layer-version-permission-builder function updates a LayerVersionPermission$Builder instance using the provided configuration.
  The function takes the LayerVersionPermission$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
"
  [^LayerVersionPermission$Builder builder id config]
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :organization-id)]
    (. builder organizationId data))
  (.build builder))


(defn layer-version-permission-builder
  "Creates a  `LayerVersionPermission$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-layer-version-permission-builder (new LayerVersionPermission$Builder) id config))


(defn build-layer-version-props-builder
  "The build-layer-version-props-builder function updates a LayerVersionProps$Builder instance using the provided configuration.
  The function takes the LayerVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `compatibleArchitectures` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-architectures` |
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-name` |
| `license` | java.lang.String | [[cdk.support/lookup-entry]] | `:license` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^LayerVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :compatible-architectures)]
    (. builder compatibleArchitectures data))
  (when-let [data (lookup-entry config id :compatible-runtimes)]
    (. builder compatibleRuntimes data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :layer-version-name)]
    (. builder layerVersionName data))
  (when-let [data (lookup-entry config id :license)]
    (. builder license data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn layer-version-props-builder
  "Creates a  `LayerVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-layer-version-props-builder (new LayerVersionProps$Builder) id config))


(defn build-log-retention-retry-options-builder
  "The build-log-retention-retry-options-builder function updates a LogRetentionRetryOptions$Builder instance using the provided configuration.
  The function takes the LogRetentionRetryOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:base` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
"
  [^LogRetentionRetryOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :base)]
    (. builder base data))
  (when-let [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (.build builder))


(defn log-retention-retry-options-builder
  "Creates a  `LogRetentionRetryOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-log-retention-retry-options-builder (new LogRetentionRetryOptions$Builder) id config))


(defn build-params-and-secrets-options-builder
  "The build-params-and-secrets-options-builder function updates a ParamsAndSecretsOptions$Builder instance using the provided configuration.
  The function takes the ParamsAndSecretsOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-enabled` |
| `cacheSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cache-size` |
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `logLevel` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel | [[cdk.api.services.lambda/params-and-secrets-log-level]] | `:log-level` |
| `maxConnections` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections` |
| `parameterStoreTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:parameter-store-timeout` |
| `parameterStoreTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:parameter-store-ttl` |
| `secretsManagerTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:secrets-manager-timeout` |
| `secretsManagerTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:secrets-manager-ttl` |
"
  [^ParamsAndSecretsOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-enabled)]
    (. builder cacheEnabled data))
  (when-let [data (lookup-entry config id :cache-size)]
    (. builder cacheSize data))
  (when-let [data (lookup-entry config id :http-port)]
    (. builder httpPort data))
  (when-let [data (params-and-secrets-log-level config id :log-level)]
    (. builder logLevel data))
  (when-let [data (lookup-entry config id :max-connections)]
    (. builder maxConnections data))
  (when-let [data (lookup-entry config id :parameter-store-timeout)]
    (. builder parameterStoreTimeout data))
  (when-let [data (lookup-entry config id :parameter-store-ttl)]
    (. builder parameterStoreTtl data))
  (when-let [data (lookup-entry config id :secrets-manager-timeout)]
    (. builder secretsManagerTimeout data))
  (when-let [data (lookup-entry config id :secrets-manager-ttl)]
    (. builder secretsManagerTtl data))
  (.build builder))


(defn params-and-secrets-options-builder
  "Creates a  `ParamsAndSecretsOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-params-and-secrets-options-builder (new ParamsAndSecretsOptions$Builder) id config))


(defn build-permission-builder
  "The build-permission-builder function updates a Permission$Builder instance using the provided configuration.
  The function takes the Permission$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `eventSourceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-token` |
| `functionUrlAuthType` | software.amazon.awscdk.services.lambda.FunctionUrlAuthType | [[cdk.api.services.lambda/function-url-auth-type]] | `:function-url-auth-type` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
| `principal` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:principal` |
| `scope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:scope` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^Permission$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :event-source-token)]
    (. builder eventSourceToken data))
  (when-let [data (function-url-auth-type config id :function-url-auth-type)]
    (. builder functionUrlAuthType data))
  (when-let [data (lookup-entry config id :organization-id)]
    (. builder organizationId data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :source-account)]
    (. builder sourceAccount data))
  (when-let [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (.build builder))


(defn permission-builder
  "Creates a  `Permission$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-permission-builder (new Permission$Builder) id config))


(defn build-resource-bind-options-builder
  "The build-resource-bind-options-builder function updates a ResourceBindOptions$Builder instance using the provided configuration.
  The function takes the ResourceBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceProperty` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-property` |
"
  [^ResourceBindOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-property)]
    (. builder resourceProperty data))
  (.build builder))


(defn resource-bind-options-builder
  "Creates a  `ResourceBindOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-resource-bind-options-builder (new ResourceBindOptions$Builder) id config))


(defn build-runtime-builder
  "The build-runtime-builder function updates a Runtime$Builder instance using the provided configuration.
  The function takes the Runtime$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundlingDockerImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundling-docker-image` |
| `isVariable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-variable` |
| `supportsCodeGuruProfiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-code-guru-profiling` |
| `supportsInlineCode` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-inline-code` |
| `supportsSnapStart` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-snap-start` |
"
  [^Runtime$Builder builder id config]
  (when-let [data (lookup-entry config id :bundling-docker-image)]
    (. builder bundlingDockerImage data))
  (when-let [data (lookup-entry config id :is-variable)]
    (. builder isVariable data))
  (when-let [data (lookup-entry config id :supports-code-guru-profiling)]
    (. builder supportsCodeGuruProfiling data))
  (when-let [data (lookup-entry config id :supports-inline-code)]
    (. builder supportsInlineCode data))
  (when-let [data (lookup-entry config id :supports-snap-start)]
    (. builder supportsSnapStart data))
  (.build builder))


(defn runtime-builder
  "Creates a  `Runtime$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| runtime-name | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |


__Create Form:__ ____[java.lang.String software.amazon.awscdk.services.lambda.RuntimeFamily]___
| Argument | DataType | Description |
|---|---|---|
| runtime-name | java.lang.String |  |
| runtime-family | software.amazon.awscdk.services.lambda.RuntimeFamily |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  ([^String runtime-name id config]
   (build-runtime-builder (Runtime$Builder/create runtime-name) id config))
  ([^String runtime-name ^RuntimeFamily runtime-family id config]
   (build-runtime-builder (Runtime$Builder/create runtime-name runtime-family) id config)))


(defn build-singleton-function-builder
  "The build-singleton-function-builder function updates a SingletonFunction$Builder instance using the provided configuration.
  The function takes the SingletonFunction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `lambdaPurpose` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-purpose` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | software.amazon.awscdk.services.lambda.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `uuid` | java.lang.String | [[cdk.support/lookup-entry]] | `:uuid` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SingletonFunction$Builder builder id config]
  (when-let [data (lookup-entry config id :adot-instrumentation)]
    (. builder adotInstrumentation data))
  (when-let [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-let [data (lookup-entry config id :allow-public-subnet)]
    (. builder allowPublicSubnet data))
  (when-let [data (lookup-entry config id :application-log-level)]
    (. builder applicationLogLevel data))
  (when-let [data (application-log-level config id :application-log-level-v2)]
    (. builder applicationLogLevelV2 data))
  (when-let [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :code-signing-config)]
    (. builder codeSigningConfig data))
  (when-let [data (lookup-entry config id :current-version-options)]
    (. builder currentVersionOptions data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
    (. builder deadLetterQueueEnabled data))
  (when-let [data (lookup-entry config id :dead-letter-topic)]
    (. builder deadLetterTopic data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filesystem)]
    (. builder filesystem data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :initial-policy)]
    (. builder initialPolicy data))
  (when-let [data (lookup-entry config id :insights-version)]
    (. builder insightsVersion data))
  (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
    (. builder ipv6AllowedForDualStack data))
  (when-let [data (lookup-entry config id :lambda-purpose)]
    (. builder lambdaPurpose data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-let [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-let [data (logging-format config id :logging-format)]
    (. builder loggingFormat data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :params-and-secrets)]
    (. builder paramsAndSecrets data))
  (when-let [data (lookup-entry config id :profiling)]
    (. builder profiling data))
  (when-let [data (lookup-entry config id :profiling-group)]
    (. builder profilingGroup data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :runtime-management-mode)]
    (. builder runtimeManagementMode data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :system-log-level)]
    (. builder systemLogLevel data))
  (when-let [data (system-log-level config id :system-log-level-v2)]
    (. builder systemLogLevelV2 data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (tracing config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :uuid)]
    (. builder uuid data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn singleton-function-builder
  "Creates a  `SingletonFunction$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-singleton-function-builder (SingletonFunction$Builder/create scope (name id)) id config))


(defn build-singleton-function-props-builder
  "The build-singleton-function-props-builder function updates a SingletonFunctionProps$Builder instance using the provided configuration.
  The function takes the SingletonFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `lambdaPurpose` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-purpose` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | software.amazon.awscdk.services.lambda.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `uuid` | java.lang.String | [[cdk.support/lookup-entry]] | `:uuid` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SingletonFunctionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :adot-instrumentation)]
    (. builder adotInstrumentation data))
  (when-let [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-let [data (lookup-entry config id :allow-public-subnet)]
    (. builder allowPublicSubnet data))
  (when-let [data (lookup-entry config id :application-log-level)]
    (. builder applicationLogLevel data))
  (when-let [data (application-log-level config id :application-log-level-v2)]
    (. builder applicationLogLevelV2 data))
  (when-let [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :code-signing-config)]
    (. builder codeSigningConfig data))
  (when-let [data (lookup-entry config id :current-version-options)]
    (. builder currentVersionOptions data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
    (. builder deadLetterQueueEnabled data))
  (when-let [data (lookup-entry config id :dead-letter-topic)]
    (. builder deadLetterTopic data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filesystem)]
    (. builder filesystem data))
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :initial-policy)]
    (. builder initialPolicy data))
  (when-let [data (lookup-entry config id :insights-version)]
    (. builder insightsVersion data))
  (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
    (. builder ipv6AllowedForDualStack data))
  (when-let [data (lookup-entry config id :lambda-purpose)]
    (. builder lambdaPurpose data))
  (when-let [data (lookup-entry config id :layers)]
    (. builder layers data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-let [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-let [data (logging-format config id :logging-format)]
    (. builder loggingFormat data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :params-and-secrets)]
    (. builder paramsAndSecrets data))
  (when-let [data (lookup-entry config id :profiling)]
    (. builder profiling data))
  (when-let [data (lookup-entry config id :profiling-group)]
    (. builder profilingGroup data))
  (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
    (. builder reservedConcurrentExecutions data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :runtime-management-mode)]
    (. builder runtimeManagementMode data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :snap-start)]
    (. builder snapStart data))
  (when-let [data (lookup-entry config id :system-log-level)]
    (. builder systemLogLevel data))
  (when-let [data (system-log-level config id :system-log-level-v2)]
    (. builder systemLogLevelV2 data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (tracing config id :tracing)]
    (. builder tracing data))
  (when-let [data (lookup-entry config id :uuid)]
    (. builder uuid data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn singleton-function-props-builder
  "Creates a  `SingletonFunctionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-singleton-function-props-builder (new SingletonFunctionProps$Builder) id config))


(defn build-source-access-configuration-builder
  "The build-source-access-configuration-builder function updates a SourceAccessConfiguration$Builder instance using the provided configuration.
  The function takes the SourceAccessConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | software.amazon.awscdk.services.lambda.SourceAccessConfigurationType | [[cdk.support/lookup-entry]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^SourceAccessConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn source-access-configuration-builder
  "Creates a  `SourceAccessConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-source-access-configuration-builder (new SourceAccessConfiguration$Builder) id config))


(defn build-utilization-scaling-options-builder
  "The build-utilization-scaling-options-builder function updates a UtilizationScalingOptions$Builder instance using the provided configuration.
  The function takes the UtilizationScalingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `utilizationTarget` | java.lang.Number | [[cdk.support/lookup-entry]] | `:utilization-target` |
"
  [^UtilizationScalingOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :disable-scale-in)]
    (. builder disableScaleIn data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :scale-in-cooldown)]
    (. builder scaleInCooldown data))
  (when-let [data (lookup-entry config id :scale-out-cooldown)]
    (. builder scaleOutCooldown data))
  (when-let [data (lookup-entry config id :utilization-target)]
    (. builder utilizationTarget data))
  (.build builder))


(defn utilization-scaling-options-builder
  "Creates a  `UtilizationScalingOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-utilization-scaling-options-builder (new UtilizationScalingOptions$Builder) id config))


(defn build-version-attributes-builder
  "The build-version-attributes-builder function updates a VersionAttributes$Builder instance using the provided configuration.
  The function takes the VersionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^VersionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn version-attributes-builder
  "Creates a  `VersionAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-version-attributes-builder (new VersionAttributes$Builder) id config))


(defn build-version-builder
  "The build-version-builder function updates a Version$Builder instance using the provided configuration.
  The function takes the Version$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-sha256` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^Version$Builder builder id config]
  (when-let [data (lookup-entry config id :code-sha256)]
    (. builder codeSha256 data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn version-builder
  "Creates a  `Version$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-version-builder (Version$Builder/create scope (name id)) id config))


(defn build-version-options-builder
  "The build-version-options-builder function updates a VersionOptions$Builder instance using the provided configuration.
  The function takes the VersionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-sha256` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^VersionOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :code-sha256)]
    (. builder codeSha256 data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn version-options-builder
  "Creates a  `VersionOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-version-options-builder (new VersionOptions$Builder) id config))


(defn build-version-props-builder
  "The build-version-props-builder function updates a VersionProps$Builder instance using the provided configuration.
  The function takes the VersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-sha256` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^VersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :code-sha256)]
    (. builder codeSha256 data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :on-success)]
    (. builder onSuccess data))
  (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
    (. builder provisionedConcurrentExecutions data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn version-props-builder
  "Creates a  `VersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-version-props-builder (new VersionProps$Builder) id config))


(defn build-version-weight-builder
  "The build-version-weight-builder function updates a VersionWeight$Builder instance using the provided configuration.
  The function takes the VersionWeight$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:version` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^VersionWeight$Builder builder id config]
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn version-weight-builder
  "Creates a  `VersionWeight$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-version-weight-builder (new VersionWeight$Builder) id config))