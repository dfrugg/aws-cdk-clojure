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


(defn cfn-application-application-code-configuration-property-builder
  "The cfn-application-application-code-configuration-property-builder function buildes out new instances of 
CfnApplication$ApplicationCodeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeContent` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$CodeContentProperty | [[cdk.support/lookup-entry]] | `:code-content` |
| `codeContentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-content-type` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationCodeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-content)]
      (. builder codeContent data))
    (when-let [data (lookup-entry config id :code-content-type)]
      (. builder codeContentType data))
    (.build builder)))


(defn cfn-application-application-configuration-property-builder
  "The cfn-application-application-configuration-property-builder function buildes out new instances of 
CfnApplication$ApplicationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationCodeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-code-configuration` |
| `applicationSnapshotConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$ApplicationSnapshotConfigurationProperty | [[cdk.support/lookup-entry]] | `:application-snapshot-configuration` |
| `environmentProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-properties` |
| `flinkApplicationConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$FlinkApplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:flink-application-configuration` |
| `sqlApplicationConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$SqlApplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:sql-application-configuration` |
| `vpcConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-configurations` |
| `zeppelinApplicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zeppelin-application-configuration` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-application-application-maintenance-configuration-property-builder
  "The cfn-application-application-maintenance-configuration-property-builder function buildes out new instances of 
CfnApplication$ApplicationMaintenanceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationMaintenanceWindowStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-maintenance-window-start-time` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationMaintenanceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-maintenance-window-start-time)]
      (. builder applicationMaintenanceWindowStartTime data))
    (.build builder)))


(defn cfn-application-application-restore-configuration-property-builder
  "The cfn-application-application-restore-configuration-property-builder function buildes out new instances of 
CfnApplication$ApplicationRestoreConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationRestoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-restore-type` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationRestoreConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-restore-type)]
      (. builder applicationRestoreType data))
    (when-let [data (lookup-entry config id :snapshot-name)]
      (. builder snapshotName data))
    (.build builder)))


(defn cfn-application-application-snapshot-configuration-property-builder
  "The cfn-application-application-snapshot-configuration-property-builder function buildes out new instances of 
CfnApplication$ApplicationSnapshotConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snapshotsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshots-enabled` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationSnapshotConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :snapshots-enabled)]
      (. builder snapshotsEnabled data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-application-catalog-configuration-property-builder
  "The cfn-application-catalog-configuration-property-builder function buildes out new instances of 
CfnApplication$CatalogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueDataCatalogConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue-data-catalog-configuration` |"
  [stack id config]
  (let [builder (CfnApplication$CatalogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :glue-data-catalog-configuration)]
      (. builder glueDataCatalogConfiguration data))
    (.build builder)))


(defn cfn-application-checkpoint-configuration-property-builder
  "The cfn-application-checkpoint-configuration-property-builder function buildes out new instances of 
CfnApplication$CheckpointConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:checkpoint-interval` |
| `checkpointingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:checkpointing-enabled` |
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `minPauseBetweenCheckpoints` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-pause-between-checkpoints` |"
  [stack id config]
  (let [builder (CfnApplication$CheckpointConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :checkpoint-interval)]
      (. builder checkpointInterval data))
    (when-let [data (lookup-entry config id :checkpointing-enabled)]
      (. builder checkpointingEnabled data))
    (when-let [data (lookup-entry config id :configuration-type)]
      (. builder configurationType data))
    (when-let [data (lookup-entry config id :min-pause-between-checkpoints)]
      (. builder minPauseBetweenCheckpoints data))
    (.build builder)))


(defn cfn-application-cloud-watch-logging-option-builder
  "The cfn-application-cloud-watch-logging-option-builder function buildes out new instances of 
CfnApplicationCloudWatchLoggingOption$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `cloudWatchLoggingOption` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-option` |"
  [stack id config]
  (let [builder (CfnApplicationCloudWatchLoggingOption$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-option)]
      (. builder cloudWatchLoggingOption data))
    (.build builder)))


