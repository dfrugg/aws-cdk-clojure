(ns cdk.api
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk App$Builder
                                   AppProps$Builder
                                   ArnComponents$Builder
                                   ArnFormat
                                   AssetHashType
                                   AssetManifestDockerImageDestination$Builder
                                   AssetManifestFileDestination$Builder
                                   AssetOptions$Builder
                                   AssetStaging$Builder
                                   AssetStagingProps$Builder
                                   BootstraplessSynthesizer$Builder
                                   BootstraplessSynthesizerProps$Builder
                                   BundlingFileAccess
                                   BundlingOptions$Builder
                                   BundlingOutput
                                   CfnAutoScalingReplacingUpdate$Builder
                                   CfnAutoScalingRollingUpdate$Builder
                                   CfnAutoScalingScheduledAction$Builder
                                   CfnCapabilities
                                   CfnCodeDeployBlueGreenAdditionalOptions$Builder
                                   CfnCodeDeployBlueGreenApplication$Builder
                                   CfnCodeDeployBlueGreenApplicationTarget$Builder
                                   CfnCodeDeployBlueGreenEcsAttributes$Builder
                                   CfnCodeDeployBlueGreenHook$Builder
                                   CfnCodeDeployBlueGreenHookProps$Builder
                                   CfnCodeDeployBlueGreenLifecycleEventHooks$Builder
                                   CfnCodeDeployLambdaAliasUpdate$Builder
                                   CfnCondition$Builder
                                   CfnConditionProps$Builder
                                   CfnCreationPolicy$Builder
                                   CfnCustomResource$Builder
                                   CfnCustomResourceProps$Builder
                                   CfnDeletionPolicy
                                   CfnDynamicReferenceProps$Builder
                                   CfnDynamicReferenceService
                                   CfnHook$Builder
                                   CfnHookDefaultVersion$Builder
                                   CfnHookDefaultVersionProps$Builder
                                   CfnHookProps$Builder
                                   CfnHookTypeConfig$Builder
                                   CfnHookTypeConfigProps$Builder
                                   CfnHookVersion$Builder
                                   CfnHookVersion$LoggingConfigProperty$Builder
                                   CfnHookVersionProps$Builder
                                   CfnJson$Builder
                                   CfnJsonProps$Builder
                                   CfnMacro$Builder
                                   CfnMacroProps$Builder
                                   CfnMapping$Builder
                                   CfnMappingProps$Builder
                                   CfnModuleDefaultVersion$Builder
                                   CfnModuleDefaultVersionProps$Builder
                                   CfnModuleVersion$Builder
                                   CfnModuleVersionProps$Builder
                                   CfnOutput$Builder
                                   CfnOutputProps$Builder
                                   CfnParameter$Builder
                                   CfnParameterProps$Builder
                                   CfnPublicTypeVersion$Builder
                                   CfnPublicTypeVersionProps$Builder
                                   CfnPublisher$Builder
                                   CfnPublisherProps$Builder
                                   CfnResource$Builder
                                   CfnResourceAutoScalingCreationPolicy$Builder
                                   CfnResourceDefaultVersion$Builder
                                   CfnResourceDefaultVersionProps$Builder
                                   CfnResourceProps$Builder
                                   CfnResourceSignal$Builder
                                   CfnResourceVersion$Builder
                                   CfnResourceVersion$LoggingConfigProperty$Builder
                                   CfnResourceVersionProps$Builder
                                   CfnRule$Builder
                                   CfnRuleAssertion$Builder
                                   CfnRuleProps$Builder
                                   CfnStack$Builder
                                   CfnStack$OutputProperty$Builder
                                   CfnStackProps$Builder
                                   CfnStackSet$AutoDeploymentProperty$Builder
                                   CfnStackSet$Builder
                                   CfnStackSet$DeploymentTargetsProperty$Builder
                                   CfnStackSet$ManagedExecutionProperty$Builder
                                   CfnStackSet$OperationPreferencesProperty$Builder
                                   CfnStackSet$ParameterProperty$Builder
                                   CfnStackSet$StackInstancesProperty$Builder
                                   CfnStackSetProps$Builder
                                   CfnTag$Builder
                                   CfnTrafficRoute$Builder
                                   CfnTrafficRouting$Builder
                                   CfnTrafficRoutingConfig$Builder
                                   CfnTrafficRoutingTimeBasedCanary$Builder
                                   CfnTrafficRoutingTimeBasedLinear$Builder
                                   CfnTrafficRoutingType
                                   CfnTypeActivation$Builder
                                   CfnTypeActivation$LoggingConfigProperty$Builder
                                   CfnTypeActivationProps$Builder
                                   CfnUpdatePolicy$Builder
                                   CfnWaitCondition$Builder
                                   CfnWaitConditionHandle$Builder
                                   CfnWaitConditionHandleProps$Builder
                                   CfnWaitConditionProps$Builder
                                   CliCredentialsStackSynthesizer$Builder
                                   CliCredentialsStackSynthesizerProps$Builder
                                   CopyOptions$Builder
                                   CustomResource$Builder
                                   CustomResourceProps$Builder
                                   CustomResourceProviderBaseProps$Builder
                                   CustomResourceProviderOptions$Builder
                                   CustomResourceProviderProps$Builder
                                   CustomResourceProviderRuntime
                                   DefaultStackSynthesizer$Builder
                                   DefaultStackSynthesizerProps$Builder
                                   DockerBuildOptions$Builder
                                   DockerCacheOption$Builder
                                   DockerImageAssetLocation$Builder
                                   DockerImageAssetSource$Builder
                                   DockerRunOptions$Builder
                                   DockerVolume$Builder
                                   DockerVolumeConsistency
                                   EncodingOptions$Builder
                                   Environment$Builder
                                   ExportValueOptions$Builder
                                   FileAssetLocation$Builder
                                   FileAssetPackaging
                                   FileAssetSource$Builder
                                   FileCopyOptions$Builder
                                   FileFingerprintOptions$Builder
                                   FingerprintOptions$Builder
                                   GetContextKeyOptions$Builder
                                   GetContextKeyResult$Builder
                                   GetContextValueOptions$Builder
                                   GetContextValueResult$Builder
                                   IgnoreMode
                                   IntrinsicProps$Builder
                                   LazyAnyValueOptions$Builder
                                   LazyListValueOptions$Builder
                                   LazyStringValueOptions$Builder
                                   NestedStack$Builder
                                   NestedStackProps$Builder
                                   PermissionsBoundaryBindOptions$Builder
                                   PolicyValidationPluginReportBeta1$Builder
                                   PolicyValidationReportStatusBeta1
                                   PolicyViolatingResourceBeta1$Builder
                                   PolicyViolationBeta1$Builder
                                   RemovalPolicy
                                   RemovalPolicyOptions$Builder
                                   RemoveTag$Builder
                                   ResolutionTypeHint
                                   ResolveChangeContextOptions$Builder
                                   ResolveOptions$Builder
                                   ResourceEnvironment$Builder
                                   ResourceProps$Builder
                                   ReverseOptions$Builder
                                   RoleOptions$Builder
                                   SecretValue$Builder
                                   SecretsManagerSecretOptions$Builder
                                   SizeConversionOptions$Builder
                                   SizeRoundingBehavior
                                   Stack$Builder
                                   StackProps$Builder
                                   Stage$Builder
                                   StageProps$Builder
                                   StageSynthesisOptions$Builder
                                   SymlinkFollowMode
                                   SynthesizeStackArtifactOptions$Builder
                                   Tag$Builder
                                   TagManager$Builder
                                   TagManagerOptions$Builder
                                   TagProps$Builder
                                   TagType
                                   TimeConversionOptions$Builder
                                   UniqueResourceNameOptions$Builder]))


(defn arn-format
  "The `arn-format` function data interprets values in the provided config data into a 
`ArnFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ArnFormat` - the value is returned.
* is `:slash-resource-name` - `ArnFormat/SLASH_RESOURCE_NAME` is returned
* is `:no-resource-name` - `ArnFormat/NO_RESOURCE_NAME` is returned
* is `:slash-resource-slash-resource-name` - `ArnFormat/SLASH_RESOURCE_SLASH_RESOURCE_NAME` is returned
* is `:colon-resource-name` - `ArnFormat/COLON_RESOURCE_NAME` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ArnFormat data) data
      (= :slash-resource-name data) ArnFormat/SLASH_RESOURCE_NAME
      (= :no-resource-name data) ArnFormat/NO_RESOURCE_NAME
      (= :slash-resource-slash-resource-name data) ArnFormat/SLASH_RESOURCE_SLASH_RESOURCE_NAME
      (= :colon-resource-name data) ArnFormat/COLON_RESOURCE_NAME)))


(defn asset-hash-type
  "The `asset-hash-type` function data interprets values in the provided config data into a 
`AssetHashType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AssetHashType` - the value is returned.
* is `:output` - `AssetHashType/OUTPUT` is returned
* is `:source` - `AssetHashType/SOURCE` is returned
* is `:custom` - `AssetHashType/CUSTOM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AssetHashType data) data
      (= :output data) AssetHashType/OUTPUT
      (= :source data) AssetHashType/SOURCE
      (= :custom data) AssetHashType/CUSTOM)))


(defn bundling-file-access
  "The `bundling-file-access` function data interprets values in the provided config data into a 
`BundlingFileAccess` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BundlingFileAccess` - the value is returned.
* is `:bind-mount` - `BundlingFileAccess/BIND_MOUNT` is returned
* is `:volume-copy` - `BundlingFileAccess/VOLUME_COPY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BundlingFileAccess data) data
      (= :bind-mount data) BundlingFileAccess/BIND_MOUNT
      (= :volume-copy data) BundlingFileAccess/VOLUME_COPY)))


(defn bundling-output
  "The `bundling-output` function data interprets values in the provided config data into a 
`BundlingOutput` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BundlingOutput` - the value is returned.
* is `:auto-discover` - `BundlingOutput/AUTO_DISCOVER` is returned
* is `:single-file` - `BundlingOutput/SINGLE_FILE` is returned
* is `:archived` - `BundlingOutput/ARCHIVED` is returned
* is `:not-archived` - `BundlingOutput/NOT_ARCHIVED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BundlingOutput data) data
      (= :auto-discover data) BundlingOutput/AUTO_DISCOVER
      (= :single-file data) BundlingOutput/SINGLE_FILE
      (= :archived data) BundlingOutput/ARCHIVED
      (= :not-archived data) BundlingOutput/NOT_ARCHIVED)))


(defn cfn-capabilities
  "The `cfn-capabilities` function data interprets values in the provided config data into a 
`CfnCapabilities` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CfnCapabilities` - the value is returned.
* is `:auto-expand` - `CfnCapabilities/AUTO_EXPAND` is returned
* is `:none` - `CfnCapabilities/NONE` is returned
* is `:named-iam` - `CfnCapabilities/NAMED_IAM` is returned
* is `:anonymous-iam` - `CfnCapabilities/ANONYMOUS_IAM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CfnCapabilities data) data
      (= :auto-expand data) CfnCapabilities/AUTO_EXPAND
      (= :none data) CfnCapabilities/NONE
      (= :named-iam data) CfnCapabilities/NAMED_IAM
      (= :anonymous-iam data) CfnCapabilities/ANONYMOUS_IAM)))


(defn cfn-deletion-policy
  "The `cfn-deletion-policy` function data interprets values in the provided config data into a 
`CfnDeletionPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CfnDeletionPolicy` - the value is returned.
* is `:delete` - `CfnDeletionPolicy/DELETE` is returned
* is `:snapshot` - `CfnDeletionPolicy/SNAPSHOT` is returned
* is `:retain` - `CfnDeletionPolicy/RETAIN` is returned
* is `:retain-except-on-create` - `CfnDeletionPolicy/RETAIN_EXCEPT_ON_CREATE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CfnDeletionPolicy data) data
      (= :delete data) CfnDeletionPolicy/DELETE
      (= :snapshot data) CfnDeletionPolicy/SNAPSHOT
      (= :retain data) CfnDeletionPolicy/RETAIN
      (= :retain-except-on-create data) CfnDeletionPolicy/RETAIN_EXCEPT_ON_CREATE)))


(defn cfn-dynamic-reference-service
  "The `cfn-dynamic-reference-service` function data interprets values in the provided config data into a 
`CfnDynamicReferenceService` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CfnDynamicReferenceService` - the value is returned.
* is `:secrets-manager` - `CfnDynamicReferenceService/SECRETS_MANAGER` is returned
* is `:ssm` - `CfnDynamicReferenceService/SSM` is returned
* is `:ssm-secure` - `CfnDynamicReferenceService/SSM_SECURE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CfnDynamicReferenceService data) data
      (= :secrets-manager data) CfnDynamicReferenceService/SECRETS_MANAGER
      (= :ssm data) CfnDynamicReferenceService/SSM
      (= :ssm-secure data) CfnDynamicReferenceService/SSM_SECURE)))


