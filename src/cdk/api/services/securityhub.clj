(ns cdk.api.services.securityhub
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.securityhub package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.securityhub CfnAutomationRule$AutomationRulesActionProperty$Builder
                                                        CfnAutomationRule$AutomationRulesFindingFieldsUpdateProperty$Builder
                                                        CfnAutomationRule$AutomationRulesFindingFiltersProperty$Builder
                                                        CfnAutomationRule$Builder
                                                        CfnAutomationRule$DateFilterProperty$Builder
                                                        CfnAutomationRule$DateRangeProperty$Builder
                                                        CfnAutomationRule$MapFilterProperty$Builder
                                                        CfnAutomationRule$NoteUpdateProperty$Builder
                                                        CfnAutomationRule$NumberFilterProperty$Builder
                                                        CfnAutomationRule$RelatedFindingProperty$Builder
                                                        CfnAutomationRule$SeverityUpdateProperty$Builder
                                                        CfnAutomationRule$StringFilterProperty$Builder
                                                        CfnAutomationRule$WorkflowUpdateProperty$Builder
                                                        CfnAutomationRuleProps$Builder
                                                        CfnDelegatedAdmin$Builder
                                                        CfnDelegatedAdminProps$Builder
                                                        CfnHub$Builder
                                                        CfnHubProps$Builder
                                                        CfnInsight$AwsSecurityFindingFiltersProperty$Builder
                                                        CfnInsight$BooleanFilterProperty$Builder
                                                        CfnInsight$Builder
                                                        CfnInsight$DateFilterProperty$Builder
                                                        CfnInsight$DateRangeProperty$Builder
                                                        CfnInsight$IpFilterProperty$Builder
                                                        CfnInsight$KeywordFilterProperty$Builder
                                                        CfnInsight$MapFilterProperty$Builder
                                                        CfnInsight$NumberFilterProperty$Builder
                                                        CfnInsight$StringFilterProperty$Builder
                                                        CfnInsightProps$Builder
                                                        CfnProductSubscription$Builder
                                                        CfnProductSubscriptionProps$Builder
                                                        CfnSecurityControl$Builder
                                                        CfnSecurityControl$ParameterConfigurationProperty$Builder
                                                        CfnSecurityControlProps$Builder
                                                        CfnStandard$Builder
                                                        CfnStandard$StandardsControlProperty$Builder
                                                        CfnStandardProps$Builder]))


