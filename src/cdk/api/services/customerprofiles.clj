(ns cdk.api.services.customerprofiles
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.customerprofiles package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.customerprofiles CfnCalculatedAttributeDefinition$AttributeDetailsProperty$Builder
                                                             CfnCalculatedAttributeDefinition$AttributeItemProperty$Builder
                                                             CfnCalculatedAttributeDefinition$Builder
                                                             CfnCalculatedAttributeDefinition$ConditionsProperty$Builder
                                                             CfnCalculatedAttributeDefinition$RangeProperty$Builder
                                                             CfnCalculatedAttributeDefinition$ThresholdProperty$Builder
                                                             CfnCalculatedAttributeDefinitionProps$Builder
                                                             CfnDomain$AttributeTypesSelectorProperty$Builder
                                                             CfnDomain$AutoMergingProperty$Builder
                                                             CfnDomain$Builder
                                                             CfnDomain$ConflictResolutionProperty$Builder
                                                             CfnDomain$ConsolidationProperty$Builder
                                                             CfnDomain$DomainStatsProperty$Builder
                                                             CfnDomain$ExportingConfigProperty$Builder
                                                             CfnDomain$JobScheduleProperty$Builder
                                                             CfnDomain$MatchingProperty$Builder
                                                             CfnDomain$MatchingRuleProperty$Builder
                                                             CfnDomain$RuleBasedMatchingProperty$Builder
                                                             CfnDomain$S3ExportingConfigProperty$Builder
                                                             CfnDomainProps$Builder
                                                             CfnEventStream$Builder
                                                             CfnEventStream$DestinationDetailsProperty$Builder
                                                             CfnEventStreamProps$Builder
                                                             CfnIntegration$Builder
                                                             CfnIntegration$ConnectorOperatorProperty$Builder
                                                             CfnIntegration$FlowDefinitionProperty$Builder
                                                             CfnIntegration$IncrementalPullConfigProperty$Builder
                                                             CfnIntegration$MarketoSourcePropertiesProperty$Builder
                                                             CfnIntegration$ObjectTypeMappingProperty$Builder
                                                             CfnIntegration$S3SourcePropertiesProperty$Builder
                                                             CfnIntegration$SalesforceSourcePropertiesProperty$Builder
                                                             CfnIntegration$ScheduledTriggerPropertiesProperty$Builder
                                                             CfnIntegration$ServiceNowSourcePropertiesProperty$Builder
                                                             CfnIntegration$SourceConnectorPropertiesProperty$Builder
                                                             CfnIntegration$SourceFlowConfigProperty$Builder
                                                             CfnIntegration$TaskPropertiesMapProperty$Builder
                                                             CfnIntegration$TaskProperty$Builder
                                                             CfnIntegration$TriggerConfigProperty$Builder
                                                             CfnIntegration$TriggerPropertiesProperty$Builder
                                                             CfnIntegration$ZendeskSourcePropertiesProperty$Builder
                                                             CfnIntegrationProps$Builder
                                                             CfnObjectType$Builder
                                                             CfnObjectType$FieldMapProperty$Builder
                                                             CfnObjectType$KeyMapProperty$Builder
                                                             CfnObjectType$ObjectTypeFieldProperty$Builder
                                                             CfnObjectType$ObjectTypeKeyProperty$Builder
                                                             CfnObjectTypeProps$Builder]))


