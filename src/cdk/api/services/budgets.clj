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


(defn build-cfn-budget-auto-adjust-data-property-builder
  "The build-cfn-budget-auto-adjust-data-property-builder function updates a CfnBudget$AutoAdjustDataProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$AutoAdjustDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAdjustType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-adjust-type` |
| `historicalOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:historical-options` |
"
  [^CfnBudget$AutoAdjustDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-adjust-type)]
    (. builder autoAdjustType data))
  (when-some [data (lookup-entry config id :historical-options)]
    (. builder historicalOptions data))
  (.build builder))


(defn cfn-budget-auto-adjust-data-property-builder
  "Creates a  `CfnBudget$AutoAdjustDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-auto-adjust-data-property-builder (new CfnBudget$AutoAdjustDataProperty$Builder) id config))


(defn build-cfn-budget-budget-data-property-builder
  "The build-cfn-budget-budget-data-property-builder function updates a CfnBudget$BudgetDataProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$BudgetDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `timeUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-unit` |
"
  [^CfnBudget$BudgetDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-adjust-data)]
    (. builder autoAdjustData data))
  (when-some [data (lookup-entry config id :budget-limit)]
    (. builder budgetLimit data))
  (when-some [data (lookup-entry config id :budget-name)]
    (. builder budgetName data))
  (when-some [data (lookup-entry config id :budget-type)]
    (. builder budgetType data))
  (when-some [data (lookup-entry config id :cost-filters)]
    (. builder costFilters data))
  (when-some [data (lookup-entry config id :cost-types)]
    (. builder costTypes data))
  (when-some [data (lookup-entry config id :planned-budget-limits)]
    (. builder plannedBudgetLimits data))
  (when-some [data (lookup-entry config id :time-period)]
    (. builder timePeriod data))
  (when-some [data (lookup-entry config id :time-unit)]
    (. builder timeUnit data))
  (.build builder))


(defn cfn-budget-budget-data-property-builder
  "Creates a  `CfnBudget$BudgetDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-budget-data-property-builder (new CfnBudget$BudgetDataProperty$Builder) id config))


(defn build-cfn-budget-builder
  "The build-cfn-budget-builder function updates a CfnBudget$Builder instance using the provided configuration.
  The function takes the CfnBudget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `budget` | software.amazon.awscdk.services.budgets.CfnBudget$BudgetDataProperty | [[cdk.support/lookup-entry]] | `:budget` |
| `notificationsWithSubscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:notifications-with-subscribers` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
"
  [^CfnBudget$Builder builder id config]
  (when-some [data (lookup-entry config id :budget)]
    (. builder budget data))
  (when-some [data (lookup-entry config id :notifications-with-subscribers)]
    (. builder notificationsWithSubscribers data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (.build builder))


(defn cfn-budget-builder
  "Creates a  `CfnBudget$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-budget-builder (CfnBudget$Builder/create scope (name id)) id config))


(defn build-cfn-budget-cost-types-property-builder
  "The build-cfn-budget-cost-types-property-builder function updates a CfnBudget$CostTypesProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$CostTypesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `useBlended` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-blended` |
"
  [^CfnBudget$CostTypesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :include-credit)]
    (. builder includeCredit data))
  (when-some [data (lookup-entry config id :include-discount)]
    (. builder includeDiscount data))
  (when-some [data (lookup-entry config id :include-other-subscription)]
    (. builder includeOtherSubscription data))
  (when-some [data (lookup-entry config id :include-recurring)]
    (. builder includeRecurring data))
  (when-some [data (lookup-entry config id :include-refund)]
    (. builder includeRefund data))
  (when-some [data (lookup-entry config id :include-subscription)]
    (. builder includeSubscription data))
  (when-some [data (lookup-entry config id :include-support)]
    (. builder includeSupport data))
  (when-some [data (lookup-entry config id :include-tax)]
    (. builder includeTax data))
  (when-some [data (lookup-entry config id :include-upfront)]
    (. builder includeUpfront data))
  (when-some [data (lookup-entry config id :use-amortized)]
    (. builder useAmortized data))
  (when-some [data (lookup-entry config id :use-blended)]
    (. builder useBlended data))
  (.build builder))


(defn cfn-budget-cost-types-property-builder
  "Creates a  `CfnBudget$CostTypesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-cost-types-property-builder (new CfnBudget$CostTypesProperty$Builder) id config))


(defn build-cfn-budget-historical-options-property-builder
  "The build-cfn-budget-historical-options-property-builder function updates a CfnBudget$HistoricalOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$HistoricalOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `budgetAdjustmentPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:budget-adjustment-period` |
"
  [^CfnBudget$HistoricalOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :budget-adjustment-period)]
    (. builder budgetAdjustmentPeriod data))
  (.build builder))


(defn cfn-budget-historical-options-property-builder
  "Creates a  `CfnBudget$HistoricalOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-historical-options-property-builder (new CfnBudget$HistoricalOptionsProperty$Builder) id config))


(defn build-cfn-budget-notification-property-builder
  "The build-cfn-budget-notification-property-builder function updates a CfnBudget$NotificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$NotificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `notificationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-type` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `thresholdType` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold-type` |
"
  [^CfnBudget$NotificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :notification-type)]
    (. builder notificationType data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :threshold-type)]
    (. builder thresholdType data))
  (.build builder))


