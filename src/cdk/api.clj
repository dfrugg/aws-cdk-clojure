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


(defn build-app-builder
  "The build-app-builder function updates a App$Builder instance using the provided configuration.
  The function takes the App$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `treeMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tree-metadata` |
"
  [^App$Builder builder id config]
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
  (.build builder))


(defn app-builder
  ""
  [id config]
  (build-app-builder (App$Builder/create) id config))


(defn build-app-props-builder
  "The build-app-props-builder function updates a AppProps$Builder instance using the provided configuration.
  The function takes the AppProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `treeMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tree-metadata` |
"
  [^AppProps$Builder builder id config]
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
  (.build builder))


(defn app-props-builder
  ""
  [id config]
  (build-app-props-builder (new AppProps$Builder) id config))


(defn build-arn-components-builder
  "The build-arn-components-builder function updates a ArnComponents$Builder instance using the provided configuration.
  The function takes the ArnComponents$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `arnFormat` | software.amazon.awscdk.ArnFormat | [[cdk.api/arn-format]] | `:arn-format` |
| `partition` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
"
  [^ArnComponents$Builder builder id config]
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
  (.build builder))


(defn arn-components-builder
  ""
  [id config]
  (build-arn-components-builder (new ArnComponents$Builder) id config))


(defn build-asset-manifest-docker-image-destination-builder
  "The build-asset-manifest-docker-image-destination-builder function updates a AssetManifestDockerImageDestination$Builder instance using the provided configuration.
  The function takes the AssetManifestDockerImageDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dockerTagPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-tag-prefix` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `role` | software.amazon.awscdk.RoleOptions | [[cdk.support/lookup-entry]] | `:role` |
"
  [^AssetManifestDockerImageDestination$Builder builder id config]
  (when-let [data (lookup-entry config id :docker-tag-prefix)]
    (. builder dockerTagPrefix data))
  (when-let [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn asset-manifest-docker-image-destination-builder
  ""
  [id config]
  (build-asset-manifest-docker-image-destination-builder (new AssetManifestDockerImageDestination$Builder) id config))


(defn build-asset-manifest-file-destination-builder
  "The build-asset-manifest-file-destination-builder function updates a AssetManifestFileDestination$Builder instance using the provided configuration.
  The function takes the AssetManifestFileDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `role` | software.amazon.awscdk.RoleOptions | [[cdk.support/lookup-entry]] | `:role` |
"
  [^AssetManifestFileDestination$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn asset-manifest-file-destination-builder
  ""
  [id config]
  (build-asset-manifest-file-destination-builder (new AssetManifestFileDestination$Builder) id config))


(defn build-asset-options-builder
  "The build-asset-options-builder function updates a AssetOptions$Builder instance using the provided configuration.
  The function takes the AssetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
"
  [^AssetOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-let [data (asset-hash-type config id :asset-hash-type)]
    (. builder assetHashType data))
  (when-let [data (lookup-entry config id :bundling)]
    (. builder bundling data))
  (.build builder))


(defn asset-options-builder
  ""
  [id config]
  (build-asset-options-builder (new AssetOptions$Builder) id config))


(defn build-asset-staging-builder
  "The build-asset-staging-builder function updates a AssetStaging$Builder instance using the provided configuration.
  The function takes the AssetStaging$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `follow` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^AssetStaging$Builder builder id config]
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
  (.build builder))


(defn asset-staging-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-asset-staging-builder (AssetStaging$Builder/create scope (name id)) id config))


(defn build-asset-staging-props-builder
  "The build-asset-staging-props-builder function updates a AssetStagingProps$Builder instance using the provided configuration.
  The function takes the AssetStagingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `follow` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^AssetStagingProps$Builder builder id config]
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
  (.build builder))


(defn asset-staging-props-builder
  ""
  [id config]
  (build-asset-staging-props-builder (new AssetStagingProps$Builder) id config))


(defn build-bootstrapless-synthesizer-builder
  "The build-bootstrapless-synthesizer-builder function updates a BootstraplessSynthesizer$Builder instance using the provided configuration.
  The function takes the BootstraplessSynthesizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role-arn` |
| `deployRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-arn` |
"
  [^BootstraplessSynthesizer$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-formation-execution-role-arn)]
    (. builder cloudFormationExecutionRoleArn data))
  (when-let [data (lookup-entry config id :deploy-role-arn)]
    (. builder deployRoleArn data))
  (.build builder))


(defn bootstrapless-synthesizer-builder
  ""
  [id config]
  (build-bootstrapless-synthesizer-builder (BootstraplessSynthesizer$Builder/create) id config))


(defn build-bootstrapless-synthesizer-props-builder
  "The build-bootstrapless-synthesizer-props-builder function updates a BootstraplessSynthesizerProps$Builder instance using the provided configuration.
  The function takes the BootstraplessSynthesizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role-arn` |
| `deployRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-arn` |
"
  [^BootstraplessSynthesizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-formation-execution-role-arn)]
    (. builder cloudFormationExecutionRoleArn data))
  (when-let [data (lookup-entry config id :deploy-role-arn)]
    (. builder deployRoleArn data))
  (.build builder))


(defn bootstrapless-synthesizer-props-builder
  ""
  [id config]
  (build-bootstrapless-synthesizer-props-builder (new BootstraplessSynthesizerProps$Builder) id config))


(defn build-bundling-options-builder
  "The build-bundling-options-builder function updates a BundlingOptions$Builder instance using the provided configuration.
  The function takes the BundlingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^BundlingOptions$Builder builder id config]
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
  (.build builder))


(defn bundling-options-builder
  ""
  [id config]
  (build-bundling-options-builder (new BundlingOptions$Builder) id config))


(defn build-cfn-auto-scaling-replacing-update-builder
  "The build-cfn-auto-scaling-replacing-update-builder function updates a CfnAutoScalingReplacingUpdate$Builder instance using the provided configuration.
  The function takes the CfnAutoScalingReplacingUpdate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `willReplace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:will-replace` |
"
  [^CfnAutoScalingReplacingUpdate$Builder builder id config]
  (when-let [data (lookup-entry config id :will-replace)]
    (. builder willReplace data))
  (.build builder))


(defn cfn-auto-scaling-replacing-update-builder
  ""
  [id config]
  (build-cfn-auto-scaling-replacing-update-builder (new CfnAutoScalingReplacingUpdate$Builder) id config))


(defn build-cfn-auto-scaling-rolling-update-builder
  "The build-cfn-auto-scaling-rolling-update-builder function updates a CfnAutoScalingRollingUpdate$Builder instance using the provided configuration.
  The function takes the CfnAutoScalingRollingUpdate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `minInstancesInService` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-instances-in-service` |
| `minSuccessfulInstancesPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-successful-instances-percent` |
| `pauseTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:pause-time` |
| `suspendProcesses` | java.util.List | [[cdk.support/lookup-entry]] | `:suspend-processes` |
| `waitOnResourceSignals` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait-on-resource-signals` |
"
  [^CfnAutoScalingRollingUpdate$Builder builder id config]
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
  (.build builder))


(defn cfn-auto-scaling-rolling-update-builder
  ""
  [id config]
  (build-cfn-auto-scaling-rolling-update-builder (new CfnAutoScalingRollingUpdate$Builder) id config))


(defn build-cfn-auto-scaling-scheduled-action-builder
  "The build-cfn-auto-scaling-scheduled-action-builder function updates a CfnAutoScalingScheduledAction$Builder instance using the provided configuration.
  The function takes the CfnAutoScalingScheduledAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ignoreUnmodifiedGroupSizeProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-unmodified-group-size-properties` |
"
  [^CfnAutoScalingScheduledAction$Builder builder id config]
  (when-let [data (lookup-entry config id :ignore-unmodified-group-size-properties)]
    (. builder ignoreUnmodifiedGroupSizeProperties data))
  (.build builder))


(defn cfn-auto-scaling-scheduled-action-builder
  ""
  [id config]
  (build-cfn-auto-scaling-scheduled-action-builder (new CfnAutoScalingScheduledAction$Builder) id config))


(defn build-cfn-code-deploy-blue-green-additional-options-builder
  "The build-cfn-code-deploy-blue-green-additional-options-builder function updates a CfnCodeDeployBlueGreenAdditionalOptions$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenAdditionalOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `terminationWaitTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-wait-time-in-minutes` |
"
  [^CfnCodeDeployBlueGreenAdditionalOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :termination-wait-time-in-minutes)]
    (. builder terminationWaitTimeInMinutes data))
  (.build builder))


(defn cfn-code-deploy-blue-green-additional-options-builder
  ""
  [id config]
  (build-cfn-code-deploy-blue-green-additional-options-builder (new CfnCodeDeployBlueGreenAdditionalOptions$Builder) id config))


(defn build-cfn-code-deploy-blue-green-application-builder
  "The build-cfn-code-deploy-blue-green-application-builder function updates a CfnCodeDeployBlueGreenApplication$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecsAttributes` | software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes | [[cdk.support/lookup-entry]] | `:ecs-attributes` |
| `target` | software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnCodeDeployBlueGreenApplication$Builder builder id config]
  (when-let [data (lookup-entry config id :ecs-attributes)]
    (. builder ecsAttributes data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-code-deploy-blue-green-application-builder
  ""
  [id config]
  (build-cfn-code-deploy-blue-green-application-builder (new CfnCodeDeployBlueGreenApplication$Builder) id config))


(defn build-cfn-code-deploy-blue-green-application-target-builder
  "The build-cfn-code-deploy-blue-green-application-target-builder function updates a CfnCodeDeployBlueGreenApplicationTarget$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenApplicationTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCodeDeployBlueGreenApplicationTarget$Builder builder id config]
  (when-let [data (lookup-entry config id :logical-id)]
    (. builder logicalId data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-code-deploy-blue-green-application-target-builder
  ""
  [id config]
  (build-cfn-code-deploy-blue-green-application-target-builder (new CfnCodeDeployBlueGreenApplicationTarget$Builder) id config))


(defn build-cfn-code-deploy-blue-green-ecs-attributes-builder
  "The build-cfn-code-deploy-blue-green-ecs-attributes-builder function updates a CfnCodeDeployBlueGreenEcsAttributes$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenEcsAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `taskDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:task-definitions` |
| `taskSets` | java.util.List | [[cdk.support/lookup-entry]] | `:task-sets` |
| `trafficRouting` | software.amazon.awscdk.CfnTrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |
"
  [^CfnCodeDeployBlueGreenEcsAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :task-definitions)]
    (. builder taskDefinitions data))
  (when-let [data (lookup-entry config id :task-sets)]
    (. builder taskSets data))
  (when-let [data (lookup-entry config id :traffic-routing)]
    (. builder trafficRouting data))
  (.build builder))


(defn cfn-code-deploy-blue-green-ecs-attributes-builder
  ""
  [id config]
  (build-cfn-code-deploy-blue-green-ecs-attributes-builder (new CfnCodeDeployBlueGreenEcsAttributes$Builder) id config))


(defn build-cfn-code-deploy-blue-green-hook-builder
  "The build-cfn-code-deploy-blue-green-hook-builder function updates a CfnCodeDeployBlueGreenHook$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenHook$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalOptions` | software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions | [[cdk.support/lookup-entry]] | `:additional-options` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `lifecycleEventHooks` | software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks | [[cdk.support/lookup-entry]] | `:lifecycle-event-hooks` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `trafficRoutingConfig` | software.amazon.awscdk.CfnTrafficRoutingConfig | [[cdk.support/lookup-entry]] | `:traffic-routing-config` |
"
  [^CfnCodeDeployBlueGreenHook$Builder builder id config]
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
  (.build builder))


(defn cfn-code-deploy-blue-green-hook-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-code-deploy-blue-green-hook-builder (CfnCodeDeployBlueGreenHook$Builder/create scope (name id)) id config))


