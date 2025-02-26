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


(defn build-cfn-analysis-template-analysis-parameter-property-builder
  "The build-cfn-analysis-template-analysis-parameter-property-builder function updates a CfnAnalysisTemplate$AnalysisParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalysisTemplate$AnalysisParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAnalysisTemplate$AnalysisParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-analysis-template-analysis-parameter-property-builder
  "Creates a  `CfnAnalysisTemplate$AnalysisParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-analysis-template-analysis-parameter-property-builder (new CfnAnalysisTemplate$AnalysisParameterProperty$Builder) id config))


(defn build-cfn-analysis-template-analysis-schema-property-builder
  "The build-cfn-analysis-template-analysis-schema-property-builder function updates a CfnAnalysisTemplate$AnalysisSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalysisTemplate$AnalysisSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referencedTables` | java.util.List | [[cdk.support/lookup-entry]] | `:referenced-tables` |
"
  [^CfnAnalysisTemplate$AnalysisSchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :referenced-tables)]
    (. builder referencedTables data))
  (.build builder))


(defn cfn-analysis-template-analysis-schema-property-builder
  "Creates a  `CfnAnalysisTemplate$AnalysisSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-analysis-template-analysis-schema-property-builder (new CfnAnalysisTemplate$AnalysisSchemaProperty$Builder) id config))


(defn build-cfn-analysis-template-analysis-source-property-builder
  "The build-cfn-analysis-template-analysis-source-property-builder function updates a CfnAnalysisTemplate$AnalysisSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalysisTemplate$AnalysisSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
"
  [^CfnAnalysisTemplate$AnalysisSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :text)]
    (. builder text data))
  (.build builder))


(defn cfn-analysis-template-analysis-source-property-builder
  "Creates a  `CfnAnalysisTemplate$AnalysisSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-analysis-template-analysis-source-property-builder (new CfnAnalysisTemplate$AnalysisSourceProperty$Builder) id config))


(defn build-cfn-analysis-template-builder
  "The build-cfn-analysis-template-builder function updates a CfnAnalysisTemplate$Builder instance using the provided configuration.
  The function takes the CfnAnalysisTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analysisParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:analysis-parameters` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate$AnalysisSourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAnalysisTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :analysis-parameters)]
    (. builder analysisParameters data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :format)]
    (. builder format data))
  (when-some [data (lookup-entry config id :membership-identifier)]
    (. builder membershipIdentifier data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-analysis-template-builder
  "Creates a  `CfnAnalysisTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-analysis-template-builder (CfnAnalysisTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-analysis-template-props-builder
  "The build-cfn-analysis-template-props-builder function updates a CfnAnalysisTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnAnalysisTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analysisParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analysis-parameters` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate$AnalysisSourceProperty | [[cdk.support/lookup-entry]] | `:source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAnalysisTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :analysis-parameters)]
    (. builder analysisParameters data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :format)]
    (. builder format data))
  (when-some [data (lookup-entry config id :membership-identifier)]
    (. builder membershipIdentifier data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-analysis-template-props-builder
  "Creates a  `CfnAnalysisTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-analysis-template-props-builder (new CfnAnalysisTemplateProps$Builder) id config))


(defn build-cfn-collaboration-builder
  "The build-cfn-collaboration-builder function updates a CfnCollaboration$Builder instance using the provided configuration.
  The function takes the CfnCollaboration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCollaboration$Builder builder id config]
  (when-some [data (lookup-entry config id :creator-display-name)]
    (. builder creatorDisplayName data))
  (when-some [data (lookup-entry config id :creator-member-abilities)]
    (. builder creatorMemberAbilities data))
  (when-some [data (lookup-entry config id :creator-payment-configuration)]
    (. builder creatorPaymentConfiguration data))
  (when-some [data (lookup-entry config id :data-encryption-metadata)]
    (. builder dataEncryptionMetadata data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :members)]
    (. builder members data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :query-log-status)]
    (. builder queryLogStatus data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-collaboration-builder
  "Creates a  `CfnCollaboration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-collaboration-builder (CfnCollaboration$Builder/create scope (name id)) id config))


(defn build-cfn-collaboration-data-encryption-metadata-property-builder
  "The build-cfn-collaboration-data-encryption-metadata-property-builder function updates a CfnCollaboration$DataEncryptionMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnCollaboration$DataEncryptionMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCleartext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-cleartext` |
| `allowDuplicates` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-duplicates` |
| `allowJoinsOnColumnsWithDifferentNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-joins-on-columns-with-different-names` |
| `preserveNulls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preserve-nulls` |
"
  [^CfnCollaboration$DataEncryptionMetadataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-cleartext)]
    (. builder allowCleartext data))
  (when-some [data (lookup-entry config id :allow-duplicates)]
    (. builder allowDuplicates data))
  (when-some [data (lookup-entry config id :allow-joins-on-columns-with-different-names)]
    (. builder allowJoinsOnColumnsWithDifferentNames data))
  (when-some [data (lookup-entry config id :preserve-nulls)]
    (. builder preserveNulls data))
  (.build builder))


(defn cfn-collaboration-data-encryption-metadata-property-builder
  "Creates a  `CfnCollaboration$DataEncryptionMetadataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-collaboration-data-encryption-metadata-property-builder (new CfnCollaboration$DataEncryptionMetadataProperty$Builder) id config))


(defn build-cfn-collaboration-member-specification-property-builder
  "The build-cfn-collaboration-member-specification-property-builder function updates a CfnCollaboration$MemberSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnCollaboration$MemberSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `memberAbilities` | java.util.List | [[cdk.support/lookup-entry]] | `:member-abilities` |
| `paymentConfiguration` | software.amazon.awscdk.services.cleanrooms.CfnCollaboration$PaymentConfigurationProperty | [[cdk.support/lookup-entry]] | `:payment-configuration` |
"
  [^CfnCollaboration$MemberSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :member-abilities)]
    (. builder memberAbilities data))
  (when-some [data (lookup-entry config id :payment-configuration)]
    (. builder paymentConfiguration data))
  (.build builder))


