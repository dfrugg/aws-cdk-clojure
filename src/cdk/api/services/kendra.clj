(ns cdk.api.services.kendra
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kendra package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kendra CfnDataSource$AccessControlListConfigurationProperty$Builder
                                                   CfnDataSource$AclConfigurationProperty$Builder
                                                   CfnDataSource$Builder
                                                   CfnDataSource$ColumnConfigurationProperty$Builder
                                                   CfnDataSource$ConfluenceAttachmentConfigurationProperty$Builder
                                                   CfnDataSource$ConfluenceAttachmentToIndexFieldMappingProperty$Builder
                                                   CfnDataSource$ConfluenceBlogConfigurationProperty$Builder
                                                   CfnDataSource$ConfluenceBlogToIndexFieldMappingProperty$Builder
                                                   CfnDataSource$ConfluenceConfigurationProperty$Builder
                                                   CfnDataSource$ConfluencePageConfigurationProperty$Builder
                                                   CfnDataSource$ConfluencePageToIndexFieldMappingProperty$Builder
                                                   CfnDataSource$ConfluenceSpaceConfigurationProperty$Builder
                                                   CfnDataSource$ConfluenceSpaceToIndexFieldMappingProperty$Builder
                                                   CfnDataSource$ConnectionConfigurationProperty$Builder
                                                   CfnDataSource$CustomDocumentEnrichmentConfigurationProperty$Builder
                                                   CfnDataSource$DataSourceConfigurationProperty$Builder
                                                   CfnDataSource$DataSourceToIndexFieldMappingProperty$Builder
                                                   CfnDataSource$DataSourceVpcConfigurationProperty$Builder
                                                   CfnDataSource$DatabaseConfigurationProperty$Builder
                                                   CfnDataSource$DocumentAttributeConditionProperty$Builder
                                                   CfnDataSource$DocumentAttributeTargetProperty$Builder
                                                   CfnDataSource$DocumentAttributeValueProperty$Builder
                                                   CfnDataSource$DocumentsMetadataConfigurationProperty$Builder
                                                   CfnDataSource$GoogleDriveConfigurationProperty$Builder
                                                   CfnDataSource$HookConfigurationProperty$Builder
                                                   CfnDataSource$InlineCustomDocumentEnrichmentConfigurationProperty$Builder
                                                   CfnDataSource$OneDriveConfigurationProperty$Builder
                                                   CfnDataSource$OneDriveUsersProperty$Builder
                                                   CfnDataSource$ProxyConfigurationProperty$Builder
                                                   CfnDataSource$S3DataSourceConfigurationProperty$Builder
                                                   CfnDataSource$S3PathProperty$Builder
                                                   CfnDataSource$SalesforceChatterFeedConfigurationProperty$Builder
                                                   CfnDataSource$SalesforceConfigurationProperty$Builder
                                                   CfnDataSource$SalesforceCustomKnowledgeArticleTypeConfigurationProperty$Builder
                                                   CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty$Builder
                                                   CfnDataSource$SalesforceStandardKnowledgeArticleTypeConfigurationProperty$Builder
                                                   CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty$Builder
                                                   CfnDataSource$SalesforceStandardObjectConfigurationProperty$Builder
                                                   CfnDataSource$ServiceNowConfigurationProperty$Builder
                                                   CfnDataSource$ServiceNowKnowledgeArticleConfigurationProperty$Builder
                                                   CfnDataSource$ServiceNowServiceCatalogConfigurationProperty$Builder
                                                   CfnDataSource$SharePointConfigurationProperty$Builder
                                                   CfnDataSource$SqlConfigurationProperty$Builder
                                                   CfnDataSource$TemplateConfigurationProperty$Builder
                                                   CfnDataSource$WebCrawlerAuthenticationConfigurationProperty$Builder
                                                   CfnDataSource$WebCrawlerBasicAuthenticationProperty$Builder
                                                   CfnDataSource$WebCrawlerConfigurationProperty$Builder
                                                   CfnDataSource$WebCrawlerSeedUrlConfigurationProperty$Builder
                                                   CfnDataSource$WebCrawlerSiteMapsConfigurationProperty$Builder
                                                   CfnDataSource$WebCrawlerUrlsProperty$Builder
                                                   CfnDataSource$WorkDocsConfigurationProperty$Builder
                                                   CfnDataSourceProps$Builder
                                                   CfnFaq$Builder
                                                   CfnFaq$S3PathProperty$Builder
                                                   CfnFaqProps$Builder
                                                   CfnIndex$Builder
                                                   CfnIndex$CapacityUnitsConfigurationProperty$Builder
                                                   CfnIndex$DocumentMetadataConfigurationProperty$Builder
                                                   CfnIndex$JsonTokenTypeConfigurationProperty$Builder
                                                   CfnIndex$JwtTokenTypeConfigurationProperty$Builder
                                                   CfnIndex$RelevanceProperty$Builder
                                                   CfnIndex$SearchProperty$Builder
                                                   CfnIndex$ServerSideEncryptionConfigurationProperty$Builder
                                                   CfnIndex$UserTokenConfigurationProperty$Builder
                                                   CfnIndex$ValueImportanceItemProperty$Builder
                                                   CfnIndexProps$Builder]))


(defn build-cfn-data-source-access-control-list-configuration-property-builder
  "The build-cfn-data-source-access-control-list-configuration-property-builder function updates a CfnDataSource$AccessControlListConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$AccessControlListConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-path` |
"
  [^CfnDataSource$AccessControlListConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key-path)]
    (. builder keyPath data))
  (.build builder))


(defn cfn-data-source-access-control-list-configuration-property-builder
  "Creates a  `CfnDataSource$AccessControlListConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-access-control-list-configuration-property-builder (new CfnDataSource$AccessControlListConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-acl-configuration-property-builder
  "The build-cfn-data-source-acl-configuration-property-builder function updates a CfnDataSource$AclConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$AclConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedGroupsColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-groups-column-name` |
"
  [^CfnDataSource$AclConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-groups-column-name)]
    (. builder allowedGroupsColumnName data))
  (.build builder))


(defn cfn-data-source-acl-configuration-property-builder
  "Creates a  `CfnDataSource$AclConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-acl-configuration-property-builder (new CfnDataSource$AclConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-builder
  "The build-cfn-data-source-builder function updates a CfnDataSource$Builder instance using the provided configuration.
  The function takes the CfnDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customDocumentEnrichmentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-document-enrichment-configuration` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataSource$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-document-enrichment-configuration)]
    (. builder customDocumentEnrichmentConfiguration data))
  (when-let [data (lookup-entry config id :data-source-configuration)]
    (. builder dataSourceConfiguration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :index-id)]
    (. builder indexId data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
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


(defn build-cfn-data-source-column-configuration-property-builder
  "The build-cfn-data-source-column-configuration-property-builder function updates a CfnDataSource$ColumnConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ColumnConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeDetectingColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:change-detecting-columns` |
| `documentDataColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-column-name` |
| `documentIdColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-id-column-name` |
| `documentTitleColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-column-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
"
  [^CfnDataSource$ColumnConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :change-detecting-columns)]
    (. builder changeDetectingColumns data))
  (when-let [data (lookup-entry config id :document-data-column-name)]
    (. builder documentDataColumnName data))
  (when-let [data (lookup-entry config id :document-id-column-name)]
    (. builder documentIdColumnName data))
  (when-let [data (lookup-entry config id :document-title-column-name)]
    (. builder documentTitleColumnName data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (.build builder))


(defn cfn-data-source-column-configuration-property-builder
  "Creates a  `CfnDataSource$ColumnConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-column-configuration-property-builder (new CfnDataSource$ColumnConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-confluence-attachment-configuration-property-builder
  "The build-cfn-data-source-confluence-attachment-configuration-property-builder function updates a CfnDataSource$ConfluenceAttachmentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluenceAttachmentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentFieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attachment-field-mappings` |
| `crawlAttachments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-attachments` |
"
  [^CfnDataSource$ConfluenceAttachmentConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attachment-field-mappings)]
    (. builder attachmentFieldMappings data))
  (when-let [data (lookup-entry config id :crawl-attachments)]
    (. builder crawlAttachments data))
  (.build builder))