(defn cfn-calculated-attribute-definition-attribute-details-property-builder>
  "The cfn-calculated-attribute-definition-attribute-details-property-builder> function updates a CfnCalculatedAttributeDefinition$AttributeDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCalculatedAttributeDefinition$AttributeDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
"
  [^CfnCalculatedAttributeDefinition$AttributeDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (.build builder))


(defn cfn-calculated-attribute-definition-attribute-details-property-builder
  "Creates a  `CfnCalculatedAttributeDefinition$AttributeDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-calculated-attribute-definition-attribute-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-calculated-attribute-definition-attribute-details-property-builder> (new CfnCalculatedAttributeDefinition$AttributeDetailsProperty$Builder) id config))


(defn cfn-calculated-attribute-definition-attribute-item-property-builder>
  "The cfn-calculated-attribute-definition-attribute-item-property-builder> function updates a CfnCalculatedAttributeDefinition$AttributeItemProperty$Builder instance using the provided configuration.
  The function takes the CfnCalculatedAttributeDefinition$AttributeItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnCalculatedAttributeDefinition$AttributeItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-calculated-attribute-definition-attribute-item-property-builder
  "Creates a  `CfnCalculatedAttributeDefinition$AttributeItemProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-calculated-attribute-definition-attribute-item-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-calculated-attribute-definition-attribute-item-property-builder> (new CfnCalculatedAttributeDefinition$AttributeItemProperty$Builder) id config))


(defn cfn-calculated-attribute-definition-builder>
  "The cfn-calculated-attribute-definition-builder> function updates a CfnCalculatedAttributeDefinition$Builder instance using the provided configuration.
  The function takes the CfnCalculatedAttributeDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-details` |
| `calculatedAttributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:calculated-attribute-name` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCalculatedAttributeDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-details)]
    (. builder attributeDetails data))
  (when-some [data (lookup-entry config id :calculated-attribute-name)]
    (. builder calculatedAttributeName data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-calculated-attribute-definition-builder
  "Creates a  `CfnCalculatedAttributeDefinition$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-calculated-attribute-definition-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-calculated-attribute-definition-builder> (CfnCalculatedAttributeDefinition$Builder/create scope (name id)) id config))


(defn cfn-calculated-attribute-definition-conditions-property-builder>
  "The cfn-calculated-attribute-definition-conditions-property-builder> function updates a CfnCalculatedAttributeDefinition$ConditionsProperty$Builder instance using the provided configuration.
  The function takes the CfnCalculatedAttributeDefinition$ConditionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:object-count` |
| `range` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:range` |
| `threshold` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:threshold` |
"
  [^CfnCalculatedAttributeDefinition$ConditionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object-count)]
    (. builder objectCount data))
  (when-some [data (lookup-entry config id :range)]
    (. builder range data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (.build builder))


(defn cfn-calculated-attribute-definition-conditions-property-builder
  "Creates a  `CfnCalculatedAttributeDefinition$ConditionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-calculated-attribute-definition-conditions-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-calculated-attribute-definition-conditions-property-builder> (new CfnCalculatedAttributeDefinition$ConditionsProperty$Builder) id config))


(defn cfn-calculated-attribute-definition-props-builder>
  "The cfn-calculated-attribute-definition-props-builder> function updates a CfnCalculatedAttributeDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnCalculatedAttributeDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDetails` | software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition$AttributeDetailsProperty | [[cdk.support/lookup-entry]] | `:attribute-details` |
| `calculatedAttributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:calculated-attribute-name` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCalculatedAttributeDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-details)]
    (. builder attributeDetails data))
  (when-some [data (lookup-entry config id :calculated-attribute-name)]
    (. builder calculatedAttributeName data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-calculated-attribute-definition-props-builder
  "Creates a  `CfnCalculatedAttributeDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-calculated-attribute-definition-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-calculated-attribute-definition-props-builder> (new CfnCalculatedAttributeDefinitionProps$Builder) id config))


(defn cfn-calculated-attribute-definition-range-property-builder>
  "The cfn-calculated-attribute-definition-range-property-builder> function updates a CfnCalculatedAttributeDefinition$RangeProperty$Builder instance using the provided configuration.
  The function takes the CfnCalculatedAttributeDefinition$RangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCalculatedAttributeDefinition$RangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-calculated-attribute-definition-range-property-builder
  "Creates a  `CfnCalculatedAttributeDefinition$RangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-calculated-attribute-definition-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-calculated-attribute-definition-range-property-builder> (new CfnCalculatedAttributeDefinition$RangeProperty$Builder) id config))


(defn cfn-calculated-attribute-definition-threshold-property-builder>
  "The cfn-calculated-attribute-definition-threshold-property-builder> function updates a CfnCalculatedAttributeDefinition$ThresholdProperty$Builder instance using the provided configuration.
  The function takes the CfnCalculatedAttributeDefinition$ThresholdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCalculatedAttributeDefinition$ThresholdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :operator)]
    (. builder operator data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-calculated-attribute-definition-threshold-property-builder
  "Creates a  `CfnCalculatedAttributeDefinition$ThresholdProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-calculated-attribute-definition-threshold-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-calculated-attribute-definition-threshold-property-builder> (new CfnCalculatedAttributeDefinition$ThresholdProperty$Builder) id config))


(defn cfn-domain-attribute-types-selector-property-builder>
  "The cfn-domain-attribute-types-selector-property-builder> function updates a CfnDomain$AttributeTypesSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$AttributeTypesSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.util.List | [[cdk.support/lookup-entry]] | `:address` |
| `attributeMatchingModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-matching-model` |
| `emailAddress` | java.util.List | [[cdk.support/lookup-entry]] | `:email-address` |
| `phoneNumber` | java.util.List | [[cdk.support/lookup-entry]] | `:phone-number` |
"
  [^CfnDomain$AttributeTypesSelectorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :attribute-matching-model)]
    (. builder attributeMatchingModel data))
  (when-some [data (lookup-entry config id :email-address)]
    (. builder emailAddress data))
  (when-some [data (lookup-entry config id :phone-number)]
    (. builder phoneNumber data))
  (.build builder))


(defn cfn-domain-attribute-types-selector-property-builder
  "Creates a  `CfnDomain$AttributeTypesSelectorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-attribute-types-selector-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-attribute-types-selector-property-builder> (new CfnDomain$AttributeTypesSelectorProperty$Builder) id config))


(defn cfn-domain-auto-merging-property-builder>
  "The cfn-domain-auto-merging-property-builder> function updates a CfnDomain$AutoMergingProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$AutoMergingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conflictResolution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conflict-resolution` |
| `consolidation` | software.amazon.awscdk.services.customerprofiles.CfnDomain$ConsolidationProperty | [[cdk.support/lookup-entry]] | `:consolidation` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `minAllowedConfidenceScoreForMerging` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-allowed-confidence-score-for-merging` |
"
  [^CfnDomain$AutoMergingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :conflict-resolution)]
    (. builder conflictResolution data))
  (when-some [data (lookup-entry config id :consolidation)]
    (. builder consolidation data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :min-allowed-confidence-score-for-merging)]
    (. builder minAllowedConfidenceScoreForMerging data))
  (.build builder))


(defn cfn-domain-auto-merging-property-builder
  "Creates a  `CfnDomain$AutoMergingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-auto-merging-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-auto-merging-property-builder> (new CfnDomain$AutoMergingProperty$Builder) id config))


(defn cfn-domain-builder>
  "The cfn-domain-builder> function updates a CfnDomain$Builder instance using the provided configuration.
  The function takes the CfnDomain$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:dead-letter-queue-url` |
| `defaultEncryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-encryption-key` |
| `defaultExpirationDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-expiration-days` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `matching` | software.amazon.awscdk.services.customerprofiles.CfnDomain$MatchingProperty | [[cdk.support/lookup-entry]] | `:matching` |
| `ruleBasedMatching` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-based-matching` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomain$Builder builder id config]
  (when-some [data (lookup-entry config id :dead-letter-queue-url)]
    (. builder deadLetterQueueUrl data))
  (when-some [data (lookup-entry config id :default-encryption-key)]
    (. builder defaultEncryptionKey data))
  (when-some [data (lookup-entry config id :default-expiration-days)]
    (. builder defaultExpirationDays data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :matching)]
    (. builder matching data))
  (when-some [data (lookup-entry config id :rule-based-matching)]
    (. builder ruleBasedMatching data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-domain-builder
  "Creates a  `CfnDomain$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-domain-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-domain-builder> (CfnDomain$Builder/create scope (name id)) id config))


(defn cfn-domain-conflict-resolution-property-builder>
  "The cfn-domain-conflict-resolution-property-builder> function updates a CfnDomain$ConflictResolutionProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$ConflictResolutionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conflictResolvingModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-resolving-model` |
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
"
  [^CfnDomain$ConflictResolutionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :conflict-resolving-model)]
    (. builder conflictResolvingModel data))
  (when-some [data (lookup-entry config id :source-name)]
    (. builder sourceName data))
  (.build builder))