(defn cfn-collaboration-member-specification-property-builder
  "Creates a  `CfnCollaboration$MemberSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-collaboration-member-specification-property-builder (new CfnCollaboration$MemberSpecificationProperty$Builder) id config))


(defn build-cfn-collaboration-payment-configuration-property-builder
  "The build-cfn-collaboration-payment-configuration-property-builder function updates a CfnCollaboration$PaymentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCollaboration$PaymentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryCompute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-compute` |
"
  [^CfnCollaboration$PaymentConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :query-compute)]
    (. builder queryCompute data))
  (.build builder))


(defn cfn-collaboration-payment-configuration-property-builder
  "Creates a  `CfnCollaboration$PaymentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-collaboration-payment-configuration-property-builder (new CfnCollaboration$PaymentConfigurationProperty$Builder) id config))


(defn build-cfn-collaboration-props-builder
  "The build-cfn-collaboration-props-builder function updates a CfnCollaborationProps$Builder instance using the provided configuration.
  The function takes the CfnCollaborationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCollaborationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :creator-display-name)]
    (. builder creatorDisplayName data))
  (when-some [data (lookup-entry config id :creator-member-abilities)]
    (. builder creatorMemberAbilities data))
  (when-some [data (lookup-entry config id :creator-payment-configuration)]
    (. builder creatorPaymentConfiguration data))
  (when-some [data (lookup-entry config id :data-encryption-metadata)]
    (. builder dataEncryptionMetadata data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :members)]
    (. builder members data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :query-log-status)]
    (. builder queryLogStatus data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-collaboration-props-builder
  "Creates a  `CfnCollaborationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-collaboration-props-builder (new CfnCollaborationProps$Builder) id config))


(defn build-cfn-collaboration-query-compute-payment-config-property-builder
  "The build-cfn-collaboration-query-compute-payment-config-property-builder function updates a CfnCollaboration$QueryComputePaymentConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCollaboration$QueryComputePaymentConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isResponsible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-responsible` |
"
  [^CfnCollaboration$QueryComputePaymentConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :is-responsible)]
    (. builder isResponsible data))
  (.build builder))


