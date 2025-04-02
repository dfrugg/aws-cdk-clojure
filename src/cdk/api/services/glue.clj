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


(defn cfn-classifier-builder>
  "The cfn-classifier-builder> function updates a CfnClassifier$Builder instance using the provided configuration.
  The function takes the CfnClassifier$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvClassifier` | software.amazon.awscdk.services.glue.CfnClassifier$CsvClassifierProperty | [[cdk.support/lookup-entry]] | `:csv-classifier` |
| `grokClassifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grok-classifier` |
| `jsonClassifier` | software.amazon.awscdk.services.glue.CfnClassifier$JsonClassifierProperty | [[cdk.support/lookup-entry]] | `:json-classifier` |
| `xmlClassifier` | software.amazon.awscdk.services.glue.CfnClassifier$XMLClassifierProperty | [[cdk.support/lookup-entry]] | `:xml-classifier` |
"
  [^CfnClassifier$Builder builder id config]
  (when-some [data (lookup-entry config id :csv-classifier)]
    (. builder csvClassifier data))
  (when-some [data (lookup-entry config id :grok-classifier)]
    (. builder grokClassifier data))
  (when-some [data (lookup-entry config id :json-classifier)]
    (. builder jsonClassifier data))
  (when-some [data (lookup-entry config id :xml-classifier)]
    (. builder xmlClassifier data))
  (.build builder))


(defn cfn-classifier-builder
  "Creates a  `CfnClassifier$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-classifier-builder> (CfnClassifier$Builder/create scope (name id)) id config))


(defn cfn-classifier-csv-classifier-property-builder>
  "The cfn-classifier-csv-classifier-property-builder> function updates a CfnClassifier$CsvClassifierProperty$Builder instance using the provided configuration.
  The function takes the CfnClassifier$CsvClassifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `quoteSymbol` | java.lang.String | [[cdk.support/lookup-entry]] | `:quote-symbol` |
"
  [^CfnClassifier$CsvClassifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-single-column)]
    (. builder allowSingleColumn data))
  (when-some [data (lookup-entry config id :contains-custom-datatype)]
    (. builder containsCustomDatatype data))
  (when-some [data (lookup-entry config id :contains-header)]
    (. builder containsHeader data))
  (when-some [data (lookup-entry config id :custom-datatype-configured)]
    (. builder customDatatypeConfigured data))
  (when-some [data (lookup-entry config id :delimiter)]
    (. builder delimiter data))
  (when-some [data (lookup-entry config id :disable-value-trimming)]
    (. builder disableValueTrimming data))
  (when-some [data (lookup-entry config id :header)]
    (. builder header data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :quote-symbol)]
    (. builder quoteSymbol data))
  (.build builder))


(defn cfn-classifier-csv-classifier-property-builder
  "Creates a  `CfnClassifier$CsvClassifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-classifier-csv-classifier-property-builder> (new CfnClassifier$CsvClassifierProperty$Builder) id config))


(defn cfn-classifier-grok-classifier-property-builder>
  "The cfn-classifier-grok-classifier-property-builder> function updates a CfnClassifier$GrokClassifierProperty$Builder instance using the provided configuration.
  The function takes the CfnClassifier$GrokClassifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `customPatterns` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-patterns` |
| `grokPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:grok-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnClassifier$GrokClassifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :classification)]
    (. builder classification data))
  (when-some [data (lookup-entry config id :custom-patterns)]
    (. builder customPatterns data))
  (when-some [data (lookup-entry config id :grok-pattern)]
    (. builder grokPattern data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-classifier-grok-classifier-property-builder
  "Creates a  `CfnClassifier$GrokClassifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-classifier-grok-classifier-property-builder> (new CfnClassifier$GrokClassifierProperty$Builder) id config))


(defn cfn-classifier-json-classifier-property-builder>
  "The cfn-classifier-json-classifier-property-builder> function updates a CfnClassifier$JsonClassifierProperty$Builder instance using the provided configuration.
  The function takes the CfnClassifier$JsonClassifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnClassifier$JsonClassifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :json-path)]
    (. builder jsonPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-classifier-json-classifier-property-builder
  "Creates a  `CfnClassifier$JsonClassifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-classifier-json-classifier-property-builder> (new CfnClassifier$JsonClassifierProperty$Builder) id config))


(defn cfn-classifier-props-builder>
  "The cfn-classifier-props-builder> function updates a CfnClassifierProps$Builder instance using the provided configuration.
  The function takes the CfnClassifierProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvClassifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv-classifier` |
| `grokClassifier` | software.amazon.awscdk.services.glue.CfnClassifier$GrokClassifierProperty | [[cdk.support/lookup-entry]] | `:grok-classifier` |
| `jsonClassifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-classifier` |
| `xmlClassifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:xml-classifier` |
"
  [^CfnClassifierProps$Builder builder id config]
  (when-some [data (lookup-entry config id :csv-classifier)]
    (. builder csvClassifier data))
  (when-some [data (lookup-entry config id :grok-classifier)]
    (. builder grokClassifier data))
  (when-some [data (lookup-entry config id :json-classifier)]
    (. builder jsonClassifier data))
  (when-some [data (lookup-entry config id :xml-classifier)]
    (. builder xmlClassifier data))
  (.build builder))


(defn cfn-classifier-props-builder
  "Creates a  `CfnClassifierProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-classifier-props-builder> (new CfnClassifierProps$Builder) id config))


(defn cfn-classifier-xml-classifier-property-builder>
  "The cfn-classifier-xml-classifier-property-builder> function updates a CfnClassifier$XMLClassifierProperty$Builder instance using the provided configuration.
  The function takes the CfnClassifier$XMLClassifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rowTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:row-tag` |
"
  [^CfnClassifier$XMLClassifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :classification)]
    (. builder classification data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :row-tag)]
    (. builder rowTag data))
  (.build builder))


(defn cfn-classifier-xml-classifier-property-builder
  "Creates a  `CfnClassifier$XMLClassifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-classifier-xml-classifier-property-builder> (new CfnClassifier$XMLClassifierProperty$Builder) id config))


(defn cfn-connection-builder>
  "The cfn-connection-builder> function updates a CfnConnection$Builder instance using the provided configuration.
  The function takes the CfnConnection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `connectionInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-input` |
"
  [^CfnConnection$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :connection-input)]
    (. builder connectionInput data))
  (.build builder))


(defn cfn-connection-builder
  "Creates a  `CfnConnection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-connection-builder> (CfnConnection$Builder/create scope (name id)) id config))


(defn cfn-connection-connection-input-property-builder>
  "The cfn-connection-connection-input-property-builder> function updates a CfnConnection$ConnectionInputProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$ConnectionInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:connection-properties` |
| `connectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `matchCriteria` | java.util.List | [[cdk.support/lookup-entry]] | `:match-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `physicalConnectionRequirements` | software.amazon.awscdk.services.glue.CfnConnection$PhysicalConnectionRequirementsProperty | [[cdk.support/lookup-entry]] | `:physical-connection-requirements` |
"
  [^CfnConnection$ConnectionInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-properties)]
    (. builder connectionProperties data))
  (when-some [data (lookup-entry config id :connection-type)]
    (. builder connectionType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :match-criteria)]
    (. builder matchCriteria data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :physical-connection-requirements)]
    (. builder physicalConnectionRequirements data))
  (.build builder))


(defn cfn-connection-connection-input-property-builder
  "Creates a  `CfnConnection$ConnectionInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-connection-connection-input-property-builder> (new CfnConnection$ConnectionInputProperty$Builder) id config))


(defn cfn-connection-physical-connection-requirements-property-builder>
  "The cfn-connection-physical-connection-requirements-property-builder> function updates a CfnConnection$PhysicalConnectionRequirementsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnection$PhysicalConnectionRequirementsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `securityGroupIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-id-list` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnConnection$PhysicalConnectionRequirementsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :security-group-id-list)]
    (. builder securityGroupIdList data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-connection-physical-connection-requirements-property-builder
  "Creates a  `CfnConnection$PhysicalConnectionRequirementsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-connection-physical-connection-requirements-property-builder> (new CfnConnection$PhysicalConnectionRequirementsProperty$Builder) id config))


(defn cfn-connection-props-builder>
  "The cfn-connection-props-builder> function updates a CfnConnectionProps$Builder instance using the provided configuration.
  The function takes the CfnConnectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `connectionInput` | software.amazon.awscdk.services.glue.CfnConnection$ConnectionInputProperty | [[cdk.support/lookup-entry]] | `:connection-input` |
"
  [^CfnConnectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :connection-input)]
    (. builder connectionInput data))
  (.build builder))


(defn cfn-connection-props-builder
  "Creates a  `CfnConnectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-connection-props-builder> (new CfnConnectionProps$Builder) id config))


(defn cfn-crawler-builder>
  "The cfn-crawler-builder> function updates a CfnCrawler$Builder instance using the provided configuration.
  The function takes the CfnCrawler$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `targets` | software.amazon.awscdk.services.glue.CfnCrawler$TargetsProperty | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnCrawler$Builder builder id config]
  (when-some [data (lookup-entry config id :classifiers)]
    (. builder classifiers data))
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :crawler-security-configuration)]
    (. builder crawlerSecurityConfiguration data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :lake-formation-configuration)]
    (. builder lakeFormationConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :recrawl-policy)]
    (. builder recrawlPolicy data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :schema-change-policy)]
    (. builder schemaChangePolicy data))
  (when-some [data (lookup-entry config id :table-prefix)]
    (. builder tablePrefix data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-crawler-builder
  "Creates a  `CfnCrawler$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-crawler-builder> (CfnCrawler$Builder/create scope (name id)) id config))


(defn cfn-crawler-catalog-target-property-builder>
  "The cfn-crawler-catalog-target-property-builder> function updates a CfnCrawler$CatalogTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$CatalogTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dlqEventQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dlq-event-queue-arn` |
| `eventQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-queue-arn` |
| `tables` | java.util.List | [[cdk.support/lookup-entry]] | `:tables` |
"
  [^CfnCrawler$CatalogTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :dlq-event-queue-arn)]
    (. builder dlqEventQueueArn data))
  (when-some [data (lookup-entry config id :event-queue-arn)]
    (. builder eventQueueArn data))
  (when-some [data (lookup-entry config id :tables)]
    (. builder tables data))
  (.build builder))


