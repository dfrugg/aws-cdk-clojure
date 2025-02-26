(ns cdk.api.services.kinesisanalytics
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kinesisanalytics package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kinesisanalytics CfnApplication$Builder
                                                             CfnApplication$CSVMappingParametersProperty$Builder
                                                             CfnApplication$InputLambdaProcessorProperty$Builder
                                                             CfnApplication$InputParallelismProperty$Builder
                                                             CfnApplication$InputProcessingConfigurationProperty$Builder
                                                             CfnApplication$InputProperty$Builder
                                                             CfnApplication$InputSchemaProperty$Builder
                                                             CfnApplication$JSONMappingParametersProperty$Builder
                                                             CfnApplication$KinesisFirehoseInputProperty$Builder
                                                             CfnApplication$KinesisStreamsInputProperty$Builder
                                                             CfnApplication$MappingParametersProperty$Builder
                                                             CfnApplication$RecordColumnProperty$Builder
                                                             CfnApplication$RecordFormatProperty$Builder
                                                             CfnApplicationCloudWatchLoggingOptionV2$Builder
                                                             CfnApplicationCloudWatchLoggingOptionV2$CloudWatchLoggingOptionProperty$Builder
                                                             CfnApplicationCloudWatchLoggingOptionV2Props$Builder
                                                             CfnApplicationOutput$Builder
                                                             CfnApplicationOutput$DestinationSchemaProperty$Builder
                                                             CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder
                                                             CfnApplicationOutput$KinesisStreamsOutputProperty$Builder
                                                             CfnApplicationOutput$LambdaOutputProperty$Builder
                                                             CfnApplicationOutput$OutputProperty$Builder
                                                             CfnApplicationOutputProps$Builder
                                                             CfnApplicationOutputV2$Builder
                                                             CfnApplicationOutputV2$DestinationSchemaProperty$Builder
                                                             CfnApplicationOutputV2$KinesisFirehoseOutputProperty$Builder
                                                             CfnApplicationOutputV2$KinesisStreamsOutputProperty$Builder
                                                             CfnApplicationOutputV2$LambdaOutputProperty$Builder
                                                             CfnApplicationOutputV2$OutputProperty$Builder
                                                             CfnApplicationOutputV2Props$Builder
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
                                                             CfnApplicationReferenceDataSourceProps$Builder
                                                             CfnApplicationReferenceDataSourceV2$Builder
                                                             CfnApplicationReferenceDataSourceV2$CSVMappingParametersProperty$Builder
                                                             CfnApplicationReferenceDataSourceV2$JSONMappingParametersProperty$Builder
                                                             CfnApplicationReferenceDataSourceV2$MappingParametersProperty$Builder
                                                             CfnApplicationReferenceDataSourceV2$RecordColumnProperty$Builder
                                                             CfnApplicationReferenceDataSourceV2$RecordFormatProperty$Builder
                                                             CfnApplicationReferenceDataSourceV2$ReferenceDataSourceProperty$Builder
                                                             CfnApplicationReferenceDataSourceV2$ReferenceSchemaProperty$Builder
                                                             CfnApplicationReferenceDataSourceV2$S3ReferenceDataSourceProperty$Builder
                                                             CfnApplicationReferenceDataSourceV2Props$Builder
                                                             CfnApplicationV2$ApplicationCodeConfigurationProperty$Builder
                                                             CfnApplicationV2$ApplicationConfigurationProperty$Builder
                                                             CfnApplicationV2$ApplicationMaintenanceConfigurationProperty$Builder
                                                             CfnApplicationV2$ApplicationRestoreConfigurationProperty$Builder
                                                             CfnApplicationV2$ApplicationSnapshotConfigurationProperty$Builder
                                                             CfnApplicationV2$Builder
                                                             CfnApplicationV2$CSVMappingParametersProperty$Builder
                                                             CfnApplicationV2$CatalogConfigurationProperty$Builder
                                                             CfnApplicationV2$CheckpointConfigurationProperty$Builder
                                                             CfnApplicationV2$CodeContentProperty$Builder
                                                             CfnApplicationV2$CustomArtifactConfigurationProperty$Builder
                                                             CfnApplicationV2$DeployAsApplicationConfigurationProperty$Builder
                                                             CfnApplicationV2$EnvironmentPropertiesProperty$Builder
                                                             CfnApplicationV2$FlinkApplicationConfigurationProperty$Builder
                                                             CfnApplicationV2$FlinkRunConfigurationProperty$Builder
                                                             CfnApplicationV2$GlueDataCatalogConfigurationProperty$Builder
                                                             CfnApplicationV2$InputLambdaProcessorProperty$Builder
                                                             CfnApplicationV2$InputParallelismProperty$Builder
                                                             CfnApplicationV2$InputProcessingConfigurationProperty$Builder
                                                             CfnApplicationV2$InputProperty$Builder
                                                             CfnApplicationV2$InputSchemaProperty$Builder
                                                             CfnApplicationV2$JSONMappingParametersProperty$Builder
                                                             CfnApplicationV2$KinesisFirehoseInputProperty$Builder
                                                             CfnApplicationV2$KinesisStreamsInputProperty$Builder
                                                             CfnApplicationV2$MappingParametersProperty$Builder
                                                             CfnApplicationV2$MavenReferenceProperty$Builder
                                                             CfnApplicationV2$MonitoringConfigurationProperty$Builder
                                                             CfnApplicationV2$ParallelismConfigurationProperty$Builder
                                                             CfnApplicationV2$PropertyGroupProperty$Builder
                                                             CfnApplicationV2$RecordColumnProperty$Builder
                                                             CfnApplicationV2$RecordFormatProperty$Builder
                                                             CfnApplicationV2$RunConfigurationProperty$Builder
                                                             CfnApplicationV2$S3ContentBaseLocationProperty$Builder
                                                             CfnApplicationV2$S3ContentLocationProperty$Builder
                                                             CfnApplicationV2$SqlApplicationConfigurationProperty$Builder
                                                             CfnApplicationV2$VpcConfigurationProperty$Builder
                                                             CfnApplicationV2$ZeppelinApplicationConfigurationProperty$Builder
                                                             CfnApplicationV2$ZeppelinMonitoringConfigurationProperty$Builder
                                                             CfnApplicationV2Props$Builder]))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-code` |
| `applicationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-description` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `inputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inputs` |
"
  [^CfnApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :application-code)]
    (. builder applicationCode data))
  (when-some [data (lookup-entry config id :application-description)]
    (. builder applicationDescription data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :inputs)]
    (. builder inputs data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-builder (CfnApplication$Builder/create scope (name id)) id config))


(defn build-cfn-application-cloud-watch-logging-option-v2-builder
  "The build-cfn-application-cloud-watch-logging-option-v2-builder function updates a CfnApplicationCloudWatchLoggingOptionV2$Builder instance using the provided configuration.
  The function takes the CfnApplicationCloudWatchLoggingOptionV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `cloudWatchLoggingOption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-option` |
"
  [^CfnApplicationCloudWatchLoggingOptionV2$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-option)]
    (. builder cloudWatchLoggingOption data))
  (.build builder))


(defn cfn-application-cloud-watch-logging-option-v2-builder
  "Creates a  `CfnApplicationCloudWatchLoggingOptionV2$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-cloud-watch-logging-option-v2-builder (CfnApplicationCloudWatchLoggingOptionV2$Builder/create scope (name id)) id config))


(defn build-cfn-application-cloud-watch-logging-option-v2-cloud-watch-logging-option-property-builder
  "The build-cfn-application-cloud-watch-logging-option-v2-cloud-watch-logging-option-property-builder function updates a CfnApplicationCloudWatchLoggingOptionV2$CloudWatchLoggingOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationCloudWatchLoggingOptionV2$CloudWatchLoggingOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-arn` |
"
  [^CfnApplicationCloudWatchLoggingOptionV2$CloudWatchLoggingOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-stream-arn)]
    (. builder logStreamArn data))
  (.build builder))


