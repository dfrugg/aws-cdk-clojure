(ns cdk.api.services.kinesisanalyticsv2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kinesisanalyticsv2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kinesisanalyticsv2 CfnApplication$ApplicationCodeConfigurationProperty$Builder
                                                               CfnApplication$ApplicationConfigurationProperty$Builder
                                                               CfnApplication$ApplicationMaintenanceConfigurationProperty$Builder
                                                               CfnApplication$ApplicationRestoreConfigurationProperty$Builder
                                                               CfnApplication$ApplicationSnapshotConfigurationProperty$Builder
                                                               CfnApplication$Builder
                                                               CfnApplication$CSVMappingParametersProperty$Builder
                                                               CfnApplication$CatalogConfigurationProperty$Builder
                                                               CfnApplication$CheckpointConfigurationProperty$Builder
                                                               CfnApplication$CodeContentProperty$Builder
                                                               CfnApplication$CustomArtifactConfigurationProperty$Builder
                                                               CfnApplication$DeployAsApplicationConfigurationProperty$Builder
                                                               CfnApplication$EnvironmentPropertiesProperty$Builder
                                                               CfnApplication$FlinkApplicationConfigurationProperty$Builder
                                                               CfnApplication$FlinkRunConfigurationProperty$Builder
                                                               CfnApplication$GlueDataCatalogConfigurationProperty$Builder
                                                               CfnApplication$InputLambdaProcessorProperty$Builder
                                                               CfnApplication$InputParallelismProperty$Builder
                                                               CfnApplication$InputProcessingConfigurationProperty$Builder
                                                               CfnApplication$InputProperty$Builder
                                                               CfnApplication$InputSchemaProperty$Builder
                                                               CfnApplication$JSONMappingParametersProperty$Builder
                                                               CfnApplication$KinesisFirehoseInputProperty$Builder
                                                               CfnApplication$KinesisStreamsInputProperty$Builder
                                                               CfnApplication$MappingParametersProperty$Builder
                                                               CfnApplication$MavenReferenceProperty$Builder
                                                               CfnApplication$MonitoringConfigurationProperty$Builder
                                                               CfnApplication$ParallelismConfigurationProperty$Builder
                                                               CfnApplication$PropertyGroupProperty$Builder
                                                               CfnApplication$RecordColumnProperty$Builder
                                                               CfnApplication$RecordFormatProperty$Builder
                                                               CfnApplication$RunConfigurationProperty$Builder
                                                               CfnApplication$S3ContentBaseLocationProperty$Builder
                                                               CfnApplication$S3ContentLocationProperty$Builder
                                                               CfnApplication$SqlApplicationConfigurationProperty$Builder
                                                               CfnApplication$VpcConfigurationProperty$Builder
                                                               CfnApplication$ZeppelinApplicationConfigurationProperty$Builder
                                                               CfnApplication$ZeppelinMonitoringConfigurationProperty$Builder
                                                               CfnApplicationCloudWatchLoggingOption$Builder
                                                               CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty$Builder
                                                               CfnApplicationCloudWatchLoggingOptionProps$Builder
                                                               CfnApplicationOutput$Builder
                                                               CfnApplicationOutput$DestinationSchemaProperty$Builder
                                                               CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder
                                                               CfnApplicationOutput$KinesisStreamsOutputProperty$Builder
                                                               CfnApplicationOutput$LambdaOutputProperty$Builder
                                                               CfnApplicationOutput$OutputProperty$Builder
                                                               CfnApplicationOutputProps$Builder
                                                               CfnApplicationProps$Builder
                                                               CfnApplicationReferenceDataSource$Builder
                                                               CfnApplicationReferenceDataSource$CSVMappingParametersProperty$Builder
                                                               CfnApplicationReferenceDataSource$JSONMappingParametersProperty$Builder
                                                               CfnApplicationReferenceDataSource$MappingParametersProperty$Builder
                                                               CfnApplicationReferenceDataSource$RecordColumnProperty$Builder
                                                               CfnApplicationReferenceDataSource$RecordFormatProperty$Builder
                                                               CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder
                                                               CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder
                                                               CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder
                                                               CfnApplicationReferenceDataSourceProps$Builder]))


(defn build-cfn-application-application-code-configuration-property-builder
  "The build-cfn-application-application-code-configuration-property-builder function updates a CfnApplication$ApplicationCodeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationCodeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeContent` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$CodeContentProperty | [[cdk.support/lookup-entry]] | `:code-content` |
| `codeContentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-content-type` |
"
  [^CfnApplication$ApplicationCodeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-content)]
    (. builder codeContent data))
  (when-let [data (lookup-entry config id :code-content-type)]
    (. builder codeContentType data))
  (.build builder))


(defn cfn-application-application-code-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-application-code-configuration-property-builder (new CfnApplication$ApplicationCodeConfigurationProperty$Builder) id config))