(defn cfn-crawler-catalog-target-property-builder
  "Creates a  `CfnCrawler$CatalogTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-catalog-target-property-builder> (new CfnCrawler$CatalogTargetProperty$Builder) id config))


(defn cfn-crawler-delta-target-property-builder>
  "The cfn-crawler-delta-target-property-builder> function updates a CfnCrawler$DeltaTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$DeltaTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `createNativeDeltaTable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-native-delta-table` |
| `deltaTables` | java.util.List | [[cdk.support/lookup-entry]] | `:delta-tables` |
| `writeManifest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:write-manifest` |
"
  [^CfnCrawler$DeltaTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :create-native-delta-table)]
    (. builder createNativeDeltaTable data))
  (when-some [data (lookup-entry config id :delta-tables)]
    (. builder deltaTables data))
  (when-some [data (lookup-entry config id :write-manifest)]
    (. builder writeManifest data))
  (.build builder))


(defn cfn-crawler-delta-target-property-builder
  "Creates a  `CfnCrawler$DeltaTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-delta-target-property-builder> (new CfnCrawler$DeltaTargetProperty$Builder) id config))


(defn cfn-crawler-dynamo-db-target-property-builder>
  "The cfn-crawler-dynamo-db-target-property-builder> function updates a CfnCrawler$DynamoDBTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$DynamoDBTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnCrawler$DynamoDBTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-crawler-dynamo-db-target-property-builder
  "Creates a  `CfnCrawler$DynamoDBTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-dynamo-db-target-property-builder> (new CfnCrawler$DynamoDBTargetProperty$Builder) id config))


(defn cfn-crawler-iceberg-target-property-builder>
  "The cfn-crawler-iceberg-target-property-builder> function updates a CfnCrawler$IcebergTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$IcebergTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `exclusions` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusions` |
| `maximumTraversalDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-traversal-depth` |
| `paths` | java.util.List | [[cdk.support/lookup-entry]] | `:paths` |
"
  [^CfnCrawler$IcebergTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :exclusions)]
    (. builder exclusions data))
  (when-some [data (lookup-entry config id :maximum-traversal-depth)]
    (. builder maximumTraversalDepth data))
  (when-some [data (lookup-entry config id :paths)]
    (. builder paths data))
  (.build builder))


(defn cfn-crawler-iceberg-target-property-builder
  "Creates a  `CfnCrawler$IcebergTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-iceberg-target-property-builder> (new CfnCrawler$IcebergTargetProperty$Builder) id config))


(defn cfn-crawler-jdbc-target-property-builder>
  "The cfn-crawler-jdbc-target-property-builder> function updates a CfnCrawler$JdbcTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$JdbcTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `exclusions` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusions` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnCrawler$JdbcTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :exclusions)]
    (. builder exclusions data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-crawler-jdbc-target-property-builder
  "Creates a  `CfnCrawler$JdbcTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-jdbc-target-property-builder> (new CfnCrawler$JdbcTargetProperty$Builder) id config))


(defn cfn-crawler-lake-formation-configuration-property-builder>
  "The cfn-crawler-lake-formation-configuration-property-builder> function updates a CfnCrawler$LakeFormationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$LakeFormationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `useLakeFormationCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-lake-formation-credentials` |
"
  [^CfnCrawler$LakeFormationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :use-lake-formation-credentials)]
    (. builder useLakeFormationCredentials data))
  (.build builder))


(defn cfn-crawler-lake-formation-configuration-property-builder
  "Creates a  `CfnCrawler$LakeFormationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-lake-formation-configuration-property-builder> (new CfnCrawler$LakeFormationConfigurationProperty$Builder) id config))


(defn cfn-crawler-mongo-db-target-property-builder>
  "The cfn-crawler-mongo-db-target-property-builder> function updates a CfnCrawler$MongoDBTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$MongoDBTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnCrawler$MongoDBTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-crawler-mongo-db-target-property-builder
  "Creates a  `CfnCrawler$MongoDBTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-mongo-db-target-property-builder> (new CfnCrawler$MongoDBTargetProperty$Builder) id config))


(defn cfn-crawler-props-builder>
  "The cfn-crawler-props-builder> function updates a CfnCrawlerProps$Builder instance using the provided configuration.
  The function takes the CfnCrawlerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `targets` | software.amazon.awscdk.services.glue.CfnCrawler$TargetsProperty | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnCrawlerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :classifiers)]
    (. builder classifiers data))
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :crawler-security-configuration)]
    (. builder crawlerSecurityConfiguration data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :lake-formation-configuration)]
    (. builder lakeFormationConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :recrawl-policy)]
    (. builder recrawlPolicy data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :schema-change-policy)]
    (. builder schemaChangePolicy data))
  (when-some [data (lookup-entry config id :table-prefix)]
    (. builder tablePrefix data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-crawler-props-builder
  "Creates a  `CfnCrawlerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-props-builder> (new CfnCrawlerProps$Builder) id config))


(defn cfn-crawler-recrawl-policy-property-builder>
  "The cfn-crawler-recrawl-policy-property-builder> function updates a CfnCrawler$RecrawlPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$RecrawlPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recrawlBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:recrawl-behavior` |
"
  [^CfnCrawler$RecrawlPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :recrawl-behavior)]
    (. builder recrawlBehavior data))
  (.build builder))


(defn cfn-crawler-recrawl-policy-property-builder
  "Creates a  `CfnCrawler$RecrawlPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-recrawl-policy-property-builder> (new CfnCrawler$RecrawlPolicyProperty$Builder) id config))


(defn cfn-crawler-s3-target-property-builder>
  "The cfn-crawler-s3-target-property-builder> function updates a CfnCrawler$S3TargetProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$S3TargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `dlqEventQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dlq-event-queue-arn` |
| `eventQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-queue-arn` |
| `exclusions` | java.util.List | [[cdk.support/lookup-entry]] | `:exclusions` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `sampleSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sample-size` |
"
  [^CfnCrawler$S3TargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :dlq-event-queue-arn)]
    (. builder dlqEventQueueArn data))
  (when-some [data (lookup-entry config id :event-queue-arn)]
    (. builder eventQueueArn data))
  (when-some [data (lookup-entry config id :exclusions)]
    (. builder exclusions data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :sample-size)]
    (. builder sampleSize data))
  (.build builder))


(defn cfn-crawler-s3-target-property-builder
  "Creates a  `CfnCrawler$S3TargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-s3-target-property-builder> (new CfnCrawler$S3TargetProperty$Builder) id config))


(defn cfn-crawler-schedule-property-builder>
  "The cfn-crawler-schedule-property-builder> function updates a CfnCrawler$ScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$ScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
"
  [^CfnCrawler$ScheduleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (.build builder))


(defn cfn-crawler-schedule-property-builder
  "Creates a  `CfnCrawler$ScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-schedule-property-builder> (new CfnCrawler$ScheduleProperty$Builder) id config))


(defn cfn-crawler-schema-change-policy-property-builder>
  "The cfn-crawler-schema-change-policy-property-builder> function updates a CfnCrawler$SchemaChangePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$SchemaChangePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:delete-behavior` |
| `updateBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-behavior` |
"
  [^CfnCrawler$SchemaChangePolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-behavior)]
    (. builder deleteBehavior data))
  (when-some [data (lookup-entry config id :update-behavior)]
    (. builder updateBehavior data))
  (.build builder))


(defn cfn-crawler-schema-change-policy-property-builder
  "Creates a  `CfnCrawler$SchemaChangePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-schema-change-policy-property-builder> (new CfnCrawler$SchemaChangePolicyProperty$Builder) id config))


(defn cfn-crawler-targets-property-builder>
  "The cfn-crawler-targets-property-builder> function updates a CfnCrawler$TargetsProperty$Builder instance using the provided configuration.
  The function takes the CfnCrawler$TargetsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:catalog-targets` |
| `deltaTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delta-targets` |
| `dynamoDbTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:dynamo-db-targets` |
| `icebergTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iceberg-targets` |
| `jdbcTargets` | java.util.List | [[cdk.support/lookup-entry]] | `:jdbc-targets` |
| `mongoDbTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mongo-db-targets` |
| `s3Targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-targets` |
"
  [^CfnCrawler$TargetsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-targets)]
    (. builder catalogTargets data))
  (when-some [data (lookup-entry config id :delta-targets)]
    (. builder deltaTargets data))
  (when-some [data (lookup-entry config id :dynamo-db-targets)]
    (. builder dynamoDbTargets data))
  (when-some [data (lookup-entry config id :iceberg-targets)]
    (. builder icebergTargets data))
  (when-some [data (lookup-entry config id :jdbc-targets)]
    (. builder jdbcTargets data))
  (when-some [data (lookup-entry config id :mongo-db-targets)]
    (. builder mongoDbTargets data))
  (when-some [data (lookup-entry config id :s3-targets)]
    (. builder s3Targets data))
  (.build builder))


(defn cfn-crawler-targets-property-builder
  "Creates a  `CfnCrawler$TargetsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-crawler-targets-property-builder> (new CfnCrawler$TargetsProperty$Builder) id config))


(defn cfn-custom-entity-type-builder>
  "The cfn-custom-entity-type-builder> function updates a CfnCustomEntityType$Builder instance using the provided configuration.
  The function takes the CfnCustomEntityType$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contextWords` | java.util.List | [[cdk.support/lookup-entry]] | `:context-words` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regexString` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex-string` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomEntityType$Builder builder id config]
  (when-some [data (lookup-entry config id :context-words)]
    (. builder contextWords data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :regex-string)]
    (. builder regexString data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-custom-entity-type-builder
  "Creates a  `CfnCustomEntityType$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-custom-entity-type-builder> (CfnCustomEntityType$Builder/create scope (name id)) id config))


