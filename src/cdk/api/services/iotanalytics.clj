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


(defn build-cfn-channel-builder
  "The build-cfn-channel-builder function updates a CfnChannel$Builder instance using the provided configuration.
  The function takes the CfnChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelStorage` | software.amazon.awscdk.services.iotanalytics.CfnChannel$ChannelStorageProperty | [[cdk.support/lookup-entry]] | `:channel-storage` |
| `retentionPeriod` | software.amazon.awscdk.services.iotanalytics.CfnChannel$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannel$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :channel-storage)]
    (. builder channelStorage data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-channel-builder
  "Creates a  `CfnChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-channel-builder (CfnChannel$Builder/create scope (name id)) id config))


(defn build-cfn-channel-channel-storage-property-builder
  "The build-cfn-channel-channel-storage-property-builder function updates a CfnChannel$ChannelStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ChannelStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedS3` | software.amazon.awscdk.services.iotanalytics.CfnChannel$CustomerManagedS3Property | [[cdk.support/lookup-entry]] | `:customer-managed-s3` |
| `serviceManagedS3` | java.lang.Object | [[cdk.support/lookup-entry]] | `:service-managed-s3` |
"
  [^CfnChannel$ChannelStorageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :customer-managed-s3)]
    (. builder customerManagedS3 data))
  (when-some [data (lookup-entry config id :service-managed-s3)]
    (. builder serviceManagedS3 data))
  (.build builder))


(defn cfn-channel-channel-storage-property-builder
  "Creates a  `CfnChannel$ChannelStorageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-channel-storage-property-builder (new CfnChannel$ChannelStorageProperty$Builder) id config))


(defn build-cfn-channel-customer-managed-s3-property-builder
  "The build-cfn-channel-customer-managed-s3-property-builder function updates a CfnChannel$CustomerManagedS3Property$Builder instance using the provided configuration.
  The function takes the CfnChannel$CustomerManagedS3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnChannel$CustomerManagedS3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key-prefix)]
    (. builder keyPrefix data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-channel-customer-managed-s3-property-builder
  "Creates a  `CfnChannel$CustomerManagedS3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-customer-managed-s3-property-builder (new CfnChannel$CustomerManagedS3Property$Builder) id config))


(defn build-cfn-channel-props-builder
  "The build-cfn-channel-props-builder function updates a CfnChannelProps$Builder instance using the provided configuration.
  The function takes the CfnChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel-storage` |
| `retentionPeriod` | software.amazon.awscdk.services.iotanalytics.CfnChannel$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :channel-storage)]
    (. builder channelStorage data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-channel-props-builder
  "Creates a  `CfnChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-props-builder (new CfnChannelProps$Builder) id config))


(defn build-cfn-channel-retention-period-property-builder
  "The build-cfn-channel-retention-period-property-builder function updates a CfnChannel$RetentionPeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$RetentionPeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-days` |
| `unlimited` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unlimited` |
"
  [^CfnChannel$RetentionPeriodProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :number-of-days)]
    (. builder numberOfDays data))
  (when-some [data (lookup-entry config id :unlimited)]
    (. builder unlimited data))
  (.build builder))


(defn cfn-channel-retention-period-property-builder
  "Creates a  `CfnChannel$RetentionPeriodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-retention-period-property-builder (new CfnChannel$RetentionPeriodProperty$Builder) id config))


(defn build-cfn-dataset-action-property-builder
  "The build-cfn-dataset-action-property-builder function updates a CfnDataset$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `containerAction` | software.amazon.awscdk.services.iotanalytics.CfnDataset$ContainerActionProperty | [[cdk.support/lookup-entry]] | `:container-action` |
| `queryAction` | software.amazon.awscdk.services.iotanalytics.CfnDataset$QueryActionProperty | [[cdk.support/lookup-entry]] | `:query-action` |
"
  [^CfnDataset$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :container-action)]
    (. builder containerAction data))
  (when-some [data (lookup-entry config id :query-action)]
    (. builder queryAction data))
  (.build builder))


(defn cfn-dataset-action-property-builder
  "Creates a  `CfnDataset$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-action-property-builder (new CfnDataset$ActionProperty$Builder) id config))


(defn build-cfn-dataset-builder
  "The build-cfn-dataset-builder function updates a CfnDataset$Builder instance using the provided configuration.
  The function takes the CfnDataset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `contentDeliveryRules` | java.util.List | [[cdk.support/lookup-entry]] | `:content-delivery-rules` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `lateDataRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:late-data-rules` |
| `retentionPeriod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggers` | java.util.List | [[cdk.support/lookup-entry]] | `:triggers` |
| `versioningConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDataset$VersioningConfigurationProperty | [[cdk.support/lookup-entry]] | `:versioning-configuration` |
"
  [^CfnDataset$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :content-delivery-rules)]
    (. builder contentDeliveryRules data))
  (when-some [data (lookup-entry config id :dataset-name)]
    (. builder datasetName data))
  (when-some [data (lookup-entry config id :late-data-rules)]
    (. builder lateDataRules data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :triggers)]
    (. builder triggers data))
  (when-some [data (lookup-entry config id :versioning-configuration)]
    (. builder versioningConfiguration data))
  (.build builder))


(defn cfn-dataset-builder
  "Creates a  `CfnDataset$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-dataset-builder (CfnDataset$Builder/create scope (name id)) id config))


