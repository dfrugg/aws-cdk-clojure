(ns cdk.api.pipelines
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.pipelines package. "
  (:require [cdk.api.services.codepipeline.actions :refer [code-commit-trigger
                                                           git-hub-trigger
                                                           s3-trigger]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.pipelines AddStageOpts$Builder
                                             AssetType
                                             CodeBuildOptions$Builder
                                             CodeBuildStep$Builder
                                             CodeBuildStepProps$Builder
                                             CodeCommitSourceOptions$Builder
                                             CodePipeline$Builder
                                             CodePipelineActionFactoryResult$Builder
                                             CodePipelineProps$Builder
                                             ConfirmPermissionsBroadening$Builder
                                             ConnectionSourceOptions$Builder
                                             DockerCredentialUsage
                                             ECRSourceOptions$Builder
                                             EcrDockerCredentialOptions$Builder
                                             ExternalDockerCredentialOptions$Builder
                                             FileSetLocation$Builder
                                             GitHubSourceOptions$Builder
                                             ManualApprovalStep$Builder
                                             ManualApprovalStepProps$Builder
                                             PermissionsBroadeningCheckProps$Builder
                                             PipelineBaseProps$Builder
                                             ProduceActionOptions$Builder
                                             S3SourceOptions$Builder
                                             ShellStep$Builder
                                             ShellStepProps$Builder
                                             StackAsset$Builder
                                             StackDeploymentProps$Builder
                                             StackSteps$Builder
                                             StageDeploymentProps$Builder
                                             Wave$Builder
                                             WaveOptions$Builder
                                             WaveProps$Builder]))


(defn asset-type
  "The `asset-type` function data interprets values in the provided config data into a 
`AssetType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AssetType` - the value is returned.
* is `:docker-image` - `AssetType/DOCKER_IMAGE` is returned
* is `:file` - `AssetType/FILE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AssetType data) data
      (= :docker-image data) AssetType/DOCKER_IMAGE
      (= :file data) AssetType/FILE)))


(defn docker-credential-usage
  "The `docker-credential-usage` function data interprets values in the provided config data into a 
`DockerCredentialUsage` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DockerCredentialUsage` - the value is returned.
* is `:self-update` - `DockerCredentialUsage/SELF_UPDATE` is returned
* is `:synth` - `DockerCredentialUsage/SYNTH` is returned
* is `:asset-publishing` - `DockerCredentialUsage/ASSET_PUBLISHING` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DockerCredentialUsage data) data
      (= :self-update data) DockerCredentialUsage/SELF_UPDATE
      (= :synth data) DockerCredentialUsage/SYNTH
      (= :asset-publishing data) DockerCredentialUsage/ASSET_PUBLISHING)))


(defn build-add-stage-opts-builder
  "The build-add-stage-opts-builder function updates a AddStageOpts$Builder instance using the provided configuration.
  The function takes the AddStageOpts$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
| `stackSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-steps` |
"
  [^AddStageOpts$Builder builder id config]
  (when-let [data (lookup-entry config id :post)]
    (. builder post data))
  (when-let [data (lookup-entry config id :pre)]
    (. builder pre data))
  (when-let [data (lookup-entry config id :stack-steps)]
    (. builder stackSteps data))
  (.build builder))


(defn add-stage-opts-builder
  ""
  [id config]
  (build-add-stage-opts-builder (new AddStageOpts$Builder) id config))


