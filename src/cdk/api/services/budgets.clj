(ns cdk.api.services.budgets
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.budgets package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.budgets CfnBudget$AutoAdjustDataProperty$Builder
                                                    CfnBudget$BudgetDataProperty$Builder
                                                    CfnBudget$Builder
                                                    CfnBudget$CostTypesProperty$Builder
                                                    CfnBudget$HistoricalOptionsProperty$Builder
                                                    CfnBudget$NotificationProperty$Builder
                                                    CfnBudget$NotificationWithSubscribersProperty$Builder
                                                    CfnBudget$ResourceTagProperty$Builder
                                                    CfnBudget$SpendProperty$Builder
                                                    CfnBudget$SubscriberProperty$Builder
                                                    CfnBudget$TimePeriodProperty$Builder
                                                    CfnBudgetProps$Builder
                                                    CfnBudgetsAction$ActionThresholdProperty$Builder
                                                    CfnBudgetsAction$Builder
                                                    CfnBudgetsAction$DefinitionProperty$Builder
                                                    CfnBudgetsAction$IamActionDefinitionProperty$Builder
                                                    CfnBudgetsAction$ResourceTagProperty$Builder
                                                    CfnBudgetsAction$ScpActionDefinitionProperty$Builder
                                                    CfnBudgetsAction$SsmActionDefinitionProperty$Builder
                                                    CfnBudgetsAction$SubscriberProperty$Builder
                                                    CfnBudgetsActionProps$Builder]))


(defn cfn-budget-auto-adjust-data-property-builder
  "The cfn-budget-auto-adjust-data-property-builder function buildes out new instances of 
CfnBudget$AutoAdjustDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAdjustType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-adjust-type` |
| `historicalOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:historical-options` |"
  [stack id config]
  (let [builder (CfnBudget$AutoAdjustDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-adjust-type)]
      (. builder autoAdjustType data))
    (when-let [data (lookup-entry config id :historical-options)]
      (. builder historicalOptions data))
    (.build builder)))


(defn cfn-budget-budget-data-property-builder
  "The cfn-budget-budget-data-property-builder function buildes out new instances of 
CfnBudget$BudgetDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAdjustData` | software.amazon.awscdk.services.budgets.CfnBudget$AutoAdjustDataProperty | [[cdk.support/lookup-entry]] | `:auto-adjust-data` |
| `budgetLimit` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:budget-limit` |
| `budgetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:budget-name` |
| `budgetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:budget-type` |
| `costFilters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:cost-filters` |
| `costTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cost-types` |
| `plannedBudgetLimits` | java.lang.Object | [[cdk.support/lookup-entry]] | `:planned-budget-limits` |
| `timePeriod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-period` |
| `timeUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-unit` |"
  [stack id config]
  (let [builder (CfnBudget$BudgetDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-adjust-data)]
      (. builder autoAdjustData data))
    (when-let [data (lookup-entry config id :budget-limit)]
      (. builder budgetLimit data))
    (when-let [data (lookup-entry config id :budget-name)]
      (. builder budgetName data))
    (when-let [data (lookup-entry config id :budget-type)]
      (. builder budgetType data))
    (when-let [data (lookup-entry config id :cost-filters)]
      (. builder costFilters data))
    (when-let [data (lookup-entry config id :cost-types)]
      (. builder costTypes data))
    (when-let [data (lookup-entry config id :planned-budget-limits)]
      (. builder plannedBudgetLimits data))
    (when-let [data (lookup-entry config id :time-period)]
      (. builder timePeriod data))
    (when-let [data (lookup-entry config id :time-unit)]
      (. builder timeUnit data))
    (.build builder)))


(defn cfn-budget-builder
  "The cfn-budget-builder function buildes out new instances of 
CfnBudget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `budget` | software.amazon.awscdk.services.budgets.CfnBudget$BudgetDataProperty | [[cdk.support/lookup-entry]] | `:budget` |
| `notificationsWithSubscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:notifications-with-subscribers` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |"
  [stack id config]
  (let [builder (CfnBudget$Builder/create stack id)]
    (when-let [data (lookup-entry config id :budget)]
      (. builder budget data))
    (when-let [data (lookup-entry config id :notifications-with-subscribers)]
      (. builder notificationsWithSubscribers data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (.build builder)))


(defn cfn-budget-cost-types-property-builder
  "The cfn-budget-cost-types-property-builder function buildes out new instances of 
CfnBudget$CostTypesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeCredit` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-credit` |
| `includeDiscount` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-discount` |
| `includeOtherSubscription` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-other-subscription` |
| `includeRecurring` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-recurring` |
| `includeRefund` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-refund` |
| `includeSubscription` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-subscription` |
| `includeSupport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-support` |
| `includeTax` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-tax` |
| `includeUpfront` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-upfront` |
| `useAmortized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-amortized` |
| `useBlended` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-blended` |"
  [stack id config]
  (let [builder (CfnBudget$CostTypesProperty$Builder.)]
    (when-let [data (lookup-entry config id :include-credit)]
      (. builder includeCredit data))
    (when-let [data (lookup-entry config id :include-discount)]
      (. builder includeDiscount data))
    (when-let [data (lookup-entry config id :include-other-subscription)]
      (. builder includeOtherSubscription data))
    (when-let [data (lookup-entry config id :include-recurring)]
      (. builder includeRecurring data))
    (when-let [data (lookup-entry config id :include-refund)]
      (. builder includeRefund data))
    (when-let [data (lookup-entry config id :include-subscription)]
      (. builder includeSubscription data))
    (when-let [data (lookup-entry config id :include-support)]
      (. builder includeSupport data))
    (when-let [data (lookup-entry config id :include-tax)]
      (. builder includeTax data))
    (when-let [data (lookup-entry config id :include-upfront)]
      (. builder includeUpfront data))
    (when-let [data (lookup-entry config id :use-amortized)]
      (. builder useAmortized data))
    (when-let [data (lookup-entry config id :use-blended)]
      (. builder useBlended data))
    (.build builder)))


(defn cfn-budget-historical-options-property-builder
  "The cfn-budget-historical-options-property-builder function buildes out new instances of 
CfnBudget$HistoricalOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `budgetAdjustmentPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:budget-adjustment-period` |"
  [stack id config]
  (let [builder (CfnBudget$HistoricalOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :budget-adjustment-period)]
      (. builder budgetAdjustmentPeriod data))
    (.build builder)))


(defn cfn-budget-notification-property-builder
  "The cfn-budget-notification-property-builder function buildes out new instances of 
CfnBudget$NotificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `notificationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-type` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `thresholdType` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-type` |"
  [stack id config]
  (let [builder (CfnBudget$NotificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :notification-type)]
      (. builder notificationType data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :threshold-type)]
      (. builder thresholdType data))
    (.build builder)))


