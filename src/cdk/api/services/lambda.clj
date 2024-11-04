(ns cdk.api.services.lambda
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.api :refer [asset-hash-type
                             ignore-mode
                             removal-policy
                             symlink-follow-mode]])
  (:import [software.amazon.awscdk.services.lambda AdotInstrumentationConfig$Builder
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





(defn adot-instrumentation-config-builder
  "The adot-instrumentation-config-builder function buildes out new instances of 
AdotInstrumentationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `execWrapper` | software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper | [[cdk.api.services.lambda/adot-lambda-exec-wrapper]] | `:exec-wrapper` |
| `layerVersion` | software.amazon.awscdk.services.lambda.AdotLayerVersion | [[cdk.support/lookup-entry]] | `:layer-version` |"
  [stack id config]
  (let [builder (AdotInstrumentationConfig$Builder.)]
    (when-let [data (adot-lambda-exec-wrapper config id :exec-wrapper)]
      (. builder execWrapper data))
    (when-let [data (lookup-entry config id :layer-version)]
      (. builder layerVersion data))
    (.build builder)))


(defn alias-attributes-builder
  "The alias-attributes-builder function buildes out new instances of 
AliasAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `aliasVersion` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:alias-version` |"
  [stack id config]
  (let [builder (AliasAttributes$Builder.)]
    (when-let [data (lookup-entry config id :alias-name)]
      (. builder aliasName data))
    (when-let [data (lookup-entry config id :alias-version)]
      (. builder aliasVersion data))
    (.build builder)))


(defn alias-builder
  "The alias-builder function buildes out new instances of 
Alias$Builder using the provided configuration.  Each field is set as follows:

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
| `version` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (Alias$Builder/create stack id)]
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
    (.build builder)))


(defn alias-options-builder
  "The alias-options-builder function buildes out new instances of 
AliasOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-versions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (AliasOptions$Builder.)]
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
    (.build builder)))


(defn alias-props-builder
  "The alias-props-builder function buildes out new instances of 
AliasProps$Builder using the provided configuration.  Each field is set as follows:

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
| `version` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (AliasProps$Builder.)]
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
    (.build builder)))


(defn asset-code-builder
  "The asset-code-builder function buildes out new instances of 
AssetCode$Builder using the provided configuration.  Each field is set as follows:

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
  (let [builder (AssetCode$Builder/create ^java.lang.String path)]
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


(defn asset-image-code-builder
  "The asset-image-code-builder function buildes out new instances of 
AssetImageCode$Builder using the provided configuration.  Each field is set as follows:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config ^java.lang.String directory]
  (let [builder (AssetImageCode$Builder/create ^java.lang.String directory)]
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
    (.build builder)))


(defn asset-image-code-props-builder
  "The asset-image-code-props-builder function buildes out new instances of 
AssetImageCodeProps$Builder using the provided configuration.  Each field is set as follows:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (AssetImageCodeProps$Builder.)]
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
    (.build builder)))


(defn auto-scaling-options-builder
  "The auto-scaling-options-builder function buildes out new instances of 
AutoScalingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |"
  [stack id config]
  (let [builder (AutoScalingOptions$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (.build builder)))


(defn cfn-alias-alias-routing-configuration-property-builder
  "The cfn-alias-alias-routing-configuration-property-builder function buildes out new instances of 
CfnAlias$AliasRoutingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalVersionWeights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-version-weights` |"
  [stack id config]
  (let [builder (CfnAlias$AliasRoutingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-version-weights)]
      (. builder additionalVersionWeights data))
    (.build builder)))


(defn cfn-alias-builder
  "The cfn-alias-builder function buildes out new instances of 
CfnAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `routingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-config` |"
  [stack id config]
  (let [builder (CfnAlias$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-alias-props-builder
  "The cfn-alias-props-builder function buildes out new instances of 
CfnAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `routingConfig` | software.amazon.awscdk.services.lambda.CfnAlias$AliasRoutingConfigurationProperty | [[cdk.support/lookup-entry]] | `:routing-config` |"
  [stack id config]
  (let [builder (CfnAliasProps$Builder.)]
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
    (.build builder)))


(defn cfn-alias-provisioned-concurrency-configuration-property-builder
  "The cfn-alias-provisioned-concurrency-configuration-property-builder function buildes out new instances of 
CfnAlias$ProvisionedConcurrencyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |"
  [stack id config]
  (let [builder (CfnAlias$ProvisionedConcurrencyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
      (. builder provisionedConcurrentExecutions data))
    (.build builder)))


(defn cfn-alias-version-weight-property-builder
  "The cfn-alias-version-weight-property-builder function buildes out new instances of 
CfnAlias$VersionWeightProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-version` |
| `functionWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:function-weight` |"
  [stack id config]
  (let [builder (CfnAlias$VersionWeightProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-version)]
      (. builder functionVersion data))
    (when-let [data (lookup-entry config id :function-weight)]
      (. builder functionWeight data))
    (.build builder)))


(defn cfn-code-signing-config-allowed-publishers-property-builder
  "The cfn-code-signing-config-allowed-publishers-property-builder function buildes out new instances of 
CfnCodeSigningConfig$AllowedPublishersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingProfileVersionArns` | java.util.List | [[cdk.support/lookup-entry]] | `:signing-profile-version-arns` |"
  [stack id config]
  (let [builder (CfnCodeSigningConfig$AllowedPublishersProperty$Builder.)]
    (when-let [data (lookup-entry config id :signing-profile-version-arns)]
      (. builder signingProfileVersionArns data))
    (.build builder)))


(defn cfn-code-signing-config-builder
  "The cfn-code-signing-config-builder function buildes out new instances of 
CfnCodeSigningConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPublishers` | software.amazon.awscdk.services.lambda.CfnCodeSigningConfig$AllowedPublishersProperty | [[cdk.support/lookup-entry]] | `:allowed-publishers` |
| `codeSigningPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-signing-policies` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnCodeSigningConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-publishers)]
      (. builder allowedPublishers data))
    (when-let [data (lookup-entry config id :code-signing-policies)]
      (. builder codeSigningPolicies data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-code-signing-config-code-signing-policies-property-builder
  "The cfn-code-signing-config-code-signing-policies-property-builder function buildes out new instances of 
CfnCodeSigningConfig$CodeSigningPoliciesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `untrustedArtifactOnDeployment` | java.lang.String | [[cdk.support/lookup-entry]] | `:untrusted-artifact-on-deployment` |"
  [stack id config]
  (let [builder (CfnCodeSigningConfig$CodeSigningPoliciesProperty$Builder.)]
    (when-let [data (lookup-entry config id :untrusted-artifact-on-deployment)]
      (. builder untrustedArtifactOnDeployment data))
    (.build builder)))


(defn cfn-code-signing-config-props-builder
  "The cfn-code-signing-config-props-builder function buildes out new instances of 
CfnCodeSigningConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPublishers` | software.amazon.awscdk.services.lambda.CfnCodeSigningConfig$AllowedPublishersProperty | [[cdk.support/lookup-entry]] | `:allowed-publishers` |
| `codeSigningPolicies` | software.amazon.awscdk.services.lambda.CfnCodeSigningConfig$CodeSigningPoliciesProperty | [[cdk.support/lookup-entry]] | `:code-signing-policies` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnCodeSigningConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-publishers)]
      (. builder allowedPublishers data))
    (when-let [data (lookup-entry config id :code-signing-policies)]
      (. builder codeSigningPolicies data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-event-invoke-config-builder
  "The cfn-event-invoke-config-builder function buildes out new instances of 
CfnEventInvokeConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfig` | software.amazon.awscdk.services.lambda.CfnEventInvokeConfig$DestinationConfigProperty | [[cdk.support/lookup-entry]] | `:destination-config` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |"
  [stack id config]
  (let [builder (CfnEventInvokeConfig$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-event-invoke-config-destination-config-property-builder
  "The cfn-event-invoke-config-destination-config-property-builder function buildes out new instances of 
CfnEventInvokeConfig$DestinationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-success` |"
  [stack id config]
  (let [builder (CfnEventInvokeConfig$DestinationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (when-let [data (lookup-entry config id :on-success)]
      (. builder onSuccess data))
    (.build builder)))


(defn cfn-event-invoke-config-on-failure-property-builder
  "The cfn-event-invoke-config-on-failure-property-builder function buildes out new instances of 
CfnEventInvokeConfig$OnFailureProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |"
  [stack id config]
  (let [builder (CfnEventInvokeConfig$OnFailureProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (.build builder)))


(defn cfn-event-invoke-config-on-success-property-builder
  "The cfn-event-invoke-config-on-success-property-builder function buildes out new instances of 
CfnEventInvokeConfig$OnSuccessProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |"
  [stack id config]
  (let [builder (CfnEventInvokeConfig$OnSuccessProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (.build builder)))


(defn cfn-event-invoke-config-props-builder
  "The cfn-event-invoke-config-props-builder function buildes out new instances of 
CfnEventInvokeConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-config` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |"
  [stack id config]
  (let [builder (CfnEventInvokeConfigProps$Builder.)]
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
    (.build builder)))


(defn cfn-event-source-mapping-amazon-managed-kafka-event-source-config-property-builder
  "The cfn-event-source-mapping-amazon-managed-kafka-event-source-config-property-builder function buildes out new instances of 
CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$AmazonManagedKafkaEventSourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :consumer-group-id)]
      (. builder consumerGroupId data))
    (.build builder)))


(defn cfn-event-source-mapping-builder
  "The cfn-event-source-mapping-builder function buildes out new instances of 
CfnEventSourceMapping$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tumbling-window-in-seconds` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-event-source-mapping-destination-config-property-builder
  "The cfn-event-source-mapping-destination-config-property-builder function buildes out new instances of 
CfnEventSourceMapping$DestinationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-failure` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$DestinationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (.build builder)))


(defn cfn-event-source-mapping-document-db-event-source-config-property-builder
  "The cfn-event-source-mapping-document-db-event-source-config-property-builder function buildes out new instances of 
CfnEventSourceMapping$DocumentDBEventSourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-name` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `fullDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:full-document` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$DocumentDBEventSourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :collection-name)]
      (. builder collectionName data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :full-document)]
      (. builder fullDocument data))
    (.build builder)))


(defn cfn-event-source-mapping-endpoints-property-builder
  "The cfn-event-source-mapping-endpoints-property-builder function buildes out new instances of 
CfnEventSourceMapping$EndpointsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kafkaBootstrapServers` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-bootstrap-servers` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$EndpointsProperty$Builder.)]
    (when-let [data (lookup-entry config id :kafka-bootstrap-servers)]
      (. builder kafkaBootstrapServers data))
    (.build builder)))


(defn cfn-event-source-mapping-filter-criteria-property-builder
  "The cfn-event-source-mapping-filter-criteria-property-builder function buildes out new instances of 
CfnEventSourceMapping$FilterCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$FilterCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (.build builder)))


(defn cfn-event-source-mapping-filter-property-builder
  "The cfn-event-source-mapping-filter-property-builder function buildes out new instances of 
CfnEventSourceMapping$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (.build builder)))


