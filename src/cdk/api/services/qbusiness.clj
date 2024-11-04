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


(defn cfn-application-attachments-configuration-property-builder
  "The cfn-application-attachments-configuration-property-builder function buildes out new instances of 
CfnApplication$AttachmentsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentsControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachments-control-mode` |"
  [stack id config]
  (let [builder (CfnApplication$AttachmentsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :attachments-control-mode)]
      (. builder attachmentsControlMode data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentsConfiguration` | software.amazon.awscdk.services.qbusiness.CfnApplication$AttachmentsConfigurationProperty | [[cdk.support/lookup-entry]] | `:attachments-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `identityCenterInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-center-instance-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-application-encryption-configuration-property-builder
  "The cfn-application-encryption-configuration-property-builder function buildes out new instances of 
CfnApplication$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnApplication$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attachments-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionConfiguration` | software.amazon.awscdk.services.qbusiness.CfnApplication$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `identityCenterInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-center-instance-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-builder
  "The cfn-data-source-builder function buildes out new instances of 
CfnDataSource$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfiguration` | software.amazon.awscdk.services.qbusiness.CfnDataSource$DataSourceVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-data-source-data-source-vpc-configuration-property-builder
  "The cfn-data-source-data-source-vpc-configuration-property-builder function buildes out new instances of 
CfnDataSource$DataSourceVpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnDataSource$DataSourceVpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-data-source-document-attribute-condition-property-builder
  "The cfn-data-source-document-attribute-condition-property-builder function buildes out new instances of 
CfnDataSource$DocumentAttributeConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDataSource$DocumentAttributeConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :operator)]
      (. builder operator data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-data-source-document-attribute-target-property-builder
  "The cfn-data-source-document-attribute-target-property-builder function buildes out new instances of 
CfnDataSource$DocumentAttributeTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeValueOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-value-operator` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | software.amazon.awscdk.services.qbusiness.CfnDataSource$DocumentAttributeValueProperty | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDataSource$DocumentAttributeTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-value-operator)]
      (. builder attributeValueOperator data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-data-source-document-attribute-value-property-builder
  "The cfn-data-source-document-attribute-value-property-builder function buildes out new instances of 
CfnDataSource$DocumentAttributeValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dateValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-value` |
| `longValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:long-value` |
| `stringListValue` | java.util.List | [[cdk.support/lookup-entry]] | `:string-list-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnDataSource$DocumentAttributeValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :date-value)]
      (. builder dateValue data))
    (when-let [data (lookup-entry config id :long-value)]
      (. builder longValue data))
    (when-let [data (lookup-entry config id :string-list-value)]
      (. builder stringListValue data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cfn-data-source-document-enrichment-configuration-property-builder
  "The cfn-data-source-document-enrichment-configuration-property-builder function buildes out new instances of 
CfnDataSource$DocumentEnrichmentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:inline-configurations` |
| `postExtractionHookConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-extraction-hook-configuration` |
| `preExtractionHookConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pre-extraction-hook-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$DocumentEnrichmentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :inline-configurations)]
      (. builder inlineConfigurations data))
    (when-let [data (lookup-entry config id :post-extraction-hook-configuration)]
      (. builder postExtractionHookConfiguration data))
    (when-let [data (lookup-entry config id :pre-extraction-hook-configuration)]
      (. builder preExtractionHookConfiguration data))
    (.build builder)))


(defn cfn-data-source-hook-configuration-property-builder
  "The cfn-data-source-hook-configuration-property-builder function buildes out new instances of 
CfnDataSource$HookConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invocation-condition` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |"
  [stack id config]
  (let [builder (CfnDataSource$HookConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :invocation-condition)]
      (. builder invocationCondition data))
    (when-let [data (lookup-entry config id :lambda-arn)]
      (. builder lambdaArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (.build builder)))


(defn cfn-data-source-inline-document-enrichment-configuration-property-builder
  "The cfn-data-source-inline-document-enrichment-configuration-property-builder function buildes out new instances of 
CfnDataSource$InlineDocumentEnrichmentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:condition` |
| `documentContentOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-content-operator` |
| `target` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnDataSource$InlineDocumentEnrichmentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :document-content-operator)]
      (. builder documentContentOperator data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-data-source-props-builder
  "The cfn-data-source-props-builder function buildes out new instances of 
CfnDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnDataSourceProps$Builder.)]
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
    (.build builder)))