(defn cfn-traffic-routing-type
  "The `cfn-traffic-routing-type` function data interprets values in the provided config data into a 
`CfnTrafficRoutingType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CfnTrafficRoutingType` - the value is returned.
* is `:time-based-linear` - `CfnTrafficRoutingType/TIME_BASED_LINEAR` is returned
* is `:all-at-once` - `CfnTrafficRoutingType/ALL_AT_ONCE` is returned
* is `:time-based-canary` - `CfnTrafficRoutingType/TIME_BASED_CANARY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CfnTrafficRoutingType data) data
      (= :time-based-linear data) CfnTrafficRoutingType/TIME_BASED_LINEAR
      (= :all-at-once data) CfnTrafficRoutingType/ALL_AT_ONCE
      (= :time-based-canary data) CfnTrafficRoutingType/TIME_BASED_CANARY)))


(defn custom-resource-provider-runtime
  "The `custom-resource-provider-runtime` function data interprets values in the provided config data into a 
`CustomResourceProviderRuntime` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CustomResourceProviderRuntime` - the value is returned.
* is `:nodejs-14-x` - `CustomResourceProviderRuntime/NODEJS_14_X` is returned
* is `:nodejs-12-x` - `CustomResourceProviderRuntime/NODEJS_12_X` is returned
* is `:nodejs-16-x` - `CustomResourceProviderRuntime/NODEJS_16_X` is returned
* is `:nodejs-18-x` - `CustomResourceProviderRuntime/NODEJS_18_X` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CustomResourceProviderRuntime data) data
      (= :nodejs-14-x data) CustomResourceProviderRuntime/NODEJS_14_X
      (= :nodejs-12-x data) CustomResourceProviderRuntime/NODEJS_12_X
      (= :nodejs-16-x data) CustomResourceProviderRuntime/NODEJS_16_X
      (= :nodejs-18-x data) CustomResourceProviderRuntime/NODEJS_18_X)))


(defn docker-volume-consistency
  "The `docker-volume-consistency` function data interprets values in the provided config data into a 
`DockerVolumeConsistency` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DockerVolumeConsistency` - the value is returned.
* is `:consistent` - `DockerVolumeConsistency/CONSISTENT` is returned
* is `:delegated` - `DockerVolumeConsistency/DELEGATED` is returned
* is `:cached` - `DockerVolumeConsistency/CACHED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DockerVolumeConsistency data) data
      (= :consistent data) DockerVolumeConsistency/CONSISTENT
      (= :delegated data) DockerVolumeConsistency/DELEGATED
      (= :cached data) DockerVolumeConsistency/CACHED)))


(defn file-asset-packaging
  "The `file-asset-packaging` function data interprets values in the provided config data into a 
`FileAssetPackaging` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FileAssetPackaging` - the value is returned.
* is `:zip-directory` - `FileAssetPackaging/ZIP_DIRECTORY` is returned
* is `:file` - `FileAssetPackaging/FILE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FileAssetPackaging data) data
      (= :zip-directory data) FileAssetPackaging/ZIP_DIRECTORY
      (= :file data) FileAssetPackaging/FILE)))


(defn ignore-mode
  "The `ignore-mode` function data interprets values in the provided config data into a 
`IgnoreMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IgnoreMode` - the value is returned.
* is `:docker` - `IgnoreMode/DOCKER` is returned
* is `:git` - `IgnoreMode/GIT` is returned
* is `:glob` - `IgnoreMode/GLOB` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IgnoreMode data) data
      (= :docker data) IgnoreMode/DOCKER
      (= :git data) IgnoreMode/GIT
      (= :glob data) IgnoreMode/GLOB)))


(defn policy-validation-report-status-beta1
  "The `policy-validation-report-status-beta1` function data interprets values in the provided config data into a 
`PolicyValidationReportStatusBeta1` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PolicyValidationReportStatusBeta1` - the value is returned.
* is `:success` - `PolicyValidationReportStatusBeta1/SUCCESS` is returned
* is `:failure` - `PolicyValidationReportStatusBeta1/FAILURE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PolicyValidationReportStatusBeta1 data) data
      (= :success data) PolicyValidationReportStatusBeta1/SUCCESS
      (= :failure data) PolicyValidationReportStatusBeta1/FAILURE)))


(defn removal-policy
  "The `removal-policy` function data interprets values in the provided config data into a 
`RemovalPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RemovalPolicy` - the value is returned.
* is `:snapshot` - `RemovalPolicy/SNAPSHOT` is returned
* is `:retain-on-update-or-delete` - `RemovalPolicy/RETAIN_ON_UPDATE_OR_DELETE` is returned
* is `:destroy` - `RemovalPolicy/DESTROY` is returned
* is `:retain` - `RemovalPolicy/RETAIN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RemovalPolicy data) data
      (= :snapshot data) RemovalPolicy/SNAPSHOT
      (= :retain-on-update-or-delete data) RemovalPolicy/RETAIN_ON_UPDATE_OR_DELETE
      (= :destroy data) RemovalPolicy/DESTROY
      (= :retain data) RemovalPolicy/RETAIN)))


(defn resolution-type-hint
  "The `resolution-type-hint` function data interprets values in the provided config data into a 
`ResolutionTypeHint` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ResolutionTypeHint` - the value is returned.
* is `:string` - `ResolutionTypeHint/STRING` is returned
* is `:number` - `ResolutionTypeHint/NUMBER` is returned
* is `:string-list` - `ResolutionTypeHint/STRING_LIST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ResolutionTypeHint data) data
      (= :string data) ResolutionTypeHint/STRING
      (= :number data) ResolutionTypeHint/NUMBER
      (= :string-list data) ResolutionTypeHint/STRING_LIST)))


(defn size-rounding-behavior
  "The `size-rounding-behavior` function data interprets values in the provided config data into a 
`SizeRoundingBehavior` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SizeRoundingBehavior` - the value is returned.
* is `:floor` - `SizeRoundingBehavior/FLOOR` is returned
* is `:fail` - `SizeRoundingBehavior/FAIL` is returned
* is `:none` - `SizeRoundingBehavior/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SizeRoundingBehavior data) data
      (= :floor data) SizeRoundingBehavior/FLOOR
      (= :fail data) SizeRoundingBehavior/FAIL
      (= :none data) SizeRoundingBehavior/NONE)))


(defn symlink-follow-mode
  "The `symlink-follow-mode` function data interprets values in the provided config data into a 
`SymlinkFollowMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SymlinkFollowMode` - the value is returned.
* is `:never` - `SymlinkFollowMode/NEVER` is returned
* is `:block-external` - `SymlinkFollowMode/BLOCK_EXTERNAL` is returned
* is `:always` - `SymlinkFollowMode/ALWAYS` is returned
* is `:external` - `SymlinkFollowMode/EXTERNAL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SymlinkFollowMode data) data
      (= :never data) SymlinkFollowMode/NEVER
      (= :block-external data) SymlinkFollowMode/BLOCK_EXTERNAL
      (= :always data) SymlinkFollowMode/ALWAYS
      (= :external data) SymlinkFollowMode/EXTERNAL)))


(defn tag-type
  "The `tag-type` function data interprets values in the provided config data into a 
`TagType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TagType` - the value is returned.
* is `:map` - `TagType/MAP` is returned
* is `:standard` - `TagType/STANDARD` is returned
* is `:not-taggable` - `TagType/NOT_TAGGABLE` is returned
* is `:key-value` - `TagType/KEY_VALUE` is returned
* is `:autoscaling-group` - `TagType/AUTOSCALING_GROUP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TagType data) data
      (= :map data) TagType/MAP
      (= :standard data) TagType/STANDARD
      (= :not-taggable data) TagType/NOT_TAGGABLE
      (= :key-value data) TagType/KEY_VALUE
      (= :autoscaling-group data) TagType/AUTOSCALING_GROUP)))








(defn app-builder
  "The app-builder function buildes out new instances of 
App$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analyticsReporting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:analytics-reporting` |
| `autoSynth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-synth` |
| `context` | java.util.Map | [[cdk.support/lookup-entry]] | `:context` |
| `defaultStackSynthesizer` | software.amazon.awscdk.IReusableStackSynthesizer | [[cdk.support/lookup-entry]] | `:default-stack-synthesizer` |
| `outdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:outdir` |
| `policyValidationBeta1` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-validation-beta1` |
| `postCliContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:post-cli-context` |
| `stackTraces` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-traces` |
| `treeMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tree-metadata` |"
  [stack id config]
  (let [builder (App$Builder/create)]
    (when-let [data (lookup-entry config id :analytics-reporting)]
      (. builder analyticsReporting data))
    (when-let [data (lookup-entry config id :auto-synth)]
      (. builder autoSynth data))
    (when-let [data (lookup-entry config id :context)]
      (. builder context data))
    (when-let [data (lookup-entry config id :default-stack-synthesizer)]
      (. builder defaultStackSynthesizer data))
    (when-let [data (lookup-entry config id :outdir)]
      (. builder outdir data))
    (when-let [data (lookup-entry config id :policy-validation-beta1)]
      (. builder policyValidationBeta1 data))
    (when-let [data (lookup-entry config id :post-cli-context)]
      (. builder postCliContext data))
    (when-let [data (lookup-entry config id :stack-traces)]
      (. builder stackTraces data))
    (when-let [data (lookup-entry config id :tree-metadata)]
      (. builder treeMetadata data))
    (.build builder)))


