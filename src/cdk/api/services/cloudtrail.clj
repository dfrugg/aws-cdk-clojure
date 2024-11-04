(ns cdk.api.services.cloudtrail
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudtrail package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.logs :refer [retention-days]])
  (:import [software.amazon.awscdk.services.cloudtrail AddEventSelectorOptions$Builder
                                                       CfnChannel$Builder
                                                       CfnChannel$DestinationProperty$Builder
                                                       CfnChannelProps$Builder
                                                       CfnEventDataStore$AdvancedEventSelectorProperty$Builder
                                                       CfnEventDataStore$AdvancedFieldSelectorProperty$Builder
                                                       CfnEventDataStore$Builder
                                                       CfnEventDataStore$InsightSelectorProperty$Builder
                                                       CfnEventDataStoreProps$Builder
                                                       CfnResourcePolicy$Builder
                                                       CfnResourcePolicyProps$Builder
                                                       CfnTrail$AdvancedEventSelectorProperty$Builder
                                                       CfnTrail$AdvancedFieldSelectorProperty$Builder
                                                       CfnTrail$Builder
                                                       CfnTrail$DataResourceProperty$Builder
                                                       CfnTrail$EventSelectorProperty$Builder
                                                       CfnTrail$InsightSelectorProperty$Builder
                                                       CfnTrailProps$Builder
                                                       DataResourceType
                                                       ManagementEventSources
                                                       ReadWriteType
                                                       S3EventSelector$Builder
                                                       Trail$Builder
                                                       TrailProps$Builder]))


(defn data-resource-type
  "The `data-resource-type` function data interprets values in the provided config data into a 
`DataResourceType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DataResourceType` - the value is returned.
* is `:s3-object` - `DataResourceType/S3_OBJECT` is returned
* is `:lambda-function` - `DataResourceType/LAMBDA_FUNCTION` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DataResourceType data) data
      (= :s3-object data) DataResourceType/S3_OBJECT
      (= :lambda-function data) DataResourceType/LAMBDA_FUNCTION)))


(defn management-event-sources
  "The `management-event-sources` function data interprets values in the provided config data into a 
`ManagementEventSources` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ManagementEventSources` - the value is returned.
* is `:kms` - `ManagementEventSources/KMS` is returned
* is `:rds-data-api` - `ManagementEventSources/RDS_DATA_API` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ManagementEventSources data) data
      (= :kms data) ManagementEventSources/KMS
      (= :rds-data-api data) ManagementEventSources/RDS_DATA_API)))


(defn read-write-type
  "The `read-write-type` function data interprets values in the provided config data into a 
`ReadWriteType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ReadWriteType` - the value is returned.
* is `:all` - `ReadWriteType/ALL` is returned
* is `:write-only` - `ReadWriteType/WRITE_ONLY` is returned
* is `:read-only` - `ReadWriteType/READ_ONLY` is returned
* is `:none` - `ReadWriteType/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ReadWriteType data) data
      (= :all data) ReadWriteType/ALL
      (= :write-only data) ReadWriteType/WRITE_ONLY
      (= :read-only data) ReadWriteType/READ_ONLY
      (= :none data) ReadWriteType/NONE)))