(defn cfn-application-cloud-watch-logging-option-v2-cloud-watch-logging-option-property-builder
  "Creates a  `CfnApplicationCloudWatchLoggingOptionV2$CloudWatchLoggingOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-cloud-watch-logging-option-v2-cloud-watch-logging-option-property-builder (new CfnApplicationCloudWatchLoggingOptionV2$CloudWatchLoggingOptionProperty$Builder) id config))


(defn build-cfn-application-cloud-watch-logging-option-v2-props-builder
  "The build-cfn-application-cloud-watch-logging-option-v2-props-builder function updates a CfnApplicationCloudWatchLoggingOptionV2Props$Builder instance using the provided configuration.
  The function takes the CfnApplicationCloudWatchLoggingOptionV2Props$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `cloudWatchLoggingOption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-option` |
"
  [^CfnApplicationCloudWatchLoggingOptionV2Props$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-option)]
    (. builder cloudWatchLoggingOption data))
  (.build builder))


(defn cfn-application-cloud-watch-logging-option-v2-props-builder
  "Creates a  `CfnApplicationCloudWatchLoggingOptionV2Props$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-cloud-watch-logging-option-v2-props-builder (new CfnApplicationCloudWatchLoggingOptionV2Props$Builder) id config))


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
  (when-some [data (lookup-entry config id :record-column-delimiter)]
    (. builder recordColumnDelimiter data))
  (when-some [data (lookup-entry config id :record-row-delimiter)]
    (. builder recordRowDelimiter data))
  (.build builder))


(defn cfn-application-csv-mapping-parameters-property-builder
  "Creates a  `CfnApplication$CSVMappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-csv-mapping-parameters-property-builder (new CfnApplication$CSVMappingParametersProperty$Builder) id config))


(defn build-cfn-application-input-lambda-processor-property-builder
  "The build-cfn-application-input-lambda-processor-property-builder function updates a CfnApplication$InputLambdaProcessorProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InputLambdaProcessorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnApplication$InputLambdaProcessorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-application-input-lambda-processor-property-builder
  "Creates a  `CfnApplication$InputLambdaProcessorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (.build builder))


(defn cfn-application-input-parallelism-property-builder
  "Creates a  `CfnApplication$InputParallelismProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :input-lambda-processor)]
    (. builder inputLambdaProcessor data))
  (.build builder))


(defn cfn-application-input-processing-configuration-property-builder
  "Creates a  `CfnApplication$InputProcessingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-input-processing-configuration-property-builder (new CfnApplication$InputProcessingConfigurationProperty$Builder) id config))


(defn build-cfn-application-input-property-builder
  "The build-cfn-application-input-property-builder function updates a CfnApplication$InputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputParallelism` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-parallelism` |
| `inputProcessingConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplication$InputProcessingConfigurationProperty | [[cdk.support/lookup-entry]] | `:input-processing-configuration` |
| `inputSchema` | software.amazon.awscdk.services.kinesisanalytics.CfnApplication$InputSchemaProperty | [[cdk.support/lookup-entry]] | `:input-schema` |
| `kinesisFirehoseInput` | software.amazon.awscdk.services.kinesisanalytics.CfnApplication$KinesisFirehoseInputProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-input` |
| `kinesisStreamsInput` | software.amazon.awscdk.services.kinesisanalytics.CfnApplication$KinesisStreamsInputProperty | [[cdk.support/lookup-entry]] | `:kinesis-streams-input` |
| `namePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-prefix` |
"
  [^CfnApplication$InputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-parallelism)]
    (. builder inputParallelism data))
  (when-some [data (lookup-entry config id :input-processing-configuration)]
    (. builder inputProcessingConfiguration data))
  (when-some [data (lookup-entry config id :input-schema)]
    (. builder inputSchema data))
  (when-some [data (lookup-entry config id :kinesis-firehose-input)]
    (. builder kinesisFirehoseInput data))
  (when-some [data (lookup-entry config id :kinesis-streams-input)]
    (. builder kinesisStreamsInput data))
  (when-some [data (lookup-entry config id :name-prefix)]
    (. builder namePrefix data))
  (.build builder))


(defn cfn-application-input-property-builder
  "Creates a  `CfnApplication$InputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `recordFormat` | software.amazon.awscdk.services.kinesisanalytics.CfnApplication$RecordFormatProperty | [[cdk.support/lookup-entry]] | `:record-format` |
"
  [^CfnApplication$InputSchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-columns)]
    (. builder recordColumns data))
  (when-some [data (lookup-entry config id :record-encoding)]
    (. builder recordEncoding data))
  (when-some [data (lookup-entry config id :record-format)]
    (. builder recordFormat data))
  (.build builder))


(defn cfn-application-input-schema-property-builder
  "Creates a  `CfnApplication$InputSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :record-row-path)]
    (. builder recordRowPath data))
  (.build builder))


(defn cfn-application-json-mapping-parameters-property-builder
  "Creates a  `CfnApplication$JSONMappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnApplication$KinesisFirehoseInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-application-kinesis-firehose-input-property-builder
  "Creates a  `CfnApplication$KinesisFirehoseInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnApplication$KinesisStreamsInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-application-kinesis-streams-input-property-builder
  "Creates a  `CfnApplication$KinesisStreamsInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-kinesis-streams-input-property-builder (new CfnApplication$KinesisStreamsInputProperty$Builder) id config))


(defn build-cfn-application-mapping-parameters-property-builder
  "The build-cfn-application-mapping-parameters-property-builder function updates a CfnApplication$MappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$MappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvMappingParameters` | software.amazon.awscdk.services.kinesisanalytics.CfnApplication$CSVMappingParametersProperty | [[cdk.support/lookup-entry]] | `:csv-mapping-parameters` |
| `jsonMappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-mapping-parameters` |
"
  [^CfnApplication$MappingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :csv-mapping-parameters)]
    (. builder csvMappingParameters data))
  (when-some [data (lookup-entry config id :json-mapping-parameters)]
    (. builder jsonMappingParameters data))
  (.build builder))