(defn cfn-application-cloud-watch-logging-option-cloud-watch-logging-option-property-builder
  "The cfn-application-cloud-watch-logging-option-cloud-watch-logging-option-property-builder function buildes out new instances of 
CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-arn` |"
  [stack id config]
  (let [builder (CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-stream-arn)]
      (. builder logStreamArn data))
    (.build builder)))


(defn cfn-application-cloud-watch-logging-option-props-builder
  "The cfn-application-cloud-watch-logging-option-props-builder function buildes out new instances of 
CfnApplicationCloudWatchLoggingOptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `cloudWatchLoggingOption` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption$CloudWatchLoggingOptionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-option` |"
  [stack id config]
  (let [builder (CfnApplicationCloudWatchLoggingOptionProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-option)]
      (. builder cloudWatchLoggingOption data))
    (.build builder)))


(defn cfn-application-code-content-property-builder
  "The cfn-application-code-content-property-builder function buildes out new instances of 
CfnApplication$CodeContentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3ContentLocation` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$S3ContentLocationProperty | [[cdk.support/lookup-entry]] | `:s3-content-location` |
| `textContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-content` |
| `zipFileContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:zip-file-content` |"
  [stack id config]
  (let [builder (CfnApplication$CodeContentProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-content-location)]
      (. builder s3ContentLocation data))
    (when-let [data (lookup-entry config id :text-content)]
      (. builder textContent data))
    (when-let [data (lookup-entry config id :zip-file-content)]
      (. builder zipFileContent data))
    (.build builder)))


(defn cfn-application-csv-mapping-parameters-property-builder
  "The cfn-application-csv-mapping-parameters-property-builder function buildes out new instances of 
CfnApplication$CSVMappingParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumnDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-column-delimiter` |
| `recordRowDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-delimiter` |"
  [stack id config]
  (let [builder (CfnApplication$CSVMappingParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :record-column-delimiter)]
      (. builder recordColumnDelimiter data))
    (when-let [data (lookup-entry config id :record-row-delimiter)]
      (. builder recordRowDelimiter data))
    (.build builder)))


(defn cfn-application-custom-artifact-configuration-property-builder
  "The cfn-application-custom-artifact-configuration-property-builder function buildes out new instances of 
CfnApplication$CustomArtifactConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactType` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-type` |
| `mavenReference` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$MavenReferenceProperty | [[cdk.support/lookup-entry]] | `:maven-reference` |
| `s3ContentLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-content-location` |"
  [stack id config]
  (let [builder (CfnApplication$CustomArtifactConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :artifact-type)]
      (. builder artifactType data))
    (when-let [data (lookup-entry config id :maven-reference)]
      (. builder mavenReference data))
    (when-let [data (lookup-entry config id :s3-content-location)]
      (. builder s3ContentLocation data))
    (.build builder)))


(defn cfn-application-deploy-as-application-configuration-property-builder
  "The cfn-application-deploy-as-application-configuration-property-builder function buildes out new instances of 
CfnApplication$DeployAsApplicationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3ContentLocation` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$S3ContentBaseLocationProperty | [[cdk.support/lookup-entry]] | `:s3-content-location` |"
  [stack id config]
  (let [builder (CfnApplication$DeployAsApplicationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-content-location)]
      (. builder s3ContentLocation data))
    (.build builder)))


(defn cfn-application-environment-properties-property-builder
  "The cfn-application-environment-properties-property-builder function buildes out new instances of 
CfnApplication$EnvironmentPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-groups` |"
  [stack id config]
  (let [builder (CfnApplication$EnvironmentPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :property-groups)]
      (. builder propertyGroups data))
    (.build builder)))


(defn cfn-application-flink-application-configuration-property-builder
  "The cfn-application-flink-application-configuration-property-builder function buildes out new instances of 
CfnApplication$FlinkApplicationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:checkpoint-configuration` |
| `monitoringConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-configuration` |
| `parallelismConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$ParallelismConfigurationProperty | [[cdk.support/lookup-entry]] | `:parallelism-configuration` |"
  [stack id config]
  (let [builder (CfnApplication$FlinkApplicationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :checkpoint-configuration)]
      (. builder checkpointConfiguration data))
    (when-let [data (lookup-entry config id :monitoring-configuration)]
      (. builder monitoringConfiguration data))
    (when-let [data (lookup-entry config id :parallelism-configuration)]
      (. builder parallelismConfiguration data))
    (.build builder)))