(defn build-cfn-application-application-configuration-property-builder
  "The build-cfn-application-application-configuration-property-builder function updates a CfnApplication$ApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationCodeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-code-configuration` |
| `applicationSnapshotConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$ApplicationSnapshotConfigurationProperty | [[cdk.support/lookup-entry]] | `:application-snapshot-configuration` |
| `environmentProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-properties` |
| `flinkApplicationConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$FlinkApplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:flink-application-configuration` |
| `sqlApplicationConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$SqlApplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:sql-application-configuration` |
| `vpcConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-configurations` |
| `zeppelinApplicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zeppelin-application-configuration` |
"
  [^CfnApplication$ApplicationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-code-configuration)]
    (. builder applicationCodeConfiguration data))
  (when-let [data (lookup-entry config id :application-snapshot-configuration)]
    (. builder applicationSnapshotConfiguration data))
  (when-let [data (lookup-entry config id :environment-properties)]
    (. builder environmentProperties data))
  (when-let [data (lookup-entry config id :flink-application-configuration)]
    (. builder flinkApplicationConfiguration data))
  (when-let [data (lookup-entry config id :sql-application-configuration)]
    (. builder sqlApplicationConfiguration data))
  (when-let [data (lookup-entry config id :vpc-configurations)]
    (. builder vpcConfigurations data))
  (when-let [data (lookup-entry config id :zeppelin-application-configuration)]
    (. builder zeppelinApplicationConfiguration data))
  (.build builder))


(defn cfn-application-application-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-application-configuration-property-builder (new CfnApplication$ApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-application-maintenance-configuration-property-builder
  "The build-cfn-application-application-maintenance-configuration-property-builder function updates a CfnApplication$ApplicationMaintenanceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationMaintenanceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationMaintenanceWindowStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-maintenance-window-start-time` |
"
  [^CfnApplication$ApplicationMaintenanceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-maintenance-window-start-time)]
    (. builder applicationMaintenanceWindowStartTime data))
  (.build builder))


(defn cfn-application-application-maintenance-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-application-maintenance-configuration-property-builder (new CfnApplication$ApplicationMaintenanceConfigurationProperty$Builder) id config))


(defn build-cfn-application-application-restore-configuration-property-builder
  "The build-cfn-application-application-restore-configuration-property-builder function updates a CfnApplication$ApplicationRestoreConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationRestoreConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationRestoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-restore-type` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |
"
  [^CfnApplication$ApplicationRestoreConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-restore-type)]
    (. builder applicationRestoreType data))
  (when-let [data (lookup-entry config id :snapshot-name)]
    (. builder snapshotName data))
  (.build builder))


(defn cfn-application-application-restore-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-application-restore-configuration-property-builder (new CfnApplication$ApplicationRestoreConfigurationProperty$Builder) id config))


(defn build-cfn-application-application-snapshot-configuration-property-builder
  "The build-cfn-application-application-snapshot-configuration-property-builder function updates a CfnApplication$ApplicationSnapshotConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationSnapshotConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snapshotsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshots-enabled` |
"
  [^CfnApplication$ApplicationSnapshotConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :snapshots-enabled)]
    (. builder snapshotsEnabled data))
  (.build builder))


(defn cfn-application-application-snapshot-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-application-snapshot-configuration-property-builder (new CfnApplication$ApplicationSnapshotConfigurationProperty$Builder) id config))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$ApplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:application-configuration` |
| `applicationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-description` |
| `applicationMaintenanceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-maintenance-configuration` |
| `applicationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-mode` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `runConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$RunConfigurationProperty | [[cdk.support/lookup-entry]] | `:run-configuration` |
| `runtimeEnvironment` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-environment` |
| `serviceExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-let [data (lookup-entry config id :application-configuration)]
    (. builder applicationConfiguration data))
  (when-let [data (lookup-entry config id :application-description)]
    (. builder applicationDescription data))
  (when-let [data (lookup-entry config id :application-maintenance-configuration)]
    (. builder applicationMaintenanceConfiguration data))
  (when-let [data (lookup-entry config id :application-mode)]
    (. builder applicationMode data))
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :run-configuration)]
    (. builder runConfiguration data))
  (when-let [data (lookup-entry config id :runtime-environment)]
    (. builder runtimeEnvironment data))
  (when-let [data (lookup-entry config id :service-execution-role)]
    (. builder serviceExecutionRole data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-application-builder (CfnApplication$Builder/create scope (name id)) id config))


(defn build-cfn-application-catalog-configuration-property-builder
  "The build-cfn-application-catalog-configuration-property-builder function updates a CfnApplication$CatalogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$CatalogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueDataCatalogConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue-data-catalog-configuration` |
"
  [^CfnApplication$CatalogConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :glue-data-catalog-configuration)]
    (. builder glueDataCatalogConfiguration data))
  (.build builder))


(defn cfn-application-catalog-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-catalog-configuration-property-builder (new CfnApplication$CatalogConfigurationProperty$Builder) id config))


(defn build-cfn-application-checkpoint-configuration-property-builder
  "The build-cfn-application-checkpoint-configuration-property-builder function updates a CfnApplication$CheckpointConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$CheckpointConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:checkpoint-interval` |
| `checkpointingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:checkpointing-enabled` |
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `minPauseBetweenCheckpoints` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-pause-between-checkpoints` |
"
  [^CfnApplication$CheckpointConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :checkpoint-interval)]
    (. builder checkpointInterval data))
  (when-let [data (lookup-entry config id :checkpointing-enabled)]
    (. builder checkpointingEnabled data))
  (when-let [data (lookup-entry config id :configuration-type)]
    (. builder configurationType data))
  (when-let [data (lookup-entry config id :min-pause-between-checkpoints)]
    (. builder minPauseBetweenCheckpoints data))
  (.build builder))


(defn cfn-application-checkpoint-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-checkpoint-configuration-property-builder (new CfnApplication$CheckpointConfigurationProperty$Builder) id config))


(defn build-cfn-application-cloud-watch-logging-option-builder
  "The build-cfn-application-cloud-watch-logging-option-builder function updates a CfnApplicationCloudWatchLoggingOption$Builder instance using the provided configuration.
  The function takes the CfnApplicationCloudWatchLoggingOption$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `cloudWatchLoggingOption` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-option` |
"
  [^CfnApplicationCloudWatchLoggingOption$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :cloud-watch-logging-option)]
    (. builder cloudWatchLoggingOption data))
  (.build builder))