(defn build-cfn-dataset-container-action-property-builder
  "The build-cfn-dataset-container-action-property-builder function updates a CfnDataset$ContainerActionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$ContainerActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `resourceConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDataset$ResourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:resource-configuration` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnDataset$ContainerActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :resource-configuration)]
    (. builder resourceConfiguration data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn cfn-dataset-container-action-property-builder
  "Creates a  `CfnDataset$ContainerActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-container-action-property-builder (new CfnDataset$ContainerActionProperty$Builder) id config))


(defn build-cfn-dataset-dataset-content-delivery-rule-destination-property-builder
  "The build-cfn-dataset-dataset-content-delivery-rule-destination-property-builder function updates a CfnDataset$DatasetContentDeliveryRuleDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DatasetContentDeliveryRuleDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iotEventsDestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iot-events-destination-configuration` |
| `s3DestinationConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDataset$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-destination-configuration` |
"
  [^CfnDataset$DatasetContentDeliveryRuleDestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iot-events-destination-configuration)]
    (. builder iotEventsDestinationConfiguration data))
  (when-some [data (lookup-entry config id :s3-destination-configuration)]
    (. builder s3DestinationConfiguration data))
  (.build builder))


(defn cfn-dataset-dataset-content-delivery-rule-destination-property-builder
  "Creates a  `CfnDataset$DatasetContentDeliveryRuleDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-dataset-content-delivery-rule-destination-property-builder (new CfnDataset$DatasetContentDeliveryRuleDestinationProperty$Builder) id config))


(defn build-cfn-dataset-dataset-content-delivery-rule-property-builder
  "The build-cfn-dataset-dataset-content-delivery-rule-property-builder function updates a CfnDataset$DatasetContentDeliveryRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DatasetContentDeliveryRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.iotanalytics.CfnDataset$DatasetContentDeliveryRuleDestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `entryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry-name` |
"
  [^CfnDataset$DatasetContentDeliveryRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :entry-name)]
    (. builder entryName data))
  (.build builder))


(defn cfn-dataset-dataset-content-delivery-rule-property-builder
  "Creates a  `CfnDataset$DatasetContentDeliveryRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-dataset-content-delivery-rule-property-builder (new CfnDataset$DatasetContentDeliveryRuleProperty$Builder) id config))


(defn build-cfn-dataset-dataset-content-version-value-property-builder
  "The build-cfn-dataset-dataset-content-version-value-property-builder function updates a CfnDataset$DatasetContentVersionValueProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DatasetContentVersionValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
"
  [^CfnDataset$DatasetContentVersionValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dataset-name)]
    (. builder datasetName data))
  (.build builder))


(defn cfn-dataset-dataset-content-version-value-property-builder
  "Creates a  `CfnDataset$DatasetContentVersionValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-dataset-content-version-value-property-builder (new CfnDataset$DatasetContentVersionValueProperty$Builder) id config))


(defn build-cfn-dataset-delta-time-property-builder
  "The build-cfn-dataset-delta-time-property-builder function updates a CfnDataset$DeltaTimeProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DeltaTimeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:offset-seconds` |
| `timeExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-expression` |
"
  [^CfnDataset$DeltaTimeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :offset-seconds)]
    (. builder offsetSeconds data))
  (when-some [data (lookup-entry config id :time-expression)]
    (. builder timeExpression data))
  (.build builder))