(defn cfn-domain-conflict-resolution-property-builder
  "Creates a  `CfnDomain$ConflictResolutionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-conflict-resolution-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-conflict-resolution-property-builder> (new CfnDomain$ConflictResolutionProperty$Builder) id config))


(defn cfn-domain-consolidation-property-builder>
  "The cfn-domain-consolidation-property-builder> function updates a CfnDomain$ConsolidationProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$ConsolidationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchingAttributesList` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-attributes-list` |
"
  [^CfnDomain$ConsolidationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :matching-attributes-list)]
    (. builder matchingAttributesList data))
  (.build builder))


(defn cfn-domain-consolidation-property-builder
  "Creates a  `CfnDomain$ConsolidationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-consolidation-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-consolidation-property-builder> (new CfnDomain$ConsolidationProperty$Builder) id config))


(defn cfn-domain-domain-stats-property-builder>
  "The cfn-domain-domain-stats-property-builder> function updates a CfnDomain$DomainStatsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$DomainStatsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meteringProfileCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:metering-profile-count` |
| `objectCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:object-count` |
| `profileCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:profile-count` |
| `totalSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-size` |
"
  [^CfnDomain$DomainStatsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metering-profile-count)]
    (. builder meteringProfileCount data))
  (when-some [data (lookup-entry config id :object-count)]
    (. builder objectCount data))
  (when-some [data (lookup-entry config id :profile-count)]
    (. builder profileCount data))
  (when-some [data (lookup-entry config id :total-size)]
    (. builder totalSize data))
  (.build builder))


(defn cfn-domain-domain-stats-property-builder
  "Creates a  `CfnDomain$DomainStatsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-domain-stats-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-domain-stats-property-builder> (new CfnDomain$DomainStatsProperty$Builder) id config))


(defn cfn-domain-exporting-config-property-builder>
  "The cfn-domain-exporting-config-property-builder> function updates a CfnDomain$ExportingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$ExportingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Exporting` | software.amazon.awscdk.services.customerprofiles.CfnDomain$S3ExportingConfigProperty | [[cdk.support/lookup-entry]] | `:s3-exporting` |
"
  [^CfnDomain$ExportingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-exporting)]
    (. builder s3Exporting data))
  (.build builder))


(defn cfn-domain-exporting-config-property-builder
  "Creates a  `CfnDomain$ExportingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-exporting-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-exporting-config-property-builder> (new CfnDomain$ExportingConfigProperty$Builder) id config))


(defn cfn-domain-job-schedule-property-builder>
  "The cfn-domain-job-schedule-property-builder> function updates a CfnDomain$JobScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$JobScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfTheWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-the-week` |
| `time` | java.lang.String | [[cdk.support/lookup-entry]] | `:time` |
"
  [^CfnDomain$JobScheduleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :day-of-the-week)]
    (. builder dayOfTheWeek data))
  (when-some [data (lookup-entry config id :time)]
    (. builder time data))
  (.build builder))


