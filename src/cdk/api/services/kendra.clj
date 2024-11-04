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


(defn cfn-data-source-access-control-list-configuration-property-builder
  "The cfn-data-source-access-control-list-configuration-property-builder function buildes out new instances of 
CfnDataSource$AccessControlListConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-path` |"
  [stack id config]
  (let [builder (CfnDataSource$AccessControlListConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-path)]
      (. builder keyPath data))
    (.build builder)))


(defn cfn-data-source-acl-configuration-property-builder
  "The cfn-data-source-acl-configuration-property-builder function buildes out new instances of 
CfnDataSource$AclConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedGroupsColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-groups-column-name` |"
  [stack id config]
  (let [builder (CfnDataSource$AclConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-groups-column-name)]
      (. builder allowedGroupsColumnName data))
    (.build builder)))


(defn cfn-data-source-builder
  "The cfn-data-source-builder function buildes out new instances of 
CfnDataSource$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataSource$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-data-source-column-configuration-property-builder
  "The cfn-data-source-column-configuration-property-builder function buildes out new instances of 
CfnDataSource$ColumnConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeDetectingColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:change-detecting-columns` |
| `documentDataColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-column-name` |
| `documentIdColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-id-column-name` |
| `documentTitleColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-column-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |"
  [stack id config]
  (let [builder (CfnDataSource$ColumnConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-confluence-attachment-configuration-property-builder
  "The cfn-data-source-confluence-attachment-configuration-property-builder function buildes out new instances of 
CfnDataSource$ConfluenceAttachmentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentFieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attachment-field-mappings` |
| `crawlAttachments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-attachments` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluenceAttachmentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :attachment-field-mappings)]
      (. builder attachmentFieldMappings data))
    (when-let [data (lookup-entry config id :crawl-attachments)]
      (. builder crawlAttachments data))
    (.build builder)))


(defn cfn-data-source-confluence-attachment-to-index-field-mapping-property-builder
  "The cfn-data-source-confluence-attachment-to-index-field-mapping-property-builder function buildes out new instances of 
CfnDataSource$ConfluenceAttachmentToIndexFieldMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluenceAttachmentToIndexFieldMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-source-field-name)]
      (. builder dataSourceFieldName data))
    (when-let [data (lookup-entry config id :date-field-format)]
      (. builder dateFieldFormat data))
    (when-let [data (lookup-entry config id :index-field-name)]
      (. builder indexFieldName data))
    (.build builder)))


(defn cfn-data-source-confluence-blog-configuration-property-builder
  "The cfn-data-source-confluence-blog-configuration-property-builder function buildes out new instances of 
CfnDataSource$ConfluenceBlogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blogFieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:blog-field-mappings` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluenceBlogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :blog-field-mappings)]
      (. builder blogFieldMappings data))
    (.build builder)))


(defn cfn-data-source-confluence-blog-to-index-field-mapping-property-builder
  "The cfn-data-source-confluence-blog-to-index-field-mapping-property-builder function buildes out new instances of 
CfnDataSource$ConfluenceBlogToIndexFieldMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluenceBlogToIndexFieldMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-source-field-name)]
      (. builder dataSourceFieldName data))
    (when-let [data (lookup-entry config id :date-field-format)]
      (. builder dateFieldFormat data))
    (when-let [data (lookup-entry config id :index-field-name)]
      (. builder indexFieldName data))
    (.build builder)))