(defn cfn-data-source-confluence-attachment-configuration-property-builder
  "Creates a  `CfnDataSource$ConfluenceAttachmentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-attachment-configuration-property-builder (new CfnDataSource$ConfluenceAttachmentConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-confluence-attachment-to-index-field-mapping-property-builder
  "The build-cfn-data-source-confluence-attachment-to-index-field-mapping-property-builder function updates a CfnDataSource$ConfluenceAttachmentToIndexFieldMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluenceAttachmentToIndexFieldMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |
"
  [^CfnDataSource$ConfluenceAttachmentToIndexFieldMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source-field-name)]
    (. builder dataSourceFieldName data))
  (when-let [data (lookup-entry config id :date-field-format)]
    (. builder dateFieldFormat data))
  (when-let [data (lookup-entry config id :index-field-name)]
    (. builder indexFieldName data))
  (.build builder))


(defn cfn-data-source-confluence-attachment-to-index-field-mapping-property-builder
  "Creates a  `CfnDataSource$ConfluenceAttachmentToIndexFieldMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-attachment-to-index-field-mapping-property-builder (new CfnDataSource$ConfluenceAttachmentToIndexFieldMappingProperty$Builder) id config))


(defn build-cfn-data-source-confluence-blog-configuration-property-builder
  "The build-cfn-data-source-confluence-blog-configuration-property-builder function updates a CfnDataSource$ConfluenceBlogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluenceBlogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blogFieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:blog-field-mappings` |
"
  [^CfnDataSource$ConfluenceBlogConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :blog-field-mappings)]
    (. builder blogFieldMappings data))
  (.build builder))


(defn cfn-data-source-confluence-blog-configuration-property-builder
  "Creates a  `CfnDataSource$ConfluenceBlogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-blog-configuration-property-builder (new CfnDataSource$ConfluenceBlogConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-confluence-blog-to-index-field-mapping-property-builder
  "The build-cfn-data-source-confluence-blog-to-index-field-mapping-property-builder function updates a CfnDataSource$ConfluenceBlogToIndexFieldMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluenceBlogToIndexFieldMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |
"
  [^CfnDataSource$ConfluenceBlogToIndexFieldMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source-field-name)]
    (. builder dataSourceFieldName data))
  (when-let [data (lookup-entry config id :date-field-format)]
    (. builder dateFieldFormat data))
  (when-let [data (lookup-entry config id :index-field-name)]
    (. builder indexFieldName data))
  (.build builder))


(defn cfn-data-source-confluence-blog-to-index-field-mapping-property-builder
  "Creates a  `CfnDataSource$ConfluenceBlogToIndexFieldMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-blog-to-index-field-mapping-property-builder (new CfnDataSource$ConfluenceBlogToIndexFieldMappingProperty$Builder) id config))


(defn build-cfn-data-source-confluence-configuration-property-builder
  "The build-cfn-data-source-confluence-configuration-property-builder function updates a CfnDataSource$ConfluenceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluenceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attachment-configuration` |
| `blogConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:blog-configuration` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `pageConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:page-configuration` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `spaceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:space-configuration` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnDataSource$ConfluenceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attachment-configuration)]
    (. builder attachmentConfiguration data))
  (when-let [data (lookup-entry config id :blog-configuration)]
    (. builder blogConfiguration data))
  (when-let [data (lookup-entry config id :exclusion-patterns)]
    (. builder exclusionPatterns data))
  (when-let [data (lookup-entry config id :inclusion-patterns)]
    (. builder inclusionPatterns data))
  (when-let [data (lookup-entry config id :page-configuration)]
    (. builder pageConfiguration data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-let [data (lookup-entry config id :server-url)]
    (. builder serverUrl data))
  (when-let [data (lookup-entry config id :space-configuration)]
    (. builder spaceConfiguration data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-data-source-confluence-configuration-property-builder
  "Creates a  `CfnDataSource$ConfluenceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-configuration-property-builder (new CfnDataSource$ConfluenceConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-confluence-page-configuration-property-builder
  "The build-cfn-data-source-confluence-page-configuration-property-builder function updates a CfnDataSource$ConfluencePageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluencePageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pageFieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:page-field-mappings` |
"
  [^CfnDataSource$ConfluencePageConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :page-field-mappings)]
    (. builder pageFieldMappings data))
  (.build builder))


(defn cfn-data-source-confluence-page-configuration-property-builder
  "Creates a  `CfnDataSource$ConfluencePageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-page-configuration-property-builder (new CfnDataSource$ConfluencePageConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-confluence-page-to-index-field-mapping-property-builder
  "The build-cfn-data-source-confluence-page-to-index-field-mapping-property-builder function updates a CfnDataSource$ConfluencePageToIndexFieldMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluencePageToIndexFieldMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |
"
  [^CfnDataSource$ConfluencePageToIndexFieldMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source-field-name)]
    (. builder dataSourceFieldName data))
  (when-let [data (lookup-entry config id :date-field-format)]
    (. builder dateFieldFormat data))
  (when-let [data (lookup-entry config id :index-field-name)]
    (. builder indexFieldName data))
  (.build builder))


(defn cfn-data-source-confluence-page-to-index-field-mapping-property-builder
  "Creates a  `CfnDataSource$ConfluencePageToIndexFieldMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-page-to-index-field-mapping-property-builder (new CfnDataSource$ConfluencePageToIndexFieldMappingProperty$Builder) id config))


(defn build-cfn-data-source-confluence-space-configuration-property-builder
  "The build-cfn-data-source-confluence-space-configuration-property-builder function updates a CfnDataSource$ConfluenceSpaceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluenceSpaceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlArchivedSpaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-archived-spaces` |
| `crawlPersonalSpaces` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:crawl-personal-spaces` |
| `excludeSpaces` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-spaces` |
| `includeSpaces` | java.util.List | [[cdk.support/lookup-entry]] | `:include-spaces` |
| `spaceFieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:space-field-mappings` |
"
  [^CfnDataSource$ConfluenceSpaceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :crawl-archived-spaces)]
    (. builder crawlArchivedSpaces data))
  (when-let [data (lookup-entry config id :crawl-personal-spaces)]
    (. builder crawlPersonalSpaces data))
  (when-let [data (lookup-entry config id :exclude-spaces)]
    (. builder excludeSpaces data))
  (when-let [data (lookup-entry config id :include-spaces)]
    (. builder includeSpaces data))
  (when-let [data (lookup-entry config id :space-field-mappings)]
    (. builder spaceFieldMappings data))
  (.build builder))


(defn cfn-data-source-confluence-space-configuration-property-builder
  "Creates a  `CfnDataSource$ConfluenceSpaceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-space-configuration-property-builder (new CfnDataSource$ConfluenceSpaceConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-confluence-space-to-index-field-mapping-property-builder
  "The build-cfn-data-source-confluence-space-to-index-field-mapping-property-builder function updates a CfnDataSource$ConfluenceSpaceToIndexFieldMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConfluenceSpaceToIndexFieldMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |
"
  [^CfnDataSource$ConfluenceSpaceToIndexFieldMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source-field-name)]
    (. builder dataSourceFieldName data))
  (when-let [data (lookup-entry config id :date-field-format)]
    (. builder dateFieldFormat data))
  (when-let [data (lookup-entry config id :index-field-name)]
    (. builder indexFieldName data))
  (.build builder))