(defn cfn-domain-job-schedule-property-builder
  "Creates a  `CfnDomain$JobScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-job-schedule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-job-schedule-property-builder> (new CfnDomain$JobScheduleProperty$Builder) id config))


(defn cfn-domain-matching-property-builder>
  "The cfn-domain-matching-property-builder> function updates a CfnDomain$MatchingProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$MatchingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMerging` | software.amazon.awscdk.services.customerprofiles.CfnDomain$AutoMergingProperty | [[cdk.support/lookup-entry]] | `:auto-merging` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `exportingConfig` | software.amazon.awscdk.services.customerprofiles.CfnDomain$ExportingConfigProperty | [[cdk.support/lookup-entry]] | `:exporting-config` |
| `jobSchedule` | software.amazon.awscdk.services.customerprofiles.CfnDomain$JobScheduleProperty | [[cdk.support/lookup-entry]] | `:job-schedule` |
"
  [^CfnDomain$MatchingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-merging)]
    (. builder autoMerging data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :exporting-config)]
    (. builder exportingConfig data))
  (when-some [data (lookup-entry config id :job-schedule)]
    (. builder jobSchedule data))
  (.build builder))


(defn cfn-domain-matching-property-builder
  "Creates a  `CfnDomain$MatchingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-matching-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-matching-property-builder> (new CfnDomain$MatchingProperty$Builder) id config))


(defn cfn-domain-matching-rule-property-builder>
  "The cfn-domain-matching-rule-property-builder> function updates a CfnDomain$MatchingRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$MatchingRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rule` | java.util.List | [[cdk.support/lookup-entry]] | `:rule` |
"
  [^CfnDomain$MatchingRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rule)]
    (. builder rule data))
  (.build builder))


(defn cfn-domain-matching-rule-property-builder
  "Creates a  `CfnDomain$MatchingRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-matching-rule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-matching-rule-property-builder> (new CfnDomain$MatchingRuleProperty$Builder) id config))


(defn cfn-domain-props-builder>
  "The cfn-domain-props-builder> function updates a CfnDomainProps$Builder instance using the provided configuration.
  The function takes the CfnDomainProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:dead-letter-queue-url` |
| `defaultEncryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-encryption-key` |
| `defaultExpirationDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-expiration-days` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `matching` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:matching` |
| `ruleBasedMatching` | software.amazon.awscdk.services.customerprofiles.CfnDomain$RuleBasedMatchingProperty | [[cdk.support/lookup-entry]] | `:rule-based-matching` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomainProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dead-letter-queue-url)]
    (. builder deadLetterQueueUrl data))
  (when-some [data (lookup-entry config id :default-encryption-key)]
    (. builder defaultEncryptionKey data))
  (when-some [data (lookup-entry config id :default-expiration-days)]
    (. builder defaultExpirationDays data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :matching)]
    (. builder matching data))
  (when-some [data (lookup-entry config id :rule-based-matching)]
    (. builder ruleBasedMatching data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-domain-props-builder
  "Creates a  `CfnDomainProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-props-builder> (new CfnDomainProps$Builder) id config))


(defn cfn-domain-rule-based-matching-property-builder>
  "The cfn-domain-rule-based-matching-property-builder> function updates a CfnDomain$RuleBasedMatchingProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$RuleBasedMatchingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeTypesSelector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-types-selector` |
| `conflictResolution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conflict-resolution` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `exportingConfig` | software.amazon.awscdk.services.customerprofiles.CfnDomain$ExportingConfigProperty | [[cdk.support/lookup-entry]] | `:exporting-config` |
| `matchingRules` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-rules` |
| `maxAllowedRuleLevelForMatching` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allowed-rule-level-for-matching` |
| `maxAllowedRuleLevelForMerging` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allowed-rule-level-for-merging` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnDomain$RuleBasedMatchingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-types-selector)]
    (. builder attributeTypesSelector data))
  (when-some [data (lookup-entry config id :conflict-resolution)]
    (. builder conflictResolution data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :exporting-config)]
    (. builder exportingConfig data))
  (when-some [data (lookup-entry config id :matching-rules)]
    (. builder matchingRules data))
  (when-some [data (lookup-entry config id :max-allowed-rule-level-for-matching)]
    (. builder maxAllowedRuleLevelForMatching data))
  (when-some [data (lookup-entry config id :max-allowed-rule-level-for-merging)]
    (. builder maxAllowedRuleLevelForMerging data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-domain-rule-based-matching-property-builder
  "Creates a  `CfnDomain$RuleBasedMatchingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-rule-based-matching-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-rule-based-matching-property-builder> (new CfnDomain$RuleBasedMatchingProperty$Builder) id config))


(defn cfn-domain-s3-exporting-config-property-builder>
  "The cfn-domain-s3-exporting-config-property-builder> function updates a CfnDomain$S3ExportingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$S3ExportingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-name` |
"
  [^CfnDomain$S3ExportingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-bucket-name)]
    (. builder s3BucketName data))
  (when-some [data (lookup-entry config id :s3-key-name)]
    (. builder s3KeyName data))
  (.build builder))