(defn cfn-custom-entity-type-props-builder>
  "The cfn-custom-entity-type-props-builder> function updates a CfnCustomEntityTypeProps$Builder instance using the provided configuration.
  The function takes the CfnCustomEntityTypeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contextWords` | java.util.List | [[cdk.support/lookup-entry]] | `:context-words` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regexString` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex-string` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomEntityTypeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :context-words)]
    (. builder contextWords data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :regex-string)]
    (. builder regexString data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-custom-entity-type-props-builder
  "Creates a  `CfnCustomEntityTypeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-custom-entity-type-props-builder> (new CfnCustomEntityTypeProps$Builder) id config))


(defn cfn-data-catalog-encryption-settings-builder>
  "The cfn-data-catalog-encryption-settings-builder> function updates a CfnDataCatalogEncryptionSettings$Builder instance using the provided configuration.
  The function takes the CfnDataCatalogEncryptionSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `dataCatalogEncryptionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-catalog-encryption-settings` |
"
  [^CfnDataCatalogEncryptionSettings$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :data-catalog-encryption-settings)]
    (. builder dataCatalogEncryptionSettings data))
  (.build builder))


(defn cfn-data-catalog-encryption-settings-builder
  "Creates a  `CfnDataCatalogEncryptionSettings$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-data-catalog-encryption-settings-builder> (CfnDataCatalogEncryptionSettings$Builder/create scope (name id)) id config))


(defn cfn-data-catalog-encryption-settings-connection-password-encryption-property-builder>
  "The cfn-data-catalog-encryption-settings-connection-password-encryption-property-builder> function updates a CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `returnConnectionPasswordEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-connection-password-encrypted` |
"
  [^CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :return-connection-password-encrypted)]
    (. builder returnConnectionPasswordEncrypted data))
  (.build builder))


(defn cfn-data-catalog-encryption-settings-connection-password-encryption-property-builder
  "Creates a  `CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-catalog-encryption-settings-connection-password-encryption-property-builder> (new CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty$Builder) id config))


(defn cfn-data-catalog-encryption-settings-data-catalog-encryption-settings-property-builder>
  "The cfn-data-catalog-encryption-settings-data-catalog-encryption-settings-property-builder> function updates a CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPasswordEncryption` | software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings$ConnectionPasswordEncryptionProperty | [[cdk.support/lookup-entry]] | `:connection-password-encryption` |
| `encryptionAtRest` | software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty | [[cdk.support/lookup-entry]] | `:encryption-at-rest` |
"
  [^CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-password-encryption)]
    (. builder connectionPasswordEncryption data))
  (when-some [data (lookup-entry config id :encryption-at-rest)]
    (. builder encryptionAtRest data))
  (.build builder))


(defn cfn-data-catalog-encryption-settings-data-catalog-encryption-settings-property-builder
  "Creates a  `CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-catalog-encryption-settings-data-catalog-encryption-settings-property-builder> (new CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty$Builder) id config))


(defn cfn-data-catalog-encryption-settings-encryption-at-rest-property-builder>
  "The cfn-data-catalog-encryption-settings-encryption-at-rest-property-builder> function updates a CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty$Builder instance using the provided configuration.
  The function takes the CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-encryption-mode` |
| `catalogEncryptionServiceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-encryption-service-role` |
| `sseAwsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sse-aws-kms-key-id` |
"
  [^CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-encryption-mode)]
    (. builder catalogEncryptionMode data))
  (when-some [data (lookup-entry config id :catalog-encryption-service-role)]
    (. builder catalogEncryptionServiceRole data))
  (when-some [data (lookup-entry config id :sse-aws-kms-key-id)]
    (. builder sseAwsKmsKeyId data))
  (.build builder))


(defn cfn-data-catalog-encryption-settings-encryption-at-rest-property-builder
  "Creates a  `CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-catalog-encryption-settings-encryption-at-rest-property-builder> (new CfnDataCatalogEncryptionSettings$EncryptionAtRestProperty$Builder) id config))


(defn cfn-data-catalog-encryption-settings-props-builder>
  "The cfn-data-catalog-encryption-settings-props-builder> function updates a CfnDataCatalogEncryptionSettingsProps$Builder instance using the provided configuration.
  The function takes the CfnDataCatalogEncryptionSettingsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `dataCatalogEncryptionSettings` | software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings$DataCatalogEncryptionSettingsProperty | [[cdk.support/lookup-entry]] | `:data-catalog-encryption-settings` |
"
  [^CfnDataCatalogEncryptionSettingsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :data-catalog-encryption-settings)]
    (. builder dataCatalogEncryptionSettings data))
  (.build builder))


(defn cfn-data-catalog-encryption-settings-props-builder
  "Creates a  `CfnDataCatalogEncryptionSettingsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-catalog-encryption-settings-props-builder> (new CfnDataCatalogEncryptionSettingsProps$Builder) id config))


(defn cfn-data-quality-ruleset-builder>
  "The cfn-data-quality-ruleset-builder> function updates a CfnDataQualityRuleset$Builder instance using the provided configuration.
  The function takes the CfnDataQualityRuleset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleset` | java.lang.String | [[cdk.support/lookup-entry]] | `:ruleset` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `targetTable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-table` |
"
  [^CfnDataQualityRuleset$Builder builder id config]
  (when-some [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :ruleset)]
    (. builder ruleset data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-table)]
    (. builder targetTable data))
  (.build builder))


(defn cfn-data-quality-ruleset-builder
  "Creates a  `CfnDataQualityRuleset$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-data-quality-ruleset-builder> (CfnDataQualityRuleset$Builder/create scope (name id)) id config))


(defn cfn-data-quality-ruleset-data-quality-target-table-property-builder>
  "The cfn-data-quality-ruleset-data-quality-target-table-property-builder> function updates a CfnDataQualityRuleset$DataQualityTargetTableProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityRuleset$DataQualityTargetTableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnDataQualityRuleset$DataQualityTargetTableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-data-quality-ruleset-data-quality-target-table-property-builder
  "Creates a  `CfnDataQualityRuleset$DataQualityTargetTableProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-quality-ruleset-data-quality-target-table-property-builder> (new CfnDataQualityRuleset$DataQualityTargetTableProperty$Builder) id config))


(defn cfn-data-quality-ruleset-props-builder>
  "The cfn-data-quality-ruleset-props-builder> function updates a CfnDataQualityRulesetProps$Builder instance using the provided configuration.
  The function takes the CfnDataQualityRulesetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleset` | java.lang.String | [[cdk.support/lookup-entry]] | `:ruleset` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `targetTable` | software.amazon.awscdk.services.glue.CfnDataQualityRuleset$DataQualityTargetTableProperty | [[cdk.support/lookup-entry]] | `:target-table` |
"
  [^CfnDataQualityRulesetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :ruleset)]
    (. builder ruleset data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-table)]
    (. builder targetTable data))
  (.build builder))


(defn cfn-data-quality-ruleset-props-builder
  "Creates a  `CfnDataQualityRulesetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-quality-ruleset-props-builder> (new CfnDataQualityRulesetProps$Builder) id config))


(defn cfn-database-builder>
  "The cfn-database-builder> function updates a CfnDatabase$Builder instance using the provided configuration.
  The function takes the CfnDatabase$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseInput` | software.amazon.awscdk.services.glue.CfnDatabase$DatabaseInputProperty | [[cdk.support/lookup-entry]] | `:database-input` |
"
  [^CfnDatabase$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-input)]
    (. builder databaseInput data))
  (.build builder))


(defn cfn-database-builder
  "Creates a  `CfnDatabase$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-database-builder> (CfnDatabase$Builder/create scope (name id)) id config))


(defn cfn-database-data-lake-principal-property-builder>
  "The cfn-database-data-lake-principal-property-builder> function updates a CfnDatabase$DataLakePrincipalProperty$Builder instance using the provided configuration.
  The function takes the CfnDatabase$DataLakePrincipalProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipalIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-principal-identifier` |
"
  [^CfnDatabase$DataLakePrincipalProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-lake-principal-identifier)]
    (. builder dataLakePrincipalIdentifier data))
  (.build builder))


(defn cfn-database-data-lake-principal-property-builder
  "Creates a  `CfnDatabase$DataLakePrincipalProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-database-data-lake-principal-property-builder> (new CfnDatabase$DataLakePrincipalProperty$Builder) id config))


(defn cfn-database-database-identifier-property-builder>
  "The cfn-database-database-identifier-property-builder> function updates a CfnDatabase$DatabaseIdentifierProperty$Builder instance using the provided configuration.
  The function takes the CfnDatabase$DatabaseIdentifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnDatabase$DatabaseIdentifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-database-database-identifier-property-builder
  "Creates a  `CfnDatabase$DatabaseIdentifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-database-database-identifier-property-builder> (new CfnDatabase$DatabaseIdentifierProperty$Builder) id config))


(defn cfn-database-database-input-property-builder>
  "The cfn-database-database-input-property-builder> function updates a CfnDatabase$DatabaseInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDatabase$DatabaseInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createTableDefaultPermissions` | java.util.List | [[cdk.support/lookup-entry]] | `:create-table-default-permissions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `federatedDatabase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:federated-database` |
| `locationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-uri` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `targetDatabase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-database` |
"
  [^CfnDatabase$DatabaseInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :create-table-default-permissions)]
    (. builder createTableDefaultPermissions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :federated-database)]
    (. builder federatedDatabase data))
  (when-some [data (lookup-entry config id :location-uri)]
    (. builder locationUri data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :target-database)]
    (. builder targetDatabase data))
  (.build builder))