(defn app-props-builder
  "The app-props-builder function buildes out new instances of 
AppProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analyticsReporting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:analytics-reporting` |
| `autoSynth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-synth` |
| `context` | java.util.Map | [[cdk.support/lookup-entry]] | `:context` |
| `defaultStackSynthesizer` | software.amazon.awscdk.IReusableStackSynthesizer | [[cdk.support/lookup-entry]] | `:default-stack-synthesizer` |
| `outdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:outdir` |
| `policyValidationBeta1` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-validation-beta1` |
| `postCliContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:post-cli-context` |
| `stackTraces` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-traces` |
| `treeMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tree-metadata` |"
  [stack id config]
  (let [builder (AppProps$Builder.)]
    (when-let [data (lookup-entry config id :analytics-reporting)]
      (. builder analyticsReporting data))
    (when-let [data (lookup-entry config id :auto-synth)]
      (. builder autoSynth data))
    (when-let [data (lookup-entry config id :context)]
      (. builder context data))
    (when-let [data (lookup-entry config id :default-stack-synthesizer)]
      (. builder defaultStackSynthesizer data))
    (when-let [data (lookup-entry config id :outdir)]
      (. builder outdir data))
    (when-let [data (lookup-entry config id :policy-validation-beta1)]
      (. builder policyValidationBeta1 data))
    (when-let [data (lookup-entry config id :post-cli-context)]
      (. builder postCliContext data))
    (when-let [data (lookup-entry config id :stack-traces)]
      (. builder stackTraces data))
    (when-let [data (lookup-entry config id :tree-metadata)]
      (. builder treeMetadata data))
    (.build builder)))


(defn arn-components-builder
  "The arn-components-builder function buildes out new instances of 
ArnComponents$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `arnFormat` | software.amazon.awscdk.ArnFormat | [[cdk.api/arn-format]] | `:arn-format` |
| `partition` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (ArnComponents$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (arn-format config id :arn-format)]
      (. builder arnFormat data))
    (when-let [data (lookup-entry config id :partition)]
      (. builder partition data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :resource-name)]
      (. builder resourceName data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn asset-manifest-docker-image-destination-builder
  "The asset-manifest-docker-image-destination-builder function buildes out new instances of 
AssetManifestDockerImageDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dockerTagPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-tag-prefix` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `role` | software.amazon.awscdk.RoleOptions | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (AssetManifestDockerImageDestination$Builder.)]
    (when-let [data (lookup-entry config id :docker-tag-prefix)]
      (. builder dockerTagPrefix data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn asset-manifest-file-destination-builder
  "The asset-manifest-file-destination-builder function buildes out new instances of 
AssetManifestFileDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `role` | software.amazon.awscdk.RoleOptions | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (AssetManifestFileDestination$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn asset-options-builder
  "The asset-options-builder function buildes out new instances of 
AssetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |"
  [stack id config]
  (let [builder (AssetOptions$Builder.)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (.build builder)))


(defn asset-staging-builder
  "The asset-staging-builder function buildes out new instances of 
AssetStaging$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `follow` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (AssetStaging$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (symlink-follow-mode config id :follow)]
      (. builder follow data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn asset-staging-props-builder
  "The asset-staging-props-builder function buildes out new instances of 
AssetStagingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `follow` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (AssetStagingProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (symlink-follow-mode config id :follow)]
      (. builder follow data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn bootstrapless-synthesizer-builder
  "The bootstrapless-synthesizer-builder function buildes out new instances of 
BootstraplessSynthesizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role-arn` |
| `deployRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-arn` |"
  [stack id config]
  (let [builder (BootstraplessSynthesizer$Builder/create)]
    (when-let [data (lookup-entry config id :cloud-formation-execution-role-arn)]
      (. builder cloudFormationExecutionRoleArn data))
    (when-let [data (lookup-entry config id :deploy-role-arn)]
      (. builder deployRoleArn data))
    (.build builder)))


(defn bootstrapless-synthesizer-props-builder
  "The bootstrapless-synthesizer-props-builder function buildes out new instances of 
BootstraplessSynthesizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role-arn` |
| `deployRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-arn` |"
  [stack id config]
  (let [builder (BootstraplessSynthesizerProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-formation-execution-role-arn)]
      (. builder cloudFormationExecutionRoleArn data))
    (when-let [data (lookup-entry config id :deploy-role-arn)]
      (. builder deployRoleArn data))
    (.build builder)))


(defn bundling-options-builder
  "The bundling-options-builder function buildes out new instances of 
BundlingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundlingFileAccess` | software.amazon.awscdk.BundlingFileAccess | [[cdk.api/bundling-file-access]] | `:bundling-file-access` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | software.amazon.awscdk.DockerImage | [[cdk.support/lookup-entry]] | `:image` |
| `local` | software.amazon.awscdk.ILocalBundling | [[cdk.support/lookup-entry]] | `:local` |
| `network` | java.lang.String | [[cdk.support/lookup-entry]] | `:network` |
| `outputType` | software.amazon.awscdk.BundlingOutput | [[cdk.api/bundling-output]] | `:output-type` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `securityOpt` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-opt` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
| `volumesFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes-from` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (BundlingOptions$Builder.)]
    (when-let [data (bundling-file-access config id :bundling-file-access)]
      (. builder bundlingFileAccess data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :entrypoint)]
      (. builder entrypoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :local)]
      (. builder local data))
    (when-let [data (lookup-entry config id :network)]
      (. builder network data))
    (when-let [data (bundling-output config id :output-type)]
      (. builder outputType data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :security-opt)]
      (. builder securityOpt data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (when-let [data (lookup-entry config id :volumes-from)]
      (. builder volumesFrom data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-auto-scaling-replacing-update-builder
  "The cfn-auto-scaling-replacing-update-builder function buildes out new instances of 
CfnAutoScalingReplacingUpdate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `willReplace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:will-replace` |"
  [stack id config]
  (let [builder (CfnAutoScalingReplacingUpdate$Builder.)]
    (when-let [data (lookup-entry config id :will-replace)]
      (. builder willReplace data))
    (.build builder)))


(defn cfn-auto-scaling-rolling-update-builder
  "The cfn-auto-scaling-rolling-update-builder function buildes out new instances of 
CfnAutoScalingRollingUpdate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `minInstancesInService` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-instances-in-service` |
| `minSuccessfulInstancesPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-successful-instances-percent` |
| `pauseTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:pause-time` |
| `suspendProcesses` | java.util.List | [[cdk.support/lookup-entry]] | `:suspend-processes` |
| `waitOnResourceSignals` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait-on-resource-signals` |"
  [stack id config]
  (let [builder (CfnAutoScalingRollingUpdate$Builder.)]
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :min-instances-in-service)]
      (. builder minInstancesInService data))
    (when-let [data (lookup-entry config id :min-successful-instances-percent)]
      (. builder minSuccessfulInstancesPercent data))
    (when-let [data (lookup-entry config id :pause-time)]
      (. builder pauseTime data))
    (when-let [data (lookup-entry config id :suspend-processes)]
      (. builder suspendProcesses data))
    (when-let [data (lookup-entry config id :wait-on-resource-signals)]
      (. builder waitOnResourceSignals data))
    (.build builder)))


(defn cfn-auto-scaling-scheduled-action-builder
  "The cfn-auto-scaling-scheduled-action-builder function buildes out new instances of 
CfnAutoScalingScheduledAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ignoreUnmodifiedGroupSizeProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-unmodified-group-size-properties` |"
  [stack id config]
  (let [builder (CfnAutoScalingScheduledAction$Builder.)]
    (when-let [data (lookup-entry config id :ignore-unmodified-group-size-properties)]
      (. builder ignoreUnmodifiedGroupSizeProperties data))
    (.build builder)))


(defn cfn-code-deploy-blue-green-additional-options-builder
  "The cfn-code-deploy-blue-green-additional-options-builder function buildes out new instances of 
CfnCodeDeployBlueGreenAdditionalOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `terminationWaitTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-wait-time-in-minutes` |"
  [stack id config]
  (let [builder (CfnCodeDeployBlueGreenAdditionalOptions$Builder.)]
    (when-let [data (lookup-entry config id :termination-wait-time-in-minutes)]
      (. builder terminationWaitTimeInMinutes data))
    (.build builder)))


(defn cfn-code-deploy-blue-green-application-builder
  "The cfn-code-deploy-blue-green-application-builder function buildes out new instances of 
CfnCodeDeployBlueGreenApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecsAttributes` | software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes | [[cdk.support/lookup-entry]] | `:ecs-attributes` |
| `target` | software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnCodeDeployBlueGreenApplication$Builder.)]
    (when-let [data (lookup-entry config id :ecs-attributes)]
      (. builder ecsAttributes data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-code-deploy-blue-green-application-target-builder
  "The cfn-code-deploy-blue-green-application-target-builder function buildes out new instances of 
CfnCodeDeployBlueGreenApplicationTarget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCodeDeployBlueGreenApplicationTarget$Builder.)]
    (when-let [data (lookup-entry config id :logical-id)]
      (. builder logicalId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-code-deploy-blue-green-ecs-attributes-builder
  "The cfn-code-deploy-blue-green-ecs-attributes-builder function buildes out new instances of 
CfnCodeDeployBlueGreenEcsAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `taskDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:task-definitions` |
| `taskSets` | java.util.List | [[cdk.support/lookup-entry]] | `:task-sets` |
| `trafficRouting` | software.amazon.awscdk.CfnTrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |"
  [stack id config]
  (let [builder (CfnCodeDeployBlueGreenEcsAttributes$Builder.)]
    (when-let [data (lookup-entry config id :task-definitions)]
      (. builder taskDefinitions data))
    (when-let [data (lookup-entry config id :task-sets)]
      (. builder taskSets data))
    (when-let [data (lookup-entry config id :traffic-routing)]
      (. builder trafficRouting data))
    (.build builder)))


(defn cfn-code-deploy-blue-green-hook-builder
  "The cfn-code-deploy-blue-green-hook-builder function buildes out new instances of 
CfnCodeDeployBlueGreenHook$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalOptions` | software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions | [[cdk.support/lookup-entry]] | `:additional-options` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `lifecycleEventHooks` | software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks | [[cdk.support/lookup-entry]] | `:lifecycle-event-hooks` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `trafficRoutingConfig` | software.amazon.awscdk.CfnTrafficRoutingConfig | [[cdk.support/lookup-entry]] | `:traffic-routing-config` |"
  [stack id config]
  (let [builder (CfnCodeDeployBlueGreenHook$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-options)]
      (. builder additionalOptions data))
    (when-let [data (lookup-entry config id :applications)]
      (. builder applications data))
    (when-let [data (lookup-entry config id :lifecycle-event-hooks)]
      (. builder lifecycleEventHooks data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :traffic-routing-config)]
      (. builder trafficRoutingConfig data))
    (.build builder)))


(defn cfn-code-deploy-blue-green-hook-props-builder
  "The cfn-code-deploy-blue-green-hook-props-builder function buildes out new instances of 
CfnCodeDeployBlueGreenHookProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalOptions` | software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions | [[cdk.support/lookup-entry]] | `:additional-options` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `lifecycleEventHooks` | software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks | [[cdk.support/lookup-entry]] | `:lifecycle-event-hooks` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `trafficRoutingConfig` | software.amazon.awscdk.CfnTrafficRoutingConfig | [[cdk.support/lookup-entry]] | `:traffic-routing-config` |"
  [stack id config]
  (let [builder (CfnCodeDeployBlueGreenHookProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-options)]
      (. builder additionalOptions data))
    (when-let [data (lookup-entry config id :applications)]
      (. builder applications data))
    (when-let [data (lookup-entry config id :lifecycle-event-hooks)]
      (. builder lifecycleEventHooks data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :traffic-routing-config)]
      (. builder trafficRoutingConfig data))
    (.build builder)))


(defn cfn-code-deploy-blue-green-lifecycle-event-hooks-builder
  "The cfn-code-deploy-blue-green-lifecycle-event-hooks-builder function buildes out new instances of 
CfnCodeDeployBlueGreenLifecycleEventHooks$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterAllowTestTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-allow-test-traffic` |
| `afterAllowTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-allow-traffic` |
| `afterInstall` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-install` |
| `beforeAllowTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:before-allow-traffic` |
| `beforeInstall` | java.lang.String | [[cdk.support/lookup-entry]] | `:before-install` |"
  [stack id config]
  (let [builder (CfnCodeDeployBlueGreenLifecycleEventHooks$Builder.)]
    (when-let [data (lookup-entry config id :after-allow-test-traffic)]
      (. builder afterAllowTestTraffic data))
    (when-let [data (lookup-entry config id :after-allow-traffic)]
      (. builder afterAllowTraffic data))
    (when-let [data (lookup-entry config id :after-install)]
      (. builder afterInstall data))
    (when-let [data (lookup-entry config id :before-allow-traffic)]
      (. builder beforeAllowTraffic data))
    (when-let [data (lookup-entry config id :before-install)]
      (. builder beforeInstall data))
    (.build builder)))


(defn cfn-code-deploy-lambda-alias-update-builder
  "The cfn-code-deploy-lambda-alias-update-builder function buildes out new instances of 
CfnCodeDeployLambdaAliasUpdate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterAllowTrafficHook` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-allow-traffic-hook` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `beforeAllowTrafficHook` | java.lang.String | [[cdk.support/lookup-entry]] | `:before-allow-traffic-hook` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |"
  [stack id config]
  (let [builder (CfnCodeDeployLambdaAliasUpdate$Builder.)]
    (when-let [data (lookup-entry config id :after-allow-traffic-hook)]
      (. builder afterAllowTrafficHook data))
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :before-allow-traffic-hook)]
      (. builder beforeAllowTrafficHook data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (.build builder)))


(defn cfn-condition-builder
  "The cfn-condition-builder function buildes out new instances of 
CfnCondition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:expression` |"
  [stack id config]
  (let [builder (CfnCondition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (.build builder)))


(defn cfn-condition-props-builder
  "The cfn-condition-props-builder function buildes out new instances of 
CfnConditionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:expression` |"
  [stack id config]
  (let [builder (CfnConditionProps$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (.build builder)))


(defn cfn-creation-policy-builder
  "The cfn-creation-policy-builder function buildes out new instances of 
CfnCreationPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingCreationPolicy` | software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy | [[cdk.support/lookup-entry]] | `:auto-scaling-creation-policy` |
| `resourceSignal` | software.amazon.awscdk.CfnResourceSignal | [[cdk.support/lookup-entry]] | `:resource-signal` |
| `startFleet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:start-fleet` |"
  [stack id config]
  (let [builder (CfnCreationPolicy$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-creation-policy)]
      (. builder autoScalingCreationPolicy data))
    (when-let [data (lookup-entry config id :resource-signal)]
      (. builder resourceSignal data))
    (when-let [data (lookup-entry config id :start-fleet)]
      (. builder startFleet data))
    (.build builder)))


(defn cfn-custom-resource-builder
  "The cfn-custom-resource-builder function buildes out new instances of 
CfnCustomResource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |"
  [stack id config]
  (let [builder (CfnCustomResource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :service-token)]
      (. builder serviceToken data))
    (.build builder)))


(defn cfn-custom-resource-props-builder
  "The cfn-custom-resource-props-builder function buildes out new instances of 
CfnCustomResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |"
  [stack id config]
  (let [builder (CfnCustomResourceProps$Builder.)]
    (when-let [data (lookup-entry config id :service-token)]
      (. builder serviceToken data))
    (.build builder)))


(defn cfn-dynamic-reference-props-builder
  "The cfn-dynamic-reference-props-builder function buildes out new instances of 
CfnDynamicReferenceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-key` |
| `service` | software.amazon.awscdk.CfnDynamicReferenceService | [[cdk.api/cfn-dynamic-reference-service]] | `:service` |"
  [stack id config]
  (let [builder (CfnDynamicReferenceProps$Builder.)]
    (when-let [data (lookup-entry config id :reference-key)]
      (. builder referenceKey data))
    (when-let [data (cfn-dynamic-reference-service config id :service)]
      (. builder service data))
    (.build builder)))


(defn cfn-hook-builder
  "The cfn-hook-builder function buildes out new instances of 
CfnHook$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnHook$Builder/create stack id)]
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-hook-default-version-builder
  "The cfn-hook-default-version-builder function buildes out new instances of 
CfnHookDefaultVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnHookDefaultVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-version-arn)]
      (. builder typeVersionArn data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-hook-default-version-props-builder
  "The cfn-hook-default-version-props-builder function buildes out new instances of 
CfnHookDefaultVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnHookDefaultVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-version-arn)]
      (. builder typeVersionArn data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-hook-props-builder
  "The cfn-hook-props-builder function buildes out new instances of 
CfnHookProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnHookProps$Builder.)]
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-hook-type-config-builder
  "The cfn-hook-type-config-builder function buildes out new instances of 
CfnHookTypeConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `configurationAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-alias` |
| `typeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-arn` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnHookTypeConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :configuration-alias)]
      (. builder configurationAlias data))
    (when-let [data (lookup-entry config id :type-arn)]
      (. builder typeArn data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-hook-type-config-props-builder
  "The cfn-hook-type-config-props-builder function buildes out new instances of 
CfnHookTypeConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `configurationAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-alias` |
| `typeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-arn` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnHookTypeConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :configuration-alias)]
      (. builder configurationAlias data))
    (when-let [data (lookup-entry config id :type-arn)]
      (. builder typeArn data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-hook-version-builder
  "The cfn-hook-version-builder function buildes out new instances of 
CfnHookVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnHookVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :schema-handler-package)]
      (. builder schemaHandlerPackage data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-hook-version-logging-config-property-builder
  "The cfn-hook-version-logging-config-property-builder function buildes out new instances of 
CfnHookVersion$LoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |"
  [stack id config]
  (let [builder (CfnHookVersion$LoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (.build builder)))


(defn cfn-hook-version-props-builder
  "The cfn-hook-version-props-builder function buildes out new instances of 
CfnHookVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnHookVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :schema-handler-package)]
      (. builder schemaHandlerPackage data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-json-builder
  "The cfn-json-builder function buildes out new instances of 
CfnJson$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnJson$Builder/create stack id)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-json-props-builder
  "The cfn-json-props-builder function buildes out new instances of 
CfnJsonProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnJsonProps$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-macro-builder
  "The cfn-macro-builder function buildes out new instances of 
CfnMacro$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnMacro$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-macro-props-builder
  "The cfn-macro-props-builder function buildes out new instances of 
CfnMacroProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnMacroProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-mapping-builder
  "The cfn-mapping-builder function buildes out new instances of 
CfnMapping$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lazy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lazy` |
| `mapping` | java.util.Map | [[cdk.support/lookup-entry]] | `:mapping` |"
  [stack id config]
  (let [builder (CfnMapping$Builder/create stack id)]
    (when-let [data (lookup-entry config id :lazy)]
      (. builder lazy data))
    (when-let [data (lookup-entry config id :mapping)]
      (. builder mapping data))
    (.build builder)))


(defn cfn-mapping-props-builder
  "The cfn-mapping-props-builder function buildes out new instances of 
CfnMappingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lazy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lazy` |
| `mapping` | java.util.Map | [[cdk.support/lookup-entry]] | `:mapping` |"
  [stack id config]
  (let [builder (CfnMappingProps$Builder.)]
    (when-let [data (lookup-entry config id :lazy)]
      (. builder lazy data))
    (when-let [data (lookup-entry config id :mapping)]
      (. builder mapping data))
    (.build builder)))


(defn cfn-module-default-version-builder
  "The cfn-module-default-version-builder function buildes out new instances of 
CfnModuleDefaultVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnModuleDefaultVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :module-name)]
      (. builder moduleName data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-module-default-version-props-builder
  "The cfn-module-default-version-props-builder function buildes out new instances of 
CfnModuleDefaultVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnModuleDefaultVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :module-name)]
      (. builder moduleName data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-module-version-builder
  "The cfn-module-version-builder function buildes out new instances of 
CfnModuleVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |"
  [stack id config]
  (let [builder (CfnModuleVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :module-name)]
      (. builder moduleName data))
    (when-let [data (lookup-entry config id :module-package)]
      (. builder modulePackage data))
    (.build builder)))


(defn cfn-module-version-props-builder
  "The cfn-module-version-props-builder function buildes out new instances of 
CfnModuleVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |"
  [stack id config]
  (let [builder (CfnModuleVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :module-name)]
      (. builder moduleName data))
    (when-let [data (lookup-entry config id :module-package)]
      (. builder modulePackage data))
    (.build builder)))


(defn cfn-output-builder
  "The cfn-output-builder function buildes out new instances of 
CfnOutput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.CfnCondition | [[cdk.support/lookup-entry]] | `:condition` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-name` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnOutput$Builder/create stack id)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :export-name)]
      (. builder exportName data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-output-props-builder
  "The cfn-output-props-builder function buildes out new instances of 
CfnOutputProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.CfnCondition | [[cdk.support/lookup-entry]] | `:condition` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-name` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnOutputProps$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :export-name)]
      (. builder exportName data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-parameter-builder
  "The cfn-parameter-builder function buildes out new instances of 
CfnParameter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `constraintDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:constraint-description` |
| `defaultValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length` |
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-length` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `noEcho` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:no-echo` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnParameter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-pattern)]
      (. builder allowedPattern data))
    (when-let [data (lookup-entry config id :allowed-values)]
      (. builder allowedValues data))
    (when-let [data (lookup-entry config id :constraint-description)]
      (. builder constraintDescription data))
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :max-length)]
      (. builder maxLength data))
    (when-let [data (lookup-entry config id :max-value)]
      (. builder maxValue data))
    (when-let [data (lookup-entry config id :min-length)]
      (. builder minLength data))
    (when-let [data (lookup-entry config id :min-value)]
      (. builder minValue data))
    (when-let [data (lookup-entry config id :no-echo)]
      (. builder noEcho data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-parameter-props-builder
  "The cfn-parameter-props-builder function buildes out new instances of 
CfnParameterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `constraintDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:constraint-description` |
| `defaultValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length` |
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-length` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `noEcho` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:no-echo` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnParameterProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-pattern)]
      (. builder allowedPattern data))
    (when-let [data (lookup-entry config id :allowed-values)]
      (. builder allowedValues data))
    (when-let [data (lookup-entry config id :constraint-description)]
      (. builder constraintDescription data))
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :max-length)]
      (. builder maxLength data))
    (when-let [data (lookup-entry config id :max-value)]
      (. builder maxValue data))
    (when-let [data (lookup-entry config id :min-length)]
      (. builder minLength data))
    (when-let [data (lookup-entry config id :min-value)]
      (. builder minValue data))
    (when-let [data (lookup-entry config id :no-echo)]
      (. builder noEcho data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-public-type-version-builder
  "The cfn-public-type-version-builder function buildes out new instances of 
CfnPublicTypeVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `logDeliveryBucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-bucket` |
| `publicVersionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-version-number` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnPublicTypeVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :log-delivery-bucket)]
      (. builder logDeliveryBucket data))
    (when-let [data (lookup-entry config id :public-version-number)]
      (. builder publicVersionNumber data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-public-type-version-props-builder
  "The cfn-public-type-version-props-builder function buildes out new instances of 
CfnPublicTypeVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `logDeliveryBucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-bucket` |
| `publicVersionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-version-number` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnPublicTypeVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :log-delivery-bucket)]
      (. builder logDeliveryBucket data))
    (when-let [data (lookup-entry config id :public-version-number)]
      (. builder publicVersionNumber data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-publisher-builder
  "The cfn-publisher-builder function buildes out new instances of 
CfnPublisher$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |"
  [stack id config]
  (let [builder (CfnPublisher$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accept-terms-and-conditions)]
      (. builder acceptTermsAndConditions data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (.build builder)))


(defn cfn-publisher-props-builder
  "The cfn-publisher-props-builder function buildes out new instances of 
CfnPublisherProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |"
  [stack id config]
  (let [builder (CfnPublisherProps$Builder.)]
    (when-let [data (lookup-entry config id :accept-terms-and-conditions)]
      (. builder acceptTermsAndConditions data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (.build builder)))


(defn cfn-resource-auto-scaling-creation-policy-builder
  "The cfn-resource-auto-scaling-creation-policy-builder function buildes out new instances of 
CfnResourceAutoScalingCreationPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minSuccessfulInstancesPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-successful-instances-percent` |"
  [stack id config]
  (let [builder (CfnResourceAutoScalingCreationPolicy$Builder.)]
    (when-let [data (lookup-entry config id :min-successful-instances-percent)]
      (. builder minSuccessfulInstancesPercent data))
    (.build builder)))


(defn cfn-resource-builder
  "The cfn-resource-builder function buildes out new instances of 
CfnResource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnResource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-resource-default-version-builder
  "The cfn-resource-default-version-builder function buildes out new instances of 
CfnResourceDefaultVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnResourceDefaultVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-version-arn)]
      (. builder typeVersionArn data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-resource-default-version-props-builder
  "The cfn-resource-default-version-props-builder function buildes out new instances of 
CfnResourceDefaultVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnResourceDefaultVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-version-arn)]
      (. builder typeVersionArn data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-resource-props-builder
  "The cfn-resource-props-builder function buildes out new instances of 
CfnResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnResourceProps$Builder.)]
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-resource-signal-builder
  "The cfn-resource-signal-builder function buildes out new instances of 
CfnResourceSignal$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnResourceSignal$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-resource-version-builder
  "The cfn-resource-version-builder function buildes out new instances of 
CfnResourceVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnResourceVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :schema-handler-package)]
      (. builder schemaHandlerPackage data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-resource-version-logging-config-property-builder
  "The cfn-resource-version-logging-config-property-builder function buildes out new instances of 
CfnResourceVersion$LoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |"
  [stack id config]
  (let [builder (CfnResourceVersion$LoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (.build builder)))


(defn cfn-resource-version-props-builder
  "The cfn-resource-version-props-builder function buildes out new instances of 
CfnResourceVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnResourceVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :schema-handler-package)]
      (. builder schemaHandlerPackage data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-rule-assertion-builder
  "The cfn-rule-assertion-builder function buildes out new instances of 
CfnRuleAssertion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:assert-description` |
| `assertValue` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:assert-value` |"
  [stack id config]
  (let [builder (CfnRuleAssertion$Builder.)]
    (when-let [data (lookup-entry config id :assert-description)]
      (. builder assertDescription data))
    (when-let [data (lookup-entry config id :assert-value)]
      (. builder assertValue data))
    (.build builder)))


(defn cfn-rule-builder
  "The cfn-rule-builder function buildes out new instances of 
CfnRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertions` | java.util.List | [[cdk.support/lookup-entry]] | `:assertions` |
| `ruleCondition` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:rule-condition` |"
  [stack id config]
  (let [builder (CfnRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assertions)]
      (. builder assertions data))
    (when-let [data (lookup-entry config id :rule-condition)]
      (. builder ruleCondition data))
    (.build builder)))


(defn cfn-rule-props-builder
  "The cfn-rule-props-builder function buildes out new instances of 
CfnRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertions` | java.util.List | [[cdk.support/lookup-entry]] | `:assertions` |
| `ruleCondition` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:rule-condition` |"
  [stack id config]
  (let [builder (CfnRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :assertions)]
      (. builder assertions data))
    (when-let [data (lookup-entry config id :rule-condition)]
      (. builder ruleCondition data))
    (.build builder)))


(defn cfn-stack-builder
  "The cfn-stack-builder function buildes out new instances of 
CfnStack$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnStack$Builder/create stack id)]
    (when-let [data (lookup-entry config id :notification-arns)]
      (. builder notificationArns data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-url)]
      (. builder templateUrl data))
    (when-let [data (lookup-entry config id :timeout-in-minutes)]
      (. builder timeoutInMinutes data))
    (.build builder)))


(defn cfn-stack-output-property-builder
  "The cfn-stack-output-property-builder function buildes out new instances of 
CfnStack$OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-name` |
| `outputKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-key` |
| `outputValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-value` |"
  [stack id config]
  (let [builder (CfnStack$OutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :export-name)]
      (. builder exportName data))
    (when-let [data (lookup-entry config id :output-key)]
      (. builder outputKey data))
    (when-let [data (lookup-entry config id :output-value)]
      (. builder outputValue data))
    (.build builder)))


(defn cfn-stack-props-builder
  "The cfn-stack-props-builder function buildes out new instances of 
CfnStackProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnStackProps$Builder.)]
    (when-let [data (lookup-entry config id :notification-arns)]
      (. builder notificationArns data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-url)]
      (. builder templateUrl data))
    (when-let [data (lookup-entry config id :timeout-in-minutes)]
      (. builder timeoutInMinutes data))
    (.build builder)))