(defn cfn-domain-s3-exporting-config-property-builder
  "Creates a  `CfnDomain$S3ExportingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-domain-s3-exporting-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-domain-s3-exporting-config-property-builder> (new CfnDomain$S3ExportingConfigProperty$Builder) id config))


(defn cfn-event-stream-builder>
  "The cfn-event-stream-builder> function updates a CfnEventStream$Builder instance using the provided configuration.
  The function takes the CfnEventStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `eventStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-stream-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnEventStream$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :event-stream-name)]
    (. builder eventStreamName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-event-stream-builder
  "Creates a  `CfnEventStream$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-event-stream-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-event-stream-builder> (CfnEventStream$Builder/create scope (name id)) id config))


(defn cfn-event-stream-destination-details-property-builder>
  "The cfn-event-stream-destination-details-property-builder> function updates a CfnEventStream$DestinationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnEventStream$DestinationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnEventStream$DestinationDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-event-stream-destination-details-property-builder
  "Creates a  `CfnEventStream$DestinationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-event-stream-destination-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-event-stream-destination-details-property-builder> (new CfnEventStream$DestinationDetailsProperty$Builder) id config))


(defn cfn-event-stream-props-builder>
  "The cfn-event-stream-props-builder> function updates a CfnEventStreamProps$Builder instance using the provided configuration.
  The function takes the CfnEventStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `eventStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-stream-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnEventStreamProps$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :event-stream-name)]
    (. builder eventStreamName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-event-stream-props-builder
  "Creates a  `CfnEventStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-event-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-event-stream-props-builder> (new CfnEventStreamProps$Builder) id config))


(defn cfn-integration-builder>
  "The cfn-integration-builder> function updates a CfnIntegration$Builder instance using the provided configuration.
  The function takes the CfnIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `flowDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flow-definition` |
| `objectTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type-name` |
| `objectTypeNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-type-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnIntegration$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :flow-definition)]
    (. builder flowDefinition data))
  (when-some [data (lookup-entry config id :object-type-name)]
    (. builder objectTypeName data))
  (when-some [data (lookup-entry config id :object-type-names)]
    (. builder objectTypeNames data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-integration-builder
  "Creates a  `CfnIntegration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-integration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-integration-builder> (CfnIntegration$Builder/create scope (name id)) id config))


(defn cfn-integration-connector-operator-property-builder>
  "The cfn-integration-connector-operator-property-builder> function updates a CfnIntegration$ConnectorOperatorProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$ConnectorOperatorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `marketo` | java.lang.String | [[cdk.support/lookup-entry]] | `:marketo` |
| `s3` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3` |
| `salesforce` | java.lang.String | [[cdk.support/lookup-entry]] | `:salesforce` |
| `serviceNow` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-now` |
| `zendesk` | java.lang.String | [[cdk.support/lookup-entry]] | `:zendesk` |
"
  [^CfnIntegration$ConnectorOperatorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :marketo)]
    (. builder marketo data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-some [data (lookup-entry config id :salesforce)]
    (. builder salesforce data))
  (when-some [data (lookup-entry config id :service-now)]
    (. builder serviceNow data))
  (when-some [data (lookup-entry config id :zendesk)]
    (. builder zendesk data))
  (.build builder))


(defn cfn-integration-connector-operator-property-builder
  "Creates a  `CfnIntegration$ConnectorOperatorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-connector-operator-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-connector-operator-property-builder> (new CfnIntegration$ConnectorOperatorProperty$Builder) id config))


(defn cfn-integration-flow-definition-property-builder>
  "The cfn-integration-flow-definition-property-builder> function updates a CfnIntegration$FlowDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$FlowDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `flowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-name` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
| `sourceFlowConfig` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$SourceFlowConfigProperty | [[cdk.support/lookup-entry]] | `:source-flow-config` |
| `tasks` | java.util.List | [[cdk.support/lookup-entry]] | `:tasks` |
| `triggerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-config` |
"
  [^CfnIntegration$FlowDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :flow-name)]
    (. builder flowName data))
  (when-some [data (lookup-entry config id :kms-arn)]
    (. builder kmsArn data))
  (when-some [data (lookup-entry config id :source-flow-config)]
    (. builder sourceFlowConfig data))
  (when-some [data (lookup-entry config id :tasks)]
    (. builder tasks data))
  (when-some [data (lookup-entry config id :trigger-config)]
    (. builder triggerConfig data))
  (.build builder))


(defn cfn-integration-flow-definition-property-builder
  "Creates a  `CfnIntegration$FlowDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-flow-definition-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-flow-definition-property-builder> (new CfnIntegration$FlowDefinitionProperty$Builder) id config))


(defn cfn-integration-incremental-pull-config-property-builder>
  "The cfn-integration-incremental-pull-config-property-builder> function updates a CfnIntegration$IncrementalPullConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$IncrementalPullConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datetimeTypeFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datetime-type-field-name` |
"
  [^CfnIntegration$IncrementalPullConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :datetime-type-field-name)]
    (. builder datetimeTypeFieldName data))
  (.build builder))