(defn cfn-collaboration-query-compute-payment-config-property-builder
  "Creates a  `CfnCollaboration$QueryComputePaymentConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-collaboration-query-compute-payment-config-property-builder (new CfnCollaboration$QueryComputePaymentConfigProperty$Builder) id config))


(defn build-cfn-configured-table-aggregate-column-property-builder
  "The build-cfn-configured-table-aggregate-column-property-builder function updates a CfnConfiguredTable$AggregateColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$AggregateColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
"
  [^CfnConfiguredTable$AggregateColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :column-names)]
    (. builder columnNames data))
  (when-some [data (lookup-entry config id :function)]
    (. builder function data))
  (.build builder))


(defn cfn-configured-table-aggregate-column-property-builder
  "Creates a  `CfnConfiguredTable$AggregateColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-aggregate-column-property-builder (new CfnConfiguredTable$AggregateColumnProperty$Builder) id config))


(defn build-cfn-configured-table-aggregation-constraint-property-builder
  "The build-cfn-configured-table-aggregation-constraint-property-builder function updates a CfnConfiguredTable$AggregationConstraintProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$AggregationConstraintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-name` |
| `minimum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnConfiguredTable$AggregationConstraintProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :column-name)]
    (. builder columnName data))
  (when-some [data (lookup-entry config id :minimum)]
    (. builder minimum data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-configured-table-aggregation-constraint-property-builder
  "Creates a  `CfnConfiguredTable$AggregationConstraintProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-aggregation-constraint-property-builder (new CfnConfiguredTable$AggregationConstraintProperty$Builder) id config))


(defn build-cfn-configured-table-analysis-rule-aggregation-property-builder
  "The build-cfn-configured-table-analysis-rule-aggregation-property-builder function updates a CfnConfiguredTable$AnalysisRuleAggregationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$AnalysisRuleAggregationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregateColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:aggregate-columns` |
| `allowedJoinOperators` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-join-operators` |
| `dimensionColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:dimension-columns` |
| `joinColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:join-columns` |
| `joinRequired` | java.lang.String | [[cdk.support/lookup-entry]] | `:join-required` |
| `outputConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-constraints` |
| `scalarFunctions` | java.util.List | [[cdk.support/lookup-entry]] | `:scalar-functions` |
"
  [^CfnConfiguredTable$AnalysisRuleAggregationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregate-columns)]
    (. builder aggregateColumns data))
  (when-some [data (lookup-entry config id :allowed-join-operators)]
    (. builder allowedJoinOperators data))
  (when-some [data (lookup-entry config id :dimension-columns)]
    (. builder dimensionColumns data))
  (when-some [data (lookup-entry config id :join-columns)]
    (. builder joinColumns data))
  (when-some [data (lookup-entry config id :join-required)]
    (. builder joinRequired data))
  (when-some [data (lookup-entry config id :output-constraints)]
    (. builder outputConstraints data))
  (when-some [data (lookup-entry config id :scalar-functions)]
    (. builder scalarFunctions data))
  (.build builder))


(defn cfn-configured-table-analysis-rule-aggregation-property-builder
  "Creates a  `CfnConfiguredTable$AnalysisRuleAggregationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-analysis-rule-aggregation-property-builder (new CfnConfiguredTable$AnalysisRuleAggregationProperty$Builder) id config))


(defn build-cfn-configured-table-analysis-rule-custom-property-builder
  "The build-cfn-configured-table-analysis-rule-custom-property-builder function updates a CfnConfiguredTable$AnalysisRuleCustomProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$AnalysisRuleCustomProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedAnalyses` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-analyses` |
| `allowedAnalysisProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-analysis-providers` |
| `differentialPrivacy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:differential-privacy` |
"
  [^CfnConfiguredTable$AnalysisRuleCustomProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-analyses)]
    (. builder allowedAnalyses data))
  (when-some [data (lookup-entry config id :allowed-analysis-providers)]
    (. builder allowedAnalysisProviders data))
  (when-some [data (lookup-entry config id :differential-privacy)]
    (. builder differentialPrivacy data))
  (.build builder))