(defn cfn-application-mapping-parameters-property-builder
  "Creates a  `CfnApplication$MappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-mapping-parameters-property-builder (new CfnApplication$MappingParametersProperty$Builder) id config))


(defn build-cfn-application-output-builder
  "The build-cfn-application-output-builder function updates a CfnApplicationOutput$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `output` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput$OutputProperty | [[cdk.support/lookup-entry]] | `:output` |
"
  [^CfnApplicationOutput$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (.build builder))


(defn cfn-application-output-builder
  "Creates a  `CfnApplicationOutput$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-output-destination-schema-property-builder
  "Creates a  `CfnApplicationOutput$DestinationSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-application-output-kinesis-firehose-output-property-builder
  "Creates a  `CfnApplicationOutput$KinesisFirehoseOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnApplicationOutput$KinesisStreamsOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-application-output-kinesis-streams-output-property-builder
  "Creates a  `CfnApplicationOutput$KinesisStreamsOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnApplicationOutput$LambdaOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-application-output-lambda-output-property-builder
  "Creates a  `CfnApplicationOutput$LambdaOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-output-lambda-output-property-builder (new CfnApplicationOutput$LambdaOutputProperty$Builder) id config))


(defn build-cfn-application-output-output-property-builder
  "The build-cfn-application-output-output-property-builder function updates a CfnApplicationOutput$OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutput$OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationSchema` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput$DestinationSchemaProperty | [[cdk.support/lookup-entry]] | `:destination-schema` |
| `kinesisFirehoseOutput` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput$KinesisFirehoseOutputProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-output` |
| `kinesisStreamsOutput` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput$KinesisStreamsOutputProperty | [[cdk.support/lookup-entry]] | `:kinesis-streams-output` |
| `lambdaOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-output` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnApplicationOutput$OutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-schema)]
    (. builder destinationSchema data))
  (when-some [data (lookup-entry config id :kinesis-firehose-output)]
    (. builder kinesisFirehoseOutput data))
  (when-some [data (lookup-entry config id :kinesis-streams-output)]
    (. builder kinesisStreamsOutput data))
  (when-some [data (lookup-entry config id :lambda-output)]
    (. builder lambdaOutput data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-application-output-output-property-builder
  "Creates a  `CfnApplicationOutput$OutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (.build builder))


(defn cfn-application-output-props-builder
  "Creates a  `CfnApplicationOutputProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-output-props-builder (new CfnApplicationOutputProps$Builder) id config))


(defn build-cfn-application-output-v2-builder
  "The build-cfn-application-output-v2-builder function updates a CfnApplicationOutputV2$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutputV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `output` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2$OutputProperty | [[cdk.support/lookup-entry]] | `:output` |
"
  [^CfnApplicationOutputV2$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (.build builder))


(defn cfn-application-output-v2-builder
  "Creates a  `CfnApplicationOutputV2$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-output-v2-builder (CfnApplicationOutputV2$Builder/create scope (name id)) id config))


(defn build-cfn-application-output-v2-destination-schema-property-builder
  "The build-cfn-application-output-v2-destination-schema-property-builder function updates a CfnApplicationOutputV2$DestinationSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutputV2$DestinationSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |
"
  [^CfnApplicationOutputV2$DestinationSchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-output-v2-destination-schema-property-builder
  "Creates a  `CfnApplicationOutputV2$DestinationSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-output-v2-destination-schema-property-builder (new CfnApplicationOutputV2$DestinationSchemaProperty$Builder) id config))


(defn build-cfn-application-output-v2-kinesis-firehose-output-property-builder
  "The build-cfn-application-output-v2-kinesis-firehose-output-property-builder function updates a CfnApplicationOutputV2$KinesisFirehoseOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutputV2$KinesisFirehoseOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationOutputV2$KinesisFirehoseOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-output-v2-kinesis-firehose-output-property-builder
  "Creates a  `CfnApplicationOutputV2$KinesisFirehoseOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-output-v2-kinesis-firehose-output-property-builder (new CfnApplicationOutputV2$KinesisFirehoseOutputProperty$Builder) id config))


(defn build-cfn-application-output-v2-kinesis-streams-output-property-builder
  "The build-cfn-application-output-v2-kinesis-streams-output-property-builder function updates a CfnApplicationOutputV2$KinesisStreamsOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutputV2$KinesisStreamsOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationOutputV2$KinesisStreamsOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-output-v2-kinesis-streams-output-property-builder
  "Creates a  `CfnApplicationOutputV2$KinesisStreamsOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-output-v2-kinesis-streams-output-property-builder (new CfnApplicationOutputV2$KinesisStreamsOutputProperty$Builder) id config))


(defn build-cfn-application-output-v2-lambda-output-property-builder
  "The build-cfn-application-output-v2-lambda-output-property-builder function updates a CfnApplicationOutputV2$LambdaOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutputV2$LambdaOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationOutputV2$LambdaOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-output-v2-lambda-output-property-builder
  "Creates a  `CfnApplicationOutputV2$LambdaOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-output-v2-lambda-output-property-builder (new CfnApplicationOutputV2$LambdaOutputProperty$Builder) id config))


(defn build-cfn-application-output-v2-output-property-builder
  "The build-cfn-application-output-v2-output-property-builder function updates a CfnApplicationOutputV2$OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutputV2$OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationSchema` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2$DestinationSchemaProperty | [[cdk.support/lookup-entry]] | `:destination-schema` |
| `kinesisFirehoseOutput` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2$KinesisFirehoseOutputProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-output` |
| `kinesisStreamsOutput` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2$KinesisStreamsOutputProperty | [[cdk.support/lookup-entry]] | `:kinesis-streams-output` |
| `lambdaOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-output` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnApplicationOutputV2$OutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-schema)]
    (. builder destinationSchema data))
  (when-some [data (lookup-entry config id :kinesis-firehose-output)]
    (. builder kinesisFirehoseOutput data))
  (when-some [data (lookup-entry config id :kinesis-streams-output)]
    (. builder kinesisStreamsOutput data))
  (when-some [data (lookup-entry config id :lambda-output)]
    (. builder lambdaOutput data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-application-output-v2-output-property-builder
  "Creates a  `CfnApplicationOutputV2$OutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-output-v2-output-property-builder (new CfnApplicationOutputV2$OutputProperty$Builder) id config))


(defn build-cfn-application-output-v2-props-builder
  "The build-cfn-application-output-v2-props-builder function updates a CfnApplicationOutputV2Props$Builder instance using the provided configuration.
  The function takes the CfnApplicationOutputV2Props$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `output` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2$OutputProperty | [[cdk.support/lookup-entry]] | `:output` |
"
  [^CfnApplicationOutputV2Props$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (.build builder))


(defn cfn-application-output-v2-props-builder
  "Creates a  `CfnApplicationOutputV2Props$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-output-v2-props-builder (new CfnApplicationOutputV2Props$Builder) id config))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-code` |
| `applicationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-description` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-code)]
    (. builder applicationCode data))
  (when-some [data (lookup-entry config id :application-description)]
    (. builder applicationDescription data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :inputs)]
    (. builder inputs data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sql-type)]
    (. builder sqlType data))
  (.build builder))


(defn cfn-application-record-column-property-builder
  "Creates a  `CfnApplication$RecordColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-record-column-property-builder (new CfnApplication$RecordColumnProperty$Builder) id config))


(defn build-cfn-application-record-format-property-builder
  "The build-cfn-application-record-format-property-builder function updates a CfnApplication$RecordFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$RecordFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mappingParameters` | software.amazon.awscdk.services.kinesisanalytics.CfnApplication$MappingParametersProperty | [[cdk.support/lookup-entry]] | `:mapping-parameters` |
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |
"
  [^CfnApplication$RecordFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mapping-parameters)]
    (. builder mappingParameters data))
  (when-some [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-record-format-property-builder
  "Creates a  `CfnApplication$RecordFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `referenceDataSource` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource$ReferenceDataSourceProperty | [[cdk.support/lookup-entry]] | `:reference-data-source` |
"
  [^CfnApplicationReferenceDataSource$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :reference-data-source)]
    (. builder referenceDataSource data))
  (.build builder))


(defn cfn-application-reference-data-source-builder
  "Creates a  `CfnApplicationReferenceDataSource$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :record-column-delimiter)]
    (. builder recordColumnDelimiter data))
  (when-some [data (lookup-entry config id :record-row-delimiter)]
    (. builder recordRowDelimiter data))
  (.build builder))


(defn cfn-application-reference-data-source-csv-mapping-parameters-property-builder
  "Creates a  `CfnApplicationReferenceDataSource$CSVMappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :record-row-path)]
    (. builder recordRowPath data))
  (.build builder))


(defn cfn-application-reference-data-source-json-mapping-parameters-property-builder
  "Creates a  `CfnApplicationReferenceDataSource$JSONMappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `jsonMappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-mapping-parameters` |
"
  [^CfnApplicationReferenceDataSource$MappingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :csv-mapping-parameters)]
    (. builder csvMappingParameters data))
  (when-some [data (lookup-entry config id :json-mapping-parameters)]
    (. builder jsonMappingParameters data))
  (.build builder))


(defn cfn-application-reference-data-source-mapping-parameters-property-builder
  "Creates a  `CfnApplicationReferenceDataSource$MappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `referenceDataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference-data-source` |
"
  [^CfnApplicationReferenceDataSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :reference-data-source)]
    (. builder referenceDataSource data))
  (.build builder))


(defn cfn-application-reference-data-source-props-builder
  "Creates a  `CfnApplicationReferenceDataSourceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sql-type)]
    (. builder sqlType data))
  (.build builder))