(defn cfn-data-source-confluence-configuration-property-builder
  "The cfn-data-source-confluence-configuration-property-builder function buildes out new instances of 
CfnDataSource$ConfluenceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluenceConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-confluence-page-configuration-property-builder
  "The cfn-data-source-confluence-page-configuration-property-builder function buildes out new instances of 
CfnDataSource$ConfluencePageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pageFieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:page-field-mappings` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluencePageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :page-field-mappings)]
      (. builder pageFieldMappings data))
    (.build builder)))


(defn cfn-data-source-confluence-page-to-index-field-mapping-property-builder
  "The cfn-data-source-confluence-page-to-index-field-mapping-property-builder function buildes out new instances of 
CfnDataSource$ConfluencePageToIndexFieldMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluencePageToIndexFieldMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-source-field-name)]
      (. builder dataSourceFieldName data))
    (when-let [data (lookup-entry config id :date-field-format)]
      (. builder dateFieldFormat data))
    (when-let [data (lookup-entry config id :index-field-name)]
      (. builder indexFieldName data))
    (.build builder)))


(defn cfn-data-source-confluence-space-configuration-property-builder
  "The cfn-data-source-confluence-space-configuration-property-builder function buildes out new instances of 
CfnDataSource$ConfluenceSpaceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlArchivedSpaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-archived-spaces` |
| `crawlPersonalSpaces` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:crawl-personal-spaces` |
| `excludeSpaces` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-spaces` |
| `includeSpaces` | java.util.List | [[cdk.support/lookup-entry]] | `:include-spaces` |
| `spaceFieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:space-field-mappings` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluenceSpaceConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-confluence-space-to-index-field-mapping-property-builder
  "The cfn-data-source-confluence-space-to-index-field-mapping-property-builder function buildes out new instances of 
CfnDataSource$ConfluenceSpaceToIndexFieldMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |"
  [stack id config]
  (let [builder (CfnDataSource$ConfluenceSpaceToIndexFieldMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-source-field-name)]
      (. builder dataSourceFieldName data))
    (when-let [data (lookup-entry config id :date-field-format)]
      (. builder dateFieldFormat data))
    (when-let [data (lookup-entry config id :index-field-name)]
      (. builder indexFieldName data))
    (.build builder)))


(defn cfn-data-source-connection-configuration-property-builder
  "The cfn-data-source-connection-configuration-property-builder function buildes out new instances of 
CfnDataSource$ConnectionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseHost` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-host` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databasePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:database-port` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnDataSource$ConnectionConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-custom-document-enrichment-configuration-property-builder
  "The cfn-data-source-custom-document-enrichment-configuration-property-builder function buildes out new instances of 
CfnDataSource$CustomDocumentEnrichmentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:inline-configurations` |
| `postExtractionHookConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$HookConfigurationProperty | [[cdk.support/lookup-entry]] | `:post-extraction-hook-configuration` |
| `preExtractionHookConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pre-extraction-hook-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDataSource$CustomDocumentEnrichmentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :inline-configurations)]
      (. builder inlineConfigurations data))
    (when-let [data (lookup-entry config id :post-extraction-hook-configuration)]
      (. builder postExtractionHookConfiguration data))
    (when-let [data (lookup-entry config id :pre-extraction-hook-configuration)]
      (. builder preExtractionHookConfiguration data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-data-source-data-source-configuration-property-builder
  "The cfn-data-source-data-source-configuration-property-builder function buildes out new instances of 
CfnDataSource$DataSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `workDocsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:work-docs-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$DataSourceConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-data-source-to-index-field-mapping-property-builder
  "The cfn-data-source-data-source-to-index-field-mapping-property-builder function buildes out new instances of 
CfnDataSource$DataSourceToIndexFieldMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-field-name` |
| `dateFieldFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-field-format` |
| `indexFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-field-name` |"
  [stack id config]
  (let [builder (CfnDataSource$DataSourceToIndexFieldMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-source-field-name)]
      (. builder dataSourceFieldName data))
    (when-let [data (lookup-entry config id :date-field-format)]
      (. builder dateFieldFormat data))
    (when-let [data (lookup-entry config id :index-field-name)]
      (. builder indexFieldName data))
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


(defn cfn-data-source-database-configuration-property-builder
  "The cfn-data-source-database-configuration-property-builder function buildes out new instances of 
CfnDataSource$DatabaseConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$AclConfigurationProperty | [[cdk.support/lookup-entry]] | `:acl-configuration` |
| `columnConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-configuration` |
| `connectionConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$ConnectionConfigurationProperty | [[cdk.support/lookup-entry]] | `:connection-configuration` |
| `databaseEngineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-engine-type` |
| `sqlConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$SqlConfigurationProperty | [[cdk.support/lookup-entry]] | `:sql-configuration` |
| `vpcConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$DataSourceVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$DatabaseConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-document-attribute-condition-property-builder
  "The cfn-data-source-document-attribute-condition-property-builder function buildes out new instances of 
CfnDataSource$DocumentAttributeConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionDocumentAttributeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-document-attribute-key` |
| `conditionOnValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:condition-on-value` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |"
  [stack id config]
  (let [builder (CfnDataSource$DocumentAttributeConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition-document-attribute-key)]
      (. builder conditionDocumentAttributeKey data))
    (when-let [data (lookup-entry config id :condition-on-value)]
      (. builder conditionOnValue data))
    (when-let [data (lookup-entry config id :operator)]
      (. builder operator data))
    (.build builder)))


(defn cfn-data-source-document-attribute-target-property-builder
  "The cfn-data-source-document-attribute-target-property-builder function buildes out new instances of 
CfnDataSource$DocumentAttributeTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetDocumentAttributeKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-document-attribute-key` |
| `targetDocumentAttributeValue` | software.amazon.awscdk.services.kendra.CfnDataSource$DocumentAttributeValueProperty | [[cdk.support/lookup-entry]] | `:target-document-attribute-value` |
| `targetDocumentAttributeValueDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:target-document-attribute-value-deletion` |"
  [stack id config]
  (let [builder (CfnDataSource$DocumentAttributeTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-document-attribute-key)]
      (. builder targetDocumentAttributeKey data))
    (when-let [data (lookup-entry config id :target-document-attribute-value)]
      (. builder targetDocumentAttributeValue data))
    (when-let [data (lookup-entry config id :target-document-attribute-value-deletion)]
      (. builder targetDocumentAttributeValueDeletion data))
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


(defn cfn-data-source-documents-metadata-configuration-property-builder
  "The cfn-data-source-documents-metadata-configuration-property-builder function buildes out new instances of 
CfnDataSource$DocumentsMetadataConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix` |"
  [stack id config]
  (let [builder (CfnDataSource$DocumentsMetadataConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-prefix)]
      (. builder s3Prefix data))
    (.build builder)))


