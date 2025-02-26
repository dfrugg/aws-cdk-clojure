(ns cdk.api.services.qbusiness
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.qbusiness package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.qbusiness CfnApplication$AttachmentsConfigurationProperty$Builder
                                                      CfnApplication$Builder
                                                      CfnApplication$EncryptionConfigurationProperty$Builder
                                                      CfnApplicationProps$Builder
                                                      CfnDataSource$Builder
                                                      CfnDataSource$DataSourceVpcConfigurationProperty$Builder
                                                      CfnDataSource$DocumentAttributeConditionProperty$Builder
                                                      CfnDataSource$DocumentAttributeTargetProperty$Builder
                                                      CfnDataSource$DocumentAttributeValueProperty$Builder
                                                      CfnDataSource$DocumentEnrichmentConfigurationProperty$Builder
                                                      CfnDataSource$HookConfigurationProperty$Builder
                                                      CfnDataSource$InlineDocumentEnrichmentConfigurationProperty$Builder
                                                      CfnDataSourceProps$Builder
                                                      CfnIndex$Builder
                                                      CfnIndex$DocumentAttributeConfigurationProperty$Builder
                                                      CfnIndex$IndexCapacityConfigurationProperty$Builder
                                                      CfnIndex$IndexStatisticsProperty$Builder
                                                      CfnIndex$TextDocumentStatisticsProperty$Builder
                                                      CfnIndexProps$Builder
                                                      CfnPlugin$APISchemaProperty$Builder
                                                      CfnPlugin$BasicAuthConfigurationProperty$Builder
                                                      CfnPlugin$Builder
                                                      CfnPlugin$CustomPluginConfigurationProperty$Builder
                                                      CfnPlugin$OAuth2ClientCredentialConfigurationProperty$Builder
                                                      CfnPlugin$PluginAuthConfigurationProperty$Builder
                                                      CfnPlugin$S3Property$Builder
                                                      CfnPluginProps$Builder
                                                      CfnRetriever$Builder
                                                      CfnRetriever$KendraIndexConfigurationProperty$Builder
                                                      CfnRetriever$NativeIndexConfigurationProperty$Builder
                                                      CfnRetriever$RetrieverConfigurationProperty$Builder
                                                      CfnRetrieverProps$Builder
                                                      CfnWebExperience$Builder
                                                      CfnWebExperienceProps$Builder]))


(defn build-cfn-application-attachments-configuration-property-builder
  "The build-cfn-application-attachments-configuration-property-builder function updates a CfnApplication$AttachmentsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$AttachmentsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentsControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachments-control-mode` |
"
  [^CfnApplication$AttachmentsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attachments-control-mode)]
    (. builder attachmentsControlMode data))
  (.build builder))