(defn cfn-application-cloud-watch-logging-option-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-application-cloud-watch-logging-option-builder (CfnApplicationCloudWatchLoggingOption$Builder/create scope (name id)) id config))


(defn build-cfn-application-cloud-watch-logging-option-cloud-watch-logging-option-property-builder
  "The build-cfn-application-cloud-watch-logging-option-cloud-watch-logging-option-property-builder function updates a CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-arn` |
"
  [^CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-stream-arn)]
    (. builder logStreamArn data))
  (.build builder))


(defn cfn-application-cloud-watch-logging-option-cloud-watch-logging-option-property-builder
  ""
  [id config]
  (build-cfn-application-cloud-watch-logging-option-cloud-watch-logging-option-property-builder (new CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty$Builder) id config))


(defn build-cfn-application-cloud-watch-logging-option-props-builder
  "The build-cfn-application-cloud-watch-logging-option-props-builder function updates a CfnApplicationCloudWatchLoggingOptionProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationCloudWatchLoggingOptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `cloudWatchLoggingOption` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-option` |
"
  [^CfnApplicationCloudWatchLoggingOptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :cloud-watch-logging-option)]
    (. builder cloudWatchLoggingOption data))
  (.build builder))


(defn cfn-application-cloud-watch-logging-option-props-builder
  ""
  [id config]
  (build-cfn-application-cloud-watch-logging-option-props-builder (new CfnApplicationCloudWatchLoggingOptionProps$Builder) id config))


(defn build-cfn-application-code-content-property-builder
  "The build-cfn-application-code-content-property-builder function updates a CfnApplication$CodeContentProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$CodeContentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3ContentLocation` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$S3ContentLocationProperty | [[cdk.support/lookup-entry]] | `:s3-content-location` |
| `textContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-content` |
| `zipFileContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:zip-file-content` |
"
  [^CfnApplication$CodeContentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-content-location)]
    (. builder s3ContentLocation data))
  (when-let [data (lookup-entry config id :text-content)]
    (. builder textContent data))
  (when-let [data (lookup-entry config id :zip-file-content)]
    (. builder zipFileContent data))
  (.build builder))


(defn cfn-application-code-content-property-builder
  ""
  [id config]
  (build-cfn-application-code-content-property-builder (new CfnApplication$CodeContentProperty$Builder) id config))


(defn build-cfn-application-csv-mapping-parameters-property-builder
  "The build-cfn-application-csv-mapping-parameters-property-builder function updates a CfnApplication$CSVMappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$CSVMappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumnDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-column-delimiter` |
| `recordRowDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-delimiter` |
"
  [^CfnApplication$CSVMappingParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :record-column-delimiter)]
    (. builder recordColumnDelimiter data))
  (when-let [data (lookup-entry config id :record-row-delimiter)]
    (. builder recordRowDelimiter data))
  (.build builder))


(defn cfn-application-csv-mapping-parameters-property-builder
  ""
  [id config]
  (build-cfn-application-csv-mapping-parameters-property-builder (new CfnApplication$CSVMappingParametersProperty$Builder) id config))


(defn build-cfn-application-custom-artifact-configuration-property-builder
  "The build-cfn-application-custom-artifact-configuration-property-builder function updates a CfnApplication$CustomArtifactConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$CustomArtifactConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactType` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-type` |
| `mavenReference` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$MavenReferenceProperty | [[cdk.support/lookup-entry]] | `:maven-reference` |
| `s3ContentLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-content-location` |
"
  [^CfnApplication$CustomArtifactConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-type)]
    (. builder artifactType data))
  (when-let [data (lookup-entry config id :maven-reference)]
    (. builder mavenReference data))
  (when-let [data (lookup-entry config id :s3-content-location)]
    (. builder s3ContentLocation data))
  (.build builder))


(defn cfn-application-custom-artifact-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-custom-artifact-configuration-property-builder (new CfnApplication$CustomArtifactConfigurationProperty$Builder) id config))


(defn build-cfn-application-deploy-as-application-configuration-property-builder
  "The build-cfn-application-deploy-as-application-configuration-property-builder function updates a CfnApplication$DeployAsApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$DeployAsApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3ContentLocation` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$S3ContentBaseLocationProperty | [[cdk.support/lookup-entry]] | `:s3-content-location` |
"
  [^CfnApplication$DeployAsApplicationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-content-location)]
    (. builder s3ContentLocation data))
  (.build builder))


(defn cfn-application-deploy-as-application-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-deploy-as-application-configuration-property-builder (new CfnApplication$DeployAsApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-environment-properties-property-builder
  "The build-cfn-application-environment-properties-property-builder function updates a CfnApplication$EnvironmentPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$EnvironmentPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-groups` |
"
  [^CfnApplication$EnvironmentPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :property-groups)]
    (. builder propertyGroups data))
  (.build builder))