(defn build-cfn-code-deploy-blue-green-hook-props-builder
  "The build-cfn-code-deploy-blue-green-hook-props-builder function updates a CfnCodeDeployBlueGreenHookProps$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenHookProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalOptions` | software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions | [[cdk.support/lookup-entry]] | `:additional-options` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `lifecycleEventHooks` | software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks | [[cdk.support/lookup-entry]] | `:lifecycle-event-hooks` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `trafficRoutingConfig` | software.amazon.awscdk.CfnTrafficRoutingConfig | [[cdk.support/lookup-entry]] | `:traffic-routing-config` |
"
  [^CfnCodeDeployBlueGreenHookProps$Builder builder id config]
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
  (.build builder))


(defn cfn-code-deploy-blue-green-hook-props-builder
  ""
  [id config]
  (build-cfn-code-deploy-blue-green-hook-props-builder (new CfnCodeDeployBlueGreenHookProps$Builder) id config))


(defn build-cfn-code-deploy-blue-green-lifecycle-event-hooks-builder
  "The build-cfn-code-deploy-blue-green-lifecycle-event-hooks-builder function updates a CfnCodeDeployBlueGreenLifecycleEventHooks$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenLifecycleEventHooks$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterAllowTestTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-allow-test-traffic` |
| `afterAllowTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-allow-traffic` |
| `afterInstall` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-install` |
| `beforeAllowTraffic` | java.lang.String | [[cdk.support/lookup-entry]] | `:before-allow-traffic` |
| `beforeInstall` | java.lang.String | [[cdk.support/lookup-entry]] | `:before-install` |
"
  [^CfnCodeDeployBlueGreenLifecycleEventHooks$Builder builder id config]
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
  (.build builder))


(defn cfn-code-deploy-blue-green-lifecycle-event-hooks-builder
  ""
  [id config]
  (build-cfn-code-deploy-blue-green-lifecycle-event-hooks-builder (new CfnCodeDeployBlueGreenLifecycleEventHooks$Builder) id config))


(defn build-cfn-code-deploy-lambda-alias-update-builder
  "The build-cfn-code-deploy-lambda-alias-update-builder function updates a CfnCodeDeployLambdaAliasUpdate$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployLambdaAliasUpdate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterAllowTrafficHook` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-allow-traffic-hook` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `beforeAllowTrafficHook` | java.lang.String | [[cdk.support/lookup-entry]] | `:before-allow-traffic-hook` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
"
  [^CfnCodeDeployLambdaAliasUpdate$Builder builder id config]
  (when-let [data (lookup-entry config id :after-allow-traffic-hook)]
    (. builder afterAllowTrafficHook data))
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :before-allow-traffic-hook)]
    (. builder beforeAllowTrafficHook data))
  (when-let [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (.build builder))


(defn cfn-code-deploy-lambda-alias-update-builder
  ""
  [id config]
  (build-cfn-code-deploy-lambda-alias-update-builder (new CfnCodeDeployLambdaAliasUpdate$Builder) id config))


(defn build-cfn-condition-builder
  "The build-cfn-condition-builder function updates a CfnCondition$Builder instance using the provided configuration.
  The function takes the CfnCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:expression` |
"
  [^CfnCondition$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (.build builder))


(defn cfn-condition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-condition-builder (CfnCondition$Builder/create scope (name id)) id config))


(defn build-cfn-condition-props-builder
  "The build-cfn-condition-props-builder function updates a CfnConditionProps$Builder instance using the provided configuration.
  The function takes the CfnConditionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:expression` |
"
  [^CfnConditionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (.build builder))


(defn cfn-condition-props-builder
  ""
  [id config]
  (build-cfn-condition-props-builder (new CfnConditionProps$Builder) id config))


(defn build-cfn-creation-policy-builder
  "The build-cfn-creation-policy-builder function updates a CfnCreationPolicy$Builder instance using the provided configuration.
  The function takes the CfnCreationPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingCreationPolicy` | software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy | [[cdk.support/lookup-entry]] | `:auto-scaling-creation-policy` |
| `resourceSignal` | software.amazon.awscdk.CfnResourceSignal | [[cdk.support/lookup-entry]] | `:resource-signal` |
| `startFleet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:start-fleet` |
"
  [^CfnCreationPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling-creation-policy)]
    (. builder autoScalingCreationPolicy data))
  (when-let [data (lookup-entry config id :resource-signal)]
    (. builder resourceSignal data))
  (when-let [data (lookup-entry config id :start-fleet)]
    (. builder startFleet data))
  (.build builder))


(defn cfn-creation-policy-builder
  ""
  [id config]
  (build-cfn-creation-policy-builder (new CfnCreationPolicy$Builder) id config))


(defn build-cfn-custom-resource-builder
  "The build-cfn-custom-resource-builder function updates a CfnCustomResource$Builder instance using the provided configuration.
  The function takes the CfnCustomResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CfnCustomResource$Builder builder id config]
  (when-let [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn cfn-custom-resource-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-custom-resource-builder (CfnCustomResource$Builder/create scope (name id)) id config))


(defn build-cfn-custom-resource-props-builder
  "The build-cfn-custom-resource-props-builder function updates a CfnCustomResourceProps$Builder instance using the provided configuration.
  The function takes the CfnCustomResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CfnCustomResourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn cfn-custom-resource-props-builder
  ""
  [id config]
  (build-cfn-custom-resource-props-builder (new CfnCustomResourceProps$Builder) id config))


