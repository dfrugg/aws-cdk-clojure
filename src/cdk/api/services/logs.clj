(ns cdk.api.services.logs
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.logs package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.api.services.cloudwatch :refer [unit]]
            [cdk.support :refer [lookup-entry]])
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


(defn cfn-account-policy-builder>
  "The cfn-account-policy-builder> function updates a CfnAccountPolicy$Builder instance using the provided configuration.
  The function takes the CfnAccountPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `selectionCriteria` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-criteria` |
"
  [^CfnAccountPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :policy-type)]
    (. builder policyType data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :selection-criteria)]
    (. builder selectionCriteria data))
  (.build builder))


(defn cfn-account-policy-builder
  "Creates a  `CfnAccountPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-account-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-account-policy-builder> (CfnAccountPolicy$Builder/create scope (name id)) id config))


(defn cfn-account-policy-props-builder>
  "The cfn-account-policy-props-builder> function updates a CfnAccountPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnAccountPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `selectionCriteria` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-criteria` |
"
  [^CfnAccountPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :policy-type)]
    (. builder policyType data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :selection-criteria)]
    (. builder selectionCriteria data))
  (.build builder))


(defn cfn-account-policy-props-builder
  "Creates a  `CfnAccountPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-account-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-account-policy-props-builder> (new CfnAccountPolicyProps$Builder) id config))


(defn cfn-delivery-builder>
  "The cfn-delivery-builder> function updates a CfnDelivery$Builder instance using the provided configuration.
  The function takes the CfnDelivery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryDestinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-destination-arn` |
| `deliverySourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-source-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDelivery$Builder builder id config]
  (when-some [data (lookup-entry config id :delivery-destination-arn)]
    (. builder deliveryDestinationArn data))
  (when-some [data (lookup-entry config id :delivery-source-name)]
    (. builder deliverySourceName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-delivery-builder
  "Creates a  `CfnDelivery$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-delivery-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-delivery-builder> (CfnDelivery$Builder/create scope (name id)) id config))


(defn cfn-delivery-destination-builder>
  "The cfn-delivery-destination-builder> function updates a CfnDeliveryDestination$Builder instance using the provided configuration.
  The function takes the CfnDeliveryDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryDestinationPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:delivery-destination-policy` |
| `destinationResourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-resource-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeliveryDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :delivery-destination-policy)]
    (. builder deliveryDestinationPolicy data))
  (when-some [data (lookup-entry config id :destination-resource-arn)]
    (. builder destinationResourceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-delivery-destination-builder
  "Creates a  `CfnDeliveryDestination$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-delivery-destination-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-delivery-destination-builder> (CfnDeliveryDestination$Builder/create scope (name id)) id config))


(defn cfn-delivery-destination-props-builder>
  "The cfn-delivery-destination-props-builder> function updates a CfnDeliveryDestinationProps$Builder instance using the provided configuration.
  The function takes the CfnDeliveryDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryDestinationPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:delivery-destination-policy` |
| `destinationResourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-resource-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeliveryDestinationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :delivery-destination-policy)]
    (. builder deliveryDestinationPolicy data))
  (when-some [data (lookup-entry config id :destination-resource-arn)]
    (. builder destinationResourceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-delivery-destination-props-builder
  "Creates a  `CfnDeliveryDestinationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-destination-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-destination-props-builder> (new CfnDeliveryDestinationProps$Builder) id config))


(defn cfn-delivery-props-builder>
  "The cfn-delivery-props-builder> function updates a CfnDeliveryProps$Builder instance using the provided configuration.
  The function takes the CfnDeliveryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryDestinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-destination-arn` |
| `deliverySourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-source-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeliveryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :delivery-destination-arn)]
    (. builder deliveryDestinationArn data))
  (when-some [data (lookup-entry config id :delivery-source-name)]
    (. builder deliverySourceName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-delivery-props-builder
  "Creates a  `CfnDeliveryProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-props-builder> (new CfnDeliveryProps$Builder) id config))


(defn cfn-delivery-source-builder>
  "The cfn-delivery-source-builder> function updates a CfnDeliverySource$Builder instance using the provided configuration.
  The function takes the CfnDeliverySource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeliverySource$Builder builder id config]
  (when-some [data (lookup-entry config id :log-type)]
    (. builder logType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-delivery-source-builder
  "Creates a  `CfnDeliverySource$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-delivery-source-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-delivery-source-builder> (CfnDeliverySource$Builder/create scope (name id)) id config))


(defn cfn-delivery-source-props-builder>
  "The cfn-delivery-source-props-builder> function updates a CfnDeliverySourceProps$Builder instance using the provided configuration.
  The function takes the CfnDeliverySourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeliverySourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :log-type)]
    (. builder logType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-delivery-source-props-builder
  "Creates a  `CfnDeliverySourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-source-props-builder> (new CfnDeliverySourceProps$Builder) id config))


(defn cfn-destination-builder>
  "The cfn-destination-builder> function updates a CfnDestination$Builder instance using the provided configuration.
  The function takes the CfnDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `destinationPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-policy` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-name)]
    (. builder destinationName data))
  (when-some [data (lookup-entry config id :destination-policy)]
    (. builder destinationPolicy data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-destination-builder
  "Creates a  `CfnDestination$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-destination-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-destination-builder> (CfnDestination$Builder/create scope (name id)) id config))


(defn cfn-destination-props-builder>
  "The cfn-destination-props-builder> function updates a CfnDestinationProps$Builder instance using the provided configuration.
  The function takes the CfnDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `destinationPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-policy` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnDestinationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-name)]
    (. builder destinationName data))
  (when-some [data (lookup-entry config id :destination-policy)]
    (. builder destinationPolicy data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-destination-props-builder
  "Creates a  `CfnDestinationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-destination-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-destination-props-builder> (new CfnDestinationProps$Builder) id config))


(defn cfn-log-anomaly-detector-builder>
  "The cfn-log-anomaly-detector-builder> function updates a CfnLogAnomalyDetector$Builder instance using the provided configuration.
  The function takes the CfnLogAnomalyDetector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `anomalyVisibilityTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:anomaly-visibility-time` |
| `detectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-name` |
| `evaluationFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-frequency` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logGroupArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-arn-list` |
"
  [^CfnLogAnomalyDetector$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :anomaly-visibility-time)]
    (. builder anomalyVisibilityTime data))
  (when-some [data (lookup-entry config id :detector-name)]
    (. builder detectorName data))
  (when-some [data (lookup-entry config id :evaluation-frequency)]
    (. builder evaluationFrequency data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :log-group-arn-list)]
    (. builder logGroupArnList data))
  (.build builder))


(defn cfn-log-anomaly-detector-builder
  "Creates a  `CfnLogAnomalyDetector$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-log-anomaly-detector-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-log-anomaly-detector-builder> (CfnLogAnomalyDetector$Builder/create scope (name id)) id config))


(defn cfn-log-anomaly-detector-props-builder>
  "The cfn-log-anomaly-detector-props-builder> function updates a CfnLogAnomalyDetectorProps$Builder instance using the provided configuration.
  The function takes the CfnLogAnomalyDetectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `anomalyVisibilityTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:anomaly-visibility-time` |
| `detectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-name` |
| `evaluationFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-frequency` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logGroupArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-arn-list` |
"
  [^CfnLogAnomalyDetectorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :anomaly-visibility-time)]
    (. builder anomalyVisibilityTime data))
  (when-some [data (lookup-entry config id :detector-name)]
    (. builder detectorName data))
  (when-some [data (lookup-entry config id :evaluation-frequency)]
    (. builder evaluationFrequency data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :log-group-arn-list)]
    (. builder logGroupArnList data))
  (.build builder))


(defn cfn-log-anomaly-detector-props-builder
  "Creates a  `CfnLogAnomalyDetectorProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-log-anomaly-detector-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-log-anomaly-detector-props-builder> (new CfnLogAnomalyDetectorProps$Builder) id config))


(defn cfn-log-group-builder>
  "The cfn-log-group-builder> function updates a CfnLogGroup$Builder instance using the provided configuration.
  The function takes the CfnLogGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProtectionPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logGroupClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-class` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `retentionInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-in-days` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLogGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :data-protection-policy)]
    (. builder dataProtectionPolicy data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :log-group-class)]
    (. builder logGroupClass data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :retention-in-days)]
    (. builder retentionInDays data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-log-group-builder
  "Creates a  `CfnLogGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-log-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-log-group-builder> (CfnLogGroup$Builder/create scope (name id)) id config))


(defn cfn-log-group-props-builder>
  "The cfn-log-group-props-builder> function updates a CfnLogGroupProps$Builder instance using the provided configuration.
  The function takes the CfnLogGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProtectionPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logGroupClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-class` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `retentionInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-in-days` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLogGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-protection-policy)]
    (. builder dataProtectionPolicy data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :log-group-class)]
    (. builder logGroupClass data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :retention-in-days)]
    (. builder retentionInDays data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-log-group-props-builder
  "Creates a  `CfnLogGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-log-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-log-group-props-builder> (new CfnLogGroupProps$Builder) id config))


(defn cfn-log-stream-builder>
  "The cfn-log-stream-builder> function updates a CfnLogStream$Builder instance using the provided configuration.
  The function takes the CfnLogStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
"
  [^CfnLogStream$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-stream-name)]
    (. builder logStreamName data))
  (.build builder))