(defn cfn-database-database-input-property-builder
  "Creates a  `CfnDatabase$DatabaseInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-database-database-input-property-builder> (new CfnDatabase$DatabaseInputProperty$Builder) id config))


(defn cfn-database-federated-database-property-builder>
  "The cfn-database-federated-database-property-builder> function updates a CfnDatabase$FederatedDatabaseProperty$Builder instance using the provided configuration.
  The function takes the CfnDatabase$FederatedDatabaseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
"
  [^CfnDatabase$FederatedDatabaseProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (.build builder))


(defn cfn-database-federated-database-property-builder
  "Creates a  `CfnDatabase$FederatedDatabaseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-database-federated-database-property-builder> (new CfnDatabase$FederatedDatabaseProperty$Builder) id config))


(defn cfn-database-principal-privileges-property-builder>
  "The cfn-database-principal-privileges-property-builder> function updates a CfnDatabase$PrincipalPrivilegesProperty$Builder instance using the provided configuration.
  The function takes the CfnDatabase$PrincipalPrivilegesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `principal` | software.amazon.awscdk.services.glue.CfnDatabase$DataLakePrincipalProperty | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnDatabase$PrincipalPrivilegesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn cfn-database-principal-privileges-property-builder
  "Creates a  `CfnDatabase$PrincipalPrivilegesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-database-principal-privileges-property-builder> (new CfnDatabase$PrincipalPrivilegesProperty$Builder) id config))


(defn cfn-database-props-builder>
  "The cfn-database-props-builder> function updates a CfnDatabaseProps$Builder instance using the provided configuration.
  The function takes the CfnDatabaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseInput` | software.amazon.awscdk.services.glue.CfnDatabase$DatabaseInputProperty | [[cdk.support/lookup-entry]] | `:database-input` |
"
  [^CfnDatabaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-input)]
    (. builder databaseInput data))
  (.build builder))


(defn cfn-database-props-builder
  "Creates a  `CfnDatabaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-database-props-builder> (new CfnDatabaseProps$Builder) id config))


(defn cfn-dev-endpoint-builder>
  "The cfn-dev-endpoint-builder> function updates a CfnDevEndpoint$Builder instance using the provided configuration.
  The function takes the CfnDevEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |
"
  [^CfnDevEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :arguments)]
    (. builder arguments data))
  (when-some [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-some [data (lookup-entry config id :extra-jars-s3-path)]
    (. builder extraJarsS3Path data))
  (when-some [data (lookup-entry config id :extra-python-libs-s3-path)]
    (. builder extraPythonLibsS3Path data))
  (when-some [data (lookup-entry config id :glue-version)]
    (. builder glueVersion data))
  (when-some [data (lookup-entry config id :number-of-nodes)]
    (. builder numberOfNodes data))
  (when-some [data (lookup-entry config id :number-of-workers)]
    (. builder numberOfWorkers data))
  (when-some [data (lookup-entry config id :public-key)]
    (. builder publicKey data))
  (when-some [data (lookup-entry config id :public-keys)]
    (. builder publicKeys data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :worker-type)]
    (. builder workerType data))
  (.build builder))


(defn cfn-dev-endpoint-builder
  "Creates a  `CfnDevEndpoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-dev-endpoint-builder> (CfnDevEndpoint$Builder/create scope (name id)) id config))


(defn cfn-dev-endpoint-props-builder>
  "The cfn-dev-endpoint-props-builder> function updates a CfnDevEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnDevEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |
"
  [^CfnDevEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :arguments)]
    (. builder arguments data))
  (when-some [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-some [data (lookup-entry config id :extra-jars-s3-path)]
    (. builder extraJarsS3Path data))
  (when-some [data (lookup-entry config id :extra-python-libs-s3-path)]
    (. builder extraPythonLibsS3Path data))
  (when-some [data (lookup-entry config id :glue-version)]
    (. builder glueVersion data))
  (when-some [data (lookup-entry config id :number-of-nodes)]
    (. builder numberOfNodes data))
  (when-some [data (lookup-entry config id :number-of-workers)]
    (. builder numberOfWorkers data))
  (when-some [data (lookup-entry config id :public-key)]
    (. builder publicKey data))
  (when-some [data (lookup-entry config id :public-keys)]
    (. builder publicKeys data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :worker-type)]
    (. builder workerType data))
  (.build builder))


(defn cfn-dev-endpoint-props-builder
  "Creates a  `CfnDevEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-dev-endpoint-props-builder> (new CfnDevEndpointProps$Builder) id config))


(defn cfn-job-builder>
  "The cfn-job-builder> function updates a CfnJob$Builder instance using the provided configuration.
  The function takes the CfnJob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |
"
  [^CfnJob$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-capacity)]
    (. builder allocatedCapacity data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :connections)]
    (. builder connections data))
  (when-some [data (lookup-entry config id :default-arguments)]
    (. builder defaultArguments data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :execution-class)]
    (. builder executionClass data))
  (when-some [data (lookup-entry config id :execution-property)]
    (. builder executionProperty data))
  (when-some [data (lookup-entry config id :glue-version)]
    (. builder glueVersion data))
  (when-some [data (lookup-entry config id :log-uri)]
    (. builder logUri data))
  (when-some [data (lookup-entry config id :maintenance-window)]
    (. builder maintenanceWindow data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :non-overridable-arguments)]
    (. builder nonOverridableArguments data))
  (when-some [data (lookup-entry config id :notification-property)]
    (. builder notificationProperty data))
  (when-some [data (lookup-entry config id :number-of-workers)]
    (. builder numberOfWorkers data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :worker-type)]
    (. builder workerType data))
  (.build builder))


(defn cfn-job-builder
  "Creates a  `CfnJob$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-job-builder> (CfnJob$Builder/create scope (name id)) id config))


(defn cfn-job-connections-list-property-builder>
  "The cfn-job-connections-list-property-builder> function updates a CfnJob$ConnectionsListProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$ConnectionsListProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connections` | java.util.List | [[cdk.support/lookup-entry]] | `:connections` |
"
  [^CfnJob$ConnectionsListProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connections)]
    (. builder connections data))
  (.build builder))


(defn cfn-job-connections-list-property-builder
  "Creates a  `CfnJob$ConnectionsListProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-connections-list-property-builder> (new CfnJob$ConnectionsListProperty$Builder) id config))


(defn cfn-job-execution-property-property-builder>
  "The cfn-job-execution-property-property-builder> function updates a CfnJob$ExecutionPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$ExecutionPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConcurrentRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-runs` |
"
  [^CfnJob$ExecutionPropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-concurrent-runs)]
    (. builder maxConcurrentRuns data))
  (.build builder))


(defn cfn-job-execution-property-property-builder
  "Creates a  `CfnJob$ExecutionPropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-execution-property-property-builder> (new CfnJob$ExecutionPropertyProperty$Builder) id config))


(defn cfn-job-job-command-property-builder>
  "The cfn-job-job-command-property-builder> function updates a CfnJob$JobCommandProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$JobCommandProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pythonVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:python-version` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `scriptLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:script-location` |
"
  [^CfnJob$JobCommandProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :python-version)]
    (. builder pythonVersion data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-some [data (lookup-entry config id :script-location)]
    (. builder scriptLocation data))
  (.build builder))


(defn cfn-job-job-command-property-builder
  "Creates a  `CfnJob$JobCommandProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-job-command-property-builder> (new CfnJob$JobCommandProperty$Builder) id config))


(defn cfn-job-notification-property-property-builder>
  "The cfn-job-notification-property-property-builder> function updates a CfnJob$NotificationPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$NotificationPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notifyDelayAfter` | java.lang.Number | [[cdk.support/lookup-entry]] | `:notify-delay-after` |
"
  [^CfnJob$NotificationPropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :notify-delay-after)]
    (. builder notifyDelayAfter data))
  (.build builder))


(defn cfn-job-notification-property-property-builder
  "Creates a  `CfnJob$NotificationPropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-notification-property-property-builder> (new CfnJob$NotificationPropertyProperty$Builder) id config))


(defn cfn-job-props-builder>
  "The cfn-job-props-builder> function updates a CfnJobProps$Builder instance using the provided configuration.
  The function takes the CfnJobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |
"
  [^CfnJobProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-capacity)]
    (. builder allocatedCapacity data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :connections)]
    (. builder connections data))
  (when-some [data (lookup-entry config id :default-arguments)]
    (. builder defaultArguments data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :execution-class)]
    (. builder executionClass data))
  (when-some [data (lookup-entry config id :execution-property)]
    (. builder executionProperty data))
  (when-some [data (lookup-entry config id :glue-version)]
    (. builder glueVersion data))
  (when-some [data (lookup-entry config id :log-uri)]
    (. builder logUri data))
  (when-some [data (lookup-entry config id :maintenance-window)]
    (. builder maintenanceWindow data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :non-overridable-arguments)]
    (. builder nonOverridableArguments data))
  (when-some [data (lookup-entry config id :notification-property)]
    (. builder notificationProperty data))
  (when-some [data (lookup-entry config id :number-of-workers)]
    (. builder numberOfWorkers data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :worker-type)]
    (. builder workerType data))
  (.build builder))


(defn cfn-job-props-builder
  "Creates a  `CfnJobProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-props-builder> (new CfnJobProps$Builder) id config))


(defn cfn-ml-transform-builder>
  "The cfn-ml-transform-builder> function updates a CfnMLTransform$Builder instance using the provided configuration.
  The function takes the CfnMLTransform$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |
"
  [^CfnMLTransform$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :glue-version)]
    (. builder glueVersion data))
  (when-some [data (lookup-entry config id :input-record-tables)]
    (. builder inputRecordTables data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :number-of-workers)]
    (. builder numberOfWorkers data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :transform-encryption)]
    (. builder transformEncryption data))
  (when-some [data (lookup-entry config id :transform-parameters)]
    (. builder transformParameters data))
  (when-some [data (lookup-entry config id :worker-type)]
    (. builder workerType data))
  (.build builder))


(defn cfn-ml-transform-builder
  "Creates a  `CfnMLTransform$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-ml-transform-builder> (CfnMLTransform$Builder/create scope (name id)) id config))


(defn cfn-ml-transform-find-matches-parameters-property-builder>
  "The cfn-ml-transform-find-matches-parameters-property-builder> function updates a CfnMLTransform$FindMatchesParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnMLTransform$FindMatchesParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accuracyCostTradeoff` | java.lang.Number | [[cdk.support/lookup-entry]] | `:accuracy-cost-tradeoff` |
| `enforceProvidedLabels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enforce-provided-labels` |
| `precisionRecallTradeoff` | java.lang.Number | [[cdk.support/lookup-entry]] | `:precision-recall-tradeoff` |
| `primaryKeyColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-key-column-name` |
"
  [^CfnMLTransform$FindMatchesParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :accuracy-cost-tradeoff)]
    (. builder accuracyCostTradeoff data))
  (when-some [data (lookup-entry config id :enforce-provided-labels)]
    (. builder enforceProvidedLabels data))
  (when-some [data (lookup-entry config id :precision-recall-tradeoff)]
    (. builder precisionRecallTradeoff data))
  (when-some [data (lookup-entry config id :primary-key-column-name)]
    (. builder primaryKeyColumnName data))
  (.build builder))