(defn cfn-integration-incremental-pull-config-property-builder
  "Creates a  `CfnIntegration$IncrementalPullConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-incremental-pull-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-incremental-pull-config-property-builder> (new CfnIntegration$IncrementalPullConfigProperty$Builder) id config))


(defn cfn-integration-marketo-source-properties-property-builder>
  "The cfn-integration-marketo-source-properties-property-builder> function updates a CfnIntegration$MarketoSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$MarketoSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnIntegration$MarketoSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-integration-marketo-source-properties-property-builder
  "Creates a  `CfnIntegration$MarketoSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-marketo-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-marketo-source-properties-property-builder> (new CfnIntegration$MarketoSourcePropertiesProperty$Builder) id config))


(defn cfn-integration-object-type-mapping-property-builder>
  "The cfn-integration-object-type-mapping-property-builder> function updates a CfnIntegration$ObjectTypeMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$ObjectTypeMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnIntegration$ObjectTypeMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-integration-object-type-mapping-property-builder
  "Creates a  `CfnIntegration$ObjectTypeMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-object-type-mapping-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-object-type-mapping-property-builder> (new CfnIntegration$ObjectTypeMappingProperty$Builder) id config))


(defn cfn-integration-props-builder>
  "The cfn-integration-props-builder> function updates a CfnIntegrationProps$Builder instance using the provided configuration.
  The function takes the CfnIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `flowDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flow-definition` |
| `objectTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type-name` |
| `objectTypeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:object-type-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnIntegrationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :flow-definition)]
    (. builder flowDefinition data))
  (when-some [data (lookup-entry config id :object-type-name)]
    (. builder objectTypeName data))
  (when-some [data (lookup-entry config id :object-type-names)]
    (. builder objectTypeNames data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-integration-props-builder
  "Creates a  `CfnIntegrationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-props-builder> (new CfnIntegrationProps$Builder) id config))


(defn cfn-integration-s3-source-properties-property-builder>
  "The cfn-integration-s3-source-properties-property-builder> function updates a CfnIntegration$S3SourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$S3SourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
"
  [^CfnIntegration$S3SourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (.build builder))


(defn cfn-integration-s3-source-properties-property-builder
  "Creates a  `CfnIntegration$S3SourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-s3-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-s3-source-properties-property-builder> (new CfnIntegration$S3SourcePropertiesProperty$Builder) id config))


(defn cfn-integration-salesforce-source-properties-property-builder>
  "The cfn-integration-salesforce-source-properties-property-builder> function updates a CfnIntegration$SalesforceSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$SalesforceSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableDynamicFieldUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-dynamic-field-update` |
| `includeDeletedRecords` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-deleted-records` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnIntegration$SalesforceSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enable-dynamic-field-update)]
    (. builder enableDynamicFieldUpdate data))
  (when-some [data (lookup-entry config id :include-deleted-records)]
    (. builder includeDeletedRecords data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-integration-salesforce-source-properties-property-builder
  "Creates a  `CfnIntegration$SalesforceSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-salesforce-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-salesforce-source-properties-property-builder> (new CfnIntegration$SalesforceSourcePropertiesProperty$Builder) id config))


(defn cfn-integration-scheduled-trigger-properties-property-builder>
  "The cfn-integration-scheduled-trigger-properties-property-builder> function updates a CfnIntegration$ScheduledTriggerPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$ScheduledTriggerPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataPullMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-pull-mode` |
| `firstExecutionFrom` | java.lang.Number | [[cdk.support/lookup-entry]] | `:first-execution-from` |
| `scheduleEndTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-end-time` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-offset` |
| `scheduleStartTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-start-time` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
"
  [^CfnIntegration$ScheduledTriggerPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-pull-mode)]
    (. builder dataPullMode data))
  (when-some [data (lookup-entry config id :first-execution-from)]
    (. builder firstExecutionFrom data))
  (when-some [data (lookup-entry config id :schedule-end-time)]
    (. builder scheduleEndTime data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :schedule-offset)]
    (. builder scheduleOffset data))
  (when-some [data (lookup-entry config id :schedule-start-time)]
    (. builder scheduleStartTime data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (.build builder))


(defn cfn-integration-scheduled-trigger-properties-property-builder
  "Creates a  `CfnIntegration$ScheduledTriggerPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-scheduled-trigger-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-scheduled-trigger-properties-property-builder> (new CfnIntegration$ScheduledTriggerPropertiesProperty$Builder) id config))


(defn cfn-integration-service-now-source-properties-property-builder>
  "The cfn-integration-service-now-source-properties-property-builder> function updates a CfnIntegration$ServiceNowSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$ServiceNowSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnIntegration$ServiceNowSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-integration-service-now-source-properties-property-builder
  "Creates a  `CfnIntegration$ServiceNowSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-service-now-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-service-now-source-properties-property-builder> (new CfnIntegration$ServiceNowSourcePropertiesProperty$Builder) id config))


(defn cfn-integration-source-connector-properties-property-builder>
  "The cfn-integration-source-connector-properties-property-builder> function updates a CfnIntegration$SourceConnectorPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$SourceConnectorPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `marketo` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$MarketoSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:marketo` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
| `salesforce` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$SalesforceSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:salesforce` |
| `serviceNow` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$ServiceNowSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:service-now` |
| `zendesk` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$ZendeskSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:zendesk` |
"
  [^CfnIntegration$SourceConnectorPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :marketo)]
    (. builder marketo data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-some [data (lookup-entry config id :salesforce)]
    (. builder salesforce data))
  (when-some [data (lookup-entry config id :service-now)]
    (. builder serviceNow data))
  (when-some [data (lookup-entry config id :zendesk)]
    (. builder zendesk data))
  (.build builder))


(defn cfn-integration-source-connector-properties-property-builder
  "Creates a  `CfnIntegration$SourceConnectorPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-source-connector-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-source-connector-properties-property-builder> (new CfnIntegration$SourceConnectorPropertiesProperty$Builder) id config))


(defn cfn-integration-source-flow-config-property-builder>
  "The cfn-integration-source-flow-config-property-builder> function updates a CfnIntegration$SourceFlowConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$SourceFlowConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `incrementalPullConfig` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$IncrementalPullConfigProperty | [[cdk.support/lookup-entry]] | `:incremental-pull-config` |
| `sourceConnectorProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-connector-properties` |
"
  [^CfnIntegration$SourceFlowConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-profile-name)]
    (. builder connectorProfileName data))
  (when-some [data (lookup-entry config id :connector-type)]
    (. builder connectorType data))
  (when-some [data (lookup-entry config id :incremental-pull-config)]
    (. builder incrementalPullConfig data))
  (when-some [data (lookup-entry config id :source-connector-properties)]
    (. builder sourceConnectorProperties data))
  (.build builder))