(defn build-code-build-options-builder
  "The build-code-build-options-builder function updates a CodeBuildOptions$Builder instance using the provided configuration.
  The function takes the CodeBuildOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildEnvironment` | software.amazon.awscdk.services.codebuild.BuildEnvironment | [[cdk.support/lookup-entry]] | `:build-environment` |
| `cache` | software.amazon.awscdk.services.codebuild.Cache | [[cdk.support/lookup-entry]] | `:cache` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `logging` | software.amazon.awscdk.services.codebuild.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `partialBuildSpec` | software.amazon.awscdk.services.codebuild.BuildSpec | [[cdk.support/lookup-entry]] | `:partial-build-spec` |
| `rolePolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:role-policy` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CodeBuildOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :build-environment)]
    (. builder buildEnvironment data))
  (when-let [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-let [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-let [data (lookup-entry config id :partial-build-spec)]
    (. builder partialBuildSpec data))
  (when-let [data (lookup-entry config id :role-policy)]
    (. builder rolePolicy data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn code-build-options-builder
  ""
  [id config]
  (build-code-build-options-builder (new CodeBuildOptions$Builder) id config))


(defn build-code-build-step-builder
  "The build-code-build-step-builder function updates a CodeBuildStep$Builder instance using the provided configuration.
  The function takes the CodeBuildStep$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:action-role` |
| `additionalInputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-inputs` |
| `buildEnvironment` | software.amazon.awscdk.services.codebuild.BuildEnvironment | [[cdk.support/lookup-entry]] | `:build-environment` |
| `cache` | software.amazon.awscdk.services.codebuild.Cache | [[cdk.support/lookup-entry]] | `:cache` |
| `commands` | java.util.List | [[cdk.support/lookup-entry]] | `:commands` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `envFromCfnOutputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:env-from-cfn-outputs` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `input` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:input` |
| `installCommands` | java.util.List | [[cdk.support/lookup-entry]] | `:install-commands` |
| `logging` | software.amazon.awscdk.services.codebuild.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `partialBuildSpec` | software.amazon.awscdk.services.codebuild.BuildSpec | [[cdk.support/lookup-entry]] | `:partial-build-spec` |
| `primaryOutputDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-output-directory` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `rolePolicyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:role-policy-statements` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CodeBuildStep$Builder builder id config]
  (when-let [data (lookup-entry config id :action-role)]
    (. builder actionRole data))
  (when-let [data (lookup-entry config id :additional-inputs)]
    (. builder additionalInputs data))
  (when-let [data (lookup-entry config id :build-environment)]
    (. builder buildEnvironment data))
  (when-let [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-let [data (lookup-entry config id :commands)]
    (. builder commands data))
  (when-let [data (lookup-entry config id :env)]
    (. builder env data))
  (when-let [data (lookup-entry config id :env-from-cfn-outputs)]
    (. builder envFromCfnOutputs data))
  (when-let [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :install-commands)]
    (. builder installCommands data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-let [data (lookup-entry config id :partial-build-spec)]
    (. builder partialBuildSpec data))
  (when-let [data (lookup-entry config id :primary-output-directory)]
    (. builder primaryOutputDirectory data))
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :role-policy-statements)]
    (. builder rolePolicyStatements data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn build-code-build-step-props-builder
  "The build-code-build-step-props-builder function updates a CodeBuildStepProps$Builder instance using the provided configuration.
  The function takes the CodeBuildStepProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:action-role` |
| `additionalInputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-inputs` |
| `buildEnvironment` | software.amazon.awscdk.services.codebuild.BuildEnvironment | [[cdk.support/lookup-entry]] | `:build-environment` |
| `cache` | software.amazon.awscdk.services.codebuild.Cache | [[cdk.support/lookup-entry]] | `:cache` |
| `commands` | java.util.List | [[cdk.support/lookup-entry]] | `:commands` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `envFromCfnOutputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:env-from-cfn-outputs` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `input` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:input` |
| `installCommands` | java.util.List | [[cdk.support/lookup-entry]] | `:install-commands` |
| `logging` | software.amazon.awscdk.services.codebuild.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `partialBuildSpec` | software.amazon.awscdk.services.codebuild.BuildSpec | [[cdk.support/lookup-entry]] | `:partial-build-spec` |
| `primaryOutputDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-output-directory` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `rolePolicyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:role-policy-statements` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CodeBuildStepProps$Builder builder id config]
  (when-let [data (lookup-entry config id :action-role)]
    (. builder actionRole data))
  (when-let [data (lookup-entry config id :additional-inputs)]
    (. builder additionalInputs data))
  (when-let [data (lookup-entry config id :build-environment)]
    (. builder buildEnvironment data))
  (when-let [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-let [data (lookup-entry config id :commands)]
    (. builder commands data))
  (when-let [data (lookup-entry config id :env)]
    (. builder env data))
  (when-let [data (lookup-entry config id :env-from-cfn-outputs)]
    (. builder envFromCfnOutputs data))
  (when-let [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :install-commands)]
    (. builder installCommands data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-let [data (lookup-entry config id :partial-build-spec)]
    (. builder partialBuildSpec data))
  (when-let [data (lookup-entry config id :primary-output-directory)]
    (. builder primaryOutputDirectory data))
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :role-policy-statements)]
    (. builder rolePolicyStatements data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn code-build-step-props-builder
  ""
  [id config]
  (build-code-build-step-props-builder (new CodeBuildStepProps$Builder) id config))


(defn build-code-commit-source-options-builder
  "The build-code-commit-source-options-builder function updates a CodeCommitSourceOptions$Builder instance using the provided configuration.
  The function takes the CodeCommitSourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `codeBuildCloneOutput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:code-build-clone-output` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger | [[cdk.api.services.codepipeline.actions/code-commit-trigger]] | `:trigger` |
"
  [^CodeCommitSourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :code-build-clone-output)]
    (. builder codeBuildCloneOutput data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (code-commit-trigger config id :trigger)]
    (. builder trigger data))
  (.build builder))


(defn code-commit-source-options-builder
  ""
  [id config]
  (build-code-commit-source-options-builder (new CodeCommitSourceOptions$Builder) id config))


(defn build-code-pipeline-action-factory-result-builder
  "The build-code-pipeline-action-factory-result-builder function updates a CodePipelineActionFactoryResult$Builder instance using the provided configuration.
  The function takes the CodePipelineActionFactoryResult$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `project` | software.amazon.awscdk.services.codebuild.IProject | [[cdk.support/lookup-entry]] | `:project` |
| `runOrdersConsumed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-orders-consumed` |
"
  [^CodePipelineActionFactoryResult$Builder builder id config]
  (when-let [data (lookup-entry config id :project)]
    (. builder project data))
  (when-let [data (lookup-entry config id :run-orders-consumed)]
    (. builder runOrdersConsumed data))
  (.build builder))


(defn code-pipeline-action-factory-result-builder
  ""
  [id config]
  (build-code-pipeline-action-factory-result-builder (new CodePipelineActionFactoryResult$Builder) id config))


(defn build-code-pipeline-builder
  "The build-code-pipeline-builder function updates a CodePipeline$Builder instance using the provided configuration.
  The function takes the CodePipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:artifact-bucket` |
| `assetPublishingCodeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:asset-publishing-code-build-defaults` |
| `cliVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:cli-version` |
| `codeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:code-build-defaults` |
| `codePipeline` | software.amazon.awscdk.services.codepipeline.Pipeline | [[cdk.support/lookup-entry]] | `:code-pipeline` |
| `crossAccountKeys` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-account-keys` |
| `crossRegionReplicationBuckets` | java.util.Map | [[cdk.support/lookup-entry]] | `:cross-region-replication-buckets` |
| `dockerCredentials` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-credentials` |
| `dockerEnabledForSelfMutation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:docker-enabled-for-self-mutation` |
| `dockerEnabledForSynth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:docker-enabled-for-synth` |
| `enableKeyRotation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-rotation` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `publishAssetsInParallel` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publish-assets-in-parallel` |
| `reuseCrossRegionSupportStacks` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reuse-cross-region-support-stacks` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `selfMutation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:self-mutation` |
| `selfMutationCodeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:self-mutation-code-build-defaults` |
| `synth` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:synth` |
| `synthCodeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:synth-code-build-defaults` |
| `useChangeSets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-change-sets` |
"
  [^CodePipeline$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-bucket)]
    (. builder artifactBucket data))
  (when-let [data (lookup-entry config id :asset-publishing-code-build-defaults)]
    (. builder assetPublishingCodeBuildDefaults data))
  (when-let [data (lookup-entry config id :cli-version)]
    (. builder cliVersion data))
  (when-let [data (lookup-entry config id :code-build-defaults)]
    (. builder codeBuildDefaults data))
  (when-let [data (lookup-entry config id :code-pipeline)]
    (. builder codePipeline data))
  (when-let [data (lookup-entry config id :cross-account-keys)]
    (. builder crossAccountKeys data))
  (when-let [data (lookup-entry config id :cross-region-replication-buckets)]
    (. builder crossRegionReplicationBuckets data))
  (when-let [data (lookup-entry config id :docker-credentials)]
    (. builder dockerCredentials data))
  (when-let [data (lookup-entry config id :docker-enabled-for-self-mutation)]
    (. builder dockerEnabledForSelfMutation data))
  (when-let [data (lookup-entry config id :docker-enabled-for-synth)]
    (. builder dockerEnabledForSynth data))
  (when-let [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-let [data (lookup-entry config id :pipeline-name)]
    (. builder pipelineName data))
  (when-let [data (lookup-entry config id :publish-assets-in-parallel)]
    (. builder publishAssetsInParallel data))
  (when-let [data (lookup-entry config id :reuse-cross-region-support-stacks)]
    (. builder reuseCrossRegionSupportStacks data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :self-mutation)]
    (. builder selfMutation data))
  (when-let [data (lookup-entry config id :self-mutation-code-build-defaults)]
    (. builder selfMutationCodeBuildDefaults data))
  (when-let [data (lookup-entry config id :synth)]
    (. builder synth data))
  (when-let [data (lookup-entry config id :synth-code-build-defaults)]
    (. builder synthCodeBuildDefaults data))
  (when-let [data (lookup-entry config id :use-change-sets)]
    (. builder useChangeSets data))
  (.build builder))


(defn code-pipeline-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-code-pipeline-builder (CodePipeline$Builder/create scope (name id)) id config))


(defn build-code-pipeline-props-builder
  "The build-code-pipeline-props-builder function updates a CodePipelineProps$Builder instance using the provided configuration.
  The function takes the CodePipelineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:artifact-bucket` |
| `assetPublishingCodeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:asset-publishing-code-build-defaults` |
| `cliVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:cli-version` |
| `codeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:code-build-defaults` |
| `codePipeline` | software.amazon.awscdk.services.codepipeline.Pipeline | [[cdk.support/lookup-entry]] | `:code-pipeline` |
| `crossAccountKeys` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-account-keys` |
| `crossRegionReplicationBuckets` | java.util.Map | [[cdk.support/lookup-entry]] | `:cross-region-replication-buckets` |
| `dockerCredentials` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-credentials` |
| `dockerEnabledForSelfMutation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:docker-enabled-for-self-mutation` |
| `dockerEnabledForSynth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:docker-enabled-for-synth` |
| `enableKeyRotation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-rotation` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `publishAssetsInParallel` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publish-assets-in-parallel` |
| `reuseCrossRegionSupportStacks` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reuse-cross-region-support-stacks` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `selfMutation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:self-mutation` |
| `selfMutationCodeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:self-mutation-code-build-defaults` |
| `synth` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:synth` |
| `synthCodeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:synth-code-build-defaults` |
| `useChangeSets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-change-sets` |
"
  [^CodePipelineProps$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-bucket)]
    (. builder artifactBucket data))
  (when-let [data (lookup-entry config id :asset-publishing-code-build-defaults)]
    (. builder assetPublishingCodeBuildDefaults data))
  (when-let [data (lookup-entry config id :cli-version)]
    (. builder cliVersion data))
  (when-let [data (lookup-entry config id :code-build-defaults)]
    (. builder codeBuildDefaults data))
  (when-let [data (lookup-entry config id :code-pipeline)]
    (. builder codePipeline data))
  (when-let [data (lookup-entry config id :cross-account-keys)]
    (. builder crossAccountKeys data))
  (when-let [data (lookup-entry config id :cross-region-replication-buckets)]
    (. builder crossRegionReplicationBuckets data))
  (when-let [data (lookup-entry config id :docker-credentials)]
    (. builder dockerCredentials data))
  (when-let [data (lookup-entry config id :docker-enabled-for-self-mutation)]
    (. builder dockerEnabledForSelfMutation data))
  (when-let [data (lookup-entry config id :docker-enabled-for-synth)]
    (. builder dockerEnabledForSynth data))
  (when-let [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-let [data (lookup-entry config id :pipeline-name)]
    (. builder pipelineName data))
  (when-let [data (lookup-entry config id :publish-assets-in-parallel)]
    (. builder publishAssetsInParallel data))
  (when-let [data (lookup-entry config id :reuse-cross-region-support-stacks)]
    (. builder reuseCrossRegionSupportStacks data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :self-mutation)]
    (. builder selfMutation data))
  (when-let [data (lookup-entry config id :self-mutation-code-build-defaults)]
    (. builder selfMutationCodeBuildDefaults data))
  (when-let [data (lookup-entry config id :synth)]
    (. builder synth data))
  (when-let [data (lookup-entry config id :synth-code-build-defaults)]
    (. builder synthCodeBuildDefaults data))
  (when-let [data (lookup-entry config id :use-change-sets)]
    (. builder useChangeSets data))
  (.build builder))


(defn code-pipeline-props-builder
  ""
  [id config]
  (build-code-pipeline-props-builder (new CodePipelineProps$Builder) id config))


(defn build-confirm-permissions-broadening-builder
  "The build-confirm-permissions-broadening-builder function updates a ConfirmPermissionsBroadening$Builder instance using the provided configuration.
  The function takes the ConfirmPermissionsBroadening$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `stage` | software.amazon.awscdk.Stage | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^ConfirmPermissionsBroadening$Builder builder id config]
  (when-let [data (lookup-entry config id :notification-topic)]
    (. builder notificationTopic data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-connection-source-options-builder
  "The build-connection-source-options-builder function updates a ConnectionSourceOptions$Builder instance using the provided configuration.
  The function takes the ConnectionSourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `codeBuildCloneOutput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:code-build-clone-output` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `triggerOnPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:trigger-on-push` |
"
  [^ConnectionSourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :code-build-clone-output)]
    (. builder codeBuildCloneOutput data))
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-let [data (lookup-entry config id :trigger-on-push)]
    (. builder triggerOnPush data))
  (.build builder))


(defn connection-source-options-builder
  ""
  [id config]
  (build-connection-source-options-builder (new ConnectionSourceOptions$Builder) id config))


(defn build-ecr-docker-credential-options-builder
  "The build-ecr-docker-credential-options-builder function updates a EcrDockerCredentialOptions$Builder instance using the provided configuration.
  The function takes the EcrDockerCredentialOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `usages` | java.util.List | [[cdk.support/lookup-entry]] | `:usages` |
"
  [^EcrDockerCredentialOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :assume-role)]
    (. builder assumeRole data))
  (when-let [data (lookup-entry config id :usages)]
    (. builder usages data))
  (.build builder))


(defn ecr-docker-credential-options-builder
  ""
  [id config]
  (build-ecr-docker-credential-options-builder (new EcrDockerCredentialOptions$Builder) id config))


(defn build-ecr-source-options-builder
  "The build-ecr-source-options-builder function updates a ECRSourceOptions$Builder instance using the provided configuration.
  The function takes the ECRSourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
"
  [^ECRSourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (.build builder))


(defn ecr-source-options-builder
  ""
  [id config]
  (build-ecr-source-options-builder (new ECRSourceOptions$Builder) id config))


(defn build-external-docker-credential-options-builder
  "The build-external-docker-credential-options-builder function updates a ExternalDockerCredentialOptions$Builder instance using the provided configuration.
  The function takes the ExternalDockerCredentialOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `secretPasswordField` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-password-field` |
| `secretUsernameField` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-username-field` |
| `usages` | java.util.List | [[cdk.support/lookup-entry]] | `:usages` |
"
  [^ExternalDockerCredentialOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :assume-role)]
    (. builder assumeRole data))
  (when-let [data (lookup-entry config id :secret-password-field)]
    (. builder secretPasswordField data))
  (when-let [data (lookup-entry config id :secret-username-field)]
    (. builder secretUsernameField data))
  (when-let [data (lookup-entry config id :usages)]
    (. builder usages data))
  (.build builder))


(defn external-docker-credential-options-builder
  ""
  [id config]
  (build-external-docker-credential-options-builder (new ExternalDockerCredentialOptions$Builder) id config))


(defn build-file-set-location-builder
  "The build-file-set-location-builder function updates a FileSetLocation$Builder instance using the provided configuration.
  The function takes the FileSetLocation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `fileSet` | software.amazon.awscdk.pipelines.FileSet | [[cdk.support/lookup-entry]] | `:file-set` |
"
  [^FileSetLocation$Builder builder id config]
  (when-let [data (lookup-entry config id :directory)]
    (. builder directory data))
  (when-let [data (lookup-entry config id :file-set)]
    (. builder fileSet data))
  (.build builder))


(defn file-set-location-builder
  ""
  [id config]
  (build-file-set-location-builder (new FileSetLocation$Builder) id config))


(defn build-git-hub-source-options-builder
  "The build-git-hub-source-options-builder function updates a GitHubSourceOptions$Builder instance using the provided configuration.
  The function takes the GitHubSourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `authentication` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:authentication` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger | [[cdk.api.services.codepipeline.actions/git-hub-trigger]] | `:trigger` |
"
  [^GitHubSourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :authentication)]
    (. builder authentication data))
  (when-let [data (git-hub-trigger config id :trigger)]
    (. builder trigger data))
  (.build builder))


