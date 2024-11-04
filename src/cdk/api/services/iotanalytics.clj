(ns cdk.api.services.iotanalytics
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotanalytics package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotanalytics CfnChannel$Builder
                                                         CfnChannel$ChannelStorageProperty$Builder
                                                         CfnChannel$CustomerManagedS3Property$Builder
                                                         CfnChannel$RetentionPeriodProperty$Builder
                                                         CfnChannelProps$Builder
                                                         CfnDataset$ActionProperty$Builder
                                                         CfnDataset$Builder
                                                         CfnDataset$ContainerActionProperty$Builder
                                                         CfnDataset$DatasetContentDeliveryRuleDestinationProperty$Builder
                                                         CfnDataset$DatasetContentDeliveryRuleProperty$Builder
                                                         CfnDataset$DatasetContentVersionValueProperty$Builder
                                                         CfnDataset$DeltaTimeProperty$Builder
                                                         CfnDataset$DeltaTimeSessionWindowConfigurationProperty$Builder
                                                         CfnDataset$FilterProperty$Builder
                                                         CfnDataset$GlueConfigurationProperty$Builder
                                                         CfnDataset$IotEventsDestinationConfigurationProperty$Builder
                                                         CfnDataset$LateDataRuleConfigurationProperty$Builder
                                                         CfnDataset$LateDataRuleProperty$Builder
                                                         CfnDataset$OutputFileUriValueProperty$Builder
                                                         CfnDataset$QueryActionProperty$Builder
                                                         CfnDataset$ResourceConfigurationProperty$Builder
                                                         CfnDataset$RetentionPeriodProperty$Builder
                                                         CfnDataset$S3DestinationConfigurationProperty$Builder
                                                         CfnDataset$ScheduleProperty$Builder
                                                         CfnDataset$TriggerProperty$Builder
                                                         CfnDataset$TriggeringDatasetProperty$Builder
                                                         CfnDataset$VariableProperty$Builder
                                                         CfnDataset$VersioningConfigurationProperty$Builder
                                                         CfnDatasetProps$Builder
                                                         CfnDatastore$Builder
                                                         CfnDatastore$ColumnProperty$Builder
                                                         CfnDatastore$CustomerManagedS3Property$Builder
                                                         CfnDatastore$CustomerManagedS3StorageProperty$Builder
                                                         CfnDatastore$DatastorePartitionProperty$Builder
                                                         CfnDatastore$DatastorePartitionsProperty$Builder
                                                         CfnDatastore$DatastoreStorageProperty$Builder
                                                         CfnDatastore$FileFormatConfigurationProperty$Builder
                                                         CfnDatastore$IotSiteWiseMultiLayerStorageProperty$Builder
                                                         CfnDatastore$ParquetConfigurationProperty$Builder
                                                         CfnDatastore$PartitionProperty$Builder
                                                         CfnDatastore$RetentionPeriodProperty$Builder
                                                         CfnDatastore$SchemaDefinitionProperty$Builder
                                                         CfnDatastore$TimestampPartitionProperty$Builder
                                                         CfnDatastoreProps$Builder
                                                         CfnPipeline$ActivityProperty$Builder
                                                         CfnPipeline$AddAttributesProperty$Builder
                                                         CfnPipeline$Builder
                                                         CfnPipeline$ChannelProperty$Builder
                                                         CfnPipeline$DatastoreProperty$Builder
                                                         CfnPipeline$DeviceRegistryEnrichProperty$Builder
                                                         CfnPipeline$DeviceShadowEnrichProperty$Builder
                                                         CfnPipeline$FilterProperty$Builder
                                                         CfnPipeline$LambdaProperty$Builder
                                                         CfnPipeline$MathProperty$Builder
                                                         CfnPipeline$RemoveAttributesProperty$Builder
                                                         CfnPipeline$SelectAttributesProperty$Builder
                                                         CfnPipelineProps$Builder]))


