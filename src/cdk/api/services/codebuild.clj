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


(defn artifacts-config-builder>
  "The artifacts-config-builder> function updates a ArtifactsConfig$Builder instance using the provided configuration.
  The function takes the ArtifactsConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactsProperty` | software.amazon.awscdk.services.codebuild.CfnProject$ArtifactsProperty | [[cdk.support/lookup-entry]] | `:artifacts-property` |
"
  [^ArtifactsConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :artifacts-property)]
    (. builder artifactsProperty data))
  (.build builder))


(defn artifacts-config-builder
  "Creates a  `ArtifactsConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[artifacts-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (artifacts-config-builder> (new ArtifactsConfig$Builder) id config))


(defn artifacts-props-builder>
  "The artifacts-props-builder> function updates a ArtifactsProps$Builder instance using the provided configuration.
  The function takes the ArtifactsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
"
  [^ArtifactsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (.build builder))


(defn artifacts-props-builder
  "Creates a  `ArtifactsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[artifacts-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (artifacts-props-builder> (new ArtifactsProps$Builder) id config))


(defn batch-build-config-builder>
  "The batch-build-config-builder> function updates a BatchBuildConfig$Builder instance using the provided configuration.
  The function takes the BatchBuildConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^BatchBuildConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn batch-build-config-builder
  "Creates a  `BatchBuildConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[batch-build-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (batch-build-config-builder> (new BatchBuildConfig$Builder) id config))


(defn bind-to-code-pipeline-options-builder>
  "The bind-to-code-pipeline-options-builder> function updates a BindToCodePipelineOptions$Builder instance using the provided configuration.
  The function takes the BindToCodePipelineOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:artifact-bucket` |
"
  [^BindToCodePipelineOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :artifact-bucket)]
    (. builder artifactBucket data))
  (.build builder))


(defn bind-to-code-pipeline-options-builder
  "Creates a  `BindToCodePipelineOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[bind-to-code-pipeline-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (bind-to-code-pipeline-options-builder> (new BindToCodePipelineOptions$Builder) id config))


(defn bit-bucket-source-credentials-builder>
  "The bit-bucket-source-credentials-builder> function updates a BitBucketSourceCredentials$Builder instance using the provided configuration.
  The function takes the BitBucketSourceCredentials$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `username` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:username` |
"
  [^BitBucketSourceCredentials$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn bit-bucket-source-credentials-builder
  "Creates a  `BitBucketSourceCredentials$Builder` instance using a scope and ID, applies the data configuration using the [[bit-bucket-source-credentials-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (bit-bucket-source-credentials-builder> (BitBucketSourceCredentials$Builder/create scope (name id)) id config))


(defn bit-bucket-source-credentials-props-builder>
  "The bit-bucket-source-credentials-props-builder> function updates a BitBucketSourceCredentialsProps$Builder instance using the provided configuration.
  The function takes the BitBucketSourceCredentialsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `username` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:username` |
"
  [^BitBucketSourceCredentialsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn bit-bucket-source-credentials-props-builder
  "Creates a  `BitBucketSourceCredentialsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[bit-bucket-source-credentials-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (bit-bucket-source-credentials-props-builder> (new BitBucketSourceCredentialsProps$Builder) id config))


(defn bit-bucket-source-props-builder>
  "The bit-bucket-source-props-builder> function updates a BitBucketSourceProps$Builder instance using the provided configuration.
  The function takes the BitBucketSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `webhookTriggersBatchBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook-triggers-batch-build` |
"
  [^BitBucketSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :branch-or-ref)]
    (. builder branchOrRef data))
  (when-some [data (lookup-entry config id :build-status-name)]
    (. builder buildStatusName data))
  (when-some [data (lookup-entry config id :build-status-url)]
    (. builder buildStatusUrl data))
  (when-some [data (lookup-entry config id :clone-depth)]
    (. builder cloneDepth data))
  (when-some [data (lookup-entry config id :fetch-submodules)]
    (. builder fetchSubmodules data))
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-some [data (lookup-entry config id :repo)]
    (. builder repo data))
  (when-some [data (lookup-entry config id :report-build-status)]
    (. builder reportBuildStatus data))
  (when-some [data (lookup-entry config id :webhook)]
    (. builder webhook data))
  (when-some [data (lookup-entry config id :webhook-filters)]
    (. builder webhookFilters data))
  (when-some [data (lookup-entry config id :webhook-triggers-batch-build)]
    (. builder webhookTriggersBatchBuild data))
  (.build builder))


(defn bit-bucket-source-props-builder
  "Creates a  `BitBucketSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[bit-bucket-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (bit-bucket-source-props-builder> (new BitBucketSourceProps$Builder) id config))


(defn bucket-cache-options-builder>
  "The bucket-cache-options-builder> function updates a BucketCacheOptions$Builder instance using the provided configuration.
  The function takes the BucketCacheOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^BucketCacheOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn bucket-cache-options-builder
  "Creates a  `BucketCacheOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[bucket-cache-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (bucket-cache-options-builder> (new BucketCacheOptions$Builder) id config))


(defn build-environment-builder>
  "The build-environment-builder> function updates a BuildEnvironment$Builder instance using the provided configuration.
  The function takes the BuildEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildImage` | software.amazon.awscdk.services.codebuild.IBuildImage | [[cdk.support/lookup-entry]] | `:build-image` |
| `certificate` | software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `computeType` | software.amazon.awscdk.services.codebuild.ComputeType | [[cdk.api.services.codebuild/compute-type]] | `:compute-type` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
"
  [^BuildEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :build-image)]
    (. builder buildImage data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (compute-type config id :compute-type)]
    (. builder computeType data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :privileged)]
    (. builder privileged data))
  (.build builder))


(defn build-environment-builder
  "Creates a  `BuildEnvironment$Builder` instance using a no-argument constructor, applies the data configuration using the [[build-environment-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (build-environment-builder> (new BuildEnvironment$Builder) id config))


(defn build-environment-certificate-builder>
  "The build-environment-certificate-builder> function updates a BuildEnvironmentCertificate$Builder instance using the provided configuration.
  The function takes the BuildEnvironmentCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
"
  [^BuildEnvironmentCertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (.build builder))


(defn build-environment-certificate-builder
  "Creates a  `BuildEnvironmentCertificate$Builder` instance using a no-argument constructor, applies the data configuration using the [[build-environment-certificate-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (build-environment-certificate-builder> (new BuildEnvironmentCertificate$Builder) id config))


(defn build-environment-variable-builder>
  "The build-environment-variable-builder> function updates a BuildEnvironmentVariable$Builder instance using the provided configuration.
  The function takes the BuildEnvironmentVariable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType | [[cdk.api.services.codebuild/build-environment-variable-type]] | `:type` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^BuildEnvironmentVariable$Builder builder id config]
  (when-some [data (build-environment-variable-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-environment-variable-builder
  "Creates a  `BuildEnvironmentVariable$Builder` instance using a no-argument constructor, applies the data configuration using the [[build-environment-variable-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (build-environment-variable-builder> (new BuildEnvironmentVariable$Builder) id config))


(defn build-image-bind-options-builder
  "Creates a  `BuildImageBindOptions$Builder` instance using a no-argument construct, then builds it."
  []
  (.build (new BuildImageBindOptions$Builder)))


(defn build-image-config-builder
  "Creates a  `BuildImageConfig$Builder` instance using a no-argument construct, then builds it."
  []
  (.build (new BuildImageConfig$Builder)))


(defn cfn-fleet-builder>
  "The cfn-fleet-builder> function updates a CfnFleet$Builder instance using the provided configuration.
  The function takes the CfnFleet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-capacity` |
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `environmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-type` |
| `fleetServiceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-service-role` |
| `fleetVpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fleet-vpc-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overflowBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:overflow-behavior` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFleet$Builder builder id config]
  (when-some [data (lookup-entry config id :base-capacity)]
    (. builder baseCapacity data))
  (when-some [data (lookup-entry config id :compute-type)]
    (. builder computeType data))
  (when-some [data (lookup-entry config id :environment-type)]
    (. builder environmentType data))
  (when-some [data (lookup-entry config id :fleet-service-role)]
    (. builder fleetServiceRole data))
  (when-some [data (lookup-entry config id :fleet-vpc-config)]
    (. builder fleetVpcConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :overflow-behavior)]
    (. builder overflowBehavior data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fleet-builder
  "Creates a  `CfnFleet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-fleet-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-fleet-builder> (CfnFleet$Builder/create scope (name id)) id config))


(defn cfn-fleet-props-builder>
  "The cfn-fleet-props-builder> function updates a CfnFleetProps$Builder instance using the provided configuration.
  The function takes the CfnFleetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-capacity` |
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `environmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-type` |
| `fleetServiceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-service-role` |
| `fleetVpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fleet-vpc-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overflowBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:overflow-behavior` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFleetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :base-capacity)]
    (. builder baseCapacity data))
  (when-some [data (lookup-entry config id :compute-type)]
    (. builder computeType data))
  (when-some [data (lookup-entry config id :environment-type)]
    (. builder environmentType data))
  (when-some [data (lookup-entry config id :fleet-service-role)]
    (. builder fleetServiceRole data))
  (when-some [data (lookup-entry config id :fleet-vpc-config)]
    (. builder fleetVpcConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :overflow-behavior)]
    (. builder overflowBehavior data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fleet-props-builder
  "Creates a  `CfnFleetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-props-builder> (new CfnFleetProps$Builder) id config))


(defn cfn-fleet-vpc-config-property-builder>
  "The cfn-fleet-vpc-config-property-builder> function updates a CfnFleet$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnFleet$VpcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-fleet-vpc-config-property-builder
  "Creates a  `CfnFleet$VpcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-vpc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-vpc-config-property-builder> (new CfnFleet$VpcConfigProperty$Builder) id config))


(defn cfn-project-artifacts-property-builder>
  "The cfn-project-artifacts-property-builder> function updates a CfnProject$ArtifactsProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ArtifactsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnProject$ArtifactsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :artifact-identifier)]
    (. builder artifactIdentifier data))
  (when-some [data (lookup-entry config id :encryption-disabled)]
    (. builder encryptionDisabled data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace-type)]
    (. builder namespaceType data))
  (when-some [data (lookup-entry config id :override-artifact-name)]
    (. builder overrideArtifactName data))
  (when-some [data (lookup-entry config id :packaging)]
    (. builder packaging data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-project-artifacts-property-builder
  "Creates a  `CfnProject$ArtifactsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-artifacts-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-artifacts-property-builder> (new CfnProject$ArtifactsProperty$Builder) id config))


(defn cfn-project-batch-restrictions-property-builder>
  "The cfn-project-batch-restrictions-property-builder> function updates a CfnProject$BatchRestrictionsProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$BatchRestrictionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeTypesAllowed` | java.util.List | [[cdk.support/lookup-entry]] | `:compute-types-allowed` |
| `maximumBuildsAllowed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-builds-allowed` |
"
  [^CfnProject$BatchRestrictionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-types-allowed)]
    (. builder computeTypesAllowed data))
  (when-some [data (lookup-entry config id :maximum-builds-allowed)]
    (. builder maximumBuildsAllowed data))
  (.build builder))


(defn cfn-project-batch-restrictions-property-builder
  "Creates a  `CfnProject$BatchRestrictionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-batch-restrictions-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-batch-restrictions-property-builder> (new CfnProject$BatchRestrictionsProperty$Builder) id config))


(defn cfn-project-build-status-config-property-builder>
  "The cfn-project-build-status-config-property-builder> function updates a CfnProject$BuildStatusConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$BuildStatusConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `context` | java.lang.String | [[cdk.support/lookup-entry]] | `:context` |
| `targetUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-url` |
"
  [^CfnProject$BuildStatusConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :context)]
    (. builder context data))
  (when-some [data (lookup-entry config id :target-url)]
    (. builder targetUrl data))
  (.build builder))


(defn cfn-project-build-status-config-property-builder
  "Creates a  `CfnProject$BuildStatusConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-build-status-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-build-status-config-property-builder> (new CfnProject$BuildStatusConfigProperty$Builder) id config))


(defn cfn-project-builder>
  "The cfn-project-builder> function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfig` | software.amazon.awscdk.services.codebuild.CfnProject$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnProject$Builder builder id config]
  (when-some [data (lookup-entry config id :artifacts)]
    (. builder artifacts data))
  (when-some [data (lookup-entry config id :badge-enabled)]
    (. builder badgeEnabled data))
  (when-some [data (lookup-entry config id :build-batch-config)]
    (. builder buildBatchConfig data))
  (when-some [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-some [data (lookup-entry config id :concurrent-build-limit)]
    (. builder concurrentBuildLimit data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :logs-config)]
    (. builder logsConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :queued-timeout-in-minutes)]
    (. builder queuedTimeoutInMinutes data))
  (when-some [data (lookup-entry config id :resource-access-role)]
    (. builder resourceAccessRole data))
  (when-some [data (lookup-entry config id :secondary-artifacts)]
    (. builder secondaryArtifacts data))
  (when-some [data (lookup-entry config id :secondary-source-versions)]
    (. builder secondarySourceVersions data))
  (when-some [data (lookup-entry config id :secondary-sources)]
    (. builder secondarySources data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :source-version)]
    (. builder sourceVersion data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (when-some [data (lookup-entry config id :triggers)]
    (. builder triggers data))
  (when-some [data (lookup-entry config id :visibility)]
    (. builder visibility data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-project-builder
  "Creates a  `CfnProject$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-project-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-project-builder> (CfnProject$Builder/create scope (name id)) id config))


(defn cfn-project-cloud-watch-logs-config-property-builder>
  "The cfn-project-cloud-watch-logs-config-property-builder> function updates a CfnProject$CloudWatchLogsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$CloudWatchLogsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
"
  [^CfnProject$CloudWatchLogsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (.build builder))


(defn cfn-project-cloud-watch-logs-config-property-builder
  "Creates a  `CfnProject$CloudWatchLogsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-cloud-watch-logs-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-cloud-watch-logs-config-property-builder> (new CfnProject$CloudWatchLogsConfigProperty$Builder) id config))


(defn cfn-project-environment-property-builder>
  "The cfn-project-environment-property-builder> function updates a CfnProject$EnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$EnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnProject$EnvironmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :compute-type)]
    (. builder computeType data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :fleet)]
    (. builder fleet data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :image-pull-credentials-type)]
    (. builder imagePullCredentialsType data))
  (when-some [data (lookup-entry config id :privileged-mode)]
    (. builder privilegedMode data))
  (when-some [data (lookup-entry config id :registry-credential)]
    (. builder registryCredential data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-project-environment-property-builder
  "Creates a  `CfnProject$EnvironmentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-environment-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-environment-property-builder> (new CfnProject$EnvironmentProperty$Builder) id config))


(defn cfn-project-environment-variable-property-builder>
  "The cfn-project-environment-variable-property-builder> function updates a CfnProject$EnvironmentVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$EnvironmentVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnProject$EnvironmentVariableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-project-environment-variable-property-builder
  "Creates a  `CfnProject$EnvironmentVariableProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-environment-variable-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-environment-variable-property-builder> (new CfnProject$EnvironmentVariableProperty$Builder) id config))


(defn cfn-project-git-submodules-config-property-builder>
  "The cfn-project-git-submodules-config-property-builder> function updates a CfnProject$GitSubmodulesConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$GitSubmodulesConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fetchSubmodules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fetch-submodules` |
"
  [^CfnProject$GitSubmodulesConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fetch-submodules)]
    (. builder fetchSubmodules data))
  (.build builder))


(defn cfn-project-git-submodules-config-property-builder
  "Creates a  `CfnProject$GitSubmodulesConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-git-submodules-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-git-submodules-config-property-builder> (new CfnProject$GitSubmodulesConfigProperty$Builder) id config))


(defn cfn-project-logs-config-property-builder>
  "The cfn-project-logs-config-property-builder> function updates a CfnProject$LogsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$LogsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `s3Logs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-logs` |
"
  [^CfnProject$LogsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-logs)]
    (. builder cloudWatchLogs data))
  (when-some [data (lookup-entry config id :s3-logs)]
    (. builder s3Logs data))
  (.build builder))


(defn cfn-project-logs-config-property-builder
  "Creates a  `CfnProject$LogsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-logs-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-logs-config-property-builder> (new CfnProject$LogsConfigProperty$Builder) id config))


(defn cfn-project-project-build-batch-config-property-builder>
  "The cfn-project-project-build-batch-config-property-builder> function updates a CfnProject$ProjectBuildBatchConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ProjectBuildBatchConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchReportMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:batch-report-mode` |
| `combineArtifacts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:combine-artifacts` |
| `restrictions` | software.amazon.awscdk.services.codebuild.CfnProject$BatchRestrictionsProperty | [[cdk.support/lookup-entry]] | `:restrictions` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `timeoutInMins` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-mins` |
"
  [^CfnProject$ProjectBuildBatchConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-report-mode)]
    (. builder batchReportMode data))
  (when-some [data (lookup-entry config id :combine-artifacts)]
    (. builder combineArtifacts data))
  (when-some [data (lookup-entry config id :restrictions)]
    (. builder restrictions data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :timeout-in-mins)]
    (. builder timeoutInMins data))
  (.build builder))


(defn cfn-project-project-build-batch-config-property-builder
  "Creates a  `CfnProject$ProjectBuildBatchConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-project-build-batch-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-project-build-batch-config-property-builder> (new CfnProject$ProjectBuildBatchConfigProperty$Builder) id config))


(defn cfn-project-project-cache-property-builder>
  "The cfn-project-project-cache-property-builder> function updates a CfnProject$ProjectCacheProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ProjectCacheProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `modes` | java.util.List | [[cdk.support/lookup-entry]] | `:modes` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnProject$ProjectCacheProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :modes)]
    (. builder modes data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-project-project-cache-property-builder
  "Creates a  `CfnProject$ProjectCacheProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-project-cache-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-project-cache-property-builder> (new CfnProject$ProjectCacheProperty$Builder) id config))


(defn cfn-project-project-file-system-location-property-builder>
  "The cfn-project-project-file-system-location-property-builder> function updates a CfnProject$ProjectFileSystemLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ProjectFileSystemLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `mountOptions` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-options` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnProject$ProjectFileSystemLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-project-project-file-system-location-property-builder
  "Creates a  `CfnProject$ProjectFileSystemLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-project-file-system-location-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-project-file-system-location-property-builder> (new CfnProject$ProjectFileSystemLocationProperty$Builder) id config))


(defn cfn-project-project-fleet-property-builder>
  "The cfn-project-project-fleet-property-builder> function updates a CfnProject$ProjectFleetProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ProjectFleetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fleetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-arn` |
"
  [^CfnProject$ProjectFleetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fleet-arn)]
    (. builder fleetArn data))
  (.build builder))


(defn cfn-project-project-fleet-property-builder
  "Creates a  `CfnProject$ProjectFleetProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-project-fleet-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-project-fleet-property-builder> (new CfnProject$ProjectFleetProperty$Builder) id config))


(defn cfn-project-project-source-version-property-builder>
  "The cfn-project-project-source-version-property-builder> function updates a CfnProject$ProjectSourceVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ProjectSourceVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-identifier` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |
"
  [^CfnProject$ProjectSourceVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source-identifier)]
    (. builder sourceIdentifier data))
  (when-some [data (lookup-entry config id :source-version)]
    (. builder sourceVersion data))
  (.build builder))


(defn cfn-project-project-source-version-property-builder
  "Creates a  `CfnProject$ProjectSourceVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-project-source-version-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-project-source-version-property-builder> (new CfnProject$ProjectSourceVersionProperty$Builder) id config))


(defn cfn-project-project-triggers-property-builder>
  "The cfn-project-project-triggers-property-builder> function updates a CfnProject$ProjectTriggersProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ProjectTriggersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildType` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-type` |
| `filterGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-groups` |
| `webhook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:webhook` |
"
  [^CfnProject$ProjectTriggersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :build-type)]
    (. builder buildType data))
  (when-some [data (lookup-entry config id :filter-groups)]
    (. builder filterGroups data))
  (when-some [data (lookup-entry config id :webhook)]
    (. builder webhook data))
  (.build builder))


(defn cfn-project-project-triggers-property-builder
  "Creates a  `CfnProject$ProjectTriggersProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-project-triggers-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-project-triggers-property-builder> (new CfnProject$ProjectTriggersProperty$Builder) id config))


(defn cfn-project-props-builder>
  "The cfn-project-props-builder> function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfig` | software.amazon.awscdk.services.codebuild.CfnProject$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :artifacts)]
    (. builder artifacts data))
  (when-some [data (lookup-entry config id :badge-enabled)]
    (. builder badgeEnabled data))
  (when-some [data (lookup-entry config id :build-batch-config)]
    (. builder buildBatchConfig data))
  (when-some [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-some [data (lookup-entry config id :concurrent-build-limit)]
    (. builder concurrentBuildLimit data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :logs-config)]
    (. builder logsConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :queued-timeout-in-minutes)]
    (. builder queuedTimeoutInMinutes data))
  (when-some [data (lookup-entry config id :resource-access-role)]
    (. builder resourceAccessRole data))
  (when-some [data (lookup-entry config id :secondary-artifacts)]
    (. builder secondaryArtifacts data))
  (when-some [data (lookup-entry config id :secondary-source-versions)]
    (. builder secondarySourceVersions data))
  (when-some [data (lookup-entry config id :secondary-sources)]
    (. builder secondarySources data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :source-version)]
    (. builder sourceVersion data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (when-some [data (lookup-entry config id :triggers)]
    (. builder triggers data))
  (when-some [data (lookup-entry config id :visibility)]
    (. builder visibility data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-project-props-builder
  "Creates a  `CfnProjectProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-props-builder> (new CfnProjectProps$Builder) id config))


(defn cfn-project-registry-credential-property-builder>
  "The cfn-project-registry-credential-property-builder> function updates a CfnProject$RegistryCredentialProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$RegistryCredentialProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credential` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential` |
| `credentialProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential-provider` |
"
  [^CfnProject$RegistryCredentialProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :credential)]
    (. builder credential data))
  (when-some [data (lookup-entry config id :credential-provider)]
    (. builder credentialProvider data))
  (.build builder))


(defn cfn-project-registry-credential-property-builder
  "Creates a  `CfnProject$RegistryCredentialProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-registry-credential-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-registry-credential-property-builder> (new CfnProject$RegistryCredentialProperty$Builder) id config))


(defn cfn-project-s3-logs-config-property-builder>
  "The cfn-project-s3-logs-config-property-builder> function updates a CfnProject$S3LogsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$S3LogsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionDisabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-disabled` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnProject$S3LogsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-disabled)]
    (. builder encryptionDisabled data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-project-s3-logs-config-property-builder
  "Creates a  `CfnProject$S3LogsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-s3-logs-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-s3-logs-config-property-builder> (new CfnProject$S3LogsConfigProperty$Builder) id config))


(defn cfn-project-source-auth-property-builder>
  "The cfn-project-source-auth-property-builder> function updates a CfnProject$SourceAuthProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$SourceAuthProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnProject$SourceAuthProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-project-source-auth-property-builder
  "Creates a  `CfnProject$SourceAuthProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-source-auth-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-source-auth-property-builder> (new CfnProject$SourceAuthProperty$Builder) id config))


(defn cfn-project-source-property-builder>
  "The cfn-project-source-property-builder> function updates a CfnProject$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnProject$SourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-some [data (lookup-entry config id :build-spec)]
    (. builder buildSpec data))
  (when-some [data (lookup-entry config id :build-status-config)]
    (. builder buildStatusConfig data))
  (when-some [data (lookup-entry config id :git-clone-depth)]
    (. builder gitCloneDepth data))
  (when-some [data (lookup-entry config id :git-submodules-config)]
    (. builder gitSubmodulesConfig data))
  (when-some [data (lookup-entry config id :insecure-ssl)]
    (. builder insecureSsl data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :report-build-status)]
    (. builder reportBuildStatus data))
  (when-some [data (lookup-entry config id :source-identifier)]
    (. builder sourceIdentifier data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-project-source-property-builder
  "Creates a  `CfnProject$SourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-source-property-builder> (new CfnProject$SourceProperty$Builder) id config))


(defn cfn-project-vpc-config-property-builder>
  "The cfn-project-vpc-config-property-builder> function updates a CfnProject$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnProject$VpcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-project-vpc-config-property-builder
  "Creates a  `CfnProject$VpcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-vpc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-vpc-config-property-builder> (new CfnProject$VpcConfigProperty$Builder) id config))


(defn cfn-project-webhook-filter-property-builder>
  "The cfn-project-webhook-filter-property-builder> function updates a CfnProject$WebhookFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$WebhookFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeMatchedPattern` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-matched-pattern` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnProject$WebhookFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-matched-pattern)]
    (. builder excludeMatchedPattern data))
  (when-some [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-project-webhook-filter-property-builder
  "Creates a  `CfnProject$WebhookFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-webhook-filter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-webhook-filter-property-builder> (new CfnProject$WebhookFilterProperty$Builder) id config))


(defn cfn-report-group-builder>
  "The cfn-report-group-builder> function updates a CfnReportGroup$Builder instance using the provided configuration.
  The function takes the CfnReportGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteReports` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-reports` |
| `exportConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:export-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnReportGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-reports)]
    (. builder deleteReports data))
  (when-some [data (lookup-entry config id :export-config)]
    (. builder exportConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-report-group-builder
  "Creates a  `CfnReportGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-report-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-report-group-builder> (CfnReportGroup$Builder/create scope (name id)) id config))


(defn cfn-report-group-props-builder>
  "The cfn-report-group-props-builder> function updates a CfnReportGroupProps$Builder instance using the provided configuration.
  The function takes the CfnReportGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteReports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-reports` |
| `exportConfig` | software.amazon.awscdk.services.codebuild.CfnReportGroup$ReportExportConfigProperty | [[cdk.support/lookup-entry]] | `:export-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnReportGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-reports)]
    (. builder deleteReports data))
  (when-some [data (lookup-entry config id :export-config)]
    (. builder exportConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-report-group-props-builder
  "Creates a  `CfnReportGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-report-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-report-group-props-builder> (new CfnReportGroupProps$Builder) id config))


(defn cfn-report-group-report-export-config-property-builder>
  "The cfn-report-group-report-export-config-property-builder> function updates a CfnReportGroup$ReportExportConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnReportGroup$ReportExportConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exportConfigType` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-config-type` |
| `s3Destination` | software.amazon.awscdk.services.codebuild.CfnReportGroup$S3ReportExportConfigProperty | [[cdk.support/lookup-entry]] | `:s3-destination` |
"
  [^CfnReportGroup$ReportExportConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :export-config-type)]
    (. builder exportConfigType data))
  (when-some [data (lookup-entry config id :s3-destination)]
    (. builder s3Destination data))
  (.build builder))


(defn cfn-report-group-report-export-config-property-builder
  "Creates a  `CfnReportGroup$ReportExportConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-report-group-report-export-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-report-group-report-export-config-property-builder> (new CfnReportGroup$ReportExportConfigProperty$Builder) id config))


(defn cfn-report-group-s3-report-export-config-property-builder>
  "The cfn-report-group-s3-report-export-config-property-builder> function updates a CfnReportGroup$S3ReportExportConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnReportGroup$S3ReportExportConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `encryptionDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encryption-disabled` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `packaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnReportGroup$S3ReportExportConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :bucket-owner)]
    (. builder bucketOwner data))
  (when-some [data (lookup-entry config id :encryption-disabled)]
    (. builder encryptionDisabled data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :packaging)]
    (. builder packaging data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-report-group-s3-report-export-config-property-builder
  "Creates a  `CfnReportGroup$S3ReportExportConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-report-group-s3-report-export-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-report-group-s3-report-export-config-property-builder> (new CfnReportGroup$S3ReportExportConfigProperty$Builder) id config))


(defn cfn-source-credential-builder>
  "The cfn-source-credential-builder> function updates a CfnSourceCredential$Builder instance using the provided configuration.
  The function takes the CfnSourceCredential$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `serverType` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-type` |
| `token` | java.lang.String | [[cdk.support/lookup-entry]] | `:token` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnSourceCredential$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :server-type)]
    (. builder serverType data))
  (when-some [data (lookup-entry config id :token)]
    (. builder token data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-source-credential-builder
  "Creates a  `CfnSourceCredential$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-source-credential-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-source-credential-builder> (CfnSourceCredential$Builder/create scope (name id)) id config))


(defn cfn-source-credential-props-builder>
  "The cfn-source-credential-props-builder> function updates a CfnSourceCredentialProps$Builder instance using the provided configuration.
  The function takes the CfnSourceCredentialProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `serverType` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-type` |
| `token` | java.lang.String | [[cdk.support/lookup-entry]] | `:token` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnSourceCredentialProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :server-type)]
    (. builder serverType data))
  (when-some [data (lookup-entry config id :token)]
    (. builder token data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-source-credential-props-builder
  "Creates a  `CfnSourceCredentialProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-source-credential-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-source-credential-props-builder> (new CfnSourceCredentialProps$Builder) id config))


(defn cloud-watch-logging-options-builder>
  "The cloud-watch-logging-options-builder> function updates a CloudWatchLoggingOptions$Builder instance using the provided configuration.
  The function takes the CloudWatchLoggingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CloudWatchLoggingOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cloud-watch-logging-options-builder
  "Creates a  `CloudWatchLoggingOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[cloud-watch-logging-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cloud-watch-logging-options-builder> (new CloudWatchLoggingOptions$Builder) id config))


(defn code-commit-source-props-builder>
  "The code-commit-source-props-builder> function updates a CodeCommitSourceProps$Builder instance using the provided configuration.
  The function takes the CodeCommitSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchOrRef` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-or-ref` |
| `cloneDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:clone-depth` |
| `fetchSubmodules` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fetch-submodules` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `repository` | software.amazon.awscdk.services.codecommit.IRepository | [[cdk.support/lookup-entry]] | `:repository` |
"
  [^CodeCommitSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :branch-or-ref)]
    (. builder branchOrRef data))
  (when-some [data (lookup-entry config id :clone-depth)]
    (. builder cloneDepth data))
  (when-some [data (lookup-entry config id :fetch-submodules)]
    (. builder fetchSubmodules data))
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (.build builder))


(defn code-commit-source-props-builder
  "Creates a  `CodeCommitSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[code-commit-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (code-commit-source-props-builder> (new CodeCommitSourceProps$Builder) id config))


(defn common-project-props-builder>
  "The common-project-props-builder> function updates a CommonProjectProps$Builder instance using the provided configuration.
  The function takes the CommonProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CommonProjectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-some [data (lookup-entry config id :badge)]
    (. builder badge data))
  (when-some [data (lookup-entry config id :build-spec)]
    (. builder buildSpec data))
  (when-some [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-some [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
    (. builder checkSecretsInPlainTextEnvVariables data))
  (when-some [data (lookup-entry config id :concurrent-build-limit)]
    (. builder concurrentBuildLimit data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :grant-report-group-permissions)]
    (. builder grantReportGroupPermissions data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :queued-timeout)]
    (. builder queuedTimeout data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :ssm-session-permissions)]
    (. builder ssmSessionPermissions data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn common-project-props-builder
  "Creates a  `CommonProjectProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[common-project-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (common-project-props-builder> (new CommonProjectProps$Builder) id config))


(defn docker-image-options-builder>
  "The docker-image-options-builder> function updates a DockerImageOptions$Builder instance using the provided configuration.
  The function takes the DockerImageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretsManagerCredentials` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secrets-manager-credentials` |
"
  [^DockerImageOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :secrets-manager-credentials)]
    (. builder secretsManagerCredentials data))
  (.build builder))


(defn docker-image-options-builder
  "Creates a  `DockerImageOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[docker-image-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (docker-image-options-builder> (new DockerImageOptions$Builder) id config))


(defn efs-file-system-location-props-builder>
  "The efs-file-system-location-props-builder> function updates a EfsFileSystemLocationProps$Builder instance using the provided configuration.
  The function takes the EfsFileSystemLocationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `mountOptions` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-options` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
"
  [^EfsFileSystemLocationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (.build builder))


(defn efs-file-system-location-props-builder
  "Creates a  `EfsFileSystemLocationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[efs-file-system-location-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (efs-file-system-location-props-builder> (new EfsFileSystemLocationProps$Builder) id config))


(defn file-system-config-builder>
  "The file-system-config-builder> function updates a FileSystemConfig$Builder instance using the provided configuration.
  The function takes the FileSystemConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.codebuild.CfnProject$ProjectFileSystemLocationProperty | [[cdk.support/lookup-entry]] | `:location` |
"
  [^FileSystemConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (.build builder))


(defn file-system-config-builder
  "Creates a  `FileSystemConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[file-system-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (file-system-config-builder> (new FileSystemConfig$Builder) id config))


(defn git-hub-enterprise-source-credentials-builder>
  "The git-hub-enterprise-source-credentials-builder> function updates a GitHubEnterpriseSourceCredentials$Builder instance using the provided configuration.
  The function takes the GitHubEnterpriseSourceCredentials$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:access-token` |
"
  [^GitHubEnterpriseSourceCredentials$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (.build builder))


(defn git-hub-enterprise-source-credentials-builder
  "Creates a  `GitHubEnterpriseSourceCredentials$Builder` instance using a scope and ID, applies the data configuration using the [[git-hub-enterprise-source-credentials-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (git-hub-enterprise-source-credentials-builder> (GitHubEnterpriseSourceCredentials$Builder/create scope (name id)) id config))


(defn git-hub-enterprise-source-credentials-props-builder>
  "The git-hub-enterprise-source-credentials-props-builder> function updates a GitHubEnterpriseSourceCredentialsProps$Builder instance using the provided configuration.
  The function takes the GitHubEnterpriseSourceCredentialsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:access-token` |
"
  [^GitHubEnterpriseSourceCredentialsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (.build builder))


(defn git-hub-enterprise-source-credentials-props-builder
  "Creates a  `GitHubEnterpriseSourceCredentialsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[git-hub-enterprise-source-credentials-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (git-hub-enterprise-source-credentials-props-builder> (new GitHubEnterpriseSourceCredentialsProps$Builder) id config))


(defn git-hub-enterprise-source-props-builder>
  "The git-hub-enterprise-source-props-builder> function updates a GitHubEnterpriseSourceProps$Builder instance using the provided configuration.
  The function takes the GitHubEnterpriseSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `webhookTriggersBatchBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook-triggers-batch-build` |
"
  [^GitHubEnterpriseSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :branch-or-ref)]
    (. builder branchOrRef data))
  (when-some [data (lookup-entry config id :build-status-context)]
    (. builder buildStatusContext data))
  (when-some [data (lookup-entry config id :build-status-url)]
    (. builder buildStatusUrl data))
  (when-some [data (lookup-entry config id :clone-depth)]
    (. builder cloneDepth data))
  (when-some [data (lookup-entry config id :fetch-submodules)]
    (. builder fetchSubmodules data))
  (when-some [data (lookup-entry config id :https-clone-url)]
    (. builder httpsCloneUrl data))
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :ignore-ssl-errors)]
    (. builder ignoreSslErrors data))
  (when-some [data (lookup-entry config id :report-build-status)]
    (. builder reportBuildStatus data))
  (when-some [data (lookup-entry config id :webhook)]
    (. builder webhook data))
  (when-some [data (lookup-entry config id :webhook-filters)]
    (. builder webhookFilters data))
  (when-some [data (lookup-entry config id :webhook-triggers-batch-build)]
    (. builder webhookTriggersBatchBuild data))
  (.build builder))


(defn git-hub-enterprise-source-props-builder
  "Creates a  `GitHubEnterpriseSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[git-hub-enterprise-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (git-hub-enterprise-source-props-builder> (new GitHubEnterpriseSourceProps$Builder) id config))


(defn git-hub-source-credentials-builder>
  "The git-hub-source-credentials-builder> function updates a GitHubSourceCredentials$Builder instance using the provided configuration.
  The function takes the GitHubSourceCredentials$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:access-token` |
"
  [^GitHubSourceCredentials$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (.build builder))


(defn git-hub-source-credentials-builder
  "Creates a  `GitHubSourceCredentials$Builder` instance using a scope and ID, applies the data configuration using the [[git-hub-source-credentials-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (git-hub-source-credentials-builder> (GitHubSourceCredentials$Builder/create scope (name id)) id config))


(defn git-hub-source-credentials-props-builder>
  "The git-hub-source-credentials-props-builder> function updates a GitHubSourceCredentialsProps$Builder instance using the provided configuration.
  The function takes the GitHubSourceCredentialsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:access-token` |
"
  [^GitHubSourceCredentialsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (.build builder))


(defn git-hub-source-credentials-props-builder
  "Creates a  `GitHubSourceCredentialsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[git-hub-source-credentials-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (git-hub-source-credentials-props-builder> (new GitHubSourceCredentialsProps$Builder) id config))


(defn git-hub-source-props-builder>
  "The git-hub-source-props-builder> function updates a GitHubSourceProps$Builder instance using the provided configuration.
  The function takes the GitHubSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `webhookTriggersBatchBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:webhook-triggers-batch-build` |
"
  [^GitHubSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :branch-or-ref)]
    (. builder branchOrRef data))
  (when-some [data (lookup-entry config id :build-status-context)]
    (. builder buildStatusContext data))
  (when-some [data (lookup-entry config id :build-status-url)]
    (. builder buildStatusUrl data))
  (when-some [data (lookup-entry config id :clone-depth)]
    (. builder cloneDepth data))
  (when-some [data (lookup-entry config id :fetch-submodules)]
    (. builder fetchSubmodules data))
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-some [data (lookup-entry config id :repo)]
    (. builder repo data))
  (when-some [data (lookup-entry config id :report-build-status)]
    (. builder reportBuildStatus data))
  (when-some [data (lookup-entry config id :webhook)]
    (. builder webhook data))
  (when-some [data (lookup-entry config id :webhook-filters)]
    (. builder webhookFilters data))
  (when-some [data (lookup-entry config id :webhook-triggers-batch-build)]
    (. builder webhookTriggersBatchBuild data))
  (.build builder))


(defn git-hub-source-props-builder
  "Creates a  `GitHubSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[git-hub-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (git-hub-source-props-builder> (new GitHubSourceProps$Builder) id config))


(defn logging-options-builder>
  "The logging-options-builder> function updates a LoggingOptions$Builder instance using the provided configuration.
  The function takes the LoggingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatch` | software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions | [[cdk.support/lookup-entry]] | `:cloud-watch` |
| `s3` | software.amazon.awscdk.services.codebuild.S3LoggingOptions | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^LoggingOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch)]
    (. builder cloudWatch data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn logging-options-builder
  "Creates a  `LoggingOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[logging-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (logging-options-builder> (new LoggingOptions$Builder) id config))


(defn pipeline-project-builder>
  "The pipeline-project-builder> function updates a PipelineProject$Builder instance using the provided configuration.
  The function takes the PipelineProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^PipelineProject$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-some [data (lookup-entry config id :badge)]
    (. builder badge data))
  (when-some [data (lookup-entry config id :build-spec)]
    (. builder buildSpec data))
  (when-some [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-some [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
    (. builder checkSecretsInPlainTextEnvVariables data))
  (when-some [data (lookup-entry config id :concurrent-build-limit)]
    (. builder concurrentBuildLimit data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :grant-report-group-permissions)]
    (. builder grantReportGroupPermissions data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :queued-timeout)]
    (. builder queuedTimeout data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :ssm-session-permissions)]
    (. builder ssmSessionPermissions data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn pipeline-project-builder
  "Creates a  `PipelineProject$Builder` instance using a scope and ID, applies the data configuration using the [[pipeline-project-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (pipeline-project-builder> (PipelineProject$Builder/create scope (name id)) id config))


(defn pipeline-project-props-builder>
  "The pipeline-project-props-builder> function updates a PipelineProjectProps$Builder instance using the provided configuration.
  The function takes the PipelineProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^PipelineProjectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-some [data (lookup-entry config id :badge)]
    (. builder badge data))
  (when-some [data (lookup-entry config id :build-spec)]
    (. builder buildSpec data))
  (when-some [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-some [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
    (. builder checkSecretsInPlainTextEnvVariables data))
  (when-some [data (lookup-entry config id :concurrent-build-limit)]
    (. builder concurrentBuildLimit data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :grant-report-group-permissions)]
    (. builder grantReportGroupPermissions data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :queued-timeout)]
    (. builder queuedTimeout data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :ssm-session-permissions)]
    (. builder ssmSessionPermissions data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn pipeline-project-props-builder
  "Creates a  `PipelineProjectProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[pipeline-project-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (pipeline-project-props-builder> (new PipelineProjectProps$Builder) id config))


(defn project-builder>
  "The project-builder> function updates a Project$Builder instance using the provided configuration.
  The function takes the Project$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^Project$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-some [data (lookup-entry config id :artifacts)]
    (. builder artifacts data))
  (when-some [data (lookup-entry config id :badge)]
    (. builder badge data))
  (when-some [data (lookup-entry config id :build-spec)]
    (. builder buildSpec data))
  (when-some [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-some [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
    (. builder checkSecretsInPlainTextEnvVariables data))
  (when-some [data (lookup-entry config id :concurrent-build-limit)]
    (. builder concurrentBuildLimit data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :grant-report-group-permissions)]
    (. builder grantReportGroupPermissions data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :queued-timeout)]
    (. builder queuedTimeout data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secondary-artifacts)]
    (. builder secondaryArtifacts data))
  (when-some [data (lookup-entry config id :secondary-sources)]
    (. builder secondarySources data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :ssm-session-permissions)]
    (. builder ssmSessionPermissions data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn project-builder
  "Creates a  `Project$Builder` instance using a scope and ID, applies the data configuration using the [[project-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (project-builder> (Project$Builder/create scope (name id)) id config))


(defn project-notify-on-options-builder>
  "The project-notify-on-options-builder> function updates a ProjectNotifyOnOptions$Builder instance using the provided configuration.
  The function takes the ProjectNotifyOnOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |
"
  [^ProjectNotifyOnOptions$Builder builder id config]
  (when-some [data (detail-type config id :detail-type)]
    (. builder detailType data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :events)]
    (. builder events data))
  (when-some [data (lookup-entry config id :notification-rule-name)]
    (. builder notificationRuleName data))
  (.build builder))


(defn project-notify-on-options-builder
  "Creates a  `ProjectNotifyOnOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[project-notify-on-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (project-notify-on-options-builder> (new ProjectNotifyOnOptions$Builder) id config))


(defn project-props-builder>
  "The project-props-builder> function updates a ProjectProps$Builder instance using the provided configuration.
  The function takes the ProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ProjectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-some [data (lookup-entry config id :artifacts)]
    (. builder artifacts data))
  (when-some [data (lookup-entry config id :badge)]
    (. builder badge data))
  (when-some [data (lookup-entry config id :build-spec)]
    (. builder buildSpec data))
  (when-some [data (lookup-entry config id :cache)]
    (. builder cache data))
  (when-some [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
    (. builder checkSecretsInPlainTextEnvVariables data))
  (when-some [data (lookup-entry config id :concurrent-build-limit)]
    (. builder concurrentBuildLimit data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :grant-report-group-permissions)]
    (. builder grantReportGroupPermissions data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :queued-timeout)]
    (. builder queuedTimeout data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secondary-artifacts)]
    (. builder secondaryArtifacts data))
  (when-some [data (lookup-entry config id :secondary-sources)]
    (. builder secondarySources data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :ssm-session-permissions)]
    (. builder ssmSessionPermissions data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn project-props-builder
  "Creates a  `ProjectProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[project-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (project-props-builder> (new ProjectProps$Builder) id config))


(defn report-group-builder>
  "The report-group-builder> function updates a ReportGroup$Builder instance using the provided configuration.
  The function takes the ReportGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteReports` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-reports` |
| `exportBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:export-bucket` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `reportGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-group-name` |
| `type` | software.amazon.awscdk.services.codebuild.ReportGroupType | [[cdk.api.services.codebuild/report-group-type]] | `:type` |
| `zipExport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:zip-export` |
"
  [^ReportGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-reports)]
    (. builder deleteReports data))
  (when-some [data (lookup-entry config id :export-bucket)]
    (. builder exportBucket data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :report-group-name)]
    (. builder reportGroupName data))
  (when-some [data (report-group-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :zip-export)]
    (. builder zipExport data))
  (.build builder))


(defn report-group-builder
  "Creates a  `ReportGroup$Builder` instance using a scope and ID, applies the data configuration using the [[report-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (report-group-builder> (ReportGroup$Builder/create scope (name id)) id config))


(defn report-group-props-builder>
  "The report-group-props-builder> function updates a ReportGroupProps$Builder instance using the provided configuration.
  The function takes the ReportGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteReports` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-reports` |
| `exportBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:export-bucket` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `reportGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-group-name` |
| `type` | software.amazon.awscdk.services.codebuild.ReportGroupType | [[cdk.api.services.codebuild/report-group-type]] | `:type` |
| `zipExport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:zip-export` |
"
  [^ReportGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-reports)]
    (. builder deleteReports data))
  (when-some [data (lookup-entry config id :export-bucket)]
    (. builder exportBucket data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :report-group-name)]
    (. builder reportGroupName data))
  (when-some [data (report-group-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :zip-export)]
    (. builder zipExport data))
  (.build builder))


(defn report-group-props-builder
  "Creates a  `ReportGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[report-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (report-group-props-builder> (new ReportGroupProps$Builder) id config))


(defn s3-artifacts-props-builder>
  "The s3-artifacts-props-builder> function updates a S3ArtifactsProps$Builder instance using the provided configuration.
  The function takes the S3ArtifactsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `encryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encryption` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `includeBuildId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-build-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packageZip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:package-zip` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^S3ArtifactsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :include-build-id)]
    (. builder includeBuildId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :package-zip)]
    (. builder packageZip data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn s3-artifacts-props-builder
  "Creates a  `S3ArtifactsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[s3-artifacts-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (s3-artifacts-props-builder> (new S3ArtifactsProps$Builder) id config))


(defn s3-logging-options-builder>
  "The s3-logging-options-builder> function updates a S3LoggingOptions$Builder instance using the provided configuration.
  The function takes the S3LoggingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^S3LoggingOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn s3-logging-options-builder
  "Creates a  `S3LoggingOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[s3-logging-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (s3-logging-options-builder> (new S3LoggingOptions$Builder) id config))


(defn s3-source-props-builder>
  "The s3-source-props-builder> function updates a S3SourceProps$Builder instance using the provided configuration.
  The function takes the S3SourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^S3SourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn s3-source-props-builder
  "Creates a  `S3SourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[s3-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (s3-source-props-builder> (new S3SourceProps$Builder) id config))


(defn source-config-builder>
  "The source-config-builder> function updates a SourceConfig$Builder instance using the provided configuration.
  The function takes the SourceConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildTriggers` | software.amazon.awscdk.services.codebuild.CfnProject$ProjectTriggersProperty | [[cdk.support/lookup-entry]] | `:build-triggers` |
| `sourceProperty` | software.amazon.awscdk.services.codebuild.CfnProject$SourceProperty | [[cdk.support/lookup-entry]] | `:source-property` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |
"
  [^SourceConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :build-triggers)]
    (. builder buildTriggers data))
  (when-some [data (lookup-entry config id :source-property)]
    (. builder sourceProperty data))
  (when-some [data (lookup-entry config id :source-version)]
    (. builder sourceVersion data))
  (.build builder))


(defn source-config-builder
  "Creates a  `SourceConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[source-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (source-config-builder> (new SourceConfig$Builder) id config))


(defn source-props-builder>
  "The source-props-builder> function updates a SourceProps$Builder instance using the provided configuration.
  The function takes the SourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
"
  [^SourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (.build builder))


(defn source-props-builder
  "Creates a  `SourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (source-props-builder> (new SourceProps$Builder) id config))


(defn untrusted-code-boundary-policy-builder>
  "The untrusted-code-boundary-policy-builder> function updates a UntrustedCodeBoundaryPolicy$Builder instance using the provided configuration.
  The function takes the UntrustedCodeBoundaryPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-statements` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
"
  [^UntrustedCodeBoundaryPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-statements)]
    (. builder additionalStatements data))
  (when-some [data (lookup-entry config id :managed-policy-name)]
    (. builder managedPolicyName data))
  (.build builder))


(defn untrusted-code-boundary-policy-builder
  "Creates a  `UntrustedCodeBoundaryPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[untrusted-code-boundary-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (untrusted-code-boundary-policy-builder> (UntrustedCodeBoundaryPolicy$Builder/create scope (name id)) id config))


(defn untrusted-code-boundary-policy-props-builder>
  "The untrusted-code-boundary-policy-props-builder> function updates a UntrustedCodeBoundaryPolicyProps$Builder instance using the provided configuration.
  The function takes the UntrustedCodeBoundaryPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-statements` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
"
  [^UntrustedCodeBoundaryPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-statements)]
    (. builder additionalStatements data))
  (when-some [data (lookup-entry config id :managed-policy-name)]
    (. builder managedPolicyName data))
  (.build builder))


(defn untrusted-code-boundary-policy-props-builder
  "Creates a  `UntrustedCodeBoundaryPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[untrusted-code-boundary-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (untrusted-code-boundary-policy-props-builder> (new UntrustedCodeBoundaryPolicyProps$Builder) id config))