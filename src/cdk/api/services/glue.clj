(ns cdk.api.services.glue
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.glue package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.glue CfnClassifier$Builder
                                                 CfnClassifier$CsvClassifierProperty$Builder
                                                 CfnClassifier$GrokClassifierProperty$Builder
                                                 CfnClassifier$JsonClassifierProperty$Builder
                                                 CfnClassifier$XMLClassifierProperty$Builder
                                                 CfnClassifierProps$Builder
                                                 CfnConnection$Builder
                                                 CfnConnection$ConnectionInputProperty$Builder
                                                 CfnConnection$PhysicalConnectionRequirementsProperty$Builder
                                                 CfnConnectionProps$Builder
                                                 CfnCrawler$Builder
                                                 CfnCrawler$CatalogTargetProperty$Builder
                                                 CfnCrawler$DeltaTargetProperty$Builder
                                                 CfnCrawler$DynamoDBTargetProperty$Builder
                                                 CfnCrawler$IcebergTargetProperty$Builder
                                                 CfnCrawler$JdbcTargetProperty$Builder
                                                 CfnCrawler$LakeFormationConfigurationProperty$Builder
                                                 CfnCrawler$MongoDBTargetProperty$Builder
                                                 CfnCrawler$RecrawlPolicyProperty$Builder
                                                 CfnCrawler$S3TargetProperty$Builder
                                                 CfnCrawler$ScheduleProperty$Builder
                                                 CfnCrawler$SchemaChangePolicyProperty$Builder
                                                 CfnCrawler$TargetsProperty$Builder
                                                 CfnCrawlerProps$Builder
                                                 CfnCustomEntityType$Builder
                                                 CfnCustomEntityTypeProps$Builder
                                                 CfnDataCatalogEncryptionSettings$Builder
                                                 CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty$Builder
                                                 CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty$Builder
                                                 CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty$Builder
                                                 CfnDataCatalogEncryptionSettingsProps$Builder
                                                 CfnDataQualityRuleset$Builder
                                                 CfnDataQualityRuleset$DataQualityTargetTableProperty$Builder
                                                 CfnDataQualityRulesetProps$Builder
                                                 CfnDatabase$Builder
                                                 CfnDatabase$DataLakePrincipalProperty$Builder
                                                 CfnDatabase$DatabaseIdentifierProperty$Builder
                                                 CfnDatabase$DatabaseInputProperty$Builder
                                                 CfnDatabase$FederatedDatabaseProperty$Builder
                                                 CfnDatabase$PrincipalPrivilegesProperty$Builder
                                                 CfnDatabaseProps$Builder
                                                 CfnDevEndpoint$Builder
                                                 CfnDevEndpointProps$Builder
                                                 CfnJob$Builder
                                                 CfnJob$ConnectionsListProperty$Builder
                                                 CfnJob$ExecutionPropertyProperty$Builder
                                                 CfnJob$JobCommandProperty$Builder
                                                 CfnJob$NotificationPropertyProperty$Builder
                                                 CfnJobProps$Builder
                                                 CfnMLTransform$Builder
                                                 CfnMLTransform$FindMatchesParametersProperty$Builder
                                                 CfnMLTransform$GlueTablesProperty$Builder
                                                 CfnMLTransform$InputRecordTablesProperty$Builder
                                                 CfnMLTransform$MLUserDataEncryptionProperty$Builder
                                                 CfnMLTransform$TransformEncryptionProperty$Builder
                                                 CfnMLTransform$TransformParametersProperty$Builder
                                                 CfnMLTransformProps$Builder
                                                 CfnPartition$Builder
                                                 CfnPartition$ColumnProperty$Builder
                                                 CfnPartition$OrderProperty$Builder
                                                 CfnPartition$PartitionInputProperty$Builder
                                                 CfnPartition$SchemaIdProperty$Builder
                                                 CfnPartition$SchemaReferenceProperty$Builder
                                                 CfnPartition$SerdeInfoProperty$Builder
                                                 CfnPartition$SkewedInfoProperty$Builder
                                                 CfnPartition$StorageDescriptorProperty$Builder
                                                 CfnPartitionProps$Builder
                                                 CfnRegistry$Builder
                                                 CfnRegistryProps$Builder
                                                 CfnSchema$Builder
                                                 CfnSchema$RegistryProperty$Builder
                                                 CfnSchema$SchemaVersionProperty$Builder
                                                 CfnSchemaProps$Builder
                                                 CfnSchemaVersion$Builder
                                                 CfnSchemaVersion$SchemaProperty$Builder
                                                 CfnSchemaVersionMetadata$Builder
                                                 CfnSchemaVersionMetadataProps$Builder
                                                 CfnSchemaVersionProps$Builder
                                                 CfnSecurityConfiguration$Builder
                                                 CfnSecurityConfiguration$CloudWatchEncryptionProperty$Builder
                                                 CfnSecurityConfiguration$EncryptionConfigurationProperty$Builder
                                                 CfnSecurityConfiguration$JobBookmarksEncryptionProperty$Builder
                                                 CfnSecurityConfiguration$S3EncryptionProperty$Builder
                                                 CfnSecurityConfigurationProps$Builder
                                                 CfnTable$Builder
                                                 CfnTable$ColumnProperty$Builder
                                                 CfnTable$IcebergInputProperty$Builder
                                                 CfnTable$OpenTableFormatInputProperty$Builder
                                                 CfnTable$OrderProperty$Builder
                                                 CfnTable$SchemaIdProperty$Builder
                                                 CfnTable$SchemaReferenceProperty$Builder
                                                 CfnTable$SerdeInfoProperty$Builder
                                                 CfnTable$SkewedInfoProperty$Builder
                                                 CfnTable$StorageDescriptorProperty$Builder
                                                 CfnTable$TableIdentifierProperty$Builder
                                                 CfnTable$TableInputProperty$Builder
                                                 CfnTableOptimizer$Builder
                                                 CfnTableOptimizer$TableOptimizerConfigurationProperty$Builder
                                                 CfnTableOptimizerProps$Builder
                                                 CfnTableProps$Builder
                                                 CfnTrigger$ActionProperty$Builder
                                                 CfnTrigger$Builder
                                                 CfnTrigger$ConditionProperty$Builder
                                                 CfnTrigger$EventBatchingConditionProperty$Builder
                                                 CfnTrigger$NotificationPropertyProperty$Builder
                                                 CfnTrigger$PredicateProperty$Builder
                                                 CfnTriggerProps$Builder
                                                 CfnWorkflow$Builder
                                                 CfnWorkflowProps$Builder]))