(defn build-cfn-dynamic-reference-props-builder
  "The build-cfn-dynamic-reference-props-builder function updates a CfnDynamicReferenceProps$Builder instance using the provided configuration.
  The function takes the CfnDynamicReferenceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-key` |
| `service` | software.amazon.awscdk.CfnDynamicReferenceService | [[cdk.api/cfn-dynamic-reference-service]] | `:service` |
"
  [^CfnDynamicReferenceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :reference-key)]
    (. builder referenceKey data))
  (when-let [data (cfn-dynamic-reference-service config id :service)]
    (. builder service data))
  (.build builder))


(defn cfn-dynamic-reference-props-builder
  ""
  [id config]
  (build-cfn-dynamic-reference-props-builder (new CfnDynamicReferenceProps$Builder) id config))


(defn build-cfn-hook-builder
  "The build-cfn-hook-builder function updates a CfnHook$Builder instance using the provided configuration.
  The function takes the CfnHook$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnHook$Builder builder id config]
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-hook-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-hook-builder (CfnHook$Builder/create scope (name id)) id config))


(defn build-cfn-hook-default-version-builder
  "The build-cfn-hook-default-version-builder function updates a CfnHookDefaultVersion$Builder instance using the provided configuration.
  The function takes the CfnHookDefaultVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnHookDefaultVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-let [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-hook-default-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-hook-default-version-builder (CfnHookDefaultVersion$Builder/create scope (name id)) id config))


(defn build-cfn-hook-default-version-props-builder
  "The build-cfn-hook-default-version-props-builder function updates a CfnHookDefaultVersionProps$Builder instance using the provided configuration.
  The function takes the CfnHookDefaultVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnHookDefaultVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-let [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-hook-default-version-props-builder
  ""
  [id config]
  (build-cfn-hook-default-version-props-builder (new CfnHookDefaultVersionProps$Builder) id config))


(defn build-cfn-hook-props-builder
  "The build-cfn-hook-props-builder function updates a CfnHookProps$Builder instance using the provided configuration.
  The function takes the CfnHookProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnHookProps$Builder builder id config]
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-hook-props-builder
  ""
  [id config]
  (build-cfn-hook-props-builder (new CfnHookProps$Builder) id config))


(defn build-cfn-hook-type-config-builder
  "The build-cfn-hook-type-config-builder function updates a CfnHookTypeConfig$Builder instance using the provided configuration.
  The function takes the CfnHookTypeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `configurationAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-alias` |
| `typeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-arn` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnHookTypeConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :configuration-alias)]
    (. builder configurationAlias data))
  (when-let [data (lookup-entry config id :type-arn)]
    (. builder typeArn data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-type-config-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-hook-type-config-builder (CfnHookTypeConfig$Builder/create scope (name id)) id config))


(defn build-cfn-hook-type-config-props-builder
  "The build-cfn-hook-type-config-props-builder function updates a CfnHookTypeConfigProps$Builder instance using the provided configuration.
  The function takes the CfnHookTypeConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `configurationAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-alias` |
| `typeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-arn` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnHookTypeConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :configuration-alias)]
    (. builder configurationAlias data))
  (when-let [data (lookup-entry config id :type-arn)]
    (. builder typeArn data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-type-config-props-builder
  ""
  [id config]
  (build-cfn-hook-type-config-props-builder (new CfnHookTypeConfigProps$Builder) id config))


(defn build-cfn-hook-version-builder
  "The build-cfn-hook-version-builder function updates a CfnHookVersion$Builder instance using the provided configuration.
  The function takes the CfnHookVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnHookVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-hook-version-builder (CfnHookVersion$Builder/create scope (name id)) id config))


(defn build-cfn-hook-version-logging-config-property-builder
  "The build-cfn-hook-version-logging-config-property-builder function updates a CfnHookVersion$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnHookVersion$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnHookVersion$LoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-let [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-hook-version-logging-config-property-builder
  ""
  [id config]
  (build-cfn-hook-version-logging-config-property-builder (new CfnHookVersion$LoggingConfigProperty$Builder) id config))


(defn build-cfn-hook-version-props-builder
  "The build-cfn-hook-version-props-builder function updates a CfnHookVersionProps$Builder instance using the provided configuration.
  The function takes the CfnHookVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnHookVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-version-props-builder
  ""
  [id config]
  (build-cfn-hook-version-props-builder (new CfnHookVersionProps$Builder) id config))


(defn build-cfn-json-builder
  "The build-cfn-json-builder function updates a CfnJson$Builder instance using the provided configuration.
  The function takes the CfnJson$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnJson$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-json-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-json-builder (CfnJson$Builder/create scope (name id)) id config))


(defn build-cfn-json-props-builder
  "The build-cfn-json-props-builder function updates a CfnJsonProps$Builder instance using the provided configuration.
  The function takes the CfnJsonProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnJsonProps$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-json-props-builder
  ""
  [id config]
  (build-cfn-json-props-builder (new CfnJsonProps$Builder) id config))


(defn build-cfn-macro-builder
  "The build-cfn-macro-builder function updates a CfnMacro$Builder instance using the provided configuration.
  The function takes the CfnMacro$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnMacro$Builder builder id config]
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
  (.build builder))


(defn cfn-macro-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-macro-builder (CfnMacro$Builder/create scope (name id)) id config))


(defn build-cfn-macro-props-builder
  "The build-cfn-macro-props-builder function updates a CfnMacroProps$Builder instance using the provided configuration.
  The function takes the CfnMacroProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnMacroProps$Builder builder id config]
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
  (.build builder))


(defn cfn-macro-props-builder
  ""
  [id config]
  (build-cfn-macro-props-builder (new CfnMacroProps$Builder) id config))


(defn build-cfn-mapping-builder
  "The build-cfn-mapping-builder function updates a CfnMapping$Builder instance using the provided configuration.
  The function takes the CfnMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lazy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lazy` |
| `mapping` | java.util.Map | [[cdk.support/lookup-entry]] | `:mapping` |
"
  [^CfnMapping$Builder builder id config]
  (when-let [data (lookup-entry config id :lazy)]
    (. builder lazy data))
  (when-let [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (.build builder))


(defn cfn-mapping-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-mapping-builder (CfnMapping$Builder/create scope (name id)) id config))


(defn build-cfn-mapping-props-builder
  "The build-cfn-mapping-props-builder function updates a CfnMappingProps$Builder instance using the provided configuration.
  The function takes the CfnMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lazy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lazy` |
| `mapping` | java.util.Map | [[cdk.support/lookup-entry]] | `:mapping` |
"
  [^CfnMappingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :lazy)]
    (. builder lazy data))
  (when-let [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (.build builder))


(defn cfn-mapping-props-builder
  ""
  [id config]
  (build-cfn-mapping-props-builder (new CfnMappingProps$Builder) id config))


(defn build-cfn-module-default-version-builder
  "The build-cfn-module-default-version-builder function updates a CfnModuleDefaultVersion$Builder instance using the provided configuration.
  The function takes the CfnModuleDefaultVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnModuleDefaultVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-module-default-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-module-default-version-builder (CfnModuleDefaultVersion$Builder/create scope (name id)) id config))


(defn build-cfn-module-default-version-props-builder
  "The build-cfn-module-default-version-props-builder function updates a CfnModuleDefaultVersionProps$Builder instance using the provided configuration.
  The function takes the CfnModuleDefaultVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnModuleDefaultVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-module-default-version-props-builder
  ""
  [id config]
  (build-cfn-module-default-version-props-builder (new CfnModuleDefaultVersionProps$Builder) id config))


(defn build-cfn-module-version-builder
  "The build-cfn-module-version-builder function updates a CfnModuleVersion$Builder instance using the provided configuration.
  The function takes the CfnModuleVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |
"
  [^CfnModuleVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-let [data (lookup-entry config id :module-package)]
    (. builder modulePackage data))
  (.build builder))


(defn cfn-module-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-module-version-builder (CfnModuleVersion$Builder/create scope (name id)) id config))


(defn build-cfn-module-version-props-builder
  "The build-cfn-module-version-props-builder function updates a CfnModuleVersionProps$Builder instance using the provided configuration.
  The function takes the CfnModuleVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |
"
  [^CfnModuleVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-let [data (lookup-entry config id :module-package)]
    (. builder modulePackage data))
  (.build builder))


(defn cfn-module-version-props-builder
  ""
  [id config]
  (build-cfn-module-version-props-builder (new CfnModuleVersionProps$Builder) id config))


(defn build-cfn-output-builder
  "The build-cfn-output-builder function updates a CfnOutput$Builder instance using the provided configuration.
  The function takes the CfnOutput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.CfnCondition | [[cdk.support/lookup-entry]] | `:condition` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-name` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnOutput$Builder builder id config]
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
  (.build builder))


(defn cfn-output-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-output-builder (CfnOutput$Builder/create scope (name id)) id config))


(defn build-cfn-output-props-builder
  "The build-cfn-output-props-builder function updates a CfnOutputProps$Builder instance using the provided configuration.
  The function takes the CfnOutputProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.CfnCondition | [[cdk.support/lookup-entry]] | `:condition` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-name` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnOutputProps$Builder builder id config]
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
  (.build builder))


(defn cfn-output-props-builder
  ""
  [id config]
  (build-cfn-output-props-builder (new CfnOutputProps$Builder) id config))


(defn build-cfn-parameter-builder
  "The build-cfn-parameter-builder function updates a CfnParameter$Builder instance using the provided configuration.
  The function takes the CfnParameter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnParameter$Builder builder id config]
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
  (.build builder))


(defn cfn-parameter-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-parameter-builder (CfnParameter$Builder/create scope (name id)) id config))


(defn build-cfn-parameter-props-builder
  "The build-cfn-parameter-props-builder function updates a CfnParameterProps$Builder instance using the provided configuration.
  The function takes the CfnParameterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnParameterProps$Builder builder id config]
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
  (.build builder))


(defn cfn-parameter-props-builder
  ""
  [id config]
  (build-cfn-parameter-props-builder (new CfnParameterProps$Builder) id config))


(defn build-cfn-public-type-version-builder
  "The build-cfn-public-type-version-builder function updates a CfnPublicTypeVersion$Builder instance using the provided configuration.
  The function takes the CfnPublicTypeVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `logDeliveryBucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-bucket` |
| `publicVersionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-version-number` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnPublicTypeVersion$Builder builder id config]
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
  (.build builder))


(defn cfn-public-type-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-public-type-version-builder (CfnPublicTypeVersion$Builder/create scope (name id)) id config))


(defn build-cfn-public-type-version-props-builder
  "The build-cfn-public-type-version-props-builder function updates a CfnPublicTypeVersionProps$Builder instance using the provided configuration.
  The function takes the CfnPublicTypeVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `logDeliveryBucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-bucket` |
| `publicVersionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-version-number` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnPublicTypeVersionProps$Builder builder id config]
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
  (.build builder))


(defn cfn-public-type-version-props-builder
  ""
  [id config]
  (build-cfn-public-type-version-props-builder (new CfnPublicTypeVersionProps$Builder) id config))


(defn build-cfn-publisher-builder
  "The build-cfn-publisher-builder function updates a CfnPublisher$Builder instance using the provided configuration.
  The function takes the CfnPublisher$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnPublisher$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-terms-and-conditions)]
    (. builder acceptTermsAndConditions data))
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn cfn-publisher-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-publisher-builder (CfnPublisher$Builder/create scope (name id)) id config))


(defn build-cfn-publisher-props-builder
  "The build-cfn-publisher-props-builder function updates a CfnPublisherProps$Builder instance using the provided configuration.
  The function takes the CfnPublisherProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnPublisherProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-terms-and-conditions)]
    (. builder acceptTermsAndConditions data))
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn cfn-publisher-props-builder
  ""
  [id config]
  (build-cfn-publisher-props-builder (new CfnPublisherProps$Builder) id config))


(defn build-cfn-resource-auto-scaling-creation-policy-builder
  "The build-cfn-resource-auto-scaling-creation-policy-builder function updates a CfnResourceAutoScalingCreationPolicy$Builder instance using the provided configuration.
  The function takes the CfnResourceAutoScalingCreationPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minSuccessfulInstancesPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-successful-instances-percent` |
"
  [^CfnResourceAutoScalingCreationPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :min-successful-instances-percent)]
    (. builder minSuccessfulInstancesPercent data))
  (.build builder))


(defn cfn-resource-auto-scaling-creation-policy-builder
  ""
  [id config]
  (build-cfn-resource-auto-scaling-creation-policy-builder (new CfnResourceAutoScalingCreationPolicy$Builder) id config))


(defn build-cfn-resource-builder
  "The build-cfn-resource-builder function updates a CfnResource$Builder instance using the provided configuration.
  The function takes the CfnResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnResource$Builder builder id config]
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-resource-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-builder (CfnResource$Builder/create scope (name id)) id config))


(defn build-cfn-resource-default-version-builder
  "The build-cfn-resource-default-version-builder function updates a CfnResourceDefaultVersion$Builder instance using the provided configuration.
  The function takes the CfnResourceDefaultVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnResourceDefaultVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-let [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-resource-default-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-default-version-builder (CfnResourceDefaultVersion$Builder/create scope (name id)) id config))


(defn build-cfn-resource-default-version-props-builder
  "The build-cfn-resource-default-version-props-builder function updates a CfnResourceDefaultVersionProps$Builder instance using the provided configuration.
  The function takes the CfnResourceDefaultVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnResourceDefaultVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-let [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-resource-default-version-props-builder
  ""
  [id config]
  (build-cfn-resource-default-version-props-builder (new CfnResourceDefaultVersionProps$Builder) id config))


(defn build-cfn-resource-props-builder
  "The build-cfn-resource-props-builder function updates a CfnResourceProps$Builder instance using the provided configuration.
  The function takes the CfnResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnResourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-resource-props-builder
  ""
  [id config]
  (build-cfn-resource-props-builder (new CfnResourceProps$Builder) id config))


(defn build-cfn-resource-signal-builder
  "The build-cfn-resource-signal-builder function updates a CfnResourceSignal$Builder instance using the provided configuration.
  The function takes the CfnResourceSignal$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnResourceSignal$Builder builder id config]
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-resource-signal-builder
  ""
  [id config]
  (build-cfn-resource-signal-builder (new CfnResourceSignal$Builder) id config))


