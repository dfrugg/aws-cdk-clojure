(ns cdk.api.services.codebuild
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codebuild package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.api.services.codestarnotifications :refer [detail-type]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codebuild ArtifactsConfig$Builder
                                                      ArtifactsProps$Builder
                                                      BatchBuildConfig$Builder
                                                      BindToCodePipelineOptions$Builder
                                                      BitBucketSourceCredentials$Builder
                                                      BitBucketSourceCredentialsProps$Builder
                                                      BitBucketSourceProps$Builder
                                                      BucketCacheOptions$Builder
                                                      BuildEnvironment$Builder
                                                      BuildEnvironmentCertificate$Builder
                                                      BuildEnvironmentVariable$Builder
                                                      BuildEnvironmentVariableType
                                                      BuildImageBindOptions$Builder
                                                      BuildImageConfig$Builder
                                                      CfnFleet$Builder
                                                      CfnFleet$VpcConfigProperty$Builder
                                                      CfnFleetProps$Builder
                                                      CfnProject$ArtifactsProperty$Builder
                                                      CfnProject$BatchRestrictionsProperty$Builder
                                                      CfnProject$BuildStatusConfigProperty$Builder
                                                      CfnProject$Builder
                                                      CfnProject$CloudWatchLogsConfigProperty$Builder
                                                      CfnProject$EnvironmentProperty$Builder
                                                      CfnProject$EnvironmentVariableProperty$Builder
                                                      CfnProject$GitSubmodulesConfigProperty$Builder
                                                      CfnProject$LogsConfigProperty$Builder
                                                      CfnProject$ProjectBuildBatchConfigProperty$Builder
                                                      CfnProject$ProjectCacheProperty$Builder
                                                      CfnProject$ProjectFileSystemLocationProperty$Builder
                                                      CfnProject$ProjectFleetProperty$Builder
                                                      CfnProject$ProjectSourceVersionProperty$Builder
                                                      CfnProject$ProjectTriggersProperty$Builder
                                                      CfnProject$RegistryCredentialProperty$Builder
                                                      CfnProject$S3LogsConfigProperty$Builder
                                                      CfnProject$SourceAuthProperty$Builder
                                                      CfnProject$SourceProperty$Builder
                                                      CfnProject$VpcConfigProperty$Builder
                                                      CfnProject$WebhookFilterProperty$Builder
                                                      CfnProjectProps$Builder
                                                      CfnReportGroup$Builder
                                                      CfnReportGroup$ReportExportConfigProperty$Builder
                                                      CfnReportGroup$S3ReportExportConfigProperty$Builder
                                                      CfnReportGroupProps$Builder
                                                      CfnSourceCredential$Builder
                                                      CfnSourceCredentialProps$Builder
                                                      CloudWatchLoggingOptions$Builder
                                                      CodeCommitSourceProps$Builder
                                                      CommonProjectProps$Builder
                                                      ComputeType
                                                      DockerImageOptions$Builder
                                                      EfsFileSystemLocationProps$Builder
                                                      EventAction
                                                      FileSystemConfig$Builder
                                                      GitHubEnterpriseSourceCredentials$Builder
                                                      GitHubEnterpriseSourceCredentialsProps$Builder
                                                      GitHubEnterpriseSourceProps$Builder
                                                      GitHubSourceCredentials$Builder
                                                      GitHubSourceCredentialsProps$Builder
                                                      GitHubSourceProps$Builder
                                                      ImagePullPrincipalType
                                                      LocalCacheMode
                                                      LoggingOptions$Builder
                                                      PipelineProject$Builder
                                                      PipelineProjectProps$Builder
                                                      Project$Builder
                                                      ProjectNotificationEvents
                                                      ProjectNotifyOnOptions$Builder
                                                      ProjectProps$Builder
                                                      ReportGroup$Builder
                                                      ReportGroupProps$Builder
                                                      ReportGroupType
                                                      S3ArtifactsProps$Builder
                                                      S3LoggingOptions$Builder
                                                      S3SourceProps$Builder
                                                      SourceConfig$Builder
                                                      SourceProps$Builder
                                                      UntrustedCodeBoundaryPolicy$Builder
                                                      UntrustedCodeBoundaryPolicyProps$Builder
                                                      WindowsImageType]))


(defn build-environment-variable-type
  "The `build-environment-variable-type` function data interprets values in the provided config data into a 
`BuildEnvironmentVariableType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BuildEnvironmentVariableType` - the value is returned.
* is `:secrets-manager` - `BuildEnvironmentVariableType/SECRETS_MANAGER` is returned
* is `:plaintext` - `BuildEnvironmentVariableType/PLAINTEXT` is returned
* is `:parameter-store` - `BuildEnvironmentVariableType/PARAMETER_STORE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BuildEnvironmentVariableType data) data
      (= :secrets-manager data) BuildEnvironmentVariableType/SECRETS_MANAGER
      (= :plaintext data) BuildEnvironmentVariableType/PLAINTEXT
      (= :parameter-store data) BuildEnvironmentVariableType/PARAMETER_STORE)))


(defn compute-type
  "The `compute-type` function data interprets values in the provided config data into a 
`ComputeType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ComputeType` - the value is returned.
* is `:small` - `ComputeType/SMALL` is returned
* is `:large` - `ComputeType/LARGE` is returned
* is `:x-large` - `ComputeType/X_LARGE` is returned
* is `:lambda-10gb` - `ComputeType/LAMBDA_10GB` is returned
* is `:lambda-2gb` - `ComputeType/LAMBDA_2GB` is returned
* is `:medium` - `ComputeType/MEDIUM` is returned
* is `:x2-large` - `ComputeType/X2_LARGE` is returned
* is `:lambda-1gb` - `ComputeType/LAMBDA_1GB` is returned
* is `:lambda-4gb` - `ComputeType/LAMBDA_4GB` is returned
* is `:lambda-8gb` - `ComputeType/LAMBDA_8GB` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ComputeType data) data
      (= :small data) ComputeType/SMALL
      (= :large data) ComputeType/LARGE
      (= :x-large data) ComputeType/X_LARGE
      (= :lambda-10gb data) ComputeType/LAMBDA_10GB
      (= :lambda-2gb data) ComputeType/LAMBDA_2GB
      (= :medium data) ComputeType/MEDIUM
      (= :x2-large data) ComputeType/X2_LARGE
      (= :lambda-1gb data) ComputeType/LAMBDA_1GB
      (= :lambda-4gb data) ComputeType/LAMBDA_4GB
      (= :lambda-8gb data) ComputeType/LAMBDA_8GB)))


(defn event-action
  "The `event-action` function data interprets values in the provided config data into a 
`EventAction` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EventAction` - the value is returned.
* is `:pull-request-merged` - `EventAction/PULL_REQUEST_MERGED` is returned
* is `:pull-request-reopened` - `EventAction/PULL_REQUEST_REOPENED` is returned
* is `:pull-request-created` - `EventAction/PULL_REQUEST_CREATED` is returned
* is `:pull-request-updated` - `EventAction/PULL_REQUEST_UPDATED` is returned
* is `:push` - `EventAction/PUSH` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EventAction data) data
      (= :pull-request-merged data) EventAction/PULL_REQUEST_MERGED
      (= :pull-request-reopened data) EventAction/PULL_REQUEST_REOPENED
      (= :pull-request-created data) EventAction/PULL_REQUEST_CREATED
      (= :pull-request-updated data) EventAction/PULL_REQUEST_UPDATED
      (= :push data) EventAction/PUSH)))