(defn cfn-channel-builder
  "The cfn-channel-builder function buildes out new instances of 
CfnChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelStorage` | software.amazon.awscdk.services.iotanalytics.CfnChannel$ChannelStorageProperty | [[cdk.support/lookup-entry]] | `:channel-storage` |
| `retentionPeriod` | software.amazon.awscdk.services.iotanalytics.CfnChannel$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :channel-storage)]
      (. builder channelStorage data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-channel-channel-storage-property-builder
  "The cfn-channel-channel-storage-property-builder function buildes out new instances of 
CfnChannel$ChannelStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedS3` | software.amazon.awscdk.services.iotanalytics.CfnChannel$CustomerManagedS3Property | [[cdk.support/lookup-entry]] | `:customer-managed-s3` |
| `serviceManagedS3` | java.lang.Object | [[cdk.support/lookup-entry]] | `:service-managed-s3` |"
  [stack id config]
  (let [builder (CfnChannel$ChannelStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed-s3)]
      (. builder customerManagedS3 data))
    (when-let [data (lookup-entry config id :service-managed-s3)]
      (. builder serviceManagedS3 data))
    (.build builder)))


(defn cfn-channel-customer-managed-s3-property-builder
  "The cfn-channel-customer-managed-s3-property-builder function buildes out new instances of 
CfnChannel$CustomerManagedS3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnChannel$CustomerManagedS3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key-prefix)]
      (. builder keyPrefix data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-channel-props-builder
  "The cfn-channel-props-builder function buildes out new instances of 
CfnChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel-storage` |
| `retentionPeriod` | software.amazon.awscdk.services.iotanalytics.CfnChannel$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :channel-storage)]
      (. builder channelStorage data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-channel-retention-period-property-builder
  "The cfn-channel-retention-period-property-builder function buildes out new instances of 
CfnChannel$RetentionPeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-days` |
| `unlimited` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unlimited` |"
  [stack id config]
  (let [builder (CfnChannel$RetentionPeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :number-of-days)]
      (. builder numberOfDays data))
    (when-let [data (lookup-entry config id :unlimited)]
      (. builder unlimited data))
    (.build builder)))


(defn cfn-dataset-action-property-builder
  "The cfn-dataset-action-property-builder function buildes out new instances of 
CfnDataset$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `containerAction` | software.amazon.awscdk.services.iotanalytics.CfnDataset$ContainerActionProperty | [[cdk.support/lookup-entry]] | `:container-action` |
| `queryAction` | software.amazon.awscdk.services.iotanalytics.CfnDataset$QueryActionProperty | [[cdk.support/lookup-entry]] | `:query-action` |"
  [stack id config]
  (let [builder (CfnDataset$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :container-action)]
      (. builder containerAction data))
    (when-let [data (lookup-entry config id :query-action)]
      (. builder queryAction data))
    (.build builder)))


(defn cfn-dataset-builder
  "The cfn-dataset-builder function buildes out new instances of 
CfnDataset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `contentDeliveryRules` | java.util.List | [[cdk.support/lookup-entry]] | `:content-delivery-rules` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `lateDataRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:late-data-rules` |
| `retentionPeriod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggers` | java.util.List | [[cdk.support/lookup-entry]] | `:triggers` |
| `versioningConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDataset$VersioningConfigurationProperty | [[cdk.support/lookup-entry]] | `:versioning-configuration` |"
  [stack id config]
  (let [builder (CfnDataset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :content-delivery-rules)]
      (. builder contentDeliveryRules data))
    (when-let [data (lookup-entry config id :dataset-name)]
      (. builder datasetName data))
    (when-let [data (lookup-entry config id :late-data-rules)]
      (. builder lateDataRules data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (when-let [data (lookup-entry config id :versioning-configuration)]
      (. builder versioningConfiguration data))
    (.build builder)))


(defn cfn-dataset-container-action-property-builder
  "The cfn-dataset-container-action-property-builder function buildes out new instances of 
CfnDataset$ContainerActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `resourceConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDataset$ResourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:resource-configuration` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnDataset$ContainerActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :resource-configuration)]
      (. builder resourceConfiguration data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-dataset-dataset-content-delivery-rule-destination-property-builder
  "The cfn-dataset-dataset-content-delivery-rule-destination-property-builder function buildes out new instances of 
CfnDataset$DatasetContentDeliveryRuleDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iotEventsDestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iot-events-destination-configuration` |
| `s3DestinationConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDataset$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-destination-configuration` |"
  [stack id config]
  (let [builder (CfnDataset$DatasetContentDeliveryRuleDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :iot-events-destination-configuration)]
      (. builder iotEventsDestinationConfiguration data))
    (when-let [data (lookup-entry config id :s3-destination-configuration)]
      (. builder s3DestinationConfiguration data))
    (.build builder)))


(defn cfn-dataset-dataset-content-delivery-rule-property-builder
  "The cfn-dataset-dataset-content-delivery-rule-property-builder function buildes out new instances of 
CfnDataset$DatasetContentDeliveryRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.iotanalytics.CfnDataset$DatasetContentDeliveryRuleDestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `entryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry-name` |"
  [stack id config]
  (let [builder (CfnDataset$DatasetContentDeliveryRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :entry-name)]
      (. builder entryName data))
    (.build builder)))


(defn cfn-dataset-dataset-content-version-value-property-builder
  "The cfn-dataset-dataset-content-version-value-property-builder function buildes out new instances of 
CfnDataset$DatasetContentVersionValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |"
  [stack id config]
  (let [builder (CfnDataset$DatasetContentVersionValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :dataset-name)]
      (. builder datasetName data))
    (.build builder)))


(defn cfn-dataset-delta-time-property-builder
  "The cfn-dataset-delta-time-property-builder function buildes out new instances of 
CfnDataset$DeltaTimeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:offset-seconds` |
| `timeExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-expression` |"
  [stack id config]
  (let [builder (CfnDataset$DeltaTimeProperty$Builder.)]
    (when-let [data (lookup-entry config id :offset-seconds)]
      (. builder offsetSeconds data))
    (when-let [data (lookup-entry config id :time-expression)]
      (. builder timeExpression data))
    (.build builder)))