(defn build-cfn-resource-version-builder
  "The build-cfn-resource-version-builder function updates a CfnResourceVersion$Builder instance using the provided configuration.
  The function takes the CfnResourceVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnResourceVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-resource-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-version-builder (CfnResourceVersion$Builder/create scope (name id)) id config))


(defn build-cfn-resource-version-logging-config-property-builder
  "The build-cfn-resource-version-logging-config-property-builder function updates a CfnResourceVersion$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceVersion$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnResourceVersion$LoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-let [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-resource-version-logging-config-property-builder
  ""
  [id config]
  (build-cfn-resource-version-logging-config-property-builder (new CfnResourceVersion$LoggingConfigProperty$Builder) id config))


(defn build-cfn-resource-version-props-builder
  "The build-cfn-resource-version-props-builder function updates a CfnResourceVersionProps$Builder instance using the provided configuration.
  The function takes the CfnResourceVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnResourceVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-resource-version-props-builder
  ""
  [id config]
  (build-cfn-resource-version-props-builder (new CfnResourceVersionProps$Builder) id config))


(defn build-cfn-rule-assertion-builder
  "The build-cfn-rule-assertion-builder function updates a CfnRuleAssertion$Builder instance using the provided configuration.
  The function takes the CfnRuleAssertion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:assert-description` |
| `assertValue` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:assert-value` |
"
  [^CfnRuleAssertion$Builder builder id config]
  (when-let [data (lookup-entry config id :assert-description)]
    (. builder assertDescription data))
  (when-let [data (lookup-entry config id :assert-value)]
    (. builder assertValue data))
  (.build builder))


(defn cfn-rule-assertion-builder
  ""
  [id config]
  (build-cfn-rule-assertion-builder (new CfnRuleAssertion$Builder) id config))


(defn build-cfn-rule-builder
  "The build-cfn-rule-builder function updates a CfnRule$Builder instance using the provided configuration.
  The function takes the CfnRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertions` | java.util.List | [[cdk.support/lookup-entry]] | `:assertions` |
| `ruleCondition` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:rule-condition` |
"
  [^CfnRule$Builder builder id config]
  (when-let [data (lookup-entry config id :assertions)]
    (. builder assertions data))
  (when-let [data (lookup-entry config id :rule-condition)]
    (. builder ruleCondition data))
  (.build builder))


(defn cfn-rule-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-rule-builder (CfnRule$Builder/create scope (name id)) id config))


(defn build-cfn-rule-props-builder
  "The build-cfn-rule-props-builder function updates a CfnRuleProps$Builder instance using the provided configuration.
  The function takes the CfnRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertions` | java.util.List | [[cdk.support/lookup-entry]] | `:assertions` |
| `ruleCondition` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:rule-condition` |
"
  [^CfnRuleProps$Builder builder id config]
  (when-let [data (lookup-entry config id :assertions)]
    (. builder assertions data))
  (when-let [data (lookup-entry config id :rule-condition)]
    (. builder ruleCondition data))
  (.build builder))


(defn cfn-rule-props-builder
  ""
  [id config]
  (build-cfn-rule-props-builder (new CfnRuleProps$Builder) id config))


(defn build-cfn-stack-builder
  "The build-cfn-stack-builder function updates a CfnStack$Builder instance using the provided configuration.
  The function takes the CfnStack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
"
  [^CfnStack$Builder builder id config]
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
  (.build builder))


(defn cfn-stack-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-stack-builder (CfnStack$Builder/create scope (name id)) id config))


(defn build-cfn-stack-output-property-builder
  "The build-cfn-stack-output-property-builder function updates a CfnStack$OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-name` |
| `outputKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-key` |
| `outputValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-value` |
"
  [^CfnStack$OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :export-name)]
    (. builder exportName data))
  (when-let [data (lookup-entry config id :output-key)]
    (. builder outputKey data))
  (when-let [data (lookup-entry config id :output-value)]
    (. builder outputValue data))
  (.build builder))


(defn cfn-stack-output-property-builder
  ""
  [id config]
  (build-cfn-stack-output-property-builder (new CfnStack$OutputProperty$Builder) id config))


(defn build-cfn-stack-props-builder
  "The build-cfn-stack-props-builder function updates a CfnStackProps$Builder instance using the provided configuration.
  The function takes the CfnStackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
"
  [^CfnStackProps$Builder builder id config]
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
  (.build builder))


(defn cfn-stack-props-builder
  ""
  [id config]
  (build-cfn-stack-props-builder (new CfnStackProps$Builder) id config))


(defn build-cfn-stack-set-auto-deployment-property-builder
  "The build-cfn-stack-set-auto-deployment-property-builder function updates a CfnStackSet$AutoDeploymentProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$AutoDeploymentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `retainStacksOnAccountRemoval` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-stacks-on-account-removal` |
"
  [^CfnStackSet$AutoDeploymentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :retain-stacks-on-account-removal)]
    (. builder retainStacksOnAccountRemoval data))
  (.build builder))


(defn cfn-stack-set-auto-deployment-property-builder
  ""
  [id config]
  (build-cfn-stack-set-auto-deployment-property-builder (new CfnStackSet$AutoDeploymentProperty$Builder) id config))


(defn build-cfn-stack-set-builder
  "The build-cfn-stack-set-builder function updates a CfnStackSet$Builder instance using the provided configuration.
  The function takes the CfnStackSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
"
  [^CfnStackSet$Builder builder id config]
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
  (.build builder))


(defn cfn-stack-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-stack-set-builder (CfnStackSet$Builder/create scope (name id)) id config))


(defn build-cfn-stack-set-deployment-targets-property-builder
  "The build-cfn-stack-set-deployment-targets-property-builder function updates a CfnStackSet$DeploymentTargetsProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$DeploymentTargetsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountFilterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-filter-type` |
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `accountsUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:accounts-url` |
| `organizationalUnitIds` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-ids` |
"
  [^CfnStackSet$DeploymentTargetsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :account-filter-type)]
    (. builder accountFilterType data))
  (when-let [data (lookup-entry config id :accounts)]
    (. builder accounts data))
  (when-let [data (lookup-entry config id :accounts-url)]
    (. builder accountsUrl data))
  (when-let [data (lookup-entry config id :organizational-unit-ids)]
    (. builder organizationalUnitIds data))
  (.build builder))


(defn cfn-stack-set-deployment-targets-property-builder
  ""
  [id config]
  (build-cfn-stack-set-deployment-targets-property-builder (new CfnStackSet$DeploymentTargetsProperty$Builder) id config))


(defn build-cfn-stack-set-managed-execution-property-builder
  "The build-cfn-stack-set-managed-execution-property-builder function updates a CfnStackSet$ManagedExecutionProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$ManagedExecutionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active` |
"
  [^CfnStackSet$ManagedExecutionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :active)]
    (. builder active data))
  (.build builder))


(defn cfn-stack-set-managed-execution-property-builder
  ""
  [id config]
  (build-cfn-stack-set-managed-execution-property-builder (new CfnStackSet$ManagedExecutionProperty$Builder) id config))