(defn cfn-data-source-google-drive-configuration-property-builder
  "The cfn-data-source-google-drive-configuration-property-builder function buildes out new instances of 
CfnDataSource$GoogleDriveConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeMimeTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-mime-types` |
| `excludeSharedDrives` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-shared-drives` |
| `excludeUserAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-user-accounts` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnDataSource$GoogleDriveConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-hook-configuration-property-builder
  "The cfn-data-source-hook-configuration-property-builder function buildes out new instances of 
CfnDataSource$HookConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invocation-condition` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |"
  [stack id config]
  (let [builder (CfnDataSource$HookConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :invocation-condition)]
      (. builder invocationCondition data))
    (when-let [data (lookup-entry config id :lambda-arn)]
      (. builder lambdaArn data))
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (.build builder)))


(defn cfn-data-source-inline-custom-document-enrichment-configuration-property-builder
  "The cfn-data-source-inline-custom-document-enrichment-configuration-property-builder function buildes out new instances of 
CfnDataSource$InlineCustomDocumentEnrichmentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:condition` |
| `documentContentDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:document-content-deletion` |
| `target` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnDataSource$InlineCustomDocumentEnrichmentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :document-content-deletion)]
      (. builder documentContentDeletion data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-data-source-one-drive-configuration-property-builder
  "The cfn-data-source-one-drive-configuration-property-builder function buildes out new instances of 
CfnDataSource$OneDriveConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableLocalGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-local-groups` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `oneDriveUsers` | software.amazon.awscdk.services.kendra.CfnDataSource$OneDriveUsersProperty | [[cdk.support/lookup-entry]] | `:one-drive-users` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `tenantDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenant-domain` |"
  [stack id config]
  (let [builder (CfnDataSource$OneDriveConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-one-drive-users-property-builder
  "The cfn-data-source-one-drive-users-property-builder function buildes out new instances of 
CfnDataSource$OneDriveUsersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oneDriveUserList` | java.util.List | [[cdk.support/lookup-entry]] | `:one-drive-user-list` |
| `oneDriveUserS3Path` | software.amazon.awscdk.services.kendra.CfnDataSource$S3PathProperty | [[cdk.support/lookup-entry]] | `:one-drive-user-s3-path` |"
  [stack id config]
  (let [builder (CfnDataSource$OneDriveUsersProperty$Builder.)]
    (when-let [data (lookup-entry config id :one-drive-user-list)]
      (. builder oneDriveUserList data))
    (when-let [data (lookup-entry config id :one-drive-user-s3-path)]
      (. builder oneDriveUserS3Path data))
    (.build builder)))