(defn cfn-application-reference-data-source-record-column-property-builder
  "Creates a  `CfnApplicationReferenceDataSource$RecordColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-record-column-property-builder (new CfnApplicationReferenceDataSource$RecordColumnProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-record-format-property-builder
  "The build-cfn-application-reference-data-source-record-format-property-builder function updates a CfnApplicationReferenceDataSource$RecordFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$RecordFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mappingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mapping-parameters` |
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |
"
  [^CfnApplicationReferenceDataSource$RecordFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mapping-parameters)]
    (. builder mappingParameters data))
  (when-some [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-reference-data-source-record-format-property-builder
  "Creates a  `CfnApplicationReferenceDataSource$RecordFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (when-some [data (lookup-entry config id :reference-schema)]
    (. builder referenceSchema data))
  (when-some [data (lookup-entry config id :s3-reference-data-source)]
    (. builder s3ReferenceDataSource data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-application-reference-data-source-reference-data-source-property-builder
  "Creates a  `CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-reference-data-source-property-builder (new CfnApplicationReferenceDataSource$ReferenceDataSourceProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-reference-schema-property-builder
  "The build-cfn-application-reference-data-source-reference-schema-property-builder function updates a CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:record-columns` |
| `recordEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-encoding` |
| `recordFormat` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource$RecordFormatProperty | [[cdk.support/lookup-entry]] | `:record-format` |
"
  [^CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-columns)]
    (. builder recordColumns data))
  (when-some [data (lookup-entry config id :record-encoding)]
    (. builder recordEncoding data))
  (when-some [data (lookup-entry config id :record-format)]
    (. builder recordFormat data))
  (.build builder))


(defn cfn-application-reference-data-source-reference-schema-property-builder
  "Creates a  `CfnApplicationReferenceDataSource$ReferenceSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
| `referenceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-role-arn` |
"
  [^CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-some [data (lookup-entry config id :file-key)]
    (. builder fileKey data))
  (when-some [data (lookup-entry config id :reference-role-arn)]
    (. builder referenceRoleArn data))
  (.build builder))


(defn cfn-application-reference-data-source-s3-reference-data-source-property-builder
  "Creates a  `CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-s3-reference-data-source-property-builder (new CfnApplicationReferenceDataSource$S3ReferenceDataSourceProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-builder
  "The build-cfn-application-reference-data-source-v2-builder function updates a CfnApplicationReferenceDataSourceV2$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `referenceDataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference-data-source` |
"
  [^CfnApplicationReferenceDataSourceV2$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :reference-data-source)]
    (. builder referenceDataSource data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-reference-data-source-v2-builder (CfnApplicationReferenceDataSourceV2$Builder/create scope (name id)) id config))