(defn image-pull-principal-type
  "The `image-pull-principal-type` function data interprets values in the provided config data into a 
`ImagePullPrincipalType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ImagePullPrincipalType` - the value is returned.
* is `:service-role` - `ImagePullPrincipalType/SERVICE_ROLE` is returned
* is `:codebuild` - `ImagePullPrincipalType/CODEBUILD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ImagePullPrincipalType data) data
      (= :service-role data) ImagePullPrincipalType/SERVICE_ROLE
      (= :codebuild data) ImagePullPrincipalType/CODEBUILD)))


(defn local-cache-mode
  "The `local-cache-mode` function data interprets values in the provided config data into a 
`LocalCacheMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LocalCacheMode` - the value is returned.
* is `:custom` - `LocalCacheMode/CUSTOM` is returned
* is `:docker-layer` - `LocalCacheMode/DOCKER_LAYER` is returned
* is `:source` - `LocalCacheMode/SOURCE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LocalCacheMode data) data
      (= :custom data) LocalCacheMode/CUSTOM
      (= :docker-layer data) LocalCacheMode/DOCKER_LAYER
      (= :source data) LocalCacheMode/SOURCE)))


(defn project-notification-events
  "The `project-notification-events` function data interprets values in the provided config data into a 
`ProjectNotificationEvents` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ProjectNotificationEvents` - the value is returned.
* is `:build-stopped` - `ProjectNotificationEvents/BUILD_STOPPED` is returned
* is `:build-failed` - `ProjectNotificationEvents/BUILD_FAILED` is returned
* is `:build-succeeded` - `ProjectNotificationEvents/BUILD_SUCCEEDED` is returned
* is `:build-phase-failed` - `ProjectNotificationEvents/BUILD_PHASE_FAILED` is returned
* is `:build-in-progress` - `ProjectNotificationEvents/BUILD_IN_PROGRESS` is returned
* is `:build-phase-succeeded` - `ProjectNotificationEvents/BUILD_PHASE_SUCCEEDED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ProjectNotificationEvents data) data
      (= :build-stopped data) ProjectNotificationEvents/BUILD_STOPPED
      (= :build-failed data) ProjectNotificationEvents/BUILD_FAILED
      (= :build-succeeded data) ProjectNotificationEvents/BUILD_SUCCEEDED
      (= :build-phase-failed data) ProjectNotificationEvents/BUILD_PHASE_FAILED
      (= :build-in-progress data) ProjectNotificationEvents/BUILD_IN_PROGRESS
      (= :build-phase-succeeded data) ProjectNotificationEvents/BUILD_PHASE_SUCCEEDED)))


(defn report-group-type
  "The `report-group-type` function data interprets values in the provided config data into a 
`ReportGroupType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ReportGroupType` - the value is returned.
* is `:code-coverage` - `ReportGroupType/CODE_COVERAGE` is returned
* is `:test` - `ReportGroupType/TEST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ReportGroupType data) data
      (= :code-coverage data) ReportGroupType/CODE_COVERAGE
      (= :test data) ReportGroupType/TEST)))


(defn windows-image-type
  "The `windows-image-type` function data interprets values in the provided config data into a 
`WindowsImageType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `WindowsImageType` - the value is returned.
* is `:server-2019` - `WindowsImageType/SERVER_2019` is returned
* is `:standard` - `WindowsImageType/STANDARD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? WindowsImageType data) data
      (= :server-2019 data) WindowsImageType/SERVER_2019
      (= :standard data) WindowsImageType/STANDARD)))


(defn artifacts-config-builder
  "The artifacts-config-builder function buildes out new instances of 
ArtifactsConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactsProperty` | software.amazon.awscdk.services.codebuild.CfnProject$ArtifactsProperty | [[cdk.support/lookup-entry]] | `:artifacts-property` |"
  [stack id config]
  (let [builder (ArtifactsConfig$Builder.)]
    (when-let [data (lookup-entry config id :artifacts-property)]
      (. builder artifactsProperty data))
    (.build builder)))


(defn artifacts-props-builder
  "The artifacts-props-builder function buildes out new instances of 
ArtifactsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |"
  [stack id config]
  (let [builder (ArtifactsProps$Builder.)]
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (.build builder)))


(defn batch-build-config-builder
  "The batch-build-config-builder function buildes out new instances of 
BatchBuildConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (BatchBuildConfig$Builder.)]
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn bind-to-code-pipeline-options-builder
  "The bind-to-code-pipeline-options-builder function buildes out new instances of 
BindToCodePipelineOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:artifact-bucket` |"
  [stack id config]
  (let [builder (BindToCodePipelineOptions$Builder.)]
    (when-let [data (lookup-entry config id :artifact-bucket)]
      (. builder artifactBucket data))
    (.build builder)))


(defn bit-bucket-source-credentials-builder
  "The bit-bucket-source-credentials-builder function buildes out new instances of 
BitBucketSourceCredentials$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `username` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (BitBucketSourceCredentials$Builder/create stack id)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn bit-bucket-source-credentials-props-builder
  "The bit-bucket-source-credentials-props-builder function buildes out new instances of 
BitBucketSourceCredentialsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `username` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (BitBucketSourceCredentialsProps$Builder.)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn bit-bucket-source-props-builder
  "The bit-bucket-source-props-builder function buildes out new instances of 
BitBucketSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchOrRef` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-or-ref` |
| `buildStatusName` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-status-name` |
| `buildStatusUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-status-url` |
| `cloneDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:clone-depth` |
| `fetchSubmodules` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fetch-submodules` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `repo` | java.lang.String | [[cdk.support/lookup-entry]] | `:repo` |
| `reportBuildStatus` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-build-status` |
| `webhook` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook` |
| `webhookFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:webhook-filters` |
| `webhookTriggersBatchBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook-triggers-batch-build` |"
  [stack id config]
  (let [builder (BitBucketSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :branch-or-ref)]
      (. builder branchOrRef data))
    (when-let [data (lookup-entry config id :build-status-name)]
      (. builder buildStatusName data))
    (when-let [data (lookup-entry config id :build-status-url)]
      (. builder buildStatusUrl data))
    (when-let [data (lookup-entry config id :clone-depth)]
      (. builder cloneDepth data))
    (when-let [data (lookup-entry config id :fetch-submodules)]
      (. builder fetchSubmodules data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :repo)]
      (. builder repo data))
    (when-let [data (lookup-entry config id :report-build-status)]
      (. builder reportBuildStatus data))
    (when-let [data (lookup-entry config id :webhook)]
      (. builder webhook data))
    (when-let [data (lookup-entry config id :webhook-filters)]
      (. builder webhookFilters data))
    (when-let [data (lookup-entry config id :webhook-triggers-batch-build)]
      (. builder webhookTriggersBatchBuild data))
    (.build builder)))


(defn bucket-cache-options-builder
  "The bucket-cache-options-builder function buildes out new instances of 
BucketCacheOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (BucketCacheOptions$Builder.)]
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn build-environment-builder
  "The build-environment-builder function buildes out new instances of 
BuildEnvironment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildImage` | software.amazon.awscdk.services.codebuild.IBuildImage | [[cdk.support/lookup-entry]] | `:build-image` |
| `certificate` | software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `computeType` | software.amazon.awscdk.services.codebuild.ComputeType | [[cdk.api.services.codebuild/compute-type]] | `:compute-type` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |"
  [stack id config]
  (let [builder (BuildEnvironment$Builder.)]
    (when-let [data (lookup-entry config id :build-image)]
      (. builder buildImage data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (compute-type config id :compute-type)]
      (. builder computeType data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (.build builder)))


(defn build-environment-certificate-builder
  "The build-environment-certificate-builder function buildes out new instances of 
BuildEnvironmentCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |"
  [stack id config]
  (let [builder (BuildEnvironmentCertificate$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :object-key)]
      (. builder objectKey data))
    (.build builder)))


(defn build-environment-variable-builder
  "The build-environment-variable-builder function buildes out new instances of 
BuildEnvironmentVariable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType | [[cdk.api.services.codebuild/build-environment-variable-type]] | `:type` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (BuildEnvironmentVariable$Builder.)]
    (when-let [data (build-environment-variable-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn build-image-bind-options-builder
  "The build-image-bind-options-builder function buildes out new instances of 
BuildImageBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (BuildImageBindOptions$Builder.)]
    (.build builder)))


(defn build-image-config-builder
  "The build-image-config-builder function buildes out new instances of 
BuildImageConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (BuildImageConfig$Builder.)]
    (.build builder)))


(defn cfn-fleet-builder
  "The cfn-fleet-builder function buildes out new instances of 
CfnFleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-capacity` |
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `environmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-type` |
| `fleetServiceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-service-role` |
| `fleetVpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fleet-vpc-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overflowBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:overflow-behavior` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :base-capacity)]
      (. builder baseCapacity data))
    (when-let [data (lookup-entry config id :compute-type)]
      (. builder computeType data))
    (when-let [data (lookup-entry config id :environment-type)]
      (. builder environmentType data))
    (when-let [data (lookup-entry config id :fleet-service-role)]
      (. builder fleetServiceRole data))
    (when-let [data (lookup-entry config id :fleet-vpc-config)]
      (. builder fleetVpcConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :overflow-behavior)]
      (. builder overflowBehavior data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fleet-props-builder
  "The cfn-fleet-props-builder function buildes out new instances of 
CfnFleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-capacity` |
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `environmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-type` |
| `fleetServiceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-service-role` |
| `fleetVpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fleet-vpc-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overflowBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:overflow-behavior` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFleetProps$Builder.)]
    (when-let [data (lookup-entry config id :base-capacity)]
      (. builder baseCapacity data))
    (when-let [data (lookup-entry config id :compute-type)]
      (. builder computeType data))
    (when-let [data (lookup-entry config id :environment-type)]
      (. builder environmentType data))
    (when-let [data (lookup-entry config id :fleet-service-role)]
      (. builder fleetServiceRole data))
    (when-let [data (lookup-entry config id :fleet-vpc-config)]
      (. builder fleetVpcConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :overflow-behavior)]
      (. builder overflowBehavior data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fleet-vpc-config-property-builder
  "The cfn-fleet-vpc-config-property-builder function buildes out new instances of 
CfnFleet$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnFleet$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-project-artifacts-property-builder
  "The cfn-project-artifacts-property-builder function buildes out new instances of 
CfnProject$ArtifactsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-identifier` |
| `encryptionDisabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-disabled` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespaceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-type` |
| `overrideArtifactName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override-artifact-name` |
| `packaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnProject$ArtifactsProperty$Builder.)]
    (when-let [data (lookup-entry config id :artifact-identifier)]
      (. builder artifactIdentifier data))
    (when-let [data (lookup-entry config id :encryption-disabled)]
      (. builder encryptionDisabled data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace-type)]
      (. builder namespaceType data))
    (when-let [data (lookup-entry config id :override-artifact-name)]
      (. builder overrideArtifactName data))
    (when-let [data (lookup-entry config id :packaging)]
      (. builder packaging data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-project-batch-restrictions-property-builder
  "The cfn-project-batch-restrictions-property-builder function buildes out new instances of 
CfnProject$BatchRestrictionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeTypesAllowed` | java.util.List | [[cdk.support/lookup-entry]] | `:compute-types-allowed` |
| `maximumBuildsAllowed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-builds-allowed` |"
  [stack id config]
  (let [builder (CfnProject$BatchRestrictionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :compute-types-allowed)]
      (. builder computeTypesAllowed data))
    (when-let [data (lookup-entry config id :maximum-builds-allowed)]
      (. builder maximumBuildsAllowed data))
    (.build builder)))


