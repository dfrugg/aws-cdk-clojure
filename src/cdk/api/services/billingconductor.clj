(ns cdk.api.services.billingconductor
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.billingconductor package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.billingconductor CfnBillingGroup$AccountGroupingProperty$Builder
                                                             CfnBillingGroup$Builder
                                                             CfnBillingGroup$ComputationPreferenceProperty$Builder
                                                             CfnBillingGroupProps$Builder
                                                             CfnCustomLineItem$BillingPeriodRangeProperty$Builder
                                                             CfnCustomLineItem$Builder
                                                             CfnCustomLineItem$CustomLineItemChargeDetailsProperty$Builder
                                                             CfnCustomLineItem$CustomLineItemFlatChargeDetailsProperty$Builder
                                                             CfnCustomLineItem$CustomLineItemPercentageChargeDetailsProperty$Builder
                                                             CfnCustomLineItem$LineItemFilterProperty$Builder
                                                             CfnCustomLineItemProps$Builder
                                                             CfnPricingPlan$Builder
                                                             CfnPricingPlanProps$Builder
                                                             CfnPricingRule$Builder
                                                             CfnPricingRule$FreeTierProperty$Builder
                                                             CfnPricingRule$TieringProperty$Builder
                                                             CfnPricingRuleProps$Builder]))


(defn cfn-billing-group-account-grouping-property-builder>
  "The cfn-billing-group-account-grouping-property-builder> function updates a CfnBillingGroup$AccountGroupingProperty$Builder instance using the provided configuration.
  The function takes the CfnBillingGroup$AccountGroupingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAssociate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-associate` |
| `linkedAccountIds` | java.util.List | [[cdk.support/lookup-entry]] | `:linked-account-ids` |
"
  [^CfnBillingGroup$AccountGroupingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-associate)]
    (. builder autoAssociate data))
  (when-some [data (lookup-entry config id :linked-account-ids)]
    (. builder linkedAccountIds data))
  (.build builder))


(defn cfn-billing-group-account-grouping-property-builder
  "Creates a  `CfnBillingGroup$AccountGroupingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-billing-group-account-grouping-property-builder> (new CfnBillingGroup$AccountGroupingProperty$Builder) id config))


(defn cfn-billing-group-builder>
  "The cfn-billing-group-builder> function updates a CfnBillingGroup$Builder instance using the provided configuration.
  The function takes the CfnBillingGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountGrouping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-grouping` |
| `computationPreference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:computation-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `primaryAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-account-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBillingGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :account-grouping)]
    (. builder accountGrouping data))
  (when-some [data (lookup-entry config id :computation-preference)]
    (. builder computationPreference data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :primary-account-id)]
    (. builder primaryAccountId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-billing-group-builder
  "Creates a  `CfnBillingGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-billing-group-builder> (CfnBillingGroup$Builder/create scope (name id)) id config))


(defn cfn-billing-group-computation-preference-property-builder>
  "The cfn-billing-group-computation-preference-property-builder> function updates a CfnBillingGroup$ComputationPreferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnBillingGroup$ComputationPreferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pricingPlanArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan-arn` |
"
  [^CfnBillingGroup$ComputationPreferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :pricing-plan-arn)]
    (. builder pricingPlanArn data))
  (.build builder))


(defn cfn-billing-group-computation-preference-property-builder
  "Creates a  `CfnBillingGroup$ComputationPreferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-billing-group-computation-preference-property-builder> (new CfnBillingGroup$ComputationPreferenceProperty$Builder) id config))


(defn cfn-billing-group-props-builder>
  "The cfn-billing-group-props-builder> function updates a CfnBillingGroupProps$Builder instance using the provided configuration.
  The function takes the CfnBillingGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountGrouping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-grouping` |
| `computationPreference` | software.amazon.awscdk.services.billingconductor.CfnBillingGroup$ComputationPreferenceProperty | [[cdk.support/lookup-entry]] | `:computation-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `primaryAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-account-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBillingGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-grouping)]
    (. builder accountGrouping data))
  (when-some [data (lookup-entry config id :computation-preference)]
    (. builder computationPreference data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :primary-account-id)]
    (. builder primaryAccountId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-billing-group-props-builder
  "Creates a  `CfnBillingGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-billing-group-props-builder> (new CfnBillingGroupProps$Builder) id config))


(defn cfn-custom-line-item-billing-period-range-property-builder>
  "The cfn-custom-line-item-billing-period-range-property-builder> function updates a CfnCustomLineItem$BillingPeriodRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomLineItem$BillingPeriodRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclusiveEndBillingPeriod` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclusive-end-billing-period` |
| `inclusiveStartBillingPeriod` | java.lang.String | [[cdk.support/lookup-entry]] | `:inclusive-start-billing-period` |
"
  [^CfnCustomLineItem$BillingPeriodRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exclusive-end-billing-period)]
    (. builder exclusiveEndBillingPeriod data))
  (when-some [data (lookup-entry config id :inclusive-start-billing-period)]
    (. builder inclusiveStartBillingPeriod data))
  (.build builder))


