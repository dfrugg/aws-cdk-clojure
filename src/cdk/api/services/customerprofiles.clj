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


(defn cfn-calculated-attribute-definition-attribute-details-property-builder
  "The cfn-calculated-attribute-definition-attribute-details-property-builder function buildes out new instances of 
CfnCalculatedAttributeDefinition$AttributeDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |"
  [stack id config]
  (let [builder (CfnCalculatedAttributeDefinition$AttributeDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (.build builder)))


(defn cfn-calculated-attribute-definition-attribute-item-property-builder
  "The cfn-calculated-attribute-definition-attribute-item-property-builder function buildes out new instances of 
CfnCalculatedAttributeDefinition$AttributeItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnCalculatedAttributeDefinition$AttributeItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-calculated-attribute-definition-builder
  "The cfn-calculated-attribute-definition-builder function buildes out new instances of 
CfnCalculatedAttributeDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-details` |
| `calculatedAttributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:calculated-attribute-name` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCalculatedAttributeDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attribute-details)]
      (. builder attributeDetails data))
    (when-let [data (lookup-entry config id :calculated-attribute-name)]
      (. builder calculatedAttributeName data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-calculated-attribute-definition-conditions-property-builder
  "The cfn-calculated-attribute-definition-conditions-property-builder function buildes out new instances of 
CfnCalculatedAttributeDefinition$ConditionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:object-count` |
| `range` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:range` |
| `threshold` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:threshold` |"
  [stack id config]
  (let [builder (CfnCalculatedAttributeDefinition$ConditionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :object-count)]
      (. builder objectCount data))
    (when-let [data (lookup-entry config id :range)]
      (. builder range data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (.build builder)))


(defn cfn-calculated-attribute-definition-props-builder
  "The cfn-calculated-attribute-definition-props-builder function buildes out new instances of 
CfnCalculatedAttributeDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDetails` | software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition$AttributeDetailsProperty | [[cdk.support/lookup-entry]] | `:attribute-details` |
| `calculatedAttributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:calculated-attribute-name` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCalculatedAttributeDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :attribute-details)]
      (. builder attributeDetails data))
    (when-let [data (lookup-entry config id :calculated-attribute-name)]
      (. builder calculatedAttributeName data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-calculated-attribute-definition-range-property-builder
  "The cfn-calculated-attribute-definition-range-property-builder function buildes out new instances of 
CfnCalculatedAttributeDefinition$RangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCalculatedAttributeDefinition$RangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-calculated-attribute-definition-threshold-property-builder
  "The cfn-calculated-attribute-definition-threshold-property-builder function buildes out new instances of 
CfnCalculatedAttributeDefinition$ThresholdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCalculatedAttributeDefinition$ThresholdProperty$Builder.)]
    (when-let [data (lookup-entry config id :operator)]
      (. builder operator data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-domain-attribute-types-selector-property-builder
  "The cfn-domain-attribute-types-selector-property-builder function buildes out new instances of 
CfnDomain$AttributeTypesSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.util.List | [[cdk.support/lookup-entry]] | `:address` |
| `attributeMatchingModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-matching-model` |
| `emailAddress` | java.util.List | [[cdk.support/lookup-entry]] | `:email-address` |
| `phoneNumber` | java.util.List | [[cdk.support/lookup-entry]] | `:phone-number` |"
  [stack id config]
  (let [builder (CfnDomain$AttributeTypesSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :attribute-matching-model)]
      (. builder attributeMatchingModel data))
    (when-let [data (lookup-entry config id :email-address)]
      (. builder emailAddress data))
    (when-let [data (lookup-entry config id :phone-number)]
      (. builder phoneNumber data))
    (.build builder)))


(defn cfn-domain-auto-merging-property-builder
  "The cfn-domain-auto-merging-property-builder function buildes out new instances of 
CfnDomain$AutoMergingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conflictResolution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conflict-resolution` |
| `consolidation` | software.amazon.awscdk.services.customerprofiles.CfnDomain$ConsolidationProperty | [[cdk.support/lookup-entry]] | `:consolidation` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `minAllowedConfidenceScoreForMerging` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-allowed-confidence-score-for-merging` |"
  [stack id config]
  (let [builder (CfnDomain$AutoMergingProperty$Builder.)]
    (when-let [data (lookup-entry config id :conflict-resolution)]
      (. builder conflictResolution data))
    (when-let [data (lookup-entry config id :consolidation)]
      (. builder consolidation data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :min-allowed-confidence-score-for-merging)]
      (. builder minAllowedConfidenceScoreForMerging data))
    (.build builder)))


(defn cfn-domain-builder
  "The cfn-domain-builder function buildes out new instances of 
CfnDomain$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:dead-letter-queue-url` |
| `defaultEncryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-encryption-key` |
| `defaultExpirationDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-expiration-days` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `matching` | software.amazon.awscdk.services.customerprofiles.CfnDomain$MatchingProperty | [[cdk.support/lookup-entry]] | `:matching` |
| `ruleBasedMatching` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-based-matching` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDomain$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dead-letter-queue-url)]
      (. builder deadLetterQueueUrl data))
    (when-let [data (lookup-entry config id :default-encryption-key)]
      (. builder defaultEncryptionKey data))
    (when-let [data (lookup-entry config id :default-expiration-days)]
      (. builder defaultExpirationDays data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :matching)]
      (. builder matching data))
    (when-let [data (lookup-entry config id :rule-based-matching)]
      (. builder ruleBasedMatching data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-domain-conflict-resolution-property-builder
  "The cfn-domain-conflict-resolution-property-builder function buildes out new instances of 
CfnDomain$ConflictResolutionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conflictResolvingModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-resolving-model` |
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |"
  [stack id config]
  (let [builder (CfnDomain$ConflictResolutionProperty$Builder.)]
    (when-let [data (lookup-entry config id :conflict-resolving-model)]
      (. builder conflictResolvingModel data))
    (when-let [data (lookup-entry config id :source-name)]
      (. builder sourceName data))
    (.build builder)))


(defn cfn-domain-consolidation-property-builder
  "The cfn-domain-consolidation-property-builder function buildes out new instances of 
CfnDomain$ConsolidationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchingAttributesList` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-attributes-list` |"
  [stack id config]
  (let [builder (CfnDomain$ConsolidationProperty$Builder.)]
    (when-let [data (lookup-entry config id :matching-attributes-list)]
      (. builder matchingAttributesList data))
    (.build builder)))


(defn cfn-domain-domain-stats-property-builder
  "The cfn-domain-domain-stats-property-builder function buildes out new instances of 
CfnDomain$DomainStatsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `meteringProfileCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:metering-profile-count` |
| `objectCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:object-count` |
| `profileCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:profile-count` |
| `totalSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-size` |"
  [stack id config]
  (let [builder (CfnDomain$DomainStatsProperty$Builder.)]
    (when-let [data (lookup-entry config id :metering-profile-count)]
      (. builder meteringProfileCount data))
    (when-let [data (lookup-entry config id :object-count)]
      (. builder objectCount data))
    (when-let [data (lookup-entry config id :profile-count)]
      (. builder profileCount data))
    (when-let [data (lookup-entry config id :total-size)]
      (. builder totalSize data))
    (.build builder)))


(defn cfn-domain-exporting-config-property-builder
  "The cfn-domain-exporting-config-property-builder function buildes out new instances of 
CfnDomain$ExportingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Exporting` | software.amazon.awscdk.services.customerprofiles.CfnDomain$S3ExportingConfigProperty | [[cdk.support/lookup-entry]] | `:s3-exporting` |"
  [stack id config]
  (let [builder (CfnDomain$ExportingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-exporting)]
      (. builder s3Exporting data))
    (.build builder)))


(defn cfn-domain-job-schedule-property-builder
  "The cfn-domain-job-schedule-property-builder function buildes out new instances of 
CfnDomain$JobScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfTheWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-the-week` |
| `time` | java.lang.String | [[cdk.support/lookup-entry]] | `:time` |"
  [stack id config]
  (let [builder (CfnDomain$JobScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :day-of-the-week)]
      (. builder dayOfTheWeek data))
    (when-let [data (lookup-entry config id :time)]
      (. builder time data))
    (.build builder)))


(defn cfn-domain-matching-property-builder
  "The cfn-domain-matching-property-builder function buildes out new instances of 
CfnDomain$MatchingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMerging` | software.amazon.awscdk.services.customerprofiles.CfnDomain$AutoMergingProperty | [[cdk.support/lookup-entry]] | `:auto-merging` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `exportingConfig` | software.amazon.awscdk.services.customerprofiles.CfnDomain$ExportingConfigProperty | [[cdk.support/lookup-entry]] | `:exporting-config` |
| `jobSchedule` | software.amazon.awscdk.services.customerprofiles.CfnDomain$JobScheduleProperty | [[cdk.support/lookup-entry]] | `:job-schedule` |"
  [stack id config]
  (let [builder (CfnDomain$MatchingProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-merging)]
      (. builder autoMerging data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :exporting-config)]
      (. builder exportingConfig data))
    (when-let [data (lookup-entry config id :job-schedule)]
      (. builder jobSchedule data))
    (.build builder)))


(defn cfn-domain-matching-rule-property-builder
  "The cfn-domain-matching-rule-property-builder function buildes out new instances of 
CfnDomain$MatchingRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rule` | java.util.List | [[cdk.support/lookup-entry]] | `:rule` |"
  [stack id config]
  (let [builder (CfnDomain$MatchingRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :rule)]
      (. builder rule data))
    (.build builder)))


(defn cfn-domain-props-builder
  "The cfn-domain-props-builder function buildes out new instances of 
CfnDomainProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:dead-letter-queue-url` |
| `defaultEncryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-encryption-key` |
| `defaultExpirationDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-expiration-days` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `matching` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:matching` |
| `ruleBasedMatching` | software.amazon.awscdk.services.customerprofiles.CfnDomain$RuleBasedMatchingProperty | [[cdk.support/lookup-entry]] | `:rule-based-matching` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDomainProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue-url)]
      (. builder deadLetterQueueUrl data))
    (when-let [data (lookup-entry config id :default-encryption-key)]
      (. builder defaultEncryptionKey data))
    (when-let [data (lookup-entry config id :default-expiration-days)]
      (. builder defaultExpirationDays data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :matching)]
      (. builder matching data))
    (when-let [data (lookup-entry config id :rule-based-matching)]
      (. builder ruleBasedMatching data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-domain-rule-based-matching-property-builder
  "The cfn-domain-rule-based-matching-property-builder function buildes out new instances of 
CfnDomain$RuleBasedMatchingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeTypesSelector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-types-selector` |
| `conflictResolution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conflict-resolution` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `exportingConfig` | software.amazon.awscdk.services.customerprofiles.CfnDomain$ExportingConfigProperty | [[cdk.support/lookup-entry]] | `:exporting-config` |
| `matchingRules` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-rules` |
| `maxAllowedRuleLevelForMatching` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allowed-rule-level-for-matching` |
| `maxAllowedRuleLevelForMerging` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allowed-rule-level-for-merging` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnDomain$RuleBasedMatchingProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-types-selector)]
      (. builder attributeTypesSelector data))
    (when-let [data (lookup-entry config id :conflict-resolution)]
      (. builder conflictResolution data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :exporting-config)]
      (. builder exportingConfig data))
    (when-let [data (lookup-entry config id :matching-rules)]
      (. builder matchingRules data))
    (when-let [data (lookup-entry config id :max-allowed-rule-level-for-matching)]
      (. builder maxAllowedRuleLevelForMatching data))
    (when-let [data (lookup-entry config id :max-allowed-rule-level-for-merging)]
      (. builder maxAllowedRuleLevelForMerging data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-domain-s3-exporting-config-property-builder
  "The cfn-domain-s3-exporting-config-property-builder function buildes out new instances of 
CfnDomain$S3ExportingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-name` |"
  [stack id config]
  (let [builder (CfnDomain$S3ExportingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-key-name)]
      (. builder s3KeyName data))
    (.build builder)))


(defn cfn-event-stream-builder
  "The cfn-event-stream-builder function buildes out new instances of 
CfnEventStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `eventStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-stream-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnEventStream$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :event-stream-name)]
      (. builder eventStreamName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-event-stream-destination-details-property-builder
  "The cfn-event-stream-destination-details-property-builder function buildes out new instances of 
CfnEventStream$DestinationDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnEventStream$DestinationDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-event-stream-props-builder
  "The cfn-event-stream-props-builder function buildes out new instances of 
CfnEventStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `eventStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-stream-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnEventStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :event-stream-name)]
      (. builder eventStreamName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-integration-builder
  "The cfn-integration-builder function buildes out new instances of 
CfnIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `flowDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flow-definition` |
| `objectTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type-name` |
| `objectTypeNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-type-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnIntegration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :flow-definition)]
      (. builder flowDefinition data))
    (when-let [data (lookup-entry config id :object-type-name)]
      (. builder objectTypeName data))
    (when-let [data (lookup-entry config id :object-type-names)]
      (. builder objectTypeNames data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-integration-connector-operator-property-builder
  "The cfn-integration-connector-operator-property-builder function buildes out new instances of 
CfnIntegration$ConnectorOperatorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `marketo` | java.lang.String | [[cdk.support/lookup-entry]] | `:marketo` |
| `s3` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3` |
| `salesforce` | java.lang.String | [[cdk.support/lookup-entry]] | `:salesforce` |
| `serviceNow` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-now` |
| `zendesk` | java.lang.String | [[cdk.support/lookup-entry]] | `:zendesk` |"
  [stack id config]
  (let [builder (CfnIntegration$ConnectorOperatorProperty$Builder.)]
    (when-let [data (lookup-entry config id :marketo)]
      (. builder marketo data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (when-let [data (lookup-entry config id :salesforce)]
      (. builder salesforce data))
    (when-let [data (lookup-entry config id :service-now)]
      (. builder serviceNow data))
    (when-let [data (lookup-entry config id :zendesk)]
      (. builder zendesk data))
    (.build builder)))


(defn cfn-integration-flow-definition-property-builder
  "The cfn-integration-flow-definition-property-builder function buildes out new instances of 
CfnIntegration$FlowDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `flowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-name` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
| `sourceFlowConfig` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$SourceFlowConfigProperty | [[cdk.support/lookup-entry]] | `:source-flow-config` |
| `tasks` | java.util.List | [[cdk.support/lookup-entry]] | `:tasks` |
| `triggerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-config` |"
  [stack id config]
  (let [builder (CfnIntegration$FlowDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :flow-name)]
      (. builder flowName data))
    (when-let [data (lookup-entry config id :kms-arn)]
      (. builder kmsArn data))
    (when-let [data (lookup-entry config id :source-flow-config)]
      (. builder sourceFlowConfig data))
    (when-let [data (lookup-entry config id :tasks)]
      (. builder tasks data))
    (when-let [data (lookup-entry config id :trigger-config)]
      (. builder triggerConfig data))
    (.build builder)))


(defn cfn-integration-incremental-pull-config-property-builder
  "The cfn-integration-incremental-pull-config-property-builder function buildes out new instances of 
CfnIntegration$IncrementalPullConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datetimeTypeFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datetime-type-field-name` |"
  [stack id config]
  (let [builder (CfnIntegration$IncrementalPullConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :datetime-type-field-name)]
      (. builder datetimeTypeFieldName data))
    (.build builder)))


(defn cfn-integration-marketo-source-properties-property-builder
  "The cfn-integration-marketo-source-properties-property-builder function buildes out new instances of 
CfnIntegration$MarketoSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnIntegration$MarketoSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-integration-object-type-mapping-property-builder
  "The cfn-integration-object-type-mapping-property-builder function buildes out new instances of 
CfnIntegration$ObjectTypeMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnIntegration$ObjectTypeMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-integration-props-builder
  "The cfn-integration-props-builder function buildes out new instances of 
CfnIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `flowDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flow-definition` |
| `objectTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type-name` |
| `objectTypeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:object-type-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnIntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :flow-definition)]
      (. builder flowDefinition data))
    (when-let [data (lookup-entry config id :object-type-name)]
      (. builder objectTypeName data))
    (when-let [data (lookup-entry config id :object-type-names)]
      (. builder objectTypeNames data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-integration-s3-source-properties-property-builder
  "The cfn-integration-s3-source-properties-property-builder function buildes out new instances of 
CfnIntegration$S3SourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |"
  [stack id config]
  (let [builder (CfnIntegration$S3SourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (.build builder)))


(defn cfn-integration-salesforce-source-properties-property-builder
  "The cfn-integration-salesforce-source-properties-property-builder function buildes out new instances of 
CfnIntegration$SalesforceSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableDynamicFieldUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-dynamic-field-update` |
| `includeDeletedRecords` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-deleted-records` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnIntegration$SalesforceSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-dynamic-field-update)]
      (. builder enableDynamicFieldUpdate data))
    (when-let [data (lookup-entry config id :include-deleted-records)]
      (. builder includeDeletedRecords data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-integration-scheduled-trigger-properties-property-builder
  "The cfn-integration-scheduled-trigger-properties-property-builder function buildes out new instances of 
CfnIntegration$ScheduledTriggerPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataPullMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-pull-mode` |
| `firstExecutionFrom` | java.lang.Number | [[cdk.support/lookup-entry]] | `:first-execution-from` |
| `scheduleEndTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-end-time` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-offset` |
| `scheduleStartTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-start-time` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |"
  [stack id config]
  (let [builder (CfnIntegration$ScheduledTriggerPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-pull-mode)]
      (. builder dataPullMode data))
    (when-let [data (lookup-entry config id :first-execution-from)]
      (. builder firstExecutionFrom data))
    (when-let [data (lookup-entry config id :schedule-end-time)]
      (. builder scheduleEndTime data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :schedule-offset)]
      (. builder scheduleOffset data))
    (when-let [data (lookup-entry config id :schedule-start-time)]
      (. builder scheduleStartTime data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (.build builder)))


(defn cfn-integration-service-now-source-properties-property-builder
  "The cfn-integration-service-now-source-properties-property-builder function buildes out new instances of 
CfnIntegration$ServiceNowSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnIntegration$ServiceNowSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-integration-source-connector-properties-property-builder
  "The cfn-integration-source-connector-properties-property-builder function buildes out new instances of 
CfnIntegration$SourceConnectorPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `marketo` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$MarketoSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:marketo` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
| `salesforce` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$SalesforceSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:salesforce` |
| `serviceNow` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$ServiceNowSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:service-now` |
| `zendesk` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$ZendeskSourcePropertiesProperty | [[cdk.support/lookup-entry]] | `:zendesk` |"
  [stack id config]
  (let [builder (CfnIntegration$SourceConnectorPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :marketo)]
      (. builder marketo data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (when-let [data (lookup-entry config id :salesforce)]
      (. builder salesforce data))
    (when-let [data (lookup-entry config id :service-now)]
      (. builder serviceNow data))
    (when-let [data (lookup-entry config id :zendesk)]
      (. builder zendesk data))
    (.build builder)))


(defn cfn-integration-source-flow-config-property-builder
  "The cfn-integration-source-flow-config-property-builder function buildes out new instances of 
CfnIntegration$SourceFlowConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-profile-name` |
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `incrementalPullConfig` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$IncrementalPullConfigProperty | [[cdk.support/lookup-entry]] | `:incremental-pull-config` |
| `sourceConnectorProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-connector-properties` |"
  [stack id config]
  (let [builder (CfnIntegration$SourceFlowConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :connector-profile-name)]
      (. builder connectorProfileName data))
    (when-let [data (lookup-entry config id :connector-type)]
      (. builder connectorType data))
    (when-let [data (lookup-entry config id :incremental-pull-config)]
      (. builder incrementalPullConfig data))
    (when-let [data (lookup-entry config id :source-connector-properties)]
      (. builder sourceConnectorProperties data))
    (.build builder)))


(defn cfn-integration-task-properties-map-property-builder
  "The cfn-integration-task-properties-map-property-builder function buildes out new instances of 
CfnIntegration$TaskPropertiesMapProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `operatorPropertyKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator-property-key` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |"
  [stack id config]
  (let [builder (CfnIntegration$TaskPropertiesMapProperty$Builder.)]
    (when-let [data (lookup-entry config id :operator-property-key)]
      (. builder operatorPropertyKey data))
    (when-let [data (lookup-entry config id :property)]
      (. builder property data))
    (.build builder)))


(defn cfn-integration-task-property-builder
  "The cfn-integration-task-property-builder function buildes out new instances of 
CfnIntegration$TaskProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorOperator` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-operator` |
| `destinationField` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-field` |
| `sourceFields` | java.util.List | [[cdk.support/lookup-entry]] | `:source-fields` |
| `taskProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:task-properties` |
| `taskType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-type` |"
  [stack id config]
  (let [builder (CfnIntegration$TaskProperty$Builder.)]
    (when-let [data (lookup-entry config id :connector-operator)]
      (. builder connectorOperator data))
    (when-let [data (lookup-entry config id :destination-field)]
      (. builder destinationField data))
    (when-let [data (lookup-entry config id :source-fields)]
      (. builder sourceFields data))
    (when-let [data (lookup-entry config id :task-properties)]
      (. builder taskProperties data))
    (when-let [data (lookup-entry config id :task-type)]
      (. builder taskType data))
    (.build builder)))


(defn cfn-integration-trigger-config-property-builder
  "The cfn-integration-trigger-config-property-builder function buildes out new instances of 
CfnIntegration$TriggerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `triggerProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-properties` |
| `triggerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-type` |"
  [stack id config]
  (let [builder (CfnIntegration$TriggerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :trigger-properties)]
      (. builder triggerProperties data))
    (when-let [data (lookup-entry config id :trigger-type)]
      (. builder triggerType data))
    (.build builder)))


(defn cfn-integration-trigger-properties-property-builder
  "The cfn-integration-trigger-properties-property-builder function buildes out new instances of 
CfnIntegration$TriggerPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduled` | software.amazon.awscdk.services.customerprofiles.CfnIntegration$ScheduledTriggerPropertiesProperty | [[cdk.support/lookup-entry]] | `:scheduled` |"
  [stack id config]
  (let [builder (CfnIntegration$TriggerPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :scheduled)]
      (. builder scheduled data))
    (.build builder)))