(defn build-cfn-stack-set-operation-preferences-property-builder
  "The build-cfn-stack-set-operation-preferences-property-builder function updates a CfnStackSet$OperationPreferencesProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$OperationPreferencesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureToleranceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-count` |
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxConcurrentCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-count` |
| `maxConcurrentPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-percentage` |
| `regionConcurrencyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-concurrency-type` |
| `regionOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:region-order` |
"
  [^CfnStackSet$OperationPreferencesProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-stack-set-operation-preferences-property-builder
  ""
  [id config]
  (build-cfn-stack-set-operation-preferences-property-builder (new CfnStackSet$OperationPreferencesProperty$Builder) id config))


(defn build-cfn-stack-set-parameter-property-builder
  "The build-cfn-stack-set-parameter-property-builder function updates a CfnStackSet$ParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$ParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-key` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnStackSet$ParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-key)]
    (. builder parameterKey data))
  (when-let [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-stack-set-parameter-property-builder
  ""
  [id config]
  (build-cfn-stack-set-parameter-property-builder (new CfnStackSet$ParameterProperty$Builder) id config))


(defn build-cfn-stack-set-props-builder
  "The build-cfn-stack-set-props-builder function updates a CfnStackSetProps$Builder instance using the provided configuration.
  The function takes the CfnStackSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
"
  [^CfnStackSetProps$Builder builder id config]
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
  (.build builder))


(defn cfn-stack-set-props-builder
  ""
  [id config]
  (build-cfn-stack-set-props-builder (new CfnStackSetProps$Builder) id config))


(defn build-cfn-stack-set-stack-instances-property-builder
  "The build-cfn-stack-set-stack-instances-property-builder function updates a CfnStackSet$StackInstancesProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$StackInstancesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-targets` |
| `parameterOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
"
  [^CfnStackSet$StackInstancesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-targets)]
    (. builder deploymentTargets data))
  (when-let [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (.build builder))


(defn cfn-stack-set-stack-instances-property-builder
  ""
  [id config]
  (build-cfn-stack-set-stack-instances-property-builder (new CfnStackSet$StackInstancesProperty$Builder) id config))


(defn build-cfn-tag-builder
  "The build-cfn-tag-builder function updates a CfnTag$Builder instance using the provided configuration.
  The function takes the CfnTag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTag$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-tag-builder
  ""
  [id config]
  (build-cfn-tag-builder (new CfnTag$Builder) id config))


(defn build-cfn-traffic-route-builder
  "The build-cfn-traffic-route-builder function updates a CfnTrafficRoute$Builder instance using the provided configuration.
  The function takes the CfnTrafficRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTrafficRoute$Builder builder id config]
  (when-let [data (lookup-entry config id :logical-id)]
    (. builder logicalId data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-traffic-route-builder
  ""
  [id config]
  (build-cfn-traffic-route-builder (new CfnTrafficRoute$Builder) id config))


(defn build-cfn-traffic-routing-builder
  "The build-cfn-traffic-routing-builder function updates a CfnTrafficRouting$Builder instance using the provided configuration.
  The function takes the CfnTrafficRouting$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prodTrafficRoute` | software.amazon.awscdk.CfnTrafficRoute | [[cdk.support/lookup-entry]] | `:prod-traffic-route` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `testTrafficRoute` | software.amazon.awscdk.CfnTrafficRoute | [[cdk.support/lookup-entry]] | `:test-traffic-route` |
"
  [^CfnTrafficRouting$Builder builder id config]
  (when-let [data (lookup-entry config id :prod-traffic-route)]
    (. builder prodTrafficRoute data))
  (when-let [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-let [data (lookup-entry config id :test-traffic-route)]
    (. builder testTrafficRoute data))
  (.build builder))


(defn cfn-traffic-routing-builder
  ""
  [id config]
  (build-cfn-traffic-routing-builder (new CfnTrafficRouting$Builder) id config))


(defn build-cfn-traffic-routing-config-builder
  "The build-cfn-traffic-routing-config-builder function updates a CfnTrafficRoutingConfig$Builder instance using the provided configuration.
  The function takes the CfnTrafficRoutingConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeBasedCanary` | software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary | [[cdk.support/lookup-entry]] | `:time-based-canary` |
| `timeBasedLinear` | software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear | [[cdk.support/lookup-entry]] | `:time-based-linear` |
| `type` | software.amazon.awscdk.CfnTrafficRoutingType | [[cdk.api/cfn-traffic-routing-type]] | `:type` |
"
  [^CfnTrafficRoutingConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :time-based-canary)]
    (. builder timeBasedCanary data))
  (when-let [data (lookup-entry config id :time-based-linear)]
    (. builder timeBasedLinear data))
  (when-let [data (cfn-traffic-routing-type config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-traffic-routing-config-builder
  ""
  [id config]
  (build-cfn-traffic-routing-config-builder (new CfnTrafficRoutingConfig$Builder) id config))


(defn build-cfn-traffic-routing-time-based-canary-builder
  "The build-cfn-traffic-routing-time-based-canary-builder function updates a CfnTrafficRoutingTimeBasedCanary$Builder instance using the provided configuration.
  The function takes the CfnTrafficRoutingTimeBasedCanary$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bakeTimeMins` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bake-time-mins` |
| `stepPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-percentage` |
"
  [^CfnTrafficRoutingTimeBasedCanary$Builder builder id config]
  (when-let [data (lookup-entry config id :bake-time-mins)]
    (. builder bakeTimeMins data))
  (when-let [data (lookup-entry config id :step-percentage)]
    (. builder stepPercentage data))
  (.build builder))


(defn cfn-traffic-routing-time-based-canary-builder
  ""
  [id config]
  (build-cfn-traffic-routing-time-based-canary-builder (new CfnTrafficRoutingTimeBasedCanary$Builder) id config))


(defn build-cfn-traffic-routing-time-based-linear-builder
  "The build-cfn-traffic-routing-time-based-linear-builder function updates a CfnTrafficRoutingTimeBasedLinear$Builder instance using the provided configuration.
  The function takes the CfnTrafficRoutingTimeBasedLinear$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bakeTimeMins` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bake-time-mins` |
| `stepPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-percentage` |
"
  [^CfnTrafficRoutingTimeBasedLinear$Builder builder id config]
  (when-let [data (lookup-entry config id :bake-time-mins)]
    (. builder bakeTimeMins data))
  (when-let [data (lookup-entry config id :step-percentage)]
    (. builder stepPercentage data))
  (.build builder))


(defn cfn-traffic-routing-time-based-linear-builder
  ""
  [id config]
  (build-cfn-traffic-routing-time-based-linear-builder (new CfnTrafficRoutingTimeBasedLinear$Builder) id config))


(defn build-cfn-type-activation-builder
  "The build-cfn-type-activation-builder function updates a CfnTypeActivation$Builder instance using the provided configuration.
  The function takes the CfnTypeActivation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionBump` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-bump` |
"
  [^CfnTypeActivation$Builder builder id config]
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
  (.build builder))


(defn cfn-type-activation-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-type-activation-builder (CfnTypeActivation$Builder/create scope (name id)) id config))


(defn build-cfn-type-activation-logging-config-property-builder
  "The build-cfn-type-activation-logging-config-property-builder function updates a CfnTypeActivation$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTypeActivation$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnTypeActivation$LoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-let [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-type-activation-logging-config-property-builder
  ""
  [id config]
  (build-cfn-type-activation-logging-config-property-builder (new CfnTypeActivation$LoggingConfigProperty$Builder) id config))


(defn build-cfn-type-activation-props-builder
  "The build-cfn-type-activation-props-builder function updates a CfnTypeActivationProps$Builder instance using the provided configuration.
  The function takes the CfnTypeActivationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionBump` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-bump` |
"
  [^CfnTypeActivationProps$Builder builder id config]
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
  (.build builder))


(defn cfn-type-activation-props-builder
  ""
  [id config]
  (build-cfn-type-activation-props-builder (new CfnTypeActivationProps$Builder) id config))


(defn build-cfn-update-policy-builder
  "The build-cfn-update-policy-builder function updates a CfnUpdatePolicy$Builder instance using the provided configuration.
  The function takes the CfnUpdatePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingReplacingUpdate` | software.amazon.awscdk.CfnAutoScalingReplacingUpdate | [[cdk.support/lookup-entry]] | `:auto-scaling-replacing-update` |
| `autoScalingRollingUpdate` | software.amazon.awscdk.CfnAutoScalingRollingUpdate | [[cdk.support/lookup-entry]] | `:auto-scaling-rolling-update` |
| `autoScalingScheduledAction` | software.amazon.awscdk.CfnAutoScalingScheduledAction | [[cdk.support/lookup-entry]] | `:auto-scaling-scheduled-action` |
| `codeDeployLambdaAliasUpdate` | software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate | [[cdk.support/lookup-entry]] | `:code-deploy-lambda-alias-update` |
| `enableVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-version-upgrade` |
| `useOnlineResharding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-online-resharding` |
"
  [^CfnUpdatePolicy$Builder builder id config]
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
  (.build builder))


(defn cfn-update-policy-builder
  ""
  [id config]
  (build-cfn-update-policy-builder (new CfnUpdatePolicy$Builder) id config))


(defn build-cfn-wait-condition-builder
  "The build-cfn-wait-condition-builder function updates a CfnWaitCondition$Builder instance using the provided configuration.
  The function takes the CfnWaitCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `handle` | java.lang.String | [[cdk.support/lookup-entry]] | `:handle` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnWaitCondition$Builder builder id config]
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (when-let [data (lookup-entry config id :handle)]
    (. builder handle data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-wait-condition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-wait-condition-builder (CfnWaitCondition$Builder/create scope (name id)) id config))


(defn build-cfn-wait-condition-handle-builder
  "The build-cfn-wait-condition-handle-builder function updates a CfnWaitConditionHandle$Builder instance using the provided configuration.
  The function takes the CfnWaitConditionHandle$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnWaitConditionHandle$Builder builder id config]
  (.build builder))


(defn cfn-wait-condition-handle-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-wait-condition-handle-builder (CfnWaitConditionHandle$Builder/create scope (name id)) id config))


(defn build-cfn-wait-condition-handle-props-builder
  "The build-cfn-wait-condition-handle-props-builder function updates a CfnWaitConditionHandleProps$Builder instance using the provided configuration.
  The function takes the CfnWaitConditionHandleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnWaitConditionHandleProps$Builder builder id config]
  (.build builder))


(defn cfn-wait-condition-handle-props-builder
  ""
  [id config]
  (build-cfn-wait-condition-handle-props-builder (new CfnWaitConditionHandleProps$Builder) id config))