(defn cfn-budget-notification-property-builder
  "Creates a  `CfnBudget$NotificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-notification-property-builder (new CfnBudget$NotificationProperty$Builder) id config))


(defn build-cfn-budget-notification-with-subscribers-property-builder
  "The build-cfn-budget-notification-with-subscribers-property-builder function updates a CfnBudget$NotificationWithSubscribersProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$NotificationWithSubscribersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notification` | software.amazon.awscdk.services.budgets.CfnBudget$NotificationProperty | [[cdk.support/lookup-entry]] | `:notification` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |
"
  [^CfnBudget$NotificationWithSubscribersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :notification)]
    (. builder notification data))
  (when-some [data (lookup-entry config id :subscribers)]
    (. builder subscribers data))
  (.build builder))


(defn cfn-budget-notification-with-subscribers-property-builder
  "Creates a  `CfnBudget$NotificationWithSubscribersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-notification-with-subscribers-property-builder (new CfnBudget$NotificationWithSubscribersProperty$Builder) id config))


(defn build-cfn-budget-props-builder
  "The build-cfn-budget-props-builder function updates a CfnBudgetProps$Builder instance using the provided configuration.
  The function takes the CfnBudgetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `budget` | software.amazon.awscdk.services.budgets.CfnBudget$BudgetDataProperty | [[cdk.support/lookup-entry]] | `:budget` |
| `notificationsWithSubscribers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notifications-with-subscribers` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
"
  [^CfnBudgetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :budget)]
    (. builder budget data))
  (when-some [data (lookup-entry config id :notifications-with-subscribers)]
    (. builder notificationsWithSubscribers data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (.build builder))


(defn cfn-budget-props-builder
  "Creates a  `CfnBudgetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-props-builder (new CfnBudgetProps$Builder) id config))


(defn build-cfn-budget-resource-tag-property-builder
  "The build-cfn-budget-resource-tag-property-builder function updates a CfnBudget$ResourceTagProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$ResourceTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBudget$ResourceTagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-budget-resource-tag-property-builder
  "Creates a  `CfnBudget$ResourceTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-resource-tag-property-builder (new CfnBudget$ResourceTagProperty$Builder) id config))


(defn build-cfn-budget-spend-property-builder
  "The build-cfn-budget-spend-property-builder function updates a CfnBudget$SpendProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$SpendProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amount` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnBudget$SpendProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amount)]
    (. builder amount data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-budget-spend-property-builder
  "Creates a  `CfnBudget$SpendProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-spend-property-builder (new CfnBudget$SpendProperty$Builder) id config))


(defn build-cfn-budget-subscriber-property-builder
  "The build-cfn-budget-subscriber-property-builder function updates a CfnBudget$SubscriberProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$SubscriberProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `subscriptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-type` |
"
  [^CfnBudget$SubscriberProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :subscription-type)]
    (. builder subscriptionType data))
  (.build builder))


(defn cfn-budget-subscriber-property-builder
  "Creates a  `CfnBudget$SubscriberProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-subscriber-property-builder (new CfnBudget$SubscriberProperty$Builder) id config))


(defn build-cfn-budget-time-period-property-builder
  "The build-cfn-budget-time-period-property-builder function updates a CfnBudget$TimePeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnBudget$TimePeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
"
  [^CfnBudget$TimePeriodProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (.build builder))


(defn cfn-budget-time-period-property-builder
  "Creates a  `CfnBudget$TimePeriodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budget-time-period-property-builder (new CfnBudget$TimePeriodProperty$Builder) id config))


(defn build-cfn-budgets-action-action-threshold-property-builder
  "The build-cfn-budgets-action-action-threshold-property-builder function updates a CfnBudgetsAction$ActionThresholdProperty$Builder instance using the provided configuration.
  The function takes the CfnBudgetsAction$ActionThresholdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBudgetsAction$ActionThresholdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-budgets-action-action-threshold-property-builder
  "Creates a  `CfnBudgetsAction$ActionThresholdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budgets-action-action-threshold-property-builder (new CfnBudgetsAction$ActionThresholdProperty$Builder) id config))


(defn build-cfn-budgets-action-builder
  "The build-cfn-budgets-action-builder function updates a CfnBudgetsAction$Builder instance using the provided configuration.
  The function takes the CfnBudgetsAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `subscribers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subscribers` |
"
  [^CfnBudgetsAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-threshold)]
    (. builder actionThreshold data))
  (when-some [data (lookup-entry config id :action-type)]
    (. builder actionType data))
  (when-some [data (lookup-entry config id :approval-model)]
    (. builder approvalModel data))
  (when-some [data (lookup-entry config id :budget-name)]
    (. builder budgetName data))
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :notification-type)]
    (. builder notificationType data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :subscribers)]
    (. builder subscribers data))
  (.build builder))


(defn cfn-budgets-action-builder
  "Creates a  `CfnBudgetsAction$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-budgets-action-builder (CfnBudgetsAction$Builder/create scope (name id)) id config))


(defn build-cfn-budgets-action-definition-property-builder
  "The build-cfn-budgets-action-definition-property-builder function updates a CfnBudgetsAction$DefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnBudgetsAction$DefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamActionDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam-action-definition` |
| `scpActionDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scp-action-definition` |
| `ssmActionDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ssm-action-definition` |
"
  [^CfnBudgetsAction$DefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iam-action-definition)]
    (. builder iamActionDefinition data))
  (when-some [data (lookup-entry config id :scp-action-definition)]
    (. builder scpActionDefinition data))
  (when-some [data (lookup-entry config id :ssm-action-definition)]
    (. builder ssmActionDefinition data))
  (.build builder))


