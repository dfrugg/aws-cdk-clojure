(ns cdk.api.pipelines
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.pipelines package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.codepipeline.actions :refer [code-commit-trigger
                                                           git-hub-trigger
                                                           s3-trigger]])
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


(defn add-stage-opts-builder
  "The add-stage-opts-builder function buildes out new instances of 
AddStageOpts$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
| `stackSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-steps` |"
  [stack id config]
  (let [builder (AddStageOpts$Builder.)]
    (when-let [data (lookup-entry config id :post)]
      (. builder post data))
    (when-let [data (lookup-entry config id :pre)]
      (. builder pre data))
    (when-let [data (lookup-entry config id :stack-steps)]
      (. builder stackSteps data))
    (.build builder)))


(defn code-build-options-builder
  "The code-build-options-builder function buildes out new instances of 
CodeBuildOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CodeBuildOptions$Builder.)]
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
    (.build builder)))


(defn code-build-step-builder
  "The code-build-step-builder function buildes out new instances of 
CodeBuildStep$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CodeBuildStep$Builder/create ^java.lang.String id)]
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
    (.build builder)))


(defn code-build-step-props-builder
  "The code-build-step-props-builder function buildes out new instances of 
CodeBuildStepProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CodeBuildStepProps$Builder.)]
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
    (.build builder)))


(defn code-commit-source-options-builder
  "The code-commit-source-options-builder function buildes out new instances of 
CodeCommitSourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `codeBuildCloneOutput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:code-build-clone-output` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger | [[cdk.api.services.codepipeline.actions/code-commit-trigger]] | `:trigger` |"
  [stack id config]
  (let [builder (CodeCommitSourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :code-build-clone-output)]
      (. builder codeBuildCloneOutput data))
    (when-let [data (lookup-entry config id :event-role)]
      (. builder eventRole data))
    (when-let [data (code-commit-trigger config id :trigger)]
      (. builder trigger data))
    (.build builder)))


(defn code-pipeline-action-factory-result-builder
  "The code-pipeline-action-factory-result-builder function buildes out new instances of 
CodePipelineActionFactoryResult$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `project` | software.amazon.awscdk.services.codebuild.IProject | [[cdk.support/lookup-entry]] | `:project` |
| `runOrdersConsumed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-orders-consumed` |"
  [stack id config]
  (let [builder (CodePipelineActionFactoryResult$Builder.)]
    (when-let [data (lookup-entry config id :project)]
      (. builder project data))
    (when-let [data (lookup-entry config id :run-orders-consumed)]
      (. builder runOrdersConsumed data))
    (.build builder)))


(defn code-pipeline-builder
  "The code-pipeline-builder function buildes out new instances of 
CodePipeline$Builder using the provided configuration.  Each field is set as follows:

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
| `useChangeSets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-change-sets` |"
  [stack id config]
  (let [builder (CodePipeline$Builder/create stack id)]
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
    (.build builder)))


(defn code-pipeline-props-builder
  "The code-pipeline-props-builder function buildes out new instances of 
CodePipelineProps$Builder using the provided configuration.  Each field is set as follows:

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
| `useChangeSets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-change-sets` |"
  [stack id config]
  (let [builder (CodePipelineProps$Builder.)]
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
    (.build builder)))


(defn confirm-permissions-broadening-builder
  "The confirm-permissions-broadening-builder function buildes out new instances of 
ConfirmPermissionsBroadening$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `stage` | software.amazon.awscdk.Stage | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (ConfirmPermissionsBroadening$Builder/create ^java.lang.String id)]
    (when-let [data (lookup-entry config id :notification-topic)]
      (. builder notificationTopic data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (.build builder)))


(defn connection-source-options-builder
  "The connection-source-options-builder function buildes out new instances of 
ConnectionSourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `codeBuildCloneOutput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:code-build-clone-output` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `triggerOnPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:trigger-on-push` |"
  [stack id config]
  (let [builder (ConnectionSourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :code-build-clone-output)]
      (. builder codeBuildCloneOutput data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :trigger-on-push)]
      (. builder triggerOnPush data))
    (.build builder)))