(defn cfn-ml-transform-find-matches-parameters-property-builder
  "Creates a  `CfnMLTransform$FindMatchesParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ml-transform-find-matches-parameters-property-builder> (new CfnMLTransform$FindMatchesParametersProperty$Builder) id config))


(defn cfn-ml-transform-glue-tables-property-builder>
  "The cfn-ml-transform-glue-tables-property-builder> function updates a CfnMLTransform$GlueTablesProperty$Builder instance using the provided configuration.
  The function takes the CfnMLTransform$GlueTablesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnMLTransform$GlueTablesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-ml-transform-glue-tables-property-builder
  "Creates a  `CfnMLTransform$GlueTablesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ml-transform-glue-tables-property-builder> (new CfnMLTransform$GlueTablesProperty$Builder) id config))


(defn cfn-ml-transform-input-record-tables-property-builder>
  "The cfn-ml-transform-input-record-tables-property-builder> function updates a CfnMLTransform$InputRecordTablesProperty$Builder instance using the provided configuration.
  The function takes the CfnMLTransform$InputRecordTablesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueTables` | java.util.List | [[cdk.support/lookup-entry]] | `:glue-tables` |
"
  [^CfnMLTransform$InputRecordTablesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :glue-tables)]
    (. builder glueTables data))
  (.build builder))


(defn cfn-ml-transform-input-record-tables-property-builder
  "Creates a  `CfnMLTransform$InputRecordTablesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ml-transform-input-record-tables-property-builder> (new CfnMLTransform$InputRecordTablesProperty$Builder) id config))


(defn cfn-ml-transform-ml-user-data-encryption-property-builder>
  "The cfn-ml-transform-ml-user-data-encryption-property-builder> function updates a CfnMLTransform$MLUserDataEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnMLTransform$MLUserDataEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `mlUserDataEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:ml-user-data-encryption-mode` |
"
  [^CfnMLTransform$MLUserDataEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :ml-user-data-encryption-mode)]
    (. builder mlUserDataEncryptionMode data))
  (.build builder))


(defn cfn-ml-transform-ml-user-data-encryption-property-builder
  "Creates a  `CfnMLTransform$MLUserDataEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ml-transform-ml-user-data-encryption-property-builder> (new CfnMLTransform$MLUserDataEncryptionProperty$Builder) id config))


(defn cfn-ml-transform-props-builder>
  "The cfn-ml-transform-props-builder> function updates a CfnMLTransformProps$Builder instance using the provided configuration.
  The function takes the CfnMLTransformProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-type` |
"
  [^CfnMLTransformProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :glue-version)]
    (. builder glueVersion data))
  (when-some [data (lookup-entry config id :input-record-tables)]
    (. builder inputRecordTables data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :number-of-workers)]
    (. builder numberOfWorkers data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :transform-encryption)]
    (. builder transformEncryption data))
  (when-some [data (lookup-entry config id :transform-parameters)]
    (. builder transformParameters data))
  (when-some [data (lookup-entry config id :worker-type)]
    (. builder workerType data))
  (.build builder))


(defn cfn-ml-transform-props-builder
  "Creates a  `CfnMLTransformProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ml-transform-props-builder> (new CfnMLTransformProps$Builder) id config))


(defn cfn-ml-transform-transform-encryption-property-builder>
  "The cfn-ml-transform-transform-encryption-property-builder> function updates a CfnMLTransform$TransformEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnMLTransform$TransformEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mlUserDataEncryption` | software.amazon.awscdk.services.glue.CfnMLTransform$MLUserDataEncryptionProperty | [[cdk.support/lookup-entry]] | `:ml-user-data-encryption` |
| `taskRunSecurityConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-run-security-configuration-name` |
"
  [^CfnMLTransform$TransformEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ml-user-data-encryption)]
    (. builder mlUserDataEncryption data))
  (when-some [data (lookup-entry config id :task-run-security-configuration-name)]
    (. builder taskRunSecurityConfigurationName data))
  (.build builder))


(defn cfn-ml-transform-transform-encryption-property-builder
  "Creates a  `CfnMLTransform$TransformEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ml-transform-transform-encryption-property-builder> (new CfnMLTransform$TransformEncryptionProperty$Builder) id config))


(defn cfn-ml-transform-transform-parameters-property-builder>
  "The cfn-ml-transform-transform-parameters-property-builder> function updates a CfnMLTransform$TransformParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnMLTransform$TransformParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `findMatchesParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:find-matches-parameters` |
| `transformType` | java.lang.String | [[cdk.support/lookup-entry]] | `:transform-type` |
"
  [^CfnMLTransform$TransformParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :find-matches-parameters)]
    (. builder findMatchesParameters data))
  (when-some [data (lookup-entry config id :transform-type)]
    (. builder transformType data))
  (.build builder))


(defn cfn-ml-transform-transform-parameters-property-builder
  "Creates a  `CfnMLTransform$TransformParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ml-transform-transform-parameters-property-builder> (new CfnMLTransform$TransformParametersProperty$Builder) id config))


(defn cfn-partition-builder>
  "The cfn-partition-builder> function updates a CfnPartition$Builder instance using the provided configuration.
  The function takes the CfnPartition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `partitionInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partition-input` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnPartition$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :partition-input)]
    (. builder partitionInput data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-partition-builder
  "Creates a  `CfnPartition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-partition-builder> (CfnPartition$Builder/create scope (name id)) id config))


(defn cfn-partition-column-property-builder>
  "The cfn-partition-column-property-builder> function updates a CfnPartition$ColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnPartition$ColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPartition$ColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-partition-column-property-builder
  "Creates a  `CfnPartition$ColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-column-property-builder> (new CfnPartition$ColumnProperty$Builder) id config))


(defn cfn-partition-order-property-builder>
  "The cfn-partition-order-property-builder> function updates a CfnPartition$OrderProperty$Builder instance using the provided configuration.
  The function takes the CfnPartition$OrderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `column` | java.lang.String | [[cdk.support/lookup-entry]] | `:column` |
| `sortOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sort-order` |
"
  [^CfnPartition$OrderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :column)]
    (. builder column data))
  (when-some [data (lookup-entry config id :sort-order)]
    (. builder sortOrder data))
  (.build builder))


(defn cfn-partition-order-property-builder
  "Creates a  `CfnPartition$OrderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-order-property-builder> (new CfnPartition$OrderProperty$Builder) id config))


(defn cfn-partition-partition-input-property-builder>
  "The cfn-partition-partition-input-property-builder> function updates a CfnPartition$PartitionInputProperty$Builder instance using the provided configuration.
  The function takes the CfnPartition$PartitionInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `storageDescriptor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-descriptor` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnPartition$PartitionInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :storage-descriptor)]
    (. builder storageDescriptor data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-partition-partition-input-property-builder
  "Creates a  `CfnPartition$PartitionInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-partition-input-property-builder> (new CfnPartition$PartitionInputProperty$Builder) id config))


(defn cfn-partition-props-builder>
  "The cfn-partition-props-builder> function updates a CfnPartitionProps$Builder instance using the provided configuration.
  The function takes the CfnPartitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `partitionInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partition-input` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnPartitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :partition-input)]
    (. builder partitionInput data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-partition-props-builder
  "Creates a  `CfnPartitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-props-builder> (new CfnPartitionProps$Builder) id config))


(defn cfn-partition-schema-id-property-builder>
  "The cfn-partition-schema-id-property-builder> function updates a CfnPartition$SchemaIdProperty$Builder instance using the provided configuration.
  The function takes the CfnPartition$SchemaIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
"
  [^CfnPartition$SchemaIdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :registry-name)]
    (. builder registryName data))
  (when-some [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (when-some [data (lookup-entry config id :schema-name)]
    (. builder schemaName data))
  (.build builder))


(defn cfn-partition-schema-id-property-builder
  "Creates a  `CfnPartition$SchemaIdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-schema-id-property-builder> (new CfnPartition$SchemaIdProperty$Builder) id config))


(defn cfn-partition-schema-reference-property-builder>
  "The cfn-partition-schema-reference-property-builder> function updates a CfnPartition$SchemaReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnPartition$SchemaReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schemaId` | software.amazon.awscdk.services.glue.CfnPartition$SchemaIdProperty | [[cdk.support/lookup-entry]] | `:schema-id` |
| `schemaVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version-id` |
| `schemaVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schema-version-number` |
"
  [^CfnPartition$SchemaReferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :schema-id)]
    (. builder schemaId data))
  (when-some [data (lookup-entry config id :schema-version-id)]
    (. builder schemaVersionId data))
  (when-some [data (lookup-entry config id :schema-version-number)]
    (. builder schemaVersionNumber data))
  (.build builder))


(defn cfn-partition-schema-reference-property-builder
  "Creates a  `CfnPartition$SchemaReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-schema-reference-property-builder> (new CfnPartition$SchemaReferenceProperty$Builder) id config))


(defn cfn-partition-serde-info-property-builder>
  "The cfn-partition-serde-info-property-builder> function updates a CfnPartition$SerdeInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnPartition$SerdeInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `serializationLibrary` | java.lang.String | [[cdk.support/lookup-entry]] | `:serialization-library` |
"
  [^CfnPartition$SerdeInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :serialization-library)]
    (. builder serializationLibrary data))
  (.build builder))