(defn cfn-dataset-delta-time-session-window-configuration-property-builder
  "The cfn-dataset-delta-time-session-window-configuration-property-builder function buildes out new instances of 
CfnDataset$DeltaTimeSessionWindowConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnDataset$DeltaTimeSessionWindowConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :timeout-in-minutes)]
      (. builder timeoutInMinutes data))
    (.build builder)))


(defn cfn-dataset-filter-property-builder
  "The cfn-dataset-filter-property-builder function buildes out new instances of 
CfnDataset$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deltaTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delta-time` |"
  [stack id config]
  (let [builder (CfnDataset$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :delta-time)]
      (. builder deltaTime data))
    (.build builder)))


(defn cfn-dataset-glue-configuration-property-builder
  "The cfn-dataset-glue-configuration-property-builder function buildes out new instances of 
CfnDataset$GlueConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnDataset$GlueConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-dataset-iot-events-destination-configuration-property-builder
  "The cfn-dataset-iot-events-destination-configuration-property-builder function buildes out new instances of 
CfnDataset$IotEventsDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDataset$IotEventsDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-name)]
      (. builder inputName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-dataset-late-data-rule-configuration-property-builder
  "The cfn-dataset-late-data-rule-configuration-property-builder function buildes out new instances of 
CfnDataset$LateDataRuleConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deltaTimeSessionWindowConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delta-time-session-window-configuration` |"
  [stack id config]
  (let [builder (CfnDataset$LateDataRuleConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :delta-time-session-window-configuration)]
      (. builder deltaTimeSessionWindowConfiguration data))
    (.build builder)))


(defn cfn-dataset-late-data-rule-property-builder
  "The cfn-dataset-late-data-rule-property-builder function buildes out new instances of 
CfnDataset$LateDataRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-configuration` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |"
  [stack id config]
  (let [builder (CfnDataset$LateDataRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :rule-configuration)]
      (. builder ruleConfiguration data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (.build builder)))


(defn cfn-dataset-output-file-uri-value-property-builder
  "The cfn-dataset-output-file-uri-value-property-builder function buildes out new instances of 
CfnDataset$OutputFileUriValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-name` |"
  [stack id config]
  (let [builder (CfnDataset$OutputFileUriValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-name)]
      (. builder fileName data))
    (.build builder)))


(defn cfn-dataset-props-builder
  "The cfn-dataset-props-builder function buildes out new instances of 
CfnDatasetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `contentDeliveryRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content-delivery-rules` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `lateDataRules` | java.util.List | [[cdk.support/lookup-entry]] | `:late-data-rules` |
| `retentionPeriod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:triggers` |
| `versioningConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:versioning-configuration` |"
  [stack id config]
  (let [builder (CfnDatasetProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :content-delivery-rules)]
      (. builder contentDeliveryRules data))
    (when-let [data (lookup-entry config id :dataset-name)]
      (. builder datasetName data))
    (when-let [data (lookup-entry config id :late-data-rules)]
      (. builder lateDataRules data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (when-let [data (lookup-entry config id :versioning-configuration)]
      (. builder versioningConfiguration data))
    (.build builder)))


(defn cfn-dataset-query-action-property-builder
  "The cfn-dataset-query-action-property-builder function buildes out new instances of 
CfnDataset$QueryActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `sqlQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql-query` |"
  [stack id config]
  (let [builder (CfnDataset$QueryActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :sql-query)]
      (. builder sqlQuery data))
    (.build builder)))