(defn cfn-application-environment-properties-property-builder
  ""
  [id config]
  (build-cfn-application-environment-properties-property-builder (new CfnApplication$EnvironmentPropertiesProperty$Builder) id config))


(defn build-cfn-application-flink-application-configuration-property-builder
  "The build-cfn-application-flink-application-configuration-property-builder function updates a CfnApplication$FlinkApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$FlinkApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:checkpoint-configuration` |
| `monitoringConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-configuration` |
| `parallelismConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$ParallelismConfigurationProperty | [[cdk.support/lookup-entry]] | `:parallelism-configuration` |
"
  [^CfnApplication$FlinkApplicationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :checkpoint-configuration)]
    (. builder checkpointConfiguration data))
  (when-let [data (lookup-entry config id :monitoring-configuration)]
    (. builder monitoringConfiguration data))
  (when-let [data (lookup-entry config id :parallelism-configuration)]
    (. builder parallelismConfiguration data))
  (.build builder))


(defn cfn-application-flink-application-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-flink-application-configuration-property-builder (new CfnApplication$FlinkApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-flink-run-configuration-property-builder
  "The build-cfn-application-flink-run-configuration-property-builder function updates a CfnApplication$FlinkRunConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$FlinkRunConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowNonRestoredState` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-non-restored-state` |
"
  [^CfnApplication$FlinkRunConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-non-restored-state)]
    (. builder allowNonRestoredState data))
  (.build builder))


(defn cfn-application-flink-run-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-flink-run-configuration-property-builder (new CfnApplication$FlinkRunConfigurationProperty$Builder) id config))


(defn build-cfn-application-glue-data-catalog-configuration-property-builder
  "The build-cfn-application-glue-data-catalog-configuration-property-builder function updates a CfnApplication$GlueDataCatalogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$GlueDataCatalogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-arn` |
"
  [^CfnApplication$GlueDataCatalogConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :database-arn)]
    (. builder databaseArn data))
  (.build builder))


(defn cfn-application-glue-data-catalog-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-glue-data-catalog-configuration-property-builder (new CfnApplication$GlueDataCatalogConfigurationProperty$Builder) id config))


(defn build-cfn-application-input-lambda-processor-property-builder
  "The build-cfn-application-input-lambda-processor-property-builder function updates a CfnApplication$InputLambdaProcessorProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InputLambdaProcessorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplication$InputLambdaProcessorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-input-lambda-processor-property-builder
  ""
  [id config]
  (build-cfn-application-input-lambda-processor-property-builder (new CfnApplication$InputLambdaProcessorProperty$Builder) id config))


(defn build-cfn-application-input-parallelism-property-builder
  "The build-cfn-application-input-parallelism-property-builder function updates a CfnApplication$InputParallelismProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InputParallelismProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
"
  [^CfnApplication$InputParallelismProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (.build builder))


(defn cfn-application-input-parallelism-property-builder
  ""
  [id config]
  (build-cfn-application-input-parallelism-property-builder (new CfnApplication$InputParallelismProperty$Builder) id config))


(defn build-cfn-application-input-processing-configuration-property-builder
  "The build-cfn-application-input-processing-configuration-property-builder function updates a CfnApplication$InputProcessingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InputProcessingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputLambdaProcessor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-lambda-processor` |
"
  [^CfnApplication$InputProcessingConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-lambda-processor)]
    (. builder inputLambdaProcessor data))
  (.build builder))


(defn cfn-application-input-processing-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-input-processing-configuration-property-builder (new CfnApplication$InputProcessingConfigurationProperty$Builder) id config))


(defn build-cfn-application-input-property-builder
  "The build-cfn-application-input-property-builder function updates a CfnApplication$InputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputParallelism` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$InputParallelismProperty | [[cdk.support/lookup-entry]] | `:input-parallelism` |
| `inputProcessingConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$InputProcessingConfigurationProperty | [[cdk.support/lookup-entry]] | `:input-processing-configuration` |
| `inputSchema` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$InputSchemaProperty | [[cdk.support/lookup-entry]] | `:input-schema` |
| `kinesisFirehoseInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-firehose-input` |
| `kinesisStreamsInput` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$KinesisStreamsInputProperty | [[cdk.support/lookup-entry]] | `:kinesis-streams-input` |
| `namePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-prefix` |
"
  [^CfnApplication$InputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-parallelism)]
    (. builder inputParallelism data))
  (when-let [data (lookup-entry config id :input-processing-configuration)]
    (. builder inputProcessingConfiguration data))
  (when-let [data (lookup-entry config id :input-schema)]
    (. builder inputSchema data))
  (when-let [data (lookup-entry config id :kinesis-firehose-input)]
    (. builder kinesisFirehoseInput data))
  (when-let [data (lookup-entry config id :kinesis-streams-input)]
    (. builder kinesisStreamsInput data))
  (when-let [data (lookup-entry config id :name-prefix)]
    (. builder namePrefix data))
  (.build builder))


(defn cfn-application-input-property-builder
  ""
  [id config]
  (build-cfn-application-input-property-builder (new CfnApplication$InputProperty$Builder) id config))


(defn build-cfn-application-input-schema-property-builder
  "The build-cfn-application-input-schema-property-builder function updates a CfnApplication$InputSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InputSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:record-columns` |
| `recordEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-encoding` |
| `recordFormat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-format` |
"
  [^CfnApplication$InputSchemaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :record-columns)]
    (. builder recordColumns data))
  (when-let [data (lookup-entry config id :record-encoding)]
    (. builder recordEncoding data))
  (when-let [data (lookup-entry config id :record-format)]
    (. builder recordFormat data))
  (.build builder))