(defn cfn-partition-serde-info-property-builder
  "Creates a  `CfnPartition$SerdeInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-serde-info-property-builder> (new CfnPartition$SerdeInfoProperty$Builder) id config))


(defn cfn-partition-skewed-info-property-builder>
  "The cfn-partition-skewed-info-property-builder> function updates a CfnPartition$SkewedInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnPartition$SkewedInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skewedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:skewed-column-names` |
| `skewedColumnValueLocationMaps` | java.lang.Object | [[cdk.support/lookup-entry]] | `:skewed-column-value-location-maps` |
| `skewedColumnValues` | java.util.List | [[cdk.support/lookup-entry]] | `:skewed-column-values` |
"
  [^CfnPartition$SkewedInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :skewed-column-names)]
    (. builder skewedColumnNames data))
  (when-some [data (lookup-entry config id :skewed-column-value-location-maps)]
    (. builder skewedColumnValueLocationMaps data))
  (when-some [data (lookup-entry config id :skewed-column-values)]
    (. builder skewedColumnValues data))
  (.build builder))


(defn cfn-partition-skewed-info-property-builder
  "Creates a  `CfnPartition$SkewedInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-skewed-info-property-builder> (new CfnPartition$SkewedInfoProperty$Builder) id config))


(defn cfn-partition-storage-descriptor-property-builder>
  "The cfn-partition-storage-descriptor-property-builder> function updates a CfnPartition$StorageDescriptorProperty$Builder instance using the provided configuration.
  The function takes the CfnPartition$StorageDescriptorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `storedAsSubDirectories` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stored-as-sub-directories` |
"
  [^CfnPartition$StorageDescriptorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-columns)]
    (. builder bucketColumns data))
  (when-some [data (lookup-entry config id :columns)]
    (. builder columns data))
  (when-some [data (lookup-entry config id :compressed)]
    (. builder compressed data))
  (when-some [data (lookup-entry config id :input-format)]
    (. builder inputFormat data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :number-of-buckets)]
    (. builder numberOfBuckets data))
  (when-some [data (lookup-entry config id :output-format)]
    (. builder outputFormat data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :schema-reference)]
    (. builder schemaReference data))
  (when-some [data (lookup-entry config id :serde-info)]
    (. builder serdeInfo data))
  (when-some [data (lookup-entry config id :skewed-info)]
    (. builder skewedInfo data))
  (when-some [data (lookup-entry config id :sort-columns)]
    (. builder sortColumns data))
  (when-some [data (lookup-entry config id :stored-as-sub-directories)]
    (. builder storedAsSubDirectories data))
  (.build builder))


(defn cfn-partition-storage-descriptor-property-builder
  "Creates a  `CfnPartition$StorageDescriptorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-partition-storage-descriptor-property-builder> (new CfnPartition$StorageDescriptorProperty$Builder) id config))


