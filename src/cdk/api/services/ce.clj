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


(defn cfn-anomaly-monitor-builder
  "The cfn-anomaly-monitor-builder function buildes out new instances of 
CfnAnomalyMonitor$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monitorDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-dimension` |
| `monitorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-name` |
| `monitorSpecification` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-specification` |
| `monitorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-type` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |"
  [stack id config]
  (let [builder (CfnAnomalyMonitor$Builder/create stack id)]
    (when-let [data (lookup-entry config id :monitor-dimension)]
      (. builder monitorDimension data))
    (when-let [data (lookup-entry config id :monitor-name)]
      (. builder monitorName data))
    (when-let [data (lookup-entry config id :monitor-specification)]
      (. builder monitorSpecification data))
    (when-let [data (lookup-entry config id :monitor-type)]
      (. builder monitorType data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (.build builder)))


(defn cfn-anomaly-monitor-props-builder
  "The cfn-anomaly-monitor-props-builder function buildes out new instances of 
CfnAnomalyMonitorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monitorDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-dimension` |
| `monitorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-name` |
| `monitorSpecification` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-specification` |
| `monitorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-type` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |"
  [stack id config]
  (let [builder (CfnAnomalyMonitorProps$Builder.)]
    (when-let [data (lookup-entry config id :monitor-dimension)]
      (. builder monitorDimension data))
    (when-let [data (lookup-entry config id :monitor-name)]
      (. builder monitorName data))
    (when-let [data (lookup-entry config id :monitor-specification)]
      (. builder monitorSpecification data))
    (when-let [data (lookup-entry config id :monitor-type)]
      (. builder monitorType data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (.build builder)))


(defn cfn-anomaly-monitor-resource-tag-property-builder
  "The cfn-anomaly-monitor-resource-tag-property-builder function buildes out new instances of 
CfnAnomalyMonitor$ResourceTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAnomalyMonitor$ResourceTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-anomaly-subscription-builder
  "The cfn-anomaly-subscription-builder function buildes out new instances of 
CfnAnomalySubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `monitorArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:monitor-arn-list` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `thresholdExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-expression` |"
  [stack id config]
  (let [builder (CfnAnomalySubscription$Builder/create stack id)]
    (when-let [data (lookup-entry config id :frequency)]
      (. builder frequency data))
    (when-let [data (lookup-entry config id :monitor-arn-list)]
      (. builder monitorArnList data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :subscribers)]
      (. builder subscribers data))
    (when-let [data (lookup-entry config id :subscription-name)]
      (. builder subscriptionName data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :threshold-expression)]
      (. builder thresholdExpression data))
    (.build builder)))


(defn cfn-anomaly-subscription-props-builder
  "The cfn-anomaly-subscription-props-builder function buildes out new instances of 
CfnAnomalySubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `monitorArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:monitor-arn-list` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `thresholdExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-expression` |"
  [stack id config]
  (let [builder (CfnAnomalySubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :frequency)]
      (. builder frequency data))
    (when-let [data (lookup-entry config id :monitor-arn-list)]
      (. builder monitorArnList data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :subscribers)]
      (. builder subscribers data))
    (when-let [data (lookup-entry config id :subscription-name)]
      (. builder subscriptionName data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :threshold-expression)]
      (. builder thresholdExpression data))
    (.build builder)))


(defn cfn-anomaly-subscription-resource-tag-property-builder
  "The cfn-anomaly-subscription-resource-tag-property-builder function buildes out new instances of 
CfnAnomalySubscription$ResourceTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAnomalySubscription$ResourceTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-anomaly-subscription-subscriber-property-builder
  "The cfn-anomaly-subscription-subscriber-property-builder function buildes out new instances of 
CfnAnomalySubscription$SubscriberProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAnomalySubscription$SubscriberProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-cost-category-builder
  "The cfn-cost-category-builder function buildes out new instances of 
CfnCostCategory$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-version` |
| `rules` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules` |
| `splitChargeRules` | java.lang.String | [[cdk.support/lookup-entry]] | `:split-charge-rules` |"
  [stack id config]
  (let [builder (CfnCostCategory$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rule-version)]
      (. builder ruleVersion data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (when-let [data (lookup-entry config id :split-charge-rules)]
      (. builder splitChargeRules data))
    (.build builder)))


(defn cfn-cost-category-props-builder
  "The cfn-cost-category-props-builder function buildes out new instances of 
CfnCostCategoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-version` |
| `rules` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules` |
| `splitChargeRules` | java.lang.String | [[cdk.support/lookup-entry]] | `:split-charge-rules` |"
  [stack id config]
  (let [builder (CfnCostCategoryProps$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rule-version)]
      (. builder ruleVersion data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (when-let [data (lookup-entry config id :split-charge-rules)]
      (. builder splitChargeRules data))
    (.build builder)))