(defn cfn-index-builder
  "The cfn-index-builder function buildes out new instances of 
CfnIndex$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `capacityConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `documentAttributeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:document-attribute-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIndex$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-index-document-attribute-configuration-property-builder
  "The cfn-index-document-attribute-configuration-property-builder function buildes out new instances of 
CfnIndex$DocumentAttributeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `search` | java.lang.String | [[cdk.support/lookup-entry]] | `:search` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIndex$DocumentAttributeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :search)]
      (. builder search data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-index-index-capacity-configuration-property-builder
  "The cfn-index-index-capacity-configuration-property-builder function buildes out new instances of 
CfnIndex$IndexCapacityConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `units` | java.lang.Number | [[cdk.support/lookup-entry]] | `:units` |"
  [stack id config]
  (let [builder (CfnIndex$IndexCapacityConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :units)]
      (. builder units data))
    (.build builder)))


(defn cfn-index-index-statistics-property-builder
  "The cfn-index-index-statistics-property-builder function buildes out new instances of 
CfnIndex$IndexStatisticsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textDocumentStatistics` | software.amazon.awscdk.services.qbusiness.CfnIndex$TextDocumentStatisticsProperty | [[cdk.support/lookup-entry]] | `:text-document-statistics` |"
  [stack id config]
  (let [builder (CfnIndex$IndexStatisticsProperty$Builder.)]
    (when-let [data (lookup-entry config id :text-document-statistics)]
      (. builder textDocumentStatistics data))
    (.build builder)))


(defn cfn-index-props-builder
  "The cfn-index-props-builder function buildes out new instances of 
CfnIndexProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `capacityConfiguration` | software.amazon.awscdk.services.qbusiness.CfnIndex$IndexCapacityConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `documentAttributeConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:document-attribute-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIndexProps$Builder.)]
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
    (.build builder)))


(defn cfn-index-text-document-statistics-property-builder
  "The cfn-index-text-document-statistics-property-builder function buildes out new instances of 
CfnIndex$TextDocumentStatisticsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexedTextBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:indexed-text-bytes` |
| `indexedTextDocumentCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:indexed-text-document-count` |"
  [stack id config]
  (let [builder (CfnIndex$TextDocumentStatisticsProperty$Builder.)]
    (when-let [data (lookup-entry config id :indexed-text-bytes)]
      (. builder indexedTextBytes data))
    (when-let [data (lookup-entry config id :indexed-text-document-count)]
      (. builder indexedTextDocumentCount data))
    (.build builder)))


(defn cfn-plugin-api-schema-property-builder
  "The cfn-plugin-api-schema-property-builder function buildes out new instances of 
CfnPlugin$APISchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnPlugin$APISchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-plugin-basic-auth-configuration-property-builder
  "The cfn-plugin-basic-auth-configuration-property-builder function buildes out new instances of 
CfnPlugin$BasicAuthConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnPlugin$BasicAuthConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (.build builder)))


(defn cfn-plugin-builder
  "The cfn-plugin-builder function buildes out new instances of 
CfnPlugin$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `authConfiguration` | software.amazon.awscdk.services.qbusiness.CfnPlugin$PluginAuthConfigurationProperty | [[cdk.support/lookup-entry]] | `:auth-configuration` |
| `customPluginConfiguration` | software.amazon.awscdk.services.qbusiness.CfnPlugin$CustomPluginConfigurationProperty | [[cdk.support/lookup-entry]] | `:custom-plugin-configuration` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPlugin$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-plugin-custom-plugin-configuration-property-builder
  "The cfn-plugin-custom-plugin-configuration-property-builder function buildes out new instances of 
CfnPlugin$CustomPluginConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiSchema` | software.amazon.awscdk.services.qbusiness.CfnPlugin$APISchemaProperty | [[cdk.support/lookup-entry]] | `:api-schema` |
| `apiSchemaType` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-schema-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnPlugin$CustomPluginConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :api-schema)]
      (. builder apiSchema data))
    (when-let [data (lookup-entry config id :api-schema-type)]
      (. builder apiSchemaType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-plugin-o-auth2-client-credential-configuration-property-builder
  "The cfn-plugin-o-auth2-client-credential-configuration-property-builder function buildes out new instances of 
CfnPlugin$OAuth2ClientCredentialConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnPlugin$OAuth2ClientCredentialConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (.build builder)))