(defn cfn-stack-set-auto-deployment-property-builder
  "The cfn-stack-set-auto-deployment-property-builder function buildes out new instances of 
CfnStackSet$AutoDeploymentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `retainStacksOnAccountRemoval` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-stacks-on-account-removal` |"
  [stack id config]
  (let [builder (CfnStackSet$AutoDeploymentProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :retain-stacks-on-account-removal)]
      (. builder retainStacksOnAccountRemoval data))
    (.build builder)))


(defn cfn-stack-set-builder
  "The cfn-stack-set-builder function buildes out new instances of 
CfnStackSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `administrationRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:administration-role-arn` |
| `autoDeployment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-deployment` |
| `callAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:call-as` |
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-name` |
| `managedExecution` | java.lang.Object | [[cdk.support/lookup-entry]] | `:managed-execution` |
| `operationPreferences` | software.amazon.awscdk.CfnStackSet$OperationPreferencesProperty | [[cdk.support/lookup-entry]] | `:operation-preferences` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `permissionModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-model` |
| `stackInstancesGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stack-instances-group` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |"
  [stack id config]
  (let [builder (CfnStackSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :administration-role-arn)]
      (. builder administrationRoleArn data))
    (when-let [data (lookup-entry config id :auto-deployment)]
      (. builder autoDeployment data))
    (when-let [data (lookup-entry config id :call-as)]
      (. builder callAs data))
    (when-let [data (lookup-entry config id :capabilities)]
      (. builder capabilities data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :execution-role-name)]
      (. builder executionRoleName data))
    (when-let [data (lookup-entry config id :managed-execution)]
      (. builder managedExecution data))
    (when-let [data (lookup-entry config id :operation-preferences)]
      (. builder operationPreferences data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :permission-model)]
      (. builder permissionModel data))
    (when-let [data (lookup-entry config id :stack-instances-group)]
      (. builder stackInstancesGroup data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-url)]
      (. builder templateUrl data))
    (.build builder)))


(defn cfn-stack-set-deployment-targets-property-builder
  "The cfn-stack-set-deployment-targets-property-builder function buildes out new instances of 
CfnStackSet$DeploymentTargetsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountFilterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-filter-type` |
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `accountsUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:accounts-url` |
| `organizationalUnitIds` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-ids` |"
  [stack id config]
  (let [builder (CfnStackSet$DeploymentTargetsProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-filter-type)]
      (. builder accountFilterType data))
    (when-let [data (lookup-entry config id :accounts)]
      (. builder accounts data))
    (when-let [data (lookup-entry config id :accounts-url)]
      (. builder accountsUrl data))
    (when-let [data (lookup-entry config id :organizational-unit-ids)]
      (. builder organizationalUnitIds data))
    (.build builder)))


(defn cfn-stack-set-managed-execution-property-builder
  "The cfn-stack-set-managed-execution-property-builder function buildes out new instances of 
CfnStackSet$ManagedExecutionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active` |"
  [stack id config]
  (let [builder (CfnStackSet$ManagedExecutionProperty$Builder.)]
    (when-let [data (lookup-entry config id :active)]
      (. builder active data))
    (.build builder)))


(defn cfn-stack-set-operation-preferences-property-builder
  "The cfn-stack-set-operation-preferences-property-builder function buildes out new instances of 
CfnStackSet$OperationPreferencesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureToleranceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-count` |
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxConcurrentCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-count` |
| `maxConcurrentPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-percentage` |
| `regionConcurrencyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-concurrency-type` |
| `regionOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:region-order` |"
  [stack id config]
  (let [builder (CfnStackSet$OperationPreferencesProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-tolerance-count)]
      (. builder failureToleranceCount data))
    (when-let [data (lookup-entry config id :failure-tolerance-percentage)]
      (. builder failureTolerancePercentage data))
    (when-let [data (lookup-entry config id :max-concurrent-count)]
      (. builder maxConcurrentCount data))
    (when-let [data (lookup-entry config id :max-concurrent-percentage)]
      (. builder maxConcurrentPercentage data))
    (when-let [data (lookup-entry config id :region-concurrency-type)]
      (. builder regionConcurrencyType data))
    (when-let [data (lookup-entry config id :region-order)]
      (. builder regionOrder data))
    (.build builder)))


(defn cfn-stack-set-parameter-property-builder
  "The cfn-stack-set-parameter-property-builder function buildes out new instances of 
CfnStackSet$ParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-key` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnStackSet$ParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-key)]
      (. builder parameterKey data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-stack-set-props-builder
  "The cfn-stack-set-props-builder function buildes out new instances of 
CfnStackSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `administrationRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:administration-role-arn` |
| `autoDeployment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-deployment` |
| `callAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:call-as` |
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-name` |
| `managedExecution` | java.lang.Object | [[cdk.support/lookup-entry]] | `:managed-execution` |
| `operationPreferences` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:operation-preferences` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `permissionModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-model` |
| `stackInstancesGroup` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-instances-group` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |"
  [stack id config]
  (let [builder (CfnStackSetProps$Builder.)]
    (when-let [data (lookup-entry config id :administration-role-arn)]
      (. builder administrationRoleArn data))
    (when-let [data (lookup-entry config id :auto-deployment)]
      (. builder autoDeployment data))
    (when-let [data (lookup-entry config id :call-as)]
      (. builder callAs data))
    (when-let [data (lookup-entry config id :capabilities)]
      (. builder capabilities data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :execution-role-name)]
      (. builder executionRoleName data))
    (when-let [data (lookup-entry config id :managed-execution)]
      (. builder managedExecution data))
    (when-let [data (lookup-entry config id :operation-preferences)]
      (. builder operationPreferences data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :permission-model)]
      (. builder permissionModel data))
    (when-let [data (lookup-entry config id :stack-instances-group)]
      (. builder stackInstancesGroup data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-url)]
      (. builder templateUrl data))
    (.build builder)))


(defn cfn-stack-set-stack-instances-property-builder
  "The cfn-stack-set-stack-instances-property-builder function buildes out new instances of 
CfnStackSet$StackInstancesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-targets` |
| `parameterOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |"
  [stack id config]
  (let [builder (CfnStackSet$StackInstancesProperty$Builder.)]
    (when-let [data (lookup-entry config id :deployment-targets)]
      (. builder deploymentTargets data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :regions)]
      (. builder regions data))
    (.build builder)))


(defn cfn-tag-builder
  "The cfn-tag-builder function buildes out new instances of 
CfnTag$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTag$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-traffic-route-builder
  "The cfn-traffic-route-builder function buildes out new instances of 
CfnTrafficRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTrafficRoute$Builder.)]
    (when-let [data (lookup-entry config id :logical-id)]
      (. builder logicalId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-traffic-routing-builder
  "The cfn-traffic-routing-builder function buildes out new instances of 
CfnTrafficRouting$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prodTrafficRoute` | software.amazon.awscdk.CfnTrafficRoute | [[cdk.support/lookup-entry]] | `:prod-traffic-route` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `testTrafficRoute` | software.amazon.awscdk.CfnTrafficRoute | [[cdk.support/lookup-entry]] | `:test-traffic-route` |"
  [stack id config]
  (let [builder (CfnTrafficRouting$Builder.)]
    (when-let [data (lookup-entry config id :prod-traffic-route)]
      (. builder prodTrafficRoute data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :test-traffic-route)]
      (. builder testTrafficRoute data))
    (.build builder)))


(defn cfn-traffic-routing-config-builder
  "The cfn-traffic-routing-config-builder function buildes out new instances of 
CfnTrafficRoutingConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeBasedCanary` | software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary | [[cdk.support/lookup-entry]] | `:time-based-canary` |
| `timeBasedLinear` | software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear | [[cdk.support/lookup-entry]] | `:time-based-linear` |
| `type` | software.amazon.awscdk.CfnTrafficRoutingType | [[cdk.api/cfn-traffic-routing-type]] | `:type` |"
  [stack id config]
  (let [builder (CfnTrafficRoutingConfig$Builder.)]
    (when-let [data (lookup-entry config id :time-based-canary)]
      (. builder timeBasedCanary data))
    (when-let [data (lookup-entry config id :time-based-linear)]
      (. builder timeBasedLinear data))
    (when-let [data (cfn-traffic-routing-type config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-traffic-routing-time-based-canary-builder
  "The cfn-traffic-routing-time-based-canary-builder function buildes out new instances of 
CfnTrafficRoutingTimeBasedCanary$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bakeTimeMins` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bake-time-mins` |
| `stepPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-percentage` |"
  [stack id config]
  (let [builder (CfnTrafficRoutingTimeBasedCanary$Builder.)]
    (when-let [data (lookup-entry config id :bake-time-mins)]
      (. builder bakeTimeMins data))
    (when-let [data (lookup-entry config id :step-percentage)]
      (. builder stepPercentage data))
    (.build builder)))


(defn cfn-traffic-routing-time-based-linear-builder
  "The cfn-traffic-routing-time-based-linear-builder function buildes out new instances of 
CfnTrafficRoutingTimeBasedLinear$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bakeTimeMins` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bake-time-mins` |
| `stepPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-percentage` |"
  [stack id config]
  (let [builder (CfnTrafficRoutingTimeBasedLinear$Builder.)]
    (when-let [data (lookup-entry config id :bake-time-mins)]
      (. builder bakeTimeMins data))
    (when-let [data (lookup-entry config id :step-percentage)]
      (. builder stepPercentage data))
    (.build builder)))


(defn cfn-type-activation-builder
  "The cfn-type-activation-builder function buildes out new instances of 
CfnTypeActivation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-update` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.CfnTypeActivation$LoggingConfigProperty | [[cdk.support/lookup-entry]] | `:logging-config` |
| `majorVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-version` |
| `publicTypeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-type-arn` |
| `publisherId` | java.lang.String | [[cdk.support/lookup-entry]] | `:publisher-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeNameAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name-alias` |
| `versionBump` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-bump` |"
  [stack id config]
  (let [builder (CfnTypeActivation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-update)]
      (. builder autoUpdate data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :major-version)]
      (. builder majorVersion data))
    (when-let [data (lookup-entry config id :public-type-arn)]
      (. builder publicTypeArn data))
    (when-let [data (lookup-entry config id :publisher-id)]
      (. builder publisherId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-name-alias)]
      (. builder typeNameAlias data))
    (when-let [data (lookup-entry config id :version-bump)]
      (. builder versionBump data))
    (.build builder)))


(defn cfn-type-activation-logging-config-property-builder
  "The cfn-type-activation-logging-config-property-builder function buildes out new instances of 
CfnTypeActivation$LoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |"
  [stack id config]
  (let [builder (CfnTypeActivation$LoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (.build builder)))


(defn cfn-type-activation-props-builder
  "The cfn-type-activation-props-builder function buildes out new instances of 
CfnTypeActivationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-update` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.CfnTypeActivation$LoggingConfigProperty | [[cdk.support/lookup-entry]] | `:logging-config` |
| `majorVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-version` |
| `publicTypeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-type-arn` |
| `publisherId` | java.lang.String | [[cdk.support/lookup-entry]] | `:publisher-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeNameAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name-alias` |
| `versionBump` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-bump` |"
  [stack id config]
  (let [builder (CfnTypeActivationProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-update)]
      (. builder autoUpdate data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :major-version)]
      (. builder majorVersion data))
    (when-let [data (lookup-entry config id :public-type-arn)]
      (. builder publicTypeArn data))
    (when-let [data (lookup-entry config id :publisher-id)]
      (. builder publisherId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-name-alias)]
      (. builder typeNameAlias data))
    (when-let [data (lookup-entry config id :version-bump)]
      (. builder versionBump data))
    (.build builder)))


(defn cfn-update-policy-builder
  "The cfn-update-policy-builder function buildes out new instances of 
CfnUpdatePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingReplacingUpdate` | software.amazon.awscdk.CfnAutoScalingReplacingUpdate | [[cdk.support/lookup-entry]] | `:auto-scaling-replacing-update` |
| `autoScalingRollingUpdate` | software.amazon.awscdk.CfnAutoScalingRollingUpdate | [[cdk.support/lookup-entry]] | `:auto-scaling-rolling-update` |
| `autoScalingScheduledAction` | software.amazon.awscdk.CfnAutoScalingScheduledAction | [[cdk.support/lookup-entry]] | `:auto-scaling-scheduled-action` |
| `codeDeployLambdaAliasUpdate` | software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate | [[cdk.support/lookup-entry]] | `:code-deploy-lambda-alias-update` |
| `enableVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-version-upgrade` |
| `useOnlineResharding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-online-resharding` |"
  [stack id config]
  (let [builder (CfnUpdatePolicy$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-replacing-update)]
      (. builder autoScalingReplacingUpdate data))
    (when-let [data (lookup-entry config id :auto-scaling-rolling-update)]
      (. builder autoScalingRollingUpdate data))
    (when-let [data (lookup-entry config id :auto-scaling-scheduled-action)]
      (. builder autoScalingScheduledAction data))
    (when-let [data (lookup-entry config id :code-deploy-lambda-alias-update)]
      (. builder codeDeployLambdaAliasUpdate data))
    (when-let [data (lookup-entry config id :enable-version-upgrade)]
      (. builder enableVersionUpgrade data))
    (when-let [data (lookup-entry config id :use-online-resharding)]
      (. builder useOnlineResharding data))
    (.build builder)))


