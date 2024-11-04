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


(defn cfn-billing-group-account-grouping-property-builder
  "The cfn-billing-group-account-grouping-property-builder function buildes out new instances of 
CfnBillingGroup$AccountGroupingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAssociate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-associate` |
| `linkedAccountIds` | java.util.List | [[cdk.support/lookup-entry]] | `:linked-account-ids` |"
  [stack id config]
  (let [builder (CfnBillingGroup$AccountGroupingProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-associate)]
      (. builder autoAssociate data))
    (when-let [data (lookup-entry config id :linked-account-ids)]
      (. builder linkedAccountIds data))
    (.build builder)))


(defn cfn-billing-group-builder
  "The cfn-billing-group-builder function buildes out new instances of 
CfnBillingGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountGrouping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-grouping` |
| `computationPreference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:computation-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `primaryAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-account-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBillingGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-grouping)]
      (. builder accountGrouping data))
    (when-let [data (lookup-entry config id :computation-preference)]
      (. builder computationPreference data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :primary-account-id)]
      (. builder primaryAccountId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-billing-group-computation-preference-property-builder
  "The cfn-billing-group-computation-preference-property-builder function buildes out new instances of 
CfnBillingGroup$ComputationPreferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pricingPlanArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan-arn` |"
  [stack id config]
  (let [builder (CfnBillingGroup$ComputationPreferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :pricing-plan-arn)]
      (. builder pricingPlanArn data))
    (.build builder)))


(defn cfn-billing-group-props-builder
  "The cfn-billing-group-props-builder function buildes out new instances of 
CfnBillingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountGrouping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-grouping` |
| `computationPreference` | software.amazon.awscdk.services.billingconductor.CfnBillingGroup$ComputationPreferenceProperty | [[cdk.support/lookup-entry]] | `:computation-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `primaryAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-account-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBillingGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :account-grouping)]
      (. builder accountGrouping data))
    (when-let [data (lookup-entry config id :computation-preference)]
      (. builder computationPreference data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :primary-account-id)]
      (. builder primaryAccountId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-custom-line-item-billing-period-range-property-builder
  "The cfn-custom-line-item-billing-period-range-property-builder function buildes out new instances of 
CfnCustomLineItem$BillingPeriodRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclusiveEndBillingPeriod` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclusive-end-billing-period` |
| `inclusiveStartBillingPeriod` | java.lang.String | [[cdk.support/lookup-entry]] | `:inclusive-start-billing-period` |"
  [stack id config]
  (let [builder (CfnCustomLineItem$BillingPeriodRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :exclusive-end-billing-period)]
      (. builder exclusiveEndBillingPeriod data))
    (when-let [data (lookup-entry config id :inclusive-start-billing-period)]
      (. builder inclusiveStartBillingPeriod data))
    (.build builder)))


(defn cfn-custom-line-item-builder
  "The cfn-custom-line-item-builder function buildes out new instances of 
CfnCustomLineItem$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `billingGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-arn` |
| `billingPeriodRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:billing-period-range` |
| `customLineItemChargeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-line-item-charge-details` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomLineItem$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :billing-group-arn)]
      (. builder billingGroupArn data))
    (when-let [data (lookup-entry config id :billing-period-range)]
      (. builder billingPeriodRange data))
    (when-let [data (lookup-entry config id :custom-line-item-charge-details)]
      (. builder customLineItemChargeDetails data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-custom-line-item-custom-line-item-charge-details-property-builder
  "The cfn-custom-line-item-custom-line-item-charge-details-property-builder function buildes out new instances of 
CfnCustomLineItem$CustomLineItemChargeDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flat` |
| `lineItemFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:line-item-filters` |
| `percentage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:percentage` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCustomLineItem$CustomLineItemChargeDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :flat)]
      (. builder flat data))
    (when-let [data (lookup-entry config id :line-item-filters)]
      (. builder lineItemFilters data))
    (when-let [data (lookup-entry config id :percentage)]
      (. builder percentage data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-custom-line-item-custom-line-item-flat-charge-details-property-builder
  "The cfn-custom-line-item-custom-line-item-flat-charge-details-property-builder function buildes out new instances of 
CfnCustomLineItem$CustomLineItemFlatChargeDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `chargeValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:charge-value` |"
  [stack id config]
  (let [builder (CfnCustomLineItem$CustomLineItemFlatChargeDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :charge-value)]
      (. builder chargeValue data))
    (.build builder)))


(defn cfn-custom-line-item-custom-line-item-percentage-charge-details-property-builder
  "The cfn-custom-line-item-custom-line-item-percentage-charge-details-property-builder function buildes out new instances of 
CfnCustomLineItem$CustomLineItemPercentageChargeDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childAssociatedResources` | java.util.List | [[cdk.support/lookup-entry]] | `:child-associated-resources` |
| `percentageValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage-value` |"
  [stack id config]
  (let [builder (CfnCustomLineItem$CustomLineItemPercentageChargeDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :child-associated-resources)]
      (. builder childAssociatedResources data))
    (when-let [data (lookup-entry config id :percentage-value)]
      (. builder percentageValue data))
    (.build builder)))