(defn cfn-budget-notification-with-subscribers-property-builder
  "The cfn-budget-notification-with-subscribers-property-builder function buildes out new instances of 
CfnBudget$NotificationWithSubscribersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notification` | software.amazon.awscdk.services.budgets.CfnBudget$NotificationProperty | [[cdk.support/lookup-entry]] | `:notification` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |"
  [stack id config]
  (let [builder (CfnBudget$NotificationWithSubscribersProperty$Builder.)]
    (when-let [data (lookup-entry config id :notification)]
      (. builder notification data))
    (when-let [data (lookup-entry config id :subscribers)]
      (. builder subscribers data))
    (.build builder)))


(defn cfn-budget-props-builder
  "The cfn-budget-props-builder function buildes out new instances of 
CfnBudgetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `budget` | software.amazon.awscdk.services.budgets.CfnBudget$BudgetDataProperty | [[cdk.support/lookup-entry]] | `:budget` |
| `notificationsWithSubscribers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notifications-with-subscribers` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |"
  [stack id config]
  (let [builder (CfnBudgetProps$Builder.)]
    (when-let [data (lookup-entry config id :budget)]
      (. builder budget data))
    (when-let [data (lookup-entry config id :notifications-with-subscribers)]
      (. builder notificationsWithSubscribers data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (.build builder)))


(defn cfn-budget-resource-tag-property-builder
  "The cfn-budget-resource-tag-property-builder function buildes out new instances of 
CfnBudget$ResourceTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBudget$ResourceTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-budget-spend-property-builder
  "The cfn-budget-spend-property-builder function buildes out new instances of 
CfnBudget$SpendProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amount` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnBudget$SpendProperty$Builder.)]
    (when-let [data (lookup-entry config id :amount)]
      (. builder amount data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-budget-subscriber-property-builder
  "The cfn-budget-subscriber-property-builder function buildes out new instances of 
CfnBudget$SubscriberProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `subscriptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-type` |"
  [stack id config]
  (let [builder (CfnBudget$SubscriberProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :subscription-type)]
      (. builder subscriptionType data))
    (.build builder)))