(defn build-cfn-automation-rule-automation-rules-action-property-builder
  "The build-cfn-automation-rule-automation-rules-action-property-builder function updates a CfnAutomationRule$AutomationRulesActionProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$AutomationRulesActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `findingFieldsUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-fields-update` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAutomationRule$AutomationRulesActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :finding-fields-update)]
    (. builder findingFieldsUpdate data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-automation-rule-automation-rules-finding-fields-update-property-builder
  "The build-cfn-automation-rule-automation-rules-finding-fields-update-property-builder function updates a CfnAutomationRule$AutomationRulesFindingFieldsUpdateProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$AutomationRulesFindingFieldsUpdateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `confidence` | java.lang.Number | [[cdk.support/lookup-entry]] | `:confidence` |
| `criticality` | java.lang.Number | [[cdk.support/lookup-entry]] | `:criticality` |
| `note` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:note` |
| `relatedFindings` | java.util.List | [[cdk.support/lookup-entry]] | `:related-findings` |
| `severity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:severity` |
| `types` | java.util.List | [[cdk.support/lookup-entry]] | `:types` |
| `userDefinedFields` | java.util.Map | [[cdk.support/lookup-entry]] | `:user-defined-fields` |
| `verificationState` | java.lang.String | [[cdk.support/lookup-entry]] | `:verification-state` |
| `workflow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflow` |
"
  [^CfnAutomationRule$AutomationRulesFindingFieldsUpdateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :confidence)]
    (. builder confidence data))
  (when-let [data (lookup-entry config id :criticality)]
    (. builder criticality data))
  (when-let [data (lookup-entry config id :note)]
    (. builder note data))
  (when-let [data (lookup-entry config id :related-findings)]
    (. builder relatedFindings data))
  (when-let [data (lookup-entry config id :severity)]
    (. builder severity data))
  (when-let [data (lookup-entry config id :types)]
    (. builder types data))
  (when-let [data (lookup-entry config id :user-defined-fields)]
    (. builder userDefinedFields data))
  (when-let [data (lookup-entry config id :verification-state)]
    (. builder verificationState data))
  (when-let [data (lookup-entry config id :workflow)]
    (. builder workflow data))
  (.build builder))


(defn build-cfn-automation-rule-automation-rules-finding-filters-property-builder
  "The build-cfn-automation-rule-automation-rules-finding-filters-property-builder function updates a CfnAutomationRule$AutomationRulesFindingFiltersProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$AutomationRulesFindingFiltersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `companyName` | java.util.List | [[cdk.support/lookup-entry]] | `:company-name` |
| `complianceAssociatedStandardsId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compliance-associated-standards-id` |
| `complianceSecurityControlId` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-security-control-id` |
| `complianceStatus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compliance-status` |
| `confidence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:confidence` |
| `createdAt` | java.util.List | [[cdk.support/lookup-entry]] | `:created-at` |
| `criticality` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:criticality` |
| `description` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:description` |
| `firstObservedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:first-observed-at` |
| `generatorId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:generator-id` |
| `id` | java.util.List | [[cdk.support/lookup-entry]] | `:id` |
| `lastObservedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:last-observed-at` |
| `noteText` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:note-text` |
| `noteUpdatedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:note-updated-at` |
| `noteUpdatedBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:note-updated-by` |
| `productArn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:product-arn` |
| `productName` | java.util.List | [[cdk.support/lookup-entry]] | `:product-name` |
| `recordState` | java.util.List | [[cdk.support/lookup-entry]] | `:record-state` |
| `relatedFindingsId` | java.util.List | [[cdk.support/lookup-entry]] | `:related-findings-id` |
| `relatedFindingsProductArn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:related-findings-product-arn` |
| `resourceDetailsOther` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-details-other` |
| `resourceId` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-id` |
| `resourcePartition` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-partition` |
| `resourceRegion` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-region` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `resourceType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-type` |
| `severityLabel` | java.util.List | [[cdk.support/lookup-entry]] | `:severity-label` |
| `sourceUrl` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-url` |
| `title` | java.util.List | [[cdk.support/lookup-entry]] | `:title` |
| `type` | java.util.List | [[cdk.support/lookup-entry]] | `:type` |
| `updatedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:updated-at` |
| `userDefinedFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-defined-fields` |
| `verificationState` | java.util.List | [[cdk.support/lookup-entry]] | `:verification-state` |
| `workflowStatus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflow-status` |
"
  [^CfnAutomationRule$AutomationRulesFindingFiltersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-account-id)]
    (. builder awsAccountId data))
  (when-let [data (lookup-entry config id :company-name)]
    (. builder companyName data))
  (when-let [data (lookup-entry config id :compliance-associated-standards-id)]
    (. builder complianceAssociatedStandardsId data))
  (when-let [data (lookup-entry config id :compliance-security-control-id)]
    (. builder complianceSecurityControlId data))
  (when-let [data (lookup-entry config id :compliance-status)]
    (. builder complianceStatus data))
  (when-let [data (lookup-entry config id :confidence)]
    (. builder confidence data))
  (when-let [data (lookup-entry config id :created-at)]
    (. builder createdAt data))
  (when-let [data (lookup-entry config id :criticality)]
    (. builder criticality data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :first-observed-at)]
    (. builder firstObservedAt data))
  (when-let [data (lookup-entry config id :generator-id)]
    (. builder generatorId data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :last-observed-at)]
    (. builder lastObservedAt data))
  (when-let [data (lookup-entry config id :note-text)]
    (. builder noteText data))
  (when-let [data (lookup-entry config id :note-updated-at)]
    (. builder noteUpdatedAt data))
  (when-let [data (lookup-entry config id :note-updated-by)]
    (. builder noteUpdatedBy data))
  (when-let [data (lookup-entry config id :product-arn)]
    (. builder productArn data))
  (when-let [data (lookup-entry config id :product-name)]
    (. builder productName data))
  (when-let [data (lookup-entry config id :record-state)]
    (. builder recordState data))
  (when-let [data (lookup-entry config id :related-findings-id)]
    (. builder relatedFindingsId data))
  (when-let [data (lookup-entry config id :related-findings-product-arn)]
    (. builder relatedFindingsProductArn data))
  (when-let [data (lookup-entry config id :resource-details-other)]
    (. builder resourceDetailsOther data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :resource-partition)]
    (. builder resourcePartition data))
  (when-let [data (lookup-entry config id :resource-region)]
    (. builder resourceRegion data))
  (when-let [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :severity-label)]
    (. builder severityLabel data))
  (when-let [data (lookup-entry config id :source-url)]
    (. builder sourceUrl data))
  (when-let [data (lookup-entry config id :title)]
    (. builder title data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :updated-at)]
    (. builder updatedAt data))
  (when-let [data (lookup-entry config id :user-defined-fields)]
    (. builder userDefinedFields data))
  (when-let [data (lookup-entry config id :verification-state)]
    (. builder verificationState data))
  (when-let [data (lookup-entry config id :workflow-status)]
    (. builder workflowStatus data))
  (.build builder))


(defn build-cfn-automation-rule-builder
  "The build-cfn-automation-rule-builder function updates a CfnAutomationRule$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `criteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:criteria` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `isTerminal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-terminal` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `ruleOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-order` |
| `ruleStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAutomationRule$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :criteria)]
    (. builder criteria data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :is-terminal)]
    (. builder isTerminal data))
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :rule-order)]
    (. builder ruleOrder data))
  (when-let [data (lookup-entry config id :rule-status)]
    (. builder ruleStatus data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-automation-rule-date-filter-property-builder
  "The build-cfn-automation-rule-date-filter-property-builder function updates a CfnAutomationRule$DateFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$DateFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dateRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:date-range` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
"
  [^CfnAutomationRule$DateFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :date-range)]
    (. builder dateRange data))
  (when-let [data (lookup-entry config id :end)]
    (. builder end data))
  (when-let [data (lookup-entry config id :start)]
    (. builder start data))
  (.build builder))