(defn cfn-dataset-resource-configuration-property-builder
  "The cfn-dataset-resource-configuration-property-builder function buildes out new instances of 
CfnDataset$ResourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnDataset$ResourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :compute-type)]
      (. builder computeType data))
    (when-let [data (lookup-entry config id :volume-size-in-gb)]
      (. builder volumeSizeInGb data))
    (.build builder)))


(defn cfn-dataset-retention-period-property-builder
  "The cfn-dataset-retention-period-property-builder function buildes out new instances of 
CfnDataset$RetentionPeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-days` |
| `unlimited` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:unlimited` |"
  [stack id config]
  (let [builder (CfnDataset$RetentionPeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :number-of-days)]
      (. builder numberOfDays data))
    (when-let [data (lookup-entry config id :unlimited)]
      (. builder unlimited data))
    (.build builder)))


(defn cfn-dataset-s3-destination-configuration-property-builder
  "The cfn-dataset-s3-destination-configuration-property-builder function buildes out new instances of 
CfnDataset$S3DestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `glueConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue-configuration` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDataset$S3DestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :glue-configuration)]
      (. builder glueConfiguration data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-dataset-schedule-property-builder
  "The cfn-dataset-schedule-property-builder function buildes out new instances of 
CfnDataset$ScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |"
  [stack id config]
  (let [builder (CfnDataset$ScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (.build builder)))


(defn cfn-dataset-trigger-property-builder
  "The cfn-dataset-trigger-property-builder function buildes out new instances of 
CfnDataset$TriggerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `triggeringDataset` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:triggering-dataset` |"
  [stack id config]
  (let [builder (CfnDataset$TriggerProperty$Builder.)]
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :triggering-dataset)]
      (. builder triggeringDataset data))
    (.build builder)))


(defn cfn-dataset-triggering-dataset-property-builder
  "The cfn-dataset-triggering-dataset-property-builder function buildes out new instances of 
CfnDataset$TriggeringDatasetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |"
  [stack id config]
  (let [builder (CfnDataset$TriggeringDatasetProperty$Builder.)]
    (when-let [data (lookup-entry config id :dataset-name)]
      (. builder datasetName data))
    (.build builder)))


(defn cfn-dataset-variable-property-builder
  "The cfn-dataset-variable-property-builder function buildes out new instances of 
CfnDataset$VariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetContentVersionValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dataset-content-version-value` |
| `doubleValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:double-value` |
| `outputFileUriValue` | software.amazon.awscdk.services.iotanalytics.CfnDataset$OutputFileUriValueProperty | [[cdk.support/lookup-entry]] | `:output-file-uri-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
| `variableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-name` |"
  [stack id config]
  (let [builder (CfnDataset$VariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :dataset-content-version-value)]
      (. builder datasetContentVersionValue data))
    (when-let [data (lookup-entry config id :double-value)]
      (. builder doubleValue data))
    (when-let [data (lookup-entry config id :output-file-uri-value)]
      (. builder outputFileUriValue data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (when-let [data (lookup-entry config id :variable-name)]
      (. builder variableName data))
    (.build builder)))


(defn cfn-dataset-versioning-configuration-property-builder
  "The cfn-dataset-versioning-configuration-property-builder function buildes out new instances of 
CfnDataset$VersioningConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxVersions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-versions` |
| `unlimited` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unlimited` |"
  [stack id config]
  (let [builder (CfnDataset$VersioningConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-versions)]
      (. builder maxVersions data))
    (when-let [data (lookup-entry config id :unlimited)]
      (. builder unlimited data))
    (.build builder)))


(defn cfn-datastore-builder
  "The cfn-datastore-builder function buildes out new instances of 
CfnDatastore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `datastorePartitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore-partitions` |
| `datastoreStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore-storage` |
| `fileFormatConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$FileFormatConfigurationProperty | [[cdk.support/lookup-entry]] | `:file-format-configuration` |
| `retentionPeriod` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatastore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :datastore-name)]
      (. builder datastoreName data))
    (when-let [data (lookup-entry config id :datastore-partitions)]
      (. builder datastorePartitions data))
    (when-let [data (lookup-entry config id :datastore-storage)]
      (. builder datastoreStorage data))
    (when-let [data (lookup-entry config id :file-format-configuration)]
      (. builder fileFormatConfiguration data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-datastore-column-property-builder
  "The cfn-datastore-column-property-builder function buildes out new instances of 
CfnDatastore$ColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDatastore$ColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-datastore-customer-managed-s3-property-builder
  "The cfn-datastore-customer-managed-s3-property-builder function buildes out new instances of 
CfnDatastore$CustomerManagedS3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDatastore$CustomerManagedS3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key-prefix)]
      (. builder keyPrefix data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-datastore-customer-managed-s3-storage-property-builder
  "The cfn-datastore-customer-managed-s3-storage-property-builder function buildes out new instances of 
CfnDatastore$CustomerManagedS3StorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |"
  [stack id config]
  (let [builder (CfnDatastore$CustomerManagedS3StorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key-prefix)]
      (. builder keyPrefix data))
    (.build builder)))