(defn cfn-custom-line-item-billing-period-range-property-builder
  "Creates a  `CfnCustomLineItem$BillingPeriodRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-custom-line-item-billing-period-range-property-builder> (new CfnCustomLineItem$BillingPeriodRangeProperty$Builder) id config))


(defn cfn-custom-line-item-builder>
  "The cfn-custom-line-item-builder> function updates a CfnCustomLineItem$Builder instance using the provided configuration.
  The function takes the CfnCustomLineItem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `billingGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-arn` |
| `billingPeriodRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:billing-period-range` |
| `customLineItemChargeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-line-item-charge-details` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomLineItem$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :billing-group-arn)]
    (. builder billingGroupArn data))
  (when-some [data (lookup-entry config id :billing-period-range)]
    (. builder billingPeriodRange data))
  (when-some [data (lookup-entry config id :custom-line-item-charge-details)]
    (. builder customLineItemChargeDetails data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-custom-line-item-builder
  "Creates a  `CfnCustomLineItem$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-custom-line-item-builder> (CfnCustomLineItem$Builder/create scope (name id)) id config))


(defn cfn-custom-line-item-custom-line-item-charge-details-property-builder>
  "The cfn-custom-line-item-custom-line-item-charge-details-property-builder> function updates a CfnCustomLineItem$CustomLineItemChargeDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomLineItem$CustomLineItemChargeDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flat` |
| `lineItemFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:line-item-filters` |
| `percentage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:percentage` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCustomLineItem$CustomLineItemChargeDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :flat)]
    (. builder flat data))
  (when-some [data (lookup-entry config id :line-item-filters)]
    (. builder lineItemFilters data))
  (when-some [data (lookup-entry config id :percentage)]
    (. builder percentage data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-custom-line-item-custom-line-item-charge-details-property-builder
  "Creates a  `CfnCustomLineItem$CustomLineItemChargeDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-custom-line-item-custom-line-item-charge-details-property-builder> (new CfnCustomLineItem$CustomLineItemChargeDetailsProperty$Builder) id config))


(defn cfn-custom-line-item-custom-line-item-flat-charge-details-property-builder>
  "The cfn-custom-line-item-custom-line-item-flat-charge-details-property-builder> function updates a CfnCustomLineItem$CustomLineItemFlatChargeDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomLineItem$CustomLineItemFlatChargeDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `chargeValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:charge-value` |
"
  [^CfnCustomLineItem$CustomLineItemFlatChargeDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :charge-value)]
    (. builder chargeValue data))
  (.build builder))


(defn cfn-custom-line-item-custom-line-item-flat-charge-details-property-builder
  "Creates a  `CfnCustomLineItem$CustomLineItemFlatChargeDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-custom-line-item-custom-line-item-flat-charge-details-property-builder> (new CfnCustomLineItem$CustomLineItemFlatChargeDetailsProperty$Builder) id config))


(defn cfn-custom-line-item-custom-line-item-percentage-charge-details-property-builder>
  "The cfn-custom-line-item-custom-line-item-percentage-charge-details-property-builder> function updates a CfnCustomLineItem$CustomLineItemPercentageChargeDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomLineItem$CustomLineItemPercentageChargeDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childAssociatedResources` | java.util.List | [[cdk.support/lookup-entry]] | `:child-associated-resources` |
| `percentageValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage-value` |
"
  [^CfnCustomLineItem$CustomLineItemPercentageChargeDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :child-associated-resources)]
    (. builder childAssociatedResources data))
  (when-some [data (lookup-entry config id :percentage-value)]
    (. builder percentageValue data))
  (.build builder))