(defn cfn-dataset-delta-time-property-builder
  "Creates a  `CfnDataset$DeltaTimeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-delta-time-property-builder (new CfnDataset$DeltaTimeProperty$Builder) id config))


(defn build-cfn-dataset-delta-time-session-window-configuration-property-builder
  "The build-cfn-dataset-delta-time-session-window-configuration-property-builder function updates a CfnDataset$DeltaTimeSessionWindowConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DeltaTimeSessionWindowConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
"
  [^CfnDataset$DeltaTimeSessionWindowConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (.build builder))


(defn cfn-dataset-delta-time-session-window-configuration-property-builder
  "Creates a  `CfnDataset$DeltaTimeSessionWindowConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-delta-time-session-window-configuration-property-builder (new CfnDataset$DeltaTimeSessionWindowConfigurationProperty$Builder) id config))


(defn build-cfn-dataset-filter-property-builder
  "The build-cfn-dataset-filter-property-builder function updates a CfnDataset$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deltaTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delta-time` |
"
  [^CfnDataset$FilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delta-time)]
    (. builder deltaTime data))
  (.build builder))


(defn cfn-dataset-filter-property-builder
  "Creates a  `CfnDataset$FilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-filter-property-builder (new CfnDataset$FilterProperty$Builder) id config))


(defn build-cfn-dataset-glue-configuration-property-builder
  "The build-cfn-dataset-glue-configuration-property-builder function updates a CfnDataset$GlueConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$GlueConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnDataset$GlueConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-dataset-glue-configuration-property-builder
  "Creates a  `CfnDataset$GlueConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-glue-configuration-property-builder (new CfnDataset$GlueConfigurationProperty$Builder) id config))


(defn build-cfn-dataset-iot-events-destination-configuration-property-builder
  "The build-cfn-dataset-iot-events-destination-configuration-property-builder function updates a CfnDataset$IotEventsDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$IotEventsDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDataset$IotEventsDestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-name)]
    (. builder inputName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-dataset-iot-events-destination-configuration-property-builder
  "Creates a  `CfnDataset$IotEventsDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-iot-events-destination-configuration-property-builder (new CfnDataset$IotEventsDestinationConfigurationProperty$Builder) id config))


(defn build-cfn-dataset-late-data-rule-configuration-property-builder
  "The build-cfn-dataset-late-data-rule-configuration-property-builder function updates a CfnDataset$LateDataRuleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$LateDataRuleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deltaTimeSessionWindowConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delta-time-session-window-configuration` |
"
  [^CfnDataset$LateDataRuleConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delta-time-session-window-configuration)]
    (. builder deltaTimeSessionWindowConfiguration data))
  (.build builder))


(defn cfn-dataset-late-data-rule-configuration-property-builder
  "Creates a  `CfnDataset$LateDataRuleConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-late-data-rule-configuration-property-builder (new CfnDataset$LateDataRuleConfigurationProperty$Builder) id config))


(defn build-cfn-dataset-late-data-rule-property-builder
  "The build-cfn-dataset-late-data-rule-property-builder function updates a CfnDataset$LateDataRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$LateDataRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-configuration` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
"
  [^CfnDataset$LateDataRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rule-configuration)]
    (. builder ruleConfiguration data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (.build builder))


(defn cfn-dataset-late-data-rule-property-builder
  "Creates a  `CfnDataset$LateDataRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-late-data-rule-property-builder (new CfnDataset$LateDataRuleProperty$Builder) id config))


(defn build-cfn-dataset-output-file-uri-value-property-builder
  "The build-cfn-dataset-output-file-uri-value-property-builder function updates a CfnDataset$OutputFileUriValueProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$OutputFileUriValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-name` |
"
  [^CfnDataset$OutputFileUriValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :file-name)]
    (. builder fileName data))
  (.build builder))


(defn cfn-dataset-output-file-uri-value-property-builder
  "Creates a  `CfnDataset$OutputFileUriValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-output-file-uri-value-property-builder (new CfnDataset$OutputFileUriValueProperty$Builder) id config))


(defn build-cfn-dataset-props-builder
  "The build-cfn-dataset-props-builder function updates a CfnDatasetProps$Builder instance using the provided configuration.
  The function takes the CfnDatasetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `contentDeliveryRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content-delivery-rules` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `lateDataRules` | java.util.List | [[cdk.support/lookup-entry]] | `:late-data-rules` |
| `retentionPeriod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:triggers` |
| `versioningConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:versioning-configuration` |
"
  [^CfnDatasetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :content-delivery-rules)]
    (. builder contentDeliveryRules data))
  (when-some [data (lookup-entry config id :dataset-name)]
    (. builder datasetName data))
  (when-some [data (lookup-entry config id :late-data-rules)]
    (. builder lateDataRules data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :triggers)]
    (. builder triggers data))
  (when-some [data (lookup-entry config id :versioning-configuration)]
    (. builder versioningConfiguration data))
  (.build builder))


(defn cfn-dataset-props-builder
  "Creates a  `CfnDatasetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-props-builder (new CfnDatasetProps$Builder) id config))


(defn build-cfn-dataset-query-action-property-builder
  "The build-cfn-dataset-query-action-property-builder function updates a CfnDataset$QueryActionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$QueryActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `sqlQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql-query` |
"
  [^CfnDataset$QueryActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :sql-query)]
    (. builder sqlQuery data))
  (.build builder))