(defn cfn-registry-builder>
  "The cfn-registry-builder> function updates a CfnRegistry$Builder instance using the provided configuration.
  The function takes the CfnRegistry$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRegistry$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-registry-builder
  "Creates a  `CfnRegistry$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-registry-builder> (CfnRegistry$Builder/create scope (name id)) id config))


(defn cfn-registry-props-builder>
  "The cfn-registry-props-builder> function updates a CfnRegistryProps$Builder instance using the provided configuration.
  The function takes the CfnRegistryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRegistryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-registry-props-builder
  "Creates a  `CfnRegistryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-registry-props-builder> (new CfnRegistryProps$Builder) id config))


(defn cfn-schema-builder>
  "The cfn-schema-builder> function updates a CfnSchema$Builder instance using the provided configuration.
  The function takes the CfnSchema$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:checkpoint-version` |
| `compatibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:compatibility` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `registry` | software.amazon.awscdk.services.glue.CfnSchema$RegistryProperty | [[cdk.support/lookup-entry]] | `:registry` |
| `schemaDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-definition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSchema$Builder builder id config]
  (when-some [data (lookup-entry config id :checkpoint-version)]
    (. builder checkpointVersion data))
  (when-some [data (lookup-entry config id :compatibility)]
    (. builder compatibility data))
  (when-some [data (lookup-entry config id :data-format)]
    (. builder dataFormat data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :registry)]
    (. builder registry data))
  (when-some [data (lookup-entry config id :schema-definition)]
    (. builder schemaDefinition data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-schema-builder
  "Creates a  `CfnSchema$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-schema-builder> (CfnSchema$Builder/create scope (name id)) id config))


(defn cfn-schema-props-builder>
  "The cfn-schema-props-builder> function updates a CfnSchemaProps$Builder instance using the provided configuration.
  The function takes the CfnSchemaProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkpointVersion` | software.amazon.awscdk.services.glue.CfnSchema$SchemaVersionProperty | [[cdk.support/lookup-entry]] | `:checkpoint-version` |
| `compatibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:compatibility` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `registry` | software.amazon.awscdk.services.glue.CfnSchema$RegistryProperty | [[cdk.support/lookup-entry]] | `:registry` |
| `schemaDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-definition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSchemaProps$Builder builder id config]
  (when-some [data (lookup-entry config id :checkpoint-version)]
    (. builder checkpointVersion data))
  (when-some [data (lookup-entry config id :compatibility)]
    (. builder compatibility data))
  (when-some [data (lookup-entry config id :data-format)]
    (. builder dataFormat data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :registry)]
    (. builder registry data))
  (when-some [data (lookup-entry config id :schema-definition)]
    (. builder schemaDefinition data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-schema-props-builder
  "Creates a  `CfnSchemaProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-schema-props-builder> (new CfnSchemaProps$Builder) id config))


(defn cfn-schema-registry-property-builder>
  "The cfn-schema-registry-property-builder> function updates a CfnSchema$RegistryProperty$Builder instance using the provided configuration.
  The function takes the CfnSchema$RegistryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnSchema$RegistryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-schema-registry-property-builder
  "Creates a  `CfnSchema$RegistryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-schema-registry-property-builder> (new CfnSchema$RegistryProperty$Builder) id config))


(defn cfn-schema-schema-version-property-builder>
  "The cfn-schema-schema-version-property-builder> function updates a CfnSchema$SchemaVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnSchema$SchemaVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isLatest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-latest` |
| `versionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version-number` |
"
  [^CfnSchema$SchemaVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :is-latest)]
    (. builder isLatest data))
  (when-some [data (lookup-entry config id :version-number)]
    (. builder versionNumber data))
  (.build builder))


(defn cfn-schema-schema-version-property-builder
  "Creates a  `CfnSchema$SchemaVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-schema-schema-version-property-builder> (new CfnSchema$SchemaVersionProperty$Builder) id config))


(defn cfn-schema-version-builder>
  "The cfn-schema-version-builder> function updates a CfnSchemaVersion$Builder instance using the provided configuration.
  The function takes the CfnSchemaVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema` |
| `schemaDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-definition` |
"
  [^CfnSchemaVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :schema-definition)]
    (. builder schemaDefinition data))
  (.build builder))


(defn cfn-schema-version-builder
  "Creates a  `CfnSchemaVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-schema-version-builder> (CfnSchemaVersion$Builder/create scope (name id)) id config))


(defn cfn-schema-version-metadata-builder>
  "The cfn-schema-version-metadata-builder> function updates a CfnSchemaVersionMetadata$Builder instance using the provided configuration.
  The function takes the CfnSchemaVersionMetadata$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `schemaVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version-id` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnSchemaVersionMetadata$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :schema-version-id)]
    (. builder schemaVersionId data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-schema-version-metadata-builder
  "Creates a  `CfnSchemaVersionMetadata$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-schema-version-metadata-builder> (CfnSchemaVersionMetadata$Builder/create scope (name id)) id config))


(defn cfn-schema-version-metadata-props-builder>
  "The cfn-schema-version-metadata-props-builder> function updates a CfnSchemaVersionMetadataProps$Builder instance using the provided configuration.
  The function takes the CfnSchemaVersionMetadataProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `schemaVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version-id` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnSchemaVersionMetadataProps$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :schema-version-id)]
    (. builder schemaVersionId data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-schema-version-metadata-props-builder
  "Creates a  `CfnSchemaVersionMetadataProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-schema-version-metadata-props-builder> (new CfnSchemaVersionMetadataProps$Builder) id config))


(defn cfn-schema-version-props-builder>
  "The cfn-schema-version-props-builder> function updates a CfnSchemaVersionProps$Builder instance using the provided configuration.
  The function takes the CfnSchemaVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schema` | software.amazon.awscdk.services.glue.CfnSchemaVersion$SchemaProperty | [[cdk.support/lookup-entry]] | `:schema` |
| `schemaDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-definition` |
"
  [^CfnSchemaVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :schema-definition)]
    (. builder schemaDefinition data))
  (.build builder))


(defn cfn-schema-version-props-builder
  "Creates a  `CfnSchemaVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-schema-version-props-builder> (new CfnSchemaVersionProps$Builder) id config))


(defn cfn-schema-version-schema-property-builder>
  "The cfn-schema-version-schema-property-builder> function updates a CfnSchemaVersion$SchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnSchemaVersion$SchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
"
  [^CfnSchemaVersion$SchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :registry-name)]
    (. builder registryName data))
  (when-some [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (when-some [data (lookup-entry config id :schema-name)]
    (. builder schemaName data))
  (.build builder))


(defn cfn-schema-version-schema-property-builder
  "Creates a  `CfnSchemaVersion$SchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-schema-version-schema-property-builder> (new CfnSchemaVersion$SchemaProperty$Builder) id config))


(defn cfn-security-configuration-builder>
  "The cfn-security-configuration-builder> function updates a CfnSecurityConfiguration$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnSecurityConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-security-configuration-builder
  "Creates a  `CfnSecurityConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-security-configuration-builder> (CfnSecurityConfiguration$Builder/create scope (name id)) id config))


(defn cfn-security-configuration-cloud-watch-encryption-property-builder>
  "The cfn-security-configuration-cloud-watch-encryption-property-builder> function updates a CfnSecurityConfiguration$CloudWatchEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfiguration$CloudWatchEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-encryption-mode` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
"
  [^CfnSecurityConfiguration$CloudWatchEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-encryption-mode)]
    (. builder cloudWatchEncryptionMode data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (.build builder))


(defn cfn-security-configuration-cloud-watch-encryption-property-builder
  "Creates a  `CfnSecurityConfiguration$CloudWatchEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-configuration-cloud-watch-encryption-property-builder> (new CfnSecurityConfiguration$CloudWatchEncryptionProperty$Builder) id config))


(defn cfn-security-configuration-encryption-configuration-property-builder>
  "The cfn-security-configuration-encryption-configuration-property-builder> function updates a CfnSecurityConfiguration$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfiguration$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchEncryption` | software.amazon.awscdk.services.glue.CfnSecurityConfiguration$CloudWatchEncryptionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-encryption` |
| `jobBookmarksEncryption` | software.amazon.awscdk.services.glue.CfnSecurityConfiguration$JobBookmarksEncryptionProperty | [[cdk.support/lookup-entry]] | `:job-bookmarks-encryption` |
| `s3Encryptions` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-encryptions` |
"
  [^CfnSecurityConfiguration$EncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-encryption)]
    (. builder cloudWatchEncryption data))
  (when-some [data (lookup-entry config id :job-bookmarks-encryption)]
    (. builder jobBookmarksEncryption data))
  (when-some [data (lookup-entry config id :s3-encryptions)]
    (. builder s3Encryptions data))
  (.build builder))


(defn cfn-security-configuration-encryption-configuration-property-builder
  "Creates a  `CfnSecurityConfiguration$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-configuration-encryption-configuration-property-builder> (new CfnSecurityConfiguration$EncryptionConfigurationProperty$Builder) id config))


(defn cfn-security-configuration-job-bookmarks-encryption-property-builder>
  "The cfn-security-configuration-job-bookmarks-encryption-property-builder> function updates a CfnSecurityConfiguration$JobBookmarksEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfiguration$JobBookmarksEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobBookmarksEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-bookmarks-encryption-mode` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
"
  [^CfnSecurityConfiguration$JobBookmarksEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :job-bookmarks-encryption-mode)]
    (. builder jobBookmarksEncryptionMode data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (.build builder))


(defn cfn-security-configuration-job-bookmarks-encryption-property-builder
  "Creates a  `CfnSecurityConfiguration$JobBookmarksEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-configuration-job-bookmarks-encryption-property-builder> (new CfnSecurityConfiguration$JobBookmarksEncryptionProperty$Builder) id config))


(defn cfn-security-configuration-props-builder>
  "The cfn-security-configuration-props-builder> function updates a CfnSecurityConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnSecurityConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-security-configuration-props-builder
  "Creates a  `CfnSecurityConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-configuration-props-builder> (new CfnSecurityConfigurationProps$Builder) id config))


(defn cfn-security-configuration-s3-encryption-property-builder>
  "The cfn-security-configuration-s3-encryption-property-builder> function updates a CfnSecurityConfiguration$S3EncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfiguration$S3EncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `s3EncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-encryption-mode` |
"
  [^CfnSecurityConfiguration$S3EncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :s3-encryption-mode)]
    (. builder s3EncryptionMode data))
  (.build builder))


(defn cfn-security-configuration-s3-encryption-property-builder
  "Creates a  `CfnSecurityConfiguration$S3EncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-configuration-s3-encryption-property-builder> (new CfnSecurityConfiguration$S3EncryptionProperty$Builder) id config))


(defn cfn-table-builder>
  "The cfn-table-builder> function updates a CfnTable$Builder instance using the provided configuration.
  The function takes the CfnTable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `openTableFormatInput` | software.amazon.awscdk.services.glue.CfnTable$OpenTableFormatInputProperty | [[cdk.support/lookup-entry]] | `:open-table-format-input` |
| `tableInput` | software.amazon.awscdk.services.glue.CfnTable$TableInputProperty | [[cdk.support/lookup-entry]] | `:table-input` |
"
  [^CfnTable$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :open-table-format-input)]
    (. builder openTableFormatInput data))
  (when-some [data (lookup-entry config id :table-input)]
    (. builder tableInput data))
  (.build builder))


(defn cfn-table-builder
  "Creates a  `CfnTable$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-table-builder> (CfnTable$Builder/create scope (name id)) id config))


(defn cfn-table-column-property-builder>
  "The cfn-table-column-property-builder> function updates a CfnTable$ColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$ColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTable$ColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-table-column-property-builder
  "Creates a  `CfnTable$ColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-column-property-builder> (new CfnTable$ColumnProperty$Builder) id config))


(defn cfn-table-iceberg-input-property-builder>
  "The cfn-table-iceberg-input-property-builder> function updates a CfnTable$IcebergInputProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$IcebergInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataOperation` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-operation` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnTable$IcebergInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metadata-operation)]
    (. builder metadataOperation data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-table-iceberg-input-property-builder
  "Creates a  `CfnTable$IcebergInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-iceberg-input-property-builder> (new CfnTable$IcebergInputProperty$Builder) id config))


(defn cfn-table-open-table-format-input-property-builder>
  "The cfn-table-open-table-format-input-property-builder> function updates a CfnTable$OpenTableFormatInputProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$OpenTableFormatInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `icebergInput` | software.amazon.awscdk.services.glue.CfnTable$IcebergInputProperty | [[cdk.support/lookup-entry]] | `:iceberg-input` |
"
  [^CfnTable$OpenTableFormatInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iceberg-input)]
    (. builder icebergInput data))
  (.build builder))


(defn cfn-table-open-table-format-input-property-builder
  "Creates a  `CfnTable$OpenTableFormatInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-open-table-format-input-property-builder> (new CfnTable$OpenTableFormatInputProperty$Builder) id config))


(defn cfn-table-optimizer-builder>
  "The cfn-table-optimizer-builder> function updates a CfnTableOptimizer$Builder instance using the provided configuration.
  The function takes the CfnTableOptimizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tableOptimizerConfiguration` | software.amazon.awscdk.services.glue.CfnTableOptimizer$TableOptimizerConfigurationProperty | [[cdk.support/lookup-entry]] | `:table-optimizer-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTableOptimizer$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :table-optimizer-configuration)]
    (. builder tableOptimizerConfiguration data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-table-optimizer-builder
  "Creates a  `CfnTableOptimizer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-table-optimizer-builder> (CfnTableOptimizer$Builder/create scope (name id)) id config))


(defn cfn-table-optimizer-props-builder>
  "The cfn-table-optimizer-props-builder> function updates a CfnTableOptimizerProps$Builder instance using the provided configuration.
  The function takes the CfnTableOptimizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tableOptimizerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table-optimizer-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTableOptimizerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :table-optimizer-configuration)]
    (. builder tableOptimizerConfiguration data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-table-optimizer-props-builder
  "Creates a  `CfnTableOptimizerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-optimizer-props-builder> (new CfnTableOptimizerProps$Builder) id config))


(defn cfn-table-optimizer-table-optimizer-configuration-property-builder>
  "The cfn-table-optimizer-table-optimizer-configuration-property-builder> function updates a CfnTableOptimizer$TableOptimizerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTableOptimizer$TableOptimizerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTableOptimizer$TableOptimizerConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-table-optimizer-table-optimizer-configuration-property-builder
  "Creates a  `CfnTableOptimizer$TableOptimizerConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-optimizer-table-optimizer-configuration-property-builder> (new CfnTableOptimizer$TableOptimizerConfigurationProperty$Builder) id config))


(defn cfn-table-order-property-builder>
  "The cfn-table-order-property-builder> function updates a CfnTable$OrderProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$OrderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `column` | java.lang.String | [[cdk.support/lookup-entry]] | `:column` |
| `sortOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sort-order` |
"
  [^CfnTable$OrderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :column)]
    (. builder column data))
  (when-some [data (lookup-entry config id :sort-order)]
    (. builder sortOrder data))
  (.build builder))


(defn cfn-table-order-property-builder
  "Creates a  `CfnTable$OrderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-order-property-builder> (new CfnTable$OrderProperty$Builder) id config))


(defn cfn-table-props-builder>
  "The cfn-table-props-builder> function updates a CfnTableProps$Builder instance using the provided configuration.
  The function takes the CfnTableProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `openTableFormatInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:open-table-format-input` |
| `tableInput` | software.amazon.awscdk.services.glue.CfnTable$TableInputProperty | [[cdk.support/lookup-entry]] | `:table-input` |
"
  [^CfnTableProps$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :open-table-format-input)]
    (. builder openTableFormatInput data))
  (when-some [data (lookup-entry config id :table-input)]
    (. builder tableInput data))
  (.build builder))


(defn cfn-table-props-builder
  "Creates a  `CfnTableProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-props-builder> (new CfnTableProps$Builder) id config))


(defn cfn-table-schema-id-property-builder>
  "The cfn-table-schema-id-property-builder> function updates a CfnTable$SchemaIdProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$SchemaIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
"
  [^CfnTable$SchemaIdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :registry-name)]
    (. builder registryName data))
  (when-some [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (when-some [data (lookup-entry config id :schema-name)]
    (. builder schemaName data))
  (.build builder))


(defn cfn-table-schema-id-property-builder
  "Creates a  `CfnTable$SchemaIdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-schema-id-property-builder> (new CfnTable$SchemaIdProperty$Builder) id config))


(defn cfn-table-schema-reference-property-builder>
  "The cfn-table-schema-reference-property-builder> function updates a CfnTable$SchemaReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$SchemaReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schemaId` | software.amazon.awscdk.services.glue.CfnTable$SchemaIdProperty | [[cdk.support/lookup-entry]] | `:schema-id` |
| `schemaVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version-id` |
| `schemaVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schema-version-number` |
"
  [^CfnTable$SchemaReferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :schema-id)]
    (. builder schemaId data))
  (when-some [data (lookup-entry config id :schema-version-id)]
    (. builder schemaVersionId data))
  (when-some [data (lookup-entry config id :schema-version-number)]
    (. builder schemaVersionNumber data))
  (.build builder))


(defn cfn-table-schema-reference-property-builder
  "Creates a  `CfnTable$SchemaReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-schema-reference-property-builder> (new CfnTable$SchemaReferenceProperty$Builder) id config))


(defn cfn-table-serde-info-property-builder>
  "The cfn-table-serde-info-property-builder> function updates a CfnTable$SerdeInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$SerdeInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `serializationLibrary` | java.lang.String | [[cdk.support/lookup-entry]] | `:serialization-library` |
"
  [^CfnTable$SerdeInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :serialization-library)]
    (. builder serializationLibrary data))
  (.build builder))


(defn cfn-table-serde-info-property-builder
  "Creates a  `CfnTable$SerdeInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-serde-info-property-builder> (new CfnTable$SerdeInfoProperty$Builder) id config))


(defn cfn-table-skewed-info-property-builder>
  "The cfn-table-skewed-info-property-builder> function updates a CfnTable$SkewedInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$SkewedInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skewedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:skewed-column-names` |
| `skewedColumnValueLocationMaps` | java.lang.Object | [[cdk.support/lookup-entry]] | `:skewed-column-value-location-maps` |
| `skewedColumnValues` | java.util.List | [[cdk.support/lookup-entry]] | `:skewed-column-values` |
"
  [^CfnTable$SkewedInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :skewed-column-names)]
    (. builder skewedColumnNames data))
  (when-some [data (lookup-entry config id :skewed-column-value-location-maps)]
    (. builder skewedColumnValueLocationMaps data))
  (when-some [data (lookup-entry config id :skewed-column-values)]
    (. builder skewedColumnValues data))
  (.build builder))


(defn cfn-table-skewed-info-property-builder
  "Creates a  `CfnTable$SkewedInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-skewed-info-property-builder> (new CfnTable$SkewedInfoProperty$Builder) id config))


(defn cfn-table-storage-descriptor-property-builder>
  "The cfn-table-storage-descriptor-property-builder> function updates a CfnTable$StorageDescriptorProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$StorageDescriptorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `storedAsSubDirectories` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stored-as-sub-directories` |
"
  [^CfnTable$StorageDescriptorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-columns)]
    (. builder bucketColumns data))
  (when-some [data (lookup-entry config id :columns)]
    (. builder columns data))
  (when-some [data (lookup-entry config id :compressed)]
    (. builder compressed data))
  (when-some [data (lookup-entry config id :input-format)]
    (. builder inputFormat data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :number-of-buckets)]
    (. builder numberOfBuckets data))
  (when-some [data (lookup-entry config id :output-format)]
    (. builder outputFormat data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :schema-reference)]
    (. builder schemaReference data))
  (when-some [data (lookup-entry config id :serde-info)]
    (. builder serdeInfo data))
  (when-some [data (lookup-entry config id :skewed-info)]
    (. builder skewedInfo data))
  (when-some [data (lookup-entry config id :sort-columns)]
    (. builder sortColumns data))
  (when-some [data (lookup-entry config id :stored-as-sub-directories)]
    (. builder storedAsSubDirectories data))
  (.build builder))