(defn cfn-plugin-plugin-auth-configuration-property-builder
  "The cfn-plugin-plugin-auth-configuration-property-builder function buildes out new instances of 
CfnPlugin$PluginAuthConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuthConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:basic-auth-configuration` |
| `noAuthConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:no-auth-configuration` |
| `oAuth2ClientCredentialConfiguration` | software.amazon.awscdk.services.qbusiness.CfnPlugin$OAuth2ClientCredentialConfigurationProperty | [[cdk.support/lookup-entry]] | `:o-auth2-client-credential-configuration` |"
  [stack id config]
  (let [builder (CfnPlugin$PluginAuthConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :basic-auth-configuration)]
      (. builder basicAuthConfiguration data))
    (when-let [data (lookup-entry config id :no-auth-configuration)]
      (. builder noAuthConfiguration data))
    (when-let [data (lookup-entry config id :o-auth2-client-credential-configuration)]
      (. builder oAuth2ClientCredentialConfiguration data))
    (.build builder)))


(defn cfn-plugin-props-builder
  "The cfn-plugin-props-builder function buildes out new instances of 
CfnPluginProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `authConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth-configuration` |
| `customPluginConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-plugin-configuration` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPluginProps$Builder.)]
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
    (.build builder)))


(defn cfn-plugin-s3-property-builder
  "The cfn-plugin-s3-property-builder function buildes out new instances of 
CfnPlugin$S3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnPlugin$S3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-retriever-builder
  "The cfn-retriever-builder function buildes out new instances of 
CfnRetriever$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRetriever$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-retriever-kendra-index-configuration-property-builder
  "The cfn-retriever-kendra-index-configuration-property-builder function buildes out new instances of 
CfnRetriever$KendraIndexConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |"
  [stack id config]
  (let [builder (CfnRetriever$KendraIndexConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :index-id)]
      (. builder indexId data))
    (.build builder)))


(defn cfn-retriever-native-index-configuration-property-builder
  "The cfn-retriever-native-index-configuration-property-builder function buildes out new instances of 
CfnRetriever$NativeIndexConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |"
  [stack id config]
  (let [builder (CfnRetriever$NativeIndexConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :index-id)]
      (. builder indexId data))
    (.build builder)))


(defn cfn-retriever-props-builder
  "The cfn-retriever-props-builder function buildes out new instances of 
CfnRetrieverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configuration` | software.amazon.awscdk.services.qbusiness.CfnRetriever$RetrieverConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRetrieverProps$Builder.)]
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
    (.build builder)))


(defn cfn-retriever-retriever-configuration-property-builder
  "The cfn-retriever-retriever-configuration-property-builder function buildes out new instances of 
CfnRetriever$RetrieverConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kendraIndexConfiguration` | software.amazon.awscdk.services.qbusiness.CfnRetriever$KendraIndexConfigurationProperty | [[cdk.support/lookup-entry]] | `:kendra-index-configuration` |
| `nativeIndexConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:native-index-configuration` |"
  [stack id config]
  (let [builder (CfnRetriever$RetrieverConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kendra-index-configuration)]
      (. builder kendraIndexConfiguration data))
    (when-let [data (lookup-entry config id :native-index-configuration)]
      (. builder nativeIndexConfiguration data))
    (.build builder)))


(defn cfn-web-experience-builder
  "The cfn-web-experience-builder function buildes out new instances of 
CfnWebExperience$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `samplePromptsControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-prompts-control-mode` |
| `subtitle` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtitle` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `welcomeMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:welcome-message` |"
  [stack id config]
  (let [builder (CfnWebExperience$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-web-experience-props-builder
  "The cfn-web-experience-props-builder function buildes out new instances of 
CfnWebExperienceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `samplePromptsControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-prompts-control-mode` |
| `subtitle` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtitle` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `welcomeMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:welcome-message` |"
  [stack id config]
  (let [builder (CfnWebExperienceProps$Builder.)]
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
    (.build builder)))