(defn build-cfn-wait-condition-props-builder
  "The build-cfn-wait-condition-props-builder function updates a CfnWaitConditionProps$Builder instance using the provided configuration.
  The function takes the CfnWaitConditionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `handle` | java.lang.String | [[cdk.support/lookup-entry]] | `:handle` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnWaitConditionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (when-let [data (lookup-entry config id :handle)]
    (. builder handle data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-wait-condition-props-builder
  ""
  [id config]
  (build-cfn-wait-condition-props-builder (new CfnWaitConditionProps$Builder) id config))


(defn build-cli-credentials-stack-synthesizer-builder
  "The build-cli-credentials-stack-synthesizer-builder function updates a CliCredentialsStackSynthesizer$Builder instance using the provided configuration.
  The function takes the CliCredentialsStackSynthesizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `dockerTagPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-tag-prefix` |
| `fileAssetsBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-assets-bucket-name` |
| `imageAssetsRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-assets-repository-name` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
"
  [^CliCredentialsStackSynthesizer$Builder builder id config]
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
  (.build builder))


(defn cli-credentials-stack-synthesizer-builder
  ""
  [id config]
  (build-cli-credentials-stack-synthesizer-builder (CliCredentialsStackSynthesizer$Builder/create) id config))


(defn build-cli-credentials-stack-synthesizer-props-builder
  "The build-cli-credentials-stack-synthesizer-props-builder function updates a CliCredentialsStackSynthesizerProps$Builder instance using the provided configuration.
  The function takes the CliCredentialsStackSynthesizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `dockerTagPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-tag-prefix` |
| `fileAssetsBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-assets-bucket-name` |
| `imageAssetsRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-assets-repository-name` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
"
  [^CliCredentialsStackSynthesizerProps$Builder builder id config]
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
  (.build builder))


(defn cli-credentials-stack-synthesizer-props-builder
  ""
  [id config]
  (build-cli-credentials-stack-synthesizer-props-builder (new CliCredentialsStackSynthesizerProps$Builder) id config))


(defn build-copy-options-builder
  "The build-copy-options-builder function updates a CopyOptions$Builder instance using the provided configuration.
  The function takes the CopyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `follow` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
"
  [^CopyOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (symlink-follow-mode config id :follow)]
    (. builder follow data))
  (when-let [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (.build builder))


(defn copy-options-builder
  ""
  [id config]
  (build-copy-options-builder (new CopyOptions$Builder) id config))


(defn build-custom-resource-builder
  "The build-custom-resource-builder function updates a CustomResource$Builder instance using the provided configuration.
  The function takes the CustomResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pascalCaseProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pascal-case-properties` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CustomResource$Builder builder id config]
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
  (.build builder))


(defn custom-resource-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-custom-resource-builder (CustomResource$Builder/create scope (name id)) id config))


(defn build-custom-resource-props-builder
  "The build-custom-resource-props-builder function updates a CustomResourceProps$Builder instance using the provided configuration.
  The function takes the CustomResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pascalCaseProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pascal-case-properties` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CustomResourceProps$Builder builder id config]
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
  (.build builder))


(defn custom-resource-props-builder
  ""
  [id config]
  (build-custom-resource-props-builder (new CustomResourceProps$Builder) id config))


(defn build-custom-resource-provider-base-props-builder
  "The build-custom-resource-provider-base-props-builder function updates a CustomResourceProviderBaseProps$Builder instance using the provided configuration.
  The function takes the CustomResourceProviderBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-directory` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `memorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-size` |
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `runtimeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-name` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useCfnResponseWrapper` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-cfn-response-wrapper` |
"
  [^CustomResourceProviderBaseProps$Builder builder id config]
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
  (.build builder))


(defn custom-resource-provider-base-props-builder
  ""
  [id config]
  (build-custom-resource-provider-base-props-builder (new CustomResourceProviderBaseProps$Builder) id config))


(defn build-custom-resource-provider-options-builder
  "The build-custom-resource-provider-options-builder function updates a CustomResourceProviderOptions$Builder instance using the provided configuration.
  The function takes the CustomResourceProviderOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `memorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-size` |
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useCfnResponseWrapper` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-cfn-response-wrapper` |
"
  [^CustomResourceProviderOptions$Builder builder id config]
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
  (.build builder))


(defn custom-resource-provider-options-builder
  ""
  [id config]
  (build-custom-resource-provider-options-builder (new CustomResourceProviderOptions$Builder) id config))


(defn build-custom-resource-provider-props-builder
  "The build-custom-resource-provider-props-builder function updates a CustomResourceProviderProps$Builder instance using the provided configuration.
  The function takes the CustomResourceProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-directory` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `memorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-size` |
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `runtime` | software.amazon.awscdk.CustomResourceProviderRuntime | [[cdk.api/custom-resource-provider-runtime]] | `:runtime` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useCfnResponseWrapper` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-cfn-response-wrapper` |
"
  [^CustomResourceProviderProps$Builder builder id config]
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
  (.build builder))


(defn custom-resource-provider-props-builder
  ""
  [id config]
  (build-custom-resource-provider-props-builder (new CustomResourceProviderProps$Builder) id config))


(defn build-default-stack-synthesizer-builder
  "The build-default-stack-synthesizer-builder function updates a DefaultStackSynthesizer$Builder instance using the provided configuration.
  The function takes the DefaultStackSynthesizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `useLookupRoleForStackOperations` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-lookup-role-for-stack-operations` |
"
  [^DefaultStackSynthesizer$Builder builder id config]
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
  (.build builder))


(defn default-stack-synthesizer-builder
  ""
  [id config]
  (build-default-stack-synthesizer-builder (DefaultStackSynthesizer$Builder/create) id config))


(defn build-default-stack-synthesizer-props-builder
  "The build-default-stack-synthesizer-props-builder function updates a DefaultStackSynthesizerProps$Builder instance using the provided configuration.
  The function takes the DefaultStackSynthesizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `useLookupRoleForStackOperations` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-lookup-role-for-stack-operations` |
"
  [^DefaultStackSynthesizerProps$Builder builder id config]
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
  (.build builder))


(defn default-stack-synthesizer-props-builder
  ""
  [id config]
  (build-default-stack-synthesizer-props-builder (new DefaultStackSynthesizerProps$Builder) id config))


(defn build-docker-build-options-builder
  "The build-docker-build-options-builder function updates a DockerBuildOptions$Builder instance using the provided configuration.
  The function takes the DockerBuildOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `targetStage` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-stage` |
"
  [^DockerBuildOptions$Builder builder id config]
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
  (.build builder))


(defn docker-build-options-builder
  ""
  [id config]
  (build-docker-build-options-builder (new DockerBuildOptions$Builder) id config))


(defn build-docker-cache-option-builder
  "The build-docker-cache-option-builder function updates a DockerCacheOption$Builder instance using the provided configuration.
  The function takes the DockerCacheOption$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `params` | java.util.Map | [[cdk.support/lookup-entry]] | `:params` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^DockerCacheOption$Builder builder id config]
  (when-let [data (lookup-entry config id :params)]
    (. builder params data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn docker-cache-option-builder
  ""
  [id config]
  (build-docker-cache-option-builder (new DockerCacheOption$Builder) id config))


(defn build-docker-image-asset-location-builder
  "The build-docker-image-asset-location-builder function updates a DockerImageAssetLocation$Builder instance using the provided configuration.
  The function takes the DockerImageAssetLocation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^DockerImageAssetLocation$Builder builder id config]
  (when-let [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-let [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn docker-image-asset-location-builder
  ""
  [id config]
  (build-docker-image-asset-location-builder (new DockerImageAssetLocation$Builder) id config))


(defn build-docker-image-asset-source-builder
  "The build-docker-image-asset-source-builder function updates a DockerImageAssetSource$Builder instance using the provided configuration.
  The function takes the DockerImageAssetSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `sourceHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-hash` |
"
  [^DockerImageAssetSource$Builder builder id config]
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
  (.build builder))


(defn docker-image-asset-source-builder
  ""
  [id config]
  (build-docker-image-asset-source-builder (new DockerImageAssetSource$Builder) id config))


(defn build-docker-run-options-builder
  "The build-docker-run-options-builder function updates a DockerRunOptions$Builder instance using the provided configuration.
  The function takes the DockerRunOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^DockerRunOptions$Builder builder id config]
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
  (.build builder))


(defn docker-run-options-builder
  ""
  [id config]
  (build-docker-run-options-builder (new DockerRunOptions$Builder) id config))


(defn build-docker-volume-builder
  "The build-docker-volume-builder function updates a DockerVolume$Builder instance using the provided configuration.
  The function takes the DockerVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consistency` | software.amazon.awscdk.DockerVolumeConsistency | [[cdk.api/docker-volume-consistency]] | `:consistency` |
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
"
  [^DockerVolume$Builder builder id config]
  (when-let [data (docker-volume-consistency config id :consistency)]
    (. builder consistency data))
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (.build builder))


(defn docker-volume-builder
  ""
  [id config]
  (build-docker-volume-builder (new DockerVolume$Builder) id config))


(defn build-encoding-options-builder
  "The build-encoding-options-builder function updates a EncodingOptions$Builder instance using the provided configuration.
  The function takes the EncodingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
"
  [^EncodingOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :display-hint)]
    (. builder displayHint data))
  (.build builder))


(defn encoding-options-builder
  ""
  [id config]
  (build-encoding-options-builder (new EncodingOptions$Builder) id config))


(defn build-environment-builder
  "The build-environment-builder function updates a Environment$Builder instance using the provided configuration.
  The function takes the Environment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^Environment$Builder builder id config]
  (when-let [data (lookup-entry config id :account)]
    (. builder account data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn environment-builder
  ""
  [id config]
  (build-environment-builder (new Environment$Builder) id config))


(defn build-export-value-options-builder
  "The build-export-value-options-builder function updates a ExportValueOptions$Builder instance using the provided configuration.
  The function takes the ExportValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^ExportValueOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn export-value-options-builder
  ""
  [id config]
  (build-export-value-options-builder (new ExportValueOptions$Builder) id config))


(defn build-file-asset-location-builder
  "The build-file-asset-location-builder function updates a FileAssetLocation$Builder instance using the provided configuration.
  The function takes the FileAssetLocation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `httpUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-url` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
| `s3ObjectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-url` |
| `s3ObjectUrlWithPlaceholders` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-url-with-placeholders` |
"
  [^FileAssetLocation$Builder builder id config]
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
  (.build builder))


(defn file-asset-location-builder
  ""
  [id config]
  (build-file-asset-location-builder (new FileAssetLocation$Builder) id config))


(defn build-file-asset-source-builder
  "The build-file-asset-source-builder function updates a FileAssetSource$Builder instance using the provided configuration.
  The function takes the FileAssetSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `executable` | java.util.List | [[cdk.support/lookup-entry]] | `:executable` |
| `fileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-name` |
| `packaging` | software.amazon.awscdk.FileAssetPackaging | [[cdk.api/file-asset-packaging]] | `:packaging` |
| `sourceHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-hash` |
"
  [^FileAssetSource$Builder builder id config]
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
  (.build builder))


(defn file-asset-source-builder
  ""
  [id config]
  (build-file-asset-source-builder (new FileAssetSource$Builder) id config))


(defn build-file-copy-options-builder
  "The build-file-copy-options-builder function updates a FileCopyOptions$Builder instance using the provided configuration.
  The function takes the FileCopyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
"
  [^FileCopyOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-let [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (.build builder))


(defn file-copy-options-builder
  ""
  [id config]
  (build-file-copy-options-builder (new FileCopyOptions$Builder) id config))


(defn build-file-fingerprint-options-builder
  "The build-file-fingerprint-options-builder function updates a FileFingerprintOptions$Builder instance using the provided configuration.
  The function takes the FileFingerprintOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
"
  [^FileFingerprintOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (lookup-entry config id :extra-hash)]
    (. builder extraHash data))
  (when-let [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-let [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (.build builder))


(defn file-fingerprint-options-builder
  ""
  [id config]
  (build-file-fingerprint-options-builder (new FileFingerprintOptions$Builder) id config))


(defn build-fingerprint-options-builder
  "The build-fingerprint-options-builder function updates a FingerprintOptions$Builder instance using the provided configuration.
  The function takes the FingerprintOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `follow` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
"
  [^FingerprintOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (lookup-entry config id :extra-hash)]
    (. builder extraHash data))
  (when-let [data (symlink-follow-mode config id :follow)]
    (. builder follow data))
  (when-let [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (.build builder))


(defn fingerprint-options-builder
  ""
  [id config]
  (build-fingerprint-options-builder (new FingerprintOptions$Builder) id config))


(defn build-get-context-key-options-builder
  "The build-get-context-key-options-builder function updates a GetContextKeyOptions$Builder instance using the provided configuration.
  The function takes the GetContextKeyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-environment` |
| `props` | java.util.Map | [[cdk.support/lookup-entry]] | `:props` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
"
  [^GetContextKeyOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :include-environment)]
    (. builder includeEnvironment data))
  (when-let [data (lookup-entry config id :props)]
    (. builder props data))
  (when-let [data (lookup-entry config id :provider)]
    (. builder provider data))
  (.build builder))


(defn get-context-key-options-builder
  ""
  [id config]
  (build-get-context-key-options-builder (new GetContextKeyOptions$Builder) id config))