(defn cfn-integration-zendesk-source-properties-property-builder
  "The cfn-integration-zendesk-source-properties-property-builder function buildes out new instances of 
CfnIntegration$ZendeskSourcePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |"
  [stack id config]
  (let [builder (CfnIntegration$ZendeskSourcePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (.build builder)))


(defn cfn-object-type-builder
  "The cfn-object-type-builder function buildes out new instances of 
CfnObjectType$Builder using the provided configuration.  Each field is set as follows:

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
| `templateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-id` |"
  [stack id config]
  (let [builder (CfnObjectType$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-profile-creation)]
      (. builder allowProfileCreation data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :expiration-days)]
      (. builder expirationDays data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :keys)]
      (. builder keys data))
    (when-let [data (lookup-entry config id :object-type-name)]
      (. builder objectTypeName data))
    (when-let [data (lookup-entry config id :source-last-updated-timestamp-format)]
      (. builder sourceLastUpdatedTimestampFormat data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-id)]
      (. builder templateId data))
    (.build builder)))


(defn cfn-object-type-field-map-property-builder
  "The cfn-object-type-field-map-property-builder function buildes out new instances of 
CfnObjectType$FieldMapProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectTypeField` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-type-field` |"
  [stack id config]
  (let [builder (CfnObjectType$FieldMapProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :object-type-field)]
      (. builder objectTypeField data))
    (.build builder)))