(defn cfn-data-source-confluence-space-to-index-field-mapping-property-builder
  "Creates a  `CfnDataSource$ConfluenceSpaceToIndexFieldMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-confluence-space-to-index-field-mapping-property-builder (new CfnDataSource$ConfluenceSpaceToIndexFieldMappingProperty$Builder) id config))


(defn build-cfn-data-source-connection-configuration-property-builder
  "The build-cfn-data-source-connection-configuration-property-builder function updates a CfnDataSource$ConnectionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ConnectionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseHost` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-host` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databasePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:database-port` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnDataSource$ConnectionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :database-host)]
    (. builder databaseHost data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :database-port)]
    (. builder databasePort data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-data-source-connection-configuration-property-builder
  "Creates a  `CfnDataSource$ConnectionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-connection-configuration-property-builder (new CfnDataSource$ConnectionConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-custom-document-enrichment-configuration-property-builder
  "The build-cfn-data-source-custom-document-enrichment-configuration-property-builder function updates a CfnDataSource$CustomDocumentEnrichmentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$CustomDocumentEnrichmentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:inline-configurations` |
| `postExtractionHookConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$HookConfigurationProperty | [[cdk.support/lookup-entry]] | `:post-extraction-hook-configuration` |
| `preExtractionHookConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pre-extraction-hook-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDataSource$CustomDocumentEnrichmentConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :inline-configurations)]
    (. builder inlineConfigurations data))
  (when-let [data (lookup-entry config id :post-extraction-hook-configuration)]
    (. builder postExtractionHookConfiguration data))
  (when-let [data (lookup-entry config id :pre-extraction-hook-configuration)]
    (. builder preExtractionHookConfiguration data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-data-source-custom-document-enrichment-configuration-property-builder
  "Creates a  `CfnDataSource$CustomDocumentEnrichmentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-custom-document-enrichment-configuration-property-builder (new CfnDataSource$CustomDocumentEnrichmentConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-data-source-configuration-property-builder
  "The build-cfn-data-source-data-source-configuration-property-builder function updates a CfnDataSource$DataSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DataSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `confluenceConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$ConfluenceConfigurationProperty | [[cdk.support/lookup-entry]] | `:confluence-configuration` |
| `databaseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:database-configuration` |
| `googleDriveConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$GoogleDriveConfigurationProperty | [[cdk.support/lookup-entry]] | `:google-drive-configuration` |
| `oneDriveConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$OneDriveConfigurationProperty | [[cdk.support/lookup-entry]] | `:one-drive-configuration` |
| `s3Configuration` | software.amazon.awscdk.services.kendra.CfnDataSource$S3DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
| `salesforceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:salesforce-configuration` |
| `serviceNowConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-now-configuration` |
| `sharePointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:share-point-configuration` |
| `templateConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$TemplateConfigurationProperty | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `webCrawlerConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$WebCrawlerConfigurationProperty | [[cdk.support/lookup-entry]] | `:web-crawler-configuration` |
| `workDocsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:work-docs-configuration` |
"
  [^CfnDataSource$DataSourceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :confluence-configuration)]
    (. builder confluenceConfiguration data))
  (when-let [data (lookup-entry config id :database-configuration)]
    (. builder databaseConfiguration data))
  (when-let [data (lookup-entry config id :google-drive-configuration)]
    (. builder googleDriveConfiguration data))
  (when-let [data (lookup-entry config id :one-drive-configuration)]
    (. builder oneDriveConfiguration data))
  (when-let [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (when-let [data (lookup-entry config id :salesforce-configuration)]
    (. builder salesforceConfiguration data))
  (when-let [data (lookup-entry config id :service-now-configuration)]
    (. builder serviceNowConfiguration data))
  (when-let [data (lookup-entry config id :share-point-configuration)]
    (. builder sharePointConfiguration data))
  (when-let [data (lookup-entry config id :template-configuration)]
    (. builder templateConfiguration data))
  (when-let [data (lookup-entry config id :web-crawler-configuration)]
    (. builder webCrawlerConfiguration data))
  (when-let [data (lookup-entry config id :work-docs-configuration)]
    (. builder workDocsConfiguration data))
  (.build builder))


(defn cfn-data-source-data-source-configuration-property-builder
  "Creates a  `CfnDataSource$DataSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-data-source-configuration-property-builder (new CfnDataSource$DataSourceConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-data-source-to-index-field-mapping-property-builder
  "The build-cfn-data-source-data-source-to-index-field-mapping-property-builder function updates a CfnDataSource$DataSourceToIndexFieldMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DataSourceToIndexFieldMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |
"
  [^CfnDataSource$DataSourceToIndexFieldMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source-field-name)]
    (. builder dataSourceFieldName data))
  (when-let [data (lookup-entry config id :date-field-format)]
    (. builder dateFieldFormat data))
  (when-let [data (lookup-entry config id :index-field-name)]
    (. builder indexFieldName data))
  (.build builder))


(defn cfn-data-source-data-source-to-index-field-mapping-property-builder
  "Creates a  `CfnDataSource$DataSourceToIndexFieldMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-data-source-to-index-field-mapping-property-builder (new CfnDataSource$DataSourceToIndexFieldMappingProperty$Builder) id config))


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


(defn build-cfn-data-source-database-configuration-property-builder
  "The build-cfn-data-source-database-configuration-property-builder function updates a CfnDataSource$DatabaseConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DatabaseConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$AclConfigurationProperty | [[cdk.support/lookup-entry]] | `:acl-configuration` |
| `columnConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-configuration` |
| `connectionConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$ConnectionConfigurationProperty | [[cdk.support/lookup-entry]] | `:connection-configuration` |
| `databaseEngineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-engine-type` |
| `sqlConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$SqlConfigurationProperty | [[cdk.support/lookup-entry]] | `:sql-configuration` |
| `vpcConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$DataSourceVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnDataSource$DatabaseConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acl-configuration)]
    (. builder aclConfiguration data))
  (when-let [data (lookup-entry config id :column-configuration)]
    (. builder columnConfiguration data))
  (when-let [data (lookup-entry config id :connection-configuration)]
    (. builder connectionConfiguration data))
  (when-let [data (lookup-entry config id :database-engine-type)]
    (. builder databaseEngineType data))
  (when-let [data (lookup-entry config id :sql-configuration)]
    (. builder sqlConfiguration data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-data-source-database-configuration-property-builder
  "Creates a  `CfnDataSource$DatabaseConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-database-configuration-property-builder (new CfnDataSource$DatabaseConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-document-attribute-condition-property-builder
  "The build-cfn-data-source-document-attribute-condition-property-builder function updates a CfnDataSource$DocumentAttributeConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DocumentAttributeConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionDocumentAttributeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-document-attribute-key` |
| `conditionOnValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:condition-on-value` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
"
  [^CfnDataSource$DocumentAttributeConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :condition-document-attribute-key)]
    (. builder conditionDocumentAttributeKey data))
  (when-let [data (lookup-entry config id :condition-on-value)]
    (. builder conditionOnValue data))
  (when-let [data (lookup-entry config id :operator)]
    (. builder operator data))
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
| `targetDocumentAttributeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-document-attribute-key` |
| `targetDocumentAttributeValue` | software.amazon.awscdk.services.kendra.CfnDataSource$DocumentAttributeValueProperty | [[cdk.support/lookup-entry]] | `:target-document-attribute-value` |
| `targetDocumentAttributeValueDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:target-document-attribute-value-deletion` |
"
  [^CfnDataSource$DocumentAttributeTargetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :target-document-attribute-key)]
    (. builder targetDocumentAttributeKey data))
  (when-let [data (lookup-entry config id :target-document-attribute-value)]
    (. builder targetDocumentAttributeValue data))
  (when-let [data (lookup-entry config id :target-document-attribute-value-deletion)]
    (. builder targetDocumentAttributeValueDeletion data))
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