(defn build-cfn-automation-rule-date-range-property-builder
  "The build-cfn-automation-rule-date-range-property-builder function updates a CfnAutomationRule$DateRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$DateRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAutomationRule$DateRangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-automation-rule-map-filter-property-builder
  "The build-cfn-automation-rule-map-filter-property-builder function updates a CfnAutomationRule$MapFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$MapFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAutomationRule$MapFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison)]
    (. builder comparison data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-automation-rule-note-update-property-builder
  "The build-cfn-automation-rule-note-update-property-builder function updates a CfnAutomationRule$NoteUpdateProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$NoteUpdateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
| `updatedBy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:updated-by` |
"
  [^CfnAutomationRule$NoteUpdateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :text)]
    (. builder text data))
  (when-let [data (lookup-entry config id :updated-by)]
    (. builder updatedBy data))
  (.build builder))


(defn build-cfn-automation-rule-number-filter-property-builder
  "The build-cfn-automation-rule-number-filter-property-builder function updates a CfnAutomationRule$NumberFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$NumberFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eq` | java.lang.Number | [[cdk.support/lookup-entry]] | `:eq` |
| `gte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gte` |
| `lte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lte` |
"
  [^CfnAutomationRule$NumberFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :eq)]
    (. builder eq data))
  (when-let [data (lookup-entry config id :gte)]
    (. builder gte data))
  (when-let [data (lookup-entry config id :lte)]
    (. builder lte data))
  (.build builder))


(defn build-cfn-automation-rule-props-builder
  "The build-cfn-automation-rule-props-builder function updates a CfnAutomationRuleProps$Builder instance using the provided configuration.
  The function takes the CfnAutomationRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `criteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:criteria` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `isTerminal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-terminal` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `ruleOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-order` |
| `ruleStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAutomationRuleProps$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :criteria)]
    (. builder criteria data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :is-terminal)]
    (. builder isTerminal data))
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :rule-order)]
    (. builder ruleOrder data))
  (when-let [data (lookup-entry config id :rule-status)]
    (. builder ruleStatus data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-automation-rule-related-finding-property-builder
  "The build-cfn-automation-rule-related-finding-property-builder function updates a CfnAutomationRule$RelatedFindingProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$RelatedFindingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.Object | [[cdk.support/lookup-entry]] | `:id` |
| `productArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-arn` |
"
  [^CfnAutomationRule$RelatedFindingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :product-arn)]
    (. builder productArn data))
  (.build builder))


(defn build-cfn-automation-rule-severity-update-property-builder
  "The build-cfn-automation-rule-severity-update-property-builder function updates a CfnAutomationRule$SeverityUpdateProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$SeverityUpdateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `normalized` | java.lang.Number | [[cdk.support/lookup-entry]] | `:normalized` |
| `product` | java.lang.Number | [[cdk.support/lookup-entry]] | `:product` |
"
  [^CfnAutomationRule$SeverityUpdateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :label)]
    (. builder label data))
  (when-let [data (lookup-entry config id :normalized)]
    (. builder normalized data))
  (when-let [data (lookup-entry config id :product)]
    (. builder product data))
  (.build builder))


(defn build-cfn-automation-rule-string-filter-property-builder
  "The build-cfn-automation-rule-string-filter-property-builder function updates a CfnAutomationRule$StringFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$StringFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAutomationRule$StringFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison)]
    (. builder comparison data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-automation-rule-workflow-update-property-builder
  "The build-cfn-automation-rule-workflow-update-property-builder function updates a CfnAutomationRule$WorkflowUpdateProperty$Builder instance using the provided configuration.
  The function takes the CfnAutomationRule$WorkflowUpdateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnAutomationRule$WorkflowUpdateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-delegated-admin-builder
  "The build-cfn-delegated-admin-builder function updates a CfnDelegatedAdmin$Builder instance using the provided configuration.
  The function takes the CfnDelegatedAdmin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-account-id` |
"
  [^CfnDelegatedAdmin$Builder builder id config]
  (when-let [data (lookup-entry config id :admin-account-id)]
    (. builder adminAccountId data))
  (.build builder))