(defn cfn-custom-line-item-custom-line-item-percentage-charge-details-property-builder
  "Creates a  `CfnCustomLineItem$CustomLineItemPercentageChargeDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-custom-line-item-custom-line-item-percentage-charge-details-property-builder> (new CfnCustomLineItem$CustomLineItemPercentageChargeDetailsProperty$Builder) id config))


(defn cfn-custom-line-item-line-item-filter-property-builder>
  "The cfn-custom-line-item-line-item-filter-property-builder> function updates a CfnCustomLineItem$LineItemFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomLineItem$LineItemFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `matchOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-option` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnCustomLineItem$LineItemFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute)]
    (. builder attribute data))
  (when-some [data (lookup-entry config id :match-option)]
    (. builder matchOption data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-custom-line-item-line-item-filter-property-builder
  "Creates a  `CfnCustomLineItem$LineItemFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-custom-line-item-line-item-filter-property-builder> (new CfnCustomLineItem$LineItemFilterProperty$Builder) id config))


(defn cfn-custom-line-item-props-builder>
  "The cfn-custom-line-item-props-builder> function updates a CfnCustomLineItemProps$Builder instance using the provided configuration.
  The function takes the CfnCustomLineItemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `billingGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-arn` |
| `billingPeriodRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:billing-period-range` |
| `customLineItemChargeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-line-item-charge-details` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomLineItemProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :billing-group-arn)]
    (. builder billingGroupArn data))
  (when-some [data (lookup-entry config id :billing-period-range)]
    (. builder billingPeriodRange data))
  (when-some [data (lookup-entry config id :custom-line-item-charge-details)]
    (. builder customLineItemChargeDetails data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-custom-line-item-props-builder
  "Creates a  `CfnCustomLineItemProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-custom-line-item-props-builder> (new CfnCustomLineItemProps$Builder) id config))


(defn cfn-pricing-plan-builder>
  "The cfn-pricing-plan-builder> function updates a CfnPricingPlan$Builder instance using the provided configuration.
  The function takes the CfnPricingPlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pricingRuleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:pricing-rule-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPricingPlan$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :pricing-rule-arns)]
    (. builder pricingRuleArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pricing-plan-builder
  "Creates a  `CfnPricingPlan$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-pricing-plan-builder> (CfnPricingPlan$Builder/create scope (name id)) id config))


(defn cfn-pricing-plan-props-builder>
  "The cfn-pricing-plan-props-builder> function updates a CfnPricingPlanProps$Builder instance using the provided configuration.
  The function takes the CfnPricingPlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pricingRuleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:pricing-rule-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPricingPlanProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :pricing-rule-arns)]
    (. builder pricingRuleArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pricing-plan-props-builder
  "Creates a  `CfnPricingPlanProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-pricing-plan-props-builder> (new CfnPricingPlanProps$Builder) id config))


(defn cfn-pricing-rule-builder>
  "The cfn-pricing-rule-builder> function updates a CfnPricingRule$Builder instance using the provided configuration.
  The function takes the CfnPricingRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingEntity` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-entity` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modifierPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:modifier-percentage` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operation` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tiering` | software.amazon.awscdk.services.billingconductor.CfnPricingRule$TieringProperty | [[cdk.support/lookup-entry]] | `:tiering` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `usageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-type` |
"
  [^CfnPricingRule$Builder builder id config]
  (when-some [data (lookup-entry config id :billing-entity)]
    (. builder billingEntity data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :modifier-percentage)]
    (. builder modifierPercentage data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :operation)]
    (. builder operation data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tiering)]
    (. builder tiering data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :usage-type)]
    (. builder usageType data))
  (.build builder))


(defn cfn-pricing-rule-builder
  "Creates a  `CfnPricingRule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-pricing-rule-builder> (CfnPricingRule$Builder/create scope (name id)) id config))


(defn cfn-pricing-rule-free-tier-property-builder>
  "The cfn-pricing-rule-free-tier-property-builder> function updates a CfnPricingRule$FreeTierProperty$Builder instance using the provided configuration.
  The function takes the CfnPricingRule$FreeTierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activated` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:activated` |
"
  [^CfnPricingRule$FreeTierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :activated)]
    (. builder activated data))
  (.build builder))


(defn cfn-pricing-rule-free-tier-property-builder
  "Creates a  `CfnPricingRule$FreeTierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-pricing-rule-free-tier-property-builder> (new CfnPricingRule$FreeTierProperty$Builder) id config))


(defn cfn-pricing-rule-props-builder>
  "The cfn-pricing-rule-props-builder> function updates a CfnPricingRuleProps$Builder instance using the provided configuration.
  The function takes the CfnPricingRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingEntity` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-entity` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modifierPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:modifier-percentage` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operation` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tiering` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tiering` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `usageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-type` |
"
  [^CfnPricingRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :billing-entity)]
    (. builder billingEntity data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :modifier-percentage)]
    (. builder modifierPercentage data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :operation)]
    (. builder operation data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tiering)]
    (. builder tiering data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :usage-type)]
    (. builder usageType data))
  (.build builder))


(defn cfn-pricing-rule-props-builder
  "Creates a  `CfnPricingRuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-pricing-rule-props-builder> (new CfnPricingRuleProps$Builder) id config))


(defn cfn-pricing-rule-tiering-property-builder>
  "The cfn-pricing-rule-tiering-property-builder> function updates a CfnPricingRule$TieringProperty$Builder instance using the provided configuration.
  The function takes the CfnPricingRule$TieringProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `freeTier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:free-tier` |
"
  [^CfnPricingRule$TieringProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :free-tier)]
    (. builder freeTier data))
  (.build builder))


(defn cfn-pricing-rule-tiering-property-builder
  "Creates a  `CfnPricingRule$TieringProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-pricing-rule-tiering-property-builder> (new CfnPricingRule$TieringProperty$Builder) id config))