(defn cfn-dataset-query-action-property-builder
  "Creates a  `CfnDataset$QueryActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-query-action-property-builder (new CfnDataset$QueryActionProperty$Builder) id config))


(defn build-cfn-dataset-resource-configuration-property-builder
  "The build-cfn-dataset-resource-configuration-property-builder function updates a CfnDataset$ResourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$ResourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnDataset$ResourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-type)]
    (. builder computeType data))
  (when-some [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-dataset-resource-configuration-property-builder
  "Creates a  `CfnDataset$ResourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-resource-configuration-property-builder (new CfnDataset$ResourceConfigurationProperty$Builder) id config))


(defn build-cfn-dataset-retention-period-property-builder
  "The build-cfn-dataset-retention-period-property-builder function updates a CfnDataset$RetentionPeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$RetentionPeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-days` |
| `unlimited` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:unlimited` |
"
  [^CfnDataset$RetentionPeriodProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :number-of-days)]
    (. builder numberOfDays data))
  (when-some [data (lookup-entry config id :unlimited)]
    (. builder unlimited data))
  (.build builder))


(defn cfn-dataset-retention-period-property-builder
  "Creates a  `CfnDataset$RetentionPeriodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-retention-period-property-builder (new CfnDataset$RetentionPeriodProperty$Builder) id config))


(defn build-cfn-dataset-s3-destination-configuration-property-builder
  "The build-cfn-dataset-s3-destination-configuration-property-builder function updates a CfnDataset$S3DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$S3DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `glueConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue-configuration` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDataset$S3DestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :glue-configuration)]
    (. builder glueConfiguration data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-dataset-s3-destination-configuration-property-builder
  "Creates a  `CfnDataset$S3DestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-s3-destination-configuration-property-builder (new CfnDataset$S3DestinationConfigurationProperty$Builder) id config))


(defn build-cfn-dataset-schedule-property-builder
  "The build-cfn-dataset-schedule-property-builder function updates a CfnDataset$ScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$ScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
"
  [^CfnDataset$ScheduleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (.build builder))


(defn cfn-dataset-schedule-property-builder
  "Creates a  `CfnDataset$ScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-schedule-property-builder (new CfnDataset$ScheduleProperty$Builder) id config))


(defn build-cfn-dataset-trigger-property-builder
  "The build-cfn-dataset-trigger-property-builder function updates a CfnDataset$TriggerProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$TriggerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `triggeringDataset` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:triggering-dataset` |
"
  [^CfnDataset$TriggerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :triggering-dataset)]
    (. builder triggeringDataset data))
  (.build builder))


(defn cfn-dataset-trigger-property-builder
  "Creates a  `CfnDataset$TriggerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-trigger-property-builder (new CfnDataset$TriggerProperty$Builder) id config))


(defn build-cfn-dataset-triggering-dataset-property-builder
  "The build-cfn-dataset-triggering-dataset-property-builder function updates a CfnDataset$TriggeringDatasetProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$TriggeringDatasetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
"
  [^CfnDataset$TriggeringDatasetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dataset-name)]
    (. builder datasetName data))
  (.build builder))


(defn cfn-dataset-triggering-dataset-property-builder
  "Creates a  `CfnDataset$TriggeringDatasetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-triggering-dataset-property-builder (new CfnDataset$TriggeringDatasetProperty$Builder) id config))


(defn build-cfn-dataset-variable-property-builder
  "The build-cfn-dataset-variable-property-builder function updates a CfnDataset$VariableProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$VariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetContentVersionValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dataset-content-version-value` |
| `doubleValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:double-value` |
| `outputFileUriValue` | software.amazon.awscdk.services.iotanalytics.CfnDataset$OutputFileUriValueProperty | [[cdk.support/lookup-entry]] | `:output-file-uri-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
| `variableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-name` |
"
  [^CfnDataset$VariableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dataset-content-version-value)]
    (. builder datasetContentVersionValue data))
  (when-some [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-some [data (lookup-entry config id :output-file-uri-value)]
    (. builder outputFileUriValue data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (when-some [data (lookup-entry config id :variable-name)]
    (. builder variableName data))
  (.build builder))


(defn cfn-dataset-variable-property-builder
  "Creates a  `CfnDataset$VariableProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-variable-property-builder (new CfnDataset$VariableProperty$Builder) id config))


(defn build-cfn-dataset-versioning-configuration-property-builder
  "The build-cfn-dataset-versioning-configuration-property-builder function updates a CfnDataset$VersioningConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$VersioningConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxVersions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-versions` |
| `unlimited` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unlimited` |
"
  [^CfnDataset$VersioningConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-versions)]
    (. builder maxVersions data))
  (when-some [data (lookup-entry config id :unlimited)]
    (. builder unlimited data))
  (.build builder))


(defn cfn-dataset-versioning-configuration-property-builder
  "Creates a  `CfnDataset$VersioningConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-versioning-configuration-property-builder (new CfnDataset$VersioningConfigurationProperty$Builder) id config))


(defn build-cfn-datastore-builder
  "The build-cfn-datastore-builder function updates a CfnDatastore$Builder instance using the provided configuration.
  The function takes the CfnDatastore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `datastorePartitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore-partitions` |
| `datastoreStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore-storage` |
| `fileFormatConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$FileFormatConfigurationProperty | [[cdk.support/lookup-entry]] | `:file-format-configuration` |
| `retentionPeriod` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatastore$Builder builder id config]
  (when-some [data (lookup-entry config id :datastore-name)]
    (. builder datastoreName data))
  (when-some [data (lookup-entry config id :datastore-partitions)]
    (. builder datastorePartitions data))
  (when-some [data (lookup-entry config id :datastore-storage)]
    (. builder datastoreStorage data))
  (when-some [data (lookup-entry config id :file-format-configuration)]
    (. builder fileFormatConfiguration data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-datastore-builder
  "Creates a  `CfnDatastore$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-datastore-builder (CfnDatastore$Builder/create scope (name id)) id config))


(defn build-cfn-datastore-column-property-builder
  "The build-cfn-datastore-column-property-builder function updates a CfnDatastore$ColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$ColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDatastore$ColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-datastore-column-property-builder
  "Creates a  `CfnDatastore$ColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-column-property-builder (new CfnDatastore$ColumnProperty$Builder) id config))


(defn build-cfn-datastore-customer-managed-s3-property-builder
  "The build-cfn-datastore-customer-managed-s3-property-builder function updates a CfnDatastore$CustomerManagedS3Property$Builder instance using the provided configuration.
  The function takes the CfnDatastore$CustomerManagedS3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDatastore$CustomerManagedS3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key-prefix)]
    (. builder keyPrefix data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-datastore-customer-managed-s3-property-builder
  "Creates a  `CfnDatastore$CustomerManagedS3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-customer-managed-s3-property-builder (new CfnDatastore$CustomerManagedS3Property$Builder) id config))


(defn build-cfn-datastore-customer-managed-s3-storage-property-builder
  "The build-cfn-datastore-customer-managed-s3-storage-property-builder function updates a CfnDatastore$CustomerManagedS3StorageProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$CustomerManagedS3StorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |
"
  [^CfnDatastore$CustomerManagedS3StorageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key-prefix)]
    (. builder keyPrefix data))
  (.build builder))