(defn build-cfn-application-reference-data-source-v2-csv-mapping-parameters-property-builder
  "The build-cfn-application-reference-data-source-v2-csv-mapping-parameters-property-builder function updates a CfnApplicationReferenceDataSourceV2$CSVMappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$CSVMappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumnDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-column-delimiter` |
| `recordRowDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-delimiter` |
"
  [^CfnApplicationReferenceDataSourceV2$CSVMappingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-column-delimiter)]
    (. builder recordColumnDelimiter data))
  (when-some [data (lookup-entry config id :record-row-delimiter)]
    (. builder recordRowDelimiter data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-csv-mapping-parameters-property-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$CSVMappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-csv-mapping-parameters-property-builder (new CfnApplicationReferenceDataSourceV2$CSVMappingParametersProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-json-mapping-parameters-property-builder
  "The build-cfn-application-reference-data-source-v2-json-mapping-parameters-property-builder function updates a CfnApplicationReferenceDataSourceV2$JSONMappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$JSONMappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordRowPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-path` |
"
  [^CfnApplicationReferenceDataSourceV2$JSONMappingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-row-path)]
    (. builder recordRowPath data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-json-mapping-parameters-property-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$JSONMappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-json-mapping-parameters-property-builder (new CfnApplicationReferenceDataSourceV2$JSONMappingParametersProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-mapping-parameters-property-builder
  "The build-cfn-application-reference-data-source-v2-mapping-parameters-property-builder function updates a CfnApplicationReferenceDataSourceV2$MappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$MappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvMappingParameters` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2$CSVMappingParametersProperty | [[cdk.support/lookup-entry]] | `:csv-mapping-parameters` |
| `jsonMappingParameters` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2$JSONMappingParametersProperty | [[cdk.support/lookup-entry]] | `:json-mapping-parameters` |
"
  [^CfnApplicationReferenceDataSourceV2$MappingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :csv-mapping-parameters)]
    (. builder csvMappingParameters data))
  (when-some [data (lookup-entry config id :json-mapping-parameters)]
    (. builder jsonMappingParameters data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-mapping-parameters-property-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$MappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-mapping-parameters-property-builder (new CfnApplicationReferenceDataSourceV2$MappingParametersProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-props-builder
  "The build-cfn-application-reference-data-source-v2-props-builder function updates a CfnApplicationReferenceDataSourceV2Props$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2Props$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `referenceDataSource` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2$ReferenceDataSourceProperty | [[cdk.support/lookup-entry]] | `:reference-data-source` |
"
  [^CfnApplicationReferenceDataSourceV2Props$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :reference-data-source)]
    (. builder referenceDataSource data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-props-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2Props$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-props-builder (new CfnApplicationReferenceDataSourceV2Props$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-record-column-property-builder
  "The build-cfn-application-reference-data-source-v2-record-column-property-builder function updates a CfnApplicationReferenceDataSourceV2$RecordColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$RecordColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mapping` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql-type` |
"
  [^CfnApplicationReferenceDataSourceV2$RecordColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sql-type)]
    (. builder sqlType data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-record-column-property-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$RecordColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-record-column-property-builder (new CfnApplicationReferenceDataSourceV2$RecordColumnProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-record-format-property-builder
  "The build-cfn-application-reference-data-source-v2-record-format-property-builder function updates a CfnApplicationReferenceDataSourceV2$RecordFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$RecordFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mappingParameters` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2$MappingParametersProperty | [[cdk.support/lookup-entry]] | `:mapping-parameters` |
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |
"
  [^CfnApplicationReferenceDataSourceV2$RecordFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mapping-parameters)]
    (. builder mappingParameters data))
  (when-some [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-record-format-property-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$RecordFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-record-format-property-builder (new CfnApplicationReferenceDataSourceV2$RecordFormatProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-reference-data-source-property-builder
  "The build-cfn-application-reference-data-source-v2-reference-data-source-property-builder function updates a CfnApplicationReferenceDataSourceV2$ReferenceDataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$ReferenceDataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceSchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference-schema` |
| `s3ReferenceDataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-reference-data-source` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnApplicationReferenceDataSourceV2$ReferenceDataSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :reference-schema)]
    (. builder referenceSchema data))
  (when-some [data (lookup-entry config id :s3-reference-data-source)]
    (. builder s3ReferenceDataSource data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-reference-data-source-property-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$ReferenceDataSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-reference-data-source-property-builder (new CfnApplicationReferenceDataSourceV2$ReferenceDataSourceProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-reference-schema-property-builder
  "The build-cfn-application-reference-data-source-v2-reference-schema-property-builder function updates a CfnApplicationReferenceDataSourceV2$ReferenceSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$ReferenceSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-columns` |
| `recordEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-encoding` |
| `recordFormat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-format` |
"
  [^CfnApplicationReferenceDataSourceV2$ReferenceSchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-columns)]
    (. builder recordColumns data))
  (when-some [data (lookup-entry config id :record-encoding)]
    (. builder recordEncoding data))
  (when-some [data (lookup-entry config id :record-format)]
    (. builder recordFormat data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-reference-schema-property-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$ReferenceSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-reference-schema-property-builder (new CfnApplicationReferenceDataSourceV2$ReferenceSchemaProperty$Builder) id config))


(defn build-cfn-application-reference-data-source-v2-s3-reference-data-source-property-builder
  "The build-cfn-application-reference-data-source-v2-s3-reference-data-source-property-builder function updates a CfnApplicationReferenceDataSourceV2$S3ReferenceDataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationReferenceDataSourceV2$S3ReferenceDataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `fileKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-key` |
"
  [^CfnApplicationReferenceDataSourceV2$S3ReferenceDataSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-some [data (lookup-entry config id :file-key)]
    (. builder fileKey data))
  (.build builder))


(defn cfn-application-reference-data-source-v2-s3-reference-data-source-property-builder
  "Creates a  `CfnApplicationReferenceDataSourceV2$S3ReferenceDataSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-reference-data-source-v2-s3-reference-data-source-property-builder (new CfnApplicationReferenceDataSourceV2$S3ReferenceDataSourceProperty$Builder) id config))


(defn build-cfn-application-v2-application-code-configuration-property-builder
  "The build-cfn-application-v2-application-code-configuration-property-builder function updates a CfnApplicationV2$ApplicationCodeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$ApplicationCodeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeContent` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$CodeContentProperty | [[cdk.support/lookup-entry]] | `:code-content` |
| `codeContentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-content-type` |
"
  [^CfnApplicationV2$ApplicationCodeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :code-content)]
    (. builder codeContent data))
  (when-some [data (lookup-entry config id :code-content-type)]
    (. builder codeContentType data))
  (.build builder))


(defn cfn-application-v2-application-code-configuration-property-builder
  "Creates a  `CfnApplicationV2$ApplicationCodeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-application-code-configuration-property-builder (new CfnApplicationV2$ApplicationCodeConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-application-configuration-property-builder
  "The build-cfn-application-v2-application-configuration-property-builder function updates a CfnApplicationV2$ApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$ApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationCodeConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$ApplicationCodeConfigurationProperty | [[cdk.support/lookup-entry]] | `:application-code-configuration` |
| `applicationSnapshotConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$ApplicationSnapshotConfigurationProperty | [[cdk.support/lookup-entry]] | `:application-snapshot-configuration` |
| `environmentProperties` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$EnvironmentPropertiesProperty | [[cdk.support/lookup-entry]] | `:environment-properties` |
| `flinkApplicationConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$FlinkApplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:flink-application-configuration` |
| `sqlApplicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sql-application-configuration` |
| `vpcConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configurations` |
| `zeppelinApplicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zeppelin-application-configuration` |
"
  [^CfnApplicationV2$ApplicationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-code-configuration)]
    (. builder applicationCodeConfiguration data))
  (when-some [data (lookup-entry config id :application-snapshot-configuration)]
    (. builder applicationSnapshotConfiguration data))
  (when-some [data (lookup-entry config id :environment-properties)]
    (. builder environmentProperties data))
  (when-some [data (lookup-entry config id :flink-application-configuration)]
    (. builder flinkApplicationConfiguration data))
  (when-some [data (lookup-entry config id :sql-application-configuration)]
    (. builder sqlApplicationConfiguration data))
  (when-some [data (lookup-entry config id :vpc-configurations)]
    (. builder vpcConfigurations data))
  (when-some [data (lookup-entry config id :zeppelin-application-configuration)]
    (. builder zeppelinApplicationConfiguration data))
  (.build builder))


(defn cfn-application-v2-application-configuration-property-builder
  "Creates a  `CfnApplicationV2$ApplicationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-application-configuration-property-builder (new CfnApplicationV2$ApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-application-maintenance-configuration-property-builder
  "The build-cfn-application-v2-application-maintenance-configuration-property-builder function updates a CfnApplicationV2$ApplicationMaintenanceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$ApplicationMaintenanceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationMaintenanceWindowStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-maintenance-window-start-time` |
"
  [^CfnApplicationV2$ApplicationMaintenanceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-maintenance-window-start-time)]
    (. builder applicationMaintenanceWindowStartTime data))
  (.build builder))


(defn cfn-application-v2-application-maintenance-configuration-property-builder
  "Creates a  `CfnApplicationV2$ApplicationMaintenanceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-application-maintenance-configuration-property-builder (new CfnApplicationV2$ApplicationMaintenanceConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-application-restore-configuration-property-builder
  "The build-cfn-application-v2-application-restore-configuration-property-builder function updates a CfnApplicationV2$ApplicationRestoreConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$ApplicationRestoreConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationRestoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-restore-type` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |
"
  [^CfnApplicationV2$ApplicationRestoreConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-restore-type)]
    (. builder applicationRestoreType data))
  (when-some [data (lookup-entry config id :snapshot-name)]
    (. builder snapshotName data))
  (.build builder))


(defn cfn-application-v2-application-restore-configuration-property-builder
  "Creates a  `CfnApplicationV2$ApplicationRestoreConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-application-restore-configuration-property-builder (new CfnApplicationV2$ApplicationRestoreConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-application-snapshot-configuration-property-builder
  "The build-cfn-application-v2-application-snapshot-configuration-property-builder function updates a CfnApplicationV2$ApplicationSnapshotConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$ApplicationSnapshotConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snapshotsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshots-enabled` |
"
  [^CfnApplicationV2$ApplicationSnapshotConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :snapshots-enabled)]
    (. builder snapshotsEnabled data))
  (.build builder))


(defn cfn-application-v2-application-snapshot-configuration-property-builder
  "Creates a  `CfnApplicationV2$ApplicationSnapshotConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-application-snapshot-configuration-property-builder (new CfnApplicationV2$ApplicationSnapshotConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-builder
  "The build-cfn-application-v2-builder function updates a CfnApplicationV2$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-configuration` |
| `applicationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-description` |
| `applicationMaintenanceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-maintenance-configuration` |
| `applicationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-mode` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `runConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$RunConfigurationProperty | [[cdk.support/lookup-entry]] | `:run-configuration` |
| `runtimeEnvironment` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-environment` |
| `serviceExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationV2$Builder builder id config]
  (when-some [data (lookup-entry config id :application-configuration)]
    (. builder applicationConfiguration data))
  (when-some [data (lookup-entry config id :application-description)]
    (. builder applicationDescription data))
  (when-some [data (lookup-entry config id :application-maintenance-configuration)]
    (. builder applicationMaintenanceConfiguration data))
  (when-some [data (lookup-entry config id :application-mode)]
    (. builder applicationMode data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :run-configuration)]
    (. builder runConfiguration data))
  (when-some [data (lookup-entry config id :runtime-environment)]
    (. builder runtimeEnvironment data))
  (when-some [data (lookup-entry config id :service-execution-role)]
    (. builder serviceExecutionRole data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-v2-builder
  "Creates a  `CfnApplicationV2$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-v2-builder (CfnApplicationV2$Builder/create scope (name id)) id config))


(defn build-cfn-application-v2-catalog-configuration-property-builder
  "The build-cfn-application-v2-catalog-configuration-property-builder function updates a CfnApplicationV2$CatalogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$CatalogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueDataCatalogConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$GlueDataCatalogConfigurationProperty | [[cdk.support/lookup-entry]] | `:glue-data-catalog-configuration` |
"
  [^CfnApplicationV2$CatalogConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :glue-data-catalog-configuration)]
    (. builder glueDataCatalogConfiguration data))
  (.build builder))


