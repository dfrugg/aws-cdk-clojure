(ns cdk.api.services.cleanrooms
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cleanrooms package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cleanrooms CfnAnalysisTemplate$AnalysisParameterProperty$Builder
                                                       CfnAnalysisTemplate$AnalysisSchemaProperty$Builder
                                                       CfnAnalysisTemplate$AnalysisSourceProperty$Builder
                                                       CfnAnalysisTemplate$Builder
                                                       CfnAnalysisTemplateProps$Builder
                                                       CfnCollaboration$Builder
                                                       CfnCollaboration$DataEncryptionMetadataProperty$Builder
                                                       CfnCollaboration$MemberSpecificationProperty$Builder
                                                       CfnCollaboration$PaymentConfigurationProperty$Builder
                                                       CfnCollaboration$QueryComputePaymentConfigProperty$Builder
                                                       CfnCollaborationProps$Builder
                                                       CfnConfiguredTable$AggregateColumnProperty$Builder
                                                       CfnConfiguredTable$AggregationConstraintProperty$Builder
                                                       CfnConfiguredTable$AnalysisRuleAggregationProperty$Builder
                                                       CfnConfiguredTable$AnalysisRuleCustomProperty$Builder
                                                       CfnConfiguredTable$AnalysisRuleListProperty$Builder
                                                       CfnConfiguredTable$AnalysisRuleProperty$Builder
                                                       CfnConfiguredTable$Builder
                                                       CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyProperty$Builder
                                                       CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyV1Property$Builder
                                                       CfnConfiguredTable$DifferentialPrivacyColumnProperty$Builder
                                                       CfnConfiguredTable$DifferentialPrivacyProperty$Builder
                                                       CfnConfiguredTable$GlueTableReferenceProperty$Builder
                                                       CfnConfiguredTable$TableReferenceProperty$Builder
                                                       CfnConfiguredTableAssociation$Builder
                                                       CfnConfiguredTableAssociationProps$Builder
                                                       CfnConfiguredTableProps$Builder
                                                       CfnMembership$Builder
                                                       CfnMembership$MembershipPaymentConfigurationProperty$Builder
                                                       CfnMembership$MembershipProtectedQueryOutputConfigurationProperty$Builder
                                                       CfnMembership$MembershipProtectedQueryResultConfigurationProperty$Builder
                                                       CfnMembership$MembershipQueryComputePaymentConfigProperty$Builder
                                                       CfnMembership$ProtectedQueryS3OutputConfigurationProperty$Builder
                                                       CfnMembershipProps$Builder
                                                       CfnPrivacyBudgetTemplate$Builder
                                                       CfnPrivacyBudgetTemplate$ParametersProperty$Builder
                                                       CfnPrivacyBudgetTemplateProps$Builder]))


(defn cfn-analysis-template-analysis-parameter-property-builder
  "The cfn-analysis-template-analysis-parameter-property-builder function buildes out new instances of 
CfnAnalysisTemplate$AnalysisParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAnalysisTemplate$AnalysisParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-analysis-template-analysis-schema-property-builder
  "The cfn-analysis-template-analysis-schema-property-builder function buildes out new instances of 
CfnAnalysisTemplate$AnalysisSchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referencedTables` | java.util.List | [[cdk.support/lookup-entry]] | `:referenced-tables` |"
  [stack id config]
  (let [builder (CfnAnalysisTemplate$AnalysisSchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :referenced-tables)]
      (. builder referencedTables data))
    (.build builder)))


(defn cfn-analysis-template-analysis-source-property-builder
  "The cfn-analysis-template-analysis-source-property-builder function buildes out new instances of 
CfnAnalysisTemplate$AnalysisSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |"
  [stack id config]
  (let [builder (CfnAnalysisTemplate$AnalysisSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (.build builder)))


(defn cfn-analysis-template-builder
  "The cfn-analysis-template-builder function buildes out new instances of 
CfnAnalysisTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analysisParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:analysis-parameters` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate$AnalysisSourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAnalysisTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :analysis-parameters)]
      (. builder analysisParameters data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :membership-identifier)]
      (. builder membershipIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-analysis-template-props-builder
  "The cfn-analysis-template-props-builder function buildes out new instances of 
CfnAnalysisTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analysisParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analysis-parameters` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate$AnalysisSourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAnalysisTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :analysis-parameters)]
      (. builder analysisParameters data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :membership-identifier)]
      (. builder membershipIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-collaboration-builder
  "The cfn-collaboration-builder function buildes out new instances of 
CfnCollaboration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creatorDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:creator-display-name` |
| `creatorMemberAbilities` | java.util.List | [[cdk.support/lookup-entry]] | `:creator-member-abilities` |
| `creatorPaymentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:creator-payment-configuration` |
| `dataEncryptionMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-encryption-metadata` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `members` | java.util.List | [[cdk.support/lookup-entry]] | `:members` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryLogStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-log-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCollaboration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :creator-display-name)]
      (. builder creatorDisplayName data))
    (when-let [data (lookup-entry config id :creator-member-abilities)]
      (. builder creatorMemberAbilities data))
    (when-let [data (lookup-entry config id :creator-payment-configuration)]
      (. builder creatorPaymentConfiguration data))
    (when-let [data (lookup-entry config id :data-encryption-metadata)]
      (. builder dataEncryptionMetadata data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :members)]
      (. builder members data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-log-status)]
      (. builder queryLogStatus data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-collaboration-data-encryption-metadata-property-builder
  "The cfn-collaboration-data-encryption-metadata-property-builder function buildes out new instances of 
CfnCollaboration$DataEncryptionMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCleartext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-cleartext` |
| `allowDuplicates` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-duplicates` |
| `allowJoinsOnColumnsWithDifferentNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-joins-on-columns-with-different-names` |
| `preserveNulls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preserve-nulls` |"
  [stack id config]
  (let [builder (CfnCollaboration$DataEncryptionMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-cleartext)]
      (. builder allowCleartext data))
    (when-let [data (lookup-entry config id :allow-duplicates)]
      (. builder allowDuplicates data))
    (when-let [data (lookup-entry config id :allow-joins-on-columns-with-different-names)]
      (. builder allowJoinsOnColumnsWithDifferentNames data))
    (when-let [data (lookup-entry config id :preserve-nulls)]
      (. builder preserveNulls data))
    (.build builder)))