(defn git-hub-source-options-builder
  ""
  [id config]
  (build-git-hub-source-options-builder (new GitHubSourceOptions$Builder) id config))


(defn build-manual-approval-step-builder
  "The build-manual-approval-step-builder function updates a ManualApprovalStep$Builder instance using the provided configuration.
  The function takes the ManualApprovalStep$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
"
  [^ManualApprovalStep$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (.build builder))


(defn build-manual-approval-step-props-builder
  "The build-manual-approval-step-props-builder function updates a ManualApprovalStepProps$Builder instance using the provided configuration.
  The function takes the ManualApprovalStepProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
"
  [^ManualApprovalStepProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (.build builder))


(defn manual-approval-step-props-builder
  ""
  [id config]
  (build-manual-approval-step-props-builder (new ManualApprovalStepProps$Builder) id config))


(defn build-permissions-broadening-check-props-builder
  "The build-permissions-broadening-check-props-builder function updates a PermissionsBroadeningCheckProps$Builder instance using the provided configuration.
  The function takes the PermissionsBroadeningCheckProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `stage` | software.amazon.awscdk.Stage | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^PermissionsBroadeningCheckProps$Builder builder id config]
  (when-let [data (lookup-entry config id :notification-topic)]
    (. builder notificationTopic data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn permissions-broadening-check-props-builder
  ""
  [id config]
  (build-permissions-broadening-check-props-builder (new PermissionsBroadeningCheckProps$Builder) id config))


(defn build-pipeline-base-props-builder
  "The build-pipeline-base-props-builder function updates a PipelineBaseProps$Builder instance using the provided configuration.
  The function takes the PipelineBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `synth` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:synth` |
"
  [^PipelineBaseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :synth)]
    (. builder synth data))
  (.build builder))


(defn pipeline-base-props-builder
  ""
  [id config]
  (build-pipeline-base-props-builder (new PipelineBaseProps$Builder) id config))


(defn build-produce-action-options-builder
  "The build-produce-action-options-builder function updates a ProduceActionOptions$Builder instance using the provided configuration.
  The function takes the ProduceActionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `artifacts` | software.amazon.awscdk.pipelines.ArtifactMap | [[cdk.support/lookup-entry]] | `:artifacts` |
| `beforeSelfMutation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:before-self-mutation` |
| `codeBuildDefaults` | software.amazon.awscdk.pipelines.CodeBuildOptions | [[cdk.support/lookup-entry]] | `:code-build-defaults` |
| `fallbackArtifact` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:fallback-artifact` |
| `pipeline` | software.amazon.awscdk.pipelines.CodePipeline | [[cdk.support/lookup-entry]] | `:pipeline` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `scope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:scope` |
| `stackOutputsMap` | software.amazon.awscdk.pipelines.StackOutputsMap | [[cdk.support/lookup-entry]] | `:stack-outputs-map` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^ProduceActionOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :artifacts)]
    (. builder artifacts data))
  (when-let [data (lookup-entry config id :before-self-mutation)]
    (. builder beforeSelfMutation data))
  (when-let [data (lookup-entry config id :code-build-defaults)]
    (. builder codeBuildDefaults data))
  (when-let [data (lookup-entry config id :fallback-artifact)]
    (. builder fallbackArtifact data))
  (when-let [data (lookup-entry config id :pipeline)]
    (. builder pipeline data))
  (when-let [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :stack-outputs-map)]
    (. builder stackOutputsMap data))
  (when-let [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn produce-action-options-builder
  ""
  [id config]
  (build-produce-action-options-builder (new ProduceActionOptions$Builder) id config))


(defn build-s3-source-options-builder
  "The build-s3-source-options-builder function updates a S3SourceOptions$Builder instance using the provided configuration.
  The function takes the S3SourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.S3Trigger | [[cdk.api.services.codepipeline.actions/s3-trigger]] | `:trigger` |
"
  [^S3SourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (s3-trigger config id :trigger)]
    (. builder trigger data))
  (.build builder))