(defn cfn-application-attachments-configuration-property-builder
  "Creates a  `CfnApplication$AttachmentsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-attachments-configuration-property-builder (new CfnApplication$AttachmentsConfigurationProperty$Builder) id config))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentsConfiguration` | software.amazon.awscdk.services.qbusiness.CfnApplication$AttachmentsConfigurationProperty | [[cdk.support/lookup-entry]] | `:attachments-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `identityCenterInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-center-instance-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-let [data (lookup-entry config id :attachments-configuration)]
    (. builder attachmentsConfiguration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-let [data (lookup-entry config id :identity-center-instance-arn)]
    (. builder identityCenterInstanceArn data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-builder (CfnApplication$Builder/create scope (name id)) id config))


(defn build-cfn-application-encryption-configuration-property-builder
  "The build-cfn-application-encryption-configuration-property-builder function updates a CfnApplication$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnApplication$EncryptionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-application-encryption-configuration-property-builder
  "Creates a  `CfnApplication$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-encryption-configuration-property-builder (new CfnApplication$EncryptionConfigurationProperty$Builder) id config))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attachments-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionConfiguration` | software.amazon.awscdk.services.qbusiness.CfnApplication$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `identityCenterInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-center-instance-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :attachments-configuration)]
    (. builder attachmentsConfiguration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-let [data (lookup-entry config id :identity-center-instance-arn)]
    (. builder identityCenterInstanceArn data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-props-builder (new CfnApplicationProps$Builder) id config))


(defn build-cfn-data-source-builder
  "The build-cfn-data-source-builder function updates a CfnDataSource$Builder instance using the provided configuration.
  The function takes the CfnDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configuration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `documentEnrichmentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:document-enrichment-configuration` |
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `syncSchedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-schedule` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfiguration` | software.amazon.awscdk.services.qbusiness.CfnDataSource$DataSourceVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnDataSource$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :document-enrichment-configuration)]
    (. builder documentEnrichmentConfiguration data))
  (when-let [data (lookup-entry config id :index-id)]
    (. builder indexId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :sync-schedule)]
    (. builder syncSchedule data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-data-source-builder
  "Creates a  `CfnDataSource$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-data-source-builder (CfnDataSource$Builder/create scope (name id)) id config))


(defn build-cfn-data-source-data-source-vpc-configuration-property-builder
  "The build-cfn-data-source-data-source-vpc-configuration-property-builder function updates a CfnDataSource$DataSourceVpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DataSourceVpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnDataSource$DataSourceVpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-data-source-data-source-vpc-configuration-property-builder
  "Creates a  `CfnDataSource$DataSourceVpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-data-source-vpc-configuration-property-builder (new CfnDataSource$DataSourceVpcConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-document-attribute-condition-property-builder
  "The build-cfn-data-source-document-attribute-condition-property-builder function updates a CfnDataSource$DocumentAttributeConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DocumentAttributeConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDataSource$DocumentAttributeConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :operator)]
    (. builder operator data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-data-source-document-attribute-condition-property-builder
  "Creates a  `CfnDataSource$DocumentAttributeConditionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-document-attribute-condition-property-builder (new CfnDataSource$DocumentAttributeConditionProperty$Builder) id config))


(defn build-cfn-data-source-document-attribute-target-property-builder
  "The build-cfn-data-source-document-attribute-target-property-builder function updates a CfnDataSource$DocumentAttributeTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DocumentAttributeTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeValueOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-value-operator` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | software.amazon.awscdk.services.qbusiness.CfnDataSource$DocumentAttributeValueProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDataSource$DocumentAttributeTargetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attribute-value-operator)]
    (. builder attributeValueOperator data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-data-source-document-attribute-target-property-builder
  "Creates a  `CfnDataSource$DocumentAttributeTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-document-attribute-target-property-builder (new CfnDataSource$DocumentAttributeTargetProperty$Builder) id config))


(defn build-cfn-data-source-document-attribute-value-property-builder
  "The build-cfn-data-source-document-attribute-value-property-builder function updates a CfnDataSource$DocumentAttributeValueProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DocumentAttributeValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dateValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-value` |
| `longValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:long-value` |
| `stringListValue` | java.util.List | [[cdk.support/lookup-entry]] | `:string-list-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnDataSource$DocumentAttributeValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :date-value)]
    (. builder dateValue data))
  (when-let [data (lookup-entry config id :long-value)]
    (. builder longValue data))
  (when-let [data (lookup-entry config id :string-list-value)]
    (. builder stringListValue data))
  (when-let [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-data-source-document-attribute-value-property-builder
  "Creates a  `CfnDataSource$DocumentAttributeValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-document-attribute-value-property-builder (new CfnDataSource$DocumentAttributeValueProperty$Builder) id config))


(defn build-cfn-data-source-document-enrichment-configuration-property-builder
  "The build-cfn-data-source-document-enrichment-configuration-property-builder function updates a CfnDataSource$DocumentEnrichmentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DocumentEnrichmentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:inline-configurations` |
| `postExtractionHookConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-extraction-hook-configuration` |
| `preExtractionHookConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pre-extraction-hook-configuration` |
"
  [^CfnDataSource$DocumentEnrichmentConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :inline-configurations)]
    (. builder inlineConfigurations data))
  (when-let [data (lookup-entry config id :post-extraction-hook-configuration)]
    (. builder postExtractionHookConfiguration data))
  (when-let [data (lookup-entry config id :pre-extraction-hook-configuration)]
    (. builder preExtractionHookConfiguration data))
  (.build builder))


(defn cfn-data-source-document-enrichment-configuration-property-builder
  "Creates a  `CfnDataSource$DocumentEnrichmentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-document-enrichment-configuration-property-builder (new CfnDataSource$DocumentEnrichmentConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-hook-configuration-property-builder
  "The build-cfn-data-source-hook-configuration-property-builder function updates a CfnDataSource$HookConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$HookConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invocation-condition` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
"
  [^CfnDataSource$HookConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invocation-condition)]
    (. builder invocationCondition data))
  (when-let [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :s3-bucket-name)]
    (. builder s3BucketName data))
  (.build builder))