(defn cfn-table-storage-descriptor-property-builder
  "Creates a  `CfnTable$StorageDescriptorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-storage-descriptor-property-builder> (new CfnTable$StorageDescriptorProperty$Builder) id config))


(defn cfn-table-table-identifier-property-builder>
  "The cfn-table-table-identifier-property-builder> function updates a CfnTable$TableIdentifierProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$TableIdentifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnTable$TableIdentifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-table-table-identifier-property-builder
  "Creates a  `CfnTable$TableIdentifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-table-identifier-property-builder> (new CfnTable$TableIdentifierProperty$Builder) id config))


(defn cfn-table-table-input-property-builder>
  "The cfn-table-table-input-property-builder> function updates a CfnTable$TableInputProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$TableInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `viewOriginalText` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-original-text` |
"
  [^CfnTable$TableInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :partition-keys)]
    (. builder partitionKeys data))
  (when-some [data (lookup-entry config id :retention)]
    (. builder retention data))
  (when-some [data (lookup-entry config id :storage-descriptor)]
    (. builder storageDescriptor data))
  (when-some [data (lookup-entry config id :table-type)]
    (. builder tableType data))
  (when-some [data (lookup-entry config id :target-table)]
    (. builder targetTable data))
  (when-some [data (lookup-entry config id :view-expanded-text)]
    (. builder viewExpandedText data))
  (when-some [data (lookup-entry config id :view-original-text)]
    (. builder viewOriginalText data))
  (.build builder))


(defn cfn-table-table-input-property-builder
  "Creates a  `CfnTable$TableInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-table-input-property-builder> (new CfnTable$TableInputProperty$Builder) id config))


(defn cfn-trigger-action-property-builder>
  "The cfn-trigger-action-property-builder> function updates a CfnTrigger$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTrigger$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:arguments` |
| `crawlerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawler-name` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `notificationProperty` | software.amazon.awscdk.services.glue.CfnTrigger$NotificationPropertyProperty | [[cdk.support/lookup-entry]] | `:notification-property` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnTrigger$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arguments)]
    (. builder arguments data))
  (when-some [data (lookup-entry config id :crawler-name)]
    (. builder crawlerName data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :notification-property)]
    (. builder notificationProperty data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-trigger-action-property-builder
  "Creates a  `CfnTrigger$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-trigger-action-property-builder> (new CfnTrigger$ActionProperty$Builder) id config))


(defn cfn-trigger-builder>
  "The cfn-trigger-builder> function updates a CfnTrigger$Builder instance using the provided configuration.
  The function takes the CfnTrigger$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |
"
  [^CfnTrigger$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-batching-condition)]
    (. builder eventBatchingCondition data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :predicate)]
    (. builder predicate data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :start-on-creation)]
    (. builder startOnCreation data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :workflow-name)]
    (. builder workflowName data))
  (.build builder))


(defn cfn-trigger-builder
  "Creates a  `CfnTrigger$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-trigger-builder> (CfnTrigger$Builder/create scope (name id)) id config))


(defn cfn-trigger-condition-property-builder>
  "The cfn-trigger-condition-property-builder> function updates a CfnTrigger$ConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnTrigger$ConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crawlState` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawl-state` |
| `crawlerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawler-name` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `logicalOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-operator` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnTrigger$ConditionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :crawl-state)]
    (. builder crawlState data))
  (when-some [data (lookup-entry config id :crawler-name)]
    (. builder crawlerName data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :logical-operator)]
    (. builder logicalOperator data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn cfn-trigger-condition-property-builder
  "Creates a  `CfnTrigger$ConditionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-trigger-condition-property-builder> (new CfnTrigger$ConditionProperty$Builder) id config))


(defn cfn-trigger-event-batching-condition-property-builder>
  "The cfn-trigger-event-batching-condition-property-builder> function updates a CfnTrigger$EventBatchingConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnTrigger$EventBatchingConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `batchWindow` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-window` |
"
  [^CfnTrigger$EventBatchingConditionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :batch-window)]
    (. builder batchWindow data))
  (.build builder))


(defn cfn-trigger-event-batching-condition-property-builder
  "Creates a  `CfnTrigger$EventBatchingConditionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-trigger-event-batching-condition-property-builder> (new CfnTrigger$EventBatchingConditionProperty$Builder) id config))


(defn cfn-trigger-notification-property-property-builder>
  "The cfn-trigger-notification-property-property-builder> function updates a CfnTrigger$NotificationPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnTrigger$NotificationPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notifyDelayAfter` | java.lang.Number | [[cdk.support/lookup-entry]] | `:notify-delay-after` |
"
  [^CfnTrigger$NotificationPropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :notify-delay-after)]
    (. builder notifyDelayAfter data))
  (.build builder))


(defn cfn-trigger-notification-property-property-builder
  "Creates a  `CfnTrigger$NotificationPropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-trigger-notification-property-property-builder> (new CfnTrigger$NotificationPropertyProperty$Builder) id config))


(defn cfn-trigger-predicate-property-builder>
  "The cfn-trigger-predicate-property-builder> function updates a CfnTrigger$PredicateProperty$Builder instance using the provided configuration.
  The function takes the CfnTrigger$PredicateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `logical` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical` |
"
  [^CfnTrigger$PredicateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :logical)]
    (. builder logical data))
  (.build builder))


(defn cfn-trigger-predicate-property-builder
  "Creates a  `CfnTrigger$PredicateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-trigger-predicate-property-builder> (new CfnTrigger$PredicateProperty$Builder) id config))


(defn cfn-trigger-props-builder>
  "The cfn-trigger-props-builder> function updates a CfnTriggerProps$Builder instance using the provided configuration.
  The function takes the CfnTriggerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |
"
  [^CfnTriggerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-batching-condition)]
    (. builder eventBatchingCondition data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :predicate)]
    (. builder predicate data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :start-on-creation)]
    (. builder startOnCreation data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :workflow-name)]
    (. builder workflowName data))
  (.build builder))


(defn cfn-trigger-props-builder
  "Creates a  `CfnTriggerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-trigger-props-builder> (new CfnTriggerProps$Builder) id config))


(defn cfn-workflow-builder>
  "The cfn-workflow-builder> function updates a CfnWorkflow$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultRunProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-run-properties` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxConcurrentRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-runs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkflow$Builder builder id config]
  (when-some [data (lookup-entry config id :default-run-properties)]
    (. builder defaultRunProperties data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :max-concurrent-runs)]
    (. builder maxConcurrentRuns data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workflow-builder
  "Creates a  `CfnWorkflow$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-workflow-builder> (CfnWorkflow$Builder/create scope (name id)) id config))


(defn cfn-workflow-props-builder>
  "The cfn-workflow-props-builder> function updates a CfnWorkflowProps$Builder instance using the provided configuration.
  The function takes the CfnWorkflowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultRunProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-run-properties` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxConcurrentRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-runs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkflowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :default-run-properties)]
    (. builder defaultRunProperties data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :max-concurrent-runs)]
    (. builder maxConcurrentRuns data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workflow-props-builder
  "Creates a  `CfnWorkflowProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-workflow-props-builder> (new CfnWorkflowProps$Builder) id config))