(defn cfn-project-build-status-config-property-builder
  "The cfn-project-build-status-config-property-builder function buildes out new instances of 
CfnProject$BuildStatusConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `context` | java.lang.String | [[cdk.support/lookup-entry]] | `:context` |
| `targetUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-url` |"
  [stack id config]
  (let [builder (CfnProject$BuildStatusConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :context)]
      (. builder context data))
    (when-let [data (lookup-entry config id :target-url)]
      (. builder targetUrl data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifacts` | software.amazon.awscdk.services.codebuild.CfnProject$ArtifactsProperty | [[cdk.support/lookup-entry]] | `:artifacts` |
| `badgeEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:badge-enabled` |
| `buildBatchConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:build-batch-config` |
| `cache` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache` |
| `concurrentBuildLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-build-limit` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `environment` | software.amazon.awscdk.services.codebuild.CfnProject$EnvironmentProperty | [[cdk.support/lookup-entry]] | `:environment` |
| `fileSystemLocations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `logsConfig` | software.amazon.awscdk.services.codebuild.CfnProject$LogsConfigProperty | [[cdk.support/lookup-entry]] | `:logs-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queuedTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:queued-timeout-in-minutes` |
| `resourceAccessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-access-role` |
| `secondaryArtifacts` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-artifacts` |
| `secondarySourceVersions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary-source-versions` |
| `secondarySources` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-sources` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `source` | software.amazon.awscdk.services.codebuild.CfnProject$SourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
| `triggers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:triggers` |
| `visibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:visibility` |
| `vpcConfig` | software.amazon.awscdk.services.codebuild.CfnProject$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :artifacts)]
      (. builder artifacts data))
    (when-let [data (lookup-entry config id :badge-enabled)]
      (. builder badgeEnabled data))
    (when-let [data (lookup-entry config id :build-batch-config)]
      (. builder buildBatchConfig data))
    (when-let [data (lookup-entry config id :cache)]
      (. builder cache data))
    (when-let [data (lookup-entry config id :concurrent-build-limit)]
      (. builder concurrentBuildLimit data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :logs-config)]
      (. builder logsConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :queued-timeout-in-minutes)]
      (. builder queuedTimeoutInMinutes data))
    (when-let [data (lookup-entry config id :resource-access-role)]
      (. builder resourceAccessRole data))
    (when-let [data (lookup-entry config id :secondary-artifacts)]
      (. builder secondaryArtifacts data))
    (when-let [data (lookup-entry config id :secondary-source-versions)]
      (. builder secondarySourceVersions data))
    (when-let [data (lookup-entry config id :secondary-sources)]
      (. builder secondarySources data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :source-version)]
      (. builder sourceVersion data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout-in-minutes)]
      (. builder timeoutInMinutes data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (when-let [data (lookup-entry config id :visibility)]
      (. builder visibility data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-project-cloud-watch-logs-config-property-builder
  "The cfn-project-cloud-watch-logs-config-property-builder function buildes out new instances of 
CfnProject$CloudWatchLogsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |"
  [stack id config]
  (let [builder (CfnProject$CloudWatchLogsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :stream-name)]
      (. builder streamName data))
    (.build builder)))


(defn cfn-project-environment-property-builder
  "The cfn-project-environment-property-builder function buildes out new instances of 
CfnProject$EnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `environmentVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `fleet` | software.amazon.awscdk.services.codebuild.CfnProject$ProjectFleetProperty | [[cdk.support/lookup-entry]] | `:fleet` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `imagePullCredentialsType` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-pull-credentials-type` |
| `privilegedMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:privileged-mode` |
| `registryCredential` | software.amazon.awscdk.services.codebuild.CfnProject$RegistryCredentialProperty | [[cdk.support/lookup-entry]] | `:registry-credential` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnProject$EnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :compute-type)]
      (. builder computeType data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :fleet)]
      (. builder fleet data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :image-pull-credentials-type)]
      (. builder imagePullCredentialsType data))
    (when-let [data (lookup-entry config id :privileged-mode)]
      (. builder privilegedMode data))
    (when-let [data (lookup-entry config id :registry-credential)]
      (. builder registryCredential data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-project-environment-variable-property-builder
  "The cfn-project-environment-variable-property-builder function buildes out new instances of 
CfnProject$EnvironmentVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnProject$EnvironmentVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-project-git-submodules-config-property-builder
  "The cfn-project-git-submodules-config-property-builder function buildes out new instances of 
CfnProject$GitSubmodulesConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fetchSubmodules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fetch-submodules` |"
  [stack id config]
  (let [builder (CfnProject$GitSubmodulesConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :fetch-submodules)]
      (. builder fetchSubmodules data))
    (.build builder)))


(defn cfn-project-logs-config-property-builder
  "The cfn-project-logs-config-property-builder function buildes out new instances of 
CfnProject$LogsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `s3Logs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-logs` |"
  [stack id config]
  (let [builder (CfnProject$LogsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs)]
      (. builder cloudWatchLogs data))
    (when-let [data (lookup-entry config id :s3-logs)]
      (. builder s3Logs data))
    (.build builder)))


(defn cfn-project-project-build-batch-config-property-builder
  "The cfn-project-project-build-batch-config-property-builder function buildes out new instances of 
CfnProject$ProjectBuildBatchConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchReportMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:batch-report-mode` |
| `combineArtifacts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:combine-artifacts` |
| `restrictions` | software.amazon.awscdk.services.codebuild.CfnProject$BatchRestrictionsProperty | [[cdk.support/lookup-entry]] | `:restrictions` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `timeoutInMins` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-mins` |"
  [stack id config]
  (let [builder (CfnProject$ProjectBuildBatchConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-report-mode)]
      (. builder batchReportMode data))
    (when-let [data (lookup-entry config id :combine-artifacts)]
      (. builder combineArtifacts data))
    (when-let [data (lookup-entry config id :restrictions)]
      (. builder restrictions data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :timeout-in-mins)]
      (. builder timeoutInMins data))
    (.build builder)))


(defn cfn-project-project-cache-property-builder
  "The cfn-project-project-cache-property-builder function buildes out new instances of 
CfnProject$ProjectCacheProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `modes` | java.util.List | [[cdk.support/lookup-entry]] | `:modes` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnProject$ProjectCacheProperty$Builder.)]
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :modes)]
      (. builder modes data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-project-project-file-system-location-property-builder
  "The cfn-project-project-file-system-location-property-builder function buildes out new instances of 
CfnProject$ProjectFileSystemLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `mountOptions` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-options` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnProject$ProjectFileSystemLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :mount-point)]
      (. builder mountPoint data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-project-project-fleet-property-builder
  "The cfn-project-project-fleet-property-builder function buildes out new instances of 
CfnProject$ProjectFleetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fleetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-arn` |"
  [stack id config]
  (let [builder (CfnProject$ProjectFleetProperty$Builder.)]
    (when-let [data (lookup-entry config id :fleet-arn)]
      (. builder fleetArn data))
    (.build builder)))