(defn cfn-data-source-hook-configuration-property-builder
  "Creates a  `CfnDataSource$HookConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-hook-configuration-property-builder (new CfnDataSource$HookConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-inline-document-enrichment-configuration-property-builder
  "The build-cfn-data-source-inline-document-enrichment-configuration-property-builder function updates a CfnDataSource$InlineDocumentEnrichmentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$InlineDocumentEnrichmentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:condition` |
| `documentContentOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-content-operator` |
| `target` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnDataSource$InlineDocumentEnrichmentConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :document-content-operator)]
    (. builder documentContentOperator data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-data-source-inline-document-enrichment-configuration-property-builder
  "Creates a  `CfnDataSource$InlineDocumentEnrichmentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-inline-document-enrichment-configuration-property-builder (new CfnDataSource$InlineDocumentEnrichmentConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-props-builder
  "The build-cfn-data-source-props-builder function updates a CfnDataSourceProps$Builder instance using the provided configuration.
  The function takes the CfnDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configuration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `documentEnrichmentConfiguration` | software.amazon.awscdk.services.qbusiness.CfnDataSource$DocumentEnrichmentConfigurationProperty | [[cdk.support/lookup-entry]] | `:document-enrichment-configuration` |
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `syncSchedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-schedule` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnDataSourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :document-enrichment-configuration)]
    (. builder documentEnrichmentConfiguration data))
  (when-let [data (lookup-entry config id :index-id)]
    (. builder indexId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :sync-schedule)]
    (. builder syncSchedule data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-data-source-props-builder
  "Creates a  `CfnDataSourceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-props-builder (new CfnDataSourceProps$Builder) id config))


(defn build-cfn-index-builder
  "The build-cfn-index-builder function updates a CfnIndex$Builder instance using the provided configuration.
  The function takes the CfnIndex$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `capacityConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `documentAttributeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:document-attribute-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIndex$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :capacity-configuration)]
    (. builder capacityConfiguration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :document-attribute-configurations)]
    (. builder documentAttributeConfigurations data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-index-builder
  "Creates a  `CfnIndex$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-index-builder (CfnIndex$Builder/create scope (name id)) id config))


(defn build-cfn-index-document-attribute-configuration-property-builder
  "The build-cfn-index-document-attribute-configuration-property-builder function updates a CfnIndex$DocumentAttributeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$DocumentAttributeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `search` | java.lang.String | [[cdk.support/lookup-entry]] | `:search` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIndex$DocumentAttributeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :search)]
    (. builder search data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-index-document-attribute-configuration-property-builder
  "Creates a  `CfnIndex$DocumentAttributeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-document-attribute-configuration-property-builder (new CfnIndex$DocumentAttributeConfigurationProperty$Builder) id config))


(defn build-cfn-index-index-capacity-configuration-property-builder
  "The build-cfn-index-index-capacity-configuration-property-builder function updates a CfnIndex$IndexCapacityConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$IndexCapacityConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `units` | java.lang.Number | [[cdk.support/lookup-entry]] | `:units` |
"
  [^CfnIndex$IndexCapacityConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :units)]
    (. builder units data))
  (.build builder))


(defn cfn-index-index-capacity-configuration-property-builder
  "Creates a  `CfnIndex$IndexCapacityConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-index-capacity-configuration-property-builder (new CfnIndex$IndexCapacityConfigurationProperty$Builder) id config))


(defn build-cfn-index-index-statistics-property-builder
  "The build-cfn-index-index-statistics-property-builder function updates a CfnIndex$IndexStatisticsProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$IndexStatisticsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textDocumentStatistics` | software.amazon.awscdk.services.qbusiness.CfnIndex$TextDocumentStatisticsProperty | [[cdk.support/lookup-entry]] | `:text-document-statistics` |
"
  [^CfnIndex$IndexStatisticsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :text-document-statistics)]
    (. builder textDocumentStatistics data))
  (.build builder))