(defn build-cfn-data-source-documents-metadata-configuration-property-builder
  "The build-cfn-data-source-documents-metadata-configuration-property-builder function updates a CfnDataSource$DocumentsMetadataConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DocumentsMetadataConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix` |
"
  [^CfnDataSource$DocumentsMetadataConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-prefix)]
    (. builder s3Prefix data))
  (.build builder))


(defn cfn-data-source-documents-metadata-configuration-property-builder
  "Creates a  `CfnDataSource$DocumentsMetadataConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-documents-metadata-configuration-property-builder (new CfnDataSource$DocumentsMetadataConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-google-drive-configuration-property-builder
  "The build-cfn-data-source-google-drive-configuration-property-builder function updates a CfnDataSource$GoogleDriveConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$GoogleDriveConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeMimeTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-mime-types` |
| `excludeSharedDrives` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-shared-drives` |
| `excludeUserAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-user-accounts` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnDataSource$GoogleDriveConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exclude-mime-types)]
    (. builder excludeMimeTypes data))
  (when-let [data (lookup-entry config id :exclude-shared-drives)]
    (. builder excludeSharedDrives data))
  (when-let [data (lookup-entry config id :exclude-user-accounts)]
    (. builder excludeUserAccounts data))
  (when-let [data (lookup-entry config id :exclusion-patterns)]
    (. builder exclusionPatterns data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :inclusion-patterns)]
    (. builder inclusionPatterns data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-data-source-google-drive-configuration-property-builder
  "Creates a  `CfnDataSource$GoogleDriveConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-google-drive-configuration-property-builder (new CfnDataSource$GoogleDriveConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-hook-configuration-property-builder
  "The build-cfn-data-source-hook-configuration-property-builder function updates a CfnDataSource$HookConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$HookConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invocation-condition` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
"
  [^CfnDataSource$HookConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invocation-condition)]
    (. builder invocationCondition data))
  (when-let [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (.build builder))


(defn cfn-data-source-hook-configuration-property-builder
  "Creates a  `CfnDataSource$HookConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-hook-configuration-property-builder (new CfnDataSource$HookConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-inline-custom-document-enrichment-configuration-property-builder
  "The build-cfn-data-source-inline-custom-document-enrichment-configuration-property-builder function updates a CfnDataSource$InlineCustomDocumentEnrichmentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$InlineCustomDocumentEnrichmentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:condition` |
| `documentContentDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:document-content-deletion` |
| `target` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnDataSource$InlineCustomDocumentEnrichmentConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :document-content-deletion)]
    (. builder documentContentDeletion data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-data-source-inline-custom-document-enrichment-configuration-property-builder
  "Creates a  `CfnDataSource$InlineCustomDocumentEnrichmentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-inline-custom-document-enrichment-configuration-property-builder (new CfnDataSource$InlineCustomDocumentEnrichmentConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-one-drive-configuration-property-builder
  "The build-cfn-data-source-one-drive-configuration-property-builder function updates a CfnDataSource$OneDriveConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$OneDriveConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableLocalGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-local-groups` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `oneDriveUsers` | software.amazon.awscdk.services.kendra.CfnDataSource$OneDriveUsersProperty | [[cdk.support/lookup-entry]] | `:one-drive-users` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `tenantDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenant-domain` |
"
  [^CfnDataSource$OneDriveConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :disable-local-groups)]
    (. builder disableLocalGroups data))
  (when-let [data (lookup-entry config id :exclusion-patterns)]
    (. builder exclusionPatterns data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :inclusion-patterns)]
    (. builder inclusionPatterns data))
  (when-let [data (lookup-entry config id :one-drive-users)]
    (. builder oneDriveUsers data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-let [data (lookup-entry config id :tenant-domain)]
    (. builder tenantDomain data))
  (.build builder))


(defn cfn-data-source-one-drive-configuration-property-builder
  "Creates a  `CfnDataSource$OneDriveConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-one-drive-configuration-property-builder (new CfnDataSource$OneDriveConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-one-drive-users-property-builder
  "The build-cfn-data-source-one-drive-users-property-builder function updates a CfnDataSource$OneDriveUsersProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$OneDriveUsersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oneDriveUserList` | java.util.List | [[cdk.support/lookup-entry]] | `:one-drive-user-list` |
| `oneDriveUserS3Path` | software.amazon.awscdk.services.kendra.CfnDataSource$S3PathProperty | [[cdk.support/lookup-entry]] | `:one-drive-user-s3-path` |
"
  [^CfnDataSource$OneDriveUsersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :one-drive-user-list)]
    (. builder oneDriveUserList data))
  (when-let [data (lookup-entry config id :one-drive-user-s3-path)]
    (. builder oneDriveUserS3Path data))
  (.build builder))


(defn cfn-data-source-one-drive-users-property-builder
  "Creates a  `CfnDataSource$OneDriveUsersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-one-drive-users-property-builder (new CfnDataSource$OneDriveUsersProperty$Builder) id config))


(defn build-cfn-data-source-props-builder
  "The build-cfn-data-source-props-builder function updates a CfnDataSourceProps$Builder instance using the provided configuration.
  The function takes the CfnDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customDocumentEnrichmentConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$CustomDocumentEnrichmentConfigurationProperty | [[cdk.support/lookup-entry]] | `:custom-document-enrichment-configuration` |
| `dataSourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataSourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-document-enrichment-configuration)]
    (. builder customDocumentEnrichmentConfiguration data))
  (when-let [data (lookup-entry config id :data-source-configuration)]
    (. builder dataSourceConfiguration data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :index-id)]
    (. builder indexId data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-data-source-props-builder
  "Creates a  `CfnDataSourceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-props-builder (new CfnDataSourceProps$Builder) id config))


(defn build-cfn-data-source-proxy-configuration-property-builder
  "The build-cfn-data-source-proxy-configuration-property-builder function updates a CfnDataSource$ProxyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ProxyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentials` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials` |
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnDataSource$ProxyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (lookup-entry config id :host)]
    (. builder host data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-data-source-proxy-configuration-property-builder
  "Creates a  `CfnDataSource$ProxyConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-proxy-configuration-property-builder (new CfnDataSource$ProxyConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-s3-data-source-configuration-property-builder
  "The build-cfn-data-source-s3-data-source-configuration-property-builder function updates a CfnDataSource$S3DataSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$S3DataSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlListConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$AccessControlListConfigurationProperty | [[cdk.support/lookup-entry]] | `:access-control-list-configuration` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `documentsMetadataConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:documents-metadata-configuration` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `inclusionPrefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-prefixes` |
"
  [^CfnDataSource$S3DataSourceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-control-list-configuration)]
    (. builder accessControlListConfiguration data))
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :documents-metadata-configuration)]
    (. builder documentsMetadataConfiguration data))
  (when-let [data (lookup-entry config id :exclusion-patterns)]
    (. builder exclusionPatterns data))
  (when-let [data (lookup-entry config id :inclusion-patterns)]
    (. builder inclusionPatterns data))
  (when-let [data (lookup-entry config id :inclusion-prefixes)]
    (. builder inclusionPrefixes data))
  (.build builder))


(defn cfn-data-source-s3-data-source-configuration-property-builder
  "Creates a  `CfnDataSource$S3DataSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-s3-data-source-configuration-property-builder (new CfnDataSource$S3DataSourceConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-s3-path-property-builder
  "The build-cfn-data-source-s3-path-property-builder function updates a CfnDataSource$S3PathProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$S3PathProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnDataSource$S3PathProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-data-source-s3-path-property-builder
  "Creates a  `CfnDataSource$S3PathProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-s3-path-property-builder (new CfnDataSource$S3PathProperty$Builder) id config))


(defn build-cfn-data-source-salesforce-chatter-feed-configuration-property-builder
  "The build-cfn-data-source-salesforce-chatter-feed-configuration-property-builder function updates a CfnDataSource$SalesforceChatterFeedConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SalesforceChatterFeedConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `includeFilterTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:include-filter-types` |
"
  [^CfnDataSource$SalesforceChatterFeedConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-data-field-name)]
    (. builder documentDataFieldName data))
  (when-let [data (lookup-entry config id :document-title-field-name)]
    (. builder documentTitleFieldName data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :include-filter-types)]
    (. builder includeFilterTypes data))
  (.build builder))