(defn cfn-object-type-key-map-property-builder
  "The cfn-object-type-key-map-property-builder function buildes out new instances of 
CfnObjectType$KeyMapProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectTypeKeyList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-type-key-list` |"
  [stack id config]
  (let [builder (CfnObjectType$KeyMapProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :object-type-key-list)]
      (. builder objectTypeKeyList data))
    (.build builder)))


(defn cfn-object-type-object-type-field-property-builder
  "The cfn-object-type-object-type-field-property-builder function buildes out new instances of 
CfnObjectType$ObjectTypeFieldProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnObjectType$ObjectTypeFieldProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-object-type-object-type-key-property-builder
  "The cfn-object-type-object-type-key-property-builder function buildes out new instances of 
CfnObjectType$ObjectTypeKeyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldNames` | java.util.List | [[cdk.support/lookup-entry]] | `:field-names` |
| `standardIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:standard-identifiers` |"
  [stack id config]
  (let [builder (CfnObjectType$ObjectTypeKeyProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-names)]
      (. builder fieldNames data))
    (when-let [data (lookup-entry config id :standard-identifiers)]
      (. builder standardIdentifiers data))
    (.build builder)))


(defn cfn-object-type-props-builder
  "The cfn-object-type-props-builder function buildes out new instances of 
CfnObjectTypeProps$Builder using the provided configuration.  Each field is set as follows:

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
| `templateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-id` |"
  [stack id config]
  (let [builder (CfnObjectTypeProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-profile-creation)]
      (. builder allowProfileCreation data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :expiration-days)]
      (. builder expirationDays data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :keys)]
      (. builder keys data))
    (when-let [data (lookup-entry config id :object-type-name)]
      (. builder objectTypeName data))
    (when-let [data (lookup-entry config id :source-last-updated-timestamp-format)]
      (. builder sourceLastUpdatedTimestampFormat data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-id)]
      (. builder templateId data))
    (.build builder)))