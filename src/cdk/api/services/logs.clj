(ns cdk.api.services.logs
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.logs package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.cloudwatch :refer [unit]]
            [cdk.api :refer [removal-policy]])
  (:import [software.amazon.awscdk.services.logs CfnAccountPolicy$Builder
                                                 CfnAccountPolicyProps$Builder
                                                 CfnDelivery$Builder
                                                 CfnDeliveryDestination$Builder
                                                 CfnDeliveryDestinationProps$Builder
                                                 CfnDeliveryProps$Builder
                                                 CfnDeliverySource$Builder
                                                 CfnDeliverySourceProps$Builder
                                                 CfnDestination$Builder
                                                 CfnDestinationProps$Builder
                                                 CfnLogAnomalyDetector$Builder
                                                 CfnLogAnomalyDetectorProps$Builder
                                                 CfnLogGroup$Builder
                                                 CfnLogGroupProps$Builder
                                                 CfnLogStream$Builder
                                                 CfnLogStreamProps$Builder
                                                 CfnMetricFilter$Builder
                                                 CfnMetricFilter$DimensionProperty$Builder
                                                 CfnMetricFilter$MetricTransformationProperty$Builder
                                                 CfnMetricFilterProps$Builder
                                                 CfnQueryDefinition$Builder
                                                 CfnQueryDefinitionProps$Builder
                                                 CfnResourcePolicy$Builder
                                                 CfnResourcePolicyProps$Builder
                                                 CfnSubscriptionFilter$Builder
                                                 CfnSubscriptionFilterProps$Builder
                                                 ColumnRestriction$Builder
                                                 CrossAccountDestination$Builder
                                                 CrossAccountDestinationProps$Builder
                                                 DataProtectionPolicy$Builder
                                                 DataProtectionPolicyProps$Builder
                                                 LogGroup$Builder
                                                 LogGroupClass
                                                 LogGroupProps$Builder
                                                 LogRetention$Builder
                                                 LogRetentionProps$Builder
                                                 LogRetentionRetryOptions$Builder
                                                 LogStream$Builder
                                                 LogStreamProps$Builder
                                                 LogSubscriptionDestinationConfig$Builder
                                                 MetricFilter$Builder
                                                 MetricFilterOptions$Builder
                                                 MetricFilterProps$Builder
                                                 QueryDefinition$Builder
                                                 QueryDefinitionProps$Builder
                                                 QueryString$Builder
                                                 QueryStringProps$Builder
                                                 ResourcePolicy$Builder
                                                 ResourcePolicyProps$Builder
                                                 RetentionDays
                                                 StreamOptions$Builder
                                                 SubscriptionFilter$Builder
                                                 SubscriptionFilterOptions$Builder
                                                 SubscriptionFilterProps$Builder]))


(defn log-group-class
  "The `log-group-class` function data interprets values in the provided config data into a 
`LogGroupClass` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LogGroupClass` - the value is returned.
* is `:standard` - `LogGroupClass/STANDARD` is returned
* is `:infrequent-access` - `LogGroupClass/INFREQUENT_ACCESS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LogGroupClass data) data
      (= :standard data) LogGroupClass/STANDARD
      (= :infrequent-access data) LogGroupClass/INFREQUENT_ACCESS)))