(defn cfn-classifier-builder
  "The cfn-classifier-builder function buildes out new instances of 
CfnClassifier$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvClassifier` | software.amazon.awscdk.services.glue.CfnClassifier$CsvClassifierProperty | [[cdk.support/lookup-entry]] | `:csv-classifier` |
| `grokClassifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grok-classifier` |
| `jsonClassifier` | software.amazon.awscdk.services.glue.CfnClassifier$JsonClassifierProperty | [[cdk.support/lookup-entry]] | `:json-classifier` |
| `xmlClassifier` | software.amazon.awscdk.services.glue.CfnClassifier$XMLClassifierProperty | [[cdk.support/lookup-entry]] | `:xml-classifier` |"
  [stack id config]
  (let [builder (CfnClassifier$Builder/create stack id)]
    (when-let [data (lookup-entry config id :csv-classifier)]
      (. builder csvClassifier data))
    (when-let [data (lookup-entry config id :grok-classifier)]
      (. builder grokClassifier data))
    (when-let [data (lookup-entry config id :json-classifier)]
      (. builder jsonClassifier data))
    (when-let [data (lookup-entry config id :xml-classifier)]
      (. builder xmlClassifier data))
    (.build builder)))


(defn cfn-classifier-csv-classifier-property-builder
  "The cfn-classifier-csv-classifier-property-builder function buildes out new instances of 
CfnClassifier$CsvClassifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowSingleColumn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-single-column` |
| `containsCustomDatatype` | java.util.List | [[cdk.support/lookup-entry]] | `:contains-custom-datatype` |
| `containsHeader` | java.lang.String | [[cdk.support/lookup-entry]] | `:contains-header` |
| `customDatatypeConfigured` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-datatype-configured` |
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `disableValueTrimming` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-value-trimming` |
| `header` | java.util.List | [[cdk.support/lookup-entry]] | `:header` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quoteSymbol` | java.lang.String | [[cdk.support/lookup-entry]] | `:quote-symbol` |"
  [stack id config]
  (let [builder (CfnClassifier$CsvClassifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-single-column)]
      (. builder allowSingleColumn data))
    (when-let [data (lookup-entry config id :contains-custom-datatype)]
      (. builder containsCustomDatatype data))
    (when-let [data (lookup-entry config id :contains-header)]
      (. builder containsHeader data))
    (when-let [data (lookup-entry config id :custom-datatype-configured)]
      (. builder customDatatypeConfigured data))
    (when-let [data (lookup-entry config id :delimiter)]
      (. builder delimiter data))
    (when-let [data (lookup-entry config id :disable-value-trimming)]
      (. builder disableValueTrimming data))
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :quote-symbol)]
      (. builder quoteSymbol data))
    (.build builder)))


(defn cfn-classifier-grok-classifier-property-builder
  "The cfn-classifier-grok-classifier-property-builder function buildes out new instances of 
CfnClassifier$GrokClassifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `customPatterns` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-patterns` |
| `grokPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:grok-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnClassifier$GrokClassifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :classification)]
      (. builder classification data))
    (when-let [data (lookup-entry config id :custom-patterns)]
      (. builder customPatterns data))
    (when-let [data (lookup-entry config id :grok-pattern)]
      (. builder grokPattern data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-classifier-json-classifier-property-builder
  "The cfn-classifier-json-classifier-property-builder function buildes out new instances of 
CfnClassifier$JsonClassifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnClassifier$JsonClassifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :json-path)]
      (. builder jsonPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-classifier-props-builder
  "The cfn-classifier-props-builder function buildes out new instances of 
CfnClassifierProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvClassifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv-classifier` |
| `grokClassifier` | software.amazon.awscdk.services.glue.CfnClassifier$GrokClassifierProperty | [[cdk.support/lookup-entry]] | `:grok-classifier` |
| `jsonClassifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-classifier` |
| `xmlClassifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:xml-classifier` |"
  [stack id config]
  (let [builder (CfnClassifierProps$Builder.)]
    (when-let [data (lookup-entry config id :csv-classifier)]
      (. builder csvClassifier data))
    (when-let [data (lookup-entry config id :grok-classifier)]
      (. builder grokClassifier data))
    (when-let [data (lookup-entry config id :json-classifier)]
      (. builder jsonClassifier data))
    (when-let [data (lookup-entry config id :xml-classifier)]
      (. builder xmlClassifier data))
    (.build builder)))


(defn cfn-classifier-xml-classifier-property-builder
  "The cfn-classifier-xml-classifier-property-builder function buildes out new instances of 
CfnClassifier$XMLClassifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rowTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:row-tag` |"
  [stack id config]
  (let [builder (CfnClassifier$XMLClassifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :classification)]
      (. builder classification data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :row-tag)]
      (. builder rowTag data))
    (.build builder)))


(defn cfn-connection-builder
  "The cfn-connection-builder function buildes out new instances of 
CfnConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `connectionInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-input` |"
  [stack id config]
  (let [builder (CfnConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :connection-input)]
      (. builder connectionInput data))
    (.build builder)))


(defn cfn-connection-connection-input-property-builder
  "The cfn-connection-connection-input-property-builder function buildes out new instances of 
CfnConnection$ConnectionInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:connection-properties` |
| `connectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `matchCriteria` | java.util.List | [[cdk.support/lookup-entry]] | `:match-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `physicalConnectionRequirements` | software.amazon.awscdk.services.glue.CfnConnection$PhysicalConnectionRequirementsProperty | [[cdk.support/lookup-entry]] | `:physical-connection-requirements` |"
  [stack id config]
  (let [builder (CfnConnection$ConnectionInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-properties)]
      (. builder connectionProperties data))
    (when-let [data (lookup-entry config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :match-criteria)]
      (. builder matchCriteria data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :physical-connection-requirements)]
      (. builder physicalConnectionRequirements data))
    (.build builder)))


(defn cfn-connection-physical-connection-requirements-property-builder
  "The cfn-connection-physical-connection-requirements-property-builder function buildes out new instances of 
CfnConnection$PhysicalConnectionRequirementsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `securityGroupIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-id-list` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnConnection$PhysicalConnectionRequirementsProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :security-group-id-list)]
      (. builder securityGroupIdList data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-connection-props-builder
  "The cfn-connection-props-builder function buildes out new instances of 
CfnConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `connectionInput` | software.amazon.awscdk.services.glue.CfnConnection$ConnectionInputProperty | [[cdk.support/lookup-entry]] | `:connection-input` |"
  [stack id config]
  (let [builder (CfnConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :connection-input)]
      (. builder connectionInput data))
    (.build builder)))


(defn cfn-crawler-builder
  "The cfn-crawler-builder function buildes out new instances of 
CfnCrawler$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:classifiers` |
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `crawlerSecurityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawler-security-configuration` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lakeFormationConfiguration` | software.amazon.awscdk.services.glue.CfnCrawler$LakeFormationConfigurationProperty | [[cdk.support/lookup-entry]] | `:lake-formation-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recrawlPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recrawl-policy` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `schedule` | software.amazon.awscdk.services.glue.CfnCrawler$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `schemaChangePolicy` | software.amazon.awscdk.services.glue.CfnCrawler$SchemaChangePolicyProperty | [[cdk.support/lookup-entry]] | `:schema-change-policy` |
| `tablePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-prefix` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | software.amazon.awscdk.services.glue.CfnCrawler$TargetsProperty | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnCrawler$Builder/create stack id)]
    (when-let [data (lookup-entry config id :classifiers)]
      (. builder classifiers data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :crawler-security-configuration)]
      (. builder crawlerSecurityConfiguration data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :lake-formation-configuration)]
      (. builder lakeFormationConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recrawl-policy)]
      (. builder recrawlPolicy data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :schema-change-policy)]
      (. builder schemaChangePolicy data))
    (when-let [data (lookup-entry config id :table-prefix)]
      (. builder tablePrefix data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-crawler-catalog-target-property-builder
  "The cfn-crawler-catalog-target-property-builder function buildes out new instances of 
CfnCrawler$CatalogTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dlqEventQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dlq-event-queue-arn` |
| `eventQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-queue-arn` |
| `tables` | java.util.List | [[cdk.support/lookup-entry]] | `:tables` |"
  [stack id config]
  (let [builder (CfnCrawler$CatalogTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :dlq-event-queue-arn)]
      (. builder dlqEventQueueArn data))
    (when-let [data (lookup-entry config id :event-queue-arn)]
      (. builder eventQueueArn data))
    (when-let [data (lookup-entry config id :tables)]
      (. builder tables data))
    (.build builder)))


(defn cfn-crawler-delta-target-property-builder
  "The cfn-crawler-delta-target-property-builder function buildes out new instances of 
CfnCrawler$DeltaTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `createNativeDeltaTable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-native-delta-table` |
| `deltaTables` | java.util.List | [[cdk.support/lookup-entry]] | `:delta-tables` |
| `writeManifest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:write-manifest` |"
  [stack id config]
  (let [builder (CfnCrawler$DeltaTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :create-native-delta-table)]
      (. builder createNativeDeltaTable data))
    (when-let [data (lookup-entry config id :delta-tables)]
      (. builder deltaTables data))
    (when-let [data (lookup-entry config id :write-manifest)]
      (. builder writeManifest data))
    (.build builder)))


(defn cfn-crawler-dynamo-db-target-property-builder
  "The cfn-crawler-dynamo-db-target-property-builder function buildes out new instances of 
CfnCrawler$DynamoDBTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnCrawler$DynamoDBTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-crawler-iceberg-target-property-builder
  "The cfn-crawler-iceberg-target-property-builder function buildes out new instances of 
CfnCrawler$IcebergTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `exclusions` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusions` |
| `maximumTraversalDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-traversal-depth` |
| `paths` | java.util.List | [[cdk.support/lookup-entry]] | `:paths` |"
  [stack id config]
  (let [builder (CfnCrawler$IcebergTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :exclusions)]
      (. builder exclusions data))
    (when-let [data (lookup-entry config id :maximum-traversal-depth)]
      (. builder maximumTraversalDepth data))
    (when-let [data (lookup-entry config id :paths)]
      (. builder paths data))
    (.build builder)))