(defn cfn-log-stream-builder
  "Creates a  `CfnLogStream$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-log-stream-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-log-stream-builder> (CfnLogStream$Builder/create scope (name id)) id config))


(defn cfn-log-stream-props-builder>
  "The cfn-log-stream-props-builder> function updates a CfnLogStreamProps$Builder instance using the provided configuration.
  The function takes the CfnLogStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
"
  [^CfnLogStreamProps$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-stream-name)]
    (. builder logStreamName data))
  (.build builder))


(defn cfn-log-stream-props-builder
  "Creates a  `CfnLogStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-log-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-log-stream-props-builder> (new CfnLogStreamProps$Builder) id config))


(defn cfn-metric-filter-builder>
  "The cfn-metric-filter-builder> function updates a CfnMetricFilter$Builder instance using the provided configuration.
  The function takes the CfnMetricFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `metricTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-transformations` |
"
  [^CfnMetricFilter$Builder builder id config]
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :metric-transformations)]
    (. builder metricTransformations data))
  (.build builder))


(defn cfn-metric-filter-builder
  "Creates a  `CfnMetricFilter$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-metric-filter-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-metric-filter-builder> (CfnMetricFilter$Builder/create scope (name id)) id config))


(defn cfn-metric-filter-dimension-property-builder>
  "The cfn-metric-filter-dimension-property-builder> function updates a CfnMetricFilter$DimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnMetricFilter$DimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnMetricFilter$DimensionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-metric-filter-dimension-property-builder
  "Creates a  `CfnMetricFilter$DimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-metric-filter-dimension-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-metric-filter-dimension-property-builder> (new CfnMetricFilter$DimensionProperty$Builder) id config))


(defn cfn-metric-filter-metric-transformation-property-builder>
  "The cfn-metric-filter-metric-transformation-property-builder> function updates a CfnMetricFilter$MetricTransformationProperty$Builder instance using the provided configuration.
  The function takes the CfnMetricFilter$MetricTransformationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-value` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-namespace` |
| `metricValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-value` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnMetricFilter$MetricTransformationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metric-namespace)]
    (. builder metricNamespace data))
  (when-some [data (lookup-entry config id :metric-value)]
    (. builder metricValue data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-metric-filter-metric-transformation-property-builder
  "Creates a  `CfnMetricFilter$MetricTransformationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-metric-filter-metric-transformation-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-metric-filter-metric-transformation-property-builder> (new CfnMetricFilter$MetricTransformationProperty$Builder) id config))


(defn cfn-metric-filter-props-builder>
  "The cfn-metric-filter-props-builder> function updates a CfnMetricFilterProps$Builder instance using the provided configuration.
  The function takes the CfnMetricFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `metricTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-transformations` |
"
  [^CfnMetricFilterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :metric-transformations)]
    (. builder metricTransformations data))
  (.build builder))