(defn cfn-configured-table-analysis-rule-custom-property-builder
  "Creates a  `CfnConfiguredTable$AnalysisRuleCustomProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-analysis-rule-custom-property-builder (new CfnConfiguredTable$AnalysisRuleCustomProperty$Builder) id config))


(defn build-cfn-configured-table-analysis-rule-list-property-builder
  "The build-cfn-configured-table-analysis-rule-list-property-builder function updates a CfnConfiguredTable$AnalysisRuleListProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$AnalysisRuleListProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedJoinOperators` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-join-operators` |
| `joinColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:join-columns` |
| `listColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:list-columns` |
"
  [^CfnConfiguredTable$AnalysisRuleListProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-join-operators)]
    (. builder allowedJoinOperators data))
  (when-some [data (lookup-entry config id :join-columns)]
    (. builder joinColumns data))
  (when-some [data (lookup-entry config id :list-columns)]
    (. builder listColumns data))
  (.build builder))


(defn cfn-configured-table-analysis-rule-list-property-builder
  "Creates a  `CfnConfiguredTable$AnalysisRuleListProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-analysis-rule-list-property-builder (new CfnConfiguredTable$AnalysisRuleListProperty$Builder) id config))


(defn build-cfn-configured-table-analysis-rule-property-builder
  "The build-cfn-configured-table-analysis-rule-property-builder function updates a CfnConfiguredTable$AnalysisRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$AnalysisRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnConfiguredTable$AnalysisRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-configured-table-analysis-rule-property-builder
  "Creates a  `CfnConfiguredTable$AnalysisRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-analysis-rule-property-builder (new CfnConfiguredTable$AnalysisRuleProperty$Builder) id config))


(defn build-cfn-configured-table-association-builder
  "The build-cfn-configured-table-association-builder function updates a CfnConfiguredTableAssociation$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTableAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuredTableIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:configured-table-identifier` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfiguredTableAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :configured-table-identifier)]
    (. builder configuredTableIdentifier data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :membership-identifier)]
    (. builder membershipIdentifier data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-configured-table-association-builder
  "Creates a  `CfnConfiguredTableAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-configured-table-association-builder (CfnConfiguredTableAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-configured-table-association-props-builder
  "The build-cfn-configured-table-association-props-builder function updates a CfnConfiguredTableAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTableAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuredTableIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:configured-table-identifier` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfiguredTableAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configured-table-identifier)]
    (. builder configuredTableIdentifier data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :membership-identifier)]
    (. builder membershipIdentifier data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-configured-table-association-props-builder
  "Creates a  `CfnConfiguredTableAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-association-props-builder (new CfnConfiguredTableAssociationProps$Builder) id config))


(defn build-cfn-configured-table-builder
  "The build-cfn-configured-table-builder function updates a CfnConfiguredTable$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-columns` |
| `analysisMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:analysis-method` |
| `analysisRules` | java.util.List | [[cdk.support/lookup-entry]] | `:analysis-rules` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableReference` | software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable$TableReferenceProperty | [[cdk.support/lookup-entry]] | `:table-reference` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfiguredTable$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-columns)]
    (. builder allowedColumns data))
  (when-some [data (lookup-entry config id :analysis-method)]
    (. builder analysisMethod data))
  (when-some [data (lookup-entry config id :analysis-rules)]
    (. builder analysisRules data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :table-reference)]
    (. builder tableReference data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-configured-table-builder
  "Creates a  `CfnConfiguredTable$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-configured-table-builder (CfnConfiguredTable$Builder/create scope (name id)) id config))


(defn build-cfn-configured-table-configured-table-analysis-rule-policy-property-builder
  "The build-cfn-configured-table-configured-table-analysis-rule-policy-property-builder function updates a CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `v1` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:v1` |
"
  [^CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :v1)]
    (. builder v1 data))
  (.build builder))


