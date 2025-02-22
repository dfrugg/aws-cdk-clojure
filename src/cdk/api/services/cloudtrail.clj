(ns cdk.api.services.cloudtrail
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudtrail package. "
  (:require [cdk.api.services.logs :refer [retention-days]]
            [cdk.support :refer [lookup-entry]])
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


(defn build-add-event-selector-options-builder
  "The build-add-event-selector-options-builder function updates a AddEventSelectorOptions$Builder instance using the provided configuration.
  The function takes the AddEventSelectorOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeManagementEventSources` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-management-event-sources` |
| `includeManagementEvents` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-management-events` |
| `readWriteType` | software.amazon.awscdk.services.cloudtrail.ReadWriteType | [[cdk.api.services.cloudtrail/read-write-type]] | `:read-write-type` |
"
  [^AddEventSelectorOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :exclude-management-event-sources)]
    (. builder excludeManagementEventSources data))
  (when-let [data (lookup-entry config id :include-management-events)]
    (. builder includeManagementEvents data))
  (when-let [data (read-write-type config id :read-write-type)]
    (. builder readWriteType data))
  (.build builder))


(defn build-cfn-channel-builder
  "The build-cfn-channel-builder function updates a CfnChannel$Builder instance using the provided configuration.
  The function takes the CfnChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannel$Builder builder id config]
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-channel-destination-property-builder
  "The build-cfn-channel-destination-property-builder function updates a CfnChannel$DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnChannel$DestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-channel-props-builder
  "The build-cfn-channel-props-builder function updates a CfnChannelProps$Builder instance using the provided configuration.
  The function takes the CfnChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-event-data-store-advanced-event-selector-property-builder
  "The build-cfn-event-data-store-advanced-event-selector-property-builder function updates a CfnEventDataStore$AdvancedEventSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnEventDataStore$AdvancedEventSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-selectors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnEventDataStore$AdvancedEventSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-selectors)]
    (. builder fieldSelectors data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-event-data-store-advanced-field-selector-property-builder
  "The build-cfn-event-data-store-advanced-field-selector-property-builder function updates a CfnEventDataStore$AdvancedFieldSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnEventDataStore$AdvancedFieldSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:ends-with` |
| `equalTo` | java.util.List | [[cdk.support/lookup-entry]] | `:equal-to` |
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `notEndsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:not-ends-with` |
| `notEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:not-equals` |
| `notStartsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:not-starts-with` |
| `startsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:starts-with` |
"
  [^CfnEventDataStore$AdvancedFieldSelectorProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-event-data-store-builder
  "The build-cfn-event-data-store-builder function updates a CfnEventDataStore$Builder instance using the provided configuration.
  The function takes the CfnEventDataStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `terminationProtectionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protection-enabled` |
"
  [^CfnEventDataStore$Builder builder id config]
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
  (.build builder))


(defn build-cfn-event-data-store-insight-selector-property-builder
  "The build-cfn-event-data-store-insight-selector-property-builder function updates a CfnEventDataStore$InsightSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnEventDataStore$InsightSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insightType` | java.lang.String | [[cdk.support/lookup-entry]] | `:insight-type` |
"
  [^CfnEventDataStore$InsightSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :insight-type)]
    (. builder insightType data))
  (.build builder))


(defn build-cfn-event-data-store-props-builder
  "The build-cfn-event-data-store-props-builder function updates a CfnEventDataStoreProps$Builder instance using the provided configuration.
  The function takes the CfnEventDataStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `terminationProtectionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:termination-protection-enabled` |
"
  [^CfnEventDataStoreProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-resource-policy-builder
  "The build-cfn-resource-policy-builder function updates a CfnResourcePolicy$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `resourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:resource-policy` |
"
  [^CfnResourcePolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :resource-policy)]
    (. builder resourcePolicy data))
  (.build builder))


(defn build-cfn-resource-policy-props-builder
  "The build-cfn-resource-policy-props-builder function updates a CfnResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `resourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:resource-policy` |
"
  [^CfnResourcePolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :resource-policy)]
    (. builder resourcePolicy data))
  (.build builder))