(defn cfn-datastore-customer-managed-s3-storage-property-builder
  "Creates a  `CfnDatastore$CustomerManagedS3StorageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-customer-managed-s3-storage-property-builder (new CfnDatastore$CustomerManagedS3StorageProperty$Builder) id config))


(defn build-cfn-datastore-datastore-partition-property-builder
  "The build-cfn-datastore-datastore-partition-property-builder function updates a CfnDatastore$DatastorePartitionProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$DatastorePartitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partition` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$PartitionProperty | [[cdk.support/lookup-entry]] | `:partition` |
| `timestampPartition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp-partition` |
"
  [^CfnDatastore$DatastorePartitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :partition)]
    (. builder partition data))
  (when-some [data (lookup-entry config id :timestamp-partition)]
    (. builder timestampPartition data))
  (.build builder))


(defn cfn-datastore-datastore-partition-property-builder
  "Creates a  `CfnDatastore$DatastorePartitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-datastore-partition-property-builder (new CfnDatastore$DatastorePartitionProperty$Builder) id config))


(defn build-cfn-datastore-datastore-partitions-property-builder
  "The build-cfn-datastore-datastore-partitions-property-builder function updates a CfnDatastore$DatastorePartitionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$DatastorePartitionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partitions` |
"
  [^CfnDatastore$DatastorePartitionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :partitions)]
    (. builder partitions data))
  (.build builder))


(defn cfn-datastore-datastore-partitions-property-builder
  "Creates a  `CfnDatastore$DatastorePartitionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-datastore-partitions-property-builder (new CfnDatastore$DatastorePartitionsProperty$Builder) id config))


(defn build-cfn-datastore-datastore-storage-property-builder
  "The build-cfn-datastore-datastore-storage-property-builder function updates a CfnDatastore$DatastoreStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$DatastoreStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedS3` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$CustomerManagedS3Property | [[cdk.support/lookup-entry]] | `:customer-managed-s3` |
| `iotSiteWiseMultiLayerStorage` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$IotSiteWiseMultiLayerStorageProperty | [[cdk.support/lookup-entry]] | `:iot-site-wise-multi-layer-storage` |
| `serviceManagedS3` | java.lang.Object | [[cdk.support/lookup-entry]] | `:service-managed-s3` |
"
  [^CfnDatastore$DatastoreStorageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :customer-managed-s3)]
    (. builder customerManagedS3 data))
  (when-some [data (lookup-entry config id :iot-site-wise-multi-layer-storage)]
    (. builder iotSiteWiseMultiLayerStorage data))
  (when-some [data (lookup-entry config id :service-managed-s3)]
    (. builder serviceManagedS3 data))
  (.build builder))