(defn retention-days
  "The `retention-days` function data interprets values in the provided config data into a 
`RetentionDays` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RetentionDays` - the value is returned.
* is `:four-months` - `RetentionDays/FOUR_MONTHS` is returned
* is `:seven-years` - `RetentionDays/SEVEN_YEARS` is returned
* is `:ten-years` - `RetentionDays/TEN_YEARS` is returned
* is `:three-years` - `RetentionDays/THREE_YEARS` is returned
* is `:one-year` - `RetentionDays/ONE_YEAR` is returned
* is `:eight-years` - `RetentionDays/EIGHT_YEARS` is returned
* is `:three-days` - `RetentionDays/THREE_DAYS` is returned
* is `:infinite` - `RetentionDays/INFINITE` is returned
* is `:nine-years` - `RetentionDays/NINE_YEARS` is returned
* is `:six-years` - `RetentionDays/SIX_YEARS` is returned
* is `:thirteen-months` - `RetentionDays/THIRTEEN_MONTHS` is returned
* is `:one-week` - `RetentionDays/ONE_WEEK` is returned
* is `:two-months` - `RetentionDays/TWO_MONTHS` is returned
* is `:one-month` - `RetentionDays/ONE_MONTH` is returned
* is `:six-months` - `RetentionDays/SIX_MONTHS` is returned
* is `:two-years` - `RetentionDays/TWO_YEARS` is returned
* is `:two-weeks` - `RetentionDays/TWO_WEEKS` is returned
* is `:three-months` - `RetentionDays/THREE_MONTHS` is returned
* is `:five-years` - `RetentionDays/FIVE_YEARS` is returned
* is `:five-months` - `RetentionDays/FIVE_MONTHS` is returned
* is `:eighteen-months` - `RetentionDays/EIGHTEEN_MONTHS` is returned
* is `:one-day` - `RetentionDays/ONE_DAY` is returned
* is `:five-days` - `RetentionDays/FIVE_DAYS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RetentionDays data) data
      (= :four-months data) RetentionDays/FOUR_MONTHS
      (= :seven-years data) RetentionDays/SEVEN_YEARS
      (= :ten-years data) RetentionDays/TEN_YEARS
      (= :three-years data) RetentionDays/THREE_YEARS
      (= :one-year data) RetentionDays/ONE_YEAR
      (= :eight-years data) RetentionDays/EIGHT_YEARS
      (= :three-days data) RetentionDays/THREE_DAYS
      (= :infinite data) RetentionDays/INFINITE
      (= :nine-years data) RetentionDays/NINE_YEARS
      (= :six-years data) RetentionDays/SIX_YEARS
      (= :thirteen-months data) RetentionDays/THIRTEEN_MONTHS
      (= :one-week data) RetentionDays/ONE_WEEK
      (= :two-months data) RetentionDays/TWO_MONTHS
      (= :one-month data) RetentionDays/ONE_MONTH
      (= :six-months data) RetentionDays/SIX_MONTHS
      (= :two-years data) RetentionDays/TWO_YEARS
      (= :two-weeks data) RetentionDays/TWO_WEEKS
      (= :three-months data) RetentionDays/THREE_MONTHS
      (= :five-years data) RetentionDays/FIVE_YEARS
      (= :five-months data) RetentionDays/FIVE_MONTHS
      (= :eighteen-months data) RetentionDays/EIGHTEEN_MONTHS
      (= :one-day data) RetentionDays/ONE_DAY
      (= :five-days data) RetentionDays/FIVE_DAYS)))


(defn cfn-account-policy-builder
  "The cfn-account-policy-builder function buildes out new instances of 
CfnAccountPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `selectionCriteria` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-criteria` |"
  [stack id config]
  (let [builder (CfnAccountPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :policy-type)]
      (. builder policyType data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :selection-criteria)]
      (. builder selectionCriteria data))
    (.build builder)))


(defn cfn-account-policy-props-builder
  "The cfn-account-policy-props-builder function buildes out new instances of 
CfnAccountPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `selectionCriteria` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-criteria` |"
  [stack id config]
  (let [builder (CfnAccountPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :policy-type)]
      (. builder policyType data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :selection-criteria)]
      (. builder selectionCriteria data))
    (.build builder)))