(defn cfn-datastore-datastore-partition-property-builder
  "The cfn-datastore-datastore-partition-property-builder function buildes out new instances of 
CfnDatastore$DatastorePartitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partition` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$PartitionProperty | [[cdk.support/lookup-entry]] | `:partition` |
| `timestampPartition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp-partition` |"
  [stack id config]
  (let [builder (CfnDatastore$DatastorePartitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :partition)]
      (. builder partition data))
    (when-let [data (lookup-entry config id :timestamp-partition)]
      (. builder timestampPartition data))
    (.build builder)))


(defn cfn-datastore-datastore-partitions-property-builder
  "The cfn-datastore-datastore-partitions-property-builder function buildes out new instances of 
CfnDatastore$DatastorePartitionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partitions` |"
  [stack id config]
  (let [builder (CfnDatastore$DatastorePartitionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :partitions)]
      (. builder partitions data))
    (.build builder)))


(defn cfn-datastore-datastore-storage-property-builder
  "The cfn-datastore-datastore-storage-property-builder function buildes out new instances of 
CfnDatastore$DatastoreStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedS3` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$CustomerManagedS3Property | [[cdk.support/lookup-entry]] | `:customer-managed-s3` |
| `iotSiteWiseMultiLayerStorage` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$IotSiteWiseMultiLayerStorageProperty | [[cdk.support/lookup-entry]] | `:iot-site-wise-multi-layer-storage` |
| `serviceManagedS3` | java.lang.Object | [[cdk.support/lookup-entry]] | `:service-managed-s3` |"
  [stack id config]
  (let [builder (CfnDatastore$DatastoreStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed-s3)]
      (. builder customerManagedS3 data))
    (when-let [data (lookup-entry config id :iot-site-wise-multi-layer-storage)]
      (. builder iotSiteWiseMultiLayerStorage data))
    (when-let [data (lookup-entry config id :service-managed-s3)]
      (. builder serviceManagedS3 data))
    (.build builder)))


(defn cfn-datastore-file-format-configuration-property-builder
  "The cfn-datastore-file-format-configuration-property-builder function buildes out new instances of 
CfnDatastore$FileFormatConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:json-configuration` |
| `parquetConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$ParquetConfigurationProperty | [[cdk.support/lookup-entry]] | `:parquet-configuration` |"
  [stack id config]
  (let [builder (CfnDatastore$FileFormatConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :json-configuration)]
      (. builder jsonConfiguration data))
    (when-let [data (lookup-entry config id :parquet-configuration)]
      (. builder parquetConfiguration data))
    (.build builder)))


(defn cfn-datastore-iot-site-wise-multi-layer-storage-property-builder
  "The cfn-datastore-iot-site-wise-multi-layer-storage-property-builder function buildes out new instances of 
CfnDatastore$IotSiteWiseMultiLayerStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedS3Storage` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$CustomerManagedS3StorageProperty | [[cdk.support/lookup-entry]] | `:customer-managed-s3-storage` |"
  [stack id config]
  (let [builder (CfnDatastore$IotSiteWiseMultiLayerStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed-s3-storage)]
      (. builder customerManagedS3Storage data))
    (.build builder)))