(defn cfn-application-flink-run-configuration-property-builder
  "The cfn-application-flink-run-configuration-property-builder function buildes out new instances of 
CfnApplication$FlinkRunConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowNonRestoredState` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-non-restored-state` |"
  [stack id config]
  (let [builder (CfnApplication$FlinkRunConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-non-restored-state)]
      (. builder allowNonRestoredState data))
    (.build builder)))


(defn cfn-application-glue-data-catalog-configuration-property-builder
  "The cfn-application-glue-data-catalog-configuration-property-builder function buildes out new instances of 
CfnApplication$GlueDataCatalogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-arn` |"
  [stack id config]
  (let [builder (CfnApplication$GlueDataCatalogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-arn)]
      (. builder databaseArn data))
    (.build builder)))


(defn cfn-application-input-lambda-processor-property-builder
  "The cfn-application-input-lambda-processor-property-builder function buildes out new instances of 
CfnApplication$InputLambdaProcessorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnApplication$InputLambdaProcessorProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-application-input-parallelism-property-builder
  "The cfn-application-input-parallelism-property-builder function buildes out new instances of 
CfnApplication$InputParallelismProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |"
  [stack id config]
  (let [builder (CfnApplication$InputParallelismProperty$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (.build builder)))


(defn cfn-application-input-processing-configuration-property-builder
  "The cfn-application-input-processing-configuration-property-builder function buildes out new instances of 
CfnApplication$InputProcessingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputLambdaProcessor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-lambda-processor` |"
  [stack id config]
  (let [builder (CfnApplication$InputProcessingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-lambda-processor)]
      (. builder inputLambdaProcessor data))
    (.build builder)))


(defn cfn-application-input-property-builder
  "The cfn-application-input-property-builder function buildes out new instances of 
CfnApplication$InputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputParallelism` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$InputParallelismProperty | [[cdk.support/lookup-entry]] | `:input-parallelism` |
| `inputProcessingConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$InputProcessingConfigurationProperty | [[cdk.support/lookup-entry]] | `:input-processing-configuration` |
| `inputSchema` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$InputSchemaProperty | [[cdk.support/lookup-entry]] | `:input-schema` |
| `kinesisFirehoseInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-firehose-input` |
| `kinesisStreamsInput` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$KinesisStreamsInputProperty | [[cdk.support/lookup-entry]] | `:kinesis-streams-input` |
| `namePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-prefix` |"
  [stack id config]
  (let [builder (CfnApplication$InputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-application-input-schema-property-builder
  "The cfn-application-input-schema-property-builder function buildes out new instances of 
CfnApplication$InputSchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:record-columns` |
| `recordEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-encoding` |
| `recordFormat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-format` |"
  [stack id config]
  (let [builder (CfnApplication$InputSchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :record-columns)]
      (. builder recordColumns data))
    (when-let [data (lookup-entry config id :record-encoding)]
      (. builder recordEncoding data))
    (when-let [data (lookup-entry config id :record-format)]
      (. builder recordFormat data))
    (.build builder)))


(defn cfn-application-json-mapping-parameters-property-builder
  "The cfn-application-json-mapping-parameters-property-builder function buildes out new instances of 
CfnApplication$JSONMappingParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordRowPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-path` |"
  [stack id config]
  (let [builder (CfnApplication$JSONMappingParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :record-row-path)]
      (. builder recordRowPath data))
    (.build builder)))


(defn cfn-application-kinesis-firehose-input-property-builder
  "The cfn-application-kinesis-firehose-input-property-builder function buildes out new instances of 
CfnApplication$KinesisFirehoseInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnApplication$KinesisFirehoseInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-application-kinesis-streams-input-property-builder
  "The cfn-application-kinesis-streams-input-property-builder function buildes out new instances of 
CfnApplication$KinesisStreamsInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnApplication$KinesisStreamsInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-application-mapping-parameters-property-builder
  "The cfn-application-mapping-parameters-property-builder function buildes out new instances of 
CfnApplication$MappingParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvMappingParameters` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$CSVMappingParametersProperty | [[cdk.support/lookup-entry]] | `:csv-mapping-parameters` |
| `jsonMappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-mapping-parameters` |"
  [stack id config]
  (let [builder (CfnApplication$MappingParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv-mapping-parameters)]
      (. builder csvMappingParameters data))
    (when-let [data (lookup-entry config id :json-mapping-parameters)]
      (. builder jsonMappingParameters data))
    (.build builder)))


(defn cfn-application-maven-reference-property-builder
  "The cfn-application-maven-reference-property-builder function buildes out new instances of 
CfnApplication$MavenReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-id` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnApplication$MavenReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :artifact-id)]
      (. builder artifactId data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-application-monitoring-configuration-property-builder
  "The cfn-application-monitoring-configuration-property-builder function buildes out new instances of 
CfnApplication$MonitoringConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `metricsLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:metrics-level` |"
  [stack id config]
  (let [builder (CfnApplication$MonitoringConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :configuration-type)]
      (. builder configurationType data))
    (when-let [data (lookup-entry config id :log-level)]
      (. builder logLevel data))
    (when-let [data (lookup-entry config id :metrics-level)]
      (. builder metricsLevel data))
    (.build builder)))