(defn cfn-delivery-builder
  "The cfn-delivery-builder function buildes out new instances of 
CfnDelivery$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryDestinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-destination-arn` |
| `deliverySourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-source-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDelivery$Builder/create stack id)]
    (when-let [data (lookup-entry config id :delivery-destination-arn)]
      (. builder deliveryDestinationArn data))
    (when-let [data (lookup-entry config id :delivery-source-name)]
      (. builder deliverySourceName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-delivery-destination-builder
  "The cfn-delivery-destination-builder function buildes out new instances of 
CfnDeliveryDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryDestinationPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:delivery-destination-policy` |
| `destinationResourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-resource-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeliveryDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :delivery-destination-policy)]
      (. builder deliveryDestinationPolicy data))
    (when-let [data (lookup-entry config id :destination-resource-arn)]
      (. builder destinationResourceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-delivery-destination-props-builder
  "The cfn-delivery-destination-props-builder function buildes out new instances of 
CfnDeliveryDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryDestinationPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:delivery-destination-policy` |
| `destinationResourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-resource-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeliveryDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :delivery-destination-policy)]
      (. builder deliveryDestinationPolicy data))
    (when-let [data (lookup-entry config id :destination-resource-arn)]
      (. builder destinationResourceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-delivery-props-builder
  "The cfn-delivery-props-builder function buildes out new instances of 
CfnDeliveryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryDestinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-destination-arn` |
| `deliverySourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-source-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeliveryProps$Builder.)]
    (when-let [data (lookup-entry config id :delivery-destination-arn)]
      (. builder deliveryDestinationArn data))
    (when-let [data (lookup-entry config id :delivery-source-name)]
      (. builder deliverySourceName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-delivery-source-builder
  "The cfn-delivery-source-builder function buildes out new instances of 
CfnDeliverySource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeliverySource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-type)]
      (. builder logType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-delivery-source-props-builder
  "The cfn-delivery-source-props-builder function buildes out new instances of 
CfnDeliverySourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeliverySourceProps$Builder.)]
    (when-let [data (lookup-entry config id :log-type)]
      (. builder logType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-destination-builder
  "The cfn-destination-builder function buildes out new instances of 
CfnDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `destinationPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-policy` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-name)]
      (. builder destinationName data))
    (when-let [data (lookup-entry config id :destination-policy)]
      (. builder destinationPolicy data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-destination-props-builder
  "The cfn-destination-props-builder function buildes out new instances of 
CfnDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `destinationPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-policy` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-name)]
      (. builder destinationName data))
    (when-let [data (lookup-entry config id :destination-policy)]
      (. builder destinationPolicy data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-log-anomaly-detector-builder
  "The cfn-log-anomaly-detector-builder function buildes out new instances of 
CfnLogAnomalyDetector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `anomalyVisibilityTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:anomaly-visibility-time` |
| `detectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-name` |
| `evaluationFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-frequency` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logGroupArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-arn-list` |"
  [stack id config]
  (let [builder (CfnLogAnomalyDetector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :anomaly-visibility-time)]
      (. builder anomalyVisibilityTime data))
    (when-let [data (lookup-entry config id :detector-name)]
      (. builder detectorName data))
    (when-let [data (lookup-entry config id :evaluation-frequency)]
      (. builder evaluationFrequency data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :log-group-arn-list)]
      (. builder logGroupArnList data))
    (.build builder)))


(defn cfn-log-anomaly-detector-props-builder
  "The cfn-log-anomaly-detector-props-builder function buildes out new instances of 
CfnLogAnomalyDetectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `anomalyVisibilityTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:anomaly-visibility-time` |
| `detectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-name` |
| `evaluationFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-frequency` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logGroupArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-arn-list` |"
  [stack id config]
  (let [builder (CfnLogAnomalyDetectorProps$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :anomaly-visibility-time)]
      (. builder anomalyVisibilityTime data))
    (when-let [data (lookup-entry config id :detector-name)]
      (. builder detectorName data))
    (when-let [data (lookup-entry config id :evaluation-frequency)]
      (. builder evaluationFrequency data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :log-group-arn-list)]
      (. builder logGroupArnList data))
    (.build builder)))


(defn cfn-log-group-builder
  "The cfn-log-group-builder function buildes out new instances of 
CfnLogGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProtectionPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logGroupClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-class` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `retentionInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-in-days` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLogGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-protection-policy)]
      (. builder dataProtectionPolicy data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :log-group-class)]
      (. builder logGroupClass data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :retention-in-days)]
      (. builder retentionInDays data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-log-group-props-builder
  "The cfn-log-group-props-builder function buildes out new instances of 
CfnLogGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProtectionPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logGroupClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-class` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `retentionInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-in-days` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLogGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :data-protection-policy)]
      (. builder dataProtectionPolicy data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :log-group-class)]
      (. builder logGroupClass data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :retention-in-days)]
      (. builder retentionInDays data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-log-stream-builder
  "The cfn-log-stream-builder function buildes out new instances of 
CfnLogStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |"
  [stack id config]
  (let [builder (CfnLogStream$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-stream-name)]
      (. builder logStreamName data))
    (.build builder)))


(defn cfn-log-stream-props-builder
  "The cfn-log-stream-props-builder function buildes out new instances of 
CfnLogStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |"
  [stack id config]
  (let [builder (CfnLogStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-stream-name)]
      (. builder logStreamName data))
    (.build builder)))


(defn cfn-metric-filter-builder
  "The cfn-metric-filter-builder function buildes out new instances of 
CfnMetricFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `metricTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-transformations` |"
  [stack id config]
  (let [builder (CfnMetricFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :metric-transformations)]
      (. builder metricTransformations data))
    (.build builder)))