(defn cfn-project-project-source-version-property-builder
  "The cfn-project-project-source-version-property-builder function buildes out new instances of 
CfnProject$ProjectSourceVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-identifier` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |"
  [stack id config]
  (let [builder (CfnProject$ProjectSourceVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-identifier)]
      (. builder sourceIdentifier data))
    (when-let [data (lookup-entry config id :source-version)]
      (. builder sourceVersion data))
    (.build builder)))


(defn cfn-project-project-triggers-property-builder
  "The cfn-project-project-triggers-property-builder function buildes out new instances of 
CfnProject$ProjectTriggersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildType` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-type` |
| `filterGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-groups` |
| `webhook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:webhook` |"
  [stack id config]
  (let [builder (CfnProject$ProjectTriggersProperty$Builder.)]
    (when-let [data (lookup-entry config id :build-type)]
      (. builder buildType data))
    (when-let [data (lookup-entry config id :filter-groups)]
      (. builder filterGroups data))
    (when-let [data (lookup-entry config id :webhook)]
      (. builder webhook data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifacts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:artifacts` |
| `badgeEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:badge-enabled` |
| `buildBatchConfig` | software.amazon.awscdk.services.codebuild.CfnProject$ProjectBuildBatchConfigProperty | [[cdk.support/lookup-entry]] | `:build-batch-config` |
| `cache` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache` |
| `concurrentBuildLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-build-limit` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `fileSystemLocations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `logsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logs-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queuedTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:queued-timeout-in-minutes` |
| `resourceAccessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-access-role` |
| `secondaryArtifacts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary-artifacts` |
| `secondarySourceVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-source-versions` |
| `secondarySources` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-sources` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `source` | software.amazon.awscdk.services.codebuild.CfnProject$SourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
| `triggers` | software.amazon.awscdk.services.codebuild.CfnProject$ProjectTriggersProperty | [[cdk.support/lookup-entry]] | `:triggers` |
| `visibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:visibility` |
| `vpcConfig` | software.amazon.awscdk.services.codebuild.CfnProject$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :artifacts)]
      (. builder artifacts data))
    (when-let [data (lookup-entry config id :badge-enabled)]
      (. builder badgeEnabled data))
    (when-let [data (lookup-entry config id :build-batch-config)]
      (. builder buildBatchConfig data))
    (when-let [data (lookup-entry config id :cache)]
      (. builder cache data))
    (when-let [data (lookup-entry config id :concurrent-build-limit)]
      (. builder concurrentBuildLimit data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :logs-config)]
      (. builder logsConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :queued-timeout-in-minutes)]
      (. builder queuedTimeoutInMinutes data))
    (when-let [data (lookup-entry config id :resource-access-role)]
      (. builder resourceAccessRole data))
    (when-let [data (lookup-entry config id :secondary-artifacts)]
      (. builder secondaryArtifacts data))
    (when-let [data (lookup-entry config id :secondary-source-versions)]
      (. builder secondarySourceVersions data))
    (when-let [data (lookup-entry config id :secondary-sources)]
      (. builder secondarySources data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :source-version)]
      (. builder sourceVersion data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout-in-minutes)]
      (. builder timeoutInMinutes data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (when-let [data (lookup-entry config id :visibility)]
      (. builder visibility data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-project-registry-credential-property-builder
  "The cfn-project-registry-credential-property-builder function buildes out new instances of 
CfnProject$RegistryCredentialProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credential` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential` |
| `credentialProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential-provider` |"
  [stack id config]
  (let [builder (CfnProject$RegistryCredentialProperty$Builder.)]
    (when-let [data (lookup-entry config id :credential)]
      (. builder credential data))
    (when-let [data (lookup-entry config id :credential-provider)]
      (. builder credentialProvider data))
    (.build builder)))


(defn cfn-project-s3-logs-config-property-builder
  "The cfn-project-s3-logs-config-property-builder function buildes out new instances of 
CfnProject$S3LogsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionDisabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-disabled` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnProject$S3LogsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-disabled)]
      (. builder encryptionDisabled data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-project-source-auth-property-builder
  "The cfn-project-source-auth-property-builder function buildes out new instances of 
CfnProject$SourceAuthProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnProject$SourceAuthProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-project-source-property-builder
  "The cfn-project-source-property-builder function buildes out new instances of 
CfnProject$SourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `buildSpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-spec` |
| `buildStatusConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:build-status-config` |
| `gitCloneDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:git-clone-depth` |
| `gitSubmodulesConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:git-submodules-config` |
| `insecureSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:insecure-ssl` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `reportBuildStatus` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-build-status` |
| `sourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-identifier` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnProject$SourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth)]
      (. builder auth data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :build-status-config)]
      (. builder buildStatusConfig data))
    (when-let [data (lookup-entry config id :git-clone-depth)]
      (. builder gitCloneDepth data))
    (when-let [data (lookup-entry config id :git-submodules-config)]
      (. builder gitSubmodulesConfig data))
    (when-let [data (lookup-entry config id :insecure-ssl)]
      (. builder insecureSsl data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :report-build-status)]
      (. builder reportBuildStatus data))
    (when-let [data (lookup-entry config id :source-identifier)]
      (. builder sourceIdentifier data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-project-vpc-config-property-builder
  "The cfn-project-vpc-config-property-builder function buildes out new instances of 
CfnProject$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnProject$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-project-webhook-filter-property-builder
  "The cfn-project-webhook-filter-property-builder function buildes out new instances of 
CfnProject$WebhookFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeMatchedPattern` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-matched-pattern` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnProject$WebhookFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :exclude-matched-pattern)]
      (. builder excludeMatchedPattern data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-report-group-builder
  "The cfn-report-group-builder function buildes out new instances of 
CfnReportGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteReports` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-reports` |
| `exportConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:export-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnReportGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :delete-reports)]
      (. builder deleteReports data))
    (when-let [data (lookup-entry config id :export-config)]
      (. builder exportConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-report-group-props-builder
  "The cfn-report-group-props-builder function buildes out new instances of 
CfnReportGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteReports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-reports` |
| `exportConfig` | software.amazon.awscdk.services.codebuild.CfnReportGroup$ReportExportConfigProperty | [[cdk.support/lookup-entry]] | `:export-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnReportGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :delete-reports)]
      (. builder deleteReports data))
    (when-let [data (lookup-entry config id :export-config)]
      (. builder exportConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-report-group-report-export-config-property-builder
  "The cfn-report-group-report-export-config-property-builder function buildes out new instances of 
CfnReportGroup$ReportExportConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exportConfigType` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-config-type` |
| `s3Destination` | software.amazon.awscdk.services.codebuild.CfnReportGroup$S3ReportExportConfigProperty | [[cdk.support/lookup-entry]] | `:s3-destination` |"
  [stack id config]
  (let [builder (CfnReportGroup$ReportExportConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :export-config-type)]
      (. builder exportConfigType data))
    (when-let [data (lookup-entry config id :s3-destination)]
      (. builder s3Destination data))
    (.build builder)))