(defn cfn-wait-condition-builder
  "The cfn-wait-condition-builder function buildes out new instances of 
CfnWaitCondition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `handle` | java.lang.String | [[cdk.support/lookup-entry]] | `:handle` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnWaitCondition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :handle)]
      (. builder handle data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-wait-condition-handle-builder
  "The cfn-wait-condition-handle-builder function buildes out new instances of 
CfnWaitConditionHandle$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnWaitConditionHandle$Builder/create stack id)]
    (.build builder)))


(defn cfn-wait-condition-handle-props-builder
  "The cfn-wait-condition-handle-props-builder function buildes out new instances of 
CfnWaitConditionHandleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnWaitConditionHandleProps$Builder.)]
    (.build builder)))


(defn cfn-wait-condition-props-builder
  "The cfn-wait-condition-props-builder function buildes out new instances of 
CfnWaitConditionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `handle` | java.lang.String | [[cdk.support/lookup-entry]] | `:handle` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnWaitConditionProps$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :handle)]
      (. builder handle data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cli-credentials-stack-synthesizer-builder
  "The cli-credentials-stack-synthesizer-builder function buildes out new instances of 
CliCredentialsStackSynthesizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `dockerTagPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-tag-prefix` |
| `fileAssetsBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-assets-bucket-name` |
| `imageAssetsRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-assets-repository-name` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |"
  [stack id config]
  (let [builder (CliCredentialsStackSynthesizer$Builder/create)]
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :docker-tag-prefix)]
      (. builder dockerTagPrefix data))
    (when-let [data (lookup-entry config id :file-assets-bucket-name)]
      (. builder fileAssetsBucketName data))
    (when-let [data (lookup-entry config id :image-assets-repository-name)]
      (. builder imageAssetsRepositoryName data))
    (when-let [data (lookup-entry config id :qualifier)]
      (. builder qualifier data))
    (.build builder)))


(defn cli-credentials-stack-synthesizer-props-builder
  "The cli-credentials-stack-synthesizer-props-builder function buildes out new instances of 
CliCredentialsStackSynthesizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `dockerTagPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-tag-prefix` |
| `fileAssetsBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-assets-bucket-name` |
| `imageAssetsRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-assets-repository-name` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |"
  [stack id config]
  (let [builder (CliCredentialsStackSynthesizerProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :docker-tag-prefix)]
      (. builder dockerTagPrefix data))
    (when-let [data (lookup-entry config id :file-assets-bucket-name)]
      (. builder fileAssetsBucketName data))
    (when-let [data (lookup-entry config id :image-assets-repository-name)]
      (. builder imageAssetsRepositoryName data))
    (when-let [data (lookup-entry config id :qualifier)]
      (. builder qualifier data))
    (.build builder)))


(defn copy-options-builder
  "The copy-options-builder function buildes out new instances of 
CopyOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `follow` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |"
  [stack id config]
  (let [builder (CopyOptions$Builder.)]
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (symlink-follow-mode config id :follow)]
      (. builder follow data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (.build builder)))


(defn custom-resource-builder
  "The custom-resource-builder function buildes out new instances of 
CustomResource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pascalCaseProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pascal-case-properties` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |"
  [stack id config]
  (let [builder (CustomResource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :pascal-case-properties)]
      (. builder pascalCaseProperties data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :service-token)]
      (. builder serviceToken data))
    (.build builder)))


(defn custom-resource-props-builder
  "The custom-resource-props-builder function buildes out new instances of 
CustomResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pascalCaseProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pascal-case-properties` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |"
  [stack id config]
  (let [builder (CustomResourceProps$Builder.)]
    (when-let [data (lookup-entry config id :pascal-case-properties)]
      (. builder pascalCaseProperties data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :service-token)]
      (. builder serviceToken data))
    (.build builder)))


(defn custom-resource-provider-base-props-builder
  "The custom-resource-provider-base-props-builder function buildes out new instances of 
CustomResourceProviderBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-directory` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `memorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-size` |
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `runtimeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-name` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useCfnResponseWrapper` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-cfn-response-wrapper` |"
  [stack id config]
  (let [builder (CustomResourceProviderBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :code-directory)]
      (. builder codeDirectory data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :memory-size)]
      (. builder memorySize data))
    (when-let [data (lookup-entry config id :policy-statements)]
      (. builder policyStatements data))
    (when-let [data (lookup-entry config id :runtime-name)]
      (. builder runtimeName data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :use-cfn-response-wrapper)]
      (. builder useCfnResponseWrapper data))
    (.build builder)))


(defn custom-resource-provider-options-builder
  "The custom-resource-provider-options-builder function buildes out new instances of 
CustomResourceProviderOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `memorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-size` |
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useCfnResponseWrapper` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-cfn-response-wrapper` |"
  [stack id config]
  (let [builder (CustomResourceProviderOptions$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :memory-size)]
      (. builder memorySize data))
    (when-let [data (lookup-entry config id :policy-statements)]
      (. builder policyStatements data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :use-cfn-response-wrapper)]
      (. builder useCfnResponseWrapper data))
    (.build builder)))


(defn custom-resource-provider-props-builder
  "The custom-resource-provider-props-builder function buildes out new instances of 
CustomResourceProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-directory` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `memorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-size` |
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `runtime` | software.amazon.awscdk.CustomResourceProviderRuntime | [[cdk.api/custom-resource-provider-runtime]] | `:runtime` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useCfnResponseWrapper` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-cfn-response-wrapper` |"
  [stack id config]
  (let [builder (CustomResourceProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :code-directory)]
      (. builder codeDirectory data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :memory-size)]
      (. builder memorySize data))
    (when-let [data (lookup-entry config id :policy-statements)]
      (. builder policyStatements data))
    (when-let [data (custom-resource-provider-runtime config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :use-cfn-response-wrapper)]
      (. builder useCfnResponseWrapper data))
    (.build builder)))


(defn default-stack-synthesizer-builder
  "The default-stack-synthesizer-builder function buildes out new instances of 
DefaultStackSynthesizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bootstrapStackVersionSsmParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-stack-version-ssm-parameter` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `cloudFormationExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role` |
| `deployRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-arn` |
| `deployRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-external-id` |
| `dockerTagPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-tag-prefix` |
| `fileAssetPublishingExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-asset-publishing-external-id` |
| `fileAssetPublishingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-asset-publishing-role-arn` |
| `fileAssetsBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-assets-bucket-name` |
| `generateBootstrapVersionRule` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-bootstrap-version-rule` |
| `imageAssetPublishingExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-asset-publishing-external-id` |
| `imageAssetPublishingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-asset-publishing-role-arn` |
| `imageAssetsRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-assets-repository-name` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `lookupRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-external-id` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `useLookupRoleForStackOperations` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-lookup-role-for-stack-operations` |"
  [stack id config]
  (let [builder (DefaultStackSynthesizer$Builder/create)]
    (when-let [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
      (. builder bootstrapStackVersionSsmParameter data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :cloud-formation-execution-role)]
      (. builder cloudFormationExecutionRole data))
    (when-let [data (lookup-entry config id :deploy-role-arn)]
      (. builder deployRoleArn data))
    (when-let [data (lookup-entry config id :deploy-role-external-id)]
      (. builder deployRoleExternalId data))
    (when-let [data (lookup-entry config id :docker-tag-prefix)]
      (. builder dockerTagPrefix data))
    (when-let [data (lookup-entry config id :file-asset-publishing-external-id)]
      (. builder fileAssetPublishingExternalId data))
    (when-let [data (lookup-entry config id :file-asset-publishing-role-arn)]
      (. builder fileAssetPublishingRoleArn data))
    (when-let [data (lookup-entry config id :file-assets-bucket-name)]
      (. builder fileAssetsBucketName data))
    (when-let [data (lookup-entry config id :generate-bootstrap-version-rule)]
      (. builder generateBootstrapVersionRule data))
    (when-let [data (lookup-entry config id :image-asset-publishing-external-id)]
      (. builder imageAssetPublishingExternalId data))
    (when-let [data (lookup-entry config id :image-asset-publishing-role-arn)]
      (. builder imageAssetPublishingRoleArn data))
    (when-let [data (lookup-entry config id :image-assets-repository-name)]
      (. builder imageAssetsRepositoryName data))
    (when-let [data (lookup-entry config id :lookup-role-arn)]
      (. builder lookupRoleArn data))
    (when-let [data (lookup-entry config id :lookup-role-external-id)]
      (. builder lookupRoleExternalId data))
    (when-let [data (lookup-entry config id :qualifier)]
      (. builder qualifier data))
    (when-let [data (lookup-entry config id :use-lookup-role-for-stack-operations)]
      (. builder useLookupRoleForStackOperations data))
    (.build builder)))


(defn default-stack-synthesizer-props-builder
  "The default-stack-synthesizer-props-builder function buildes out new instances of 
DefaultStackSynthesizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bootstrapStackVersionSsmParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-stack-version-ssm-parameter` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `cloudFormationExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role` |
| `deployRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-arn` |
| `deployRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-external-id` |
| `dockerTagPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-tag-prefix` |
| `fileAssetPublishingExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-asset-publishing-external-id` |
| `fileAssetPublishingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-asset-publishing-role-arn` |
| `fileAssetsBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-assets-bucket-name` |
| `generateBootstrapVersionRule` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-bootstrap-version-rule` |
| `imageAssetPublishingExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-asset-publishing-external-id` |
| `imageAssetPublishingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-asset-publishing-role-arn` |
| `imageAssetsRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-assets-repository-name` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `lookupRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-external-id` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `useLookupRoleForStackOperations` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-lookup-role-for-stack-operations` |"
  [stack id config]
  (let [builder (DefaultStackSynthesizerProps$Builder.)]
    (when-let [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
      (. builder bootstrapStackVersionSsmParameter data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :cloud-formation-execution-role)]
      (. builder cloudFormationExecutionRole data))
    (when-let [data (lookup-entry config id :deploy-role-arn)]
      (. builder deployRoleArn data))
    (when-let [data (lookup-entry config id :deploy-role-external-id)]
      (. builder deployRoleExternalId data))
    (when-let [data (lookup-entry config id :docker-tag-prefix)]
      (. builder dockerTagPrefix data))
    (when-let [data (lookup-entry config id :file-asset-publishing-external-id)]
      (. builder fileAssetPublishingExternalId data))
    (when-let [data (lookup-entry config id :file-asset-publishing-role-arn)]
      (. builder fileAssetPublishingRoleArn data))
    (when-let [data (lookup-entry config id :file-assets-bucket-name)]
      (. builder fileAssetsBucketName data))
    (when-let [data (lookup-entry config id :generate-bootstrap-version-rule)]
      (. builder generateBootstrapVersionRule data))
    (when-let [data (lookup-entry config id :image-asset-publishing-external-id)]
      (. builder imageAssetPublishingExternalId data))
    (when-let [data (lookup-entry config id :image-asset-publishing-role-arn)]
      (. builder imageAssetPublishingRoleArn data))
    (when-let [data (lookup-entry config id :image-assets-repository-name)]
      (. builder imageAssetsRepositoryName data))
    (when-let [data (lookup-entry config id :lookup-role-arn)]
      (. builder lookupRoleArn data))
    (when-let [data (lookup-entry config id :lookup-role-external-id)]
      (. builder lookupRoleExternalId data))
    (when-let [data (lookup-entry config id :qualifier)]
      (. builder qualifier data))
    (when-let [data (lookup-entry config id :use-lookup-role-for-stack-operations)]
      (. builder useLookupRoleForStackOperations data))
    (.build builder)))