(defn cfn-event-source-mapping-on-failure-property-builder
  "The cfn-event-source-mapping-on-failure-property-builder function buildes out new instances of 
CfnEventSourceMapping$OnFailureProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$OnFailureProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (.build builder)))


(defn cfn-event-source-mapping-props-builder
  "The cfn-event-source-mapping-props-builder function buildes out new instances of 
CfnEventSourceMappingProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tumbling-window-in-seconds` |"
  [stack id config]
  (let [builder (CfnEventSourceMappingProps$Builder.)]
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
    (.build builder)))


(defn cfn-event-source-mapping-scaling-config-property-builder
  "The cfn-event-source-mapping-scaling-config-property-builder function buildes out new instances of 
CfnEventSourceMapping$ScalingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-concurrency` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$ScalingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-concurrency)]
      (. builder maximumConcurrency data))
    (.build builder)))


(defn cfn-event-source-mapping-self-managed-event-source-property-builder
  "The cfn-event-source-mapping-self-managed-event-source-property-builder function buildes out new instances of 
CfnEventSourceMapping$SelfManagedEventSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoints` | software.amazon.awscdk.services.lambda.CfnEventSourceMapping$EndpointsProperty | [[cdk.support/lookup-entry]] | `:endpoints` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$SelfManagedEventSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoints)]
      (. builder endpoints data))
    (.build builder)))


(defn cfn-event-source-mapping-self-managed-kafka-event-source-config-property-builder
  "The cfn-event-source-mapping-self-managed-kafka-event-source-config-property-builder function buildes out new instances of 
CfnEventSourceMapping$SelfManagedKafkaEventSourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$SelfManagedKafkaEventSourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :consumer-group-id)]
      (. builder consumerGroupId data))
    (.build builder)))


(defn cfn-event-source-mapping-source-access-configuration-property-builder
  "The cfn-event-source-mapping-source-access-configuration-property-builder function buildes out new instances of 
CfnEventSourceMapping$SourceAccessConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnEventSourceMapping$SourceAccessConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-function-builder
  "The cfn-function-builder function buildes out new instances of 
CfnFunction$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.lambda.CfnFunction$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnFunction$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-function-code-property-builder
  "The cfn-function-code-property-builder function buildes out new instances of 
CfnFunction$CodeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |
| `zipFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:zip-file` |"
  [stack id config]
  (let [builder (CfnFunction$CodeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-function-dead-letter-config-property-builder
  "The cfn-function-dead-letter-config-property-builder function buildes out new instances of 
CfnFunction$DeadLetterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnFunction$DeadLetterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-function-environment-property-builder
  "The cfn-function-environment-property-builder function buildes out new instances of 
CfnFunction$EnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnFunction$EnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
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


(defn cfn-function-logging-config-property-builder
  "The cfn-function-logging-config-property-builder function buildes out new instances of 
CfnFunction$LoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |"
  [stack id config]
  (let [builder (CfnFunction$LoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-log-level)]
      (. builder applicationLogLevel data))
    (when-let [data (lookup-entry config id :log-format)]
      (. builder logFormat data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :system-log-level)]
      (. builder systemLogLevel data))
    (.build builder)))


(defn cfn-function-props-builder
  "The cfn-function-props-builder function buildes out new instances of 
CfnFunctionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.lambda.CfnFunction$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnFunctionProps$Builder.)]
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
    (.build builder)))


(defn cfn-function-runtime-management-config-property-builder
  "The cfn-function-runtime-management-config-property-builder function buildes out new instances of 
CfnFunction$RuntimeManagementConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `runtimeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version-arn` |
| `updateRuntimeOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-runtime-on` |"
  [stack id config]
  (let [builder (CfnFunction$RuntimeManagementConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :runtime-version-arn)]
      (. builder runtimeVersionArn data))
    (when-let [data (lookup-entry config id :update-runtime-on)]
      (. builder updateRuntimeOn data))
    (.build builder)))


(defn cfn-function-snap-start-property-builder
  "The cfn-function-snap-start-property-builder function buildes out new instances of 
CfnFunction$SnapStartProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-on` |"
  [stack id config]
  (let [builder (CfnFunction$SnapStartProperty$Builder.)]
    (when-let [data (lookup-entry config id :apply-on)]
      (. builder applyOn data))
    (.build builder)))