(defn cfn-integration-source-flow-config-property-builder
  "Creates a  `CfnIntegration$SourceFlowConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-source-flow-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-source-flow-config-property-builder> (new CfnIntegration$SourceFlowConfigProperty$Builder) id config))


(defn cfn-integration-task-properties-map-property-builder>
  "The cfn-integration-task-properties-map-property-builder> function updates a CfnIntegration$TaskPropertiesMapProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$TaskPropertiesMapProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `operatorPropertyKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator-property-key` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |
"
  [^CfnIntegration$TaskPropertiesMapProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :operator-property-key)]
    (. builder operatorPropertyKey data))
  (when-some [data (lookup-entry config id :property)]
    (. builder property data))
  (.build builder))


(defn cfn-integration-task-properties-map-property-builder
  "Creates a  `CfnIntegration$TaskPropertiesMapProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-task-properties-map-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-task-properties-map-property-builder> (new CfnIntegration$TaskPropertiesMapProperty$Builder) id config))


(defn cfn-integration-task-property-builder>
  "The cfn-integration-task-property-builder> function updates a CfnIntegration$TaskProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$TaskProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorOperator` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-operator` |
| `destinationField` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-field` |
| `sourceFields` | java.util.List | [[cdk.support/lookup-entry]] | `:source-fields` |
| `taskProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:task-properties` |
| `taskType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-type` |
"
  [^CfnIntegration$TaskProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-operator)]
    (. builder connectorOperator data))
  (when-some [data (lookup-entry config id :destination-field)]
    (. builder destinationField data))
  (when-some [data (lookup-entry config id :source-fields)]
    (. builder sourceFields data))
  (when-some [data (lookup-entry config id :task-properties)]
    (. builder taskProperties data))
  (when-some [data (lookup-entry config id :task-type)]
    (. builder taskType data))
  (.build builder))


(defn cfn-integration-task-property-builder
  "Creates a  `CfnIntegration$TaskProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-task-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-task-property-builder> (new CfnIntegration$TaskProperty$Builder) id config))


(defn cfn-integration-trigger-config-property-builder>
  "The cfn-integration-trigger-config-property-builder> function updates a CfnIntegration$TriggerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$TriggerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `triggerProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-properties` |
| `triggerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-type` |
"
  [^CfnIntegration$TriggerConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :trigger-properties)]
    (. builder triggerProperties data))
  (when-some [data (lookup-entry config id :trigger-type)]
    (. builder triggerType data))
  (.build builder))


(defn cfn-integration-trigger-config-property-builder
  "Creates a  `CfnIntegration$TriggerConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-trigger-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-trigger-config-property-builder> (new CfnIntegration$TriggerConfigProperty$Builder) id config))


(defn cfn-integration-trigger-properties-property-builder>
  "The cfn-integration-trigger-properties-property-builder> function updates a CfnIntegration$TriggerPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$TriggerPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduled` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$ScheduledTriggerPropertiesProperty | [[cdk.support/lookup-entry]] | `:scheduled` |
"
  [^CfnIntegration$TriggerPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :scheduled)]
    (. builder scheduled data))
  (.build builder))