(defn cfn-budgets-action-definition-property-builder
  "Creates a  `CfnBudgetsAction$DefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budgets-action-definition-property-builder (new CfnBudgetsAction$DefinitionProperty$Builder) id config))


(defn build-cfn-budgets-action-iam-action-definition-property-builder
  "The build-cfn-budgets-action-iam-action-definition-property-builder function updates a CfnBudgetsAction$IamActionDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnBudgetsAction$IamActionDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-arn` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnBudgetsAction$IamActionDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :policy-arn)]
    (. builder policyArn data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn cfn-budgets-action-iam-action-definition-property-builder
  "Creates a  `CfnBudgetsAction$IamActionDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budgets-action-iam-action-definition-property-builder (new CfnBudgetsAction$IamActionDefinitionProperty$Builder) id config))


(defn build-cfn-budgets-action-props-builder
  "The build-cfn-budgets-action-props-builder function updates a CfnBudgetsActionProps$Builder instance using the provided configuration.
  The function takes the CfnBudgetsActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |
"
  [^CfnBudgetsActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-threshold)]
    (. builder actionThreshold data))
  (when-some [data (lookup-entry config id :action-type)]
    (. builder actionType data))
  (when-some [data (lookup-entry config id :approval-model)]
    (. builder approvalModel data))
  (when-some [data (lookup-entry config id :budget-name)]
    (. builder budgetName data))
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :notification-type)]
    (. builder notificationType data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :subscribers)]
    (. builder subscribers data))
  (.build builder))


(defn cfn-budgets-action-props-builder
  "Creates a  `CfnBudgetsActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budgets-action-props-builder (new CfnBudgetsActionProps$Builder) id config))


(defn build-cfn-budgets-action-resource-tag-property-builder
  "The build-cfn-budgets-action-resource-tag-property-builder function updates a CfnBudgetsAction$ResourceTagProperty$Builder instance using the provided configuration.
  The function takes the CfnBudgetsAction$ResourceTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBudgetsAction$ResourceTagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-budgets-action-resource-tag-property-builder
  "Creates a  `CfnBudgetsAction$ResourceTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budgets-action-resource-tag-property-builder (new CfnBudgetsAction$ResourceTagProperty$Builder) id config))


(defn build-cfn-budgets-action-scp-action-definition-property-builder
  "The build-cfn-budgets-action-scp-action-definition-property-builder function updates a CfnBudgetsAction$ScpActionDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnBudgetsAction$ScpActionDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-id` |
| `targetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:target-ids` |
"
  [^CfnBudgetsAction$ScpActionDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-id)]
    (. builder policyId data))
  (when-some [data (lookup-entry config id :target-ids)]
    (. builder targetIds data))
  (.build builder))


(defn cfn-budgets-action-scp-action-definition-property-builder
  "Creates a  `CfnBudgetsAction$ScpActionDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budgets-action-scp-action-definition-property-builder (new CfnBudgetsAction$ScpActionDefinitionProperty$Builder) id config))


(defn build-cfn-budgets-action-ssm-action-definition-property-builder
  "The build-cfn-budgets-action-ssm-action-definition-property-builder function updates a CfnBudgetsAction$SsmActionDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnBudgetsAction$SsmActionDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-ids` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `subtype` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtype` |
"
  [^CfnBudgetsAction$SsmActionDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-ids)]
    (. builder instanceIds data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :subtype)]
    (. builder subtype data))
  (.build builder))


(defn cfn-budgets-action-ssm-action-definition-property-builder
  "Creates a  `CfnBudgetsAction$SsmActionDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budgets-action-ssm-action-definition-property-builder (new CfnBudgetsAction$SsmActionDefinitionProperty$Builder) id config))


(defn build-cfn-budgets-action-subscriber-property-builder
  "The build-cfn-budgets-action-subscriber-property-builder function updates a CfnBudgetsAction$SubscriberProperty$Builder instance using the provided configuration.
  The function takes the CfnBudgetsAction$SubscriberProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnBudgetsAction$SubscriberProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-budgets-action-subscriber-property-builder
  "Creates a  `CfnBudgetsAction$SubscriberProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-budgets-action-subscriber-property-builder (new CfnBudgetsAction$SubscriberProperty$Builder) id config))