(defn cfn-metric-filter-props-builder
  "Creates a  `CfnMetricFilterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-metric-filter-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-metric-filter-props-builder> (new CfnMetricFilterProps$Builder) id config))


(defn cfn-query-definition-builder>
  "The cfn-query-definition-builder> function updates a CfnQueryDefinition$Builder instance using the provided configuration.
  The function takes the CfnQueryDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-names` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
"
  [^CfnQueryDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-names)]
    (. builder logGroupNames data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (.build builder))


(defn cfn-query-definition-builder
  "Creates a  `CfnQueryDefinition$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-query-definition-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-query-definition-builder> (CfnQueryDefinition$Builder/create scope (name id)) id config))


(defn cfn-query-definition-props-builder>
  "The cfn-query-definition-props-builder> function updates a CfnQueryDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnQueryDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:log-group-names` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
"
  [^CfnQueryDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-names)]
    (. builder logGroupNames data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (.build builder))


(defn cfn-query-definition-props-builder
  "Creates a  `CfnQueryDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-query-definition-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-query-definition-props-builder> (new CfnQueryDefinitionProps$Builder) id config))


(defn cfn-resource-policy-builder>
  "The cfn-resource-policy-builder> function updates a CfnResourcePolicy$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnResourcePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-resource-policy-builder
  "Creates a  `CfnResourcePolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-resource-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-policy-builder> (CfnResourcePolicy$Builder/create scope (name id)) id config))


(defn cfn-resource-policy-props-builder>
  "The cfn-resource-policy-props-builder> function updates a CfnResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnResourcePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-resource-policy-props-builder
  "Creates a  `CfnResourcePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-policy-props-builder> (new CfnResourcePolicyProps$Builder) id config))


(defn cfn-subscription-filter-builder>
  "The cfn-subscription-filter-builder> function updates a CfnSubscriptionFilter$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `distribution` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnSubscriptionFilter$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-some [data (lookup-entry config id :distribution)]
    (. builder distribution data))
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-subscription-filter-builder
  "Creates a  `CfnSubscriptionFilter$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-subscription-filter-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-subscription-filter-builder> (CfnSubscriptionFilter$Builder/create scope (name id)) id config))


(defn cfn-subscription-filter-props-builder>
  "The cfn-subscription-filter-props-builder> function updates a CfnSubscriptionFilterProps$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `distribution` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnSubscriptionFilterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-some [data (lookup-entry config id :distribution)]
    (. builder distribution data))
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-subscription-filter-props-builder
  "Creates a  `CfnSubscriptionFilterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-subscription-filter-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-subscription-filter-props-builder> (new CfnSubscriptionFilterProps$Builder) id config))


(defn column-restriction-builder>
  "The column-restriction-builder> function updates a ColumnRestriction$Builder instance using the provided configuration.
  The function takes the ColumnRestriction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `numberValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^ColumnRestriction$Builder builder id config]
  (when-some [data (lookup-entry config id :comparison)]
    (. builder comparison data))
  (when-some [data (lookup-entry config id :number-value)]
    (. builder numberValue data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn column-restriction-builder
  "Creates a  `ColumnRestriction$Builder` instance using a no-argument constructor, applies the data configuration using the [[column-restriction-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (column-restriction-builder> (new ColumnRestriction$Builder) id config))


(defn cross-account-destination-builder>
  "The cross-account-destination-builder> function updates a CrossAccountDestination$Builder instance using the provided configuration.
  The function takes the CrossAccountDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CrossAccountDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-name)]
    (. builder destinationName data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cross-account-destination-builder
  "Creates a  `CrossAccountDestination$Builder` instance using a scope and ID, applies the data configuration using the [[cross-account-destination-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cross-account-destination-builder> (CrossAccountDestination$Builder/create scope (name id)) id config))


(defn cross-account-destination-props-builder>
  "The cross-account-destination-props-builder> function updates a CrossAccountDestinationProps$Builder instance using the provided configuration.
  The function takes the CrossAccountDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CrossAccountDestinationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-name)]
    (. builder destinationName data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cross-account-destination-props-builder
  "Creates a  `CrossAccountDestinationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cross-account-destination-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cross-account-destination-props-builder> (new CrossAccountDestinationProps$Builder) id config))


(defn data-protection-policy-builder>
  "The data-protection-policy-builder> function updates a DataProtectionPolicy$Builder instance using the provided configuration.
  The function takes the DataProtectionPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamNameAuditDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name-audit-destination` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `logGroupAuditDestination` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group-audit-destination` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3BucketAuditDestination` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket-audit-destination` |
"
  [^DataProtectionPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :delivery-stream-name-audit-destination)]
    (. builder deliveryStreamNameAuditDestination data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :identifiers)]
    (. builder identifiers data))
  (when-some [data (lookup-entry config id :log-group-audit-destination)]
    (. builder logGroupAuditDestination data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :s3-bucket-audit-destination)]
    (. builder s3BucketAuditDestination data))
  (.build builder))