(defn cfn-application-input-schema-property-builder
  ""
  [id config]
  (build-cfn-application-input-schema-property-builder (new CfnApplication$InputSchemaProperty$Builder) id config))


(defn build-cfn-application-json-mapping-parameters-property-builder
  "The build-cfn-application-json-mapping-parameters-property-builder function updates a CfnApplication$JSONMappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$JSONMappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordRowPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-path` |
"
  [^CfnApplication$JSONMappingParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :record-row-path)]
    (. builder recordRowPath data))
  (.build builder))


(defn cfn-application-json-mapping-parameters-property-builder
  ""
  [id config]
  (build-cfn-application-json-mapping-parameters-property-builder (new CfnApplication$JSONMappingParametersProperty$Builder) id config))


(defn build-cfn-application-kinesis-firehose-input-property-builder
  "The build-cfn-application-kinesis-firehose-input-property-builder function updates a CfnApplication$KinesisFirehoseInputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$KinesisFirehoseInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplication$KinesisFirehoseInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-kinesis-firehose-input-property-builder
  ""
  [id config]
  (build-cfn-application-kinesis-firehose-input-property-builder (new CfnApplication$KinesisFirehoseInputProperty$Builder) id config))


(defn build-cfn-application-kinesis-streams-input-property-builder
  "The build-cfn-application-kinesis-streams-input-property-builder function updates a CfnApplication$KinesisStreamsInputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$KinesisStreamsInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplication$KinesisStreamsInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-kinesis-streams-input-property-builder
  ""
  [id config]
  (build-cfn-application-kinesis-streams-input-property-builder (new CfnApplication$KinesisStreamsInputProperty$Builder) id config))


(defn build-cfn-application-mapping-parameters-property-builder
  "The build-cfn-application-mapping-parameters-property-builder function updates a CfnApplication$MappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$MappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvMappingParameters` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$CSVMappingParametersProperty | [[cdk.support/lookup-entry]] | `:csv-mapping-parameters` |
| `jsonMappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-mapping-parameters` |
"
  [^CfnApplication$MappingParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv-mapping-parameters)]
    (. builder csvMappingParameters data))
  (when-let [data (lookup-entry config id :json-mapping-parameters)]
    (. builder jsonMappingParameters data))
  (.build builder))


(defn cfn-application-mapping-parameters-property-builder
  ""
  [id config]
  (build-cfn-application-mapping-parameters-property-builder (new CfnApplication$MappingParametersProperty$Builder) id config))


(defn build-cfn-application-maven-reference-property-builder
  "The build-cfn-application-maven-reference-property-builder function updates a CfnApplication$MavenReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$MavenReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-id` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnApplication$MavenReferenceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-id)]
    (. builder artifactId data))
  (when-let [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-application-maven-reference-property-builder
  ""
  [id config]
  (build-cfn-application-maven-reference-property-builder (new CfnApplication$MavenReferenceProperty$Builder) id config))


(defn build-cfn-application-monitoring-configuration-property-builder
  "The build-cfn-application-monitoring-configuration-property-builder function updates a CfnApplication$MonitoringConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$MonitoringConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `metricsLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:metrics-level` |
"
  [^CfnApplication$MonitoringConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration-type)]
    (. builder configurationType data))
  (when-let [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-let [data (lookup-entry config id :metrics-level)]
    (. builder metricsLevel data))
  (.build builder))


(defn cfn-application-monitoring-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-monitoring-configuration-property-builder (new CfnApplication$MonitoringConfigurationProperty$Builder) id config))


(defn build-cfn-application-output-builder
  "The build-cfn-application-output-builder function updates a CfnApplicationOutput$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output` |
"
  [^CfnApplicationOutput$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :output)]
    (. builder output data))
  (.build builder))


(defn cfn-application-output-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-application-output-builder (CfnApplicationOutput$Builder/create scope (name id)) id config))