(defn cfn-data-source-props-builder
  "The cfn-data-source-props-builder function buildes out new instances of 
CfnDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataSourceProps$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-proxy-configuration-property-builder
  "The cfn-data-source-proxy-configuration-property-builder function buildes out new instances of 
CfnDataSource$ProxyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentials` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials` |
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnDataSource$ProxyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-data-source-s3-data-source-configuration-property-builder
  "The cfn-data-source-s3-data-source-configuration-property-builder function buildes out new instances of 
CfnDataSource$S3DataSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlListConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$AccessControlListConfigurationProperty | [[cdk.support/lookup-entry]] | `:access-control-list-configuration` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `documentsMetadataConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:documents-metadata-configuration` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `inclusionPrefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-prefixes` |"
  [stack id config]
  (let [builder (CfnDataSource$S3DataSourceConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-s3-path-property-builder
  "The cfn-data-source-s3-path-property-builder function buildes out new instances of 
CfnDataSource$S3PathProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnDataSource$S3PathProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-data-source-salesforce-chatter-feed-configuration-property-builder
  "The cfn-data-source-salesforce-chatter-feed-configuration-property-builder function buildes out new instances of 
CfnDataSource$SalesforceChatterFeedConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `includeFilterTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:include-filter-types` |"
  [stack id config]
  (let [builder (CfnDataSource$SalesforceChatterFeedConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-data-field-name)]
      (. builder documentDataFieldName data))
    (when-let [data (lookup-entry config id :document-title-field-name)]
      (. builder documentTitleFieldName data))
    (when-let [data (lookup-entry config id :field-mappings)]
      (. builder fieldMappings data))
    (when-let [data (lookup-entry config id :include-filter-types)]
      (. builder includeFilterTypes data))
    (.build builder)))


(defn cfn-data-source-salesforce-configuration-property-builder
  "The cfn-data-source-salesforce-configuration-property-builder function buildes out new instances of 
CfnDataSource$SalesforceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `standardObjectConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:standard-object-configurations` |"
  [stack id config]
  (let [builder (CfnDataSource$SalesforceConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-salesforce-custom-knowledge-article-type-configuration-property-builder
  "The cfn-data-source-salesforce-custom-knowledge-article-type-configuration-property-builder function buildes out new instances of 
CfnDataSource$SalesforceCustomKnowledgeArticleTypeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnDataSource$SalesforceCustomKnowledgeArticleTypeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-data-field-name)]
      (. builder documentDataFieldName data))
    (when-let [data (lookup-entry config id :document-title-field-name)]
      (. builder documentTitleFieldName data))
    (when-let [data (lookup-entry config id :field-mappings)]
      (. builder fieldMappings data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-data-source-salesforce-knowledge-article-configuration-property-builder
  "The cfn-data-source-salesforce-knowledge-article-configuration-property-builder function buildes out new instances of 
CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customKnowledgeArticleTypeConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-knowledge-article-type-configurations` |
| `includedStates` | java.util.List | [[cdk.support/lookup-entry]] | `:included-states` |
| `standardKnowledgeArticleTypeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:standard-knowledge-article-type-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$SalesforceKnowledgeArticleConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-knowledge-article-type-configurations)]
      (. builder customKnowledgeArticleTypeConfigurations data))
    (when-let [data (lookup-entry config id :included-states)]
      (. builder includedStates data))
    (when-let [data (lookup-entry config id :standard-knowledge-article-type-configuration)]
      (. builder standardKnowledgeArticleTypeConfiguration data))
    (.build builder)))


(defn cfn-data-source-salesforce-standard-knowledge-article-type-configuration-property-builder
  "The cfn-data-source-salesforce-standard-knowledge-article-type-configuration-property-builder function buildes out new instances of 
CfnDataSource$SalesforceStandardKnowledgeArticleTypeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |"
  [stack id config]
  (let [builder (CfnDataSource$SalesforceStandardKnowledgeArticleTypeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-data-field-name)]
      (. builder documentDataFieldName data))
    (when-let [data (lookup-entry config id :document-title-field-name)]
      (. builder documentTitleFieldName data))
    (when-let [data (lookup-entry config id :field-mappings)]
      (. builder fieldMappings data))
    (.build builder)))