(defn cfn-data-source-salesforce-chatter-feed-configuration-property-builder
  "Creates a  `CfnDataSource$SalesforceChatterFeedConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-salesforce-chatter-feed-configuration-property-builder (new CfnDataSource$SalesforceChatterFeedConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-salesforce-configuration-property-builder
  "The build-cfn-data-source-salesforce-configuration-property-builder function updates a CfnDataSource$SalesforceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SalesforceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `chatterFeedConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:chatter-feed-configuration` |
| `crawlAttachments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-attachments` |
| `excludeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-attachment-file-patterns` |
| `includeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:include-attachment-file-patterns` |
| `knowledgeArticleConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty | [[cdk.support/lookup-entry]] | `:knowledge-article-configuration` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `standardObjectAttachmentConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty | [[cdk.support/lookup-entry]] | `:standard-object-attachment-configuration` |
| `standardObjectConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:standard-object-configurations` |
"
  [^CfnDataSource$SalesforceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :chatter-feed-configuration)]
    (. builder chatterFeedConfiguration data))
  (when-let [data (lookup-entry config id :crawl-attachments)]
    (. builder crawlAttachments data))
  (when-let [data (lookup-entry config id :exclude-attachment-file-patterns)]
    (. builder excludeAttachmentFilePatterns data))
  (when-let [data (lookup-entry config id :include-attachment-file-patterns)]
    (. builder includeAttachmentFilePatterns data))
  (when-let [data (lookup-entry config id :knowledge-article-configuration)]
    (. builder knowledgeArticleConfiguration data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-let [data (lookup-entry config id :server-url)]
    (. builder serverUrl data))
  (when-let [data (lookup-entry config id :standard-object-attachment-configuration)]
    (. builder standardObjectAttachmentConfiguration data))
  (when-let [data (lookup-entry config id :standard-object-configurations)]
    (. builder standardObjectConfigurations data))
  (.build builder))


(defn cfn-data-source-salesforce-configuration-property-builder
  "Creates a  `CfnDataSource$SalesforceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-salesforce-configuration-property-builder (new CfnDataSource$SalesforceConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-salesforce-custom-knowledge-article-type-configuration-property-builder
  "The build-cfn-data-source-salesforce-custom-knowledge-article-type-configuration-property-builder function updates a CfnDataSource$SalesforceCustomKnowledgeArticleTypeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SalesforceCustomKnowledgeArticleTypeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnDataSource$SalesforceCustomKnowledgeArticleTypeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-data-field-name)]
    (. builder documentDataFieldName data))
  (when-let [data (lookup-entry config id :document-title-field-name)]
    (. builder documentTitleFieldName data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-data-source-salesforce-custom-knowledge-article-type-configuration-property-builder
  "Creates a  `CfnDataSource$SalesforceCustomKnowledgeArticleTypeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-salesforce-custom-knowledge-article-type-configuration-property-builder (new CfnDataSource$SalesforceCustomKnowledgeArticleTypeConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-salesforce-knowledge-article-configuration-property-builder
  "The build-cfn-data-source-salesforce-knowledge-article-configuration-property-builder function updates a CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customKnowledgeArticleTypeConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-knowledge-article-type-configurations` |
| `includedStates` | java.util.List | [[cdk.support/lookup-entry]] | `:included-states` |
| `standardKnowledgeArticleTypeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:standard-knowledge-article-type-configuration` |
"
  [^CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-knowledge-article-type-configurations)]
    (. builder customKnowledgeArticleTypeConfigurations data))
  (when-let [data (lookup-entry config id :included-states)]
    (. builder includedStates data))
  (when-let [data (lookup-entry config id :standard-knowledge-article-type-configuration)]
    (. builder standardKnowledgeArticleTypeConfiguration data))
  (.build builder))


(defn cfn-data-source-salesforce-knowledge-article-configuration-property-builder
  "Creates a  `CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-salesforce-knowledge-article-configuration-property-builder (new CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-salesforce-standard-knowledge-article-type-configuration-property-builder
  "The build-cfn-data-source-salesforce-standard-knowledge-article-type-configuration-property-builder function updates a CfnDataSource$SalesforceStandardKnowledgeArticleTypeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SalesforceStandardKnowledgeArticleTypeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
"
  [^CfnDataSource$SalesforceStandardKnowledgeArticleTypeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-data-field-name)]
    (. builder documentDataFieldName data))
  (when-let [data (lookup-entry config id :document-title-field-name)]
    (. builder documentTitleFieldName data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (.build builder))


(defn cfn-data-source-salesforce-standard-knowledge-article-type-configuration-property-builder
  "Creates a  `CfnDataSource$SalesforceStandardKnowledgeArticleTypeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-salesforce-standard-knowledge-article-type-configuration-property-builder (new CfnDataSource$SalesforceStandardKnowledgeArticleTypeConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-salesforce-standard-object-attachment-configuration-property-builder
  "The build-cfn-data-source-salesforce-standard-object-attachment-configuration-property-builder function updates a CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
"
  [^CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-title-field-name)]
    (. builder documentTitleFieldName data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (.build builder))


(defn cfn-data-source-salesforce-standard-object-attachment-configuration-property-builder
  "Creates a  `CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-salesforce-standard-object-attachment-configuration-property-builder (new CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-salesforce-standard-object-configuration-property-builder
  "The build-cfn-data-source-salesforce-standard-object-configuration-property-builder function updates a CfnDataSource$SalesforceStandardObjectConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SalesforceStandardObjectConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnDataSource$SalesforceStandardObjectConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-data-field-name)]
    (. builder documentDataFieldName data))
  (when-let [data (lookup-entry config id :document-title-field-name)]
    (. builder documentTitleFieldName data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-data-source-salesforce-standard-object-configuration-property-builder
  "Creates a  `CfnDataSource$SalesforceStandardObjectConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-salesforce-standard-object-configuration-property-builder (new CfnDataSource$SalesforceStandardObjectConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-service-now-configuration-property-builder
  "The build-cfn-data-source-service-now-configuration-property-builder function updates a CfnDataSource$ServiceNowConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ServiceNowConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `hostUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-url` |
| `knowledgeArticleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:knowledge-article-configuration` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `serviceCatalogConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$ServiceNowServiceCatalogConfigurationProperty | [[cdk.support/lookup-entry]] | `:service-catalog-configuration` |
| `serviceNowBuildVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-now-build-version` |
"
  [^CfnDataSource$ServiceNowConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authentication-type)]
    (. builder authenticationType data))
  (when-let [data (lookup-entry config id :host-url)]
    (. builder hostUrl data))
  (when-let [data (lookup-entry config id :knowledge-article-configuration)]
    (. builder knowledgeArticleConfiguration data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-let [data (lookup-entry config id :service-catalog-configuration)]
    (. builder serviceCatalogConfiguration data))
  (when-let [data (lookup-entry config id :service-now-build-version)]
    (. builder serviceNowBuildVersion data))
  (.build builder))


(defn cfn-data-source-service-now-configuration-property-builder
  "Creates a  `CfnDataSource$ServiceNowConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-service-now-configuration-property-builder (new CfnDataSource$ServiceNowConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-service-now-knowledge-article-configuration-property-builder
  "The build-cfn-data-source-service-now-knowledge-article-configuration-property-builder function updates a CfnDataSource$ServiceNowKnowledgeArticleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ServiceNowKnowledgeArticleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlAttachments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:crawl-attachments` |
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `excludeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-attachment-file-patterns` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `filterQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-query` |
| `includeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:include-attachment-file-patterns` |
"
  [^CfnDataSource$ServiceNowKnowledgeArticleConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :crawl-attachments)]
    (. builder crawlAttachments data))
  (when-let [data (lookup-entry config id :document-data-field-name)]
    (. builder documentDataFieldName data))
  (when-let [data (lookup-entry config id :document-title-field-name)]
    (. builder documentTitleFieldName data))
  (when-let [data (lookup-entry config id :exclude-attachment-file-patterns)]
    (. builder excludeAttachmentFilePatterns data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :filter-query)]
    (. builder filterQuery data))
  (when-let [data (lookup-entry config id :include-attachment-file-patterns)]
    (. builder includeAttachmentFilePatterns data))
  (.build builder))