(defn data-protection-policy-builder
  "Creates a  `DataProtectionPolicy$Builder` instance using a no-argument create, applies the data configuration using the [[data-protection-policy-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (data-protection-policy-builder> (DataProtectionPolicy$Builder/create) id config))


(defn data-protection-policy-props-builder>
  "The data-protection-policy-props-builder> function updates a DataProtectionPolicyProps$Builder instance using the provided configuration.
  The function takes the DataProtectionPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamNameAuditDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name-audit-destination` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `logGroupAuditDestination` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group-audit-destination` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3BucketAuditDestination` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket-audit-destination` |
"
  [^DataProtectionPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :delivery-stream-name-audit-destination)]
    (. builder deliveryStreamNameAuditDestination data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :identifiers)]
    (. builder identifiers data))
  (when-some [data (lookup-entry config id :log-group-audit-destination)]
    (. builder logGroupAuditDestination data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :s3-bucket-audit-destination)]
    (. builder s3BucketAuditDestination data))
  (.build builder))


(defn data-protection-policy-props-builder
  "Creates a  `DataProtectionPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[data-protection-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (data-protection-policy-props-builder> (new DataProtectionPolicyProps$Builder) id config))


(defn log-group-builder>
  "The log-group-builder> function updates a LogGroup$Builder instance using the provided configuration.
  The function takes the LogGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProtectionPolicy` | software.amazon.awscdk.services.logs.DataProtectionPolicy | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `logGroupClass` | software.amazon.awscdk.services.logs.LogGroupClass | [[cdk.api.services.logs/log-group-class]] | `:log-group-class` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |
"
  [^LogGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :data-protection-policy)]
    (. builder dataProtectionPolicy data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (log-group-class config id :log-group-class)]
    (. builder logGroupClass data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (retention-days config id :retention)]
    (. builder retention data))
  (.build builder))


(defn log-group-builder
  "Creates a  `LogGroup$Builder` instance using a scope and ID, applies the data configuration using the [[log-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (log-group-builder> (LogGroup$Builder/create scope (name id)) id config))


(defn log-group-props-builder>
  "The log-group-props-builder> function updates a LogGroupProps$Builder instance using the provided configuration.
  The function takes the LogGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProtectionPolicy` | software.amazon.awscdk.services.logs.DataProtectionPolicy | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `logGroupClass` | software.amazon.awscdk.services.logs.LogGroupClass | [[cdk.api.services.logs/log-group-class]] | `:log-group-class` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |
"
  [^LogGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-protection-policy)]
    (. builder dataProtectionPolicy data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (log-group-class config id :log-group-class)]
    (. builder logGroupClass data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (retention-days config id :retention)]
    (. builder retention data))
  (.build builder))