(defn build-cfn-delegated-admin-props-builder
  "The build-cfn-delegated-admin-props-builder function updates a CfnDelegatedAdminProps$Builder instance using the provided configuration.
  The function takes the CfnDelegatedAdminProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-account-id` |
"
  [^CfnDelegatedAdminProps$Builder builder id config]
  (when-let [data (lookup-entry config id :admin-account-id)]
    (. builder adminAccountId data))
  (.build builder))


(defn build-cfn-hub-builder
  "The build-cfn-hub-builder function updates a CfnHub$Builder instance using the provided configuration.
  The function takes the CfnHub$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableControls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enable-controls` |
| `controlFindingGenerator` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-finding-generator` |
| `enableDefaultStandards` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-default-standards` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnHub$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-enable-controls)]
    (. builder autoEnableControls data))
  (when-let [data (lookup-entry config id :control-finding-generator)]
    (. builder controlFindingGenerator data))
  (when-let [data (lookup-entry config id :enable-default-standards)]
    (. builder enableDefaultStandards data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-hub-props-builder
  "The build-cfn-hub-props-builder function updates a CfnHubProps$Builder instance using the provided configuration.
  The function takes the CfnHubProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableControls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enable-controls` |
| `controlFindingGenerator` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-finding-generator` |
| `enableDefaultStandards` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-default-standards` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnHubProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-enable-controls)]
    (. builder autoEnableControls data))
  (when-let [data (lookup-entry config id :control-finding-generator)]
    (. builder controlFindingGenerator data))
  (when-let [data (lookup-entry config id :enable-default-standards)]
    (. builder enableDefaultStandards data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-insight-aws-security-finding-filters-property-builder
  "The build-cfn-insight-aws-security-finding-filters-property-builder function updates a CfnInsight$AwsSecurityFindingFiltersProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$AwsSecurityFindingFiltersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `awsAccountName` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-account-name` |
| `companyName` | java.util.List | [[cdk.support/lookup-entry]] | `:company-name` |
| `complianceAssociatedStandardsId` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-associated-standards-id` |
| `complianceSecurityControlId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compliance-security-control-id` |
| `complianceSecurityControlParametersName` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-security-control-parameters-name` |
| `complianceSecurityControlParametersValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compliance-security-control-parameters-value` |
| `complianceStatus` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-status` |
| `confidence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:confidence` |
| `createdAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:created-at` |
| `criticality` | java.util.List | [[cdk.support/lookup-entry]] | `:criticality` |
| `description` | java.util.List | [[cdk.support/lookup-entry]] | `:description` |
| `findingProviderFieldsConfidence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-provider-fields-confidence` |
| `findingProviderFieldsCriticality` | java.util.List | [[cdk.support/lookup-entry]] | `:finding-provider-fields-criticality` |
| `findingProviderFieldsRelatedFindingsId` | java.util.List | [[cdk.support/lookup-entry]] | `:finding-provider-fields-related-findings-id` |
| `findingProviderFieldsRelatedFindingsProductArn` | java.util.List | [[cdk.support/lookup-entry]] | `:finding-provider-fields-related-findings-product-arn` |
| `findingProviderFieldsSeverityLabel` | java.util.List | [[cdk.support/lookup-entry]] | `:finding-provider-fields-severity-label` |
| `findingProviderFieldsSeverityOriginal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-provider-fields-severity-original` |
| `findingProviderFieldsTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-provider-fields-types` |
| `firstObservedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:first-observed-at` |
| `generatorId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:generator-id` |
| `id` | java.util.List | [[cdk.support/lookup-entry]] | `:id` |
| `keyword` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:keyword` |
| `lastObservedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-observed-at` |
| `malwareName` | java.util.List | [[cdk.support/lookup-entry]] | `:malware-name` |
| `malwarePath` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:malware-path` |
| `malwareState` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:malware-state` |
| `malwareType` | java.util.List | [[cdk.support/lookup-entry]] | `:malware-type` |
| `networkDestinationDomain` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-destination-domain` |
| `networkDestinationIpV4` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-destination-ip-v4` |
| `networkDestinationIpV6` | java.util.List | [[cdk.support/lookup-entry]] | `:network-destination-ip-v6` |
| `networkDestinationPort` | java.util.List | [[cdk.support/lookup-entry]] | `:network-destination-port` |
| `networkDirection` | java.util.List | [[cdk.support/lookup-entry]] | `:network-direction` |
| `networkProtocol` | java.util.List | [[cdk.support/lookup-entry]] | `:network-protocol` |
| `networkSourceDomain` | java.util.List | [[cdk.support/lookup-entry]] | `:network-source-domain` |
| `networkSourceIpV4` | java.util.List | [[cdk.support/lookup-entry]] | `:network-source-ip-v4` |
| `networkSourceIpV6` | java.util.List | [[cdk.support/lookup-entry]] | `:network-source-ip-v6` |
| `networkSourceMac` | java.util.List | [[cdk.support/lookup-entry]] | `:network-source-mac` |
| `networkSourcePort` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-source-port` |
| `noteText` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:note-text` |
| `noteUpdatedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:note-updated-at` |
| `noteUpdatedBy` | java.util.List | [[cdk.support/lookup-entry]] | `:note-updated-by` |
| `processLaunchedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:process-launched-at` |
| `processName` | java.util.List | [[cdk.support/lookup-entry]] | `:process-name` |
| `processParentPid` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:process-parent-pid` |
| `processPath` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:process-path` |
| `processPid` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:process-pid` |
| `processTerminatedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:process-terminated-at` |
| `productArn` | java.util.List | [[cdk.support/lookup-entry]] | `:product-arn` |
| `productFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:product-fields` |
| `productName` | java.util.List | [[cdk.support/lookup-entry]] | `:product-name` |
| `recommendationText` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recommendation-text` |
| `recordState` | java.util.List | [[cdk.support/lookup-entry]] | `:record-state` |
| `region` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:region` |
| `relatedFindingsId` | java.util.List | [[cdk.support/lookup-entry]] | `:related-findings-id` |
| `relatedFindingsProductArn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:related-findings-product-arn` |
| `resourceApplicationArn` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-application-arn` |
| `resourceApplicationName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-application-name` |
| `resourceAwsEc2InstanceIamInstanceProfileArn` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-iam-instance-profile-arn` |
| `resourceAwsEc2InstanceImageId` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-image-id` |
| `resourceAwsEc2InstanceIpV4Addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-ip-v4-addresses` |
| `resourceAwsEc2InstanceIpV6Addresses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-ip-v6-addresses` |
| `resourceAwsEc2InstanceKeyName` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-key-name` |
| `resourceAwsEc2InstanceLaunchedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-launched-at` |
| `resourceAwsEc2InstanceSubnetId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-subnet-id` |
| `resourceAwsEc2InstanceType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-type` |
| `resourceAwsEc2InstanceVpcId` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-ec2-instance-vpc-id` |
| `resourceAwsIamAccessKeyCreatedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-iam-access-key-created-at` |
| `resourceAwsIamAccessKeyPrincipalName` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-iam-access-key-principal-name` |
| `resourceAwsIamAccessKeyStatus` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-iam-access-key-status` |
| `resourceAwsIamAccessKeyUserName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-aws-iam-access-key-user-name` |
| `resourceAwsIamUserUserName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-aws-iam-user-user-name` |
| `resourceAwsS3BucketOwnerId` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-s3-bucket-owner-id` |
| `resourceAwsS3BucketOwnerName` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-aws-s3-bucket-owner-name` |
| `resourceContainerImageId` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-container-image-id` |
| `resourceContainerImageName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-container-image-name` |
| `resourceContainerLaunchedAt` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-container-launched-at` |
| `resourceContainerName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-container-name` |
| `resourceDetailsOther` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-details-other` |
| `resourceId` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-id` |
| `resourcePartition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-partition` |
| `resourceRegion` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-region` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `resourceType` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type` |
| `sample` | java.util.List | [[cdk.support/lookup-entry]] | `:sample` |
| `severityLabel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:severity-label` |
| `severityNormalized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:severity-normalized` |
| `severityProduct` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:severity-product` |
| `sourceUrl` | java.util.List | [[cdk.support/lookup-entry]] | `:source-url` |
| `threatIntelIndicatorCategory` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:threat-intel-indicator-category` |
| `threatIntelIndicatorLastObservedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:threat-intel-indicator-last-observed-at` |
| `threatIntelIndicatorSource` | java.util.List | [[cdk.support/lookup-entry]] | `:threat-intel-indicator-source` |
| `threatIntelIndicatorSourceUrl` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:threat-intel-indicator-source-url` |
| `threatIntelIndicatorType` | java.util.List | [[cdk.support/lookup-entry]] | `:threat-intel-indicator-type` |
| `threatIntelIndicatorValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:threat-intel-indicator-value` |
| `title` | java.util.List | [[cdk.support/lookup-entry]] | `:title` |
| `type` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:type` |
| `updatedAt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:updated-at` |
| `userDefinedFields` | java.util.List | [[cdk.support/lookup-entry]] | `:user-defined-fields` |
| `verificationState` | java.util.List | [[cdk.support/lookup-entry]] | `:verification-state` |
| `vulnerabilitiesExploitAvailable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vulnerabilities-exploit-available` |
| `vulnerabilitiesFixAvailable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vulnerabilities-fix-available` |
| `workflowState` | java.util.List | [[cdk.support/lookup-entry]] | `:workflow-state` |
| `workflowStatus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflow-status` |
"
  [^CfnInsight$AwsSecurityFindingFiltersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-account-id)]
    (. builder awsAccountId data))
  (when-let [data (lookup-entry config id :aws-account-name)]
    (. builder awsAccountName data))
  (when-let [data (lookup-entry config id :company-name)]
    (. builder companyName data))
  (when-let [data (lookup-entry config id :compliance-associated-standards-id)]
    (. builder complianceAssociatedStandardsId data))
  (when-let [data (lookup-entry config id :compliance-security-control-id)]
    (. builder complianceSecurityControlId data))
  (when-let [data (lookup-entry config id :compliance-security-control-parameters-name)]
    (. builder complianceSecurityControlParametersName data))
  (when-let [data (lookup-entry config id :compliance-security-control-parameters-value)]
    (. builder complianceSecurityControlParametersValue data))
  (when-let [data (lookup-entry config id :compliance-status)]
    (. builder complianceStatus data))
  (when-let [data (lookup-entry config id :confidence)]
    (. builder confidence data))
  (when-let [data (lookup-entry config id :created-at)]
    (. builder createdAt data))
  (when-let [data (lookup-entry config id :criticality)]
    (. builder criticality data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :finding-provider-fields-confidence)]
    (. builder findingProviderFieldsConfidence data))
  (when-let [data (lookup-entry config id :finding-provider-fields-criticality)]
    (. builder findingProviderFieldsCriticality data))
  (when-let [data (lookup-entry config id :finding-provider-fields-related-findings-id)]
    (. builder findingProviderFieldsRelatedFindingsId data))
  (when-let [data (lookup-entry config id :finding-provider-fields-related-findings-product-arn)]
    (. builder findingProviderFieldsRelatedFindingsProductArn data))
  (when-let [data (lookup-entry config id :finding-provider-fields-severity-label)]
    (. builder findingProviderFieldsSeverityLabel data))
  (when-let [data (lookup-entry config id :finding-provider-fields-severity-original)]
    (. builder findingProviderFieldsSeverityOriginal data))
  (when-let [data (lookup-entry config id :finding-provider-fields-types)]
    (. builder findingProviderFieldsTypes data))
  (when-let [data (lookup-entry config id :first-observed-at)]
    (. builder firstObservedAt data))
  (when-let [data (lookup-entry config id :generator-id)]
    (. builder generatorId data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :keyword)]
    (. builder keyword data))
  (when-let [data (lookup-entry config id :last-observed-at)]
    (. builder lastObservedAt data))
  (when-let [data (lookup-entry config id :malware-name)]
    (. builder malwareName data))
  (when-let [data (lookup-entry config id :malware-path)]
    (. builder malwarePath data))
  (when-let [data (lookup-entry config id :malware-state)]
    (. builder malwareState data))
  (when-let [data (lookup-entry config id :malware-type)]
    (. builder malwareType data))
  (when-let [data (lookup-entry config id :network-destination-domain)]
    (. builder networkDestinationDomain data))
  (when-let [data (lookup-entry config id :network-destination-ip-v4)]
    (. builder networkDestinationIpV4 data))
  (when-let [data (lookup-entry config id :network-destination-ip-v6)]
    (. builder networkDestinationIpV6 data))
  (when-let [data (lookup-entry config id :network-destination-port)]
    (. builder networkDestinationPort data))
  (when-let [data (lookup-entry config id :network-direction)]
    (. builder networkDirection data))
  (when-let [data (lookup-entry config id :network-protocol)]
    (. builder networkProtocol data))
  (when-let [data (lookup-entry config id :network-source-domain)]
    (. builder networkSourceDomain data))
  (when-let [data (lookup-entry config id :network-source-ip-v4)]
    (. builder networkSourceIpV4 data))
  (when-let [data (lookup-entry config id :network-source-ip-v6)]
    (. builder networkSourceIpV6 data))
  (when-let [data (lookup-entry config id :network-source-mac)]
    (. builder networkSourceMac data))
  (when-let [data (lookup-entry config id :network-source-port)]
    (. builder networkSourcePort data))
  (when-let [data (lookup-entry config id :note-text)]
    (. builder noteText data))
  (when-let [data (lookup-entry config id :note-updated-at)]
    (. builder noteUpdatedAt data))
  (when-let [data (lookup-entry config id :note-updated-by)]
    (. builder noteUpdatedBy data))
  (when-let [data (lookup-entry config id :process-launched-at)]
    (. builder processLaunchedAt data))
  (when-let [data (lookup-entry config id :process-name)]
    (. builder processName data))
  (when-let [data (lookup-entry config id :process-parent-pid)]
    (. builder processParentPid data))
  (when-let [data (lookup-entry config id :process-path)]
    (. builder processPath data))
  (when-let [data (lookup-entry config id :process-pid)]
    (. builder processPid data))
  (when-let [data (lookup-entry config id :process-terminated-at)]
    (. builder processTerminatedAt data))
  (when-let [data (lookup-entry config id :product-arn)]
    (. builder productArn data))
  (when-let [data (lookup-entry config id :product-fields)]
    (. builder productFields data))
  (when-let [data (lookup-entry config id :product-name)]
    (. builder productName data))
  (when-let [data (lookup-entry config id :recommendation-text)]
    (. builder recommendationText data))
  (when-let [data (lookup-entry config id :record-state)]
    (. builder recordState data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :related-findings-id)]
    (. builder relatedFindingsId data))
  (when-let [data (lookup-entry config id :related-findings-product-arn)]
    (. builder relatedFindingsProductArn data))
  (when-let [data (lookup-entry config id :resource-application-arn)]
    (. builder resourceApplicationArn data))
  (when-let [data (lookup-entry config id :resource-application-name)]
    (. builder resourceApplicationName data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-iam-instance-profile-arn)]
    (. builder resourceAwsEc2InstanceIamInstanceProfileArn data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-image-id)]
    (. builder resourceAwsEc2InstanceImageId data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-ip-v4-addresses)]
    (. builder resourceAwsEc2InstanceIpV4Addresses data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-ip-v6-addresses)]
    (. builder resourceAwsEc2InstanceIpV6Addresses data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-key-name)]
    (. builder resourceAwsEc2InstanceKeyName data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-launched-at)]
    (. builder resourceAwsEc2InstanceLaunchedAt data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-subnet-id)]
    (. builder resourceAwsEc2InstanceSubnetId data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-type)]
    (. builder resourceAwsEc2InstanceType data))
  (when-let [data (lookup-entry config id :resource-aws-ec2-instance-vpc-id)]
    (. builder resourceAwsEc2InstanceVpcId data))
  (when-let [data (lookup-entry config id :resource-aws-iam-access-key-created-at)]
    (. builder resourceAwsIamAccessKeyCreatedAt data))
  (when-let [data (lookup-entry config id :resource-aws-iam-access-key-principal-name)]
    (. builder resourceAwsIamAccessKeyPrincipalName data))
  (when-let [data (lookup-entry config id :resource-aws-iam-access-key-status)]
    (. builder resourceAwsIamAccessKeyStatus data))
  (when-let [data (lookup-entry config id :resource-aws-iam-access-key-user-name)]
    (. builder resourceAwsIamAccessKeyUserName data))
  (when-let [data (lookup-entry config id :resource-aws-iam-user-user-name)]
    (. builder resourceAwsIamUserUserName data))
  (when-let [data (lookup-entry config id :resource-aws-s3-bucket-owner-id)]
    (. builder resourceAwsS3BucketOwnerId data))
  (when-let [data (lookup-entry config id :resource-aws-s3-bucket-owner-name)]
    (. builder resourceAwsS3BucketOwnerName data))
  (when-let [data (lookup-entry config id :resource-container-image-id)]
    (. builder resourceContainerImageId data))
  (when-let [data (lookup-entry config id :resource-container-image-name)]
    (. builder resourceContainerImageName data))
  (when-let [data (lookup-entry config id :resource-container-launched-at)]
    (. builder resourceContainerLaunchedAt data))
  (when-let [data (lookup-entry config id :resource-container-name)]
    (. builder resourceContainerName data))
  (when-let [data (lookup-entry config id :resource-details-other)]
    (. builder resourceDetailsOther data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :resource-partition)]
    (. builder resourcePartition data))
  (when-let [data (lookup-entry config id :resource-region)]
    (. builder resourceRegion data))
  (when-let [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :sample)]
    (. builder sample data))
  (when-let [data (lookup-entry config id :severity-label)]
    (. builder severityLabel data))
  (when-let [data (lookup-entry config id :severity-normalized)]
    (. builder severityNormalized data))
  (when-let [data (lookup-entry config id :severity-product)]
    (. builder severityProduct data))
  (when-let [data (lookup-entry config id :source-url)]
    (. builder sourceUrl data))
  (when-let [data (lookup-entry config id :threat-intel-indicator-category)]
    (. builder threatIntelIndicatorCategory data))
  (when-let [data (lookup-entry config id :threat-intel-indicator-last-observed-at)]
    (. builder threatIntelIndicatorLastObservedAt data))
  (when-let [data (lookup-entry config id :threat-intel-indicator-source)]
    (. builder threatIntelIndicatorSource data))
  (when-let [data (lookup-entry config id :threat-intel-indicator-source-url)]
    (. builder threatIntelIndicatorSourceUrl data))
  (when-let [data (lookup-entry config id :threat-intel-indicator-type)]
    (. builder threatIntelIndicatorType data))
  (when-let [data (lookup-entry config id :threat-intel-indicator-value)]
    (. builder threatIntelIndicatorValue data))
  (when-let [data (lookup-entry config id :title)]
    (. builder title data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :updated-at)]
    (. builder updatedAt data))
  (when-let [data (lookup-entry config id :user-defined-fields)]
    (. builder userDefinedFields data))
  (when-let [data (lookup-entry config id :verification-state)]
    (. builder verificationState data))
  (when-let [data (lookup-entry config id :vulnerabilities-exploit-available)]
    (. builder vulnerabilitiesExploitAvailable data))
  (when-let [data (lookup-entry config id :vulnerabilities-fix-available)]
    (. builder vulnerabilitiesFixAvailable data))
  (when-let [data (lookup-entry config id :workflow-state)]
    (. builder workflowState data))
  (when-let [data (lookup-entry config id :workflow-status)]
    (. builder workflowStatus data))
  (.build builder))


