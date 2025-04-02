(ns cdk.api.services.ce
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ce package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ce CfnAnomalyMonitor$Builder
                                               CfnAnomalyMonitor$ResourceTagProperty$Builder
                                               CfnAnomalyMonitorProps$Builder
                                               CfnAnomalySubscription$Builder
                                               CfnAnomalySubscription$ResourceTagProperty$Builder
                                               CfnAnomalySubscription$SubscriberProperty$Builder
                                               CfnAnomalySubscriptionProps$Builder
                                               CfnCostCategory$Builder
                                               CfnCostCategoryProps$Builder]))


(defn cfn-anomaly-monitor-builder>
  "The cfn-anomaly-monitor-builder> function updates a CfnAnomalyMonitor$Builder instance using the provided configuration.
  The function takes the CfnAnomalyMonitor$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monitorDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-dimension` |
| `monitorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-name` |
| `monitorSpecification` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-specification` |
| `monitorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-type` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
"
  [^CfnAnomalyMonitor$Builder builder id config]
  (when-some [data (lookup-entry config id :monitor-dimension)]
    (. builder monitorDimension data))
  (when-some [data (lookup-entry config id :monitor-name)]
    (. builder monitorName data))
  (when-some [data (lookup-entry config id :monitor-specification)]
    (. builder monitorSpecification data))
  (when-some [data (lookup-entry config id :monitor-type)]
    (. builder monitorType data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (.build builder))


(defn cfn-anomaly-monitor-builder
  "Creates a  `CfnAnomalyMonitor$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-anomaly-monitor-builder> (CfnAnomalyMonitor$Builder/create scope (name id)) id config))


(defn cfn-anomaly-monitor-props-builder>
  "The cfn-anomaly-monitor-props-builder> function updates a CfnAnomalyMonitorProps$Builder instance using the provided configuration.
  The function takes the CfnAnomalyMonitorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monitorDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-dimension` |
| `monitorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-name` |
| `monitorSpecification` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-specification` |
| `monitorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-type` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
"
  [^CfnAnomalyMonitorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :monitor-dimension)]
    (. builder monitorDimension data))
  (when-some [data (lookup-entry config id :monitor-name)]
    (. builder monitorName data))
  (when-some [data (lookup-entry config id :monitor-specification)]
    (. builder monitorSpecification data))
  (when-some [data (lookup-entry config id :monitor-type)]
    (. builder monitorType data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (.build builder))


(defn cfn-anomaly-monitor-props-builder
  "Creates a  `CfnAnomalyMonitorProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-anomaly-monitor-props-builder> (new CfnAnomalyMonitorProps$Builder) id config))


(defn cfn-anomaly-monitor-resource-tag-property-builder>
  "The cfn-anomaly-monitor-resource-tag-property-builder> function updates a CfnAnomalyMonitor$ResourceTagProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyMonitor$ResourceTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAnomalyMonitor$ResourceTagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-anomaly-monitor-resource-tag-property-builder
  "Creates a  `CfnAnomalyMonitor$ResourceTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-anomaly-monitor-resource-tag-property-builder> (new CfnAnomalyMonitor$ResourceTagProperty$Builder) id config))


(defn cfn-anomaly-subscription-builder>
  "The cfn-anomaly-subscription-builder> function updates a CfnAnomalySubscription$Builder instance using the provided configuration.
  The function takes the CfnAnomalySubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `monitorArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:monitor-arn-list` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `thresholdExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-expression` |
"
  [^CfnAnomalySubscription$Builder builder id config]
  (when-some [data (lookup-entry config id :frequency)]
    (. builder frequency data))
  (when-some [data (lookup-entry config id :monitor-arn-list)]
    (. builder monitorArnList data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :subscribers)]
    (. builder subscribers data))
  (when-some [data (lookup-entry config id :subscription-name)]
    (. builder subscriptionName data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :threshold-expression)]
    (. builder thresholdExpression data))
  (.build builder))


(defn cfn-anomaly-subscription-builder
  "Creates a  `CfnAnomalySubscription$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-anomaly-subscription-builder> (CfnAnomalySubscription$Builder/create scope (name id)) id config))


(defn cfn-anomaly-subscription-props-builder>
  "The cfn-anomaly-subscription-props-builder> function updates a CfnAnomalySubscriptionProps$Builder instance using the provided configuration.
  The function takes the CfnAnomalySubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `monitorArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:monitor-arn-list` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `thresholdExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-expression` |
"
  [^CfnAnomalySubscriptionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :frequency)]
    (. builder frequency data))
  (when-some [data (lookup-entry config id :monitor-arn-list)]
    (. builder monitorArnList data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :subscribers)]
    (. builder subscribers data))
  (when-some [data (lookup-entry config id :subscription-name)]
    (. builder subscriptionName data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :threshold-expression)]
    (. builder thresholdExpression data))
  (.build builder))


(defn cfn-anomaly-subscription-props-builder
  "Creates a  `CfnAnomalySubscriptionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-anomaly-subscription-props-builder> (new CfnAnomalySubscriptionProps$Builder) id config))


(defn cfn-anomaly-subscription-resource-tag-property-builder>
  "The cfn-anomaly-subscription-resource-tag-property-builder> function updates a CfnAnomalySubscription$ResourceTagProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalySubscription$ResourceTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAnomalySubscription$ResourceTagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-anomaly-subscription-resource-tag-property-builder
  "Creates a  `CfnAnomalySubscription$ResourceTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-anomaly-subscription-resource-tag-property-builder> (new CfnAnomalySubscription$ResourceTagProperty$Builder) id config))


(defn cfn-anomaly-subscription-subscriber-property-builder>
  "The cfn-anomaly-subscription-subscriber-property-builder> function updates a CfnAnomalySubscription$SubscriberProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalySubscription$SubscriberProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAnomalySubscription$SubscriberProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-anomaly-subscription-subscriber-property-builder
  "Creates a  `CfnAnomalySubscription$SubscriberProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-anomaly-subscription-subscriber-property-builder> (new CfnAnomalySubscription$SubscriberProperty$Builder) id config))


(defn cfn-cost-category-builder>
  "The cfn-cost-category-builder> function updates a CfnCostCategory$Builder instance using the provided configuration.
  The function takes the CfnCostCategory$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-version` |
| `rules` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules` |
| `splitChargeRules` | java.lang.String | [[cdk.support/lookup-entry]] | `:split-charge-rules` |
"
  [^CfnCostCategory$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rule-version)]
    (. builder ruleVersion data))
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-some [data (lookup-entry config id :split-charge-rules)]
    (. builder splitChargeRules data))
  (.build builder))


(defn cfn-cost-category-builder
  "Creates a  `CfnCostCategory$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cost-category-builder> (CfnCostCategory$Builder/create scope (name id)) id config))


(defn cfn-cost-category-props-builder>
  "The cfn-cost-category-props-builder> function updates a CfnCostCategoryProps$Builder instance using the provided configuration.
  The function takes the CfnCostCategoryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-version` |
| `rules` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules` |
| `splitChargeRules` | java.lang.String | [[cdk.support/lookup-entry]] | `:split-charge-rules` |
"
  [^CfnCostCategoryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rule-version)]
    (. builder ruleVersion data))
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-some [data (lookup-entry config id :split-charge-rules)]
    (. builder splitChargeRules data))
  (.build builder))


(defn cfn-cost-category-props-builder
  "Creates a  `CfnCostCategoryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cost-category-props-builder> (new CfnCostCategoryProps$Builder) id config))