(defn ecr-docker-credential-options-builder
  "The ecr-docker-credential-options-builder function buildes out new instances of 
EcrDockerCredentialOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `usages` | java.util.List | [[cdk.support/lookup-entry]] | `:usages` |"
  [stack id config]
  (let [builder (EcrDockerCredentialOptions$Builder.)]
    (when-let [data (lookup-entry config id :assume-role)]
      (. builder assumeRole data))
    (when-let [data (lookup-entry config id :usages)]
      (. builder usages data))
    (.build builder)))


(defn ecr-source-options-builder
  "The ecr-source-options-builder function buildes out new instances of 
ECRSourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |"
  [stack id config]
  (let [builder (ECRSourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :image-tag)]
      (. builder imageTag data))
    (.build builder)))


(defn external-docker-credential-options-builder
  "The external-docker-credential-options-builder function buildes out new instances of 
ExternalDockerCredentialOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:assume-role` |
| `secretPasswordField` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-password-field` |
| `secretUsernameField` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-username-field` |
| `usages` | java.util.List | [[cdk.support/lookup-entry]] | `:usages` |"
  [stack id config]
  (let [builder (ExternalDockerCredentialOptions$Builder.)]
    (when-let [data (lookup-entry config id :assume-role)]
      (. builder assumeRole data))
    (when-let [data (lookup-entry config id :secret-password-field)]
      (. builder secretPasswordField data))
    (when-let [data (lookup-entry config id :secret-username-field)]
      (. builder secretUsernameField data))
    (when-let [data (lookup-entry config id :usages)]
      (. builder usages data))
    (.build builder)))


(defn file-set-location-builder
  "The file-set-location-builder function buildes out new instances of 
FileSetLocation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `fileSet` | software.amazon.awscdk.pipelines.FileSet | [[cdk.support/lookup-entry]] | `:file-set` |"
  [stack id config]
  (let [builder (FileSetLocation$Builder.)]
    (when-let [data (lookup-entry config id :directory)]
      (. builder directory data))
    (when-let [data (lookup-entry config id :file-set)]
      (. builder fileSet data))
    (.build builder)))


(defn git-hub-source-options-builder
  "The git-hub-source-options-builder function buildes out new instances of 
GitHubSourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `authentication` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:authentication` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger | [[cdk.api.services.codepipeline.actions/git-hub-trigger]] | `:trigger` |"
  [stack id config]
  (let [builder (GitHubSourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :authentication)]
      (. builder authentication data))
    (when-let [data (git-hub-trigger config id :trigger)]
      (. builder trigger data))
    (.build builder)))