(defn build-cfn-insight-boolean-filter-property-builder
  "The build-cfn-insight-boolean-filter-property-builder function updates a CfnInsight$BooleanFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$BooleanFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnInsight$BooleanFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-insight-builder
  "The build-cfn-insight-builder function updates a CfnInsight$Builder instance using the provided configuration.
  The function takes the CfnInsight$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.services.securityhub.CfnInsight$AwsSecurityFindingFiltersProperty | [[cdk.support/lookup-entry]] | `:filters` |
| `groupByAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-by-attribute` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnInsight$Builder builder id config]
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :group-by-attribute)]
    (. builder groupByAttribute data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-insight-date-filter-property-builder
  "The build-cfn-insight-date-filter-property-builder function updates a CfnInsight$DateFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$DateFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dateRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:date-range` |
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
"
  [^CfnInsight$DateFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :date-range)]
    (. builder dateRange data))
  (when-let [data (lookup-entry config id :end)]
    (. builder end data))
  (when-let [data (lookup-entry config id :start)]
    (. builder start data))
  (.build builder))


(defn build-cfn-insight-date-range-property-builder
  "The build-cfn-insight-date-range-property-builder function updates a CfnInsight$DateRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$DateRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnInsight$DateRangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-insight-ip-filter-property-builder
  "The build-cfn-insight-ip-filter-property-builder function updates a CfnInsight$IpFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$IpFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
"
  [^CfnInsight$IpFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cidr)]
    (. builder cidr data))
  (.build builder))