(defn docker-build-options-builder
  "The docker-build-options-builder function buildes out new instances of 
DockerBuildOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `targetStage` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-stage` |"
  [stack id config]
  (let [builder (DockerBuildOptions$Builder.)]
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
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :target-stage)]
      (. builder targetStage data))
    (.build builder)))


(defn docker-cache-option-builder
  "The docker-cache-option-builder function buildes out new instances of 
DockerCacheOption$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `params` | java.util.Map | [[cdk.support/lookup-entry]] | `:params` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (DockerCacheOption$Builder.)]
    (when-let [data (lookup-entry config id :params)]
      (. builder params data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn docker-image-asset-location-builder
  "The docker-image-asset-location-builder function buildes out new instances of 
DockerImageAssetLocation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (DockerImageAssetLocation$Builder.)]
    (when-let [data (lookup-entry config id :image-tag)]
      (. builder imageTag data))
    (when-let [data (lookup-entry config id :image-uri)]
      (. builder imageUri data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn docker-image-asset-source-builder
  "The docker-image-asset-source-builder function buildes out new instances of 
DockerImageAssetSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `dockerBuildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-build-args` |
| `dockerBuildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-build-secrets` |
| `dockerBuildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-build-ssh` |
| `dockerBuildTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-build-target` |
| `dockerCacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:docker-cache-disabled` |
| `dockerCacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-cache-from` |
| `dockerCacheTo` | software.amazon.awscdk.DockerCacheOption | [[cdk.support/lookup-entry]] | `:docker-cache-to` |
| `dockerFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-file` |
| `dockerOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-outputs` |
| `executable` | java.util.List | [[cdk.support/lookup-entry]] | `:executable` |
| `networkMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-mode` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `sourceHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-hash` |"
  [stack id config]
  (let [builder (DockerImageAssetSource$Builder.)]
    (when-let [data (lookup-entry config id :asset-name)]
      (. builder assetName data))
    (when-let [data (lookup-entry config id :directory-name)]
      (. builder directoryName data))
    (when-let [data (lookup-entry config id :docker-build-args)]
      (. builder dockerBuildArgs data))
    (when-let [data (lookup-entry config id :docker-build-secrets)]
      (. builder dockerBuildSecrets data))
    (when-let [data (lookup-entry config id :docker-build-ssh)]
      (. builder dockerBuildSsh data))
    (when-let [data (lookup-entry config id :docker-build-target)]
      (. builder dockerBuildTarget data))
    (when-let [data (lookup-entry config id :docker-cache-disabled)]
      (. builder dockerCacheDisabled data))
    (when-let [data (lookup-entry config id :docker-cache-from)]
      (. builder dockerCacheFrom data))
    (when-let [data (lookup-entry config id :docker-cache-to)]
      (. builder dockerCacheTo data))
    (when-let [data (lookup-entry config id :docker-file)]
      (. builder dockerFile data))
    (when-let [data (lookup-entry config id :docker-outputs)]
      (. builder dockerOutputs data))
    (when-let [data (lookup-entry config id :executable)]
      (. builder executable data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :source-hash)]
      (. builder sourceHash data))
    (.build builder)))


(defn docker-run-options-builder
  "The docker-run-options-builder function buildes out new instances of 
DockerRunOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `network` | java.lang.String | [[cdk.support/lookup-entry]] | `:network` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `securityOpt` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-opt` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
| `volumesFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes-from` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (DockerRunOptions$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :entrypoint)]
      (. builder entrypoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :network)]
      (. builder network data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :security-opt)]
      (. builder securityOpt data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (when-let [data (lookup-entry config id :volumes-from)]
      (. builder volumesFrom data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn docker-volume-builder
  "The docker-volume-builder function buildes out new instances of 
DockerVolume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consistency` | software.amazon.awscdk.DockerVolumeConsistency | [[cdk.api/docker-volume-consistency]] | `:consistency` |
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |"
  [stack id config]
  (let [builder (DockerVolume$Builder.)]
    (when-let [data (docker-volume-consistency config id :consistency)]
      (. builder consistency data))
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (.build builder)))


(defn encoding-options-builder
  "The encoding-options-builder function buildes out new instances of 
EncodingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |"
  [stack id config]
  (let [builder (EncodingOptions$Builder.)]
    (when-let [data (lookup-entry config id :display-hint)]
      (. builder displayHint data))
    (.build builder)))


(defn environment-builder
  "The environment-builder function buildes out new instances of 
Environment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (Environment$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn export-value-options-builder
  "The export-value-options-builder function buildes out new instances of 
ExportValueOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (ExportValueOptions$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn file-asset-location-builder
  "The file-asset-location-builder function buildes out new instances of 
FileAssetLocation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `httpUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-url` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
| `s3ObjectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-url` |
| `s3ObjectUrlWithPlaceholders` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-url-with-placeholders` |"
  [stack id config]
  (let [builder (FileAssetLocation$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :http-url)]
      (. builder httpUrl data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :object-key)]
      (. builder objectKey data))
    (when-let [data (lookup-entry config id :s3-object-url)]
      (. builder s3ObjectUrl data))
    (when-let [data (lookup-entry config id :s3-object-url-with-placeholders)]
      (. builder s3ObjectUrlWithPlaceholders data))
    (.build builder)))


(defn file-asset-source-builder
  "The file-asset-source-builder function buildes out new instances of 
FileAssetSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `executable` | java.util.List | [[cdk.support/lookup-entry]] | `:executable` |
| `fileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-name` |
| `packaging` | software.amazon.awscdk.FileAssetPackaging | [[cdk.api/file-asset-packaging]] | `:packaging` |
| `sourceHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-hash` |"
  [stack id config]
  (let [builder (FileAssetSource$Builder.)]
    (when-let [data (lookup-entry config id :deploy-time)]
      (. builder deployTime data))
    (when-let [data (lookup-entry config id :executable)]
      (. builder executable data))
    (when-let [data (lookup-entry config id :file-name)]
      (. builder fileName data))
    (when-let [data (file-asset-packaging config id :packaging)]
      (. builder packaging data))
    (when-let [data (lookup-entry config id :source-hash)]
      (. builder sourceHash data))
    (.build builder)))


(defn file-copy-options-builder
  "The file-copy-options-builder function buildes out new instances of 
FileCopyOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |"
  [stack id config]
  (let [builder (FileCopyOptions$Builder.)]
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (.build builder)))


(defn file-fingerprint-options-builder
  "The file-fingerprint-options-builder function buildes out new instances of 
FileFingerprintOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |"
  [stack id config]
  (let [builder (FileFingerprintOptions$Builder.)]
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (.build builder)))


(defn fingerprint-options-builder
  "The fingerprint-options-builder function buildes out new instances of 
FingerprintOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `follow` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |"
  [stack id config]
  (let [builder (FingerprintOptions$Builder.)]
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (symlink-follow-mode config id :follow)]
      (. builder follow data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (.build builder)))


(defn get-context-key-options-builder
  "The get-context-key-options-builder function buildes out new instances of 
GetContextKeyOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-environment` |
| `props` | java.util.Map | [[cdk.support/lookup-entry]] | `:props` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |"
  [stack id config]
  (let [builder (GetContextKeyOptions$Builder.)]
    (when-let [data (lookup-entry config id :include-environment)]
      (. builder includeEnvironment data))
    (when-let [data (lookup-entry config id :props)]
      (. builder props data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (.build builder)))


(defn get-context-key-result-builder
  "The get-context-key-result-builder function buildes out new instances of 
GetContextKeyResult$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `props` | java.util.Map | [[cdk.support/lookup-entry]] | `:props` |"
  [stack id config]
  (let [builder (GetContextKeyResult$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :props)]
      (. builder props data))
    (.build builder)))


(defn get-context-value-options-builder
  "The get-context-value-options-builder function buildes out new instances of 
GetContextValueOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dummyValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:dummy-value` |
| `includeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-environment` |
| `props` | java.util.Map | [[cdk.support/lookup-entry]] | `:props` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |"
  [stack id config]
  (let [builder (GetContextValueOptions$Builder.)]
    (when-let [data (lookup-entry config id :dummy-value)]
      (. builder dummyValue data))
    (when-let [data (lookup-entry config id :include-environment)]
      (. builder includeEnvironment data))
    (when-let [data (lookup-entry config id :props)]
      (. builder props data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (.build builder)))


(defn get-context-value-result-builder
  "The get-context-value-result-builder function buildes out new instances of 
GetContextValueResult$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (GetContextValueResult$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn intrinsic-props-builder
  "The intrinsic-props-builder function buildes out new instances of 
IntrinsicProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackTrace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-trace` |
| `typeHint` | software.amazon.awscdk.ResolutionTypeHint | [[cdk.api/resolution-type-hint]] | `:type-hint` |"
  [stack id config]
  (let [builder (IntrinsicProps$Builder.)]
    (when-let [data (lookup-entry config id :stack-trace)]
      (. builder stackTrace data))
    (when-let [data (resolution-type-hint config id :type-hint)]
      (. builder typeHint data))
    (.build builder)))


(defn lazy-any-value-options-builder
  "The lazy-any-value-options-builder function buildes out new instances of 
LazyAnyValueOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
| `omitEmptyArray` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:omit-empty-array` |"
  [stack id config]
  (let [builder (LazyAnyValueOptions$Builder.)]
    (when-let [data (lookup-entry config id :display-hint)]
      (. builder displayHint data))
    (when-let [data (lookup-entry config id :omit-empty-array)]
      (. builder omitEmptyArray data))
    (.build builder)))


(defn lazy-list-value-options-builder
  "The lazy-list-value-options-builder function buildes out new instances of 
LazyListValueOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
| `omitEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:omit-empty` |"
  [stack id config]
  (let [builder (LazyListValueOptions$Builder.)]
    (when-let [data (lookup-entry config id :display-hint)]
      (. builder displayHint data))
    (when-let [data (lookup-entry config id :omit-empty)]
      (. builder omitEmpty data))
    (.build builder)))


(defn lazy-string-value-options-builder
  "The lazy-string-value-options-builder function buildes out new instances of 
LazyStringValueOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |"
  [stack id config]
  (let [builder (LazyStringValueOptions$Builder.)]
    (when-let [data (lookup-entry config id :display-hint)]
      (. builder displayHint data))
    (.build builder)))


(defn nested-stack-builder
  "The nested-stack-builder function buildes out new instances of 
NestedStack$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (NestedStack$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :notification-arns)]
      (. builder notificationArns data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn nested-stack-props-builder
  "The nested-stack-props-builder function buildes out new instances of 
NestedStackProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (NestedStackProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :notification-arns)]
      (. builder notificationArns data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn permissions-boundary-bind-options-builder
  "The permissions-boundary-bind-options-builder function buildes out new instances of 
PermissionsBoundaryBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (PermissionsBoundaryBindOptions$Builder.)]
    (.build builder)))


(defn policy-validation-plugin-report-beta1-builder
  "The policy-validation-plugin-report-beta1-builder function buildes out new instances of 
PolicyValidationPluginReportBeta1$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `pluginVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:plugin-version` |
| `success` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:success` |
| `violations` | java.util.List | [[cdk.support/lookup-entry]] | `:violations` |"
  [stack id config]
  (let [builder (PolicyValidationPluginReportBeta1$Builder.)]
    (when-let [data (lookup-entry config id :metadata)]
      (. builder metadata data))
    (when-let [data (lookup-entry config id :plugin-version)]
      (. builder pluginVersion data))
    (when-let [data (lookup-entry config id :success)]
      (. builder success data))
    (when-let [data (lookup-entry config id :violations)]
      (. builder violations data))
    (.build builder)))


(defn policy-violating-resource-beta1-builder
  "The policy-violating-resource-beta1-builder function buildes out new instances of 
PolicyViolatingResourceBeta1$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `resourceLogicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-logical-id` |
| `templatePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-path` |"
  [stack id config]
  (let [builder (PolicyViolatingResourceBeta1$Builder.)]
    (when-let [data (lookup-entry config id :locations)]
      (. builder locations data))
    (when-let [data (lookup-entry config id :resource-logical-id)]
      (. builder resourceLogicalId data))
    (when-let [data (lookup-entry config id :template-path)]
      (. builder templatePath data))
    (.build builder)))


(defn policy-violation-beta1-builder
  "The policy-violation-beta1-builder function buildes out new instances of 
PolicyViolationBeta1$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fix` | java.lang.String | [[cdk.support/lookup-entry]] | `:fix` |
| `ruleMetadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:rule-metadata` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `severity` | java.lang.String | [[cdk.support/lookup-entry]] | `:severity` |
| `violatingResources` | java.util.List | [[cdk.support/lookup-entry]] | `:violating-resources` |"
  [stack id config]
  (let [builder (PolicyViolationBeta1$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fix)]
      (. builder fix data))
    (when-let [data (lookup-entry config id :rule-metadata)]
      (. builder ruleMetadata data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :severity)]
      (. builder severity data))
    (when-let [data (lookup-entry config id :violating-resources)]
      (. builder violatingResources data))
    (.build builder)))