(defn cfn-index-index-statistics-property-builder
  "Creates a  `CfnIndex$IndexStatisticsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-index-statistics-property-builder (new CfnIndex$IndexStatisticsProperty$Builder) id config))


(defn build-cfn-index-props-builder
  "The build-cfn-index-props-builder function updates a CfnIndexProps$Builder instance using the provided configuration.
  The function takes the CfnIndexProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `capacityConfiguration` | software.amazon.awscdk.services.qbusiness.CfnIndex$IndexCapacityConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `documentAttributeConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:document-attribute-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIndexProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :capacity-configuration)]
    (. builder capacityConfiguration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :document-attribute-configurations)]
    (. builder documentAttributeConfigurations data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-index-props-builder
  "Creates a  `CfnIndexProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-props-builder (new CfnIndexProps$Builder) id config))


(defn build-cfn-index-text-document-statistics-property-builder
  "The build-cfn-index-text-document-statistics-property-builder function updates a CfnIndex$TextDocumentStatisticsProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$TextDocumentStatisticsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexedTextBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:indexed-text-bytes` |
| `indexedTextDocumentCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:indexed-text-document-count` |
"
  [^CfnIndex$TextDocumentStatisticsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :indexed-text-bytes)]
    (. builder indexedTextBytes data))
  (when-let [data (lookup-entry config id :indexed-text-document-count)]
    (. builder indexedTextDocumentCount data))
  (.build builder))