(defn cfn-collaboration-member-specification-property-builder
  "The cfn-collaboration-member-specification-property-builder function buildes out new instances of 
CfnCollaboration$MemberSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `memberAbilities` | java.util.List | [[cdk.support/lookup-entry]] | `:member-abilities` |
| `paymentConfiguration` | software.amazon.awscdk.services.cleanrooms.CfnCollaboration$PaymentConfigurationProperty | [[cdk.support/lookup-entry]] | `:payment-configuration` |"
  [stack id config]
  (let [builder (CfnCollaboration$MemberSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :member-abilities)]
      (. builder memberAbilities data))
    (when-let [data (lookup-entry config id :payment-configuration)]
      (. builder paymentConfiguration data))
    (.build builder)))


(defn cfn-collaboration-payment-configuration-property-builder
  "The cfn-collaboration-payment-configuration-property-builder function buildes out new instances of 
CfnCollaboration$PaymentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryCompute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-compute` |"
  [stack id config]
  (let [builder (CfnCollaboration$PaymentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :query-compute)]
      (. builder queryCompute data))
    (.build builder)))


(defn cfn-collaboration-props-builder
  "The cfn-collaboration-props-builder function buildes out new instances of 
CfnCollaborationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creatorDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:creator-display-name` |
| `creatorMemberAbilities` | java.util.List | [[cdk.support/lookup-entry]] | `:creator-member-abilities` |
| `creatorPaymentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:creator-payment-configuration` |
| `dataEncryptionMetadata` | software.amazon.awscdk.services.cleanrooms.CfnCollaboration$DataEncryptionMetadataProperty | [[cdk.support/lookup-entry]] | `:data-encryption-metadata` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `members` | java.util.List | [[cdk.support/lookup-entry]] | `:members` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryLogStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-log-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCollaborationProps$Builder.)]
    (when-let [data (lookup-entry config id :creator-display-name)]
      (. builder creatorDisplayName data))
    (when-let [data (lookup-entry config id :creator-member-abilities)]
      (. builder creatorMemberAbilities data))
    (when-let [data (lookup-entry config id :creator-payment-configuration)]
      (. builder creatorPaymentConfiguration data))
    (when-let [data (lookup-entry config id :data-encryption-metadata)]
      (. builder dataEncryptionMetadata data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :members)]
      (. builder members data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-log-status)]
      (. builder queryLogStatus data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-collaboration-query-compute-payment-config-property-builder
  "The cfn-collaboration-query-compute-payment-config-property-builder function buildes out new instances of 
CfnCollaboration$QueryComputePaymentConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isResponsible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-responsible` |"
  [stack id config]
  (let [builder (CfnCollaboration$QueryComputePaymentConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-responsible)]
      (. builder isResponsible data))
    (.build builder)))


(defn cfn-configured-table-aggregate-column-property-builder
  "The cfn-configured-table-aggregate-column-property-builder function buildes out new instances of 
CfnConfiguredTable$AggregateColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$AggregateColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :column-names)]
      (. builder columnNames data))
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (.build builder)))


(defn cfn-configured-table-aggregation-constraint-property-builder
  "The cfn-configured-table-aggregation-constraint-property-builder function buildes out new instances of 
CfnConfiguredTable$AggregationConstraintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-name` |
| `minimum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$AggregationConstraintProperty$Builder.)]
    (when-let [data (lookup-entry config id :column-name)]
      (. builder columnName data))
    (when-let [data (lookup-entry config id :minimum)]
      (. builder minimum data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-configured-table-analysis-rule-aggregation-property-builder
  "The cfn-configured-table-analysis-rule-aggregation-property-builder function buildes out new instances of 
CfnConfiguredTable$AnalysisRuleAggregationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregateColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:aggregate-columns` |
| `allowedJoinOperators` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-join-operators` |
| `dimensionColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:dimension-columns` |
| `joinColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:join-columns` |
| `joinRequired` | java.lang.String | [[cdk.support/lookup-entry]] | `:join-required` |
| `outputConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-constraints` |
| `scalarFunctions` | java.util.List | [[cdk.support/lookup-entry]] | `:scalar-functions` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$AnalysisRuleAggregationProperty$Builder.)]
    (when-let [data (lookup-entry config id :aggregate-columns)]
      (. builder aggregateColumns data))
    (when-let [data (lookup-entry config id :allowed-join-operators)]
      (. builder allowedJoinOperators data))
    (when-let [data (lookup-entry config id :dimension-columns)]
      (. builder dimensionColumns data))
    (when-let [data (lookup-entry config id :join-columns)]
      (. builder joinColumns data))
    (when-let [data (lookup-entry config id :join-required)]
      (. builder joinRequired data))
    (when-let [data (lookup-entry config id :output-constraints)]
      (. builder outputConstraints data))
    (when-let [data (lookup-entry config id :scalar-functions)]
      (. builder scalarFunctions data))
    (.build builder)))


(defn cfn-configured-table-analysis-rule-custom-property-builder
  "The cfn-configured-table-analysis-rule-custom-property-builder function buildes out new instances of 
CfnConfiguredTable$AnalysisRuleCustomProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedAnalyses` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-analyses` |
| `allowedAnalysisProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-analysis-providers` |
| `differentialPrivacy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:differential-privacy` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$AnalysisRuleCustomProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-analyses)]
      (. builder allowedAnalyses data))
    (when-let [data (lookup-entry config id :allowed-analysis-providers)]
      (. builder allowedAnalysisProviders data))
    (when-let [data (lookup-entry config id :differential-privacy)]
      (. builder differentialPrivacy data))
    (.build builder)))


(defn cfn-configured-table-analysis-rule-list-property-builder
  "The cfn-configured-table-analysis-rule-list-property-builder function buildes out new instances of 
CfnConfiguredTable$AnalysisRuleListProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedJoinOperators` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-join-operators` |
| `joinColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:join-columns` |
| `listColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:list-columns` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$AnalysisRuleListProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-join-operators)]
      (. builder allowedJoinOperators data))
    (when-let [data (lookup-entry config id :join-columns)]
      (. builder joinColumns data))
    (when-let [data (lookup-entry config id :list-columns)]
      (. builder listColumns data))
    (.build builder)))


(defn cfn-configured-table-analysis-rule-property-builder
  "The cfn-configured-table-analysis-rule-property-builder function buildes out new instances of 
CfnConfiguredTable$AnalysisRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$AnalysisRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-configured-table-association-builder
  "The cfn-configured-table-association-builder function buildes out new instances of 
CfnConfiguredTableAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuredTableIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:configured-table-identifier` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfiguredTableAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configured-table-identifier)]
      (. builder configuredTableIdentifier data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :membership-identifier)]
      (. builder membershipIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configured-table-association-props-builder
  "The cfn-configured-table-association-props-builder function buildes out new instances of 
CfnConfiguredTableAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuredTableIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:configured-table-identifier` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfiguredTableAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :configured-table-identifier)]
      (. builder configuredTableIdentifier data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :membership-identifier)]
      (. builder membershipIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configured-table-builder
  "The cfn-configured-table-builder function buildes out new instances of 
CfnConfiguredTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-columns` |
| `analysisMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:analysis-method` |
| `analysisRules` | java.util.List | [[cdk.support/lookup-entry]] | `:analysis-rules` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableReference` | software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable$TableReferenceProperty | [[cdk.support/lookup-entry]] | `:table-reference` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-columns)]
      (. builder allowedColumns data))
    (when-let [data (lookup-entry config id :analysis-method)]
      (. builder analysisMethod data))
    (when-let [data (lookup-entry config id :analysis-rules)]
      (. builder analysisRules data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :table-reference)]
      (. builder tableReference data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configured-table-configured-table-analysis-rule-policy-property-builder
  "The cfn-configured-table-configured-table-analysis-rule-policy-property-builder function buildes out new instances of 
CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `v1` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:v1` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :v1)]
      (. builder v1 data))
    (.build builder)))