(defn cfn-crawler-jdbc-target-property-builder
  "The cfn-crawler-jdbc-target-property-builder function buildes out new instances of 
CfnCrawler$JdbcTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `exclusions` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusions` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnCrawler$JdbcTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :exclusions)]
      (. builder exclusions data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-crawler-lake-formation-configuration-property-builder
  "The cfn-crawler-lake-formation-configuration-property-builder function buildes out new instances of 
CfnCrawler$LakeFormationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `useLakeFormationCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-lake-formation-credentials` |"
  [stack id config]
  (let [builder (CfnCrawler$LakeFormationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :use-lake-formation-credentials)]
      (. builder useLakeFormationCredentials data))
    (.build builder)))


(defn cfn-crawler-mongo-db-target-property-builder
  "The cfn-crawler-mongo-db-target-property-builder function buildes out new instances of 
CfnCrawler$MongoDBTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnCrawler$MongoDBTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-crawler-props-builder
  "The cfn-crawler-props-builder function buildes out new instances of 
CfnCrawlerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:classifiers` |
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `crawlerSecurityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawler-security-configuration` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lakeFormationConfiguration` | software.amazon.awscdk.services.glue.CfnCrawler$LakeFormationConfigurationProperty | [[cdk.support/lookup-entry]] | `:lake-formation-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recrawlPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recrawl-policy` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `schemaChangePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema-change-policy` |
| `tablePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-prefix` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | software.amazon.awscdk.services.glue.CfnCrawler$TargetsProperty | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnCrawlerProps$Builder.)]
    (when-let [data (lookup-entry config id :classifiers)]
      (. builder classifiers data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :crawler-security-configuration)]
      (. builder crawlerSecurityConfiguration data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :lake-formation-configuration)]
      (. builder lakeFormationConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recrawl-policy)]
      (. builder recrawlPolicy data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :schema-change-policy)]
      (. builder schemaChangePolicy data))
    (when-let [data (lookup-entry config id :table-prefix)]
      (. builder tablePrefix data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-crawler-recrawl-policy-property-builder
  "The cfn-crawler-recrawl-policy-property-builder function buildes out new instances of 
CfnCrawler$RecrawlPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recrawlBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:recrawl-behavior` |"
  [stack id config]
  (let [builder (CfnCrawler$RecrawlPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :recrawl-behavior)]
      (. builder recrawlBehavior data))
    (.build builder)))


(defn cfn-crawler-s3-target-property-builder
  "The cfn-crawler-s3-target-property-builder function buildes out new instances of 
CfnCrawler$S3TargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `dlqEventQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dlq-event-queue-arn` |
| `eventQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-queue-arn` |
| `exclusions` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusions` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `sampleSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sample-size` |"
  [stack id config]
  (let [builder (CfnCrawler$S3TargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :dlq-event-queue-arn)]
      (. builder dlqEventQueueArn data))
    (when-let [data (lookup-entry config id :event-queue-arn)]
      (. builder eventQueueArn data))
    (when-let [data (lookup-entry config id :exclusions)]
      (. builder exclusions data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :sample-size)]
      (. builder sampleSize data))
    (.build builder)))


(defn cfn-crawler-schedule-property-builder
  "The cfn-crawler-schedule-property-builder function buildes out new instances of 
CfnCrawler$ScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |"
  [stack id config]
  (let [builder (CfnCrawler$ScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (.build builder)))


(defn cfn-crawler-schema-change-policy-property-builder
  "The cfn-crawler-schema-change-policy-property-builder function buildes out new instances of 
CfnCrawler$SchemaChangePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:delete-behavior` |
| `updateBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-behavior` |"
  [stack id config]
  (let [builder (CfnCrawler$SchemaChangePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-behavior)]
      (. builder deleteBehavior data))
    (when-let [data (lookup-entry config id :update-behavior)]
      (. builder updateBehavior data))
    (.build builder)))


(defn cfn-crawler-targets-property-builder
  "The cfn-crawler-targets-property-builder function buildes out new instances of 
CfnCrawler$TargetsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:catalog-targets` |
| `deltaTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delta-targets` |
| `dynamoDbTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:dynamo-db-targets` |
| `icebergTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iceberg-targets` |
| `jdbcTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:jdbc-targets` |
| `mongoDbTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mongo-db-targets` |
| `s3Targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-targets` |"
  [stack id config]
  (let [builder (CfnCrawler$TargetsProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-targets)]
      (. builder catalogTargets data))
    (when-let [data (lookup-entry config id :delta-targets)]
      (. builder deltaTargets data))
    (when-let [data (lookup-entry config id :dynamo-db-targets)]
      (. builder dynamoDbTargets data))
    (when-let [data (lookup-entry config id :iceberg-targets)]
      (. builder icebergTargets data))
    (when-let [data (lookup-entry config id :jdbc-targets)]
      (. builder jdbcTargets data))
    (when-let [data (lookup-entry config id :mongo-db-targets)]
      (. builder mongoDbTargets data))
    (when-let [data (lookup-entry config id :s3-targets)]
      (. builder s3Targets data))
    (.build builder)))


(defn cfn-custom-entity-type-builder
  "The cfn-custom-entity-type-builder function buildes out new instances of 
CfnCustomEntityType$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contextWords` | java.util.List | [[cdk.support/lookup-entry]] | `:context-words` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regexString` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex-string` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomEntityType$Builder/create stack id)]
    (when-let [data (lookup-entry config id :context-words)]
      (. builder contextWords data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :regex-string)]
      (. builder regexString data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-custom-entity-type-props-builder
  "The cfn-custom-entity-type-props-builder function buildes out new instances of 
CfnCustomEntityTypeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contextWords` | java.util.List | [[cdk.support/lookup-entry]] | `:context-words` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regexString` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex-string` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomEntityTypeProps$Builder.)]
    (when-let [data (lookup-entry config id :context-words)]
      (. builder contextWords data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :regex-string)]
      (. builder regexString data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-data-catalog-encryption-settings-builder
  "The cfn-data-catalog-encryption-settings-builder function buildes out new instances of 
CfnDataCatalogEncryptionSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `dataCatalogEncryptionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-catalog-encryption-settings` |"
  [stack id config]
  (let [builder (CfnDataCatalogEncryptionSettings$Builder/create stack id)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :data-catalog-encryption-settings)]
      (. builder dataCatalogEncryptionSettings data))
    (.build builder)))


(defn cfn-data-catalog-encryption-settings-connection-password-encryption-property-builder
  "The cfn-data-catalog-encryption-settings-connection-password-encryption-property-builder function buildes out new instances of 
CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `returnConnectionPasswordEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-connection-password-encrypted` |"
  [stack id config]
  (let [builder (CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :return-connection-password-encrypted)]
      (. builder returnConnectionPasswordEncrypted data))
    (.build builder)))


(defn cfn-data-catalog-encryption-settings-data-catalog-encryption-settings-property-builder
  "The cfn-data-catalog-encryption-settings-data-catalog-encryption-settings-property-builder function buildes out new instances of 
CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPasswordEncryption` | software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty | [[cdk.support/lookup-entry]] | `:connection-password-encryption` |
| `encryptionAtRest` | software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty | [[cdk.support/lookup-entry]] | `:encryption-at-rest` |"
  [stack id config]
  (let [builder (CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-password-encryption)]
      (. builder connectionPasswordEncryption data))
    (when-let [data (lookup-entry config id :encryption-at-rest)]
      (. builder encryptionAtRest data))
    (.build builder)))


(defn cfn-data-catalog-encryption-settings-encryption-at-rest-property-builder
  "The cfn-data-catalog-encryption-settings-encryption-at-rest-property-builder function buildes out new instances of 
CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-encryption-mode` |
| `catalogEncryptionServiceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-encryption-service-role` |
| `sseAwsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sse-aws-kms-key-id` |"
  [stack id config]
  (let [builder (CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-encryption-mode)]
      (. builder catalogEncryptionMode data))
    (when-let [data (lookup-entry config id :catalog-encryption-service-role)]
      (. builder catalogEncryptionServiceRole data))
    (when-let [data (lookup-entry config id :sse-aws-kms-key-id)]
      (. builder sseAwsKmsKeyId data))
    (.build builder)))


(defn cfn-data-catalog-encryption-settings-props-builder
  "The cfn-data-catalog-encryption-settings-props-builder function buildes out new instances of 
CfnDataCatalogEncryptionSettingsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `dataCatalogEncryptionSettings` | software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty | [[cdk.support/lookup-entry]] | `:data-catalog-encryption-settings` |"
  [stack id config]
  (let [builder (CfnDataCatalogEncryptionSettingsProps$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :data-catalog-encryption-settings)]
      (. builder dataCatalogEncryptionSettings data))
    (.build builder)))


(defn cfn-data-quality-ruleset-builder
  "The cfn-data-quality-ruleset-builder function buildes out new instances of 
CfnDataQualityRuleset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleset` | java.lang.String | [[cdk.support/lookup-entry]] | `:ruleset` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `targetTable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-table` |"
  [stack id config]
  (let [builder (CfnDataQualityRuleset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :ruleset)]
      (. builder ruleset data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-table)]
      (. builder targetTable data))
    (.build builder)))