(defn cfn-application-v2-catalog-configuration-property-builder
  "Creates a  `CfnApplicationV2$CatalogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-catalog-configuration-property-builder (new CfnApplicationV2$CatalogConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-checkpoint-configuration-property-builder
  "The build-cfn-application-v2-checkpoint-configuration-property-builder function updates a CfnApplicationV2$CheckpointConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$CheckpointConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:checkpoint-interval` |
| `checkpointingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:checkpointing-enabled` |
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `minPauseBetweenCheckpoints` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-pause-between-checkpoints` |
"
  [^CfnApplicationV2$CheckpointConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :checkpoint-interval)]
    (. builder checkpointInterval data))
  (when-some [data (lookup-entry config id :checkpointing-enabled)]
    (. builder checkpointingEnabled data))
  (when-some [data (lookup-entry config id :configuration-type)]
    (. builder configurationType data))
  (when-some [data (lookup-entry config id :min-pause-between-checkpoints)]
    (. builder minPauseBetweenCheckpoints data))
  (.build builder))


(defn cfn-application-v2-checkpoint-configuration-property-builder
  "Creates a  `CfnApplicationV2$CheckpointConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-checkpoint-configuration-property-builder (new CfnApplicationV2$CheckpointConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-code-content-property-builder
  "The build-cfn-application-v2-code-content-property-builder function updates a CfnApplicationV2$CodeContentProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$CodeContentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3ContentLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-content-location` |
| `textContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-content` |
| `zipFileContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:zip-file-content` |
"
  [^CfnApplicationV2$CodeContentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-content-location)]
    (. builder s3ContentLocation data))
  (when-some [data (lookup-entry config id :text-content)]
    (. builder textContent data))
  (when-some [data (lookup-entry config id :zip-file-content)]
    (. builder zipFileContent data))
  (.build builder))


(defn cfn-application-v2-code-content-property-builder
  "Creates a  `CfnApplicationV2$CodeContentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-code-content-property-builder (new CfnApplicationV2$CodeContentProperty$Builder) id config))


(defn build-cfn-application-v2-csv-mapping-parameters-property-builder
  "The build-cfn-application-v2-csv-mapping-parameters-property-builder function updates a CfnApplicationV2$CSVMappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$CSVMappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumnDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-column-delimiter` |
| `recordRowDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-delimiter` |
"
  [^CfnApplicationV2$CSVMappingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-column-delimiter)]
    (. builder recordColumnDelimiter data))
  (when-some [data (lookup-entry config id :record-row-delimiter)]
    (. builder recordRowDelimiter data))
  (.build builder))


(defn cfn-application-v2-csv-mapping-parameters-property-builder
  "Creates a  `CfnApplicationV2$CSVMappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-csv-mapping-parameters-property-builder (new CfnApplicationV2$CSVMappingParametersProperty$Builder) id config))


(defn build-cfn-application-v2-custom-artifact-configuration-property-builder
  "The build-cfn-application-v2-custom-artifact-configuration-property-builder function updates a CfnApplicationV2$CustomArtifactConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$CustomArtifactConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactType` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-type` |
| `mavenReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maven-reference` |
| `s3ContentLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-content-location` |
"
  [^CfnApplicationV2$CustomArtifactConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :artifact-type)]
    (. builder artifactType data))
  (when-some [data (lookup-entry config id :maven-reference)]
    (. builder mavenReference data))
  (when-some [data (lookup-entry config id :s3-content-location)]
    (. builder s3ContentLocation data))
  (.build builder))


(defn cfn-application-v2-custom-artifact-configuration-property-builder
  "Creates a  `CfnApplicationV2$CustomArtifactConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-custom-artifact-configuration-property-builder (new CfnApplicationV2$CustomArtifactConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-deploy-as-application-configuration-property-builder
  "The build-cfn-application-v2-deploy-as-application-configuration-property-builder function updates a CfnApplicationV2$DeployAsApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$DeployAsApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3ContentLocation` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$S3ContentBaseLocationProperty | [[cdk.support/lookup-entry]] | `:s3-content-location` |
"
  [^CfnApplicationV2$DeployAsApplicationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-content-location)]
    (. builder s3ContentLocation data))
  (.build builder))


(defn cfn-application-v2-deploy-as-application-configuration-property-builder
  "Creates a  `CfnApplicationV2$DeployAsApplicationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-deploy-as-application-configuration-property-builder (new CfnApplicationV2$DeployAsApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-environment-properties-property-builder
  "The build-cfn-application-v2-environment-properties-property-builder function updates a CfnApplicationV2$EnvironmentPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$EnvironmentPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:property-groups` |
"
  [^CfnApplicationV2$EnvironmentPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :property-groups)]
    (. builder propertyGroups data))
  (.build builder))


(defn cfn-application-v2-environment-properties-property-builder
  "Creates a  `CfnApplicationV2$EnvironmentPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-environment-properties-property-builder (new CfnApplicationV2$EnvironmentPropertiesProperty$Builder) id config))


(defn build-cfn-application-v2-flink-application-configuration-property-builder
  "The build-cfn-application-v2-flink-application-configuration-property-builder function updates a CfnApplicationV2$FlinkApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$FlinkApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$CheckpointConfigurationProperty | [[cdk.support/lookup-entry]] | `:checkpoint-configuration` |
| `monitoringConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$MonitoringConfigurationProperty | [[cdk.support/lookup-entry]] | `:monitoring-configuration` |
| `parallelismConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$ParallelismConfigurationProperty | [[cdk.support/lookup-entry]] | `:parallelism-configuration` |
"
  [^CfnApplicationV2$FlinkApplicationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :checkpoint-configuration)]
    (. builder checkpointConfiguration data))
  (when-some [data (lookup-entry config id :monitoring-configuration)]
    (. builder monitoringConfiguration data))
  (when-some [data (lookup-entry config id :parallelism-configuration)]
    (. builder parallelismConfiguration data))
  (.build builder))


(defn cfn-application-v2-flink-application-configuration-property-builder
  "Creates a  `CfnApplicationV2$FlinkApplicationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-flink-application-configuration-property-builder (new CfnApplicationV2$FlinkApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-flink-run-configuration-property-builder
  "The build-cfn-application-v2-flink-run-configuration-property-builder function updates a CfnApplicationV2$FlinkRunConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$FlinkRunConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowNonRestoredState` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-non-restored-state` |
"
  [^CfnApplicationV2$FlinkRunConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-non-restored-state)]
    (. builder allowNonRestoredState data))
  (.build builder))


(defn cfn-application-v2-flink-run-configuration-property-builder
  "Creates a  `CfnApplicationV2$FlinkRunConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-flink-run-configuration-property-builder (new CfnApplicationV2$FlinkRunConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-glue-data-catalog-configuration-property-builder
  "The build-cfn-application-v2-glue-data-catalog-configuration-property-builder function updates a CfnApplicationV2$GlueDataCatalogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$GlueDataCatalogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-arn` |
"
  [^CfnApplicationV2$GlueDataCatalogConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :database-arn)]
    (. builder databaseArn data))
  (.build builder))