(defn log-group-props-builder
  "Creates a  `LogGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[log-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-group-props-builder> (new LogGroupProps$Builder) id config))


(defn log-retention-builder>
  "The log-retention-builder> function updates a LogRetention$Builder instance using the provided configuration.
  The function takes the LogRetention$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logGroupRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-region` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.logs.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^LogRetention$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-group-region)]
    (. builder logGroupRegion data))
  (when-some [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (retention-days config id :retention)]
    (. builder retention data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn log-retention-builder
  "Creates a  `LogRetention$Builder` instance using a scope and ID, applies the data configuration using the [[log-retention-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (log-retention-builder> (LogRetention$Builder/create scope (name id)) id config))


(defn log-retention-props-builder>
  "The log-retention-props-builder> function updates a LogRetentionProps$Builder instance using the provided configuration.
  The function takes the LogRetentionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logGroupRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-region` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.logs.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^LogRetentionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-group-region)]
    (. builder logGroupRegion data))
  (when-some [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (retention-days config id :retention)]
    (. builder retention data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn log-retention-props-builder
  "Creates a  `LogRetentionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[log-retention-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-retention-props-builder> (new LogRetentionProps$Builder) id config))


(defn log-retention-retry-options-builder>
  "The log-retention-retry-options-builder> function updates a LogRetentionRetryOptions$Builder instance using the provided configuration.
  The function takes the LogRetentionRetryOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:base` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
"
  [^LogRetentionRetryOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :base)]
    (. builder base data))
  (when-some [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (.build builder))


(defn log-retention-retry-options-builder
  "Creates a  `LogRetentionRetryOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[log-retention-retry-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-retention-retry-options-builder> (new LogRetentionRetryOptions$Builder) id config))


(defn log-stream-builder>
  "The log-stream-builder> function updates a LogStream$Builder instance using the provided configuration.
  The function takes the LogStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^LogStream$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-some [data (lookup-entry config id :log-stream-name)]
    (. builder logStreamName data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn log-stream-builder
  "Creates a  `LogStream$Builder` instance using a scope and ID, applies the data configuration using the [[log-stream-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (log-stream-builder> (LogStream$Builder/create scope (name id)) id config))


(defn log-stream-props-builder>
  "The log-stream-props-builder> function updates a LogStreamProps$Builder instance using the provided configuration.
  The function takes the LogStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^LogStreamProps$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-some [data (lookup-entry config id :log-stream-name)]
    (. builder logStreamName data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn log-stream-props-builder
  "Creates a  `LogStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[log-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-stream-props-builder> (new LogStreamProps$Builder) id config))


(defn log-subscription-destination-config-builder>
  "The log-subscription-destination-config-builder> function updates a LogSubscriptionDestinationConfig$Builder instance using the provided configuration.
  The function takes the LogSubscriptionDestinationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^LogSubscriptionDestinationConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn log-subscription-destination-config-builder
  "Creates a  `LogSubscriptionDestinationConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[log-subscription-destination-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-subscription-destination-config-builder> (new LogSubscriptionDestinationConfig$Builder) id config))


(defn metric-filter-builder>
  "The metric-filter-builder> function updates a MetricFilter$Builder instance using the provided configuration.
  The function takes the MetricFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |
"
  [^MetricFilter$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metric-namespace)]
    (. builder metricNamespace data))
  (when-some [data (lookup-entry config id :metric-value)]
    (. builder metricValue data))
  (when-some [data (unit config id :unit)]
    (. builder unit data))
  (.build builder))


(defn metric-filter-builder
  "Creates a  `MetricFilter$Builder` instance using a scope and ID, applies the data configuration using the [[metric-filter-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (metric-filter-builder> (MetricFilter$Builder/create scope (name id)) id config))


(defn metric-filter-options-builder>
  "The metric-filter-options-builder> function updates a MetricFilterOptions$Builder instance using the provided configuration.
  The function takes the MetricFilterOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-value` |
| `dimensions` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-namespace` |
| `metricValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-value` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |
"
  [^MetricFilterOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metric-namespace)]
    (. builder metricNamespace data))
  (when-some [data (lookup-entry config id :metric-value)]
    (. builder metricValue data))
  (when-some [data (unit config id :unit)]
    (. builder unit data))
  (.build builder))


(defn metric-filter-options-builder
  "Creates a  `MetricFilterOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[metric-filter-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-filter-options-builder> (new MetricFilterOptions$Builder) id config))


(defn metric-filter-props-builder>
  "The metric-filter-props-builder> function updates a MetricFilterProps$Builder instance using the provided configuration.
  The function takes the MetricFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |
"
  [^MetricFilterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metric-namespace)]
    (. builder metricNamespace data))
  (when-some [data (lookup-entry config id :metric-value)]
    (. builder metricValue data))
  (when-some [data (unit config id :unit)]
    (. builder unit data))
  (.build builder))


(defn metric-filter-props-builder
  "Creates a  `MetricFilterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[metric-filter-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (metric-filter-props-builder> (new MetricFilterProps$Builder) id config))


(defn query-definition-builder>
  "The query-definition-builder> function updates a QueryDefinition$Builder instance using the provided configuration.
  The function takes the QueryDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:log-groups` |
| `queryDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-definition-name` |
| `queryString` | software.amazon.awscdk.services.logs.QueryString | [[cdk.support/lookup-entry]] | `:query-string` |
"
  [^QueryDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :log-groups)]
    (. builder logGroups data))
  (when-some [data (lookup-entry config id :query-definition-name)]
    (. builder queryDefinitionName data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (.build builder))


(defn query-definition-builder
  "Creates a  `QueryDefinition$Builder` instance using a scope and ID, applies the data configuration using the [[query-definition-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (query-definition-builder> (QueryDefinition$Builder/create scope (name id)) id config))


(defn query-definition-props-builder>
  "The query-definition-props-builder> function updates a QueryDefinitionProps$Builder instance using the provided configuration.
  The function takes the QueryDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:log-groups` |
| `queryDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-definition-name` |
| `queryString` | software.amazon.awscdk.services.logs.QueryString | [[cdk.support/lookup-entry]] | `:query-string` |
"
  [^QueryDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :log-groups)]
    (. builder logGroups data))
  (when-some [data (lookup-entry config id :query-definition-name)]
    (. builder queryDefinitionName data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (.build builder))


(defn query-definition-props-builder
  "Creates a  `QueryDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[query-definition-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (query-definition-props-builder> (new QueryDefinitionProps$Builder) id config))


(defn query-string-builder>
  "The query-string-builder> function updates a QueryString$Builder instance using the provided configuration.
  The function takes the QueryString$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `stats` | java.lang.String | [[cdk.support/lookup-entry]] | `:stats` |
"
  [^QueryString$Builder builder id config]
  (when-some [data (lookup-entry config id :display)]
    (. builder display data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-some [data (lookup-entry config id :filter-statements)]
    (. builder filterStatements data))
  (when-some [data (lookup-entry config id :limit)]
    (. builder limit data))
  (when-some [data (lookup-entry config id :parse)]
    (. builder parse data))
  (when-some [data (lookup-entry config id :parse-statements)]
    (. builder parseStatements data))
  (when-some [data (lookup-entry config id :sort)]
    (. builder sort data))
  (when-some [data (lookup-entry config id :stats)]
    (. builder stats data))
  (.build builder))


(defn query-string-builder
  "Creates a  `QueryString$Builder` instance using a no-argument create, applies the data configuration using the [[query-string-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (query-string-builder> (QueryString$Builder/create) id config))


(defn query-string-props-builder>
  "The query-string-props-builder> function updates a QueryStringProps$Builder instance using the provided configuration.
  The function takes the QueryStringProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `stats` | java.lang.String | [[cdk.support/lookup-entry]] | `:stats` |
"
  [^QueryStringProps$Builder builder id config]
  (when-some [data (lookup-entry config id :display)]
    (. builder display data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-some [data (lookup-entry config id :filter-statements)]
    (. builder filterStatements data))
  (when-some [data (lookup-entry config id :limit)]
    (. builder limit data))
  (when-some [data (lookup-entry config id :parse)]
    (. builder parse data))
  (when-some [data (lookup-entry config id :parse-statements)]
    (. builder parseStatements data))
  (when-some [data (lookup-entry config id :sort)]
    (. builder sort data))
  (when-some [data (lookup-entry config id :stats)]
    (. builder stats data))
  (.build builder))


(defn query-string-props-builder
  "Creates a  `QueryStringProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[query-string-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (query-string-props-builder> (new QueryStringProps$Builder) id config))


(defn resource-policy-builder>
  "The resource-policy-builder> function updates a ResourcePolicy$Builder instance using the provided configuration.
  The function takes the ResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `resourcePolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-policy-name` |
"
  [^ResourcePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-statements)]
    (. builder policyStatements data))
  (when-some [data (lookup-entry config id :resource-policy-name)]
    (. builder resourcePolicyName data))
  (.build builder))


(defn resource-policy-builder
  "Creates a  `ResourcePolicy$Builder` instance using a scope and ID, applies the data configuration using the [[resource-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (resource-policy-builder> (ResourcePolicy$Builder/create scope (name id)) id config))


(defn resource-policy-props-builder>
  "The resource-policy-props-builder> function updates a ResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the ResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-statements` |
| `resourcePolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-policy-name` |
"
  [^ResourcePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-statements)]
    (. builder policyStatements data))
  (when-some [data (lookup-entry config id :resource-policy-name)]
    (. builder resourcePolicyName data))
  (.build builder))


(defn resource-policy-props-builder
  "Creates a  `ResourcePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[resource-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (resource-policy-props-builder> (new ResourcePolicyProps$Builder) id config))


(defn stream-options-builder>
  "The stream-options-builder> function updates a StreamOptions$Builder instance using the provided configuration.
  The function takes the StreamOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
"
  [^StreamOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :log-stream-name)]
    (. builder logStreamName data))
  (.build builder))


(defn stream-options-builder
  "Creates a  `StreamOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[stream-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (stream-options-builder> (new StreamOptions$Builder) id config))


(defn subscription-filter-builder>
  "The subscription-filter-builder> function updates a SubscriptionFilter$Builder instance using the provided configuration.
  The function takes the SubscriptionFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogSubscriptionDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
"
  [^SubscriptionFilter$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (.build builder))


(defn subscription-filter-builder
  "Creates a  `SubscriptionFilter$Builder` instance using a scope and ID, applies the data configuration using the [[subscription-filter-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (subscription-filter-builder> (SubscriptionFilter$Builder/create scope (name id)) id config))


(defn subscription-filter-options-builder>
  "The subscription-filter-options-builder> function updates a SubscriptionFilterOptions$Builder instance using the provided configuration.
  The function takes the SubscriptionFilterOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogSubscriptionDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
"
  [^SubscriptionFilterOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (.build builder))


(defn subscription-filter-options-builder
  "Creates a  `SubscriptionFilterOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[subscription-filter-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (subscription-filter-options-builder> (new SubscriptionFilterOptions$Builder) id config))


(defn subscription-filter-props-builder>
  "The subscription-filter-props-builder> function updates a SubscriptionFilterProps$Builder instance using the provided configuration.
  The function takes the SubscriptionFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogSubscriptionDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `filterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-name` |
| `filterPattern` | software.amazon.awscdk.services.logs.IFilterPattern | [[cdk.support/lookup-entry]] | `:filter-pattern` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
"
  [^SubscriptionFilterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :filter-name)]
    (. builder filterName data))
  (when-some [data (lookup-entry config id :filter-pattern)]
    (. builder filterPattern data))
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (.build builder))


(defn subscription-filter-props-builder
  "Creates a  `SubscriptionFilterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[subscription-filter-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (subscription-filter-props-builder> (new SubscriptionFilterProps$Builder) id config))