(defn cfn-datastore-datastore-storage-property-builder
  "Creates a  `CfnDatastore$DatastoreStorageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-datastore-storage-property-builder (new CfnDatastore$DatastoreStorageProperty$Builder) id config))


(defn build-cfn-datastore-file-format-configuration-property-builder
  "The build-cfn-datastore-file-format-configuration-property-builder function updates a CfnDatastore$FileFormatConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$FileFormatConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:json-configuration` |
| `parquetConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$ParquetConfigurationProperty | [[cdk.support/lookup-entry]] | `:parquet-configuration` |
"
  [^CfnDatastore$FileFormatConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :json-configuration)]
    (. builder jsonConfiguration data))
  (when-some [data (lookup-entry config id :parquet-configuration)]
    (. builder parquetConfiguration data))
  (.build builder))


(defn cfn-datastore-file-format-configuration-property-builder
  "Creates a  `CfnDatastore$FileFormatConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-file-format-configuration-property-builder (new CfnDatastore$FileFormatConfigurationProperty$Builder) id config))


(defn build-cfn-datastore-iot-site-wise-multi-layer-storage-property-builder
  "The build-cfn-datastore-iot-site-wise-multi-layer-storage-property-builder function updates a CfnDatastore$IotSiteWiseMultiLayerStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$IotSiteWiseMultiLayerStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedS3Storage` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$CustomerManagedS3StorageProperty | [[cdk.support/lookup-entry]] | `:customer-managed-s3-storage` |
"
  [^CfnDatastore$IotSiteWiseMultiLayerStorageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :customer-managed-s3-storage)]
    (. builder customerManagedS3Storage data))
  (.build builder))


(defn cfn-datastore-iot-site-wise-multi-layer-storage-property-builder
  "Creates a  `CfnDatastore$IotSiteWiseMultiLayerStorageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-iot-site-wise-multi-layer-storage-property-builder (new CfnDatastore$IotSiteWiseMultiLayerStorageProperty$Builder) id config))


(defn build-cfn-datastore-parquet-configuration-property-builder
  "The build-cfn-datastore-parquet-configuration-property-builder function updates a CfnDatastore$ParquetConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$ParquetConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schemaDefinition` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$SchemaDefinitionProperty | [[cdk.support/lookup-entry]] | `:schema-definition` |
"
  [^CfnDatastore$ParquetConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :schema-definition)]
    (. builder schemaDefinition data))
  (.build builder))


(defn cfn-datastore-parquet-configuration-property-builder
  "Creates a  `CfnDatastore$ParquetConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-parquet-configuration-property-builder (new CfnDatastore$ParquetConfigurationProperty$Builder) id config))


(defn build-cfn-datastore-partition-property-builder
  "The build-cfn-datastore-partition-property-builder function updates a CfnDatastore$PartitionProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$PartitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
"
  [^CfnDatastore$PartitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-name)]
    (. builder attributeName data))
  (.build builder))


(defn cfn-datastore-partition-property-builder
  "Creates a  `CfnDatastore$PartitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-partition-property-builder (new CfnDatastore$PartitionProperty$Builder) id config))


(defn build-cfn-datastore-props-builder
  "The build-cfn-datastore-props-builder function updates a CfnDatastoreProps$Builder instance using the provided configuration.
  The function takes the CfnDatastoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `datastorePartitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore-partitions` |
| `datastoreStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datastore-storage` |
| `fileFormatConfiguration` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$FileFormatConfigurationProperty | [[cdk.support/lookup-entry]] | `:file-format-configuration` |
| `retentionPeriod` | software.amazon.awscdk.services.iotanalytics.CfnDatastore$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatastoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :datastore-name)]
    (. builder datastoreName data))
  (when-some [data (lookup-entry config id :datastore-partitions)]
    (. builder datastorePartitions data))
  (when-some [data (lookup-entry config id :datastore-storage)]
    (. builder datastoreStorage data))
  (when-some [data (lookup-entry config id :file-format-configuration)]
    (. builder fileFormatConfiguration data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-datastore-props-builder
  "Creates a  `CfnDatastoreProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-props-builder (new CfnDatastoreProps$Builder) id config))


(defn build-cfn-datastore-retention-period-property-builder
  "The build-cfn-datastore-retention-period-property-builder function updates a CfnDatastore$RetentionPeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$RetentionPeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-days` |
| `unlimited` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:unlimited` |
"
  [^CfnDatastore$RetentionPeriodProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :number-of-days)]
    (. builder numberOfDays data))
  (when-some [data (lookup-entry config id :unlimited)]
    (. builder unlimited data))
  (.build builder))


(defn cfn-datastore-retention-period-property-builder
  "Creates a  `CfnDatastore$RetentionPeriodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-retention-period-property-builder (new CfnDatastore$RetentionPeriodProperty$Builder) id config))


(defn build-cfn-datastore-schema-definition-property-builder
  "The build-cfn-datastore-schema-definition-property-builder function updates a CfnDatastore$SchemaDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$SchemaDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:columns` |
"
  [^CfnDatastore$SchemaDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :columns)]
    (. builder columns data))
  (.build builder))