(defn cfn-configured-table-configured-table-analysis-rule-policy-v1-property-builder
  "The cfn-configured-table-configured-table-analysis-rule-policy-v1-property-builder function buildes out new instances of 
CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyV1Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregation` | software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable$AnalysisRuleAggregationProperty | [[cdk.support/lookup-entry]] | `:aggregation` |
| `custom` | software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable$AnalysisRuleCustomProperty | [[cdk.support/lookup-entry]] | `:custom` |
| `list` | software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable$AnalysisRuleListProperty | [[cdk.support/lookup-entry]] | `:list` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyV1Property$Builder.)]
    (when-let [data (lookup-entry config id :aggregation)]
      (. builder aggregation data))
    (when-let [data (lookup-entry config id :custom)]
      (. builder custom data))
    (when-let [data (lookup-entry config id :list)]
      (. builder list data))
    (.build builder)))


(defn cfn-configured-table-differential-privacy-column-property-builder
  "The cfn-configured-table-differential-privacy-column-property-builder function buildes out new instances of 
CfnConfiguredTable$DifferentialPrivacyColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$DifferentialPrivacyColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-configured-table-differential-privacy-property-builder
  "The cfn-configured-table-differential-privacy-property-builder function buildes out new instances of 
CfnConfiguredTable$DifferentialPrivacyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:columns` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$DifferentialPrivacyProperty$Builder.)]
    (when-let [data (lookup-entry config id :columns)]
      (. builder columns data))
    (.build builder)))