(defn cfn-data-source-service-now-knowledge-article-configuration-property-builder
  "Creates a  `CfnDataSource$ServiceNowKnowledgeArticleConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-service-now-knowledge-article-configuration-property-builder (new CfnDataSource$ServiceNowKnowledgeArticleConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-service-now-service-catalog-configuration-property-builder
  "The build-cfn-data-source-service-now-service-catalog-configuration-property-builder function updates a CfnDataSource$ServiceNowServiceCatalogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ServiceNowServiceCatalogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlAttachments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-attachments` |
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `excludeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-attachment-file-patterns` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `includeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:include-attachment-file-patterns` |
"
  [^CfnDataSource$ServiceNowServiceCatalogConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :crawl-attachments)]
    (. builder crawlAttachments data))
  (when-let [data (lookup-entry config id :document-data-field-name)]
    (. builder documentDataFieldName data))
  (when-let [data (lookup-entry config id :document-title-field-name)]
    (. builder documentTitleFieldName data))
  (when-let [data (lookup-entry config id :exclude-attachment-file-patterns)]
    (. builder excludeAttachmentFilePatterns data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :include-attachment-file-patterns)]
    (. builder includeAttachmentFilePatterns data))
  (.build builder))


(defn cfn-data-source-service-now-service-catalog-configuration-property-builder
  "Creates a  `CfnDataSource$ServiceNowServiceCatalogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-service-now-service-catalog-configuration-property-builder (new CfnDataSource$ServiceNowServiceCatalogConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-share-point-configuration-property-builder
  "The build-cfn-data-source-share-point-configuration-property-builder function updates a CfnDataSource$SharePointConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SharePointConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlAttachments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:crawl-attachments` |
| `disableLocalGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-local-groups` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `sharePointVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:share-point-version` |
| `sslCertificateS3Path` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ssl-certificate-s3-path` |
| `urls` | java.util.List | [[cdk.support/lookup-entry]] | `:urls` |
| `useChangeLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-change-log` |
| `vpcConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$DataSourceVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnDataSource$SharePointConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :crawl-attachments)]
    (. builder crawlAttachments data))
  (when-let [data (lookup-entry config id :disable-local-groups)]
    (. builder disableLocalGroups data))
  (when-let [data (lookup-entry config id :document-title-field-name)]
    (. builder documentTitleFieldName data))
  (when-let [data (lookup-entry config id :exclusion-patterns)]
    (. builder exclusionPatterns data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :inclusion-patterns)]
    (. builder inclusionPatterns data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-let [data (lookup-entry config id :share-point-version)]
    (. builder sharePointVersion data))
  (when-let [data (lookup-entry config id :ssl-certificate-s3-path)]
    (. builder sslCertificateS3Path data))
  (when-let [data (lookup-entry config id :urls)]
    (. builder urls data))
  (when-let [data (lookup-entry config id :use-change-log)]
    (. builder useChangeLog data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-data-source-share-point-configuration-property-builder
  "Creates a  `CfnDataSource$SharePointConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-share-point-configuration-property-builder (new CfnDataSource$SharePointConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-sql-configuration-property-builder
  "The build-cfn-data-source-sql-configuration-property-builder function updates a CfnDataSource$SqlConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$SqlConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryIdentifiersEnclosingOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-identifiers-enclosing-option` |
"
  [^CfnDataSource$SqlConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :query-identifiers-enclosing-option)]
    (. builder queryIdentifiersEnclosingOption data))
  (.build builder))


(defn cfn-data-source-sql-configuration-property-builder
  "Creates a  `CfnDataSource$SqlConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-sql-configuration-property-builder (new CfnDataSource$SqlConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-template-configuration-property-builder
  "The build-cfn-data-source-template-configuration-property-builder function updates a CfnDataSource$TemplateConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$TemplateConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `template` | java.lang.String | [[cdk.support/lookup-entry]] | `:template` |
"
  [^CfnDataSource$TemplateConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :template)]
    (. builder template data))
  (.build builder))


(defn cfn-data-source-template-configuration-property-builder
  "Creates a  `CfnDataSource$TemplateConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-template-configuration-property-builder (new CfnDataSource$TemplateConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-web-crawler-authentication-configuration-property-builder
  "The build-cfn-data-source-web-crawler-authentication-configuration-property-builder function updates a CfnDataSource$WebCrawlerAuthenticationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$WebCrawlerAuthenticationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:basic-authentication` |
"
  [^CfnDataSource$WebCrawlerAuthenticationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :basic-authentication)]
    (. builder basicAuthentication data))
  (.build builder))


(defn cfn-data-source-web-crawler-authentication-configuration-property-builder
  "Creates a  `CfnDataSource$WebCrawlerAuthenticationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-web-crawler-authentication-configuration-property-builder (new CfnDataSource$WebCrawlerAuthenticationConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-web-crawler-basic-authentication-property-builder
  "The build-cfn-data-source-web-crawler-basic-authentication-property-builder function updates a CfnDataSource$WebCrawlerBasicAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$WebCrawlerBasicAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentials` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials` |
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnDataSource$WebCrawlerBasicAuthenticationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (lookup-entry config id :host)]
    (. builder host data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-data-source-web-crawler-basic-authentication-property-builder
  "Creates a  `CfnDataSource$WebCrawlerBasicAuthenticationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-web-crawler-basic-authentication-property-builder (new CfnDataSource$WebCrawlerBasicAuthenticationProperty$Builder) id config))


(defn build-cfn-data-source-web-crawler-configuration-property-builder
  "The build-cfn-data-source-web-crawler-configuration-property-builder function updates a CfnDataSource$WebCrawlerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$WebCrawlerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `crawlDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:crawl-depth` |
| `maxContentSizePerPageInMegaBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-content-size-per-page-in-mega-bytes` |
| `maxLinksPerPage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-links-per-page` |
| `maxUrlsPerMinuteCrawlRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-urls-per-minute-crawl-rate` |
| `proxyConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$ProxyConfigurationProperty | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `urlExclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:url-exclusion-patterns` |
| `urlInclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:url-inclusion-patterns` |
| `urls` | software.amazon.awscdk.services.kendra.CfnDataSource$WebCrawlerUrlsProperty | [[cdk.support/lookup-entry]] | `:urls` |
"
  [^CfnDataSource$WebCrawlerConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authentication-configuration)]
    (. builder authenticationConfiguration data))
  (when-let [data (lookup-entry config id :crawl-depth)]
    (. builder crawlDepth data))
  (when-let [data (lookup-entry config id :max-content-size-per-page-in-mega-bytes)]
    (. builder maxContentSizePerPageInMegaBytes data))
  (when-let [data (lookup-entry config id :max-links-per-page)]
    (. builder maxLinksPerPage data))
  (when-let [data (lookup-entry config id :max-urls-per-minute-crawl-rate)]
    (. builder maxUrlsPerMinuteCrawlRate data))
  (when-let [data (lookup-entry config id :proxy-configuration)]
    (. builder proxyConfiguration data))
  (when-let [data (lookup-entry config id :url-exclusion-patterns)]
    (. builder urlExclusionPatterns data))
  (when-let [data (lookup-entry config id :url-inclusion-patterns)]
    (. builder urlInclusionPatterns data))
  (when-let [data (lookup-entry config id :urls)]
    (. builder urls data))
  (.build builder))


(defn cfn-data-source-web-crawler-configuration-property-builder
  "Creates a  `CfnDataSource$WebCrawlerConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-web-crawler-configuration-property-builder (new CfnDataSource$WebCrawlerConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-web-crawler-seed-url-configuration-property-builder
  "The build-cfn-data-source-web-crawler-seed-url-configuration-property-builder function updates a CfnDataSource$WebCrawlerSeedUrlConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$WebCrawlerSeedUrlConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `seedUrls` | java.util.List | [[cdk.support/lookup-entry]] | `:seed-urls` |
| `webCrawlerMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-crawler-mode` |
"
  [^CfnDataSource$WebCrawlerSeedUrlConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :seed-urls)]
    (. builder seedUrls data))
  (when-let [data (lookup-entry config id :web-crawler-mode)]
    (. builder webCrawlerMode data))
  (.build builder))