(defn build-cfn-insight-keyword-filter-property-builder
  "The build-cfn-insight-keyword-filter-property-builder function updates a CfnInsight$KeywordFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$KeywordFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnInsight$KeywordFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-insight-map-filter-property-builder
  "The build-cfn-insight-map-filter-property-builder function updates a CfnInsight$MapFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$MapFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnInsight$MapFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison)]
    (. builder comparison data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-insight-number-filter-property-builder
  "The build-cfn-insight-number-filter-property-builder function updates a CfnInsight$NumberFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$NumberFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eq` | java.lang.Number | [[cdk.support/lookup-entry]] | `:eq` |
| `gte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gte` |
| `lte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lte` |
"
  [^CfnInsight$NumberFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :eq)]
    (. builder eq data))
  (when-let [data (lookup-entry config id :gte)]
    (. builder gte data))
  (when-let [data (lookup-entry config id :lte)]
    (. builder lte data))
  (.build builder))


(defn build-cfn-insight-props-builder
  "The build-cfn-insight-props-builder function updates a CfnInsightProps$Builder instance using the provided configuration.
  The function takes the CfnInsightProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.services.securityhub.CfnInsight$AwsSecurityFindingFiltersProperty | [[cdk.support/lookup-entry]] | `:filters` |
| `groupByAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-by-attribute` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnInsightProps$Builder builder id config]
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :group-by-attribute)]
    (. builder groupByAttribute data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-insight-string-filter-property-builder
  "The build-cfn-insight-string-filter-property-builder function updates a CfnInsight$StringFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnInsight$StringFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparison` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnInsight$StringFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison)]
    (. builder comparison data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-product-subscription-builder
  "The build-cfn-product-subscription-builder function updates a CfnProductSubscription$Builder instance using the provided configuration.
  The function takes the CfnProductSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `productArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-arn` |
"
  [^CfnProductSubscription$Builder builder id config]
  (when-let [data (lookup-entry config id :product-arn)]
    (. builder productArn data))
  (.build builder))


(defn build-cfn-product-subscription-props-builder
  "The build-cfn-product-subscription-props-builder function updates a CfnProductSubscriptionProps$Builder instance using the provided configuration.
  The function takes the CfnProductSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `productArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-arn` |
"
  [^CfnProductSubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :product-arn)]
    (. builder productArn data))
  (.build builder))