(defn cfn-configured-table-glue-table-reference-property-builder
  "The cfn-configured-table-glue-table-reference-property-builder function buildes out new instances of 
CfnConfiguredTable$GlueTableReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$GlueTableReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-configured-table-props-builder
  "The cfn-configured-table-props-builder function buildes out new instances of 
CfnConfiguredTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-columns` |
| `analysisMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:analysis-method` |
| `analysisRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analysis-rules` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table-reference` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfiguredTableProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-columns)]
      (. builder allowedColumns data))
    (when-let [data (lookup-entry config id :analysis-method)]
      (. builder analysisMethod data))
    (when-let [data (lookup-entry config id :analysis-rules)]
      (. builder analysisRules data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :table-reference)]
      (. builder tableReference data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configured-table-table-reference-property-builder
  "The cfn-configured-table-table-reference-property-builder function buildes out new instances of 
CfnConfiguredTable$TableReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue` |"
  [stack id config]
  (let [builder (CfnConfiguredTable$TableReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :glue)]
      (. builder glue data))
    (.build builder)))


(defn cfn-membership-builder
  "The cfn-membership-builder function buildes out new instances of 
CfnMembership$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collaborationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:collaboration-identifier` |
| `defaultResultConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-result-configuration` |
| `paymentConfiguration` | software.amazon.awscdk.services.cleanrooms.CfnMembership$MembershipPaymentConfigurationProperty | [[cdk.support/lookup-entry]] | `:payment-configuration` |
| `queryLogStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-log-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMembership$Builder/create stack id)]
    (when-let [data (lookup-entry config id :collaboration-identifier)]
      (. builder collaborationIdentifier data))
    (when-let [data (lookup-entry config id :default-result-configuration)]
      (. builder defaultResultConfiguration data))
    (when-let [data (lookup-entry config id :payment-configuration)]
      (. builder paymentConfiguration data))
    (when-let [data (lookup-entry config id :query-log-status)]
      (. builder queryLogStatus data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-membership-membership-payment-configuration-property-builder
  "The cfn-membership-membership-payment-configuration-property-builder function buildes out new instances of 
CfnMembership$MembershipPaymentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryCompute` | software.amazon.awscdk.services.cleanrooms.CfnMembership$MembershipQueryComputePaymentConfigProperty | [[cdk.support/lookup-entry]] | `:query-compute` |"
  [stack id config]
  (let [builder (CfnMembership$MembershipPaymentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :query-compute)]
      (. builder queryCompute data))
    (.build builder)))