(defn cfn-application-v2-glue-data-catalog-configuration-property-builder
  "Creates a  `CfnApplicationV2$GlueDataCatalogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-glue-data-catalog-configuration-property-builder (new CfnApplicationV2$GlueDataCatalogConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-input-lambda-processor-property-builder
  "The build-cfn-application-v2-input-lambda-processor-property-builder function updates a CfnApplicationV2$InputLambdaProcessorProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$InputLambdaProcessorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationV2$InputLambdaProcessorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-v2-input-lambda-processor-property-builder
  "Creates a  `CfnApplicationV2$InputLambdaProcessorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-input-lambda-processor-property-builder (new CfnApplicationV2$InputLambdaProcessorProperty$Builder) id config))


(defn build-cfn-application-v2-input-parallelism-property-builder
  "The build-cfn-application-v2-input-parallelism-property-builder function updates a CfnApplicationV2$InputParallelismProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$InputParallelismProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
"
  [^CfnApplicationV2$InputParallelismProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (.build builder))


(defn cfn-application-v2-input-parallelism-property-builder
  "Creates a  `CfnApplicationV2$InputParallelismProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-input-parallelism-property-builder (new CfnApplicationV2$InputParallelismProperty$Builder) id config))


(defn build-cfn-application-v2-input-processing-configuration-property-builder
  "The build-cfn-application-v2-input-processing-configuration-property-builder function updates a CfnApplicationV2$InputProcessingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$InputProcessingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputLambdaProcessor` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$InputLambdaProcessorProperty | [[cdk.support/lookup-entry]] | `:input-lambda-processor` |
"
  [^CfnApplicationV2$InputProcessingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-lambda-processor)]
    (. builder inputLambdaProcessor data))
  (.build builder))


(defn cfn-application-v2-input-processing-configuration-property-builder
  "Creates a  `CfnApplicationV2$InputProcessingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-input-processing-configuration-property-builder (new CfnApplicationV2$InputProcessingConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-input-property-builder
  "The build-cfn-application-v2-input-property-builder function updates a CfnApplicationV2$InputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$InputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputParallelism` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$InputParallelismProperty | [[cdk.support/lookup-entry]] | `:input-parallelism` |
| `inputProcessingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-processing-configuration` |
| `inputSchema` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$InputSchemaProperty | [[cdk.support/lookup-entry]] | `:input-schema` |
| `kinesisFirehoseInput` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$KinesisFirehoseInputProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-input` |
| `kinesisStreamsInput` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$KinesisStreamsInputProperty | [[cdk.support/lookup-entry]] | `:kinesis-streams-input` |
| `namePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-prefix` |
"
  [^CfnApplicationV2$InputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-parallelism)]
    (. builder inputParallelism data))
  (when-some [data (lookup-entry config id :input-processing-configuration)]
    (. builder inputProcessingConfiguration data))
  (when-some [data (lookup-entry config id :input-schema)]
    (. builder inputSchema data))
  (when-some [data (lookup-entry config id :kinesis-firehose-input)]
    (. builder kinesisFirehoseInput data))
  (when-some [data (lookup-entry config id :kinesis-streams-input)]
    (. builder kinesisStreamsInput data))
  (when-some [data (lookup-entry config id :name-prefix)]
    (. builder namePrefix data))
  (.build builder))


(defn cfn-application-v2-input-property-builder
  "Creates a  `CfnApplicationV2$InputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-input-property-builder (new CfnApplicationV2$InputProperty$Builder) id config))


(defn build-cfn-application-v2-input-schema-property-builder
  "The build-cfn-application-v2-input-schema-property-builder function updates a CfnApplicationV2$InputSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$InputSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:record-columns` |
| `recordEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-encoding` |
| `recordFormat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-format` |
"
  [^CfnApplicationV2$InputSchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-columns)]
    (. builder recordColumns data))
  (when-some [data (lookup-entry config id :record-encoding)]
    (. builder recordEncoding data))
  (when-some [data (lookup-entry config id :record-format)]
    (. builder recordFormat data))
  (.build builder))


(defn cfn-application-v2-input-schema-property-builder
  "Creates a  `CfnApplicationV2$InputSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-input-schema-property-builder (new CfnApplicationV2$InputSchemaProperty$Builder) id config))


(defn build-cfn-application-v2-json-mapping-parameters-property-builder
  "The build-cfn-application-v2-json-mapping-parameters-property-builder function updates a CfnApplicationV2$JSONMappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$JSONMappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordRowPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-row-path` |
"
  [^CfnApplicationV2$JSONMappingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :record-row-path)]
    (. builder recordRowPath data))
  (.build builder))


(defn cfn-application-v2-json-mapping-parameters-property-builder
  "Creates a  `CfnApplicationV2$JSONMappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-json-mapping-parameters-property-builder (new CfnApplicationV2$JSONMappingParametersProperty$Builder) id config))


(defn build-cfn-application-v2-kinesis-firehose-input-property-builder
  "The build-cfn-application-v2-kinesis-firehose-input-property-builder function updates a CfnApplicationV2$KinesisFirehoseInputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$KinesisFirehoseInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationV2$KinesisFirehoseInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-v2-kinesis-firehose-input-property-builder
  "Creates a  `CfnApplicationV2$KinesisFirehoseInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-kinesis-firehose-input-property-builder (new CfnApplicationV2$KinesisFirehoseInputProperty$Builder) id config))


(defn build-cfn-application-v2-kinesis-streams-input-property-builder
  "The build-cfn-application-v2-kinesis-streams-input-property-builder function updates a CfnApplicationV2$KinesisStreamsInputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$KinesisStreamsInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnApplicationV2$KinesisStreamsInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-application-v2-kinesis-streams-input-property-builder
  "Creates a  `CfnApplicationV2$KinesisStreamsInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-kinesis-streams-input-property-builder (new CfnApplicationV2$KinesisStreamsInputProperty$Builder) id config))


(defn build-cfn-application-v2-mapping-parameters-property-builder
  "The build-cfn-application-v2-mapping-parameters-property-builder function updates a CfnApplicationV2$MappingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$MappingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvMappingParameters` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$CSVMappingParametersProperty | [[cdk.support/lookup-entry]] | `:csv-mapping-parameters` |
| `jsonMappingParameters` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$JSONMappingParametersProperty | [[cdk.support/lookup-entry]] | `:json-mapping-parameters` |
"
  [^CfnApplicationV2$MappingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :csv-mapping-parameters)]
    (. builder csvMappingParameters data))
  (when-some [data (lookup-entry config id :json-mapping-parameters)]
    (. builder jsonMappingParameters data))
  (.build builder))


(defn cfn-application-v2-mapping-parameters-property-builder
  "Creates a  `CfnApplicationV2$MappingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-mapping-parameters-property-builder (new CfnApplicationV2$MappingParametersProperty$Builder) id config))


(defn build-cfn-application-v2-maven-reference-property-builder
  "The build-cfn-application-v2-maven-reference-property-builder function updates a CfnApplicationV2$MavenReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$MavenReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-id` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnApplicationV2$MavenReferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :artifact-id)]
    (. builder artifactId data))
  (when-some [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-application-v2-maven-reference-property-builder
  "Creates a  `CfnApplicationV2$MavenReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-maven-reference-property-builder (new CfnApplicationV2$MavenReferenceProperty$Builder) id config))


(defn build-cfn-application-v2-monitoring-configuration-property-builder
  "The build-cfn-application-v2-monitoring-configuration-property-builder function updates a CfnApplicationV2$MonitoringConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$MonitoringConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `metricsLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:metrics-level` |
"
  [^CfnApplicationV2$MonitoringConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-type)]
    (. builder configurationType data))
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-some [data (lookup-entry config id :metrics-level)]
    (. builder metricsLevel data))
  (.build builder))


(defn cfn-application-v2-monitoring-configuration-property-builder
  "Creates a  `CfnApplicationV2$MonitoringConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-monitoring-configuration-property-builder (new CfnApplicationV2$MonitoringConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-parallelism-configuration-property-builder
  "The build-cfn-application-v2-parallelism-configuration-property-builder function updates a CfnApplicationV2$ParallelismConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$ParallelismConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-scaling-enabled` |
| `configurationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-type` |
| `parallelism` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelism` |
| `parallelismPerKpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelism-per-kpu` |
"
  [^CfnApplicationV2$ParallelismConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-enabled)]
    (. builder autoScalingEnabled data))
  (when-some [data (lookup-entry config id :configuration-type)]
    (. builder configurationType data))
  (when-some [data (lookup-entry config id :parallelism)]
    (. builder parallelism data))
  (when-some [data (lookup-entry config id :parallelism-per-kpu)]
    (. builder parallelismPerKpu data))
  (.build builder))


(defn cfn-application-v2-parallelism-configuration-property-builder
  "Creates a  `CfnApplicationV2$ParallelismConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-parallelism-configuration-property-builder (new CfnApplicationV2$ParallelismConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-property-group-property-builder
  "The build-cfn-application-v2-property-group-property-builder function updates a CfnApplicationV2$PropertyGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$PropertyGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-group-id` |
| `propertyMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-map` |
"
  [^CfnApplicationV2$PropertyGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :property-group-id)]
    (. builder propertyGroupId data))
  (when-some [data (lookup-entry config id :property-map)]
    (. builder propertyMap data))
  (.build builder))