(defn cfn-data-source-salesforce-standard-object-attachment-configuration-property-builder
  "The cfn-data-source-salesforce-standard-object-attachment-configuration-property-builder function buildes out new instances of 
CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |"
  [stack id config]
  (let [builder (CfnDataSource$SalesforceStandardObjectAttachmentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-title-field-name)]
      (. builder documentTitleFieldName data))
    (when-let [data (lookup-entry config id :field-mappings)]
      (. builder fieldMappings data))
    (.build builder)))


(defn cfn-data-source-salesforce-standard-object-configuration-property-builder
  "The cfn-data-source-salesforce-standard-object-configuration-property-builder function buildes out new instances of 
CfnDataSource$SalesforceStandardObjectConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnDataSource$SalesforceStandardObjectConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-data-field-name)]
      (. builder documentDataFieldName data))
    (when-let [data (lookup-entry config id :document-title-field-name)]
      (. builder documentTitleFieldName data))
    (when-let [data (lookup-entry config id :field-mappings)]
      (. builder fieldMappings data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-data-source-service-now-configuration-property-builder
  "The cfn-data-source-service-now-configuration-property-builder function buildes out new instances of 
CfnDataSource$ServiceNowConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `hostUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-url` |
| `knowledgeArticleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:knowledge-article-configuration` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `serviceCatalogConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$ServiceNowServiceCatalogConfigurationProperty | [[cdk.support/lookup-entry]] | `:service-catalog-configuration` |
| `serviceNowBuildVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-now-build-version` |"
  [stack id config]
  (let [builder (CfnDataSource$ServiceNowConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-service-now-knowledge-article-configuration-property-builder
  "The cfn-data-source-service-now-knowledge-article-configuration-property-builder function buildes out new instances of 
CfnDataSource$ServiceNowKnowledgeArticleConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlAttachments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:crawl-attachments` |
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `excludeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-attachment-file-patterns` |
| `fieldMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `filterQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-query` |
| `includeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:include-attachment-file-patterns` |"
  [stack id config]
  (let [builder (CfnDataSource$ServiceNowKnowledgeArticleConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-service-now-service-catalog-configuration-property-builder
  "The cfn-data-source-service-now-service-catalog-configuration-property-builder function buildes out new instances of 
CfnDataSource$ServiceNowServiceCatalogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlAttachments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-attachments` |
| `documentDataFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-data-field-name` |
| `documentTitleFieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-title-field-name` |
| `excludeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-attachment-file-patterns` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `includeAttachmentFilePatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:include-attachment-file-patterns` |"
  [stack id config]
  (let [builder (CfnDataSource$ServiceNowServiceCatalogConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-share-point-configuration-property-builder
  "The cfn-data-source-share-point-configuration-property-builder function buildes out new instances of 
CfnDataSource$SharePointConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$DataSourceVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$SharePointConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-sql-configuration-property-builder
  "The cfn-data-source-sql-configuration-property-builder function buildes out new instances of 
CfnDataSource$SqlConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryIdentifiersEnclosingOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-identifiers-enclosing-option` |"
  [stack id config]
  (let [builder (CfnDataSource$SqlConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :query-identifiers-enclosing-option)]
      (. builder queryIdentifiersEnclosingOption data))
    (.build builder)))


(defn cfn-data-source-template-configuration-property-builder
  "The cfn-data-source-template-configuration-property-builder function buildes out new instances of 
CfnDataSource$TemplateConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `template` | java.lang.String | [[cdk.support/lookup-entry]] | `:template` |"
  [stack id config]
  (let [builder (CfnDataSource$TemplateConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (.build builder)))


(defn cfn-data-source-web-crawler-authentication-configuration-property-builder
  "The cfn-data-source-web-crawler-authentication-configuration-property-builder function buildes out new instances of 
CfnDataSource$WebCrawlerAuthenticationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:basic-authentication` |"
  [stack id config]
  (let [builder (CfnDataSource$WebCrawlerAuthenticationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :basic-authentication)]
      (. builder basicAuthentication data))
    (.build builder)))


(defn cfn-data-source-web-crawler-basic-authentication-property-builder
  "The cfn-data-source-web-crawler-basic-authentication-property-builder function buildes out new instances of 
CfnDataSource$WebCrawlerBasicAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentials` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials` |
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnDataSource$WebCrawlerBasicAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-data-source-web-crawler-configuration-property-builder
  "The cfn-data-source-web-crawler-configuration-property-builder function buildes out new instances of 
CfnDataSource$WebCrawlerConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `urls` | software.amazon.awscdk.services.kendra.CfnDataSource$WebCrawlerUrlsProperty | [[cdk.support/lookup-entry]] | `:urls` |"
  [stack id config]
  (let [builder (CfnDataSource$WebCrawlerConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-source-web-crawler-seed-url-configuration-property-builder
  "The cfn-data-source-web-crawler-seed-url-configuration-property-builder function buildes out new instances of 
CfnDataSource$WebCrawlerSeedUrlConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `seedUrls` | java.util.List | [[cdk.support/lookup-entry]] | `:seed-urls` |
| `webCrawlerMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-crawler-mode` |"
  [stack id config]
  (let [builder (CfnDataSource$WebCrawlerSeedUrlConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :seed-urls)]
      (. builder seedUrls data))
    (when-let [data (lookup-entry config id :web-crawler-mode)]
      (. builder webCrawlerMode data))
    (.build builder)))


(defn cfn-data-source-web-crawler-site-maps-configuration-property-builder
  "The cfn-data-source-web-crawler-site-maps-configuration-property-builder function buildes out new instances of 
CfnDataSource$WebCrawlerSiteMapsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `siteMaps` | java.util.List | [[cdk.support/lookup-entry]] | `:site-maps` |"
  [stack id config]
  (let [builder (CfnDataSource$WebCrawlerSiteMapsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :site-maps)]
      (. builder siteMaps data))
    (.build builder)))


(defn cfn-data-source-web-crawler-urls-property-builder
  "The cfn-data-source-web-crawler-urls-property-builder function buildes out new instances of 
CfnDataSource$WebCrawlerUrlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `seedUrlConfiguration` | software.amazon.awscdk.services.kendra.CfnDataSource$WebCrawlerSeedUrlConfigurationProperty | [[cdk.support/lookup-entry]] | `:seed-url-configuration` |
| `siteMapsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:site-maps-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$WebCrawlerUrlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :seed-url-configuration)]
      (. builder seedUrlConfiguration data))
    (when-let [data (lookup-entry config id :site-maps-configuration)]
      (. builder siteMapsConfiguration data))
    (.build builder)))


(defn cfn-data-source-work-docs-configuration-property-builder
  "The cfn-data-source-work-docs-configuration-property-builder function buildes out new instances of 
CfnDataSource$WorkDocsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlComments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crawl-comments` |
| `exclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusion-patterns` |
| `fieldMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:field-mappings` |
| `inclusionPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-patterns` |
| `organizationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-id` |
| `useChangeLog` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-change-log` |"
  [stack id config]
  (let [builder (CfnDataSource$WorkDocsConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-faq-builder
  "The cfn-faq-builder function buildes out new instances of 
CfnFaq$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3Path` | software.amazon.awscdk.services.kendra.CfnFaq$S3PathProperty | [[cdk.support/lookup-entry]] | `:s3-path` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFaq$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-faq-props-builder
  "The cfn-faq-props-builder function buildes out new instances of 
CfnFaqProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `indexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-id` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3Path` | software.amazon.awscdk.services.kendra.CfnFaq$S3PathProperty | [[cdk.support/lookup-entry]] | `:s3-path` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFaqProps$Builder.)]
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
    (.build builder)))


(defn cfn-faq-s3-path-property-builder
  "The cfn-faq-s3-path-property-builder function buildes out new instances of 
CfnFaq$S3PathProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnFaq$S3PathProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-index-builder
  "The cfn-index-builder function buildes out new instances of 
CfnIndex$Builder using the provided configuration.  Each field is set as follows:

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
| `userTokenConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-token-configurations` |"
  [stack id config]
  (let [builder (CfnIndex$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-index-capacity-units-configuration-property-builder
  "The cfn-index-capacity-units-configuration-property-builder function buildes out new instances of 
CfnIndex$CapacityUnitsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:query-capacity-units` |
| `storageCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-units` |"
  [stack id config]
  (let [builder (CfnIndex$CapacityUnitsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :query-capacity-units)]
      (. builder queryCapacityUnits data))
    (when-let [data (lookup-entry config id :storage-capacity-units)]
      (. builder storageCapacityUnits data))
    (.build builder)))


(defn cfn-index-document-metadata-configuration-property-builder
  "The cfn-index-document-metadata-configuration-property-builder function buildes out new instances of 
CfnIndex$DocumentMetadataConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `relevance` | software.amazon.awscdk.services.kendra.CfnIndex$RelevanceProperty | [[cdk.support/lookup-entry]] | `:relevance` |
| `search` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:search` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIndex$DocumentMetadataConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :relevance)]
      (. builder relevance data))
    (when-let [data (lookup-entry config id :search)]
      (. builder search data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-index-json-token-type-configuration-property-builder
  "The cfn-index-json-token-type-configuration-property-builder function buildes out new instances of 
CfnIndex$JsonTokenTypeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupAttributeField` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-attribute-field` |
| `userNameAttributeField` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name-attribute-field` |"
  [stack id config]
  (let [builder (CfnIndex$JsonTokenTypeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-attribute-field)]
      (. builder groupAttributeField data))
    (when-let [data (lookup-entry config id :user-name-attribute-field)]
      (. builder userNameAttributeField data))
    (.build builder)))


(defn cfn-index-jwt-token-type-configuration-property-builder
  "The cfn-index-jwt-token-type-configuration-property-builder function buildes out new instances of 
CfnIndex$JwtTokenTypeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `claimRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:claim-regex` |
| `groupAttributeField` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-attribute-field` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |
| `keyLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-location` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `userNameAttributeField` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name-attribute-field` |"
  [stack id config]
  (let [builder (CfnIndex$JwtTokenTypeConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-index-props-builder
  "The cfn-index-props-builder function buildes out new instances of 
CfnIndexProps$Builder using the provided configuration.  Each field is set as follows:

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
| `userTokenConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:user-token-configurations` |"
  [stack id config]
  (let [builder (CfnIndexProps$Builder.)]
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
    (.build builder)))


(defn cfn-index-relevance-property-builder
  "The cfn-index-relevance-property-builder function buildes out new instances of 
CfnIndex$RelevanceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `duration` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration` |
| `freshness` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:freshness` |
| `importance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:importance` |
| `rankOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:rank-order` |
| `valueImportanceItems` | java.util.List | [[cdk.support/lookup-entry]] | `:value-importance-items` |"
  [stack id config]
  (let [builder (CfnIndex$RelevanceProperty$Builder.)]
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
    (.build builder)))


(defn cfn-index-search-property-builder
  "The cfn-index-search-property-builder function buildes out new instances of 
CfnIndex$SearchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:displayable` |
| `facetable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:facetable` |
| `searchable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:searchable` |
| `sortable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sortable` |"
  [stack id config]
  (let [builder (CfnIndex$SearchProperty$Builder.)]
    (when-let [data (lookup-entry config id :displayable)]
      (. builder displayable data))
    (when-let [data (lookup-entry config id :facetable)]
      (. builder facetable data))
    (when-let [data (lookup-entry config id :searchable)]
      (. builder searchable data))
    (when-let [data (lookup-entry config id :sortable)]
      (. builder sortable data))
    (.build builder)))


(defn cfn-index-server-side-encryption-configuration-property-builder
  "The cfn-index-server-side-encryption-configuration-property-builder function buildes out new instances of 
CfnIndex$ServerSideEncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnIndex$ServerSideEncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-index-user-token-configuration-property-builder
  "The cfn-index-user-token-configuration-property-builder function buildes out new instances of 
CfnIndex$UserTokenConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonTokenTypeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-token-type-configuration` |
| `jwtTokenTypeConfiguration` | software.amazon.awscdk.services.kendra.CfnIndex$JwtTokenTypeConfigurationProperty | [[cdk.support/lookup-entry]] | `:jwt-token-type-configuration` |"
  [stack id config]
  (let [builder (CfnIndex$UserTokenConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :json-token-type-configuration)]
      (. builder jsonTokenTypeConfiguration data))
    (when-let [data (lookup-entry config id :jwt-token-type-configuration)]
      (. builder jwtTokenTypeConfiguration data))
    (.build builder)))


(defn cfn-index-value-importance-item-property-builder
  "The cfn-index-value-importance-item-property-builder function buildes out new instances of 
CfnIndex$ValueImportanceItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnIndex$ValueImportanceItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))