(defn add-event-selector-options-builder
  "The add-event-selector-options-builder function buildes out new instances of 
AddEventSelectorOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeManagementEventSources` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-management-event-sources` |
| `includeManagementEvents` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-management-events` |
| `readWriteType` | software.amazon.awscdk.services.cloudtrail.ReadWriteType | [[cdk.api.services.cloudtrail/read-write-type]] | `:read-write-type` |"
  [stack id config]
  (let [builder (AddEventSelectorOptions$Builder.)]
    (when-let [data (lookup-entry config id :exclude-management-event-sources)]
      (. builder excludeManagementEventSources data))
    (when-let [data (lookup-entry config id :include-management-events)]
      (. builder includeManagementEvents data))
    (when-let [data (read-write-type config id :read-write-type)]
      (. builder readWriteType data))
    (.build builder)))


(defn cfn-channel-builder
  "The cfn-channel-builder function buildes out new instances of 
CfnChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destinations)]
      (. builder destinations data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-channel-destination-property-builder
  "The cfn-channel-destination-property-builder function buildes out new instances of 
CfnChannel$DestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnChannel$DestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-channel-props-builder
  "The cfn-channel-props-builder function buildes out new instances of 
CfnChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :destinations)]
      (. builder destinations data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-event-data-store-advanced-event-selector-property-builder
  "The cfn-event-data-store-advanced-event-selector-property-builder function buildes out new instances of 
CfnEventDataStore$AdvancedEventSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-selectors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnEventDataStore$AdvancedEventSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-selectors)]
      (. builder fieldSelectors data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-event-data-store-advanced-field-selector-property-builder
  "The cfn-event-data-store-advanced-field-selector-property-builder function buildes out new instances of 
CfnEventDataStore$AdvancedFieldSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:ends-with` |
| `equalTo` | java.util.List | [[cdk.support/lookup-entry]] | `:equal-to` |
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `notEndsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:not-ends-with` |
| `notEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:not-equals` |
| `notStartsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:not-starts-with` |
| `startsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:starts-with` |"
  [stack id config]
  (let [builder (CfnEventDataStore$AdvancedFieldSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :ends-with)]
      (. builder endsWith data))
    (when-let [data (lookup-entry config id :equal-to)]
      (. builder equalTo data))
    (when-let [data (lookup-entry config id :field)]
      (. builder field data))
    (when-let [data (lookup-entry config id :not-ends-with)]
      (. builder notEndsWith data))
    (when-let [data (lookup-entry config id :not-equals)]
      (. builder notEquals data))
    (when-let [data (lookup-entry config id :not-starts-with)]
      (. builder notStartsWith data))
    (when-let [data (lookup-entry config id :starts-with)]
      (. builder startsWith data))
    (.build builder)))


(defn cfn-event-data-store-builder
  "The cfn-event-data-store-builder function buildes out new instances of 
CfnEventDataStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedEventSelectors` | java.util.List | [[cdk.support/lookup-entry]] | `:advanced-event-selectors` |
| `billingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-mode` |
| `federationEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:federation-enabled` |
| `federationRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:federation-role-arn` |
| `ingestionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ingestion-enabled` |
| `insightSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:insight-selectors` |
| `insightsDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:insights-destination` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `multiRegionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-region-enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `organizationEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-enabled` |
| `retentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `terminationProtectionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protection-enabled` |"
  [stack id config]
  (let [builder (CfnEventDataStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :advanced-event-selectors)]
      (. builder advancedEventSelectors data))
    (when-let [data (lookup-entry config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :federation-enabled)]
      (. builder federationEnabled data))
    (when-let [data (lookup-entry config id :federation-role-arn)]
      (. builder federationRoleArn data))
    (when-let [data (lookup-entry config id :ingestion-enabled)]
      (. builder ingestionEnabled data))
    (when-let [data (lookup-entry config id :insight-selectors)]
      (. builder insightSelectors data))
    (when-let [data (lookup-entry config id :insights-destination)]
      (. builder insightsDestination data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :multi-region-enabled)]
      (. builder multiRegionEnabled data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :organization-enabled)]
      (. builder organizationEnabled data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :termination-protection-enabled)]
      (. builder terminationProtectionEnabled data))
    (.build builder)))


(defn cfn-event-data-store-insight-selector-property-builder
  "The cfn-event-data-store-insight-selector-property-builder function buildes out new instances of 
CfnEventDataStore$InsightSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insightType` | java.lang.String | [[cdk.support/lookup-entry]] | `:insight-type` |"
  [stack id config]
  (let [builder (CfnEventDataStore$InsightSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :insight-type)]
      (. builder insightType data))
    (.build builder)))