(defn s3-source-options-builder
  ""
  [id config]
  (build-s3-source-options-builder (new S3SourceOptions$Builder) id config))


(defn build-shell-step-builder
  "The build-shell-step-builder function updates a ShellStep$Builder instance using the provided configuration.
  The function takes the ShellStep$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-inputs` |
| `commands` | java.util.List | [[cdk.support/lookup-entry]] | `:commands` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `envFromCfnOutputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:env-from-cfn-outputs` |
| `input` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:input` |
| `installCommands` | java.util.List | [[cdk.support/lookup-entry]] | `:install-commands` |
| `primaryOutputDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-output-directory` |
"
  [^ShellStep$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-inputs)]
    (. builder additionalInputs data))
  (when-let [data (lookup-entry config id :commands)]
    (. builder commands data))
  (when-let [data (lookup-entry config id :env)]
    (. builder env data))
  (when-let [data (lookup-entry config id :env-from-cfn-outputs)]
    (. builder envFromCfnOutputs data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :install-commands)]
    (. builder installCommands data))
  (when-let [data (lookup-entry config id :primary-output-directory)]
    (. builder primaryOutputDirectory data))
  (.build builder))


(defn build-shell-step-props-builder
  "The build-shell-step-props-builder function updates a ShellStepProps$Builder instance using the provided configuration.
  The function takes the ShellStepProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-inputs` |
| `commands` | java.util.List | [[cdk.support/lookup-entry]] | `:commands` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `envFromCfnOutputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:env-from-cfn-outputs` |
| `input` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:input` |
| `installCommands` | java.util.List | [[cdk.support/lookup-entry]] | `:install-commands` |
| `primaryOutputDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-output-directory` |
"
  [^ShellStepProps$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-inputs)]
    (. builder additionalInputs data))
  (when-let [data (lookup-entry config id :commands)]
    (. builder commands data))
  (when-let [data (lookup-entry config id :env)]
    (. builder env data))
  (when-let [data (lookup-entry config id :env-from-cfn-outputs)]
    (. builder envFromCfnOutputs data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :install-commands)]
    (. builder installCommands data))
  (when-let [data (lookup-entry config id :primary-output-directory)]
    (. builder primaryOutputDirectory data))
  (.build builder))