(defn build-cfn-application-output-destination-schema-property-builder
  "The build-cfn-application-output-destination-schema-property-builder function updates a CfnApplicationOutput$DestinationSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutput$DestinationSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |
"
  [^CfnApplicationOutput$DestinationSchemaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-output-destination-schema-property-builder
  ""
  [id config]
  (build-cfn-application-output-destination-schema-property-builder (new CfnApplicationOutput$DestinationSchemaProperty$Builder) id config))


(defn build-cfn-application-output-kinesis-firehose-output-property-builder
  "The build-cfn-application-output-kinesis-firehose-output-property-builder function updates a CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-output-kinesis-firehose-output-property-builder
  ""
  [id config]
  (build-cfn-application-output-kinesis-firehose-output-property-builder (new CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder) id config))


(defn build-cfn-application-output-kinesis-streams-output-property-builder
  "The build-cfn-application-output-kinesis-streams-output-property-builder function updates a CfnApplicationOutput$KinesisStreamsOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutput$KinesisStreamsOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationOutput$KinesisStreamsOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-output-kinesis-streams-output-property-builder
  ""
  [id config]
  (build-cfn-application-output-kinesis-streams-output-property-builder (new CfnApplicationOutput$KinesisStreamsOutputProperty$Builder) id config))


(defn build-cfn-application-output-lambda-output-property-builder
  "The build-cfn-application-output-lambda-output-property-builder function updates a CfnApplicationOutput$LambdaOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutput$LambdaOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationOutput$LambdaOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-output-lambda-output-property-builder
  ""
  [id config]
  (build-cfn-application-output-lambda-output-property-builder (new CfnApplicationOutput$LambdaOutputProperty$Builder) id config))


(defn build-cfn-application-output-output-property-builder
  "The build-cfn-application-output-output-property-builder function updates a CfnApplicationOutput$OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutput$OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationSchema` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput$DestinationSchemaProperty | [[cdk.support/lookup-entry]] | `:destination-schema` |
| `kinesisFirehoseOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-firehose-output` |
| `kinesisStreamsOutput` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput$KinesisStreamsOutputProperty | [[cdk.support/lookup-entry]] | `:kinesis-streams-output` |
| `lambdaOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-output` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnApplicationOutput$OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-schema)]
    (. builder destinationSchema data))
  (when-let [data (lookup-entry config id :kinesis-firehose-output)]
    (. builder kinesisFirehoseOutput data))
  (when-let [data (lookup-entry config id :kinesis-streams-output)]
    (. builder kinesisStreamsOutput data))
  (when-let [data (lookup-entry config id :lambda-output)]
    (. builder lambdaOutput data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-application-output-output-property-builder
  ""
  [id config]
  (build-cfn-application-output-output-property-builder (new CfnApplicationOutput$OutputProperty$Builder) id config))


(defn build-cfn-application-output-props-builder
  "The build-cfn-application-output-props-builder function updates a CfnApplicationOutputProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutputProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output` |
"
  [^CfnApplicationOutputProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :output)]
    (. builder output data))
  (.build builder))


(defn cfn-application-output-props-builder
  ""
  [id config]
  (build-cfn-application-output-props-builder (new CfnApplicationOutputProps$Builder) id config))


(defn build-cfn-application-parallelism-configuration-property-builder
  "The build-cfn-application-parallelism-configuration-property-builder function updates a CfnApplication$ParallelismConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ParallelismConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-enabled` |
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `parallelism` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelism` |
| `parallelismPerKpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelism-per-kpu` |
"
  [^CfnApplication$ParallelismConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling-enabled)]
    (. builder autoScalingEnabled data))
  (when-let [data (lookup-entry config id :configuration-type)]
    (. builder configurationType data))
  (when-let [data (lookup-entry config id :parallelism)]
    (. builder parallelism data))
  (when-let [data (lookup-entry config id :parallelism-per-kpu)]
    (. builder parallelismPerKpu data))
  (.build builder))


(defn cfn-application-parallelism-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-parallelism-configuration-property-builder (new CfnApplication$ParallelismConfigurationProperty$Builder) id config))


(defn build-cfn-application-property-group-property-builder
  "The build-cfn-application-property-group-property-builder function updates a CfnApplication$PropertyGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$PropertyGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-group-id` |
| `propertyMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:property-map` |
"
  [^CfnApplication$PropertyGroupProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :property-group-id)]
    (. builder propertyGroupId data))
  (when-let [data (lookup-entry config id :property-map)]
    (. builder propertyMap data))
  (.build builder))


(defn cfn-application-property-group-property-builder
  ""
  [id config]
  (build-cfn-application-property-group-property-builder (new CfnApplication$PropertyGroupProperty$Builder) id config))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$ApplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:application-configuration` |
| `applicationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-description` |
| `applicationMaintenanceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-maintenance-configuration` |
| `applicationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-mode` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `runConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$RunConfigurationProperty | [[cdk.support/lookup-entry]] | `:run-configuration` |
| `runtimeEnvironment` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-environment` |
| `serviceExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-configuration)]
    (. builder applicationConfiguration data))
  (when-let [data (lookup-entry config id :application-description)]
    (. builder applicationDescription data))
  (when-let [data (lookup-entry config id :application-maintenance-configuration)]
    (. builder applicationMaintenanceConfiguration data))
  (when-let [data (lookup-entry config id :application-mode)]
    (. builder applicationMode data))
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :run-configuration)]
    (. builder runConfiguration data))
  (when-let [data (lookup-entry config id :runtime-environment)]
    (. builder runtimeEnvironment data))
  (when-let [data (lookup-entry config id :service-execution-role)]
    (. builder serviceExecutionRole data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  ""
  [id config]
  (build-cfn-application-props-builder (new CfnApplicationProps$Builder) id config))


(defn build-cfn-application-record-column-property-builder
  "The build-cfn-application-record-column-property-builder function updates a CfnApplication$RecordColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$RecordColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mapping` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql-type` |
"
  [^CfnApplication$RecordColumnProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :sql-type)]
    (. builder sqlType data))
  (.build builder))


(defn cfn-application-record-column-property-builder
  ""
  [id config]
  (build-cfn-application-record-column-property-builder (new CfnApplication$RecordColumnProperty$Builder) id config))