(defn cfn-function-snap-start-response-property-builder
  "The cfn-function-snap-start-response-property-builder function buildes out new instances of 
CfnFunction$SnapStartResponseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-on` |
| `optimizationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:optimization-status` |"
  [stack id config]
  (let [builder (CfnFunction$SnapStartResponseProperty$Builder.)]
    (when-let [data (lookup-entry config id :apply-on)]
      (. builder applyOn data))
    (when-let [data (lookup-entry config id :optimization-status)]
      (. builder optimizationStatus data))
    (.build builder)))


(defn cfn-function-tracing-config-property-builder
  "The cfn-function-tracing-config-property-builder function buildes out new instances of 
CfnFunction$TracingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnFunction$TracingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-function-vpc-config-property-builder
  "The cfn-function-vpc-config-property-builder function buildes out new instances of 
CfnFunction$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6AllowedForDualStack` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnFunction$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
      (. builder ipv6AllowedForDualStack data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-layer-version-builder
  "The cfn-layer-version-builder function buildes out new instances of 
CfnLayerVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleArchitectures` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-architectures` |
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `content` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-name` |
| `licenseInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-info` |"
  [stack id config]
  (let [builder (CfnLayerVersion$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-layer-version-content-property-builder
  "The cfn-layer-version-content-property-builder function buildes out new instances of 
CfnLayerVersion$ContentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |"
  [stack id config]
  (let [builder (CfnLayerVersion$ContentProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (when-let [data (lookup-entry config id :s3-object-version)]
      (. builder s3ObjectVersion data))
    (.build builder)))


(defn cfn-layer-version-permission-builder
  "The cfn-layer-version-permission-builder function buildes out new instances of 
CfnLayerVersionPermission$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `layerVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-arn` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |"
  [stack id config]
  (let [builder (CfnLayerVersionPermission$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :layer-version-arn)]
      (. builder layerVersionArn data))
    (when-let [data (lookup-entry config id :organization-id)]
      (. builder organizationId data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (.build builder)))


(defn cfn-layer-version-permission-props-builder
  "The cfn-layer-version-permission-props-builder function buildes out new instances of 
CfnLayerVersionPermissionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `layerVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-arn` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |"
  [stack id config]
  (let [builder (CfnLayerVersionPermissionProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :layer-version-arn)]
      (. builder layerVersionArn data))
    (when-let [data (lookup-entry config id :organization-id)]
      (. builder organizationId data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (.build builder)))


(defn cfn-layer-version-props-builder
  "The cfn-layer-version-props-builder function buildes out new instances of 
CfnLayerVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleArchitectures` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-architectures` |
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `content` | software.amazon.awscdk.services.lambda.CfnLayerVersion$ContentProperty | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-name` |
| `licenseInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-info` |"
  [stack id config]
  (let [builder (CfnLayerVersionProps$Builder.)]
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
    (.build builder)))


(defn cfn-parameters-code-builder
  "The cfn-parameters-code-builder function buildes out new instances of 
CfnParametersCode$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketNameParam` | software.amazon.awscdk.CfnParameter | [[cdk.support/lookup-entry]] | `:bucket-name-param` |
| `objectKeyParam` | software.amazon.awscdk.CfnParameter | [[cdk.support/lookup-entry]] | `:object-key-param` |"
  [stack id config]
  (let [builder (CfnParametersCode$Builder/create)]
    (when-let [data (lookup-entry config id :bucket-name-param)]
      (. builder bucketNameParam data))
    (when-let [data (lookup-entry config id :object-key-param)]
      (. builder objectKeyParam data))
    (.build builder)))


(defn cfn-parameters-code-props-builder
  "The cfn-parameters-code-props-builder function buildes out new instances of 
CfnParametersCodeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketNameParam` | software.amazon.awscdk.CfnParameter | [[cdk.support/lookup-entry]] | `:bucket-name-param` |
| `objectKeyParam` | software.amazon.awscdk.CfnParameter | [[cdk.support/lookup-entry]] | `:object-key-param` |"
  [stack id config]
  (let [builder (CfnParametersCodeProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name-param)]
      (. builder bucketNameParam data))
    (when-let [data (lookup-entry config id :object-key-param)]
      (. builder objectKeyParam data))
    (.build builder)))