(defn cfn-report-group-s3-report-export-config-property-builder
  "The cfn-report-group-s3-report-export-config-property-builder function buildes out new instances of 
CfnReportGroup$S3ReportExportConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `encryptionDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encryption-disabled` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `packaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnReportGroup$S3ReportExportConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :bucket-owner)]
      (. builder bucketOwner data))
    (when-let [data (lookup-entry config id :encryption-disabled)]
      (. builder encryptionDisabled data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :packaging)]
      (. builder packaging data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-source-credential-builder
  "The cfn-source-credential-builder function buildes out new instances of 
CfnSourceCredential$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `serverType` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-type` |
| `token` | java.lang.String | [[cdk.support/lookup-entry]] | `:token` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnSourceCredential$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :server-type)]
      (. builder serverType data))
    (when-let [data (lookup-entry config id :token)]
      (. builder token data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-source-credential-props-builder
  "The cfn-source-credential-props-builder function buildes out new instances of 
CfnSourceCredentialProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `serverType` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-type` |
| `token` | java.lang.String | [[cdk.support/lookup-entry]] | `:token` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnSourceCredentialProps$Builder.)]
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :server-type)]
      (. builder serverType data))
    (when-let [data (lookup-entry config id :token)]
      (. builder token data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cloud-watch-logging-options-builder
  "The cloud-watch-logging-options-builder function buildes out new instances of 
CloudWatchLoggingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CloudWatchLoggingOptions$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn code-commit-source-props-builder
  "The code-commit-source-props-builder function buildes out new instances of 
CodeCommitSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchOrRef` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-or-ref` |
| `cloneDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:clone-depth` |
| `fetchSubmodules` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fetch-submodules` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `repository` | software.amazon.awscdk.services.codecommit.IRepository | [[cdk.support/lookup-entry]] | `:repository` |"
  [stack id config]
  (let [builder (CodeCommitSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :branch-or-ref)]
      (. builder branchOrRef data))
    (when-let [data (lookup-entry config id :clone-depth)]
      (. builder cloneDepth data))
    (when-let [data (lookup-entry config id :fetch-submodules)]
      (. builder fetchSubmodules data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (.build builder)))


(defn common-project-props-builder
  "The common-project-props-builder function buildes out new instances of 
CommonProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `badge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:badge` |
| `buildSpec` | software.amazon.awscdk.services.codebuild.BuildSpec | [[cdk.support/lookup-entry]] | `:build-spec` |
| `cache` | software.amazon.awscdk.services.codebuild.Cache | [[cdk.support/lookup-entry]] | `:cache` |
| `checkSecretsInPlainTextEnvVariables` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:check-secrets-in-plain-text-env-variables` |
| `concurrentBuildLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-build-limit` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `environment` | software.amazon.awscdk.services.codebuild.BuildEnvironment | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `grantReportGroupPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:grant-report-group-permissions` |
| `logging` | software.amazon.awscdk.services.codebuild.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `queuedTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:queued-timeout` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CommonProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :badge)]
      (. builder badge data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :cache)]
      (. builder cache data))
    (when-let [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
      (. builder checkSecretsInPlainTextEnvVariables data))
    (when-let [data (lookup-entry config id :concurrent-build-limit)]
      (. builder concurrentBuildLimit data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :grant-report-group-permissions)]
      (. builder grantReportGroupPermissions data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :queued-timeout)]
      (. builder queuedTimeout data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn docker-image-options-builder
  "The docker-image-options-builder function buildes out new instances of 
DockerImageOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretsManagerCredentials` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secrets-manager-credentials` |"
  [stack id config]
  (let [builder (DockerImageOptions$Builder.)]
    (when-let [data (lookup-entry config id :secrets-manager-credentials)]
      (. builder secretsManagerCredentials data))
    (.build builder)))


(defn efs-file-system-location-props-builder
  "The efs-file-system-location-props-builder function buildes out new instances of 
EfsFileSystemLocationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `mountOptions` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-options` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |"
  [stack id config]
  (let [builder (EfsFileSystemLocationProps$Builder.)]
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :mount-point)]
      (. builder mountPoint data))
    (.build builder)))


(defn file-system-config-builder
  "The file-system-config-builder function buildes out new instances of 
FileSystemConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.codebuild.CfnProject$ProjectFileSystemLocationProperty | [[cdk.support/lookup-entry]] | `:location` |"
  [stack id config]
  (let [builder (FileSystemConfig$Builder.)]
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (.build builder)))


(defn git-hub-enterprise-source-credentials-builder
  "The git-hub-enterprise-source-credentials-builder function buildes out new instances of 
GitHubEnterpriseSourceCredentials$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:access-token` |"
  [stack id config]
  (let [builder (GitHubEnterpriseSourceCredentials$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (.build builder)))


(defn git-hub-enterprise-source-credentials-props-builder
  "The git-hub-enterprise-source-credentials-props-builder function buildes out new instances of 
GitHubEnterpriseSourceCredentialsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:access-token` |"
  [stack id config]
  (let [builder (GitHubEnterpriseSourceCredentialsProps$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (.build builder)))


(defn git-hub-enterprise-source-props-builder
  "The git-hub-enterprise-source-props-builder function buildes out new instances of 
GitHubEnterpriseSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchOrRef` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-or-ref` |
| `buildStatusContext` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-status-context` |
| `buildStatusUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-status-url` |
| `cloneDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:clone-depth` |
| `fetchSubmodules` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fetch-submodules` |
| `httpsCloneUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:https-clone-url` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `ignoreSslErrors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-ssl-errors` |
| `reportBuildStatus` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-build-status` |
| `webhook` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook` |
| `webhookFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:webhook-filters` |
| `webhookTriggersBatchBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook-triggers-batch-build` |"
  [stack id config]
  (let [builder (GitHubEnterpriseSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :branch-or-ref)]
      (. builder branchOrRef data))
    (when-let [data (lookup-entry config id :build-status-context)]
      (. builder buildStatusContext data))
    (when-let [data (lookup-entry config id :build-status-url)]
      (. builder buildStatusUrl data))
    (when-let [data (lookup-entry config id :clone-depth)]
      (. builder cloneDepth data))
    (when-let [data (lookup-entry config id :fetch-submodules)]
      (. builder fetchSubmodules data))
    (when-let [data (lookup-entry config id :https-clone-url)]
      (. builder httpsCloneUrl data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :ignore-ssl-errors)]
      (. builder ignoreSslErrors data))
    (when-let [data (lookup-entry config id :report-build-status)]
      (. builder reportBuildStatus data))
    (when-let [data (lookup-entry config id :webhook)]
      (. builder webhook data))
    (when-let [data (lookup-entry config id :webhook-filters)]
      (. builder webhookFilters data))
    (when-let [data (lookup-entry config id :webhook-triggers-batch-build)]
      (. builder webhookTriggersBatchBuild data))
    (.build builder)))