(defn cfn-budget-time-period-property-builder
  "The cfn-budget-time-period-property-builder function buildes out new instances of 
CfnBudget$TimePeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |"
  [stack id config]
  (let [builder (CfnBudget$TimePeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (.build builder)))


(defn cfn-budgets-action-action-threshold-property-builder
  "The cfn-budgets-action-action-threshold-property-builder function buildes out new instances of 
CfnBudgetsAction$ActionThresholdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBudgetsAction$ActionThresholdProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-budgets-action-builder
  "The cfn-budgets-action-builder function buildes out new instances of 
CfnBudgetsAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionThreshold` | software.amazon.awscdk.services.budgets.CfnBudgetsAction$ActionThresholdProperty | [[cdk.support/lookup-entry]] | `:action-threshold` |
| `actionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-type` |
| `approvalModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:approval-model` |
| `budgetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:budget-name` |
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `notificationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-type` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `subscribers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subscribers` |"
  [stack id config]
  (let [builder (CfnBudgetsAction$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action-threshold)]
      (. builder actionThreshold data))
    (when-let [data (lookup-entry config id :action-type)]
      (. builder actionType data))
    (when-let [data (lookup-entry config id :approval-model)]
      (. builder approvalModel data))
    (when-let [data (lookup-entry config id :budget-name)]
      (. builder budgetName data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :notification-type)]
      (. builder notificationType data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :subscribers)]
      (. builder subscribers data))
    (.build builder)))


(defn cfn-budgets-action-definition-property-builder
  "The cfn-budgets-action-definition-property-builder function buildes out new instances of 
CfnBudgetsAction$DefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamActionDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam-action-definition` |
| `scpActionDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scp-action-definition` |
| `ssmActionDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ssm-action-definition` |"
  [stack id config]
  (let [builder (CfnBudgetsAction$DefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :iam-action-definition)]
      (. builder iamActionDefinition data))
    (when-let [data (lookup-entry config id :scp-action-definition)]
      (. builder scpActionDefinition data))
    (when-let [data (lookup-entry config id :ssm-action-definition)]
      (. builder ssmActionDefinition data))
    (.build builder)))


(defn cfn-budgets-action-iam-action-definition-property-builder
  "The cfn-budgets-action-iam-action-definition-property-builder function buildes out new instances of 
CfnBudgetsAction$IamActionDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-arn` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnBudgetsAction$IamActionDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :policy-arn)]
      (. builder policyArn data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-budgets-action-props-builder
  "The cfn-budgets-action-props-builder function buildes out new instances of 
CfnBudgetsActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionThreshold` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-threshold` |
| `actionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-type` |
| `approvalModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:approval-model` |
| `budgetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:budget-name` |
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `notificationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-type` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |"
  [stack id config]
  (let [builder (CfnBudgetsActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-threshold)]
      (. builder actionThreshold data))
    (when-let [data (lookup-entry config id :action-type)]
      (. builder actionType data))
    (when-let [data (lookup-entry config id :approval-model)]
      (. builder approvalModel data))
    (when-let [data (lookup-entry config id :budget-name)]
      (. builder budgetName data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :notification-type)]
      (. builder notificationType data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :subscribers)]
      (. builder subscribers data))
    (.build builder)))


(defn cfn-budgets-action-resource-tag-property-builder
  "The cfn-budgets-action-resource-tag-property-builder function buildes out new instances of 
CfnBudgetsAction$ResourceTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBudgetsAction$ResourceTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-budgets-action-scp-action-definition-property-builder
  "The cfn-budgets-action-scp-action-definition-property-builder function buildes out new instances of 
CfnBudgetsAction$ScpActionDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-id` |
| `targetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:target-ids` |"
  [stack id config]
  (let [builder (CfnBudgetsAction$ScpActionDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-id)]
      (. builder policyId data))
    (when-let [data (lookup-entry config id :target-ids)]
      (. builder targetIds data))
    (.build builder)))


(defn cfn-budgets-action-ssm-action-definition-property-builder
  "The cfn-budgets-action-ssm-action-definition-property-builder function buildes out new instances of 
CfnBudgetsAction$SsmActionDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-ids` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `subtype` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtype` |"
  [stack id config]
  (let [builder (CfnBudgetsAction$SsmActionDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-ids)]
      (. builder instanceIds data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :subtype)]
      (. builder subtype data))
    (.build builder)))


(defn cfn-budgets-action-subscriber-property-builder
  "The cfn-budgets-action-subscriber-property-builder function buildes out new instances of 
CfnBudgetsAction$SubscriberProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnBudgetsAction$SubscriberProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))