(defn cfn-event-data-store-props-builder
  "The cfn-event-data-store-props-builder function buildes out new instances of 
CfnEventDataStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedEventSelectors` | java.util.List | [[cdk.support/lookup-entry]] | `:advanced-event-selectors` |
| `billingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-mode` |
| `federationEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:federation-enabled` |
| `federationRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:federation-role-arn` |
| `ingestionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ingestion-enabled` |
| `insightSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:insight-selectors` |
| `insightsDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:insights-destination` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `multiRegionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-region-enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `organizationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:organization-enabled` |
| `retentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `terminationProtectionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:termination-protection-enabled` |"
  [stack id config]
  (let [builder (CfnEventDataStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :advanced-event-selectors)]
      (. builder advancedEventSelectors data))
    (when-let [data (lookup-entry config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :federation-enabled)]
      (. builder federationEnabled data))
    (when-let [data (lookup-entry config id :federation-role-arn)]
      (. builder federationRoleArn data))
    (when-let [data (lookup-entry config id :ingestion-enabled)]
      (. builder ingestionEnabled data))
    (when-let [data (lookup-entry config id :insight-selectors)]
      (. builder insightSelectors data))
    (when-let [data (lookup-entry config id :insights-destination)]
      (. builder insightsDestination data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :multi-region-enabled)]
      (. builder multiRegionEnabled data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :organization-enabled)]
      (. builder organizationEnabled data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :termination-protection-enabled)]
      (. builder terminationProtectionEnabled data))
    (.build builder)))


(defn cfn-resource-policy-builder
  "The cfn-resource-policy-builder function buildes out new instances of 
CfnResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `resourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:resource-policy` |"
  [stack id config]
  (let [builder (CfnResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (.build builder)))


(defn cfn-resource-policy-props-builder
  "The cfn-resource-policy-props-builder function buildes out new instances of 
CfnResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `resourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:resource-policy` |"
  [stack id config]
  (let [builder (CfnResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (.build builder)))


(defn cfn-trail-advanced-event-selector-property-builder
  "The cfn-trail-advanced-event-selector-property-builder function buildes out new instances of 
CfnTrail$AdvancedEventSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldSelectors` | java.util.List | [[cdk.support/lookup-entry]] | `:field-selectors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnTrail$AdvancedEventSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-selectors)]
      (. builder fieldSelectors data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-trail-advanced-field-selector-property-builder
  "The cfn-trail-advanced-field-selector-property-builder function buildes out new instances of 
CfnTrail$AdvancedFieldSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:ends-with` |
| `equalTo` | java.util.List | [[cdk.support/lookup-entry]] | `:equal-to` |
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `notEndsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:not-ends-with` |
| `notEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:not-equals` |
| `notStartsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:not-starts-with` |
| `startsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:starts-with` |"
  [stack id config]
  (let [builder (CfnTrail$AdvancedFieldSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :ends-with)]
      (. builder endsWith data))
    (when-let [data (lookup-entry config id :equal-to)]
      (. builder equalTo data))
    (when-let [data (lookup-entry config id :field)]
      (. builder field data))
    (when-let [data (lookup-entry config id :not-ends-with)]
      (. builder notEndsWith data))
    (when-let [data (lookup-entry config id :not-equals)]
      (. builder notEquals data))
    (when-let [data (lookup-entry config id :not-starts-with)]
      (. builder notStartsWith data))
    (when-let [data (lookup-entry config id :starts-with)]
      (. builder startsWith data))
    (.build builder)))


(defn cfn-trail-builder
  "The cfn-trail-builder function buildes out new instances of 
CfnTrail$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedEventSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:advanced-event-selectors` |
| `cloudWatchLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group-arn` |
| `cloudWatchLogsRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-role-arn` |
| `enableLogFileValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-log-file-validation` |
| `eventSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-selectors` |
| `includeGlobalServiceEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-global-service-events` |
| `insightSelectors` | java.util.List | [[cdk.support/lookup-entry]] | `:insight-selectors` |
| `isLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-logging` |
| `isMultiRegionTrail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-multi-region-trail` |
| `isOrganizationTrail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-organization-trail` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
| `snsTopicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trailName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trail-name` |"
  [stack id config]
  (let [builder (CfnTrail$Builder/create stack id)]
    (when-let [data (lookup-entry config id :advanced-event-selectors)]
      (. builder advancedEventSelectors data))
    (when-let [data (lookup-entry config id :cloud-watch-logs-log-group-arn)]
      (. builder cloudWatchLogsLogGroupArn data))
    (when-let [data (lookup-entry config id :cloud-watch-logs-role-arn)]
      (. builder cloudWatchLogsRoleArn data))
    (when-let [data (lookup-entry config id :enable-log-file-validation)]
      (. builder enableLogFileValidation data))
    (when-let [data (lookup-entry config id :event-selectors)]
      (. builder eventSelectors data))
    (when-let [data (lookup-entry config id :include-global-service-events)]
      (. builder includeGlobalServiceEvents data))
    (when-let [data (lookup-entry config id :insight-selectors)]
      (. builder insightSelectors data))
    (when-let [data (lookup-entry config id :is-logging)]
      (. builder isLogging data))
    (when-let [data (lookup-entry config id :is-multi-region-trail)]
      (. builder isMultiRegionTrail data))
    (when-let [data (lookup-entry config id :is-organization-trail)]
      (. builder isOrganizationTrail data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (when-let [data (lookup-entry config id :sns-topic-name)]
      (. builder snsTopicName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trail-name)]
      (. builder trailName data))
    (.build builder)))


(defn cfn-trail-data-resource-property-builder
  "The cfn-trail-data-resource-property-builder function buildes out new instances of 
CfnTrail$DataResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnTrail$DataResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-trail-event-selector-property-builder
  "The cfn-trail-event-selector-property-builder function buildes out new instances of 
CfnTrail$EventSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataResources` | java.util.List | [[cdk.support/lookup-entry]] | `:data-resources` |
| `excludeManagementEventSources` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-management-event-sources` |
| `includeManagementEvents` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-management-events` |
| `readWriteType` | java.lang.String | [[cdk.support/lookup-entry]] | `:read-write-type` |"
  [stack id config]
  (let [builder (CfnTrail$EventSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-resources)]
      (. builder dataResources data))
    (when-let [data (lookup-entry config id :exclude-management-event-sources)]
      (. builder excludeManagementEventSources data))
    (when-let [data (lookup-entry config id :include-management-events)]
      (. builder includeManagementEvents data))
    (when-let [data (lookup-entry config id :read-write-type)]
      (. builder readWriteType data))
    (.build builder)))