(defn cfn-membership-membership-protected-query-output-configuration-property-builder
  "The cfn-membership-membership-protected-query-output-configuration-property-builder function buildes out new instances of 
CfnMembership$MembershipProtectedQueryOutputConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.services.cleanrooms.CfnMembership$ProtectedQueryS3OutputConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnMembership$MembershipProtectedQueryOutputConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-membership-membership-protected-query-result-configuration-property-builder
  "The cfn-membership-membership-protected-query-result-configuration-property-builder function buildes out new instances of 
CfnMembership$MembershipProtectedQueryResultConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `outputConfiguration` | software.amazon.awscdk.services.cleanrooms.CfnMembership$MembershipProtectedQueryOutputConfigurationProperty | [[cdk.support/lookup-entry]] | `:output-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnMembership$MembershipProtectedQueryResultConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :output-configuration)]
      (. builder outputConfiguration data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-membership-membership-query-compute-payment-config-property-builder
  "The cfn-membership-membership-query-compute-payment-config-property-builder function buildes out new instances of 
CfnMembership$MembershipQueryComputePaymentConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isResponsible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-responsible` |"
  [stack id config]
  (let [builder (CfnMembership$MembershipQueryComputePaymentConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-responsible)]
      (. builder isResponsible data))
    (.build builder)))


(defn cfn-membership-props-builder
  "The cfn-membership-props-builder function buildes out new instances of 
CfnMembershipProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collaborationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:collaboration-identifier` |
| `defaultResultConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-result-configuration` |
| `paymentConfiguration` | software.amazon.awscdk.services.cleanrooms.CfnMembership$MembershipPaymentConfigurationProperty | [[cdk.support/lookup-entry]] | `:payment-configuration` |
| `queryLogStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-log-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMembershipProps$Builder.)]
    (when-let [data (lookup-entry config id :collaboration-identifier)]
      (. builder collaborationIdentifier data))
    (when-let [data (lookup-entry config id :default-result-configuration)]
      (. builder defaultResultConfiguration data))
    (when-let [data (lookup-entry config id :payment-configuration)]
      (. builder paymentConfiguration data))
    (when-let [data (lookup-entry config id :query-log-status)]
      (. builder queryLogStatus data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-membership-protected-query-s3-output-configuration-property-builder
  "The cfn-membership-protected-query-s3-output-configuration-property-builder function buildes out new instances of 
CfnMembership$ProtectedQueryS3OutputConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |
| `resultFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-format` |"
  [stack id config]
  (let [builder (CfnMembership$ProtectedQueryS3OutputConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key-prefix)]
      (. builder keyPrefix data))
    (when-let [data (lookup-entry config id :result-format)]
      (. builder resultFormat data))
    (.build builder)))


(defn cfn-privacy-budget-template-builder
  "The cfn-privacy-budget-template-builder function buildes out new instances of 
CfnPrivacyBudgetTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRefresh` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-refresh` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `privacyBudgetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:privacy-budget-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPrivacyBudgetTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-refresh)]
      (. builder autoRefresh data))
    (when-let [data (lookup-entry config id :membership-identifier)]
      (. builder membershipIdentifier data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :privacy-budget-type)]
      (. builder privacyBudgetType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-privacy-budget-template-parameters-property-builder
  "The cfn-privacy-budget-template-parameters-property-builder function buildes out new instances of 
CfnPrivacyBudgetTemplate$ParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `epsilon` | java.lang.Number | [[cdk.support/lookup-entry]] | `:epsilon` |
| `usersNoisePerQuery` | java.lang.Number | [[cdk.support/lookup-entry]] | `:users-noise-per-query` |"
  [stack id config]
  (let [builder (CfnPrivacyBudgetTemplate$ParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :epsilon)]
      (. builder epsilon data))
    (when-let [data (lookup-entry config id :users-noise-per-query)]
      (. builder usersNoisePerQuery data))
    (.build builder)))


(defn cfn-privacy-budget-template-props-builder
  "The cfn-privacy-budget-template-props-builder function buildes out new instances of 
CfnPrivacyBudgetTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRefresh` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-refresh` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `parameters` | software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate$ParametersProperty | [[cdk.support/lookup-entry]] | `:parameters` |
| `privacyBudgetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:privacy-budget-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPrivacyBudgetTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-refresh)]
      (. builder autoRefresh data))
    (when-let [data (lookup-entry config id :membership-identifier)]
      (. builder membershipIdentifier data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :privacy-budget-type)]
      (. builder privacyBudgetType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))