(defn cfn-index-text-document-statistics-property-builder
  "Creates a  `CfnIndex$TextDocumentStatisticsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-text-document-statistics-property-builder (new CfnIndex$TextDocumentStatisticsProperty$Builder) id config))


(defn build-cfn-plugin-api-schema-property-builder
  "The build-cfn-plugin-api-schema-property-builder function updates a CfnPlugin$APISchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnPlugin$APISchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnPlugin$APISchemaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-plugin-api-schema-property-builder
  "Creates a  `CfnPlugin$APISchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plugin-api-schema-property-builder (new CfnPlugin$APISchemaProperty$Builder) id config))


(defn build-cfn-plugin-basic-auth-configuration-property-builder
  "The build-cfn-plugin-basic-auth-configuration-property-builder function updates a CfnPlugin$BasicAuthConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlugin$BasicAuthConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnPlugin$BasicAuthConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-plugin-basic-auth-configuration-property-builder
  "Creates a  `CfnPlugin$BasicAuthConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plugin-basic-auth-configuration-property-builder (new CfnPlugin$BasicAuthConfigurationProperty$Builder) id config))


(defn build-cfn-plugin-builder
  "The build-cfn-plugin-builder function updates a CfnPlugin$Builder instance using the provided configuration.
  The function takes the CfnPlugin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `authConfiguration` | software.amazon.awscdk.services.qbusiness.CfnPlugin$PluginAuthConfigurationProperty | [[cdk.support/lookup-entry]] | `:auth-configuration` |
| `customPluginConfiguration` | software.amazon.awscdk.services.qbusiness.CfnPlugin$CustomPluginConfigurationProperty | [[cdk.support/lookup-entry]] | `:custom-plugin-configuration` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPlugin$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :auth-configuration)]
    (. builder authConfiguration data))
  (when-let [data (lookup-entry config id :custom-plugin-configuration)]
    (. builder customPluginConfiguration data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :server-url)]
    (. builder serverUrl data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-plugin-builder
  "Creates a  `CfnPlugin$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-plugin-builder (CfnPlugin$Builder/create scope (name id)) id config))


(defn build-cfn-plugin-custom-plugin-configuration-property-builder
  "The build-cfn-plugin-custom-plugin-configuration-property-builder function updates a CfnPlugin$CustomPluginConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlugin$CustomPluginConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiSchema` | software.amazon.awscdk.services.qbusiness.CfnPlugin$APISchemaProperty | [[cdk.support/lookup-entry]] | `:api-schema` |
| `apiSchemaType` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-schema-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnPlugin$CustomPluginConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :api-schema)]
    (. builder apiSchema data))
  (when-let [data (lookup-entry config id :api-schema-type)]
    (. builder apiSchemaType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-plugin-custom-plugin-configuration-property-builder
  "Creates a  `CfnPlugin$CustomPluginConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plugin-custom-plugin-configuration-property-builder (new CfnPlugin$CustomPluginConfigurationProperty$Builder) id config))


(defn build-cfn-plugin-o-auth2-client-credential-configuration-property-builder
  "The build-cfn-plugin-o-auth2-client-credential-configuration-property-builder function updates a CfnPlugin$OAuth2ClientCredentialConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlugin$OAuth2ClientCredentialConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnPlugin$OAuth2ClientCredentialConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-plugin-o-auth2-client-credential-configuration-property-builder
  "Creates a  `CfnPlugin$OAuth2ClientCredentialConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plugin-o-auth2-client-credential-configuration-property-builder (new CfnPlugin$OAuth2ClientCredentialConfigurationProperty$Builder) id config))


(defn build-cfn-plugin-plugin-auth-configuration-property-builder
  "The build-cfn-plugin-plugin-auth-configuration-property-builder function updates a CfnPlugin$PluginAuthConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlugin$PluginAuthConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuthConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:basic-auth-configuration` |
| `noAuthConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:no-auth-configuration` |
| `oAuth2ClientCredentialConfiguration` | software.amazon.awscdk.services.qbusiness.CfnPlugin$OAuth2ClientCredentialConfigurationProperty | [[cdk.support/lookup-entry]] | `:o-auth2-client-credential-configuration` |
"
  [^CfnPlugin$PluginAuthConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :basic-auth-configuration)]
    (. builder basicAuthConfiguration data))
  (when-let [data (lookup-entry config id :no-auth-configuration)]
    (. builder noAuthConfiguration data))
  (when-let [data (lookup-entry config id :o-auth2-client-credential-configuration)]
    (. builder oAuth2ClientCredentialConfiguration data))
  (.build builder))


(defn cfn-plugin-plugin-auth-configuration-property-builder
  "Creates a  `CfnPlugin$PluginAuthConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plugin-plugin-auth-configuration-property-builder (new CfnPlugin$PluginAuthConfigurationProperty$Builder) id config))


(defn build-cfn-plugin-props-builder
  "The build-cfn-plugin-props-builder function updates a CfnPluginProps$Builder instance using the provided configuration.
  The function takes the CfnPluginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `authConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth-configuration` |
| `customPluginConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-plugin-configuration` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPluginProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :auth-configuration)]
    (. builder authConfiguration data))
  (when-let [data (lookup-entry config id :custom-plugin-configuration)]
    (. builder customPluginConfiguration data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :server-url)]
    (. builder serverUrl data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-plugin-props-builder
  "Creates a  `CfnPluginProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plugin-props-builder (new CfnPluginProps$Builder) id config))


(defn build-cfn-plugin-s3-property-builder
  "The build-cfn-plugin-s3-property-builder function updates a CfnPlugin$S3Property$Builder instance using the provided configuration.
  The function takes the CfnPlugin$S3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnPlugin$S3Property$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-plugin-s3-property-builder
  "Creates a  `CfnPlugin$S3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plugin-s3-property-builder (new CfnPlugin$S3Property$Builder) id config))


(defn build-cfn-retriever-builder
  "The build-cfn-retriever-builder function updates a CfnRetriever$Builder instance using the provided configuration.
  The function takes the CfnRetriever$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRetriever$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-retriever-builder
  "Creates a  `CfnRetriever$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-retriever-builder (CfnRetriever$Builder/create scope (name id)) id config))


(defn build-cfn-retriever-kendra-index-configuration-property-builder
  "The build-cfn-retriever-kendra-index-configuration-property-builder function updates a CfnRetriever$KendraIndexConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRetriever$KendraIndexConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
"
  [^CfnRetriever$KendraIndexConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :index-id)]
    (. builder indexId data))
  (.build builder))


(defn cfn-retriever-kendra-index-configuration-property-builder
  "Creates a  `CfnRetriever$KendraIndexConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-retriever-kendra-index-configuration-property-builder (new CfnRetriever$KendraIndexConfigurationProperty$Builder) id config))


(defn build-cfn-retriever-native-index-configuration-property-builder
  "The build-cfn-retriever-native-index-configuration-property-builder function updates a CfnRetriever$NativeIndexConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRetriever$NativeIndexConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
"
  [^CfnRetriever$NativeIndexConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :index-id)]
    (. builder indexId data))
  (.build builder))