(defn cfn-configured-table-configured-table-analysis-rule-policy-property-builder
  "Creates a  `CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-configured-table-analysis-rule-policy-property-builder (new CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyProperty$Builder) id config))


(defn build-cfn-configured-table-configured-table-analysis-rule-policy-v1-property-builder
  "The build-cfn-configured-table-configured-table-analysis-rule-policy-v1-property-builder function updates a CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyV1Property$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyV1Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregation` | software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable$AnalysisRuleAggregationProperty | [[cdk.support/lookup-entry]] | `:aggregation` |
| `custom` | software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable$AnalysisRuleCustomProperty | [[cdk.support/lookup-entry]] | `:custom` |
| `list` | software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable$AnalysisRuleListProperty | [[cdk.support/lookup-entry]] | `:list` |
"
  [^CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyV1Property$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregation)]
    (. builder aggregation data))
  (when-some [data (lookup-entry config id :custom)]
    (. builder custom data))
  (when-some [data (lookup-entry config id :list)]
    (. builder list data))
  (.build builder))


(defn cfn-configured-table-configured-table-analysis-rule-policy-v1-property-builder
  "Creates a  `CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyV1Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-configured-table-analysis-rule-policy-v1-property-builder (new CfnConfiguredTable$ConfiguredTableAnalysisRulePolicyV1Property$Builder) id config))


(defn build-cfn-configured-table-differential-privacy-column-property-builder
  "The build-cfn-configured-table-differential-privacy-column-property-builder function updates a CfnConfiguredTable$DifferentialPrivacyColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$DifferentialPrivacyColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnConfiguredTable$DifferentialPrivacyColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-configured-table-differential-privacy-column-property-builder
  "Creates a  `CfnConfiguredTable$DifferentialPrivacyColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-differential-privacy-column-property-builder (new CfnConfiguredTable$DifferentialPrivacyColumnProperty$Builder) id config))


(defn build-cfn-configured-table-differential-privacy-property-builder
  "The build-cfn-configured-table-differential-privacy-property-builder function updates a CfnConfiguredTable$DifferentialPrivacyProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$DifferentialPrivacyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:columns` |
"
  [^CfnConfiguredTable$DifferentialPrivacyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :columns)]
    (. builder columns data))
  (.build builder))


(defn cfn-configured-table-differential-privacy-property-builder
  "Creates a  `CfnConfiguredTable$DifferentialPrivacyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-differential-privacy-property-builder (new CfnConfiguredTable$DifferentialPrivacyProperty$Builder) id config))


(defn build-cfn-configured-table-glue-table-reference-property-builder
  "The build-cfn-configured-table-glue-table-reference-property-builder function updates a CfnConfiguredTable$GlueTableReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$GlueTableReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnConfiguredTable$GlueTableReferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-configured-table-glue-table-reference-property-builder
  "Creates a  `CfnConfiguredTable$GlueTableReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-glue-table-reference-property-builder (new CfnConfiguredTable$GlueTableReferenceProperty$Builder) id config))


(defn build-cfn-configured-table-props-builder
  "The build-cfn-configured-table-props-builder function updates a CfnConfiguredTableProps$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTableProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-columns` |
| `analysisMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:analysis-method` |
| `analysisRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analysis-rules` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table-reference` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfiguredTableProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-columns)]
    (. builder allowedColumns data))
  (when-some [data (lookup-entry config id :analysis-method)]
    (. builder analysisMethod data))
  (when-some [data (lookup-entry config id :analysis-rules)]
    (. builder analysisRules data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :table-reference)]
    (. builder tableReference data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-configured-table-props-builder
  "Creates a  `CfnConfiguredTableProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-props-builder (new CfnConfiguredTableProps$Builder) id config))


(defn build-cfn-configured-table-table-reference-property-builder
  "The build-cfn-configured-table-table-reference-property-builder function updates a CfnConfiguredTable$TableReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguredTable$TableReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue` |
"
  [^CfnConfiguredTable$TableReferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :glue)]
    (. builder glue data))
  (.build builder))