(defn cfn-data-quality-ruleset-data-quality-target-table-property-builder
  "The cfn-data-quality-ruleset-data-quality-target-table-property-builder function buildes out new instances of 
CfnDataQualityRuleset$DataQualityTargetTableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnDataQualityRuleset$DataQualityTargetTableProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-data-quality-ruleset-props-builder
  "The cfn-data-quality-ruleset-props-builder function buildes out new instances of 
CfnDataQualityRulesetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleset` | java.lang.String | [[cdk.support/lookup-entry]] | `:ruleset` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `targetTable` | software.amazon.awscdk.services.glue.CfnDataQualityRuleset$DataQualityTargetTableProperty | [[cdk.support/lookup-entry]] | `:target-table` |"
  [stack id config]
  (let [builder (CfnDataQualityRulesetProps$Builder.)]
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :ruleset)]
      (. builder ruleset data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-table)]
      (. builder targetTable data))
    (.build builder)))


(defn cfn-database-builder
  "The cfn-database-builder function buildes out new instances of 
CfnDatabase$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseInput` | software.amazon.awscdk.services.glue.CfnDatabase$DatabaseInputProperty | [[cdk.support/lookup-entry]] | `:database-input` |"
  [stack id config]
  (let [builder (CfnDatabase$Builder/create stack id)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-input)]
      (. builder databaseInput data))
    (.build builder)))


(defn cfn-database-data-lake-principal-property-builder
  "The cfn-database-data-lake-principal-property-builder function buildes out new instances of 
CfnDatabase$DataLakePrincipalProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipalIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-principal-identifier` |"
  [stack id config]
  (let [builder (CfnDatabase$DataLakePrincipalProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-lake-principal-identifier)]
      (. builder dataLakePrincipalIdentifier data))
    (.build builder)))


(defn cfn-database-database-identifier-property-builder
  "The cfn-database-database-identifier-property-builder function buildes out new instances of 
CfnDatabase$DatabaseIdentifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnDatabase$DatabaseIdentifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-database-database-input-property-builder
  "The cfn-database-database-input-property-builder function buildes out new instances of 
CfnDatabase$DatabaseInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createTableDefaultPermissions` | java.util.List | [[cdk.support/lookup-entry]] | `:create-table-default-permissions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `federatedDatabase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:federated-database` |
| `locationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-uri` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `targetDatabase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-database` |"
  [stack id config]
  (let [builder (CfnDatabase$DatabaseInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :create-table-default-permissions)]
      (. builder createTableDefaultPermissions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :federated-database)]
      (. builder federatedDatabase data))
    (when-let [data (lookup-entry config id :location-uri)]
      (. builder locationUri data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :target-database)]
      (. builder targetDatabase data))
    (.build builder)))


(defn cfn-database-federated-database-property-builder
  "The cfn-database-federated-database-property-builder function buildes out new instances of 
CfnDatabase$FederatedDatabaseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |"
  [stack id config]
  (let [builder (CfnDatabase$FederatedDatabaseProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (.build builder)))


(defn cfn-database-principal-privileges-property-builder
  "The cfn-database-principal-privileges-property-builder function buildes out new instances of 
CfnDatabase$PrincipalPrivilegesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `principal` | software.amazon.awscdk.services.glue.CfnDatabase$DataLakePrincipalProperty | [[cdk.support/lookup-entry]] | `:principal` |"
  [stack id config]
  (let [builder (CfnDatabase$PrincipalPrivilegesProperty$Builder.)]
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (.build builder)))


(defn cfn-database-props-builder
  "The cfn-database-props-builder function buildes out new instances of 
CfnDatabaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseInput` | software.amazon.awscdk.services.glue.CfnDatabase$DatabaseInputProperty | [[cdk.support/lookup-entry]] | `:database-input` |"
  [stack id config]
  (let [builder (CfnDatabaseProps$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-input)]
      (. builder databaseInput data))
    (.build builder)))


(defn cfn-dev-endpoint-builder
  "The cfn-dev-endpoint-builder function buildes out new instances of 
CfnDevEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:arguments` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `extraJarsS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-jars-s3-path` |
| `extraPythonLibsS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-python-libs-s3-path` |
| `glueVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-version` |
| `numberOfNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-nodes` |
| `numberOfWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-workers` |
| `publicKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key` |
| `publicKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:public-keys` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |"
  [stack id config]
  (let [builder (CfnDevEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :arguments)]
      (. builder arguments data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :extra-jars-s3-path)]
      (. builder extraJarsS3Path data))
    (when-let [data (lookup-entry config id :extra-python-libs-s3-path)]
      (. builder extraPythonLibsS3Path data))
    (when-let [data (lookup-entry config id :glue-version)]
      (. builder glueVersion data))
    (when-let [data (lookup-entry config id :number-of-nodes)]
      (. builder numberOfNodes data))
    (when-let [data (lookup-entry config id :number-of-workers)]
      (. builder numberOfWorkers data))
    (when-let [data (lookup-entry config id :public-key)]
      (. builder publicKey data))
    (when-let [data (lookup-entry config id :public-keys)]
      (. builder publicKeys data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :worker-type)]
      (. builder workerType data))
    (.build builder)))


(defn cfn-dev-endpoint-props-builder
  "The cfn-dev-endpoint-props-builder function buildes out new instances of 
CfnDevEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:arguments` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `extraJarsS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-jars-s3-path` |
| `extraPythonLibsS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-python-libs-s3-path` |
| `glueVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-version` |
| `numberOfNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-nodes` |
| `numberOfWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-workers` |
| `publicKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key` |
| `publicKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:public-keys` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |"
  [stack id config]
  (let [builder (CfnDevEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :arguments)]
      (. builder arguments data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :extra-jars-s3-path)]
      (. builder extraJarsS3Path data))
    (when-let [data (lookup-entry config id :extra-python-libs-s3-path)]
      (. builder extraPythonLibsS3Path data))
    (when-let [data (lookup-entry config id :glue-version)]
      (. builder glueVersion data))
    (when-let [data (lookup-entry config id :number-of-nodes)]
      (. builder numberOfNodes data))
    (when-let [data (lookup-entry config id :number-of-workers)]
      (. builder numberOfWorkers data))
    (when-let [data (lookup-entry config id :public-key)]
      (. builder publicKey data))
    (when-let [data (lookup-entry config id :public-keys)]
      (. builder publicKeys data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :worker-type)]
      (. builder workerType data))
    (.build builder)))


(defn cfn-job-builder
  "The cfn-job-builder function buildes out new instances of 
CfnJob$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-capacity` |
| `command` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:command` |
| `connections` | software.amazon.awscdk.services.glue.CfnJob$ConnectionsListProperty | [[cdk.support/lookup-entry]] | `:connections` |
| `defaultArguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-arguments` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-class` |
| `executionProperty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution-property` |
| `glueVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-version` |
| `logUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-uri` |
| `maintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-window` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nonOverridableArguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:non-overridable-arguments` |
| `notificationProperty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-property` |
| `numberOfWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-workers` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |"
  [stack id config]
  (let [builder (CfnJob$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocated-capacity)]
      (. builder allocatedCapacity data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :connections)]
      (. builder connections data))
    (when-let [data (lookup-entry config id :default-arguments)]
      (. builder defaultArguments data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :execution-class)]
      (. builder executionClass data))
    (when-let [data (lookup-entry config id :execution-property)]
      (. builder executionProperty data))
    (when-let [data (lookup-entry config id :glue-version)]
      (. builder glueVersion data))
    (when-let [data (lookup-entry config id :log-uri)]
      (. builder logUri data))
    (when-let [data (lookup-entry config id :maintenance-window)]
      (. builder maintenanceWindow data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :non-overridable-arguments)]
      (. builder nonOverridableArguments data))
    (when-let [data (lookup-entry config id :notification-property)]
      (. builder notificationProperty data))
    (when-let [data (lookup-entry config id :number-of-workers)]
      (. builder numberOfWorkers data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :worker-type)]
      (. builder workerType data))
    (.build builder)))


(defn cfn-job-connections-list-property-builder
  "The cfn-job-connections-list-property-builder function buildes out new instances of 
CfnJob$ConnectionsListProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connections` | java.util.List | [[cdk.support/lookup-entry]] | `:connections` |"
  [stack id config]
  (let [builder (CfnJob$ConnectionsListProperty$Builder.)]
    (when-let [data (lookup-entry config id :connections)]
      (. builder connections data))
    (.build builder)))


(defn cfn-job-execution-property-property-builder
  "The cfn-job-execution-property-property-builder function buildes out new instances of 
CfnJob$ExecutionPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConcurrentRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-runs` |"
  [stack id config]
  (let [builder (CfnJob$ExecutionPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-concurrent-runs)]
      (. builder maxConcurrentRuns data))
    (.build builder)))