(defn git-hub-source-credentials-builder
  "The git-hub-source-credentials-builder function buildes out new instances of 
GitHubSourceCredentials$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:access-token` |"
  [stack id config]
  (let [builder (GitHubSourceCredentials$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (.build builder)))


(defn git-hub-source-credentials-props-builder
  "The git-hub-source-credentials-props-builder function buildes out new instances of 
GitHubSourceCredentialsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:access-token` |"
  [stack id config]
  (let [builder (GitHubSourceCredentialsProps$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (.build builder)))


(defn git-hub-source-props-builder
  "The git-hub-source-props-builder function buildes out new instances of 
GitHubSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchOrRef` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-or-ref` |
| `buildStatusContext` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-status-context` |
| `buildStatusUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-status-url` |
| `cloneDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:clone-depth` |
| `fetchSubmodules` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fetch-submodules` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `repo` | java.lang.String | [[cdk.support/lookup-entry]] | `:repo` |
| `reportBuildStatus` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-build-status` |
| `webhook` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook` |
| `webhookFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:webhook-filters` |
| `webhookTriggersBatchBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook-triggers-batch-build` |"
  [stack id config]
  (let [builder (GitHubSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :branch-or-ref)]
      (. builder branchOrRef data))
    (when-let [data (lookup-entry config id :build-status-context)]
      (. builder buildStatusContext data))
    (when-let [data (lookup-entry config id :build-status-url)]
      (. builder buildStatusUrl data))
    (when-let [data (lookup-entry config id :clone-depth)]
      (. builder cloneDepth data))
    (when-let [data (lookup-entry config id :fetch-submodules)]
      (. builder fetchSubmodules data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :repo)]
      (. builder repo data))
    (when-let [data (lookup-entry config id :report-build-status)]
      (. builder reportBuildStatus data))
    (when-let [data (lookup-entry config id :webhook)]
      (. builder webhook data))
    (when-let [data (lookup-entry config id :webhook-filters)]
      (. builder webhookFilters data))
    (when-let [data (lookup-entry config id :webhook-triggers-batch-build)]
      (. builder webhookTriggersBatchBuild data))
    (.build builder)))