(defn cfn-configured-table-table-reference-property-builder
  "Creates a  `CfnConfiguredTable$TableReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-configured-table-table-reference-property-builder (new CfnConfiguredTable$TableReferenceProperty$Builder) id config))


(defn build-cfn-membership-builder
  "The build-cfn-membership-builder function updates a CfnMembership$Builder instance using the provided configuration.
  The function takes the CfnMembership$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collaborationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:collaboration-identifier` |
| `defaultResultConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-result-configuration` |
| `paymentConfiguration` | software.amazon.awscdk.services.cleanrooms.CfnMembership$MembershipPaymentConfigurationProperty | [[cdk.support/lookup-entry]] | `:payment-configuration` |
| `queryLogStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-log-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMembership$Builder builder id config]
  (when-some [data (lookup-entry config id :collaboration-identifier)]
    (. builder collaborationIdentifier data))
  (when-some [data (lookup-entry config id :default-result-configuration)]
    (. builder defaultResultConfiguration data))
  (when-some [data (lookup-entry config id :payment-configuration)]
    (. builder paymentConfiguration data))
  (when-some [data (lookup-entry config id :query-log-status)]
    (. builder queryLogStatus data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-membership-builder
  "Creates a  `CfnMembership$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-membership-builder (CfnMembership$Builder/create scope (name id)) id config))


(defn build-cfn-membership-membership-payment-configuration-property-builder
  "The build-cfn-membership-membership-payment-configuration-property-builder function updates a CfnMembership$MembershipPaymentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMembership$MembershipPaymentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryCompute` | software.amazon.awscdk.services.cleanrooms.CfnMembership$MembershipQueryComputePaymentConfigProperty | [[cdk.support/lookup-entry]] | `:query-compute` |
"
  [^CfnMembership$MembershipPaymentConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :query-compute)]
    (. builder queryCompute data))
  (.build builder))


(defn cfn-membership-membership-payment-configuration-property-builder
  "Creates a  `CfnMembership$MembershipPaymentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-membership-membership-payment-configuration-property-builder (new CfnMembership$MembershipPaymentConfigurationProperty$Builder) id config))


(defn build-cfn-membership-membership-protected-query-output-configuration-property-builder
  "The build-cfn-membership-membership-protected-query-output-configuration-property-builder function updates a CfnMembership$MembershipProtectedQueryOutputConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMembership$MembershipProtectedQueryOutputConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.services.cleanrooms.CfnMembership$ProtectedQueryS3OutputConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnMembership$MembershipProtectedQueryOutputConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-membership-membership-protected-query-output-configuration-property-builder
  "Creates a  `CfnMembership$MembershipProtectedQueryOutputConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-membership-membership-protected-query-output-configuration-property-builder (new CfnMembership$MembershipProtectedQueryOutputConfigurationProperty$Builder) id config))


(defn build-cfn-membership-membership-protected-query-result-configuration-property-builder
  "The build-cfn-membership-membership-protected-query-result-configuration-property-builder function updates a CfnMembership$MembershipProtectedQueryResultConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMembership$MembershipProtectedQueryResultConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `outputConfiguration` | software.amazon.awscdk.services.cleanrooms.CfnMembership$MembershipProtectedQueryOutputConfigurationProperty | [[cdk.support/lookup-entry]] | `:output-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnMembership$MembershipProtectedQueryResultConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :output-configuration)]
    (. builder outputConfiguration data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-membership-membership-protected-query-result-configuration-property-builder
  "Creates a  `CfnMembership$MembershipProtectedQueryResultConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-membership-membership-protected-query-result-configuration-property-builder (new CfnMembership$MembershipProtectedQueryResultConfigurationProperty$Builder) id config))


(defn build-cfn-membership-membership-query-compute-payment-config-property-builder
  "The build-cfn-membership-membership-query-compute-payment-config-property-builder function updates a CfnMembership$MembershipQueryComputePaymentConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMembership$MembershipQueryComputePaymentConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isResponsible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-responsible` |
"
  [^CfnMembership$MembershipQueryComputePaymentConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :is-responsible)]
    (. builder isResponsible data))
  (.build builder))


(defn cfn-membership-membership-query-compute-payment-config-property-builder
  "Creates a  `CfnMembership$MembershipQueryComputePaymentConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-membership-membership-query-compute-payment-config-property-builder (new CfnMembership$MembershipQueryComputePaymentConfigProperty$Builder) id config))


(defn build-cfn-membership-props-builder
  "The build-cfn-membership-props-builder function updates a CfnMembershipProps$Builder instance using the provided configuration.
  The function takes the CfnMembershipProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collaborationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:collaboration-identifier` |
| `defaultResultConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-result-configuration` |
| `paymentConfiguration` | software.amazon.awscdk.services.cleanrooms.CfnMembership$MembershipPaymentConfigurationProperty | [[cdk.support/lookup-entry]] | `:payment-configuration` |
| `queryLogStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-log-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMembershipProps$Builder builder id config]
  (when-some [data (lookup-entry config id :collaboration-identifier)]
    (. builder collaborationIdentifier data))
  (when-some [data (lookup-entry config id :default-result-configuration)]
    (. builder defaultResultConfiguration data))
  (when-some [data (lookup-entry config id :payment-configuration)]
    (. builder paymentConfiguration data))
  (when-some [data (lookup-entry config id :query-log-status)]
    (. builder queryLogStatus data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-membership-props-builder
  "Creates a  `CfnMembershipProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-membership-props-builder (new CfnMembershipProps$Builder) id config))


(defn build-cfn-membership-protected-query-s3-output-configuration-property-builder
  "The build-cfn-membership-protected-query-s3-output-configuration-property-builder function updates a CfnMembership$ProtectedQueryS3OutputConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMembership$ProtectedQueryS3OutputConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |
| `resultFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-format` |
"
  [^CfnMembership$ProtectedQueryS3OutputConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key-prefix)]
    (. builder keyPrefix data))
  (when-some [data (lookup-entry config id :result-format)]
    (. builder resultFormat data))
  (.build builder))


(defn cfn-membership-protected-query-s3-output-configuration-property-builder
  "Creates a  `CfnMembership$ProtectedQueryS3OutputConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-membership-protected-query-s3-output-configuration-property-builder (new CfnMembership$ProtectedQueryS3OutputConfigurationProperty$Builder) id config))


(defn build-cfn-privacy-budget-template-builder
  "The build-cfn-privacy-budget-template-builder function updates a CfnPrivacyBudgetTemplate$Builder instance using the provided configuration.
  The function takes the CfnPrivacyBudgetTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRefresh` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-refresh` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `privacyBudgetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:privacy-budget-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPrivacyBudgetTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-refresh)]
    (. builder autoRefresh data))
  (when-some [data (lookup-entry config id :membership-identifier)]
    (. builder membershipIdentifier data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :privacy-budget-type)]
    (. builder privacyBudgetType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-privacy-budget-template-builder
  "Creates a  `CfnPrivacyBudgetTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-privacy-budget-template-builder (CfnPrivacyBudgetTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-privacy-budget-template-parameters-property-builder
  "The build-cfn-privacy-budget-template-parameters-property-builder function updates a CfnPrivacyBudgetTemplate$ParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPrivacyBudgetTemplate$ParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `epsilon` | java.lang.Number | [[cdk.support/lookup-entry]] | `:epsilon` |
| `usersNoisePerQuery` | java.lang.Number | [[cdk.support/lookup-entry]] | `:users-noise-per-query` |
"
  [^CfnPrivacyBudgetTemplate$ParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :epsilon)]
    (. builder epsilon data))
  (when-some [data (lookup-entry config id :users-noise-per-query)]
    (. builder usersNoisePerQuery data))
  (.build builder))


(defn cfn-privacy-budget-template-parameters-property-builder
  "Creates a  `CfnPrivacyBudgetTemplate$ParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-privacy-budget-template-parameters-property-builder (new CfnPrivacyBudgetTemplate$ParametersProperty$Builder) id config))


(defn build-cfn-privacy-budget-template-props-builder
  "The build-cfn-privacy-budget-template-props-builder function updates a CfnPrivacyBudgetTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnPrivacyBudgetTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRefresh` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-refresh` |
| `membershipIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:membership-identifier` |
| `parameters` | software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate$ParametersProperty | [[cdk.support/lookup-entry]] | `:parameters` |
| `privacyBudgetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:privacy-budget-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPrivacyBudgetTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-refresh)]
    (. builder autoRefresh data))
  (when-some [data (lookup-entry config id :membership-identifier)]
    (. builder membershipIdentifier data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :privacy-budget-type)]
    (. builder privacyBudgetType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-privacy-budget-template-props-builder
  "Creates a  `CfnPrivacyBudgetTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-privacy-budget-template-props-builder (new CfnPrivacyBudgetTemplateProps$Builder) id config))