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
                                   Intrinsic$Builder
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
                                   UniqueResourceNameOptions$Builder]
           [software.constructs Construct]))


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


(defn app-builder>
  "The app-builder> function updates a App$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :analytics-reporting)]
    (. builder analyticsReporting data))
  (when-some [data (lookup-entry config id :auto-synth)]
    (. builder autoSynth data))
  (when-some [data (lookup-entry config id :context)]
    (. builder context data))
  (when-some [data (lookup-entry config id :default-stack-synthesizer)]
    (. builder defaultStackSynthesizer data))
  (when-some [data (lookup-entry config id :outdir)]
    (. builder outdir data))
  (when-some [data (lookup-entry config id :policy-validation-beta1)]
    (. builder policyValidationBeta1 data))
  (when-some [data (lookup-entry config id :post-cli-context)]
    (. builder postCliContext data))
  (when-some [data (lookup-entry config id :stack-traces)]
    (. builder stackTraces data))
  (when-some [data (lookup-entry config id :tree-metadata)]
    (. builder treeMetadata data))
  (.build builder))


(defn app-builder
  "Creates a  `App$Builder` instance using a no-argument create, applies the data configuration using the [[app-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (app-builder> (App$Builder/create) id config))


(defn app-props-builder>
  "The app-props-builder> function updates a AppProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :analytics-reporting)]
    (. builder analyticsReporting data))
  (when-some [data (lookup-entry config id :auto-synth)]
    (. builder autoSynth data))
  (when-some [data (lookup-entry config id :context)]
    (. builder context data))
  (when-some [data (lookup-entry config id :default-stack-synthesizer)]
    (. builder defaultStackSynthesizer data))
  (when-some [data (lookup-entry config id :outdir)]
    (. builder outdir data))
  (when-some [data (lookup-entry config id :policy-validation-beta1)]
    (. builder policyValidationBeta1 data))
  (when-some [data (lookup-entry config id :post-cli-context)]
    (. builder postCliContext data))
  (when-some [data (lookup-entry config id :stack-traces)]
    (. builder stackTraces data))
  (when-some [data (lookup-entry config id :tree-metadata)]
    (. builder treeMetadata data))
  (.build builder))