(defn cfn-datastore-parquet-configuration-property-builder
  "The cfn-datastore-parquet-configuration-property-builder function buildes out new instances of 
CfnDatastore$ParquetConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schemaDefinition` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$SchemaDefinitionProperty | [[cdk.support/lookup-entry]] | `:schema-definition` |"
  [stack id config]
  (let [builder (CfnDatastore$ParquetConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :schema-definition)]
      (. builder schemaDefinition data))
    (.build builder)))


(defn cfn-datastore-partition-property-builder
  "The cfn-datastore-partition-property-builder function buildes out new instances of 
CfnDatastore$PartitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |"
  [stack id config]
  (let [builder (CfnDatastore$PartitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (.build builder)))


(defn cfn-datastore-props-builder
  "The cfn-datastore-props-builder function buildes out new instances of 
CfnDatastoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `datastorePartitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore-partitions` |
| `datastoreStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore-storage` |
| `fileFormatConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$FileFormatConfigurationProperty | [[cdk.support/lookup-entry]] | `:file-format-configuration` |
| `retentionPeriod` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatastoreProps$Builder.)]
    (when-let [data (lookup-entry config id :datastore-name)]
      (. builder datastoreName data))
    (when-let [data (lookup-entry config id :datastore-partitions)]
      (. builder datastorePartitions data))
    (when-let [data (lookup-entry config id :datastore-storage)]
      (. builder datastoreStorage data))
    (when-let [data (lookup-entry config id :file-format-configuration)]
      (. builder fileFormatConfiguration data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-datastore-retention-period-property-builder
  "The cfn-datastore-retention-period-property-builder function buildes out new instances of 
CfnDatastore$RetentionPeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-days` |
| `unlimited` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:unlimited` |"
  [stack id config]
  (let [builder (CfnDatastore$RetentionPeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :number-of-days)]
      (. builder numberOfDays data))
    (when-let [data (lookup-entry config id :unlimited)]
      (. builder unlimited data))
    (.build builder)))


(defn cfn-datastore-schema-definition-property-builder
  "The cfn-datastore-schema-definition-property-builder function buildes out new instances of 
CfnDatastore$SchemaDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:columns` |"
  [stack id config]
  (let [builder (CfnDatastore$SchemaDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :columns)]
      (. builder columns data))
    (.build builder)))


(defn cfn-datastore-timestamp-partition-property-builder
  "The cfn-datastore-timestamp-partition-property-builder function buildes out new instances of 
CfnDatastore$TimestampPartitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `timestampFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp-format` |"
  [stack id config]
  (let [builder (CfnDatastore$TimestampPartitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :timestamp-format)]
      (. builder timestampFormat data))
    (.build builder)))


(defn cfn-pipeline-activity-property-builder
  "The cfn-pipeline-activity-property-builder function buildes out new instances of 
CfnPipeline$ActivityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addAttributes` | software.amazon.awscdk.services.iotanalytics.CfnPipeline$AddAttributesProperty | [[cdk.support/lookup-entry]] | `:add-attributes` |
| `channel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel` |
| `datastore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore` |
| `deviceRegistryEnrich` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:device-registry-enrich` |
| `deviceShadowEnrich` | software.amazon.awscdk.services.iotanalytics.CfnPipeline$DeviceShadowEnrichProperty | [[cdk.support/lookup-entry]] | `:device-shadow-enrich` |
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |
| `lambda` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda` |
| `math` | software.amazon.awscdk.services.iotanalytics.CfnPipeline$MathProperty | [[cdk.support/lookup-entry]] | `:math` |
| `removeAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-attributes` |
| `selectAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:select-attributes` |"
  [stack id config]
  (let [builder (CfnPipeline$ActivityProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-attributes)]
      (. builder addAttributes data))
    (when-let [data (lookup-entry config id :channel)]
      (. builder channel data))
    (when-let [data (lookup-entry config id :datastore)]
      (. builder datastore data))
    (when-let [data (lookup-entry config id :device-registry-enrich)]
      (. builder deviceRegistryEnrich data))
    (when-let [data (lookup-entry config id :device-shadow-enrich)]
      (. builder deviceShadowEnrich data))
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (when-let [data (lookup-entry config id :lambda)]
      (. builder lambda data))
    (when-let [data (lookup-entry config id :math)]
      (. builder math data))
    (when-let [data (lookup-entry config id :remove-attributes)]
      (. builder removeAttributes data))
    (when-let [data (lookup-entry config id :select-attributes)]
      (. builder selectAttributes data))
    (.build builder)))