(defn cfn-application-output-builder
  "The cfn-application-output-builder function buildes out new instances of 
CfnApplicationOutput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output` |"
  [stack id config]
  (let [builder (CfnApplicationOutput$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (.build builder)))


(defn cfn-application-output-destination-schema-property-builder
  "The cfn-application-output-destination-schema-property-builder function buildes out new instances of 
CfnApplicationOutput$DestinationSchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |"
  [stack id config]
  (let [builder (CfnApplicationOutput$DestinationSchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :record-format-type)]
      (. builder recordFormatType data))
    (.build builder)))


(defn cfn-application-output-kinesis-firehose-output-property-builder
  "The cfn-application-output-kinesis-firehose-output-property-builder function buildes out new instances of 
CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-application-output-kinesis-streams-output-property-builder
  "The cfn-application-output-kinesis-streams-output-property-builder function buildes out new instances of 
CfnApplicationOutput$KinesisStreamsOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnApplicationOutput$KinesisStreamsOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-application-output-lambda-output-property-builder
  "The cfn-application-output-lambda-output-property-builder function buildes out new instances of 
CfnApplicationOutput$LambdaOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnApplicationOutput$LambdaOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-application-output-output-property-builder
  "The cfn-application-output-output-property-builder function buildes out new instances of 
CfnApplicationOutput$OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationSchema` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput$DestinationSchemaProperty | [[cdk.support/lookup-entry]] | `:destination-schema` |
| `kinesisFirehoseOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-firehose-output` |
| `kinesisStreamsOutput` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput$KinesisStreamsOutputProperty | [[cdk.support/lookup-entry]] | `:kinesis-streams-output` |
| `lambdaOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-output` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnApplicationOutput$OutputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-application-output-props-builder
  "The cfn-application-output-props-builder function buildes out new instances of 
CfnApplicationOutputProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output` |"
  [stack id config]
  (let [builder (CfnApplicationOutputProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (.build builder)))


(defn cfn-application-parallelism-configuration-property-builder
  "The cfn-application-parallelism-configuration-property-builder function buildes out new instances of 
CfnApplication$ParallelismConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-enabled` |
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `parallelism` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelism` |
| `parallelismPerKpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelism-per-kpu` |"
  [stack id config]
  (let [builder (CfnApplication$ParallelismConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-enabled)]
      (. builder autoScalingEnabled data))
    (when-let [data (lookup-entry config id :configuration-type)]
      (. builder configurationType data))
    (when-let [data (lookup-entry config id :parallelism)]
      (. builder parallelism data))
    (when-let [data (lookup-entry config id :parallelism-per-kpu)]
      (. builder parallelismPerKpu data))
    (.build builder)))


(defn cfn-application-property-group-property-builder
  "The cfn-application-property-group-property-builder function buildes out new instances of 
CfnApplication$PropertyGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-group-id` |
| `propertyMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:property-map` |"
  [stack id config]
  (let [builder (CfnApplication$PropertyGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :property-group-id)]
      (. builder propertyGroupId data))
    (when-let [data (lookup-entry config id :property-map)]
      (. builder propertyMap data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
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
    (.build builder)))


(defn cfn-application-record-column-property-builder
  "The cfn-application-record-column-property-builder function buildes out new instances of 
CfnApplication$RecordColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mapping` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql-type` |"
  [stack id config]
  (let [builder (CfnApplication$RecordColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :mapping)]
      (. builder mapping data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sql-type)]
      (. builder sqlType data))
    (.build builder)))