(defn cfn-data-source-web-crawler-seed-url-configuration-property-builder
  "Creates a  `CfnDataSource$WebCrawlerSeedUrlConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-web-crawler-seed-url-configuration-property-builder (new CfnDataSource$WebCrawlerSeedUrlConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-web-crawler-site-maps-configuration-property-builder
  "The build-cfn-data-source-web-crawler-site-maps-configuration-property-builder function updates a CfnDataSource$WebCrawlerSiteMapsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$WebCrawlerSiteMapsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `siteMaps` | java.util.List | [[cdk.support/lookup-entry]] | `:site-maps` |
"
  [^CfnDataSource$WebCrawlerSiteMapsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :site-maps)]
    (. builder siteMaps data))
  (.build builder))


(defn cfn-data-source-web-crawler-site-maps-configuration-property-builder
  "Creates a  `CfnDataSource$WebCrawlerSiteMapsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-web-crawler-site-maps-configuration-property-builder (new CfnDataSource$WebCrawlerSiteMapsConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-web-crawler-urls-property-builder
  "The build-cfn-data-source-web-crawler-urls-property-builder function updates a CfnDataSource$WebCrawlerUrlsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$WebCrawlerUrlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `seedUrlConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$WebCrawlerSeedUrlConfigurationProperty | [[cdk.support/lookup-entry]] | `:seed-url-configuration` |
| `siteMapsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:site-maps-configuration` |
"
  [^CfnDataSource$WebCrawlerUrlsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :seed-url-configuration)]
    (. builder seedUrlConfiguration data))
  (when-let [data (lookup-entry config id :site-maps-configuration)]
    (. builder siteMapsConfiguration data))
  (.build builder))


(defn cfn-data-source-web-crawler-urls-property-builder
  "Creates a  `CfnDataSource$WebCrawlerUrlsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-web-crawler-urls-property-builder (new CfnDataSource$WebCrawlerUrlsProperty$Builder) id config))


(defn build-cfn-data-source-work-docs-configuration-property-builder
  "The build-cfn-data-source-work-docs-configuration-property-builder function updates a CfnDataSource$WorkDocsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$WorkDocsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlComments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-comments` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
| `useChangeLog` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-change-log` |
"
  [^CfnDataSource$WorkDocsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :crawl-comments)]
    (. builder crawlComments data))
  (when-let [data (lookup-entry config id :exclusion-patterns)]
    (. builder exclusionPatterns data))
  (when-let [data (lookup-entry config id :field-mappings)]
    (. builder fieldMappings data))
  (when-let [data (lookup-entry config id :inclusion-patterns)]
    (. builder inclusionPatterns data))
  (when-let [data (lookup-entry config id :organization-id)]
    (. builder organizationId data))
  (when-let [data (lookup-entry config id :use-change-log)]
    (. builder useChangeLog data))
  (.build builder))


(defn cfn-data-source-work-docs-configuration-property-builder
  "Creates a  `CfnDataSource$WorkDocsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-source-work-docs-configuration-property-builder (new CfnDataSource$WorkDocsConfigurationProperty$Builder) id config))


(defn build-cfn-faq-builder
  "The build-cfn-faq-builder function updates a CfnFaq$Builder instance using the provided configuration.
  The function takes the CfnFaq$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3Path` | software.amazon.awscdk.services.kendra.CfnFaq$S3PathProperty | [[cdk.support/lookup-entry]] | `:s3-path` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFaq$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :file-format)]
    (. builder fileFormat data))
  (when-let [data (lookup-entry config id :index-id)]
    (. builder indexId data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :s3-path)]
    (. builder s3Path data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-faq-builder
  "Creates a  `CfnFaq$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-faq-builder (CfnFaq$Builder/create scope (name id)) id config))


(defn build-cfn-faq-props-builder
  "The build-cfn-faq-props-builder function updates a CfnFaqProps$Builder instance using the provided configuration.
  The function takes the CfnFaqProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3Path` | software.amazon.awscdk.services.kendra.CfnFaq$S3PathProperty | [[cdk.support/lookup-entry]] | `:s3-path` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFaqProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :file-format)]
    (. builder fileFormat data))
  (when-let [data (lookup-entry config id :index-id)]
    (. builder indexId data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :s3-path)]
    (. builder s3Path data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-faq-props-builder
  "Creates a  `CfnFaqProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-faq-props-builder (new CfnFaqProps$Builder) id config))


(defn build-cfn-faq-s3-path-property-builder
  "The build-cfn-faq-s3-path-property-builder function updates a CfnFaq$S3PathProperty$Builder instance using the provided configuration.
  The function takes the CfnFaq$S3PathProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnFaq$S3PathProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-faq-s3-path-property-builder
  "Creates a  `CfnFaq$S3PathProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-faq-s3-path-property-builder (new CfnFaq$S3PathProperty$Builder) id config))


(defn build-cfn-index-builder
  "The build-cfn-index-builder function updates a CfnIndex$Builder instance using the provided configuration.
  The function takes the CfnIndex$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityUnits` | software.amazon.awscdk.services.kendra.CfnIndex$CapacityUnitsConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-units` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentMetadataConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:document-metadata-configurations` |
| `edition` | java.lang.String | [[cdk.support/lookup-entry]] | `:edition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.services.kendra.CfnIndex$ServerSideEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userContextPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-context-policy` |
| `userTokenConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-token-configurations` |
"
  [^CfnIndex$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity-units)]
    (. builder capacityUnits data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :document-metadata-configurations)]
    (. builder documentMetadataConfigurations data))
  (when-let [data (lookup-entry config id :edition)]
    (. builder edition data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-context-policy)]
    (. builder userContextPolicy data))
  (when-let [data (lookup-entry config id :user-token-configurations)]
    (. builder userTokenConfigurations data))
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


(defn build-cfn-index-capacity-units-configuration-property-builder
  "The build-cfn-index-capacity-units-configuration-property-builder function updates a CfnIndex$CapacityUnitsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$CapacityUnitsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:query-capacity-units` |
| `storageCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-units` |
"
  [^CfnIndex$CapacityUnitsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :query-capacity-units)]
    (. builder queryCapacityUnits data))
  (when-let [data (lookup-entry config id :storage-capacity-units)]
    (. builder storageCapacityUnits data))
  (.build builder))