(defn cfn-datastore-schema-definition-property-builder
  "Creates a  `CfnDatastore$SchemaDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-schema-definition-property-builder (new CfnDatastore$SchemaDefinitionProperty$Builder) id config))


(defn build-cfn-datastore-timestamp-partition-property-builder
  "The build-cfn-datastore-timestamp-partition-property-builder function updates a CfnDatastore$TimestampPartitionProperty$Builder instance using the provided configuration.
  The function takes the CfnDatastore$TimestampPartitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `timestampFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp-format` |
"
  [^CfnDatastore$TimestampPartitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-name)]
    (. builder attributeName data))
  (when-some [data (lookup-entry config id :timestamp-format)]
    (. builder timestampFormat data))
  (.build builder))


(defn cfn-datastore-timestamp-partition-property-builder
  "Creates a  `CfnDatastore$TimestampPartitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-datastore-timestamp-partition-property-builder (new CfnDatastore$TimestampPartitionProperty$Builder) id config))


(defn build-cfn-pipeline-activity-property-builder
  "The build-cfn-pipeline-activity-property-builder function updates a CfnPipeline$ActivityProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ActivityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `selectAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:select-attributes` |
"
  [^CfnPipeline$ActivityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :add-attributes)]
    (. builder addAttributes data))
  (when-some [data (lookup-entry config id :channel)]
    (. builder channel data))
  (when-some [data (lookup-entry config id :datastore)]
    (. builder datastore data))
  (when-some [data (lookup-entry config id :device-registry-enrich)]
    (. builder deviceRegistryEnrich data))
  (when-some [data (lookup-entry config id :device-shadow-enrich)]
    (. builder deviceShadowEnrich data))
  (when-some [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-some [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-some [data (lookup-entry config id :math)]
    (. builder math data))
  (when-some [data (lookup-entry config id :remove-attributes)]
    (. builder removeAttributes data))
  (when-some [data (lookup-entry config id :select-attributes)]
    (. builder selectAttributes data))
  (.build builder))


(defn cfn-pipeline-activity-property-builder
  "Creates a  `CfnPipeline$ActivityProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-activity-property-builder (new CfnPipeline$ActivityProperty$Builder) id config))


(defn build-cfn-pipeline-add-attributes-property-builder
  "The build-cfn-pipeline-add-attributes-property-builder function updates a CfnPipeline$AddAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$AddAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
"
  [^CfnPipeline$AddAttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (.build builder))


(defn cfn-pipeline-add-attributes-property-builder
  "Creates a  `CfnPipeline$AddAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-add-attributes-property-builder (new CfnPipeline$AddAttributesProperty$Builder) id config))


(defn build-cfn-pipeline-builder
  "The build-cfn-pipeline-builder function updates a CfnPipeline$Builder instance using the provided configuration.
  The function takes the CfnPipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineActivities` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-activities` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPipeline$Builder builder id config]
  (when-some [data (lookup-entry config id :pipeline-activities)]
    (. builder pipelineActivities data))
  (when-some [data (lookup-entry config id :pipeline-name)]
    (. builder pipelineName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pipeline-builder
  "Creates a  `CfnPipeline$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-pipeline-builder (CfnPipeline$Builder/create scope (name id)) id config))


(defn build-cfn-pipeline-channel-property-builder
  "The build-cfn-pipeline-channel-property-builder function updates a CfnPipeline$ChannelProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ChannelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
"
  [^CfnPipeline$ChannelProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (.build builder))


(defn cfn-pipeline-channel-property-builder
  "Creates a  `CfnPipeline$ChannelProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-channel-property-builder (new CfnPipeline$ChannelProperty$Builder) id config))


(defn build-cfn-pipeline-datastore-property-builder
  "The build-cfn-pipeline-datastore-property-builder function updates a CfnPipeline$DatastoreProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$DatastoreProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPipeline$DatastoreProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :datastore-name)]
    (. builder datastoreName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-pipeline-datastore-property-builder
  "Creates a  `CfnPipeline$DatastoreProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-datastore-property-builder (new CfnPipeline$DatastoreProperty$Builder) id config))


(defn build-cfn-pipeline-device-registry-enrich-property-builder
  "The build-cfn-pipeline-device-registry-enrich-property-builder function updates a CfnPipeline$DeviceRegistryEnrichProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$DeviceRegistryEnrichProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnPipeline$DeviceRegistryEnrichProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute)]
    (. builder attribute data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn cfn-pipeline-device-registry-enrich-property-builder
  "Creates a  `CfnPipeline$DeviceRegistryEnrichProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-device-registry-enrich-property-builder (new CfnPipeline$DeviceRegistryEnrichProperty$Builder) id config))


(defn build-cfn-pipeline-device-shadow-enrich-property-builder
  "The build-cfn-pipeline-device-shadow-enrich-property-builder function updates a CfnPipeline$DeviceShadowEnrichProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$DeviceShadowEnrichProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnPipeline$DeviceShadowEnrichProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute)]
    (. builder attribute data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn cfn-pipeline-device-shadow-enrich-property-builder
  "Creates a  `CfnPipeline$DeviceShadowEnrichProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-device-shadow-enrich-property-builder (new CfnPipeline$DeviceShadowEnrichProperty$Builder) id config))


(defn build-cfn-pipeline-filter-property-builder
  "The build-cfn-pipeline-filter-property-builder function updates a CfnPipeline$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
"
  [^CfnPipeline$FilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (.build builder))


(defn cfn-pipeline-filter-property-builder
  "Creates a  `CfnPipeline$FilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-filter-property-builder (new CfnPipeline$FilterProperty$Builder) id config))


(defn build-cfn-pipeline-lambda-property-builder
  "The build-cfn-pipeline-lambda-property-builder function updates a CfnPipeline$LambdaProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$LambdaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `lambdaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
"
  [^CfnPipeline$LambdaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :lambda-name)]
    (. builder lambdaName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (.build builder))


(defn cfn-pipeline-lambda-property-builder
  "Creates a  `CfnPipeline$LambdaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-lambda-property-builder (new CfnPipeline$LambdaProperty$Builder) id config))


(defn build-cfn-pipeline-math-property-builder
  "The build-cfn-pipeline-math-property-builder function updates a CfnPipeline$MathProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$MathProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `math` | java.lang.String | [[cdk.support/lookup-entry]] | `:math` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
"
  [^CfnPipeline$MathProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute)]
    (. builder attribute data))
  (when-some [data (lookup-entry config id :math)]
    (. builder math data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (.build builder))


(defn cfn-pipeline-math-property-builder
  "Creates a  `CfnPipeline$MathProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-math-property-builder (new CfnPipeline$MathProperty$Builder) id config))


(defn build-cfn-pipeline-props-builder
  "The build-cfn-pipeline-props-builder function updates a CfnPipelineProps$Builder instance using the provided configuration.
  The function takes the CfnPipelineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineActivities` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-activities` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPipelineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :pipeline-activities)]
    (. builder pipelineActivities data))
  (when-some [data (lookup-entry config id :pipeline-name)]
    (. builder pipelineName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pipeline-props-builder
  "Creates a  `CfnPipelineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-props-builder (new CfnPipelineProps$Builder) id config))


(defn build-cfn-pipeline-remove-attributes-property-builder
  "The build-cfn-pipeline-remove-attributes-property-builder function updates a CfnPipeline$RemoveAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$RemoveAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
"
  [^CfnPipeline$RemoveAttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (.build builder))


(defn cfn-pipeline-remove-attributes-property-builder
  "Creates a  `CfnPipeline$RemoveAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-remove-attributes-property-builder (new CfnPipeline$RemoveAttributesProperty$Builder) id config))


(defn build-cfn-pipeline-select-attributes-property-builder
  "The build-cfn-pipeline-select-attributes-property-builder function updates a CfnPipeline$SelectAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$SelectAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `next` | java.lang.String | [[cdk.support/lookup-entry]] | `:next` |
"
  [^CfnPipeline$SelectAttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :next)]
    (. builder next data))
  (.build builder))


(defn cfn-pipeline-select-attributes-property-builder
  "Creates a  `CfnPipeline$SelectAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-select-attributes-property-builder (new CfnPipeline$SelectAttributesProperty$Builder) id config))