(defn cfn-custom-line-item-line-item-filter-property-builder
  "The cfn-custom-line-item-line-item-filter-property-builder function buildes out new instances of 
CfnCustomLineItem$LineItemFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `matchOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-option` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnCustomLineItem$LineItemFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute)]
      (. builder attribute data))
    (when-let [data (lookup-entry config id :match-option)]
      (. builder matchOption data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-custom-line-item-props-builder
  "The cfn-custom-line-item-props-builder function buildes out new instances of 
CfnCustomLineItemProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `billingGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-arn` |
| `billingPeriodRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:billing-period-range` |
| `customLineItemChargeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-line-item-charge-details` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomLineItemProps$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :billing-group-arn)]
      (. builder billingGroupArn data))
    (when-let [data (lookup-entry config id :billing-period-range)]
      (. builder billingPeriodRange data))
    (when-let [data (lookup-entry config id :custom-line-item-charge-details)]
      (. builder customLineItemChargeDetails data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-pricing-plan-builder
  "The cfn-pricing-plan-builder function buildes out new instances of 
CfnPricingPlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pricingRuleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:pricing-rule-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPricingPlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pricing-rule-arns)]
      (. builder pricingRuleArns data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-pricing-plan-props-builder
  "The cfn-pricing-plan-props-builder function buildes out new instances of 
CfnPricingPlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pricingRuleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:pricing-rule-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPricingPlanProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pricing-rule-arns)]
      (. builder pricingRuleArns data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-pricing-rule-builder
  "The cfn-pricing-rule-builder function buildes out new instances of 
CfnPricingRule$Builder using the provided configuration.  Each field is set as follows:

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
| `usageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-type` |"
  [stack id config]
  (let [builder (CfnPricingRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :billing-entity)]
      (. builder billingEntity data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :modifier-percentage)]
      (. builder modifierPercentage data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :operation)]
      (. builder operation data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tiering)]
      (. builder tiering data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :usage-type)]
      (. builder usageType data))
    (.build builder)))


(defn cfn-pricing-rule-free-tier-property-builder
  "The cfn-pricing-rule-free-tier-property-builder function buildes out new instances of 
CfnPricingRule$FreeTierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activated` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:activated` |"
  [stack id config]
  (let [builder (CfnPricingRule$FreeTierProperty$Builder.)]
    (when-let [data (lookup-entry config id :activated)]
      (. builder activated data))
    (.build builder)))


(defn cfn-pricing-rule-props-builder
  "The cfn-pricing-rule-props-builder function buildes out new instances of 
CfnPricingRuleProps$Builder using the provided configuration.  Each field is set as follows:

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
| `usageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-type` |"
  [stack id config]
  (let [builder (CfnPricingRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :billing-entity)]
      (. builder billingEntity data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :modifier-percentage)]
      (. builder modifierPercentage data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :operation)]
      (. builder operation data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tiering)]
      (. builder tiering data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :usage-type)]
      (. builder usageType data))
    (.build builder)))


(defn cfn-pricing-rule-tiering-property-builder
  "The cfn-pricing-rule-tiering-property-builder function buildes out new instances of 
CfnPricingRule$TieringProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `freeTier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:free-tier` |"
  [stack id config]
  (let [builder (CfnPricingRule$TieringProperty$Builder.)]
    (when-let [data (lookup-entry config id :free-tier)]
      (. builder freeTier data))
    (.build builder)))