(defn shell-step-props-builder
  ""
  [id config]
  (build-shell-step-props-builder (new ShellStepProps$Builder) id config))


(defn build-stack-asset-builder
  "The build-stack-asset-builder function updates a StackAsset$Builder instance using the provided configuration.
  The function takes the StackAsset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `assetManifestPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-manifest-path` |
| `assetPublishingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-publishing-role-arn` |
| `assetSelector` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-selector` |
| `assetType` | software.amazon.awscdk.pipelines.AssetType | [[cdk.api.pipelines/asset-type]] | `:asset-type` |
| `isTemplate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-template` |
"
  [^StackAsset$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-id)]
    (. builder assetId data))
  (when-let [data (lookup-entry config id :asset-manifest-path)]
    (. builder assetManifestPath data))
  (when-let [data (lookup-entry config id :asset-publishing-role-arn)]
    (. builder assetPublishingRoleArn data))
  (when-let [data (lookup-entry config id :asset-selector)]
    (. builder assetSelector data))
  (when-let [data (asset-type config id :asset-type)]
    (. builder assetType data))
  (when-let [data (lookup-entry config id :is-template)]
    (. builder isTemplate data))
  (.build builder))


(defn stack-asset-builder
  ""
  [id config]
  (build-stack-asset-builder (new StackAsset$Builder) id config))


(defn build-stack-deployment-props-builder
  "The build-stack-deployment-props-builder function updates a StackDeploymentProps$Builder instance using the provided configuration.
  The function takes the StackDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `absoluteTemplatePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:absolute-template-path` |
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `assets` | java.util.List | [[cdk.support/lookup-entry]] | `:assets` |
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `constructPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:construct-path` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `stackArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-artifact-id` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |
"
  [^StackDeploymentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :absolute-template-path)]
    (. builder absoluteTemplatePath data))
  (when-let [data (lookup-entry config id :account)]
    (. builder account data))
  (when-let [data (lookup-entry config id :assets)]
    (. builder assets data))
  (when-let [data (lookup-entry config id :assume-role-arn)]
    (. builder assumeRoleArn data))
  (when-let [data (lookup-entry config id :construct-path)]
    (. builder constructPath data))
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :stack-artifact-id)]
    (. builder stackArtifactId data))
  (when-let [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :template-s3-uri)]
    (. builder templateS3Uri data))
  (.build builder))


(defn stack-deployment-props-builder
  ""
  [id config]
  (build-stack-deployment-props-builder (new StackDeploymentProps$Builder) id config))


(defn build-stack-steps-builder
  "The build-stack-steps-builder function updates a StackSteps$Builder instance using the provided configuration.
  The function takes the StackSteps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeSet` | java.util.List | [[cdk.support/lookup-entry]] | `:change-set` |
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
| `stack` | software.amazon.awscdk.Stack | [[cdk.support/lookup-entry]] | `:stack` |
"
  [^StackSteps$Builder builder id config]
  (when-let [data (lookup-entry config id :change-set)]
    (. builder changeSet data))
  (when-let [data (lookup-entry config id :post)]
    (. builder post data))
  (when-let [data (lookup-entry config id :pre)]
    (. builder pre data))
  (when-let [data (lookup-entry config id :stack)]
    (. builder stack data))
  (.build builder))