(defn build-cfn-trail-advanced-event-selector-property-builder
  "The build-cfn-trail-advanced-event-selector-property-builder function updates a CfnTrail$AdvancedEventSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnTrail$AdvancedEventSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldSelectors` | java.util.List | [[cdk.support/lookup-entry]] | `:field-selectors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnTrail$AdvancedEventSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-selectors)]
    (. builder fieldSelectors data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-trail-advanced-field-selector-property-builder
  "The build-cfn-trail-advanced-field-selector-property-builder function updates a CfnTrail$AdvancedFieldSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnTrail$AdvancedFieldSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:ends-with` |
| `equalTo` | java.util.List | [[cdk.support/lookup-entry]] | `:equal-to` |
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `notEndsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:not-ends-with` |
| `notEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:not-equals` |
| `notStartsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:not-starts-with` |
| `startsWith` | java.util.List | [[cdk.support/lookup-entry]] | `:starts-with` |
"
  [^CfnTrail$AdvancedFieldSelectorProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-trail-builder
  "The build-cfn-trail-builder function updates a CfnTrail$Builder instance using the provided configuration.
  The function takes the CfnTrail$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `trailName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trail-name` |
"
  [^CfnTrail$Builder builder id config]
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
  (.build builder))


(defn build-cfn-trail-data-resource-property-builder
  "The build-cfn-trail-data-resource-property-builder function updates a CfnTrail$DataResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTrail$DataResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnTrail$DataResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-trail-event-selector-property-builder
  "The build-cfn-trail-event-selector-property-builder function updates a CfnTrail$EventSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnTrail$EventSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataResources` | java.util.List | [[cdk.support/lookup-entry]] | `:data-resources` |
| `excludeManagementEventSources` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-management-event-sources` |
| `includeManagementEvents` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-management-events` |
| `readWriteType` | java.lang.String | [[cdk.support/lookup-entry]] | `:read-write-type` |
"
  [^CfnTrail$EventSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-resources)]
    (. builder dataResources data))
  (when-let [data (lookup-entry config id :exclude-management-event-sources)]
    (. builder excludeManagementEventSources data))
  (when-let [data (lookup-entry config id :include-management-events)]
    (. builder includeManagementEvents data))
  (when-let [data (lookup-entry config id :read-write-type)]
    (. builder readWriteType data))
  (.build builder))


(defn build-cfn-trail-insight-selector-property-builder
  "The build-cfn-trail-insight-selector-property-builder function updates a CfnTrail$InsightSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnTrail$InsightSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insightType` | java.lang.String | [[cdk.support/lookup-entry]] | `:insight-type` |
"
  [^CfnTrail$InsightSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :insight-type)]
    (. builder insightType data))
  (.build builder))


(defn build-cfn-trail-props-builder
  "The build-cfn-trail-props-builder function updates a CfnTrailProps$Builder instance using the provided configuration.
  The function takes the CfnTrailProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `trailName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trail-name` |
"
  [^CfnTrailProps$Builder builder id config]
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
  (.build builder))


(defn build-s3-event-selector-builder
  "The build-s3-event-selector-builder function updates a S3EventSelector$Builder instance using the provided configuration.
  The function takes the S3EventSelector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `objectPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-prefix` |
"
  [^S3EventSelector$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :object-prefix)]
    (. builder objectPrefix data))
  (.build builder))


(defn build-trail-builder
  "The build-trail-builder function updates a Trail$Builder instance using the provided configuration.
  The function takes the Trail$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `trailName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trail-name` |
"
  [^Trail$Builder builder id config]
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
  (.build builder))


(defn build-trail-props-builder
  "The build-trail-props-builder function updates a TrailProps$Builder instance using the provided configuration.
  The function takes the TrailProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `trailName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trail-name` |
"
  [^TrailProps$Builder builder id config]
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
  (.build builder))