(defn cfn-integration-trigger-properties-property-builder
  "Creates a  `CfnIntegration$TriggerPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-trigger-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-trigger-properties-property-builder> (new CfnIntegration$TriggerPropertiesProperty$Builder) id config))


(defn cfn-integration-zendesk-source-properties-property-builder>
  "The cfn-integration-zendesk-source-properties-property-builder> function updates a CfnIntegration$ZendeskSourcePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIntegration$ZendeskSourcePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
"
  [^CfnIntegration$ZendeskSourcePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (.build builder))


(defn cfn-integration-zendesk-source-properties-property-builder
  "Creates a  `CfnIntegration$ZendeskSourcePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-zendesk-source-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-zendesk-source-properties-property-builder> (new CfnIntegration$ZendeskSourcePropertiesProperty$Builder) id config))


(defn cfn-object-type-builder>
  "The cfn-object-type-builder> function updates a CfnObjectType$Builder instance using the provided configuration.
  The function takes the CfnObjectType$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowProfileCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-profile-creation` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `expirationDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expiration-days` |
| `fields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fields` |
| `keys` | java.util.List | [[cdk.support/lookup-entry]] | `:keys` |
| `objectTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type-name` |
| `sourceLastUpdatedTimestampFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-last-updated-timestamp-format` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-id` |
"
  [^CfnObjectType$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-profile-creation)]
    (. builder allowProfileCreation data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :expiration-days)]
    (. builder expirationDays data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :keys)]
    (. builder keys data))
  (when-some [data (lookup-entry config id :object-type-name)]
    (. builder objectTypeName data))
  (when-some [data (lookup-entry config id :source-last-updated-timestamp-format)]
    (. builder sourceLastUpdatedTimestampFormat data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-id)]
    (. builder templateId data))
  (.build builder))


(defn cfn-object-type-builder
  "Creates a  `CfnObjectType$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-object-type-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-object-type-builder> (CfnObjectType$Builder/create scope (name id)) id config))


(defn cfn-object-type-field-map-property-builder>
  "The cfn-object-type-field-map-property-builder> function updates a CfnObjectType$FieldMapProperty$Builder instance using the provided configuration.
  The function takes the CfnObjectType$FieldMapProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectTypeField` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-type-field` |
"
  [^CfnObjectType$FieldMapProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :object-type-field)]
    (. builder objectTypeField data))
  (.build builder))


(defn cfn-object-type-field-map-property-builder
  "Creates a  `CfnObjectType$FieldMapProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-object-type-field-map-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-object-type-field-map-property-builder> (new CfnObjectType$FieldMapProperty$Builder) id config))


(defn cfn-object-type-key-map-property-builder>
  "The cfn-object-type-key-map-property-builder> function updates a CfnObjectType$KeyMapProperty$Builder instance using the provided configuration.
  The function takes the CfnObjectType$KeyMapProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectTypeKeyList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-type-key-list` |
"
  [^CfnObjectType$KeyMapProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :object-type-key-list)]
    (. builder objectTypeKeyList data))
  (.build builder))


(defn cfn-object-type-key-map-property-builder
  "Creates a  `CfnObjectType$KeyMapProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-object-type-key-map-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-object-type-key-map-property-builder> (new CfnObjectType$KeyMapProperty$Builder) id config))


(defn cfn-object-type-object-type-field-property-builder>
  "The cfn-object-type-object-type-field-property-builder> function updates a CfnObjectType$ObjectTypeFieldProperty$Builder instance using the provided configuration.
  The function takes the CfnObjectType$ObjectTypeFieldProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnObjectType$ObjectTypeFieldProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-object-type-object-type-field-property-builder
  "Creates a  `CfnObjectType$ObjectTypeFieldProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-object-type-object-type-field-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-object-type-object-type-field-property-builder> (new CfnObjectType$ObjectTypeFieldProperty$Builder) id config))


(defn cfn-object-type-object-type-key-property-builder>
  "The cfn-object-type-object-type-key-property-builder> function updates a CfnObjectType$ObjectTypeKeyProperty$Builder instance using the provided configuration.
  The function takes the CfnObjectType$ObjectTypeKeyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:field-names` |
| `standardIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:standard-identifiers` |
"
  [^CfnObjectType$ObjectTypeKeyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :field-names)]
    (. builder fieldNames data))
  (when-some [data (lookup-entry config id :standard-identifiers)]
    (. builder standardIdentifiers data))
  (.build builder))


(defn cfn-object-type-object-type-key-property-builder
  "Creates a  `CfnObjectType$ObjectTypeKeyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-object-type-object-type-key-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-object-type-object-type-key-property-builder> (new CfnObjectType$ObjectTypeKeyProperty$Builder) id config))


(defn cfn-object-type-props-builder>
  "The cfn-object-type-props-builder> function updates a CfnObjectTypeProps$Builder instance using the provided configuration.
  The function takes the CfnObjectTypeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowProfileCreation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-profile-creation` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `expirationDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expiration-days` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `keys` | java.util.List | [[cdk.support/lookup-entry]] | `:keys` |
| `objectTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type-name` |
| `sourceLastUpdatedTimestampFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-last-updated-timestamp-format` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-id` |
"
  [^CfnObjectTypeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-profile-creation)]
    (. builder allowProfileCreation data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :expiration-days)]
    (. builder expirationDays data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :keys)]
    (. builder keys data))
  (when-some [data (lookup-entry config id :object-type-name)]
    (. builder objectTypeName data))
  (when-some [data (lookup-entry config id :source-last-updated-timestamp-format)]
    (. builder sourceLastUpdatedTimestampFormat data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-id)]
    (. builder templateId data))
  (.build builder))


(defn cfn-object-type-props-builder
  "Creates a  `CfnObjectTypeProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-object-type-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-object-type-props-builder> (new CfnObjectTypeProps$Builder) id config))