(defn manual-approval-step-builder
  "The manual-approval-step-builder function buildes out new instances of 
ManualApprovalStep$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |"
  [stack id config]
  (let [builder (ManualApprovalStep$Builder/create ^java.lang.String id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (.build builder)))


(defn manual-approval-step-props-builder
  "The manual-approval-step-props-builder function buildes out new instances of 
ManualApprovalStepProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |"
  [stack id config]
  (let [builder (ManualApprovalStepProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (.build builder)))


(defn permissions-broadening-check-props-builder
  "The permissions-broadening-check-props-builder function buildes out new instances of 
PermissionsBroadeningCheckProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `stage` | software.amazon.awscdk.Stage | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (PermissionsBroadeningCheckProps$Builder.)]
    (when-let [data (lookup-entry config id :notification-topic)]
      (. builder notificationTopic data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (.build builder)))


(defn pipeline-base-props-builder
  "The pipeline-base-props-builder function buildes out new instances of 
PipelineBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `synth` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:synth` |"
  [stack id config]
  (let [builder (PipelineBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :synth)]
      (. builder synth data))
    (.build builder)))


(defn produce-action-options-builder
  "The produce-action-options-builder function buildes out new instances of 
ProduceActionOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (ProduceActionOptions$Builder.)]
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
    (.build builder)))


(defn s3-source-options-builder
  "The s3-source-options-builder function buildes out new instances of 
S3SourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.S3Trigger | [[cdk.api.services.codepipeline.actions/s3-trigger]] | `:trigger` |"
  [stack id config]
  (let [builder (S3SourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (s3-trigger config id :trigger)]
      (. builder trigger data))
    (.build builder)))


(defn shell-step-builder
  "The shell-step-builder function buildes out new instances of 
ShellStep$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-inputs` |
| `commands` | java.util.List | [[cdk.support/lookup-entry]] | `:commands` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `envFromCfnOutputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:env-from-cfn-outputs` |
| `input` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:input` |
| `installCommands` | java.util.List | [[cdk.support/lookup-entry]] | `:install-commands` |
| `primaryOutputDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-output-directory` |"
  [stack id config]
  (let [builder (ShellStep$Builder/create ^java.lang.String id)]
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
    (.build builder)))


(defn shell-step-props-builder
  "The shell-step-props-builder function buildes out new instances of 
ShellStepProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-inputs` |
| `commands` | java.util.List | [[cdk.support/lookup-entry]] | `:commands` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `envFromCfnOutputs` | java.util.Map | [[cdk.support/lookup-entry]] | `:env-from-cfn-outputs` |
| `input` | software.amazon.awscdk.pipelines.IFileSetProducer | [[cdk.support/lookup-entry]] | `:input` |
| `installCommands` | java.util.List | [[cdk.support/lookup-entry]] | `:install-commands` |
| `primaryOutputDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-output-directory` |"
  [stack id config]
  (let [builder (ShellStepProps$Builder.)]
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
    (.build builder)))


(defn stack-asset-builder
  "The stack-asset-builder function buildes out new instances of 
StackAsset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `assetManifestPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-manifest-path` |
| `assetPublishingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-publishing-role-arn` |
| `assetSelector` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-selector` |
| `assetType` | software.amazon.awscdk.pipelines.AssetType | [[cdk.api.pipelines/asset-type]] | `:asset-type` |
| `isTemplate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-template` |"
  [stack id config]
  (let [builder (StackAsset$Builder.)]
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
    (.build builder)))


(defn stack-deployment-props-builder
  "The stack-deployment-props-builder function buildes out new instances of 
StackDeploymentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |"
  [stack id config]
  (let [builder (StackDeploymentProps$Builder.)]
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
    (.build builder)))


(defn stack-steps-builder
  "The stack-steps-builder function buildes out new instances of 
StackSteps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeSet` | java.util.List | [[cdk.support/lookup-entry]] | `:change-set` |
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
| `stack` | software.amazon.awscdk.Stack | [[cdk.support/lookup-entry]] | `:stack` |"
  [stack id config]
  (let [builder (StackSteps$Builder.)]
    (when-let [data (lookup-entry config id :change-set)]
      (. builder changeSet data))
    (when-let [data (lookup-entry config id :post)]
      (. builder post data))
    (when-let [data (lookup-entry config id :pre)]
      (. builder pre data))
    (when-let [data (lookup-entry config id :stack)]
      (. builder stack data))
    (.build builder)))


(defn stage-deployment-props-builder
  "The stage-deployment-props-builder function buildes out new instances of 
StageDeploymentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |
| `stackSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-steps` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (StageDeploymentProps$Builder.)]
    (when-let [data (lookup-entry config id :post)]
      (. builder post data))
    (when-let [data (lookup-entry config id :pre)]
      (. builder pre data))
    (when-let [data (lookup-entry config id :stack-steps)]
      (. builder stackSteps data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn wave-builder
  "The wave-builder function buildes out new instances of 
Wave$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |"
  [stack id config]
  (let [builder (Wave$Builder/create ^java.lang.String id)]
    (when-let [data (lookup-entry config id :post)]
      (. builder post data))
    (when-let [data (lookup-entry config id :pre)]
      (. builder pre data))
    (.build builder)))


(defn wave-options-builder
  "The wave-options-builder function buildes out new instances of 
WaveOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |"
  [stack id config]
  (let [builder (WaveOptions$Builder.)]
    (when-let [data (lookup-entry config id :post)]
      (. builder post data))
    (when-let [data (lookup-entry config id :pre)]
      (. builder pre data))
    (.build builder)))


(defn wave-props-builder
  "The wave-props-builder function buildes out new instances of 
WaveProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `post` | java.util.List | [[cdk.support/lookup-entry]] | `:post` |
| `pre` | java.util.List | [[cdk.support/lookup-entry]] | `:pre` |"
  [stack id config]
  (let [builder (WaveProps$Builder.)]
    (when-let [data (lookup-entry config id :post)]
      (. builder post data))
    (when-let [data (lookup-entry config id :pre)]
      (. builder pre data))
    (.build builder)))