(defn app-props-builder
  "Creates a  `AppProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[app-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (app-props-builder> (new AppProps$Builder) id config))


(defn arn-components-builder>
  "The arn-components-builder> function updates a ArnComponents$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (arn-format config id :arn-format)]
    (. builder arnFormat data))
  (when-some [data (lookup-entry config id :partition)]
    (. builder partition data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (when-some [data (lookup-entry config id :resource-name)]
    (. builder resourceName data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn arn-components-builder
  "Creates a  `ArnComponents$Builder` instance using a no-argument constructor, applies the data configuration using the [[arn-components-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (arn-components-builder> (new ArnComponents$Builder) id config))


(defn asset-manifest-docker-image-destination-builder>
  "The asset-manifest-docker-image-destination-builder> function updates a AssetManifestDockerImageDestination$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :docker-tag-prefix)]
    (. builder dockerTagPrefix data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn asset-manifest-docker-image-destination-builder
  "Creates a  `AssetManifestDockerImageDestination$Builder` instance using a no-argument constructor, applies the data configuration using the [[asset-manifest-docker-image-destination-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (asset-manifest-docker-image-destination-builder> (new AssetManifestDockerImageDestination$Builder) id config))


(defn asset-manifest-file-destination-builder>
  "The asset-manifest-file-destination-builder> function updates a AssetManifestFileDestination$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn asset-manifest-file-destination-builder
  "Creates a  `AssetManifestFileDestination$Builder` instance using a no-argument constructor, applies the data configuration using the [[asset-manifest-file-destination-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (asset-manifest-file-destination-builder> (new AssetManifestFileDestination$Builder) id config))


(defn asset-options-builder>
  "The asset-options-builder> function updates a AssetOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-some [data (asset-hash-type config id :asset-hash-type)]
    (. builder assetHashType data))
  (when-some [data (lookup-entry config id :bundling)]
    (. builder bundling data))
  (.build builder))


(defn asset-options-builder
  "Creates a  `AssetOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[asset-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (asset-options-builder> (new AssetOptions$Builder) id config))


(defn asset-staging-builder>
  "The asset-staging-builder> function updates a AssetStaging$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-some [data (asset-hash-type config id :asset-hash-type)]
    (. builder assetHashType data))
  (when-some [data (lookup-entry config id :bundling)]
    (. builder bundling data))
  (when-some [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-some [data (lookup-entry config id :extra-hash)]
    (. builder extraHash data))
  (when-some [data (symlink-follow-mode config id :follow)]
    (. builder follow data))
  (when-some [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn asset-staging-builder
  "Creates a  `AssetStaging$Builder` instance using a scope and ID, applies the data configuration using the [[asset-staging-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (asset-staging-builder> (AssetStaging$Builder/create scope (name id)) id config))


(defn asset-staging-props-builder>
  "The asset-staging-props-builder> function updates a AssetStagingProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-some [data (asset-hash-type config id :asset-hash-type)]
    (. builder assetHashType data))
  (when-some [data (lookup-entry config id :bundling)]
    (. builder bundling data))
  (when-some [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-some [data (lookup-entry config id :extra-hash)]
    (. builder extraHash data))
  (when-some [data (symlink-follow-mode config id :follow)]
    (. builder follow data))
  (when-some [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn asset-staging-props-builder
  "Creates a  `AssetStagingProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[asset-staging-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (asset-staging-props-builder> (new AssetStagingProps$Builder) id config))


(defn bootstrapless-synthesizer-builder>
  "The bootstrapless-synthesizer-builder> function updates a BootstraplessSynthesizer$Builder instance using the provided configuration.
  The function takes the BootstraplessSynthesizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role-arn` |
| `deployRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-arn` |
"
  [^BootstraplessSynthesizer$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-formation-execution-role-arn)]
    (. builder cloudFormationExecutionRoleArn data))
  (when-some [data (lookup-entry config id :deploy-role-arn)]
    (. builder deployRoleArn data))
  (.build builder))


(defn bootstrapless-synthesizer-builder
  "Creates a  `BootstraplessSynthesizer$Builder` instance using a no-argument create, applies the data configuration using the [[bootstrapless-synthesizer-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (bootstrapless-synthesizer-builder> (BootstraplessSynthesizer$Builder/create) id config))


(defn bootstrapless-synthesizer-props-builder>
  "The bootstrapless-synthesizer-props-builder> function updates a BootstraplessSynthesizerProps$Builder instance using the provided configuration.
  The function takes the BootstraplessSynthesizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role-arn` |
| `deployRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deploy-role-arn` |
"
  [^BootstraplessSynthesizerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-formation-execution-role-arn)]
    (. builder cloudFormationExecutionRoleArn data))
  (when-some [data (lookup-entry config id :deploy-role-arn)]
    (. builder deployRoleArn data))
  (.build builder))


(defn bootstrapless-synthesizer-props-builder
  "Creates a  `BootstraplessSynthesizerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[bootstrapless-synthesizer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (bootstrapless-synthesizer-props-builder> (new BootstraplessSynthesizerProps$Builder) id config))


(defn bundling-options-builder>
  "The bundling-options-builder> function updates a BundlingOptions$Builder instance using the provided configuration.
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
  (when-some [data (bundling-file-access config id :bundling-file-access)]
    (. builder bundlingFileAccess data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :entrypoint)]
    (. builder entrypoint data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :local)]
    (. builder local data))
  (when-some [data (lookup-entry config id :network)]
    (. builder network data))
  (when-some [data (bundling-output config id :output-type)]
    (. builder outputType data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-some [data (lookup-entry config id :security-opt)]
    (. builder securityOpt data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (when-some [data (lookup-entry config id :volumes-from)]
    (. builder volumesFrom data))
  (when-some [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn bundling-options-builder
  "Creates a  `BundlingOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[bundling-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (bundling-options-builder> (new BundlingOptions$Builder) id config))


(defn cfn-auto-scaling-replacing-update-builder>
  "The cfn-auto-scaling-replacing-update-builder> function updates a CfnAutoScalingReplacingUpdate$Builder instance using the provided configuration.
  The function takes the CfnAutoScalingReplacingUpdate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `willReplace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:will-replace` |
"
  [^CfnAutoScalingReplacingUpdate$Builder builder id config]
  (when-some [data (lookup-entry config id :will-replace)]
    (. builder willReplace data))
  (.build builder))


(defn cfn-auto-scaling-replacing-update-builder
  "Creates a  `CfnAutoScalingReplacingUpdate$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-auto-scaling-replacing-update-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-auto-scaling-replacing-update-builder> (new CfnAutoScalingReplacingUpdate$Builder) id config))


(defn cfn-auto-scaling-rolling-update-builder>
  "The cfn-auto-scaling-rolling-update-builder> function updates a CfnAutoScalingRollingUpdate$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :max-batch-size)]
    (. builder maxBatchSize data))
  (when-some [data (lookup-entry config id :min-instances-in-service)]
    (. builder minInstancesInService data))
  (when-some [data (lookup-entry config id :min-successful-instances-percent)]
    (. builder minSuccessfulInstancesPercent data))
  (when-some [data (lookup-entry config id :pause-time)]
    (. builder pauseTime data))
  (when-some [data (lookup-entry config id :suspend-processes)]
    (. builder suspendProcesses data))
  (when-some [data (lookup-entry config id :wait-on-resource-signals)]
    (. builder waitOnResourceSignals data))
  (.build builder))


(defn cfn-auto-scaling-rolling-update-builder
  "Creates a  `CfnAutoScalingRollingUpdate$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-auto-scaling-rolling-update-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-auto-scaling-rolling-update-builder> (new CfnAutoScalingRollingUpdate$Builder) id config))


(defn cfn-auto-scaling-scheduled-action-builder>
  "The cfn-auto-scaling-scheduled-action-builder> function updates a CfnAutoScalingScheduledAction$Builder instance using the provided configuration.
  The function takes the CfnAutoScalingScheduledAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ignoreUnmodifiedGroupSizeProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-unmodified-group-size-properties` |
"
  [^CfnAutoScalingScheduledAction$Builder builder id config]
  (when-some [data (lookup-entry config id :ignore-unmodified-group-size-properties)]
    (. builder ignoreUnmodifiedGroupSizeProperties data))
  (.build builder))


(defn cfn-auto-scaling-scheduled-action-builder
  "Creates a  `CfnAutoScalingScheduledAction$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-auto-scaling-scheduled-action-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-auto-scaling-scheduled-action-builder> (new CfnAutoScalingScheduledAction$Builder) id config))


(defn cfn-code-deploy-blue-green-additional-options-builder>
  "The cfn-code-deploy-blue-green-additional-options-builder> function updates a CfnCodeDeployBlueGreenAdditionalOptions$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenAdditionalOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `terminationWaitTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-wait-time-in-minutes` |
"
  [^CfnCodeDeployBlueGreenAdditionalOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :termination-wait-time-in-minutes)]
    (. builder terminationWaitTimeInMinutes data))
  (.build builder))


(defn cfn-code-deploy-blue-green-additional-options-builder
  "Creates a  `CfnCodeDeployBlueGreenAdditionalOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-code-deploy-blue-green-additional-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-code-deploy-blue-green-additional-options-builder> (new CfnCodeDeployBlueGreenAdditionalOptions$Builder) id config))


(defn cfn-code-deploy-blue-green-application-builder>
  "The cfn-code-deploy-blue-green-application-builder> function updates a CfnCodeDeployBlueGreenApplication$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecsAttributes` | software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes | [[cdk.support/lookup-entry]] | `:ecs-attributes` |
| `target` | software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnCodeDeployBlueGreenApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :ecs-attributes)]
    (. builder ecsAttributes data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-code-deploy-blue-green-application-builder
  "Creates a  `CfnCodeDeployBlueGreenApplication$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-code-deploy-blue-green-application-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-code-deploy-blue-green-application-builder> (new CfnCodeDeployBlueGreenApplication$Builder) id config))


(defn cfn-code-deploy-blue-green-application-target-builder>
  "The cfn-code-deploy-blue-green-application-target-builder> function updates a CfnCodeDeployBlueGreenApplicationTarget$Builder instance using the provided configuration.
  The function takes the CfnCodeDeployBlueGreenApplicationTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCodeDeployBlueGreenApplicationTarget$Builder builder id config]
  (when-some [data (lookup-entry config id :logical-id)]
    (. builder logicalId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-code-deploy-blue-green-application-target-builder
  "Creates a  `CfnCodeDeployBlueGreenApplicationTarget$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-code-deploy-blue-green-application-target-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-code-deploy-blue-green-application-target-builder> (new CfnCodeDeployBlueGreenApplicationTarget$Builder) id config))


(defn cfn-code-deploy-blue-green-ecs-attributes-builder>
  "The cfn-code-deploy-blue-green-ecs-attributes-builder> function updates a CfnCodeDeployBlueGreenEcsAttributes$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :task-definitions)]
    (. builder taskDefinitions data))
  (when-some [data (lookup-entry config id :task-sets)]
    (. builder taskSets data))
  (when-some [data (lookup-entry config id :traffic-routing)]
    (. builder trafficRouting data))
  (.build builder))


(defn cfn-code-deploy-blue-green-ecs-attributes-builder
  "Creates a  `CfnCodeDeployBlueGreenEcsAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-code-deploy-blue-green-ecs-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-code-deploy-blue-green-ecs-attributes-builder> (new CfnCodeDeployBlueGreenEcsAttributes$Builder) id config))


(defn cfn-code-deploy-blue-green-hook-builder>
  "The cfn-code-deploy-blue-green-hook-builder> function updates a CfnCodeDeployBlueGreenHook$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :additional-options)]
    (. builder additionalOptions data))
  (when-some [data (lookup-entry config id :applications)]
    (. builder applications data))
  (when-some [data (lookup-entry config id :lifecycle-event-hooks)]
    (. builder lifecycleEventHooks data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :traffic-routing-config)]
    (. builder trafficRoutingConfig data))
  (.build builder))


(defn cfn-code-deploy-blue-green-hook-builder
  "Creates a  `CfnCodeDeployBlueGreenHook$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-code-deploy-blue-green-hook-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-code-deploy-blue-green-hook-builder> (CfnCodeDeployBlueGreenHook$Builder/create scope (name id)) id config))


(defn cfn-code-deploy-blue-green-hook-props-builder>
  "The cfn-code-deploy-blue-green-hook-props-builder> function updates a CfnCodeDeployBlueGreenHookProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :additional-options)]
    (. builder additionalOptions data))
  (when-some [data (lookup-entry config id :applications)]
    (. builder applications data))
  (when-some [data (lookup-entry config id :lifecycle-event-hooks)]
    (. builder lifecycleEventHooks data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :traffic-routing-config)]
    (. builder trafficRoutingConfig data))
  (.build builder))


(defn cfn-code-deploy-blue-green-hook-props-builder
  "Creates a  `CfnCodeDeployBlueGreenHookProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-code-deploy-blue-green-hook-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-code-deploy-blue-green-hook-props-builder> (new CfnCodeDeployBlueGreenHookProps$Builder) id config))


(defn cfn-code-deploy-blue-green-lifecycle-event-hooks-builder>
  "The cfn-code-deploy-blue-green-lifecycle-event-hooks-builder> function updates a CfnCodeDeployBlueGreenLifecycleEventHooks$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :after-allow-test-traffic)]
    (. builder afterAllowTestTraffic data))
  (when-some [data (lookup-entry config id :after-allow-traffic)]
    (. builder afterAllowTraffic data))
  (when-some [data (lookup-entry config id :after-install)]
    (. builder afterInstall data))
  (when-some [data (lookup-entry config id :before-allow-traffic)]
    (. builder beforeAllowTraffic data))
  (when-some [data (lookup-entry config id :before-install)]
    (. builder beforeInstall data))
  (.build builder))


(defn cfn-code-deploy-blue-green-lifecycle-event-hooks-builder
  "Creates a  `CfnCodeDeployBlueGreenLifecycleEventHooks$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-code-deploy-blue-green-lifecycle-event-hooks-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-code-deploy-blue-green-lifecycle-event-hooks-builder> (new CfnCodeDeployBlueGreenLifecycleEventHooks$Builder) id config))


(defn cfn-code-deploy-lambda-alias-update-builder>
  "The cfn-code-deploy-lambda-alias-update-builder> function updates a CfnCodeDeployLambdaAliasUpdate$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :after-allow-traffic-hook)]
    (. builder afterAllowTrafficHook data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :before-allow-traffic-hook)]
    (. builder beforeAllowTrafficHook data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (.build builder))


(defn cfn-code-deploy-lambda-alias-update-builder
  "Creates a  `CfnCodeDeployLambdaAliasUpdate$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-code-deploy-lambda-alias-update-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-code-deploy-lambda-alias-update-builder> (new CfnCodeDeployLambdaAliasUpdate$Builder) id config))


(defn cfn-condition-builder>
  "The cfn-condition-builder> function updates a CfnCondition$Builder instance using the provided configuration.
  The function takes the CfnCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:expression` |
"
  [^CfnCondition$Builder builder id config]
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (.build builder))


(defn cfn-condition-builder
  "Creates a  `CfnCondition$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-condition-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-condition-builder> (CfnCondition$Builder/create scope (name id)) id config))


(defn cfn-condition-props-builder>
  "The cfn-condition-props-builder> function updates a CfnConditionProps$Builder instance using the provided configuration.
  The function takes the CfnConditionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:expression` |
"
  [^CfnConditionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (.build builder))


(defn cfn-condition-props-builder
  "Creates a  `CfnConditionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-condition-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-condition-props-builder> (new CfnConditionProps$Builder) id config))


(defn cfn-creation-policy-builder>
  "The cfn-creation-policy-builder> function updates a CfnCreationPolicy$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :auto-scaling-creation-policy)]
    (. builder autoScalingCreationPolicy data))
  (when-some [data (lookup-entry config id :resource-signal)]
    (. builder resourceSignal data))
  (when-some [data (lookup-entry config id :start-fleet)]
    (. builder startFleet data))
  (.build builder))


(defn cfn-creation-policy-builder
  "Creates a  `CfnCreationPolicy$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-creation-policy-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-creation-policy-builder> (new CfnCreationPolicy$Builder) id config))


(defn cfn-custom-resource-builder>
  "The cfn-custom-resource-builder> function updates a CfnCustomResource$Builder instance using the provided configuration.
  The function takes the CfnCustomResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CfnCustomResource$Builder builder id config]
  (when-some [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn cfn-custom-resource-builder
  "Creates a  `CfnCustomResource$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-custom-resource-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-custom-resource-builder> (CfnCustomResource$Builder/create scope (name id)) id config))


(defn cfn-custom-resource-props-builder>
  "The cfn-custom-resource-props-builder> function updates a CfnCustomResourceProps$Builder instance using the provided configuration.
  The function takes the CfnCustomResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CfnCustomResourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn cfn-custom-resource-props-builder
  "Creates a  `CfnCustomResourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-custom-resource-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-custom-resource-props-builder> (new CfnCustomResourceProps$Builder) id config))


(defn cfn-dynamic-reference-props-builder>
  "The cfn-dynamic-reference-props-builder> function updates a CfnDynamicReferenceProps$Builder instance using the provided configuration.
  The function takes the CfnDynamicReferenceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-key` |
| `service` | software.amazon.awscdk.CfnDynamicReferenceService | [[cdk.api/cfn-dynamic-reference-service]] | `:service` |
"
  [^CfnDynamicReferenceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :reference-key)]
    (. builder referenceKey data))
  (when-some [data (cfn-dynamic-reference-service config id :service)]
    (. builder service data))
  (.build builder))


(defn cfn-dynamic-reference-props-builder
  "Creates a  `CfnDynamicReferenceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-dynamic-reference-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-dynamic-reference-props-builder> (new CfnDynamicReferenceProps$Builder) id config))


(defn cfn-hook-builder>
  "The cfn-hook-builder> function updates a CfnHook$Builder instance using the provided configuration.
  The function takes the CfnHook$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnHook$Builder builder id config]
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-hook-builder
  "Creates a  `CfnHook$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-hook-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-hook-builder> (CfnHook$Builder/create scope (name id)) id config))


(defn cfn-hook-default-version-builder>
  "The cfn-hook-default-version-builder> function updates a CfnHookDefaultVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-hook-default-version-builder
  "Creates a  `CfnHookDefaultVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-hook-default-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-hook-default-version-builder> (CfnHookDefaultVersion$Builder/create scope (name id)) id config))


(defn cfn-hook-default-version-props-builder>
  "The cfn-hook-default-version-props-builder> function updates a CfnHookDefaultVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-hook-default-version-props-builder
  "Creates a  `CfnHookDefaultVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-default-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-default-version-props-builder> (new CfnHookDefaultVersionProps$Builder) id config))


(defn cfn-hook-props-builder>
  "The cfn-hook-props-builder> function updates a CfnHookProps$Builder instance using the provided configuration.
  The function takes the CfnHookProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnHookProps$Builder builder id config]
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-hook-props-builder
  "Creates a  `CfnHookProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-props-builder> (new CfnHookProps$Builder) id config))


(defn cfn-hook-type-config-builder>
  "The cfn-hook-type-config-builder> function updates a CfnHookTypeConfig$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :configuration-alias)]
    (. builder configurationAlias data))
  (when-some [data (lookup-entry config id :type-arn)]
    (. builder typeArn data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-type-config-builder
  "Creates a  `CfnHookTypeConfig$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-hook-type-config-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-hook-type-config-builder> (CfnHookTypeConfig$Builder/create scope (name id)) id config))


(defn cfn-hook-type-config-props-builder>
  "The cfn-hook-type-config-props-builder> function updates a CfnHookTypeConfigProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :configuration-alias)]
    (. builder configurationAlias data))
  (when-some [data (lookup-entry config id :type-arn)]
    (. builder typeArn data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-type-config-props-builder
  "Creates a  `CfnHookTypeConfigProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-type-config-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-type-config-props-builder> (new CfnHookTypeConfigProps$Builder) id config))


(defn cfn-hook-version-builder>
  "The cfn-hook-version-builder> function updates a CfnHookVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-version-builder
  "Creates a  `CfnHookVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-hook-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-hook-version-builder> (CfnHookVersion$Builder/create scope (name id)) id config))


(defn cfn-hook-version-logging-config-property-builder>
  "The cfn-hook-version-logging-config-property-builder> function updates a CfnHookVersion$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnHookVersion$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnHookVersion$LoggingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-hook-version-logging-config-property-builder
  "Creates a  `CfnHookVersion$LoggingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-version-logging-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-version-logging-config-property-builder> (new CfnHookVersion$LoggingConfigProperty$Builder) id config))


(defn cfn-hook-version-props-builder>
  "The cfn-hook-version-props-builder> function updates a CfnHookVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-version-props-builder
  "Creates a  `CfnHookVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-version-props-builder> (new CfnHookVersionProps$Builder) id config))


(defn cfn-json-builder>
  "The cfn-json-builder> function updates a CfnJson$Builder instance using the provided configuration.
  The function takes the CfnJson$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnJson$Builder builder id config]
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-json-builder
  "Creates a  `CfnJson$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-json-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-json-builder> (CfnJson$Builder/create scope (name id)) id config))


(defn cfn-json-props-builder>
  "The cfn-json-props-builder> function updates a CfnJsonProps$Builder instance using the provided configuration.
  The function takes the CfnJsonProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnJsonProps$Builder builder id config]
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-json-props-builder
  "Creates a  `CfnJsonProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-json-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-json-props-builder> (new CfnJsonProps$Builder) id config))


(defn cfn-macro-builder>
  "The cfn-macro-builder> function updates a CfnMacro$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-macro-builder
  "Creates a  `CfnMacro$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-macro-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-macro-builder> (CfnMacro$Builder/create scope (name id)) id config))


(defn cfn-macro-props-builder>
  "The cfn-macro-props-builder> function updates a CfnMacroProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-macro-props-builder
  "Creates a  `CfnMacroProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-macro-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-macro-props-builder> (new CfnMacroProps$Builder) id config))


(defn cfn-mapping-builder>
  "The cfn-mapping-builder> function updates a CfnMapping$Builder instance using the provided configuration.
  The function takes the CfnMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lazy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lazy` |
| `mapping` | java.util.Map | [[cdk.support/lookup-entry]] | `:mapping` |
"
  [^CfnMapping$Builder builder id config]
  (when-some [data (lookup-entry config id :lazy)]
    (. builder lazy data))
  (when-some [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (.build builder))


(defn cfn-mapping-builder
  "Creates a  `CfnMapping$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-mapping-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-mapping-builder> (CfnMapping$Builder/create scope (name id)) id config))


(defn cfn-mapping-props-builder>
  "The cfn-mapping-props-builder> function updates a CfnMappingProps$Builder instance using the provided configuration.
  The function takes the CfnMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lazy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lazy` |
| `mapping` | java.util.Map | [[cdk.support/lookup-entry]] | `:mapping` |
"
  [^CfnMappingProps$Builder builder id config]
  (when-some [data (lookup-entry config id :lazy)]
    (. builder lazy data))
  (when-some [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (.build builder))


(defn cfn-mapping-props-builder
  "Creates a  `CfnMappingProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-mapping-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-mapping-props-builder> (new CfnMappingProps$Builder) id config))


(defn cfn-module-default-version-builder>
  "The cfn-module-default-version-builder> function updates a CfnModuleDefaultVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-module-default-version-builder
  "Creates a  `CfnModuleDefaultVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-module-default-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-module-default-version-builder> (CfnModuleDefaultVersion$Builder/create scope (name id)) id config))


(defn cfn-module-default-version-props-builder>
  "The cfn-module-default-version-props-builder> function updates a CfnModuleDefaultVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-module-default-version-props-builder
  "Creates a  `CfnModuleDefaultVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-module-default-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-module-default-version-props-builder> (new CfnModuleDefaultVersionProps$Builder) id config))


(defn cfn-module-version-builder>
  "The cfn-module-version-builder> function updates a CfnModuleVersion$Builder instance using the provided configuration.
  The function takes the CfnModuleVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |
"
  [^CfnModuleVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-some [data (lookup-entry config id :module-package)]
    (. builder modulePackage data))
  (.build builder))


(defn cfn-module-version-builder
  "Creates a  `CfnModuleVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-module-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-module-version-builder> (CfnModuleVersion$Builder/create scope (name id)) id config))


(defn cfn-module-version-props-builder>
  "The cfn-module-version-props-builder> function updates a CfnModuleVersionProps$Builder instance using the provided configuration.
  The function takes the CfnModuleVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |
"
  [^CfnModuleVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-some [data (lookup-entry config id :module-package)]
    (. builder modulePackage data))
  (.build builder))


(defn cfn-module-version-props-builder
  "Creates a  `CfnModuleVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-module-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-module-version-props-builder> (new CfnModuleVersionProps$Builder) id config))


(defn cfn-output-builder>
  "The cfn-output-builder> function updates a CfnOutput$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :export-name)]
    (. builder exportName data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-output-builder
  "Creates a  `CfnOutput$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-output-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-output-builder> (CfnOutput$Builder/create scope (name id)) id config))


(defn cfn-output-props-builder>
  "The cfn-output-props-builder> function updates a CfnOutputProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :export-name)]
    (. builder exportName data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-output-props-builder
  "Creates a  `CfnOutputProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-output-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-output-props-builder> (new CfnOutputProps$Builder) id config))


(defn cfn-parameter-builder>
  "The cfn-parameter-builder> function updates a CfnParameter$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (lookup-entry config id :allowed-values)]
    (. builder allowedValues data))
  (when-some [data (lookup-entry config id :constraint-description)]
    (. builder constraintDescription data))
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :max-length)]
    (. builder maxLength data))
  (when-some [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-some [data (lookup-entry config id :min-length)]
    (. builder minLength data))
  (when-some [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-some [data (lookup-entry config id :no-echo)]
    (. builder noEcho data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-parameter-builder
  "Creates a  `CfnParameter$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-parameter-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-parameter-builder> (CfnParameter$Builder/create scope (name id)) id config))


(defn cfn-parameter-props-builder>
  "The cfn-parameter-props-builder> function updates a CfnParameterProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (lookup-entry config id :allowed-values)]
    (. builder allowedValues data))
  (when-some [data (lookup-entry config id :constraint-description)]
    (. builder constraintDescription data))
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :max-length)]
    (. builder maxLength data))
  (when-some [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-some [data (lookup-entry config id :min-length)]
    (. builder minLength data))
  (when-some [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-some [data (lookup-entry config id :no-echo)]
    (. builder noEcho data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-parameter-props-builder
  "Creates a  `CfnParameterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-parameter-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-parameter-props-builder> (new CfnParameterProps$Builder) id config))


(defn cfn-public-type-version-builder>
  "The cfn-public-type-version-builder> function updates a CfnPublicTypeVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :log-delivery-bucket)]
    (. builder logDeliveryBucket data))
  (when-some [data (lookup-entry config id :public-version-number)]
    (. builder publicVersionNumber data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-public-type-version-builder
  "Creates a  `CfnPublicTypeVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-public-type-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-public-type-version-builder> (CfnPublicTypeVersion$Builder/create scope (name id)) id config))


(defn cfn-public-type-version-props-builder>
  "The cfn-public-type-version-props-builder> function updates a CfnPublicTypeVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :log-delivery-bucket)]
    (. builder logDeliveryBucket data))
  (when-some [data (lookup-entry config id :public-version-number)]
    (. builder publicVersionNumber data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-public-type-version-props-builder
  "Creates a  `CfnPublicTypeVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-public-type-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-public-type-version-props-builder> (new CfnPublicTypeVersionProps$Builder) id config))


(defn cfn-publisher-builder>
  "The cfn-publisher-builder> function updates a CfnPublisher$Builder instance using the provided configuration.
  The function takes the CfnPublisher$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnPublisher$Builder builder id config]
  (when-some [data (lookup-entry config id :accept-terms-and-conditions)]
    (. builder acceptTermsAndConditions data))
  (when-some [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn cfn-publisher-builder
  "Creates a  `CfnPublisher$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-publisher-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-publisher-builder> (CfnPublisher$Builder/create scope (name id)) id config))


(defn cfn-publisher-props-builder>
  "The cfn-publisher-props-builder> function updates a CfnPublisherProps$Builder instance using the provided configuration.
  The function takes the CfnPublisherProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnPublisherProps$Builder builder id config]
  (when-some [data (lookup-entry config id :accept-terms-and-conditions)]
    (. builder acceptTermsAndConditions data))
  (when-some [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn cfn-publisher-props-builder
  "Creates a  `CfnPublisherProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-publisher-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-publisher-props-builder> (new CfnPublisherProps$Builder) id config))


(defn cfn-resource-auto-scaling-creation-policy-builder>
  "The cfn-resource-auto-scaling-creation-policy-builder> function updates a CfnResourceAutoScalingCreationPolicy$Builder instance using the provided configuration.
  The function takes the CfnResourceAutoScalingCreationPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minSuccessfulInstancesPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-successful-instances-percent` |
"
  [^CfnResourceAutoScalingCreationPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :min-successful-instances-percent)]
    (. builder minSuccessfulInstancesPercent data))
  (.build builder))


(defn cfn-resource-auto-scaling-creation-policy-builder
  "Creates a  `CfnResourceAutoScalingCreationPolicy$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-auto-scaling-creation-policy-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-auto-scaling-creation-policy-builder> (new CfnResourceAutoScalingCreationPolicy$Builder) id config))


(defn cfn-resource-builder>
  "The cfn-resource-builder> function updates a CfnResource$Builder instance using the provided configuration.
  The function takes the CfnResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnResource$Builder builder id config]
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-resource-builder
  "Creates a  `CfnResource$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-resource-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-builder> (CfnResource$Builder/create scope (name id)) id config))


(defn cfn-resource-default-version-builder>
  "The cfn-resource-default-version-builder> function updates a CfnResourceDefaultVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-resource-default-version-builder
  "Creates a  `CfnResourceDefaultVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-resource-default-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-default-version-builder> (CfnResourceDefaultVersion$Builder/create scope (name id)) id config))


(defn cfn-resource-default-version-props-builder>
  "The cfn-resource-default-version-props-builder> function updates a CfnResourceDefaultVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-resource-default-version-props-builder
  "Creates a  `CfnResourceDefaultVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-default-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-default-version-props-builder> (new CfnResourceDefaultVersionProps$Builder) id config))


(defn cfn-resource-props-builder>
  "The cfn-resource-props-builder> function updates a CfnResourceProps$Builder instance using the provided configuration.
  The function takes the CfnResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnResourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-resource-props-builder
  "Creates a  `CfnResourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-props-builder> (new CfnResourceProps$Builder) id config))


(defn cfn-resource-signal-builder>
  "The cfn-resource-signal-builder> function updates a CfnResourceSignal$Builder instance using the provided configuration.
  The function takes the CfnResourceSignal$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnResourceSignal$Builder builder id config]
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-resource-signal-builder
  "Creates a  `CfnResourceSignal$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-signal-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-signal-builder> (new CfnResourceSignal$Builder) id config))


(defn cfn-resource-version-builder>
  "The cfn-resource-version-builder> function updates a CfnResourceVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-resource-version-builder
  "Creates a  `CfnResourceVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-resource-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-version-builder> (CfnResourceVersion$Builder/create scope (name id)) id config))


(defn cfn-resource-version-logging-config-property-builder>
  "The cfn-resource-version-logging-config-property-builder> function updates a CfnResourceVersion$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceVersion$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnResourceVersion$LoggingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-resource-version-logging-config-property-builder
  "Creates a  `CfnResourceVersion$LoggingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-version-logging-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-version-logging-config-property-builder> (new CfnResourceVersion$LoggingConfigProperty$Builder) id config))


(defn cfn-resource-version-props-builder>
  "The cfn-resource-version-props-builder> function updates a CfnResourceVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-resource-version-props-builder
  "Creates a  `CfnResourceVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-version-props-builder> (new CfnResourceVersionProps$Builder) id config))


(defn cfn-rule-assertion-builder>
  "The cfn-rule-assertion-builder> function updates a CfnRuleAssertion$Builder instance using the provided configuration.
  The function takes the CfnRuleAssertion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:assert-description` |
| `assertValue` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:assert-value` |
"
  [^CfnRuleAssertion$Builder builder id config]
  (when-some [data (lookup-entry config id :assert-description)]
    (. builder assertDescription data))
  (when-some [data (lookup-entry config id :assert-value)]
    (. builder assertValue data))
  (.build builder))


(defn cfn-rule-assertion-builder
  "Creates a  `CfnRuleAssertion$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-rule-assertion-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-rule-assertion-builder> (new CfnRuleAssertion$Builder) id config))


(defn cfn-rule-builder>
  "The cfn-rule-builder> function updates a CfnRule$Builder instance using the provided configuration.
  The function takes the CfnRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertions` | java.util.List | [[cdk.support/lookup-entry]] | `:assertions` |
| `ruleCondition` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:rule-condition` |
"
  [^CfnRule$Builder builder id config]
  (when-some [data (lookup-entry config id :assertions)]
    (. builder assertions data))
  (when-some [data (lookup-entry config id :rule-condition)]
    (. builder ruleCondition data))
  (.build builder))


(defn cfn-rule-builder
  "Creates a  `CfnRule$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-rule-builder> (CfnRule$Builder/create scope (name id)) id config))


(defn cfn-rule-props-builder>
  "The cfn-rule-props-builder> function updates a CfnRuleProps$Builder instance using the provided configuration.
  The function takes the CfnRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertions` | java.util.List | [[cdk.support/lookup-entry]] | `:assertions` |
| `ruleCondition` | software.amazon.awscdk.ICfnConditionExpression | [[cdk.support/lookup-entry]] | `:rule-condition` |
"
  [^CfnRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assertions)]
    (. builder assertions data))
  (when-some [data (lookup-entry config id :rule-condition)]
    (. builder ruleCondition data))
  (.build builder))


(defn cfn-rule-props-builder
  "Creates a  `CfnRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-rule-props-builder> (new CfnRuleProps$Builder) id config))


(defn cfn-stack-builder>
  "The cfn-stack-builder> function updates a CfnStack$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-url)]
    (. builder templateUrl data))
  (when-some [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (.build builder))


(defn cfn-stack-builder
  "Creates a  `CfnStack$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-stack-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stack-builder> (CfnStack$Builder/create scope (name id)) id config))


(defn cfn-stack-output-property-builder>
  "The cfn-stack-output-property-builder> function updates a CfnStack$OutputProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :export-name)]
    (. builder exportName data))
  (when-some [data (lookup-entry config id :output-key)]
    (. builder outputKey data))
  (when-some [data (lookup-entry config id :output-value)]
    (. builder outputValue data))
  (.build builder))


(defn cfn-stack-output-property-builder
  "Creates a  `CfnStack$OutputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-output-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-output-property-builder> (new CfnStack$OutputProperty$Builder) id config))


(defn cfn-stack-props-builder>
  "The cfn-stack-props-builder> function updates a CfnStackProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-url)]
    (. builder templateUrl data))
  (when-some [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (.build builder))


(defn cfn-stack-props-builder
  "Creates a  `CfnStackProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-props-builder> (new CfnStackProps$Builder) id config))


(defn cfn-stack-set-auto-deployment-property-builder>
  "The cfn-stack-set-auto-deployment-property-builder> function updates a CfnStackSet$AutoDeploymentProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$AutoDeploymentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `retainStacksOnAccountRemoval` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-stacks-on-account-removal` |
"
  [^CfnStackSet$AutoDeploymentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :retain-stacks-on-account-removal)]
    (. builder retainStacksOnAccountRemoval data))
  (.build builder))


(defn cfn-stack-set-auto-deployment-property-builder
  "Creates a  `CfnStackSet$AutoDeploymentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-auto-deployment-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-auto-deployment-property-builder> (new CfnStackSet$AutoDeploymentProperty$Builder) id config))


(defn cfn-stack-set-builder>
  "The cfn-stack-set-builder> function updates a CfnStackSet$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :administration-role-arn)]
    (. builder administrationRoleArn data))
  (when-some [data (lookup-entry config id :auto-deployment)]
    (. builder autoDeployment data))
  (when-some [data (lookup-entry config id :call-as)]
    (. builder callAs data))
  (when-some [data (lookup-entry config id :capabilities)]
    (. builder capabilities data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :execution-role-name)]
    (. builder executionRoleName data))
  (when-some [data (lookup-entry config id :managed-execution)]
    (. builder managedExecution data))
  (when-some [data (lookup-entry config id :operation-preferences)]
    (. builder operationPreferences data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :permission-model)]
    (. builder permissionModel data))
  (when-some [data (lookup-entry config id :stack-instances-group)]
    (. builder stackInstancesGroup data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-some [data (lookup-entry config id :template-url)]
    (. builder templateUrl data))
  (.build builder))


(defn cfn-stack-set-builder
  "Creates a  `CfnStackSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-stack-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stack-set-builder> (CfnStackSet$Builder/create scope (name id)) id config))


(defn cfn-stack-set-deployment-targets-property-builder>
  "The cfn-stack-set-deployment-targets-property-builder> function updates a CfnStackSet$DeploymentTargetsProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :account-filter-type)]
    (. builder accountFilterType data))
  (when-some [data (lookup-entry config id :accounts)]
    (. builder accounts data))
  (when-some [data (lookup-entry config id :accounts-url)]
    (. builder accountsUrl data))
  (when-some [data (lookup-entry config id :organizational-unit-ids)]
    (. builder organizationalUnitIds data))
  (.build builder))


(defn cfn-stack-set-deployment-targets-property-builder
  "Creates a  `CfnStackSet$DeploymentTargetsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-deployment-targets-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-deployment-targets-property-builder> (new CfnStackSet$DeploymentTargetsProperty$Builder) id config))


(defn cfn-stack-set-managed-execution-property-builder>
  "The cfn-stack-set-managed-execution-property-builder> function updates a CfnStackSet$ManagedExecutionProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$ManagedExecutionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active` |
"
  [^CfnStackSet$ManagedExecutionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :active)]
    (. builder active data))
  (.build builder))


(defn cfn-stack-set-managed-execution-property-builder
  "Creates a  `CfnStackSet$ManagedExecutionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-managed-execution-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-managed-execution-property-builder> (new CfnStackSet$ManagedExecutionProperty$Builder) id config))


(defn cfn-stack-set-operation-preferences-property-builder>
  "The cfn-stack-set-operation-preferences-property-builder> function updates a CfnStackSet$OperationPreferencesProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :failure-tolerance-count)]
    (. builder failureToleranceCount data))
  (when-some [data (lookup-entry config id :failure-tolerance-percentage)]
    (. builder failureTolerancePercentage data))
  (when-some [data (lookup-entry config id :max-concurrent-count)]
    (. builder maxConcurrentCount data))
  (when-some [data (lookup-entry config id :max-concurrent-percentage)]
    (. builder maxConcurrentPercentage data))
  (when-some [data (lookup-entry config id :region-concurrency-type)]
    (. builder regionConcurrencyType data))
  (when-some [data (lookup-entry config id :region-order)]
    (. builder regionOrder data))
  (.build builder))


(defn cfn-stack-set-operation-preferences-property-builder
  "Creates a  `CfnStackSet$OperationPreferencesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-operation-preferences-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-operation-preferences-property-builder> (new CfnStackSet$OperationPreferencesProperty$Builder) id config))


(defn cfn-stack-set-parameter-property-builder>
  "The cfn-stack-set-parameter-property-builder> function updates a CfnStackSet$ParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$ParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-key` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnStackSet$ParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-key)]
    (. builder parameterKey data))
  (when-some [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-stack-set-parameter-property-builder
  "Creates a  `CfnStackSet$ParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-parameter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-parameter-property-builder> (new CfnStackSet$ParameterProperty$Builder) id config))


(defn cfn-stack-set-props-builder>
  "The cfn-stack-set-props-builder> function updates a CfnStackSetProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :administration-role-arn)]
    (. builder administrationRoleArn data))
  (when-some [data (lookup-entry config id :auto-deployment)]
    (. builder autoDeployment data))
  (when-some [data (lookup-entry config id :call-as)]
    (. builder callAs data))
  (when-some [data (lookup-entry config id :capabilities)]
    (. builder capabilities data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :execution-role-name)]
    (. builder executionRoleName data))
  (when-some [data (lookup-entry config id :managed-execution)]
    (. builder managedExecution data))
  (when-some [data (lookup-entry config id :operation-preferences)]
    (. builder operationPreferences data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :permission-model)]
    (. builder permissionModel data))
  (when-some [data (lookup-entry config id :stack-instances-group)]
    (. builder stackInstancesGroup data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-some [data (lookup-entry config id :template-url)]
    (. builder templateUrl data))
  (.build builder))


(defn cfn-stack-set-props-builder
  "Creates a  `CfnStackSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-props-builder> (new CfnStackSetProps$Builder) id config))


(defn cfn-stack-set-stack-instances-property-builder>
  "The cfn-stack-set-stack-instances-property-builder> function updates a CfnStackSet$StackInstancesProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deployment-targets)]
    (. builder deploymentTargets data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :regions)]
    (. builder regions data))
  (.build builder))


(defn cfn-stack-set-stack-instances-property-builder
  "Creates a  `CfnStackSet$StackInstancesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-stack-instances-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-stack-instances-property-builder> (new CfnStackSet$StackInstancesProperty$Builder) id config))


(defn cfn-tag-builder>
  "The cfn-tag-builder> function updates a CfnTag$Builder instance using the provided configuration.
  The function takes the CfnTag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTag$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-tag-builder
  "Creates a  `CfnTag$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-tag-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-tag-builder> (new CfnTag$Builder) id config))


(defn cfn-traffic-route-builder>
  "The cfn-traffic-route-builder> function updates a CfnTrafficRoute$Builder instance using the provided configuration.
  The function takes the CfnTrafficRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTrafficRoute$Builder builder id config]
  (when-some [data (lookup-entry config id :logical-id)]
    (. builder logicalId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-traffic-route-builder
  "Creates a  `CfnTrafficRoute$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-traffic-route-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-traffic-route-builder> (new CfnTrafficRoute$Builder) id config))


(defn cfn-traffic-routing-builder>
  "The cfn-traffic-routing-builder> function updates a CfnTrafficRouting$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :prod-traffic-route)]
    (. builder prodTrafficRoute data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :test-traffic-route)]
    (. builder testTrafficRoute data))
  (.build builder))


(defn cfn-traffic-routing-builder
  "Creates a  `CfnTrafficRouting$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-traffic-routing-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-traffic-routing-builder> (new CfnTrafficRouting$Builder) id config))


(defn cfn-traffic-routing-config-builder>
  "The cfn-traffic-routing-config-builder> function updates a CfnTrafficRoutingConfig$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :time-based-canary)]
    (. builder timeBasedCanary data))
  (when-some [data (lookup-entry config id :time-based-linear)]
    (. builder timeBasedLinear data))
  (when-some [data (cfn-traffic-routing-type config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-traffic-routing-config-builder
  "Creates a  `CfnTrafficRoutingConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-traffic-routing-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-traffic-routing-config-builder> (new CfnTrafficRoutingConfig$Builder) id config))


(defn cfn-traffic-routing-time-based-canary-builder>
  "The cfn-traffic-routing-time-based-canary-builder> function updates a CfnTrafficRoutingTimeBasedCanary$Builder instance using the provided configuration.
  The function takes the CfnTrafficRoutingTimeBasedCanary$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bakeTimeMins` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bake-time-mins` |
| `stepPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-percentage` |
"
  [^CfnTrafficRoutingTimeBasedCanary$Builder builder id config]
  (when-some [data (lookup-entry config id :bake-time-mins)]
    (. builder bakeTimeMins data))
  (when-some [data (lookup-entry config id :step-percentage)]
    (. builder stepPercentage data))
  (.build builder))


(defn cfn-traffic-routing-time-based-canary-builder
  "Creates a  `CfnTrafficRoutingTimeBasedCanary$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-traffic-routing-time-based-canary-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-traffic-routing-time-based-canary-builder> (new CfnTrafficRoutingTimeBasedCanary$Builder) id config))


(defn cfn-traffic-routing-time-based-linear-builder>
  "The cfn-traffic-routing-time-based-linear-builder> function updates a CfnTrafficRoutingTimeBasedLinear$Builder instance using the provided configuration.
  The function takes the CfnTrafficRoutingTimeBasedLinear$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bakeTimeMins` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bake-time-mins` |
| `stepPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-percentage` |
"
  [^CfnTrafficRoutingTimeBasedLinear$Builder builder id config]
  (when-some [data (lookup-entry config id :bake-time-mins)]
    (. builder bakeTimeMins data))
  (when-some [data (lookup-entry config id :step-percentage)]
    (. builder stepPercentage data))
  (.build builder))


(defn cfn-traffic-routing-time-based-linear-builder
  "Creates a  `CfnTrafficRoutingTimeBasedLinear$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-traffic-routing-time-based-linear-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-traffic-routing-time-based-linear-builder> (new CfnTrafficRoutingTimeBasedLinear$Builder) id config))


(defn cfn-type-activation-builder>
  "The cfn-type-activation-builder> function updates a CfnTypeActivation$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :auto-update)]
    (. builder autoUpdate data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :major-version)]
    (. builder majorVersion data))
  (when-some [data (lookup-entry config id :public-type-arn)]
    (. builder publicTypeArn data))
  (when-some [data (lookup-entry config id :publisher-id)]
    (. builder publisherId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-name-alias)]
    (. builder typeNameAlias data))
  (when-some [data (lookup-entry config id :version-bump)]
    (. builder versionBump data))
  (.build builder))


(defn cfn-type-activation-builder
  "Creates a  `CfnTypeActivation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-type-activation-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-type-activation-builder> (CfnTypeActivation$Builder/create scope (name id)) id config))


(defn cfn-type-activation-logging-config-property-builder>
  "The cfn-type-activation-logging-config-property-builder> function updates a CfnTypeActivation$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTypeActivation$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnTypeActivation$LoggingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-type-activation-logging-config-property-builder
  "Creates a  `CfnTypeActivation$LoggingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-type-activation-logging-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-type-activation-logging-config-property-builder> (new CfnTypeActivation$LoggingConfigProperty$Builder) id config))


(defn cfn-type-activation-props-builder>
  "The cfn-type-activation-props-builder> function updates a CfnTypeActivationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :auto-update)]
    (. builder autoUpdate data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :major-version)]
    (. builder majorVersion data))
  (when-some [data (lookup-entry config id :public-type-arn)]
    (. builder publicTypeArn data))
  (when-some [data (lookup-entry config id :publisher-id)]
    (. builder publisherId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-name-alias)]
    (. builder typeNameAlias data))
  (when-some [data (lookup-entry config id :version-bump)]
    (. builder versionBump data))
  (.build builder))


(defn cfn-type-activation-props-builder
  "Creates a  `CfnTypeActivationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-type-activation-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-type-activation-props-builder> (new CfnTypeActivationProps$Builder) id config))


(defn cfn-update-policy-builder>
  "The cfn-update-policy-builder> function updates a CfnUpdatePolicy$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :auto-scaling-replacing-update)]
    (. builder autoScalingReplacingUpdate data))
  (when-some [data (lookup-entry config id :auto-scaling-rolling-update)]
    (. builder autoScalingRollingUpdate data))
  (when-some [data (lookup-entry config id :auto-scaling-scheduled-action)]
    (. builder autoScalingScheduledAction data))
  (when-some [data (lookup-entry config id :code-deploy-lambda-alias-update)]
    (. builder codeDeployLambdaAliasUpdate data))
  (when-some [data (lookup-entry config id :enable-version-upgrade)]
    (. builder enableVersionUpgrade data))
  (when-some [data (lookup-entry config id :use-online-resharding)]
    (. builder useOnlineResharding data))
  (.build builder))


(defn cfn-update-policy-builder
  "Creates a  `CfnUpdatePolicy$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-update-policy-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-update-policy-builder> (new CfnUpdatePolicy$Builder) id config))


(defn cfn-wait-condition-builder>
  "The cfn-wait-condition-builder> function updates a CfnWaitCondition$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :handle)]
    (. builder handle data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-wait-condition-builder
  "Creates a  `CfnWaitCondition$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-wait-condition-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-wait-condition-builder> (CfnWaitCondition$Builder/create scope (name id)) id config))


(defn cfn-wait-condition-handle-builder
  "Creates a  `CfnWaitConditionHandle$Builder` instance using a parent scope and ID, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |"
  [^software.constructs.Construct scope id]
  (.build (CfnWaitConditionHandle$Builder/create scope (name id))))


(defn cfn-wait-condition-handle-props-builder
  "Creates a  `CfnWaitConditionHandleProps$Builder` instance using a no-argument construct, then builds it."
  []
  (.build (new CfnWaitConditionHandleProps$Builder)))


(defn cfn-wait-condition-props-builder>
  "The cfn-wait-condition-props-builder> function updates a CfnWaitConditionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :handle)]
    (. builder handle data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-wait-condition-props-builder
  "Creates a  `CfnWaitConditionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wait-condition-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wait-condition-props-builder> (new CfnWaitConditionProps$Builder) id config))


(defn cli-credentials-stack-synthesizer-builder>
  "The cli-credentials-stack-synthesizer-builder> function updates a CliCredentialsStackSynthesizer$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :docker-tag-prefix)]
    (. builder dockerTagPrefix data))
  (when-some [data (lookup-entry config id :file-assets-bucket-name)]
    (. builder fileAssetsBucketName data))
  (when-some [data (lookup-entry config id :image-assets-repository-name)]
    (. builder imageAssetsRepositoryName data))
  (when-some [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (.build builder))


(defn cli-credentials-stack-synthesizer-builder
  "Creates a  `CliCredentialsStackSynthesizer$Builder` instance using a no-argument create, applies the data configuration using the [[cli-credentials-stack-synthesizer-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cli-credentials-stack-synthesizer-builder> (CliCredentialsStackSynthesizer$Builder/create) id config))


(defn cli-credentials-stack-synthesizer-props-builder>
  "The cli-credentials-stack-synthesizer-props-builder> function updates a CliCredentialsStackSynthesizerProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :docker-tag-prefix)]
    (. builder dockerTagPrefix data))
  (when-some [data (lookup-entry config id :file-assets-bucket-name)]
    (. builder fileAssetsBucketName data))
  (when-some [data (lookup-entry config id :image-assets-repository-name)]
    (. builder imageAssetsRepositoryName data))
  (when-some [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (.build builder))


(defn cli-credentials-stack-synthesizer-props-builder
  "Creates a  `CliCredentialsStackSynthesizerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cli-credentials-stack-synthesizer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cli-credentials-stack-synthesizer-props-builder> (new CliCredentialsStackSynthesizerProps$Builder) id config))


(defn copy-options-builder>
  "The copy-options-builder> function updates a CopyOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-some [data (symlink-follow-mode config id :follow)]
    (. builder follow data))
  (when-some [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (.build builder))


(defn copy-options-builder
  "Creates a  `CopyOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[copy-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (copy-options-builder> (new CopyOptions$Builder) id config))


(defn custom-resource-builder>
  "The custom-resource-builder> function updates a CustomResource$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :pascal-case-properties)]
    (. builder pascalCaseProperties data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn custom-resource-builder
  "Creates a  `CustomResource$Builder` instance using a scope and ID, applies the data configuration using the [[custom-resource-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (custom-resource-builder> (CustomResource$Builder/create scope (name id)) id config))


(defn custom-resource-props-builder>
  "The custom-resource-props-builder> function updates a CustomResourceProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :pascal-case-properties)]
    (. builder pascalCaseProperties data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn custom-resource-props-builder
  "Creates a  `CustomResourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[custom-resource-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (custom-resource-props-builder> (new CustomResourceProps$Builder) id config))


(defn custom-resource-provider-base-props-builder>
  "The custom-resource-provider-base-props-builder> function updates a CustomResourceProviderBaseProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :code-directory)]
    (. builder codeDirectory data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-some [data (lookup-entry config id :policy-statements)]
    (. builder policyStatements data))
  (when-some [data (lookup-entry config id :runtime-name)]
    (. builder runtimeName data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :use-cfn-response-wrapper)]
    (. builder useCfnResponseWrapper data))
  (.build builder))


(defn custom-resource-provider-base-props-builder
  "Creates a  `CustomResourceProviderBaseProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[custom-resource-provider-base-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (custom-resource-provider-base-props-builder> (new CustomResourceProviderBaseProps$Builder) id config))


(defn custom-resource-provider-options-builder>
  "The custom-resource-provider-options-builder> function updates a CustomResourceProviderOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-some [data (lookup-entry config id :policy-statements)]
    (. builder policyStatements data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :use-cfn-response-wrapper)]
    (. builder useCfnResponseWrapper data))
  (.build builder))


(defn custom-resource-provider-options-builder
  "Creates a  `CustomResourceProviderOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[custom-resource-provider-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (custom-resource-provider-options-builder> (new CustomResourceProviderOptions$Builder) id config))


(defn custom-resource-provider-props-builder>
  "The custom-resource-provider-props-builder> function updates a CustomResourceProviderProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :code-directory)]
    (. builder codeDirectory data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-some [data (lookup-entry config id :policy-statements)]
    (. builder policyStatements data))
  (when-some [data (custom-resource-provider-runtime config id :runtime)]
    (. builder runtime data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :use-cfn-response-wrapper)]
    (. builder useCfnResponseWrapper data))
  (.build builder))


(defn custom-resource-provider-props-builder
  "Creates a  `CustomResourceProviderProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[custom-resource-provider-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (custom-resource-provider-props-builder> (new CustomResourceProviderProps$Builder) id config))


(defn default-stack-synthesizer-builder>
  "The default-stack-synthesizer-builder> function updates a DefaultStackSynthesizer$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
    (. builder bootstrapStackVersionSsmParameter data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :cloud-formation-execution-role)]
    (. builder cloudFormationExecutionRole data))
  (when-some [data (lookup-entry config id :deploy-role-arn)]
    (. builder deployRoleArn data))
  (when-some [data (lookup-entry config id :deploy-role-external-id)]
    (. builder deployRoleExternalId data))
  (when-some [data (lookup-entry config id :docker-tag-prefix)]
    (. builder dockerTagPrefix data))
  (when-some [data (lookup-entry config id :file-asset-publishing-external-id)]
    (. builder fileAssetPublishingExternalId data))
  (when-some [data (lookup-entry config id :file-asset-publishing-role-arn)]
    (. builder fileAssetPublishingRoleArn data))
  (when-some [data (lookup-entry config id :file-assets-bucket-name)]
    (. builder fileAssetsBucketName data))
  (when-some [data (lookup-entry config id :generate-bootstrap-version-rule)]
    (. builder generateBootstrapVersionRule data))
  (when-some [data (lookup-entry config id :image-asset-publishing-external-id)]
    (. builder imageAssetPublishingExternalId data))
  (when-some [data (lookup-entry config id :image-asset-publishing-role-arn)]
    (. builder imageAssetPublishingRoleArn data))
  (when-some [data (lookup-entry config id :image-assets-repository-name)]
    (. builder imageAssetsRepositoryName data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :lookup-role-external-id)]
    (. builder lookupRoleExternalId data))
  (when-some [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (when-some [data (lookup-entry config id :use-lookup-role-for-stack-operations)]
    (. builder useLookupRoleForStackOperations data))
  (.build builder))


(defn default-stack-synthesizer-builder
  "Creates a  `DefaultStackSynthesizer$Builder` instance using a no-argument create, applies the data configuration using the [[default-stack-synthesizer-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (default-stack-synthesizer-builder> (DefaultStackSynthesizer$Builder/create) id config))


(defn default-stack-synthesizer-props-builder>
  "The default-stack-synthesizer-props-builder> function updates a DefaultStackSynthesizerProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
    (. builder bootstrapStackVersionSsmParameter data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :cloud-formation-execution-role)]
    (. builder cloudFormationExecutionRole data))
  (when-some [data (lookup-entry config id :deploy-role-arn)]
    (. builder deployRoleArn data))
  (when-some [data (lookup-entry config id :deploy-role-external-id)]
    (. builder deployRoleExternalId data))
  (when-some [data (lookup-entry config id :docker-tag-prefix)]
    (. builder dockerTagPrefix data))
  (when-some [data (lookup-entry config id :file-asset-publishing-external-id)]
    (. builder fileAssetPublishingExternalId data))
  (when-some [data (lookup-entry config id :file-asset-publishing-role-arn)]
    (. builder fileAssetPublishingRoleArn data))
  (when-some [data (lookup-entry config id :file-assets-bucket-name)]
    (. builder fileAssetsBucketName data))
  (when-some [data (lookup-entry config id :generate-bootstrap-version-rule)]
    (. builder generateBootstrapVersionRule data))
  (when-some [data (lookup-entry config id :image-asset-publishing-external-id)]
    (. builder imageAssetPublishingExternalId data))
  (when-some [data (lookup-entry config id :image-asset-publishing-role-arn)]
    (. builder imageAssetPublishingRoleArn data))
  (when-some [data (lookup-entry config id :image-assets-repository-name)]
    (. builder imageAssetsRepositoryName data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :lookup-role-external-id)]
    (. builder lookupRoleExternalId data))
  (when-some [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (when-some [data (lookup-entry config id :use-lookup-role-for-stack-operations)]
    (. builder useLookupRoleForStackOperations data))
  (.build builder))


(defn default-stack-synthesizer-props-builder
  "Creates a  `DefaultStackSynthesizerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[default-stack-synthesizer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (default-stack-synthesizer-props-builder> (new DefaultStackSynthesizerProps$Builder) id config))


(defn docker-build-options-builder>
  "The docker-build-options-builder> function updates a DockerBuildOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :build-args)]
    (. builder buildArgs data))
  (when-some [data (lookup-entry config id :cache-disabled)]
    (. builder cacheDisabled data))
  (when-some [data (lookup-entry config id :cache-from)]
    (. builder cacheFrom data))
  (when-some [data (lookup-entry config id :cache-to)]
    (. builder cacheTo data))
  (when-some [data (lookup-entry config id :file)]
    (. builder file data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-some [data (lookup-entry config id :target-stage)]
    (. builder targetStage data))
  (.build builder))


(defn docker-build-options-builder
  "Creates a  `DockerBuildOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[docker-build-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (docker-build-options-builder> (new DockerBuildOptions$Builder) id config))


(defn docker-cache-option-builder>
  "The docker-cache-option-builder> function updates a DockerCacheOption$Builder instance using the provided configuration.
  The function takes the DockerCacheOption$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `params` | java.util.Map | [[cdk.support/lookup-entry]] | `:params` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^DockerCacheOption$Builder builder id config]
  (when-some [data (lookup-entry config id :params)]
    (. builder params data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn docker-cache-option-builder
  "Creates a  `DockerCacheOption$Builder` instance using a no-argument constructor, applies the data configuration using the [[docker-cache-option-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (docker-cache-option-builder> (new DockerCacheOption$Builder) id config))


(defn docker-image-asset-location-builder>
  "The docker-image-asset-location-builder> function updates a DockerImageAssetLocation$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (when-some [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn docker-image-asset-location-builder
  "Creates a  `DockerImageAssetLocation$Builder` instance using a no-argument constructor, applies the data configuration using the [[docker-image-asset-location-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (docker-image-asset-location-builder> (new DockerImageAssetLocation$Builder) id config))


(defn docker-image-asset-source-builder>
  "The docker-image-asset-source-builder> function updates a DockerImageAssetSource$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :asset-name)]
    (. builder assetName data))
  (when-some [data (lookup-entry config id :directory-name)]
    (. builder directoryName data))
  (when-some [data (lookup-entry config id :docker-build-args)]
    (. builder dockerBuildArgs data))
  (when-some [data (lookup-entry config id :docker-build-secrets)]
    (. builder dockerBuildSecrets data))
  (when-some [data (lookup-entry config id :docker-build-ssh)]
    (. builder dockerBuildSsh data))
  (when-some [data (lookup-entry config id :docker-build-target)]
    (. builder dockerBuildTarget data))
  (when-some [data (lookup-entry config id :docker-cache-disabled)]
    (. builder dockerCacheDisabled data))
  (when-some [data (lookup-entry config id :docker-cache-from)]
    (. builder dockerCacheFrom data))
  (when-some [data (lookup-entry config id :docker-cache-to)]
    (. builder dockerCacheTo data))
  (when-some [data (lookup-entry config id :docker-file)]
    (. builder dockerFile data))
  (when-some [data (lookup-entry config id :docker-outputs)]
    (. builder dockerOutputs data))
  (when-some [data (lookup-entry config id :executable)]
    (. builder executable data))
  (when-some [data (lookup-entry config id :network-mode)]
    (. builder networkMode data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-some [data (lookup-entry config id :source-hash)]
    (. builder sourceHash data))
  (.build builder))


(defn docker-image-asset-source-builder
  "Creates a  `DockerImageAssetSource$Builder` instance using a no-argument constructor, applies the data configuration using the [[docker-image-asset-source-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (docker-image-asset-source-builder> (new DockerImageAssetSource$Builder) id config))


(defn docker-run-options-builder>
  "The docker-run-options-builder> function updates a DockerRunOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :entrypoint)]
    (. builder entrypoint data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :network)]
    (. builder network data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-some [data (lookup-entry config id :security-opt)]
    (. builder securityOpt data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (when-some [data (lookup-entry config id :volumes-from)]
    (. builder volumesFrom data))
  (when-some [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn docker-run-options-builder
  "Creates a  `DockerRunOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[docker-run-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (docker-run-options-builder> (new DockerRunOptions$Builder) id config))


(defn docker-volume-builder>
  "The docker-volume-builder> function updates a DockerVolume$Builder instance using the provided configuration.
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
  (when-some [data (docker-volume-consistency config id :consistency)]
    (. builder consistency data))
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (.build builder))


(defn docker-volume-builder
  "Creates a  `DockerVolume$Builder` instance using a no-argument constructor, applies the data configuration using the [[docker-volume-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (docker-volume-builder> (new DockerVolume$Builder) id config))


(defn encoding-options-builder>
  "The encoding-options-builder> function updates a EncodingOptions$Builder instance using the provided configuration.
  The function takes the EncodingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
"
  [^EncodingOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :display-hint)]
    (. builder displayHint data))
  (.build builder))


(defn encoding-options-builder
  "Creates a  `EncodingOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[encoding-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (encoding-options-builder> (new EncodingOptions$Builder) id config))


(defn environment-builder>
  "The environment-builder> function updates a Environment$Builder instance using the provided configuration.
  The function takes the Environment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^Environment$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn environment-builder
  "Creates a  `Environment$Builder` instance using a no-argument constructor, applies the data configuration using the [[environment-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (environment-builder> (new Environment$Builder) id config))


(defn export-value-options-builder>
  "The export-value-options-builder> function updates a ExportValueOptions$Builder instance using the provided configuration.
  The function takes the ExportValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^ExportValueOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn export-value-options-builder
  "Creates a  `ExportValueOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[export-value-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (export-value-options-builder> (new ExportValueOptions$Builder) id config))


(defn file-asset-location-builder>
  "The file-asset-location-builder> function updates a FileAssetLocation$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :http-url)]
    (. builder httpUrl data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (when-some [data (lookup-entry config id :s3-object-url)]
    (. builder s3ObjectUrl data))
  (when-some [data (lookup-entry config id :s3-object-url-with-placeholders)]
    (. builder s3ObjectUrlWithPlaceholders data))
  (.build builder))


(defn file-asset-location-builder
  "Creates a  `FileAssetLocation$Builder` instance using a no-argument constructor, applies the data configuration using the [[file-asset-location-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (file-asset-location-builder> (new FileAssetLocation$Builder) id config))


(defn file-asset-source-builder>
  "The file-asset-source-builder> function updates a FileAssetSource$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deploy-time)]
    (. builder deployTime data))
  (when-some [data (lookup-entry config id :executable)]
    (. builder executable data))
  (when-some [data (lookup-entry config id :file-name)]
    (. builder fileName data))
  (when-some [data (file-asset-packaging config id :packaging)]
    (. builder packaging data))
  (when-some [data (lookup-entry config id :source-hash)]
    (. builder sourceHash data))
  (.build builder))


(defn file-asset-source-builder
  "Creates a  `FileAssetSource$Builder` instance using a no-argument constructor, applies the data configuration using the [[file-asset-source-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (file-asset-source-builder> (new FileAssetSource$Builder) id config))


(defn file-copy-options-builder>
  "The file-copy-options-builder> function updates a FileCopyOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-some [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-some [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (.build builder))


(defn file-copy-options-builder
  "Creates a  `FileCopyOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[file-copy-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (file-copy-options-builder> (new FileCopyOptions$Builder) id config))


(defn file-fingerprint-options-builder>
  "The file-fingerprint-options-builder> function updates a FileFingerprintOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-some [data (lookup-entry config id :extra-hash)]
    (. builder extraHash data))
  (when-some [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-some [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (.build builder))


(defn file-fingerprint-options-builder
  "Creates a  `FileFingerprintOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[file-fingerprint-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (file-fingerprint-options-builder> (new FileFingerprintOptions$Builder) id config))


(defn fingerprint-options-builder>
  "The fingerprint-options-builder> function updates a FingerprintOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-some [data (lookup-entry config id :extra-hash)]
    (. builder extraHash data))
  (when-some [data (symlink-follow-mode config id :follow)]
    (. builder follow data))
  (when-some [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (.build builder))


(defn fingerprint-options-builder
  "Creates a  `FingerprintOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[fingerprint-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (fingerprint-options-builder> (new FingerprintOptions$Builder) id config))


(defn get-context-key-options-builder>
  "The get-context-key-options-builder> function updates a GetContextKeyOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :include-environment)]
    (. builder includeEnvironment data))
  (when-some [data (lookup-entry config id :props)]
    (. builder props data))
  (when-some [data (lookup-entry config id :provider)]
    (. builder provider data))
  (.build builder))


(defn get-context-key-options-builder
  "Creates a  `GetContextKeyOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[get-context-key-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (get-context-key-options-builder> (new GetContextKeyOptions$Builder) id config))


(defn get-context-key-result-builder>
  "The get-context-key-result-builder> function updates a GetContextKeyResult$Builder instance using the provided configuration.
  The function takes the GetContextKeyResult$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `props` | java.util.Map | [[cdk.support/lookup-entry]] | `:props` |
"
  [^GetContextKeyResult$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :props)]
    (. builder props data))
  (.build builder))


(defn get-context-key-result-builder
  "Creates a  `GetContextKeyResult$Builder` instance using a no-argument constructor, applies the data configuration using the [[get-context-key-result-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (get-context-key-result-builder> (new GetContextKeyResult$Builder) id config))


(defn get-context-value-options-builder>
  "The get-context-value-options-builder> function updates a GetContextValueOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dummy-value)]
    (. builder dummyValue data))
  (when-some [data (lookup-entry config id :include-environment)]
    (. builder includeEnvironment data))
  (when-some [data (lookup-entry config id :props)]
    (. builder props data))
  (when-some [data (lookup-entry config id :provider)]
    (. builder provider data))
  (.build builder))


(defn get-context-value-options-builder
  "Creates a  `GetContextValueOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[get-context-value-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (get-context-value-options-builder> (new GetContextValueOptions$Builder) id config))


(defn get-context-value-result-builder>
  "The get-context-value-result-builder> function updates a GetContextValueResult$Builder instance using the provided configuration.
  The function takes the GetContextValueResult$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^GetContextValueResult$Builder builder id config]
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn get-context-value-result-builder
  "Creates a  `GetContextValueResult$Builder` instance using a no-argument constructor, applies the data configuration using the [[get-context-value-result-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (get-context-value-result-builder> (new GetContextValueResult$Builder) id config))


(defn intrinsic-builder>
  "The intrinsic-builder> function updates a Intrinsic$Builder instance using the provided configuration.
  The function takes the Intrinsic$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackTrace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-trace` |
| `typeHint` | software.amazon.awscdk.ResolutionTypeHint | [[cdk.api/resolution-type-hint]] | `:type-hint` |
"
  [^Intrinsic$Builder builder id config]
  (when-some [data (lookup-entry config id :stack-trace)]
    (. builder stackTrace data))
  (when-some [data (resolution-type-hint config id :type-hint)]
    (. builder typeHint data))
  (.build builder))


(defn intrinsic-builder
  "Creates a  `Intrinsic$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[java.lang.Object]___

| Argument | DataType | Description |
|---|---|---|
| `value` | java.lang.Object |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^Object value id config]
  (intrinsic-builder> (Intrinsic$Builder/create value) id config))


(defn intrinsic-props-builder>
  "The intrinsic-props-builder> function updates a IntrinsicProps$Builder instance using the provided configuration.
  The function takes the IntrinsicProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackTrace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-trace` |
| `typeHint` | software.amazon.awscdk.ResolutionTypeHint | [[cdk.api/resolution-type-hint]] | `:type-hint` |
"
  [^IntrinsicProps$Builder builder id config]
  (when-some [data (lookup-entry config id :stack-trace)]
    (. builder stackTrace data))
  (when-some [data (resolution-type-hint config id :type-hint)]
    (. builder typeHint data))
  (.build builder))


(defn intrinsic-props-builder
  "Creates a  `IntrinsicProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[intrinsic-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (intrinsic-props-builder> (new IntrinsicProps$Builder) id config))


(defn lazy-any-value-options-builder>
  "The lazy-any-value-options-builder> function updates a LazyAnyValueOptions$Builder instance using the provided configuration.
  The function takes the LazyAnyValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
| `omitEmptyArray` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:omit-empty-array` |
"
  [^LazyAnyValueOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :display-hint)]
    (. builder displayHint data))
  (when-some [data (lookup-entry config id :omit-empty-array)]
    (. builder omitEmptyArray data))
  (.build builder))


(defn lazy-any-value-options-builder
  "Creates a  `LazyAnyValueOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[lazy-any-value-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (lazy-any-value-options-builder> (new LazyAnyValueOptions$Builder) id config))


(defn lazy-list-value-options-builder>
  "The lazy-list-value-options-builder> function updates a LazyListValueOptions$Builder instance using the provided configuration.
  The function takes the LazyListValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
| `omitEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:omit-empty` |
"
  [^LazyListValueOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :display-hint)]
    (. builder displayHint data))
  (when-some [data (lookup-entry config id :omit-empty)]
    (. builder omitEmpty data))
  (.build builder))


(defn lazy-list-value-options-builder
  "Creates a  `LazyListValueOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[lazy-list-value-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (lazy-list-value-options-builder> (new LazyListValueOptions$Builder) id config))


(defn lazy-string-value-options-builder>
  "The lazy-string-value-options-builder> function updates a LazyStringValueOptions$Builder instance using the provided configuration.
  The function takes the LazyStringValueOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayHint` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-hint` |
"
  [^LazyStringValueOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :display-hint)]
    (. builder displayHint data))
  (.build builder))


(defn lazy-string-value-options-builder
  "Creates a  `LazyStringValueOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[lazy-string-value-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (lazy-string-value-options-builder> (new LazyStringValueOptions$Builder) id config))


(defn nested-stack-builder>
  "The nested-stack-builder> function updates a NestedStack$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn nested-stack-builder
  "Creates a  `NestedStack$Builder` instance using a scope and ID, applies the data configuration using the [[nested-stack-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (nested-stack-builder> (NestedStack$Builder/create scope (name id)) id config))


(defn nested-stack-props-builder>
  "The nested-stack-props-builder> function updates a NestedStackProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn nested-stack-props-builder
  "Creates a  `NestedStackProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[nested-stack-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (nested-stack-props-builder> (new NestedStackProps$Builder) id config))


(defn permissions-boundary-bind-options-builder
  "Creates a  `PermissionsBoundaryBindOptions$Builder` instance using a no-argument construct, then builds it."
  []
  (.build (new PermissionsBoundaryBindOptions$Builder)))


(defn policy-validation-plugin-report-beta1-builder>
  "The policy-validation-plugin-report-beta1-builder> function updates a PolicyValidationPluginReportBeta1$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-some [data (lookup-entry config id :plugin-version)]
    (. builder pluginVersion data))
  (when-some [data (lookup-entry config id :success)]
    (. builder success data))
  (when-some [data (lookup-entry config id :violations)]
    (. builder violations data))
  (.build builder))


(defn policy-validation-plugin-report-beta1-builder
  "Creates a  `PolicyValidationPluginReportBeta1$Builder` instance using a no-argument constructor, applies the data configuration using the [[policy-validation-plugin-report-beta1-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (policy-validation-plugin-report-beta1-builder> (new PolicyValidationPluginReportBeta1$Builder) id config))


(defn policy-violating-resource-beta1-builder>
  "The policy-violating-resource-beta1-builder> function updates a PolicyViolatingResourceBeta1$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :locations)]
    (. builder locations data))
  (when-some [data (lookup-entry config id :resource-logical-id)]
    (. builder resourceLogicalId data))
  (when-some [data (lookup-entry config id :template-path)]
    (. builder templatePath data))
  (.build builder))


(defn policy-violating-resource-beta1-builder
  "Creates a  `PolicyViolatingResourceBeta1$Builder` instance using a no-argument constructor, applies the data configuration using the [[policy-violating-resource-beta1-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (policy-violating-resource-beta1-builder> (new PolicyViolatingResourceBeta1$Builder) id config))


(defn policy-violation-beta1-builder>
  "The policy-violation-beta1-builder> function updates a PolicyViolationBeta1$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fix)]
    (. builder fix data))
  (when-some [data (lookup-entry config id :rule-metadata)]
    (. builder ruleMetadata data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :severity)]
    (. builder severity data))
  (when-some [data (lookup-entry config id :violating-resources)]
    (. builder violatingResources data))
  (.build builder))


(defn policy-violation-beta1-builder
  "Creates a  `PolicyViolationBeta1$Builder` instance using a no-argument constructor, applies the data configuration using the [[policy-violation-beta1-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (policy-violation-beta1-builder> (new PolicyViolationBeta1$Builder) id config))


(defn removal-policy-options-builder>
  "The removal-policy-options-builder> function updates a RemovalPolicyOptions$Builder instance using the provided configuration.
  The function takes the RemovalPolicyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyToUpdateReplacePolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-to-update-replace-policy` |
| `defaultValue` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:default-value` |
"
  [^RemovalPolicyOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :apply-to-update-replace-policy)]
    (. builder applyToUpdateReplacePolicy data))
  (when-some [data (removal-policy config id :default-value)]
    (. builder defaultValue data))
  (.build builder))


(defn removal-policy-options-builder
  "Creates a  `RemovalPolicyOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[removal-policy-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (removal-policy-options-builder> (new RemovalPolicyOptions$Builder) id config))


(defn remove-tag-builder>
  "The remove-tag-builder> function updates a RemoveTag$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :apply-to-launched-instances)]
    (. builder applyToLaunchedInstances data))
  (when-some [data (lookup-entry config id :exclude-resource-types)]
    (. builder excludeResourceTypes data))
  (when-some [data (lookup-entry config id :include-resource-types)]
    (. builder includeResourceTypes data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn remove-tag-builder
  "Creates a  `RemoveTag$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[java.lang.String]___

| Argument | DataType | Description |
|---|---|---|
| `tag-key` | java.lang.String |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^String tag-key id config]
  (remove-tag-builder> (RemoveTag$Builder/create tag-key) id config))


(defn resolve-change-context-options-builder>
  "The resolve-change-context-options-builder> function updates a ResolveChangeContextOptions$Builder instance using the provided configuration.
  The function takes the ResolveChangeContextOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowIntrinsicKeys` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-intrinsic-keys` |
| `removeEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-empty` |
"
  [^ResolveChangeContextOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-intrinsic-keys)]
    (. builder allowIntrinsicKeys data))
  (when-some [data (lookup-entry config id :remove-empty)]
    (. builder removeEmpty data))
  (.build builder))


(defn resolve-change-context-options-builder
  "Creates a  `ResolveChangeContextOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[resolve-change-context-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (resolve-change-context-options-builder> (new ResolveChangeContextOptions$Builder) id config))


(defn resolve-options-builder>
  "The resolve-options-builder> function updates a ResolveOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :preparing)]
    (. builder preparing data))
  (when-some [data (lookup-entry config id :remove-empty)]
    (. builder removeEmpty data))
  (when-some [data (lookup-entry config id :resolver)]
    (. builder resolver data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn resolve-options-builder
  "Creates a  `ResolveOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[resolve-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (resolve-options-builder> (new ResolveOptions$Builder) id config))


(defn resource-environment-builder>
  "The resource-environment-builder> function updates a ResourceEnvironment$Builder instance using the provided configuration.
  The function takes the ResourceEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^ResourceEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn resource-environment-builder
  "Creates a  `ResourceEnvironment$Builder` instance using a no-argument constructor, applies the data configuration using the [[resource-environment-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (resource-environment-builder> (new ResourceEnvironment$Builder) id config))


(defn resource-props-builder>
  "The resource-props-builder> function updates a ResourceProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :environment-from-arn)]
    (. builder environmentFromArn data))
  (when-some [data (lookup-entry config id :physical-name)]
    (. builder physicalName data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn resource-props-builder
  "Creates a  `ResourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[resource-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (resource-props-builder> (new ResourceProps$Builder) id config))


(defn reverse-options-builder>
  "The reverse-options-builder> function updates a ReverseOptions$Builder instance using the provided configuration.
  The function takes the ReverseOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failConcat` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-concat` |
"
  [^ReverseOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :fail-concat)]
    (. builder failConcat data))
  (.build builder))


(defn reverse-options-builder
  "Creates a  `ReverseOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[reverse-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (reverse-options-builder> (new ReverseOptions$Builder) id config))


(defn role-options-builder>
  "The role-options-builder> function updates a RoleOptions$Builder instance using the provided configuration.
  The function takes the RoleOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |
"
  [^RoleOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :assume-role-arn)]
    (. builder assumeRoleArn data))
  (when-some [data (lookup-entry config id :assume-role-external-id)]
    (. builder assumeRoleExternalId data))
  (.build builder))


(defn role-options-builder
  "Creates a  `RoleOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[role-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (role-options-builder> (new RoleOptions$Builder) id config))


(defn secret-value-builder>
  "The secret-value-builder> function updates a SecretValue$Builder instance using the provided configuration.
  The function takes the SecretValue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackTrace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-trace` |
| `typeHint` | software.amazon.awscdk.ResolutionTypeHint | [[cdk.api/resolution-type-hint]] | `:type-hint` |
"
  [^SecretValue$Builder builder id config]
  (when-some [data (lookup-entry config id :stack-trace)]
    (. builder stackTrace data))
  (when-some [data (resolution-type-hint config id :type-hint)]
    (. builder typeHint data))
  (.build builder))


(defn secret-value-builder
  "Creates a  `SecretValue$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[java.lang.Object]___

| Argument | DataType | Description |
|---|---|---|
| `protected-value` | java.lang.Object | Either a plain text builder, or an instance of [[cfn-dynamic-reference-service]] |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^Object protected-value id config]
  (secret-value-builder> (SecretValue$Builder/create protected-value) id config))


(defn secrets-manager-secret-options-builder>
  "The secrets-manager-secret-options-builder> function updates a SecretsManagerSecretOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :json-field)]
    (. builder jsonField data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (when-some [data (lookup-entry config id :version-stage)]
    (. builder versionStage data))
  (.build builder))


(defn secrets-manager-secret-options-builder
  "Creates a  `SecretsManagerSecretOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[secrets-manager-secret-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (secrets-manager-secret-options-builder> (new SecretsManagerSecretOptions$Builder) id config))


(defn size-conversion-options-builder>
  "The size-conversion-options-builder> function updates a SizeConversionOptions$Builder instance using the provided configuration.
  The function takes the SizeConversionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rounding` | software.amazon.awscdk.SizeRoundingBehavior | [[cdk.api/size-rounding-behavior]] | `:rounding` |
"
  [^SizeConversionOptions$Builder builder id config]
  (when-some [data (size-rounding-behavior config id :rounding)]
    (. builder rounding data))
  (.build builder))


(defn size-conversion-options-builder
  "Creates a  `SizeConversionOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[size-conversion-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (size-conversion-options-builder> (new SizeConversionOptions$Builder) id config))


(defn stack-builder>
  "The stack-builder> function updates a Stack$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :analytics-reporting)]
    (. builder analyticsReporting data))
  (when-some [data (lookup-entry config id :cross-region-references)]
    (. builder crossRegionReferences data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :env)]
    (. builder env data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :suppress-template-indentation)]
    (. builder suppressTemplateIndentation data))
  (when-some [data (lookup-entry config id :synthesizer)]
    (. builder synthesizer data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :termination-protection)]
    (. builder terminationProtection data))
  (.build builder))


(defn stack-builder
  "Creates a  `Stack$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[]___

| Argument | DataType | Description |
|---|---|---|

| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |


__Create Form:__ ___[software.constructs.Construct java.lang.String]___

| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  ([id config]
   (stack-builder> (Stack$Builder/create) id config))
  ([^Construct scope id config]
   (stack-builder> (Stack$Builder/create scope (name id)) id config)))


(defn stack-props-builder>
  "The stack-props-builder> function updates a StackProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :analytics-reporting)]
    (. builder analyticsReporting data))
  (when-some [data (lookup-entry config id :cross-region-references)]
    (. builder crossRegionReferences data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :env)]
    (. builder env data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :suppress-template-indentation)]
    (. builder suppressTemplateIndentation data))
  (when-some [data (lookup-entry config id :synthesizer)]
    (. builder synthesizer data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :termination-protection)]
    (. builder terminationProtection data))
  (.build builder))


(defn stack-props-builder
  "Creates a  `StackProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[stack-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (stack-props-builder> (new StackProps$Builder) id config))


(defn stage-builder>
  "The stage-builder> function updates a Stage$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :env)]
    (. builder env data))
  (when-some [data (lookup-entry config id :outdir)]
    (. builder outdir data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :policy-validation-beta1)]
    (. builder policyValidationBeta1 data))
  (when-some [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn stage-builder
  "Creates a  `Stage$Builder` instance using a scope and ID, applies the data configuration using the [[stage-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (stage-builder> (Stage$Builder/create scope (name id)) id config))


(defn stage-props-builder>
  "The stage-props-builder> function updates a StageProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :env)]
    (. builder env data))
  (when-some [data (lookup-entry config id :outdir)]
    (. builder outdir data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :policy-validation-beta1)]
    (. builder policyValidationBeta1 data))
  (when-some [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn stage-props-builder
  "Creates a  `StageProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[stage-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (stage-props-builder> (new StageProps$Builder) id config))


(defn stage-synthesis-options-builder>
  "The stage-synthesis-options-builder> function updates a StageSynthesisOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :force)]
    (. builder force data))
  (when-some [data (lookup-entry config id :skip-validation)]
    (. builder skipValidation data))
  (when-some [data (lookup-entry config id :validate-on-synthesis)]
    (. builder validateOnSynthesis data))
  (.build builder))


(defn stage-synthesis-options-builder
  "Creates a  `StageSynthesisOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[stage-synthesis-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (stage-synthesis-options-builder> (new StageSynthesisOptions$Builder) id config))


(defn synthesize-stack-artifact-options-builder>
  "The synthesize-stack-artifact-options-builder> function updates a SynthesizeStackArtifactOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :additional-dependencies)]
    (. builder additionalDependencies data))
  (when-some [data (lookup-entry config id :assume-role-arn)]
    (. builder assumeRoleArn data))
  (when-some [data (lookup-entry config id :assume-role-external-id)]
    (. builder assumeRoleExternalId data))
  (when-some [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
    (. builder bootstrapStackVersionSsmParameter data))
  (when-some [data (lookup-entry config id :cloud-formation-execution-role-arn)]
    (. builder cloudFormationExecutionRoleArn data))
  (when-some [data (lookup-entry config id :lookup-role)]
    (. builder lookupRole data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :requires-bootstrap-stack-version)]
    (. builder requiresBootstrapStackVersion data))
  (when-some [data (lookup-entry config id :stack-template-asset-object-url)]
    (. builder stackTemplateAssetObjectUrl data))
  (.build builder))


(defn synthesize-stack-artifact-options-builder
  "Creates a  `SynthesizeStackArtifactOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[synthesize-stack-artifact-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (synthesize-stack-artifact-options-builder> (new SynthesizeStackArtifactOptions$Builder) id config))


(defn tag-builder>
  "The tag-builder> function updates a Tag$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :apply-to-launched-instances)]
    (. builder applyToLaunchedInstances data))
  (when-some [data (lookup-entry config id :exclude-resource-types)]
    (. builder excludeResourceTypes data))
  (when-some [data (lookup-entry config id :include-resource-types)]
    (. builder includeResourceTypes data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn tag-builder
  "Creates a  `Tag$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[java.lang.String java.lang.String]___

| Argument | DataType | Description |
|---|---|---|
| `tag-key` | java.lang.String |  |
| `tag-value` | java.lang.String |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^String tag-key ^String tag-value id config]
  (tag-builder> (Tag$Builder/create tag-key tag-value) id config))


(defn tag-manager-builder>
  "The tag-manager-builder> function updates a TagManager$Builder instance using the provided configuration.
  The function takes the TagManager$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagPropertyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-property-name` |
"
  [^TagManager$Builder builder id config]
  (when-some [data (lookup-entry config id :tag-property-name)]
    (. builder tagPropertyName data))
  (.build builder))


(defn tag-manager-builder
  "Creates a  `TagManager$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.TagType java.lang.String]___

| Argument | DataType | Description |
|---|---|---|
| `tag-type` | software.amazon.awscdk.TagType |  |
| `resource-manager` | java.lang.String |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |


__Create Form:__ ___[software.amazon.awscdk.TagType java.lang.String java.lang.Object]___

| Argument | DataType | Description |
|---|---|---|
| `tag-type` | software.amazon.awscdk.TagType |  |
| `resource-manager` | java.lang.String |  |
| `initial-tags` | java.lang.Object |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  ([^TagType tag-type ^String resource-manager id config]
   (tag-manager-builder> (TagManager$Builder/create tag-type resource-manager) id config))
  ([^TagType tag-type ^String resource-manager ^Object initial-tags id config]
   (tag-manager-builder> (TagManager$Builder/create tag-type resource-manager initial-tags) id config)))


(defn tag-manager-options-builder>
  "The tag-manager-options-builder> function updates a TagManagerOptions$Builder instance using the provided configuration.
  The function takes the TagManagerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagPropertyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-property-name` |
"
  [^TagManagerOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :tag-property-name)]
    (. builder tagPropertyName data))
  (.build builder))


(defn tag-manager-options-builder
  "Creates a  `TagManagerOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[tag-manager-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (tag-manager-options-builder> (new TagManagerOptions$Builder) id config))


(defn tag-props-builder>
  "The tag-props-builder> function updates a TagProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :apply-to-launched-instances)]
    (. builder applyToLaunchedInstances data))
  (when-some [data (lookup-entry config id :exclude-resource-types)]
    (. builder excludeResourceTypes data))
  (when-some [data (lookup-entry config id :include-resource-types)]
    (. builder includeResourceTypes data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn tag-props-builder
  "Creates a  `TagProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[tag-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (tag-props-builder> (new TagProps$Builder) id config))


(defn time-conversion-options-builder>
  "The time-conversion-options-builder> function updates a TimeConversionOptions$Builder instance using the provided configuration.
  The function takes the TimeConversionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `integral` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:integral` |
"
  [^TimeConversionOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :integral)]
    (. builder integral data))
  (.build builder))


(defn time-conversion-options-builder
  "Creates a  `TimeConversionOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[time-conversion-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (time-conversion-options-builder> (new TimeConversionOptions$Builder) id config))


(defn unique-resource-name-options-builder>
  "The unique-resource-name-options-builder> function updates a UniqueResourceNameOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :allowed-special-characters)]
    (. builder allowedSpecialCharacters data))
  (when-some [data (lookup-entry config id :max-length)]
    (. builder maxLength data))
  (when-some [data (lookup-entry config id :separator)]
    (. builder separator data))
  (.build builder))


(defn unique-resource-name-options-builder
  "Creates a  `UniqueResourceNameOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[unique-resource-name-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (unique-resource-name-options-builder> (new UniqueResourceNameOptions$Builder) id config))