(defn cfn-job-job-command-property-builder
  "The cfn-job-job-command-property-builder function buildes out new instances of 
CfnJob$JobCommandProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pythonVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:python-version` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `scriptLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:script-location` |"
  [stack id config]
  (let [builder (CfnJob$JobCommandProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :python-version)]
      (. builder pythonVersion data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :script-location)]
      (. builder scriptLocation data))
    (.build builder)))


(defn cfn-job-notification-property-property-builder
  "The cfn-job-notification-property-property-builder function buildes out new instances of 
CfnJob$NotificationPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notifyDelayAfter` | java.lang.Number | [[cdk.support/lookup-entry]] | `:notify-delay-after` |"
  [stack id config]
  (let [builder (CfnJob$NotificationPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :notify-delay-after)]
      (. builder notifyDelayAfter data))
    (.build builder)))


(defn cfn-job-props-builder
  "The cfn-job-props-builder function buildes out new instances of 
CfnJobProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-capacity` |
| `command` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:command` |
| `connections` | software.amazon.awscdk.services.glue.CfnJob$ConnectionsListProperty | [[cdk.support/lookup-entry]] | `:connections` |
| `defaultArguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-arguments` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-class` |
| `executionProperty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution-property` |
| `glueVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-version` |
| `logUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-uri` |
| `maintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-window` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nonOverridableArguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:non-overridable-arguments` |
| `notificationProperty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-property` |
| `numberOfWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-workers` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |"
  [stack id config]
  (let [builder (CfnJobProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-capacity)]
      (. builder allocatedCapacity data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :connections)]
      (. builder connections data))
    (when-let [data (lookup-entry config id :default-arguments)]
      (. builder defaultArguments data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :execution-class)]
      (. builder executionClass data))
    (when-let [data (lookup-entry config id :execution-property)]
      (. builder executionProperty data))
    (when-let [data (lookup-entry config id :glue-version)]
      (. builder glueVersion data))
    (when-let [data (lookup-entry config id :log-uri)]
      (. builder logUri data))
    (when-let [data (lookup-entry config id :maintenance-window)]
      (. builder maintenanceWindow data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :non-overridable-arguments)]
      (. builder nonOverridableArguments data))
    (when-let [data (lookup-entry config id :notification-property)]
      (. builder notificationProperty data))
    (when-let [data (lookup-entry config id :number-of-workers)]
      (. builder numberOfWorkers data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :worker-type)]
      (. builder workerType data))
    (.build builder)))


(defn cfn-ml-transform-builder
  "The cfn-ml-transform-builder function buildes out new instances of 
CfnMLTransform$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `glueVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-version` |
| `inputRecordTables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-record-tables` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `numberOfWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-workers` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `transformEncryption` | software.amazon.awscdk.services.glue.CfnMLTransform$TransformEncryptionProperty | [[cdk.support/lookup-entry]] | `:transform-encryption` |
| `transformParameters` | software.amazon.awscdk.services.glue.CfnMLTransform$TransformParametersProperty | [[cdk.support/lookup-entry]] | `:transform-parameters` |
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |"
  [stack id config]
  (let [builder (CfnMLTransform$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :glue-version)]
      (. builder glueVersion data))
    (when-let [data (lookup-entry config id :input-record-tables)]
      (. builder inputRecordTables data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :number-of-workers)]
      (. builder numberOfWorkers data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :transform-encryption)]
      (. builder transformEncryption data))
    (when-let [data (lookup-entry config id :transform-parameters)]
      (. builder transformParameters data))
    (when-let [data (lookup-entry config id :worker-type)]
      (. builder workerType data))
    (.build builder)))


(defn cfn-ml-transform-find-matches-parameters-property-builder
  "The cfn-ml-transform-find-matches-parameters-property-builder function buildes out new instances of 
CfnMLTransform$FindMatchesParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accuracyCostTradeoff` | java.lang.Number | [[cdk.support/lookup-entry]] | `:accuracy-cost-tradeoff` |
| `enforceProvidedLabels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enforce-provided-labels` |
| `precisionRecallTradeoff` | java.lang.Number | [[cdk.support/lookup-entry]] | `:precision-recall-tradeoff` |
| `primaryKeyColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-key-column-name` |"
  [stack id config]
  (let [builder (CfnMLTransform$FindMatchesParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :accuracy-cost-tradeoff)]
      (. builder accuracyCostTradeoff data))
    (when-let [data (lookup-entry config id :enforce-provided-labels)]
      (. builder enforceProvidedLabels data))
    (when-let [data (lookup-entry config id :precision-recall-tradeoff)]
      (. builder precisionRecallTradeoff data))
    (when-let [data (lookup-entry config id :primary-key-column-name)]
      (. builder primaryKeyColumnName data))
    (.build builder)))


(defn cfn-ml-transform-glue-tables-property-builder
  "The cfn-ml-transform-glue-tables-property-builder function buildes out new instances of 
CfnMLTransform$GlueTablesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnMLTransform$GlueTablesProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-ml-transform-input-record-tables-property-builder
  "The cfn-ml-transform-input-record-tables-property-builder function buildes out new instances of 
CfnMLTransform$InputRecordTablesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueTables` | java.util.List | [[cdk.support/lookup-entry]] | `:glue-tables` |"
  [stack id config]
  (let [builder (CfnMLTransform$InputRecordTablesProperty$Builder.)]
    (when-let [data (lookup-entry config id :glue-tables)]
      (. builder glueTables data))
    (.build builder)))


(defn cfn-ml-transform-ml-user-data-encryption-property-builder
  "The cfn-ml-transform-ml-user-data-encryption-property-builder function buildes out new instances of 
CfnMLTransform$MLUserDataEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `mlUserDataEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:ml-user-data-encryption-mode` |"
  [stack id config]
  (let [builder (CfnMLTransform$MLUserDataEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :ml-user-data-encryption-mode)]
      (. builder mlUserDataEncryptionMode data))
    (.build builder)))


(defn cfn-ml-transform-props-builder
  "The cfn-ml-transform-props-builder function buildes out new instances of 
CfnMLTransformProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `glueVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-version` |
| `inputRecordTables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-record-tables` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `numberOfWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-workers` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `transformEncryption` | software.amazon.awscdk.services.glue.CfnMLTransform$TransformEncryptionProperty | [[cdk.support/lookup-entry]] | `:transform-encryption` |
| `transformParameters` | software.amazon.awscdk.services.glue.CfnMLTransform$TransformParametersProperty | [[cdk.support/lookup-entry]] | `:transform-parameters` |
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |"
  [stack id config]
  (let [builder (CfnMLTransformProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :glue-version)]
      (. builder glueVersion data))
    (when-let [data (lookup-entry config id :input-record-tables)]
      (. builder inputRecordTables data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :number-of-workers)]
      (. builder numberOfWorkers data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :transform-encryption)]
      (. builder transformEncryption data))
    (when-let [data (lookup-entry config id :transform-parameters)]
      (. builder transformParameters data))
    (when-let [data (lookup-entry config id :worker-type)]
      (. builder workerType data))
    (.build builder)))