(defn cfn-retriever-native-index-configuration-property-builder
  "Creates a  `CfnRetriever$NativeIndexConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-retriever-native-index-configuration-property-builder (new CfnRetriever$NativeIndexConfigurationProperty$Builder) id config))


(defn build-cfn-retriever-props-builder
  "The build-cfn-retriever-props-builder function updates a CfnRetrieverProps$Builder instance using the provided configuration.
  The function takes the CfnRetrieverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configuration` | software.amazon.awscdk.services.qbusiness.CfnRetriever$RetrieverConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRetrieverProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-retriever-props-builder
  "Creates a  `CfnRetrieverProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-retriever-props-builder (new CfnRetrieverProps$Builder) id config))


(defn build-cfn-retriever-retriever-configuration-property-builder
  "The build-cfn-retriever-retriever-configuration-property-builder function updates a CfnRetriever$RetrieverConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRetriever$RetrieverConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kendraIndexConfiguration` | software.amazon.awscdk.services.qbusiness.CfnRetriever$KendraIndexConfigurationProperty | [[cdk.support/lookup-entry]] | `:kendra-index-configuration` |
| `nativeIndexConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:native-index-configuration` |
"
  [^CfnRetriever$RetrieverConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kendra-index-configuration)]
    (. builder kendraIndexConfiguration data))
  (when-let [data (lookup-entry config id :native-index-configuration)]
    (. builder nativeIndexConfiguration data))
  (.build builder))


(defn cfn-retriever-retriever-configuration-property-builder
  "Creates a  `CfnRetriever$RetrieverConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-retriever-retriever-configuration-property-builder (new CfnRetriever$RetrieverConfigurationProperty$Builder) id config))


(defn build-cfn-web-experience-builder
  "The build-cfn-web-experience-builder function updates a CfnWebExperience$Builder instance using the provided configuration.
  The function takes the CfnWebExperience$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `samplePromptsControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-prompts-control-mode` |
| `subtitle` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtitle` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `welcomeMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:welcome-message` |
"
  [^CfnWebExperience$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :sample-prompts-control-mode)]
    (. builder samplePromptsControlMode data))
  (when-let [data (lookup-entry config id :subtitle)]
    (. builder subtitle data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :title)]
    (. builder title data))
  (when-let [data (lookup-entry config id :welcome-message)]
    (. builder welcomeMessage data))
  (.build builder))


(defn cfn-web-experience-builder
  "Creates a  `CfnWebExperience$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-web-experience-builder (CfnWebExperience$Builder/create scope (name id)) id config))


(defn build-cfn-web-experience-props-builder
  "The build-cfn-web-experience-props-builder function updates a CfnWebExperienceProps$Builder instance using the provided configuration.
  The function takes the CfnWebExperienceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `samplePromptsControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-prompts-control-mode` |
| `subtitle` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtitle` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `welcomeMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:welcome-message` |
"
  [^CfnWebExperienceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :sample-prompts-control-mode)]
    (. builder samplePromptsControlMode data))
  (when-let [data (lookup-entry config id :subtitle)]
    (. builder subtitle data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :title)]
    (. builder title data))
  (when-let [data (lookup-entry config id :welcome-message)]
    (. builder welcomeMessage data))
  (.build builder))


(defn cfn-web-experience-props-builder
  "Creates a  `CfnWebExperienceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-web-experience-props-builder (new CfnWebExperienceProps$Builder) id config))