(defn cfn-trail-insight-selector-property-builder
  "The cfn-trail-insight-selector-property-builder function buildes out new instances of 
CfnTrail$InsightSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insightType` | java.lang.String | [[cdk.support/lookup-entry]] | `:insight-type` |"
  [stack id config]
  (let [builder (CfnTrail$InsightSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :insight-type)]
      (. builder insightType data))
    (.build builder)))


(defn cfn-trail-props-builder
  "The cfn-trail-props-builder function buildes out new instances of 
CfnTrailProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedEventSelectors` | java.util.List | [[cdk.support/lookup-entry]] | `:advanced-event-selectors` |
| `cloudWatchLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group-arn` |
| `cloudWatchLogsRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-role-arn` |
| `enableLogFileValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-log-file-validation` |
| `eventSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-selectors` |
| `includeGlobalServiceEvents` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-global-service-events` |
| `insightSelectors` | java.util.List | [[cdk.support/lookup-entry]] | `:insight-selectors` |
| `isLogging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-logging` |
| `isMultiRegionTrail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-multi-region-trail` |
| `isOrganizationTrail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-organization-trail` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
| `snsTopicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trailName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trail-name` |"
  [stack id config]
  (let [builder (CfnTrailProps$Builder.)]
    (when-let [data (lookup-entry config id :advanced-event-selectors)]
      (. builder advancedEventSelectors data))
    (when-let [data (lookup-entry config id :cloud-watch-logs-log-group-arn)]
      (. builder cloudWatchLogsLogGroupArn data))
    (when-let [data (lookup-entry config id :cloud-watch-logs-role-arn)]
      (. builder cloudWatchLogsRoleArn data))
    (when-let [data (lookup-entry config id :enable-log-file-validation)]
      (. builder enableLogFileValidation data))
    (when-let [data (lookup-entry config id :event-selectors)]
      (. builder eventSelectors data))
    (when-let [data (lookup-entry config id :include-global-service-events)]
      (. builder includeGlobalServiceEvents data))
    (when-let [data (lookup-entry config id :insight-selectors)]
      (. builder insightSelectors data))
    (when-let [data (lookup-entry config id :is-logging)]
      (. builder isLogging data))
    (when-let [data (lookup-entry config id :is-multi-region-trail)]
      (. builder isMultiRegionTrail data))
    (when-let [data (lookup-entry config id :is-organization-trail)]
      (. builder isOrganizationTrail data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (when-let [data (lookup-entry config id :sns-topic-name)]
      (. builder snsTopicName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trail-name)]
      (. builder trailName data))
    (.build builder)))


(defn s3-event-selector-builder
  "The s3-event-selector-builder function buildes out new instances of 
S3EventSelector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `objectPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-prefix` |"
  [stack id config]
  (let [builder (S3EventSelector$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :object-prefix)]
      (. builder objectPrefix data))
    (.build builder)))


(defn trail-builder
  "The trail-builder function buildes out new instances of 
Trail$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `cloudWatchLogGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group` |
| `cloudWatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloud-watch-logs-retention` |
| `enableFileValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-file-validation` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `includeGlobalServiceEvents` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-global-service-events` |
| `insightTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:insight-types` |
| `isMultiRegionTrail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-multi-region-trail` |
| `isOrganizationTrail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-organization-trail` |
| `managementEvents` | software.amazon.awscdk.services.cloudtrail.ReadWriteType | [[cdk.api.services.cloudtrail/read-write-type]] | `:management-events` |
| `orgId` | java.lang.String | [[cdk.support/lookup-entry]] | `:org-id` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
| `sendToCloudWatchLogs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:send-to-cloud-watch-logs` |
| `snsTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:sns-topic` |
| `trailName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trail-name` |"
  [stack id config]
  (let [builder (Trail$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :cloud-watch-log-group)]
      (. builder cloudWatchLogGroup data))
    (when-let [data (retention-days config id :cloud-watch-logs-retention)]
      (. builder cloudWatchLogsRetention data))
    (when-let [data (lookup-entry config id :enable-file-validation)]
      (. builder enableFileValidation data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :include-global-service-events)]
      (. builder includeGlobalServiceEvents data))
    (when-let [data (lookup-entry config id :insight-types)]
      (. builder insightTypes data))
    (when-let [data (lookup-entry config id :is-multi-region-trail)]
      (. builder isMultiRegionTrail data))
    (when-let [data (lookup-entry config id :is-organization-trail)]
      (. builder isOrganizationTrail data))
    (when-let [data (read-write-type config id :management-events)]
      (. builder managementEvents data))
    (when-let [data (lookup-entry config id :org-id)]
      (. builder orgId data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (when-let [data (lookup-entry config id :send-to-cloud-watch-logs)]
      (. builder sendToCloudWatchLogs data))
    (when-let [data (lookup-entry config id :sns-topic)]
      (. builder snsTopic data))
    (when-let [data (lookup-entry config id :trail-name)]
      (. builder trailName data))
    (.build builder)))