(defn cfn-pipeline-add-attributes-property-builder
  "The cfn-pipeline-add-attributes-property-builder function buildes out new instances of 
CfnPipeline$AddAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |"
  [stack id config]
  (let [builder (CfnPipeline$AddAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (.build builder)))


(defn cfn-pipeline-builder
  "The cfn-pipeline-builder function buildes out new instances of 
CfnPipeline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineActivities` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-activities` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPipeline$Builder/create stack id)]
    (when-let [data (lookup-entry config id :pipeline-activities)]
      (. builder pipelineActivities data))
    (when-let [data (lookup-entry config id :pipeline-name)]
      (. builder pipelineName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-pipeline-channel-property-builder
  "The cfn-pipeline-channel-property-builder function buildes out new instances of 
CfnPipeline$ChannelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |"
  [stack id config]
  (let [builder (CfnPipeline$ChannelProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (.build builder)))


(defn cfn-pipeline-datastore-property-builder
  "The cfn-pipeline-datastore-property-builder function buildes out new instances of 
CfnPipeline$DatastoreProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPipeline$DatastoreProperty$Builder.)]
    (when-let [data (lookup-entry config id :datastore-name)]
      (. builder datastoreName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-pipeline-device-registry-enrich-property-builder
  "The cfn-pipeline-device-registry-enrich-property-builder function buildes out new instances of 
CfnPipeline$DeviceRegistryEnrichProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |"
  [stack id config]
  (let [builder (CfnPipeline$DeviceRegistryEnrichProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute)]
      (. builder attribute data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :thing-name)]
      (. builder thingName data))
    (.build builder)))


(defn cfn-pipeline-device-shadow-enrich-property-builder
  "The cfn-pipeline-device-shadow-enrich-property-builder function buildes out new instances of 
CfnPipeline$DeviceShadowEnrichProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |"
  [stack id config]
  (let [builder (CfnPipeline$DeviceShadowEnrichProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute)]
      (. builder attribute data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :thing-name)]
      (. builder thingName data))
    (.build builder)))


(defn cfn-pipeline-filter-property-builder
  "The cfn-pipeline-filter-property-builder function buildes out new instances of 
CfnPipeline$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |"
  [stack id config]
  (let [builder (CfnPipeline$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (.build builder)))


(defn cfn-pipeline-lambda-property-builder
  "The cfn-pipeline-lambda-property-builder function buildes out new instances of 
CfnPipeline$LambdaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `lambdaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |"
  [stack id config]
  (let [builder (CfnPipeline$LambdaProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-size)]
      (. builder batchSize data))
    (when-let [data (lookup-entry config id :lambda-name)]
      (. builder lambdaName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (.build builder)))


(defn cfn-pipeline-math-property-builder
  "The cfn-pipeline-math-property-builder function buildes out new instances of 
CfnPipeline$MathProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `math` | java.lang.String | [[cdk.support/lookup-entry]] | `:math` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |"
  [stack id config]
  (let [builder (CfnPipeline$MathProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute)]
      (. builder attribute data))
    (when-let [data (lookup-entry config id :math)]
      (. builder math data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (.build builder)))


(defn cfn-pipeline-props-builder
  "The cfn-pipeline-props-builder function buildes out new instances of 
CfnPipelineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineActivities` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-activities` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPipelineProps$Builder.)]
    (when-let [data (lookup-entry config id :pipeline-activities)]
      (. builder pipelineActivities data))
    (when-let [data (lookup-entry config id :pipeline-name)]
      (. builder pipelineName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-pipeline-remove-attributes-property-builder
  "The cfn-pipeline-remove-attributes-property-builder function buildes out new instances of 
CfnPipeline$RemoveAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |"
  [stack id config]
  (let [builder (CfnPipeline$RemoveAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (.build builder)))


(defn cfn-pipeline-select-attributes-property-builder
  "The cfn-pipeline-select-attributes-property-builder function buildes out new instances of 
CfnPipeline$SelectAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |"
  [stack id config]
  (let [builder (CfnPipeline$SelectAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next)]
      (. builder next data))
    (.build builder)))