(defn build-cfn-application-record-format-property-builder
  "The build-cfn-application-record-format-property-builder function updates a CfnApplication$RecordFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$RecordFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mapping-parameters` |
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |
"
  [^CfnApplication$RecordFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mapping-parameters)]
    (. builder mappingParameters data))
  (when-let [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-record-format-property-builder
  ""
  [id config]
  (build-cfn-application-record-format-property-builder (new CfnApplication$RecordFormatProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-builder
  "The build-cfn-application-reference-data-source-builder function updates a CfnApplicationReferenceDataSource$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `referenceDataSource` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource$ReferenceDataSourceProperty | [[cdk.support/lookup-entry]] | `:reference-data-source` |
"
  [^CfnApplicationReferenceDataSource$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :reference-data-source)]
    (. builder referenceDataSource data))
  (.build builder))


(defn cfn-application-reference-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-application-reference-data-source-builder (CfnApplicationReferenceDataSource$Builder/create scope (name id)) id config))


(defn build-cfn-application-reference-data-source-csv-mapping-parameters-property-builder
  "The build-cfn-application-reference-data-source-csv-mapping-parameters-property-builder function updates a CfnApplicationReferenceDataSource$CSVMappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$CSVMappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumnDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-column-delimiter` |
| `recordRowDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-delimiter` |
"
  [^CfnApplicationReferenceDataSource$CSVMappingParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :record-column-delimiter)]
    (. builder recordColumnDelimiter data))
  (when-let [data (lookup-entry config id :record-row-delimiter)]
    (. builder recordRowDelimiter data))
  (.build builder))


(defn cfn-application-reference-data-source-csv-mapping-parameters-property-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-csv-mapping-parameters-property-builder (new CfnApplicationReferenceDataSource$CSVMappingParametersProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-json-mapping-parameters-property-builder
  "The build-cfn-application-reference-data-source-json-mapping-parameters-property-builder function updates a CfnApplicationReferenceDataSource$JSONMappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$JSONMappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordRowPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-path` |
"
  [^CfnApplicationReferenceDataSource$JSONMappingParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :record-row-path)]
    (. builder recordRowPath data))
  (.build builder))


(defn cfn-application-reference-data-source-json-mapping-parameters-property-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-json-mapping-parameters-property-builder (new CfnApplicationReferenceDataSource$JSONMappingParametersProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-mapping-parameters-property-builder
  "The build-cfn-application-reference-data-source-mapping-parameters-property-builder function updates a CfnApplicationReferenceDataSource$MappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$MappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvMappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv-mapping-parameters` |
| `jsonMappingParameters` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource$JSONMappingParametersProperty | [[cdk.support/lookup-entry]] | `:json-mapping-parameters` |
"
  [^CfnApplicationReferenceDataSource$MappingParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv-mapping-parameters)]
    (. builder csvMappingParameters data))
  (when-let [data (lookup-entry config id :json-mapping-parameters)]
    (. builder jsonMappingParameters data))
  (.build builder))


(defn cfn-application-reference-data-source-mapping-parameters-property-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-mapping-parameters-property-builder (new CfnApplicationReferenceDataSource$MappingParametersProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-props-builder
  "The build-cfn-application-reference-data-source-props-builder function updates a CfnApplicationReferenceDataSourceProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `referenceDataSource` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource$ReferenceDataSourceProperty | [[cdk.support/lookup-entry]] | `:reference-data-source` |
"
  [^CfnApplicationReferenceDataSourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :reference-data-source)]
    (. builder referenceDataSource data))
  (.build builder))


(defn cfn-application-reference-data-source-props-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-props-builder (new CfnApplicationReferenceDataSourceProps$Builder) id config))


(defn build-cfn-application-reference-data-source-record-column-property-builder
  "The build-cfn-application-reference-data-source-record-column-property-builder function updates a CfnApplicationReferenceDataSource$RecordColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$RecordColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mapping` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql-type` |
"
  [^CfnApplicationReferenceDataSource$RecordColumnProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :sql-type)]
    (. builder sqlType data))
  (.build builder))


(defn cfn-application-reference-data-source-record-column-property-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-record-column-property-builder (new CfnApplicationReferenceDataSource$RecordColumnProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-record-format-property-builder
  "The build-cfn-application-reference-data-source-record-format-property-builder function updates a CfnApplicationReferenceDataSource$RecordFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$RecordFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mappingParameters` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource$MappingParametersProperty | [[cdk.support/lookup-entry]] | `:mapping-parameters` |
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |
"
  [^CfnApplicationReferenceDataSource$RecordFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mapping-parameters)]
    (. builder mappingParameters data))
  (when-let [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-reference-data-source-record-format-property-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-record-format-property-builder (new CfnApplicationReferenceDataSource$RecordFormatProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-reference-data-source-property-builder
  "The build-cfn-application-reference-data-source-reference-data-source-property-builder function updates a CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceSchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference-schema` |
| `s3ReferenceDataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-reference-data-source` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :reference-schema)]
    (. builder referenceSchema data))
  (when-let [data (lookup-entry config id :s3-reference-data-source)]
    (. builder s3ReferenceDataSource data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-application-reference-data-source-reference-data-source-property-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-reference-data-source-property-builder (new CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-reference-schema-property-builder
  "The build-cfn-application-reference-data-source-reference-schema-property-builder function updates a CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-columns` |
| `recordEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-encoding` |
| `recordFormat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-format` |
"
  [^CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :record-columns)]
    (. builder recordColumns data))
  (when-let [data (lookup-entry config id :record-encoding)]
    (. builder recordEncoding data))
  (when-let [data (lookup-entry config id :record-format)]
    (. builder recordFormat data))
  (.build builder))