(defn cfn-permission-builder
  "The cfn-permission-builder function buildes out new instances of 
CfnPermission$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `eventSourceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-token` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionUrlAuthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-url-auth-type` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `principalOrgId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-org-id` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |"
  [stack id config]
  (let [builder (CfnPermission$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-permission-props-builder
  "The cfn-permission-props-builder function buildes out new instances of 
CfnPermissionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `eventSourceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-token` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionUrlAuthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-url-auth-type` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `principalOrgId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-org-id` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |"
  [stack id config]
  (let [builder (CfnPermissionProps$Builder.)]
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
    (.build builder)))


(defn cfn-url-builder
  "The cfn-url-builder function buildes out new instances of 
CfnUrl$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `cors` | software.amazon.awscdk.services.lambda.CfnUrl$CorsProperty | [[cdk.support/lookup-entry]] | `:cors` |
| `invokeMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:invoke-mode` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `targetFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-function-arn` |"
  [stack id config]
  (let [builder (CfnUrl$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-url-cors-property-builder
  "The cfn-url-cors-property-builder function buildes out new instances of 
CfnUrl$CorsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-headers` |
| `allowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-methods` |
| `allowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-origins` |
| `exposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:expose-headers` |
| `maxAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age` |"
  [stack id config]
  (let [builder (CfnUrl$CorsProperty$Builder.)]
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


(defn cfn-url-props-builder
  "The cfn-url-props-builder function buildes out new instances of 
CfnUrlProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `cors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors` |
| `invokeMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:invoke-mode` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `targetFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-function-arn` |"
  [stack id config]
  (let [builder (CfnUrlProps$Builder.)]
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
    (.build builder)))


(defn cfn-version-builder
  "The cfn-version-builder function buildes out new instances of 
CfnVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-sha256` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.services.lambda.CfnVersion$ProvisionedConcurrencyConfigurationProperty | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `runtimePolicy` | software.amazon.awscdk.services.lambda.CfnVersion$RuntimePolicyProperty | [[cdk.support/lookup-entry]] | `:runtime-policy` |"
  [stack id config]
  (let [builder (CfnVersion$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-version-props-builder
  "The cfn-version-props-builder function buildes out new instances of 
CfnVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-sha256` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `provisionedConcurrencyConfig` | software.amazon.awscdk.services.lambda.CfnVersion$ProvisionedConcurrencyConfigurationProperty | [[cdk.support/lookup-entry]] | `:provisioned-concurrency-config` |
| `runtimePolicy` | software.amazon.awscdk.services.lambda.CfnVersion$RuntimePolicyProperty | [[cdk.support/lookup-entry]] | `:runtime-policy` |"
  [stack id config]
  (let [builder (CfnVersionProps$Builder.)]
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
    (.build builder)))


(defn cfn-version-provisioned-concurrency-configuration-property-builder
  "The cfn-version-provisioned-concurrency-configuration-property-builder function buildes out new instances of 
CfnVersion$ProvisionedConcurrencyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |"
  [stack id config]
  (let [builder (CfnVersion$ProvisionedConcurrencyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :provisioned-concurrent-executions)]
      (. builder provisionedConcurrentExecutions data))
    (.build builder)))


(defn cfn-version-runtime-policy-property-builder
  "The cfn-version-runtime-policy-property-builder function buildes out new instances of 
CfnVersion$RuntimePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `runtimeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version-arn` |
| `updateRuntimeOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-runtime-on` |"
  [stack id config]
  (let [builder (CfnVersion$RuntimePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :runtime-version-arn)]
      (. builder runtimeVersionArn data))
    (when-let [data (lookup-entry config id :update-runtime-on)]
      (. builder updateRuntimeOn data))
    (.build builder)))


(defn code-config-builder
  "The code-config-builder function buildes out new instances of 
CodeConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `image` | software.amazon.awscdk.services.lambda.CodeImageConfig | [[cdk.support/lookup-entry]] | `:image` |
| `inlineCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-code` |
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (CodeConfig$Builder.)]
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :inline-code)]
      (. builder inlineCode data))
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn code-image-config-builder
  "The code-image-config-builder function buildes out new instances of 
CodeImageConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmd` | java.util.List | [[cdk.support/lookup-entry]] | `:cmd` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CodeImageConfig$Builder.)]
    (when-let [data (lookup-entry config id :cmd)]
      (. builder cmd data))
    (when-let [data (lookup-entry config id :entrypoint)]
      (. builder entrypoint data))
    (when-let [data (lookup-entry config id :image-uri)]
      (. builder imageUri data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn code-signing-config-builder
  "The code-signing-config-builder function buildes out new instances of 
CodeSigningConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `signingProfiles` | java.util.List | [[cdk.support/lookup-entry]] | `:signing-profiles` |
| `untrustedArtifactOnDeployment` | software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment | [[cdk.api.services.lambda/untrusted-artifact-on-deployment]] | `:untrusted-artifact-on-deployment` |"
  [stack id config]
  (let [builder (CodeSigningConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :signing-profiles)]
      (. builder signingProfiles data))
    (when-let [data (untrusted-artifact-on-deployment config id :untrusted-artifact-on-deployment)]
      (. builder untrustedArtifactOnDeployment data))
    (.build builder)))


(defn code-signing-config-props-builder
  "The code-signing-config-props-builder function buildes out new instances of 
CodeSigningConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `signingProfiles` | java.util.List | [[cdk.support/lookup-entry]] | `:signing-profiles` |
| `untrustedArtifactOnDeployment` | software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment | [[cdk.api.services.lambda/untrusted-artifact-on-deployment]] | `:untrusted-artifact-on-deployment` |"
  [stack id config]
  (let [builder (CodeSigningConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :signing-profiles)]
      (. builder signingProfiles data))
    (when-let [data (untrusted-artifact-on-deployment config id :untrusted-artifact-on-deployment)]
      (. builder untrustedArtifactOnDeployment data))
    (.build builder)))


(defn custom-command-options-builder
  "The custom-command-options-builder function buildes out new instances of 
CustomCommandOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |"
  [stack id config]
  (let [builder (CustomCommandOptions$Builder.)]
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
    (.build builder)))


(defn destination-config-builder
  "The destination-config-builder function buildes out new instances of 
DestinationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |"
  [stack id config]
  (let [builder (DestinationConfig$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (.build builder)))


(defn destination-options-builder
  "The destination-options-builder function buildes out new instances of 
DestinationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | software.amazon.awscdk.services.lambda.DestinationType | [[cdk.api.services.lambda/destination-type]] | `:type` |"
  [stack id config]
  (let [builder (DestinationOptions$Builder.)]
    (when-let [data (destination-type config id :type)]
      (. builder type data))
    (.build builder)))


(defn dlq-destination-config-builder
  "The dlq-destination-config-builder function buildes out new instances of 
DlqDestinationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |"
  [stack id config]
  (let [builder (DlqDestinationConfig$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (.build builder)))


(defn docker-build-asset-options-builder
  "The docker-build-asset-options-builder function buildes out new instances of 
DockerBuildAssetOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `targetStage` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-stage` |"
  [stack id config]
  (let [builder (DockerBuildAssetOptions$Builder.)]
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
    (.build builder)))


(defn docker-image-function-builder
  "The docker-image-function-builder function buildes out new instances of 
DockerImageFunction$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DockerImageFunction$Builder/create stack id)]
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
    (.build builder)))


(defn docker-image-function-props-builder
  "The docker-image-function-props-builder function buildes out new instances of 
DockerImageFunctionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DockerImageFunctionProps$Builder.)]
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
    (.build builder)))


(defn ecr-image-code-builder
  "The ecr-image-code-builder function buildes out new instances of 
EcrImageCode$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmd` | java.util.List | [[cdk.support/lookup-entry]] | `:cmd` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `tagOrDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-or-digest` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config ^software.amazon.awscdk.services.ecr.IRepository repository]
  (let [builder (EcrImageCode$Builder/create ^software.amazon.awscdk.services.ecr.IRepository repository)]
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
    (.build builder)))


(defn ecr-image-code-props-builder
  "The ecr-image-code-props-builder function buildes out new instances of 
EcrImageCodeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmd` | java.util.List | [[cdk.support/lookup-entry]] | `:cmd` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `tagOrDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-or-digest` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (EcrImageCodeProps$Builder.)]
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
    (.build builder)))


(defn environment-options-builder
  "The environment-options-builder function buildes out new instances of 
EnvironmentOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `removeInEdge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-in-edge` |"
  [stack id config]
  (let [builder (EnvironmentOptions$Builder.)]
    (when-let [data (lookup-entry config id :remove-in-edge)]
      (. builder removeInEdge data))
    (.build builder)))


(defn event-invoke-config-builder
  "The event-invoke-config-builder function buildes out new instances of 
EventInvokeConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (EventInvokeConfig$Builder/create stack id)]
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
    (.build builder)))


(defn event-invoke-config-options-builder
  "The event-invoke-config-options-builder function buildes out new instances of 
EventInvokeConfigOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (EventInvokeConfigOptions$Builder.)]
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (when-let [data (lookup-entry config id :on-success)]
      (. builder onSuccess data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (.build builder)))


(defn event-invoke-config-props-builder
  "The event-invoke-config-props-builder function buildes out new instances of 
EventInvokeConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (EventInvokeConfigProps$Builder.)]
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
    (.build builder)))


(defn event-source-mapping-builder
  "The event-source-mapping-builder function buildes out new instances of 
EventSourceMapping$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |"
  [stack id config]
  (let [builder (EventSourceMapping$Builder/create stack id)]
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
    (.build builder)))


(defn event-source-mapping-options-builder
  "The event-source-mapping-options-builder function buildes out new instances of 
EventSourceMappingOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |"
  [stack id config]
  (let [builder (EventSourceMappingOptions$Builder.)]
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
    (.build builder)))


(defn event-source-mapping-props-builder
  "The event-source-mapping-props-builder function buildes out new instances of 
EventSourceMappingProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |"
  [stack id config]
  (let [builder (EventSourceMappingProps$Builder.)]
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
    (.build builder)))


(defn file-system-config-builder
  "The file-system-config-builder function buildes out new instances of 
FileSystemConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `connections` | software.amazon.awscdk.services.ec2.Connections | [[cdk.support/lookup-entry]] | `:connections` |
| `dependency` | java.util.List | [[cdk.support/lookup-entry]] | `:dependency` |
| `localMountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-mount-path` |
| `policies` | java.util.List | [[cdk.support/lookup-entry]] | `:policies` |"
  [stack id config]
  (let [builder (FileSystemConfig$Builder.)]
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
    (.build builder)))


(defn function-attributes-builder
  "The function-attributes-builder function buildes out new instances of 
FunctionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `sameEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:same-environment` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `skipPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-permissions` |"
  [stack id config]
  (let [builder (FunctionAttributes$Builder.)]
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
    (.build builder)))


(defn function-builder
  "The function-builder function buildes out new instances of 
Function$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (Function$Builder/create stack id)]
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
    (.build builder)))


(defn function-options-builder
  "The function-options-builder function buildes out new instances of 
FunctionOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (FunctionOptions$Builder.)]
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
    (.build builder)))


(defn function-props-builder
  "The function-props-builder function buildes out new instances of 
FunctionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (FunctionProps$Builder.)]
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
    (.build builder)))


(defn function-url-builder
  "The function-url-builder function buildes out new instances of 
FunctionUrl$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | software.amazon.awscdk.services.lambda.FunctionUrlAuthType | [[cdk.api.services.lambda/function-url-auth-type]] | `:auth-type` |
| `cors` | software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions | [[cdk.support/lookup-entry]] | `:cors` |
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `invokeMode` | software.amazon.awscdk.services.lambda.InvokeMode | [[cdk.api.services.lambda/invoke-mode]] | `:invoke-mode` |"
  [stack id config]
  (let [builder (FunctionUrl$Builder/create stack id)]
    (when-let [data (function-url-auth-type config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :cors)]
      (. builder cors data))
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (when-let [data (invoke-mode config id :invoke-mode)]
      (. builder invokeMode data))
    (.build builder)))


(defn function-url-cors-options-builder
  "The function-url-cors-options-builder function buildes out new instances of 
FunctionUrlCorsOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-credentials` |
| `allowedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-headers` |
| `allowedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `exposedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:exposed-headers` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |"
  [stack id config]
  (let [builder (FunctionUrlCorsOptions$Builder.)]
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
    (.build builder)))


(defn function-url-options-builder
  "The function-url-options-builder function buildes out new instances of 
FunctionUrlOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | software.amazon.awscdk.services.lambda.FunctionUrlAuthType | [[cdk.api.services.lambda/function-url-auth-type]] | `:auth-type` |
| `cors` | software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions | [[cdk.support/lookup-entry]] | `:cors` |
| `invokeMode` | software.amazon.awscdk.services.lambda.InvokeMode | [[cdk.api.services.lambda/invoke-mode]] | `:invoke-mode` |"
  [stack id config]
  (let [builder (FunctionUrlOptions$Builder.)]
    (when-let [data (function-url-auth-type config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :cors)]
      (. builder cors data))
    (when-let [data (invoke-mode config id :invoke-mode)]
      (. builder invokeMode data))
    (.build builder)))


(defn function-url-props-builder
  "The function-url-props-builder function buildes out new instances of 
FunctionUrlProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | software.amazon.awscdk.services.lambda.FunctionUrlAuthType | [[cdk.api.services.lambda/function-url-auth-type]] | `:auth-type` |
| `cors` | software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions | [[cdk.support/lookup-entry]] | `:cors` |
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `invokeMode` | software.amazon.awscdk.services.lambda.InvokeMode | [[cdk.api.services.lambda/invoke-mode]] | `:invoke-mode` |"
  [stack id config]
  (let [builder (FunctionUrlProps$Builder.)]
    (when-let [data (function-url-auth-type config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :cors)]
      (. builder cors data))
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (when-let [data (invoke-mode config id :invoke-mode)]
      (. builder invokeMode data))
    (.build builder)))


(defn lambda-runtime-props-builder
  "The lambda-runtime-props-builder function buildes out new instances of 
LambdaRuntimeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundlingDockerImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundling-docker-image` |
| `isVariable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-variable` |
| `supportsCodeGuruProfiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-code-guru-profiling` |
| `supportsInlineCode` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-inline-code` |
| `supportsSnapStart` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-snap-start` |"
  [stack id config]
  (let [builder (LambdaRuntimeProps$Builder.)]
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
    (.build builder)))


(defn layer-version-attributes-builder
  "The layer-version-attributes-builder function buildes out new instances of 
LayerVersionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `layerVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-arn` |"
  [stack id config]
  (let [builder (LayerVersionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :compatible-runtimes)]
      (. builder compatibleRuntimes data))
    (when-let [data (lookup-entry config id :layer-version-arn)]
      (. builder layerVersionArn data))
    (.build builder)))


(defn layer-version-builder
  "The layer-version-builder function buildes out new instances of 
LayerVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `compatibleArchitectures` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-architectures` |
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-name` |
| `license` | java.lang.String | [[cdk.support/lookup-entry]] | `:license` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (LayerVersion$Builder/create stack id)]
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
    (.build builder)))


(defn layer-version-options-builder
  "The layer-version-options-builder function buildes out new instances of 
LayerVersionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-name` |
| `license` | java.lang.String | [[cdk.support/lookup-entry]] | `:license` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (LayerVersionOptions$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :layer-version-name)]
      (. builder layerVersionName data))
    (when-let [data (lookup-entry config id :license)]
      (. builder license data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn layer-version-permission-builder
  "The layer-version-permission-builder function buildes out new instances of 
LayerVersionPermission$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |"
  [stack id config]
  (let [builder (LayerVersionPermission$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :organization-id)]
      (. builder organizationId data))
    (.build builder)))


(defn layer-version-props-builder
  "The layer-version-props-builder function buildes out new instances of 
LayerVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `compatibleArchitectures` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-architectures` |
| `compatibleRuntimes` | java.util.List | [[cdk.support/lookup-entry]] | `:compatible-runtimes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `layerVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-version-name` |
| `license` | java.lang.String | [[cdk.support/lookup-entry]] | `:license` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (LayerVersionProps$Builder.)]
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
    (.build builder)))


(defn log-retention-retry-options-builder
  "The log-retention-retry-options-builder function buildes out new instances of 
LogRetentionRetryOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:base` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |"
  [stack id config]
  (let [builder (LogRetentionRetryOptions$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (.build builder)))


(defn params-and-secrets-options-builder
  "The params-and-secrets-options-builder function buildes out new instances of 
ParamsAndSecretsOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `secretsManagerTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:secrets-manager-ttl` |"
  [stack id config]
  (let [builder (ParamsAndSecretsOptions$Builder.)]
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
    (.build builder)))


(defn permission-builder
  "The permission-builder function buildes out new instances of 
Permission$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `eventSourceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-token` |
| `functionUrlAuthType` | software.amazon.awscdk.services.lambda.FunctionUrlAuthType | [[cdk.api.services.lambda/function-url-auth-type]] | `:function-url-auth-type` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
| `principal` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:principal` |
| `scope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:scope` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |"
  [stack id config]
  (let [builder (Permission$Builder.)]
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
    (.build builder)))


(defn resource-bind-options-builder
  "The resource-bind-options-builder function buildes out new instances of 
ResourceBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceProperty` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-property` |"
  [stack id config]
  (let [builder (ResourceBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :resource-property)]
      (. builder resourceProperty data))
    (.build builder)))


(defn singleton-function-builder
  "The singleton-function-builder function buildes out new instances of 
SingletonFunction$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SingletonFunction$Builder/create stack id)]
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
    (.build builder)))


(defn singleton-function-props-builder
  "The singleton-function-props-builder function buildes out new instances of 
SingletonFunctionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SingletonFunctionProps$Builder.)]
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
    (.build builder)))


(defn source-access-configuration-builder
  "The source-access-configuration-builder function buildes out new instances of 
SourceAccessConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | software.amazon.awscdk.services.lambda.SourceAccessConfigurationType | [[cdk.support/lookup-entry]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (SourceAccessConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn utilization-scaling-options-builder
  "The utilization-scaling-options-builder function buildes out new instances of 
UtilizationScalingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `utilizationTarget` | java.lang.Number | [[cdk.support/lookup-entry]] | `:utilization-target` |"
  [stack id config]
  (let [builder (UtilizationScalingOptions$Builder.)]
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
    (.build builder)))


(defn version-attributes-builder
  "The version-attributes-builder function buildes out new instances of 
VersionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (VersionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :lambda)]
      (. builder lambda data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn version-builder
  "The version-builder function buildes out new instances of 
Version$Builder using the provided configuration.  Each field is set as follows:

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
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (Version$Builder/create stack id)]
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
    (.build builder)))


(defn version-options-builder
  "The version-options-builder function buildes out new instances of 
VersionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-sha256` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `provisionedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrent-executions` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (VersionOptions$Builder.)]
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
    (.build builder)))


(defn version-props-builder
  "The version-props-builder function buildes out new instances of 
VersionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (VersionProps$Builder.)]
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
    (.build builder)))


(defn version-weight-builder
  "The version-weight-builder function buildes out new instances of 
VersionWeight$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:version` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (VersionWeight$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))