(defn cfn-index-capacity-units-configuration-property-builder
  "Creates a  `CfnIndex$CapacityUnitsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-capacity-units-configuration-property-builder (new CfnIndex$CapacityUnitsConfigurationProperty$Builder) id config))


(defn build-cfn-index-document-metadata-configuration-property-builder
  "The build-cfn-index-document-metadata-configuration-property-builder function updates a CfnIndex$DocumentMetadataConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$DocumentMetadataConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `relevance` | software.amazon.awscdk.services.kendra.CfnIndex$RelevanceProperty | [[cdk.support/lookup-entry]] | `:relevance` |
| `search` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:search` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIndex$DocumentMetadataConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :relevance)]
    (. builder relevance data))
  (when-let [data (lookup-entry config id :search)]
    (. builder search data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-index-document-metadata-configuration-property-builder
  "Creates a  `CfnIndex$DocumentMetadataConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-document-metadata-configuration-property-builder (new CfnIndex$DocumentMetadataConfigurationProperty$Builder) id config))


(defn build-cfn-index-json-token-type-configuration-property-builder
  "The build-cfn-index-json-token-type-configuration-property-builder function updates a CfnIndex$JsonTokenTypeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$JsonTokenTypeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupAttributeField` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-attribute-field` |
| `userNameAttributeField` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name-attribute-field` |
"
  [^CfnIndex$JsonTokenTypeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :group-attribute-field)]
    (. builder groupAttributeField data))
  (when-let [data (lookup-entry config id :user-name-attribute-field)]
    (. builder userNameAttributeField data))
  (.build builder))


(defn cfn-index-json-token-type-configuration-property-builder
  "Creates a  `CfnIndex$JsonTokenTypeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-json-token-type-configuration-property-builder (new CfnIndex$JsonTokenTypeConfigurationProperty$Builder) id config))


(defn build-cfn-index-jwt-token-type-configuration-property-builder
  "The build-cfn-index-jwt-token-type-configuration-property-builder function updates a CfnIndex$JwtTokenTypeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$JwtTokenTypeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `claimRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:claim-regex` |
| `groupAttributeField` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-attribute-field` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |
| `keyLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-location` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `userNameAttributeField` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name-attribute-field` |
"
  [^CfnIndex$JwtTokenTypeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :claim-regex)]
    (. builder claimRegex data))
  (when-let [data (lookup-entry config id :group-attribute-field)]
    (. builder groupAttributeField data))
  (when-let [data (lookup-entry config id :issuer)]
    (. builder issuer data))
  (when-let [data (lookup-entry config id :key-location)]
    (. builder keyLocation data))
  (when-let [data (lookup-entry config id :secret-manager-arn)]
    (. builder secretManagerArn data))
  (when-let [data (lookup-entry config id :url)]
    (. builder url data))
  (when-let [data (lookup-entry config id :user-name-attribute-field)]
    (. builder userNameAttributeField data))
  (.build builder))


(defn cfn-index-jwt-token-type-configuration-property-builder
  "Creates a  `CfnIndex$JwtTokenTypeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-jwt-token-type-configuration-property-builder (new CfnIndex$JwtTokenTypeConfigurationProperty$Builder) id config))


(defn build-cfn-index-props-builder
  "The build-cfn-index-props-builder function updates a CfnIndexProps$Builder instance using the provided configuration.
  The function takes the CfnIndexProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityUnits` | software.amazon.awscdk.services.kendra.CfnIndex$CapacityUnitsConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-units` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `documentMetadataConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:document-metadata-configurations` |
| `edition` | java.lang.String | [[cdk.support/lookup-entry]] | `:edition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userContextPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-context-policy` |
| `userTokenConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:user-token-configurations` |
"
  [^CfnIndexProps$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity-units)]
    (. builder capacityUnits data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :document-metadata-configurations)]
    (. builder documentMetadataConfigurations data))
  (when-let [data (lookup-entry config id :edition)]
    (. builder edition data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-context-policy)]
    (. builder userContextPolicy data))
  (when-let [data (lookup-entry config id :user-token-configurations)]
    (. builder userTokenConfigurations data))
  (.build builder))


(defn cfn-index-props-builder
  "Creates a  `CfnIndexProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-props-builder (new CfnIndexProps$Builder) id config))


(defn build-cfn-index-relevance-property-builder
  "The build-cfn-index-relevance-property-builder function updates a CfnIndex$RelevanceProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$RelevanceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `duration` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration` |
| `freshness` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:freshness` |
| `importance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:importance` |
| `rankOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:rank-order` |
| `valueImportanceItems` | java.util.List | [[cdk.support/lookup-entry]] | `:value-importance-items` |
"
  [^CfnIndex$RelevanceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :duration)]
    (. builder duration data))
  (when-let [data (lookup-entry config id :freshness)]
    (. builder freshness data))
  (when-let [data (lookup-entry config id :importance)]
    (. builder importance data))
  (when-let [data (lookup-entry config id :rank-order)]
    (. builder rankOrder data))
  (when-let [data (lookup-entry config id :value-importance-items)]
    (. builder valueImportanceItems data))
  (.build builder))


(defn cfn-index-relevance-property-builder
  "Creates a  `CfnIndex$RelevanceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-relevance-property-builder (new CfnIndex$RelevanceProperty$Builder) id config))


(defn build-cfn-index-search-property-builder
  "The build-cfn-index-search-property-builder function updates a CfnIndex$SearchProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$SearchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:displayable` |
| `facetable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:facetable` |
| `searchable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:searchable` |
| `sortable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sortable` |
"
  [^CfnIndex$SearchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :displayable)]
    (. builder displayable data))
  (when-let [data (lookup-entry config id :facetable)]
    (. builder facetable data))
  (when-let [data (lookup-entry config id :searchable)]
    (. builder searchable data))
  (when-let [data (lookup-entry config id :sortable)]
    (. builder sortable data))
  (.build builder))


(defn cfn-index-search-property-builder
  "Creates a  `CfnIndex$SearchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-search-property-builder (new CfnIndex$SearchProperty$Builder) id config))


(defn build-cfn-index-server-side-encryption-configuration-property-builder
  "The build-cfn-index-server-side-encryption-configuration-property-builder function updates a CfnIndex$ServerSideEncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$ServerSideEncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnIndex$ServerSideEncryptionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-index-server-side-encryption-configuration-property-builder
  "Creates a  `CfnIndex$ServerSideEncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-server-side-encryption-configuration-property-builder (new CfnIndex$ServerSideEncryptionConfigurationProperty$Builder) id config))


(defn build-cfn-index-user-token-configuration-property-builder
  "The build-cfn-index-user-token-configuration-property-builder function updates a CfnIndex$UserTokenConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$UserTokenConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonTokenTypeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-token-type-configuration` |
| `jwtTokenTypeConfiguration` | software.amazon.awscdk.services.kendra.CfnIndex$JwtTokenTypeConfigurationProperty | [[cdk.support/lookup-entry]] | `:jwt-token-type-configuration` |
"
  [^CfnIndex$UserTokenConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :json-token-type-configuration)]
    (. builder jsonTokenTypeConfiguration data))
  (when-let [data (lookup-entry config id :jwt-token-type-configuration)]
    (. builder jwtTokenTypeConfiguration data))
  (.build builder))


(defn cfn-index-user-token-configuration-property-builder
  "Creates a  `CfnIndex$UserTokenConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-user-token-configuration-property-builder (new CfnIndex$UserTokenConfigurationProperty$Builder) id config))


(defn build-cfn-index-value-importance-item-property-builder
  "The build-cfn-index-value-importance-item-property-builder function updates a CfnIndex$ValueImportanceItemProperty$Builder instance using the provided configuration.
  The function takes the CfnIndex$ValueImportanceItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnIndex$ValueImportanceItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-index-value-importance-item-property-builder
  "Creates a  `CfnIndex$ValueImportanceItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-index-value-importance-item-property-builder (new CfnIndex$ValueImportanceItemProperty$Builder) id config))