(defn stack-steps-builder
  ""
  [id config]
  (build-stack-steps-builder (new StackSteps$Builder) id config))


(defn build-stage-deployment-props-builder
  "The build-stage-deployment-props-builder function updates a StageDeploymentProps$Builder instance using the provided configuration.
  The function takes the StageDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
| `stackSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-steps` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^StageDeploymentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :post)]
    (. builder post data))
  (when-let [data (lookup-entry config id :pre)]
    (. builder pre data))
  (when-let [data (lookup-entry config id :stack-steps)]
    (. builder stackSteps data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn stage-deployment-props-builder
  ""
  [id config]
  (build-stage-deployment-props-builder (new StageDeploymentProps$Builder) id config))


(defn build-wave-builder
  "The build-wave-builder function updates a Wave$Builder instance using the provided configuration.
  The function takes the Wave$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
"
  [^Wave$Builder builder id config]
  (when-let [data (lookup-entry config id :post)]
    (. builder post data))
  (when-let [data (lookup-entry config id :pre)]
    (. builder pre data))
  (.build builder))


(defn build-wave-options-builder
  "The build-wave-options-builder function updates a WaveOptions$Builder instance using the provided configuration.
  The function takes the WaveOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
"
  [^WaveOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :post)]
    (. builder post data))
  (when-let [data (lookup-entry config id :pre)]
    (. builder pre data))
  (.build builder))


(defn wave-options-builder
  ""
  [id config]
  (build-wave-options-builder (new WaveOptions$Builder) id config))


(defn build-wave-props-builder
  "The build-wave-props-builder function updates a WaveProps$Builder instance using the provided configuration.
  The function takes the WaveProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
"
  [^WaveProps$Builder builder id config]
  (when-let [data (lookup-entry config id :post)]
    (. builder post data))
  (when-let [data (lookup-entry config id :pre)]
    (. builder pre data))
  (.build builder))


(defn wave-props-builder
  ""
  [id config]
  (build-wave-props-builder (new WaveProps$Builder) id config))