(defn cfn-ml-transform-transform-encryption-property-builder
  "The cfn-ml-transform-transform-encryption-property-builder function buildes out new instances of 
CfnMLTransform$TransformEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mlUserDataEncryption` | software.amazon.awscdk.services.glue.CfnMLTransform$MLUserDataEncryptionProperty | [[cdk.support/lookup-entry]] | `:ml-user-data-encryption` |
| `taskRunSecurityConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-run-security-configuration-name` |"
  [stack id config]
  (let [builder (CfnMLTransform$TransformEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :ml-user-data-encryption)]
      (. builder mlUserDataEncryption data))
    (when-let [data (lookup-entry config id :task-run-security-configuration-name)]
      (. builder taskRunSecurityConfigurationName data))
    (.build builder)))


(defn cfn-ml-transform-transform-parameters-property-builder
  "The cfn-ml-transform-transform-parameters-property-builder function buildes out new instances of 
CfnMLTransform$TransformParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `findMatchesParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:find-matches-parameters` |
| `transformType` | java.lang.String | [[cdk.support/lookup-entry]] | `:transform-type` |"
  [stack id config]
  (let [builder (CfnMLTransform$TransformParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :find-matches-parameters)]
      (. builder findMatchesParameters data))
    (when-let [data (lookup-entry config id :transform-type)]
      (. builder transformType data))
    (.build builder)))


(defn cfn-partition-builder
  "The cfn-partition-builder function buildes out new instances of 
CfnPartition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `partitionInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partition-input` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnPartition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :partition-input)]
      (. builder partitionInput data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-partition-column-property-builder
  "The cfn-partition-column-property-builder function buildes out new instances of 
CfnPartition$ColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPartition$ColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-partition-order-property-builder
  "The cfn-partition-order-property-builder function buildes out new instances of 
CfnPartition$OrderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `column` | java.lang.String | [[cdk.support/lookup-entry]] | `:column` |
| `sortOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sort-order` |"
  [stack id config]
  (let [builder (CfnPartition$OrderProperty$Builder.)]
    (when-let [data (lookup-entry config id :column)]
      (. builder column data))
    (when-let [data (lookup-entry config id :sort-order)]
      (. builder sortOrder data))
    (.build builder)))


(defn cfn-partition-partition-input-property-builder
  "The cfn-partition-partition-input-property-builder function buildes out new instances of 
CfnPartition$PartitionInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `storageDescriptor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-descriptor` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnPartition$PartitionInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :storage-descriptor)]
      (. builder storageDescriptor data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-partition-props-builder
  "The cfn-partition-props-builder function buildes out new instances of 
CfnPartitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `partitionInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partition-input` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnPartitionProps$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :partition-input)]
      (. builder partitionInput data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-partition-schema-id-property-builder
  "The cfn-partition-schema-id-property-builder function buildes out new instances of 
CfnPartition$SchemaIdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |"
  [stack id config]
  (let [builder (CfnPartition$SchemaIdProperty$Builder.)]
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :schema-arn)]
      (. builder schemaArn data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (.build builder)))


(defn cfn-partition-schema-reference-property-builder
  "The cfn-partition-schema-reference-property-builder function buildes out new instances of 
CfnPartition$SchemaReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schemaId` | software.amazon.awscdk.services.glue.CfnPartition$SchemaIdProperty | [[cdk.support/lookup-entry]] | `:schema-id` |
| `schemaVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version-id` |
| `schemaVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schema-version-number` |"
  [stack id config]
  (let [builder (CfnPartition$SchemaReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :schema-id)]
      (. builder schemaId data))
    (when-let [data (lookup-entry config id :schema-version-id)]
      (. builder schemaVersionId data))
    (when-let [data (lookup-entry config id :schema-version-number)]
      (. builder schemaVersionNumber data))
    (.build builder)))


(defn cfn-partition-serde-info-property-builder
  "The cfn-partition-serde-info-property-builder function buildes out new instances of 
CfnPartition$SerdeInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `serializationLibrary` | java.lang.String | [[cdk.support/lookup-entry]] | `:serialization-library` |"
  [stack id config]
  (let [builder (CfnPartition$SerdeInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :serialization-library)]
      (. builder serializationLibrary data))
    (.build builder)))


(defn cfn-partition-skewed-info-property-builder
  "The cfn-partition-skewed-info-property-builder function buildes out new instances of 
CfnPartition$SkewedInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skewedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:skewed-column-names` |
| `skewedColumnValueLocationMaps` | java.lang.Object | [[cdk.support/lookup-entry]] | `:skewed-column-value-location-maps` |
| `skewedColumnValues` | java.util.List | [[cdk.support/lookup-entry]] | `:skewed-column-values` |"
  [stack id config]
  (let [builder (CfnPartition$SkewedInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :skewed-column-names)]
      (. builder skewedColumnNames data))
    (when-let [data (lookup-entry config id :skewed-column-value-location-maps)]
      (. builder skewedColumnValueLocationMaps data))
    (when-let [data (lookup-entry config id :skewed-column-values)]
      (. builder skewedColumnValues data))
    (.build builder)))


(defn cfn-partition-storage-descriptor-property-builder
  "The cfn-partition-storage-descriptor-property-builder function buildes out new instances of 
CfnPartition$StorageDescriptorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:bucket-columns` |
| `columns` | java.util.List | [[cdk.support/lookup-entry]] | `:columns` |
| `compressed` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compressed` |
| `inputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `numberOfBuckets` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-buckets` |
| `outputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-format` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `schemaReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema-reference` |
| `serdeInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:serde-info` |
| `skewedInfo` | software.amazon.awscdk.services.glue.CfnPartition$SkewedInfoProperty | [[cdk.support/lookup-entry]] | `:skewed-info` |
| `sortColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sort-columns` |
| `storedAsSubDirectories` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stored-as-sub-directories` |"
  [stack id config]
  (let [builder (CfnPartition$StorageDescriptorProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-columns)]
      (. builder bucketColumns data))
    (when-let [data (lookup-entry config id :columns)]
      (. builder columns data))
    (when-let [data (lookup-entry config id :compressed)]
      (. builder compressed data))
    (when-let [data (lookup-entry config id :input-format)]
      (. builder inputFormat data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :number-of-buckets)]
      (. builder numberOfBuckets data))
    (when-let [data (lookup-entry config id :output-format)]
      (. builder outputFormat data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :schema-reference)]
      (. builder schemaReference data))
    (when-let [data (lookup-entry config id :serde-info)]
      (. builder serdeInfo data))
    (when-let [data (lookup-entry config id :skewed-info)]
      (. builder skewedInfo data))
    (when-let [data (lookup-entry config id :sort-columns)]
      (. builder sortColumns data))
    (when-let [data (lookup-entry config id :stored-as-sub-directories)]
      (. builder storedAsSubDirectories data))
    (.build builder)))