(defn build-get-context-key-result-builder
  "The build-get-context-key-result-builder function updates a GetContextKeyResult$Builder instance using the provided configuration.
  The function takes the GetContextKeyResult$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `props` | java.util.Map | [[cdk.support/lookup-entry]] | `:props` |
"
  [^GetContextKeyResult$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :props)]
    (. builder props data))
  (.build builder))


(defn get-context-key-result-builder
  ""
  [id config]
  (build-get-context-key-result-builder (new GetContextKeyResult$Builder) id config))


(defn build-get-context-value-options-builder
  "The build-get-context-value-options-builder function updates a GetContextValueOptions$Builder instance using the provided configuration.
  The function takes the GetContextValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dummyValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:dummy-value` |
| `includeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-environment` |
| `props` | java.util.Map | [[cdk.support/lookup-entry]] | `:props` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
"
  [^GetContextValueOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :dummy-value)]
    (. builder dummyValue data))
  (when-let [data (lookup-entry config id :include-environment)]
    (. builder includeEnvironment data))
  (when-let [data (lookup-entry config id :props)]
    (. builder props data))
  (when-let [data (lookup-entry config id :provider)]
    (. builder provider data))
  (.build builder))


(defn get-context-value-options-builder
  ""
  [id config]
  (build-get-context-value-options-builder (new GetContextValueOptions$Builder) id config))


(defn build-get-context-value-result-builder
  "The build-get-context-value-result-builder function updates a GetContextValueResult$Builder instance using the provided configuration.
  The function takes the GetContextValueResult$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^GetContextValueResult$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn get-context-value-result-builder
  ""
  [id config]
  (build-get-context-value-result-builder (new GetContextValueResult$Builder) id config))


(defn build-intrinsic-props-builder
  "The build-intrinsic-props-builder function updates a IntrinsicProps$Builder instance using the provided configuration.
  The function takes the IntrinsicProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackTrace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-trace` |
| `typeHint` | software.amazon.awscdk.ResolutionTypeHint | [[cdk.api/resolution-type-hint]] | `:type-hint` |
"
  [^IntrinsicProps$Builder builder id config]
  (when-let [data (lookup-entry config id :stack-trace)]
    (. builder stackTrace data))
  (when-let [data (resolution-type-hint config id :type-hint)]
    (. builder typeHint data))
  (.build builder))


(defn intrinsic-props-builder
  ""
  [id config]
  (build-intrinsic-props-builder (new IntrinsicProps$Builder) id config))


(defn build-lazy-any-value-options-builder
  "The build-lazy-any-value-options-builder function updates a LazyAnyValueOptions$Builder instance using the provided configuration.
  The function takes the LazyAnyValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
| `omitEmptyArray` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:omit-empty-array` |
"
  [^LazyAnyValueOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :display-hint)]
    (. builder displayHint data))
  (when-let [data (lookup-entry config id :omit-empty-array)]
    (. builder omitEmptyArray data))
  (.build builder))


(defn lazy-any-value-options-builder
  ""
  [id config]
  (build-lazy-any-value-options-builder (new LazyAnyValueOptions$Builder) id config))


(defn build-lazy-list-value-options-builder
  "The build-lazy-list-value-options-builder function updates a LazyListValueOptions$Builder instance using the provided configuration.
  The function takes the LazyListValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
| `omitEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:omit-empty` |
"
  [^LazyListValueOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :display-hint)]
    (. builder displayHint data))
  (when-let [data (lookup-entry config id :omit-empty)]
    (. builder omitEmpty data))
  (.build builder))


(defn lazy-list-value-options-builder
  ""
  [id config]
  (build-lazy-list-value-options-builder (new LazyListValueOptions$Builder) id config))


(defn build-lazy-string-value-options-builder
  "The build-lazy-string-value-options-builder function updates a LazyStringValueOptions$Builder instance using the provided configuration.
  The function takes the LazyStringValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
"
  [^LazyStringValueOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :display-hint)]
    (. builder displayHint data))
  (.build builder))


(defn lazy-string-value-options-builder
  ""
  [id config]
  (build-lazy-string-value-options-builder (new LazyStringValueOptions$Builder) id config))


(defn build-nested-stack-builder
  "The build-nested-stack-builder function updates a NestedStack$Builder instance using the provided configuration.
  The function takes the NestedStack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^NestedStack$Builder builder id config]
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
  (.build builder))


(defn nested-stack-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-nested-stack-builder (NestedStack$Builder/create scope (name id)) id config))


(defn build-nested-stack-props-builder
  "The build-nested-stack-props-builder function updates a NestedStackProps$Builder instance using the provided configuration.
  The function takes the NestedStackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^NestedStackProps$Builder builder id config]
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
  (.build builder))


(defn nested-stack-props-builder
  ""
  [id config]
  (build-nested-stack-props-builder (new NestedStackProps$Builder) id config))


(defn build-permissions-boundary-bind-options-builder
  "The build-permissions-boundary-bind-options-builder function updates a PermissionsBoundaryBindOptions$Builder instance using the provided configuration.
  The function takes the PermissionsBoundaryBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^PermissionsBoundaryBindOptions$Builder builder id config]
  (.build builder))


(defn permissions-boundary-bind-options-builder
  ""
  [id config]
  (build-permissions-boundary-bind-options-builder (new PermissionsBoundaryBindOptions$Builder) id config))


(defn build-policy-validation-plugin-report-beta1-builder
  "The build-policy-validation-plugin-report-beta1-builder function updates a PolicyValidationPluginReportBeta1$Builder instance using the provided configuration.
  The function takes the PolicyValidationPluginReportBeta1$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `pluginVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:plugin-version` |
| `success` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:success` |
| `violations` | java.util.List | [[cdk.support/lookup-entry]] | `:violations` |
"
  [^PolicyValidationPluginReportBeta1$Builder builder id config]
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :plugin-version)]
    (. builder pluginVersion data))
  (when-let [data (lookup-entry config id :success)]
    (. builder success data))
  (when-let [data (lookup-entry config id :violations)]
    (. builder violations data))
  (.build builder))


(defn policy-validation-plugin-report-beta1-builder
  ""
  [id config]
  (build-policy-validation-plugin-report-beta1-builder (new PolicyValidationPluginReportBeta1$Builder) id config))


(defn build-policy-violating-resource-beta1-builder
  "The build-policy-violating-resource-beta1-builder function updates a PolicyViolatingResourceBeta1$Builder instance using the provided configuration.
  The function takes the PolicyViolatingResourceBeta1$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `resourceLogicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-logical-id` |
| `templatePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-path` |
"
  [^PolicyViolatingResourceBeta1$Builder builder id config]
  (when-let [data (lookup-entry config id :locations)]
    (. builder locations data))
  (when-let [data (lookup-entry config id :resource-logical-id)]
    (. builder resourceLogicalId data))
  (when-let [data (lookup-entry config id :template-path)]
    (. builder templatePath data))
  (.build builder))


(defn policy-violating-resource-beta1-builder
  ""
  [id config]
  (build-policy-violating-resource-beta1-builder (new PolicyViolatingResourceBeta1$Builder) id config))


(defn build-policy-violation-beta1-builder
  "The build-policy-violation-beta1-builder function updates a PolicyViolationBeta1$Builder instance using the provided configuration.
  The function takes the PolicyViolationBeta1$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fix` | java.lang.String | [[cdk.support/lookup-entry]] | `:fix` |
| `ruleMetadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:rule-metadata` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `severity` | java.lang.String | [[cdk.support/lookup-entry]] | `:severity` |
| `violatingResources` | java.util.List | [[cdk.support/lookup-entry]] | `:violating-resources` |
"
  [^PolicyViolationBeta1$Builder builder id config]
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
  (.build builder))


(defn policy-violation-beta1-builder
  ""
  [id config]
  (build-policy-violation-beta1-builder (new PolicyViolationBeta1$Builder) id config))


(defn build-removal-policy-options-builder
  "The build-removal-policy-options-builder function updates a RemovalPolicyOptions$Builder instance using the provided configuration.
  The function takes the RemovalPolicyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToUpdateReplacePolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-update-replace-policy` |
| `defaultValue` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:default-value` |
"
  [^RemovalPolicyOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :apply-to-update-replace-policy)]
    (. builder applyToUpdateReplacePolicy data))
  (when-let [data (removal-policy config id :default-value)]
    (. builder defaultValue data))
  (.build builder))


(defn removal-policy-options-builder
  ""
  [id config]
  (build-removal-policy-options-builder (new RemovalPolicyOptions$Builder) id config))


(defn build-remove-tag-builder
  "The build-remove-tag-builder function updates a RemoveTag$Builder instance using the provided configuration.
  The function takes the RemoveTag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToLaunchedInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-launched-instances` |
| `excludeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-resource-types` |
| `includeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:include-resource-types` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^RemoveTag$Builder builder id config]
  (when-let [data (lookup-entry config id :apply-to-launched-instances)]
    (. builder applyToLaunchedInstances data))
  (when-let [data (lookup-entry config id :exclude-resource-types)]
    (. builder excludeResourceTypes data))
  (when-let [data (lookup-entry config id :include-resource-types)]
    (. builder includeResourceTypes data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn build-resolve-change-context-options-builder
  "The build-resolve-change-context-options-builder function updates a ResolveChangeContextOptions$Builder instance using the provided configuration.
  The function takes the ResolveChangeContextOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowIntrinsicKeys` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-intrinsic-keys` |
| `removeEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-empty` |
"
  [^ResolveChangeContextOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-intrinsic-keys)]
    (. builder allowIntrinsicKeys data))
  (when-let [data (lookup-entry config id :remove-empty)]
    (. builder removeEmpty data))
  (.build builder))


(defn resolve-change-context-options-builder
  ""
  [id config]
  (build-resolve-change-context-options-builder (new ResolveChangeContextOptions$Builder) id config))