(defn logging-options-builder
  "The logging-options-builder function buildes out new instances of 
LoggingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatch` | software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions | [[cdk.support/lookup-entry]] | `:cloud-watch` |
| `s3` | software.amazon.awscdk.services.codebuild.S3LoggingOptions | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (LoggingOptions$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch)]
      (. builder cloudWatch data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn pipeline-project-builder
  "The pipeline-project-builder function buildes out new instances of 
PipelineProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `badge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:badge` |
| `buildSpec` | software.amazon.awscdk.services.codebuild.BuildSpec | [[cdk.support/lookup-entry]] | `:build-spec` |
| `cache` | software.amazon.awscdk.services.codebuild.Cache | [[cdk.support/lookup-entry]] | `:cache` |
| `checkSecretsInPlainTextEnvVariables` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:check-secrets-in-plain-text-env-variables` |
| `concurrentBuildLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-build-limit` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `environment` | software.amazon.awscdk.services.codebuild.BuildEnvironment | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `grantReportGroupPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:grant-report-group-permissions` |
| `logging` | software.amazon.awscdk.services.codebuild.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `queuedTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:queued-timeout` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (PipelineProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :badge)]
      (. builder badge data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :cache)]
      (. builder cache data))
    (when-let [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
      (. builder checkSecretsInPlainTextEnvVariables data))
    (when-let [data (lookup-entry config id :concurrent-build-limit)]
      (. builder concurrentBuildLimit data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :grant-report-group-permissions)]
      (. builder grantReportGroupPermissions data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :queued-timeout)]
      (. builder queuedTimeout data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn pipeline-project-props-builder
  "The pipeline-project-props-builder function buildes out new instances of 
PipelineProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `badge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:badge` |
| `buildSpec` | software.amazon.awscdk.services.codebuild.BuildSpec | [[cdk.support/lookup-entry]] | `:build-spec` |
| `cache` | software.amazon.awscdk.services.codebuild.Cache | [[cdk.support/lookup-entry]] | `:cache` |
| `checkSecretsInPlainTextEnvVariables` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:check-secrets-in-plain-text-env-variables` |
| `concurrentBuildLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-build-limit` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `environment` | software.amazon.awscdk.services.codebuild.BuildEnvironment | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `grantReportGroupPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:grant-report-group-permissions` |
| `logging` | software.amazon.awscdk.services.codebuild.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `queuedTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:queued-timeout` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (PipelineProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :badge)]
      (. builder badge data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :cache)]
      (. builder cache data))
    (when-let [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
      (. builder checkSecretsInPlainTextEnvVariables data))
    (when-let [data (lookup-entry config id :concurrent-build-limit)]
      (. builder concurrentBuildLimit data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :grant-report-group-permissions)]
      (. builder grantReportGroupPermissions data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :queued-timeout)]
      (. builder queuedTimeout data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn project-builder
  "The project-builder function buildes out new instances of 
Project$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `artifacts` | software.amazon.awscdk.services.codebuild.IArtifacts | [[cdk.support/lookup-entry]] | `:artifacts` |
| `badge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:badge` |
| `buildSpec` | software.amazon.awscdk.services.codebuild.BuildSpec | [[cdk.support/lookup-entry]] | `:build-spec` |
| `cache` | software.amazon.awscdk.services.codebuild.Cache | [[cdk.support/lookup-entry]] | `:cache` |
| `checkSecretsInPlainTextEnvVariables` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:check-secrets-in-plain-text-env-variables` |
| `concurrentBuildLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-build-limit` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `environment` | software.amazon.awscdk.services.codebuild.BuildEnvironment | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `grantReportGroupPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:grant-report-group-permissions` |
| `logging` | software.amazon.awscdk.services.codebuild.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `queuedTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:queued-timeout` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secondaryArtifacts` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-artifacts` |
| `secondarySources` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-sources` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `source` | software.amazon.awscdk.services.codebuild.ISource | [[cdk.support/lookup-entry]] | `:source` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (Project$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :artifacts)]
      (. builder artifacts data))
    (when-let [data (lookup-entry config id :badge)]
      (. builder badge data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :cache)]
      (. builder cache data))
    (when-let [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
      (. builder checkSecretsInPlainTextEnvVariables data))
    (when-let [data (lookup-entry config id :concurrent-build-limit)]
      (. builder concurrentBuildLimit data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :grant-report-group-permissions)]
      (. builder grantReportGroupPermissions data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :queued-timeout)]
      (. builder queuedTimeout data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secondary-artifacts)]
      (. builder secondaryArtifacts data))
    (when-let [data (lookup-entry config id :secondary-sources)]
      (. builder secondarySources data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn project-notify-on-options-builder
  "The project-notify-on-options-builder function buildes out new instances of 
ProjectNotifyOnOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |"
  [stack id config]
  (let [builder (ProjectNotifyOnOptions$Builder.)]
    (when-let [data (detail-type config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :notification-rule-name)]
      (. builder notificationRuleName data))
    (.build builder)))


(defn project-props-builder
  "The project-props-builder function buildes out new instances of 
ProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `artifacts` | software.amazon.awscdk.services.codebuild.IArtifacts | [[cdk.support/lookup-entry]] | `:artifacts` |
| `badge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:badge` |
| `buildSpec` | software.amazon.awscdk.services.codebuild.BuildSpec | [[cdk.support/lookup-entry]] | `:build-spec` |
| `cache` | software.amazon.awscdk.services.codebuild.Cache | [[cdk.support/lookup-entry]] | `:cache` |
| `checkSecretsInPlainTextEnvVariables` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:check-secrets-in-plain-text-env-variables` |
| `concurrentBuildLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-build-limit` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `environment` | software.amazon.awscdk.services.codebuild.BuildEnvironment | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `grantReportGroupPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:grant-report-group-permissions` |
| `logging` | software.amazon.awscdk.services.codebuild.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `queuedTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:queued-timeout` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secondaryArtifacts` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-artifacts` |
| `secondarySources` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-sources` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `source` | software.amazon.awscdk.services.codebuild.ISource | [[cdk.support/lookup-entry]] | `:source` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :artifacts)]
      (. builder artifacts data))
    (when-let [data (lookup-entry config id :badge)]
      (. builder badge data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :cache)]
      (. builder cache data))
    (when-let [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
      (. builder checkSecretsInPlainTextEnvVariables data))
    (when-let [data (lookup-entry config id :concurrent-build-limit)]
      (. builder concurrentBuildLimit data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :grant-report-group-permissions)]
      (. builder grantReportGroupPermissions data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :queued-timeout)]
      (. builder queuedTimeout data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secondary-artifacts)]
      (. builder secondaryArtifacts data))
    (when-let [data (lookup-entry config id :secondary-sources)]
      (. builder secondarySources data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn report-group-builder
  "The report-group-builder function buildes out new instances of 
ReportGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteReports` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-reports` |
| `exportBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:export-bucket` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `reportGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-group-name` |
| `type` | software.amazon.awscdk.services.codebuild.ReportGroupType | [[cdk.api.services.codebuild/report-group-type]] | `:type` |
| `zipExport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:zip-export` |"
  [stack id config]
  (let [builder (ReportGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :delete-reports)]
      (. builder deleteReports data))
    (when-let [data (lookup-entry config id :export-bucket)]
      (. builder exportBucket data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :report-group-name)]
      (. builder reportGroupName data))
    (when-let [data (report-group-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :zip-export)]
      (. builder zipExport data))
    (.build builder)))


(defn report-group-props-builder
  "The report-group-props-builder function buildes out new instances of 
ReportGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteReports` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-reports` |
| `exportBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:export-bucket` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `reportGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-group-name` |
| `type` | software.amazon.awscdk.services.codebuild.ReportGroupType | [[cdk.api.services.codebuild/report-group-type]] | `:type` |
| `zipExport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:zip-export` |"
  [stack id config]
  (let [builder (ReportGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :delete-reports)]
      (. builder deleteReports data))
    (when-let [data (lookup-entry config id :export-bucket)]
      (. builder exportBucket data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :report-group-name)]
      (. builder reportGroupName data))
    (when-let [data (report-group-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :zip-export)]
      (. builder zipExport data))
    (.build builder)))


(defn s3-artifacts-props-builder
  "The s3-artifacts-props-builder function buildes out new instances of 
S3ArtifactsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `encryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encryption` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `includeBuildId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-build-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packageZip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:package-zip` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (S3ArtifactsProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :include-build-id)]
      (. builder includeBuildId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :package-zip)]
      (. builder packageZip data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn s3-logging-options-builder
  "The s3-logging-options-builder function buildes out new instances of 
S3LoggingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (S3LoggingOptions$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn s3-source-props-builder
  "The s3-source-props-builder function buildes out new instances of 
S3SourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (S3SourceProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn source-config-builder
  "The source-config-builder function buildes out new instances of 
SourceConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildTriggers` | software.amazon.awscdk.services.codebuild.CfnProject$ProjectTriggersProperty | [[cdk.support/lookup-entry]] | `:build-triggers` |
| `sourceProperty` | software.amazon.awscdk.services.codebuild.CfnProject$SourceProperty | [[cdk.support/lookup-entry]] | `:source-property` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |"
  [stack id config]
  (let [builder (SourceConfig$Builder.)]
    (when-let [data (lookup-entry config id :build-triggers)]
      (. builder buildTriggers data))
    (when-let [data (lookup-entry config id :source-property)]
      (. builder sourceProperty data))
    (when-let [data (lookup-entry config id :source-version)]
      (. builder sourceVersion data))
    (.build builder)))


(defn source-props-builder
  "The source-props-builder function buildes out new instances of 
SourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |"
  [stack id config]
  (let [builder (SourceProps$Builder.)]
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (.build builder)))


(defn untrusted-code-boundary-policy-builder
  "The untrusted-code-boundary-policy-builder function buildes out new instances of 
UntrustedCodeBoundaryPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-statements` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |"
  [stack id config]
  (let [builder (UntrustedCodeBoundaryPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-statements)]
      (. builder additionalStatements data))
    (when-let [data (lookup-entry config id :managed-policy-name)]
      (. builder managedPolicyName data))
    (.build builder)))


(defn untrusted-code-boundary-policy-props-builder
  "The untrusted-code-boundary-policy-props-builder function buildes out new instances of 
UntrustedCodeBoundaryPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-statements` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |"
  [stack id config]
  (let [builder (UntrustedCodeBoundaryPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-statements)]
      (. builder additionalStatements data))
    (when-let [data (lookup-entry config id :managed-policy-name)]
      (. builder managedPolicyName data))
    (.build builder)))