(defn trail-props-builder
  "The trail-props-builder function buildes out new instances of 
TrailProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `cloudWatchLogGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group` |
| `cloudWatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloud-watch-logs-retention` |
| `enableFileValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-file-validation` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `includeGlobalServiceEvents` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-global-service-events` |
| `insightTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:insight-types` |
| `isMultiRegionTrail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-multi-region-trail` |
| `isOrganizationTrail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-organization-trail` |
| `managementEvents` | software.amazon.awscdk.services.cloudtrail.ReadWriteType | [[cdk.api.services.cloudtrail/read-write-type]] | `:management-events` |
| `orgId` | java.lang.String | [[cdk.support/lookup-entry]] | `:org-id` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
| `sendToCloudWatchLogs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:send-to-cloud-watch-logs` |
| `snsTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:sns-topic` |
| `trailName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trail-name` |"
  [stack id config]
  (let [builder (TrailProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :cloud-watch-log-group)]
      (. builder cloudWatchLogGroup data))
    (when-let [data (retention-days config id :cloud-watch-logs-retention)]
      (. builder cloudWatchLogsRetention data))
    (when-let [data (lookup-entry config id :enable-file-validation)]
      (. builder enableFileValidation data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :include-global-service-events)]
      (. builder includeGlobalServiceEvents data))
    (when-let [data (lookup-entry config id :insight-types)]
      (. builder insightTypes data))
    (when-let [data (lookup-entry config id :is-multi-region-trail)]
      (. builder isMultiRegionTrail data))
    (when-let [data (lookup-entry config id :is-organization-trail)]
      (. builder isOrganizationTrail data))
    (when-let [data (read-write-type config id :management-events)]
      (. builder managementEvents data))
    (when-let [data (lookup-entry config id :org-id)]
      (. builder orgId data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (when-let [data (lookup-entry config id :send-to-cloud-watch-logs)]
      (. builder sendToCloudWatchLogs data))
    (when-let [data (lookup-entry config id :sns-topic)]
      (. builder snsTopic data))
    (when-let [data (lookup-entry config id :trail-name)]
      (. builder trailName data))
    (.build builder)))