(defn build-cfn-security-control-builder
  "The build-cfn-security-control-builder function updates a CfnSecurityControl$Builder instance using the provided configuration.
  The function takes the CfnSecurityControl$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lastUpdateReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-update-reason` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `securityControlArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-control-arn` |
| `securityControlId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-control-id` |
"
  [^CfnSecurityControl$Builder builder id config]
  (when-let [data (lookup-entry config id :last-update-reason)]
    (. builder lastUpdateReason data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :security-control-arn)]
    (. builder securityControlArn data))
  (when-let [data (lookup-entry config id :security-control-id)]
    (. builder securityControlId data))
  (.build builder))


(defn build-cfn-security-control-parameter-configuration-property-builder
  "The build-cfn-security-control-parameter-configuration-property-builder function updates a CfnSecurityControl$ParameterConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityControl$ParameterConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `valueType` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-type` |
"
  [^CfnSecurityControl$ParameterConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value-type)]
    (. builder valueType data))
  (.build builder))


(defn build-cfn-security-control-props-builder
  "The build-cfn-security-control-props-builder function updates a CfnSecurityControlProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityControlProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lastUpdateReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-update-reason` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `securityControlArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-control-arn` |
| `securityControlId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-control-id` |
"
  [^CfnSecurityControlProps$Builder builder id config]
  (when-let [data (lookup-entry config id :last-update-reason)]
    (. builder lastUpdateReason data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :security-control-arn)]
    (. builder securityControlArn data))
  (when-let [data (lookup-entry config id :security-control-id)]
    (. builder securityControlId data))
  (.build builder))