(defn cfn-application-v2-property-group-property-builder
  "Creates a  `CfnApplicationV2$PropertyGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-property-group-property-builder (new CfnApplicationV2$PropertyGroupProperty$Builder) id config))


(defn build-cfn-application-v2-props-builder
  "The build-cfn-application-v2-props-builder function updates a CfnApplicationV2Props$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2Props$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$ApplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:application-configuration` |
| `applicationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-description` |
| `applicationMaintenanceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-maintenance-configuration` |
| `applicationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-mode` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `runConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:run-configuration` |
| `runtimeEnvironment` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-environment` |
| `serviceExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationV2Props$Builder builder id config]
  (when-some [data (lookup-entry config id :application-configuration)]
    (. builder applicationConfiguration data))
  (when-some [data (lookup-entry config id :application-description)]
    (. builder applicationDescription data))
  (when-some [data (lookup-entry config id :application-maintenance-configuration)]
    (. builder applicationMaintenanceConfiguration data))
  (when-some [data (lookup-entry config id :application-mode)]
    (. builder applicationMode data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :run-configuration)]
    (. builder runConfiguration data))
  (when-some [data (lookup-entry config id :runtime-environment)]
    (. builder runtimeEnvironment data))
  (when-some [data (lookup-entry config id :service-execution-role)]
    (. builder serviceExecutionRole data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-v2-props-builder
  "Creates a  `CfnApplicationV2Props$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-props-builder (new CfnApplicationV2Props$Builder) id config))


(defn build-cfn-application-v2-record-column-property-builder
  "The build-cfn-application-v2-record-column-property-builder function updates a CfnApplicationV2$RecordColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$RecordColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mapping` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql-type` |
"
  [^CfnApplicationV2$RecordColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mapping)]
    (. builder mapping data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sql-type)]
    (. builder sqlType data))
  (.build builder))


(defn cfn-application-v2-record-column-property-builder
  "Creates a  `CfnApplicationV2$RecordColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-record-column-property-builder (new CfnApplicationV2$RecordColumnProperty$Builder) id config))


(defn build-cfn-application-v2-record-format-property-builder
  "The build-cfn-application-v2-record-format-property-builder function updates a CfnApplicationV2$RecordFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$RecordFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mappingParameters` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$MappingParametersProperty | [[cdk.support/lookup-entry]] | `:mapping-parameters` |
| `recordFormatType` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-format-type` |
"
  [^CfnApplicationV2$RecordFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mapping-parameters)]
    (. builder mappingParameters data))
  (when-some [data (lookup-entry config id :record-format-type)]
    (. builder recordFormatType data))
  (.build builder))


(defn cfn-application-v2-record-format-property-builder
  "Creates a  `CfnApplicationV2$RecordFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-record-format-property-builder (new CfnApplicationV2$RecordFormatProperty$Builder) id config))


(defn build-cfn-application-v2-run-configuration-property-builder
  "The build-cfn-application-v2-run-configuration-property-builder function updates a CfnApplicationV2$RunConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$RunConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationRestoreConfiguration` | software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2$ApplicationRestoreConfigurationProperty | [[cdk.support/lookup-entry]] | `:application-restore-configuration` |
| `flinkRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flink-run-configuration` |
"
  [^CfnApplicationV2$RunConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-restore-configuration)]
    (. builder applicationRestoreConfiguration data))
  (when-some [data (lookup-entry config id :flink-run-configuration)]
    (. builder flinkRunConfiguration data))
  (.build builder))


(defn cfn-application-v2-run-configuration-property-builder
  "Creates a  `CfnApplicationV2$RunConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-run-configuration-property-builder (new CfnApplicationV2$RunConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-s3-content-base-location-property-builder
  "The build-cfn-application-v2-s3-content-base-location-property-builder function updates a CfnApplicationV2$S3ContentBaseLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$S3ContentBaseLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-path` |
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
"
  [^CfnApplicationV2$S3ContentBaseLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :base-path)]
    (. builder basePath data))
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (.build builder))


(defn cfn-application-v2-s3-content-base-location-property-builder
  "Creates a  `CfnApplicationV2$S3ContentBaseLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-s3-content-base-location-property-builder (new CfnApplicationV2$S3ContentBaseLocationProperty$Builder) id config))


(defn build-cfn-application-v2-s3-content-location-property-builder
  "The build-cfn-application-v2-s3-content-location-property-builder function updates a CfnApplicationV2$S3ContentLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$S3ContentLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `fileKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
"
  [^CfnApplicationV2$S3ContentLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-some [data (lookup-entry config id :file-key)]
    (. builder fileKey data))
  (when-some [data (lookup-entry config id :object-version)]
    (. builder objectVersion data))
  (.build builder))


(defn cfn-application-v2-s3-content-location-property-builder
  "Creates a  `CfnApplicationV2$S3ContentLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-s3-content-location-property-builder (new CfnApplicationV2$S3ContentLocationProperty$Builder) id config))


(defn build-cfn-application-v2-sql-application-configuration-property-builder
  "The build-cfn-application-v2-sql-application-configuration-property-builder function updates a CfnApplicationV2$SqlApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$SqlApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
"
  [^CfnApplicationV2$SqlApplicationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :inputs)]
    (. builder inputs data))
  (.build builder))


(defn cfn-application-v2-sql-application-configuration-property-builder
  "Creates a  `CfnApplicationV2$SqlApplicationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-sql-application-configuration-property-builder (new CfnApplicationV2$SqlApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-vpc-configuration-property-builder
  "The build-cfn-application-v2-vpc-configuration-property-builder function updates a CfnApplicationV2$VpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$VpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnApplicationV2$VpcConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-application-v2-vpc-configuration-property-builder
  "Creates a  `CfnApplicationV2$VpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-vpc-configuration-property-builder (new CfnApplicationV2$VpcConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-zeppelin-application-configuration-property-builder
  "The build-cfn-application-v2-zeppelin-application-configuration-property-builder function updates a CfnApplicationV2$ZeppelinApplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$ZeppelinApplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:catalog-configuration` |
| `customArtifactsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-artifacts-configuration` |
| `deployAsApplicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deploy-as-application-configuration` |
| `monitoringConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-configuration` |
"
  [^CfnApplicationV2$ZeppelinApplicationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-configuration)]
    (. builder catalogConfiguration data))
  (when-some [data (lookup-entry config id :custom-artifacts-configuration)]
    (. builder customArtifactsConfiguration data))
  (when-some [data (lookup-entry config id :deploy-as-application-configuration)]
    (. builder deployAsApplicationConfiguration data))
  (when-some [data (lookup-entry config id :monitoring-configuration)]
    (. builder monitoringConfiguration data))
  (.build builder))


(defn cfn-application-v2-zeppelin-application-configuration-property-builder
  "Creates a  `CfnApplicationV2$ZeppelinApplicationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-zeppelin-application-configuration-property-builder (new CfnApplicationV2$ZeppelinApplicationConfigurationProperty$Builder) id config))


(defn build-cfn-application-v2-zeppelin-monitoring-configuration-property-builder
  "The build-cfn-application-v2-zeppelin-monitoring-configuration-property-builder function updates a CfnApplicationV2$ZeppelinMonitoringConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationV2$ZeppelinMonitoringConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
"
  [^CfnApplicationV2$ZeppelinMonitoringConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (.build builder))


(defn cfn-application-v2-zeppelin-monitoring-configuration-property-builder
  "Creates a  `CfnApplicationV2$ZeppelinMonitoringConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-v2-zeppelin-monitoring-configuration-property-builder (new CfnApplicationV2$ZeppelinMonitoringConfigurationProperty$Builder) id config))