(defn cfn-application-record-format-property-builder
  "The cfn-application-record-format-property-builder function buildes out new instances of 
CfnApplication$RecordFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mapping-parameters` |
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |"
  [stack id config]
  (let [builder (CfnApplication$RecordFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :mapping-parameters)]
      (. builder mappingParameters data))
    (when-let [data (lookup-entry config id :record-format-type)]
      (. builder recordFormatType data))
    (.build builder)))


(defn cfn-application-reference-data-source-builder
  "The cfn-application-reference-data-source-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `referenceDataSource` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource$ReferenceDataSourceProperty | [[cdk.support/lookup-entry]] | `:reference-data-source` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :reference-data-source)]
      (. builder referenceDataSource data))
    (.build builder)))


(defn cfn-application-reference-data-source-csv-mapping-parameters-property-builder
  "The cfn-application-reference-data-source-csv-mapping-parameters-property-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$CSVMappingParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumnDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-column-delimiter` |
| `recordRowDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-delimiter` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$CSVMappingParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :record-column-delimiter)]
      (. builder recordColumnDelimiter data))
    (when-let [data (lookup-entry config id :record-row-delimiter)]
      (. builder recordRowDelimiter data))
    (.build builder)))


(defn cfn-application-reference-data-source-json-mapping-parameters-property-builder
  "The cfn-application-reference-data-source-json-mapping-parameters-property-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$JSONMappingParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordRowPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-path` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$JSONMappingParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :record-row-path)]
      (. builder recordRowPath data))
    (.build builder)))


(defn cfn-application-reference-data-source-mapping-parameters-property-builder
  "The cfn-application-reference-data-source-mapping-parameters-property-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$MappingParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvMappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv-mapping-parameters` |
| `jsonMappingParameters` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource$JSONMappingParametersProperty | [[cdk.support/lookup-entry]] | `:json-mapping-parameters` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$MappingParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv-mapping-parameters)]
      (. builder csvMappingParameters data))
    (when-let [data (lookup-entry config id :json-mapping-parameters)]
      (. builder jsonMappingParameters data))
    (.build builder)))


(defn cfn-application-reference-data-source-props-builder
  "The cfn-application-reference-data-source-props-builder function buildes out new instances of 
CfnApplicationReferenceDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `referenceDataSource` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource$ReferenceDataSourceProperty | [[cdk.support/lookup-entry]] | `:reference-data-source` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :reference-data-source)]
      (. builder referenceDataSource data))
    (.build builder)))


(defn cfn-application-reference-data-source-record-column-property-builder
  "The cfn-application-reference-data-source-record-column-property-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$RecordColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mapping` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql-type` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$RecordColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :mapping)]
      (. builder mapping data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sql-type)]
      (. builder sqlType data))
    (.build builder)))


(defn cfn-application-reference-data-source-record-format-property-builder
  "The cfn-application-reference-data-source-record-format-property-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$RecordFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mappingParameters` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource$MappingParametersProperty | [[cdk.support/lookup-entry]] | `:mapping-parameters` |
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$RecordFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :mapping-parameters)]
      (. builder mappingParameters data))
    (when-let [data (lookup-entry config id :record-format-type)]
      (. builder recordFormatType data))
    (.build builder)))