(defn build-resolve-options-builder
  "The build-resolve-options-builder function updates a ResolveOptions$Builder instance using the provided configuration.
  The function takes the ResolveOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preparing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preparing` |
| `removeEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-empty` |
| `resolver` | software.amazon.awscdk.ITokenResolver | [[cdk.support/lookup-entry]] | `:resolver` |
| `scope` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^ResolveOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :preparing)]
    (. builder preparing data))
  (when-let [data (lookup-entry config id :remove-empty)]
    (. builder removeEmpty data))
  (when-let [data (lookup-entry config id :resolver)]
    (. builder resolver data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn resolve-options-builder
  ""
  [id config]
  (build-resolve-options-builder (new ResolveOptions$Builder) id config))


(defn build-resource-environment-builder
  "The build-resource-environment-builder function updates a ResourceEnvironment$Builder instance using the provided configuration.
  The function takes the ResourceEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^ResourceEnvironment$Builder builder id config]
  (when-let [data (lookup-entry config id :account)]
    (. builder account data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn resource-environment-builder
  ""
  [id config]
  (build-resource-environment-builder (new ResourceEnvironment$Builder) id config))


(defn build-resource-props-builder
  "The build-resource-props-builder function updates a ResourceProps$Builder instance using the provided configuration.
  The function takes the ResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `environmentFromArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-from-arn` |
| `physicalName` | java.lang.String | [[cdk.support/lookup-entry]] | `:physical-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^ResourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :account)]
    (. builder account data))
  (when-let [data (lookup-entry config id :environment-from-arn)]
    (. builder environmentFromArn data))
  (when-let [data (lookup-entry config id :physical-name)]
    (. builder physicalName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn resource-props-builder
  ""
  [id config]
  (build-resource-props-builder (new ResourceProps$Builder) id config))


(defn build-reverse-options-builder
  "The build-reverse-options-builder function updates a ReverseOptions$Builder instance using the provided configuration.
  The function takes the ReverseOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failConcat` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-concat` |
"
  [^ReverseOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :fail-concat)]
    (. builder failConcat data))
  (.build builder))


(defn reverse-options-builder
  ""
  [id config]
  (build-reverse-options-builder (new ReverseOptions$Builder) id config))


(defn build-role-options-builder
  "The build-role-options-builder function updates a RoleOptions$Builder instance using the provided configuration.
  The function takes the RoleOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |
"
  [^RoleOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :assume-role-arn)]
    (. builder assumeRoleArn data))
  (when-let [data (lookup-entry config id :assume-role-external-id)]
    (. builder assumeRoleExternalId data))
  (.build builder))


(defn role-options-builder
  ""
  [id config]
  (build-role-options-builder (new RoleOptions$Builder) id config))


(defn build-secret-value-builder
  "The build-secret-value-builder function updates a SecretValue$Builder instance using the provided configuration.
  The function takes the SecretValue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackTrace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-trace` |
| `typeHint` | software.amazon.awscdk.ResolutionTypeHint | [[cdk.api/resolution-type-hint]] | `:type-hint` |
"
  [^SecretValue$Builder builder id config]
  (when-let [data (lookup-entry config id :stack-trace)]
    (. builder stackTrace data))
  (when-let [data (resolution-type-hint config id :type-hint)]
    (. builder typeHint data))
  (.build builder))


(defn build-secrets-manager-secret-options-builder
  "The build-secrets-manager-secret-options-builder function updates a SecretsManagerSecretOptions$Builder instance using the provided configuration.
  The function takes the SecretsManagerSecretOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonField` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-field` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
| `versionStage` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-stage` |
"
  [^SecretsManagerSecretOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :json-field)]
    (. builder jsonField data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (when-let [data (lookup-entry config id :version-stage)]
    (. builder versionStage data))
  (.build builder))


(defn secrets-manager-secret-options-builder
  ""
  [id config]
  (build-secrets-manager-secret-options-builder (new SecretsManagerSecretOptions$Builder) id config))


(defn build-size-conversion-options-builder
  "The build-size-conversion-options-builder function updates a SizeConversionOptions$Builder instance using the provided configuration.
  The function takes the SizeConversionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rounding` | software.amazon.awscdk.SizeRoundingBehavior | [[cdk.api/size-rounding-behavior]] | `:rounding` |
"
  [^SizeConversionOptions$Builder builder id config]
  (when-let [data (size-rounding-behavior config id :rounding)]
    (. builder rounding data))
  (.build builder))


(defn size-conversion-options-builder
  ""
  [id config]
  (build-size-conversion-options-builder (new SizeConversionOptions$Builder) id config))


(defn build-stack-builder
  "The build-stack-builder function updates a Stack$Builder instance using the provided configuration.
  The function takes the Stack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `terminationProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protection` |
"
  [^Stack$Builder builder id config]
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
  (.build builder))


(defn build-stack-props-builder
  "The build-stack-props-builder function updates a StackProps$Builder instance using the provided configuration.
  The function takes the StackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `terminationProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protection` |
"
  [^StackProps$Builder builder id config]
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
  (.build builder))


(defn stack-props-builder
  ""
  [id config]
  (build-stack-props-builder (new StackProps$Builder) id config))


(defn build-stage-builder
  "The build-stage-builder function updates a Stage$Builder instance using the provided configuration.
  The function takes the Stage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | software.amazon.awscdk.Environment | [[cdk.support/lookup-entry]] | `:env` |
| `outdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:outdir` |
| `permissionsBoundary` | software.amazon.awscdk.PermissionsBoundary | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policyValidationBeta1` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-validation-beta1` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^Stage$Builder builder id config]
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
  (.build builder))


(defn stage-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-stage-builder (Stage$Builder/create scope (name id)) id config))


(defn build-stage-props-builder
  "The build-stage-props-builder function updates a StageProps$Builder instance using the provided configuration.
  The function takes the StageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | software.amazon.awscdk.Environment | [[cdk.support/lookup-entry]] | `:env` |
| `outdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:outdir` |
| `permissionsBoundary` | software.amazon.awscdk.PermissionsBoundary | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policyValidationBeta1` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-validation-beta1` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^StageProps$Builder builder id config]
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
  (.build builder))


(defn stage-props-builder
  ""
  [id config]
  (build-stage-props-builder (new StageProps$Builder) id config))


(defn build-stage-synthesis-options-builder
  "The build-stage-synthesis-options-builder function updates a StageSynthesisOptions$Builder instance using the provided configuration.
  The function takes the StageSynthesisOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `force` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force` |
| `skipValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-validation` |
| `validateOnSynthesis` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-on-synthesis` |
"
  [^StageSynthesisOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :force)]
    (. builder force data))
  (when-let [data (lookup-entry config id :skip-validation)]
    (. builder skipValidation data))
  (when-let [data (lookup-entry config id :validate-on-synthesis)]
    (. builder validateOnSynthesis data))
  (.build builder))


(defn stage-synthesis-options-builder
  ""
  [id config]
  (build-stage-synthesis-options-builder (new StageSynthesisOptions$Builder) id config))


(defn build-synthesize-stack-artifact-options-builder
  "The build-synthesize-stack-artifact-options-builder function updates a SynthesizeStackArtifactOptions$Builder instance using the provided configuration.
  The function takes the SynthesizeStackArtifactOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `stackTemplateAssetObjectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-template-asset-object-url` |
"
  [^SynthesizeStackArtifactOptions$Builder builder id config]
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
  (.build builder))


(defn synthesize-stack-artifact-options-builder
  ""
  [id config]
  (build-synthesize-stack-artifact-options-builder (new SynthesizeStackArtifactOptions$Builder) id config))


(defn build-tag-builder
  "The build-tag-builder function updates a Tag$Builder instance using the provided configuration.
  The function takes the Tag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToLaunchedInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-launched-instances` |
| `excludeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-resource-types` |
| `includeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:include-resource-types` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^Tag$Builder builder id config]
  (when-let [data (lookup-entry config id :apply-to-launched-instances)]
    (. builder applyToLaunchedInstances data))
  (when-let [data (lookup-entry config id :exclude-resource-types)]
    (. builder excludeResourceTypes data))
  (when-let [data (lookup-entry config id :include-resource-types)]
    (. builder includeResourceTypes data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn build-tag-manager-builder
  "The build-tag-manager-builder function updates a TagManager$Builder instance using the provided configuration.
  The function takes the TagManager$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagPropertyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-property-name` |
"
  [^TagManager$Builder builder id config]
  (when-let [data (lookup-entry config id :tag-property-name)]
    (. builder tagPropertyName data))
  (.build builder))


(defn build-tag-manager-options-builder
  "The build-tag-manager-options-builder function updates a TagManagerOptions$Builder instance using the provided configuration.
  The function takes the TagManagerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagPropertyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-property-name` |
"
  [^TagManagerOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :tag-property-name)]
    (. builder tagPropertyName data))
  (.build builder))


(defn tag-manager-options-builder
  ""
  [id config]
  (build-tag-manager-options-builder (new TagManagerOptions$Builder) id config))


(defn build-tag-props-builder
  "The build-tag-props-builder function updates a TagProps$Builder instance using the provided configuration.
  The function takes the TagProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToLaunchedInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-launched-instances` |
| `excludeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-resource-types` |
| `includeResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:include-resource-types` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^TagProps$Builder builder id config]
  (when-let [data (lookup-entry config id :apply-to-launched-instances)]
    (. builder applyToLaunchedInstances data))
  (when-let [data (lookup-entry config id :exclude-resource-types)]
    (. builder excludeResourceTypes data))
  (when-let [data (lookup-entry config id :include-resource-types)]
    (. builder includeResourceTypes data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn tag-props-builder
  ""
  [id config]
  (build-tag-props-builder (new TagProps$Builder) id config))


(defn build-time-conversion-options-builder
  "The build-time-conversion-options-builder function updates a TimeConversionOptions$Builder instance using the provided configuration.
  The function takes the TimeConversionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `integral` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:integral` |
"
  [^TimeConversionOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :integral)]
    (. builder integral data))
  (.build builder))


(defn time-conversion-options-builder
  ""
  [id config]
  (build-time-conversion-options-builder (new TimeConversionOptions$Builder) id config))


(defn build-unique-resource-name-options-builder
  "The build-unique-resource-name-options-builder function updates a UniqueResourceNameOptions$Builder instance using the provided configuration.
  The function takes the UniqueResourceNameOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedSpecialCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-special-characters` |
| `maxLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length` |
| `separator` | java.lang.String | [[cdk.support/lookup-entry]] | `:separator` |
"
  [^UniqueResourceNameOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-special-characters)]
    (. builder allowedSpecialCharacters data))
  (when-let [data (lookup-entry config id :max-length)]
    (. builder maxLength data))
  (when-let [data (lookup-entry config id :separator)]
    (. builder separator data))
  (.build builder))


(defn unique-resource-name-options-builder
  ""
  [id config]
  (build-unique-resource-name-options-builder (new UniqueResourceNameOptions$Builder) id config))