(defn cfn-metric-filter-dimension-property-builder
  "The cfn-metric-filter-dimension-property-builder function buildes out new instances of 
CfnMetricFilter$DimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnMetricFilter$DimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-metric-filter-metric-transformation-property-builder
  "The cfn-metric-filter-metric-transformation-property-builder function buildes out new instances of 
CfnMetricFilter$MetricTransformationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-value` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-namespace` |
| `metricValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-value` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnMetricFilter$MetricTransformationProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metric-namespace)]
      (. builder metricNamespace data))
    (when-let [data (lookup-entry config id :metric-value)]
      (. builder metricValue data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-metric-filter-props-builder
  "The cfn-metric-filter-props-builder function buildes out new instances of 
CfnMetricFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `metricTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-transformations` |"
  [stack id config]
  (let [builder (CfnMetricFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :metric-transformations)]
      (. builder metricTransformations data))
    (.build builder)))


(defn cfn-query-definition-builder
  "The cfn-query-definition-builder function buildes out new instances of 
CfnQueryDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-names` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |"
  [stack id config]
  (let [builder (CfnQueryDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-group-names)]
      (. builder logGroupNames data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (.build builder)))


(defn cfn-query-definition-props-builder
  "The cfn-query-definition-props-builder function buildes out new instances of 
CfnQueryDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-names` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |"
  [stack id config]
  (let [builder (CfnQueryDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :log-group-names)]
      (. builder logGroupNames data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (.build builder)))


(defn cfn-resource-policy-builder
  "The cfn-resource-policy-builder function buildes out new instances of 
CfnResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-resource-policy-props-builder
  "The cfn-resource-policy-props-builder function buildes out new instances of 
CfnResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-subscription-filter-builder
  "The cfn-subscription-filter-builder function buildes out new instances of 
CfnSubscriptionFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `distribution` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnSubscriptionFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :distribution)]
      (. builder distribution data))
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-subscription-filter-props-builder
  "The cfn-subscription-filter-props-builder function buildes out new instances of 
CfnSubscriptionFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `distribution` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnSubscriptionFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :distribution)]
      (. builder distribution data))
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn column-restriction-builder
  "The column-restriction-builder function buildes out new instances of 
ColumnRestriction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `numberValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (ColumnRestriction$Builder.)]
    (when-let [data (lookup-entry config id :comparison)]
      (. builder comparison data))
    (when-let [data (lookup-entry config id :number-value)]
      (. builder numberValue data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cross-account-destination-builder
  "The cross-account-destination-builder function buildes out new instances of 
CrossAccountDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CrossAccountDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-name)]
      (. builder destinationName data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cross-account-destination-props-builder
  "The cross-account-destination-props-builder function buildes out new instances of 
CrossAccountDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CrossAccountDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-name)]
      (. builder destinationName data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn data-protection-policy-builder
  "The data-protection-policy-builder function buildes out new instances of 
DataProtectionPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamNameAuditDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name-audit-destination` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `logGroupAuditDestination` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group-audit-destination` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3BucketAuditDestination` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket-audit-destination` |"
  [stack id config]
  (let [builder (DataProtectionPolicy$Builder/create)]
    (when-let [data (lookup-entry config id :delivery-stream-name-audit-destination)]
      (. builder deliveryStreamNameAuditDestination data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :identifiers)]
      (. builder identifiers data))
    (when-let [data (lookup-entry config id :log-group-audit-destination)]
      (. builder logGroupAuditDestination data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :s3-bucket-audit-destination)]
      (. builder s3BucketAuditDestination data))
    (.build builder)))


(defn data-protection-policy-props-builder
  "The data-protection-policy-props-builder function buildes out new instances of 
DataProtectionPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamNameAuditDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name-audit-destination` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `logGroupAuditDestination` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group-audit-destination` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3BucketAuditDestination` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket-audit-destination` |"
  [stack id config]
  (let [builder (DataProtectionPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream-name-audit-destination)]
      (. builder deliveryStreamNameAuditDestination data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :identifiers)]
      (. builder identifiers data))
    (when-let [data (lookup-entry config id :log-group-audit-destination)]
      (. builder logGroupAuditDestination data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :s3-bucket-audit-destination)]
      (. builder s3BucketAuditDestination data))
    (.build builder)))


(defn log-group-builder
  "The log-group-builder function buildes out new instances of 
LogGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProtectionPolicy` | software.amazon.awscdk.services.logs.DataProtectionPolicy | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `logGroupClass` | software.amazon.awscdk.services.logs.LogGroupClass | [[cdk.api.services.logs/log-group-class]] | `:log-group-class` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |"
  [stack id config]
  (let [builder (LogGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-protection-policy)]
      (. builder dataProtectionPolicy data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (log-group-class config id :log-group-class)]
      (. builder logGroupClass data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (retention-days config id :retention)]
      (. builder retention data))
    (.build builder)))