(defn cfn-registry-builder
  "The cfn-registry-builder function buildes out new instances of 
CfnRegistry$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRegistry$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-registry-props-builder
  "The cfn-registry-props-builder function buildes out new instances of 
CfnRegistryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRegistryProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-schema-builder
  "The cfn-schema-builder function buildes out new instances of 
CfnSchema$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:checkpoint-version` |
| `compatibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:compatibility` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `registry` | software.amazon.awscdk.services.glue.CfnSchema$RegistryProperty | [[cdk.support/lookup-entry]] | `:registry` |
| `schemaDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-definition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSchema$Builder/create stack id)]
    (when-let [data (lookup-entry config id :checkpoint-version)]
      (. builder checkpointVersion data))
    (when-let [data (lookup-entry config id :compatibility)]
      (. builder compatibility data))
    (when-let [data (lookup-entry config id :data-format)]
      (. builder dataFormat data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :registry)]
      (. builder registry data))
    (when-let [data (lookup-entry config id :schema-definition)]
      (. builder schemaDefinition data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-schema-props-builder
  "The cfn-schema-props-builder function buildes out new instances of 
CfnSchemaProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointVersion` | software.amazon.awscdk.services.glue.CfnSchema$SchemaVersionProperty | [[cdk.support/lookup-entry]] | `:checkpoint-version` |
| `compatibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:compatibility` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `registry` | software.amazon.awscdk.services.glue.CfnSchema$RegistryProperty | [[cdk.support/lookup-entry]] | `:registry` |
| `schemaDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-definition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSchemaProps$Builder.)]
    (when-let [data (lookup-entry config id :checkpoint-version)]
      (. builder checkpointVersion data))
    (when-let [data (lookup-entry config id :compatibility)]
      (. builder compatibility data))
    (when-let [data (lookup-entry config id :data-format)]
      (. builder dataFormat data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :registry)]
      (. builder registry data))
    (when-let [data (lookup-entry config id :schema-definition)]
      (. builder schemaDefinition data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-schema-registry-property-builder
  "The cfn-schema-registry-property-builder function buildes out new instances of 
CfnSchema$RegistryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnSchema$RegistryProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-schema-schema-version-property-builder
  "The cfn-schema-schema-version-property-builder function buildes out new instances of 
CfnSchema$SchemaVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isLatest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-latest` |
| `versionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version-number` |"
  [stack id config]
  (let [builder (CfnSchema$SchemaVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-latest)]
      (. builder isLatest data))
    (when-let [data (lookup-entry config id :version-number)]
      (. builder versionNumber data))
    (.build builder)))


(defn cfn-schema-version-builder
  "The cfn-schema-version-builder function buildes out new instances of 
CfnSchemaVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema` |
| `schemaDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-definition` |"
  [stack id config]
  (let [builder (CfnSchemaVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (lookup-entry config id :schema-definition)]
      (. builder schemaDefinition data))
    (.build builder)))


(defn cfn-schema-version-metadata-builder
  "The cfn-schema-version-metadata-builder function buildes out new instances of 
CfnSchemaVersionMetadata$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `schemaVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version-id` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnSchemaVersionMetadata$Builder/create stack id)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :schema-version-id)]
      (. builder schemaVersionId data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-schema-version-metadata-props-builder
  "The cfn-schema-version-metadata-props-builder function buildes out new instances of 
CfnSchemaVersionMetadataProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `schemaVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version-id` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnSchemaVersionMetadataProps$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :schema-version-id)]
      (. builder schemaVersionId data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-schema-version-props-builder
  "The cfn-schema-version-props-builder function buildes out new instances of 
CfnSchemaVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schema` | software.amazon.awscdk.services.glue.CfnSchemaVersion$SchemaProperty | [[cdk.support/lookup-entry]] | `:schema` |
| `schemaDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-definition` |"
  [stack id config]
  (let [builder (CfnSchemaVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (lookup-entry config id :schema-definition)]
      (. builder schemaDefinition data))
    (.build builder)))


(defn cfn-schema-version-schema-property-builder
  "The cfn-schema-version-schema-property-builder function buildes out new instances of 
CfnSchemaVersion$SchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |"
  [stack id config]
  (let [builder (CfnSchemaVersion$SchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :schema-arn)]
      (. builder schemaArn data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (.build builder)))


(defn cfn-security-configuration-builder
  "The cfn-security-configuration-builder function buildes out new instances of 
CfnSecurityConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnSecurityConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-security-configuration-cloud-watch-encryption-property-builder
  "The cfn-security-configuration-cloud-watch-encryption-property-builder function buildes out new instances of 
CfnSecurityConfiguration$CloudWatchEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-encryption-mode` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnSecurityConfiguration$CloudWatchEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-encryption-mode)]
      (. builder cloudWatchEncryptionMode data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-security-configuration-encryption-configuration-property-builder
  "The cfn-security-configuration-encryption-configuration-property-builder function buildes out new instances of 
CfnSecurityConfiguration$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchEncryption` | software.amazon.awscdk.services.glue.CfnSecurityConfiguration$CloudWatchEncryptionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-encryption` |
| `jobBookmarksEncryption` | software.amazon.awscdk.services.glue.CfnSecurityConfiguration$JobBookmarksEncryptionProperty | [[cdk.support/lookup-entry]] | `:job-bookmarks-encryption` |
| `s3Encryptions` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-encryptions` |"
  [stack id config]
  (let [builder (CfnSecurityConfiguration$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-encryption)]
      (. builder cloudWatchEncryption data))
    (when-let [data (lookup-entry config id :job-bookmarks-encryption)]
      (. builder jobBookmarksEncryption data))
    (when-let [data (lookup-entry config id :s3-encryptions)]
      (. builder s3Encryptions data))
    (.build builder)))


(defn cfn-security-configuration-job-bookmarks-encryption-property-builder
  "The cfn-security-configuration-job-bookmarks-encryption-property-builder function buildes out new instances of 
CfnSecurityConfiguration$JobBookmarksEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobBookmarksEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-bookmarks-encryption-mode` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnSecurityConfiguration$JobBookmarksEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :job-bookmarks-encryption-mode)]
      (. builder jobBookmarksEncryptionMode data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-security-configuration-props-builder
  "The cfn-security-configuration-props-builder function buildes out new instances of 
CfnSecurityConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnSecurityConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-security-configuration-s3-encryption-property-builder
  "The cfn-security-configuration-s3-encryption-property-builder function buildes out new instances of 
CfnSecurityConfiguration$S3EncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `s3EncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-encryption-mode` |"
  [stack id config]
  (let [builder (CfnSecurityConfiguration$S3EncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :s3-encryption-mode)]
      (. builder s3EncryptionMode data))
    (.build builder)))


(defn cfn-table-builder
  "The cfn-table-builder function buildes out new instances of 
CfnTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `openTableFormatInput` | software.amazon.awscdk.services.glue.CfnTable$OpenTableFormatInputProperty | [[cdk.support/lookup-entry]] | `:open-table-format-input` |
| `tableInput` | software.amazon.awscdk.services.glue.CfnTable$TableInputProperty | [[cdk.support/lookup-entry]] | `:table-input` |"
  [stack id config]
  (let [builder (CfnTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :open-table-format-input)]
      (. builder openTableFormatInput data))
    (when-let [data (lookup-entry config id :table-input)]
      (. builder tableInput data))
    (.build builder)))


(defn cfn-table-column-property-builder
  "The cfn-table-column-property-builder function buildes out new instances of 
CfnTable$ColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTable$ColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-table-iceberg-input-property-builder
  "The cfn-table-iceberg-input-property-builder function buildes out new instances of 
CfnTable$IcebergInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataOperation` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-operation` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnTable$IcebergInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :metadata-operation)]
      (. builder metadataOperation data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-table-open-table-format-input-property-builder
  "The cfn-table-open-table-format-input-property-builder function buildes out new instances of 
CfnTable$OpenTableFormatInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `icebergInput` | software.amazon.awscdk.services.glue.CfnTable$IcebergInputProperty | [[cdk.support/lookup-entry]] | `:iceberg-input` |"
  [stack id config]
  (let [builder (CfnTable$OpenTableFormatInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :iceberg-input)]
      (. builder icebergInput data))
    (.build builder)))


(defn cfn-table-optimizer-builder
  "The cfn-table-optimizer-builder function buildes out new instances of 
CfnTableOptimizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tableOptimizerConfiguration` | software.amazon.awscdk.services.glue.CfnTableOptimizer$TableOptimizerConfigurationProperty | [[cdk.support/lookup-entry]] | `:table-optimizer-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTableOptimizer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :table-optimizer-configuration)]
      (. builder tableOptimizerConfiguration data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-table-optimizer-props-builder
  "The cfn-table-optimizer-props-builder function buildes out new instances of 
CfnTableOptimizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tableOptimizerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table-optimizer-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTableOptimizerProps$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :table-optimizer-configuration)]
      (. builder tableOptimizerConfiguration data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-table-optimizer-table-optimizer-configuration-property-builder
  "The cfn-table-optimizer-table-optimizer-configuration-property-builder function buildes out new instances of 
CfnTableOptimizer$TableOptimizerConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnTableOptimizer$TableOptimizerConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-table-order-property-builder
  "The cfn-table-order-property-builder function buildes out new instances of 
CfnTable$OrderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `column` | java.lang.String | [[cdk.support/lookup-entry]] | `:column` |
| `sortOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sort-order` |"
  [stack id config]
  (let [builder (CfnTable$OrderProperty$Builder.)]
    (when-let [data (lookup-entry config id :column)]
      (. builder column data))
    (when-let [data (lookup-entry config id :sort-order)]
      (. builder sortOrder data))
    (.build builder)))


(defn cfn-table-props-builder
  "The cfn-table-props-builder function buildes out new instances of 
CfnTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `openTableFormatInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:open-table-format-input` |
| `tableInput` | software.amazon.awscdk.services.glue.CfnTable$TableInputProperty | [[cdk.support/lookup-entry]] | `:table-input` |"
  [stack id config]
  (let [builder (CfnTableProps$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :open-table-format-input)]
      (. builder openTableFormatInput data))
    (when-let [data (lookup-entry config id :table-input)]
      (. builder tableInput data))
    (.build builder)))


(defn cfn-table-schema-id-property-builder
  "The cfn-table-schema-id-property-builder function buildes out new instances of 
CfnTable$SchemaIdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |"
  [stack id config]
  (let [builder (CfnTable$SchemaIdProperty$Builder.)]
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :schema-arn)]
      (. builder schemaArn data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (.build builder)))