(defn cfn-application-reference-data-source-reference-data-source-property-builder
  "The cfn-application-reference-data-source-reference-data-source-property-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceSchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference-schema` |
| `s3ReferenceDataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-reference-data-source` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :reference-schema)]
      (. builder referenceSchema data))
    (when-let [data (lookup-entry config id :s3-reference-data-source)]
      (. builder s3ReferenceDataSource data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-application-reference-data-source-reference-schema-property-builder
  "The cfn-application-reference-data-source-reference-schema-property-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-columns` |
| `recordEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-encoding` |
| `recordFormat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-format` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :record-columns)]
      (. builder recordColumns data))
    (when-let [data (lookup-entry config id :record-encoding)]
      (. builder recordEncoding data))
    (when-let [data (lookup-entry config id :record-format)]
      (. builder recordFormat data))
    (.build builder)))


(defn cfn-application-reference-data-source-s3-reference-data-source-property-builder
  "The cfn-application-reference-data-source-s3-reference-data-source-property-builder function buildes out new instances of 
CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `fileKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-key` |"
  [stack id config]
  (let [builder (CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (when-let [data (lookup-entry config id :file-key)]
      (. builder fileKey data))
    (.build builder)))


(defn cfn-application-run-configuration-property-builder
  "The cfn-application-run-configuration-property-builder function buildes out new instances of 
CfnApplication$RunConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationRestoreConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-restore-configuration` |
| `flinkRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flink-run-configuration` |"
  [stack id config]
  (let [builder (CfnApplication$RunConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-restore-configuration)]
      (. builder applicationRestoreConfiguration data))
    (when-let [data (lookup-entry config id :flink-run-configuration)]
      (. builder flinkRunConfiguration data))
    (.build builder)))


(defn cfn-application-s3-content-base-location-property-builder
  "The cfn-application-s3-content-base-location-property-builder function buildes out new instances of 
CfnApplication$S3ContentBaseLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |"
  [stack id config]
  (let [builder (CfnApplication$S3ContentBaseLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-path)]
      (. builder basePath data))
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (.build builder)))


(defn cfn-application-s3-content-location-property-builder
  "The cfn-application-s3-content-location-property-builder function buildes out new instances of 
CfnApplication$S3ContentLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `fileKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |"
  [stack id config]
  (let [builder (CfnApplication$S3ContentLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (when-let [data (lookup-entry config id :file-key)]
      (. builder fileKey data))
    (when-let [data (lookup-entry config id :object-version)]
      (. builder objectVersion data))
    (.build builder)))


(defn cfn-application-sql-application-configuration-property-builder
  "The cfn-application-sql-application-configuration-property-builder function buildes out new instances of 
CfnApplication$SqlApplicationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inputs` |"
  [stack id config]
  (let [builder (CfnApplication$SqlApplicationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :inputs)]
      (. builder inputs data))
    (.build builder)))


(defn cfn-application-vpc-configuration-property-builder
  "The cfn-application-vpc-configuration-property-builder function buildes out new instances of 
CfnApplication$VpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnApplication$VpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-application-zeppelin-application-configuration-property-builder
  "The cfn-application-zeppelin-application-configuration-property-builder function buildes out new instances of 
CfnApplication$ZeppelinApplicationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:catalog-configuration` |
| `customArtifactsConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-artifacts-configuration` |
| `deployAsApplicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deploy-as-application-configuration` |
| `monitoringConfiguration` | software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication$ZeppelinMonitoringConfigurationProperty | [[cdk.support/lookup-entry]] | `:monitoring-configuration` |"
  [stack id config]
  (let [builder (CfnApplication$ZeppelinApplicationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-configuration)]
      (. builder catalogConfiguration data))
    (when-let [data (lookup-entry config id :custom-artifacts-configuration)]
      (. builder customArtifactsConfiguration data))
    (when-let [data (lookup-entry config id :deploy-as-application-configuration)]
      (. builder deployAsApplicationConfiguration data))
    (when-let [data (lookup-entry config id :monitoring-configuration)]
      (. builder monitoringConfiguration data))
    (.build builder)))


(defn cfn-application-zeppelin-monitoring-configuration-property-builder
  "The cfn-application-zeppelin-monitoring-configuration-property-builder function buildes out new instances of 
CfnApplication$ZeppelinMonitoringConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |"
  [stack id config]
  (let [builder (CfnApplication$ZeppelinMonitoringConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-level)]
      (. builder logLevel data))
    (.build builder)))