(defn removal-policy-options-builder
  "The removal-policy-options-builder function buildes out new instances of 
RemovalPolicyOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToUpdateReplacePolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-update-replace-policy` |
| `defaultValue` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:default-value` |"
  [stack id config]
  (let [builder (RemovalPolicyOptions$Builder.)]
    (when-let [data (lookup-entry config id :apply-to-update-replace-policy)]
      (. builder applyToUpdateReplacePolicy data))
    (when-let [data (removal-policy config id :default-value)]
      (. builder defaultValue data))
    (.build builder)))


(defn remove-tag-builder
  "The remove-tag-builder function buildes out new instances of 
RemoveTag$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToLaunchedInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-launched-instances` |
| `excludeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-resource-types` |
| `includeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:include-resource-types` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config ^java.lang.String tag-key]
  (let [builder (RemoveTag$Builder/create ^java.lang.String tag-key)]
    (when-let [data (lookup-entry config id :apply-to-launched-instances)]
      (. builder applyToLaunchedInstances data))
    (when-let [data (lookup-entry config id :exclude-resource-types)]
      (. builder excludeResourceTypes data))
    (when-let [data (lookup-entry config id :include-resource-types)]
      (. builder includeResourceTypes data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn resolve-change-context-options-builder
  "The resolve-change-context-options-builder function buildes out new instances of 
ResolveChangeContextOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowIntrinsicKeys` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-intrinsic-keys` |
| `removeEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-empty` |"
  [stack id config]
  (let [builder (ResolveChangeContextOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-intrinsic-keys)]
      (. builder allowIntrinsicKeys data))
    (when-let [data (lookup-entry config id :remove-empty)]
      (. builder removeEmpty data))
    (.build builder)))


(defn resolve-options-builder
  "The resolve-options-builder function buildes out new instances of 
ResolveOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preparing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preparing` |
| `removeEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-empty` |
| `resolver` | software.amazon.awscdk.ITokenResolver | [[cdk.support/lookup-entry]] | `:resolver` |
| `scope` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:scope` |"
  [stack id config]
  (let [builder (ResolveOptions$Builder.)]
    (when-let [data (lookup-entry config id :preparing)]
      (. builder preparing data))
    (when-let [data (lookup-entry config id :remove-empty)]
      (. builder removeEmpty data))
    (when-let [data (lookup-entry config id :resolver)]
      (. builder resolver data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (.build builder)))


(defn resource-environment-builder
  "The resource-environment-builder function buildes out new instances of 
ResourceEnvironment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (ResourceEnvironment$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn resource-props-builder
  "The resource-props-builder function buildes out new instances of 
ResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `environmentFromArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-from-arn` |
| `physicalName` | java.lang.String | [[cdk.support/lookup-entry]] | `:physical-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (ResourceProps$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :environment-from-arn)]
      (. builder environmentFromArn data))
    (when-let [data (lookup-entry config id :physical-name)]
      (. builder physicalName data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn reverse-options-builder
  "The reverse-options-builder function buildes out new instances of 
ReverseOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failConcat` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-concat` |"
  [stack id config]
  (let [builder (ReverseOptions$Builder.)]
    (when-let [data (lookup-entry config id :fail-concat)]
      (. builder failConcat data))
    (.build builder)))


(defn role-options-builder
  "The role-options-builder function buildes out new instances of 
RoleOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |"
  [stack id config]
  (let [builder (RoleOptions$Builder.)]
    (when-let [data (lookup-entry config id :assume-role-arn)]
      (. builder assumeRoleArn data))
    (when-let [data (lookup-entry config id :assume-role-external-id)]
      (. builder assumeRoleExternalId data))
    (.build builder)))


(defn secret-value-builder
  "The secret-value-builder function buildes out new instances of 
SecretValue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackTrace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-trace` |
| `typeHint` | software.amazon.awscdk.ResolutionTypeHint | [[cdk.api/resolution-type-hint]] | `:type-hint` |"
  [stack id config ^java.lang.Object protected-value]
  (let [builder (SecretValue$Builder/create ^java.lang.Object protected-value)]
    (when-let [data (lookup-entry config id :stack-trace)]
      (. builder stackTrace data))
    (when-let [data (resolution-type-hint config id :type-hint)]
      (. builder typeHint data))
    (.build builder)))


(defn secrets-manager-secret-options-builder
  "The secrets-manager-secret-options-builder function buildes out new instances of 
SecretsManagerSecretOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonField` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-field` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
| `versionStage` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-stage` |"
  [stack id config]
  (let [builder (SecretsManagerSecretOptions$Builder.)]
    (when-let [data (lookup-entry config id :json-field)]
      (. builder jsonField data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (when-let [data (lookup-entry config id :version-stage)]
      (. builder versionStage data))
    (.build builder)))


(defn size-conversion-options-builder
  "The size-conversion-options-builder function buildes out new instances of 
SizeConversionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rounding` | software.amazon.awscdk.SizeRoundingBehavior | [[cdk.api/size-rounding-behavior]] | `:rounding` |"
  [stack id config]
  (let [builder (SizeConversionOptions$Builder.)]
    (when-let [data (size-rounding-behavior config id :rounding)]
      (. builder rounding data))
    (.build builder)))


(defn stack-props-builder
  "The stack-props-builder function buildes out new instances of 
StackProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analyticsReporting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:analytics-reporting` |
| `crossRegionReferences` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-region-references` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `env` | software.amazon.awscdk.Environment | [[cdk.support/lookup-entry]] | `:env` |
| `permissionsBoundary` | software.amazon.awscdk.PermissionsBoundary | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `suppressTemplateIndentation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-template-indentation` |
| `synthesizer` | software.amazon.awscdk.IStackSynthesizer | [[cdk.support/lookup-entry]] | `:synthesizer` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `terminationProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protection` |"
  [stack id config]
  (let [builder (StackProps$Builder.)]
    (when-let [data (lookup-entry config id :analytics-reporting)]
      (. builder analyticsReporting data))
    (when-let [data (lookup-entry config id :cross-region-references)]
      (. builder crossRegionReferences data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :suppress-template-indentation)]
      (. builder suppressTemplateIndentation data))
    (when-let [data (lookup-entry config id :synthesizer)]
      (. builder synthesizer data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :termination-protection)]
      (. builder terminationProtection data))
    (.build builder)))


(defn stage-builder
  "The stage-builder function buildes out new instances of 
Stage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | software.amazon.awscdk.Environment | [[cdk.support/lookup-entry]] | `:env` |
| `outdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:outdir` |
| `permissionsBoundary` | software.amazon.awscdk.PermissionsBoundary | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policyValidationBeta1` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-validation-beta1` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (Stage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :outdir)]
      (. builder outdir data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :policy-validation-beta1)]
      (. builder policyValidationBeta1 data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn stage-props-builder
  "The stage-props-builder function buildes out new instances of 
StageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | software.amazon.awscdk.Environment | [[cdk.support/lookup-entry]] | `:env` |
| `outdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:outdir` |
| `permissionsBoundary` | software.amazon.awscdk.PermissionsBoundary | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policyValidationBeta1` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-validation-beta1` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (StageProps$Builder.)]
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :outdir)]
      (. builder outdir data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :policy-validation-beta1)]
      (. builder policyValidationBeta1 data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn stage-synthesis-options-builder
  "The stage-synthesis-options-builder function buildes out new instances of 
StageSynthesisOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `force` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force` |
| `skipValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-validation` |
| `validateOnSynthesis` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-on-synthesis` |"
  [stack id config]
  (let [builder (StageSynthesisOptions$Builder.)]
    (when-let [data (lookup-entry config id :force)]
      (. builder force data))
    (when-let [data (lookup-entry config id :skip-validation)]
      (. builder skipValidation data))
    (when-let [data (lookup-entry config id :validate-on-synthesis)]
      (. builder validateOnSynthesis data))
    (.build builder)))


(defn synthesize-stack-artifact-options-builder
  "The synthesize-stack-artifact-options-builder function buildes out new instances of 
SynthesizeStackArtifactOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalDependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-dependencies` |
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |
| `bootstrapStackVersionSsmParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-stack-version-ssm-parameter` |
| `cloudFormationExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role-arn` |
| `lookupRole` | software.amazon.awscdk.cloudassembly.schema.BootstrapRole | [[cdk.support/lookup-entry]] | `:lookup-role` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `requiresBootstrapStackVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:requires-bootstrap-stack-version` |
| `stackTemplateAssetObjectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-template-asset-object-url` |"
  [stack id config]
  (let [builder (SynthesizeStackArtifactOptions$Builder.)]
    (when-let [data (lookup-entry config id :additional-dependencies)]
      (. builder additionalDependencies data))
    (when-let [data (lookup-entry config id :assume-role-arn)]
      (. builder assumeRoleArn data))
    (when-let [data (lookup-entry config id :assume-role-external-id)]
      (. builder assumeRoleExternalId data))
    (when-let [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
      (. builder bootstrapStackVersionSsmParameter data))
    (when-let [data (lookup-entry config id :cloud-formation-execution-role-arn)]
      (. builder cloudFormationExecutionRoleArn data))
    (when-let [data (lookup-entry config id :lookup-role)]
      (. builder lookupRole data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :requires-bootstrap-stack-version)]
      (. builder requiresBootstrapStackVersion data))
    (when-let [data (lookup-entry config id :stack-template-asset-object-url)]
      (. builder stackTemplateAssetObjectUrl data))
    (.build builder)))


(defn tag-builder
  "The tag-builder function buildes out new instances of 
Tag$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToLaunchedInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-launched-instances` |
| `excludeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-resource-types` |
| `includeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:include-resource-types` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config ^java.lang.String tag-key ^java.lang.String tag-value]
  (let [builder (Tag$Builder/create ^java.lang.String tag-key ^java.lang.String tag-value)]
    (when-let [data (lookup-entry config id :apply-to-launched-instances)]
      (. builder applyToLaunchedInstances data))
    (when-let [data (lookup-entry config id :exclude-resource-types)]
      (. builder excludeResourceTypes data))
    (when-let [data (lookup-entry config id :include-resource-types)]
      (. builder includeResourceTypes data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn tag-manager-options-builder
  "The tag-manager-options-builder function buildes out new instances of 
TagManagerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagPropertyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-property-name` |"
  [stack id config]
  (let [builder (TagManagerOptions$Builder.)]
    (when-let [data (lookup-entry config id :tag-property-name)]
      (. builder tagPropertyName data))
    (.build builder)))


(defn tag-props-builder
  "The tag-props-builder function buildes out new instances of 
TagProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToLaunchedInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-launched-instances` |
| `excludeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-resource-types` |
| `includeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:include-resource-types` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (TagProps$Builder.)]
    (when-let [data (lookup-entry config id :apply-to-launched-instances)]
      (. builder applyToLaunchedInstances data))
    (when-let [data (lookup-entry config id :exclude-resource-types)]
      (. builder excludeResourceTypes data))
    (when-let [data (lookup-entry config id :include-resource-types)]
      (. builder includeResourceTypes data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn time-conversion-options-builder
  "The time-conversion-options-builder function buildes out new instances of 
TimeConversionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `integral` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:integral` |"
  [stack id config]
  (let [builder (TimeConversionOptions$Builder.)]
    (when-let [data (lookup-entry config id :integral)]
      (. builder integral data))
    (.build builder)))


(defn unique-resource-name-options-builder
  "The unique-resource-name-options-builder function buildes out new instances of 
UniqueResourceNameOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedSpecialCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-special-characters` |
| `maxLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length` |
| `separator` | java.lang.String | [[cdk.support/lookup-entry]] | `:separator` |"
  [stack id config]
  (let [builder (UniqueResourceNameOptions$Builder.)]
    (when-let [data (lookup-entry config id :allowed-special-characters)]
      (. builder allowedSpecialCharacters data))
    (when-let [data (lookup-entry config id :max-length)]
      (. builder maxLength data))
    (when-let [data (lookup-entry config id :separator)]
      (. builder separator data))
    (.build builder)))