(ns cdk.api.services.mwaa
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.mwaa package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.mwaa CfnEnvironment$Builder
                                                 CfnEnvironment$LoggingConfigurationProperty$Builder
                                                 CfnEnvironment$ModuleLoggingConfigurationProperty$Builder
                                                 CfnEnvironment$NetworkConfigurationProperty$Builder
                                                 CfnEnvironmentProps$Builder]))


(defn cfn-environment-builder>
  "The cfn-environment-builder> function updates a CfnEnvironment$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `airflowConfigurationOptions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:airflow-configuration-options` |
| `airflowVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:airflow-version` |
| `dagS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:dag-s3-path` |
| `endpointManagement` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-management` |
| `environmentClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-class` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `loggingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `maxWebservers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-webservers` |
| `maxWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-workers` |
| `minWebservers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-webservers` |
| `minWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-workers` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkConfiguration` | software.amazon.awscdk.services.mwaa.CfnEnvironment$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `pluginsS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:plugins-s3-object-version` |
| `pluginsS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:plugins-s3-path` |
| `requirementsS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:requirements-s3-object-version` |
| `requirementsS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:requirements-s3-path` |
| `schedulers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedulers` |
| `sourceBucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-bucket-arn` |
| `startupScriptS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:startup-script-s3-object-version` |
| `startupScriptS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:startup-script-s3-path` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `webserverAccessMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:webserver-access-mode` |
| `weeklyMaintenanceWindowStart` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-window-start` |
"
  [^CfnEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :airflow-configuration-options)]
    (. builder airflowConfigurationOptions data))
  (when-some [data (lookup-entry config id :airflow-version)]
    (. builder airflowVersion data))
  (when-some [data (lookup-entry config id :dag-s3-path)]
    (. builder dagS3Path data))
  (when-some [data (lookup-entry config id :endpoint-management)]
    (. builder endpointManagement data))
  (when-some [data (lookup-entry config id :environment-class)]
    (. builder environmentClass data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (when-some [data (lookup-entry config id :max-webservers)]
    (. builder maxWebservers data))
  (when-some [data (lookup-entry config id :max-workers)]
    (. builder maxWorkers data))
  (when-some [data (lookup-entry config id :min-webservers)]
    (. builder minWebservers data))
  (when-some [data (lookup-entry config id :min-workers)]
    (. builder minWorkers data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-some [data (lookup-entry config id :plugins-s3-object-version)]
    (. builder pluginsS3ObjectVersion data))
  (when-some [data (lookup-entry config id :plugins-s3-path)]
    (. builder pluginsS3Path data))
  (when-some [data (lookup-entry config id :requirements-s3-object-version)]
    (. builder requirementsS3ObjectVersion data))
  (when-some [data (lookup-entry config id :requirements-s3-path)]
    (. builder requirementsS3Path data))
  (when-some [data (lookup-entry config id :schedulers)]
    (. builder schedulers data))
  (when-some [data (lookup-entry config id :source-bucket-arn)]
    (. builder sourceBucketArn data))
  (when-some [data (lookup-entry config id :startup-script-s3-object-version)]
    (. builder startupScriptS3ObjectVersion data))
  (when-some [data (lookup-entry config id :startup-script-s3-path)]
    (. builder startupScriptS3Path data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :webserver-access-mode)]
    (. builder webserverAccessMode data))
  (when-some [data (lookup-entry config id :weekly-maintenance-window-start)]
    (. builder weeklyMaintenanceWindowStart data))
  (.build builder))


(defn cfn-environment-builder
  "Creates a  `CfnEnvironment$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-environment-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-environment-builder> (CfnEnvironment$Builder/create scope (name id)) id config))


(defn cfn-environment-logging-configuration-property-builder>
  "The cfn-environment-logging-configuration-property-builder> function updates a CfnEnvironment$LoggingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$LoggingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dagProcessingLogs` | software.amazon.awscdk.services.mwaa.CfnEnvironment$ModuleLoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:dag-processing-logs` |
| `schedulerLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scheduler-logs` |
| `taskLogs` | software.amazon.awscdk.services.mwaa.CfnEnvironment$ModuleLoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:task-logs` |
| `webserverLogs` | software.amazon.awscdk.services.mwaa.CfnEnvironment$ModuleLoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:webserver-logs` |
| `workerLogs` | software.amazon.awscdk.services.mwaa.CfnEnvironment$ModuleLoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-logs` |
"
  [^CfnEnvironment$LoggingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dag-processing-logs)]
    (. builder dagProcessingLogs data))
  (when-some [data (lookup-entry config id :scheduler-logs)]
    (. builder schedulerLogs data))
  (when-some [data (lookup-entry config id :task-logs)]
    (. builder taskLogs data))
  (when-some [data (lookup-entry config id :webserver-logs)]
    (. builder webserverLogs data))
  (when-some [data (lookup-entry config id :worker-logs)]
    (. builder workerLogs data))
  (.build builder))


(defn cfn-environment-logging-configuration-property-builder
  "Creates a  `CfnEnvironment$LoggingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-logging-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-logging-configuration-property-builder> (new CfnEnvironment$LoggingConfigurationProperty$Builder) id config))


(defn cfn-environment-module-logging-configuration-property-builder>
  "The cfn-environment-module-logging-configuration-property-builder> function updates a CfnEnvironment$ModuleLoggingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$ModuleLoggingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
"
  [^CfnEnvironment$ModuleLoggingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-log-group-arn)]
    (. builder cloudWatchLogGroupArn data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (.build builder))


(defn cfn-environment-module-logging-configuration-property-builder
  "Creates a  `CfnEnvironment$ModuleLoggingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-module-logging-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-module-logging-configuration-property-builder> (new CfnEnvironment$ModuleLoggingConfigurationProperty$Builder) id config))


(defn cfn-environment-network-configuration-property-builder>
  "The cfn-environment-network-configuration-property-builder> function updates a CfnEnvironment$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnEnvironment$NetworkConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-environment-network-configuration-property-builder
  "Creates a  `CfnEnvironment$NetworkConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-network-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-network-configuration-property-builder> (new CfnEnvironment$NetworkConfigurationProperty$Builder) id config))


(defn cfn-environment-props-builder>
  "The cfn-environment-props-builder> function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `airflowConfigurationOptions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:airflow-configuration-options` |
| `airflowVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:airflow-version` |
| `dagS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:dag-s3-path` |
| `endpointManagement` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-management` |
| `environmentClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-class` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `loggingConfiguration` | software.amazon.awscdk.services.mwaa.CfnEnvironment$LoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `maxWebservers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-webservers` |
| `maxWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-workers` |
| `minWebservers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-webservers` |
| `minWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-workers` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkConfiguration` | software.amazon.awscdk.services.mwaa.CfnEnvironment$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `pluginsS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:plugins-s3-object-version` |
| `pluginsS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:plugins-s3-path` |
| `requirementsS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:requirements-s3-object-version` |
| `requirementsS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:requirements-s3-path` |
| `schedulers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedulers` |
| `sourceBucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-bucket-arn` |
| `startupScriptS3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:startup-script-s3-object-version` |
| `startupScriptS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:startup-script-s3-path` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `webserverAccessMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:webserver-access-mode` |
| `weeklyMaintenanceWindowStart` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-window-start` |
"
  [^CfnEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :airflow-configuration-options)]
    (. builder airflowConfigurationOptions data))
  (when-some [data (lookup-entry config id :airflow-version)]
    (. builder airflowVersion data))
  (when-some [data (lookup-entry config id :dag-s3-path)]
    (. builder dagS3Path data))
  (when-some [data (lookup-entry config id :endpoint-management)]
    (. builder endpointManagement data))
  (when-some [data (lookup-entry config id :environment-class)]
    (. builder environmentClass data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (when-some [data (lookup-entry config id :max-webservers)]
    (. builder maxWebservers data))
  (when-some [data (lookup-entry config id :max-workers)]
    (. builder maxWorkers data))
  (when-some [data (lookup-entry config id :min-webservers)]
    (. builder minWebservers data))
  (when-some [data (lookup-entry config id :min-workers)]
    (. builder minWorkers data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-some [data (lookup-entry config id :plugins-s3-object-version)]
    (. builder pluginsS3ObjectVersion data))
  (when-some [data (lookup-entry config id :plugins-s3-path)]
    (. builder pluginsS3Path data))
  (when-some [data (lookup-entry config id :requirements-s3-object-version)]
    (. builder requirementsS3ObjectVersion data))
  (when-some [data (lookup-entry config id :requirements-s3-path)]
    (. builder requirementsS3Path data))
  (when-some [data (lookup-entry config id :schedulers)]
    (. builder schedulers data))
  (when-some [data (lookup-entry config id :source-bucket-arn)]
    (. builder sourceBucketArn data))
  (when-some [data (lookup-entry config id :startup-script-s3-object-version)]
    (. builder startupScriptS3ObjectVersion data))
  (when-some [data (lookup-entry config id :startup-script-s3-path)]
    (. builder startupScriptS3Path data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :webserver-access-mode)]
    (. builder webserverAccessMode data))
  (when-some [data (lookup-entry config id :weekly-maintenance-window-start)]
    (. builder weeklyMaintenanceWindowStart data))
  (.build builder))


(defn cfn-environment-props-builder
  "Creates a  `CfnEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-props-builder> (new CfnEnvironmentProps$Builder) id config))