(defn build-cfn-standard-builder
  "The build-cfn-standard-builder function updates a CfnStandard$Builder instance using the provided configuration.
  The function takes the CfnStandard$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disabledStandardsControls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disabled-standards-controls` |
| `standardsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:standards-arn` |
"
  [^CfnStandard$Builder builder id config]
  (when-let [data (lookup-entry config id :disabled-standards-controls)]
    (. builder disabledStandardsControls data))
  (when-let [data (lookup-entry config id :standards-arn)]
    (. builder standardsArn data))
  (.build builder))


(defn build-cfn-standard-props-builder
  "The build-cfn-standard-props-builder function updates a CfnStandardProps$Builder instance using the provided configuration.
  The function takes the CfnStandardProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disabledStandardsControls` | java.util.List | [[cdk.support/lookup-entry]] | `:disabled-standards-controls` |
| `standardsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:standards-arn` |
"
  [^CfnStandardProps$Builder builder id config]
  (when-let [data (lookup-entry config id :disabled-standards-controls)]
    (. builder disabledStandardsControls data))
  (when-let [data (lookup-entry config id :standards-arn)]
    (. builder standardsArn data))
  (.build builder))


(defn build-cfn-standard-standards-control-property-builder
  "The build-cfn-standard-standards-control-property-builder function updates a CfnStandard$StandardsControlProperty$Builder instance using the provided configuration.
  The function takes the CfnStandard$StandardsControlProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `standardsControlArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:standards-control-arn` |
"
  [^CfnStandard$StandardsControlProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :reason)]
    (. builder reason data))
  (when-let [data (lookup-entry config id :standards-control-arn)]
    (. builder standardsControlArn data))
  (.build builder))