(defn cfn-table-schema-reference-property-builder
  "The cfn-table-schema-reference-property-builder function buildes out new instances of 
CfnTable$SchemaReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schemaId` | software.amazon.awscdk.services.glue.CfnTable$SchemaIdProperty | [[cdk.support/lookup-entry]] | `:schema-id` |
| `schemaVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version-id` |
| `schemaVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schema-version-number` |"
  [stack id config]
  (let [builder (CfnTable$SchemaReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :schema-id)]
      (. builder schemaId data))
    (when-let [data (lookup-entry config id :schema-version-id)]
      (. builder schemaVersionId data))
    (when-let [data (lookup-entry config id :schema-version-number)]
      (. builder schemaVersionNumber data))
    (.build builder)))


(defn cfn-table-serde-info-property-builder
  "The cfn-table-serde-info-property-builder function buildes out new instances of 
CfnTable$SerdeInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `serializationLibrary` | java.lang.String | [[cdk.support/lookup-entry]] | `:serialization-library` |"
  [stack id config]
  (let [builder (CfnTable$SerdeInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :serialization-library)]
      (. builder serializationLibrary data))
    (.build builder)))


(defn cfn-table-skewed-info-property-builder
  "The cfn-table-skewed-info-property-builder function buildes out new instances of 
CfnTable$SkewedInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skewedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:skewed-column-names` |
| `skewedColumnValueLocationMaps` | java.lang.Object | [[cdk.support/lookup-entry]] | `:skewed-column-value-location-maps` |
| `skewedColumnValues` | java.util.List | [[cdk.support/lookup-entry]] | `:skewed-column-values` |"
  [stack id config]
  (let [builder (CfnTable$SkewedInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :skewed-column-names)]
      (. builder skewedColumnNames data))
    (when-let [data (lookup-entry config id :skewed-column-value-location-maps)]
      (. builder skewedColumnValueLocationMaps data))
    (when-let [data (lookup-entry config id :skewed-column-values)]
      (. builder skewedColumnValues data))
    (.build builder)))


(defn cfn-table-storage-descriptor-property-builder
  "The cfn-table-storage-descriptor-property-builder function buildes out new instances of 
CfnTable$StorageDescriptorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:bucket-columns` |
| `columns` | java.util.List | [[cdk.support/lookup-entry]] | `:columns` |
| `compressed` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compressed` |
| `inputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-format` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `numberOfBuckets` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-buckets` |
| `outputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-format` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `schemaReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema-reference` |
| `serdeInfo` | software.amazon.awscdk.services.glue.CfnTable$SerdeInfoProperty | [[cdk.support/lookup-entry]] | `:serde-info` |
| `skewedInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:skewed-info` |
| `sortColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sort-columns` |
| `storedAsSubDirectories` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stored-as-sub-directories` |"
  [stack id config]
  (let [builder (CfnTable$StorageDescriptorProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-columns)]
      (. builder bucketColumns data))
    (when-let [data (lookup-entry config id :columns)]
      (. builder columns data))
    (when-let [data (lookup-entry config id :compressed)]
      (. builder compressed data))
    (when-let [data (lookup-entry config id :input-format)]
      (. builder inputFormat data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :number-of-buckets)]
      (. builder numberOfBuckets data))
    (when-let [data (lookup-entry config id :output-format)]
      (. builder outputFormat data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :schema-reference)]
      (. builder schemaReference data))
    (when-let [data (lookup-entry config id :serde-info)]
      (. builder serdeInfo data))
    (when-let [data (lookup-entry config id :skewed-info)]
      (. builder skewedInfo data))
    (when-let [data (lookup-entry config id :sort-columns)]
      (. builder sortColumns data))
    (when-let [data (lookup-entry config id :stored-as-sub-directories)]
      (. builder storedAsSubDirectories data))
    (.build builder)))


(defn cfn-table-table-identifier-property-builder
  "The cfn-table-table-identifier-property-builder function buildes out new instances of 
CfnTable$TableIdentifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnTable$TableIdentifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-table-table-input-property-builder
  "The cfn-table-table-input-property-builder function buildes out new instances of 
CfnTable$TableInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `partitionKeys` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partition-keys` |
| `retention` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention` |
| `storageDescriptor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-descriptor` |
| `tableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-type` |
| `targetTable` | software.amazon.awscdk.services.glue.CfnTable$TableIdentifierProperty | [[cdk.support/lookup-entry]] | `:target-table` |
| `viewExpandedText` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-expanded-text` |
| `viewOriginalText` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-original-text` |"
  [stack id config]
  (let [builder (CfnTable$TableInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :partition-keys)]
      (. builder partitionKeys data))
    (when-let [data (lookup-entry config id :retention)]
      (. builder retention data))
    (when-let [data (lookup-entry config id :storage-descriptor)]
      (. builder storageDescriptor data))
    (when-let [data (lookup-entry config id :table-type)]
      (. builder tableType data))
    (when-let [data (lookup-entry config id :target-table)]
      (. builder targetTable data))
    (when-let [data (lookup-entry config id :view-expanded-text)]
      (. builder viewExpandedText data))
    (when-let [data (lookup-entry config id :view-original-text)]
      (. builder viewOriginalText data))
    (.build builder)))


(defn cfn-trigger-action-property-builder
  "The cfn-trigger-action-property-builder function buildes out new instances of 
CfnTrigger$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:arguments` |
| `crawlerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawler-name` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `notificationProperty` | software.amazon.awscdk.services.glue.CfnTrigger$NotificationPropertyProperty | [[cdk.support/lookup-entry]] | `:notification-property` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnTrigger$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :arguments)]
      (. builder arguments data))
    (when-let [data (lookup-entry config id :crawler-name)]
      (. builder crawlerName data))
    (when-let [data (lookup-entry config id :job-name)]
      (. builder jobName data))
    (when-let [data (lookup-entry config id :notification-property)]
      (. builder notificationProperty data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-trigger-builder
  "The cfn-trigger-builder function buildes out new instances of 
CfnTrigger$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBatchingCondition` | software.amazon.awscdk.services.glue.CfnTrigger$EventBatchingConditionProperty | [[cdk.support/lookup-entry]] | `:event-batching-condition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `predicate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predicate` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `startOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:start-on-creation` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |"
  [stack id config]
  (let [builder (CfnTrigger$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-batching-condition)]
      (. builder eventBatchingCondition data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :predicate)]
      (. builder predicate data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :start-on-creation)]
      (. builder startOnCreation data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :workflow-name)]
      (. builder workflowName data))
    (.build builder)))


(defn cfn-trigger-condition-property-builder
  "The cfn-trigger-condition-property-builder function buildes out new instances of 
CfnTrigger$ConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlState` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawl-state` |
| `crawlerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawler-name` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `logicalOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-operator` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnTrigger$ConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :crawl-state)]
      (. builder crawlState data))
    (when-let [data (lookup-entry config id :crawler-name)]
      (. builder crawlerName data))
    (when-let [data (lookup-entry config id :job-name)]
      (. builder jobName data))
    (when-let [data (lookup-entry config id :logical-operator)]
      (. builder logicalOperator data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-trigger-event-batching-condition-property-builder
  "The cfn-trigger-event-batching-condition-property-builder function buildes out new instances of 
CfnTrigger$EventBatchingConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `batchWindow` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-window` |"
  [stack id config]
  (let [builder (CfnTrigger$EventBatchingConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-size)]
      (. builder batchSize data))
    (when-let [data (lookup-entry config id :batch-window)]
      (. builder batchWindow data))
    (.build builder)))


(defn cfn-trigger-notification-property-property-builder
  "The cfn-trigger-notification-property-property-builder function buildes out new instances of 
CfnTrigger$NotificationPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notifyDelayAfter` | java.lang.Number | [[cdk.support/lookup-entry]] | `:notify-delay-after` |"
  [stack id config]
  (let [builder (CfnTrigger$NotificationPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :notify-delay-after)]
      (. builder notifyDelayAfter data))
    (.build builder)))


(defn cfn-trigger-predicate-property-builder
  "The cfn-trigger-predicate-property-builder function buildes out new instances of 
CfnTrigger$PredicateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `logical` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical` |"
  [stack id config]
  (let [builder (CfnTrigger$PredicateProperty$Builder.)]
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :logical)]
      (. builder logical data))
    (.build builder)))


(defn cfn-trigger-props-builder
  "The cfn-trigger-props-builder function buildes out new instances of 
CfnTriggerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBatchingCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-batching-condition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `predicate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predicate` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `startOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:start-on-creation` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |"
  [stack id config]
  (let [builder (CfnTriggerProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-batching-condition)]
      (. builder eventBatchingCondition data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :predicate)]
      (. builder predicate data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :start-on-creation)]
      (. builder startOnCreation data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :workflow-name)]
      (. builder workflowName data))
    (.build builder)))


(defn cfn-workflow-builder
  "The cfn-workflow-builder function buildes out new instances of 
CfnWorkflow$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultRunProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-run-properties` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxConcurrentRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-runs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkflow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-run-properties)]
      (. builder defaultRunProperties data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :max-concurrent-runs)]
      (. builder maxConcurrentRuns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-workflow-props-builder
  "The cfn-workflow-props-builder function buildes out new instances of 
CfnWorkflowProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultRunProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-run-properties` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxConcurrentRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-runs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkflowProps$Builder.)]
    (when-let [data (lookup-entry config id :default-run-properties)]
      (. builder defaultRunProperties data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :max-concurrent-runs)]
      (. builder maxConcurrentRuns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))