(defn log-group-props-builder
  "The log-group-props-builder function buildes out new instances of 
LogGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProtectionPolicy` | software.amazon.awscdk.services.logs.DataProtectionPolicy | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `logGroupClass` | software.amazon.awscdk.services.logs.LogGroupClass | [[cdk.api.services.logs/log-group-class]] | `:log-group-class` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |"
  [stack id config]
  (let [builder (LogGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :data-protection-policy)]
      (. builder dataProtectionPolicy data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (log-group-class config id :log-group-class)]
      (. builder logGroupClass data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (retention-days config id :retention)]
      (. builder retention data))
    (.build builder)))


(defn log-retention-builder
  "The log-retention-builder function buildes out new instances of 
LogRetention$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logGroupRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-region` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.logs.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (LogRetention$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-group-region)]
      (. builder logGroupRegion data))
    (when-let [data (lookup-entry config id :log-retention-retry-options)]
      (. builder logRetentionRetryOptions data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (retention-days config id :retention)]
      (. builder retention data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn log-retention-props-builder
  "The log-retention-props-builder function buildes out new instances of 
LogRetentionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logGroupRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-region` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.logs.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (LogRetentionProps$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-group-region)]
      (. builder logGroupRegion data))
    (when-let [data (lookup-entry config id :log-retention-retry-options)]
      (. builder logRetentionRetryOptions data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (retention-days config id :retention)]
      (. builder retention data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn log-retention-retry-options-builder
  "The log-retention-retry-options-builder function buildes out new instances of 
LogRetentionRetryOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:base` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |"
  [stack id config]
  (let [builder (LogRetentionRetryOptions$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (.build builder)))


(defn log-stream-builder
  "The log-stream-builder function buildes out new instances of 
LogStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (LogStream$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :log-stream-name)]
      (. builder logStreamName data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn log-stream-props-builder
  "The log-stream-props-builder function buildes out new instances of 
LogStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (LogStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :log-stream-name)]
      (. builder logStreamName data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn log-subscription-destination-config-builder
  "The log-subscription-destination-config-builder function buildes out new instances of 
LogSubscriptionDestinationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (LogSubscriptionDestinationConfig$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn metric-filter-builder
  "The metric-filter-builder function buildes out new instances of 
MetricFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-value` |
| `dimensions` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-namespace` |
| `metricValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-value` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (MetricFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metric-namespace)]
      (. builder metricNamespace data))
    (when-let [data (lookup-entry config id :metric-value)]
      (. builder metricValue data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn metric-filter-options-builder
  "The metric-filter-options-builder function buildes out new instances of 
MetricFilterOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-value` |
| `dimensions` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-namespace` |
| `metricValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-value` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (MetricFilterOptions$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metric-namespace)]
      (. builder metricNamespace data))
    (when-let [data (lookup-entry config id :metric-value)]
      (. builder metricValue data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn metric-filter-props-builder
  "The metric-filter-props-builder function buildes out new instances of 
MetricFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-value` |
| `dimensions` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-namespace` |
| `metricValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-value` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (MetricFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metric-namespace)]
      (. builder metricNamespace data))
    (when-let [data (lookup-entry config id :metric-value)]
      (. builder metricValue data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn query-definition-builder
  "The query-definition-builder function buildes out new instances of 
QueryDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:log-groups` |
| `queryDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-definition-name` |
| `queryString` | software.amazon.awscdk.services.logs.QueryString | [[cdk.support/lookup-entry]] | `:query-string` |"
  [stack id config]
  (let [builder (QueryDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-groups)]
      (. builder logGroups data))
    (when-let [data (lookup-entry config id :query-definition-name)]
      (. builder queryDefinitionName data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (.build builder)))


(defn query-definition-props-builder
  "The query-definition-props-builder function buildes out new instances of 
QueryDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:log-groups` |
| `queryDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-definition-name` |
| `queryString` | software.amazon.awscdk.services.logs.QueryString | [[cdk.support/lookup-entry]] | `:query-string` |"
  [stack id config]
  (let [builder (QueryDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :log-groups)]
      (. builder logGroups data))
    (when-let [data (lookup-entry config id :query-definition-name)]
      (. builder queryDefinitionName data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (.build builder)))


(defn query-string-builder
  "The query-string-builder function buildes out new instances of 
QueryString$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `display` | java.lang.String | [[cdk.support/lookup-entry]] | `:display` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `filter` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter` |
| `filterStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:filter-statements` |
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `parse` | java.lang.String | [[cdk.support/lookup-entry]] | `:parse` |
| `parseStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:parse-statements` |
| `sort` | java.lang.String | [[cdk.support/lookup-entry]] | `:sort` |
| `stats` | java.lang.String | [[cdk.support/lookup-entry]] | `:stats` |"
  [stack id config]
  (let [builder (QueryString$Builder/create)]
    (when-let [data (lookup-entry config id :display)]
      (. builder display data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (when-let [data (lookup-entry config id :filter-statements)]
      (. builder filterStatements data))
    (when-let [data (lookup-entry config id :limit)]
      (. builder limit data))
    (when-let [data (lookup-entry config id :parse)]
      (. builder parse data))
    (when-let [data (lookup-entry config id :parse-statements)]
      (. builder parseStatements data))
    (when-let [data (lookup-entry config id :sort)]
      (. builder sort data))
    (when-let [data (lookup-entry config id :stats)]
      (. builder stats data))
    (.build builder)))


(defn query-string-props-builder
  "The query-string-props-builder function buildes out new instances of 
QueryStringProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `display` | java.lang.String | [[cdk.support/lookup-entry]] | `:display` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `filter` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter` |
| `filterStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:filter-statements` |
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `parse` | java.lang.String | [[cdk.support/lookup-entry]] | `:parse` |
| `parseStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:parse-statements` |
| `sort` | java.lang.String | [[cdk.support/lookup-entry]] | `:sort` |
| `stats` | java.lang.String | [[cdk.support/lookup-entry]] | `:stats` |"
  [stack id config]
  (let [builder (QueryStringProps$Builder.)]
    (when-let [data (lookup-entry config id :display)]
      (. builder display data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (when-let [data (lookup-entry config id :filter-statements)]
      (. builder filterStatements data))
    (when-let [data (lookup-entry config id :limit)]
      (. builder limit data))
    (when-let [data (lookup-entry config id :parse)]
      (. builder parse data))
    (when-let [data (lookup-entry config id :parse-statements)]
      (. builder parseStatements data))
    (when-let [data (lookup-entry config id :sort)]
      (. builder sort data))
    (when-let [data (lookup-entry config id :stats)]
      (. builder stats data))
    (.build builder)))


(defn resource-policy-builder
  "The resource-policy-builder function buildes out new instances of 
ResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `resourcePolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-policy-name` |"
  [stack id config]
  (let [builder (ResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-statements)]
      (. builder policyStatements data))
    (when-let [data (lookup-entry config id :resource-policy-name)]
      (. builder resourcePolicyName data))
    (.build builder)))


(defn resource-policy-props-builder
  "The resource-policy-props-builder function buildes out new instances of 
ResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `resourcePolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-policy-name` |"
  [stack id config]
  (let [builder (ResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-statements)]
      (. builder policyStatements data))
    (when-let [data (lookup-entry config id :resource-policy-name)]
      (. builder resourcePolicyName data))
    (.build builder)))


(defn stream-options-builder
  "The stream-options-builder function buildes out new instances of 
StreamOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |"
  [stack id config]
  (let [builder (StreamOptions$Builder.)]
    (when-let [data (lookup-entry config id :log-stream-name)]
      (. builder logStreamName data))
    (.build builder)))


(defn subscription-filter-builder
  "The subscription-filter-builder function buildes out new instances of 
SubscriptionFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogSubscriptionDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |"
  [stack id config]
  (let [builder (SubscriptionFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (.build builder)))


(defn subscription-filter-options-builder
  "The subscription-filter-options-builder function buildes out new instances of 
SubscriptionFilterOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogSubscriptionDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |"
  [stack id config]
  (let [builder (SubscriptionFilterOptions$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (.build builder)))


(defn subscription-filter-props-builder
  "The subscription-filter-props-builder function buildes out new instances of 
SubscriptionFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogSubscriptionDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |"
  [stack id config]
  (let [builder (SubscriptionFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :filter-name)]
      (. builder filterName data))
    (when-let [data (lookup-entry config id :filter-pattern)]
      (. builder filterPattern data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (.build builder)))