(defn cfn-application-reference-data-source-reference-schema-property-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-reference-schema-property-builder (new CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-s3-reference-data-source-property-builder
  "The build-cfn-application-reference-data-source-s3-reference-data-source-property-builder function updates a CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `fileKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-key` |
"
  [^CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-let [data (lookup-entry config id :file-key)]
    (. builder fileKey data))
  (.build builder))


(defn cfn-application-reference-data-source-s3-reference-data-source-property-builder
  ""
  [id config]
  (build-cfn-application-reference-data-source-s3-reference-data-source-property-builder (new CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder) id config))


(defn build-cfn-application-run-configuration-property-builder
  "The build-cfn-application-run-configuration-property-builder function updates a CfnApplication$RunConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$RunConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationRestoreConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-restore-configuration` |
| `flinkRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flink-run-configuration` |
"
  [^CfnApplication$RunConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-restore-configuration)]
    (. builder applicationRestoreConfiguration data))
  (when-let [data (lookup-entry config id :flink-run-configuration)]
    (. builder flinkRunConfiguration data))
  (.build builder))


(defn cfn-application-run-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-run-configuration-property-builder (new CfnApplication$RunConfigurationProperty$Builder) id config))


(defn build-cfn-application-s3-content-base-location-property-builder
  "The build-cfn-application-s3-content-base-location-property-builder function updates a CfnApplication$S3ContentBaseLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$S3ContentBaseLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
"
  [^CfnApplication$S3ContentBaseLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base-path)]
    (. builder basePath data))
  (when-let [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (.build builder))


(defn cfn-application-s3-content-base-location-property-builder
  ""
  [id config]
  (build-cfn-application-s3-content-base-location-property-builder (new CfnApplication$S3ContentBaseLocationProperty$Builder) id config))


(defn build-cfn-application-s3-content-location-property-builder
  "The build-cfn-application-s3-content-location-property-builder function updates a CfnApplication$S3ContentLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$S3ContentLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `fileKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
"
  [^CfnApplication$S3ContentLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-let [data (lookup-entry config id :file-key)]
    (. builder fileKey data))
  (when-let [data (lookup-entry config id :object-version)]
    (. builder objectVersion data))
  (.build builder))


(defn cfn-application-s3-content-location-property-builder
  ""
  [id config]
  (build-cfn-application-s3-content-location-property-builder (new CfnApplication$S3ContentLocationProperty$Builder) id config))


(defn build-cfn-application-sql-application-configuration-property-builder
  "The build-cfn-application-sql-application-configuration-property-builder function updates a CfnApplication$SqlApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$SqlApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inputs` |
"
  [^CfnApplication$SqlApplicationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :inputs)]
    (. builder inputs data))
  (.build builder))


(defn cfn-application-sql-application-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-sql-application-configuration-property-builder (new CfnApplication$SqlApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-vpc-configuration-property-builder
  "The build-cfn-application-vpc-configuration-property-builder function updates a CfnApplication$VpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$VpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnApplication$VpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-application-vpc-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-vpc-configuration-property-builder (new CfnApplication$VpcConfigurationProperty$Builder) id config))


(defn build-cfn-application-zeppelin-application-configuration-property-builder
  "The build-cfn-application-zeppelin-application-configuration-property-builder function updates a CfnApplication$ZeppelinApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ZeppelinApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:catalog-configuration` |
| `customArtifactsConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-artifacts-configuration` |
| `deployAsApplicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deploy-as-application-configuration` |
| `monitoringConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$ZeppelinMonitoringConfigurationProperty | [[cdk.support/lookup-entry]] | `:monitoring-configuration` |
"
  [^CfnApplication$ZeppelinApplicationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-configuration)]
    (. builder catalogConfiguration data))
  (when-let [data (lookup-entry config id :custom-artifacts-configuration)]
    (. builder customArtifactsConfiguration data))
  (when-let [data (lookup-entry config id :deploy-as-application-configuration)]
    (. builder deployAsApplicationConfiguration data))
  (when-let [data (lookup-entry config id :monitoring-configuration)]
    (. builder monitoringConfiguration data))
  (.build builder))


(defn cfn-application-zeppelin-application-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-zeppelin-application-configuration-property-builder (new CfnApplication$ZeppelinApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-zeppelin-monitoring-configuration-property-builder
  "The build-cfn-application-zeppelin-monitoring-configuration-property-builder function updates a CfnApplication$ZeppelinMonitoringConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ZeppelinMonitoringConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
"
  [^CfnApplication$ZeppelinMonitoringConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (.build builder))


(defn cfn-application-zeppelin-monitoring-configuration-property-builder
  ""
  [id config]
  (build-cfn-application-zeppelin-monitoring-configuration-property-builder (new CfnApplication$ZeppelinMonitoringConfigurationProperty$Builder) id config))