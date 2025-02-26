(ns cdk.api.services.timestream
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.timestream package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.timestream CfnDatabase$Builder
                                                       CfnDatabaseProps$Builder
                                                       CfnInfluxDBInstance$Builder
                                                       CfnInfluxDBInstance$LogDeliveryConfigurationProperty$Builder
                                                       CfnInfluxDBInstance$S3ConfigurationProperty$Builder
                                                       CfnInfluxDBInstanceProps$Builder
                                                       CfnScheduledQuery$Builder
                                                       CfnScheduledQuery$DimensionMappingProperty$Builder
                                                       CfnScheduledQuery$ErrorReportConfigurationProperty$Builder
                                                       CfnScheduledQuery$MixedMeasureMappingProperty$Builder
                                                       CfnScheduledQuery$MultiMeasureAttributeMappingProperty$Builder
                                                       CfnScheduledQuery$MultiMeasureMappingsProperty$Builder
                                                       CfnScheduledQuery$NotificationConfigurationProperty$Builder
                                                       CfnScheduledQuery$S3ConfigurationProperty$Builder
                                                       CfnScheduledQuery$ScheduleConfigurationProperty$Builder
                                                       CfnScheduledQuery$SnsConfigurationProperty$Builder
                                                       CfnScheduledQuery$TargetConfigurationProperty$Builder
                                                       CfnScheduledQuery$TimestreamConfigurationProperty$Builder
                                                       CfnScheduledQueryProps$Builder
                                                       CfnTable$Builder
                                                       CfnTable$MagneticStoreRejectedDataLocationProperty$Builder
                                                       CfnTable$MagneticStoreWritePropertiesProperty$Builder
                                                       CfnTable$PartitionKeyProperty$Builder
                                                       CfnTable$RetentionPropertiesProperty$Builder
                                                       CfnTable$S3ConfigurationProperty$Builder
                                                       CfnTable$SchemaProperty$Builder
                                                       CfnTableProps$Builder]))


(defn build-cfn-database-builder
  "The build-cfn-database-builder function updates a CfnDatabase$Builder instance using the provided configuration.
  The function takes the CfnDatabase$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatabase$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-database-builder
  "Creates a  `CfnDatabase$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-database-builder (CfnDatabase$Builder/create scope (name id)) id config))


(defn build-cfn-database-props-builder
  "The build-cfn-database-props-builder function updates a CfnDatabaseProps$Builder instance using the provided configuration.
  The function takes the CfnDatabaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatabaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-database-props-builder
  "Creates a  `CfnDatabaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-database-props-builder (new CfnDatabaseProps$Builder) id config))


(defn build-cfn-influx-db-instance-builder
  "The build-cfn-influx-db-instance-builder function updates a CfnInfluxDBInstance$Builder instance using the provided configuration.
  The function takes the CfnInfluxDBInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `dbInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-type` |
| `dbParameterGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-identifier` |
| `dbStorageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-storage-type` |
| `deploymentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-type` |
| `logDeliveryConfiguration` | software.amazon.awscdk.services.timestream.CfnInfluxDBInstance$LogDeliveryConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-delivery-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `organization` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |
"
  [^CfnInfluxDBInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :db-instance-type)]
    (. builder dbInstanceType data))
  (when-some [data (lookup-entry config id :db-parameter-group-identifier)]
    (. builder dbParameterGroupIdentifier data))
  (when-some [data (lookup-entry config id :db-storage-type)]
    (. builder dbStorageType data))
  (when-some [data (lookup-entry config id :deployment-type)]
    (. builder deploymentType data))
  (when-some [data (lookup-entry config id :log-delivery-configuration)]
    (. builder logDeliveryConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :organization)]
    (. builder organization data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (when-some [data (lookup-entry config id :vpc-subnet-ids)]
    (. builder vpcSubnetIds data))
  (.build builder))


(defn cfn-influx-db-instance-builder
  "Creates a  `CfnInfluxDBInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-influx-db-instance-builder (CfnInfluxDBInstance$Builder/create scope (name id)) id config))


(defn build-cfn-influx-db-instance-log-delivery-configuration-property-builder
  "The build-cfn-influx-db-instance-log-delivery-configuration-property-builder function updates a CfnInfluxDBInstance$LogDeliveryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInfluxDBInstance$LogDeliveryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-configuration` |
"
  [^CfnInfluxDBInstance$LogDeliveryConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (.build builder))


(defn cfn-influx-db-instance-log-delivery-configuration-property-builder
  "Creates a  `CfnInfluxDBInstance$LogDeliveryConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-influx-db-instance-log-delivery-configuration-property-builder (new CfnInfluxDBInstance$LogDeliveryConfigurationProperty$Builder) id config))


(defn build-cfn-influx-db-instance-props-builder
  "The build-cfn-influx-db-instance-props-builder function updates a CfnInfluxDBInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnInfluxDBInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `dbInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-type` |
| `dbParameterGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-identifier` |
| `dbStorageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-storage-type` |
| `deploymentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-type` |
| `logDeliveryConfiguration` | software.amazon.awscdk.services.timestream.CfnInfluxDBInstance$LogDeliveryConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-delivery-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `organization` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |
"
  [^CfnInfluxDBInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :db-instance-type)]
    (. builder dbInstanceType data))
  (when-some [data (lookup-entry config id :db-parameter-group-identifier)]
    (. builder dbParameterGroupIdentifier data))
  (when-some [data (lookup-entry config id :db-storage-type)]
    (. builder dbStorageType data))
  (when-some [data (lookup-entry config id :deployment-type)]
    (. builder deploymentType data))
  (when-some [data (lookup-entry config id :log-delivery-configuration)]
    (. builder logDeliveryConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :organization)]
    (. builder organization data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (when-some [data (lookup-entry config id :vpc-subnet-ids)]
    (. builder vpcSubnetIds data))
  (.build builder))


(defn cfn-influx-db-instance-props-builder
  "Creates a  `CfnInfluxDBInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-influx-db-instance-props-builder (new CfnInfluxDBInstanceProps$Builder) id config))


(defn build-cfn-influx-db-instance-s3-configuration-property-builder
  "The build-cfn-influx-db-instance-s3-configuration-property-builder function updates a CfnInfluxDBInstance$S3ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInfluxDBInstance$S3ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnInfluxDBInstance$S3ConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-influx-db-instance-s3-configuration-property-builder
  "Creates a  `CfnInfluxDBInstance$S3ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-influx-db-instance-s3-configuration-property-builder (new CfnInfluxDBInstance$S3ConfigurationProperty$Builder) id config))


(defn build-cfn-scheduled-query-builder
  "The build-cfn-scheduled-query-builder function updates a CfnScheduledQuery$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `errorReportConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$ErrorReportConfigurationProperty | [[cdk.support/lookup-entry]] | `:error-report-configuration` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `notificationConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `scheduleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule-configuration` |
| `scheduledQueryExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-query-execution-role-arn` |
| `scheduledQueryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-query-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-configuration` |
"
  [^CfnScheduledQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-some [data (lookup-entry config id :error-report-configuration)]
    (. builder errorReportConfiguration data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :notification-configuration)]
    (. builder notificationConfiguration data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :schedule-configuration)]
    (. builder scheduleConfiguration data))
  (when-some [data (lookup-entry config id :scheduled-query-execution-role-arn)]
    (. builder scheduledQueryExecutionRoleArn data))
  (when-some [data (lookup-entry config id :scheduled-query-name)]
    (. builder scheduledQueryName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-configuration)]
    (. builder targetConfiguration data))
  (.build builder))


(defn cfn-scheduled-query-builder
  "Creates a  `CfnScheduledQuery$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-scheduled-query-builder (CfnScheduledQuery$Builder/create scope (name id)) id config))


(defn build-cfn-scheduled-query-dimension-mapping-property-builder
  "The build-cfn-scheduled-query-dimension-mapping-property-builder function updates a CfnScheduledQuery$DimensionMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$DimensionMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionValueType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-value-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnScheduledQuery$DimensionMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dimension-value-type)]
    (. builder dimensionValueType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-scheduled-query-dimension-mapping-property-builder
  "Creates a  `CfnScheduledQuery$DimensionMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-dimension-mapping-property-builder (new CfnScheduledQuery$DimensionMappingProperty$Builder) id config))


(defn build-cfn-scheduled-query-error-report-configuration-property-builder
  "The build-cfn-scheduled-query-error-report-configuration-property-builder function updates a CfnScheduledQuery$ErrorReportConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$ErrorReportConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Configuration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$S3ConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
"
  [^CfnScheduledQuery$ErrorReportConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (.build builder))


(defn cfn-scheduled-query-error-report-configuration-property-builder
  "Creates a  `CfnScheduledQuery$ErrorReportConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-error-report-configuration-property-builder (new CfnScheduledQuery$ErrorReportConfigurationProperty$Builder) id config))


(defn build-cfn-scheduled-query-mixed-measure-mapping-property-builder
  "The build-cfn-scheduled-query-mixed-measure-mapping-property-builder function updates a CfnScheduledQuery$MixedMeasureMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$MixedMeasureMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `measureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:measure-name` |
| `measureValueType` | java.lang.String | [[cdk.support/lookup-entry]] | `:measure-value-type` |
| `multiMeasureAttributeMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:multi-measure-attribute-mappings` |
| `sourceColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-column` |
| `targetMeasureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-measure-name` |
"
  [^CfnScheduledQuery$MixedMeasureMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :measure-name)]
    (. builder measureName data))
  (when-some [data (lookup-entry config id :measure-value-type)]
    (. builder measureValueType data))
  (when-some [data (lookup-entry config id :multi-measure-attribute-mappings)]
    (. builder multiMeasureAttributeMappings data))
  (when-some [data (lookup-entry config id :source-column)]
    (. builder sourceColumn data))
  (when-some [data (lookup-entry config id :target-measure-name)]
    (. builder targetMeasureName data))
  (.build builder))


(defn cfn-scheduled-query-mixed-measure-mapping-property-builder
  "Creates a  `CfnScheduledQuery$MixedMeasureMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-mixed-measure-mapping-property-builder (new CfnScheduledQuery$MixedMeasureMappingProperty$Builder) id config))


(defn build-cfn-scheduled-query-multi-measure-attribute-mapping-property-builder
  "The build-cfn-scheduled-query-multi-measure-attribute-mapping-property-builder function updates a CfnScheduledQuery$MultiMeasureAttributeMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$MultiMeasureAttributeMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `measureValueType` | java.lang.String | [[cdk.support/lookup-entry]] | `:measure-value-type` |
| `sourceColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-column` |
| `targetMultiMeasureAttributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-multi-measure-attribute-name` |
"
  [^CfnScheduledQuery$MultiMeasureAttributeMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :measure-value-type)]
    (. builder measureValueType data))
  (when-some [data (lookup-entry config id :source-column)]
    (. builder sourceColumn data))
  (when-some [data (lookup-entry config id :target-multi-measure-attribute-name)]
    (. builder targetMultiMeasureAttributeName data))
  (.build builder))


(defn cfn-scheduled-query-multi-measure-attribute-mapping-property-builder
  "Creates a  `CfnScheduledQuery$MultiMeasureAttributeMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-multi-measure-attribute-mapping-property-builder (new CfnScheduledQuery$MultiMeasureAttributeMappingProperty$Builder) id config))


(defn build-cfn-scheduled-query-multi-measure-mappings-property-builder
  "The build-cfn-scheduled-query-multi-measure-mappings-property-builder function updates a CfnScheduledQuery$MultiMeasureMappingsProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$MultiMeasureMappingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multiMeasureAttributeMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:multi-measure-attribute-mappings` |
| `targetMultiMeasureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-multi-measure-name` |
"
  [^CfnScheduledQuery$MultiMeasureMappingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :multi-measure-attribute-mappings)]
    (. builder multiMeasureAttributeMappings data))
  (when-some [data (lookup-entry config id :target-multi-measure-name)]
    (. builder targetMultiMeasureName data))
  (.build builder))


(defn cfn-scheduled-query-multi-measure-mappings-property-builder
  "Creates a  `CfnScheduledQuery$MultiMeasureMappingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-multi-measure-mappings-property-builder (new CfnScheduledQuery$MultiMeasureMappingsProperty$Builder) id config))


(defn build-cfn-scheduled-query-notification-configuration-property-builder
  "The build-cfn-scheduled-query-notification-configuration-property-builder function updates a CfnScheduledQuery$NotificationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$NotificationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snsConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$SnsConfigurationProperty | [[cdk.support/lookup-entry]] | `:sns-configuration` |
"
  [^CfnScheduledQuery$NotificationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :sns-configuration)]
    (. builder snsConfiguration data))
  (.build builder))


(defn cfn-scheduled-query-notification-configuration-property-builder
  "Creates a  `CfnScheduledQuery$NotificationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-notification-configuration-property-builder (new CfnScheduledQuery$NotificationConfigurationProperty$Builder) id config))


(defn build-cfn-scheduled-query-props-builder
  "The build-cfn-scheduled-query-props-builder function updates a CfnScheduledQueryProps$Builder instance using the provided configuration.
  The function takes the CfnScheduledQueryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `errorReportConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$ErrorReportConfigurationProperty | [[cdk.support/lookup-entry]] | `:error-report-configuration` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `notificationConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `scheduleConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$ScheduleConfigurationProperty | [[cdk.support/lookup-entry]] | `:schedule-configuration` |
| `scheduledQueryExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-query-execution-role-arn` |
| `scheduledQueryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-query-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$TargetConfigurationProperty | [[cdk.support/lookup-entry]] | `:target-configuration` |
"
  [^CfnScheduledQueryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-some [data (lookup-entry config id :error-report-configuration)]
    (. builder errorReportConfiguration data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :notification-configuration)]
    (. builder notificationConfiguration data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :schedule-configuration)]
    (. builder scheduleConfiguration data))
  (when-some [data (lookup-entry config id :scheduled-query-execution-role-arn)]
    (. builder scheduledQueryExecutionRoleArn data))
  (when-some [data (lookup-entry config id :scheduled-query-name)]
    (. builder scheduledQueryName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-configuration)]
    (. builder targetConfiguration data))
  (.build builder))


(defn cfn-scheduled-query-props-builder
  "Creates a  `CfnScheduledQueryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-props-builder (new CfnScheduledQueryProps$Builder) id config))


(defn build-cfn-scheduled-query-s3-configuration-property-builder
  "The build-cfn-scheduled-query-s3-configuration-property-builder function updates a CfnScheduledQuery$S3ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$S3ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `encryptionOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-option` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
"
  [^CfnScheduledQuery$S3ConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :encryption-option)]
    (. builder encryptionOption data))
  (when-some [data (lookup-entry config id :object-key-prefix)]
    (. builder objectKeyPrefix data))
  (.build builder))


(defn cfn-scheduled-query-s3-configuration-property-builder
  "Creates a  `CfnScheduledQuery$S3ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-s3-configuration-property-builder (new CfnScheduledQuery$S3ConfigurationProperty$Builder) id config))


(defn build-cfn-scheduled-query-schedule-configuration-property-builder
  "The build-cfn-scheduled-query-schedule-configuration-property-builder function updates a CfnScheduledQuery$ScheduleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$ScheduleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
"
  [^CfnScheduledQuery$ScheduleConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (.build builder))


(defn cfn-scheduled-query-schedule-configuration-property-builder
  "Creates a  `CfnScheduledQuery$ScheduleConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-schedule-configuration-property-builder (new CfnScheduledQuery$ScheduleConfigurationProperty$Builder) id config))


(defn build-cfn-scheduled-query-sns-configuration-property-builder
  "The build-cfn-scheduled-query-sns-configuration-property-builder function updates a CfnScheduledQuery$SnsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$SnsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnScheduledQuery$SnsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-scheduled-query-sns-configuration-property-builder
  "Creates a  `CfnScheduledQuery$SnsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-sns-configuration-property-builder (new CfnScheduledQuery$SnsConfigurationProperty$Builder) id config))


(defn build-cfn-scheduled-query-target-configuration-property-builder
  "The build-cfn-scheduled-query-target-configuration-property-builder function updates a CfnScheduledQuery$TargetConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$TargetConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timestreamConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$TimestreamConfigurationProperty | [[cdk.support/lookup-entry]] | `:timestream-configuration` |
"
  [^CfnScheduledQuery$TargetConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :timestream-configuration)]
    (. builder timestreamConfiguration data))
  (.build builder))


(defn cfn-scheduled-query-target-configuration-property-builder
  "Creates a  `CfnScheduledQuery$TargetConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-target-configuration-property-builder (new CfnScheduledQuery$TargetConfigurationProperty$Builder) id config))


(defn build-cfn-scheduled-query-timestream-configuration-property-builder
  "The build-cfn-scheduled-query-timestream-configuration-property-builder function updates a CfnScheduledQuery$TimestreamConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledQuery$TimestreamConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dimensionMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimension-mappings` |
| `measureNameColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:measure-name-column` |
| `mixedMeasureMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:mixed-measure-mappings` |
| `multiMeasureMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-measure-mappings` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `timeColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-column` |
"
  [^CfnScheduledQuery$TimestreamConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :dimension-mappings)]
    (. builder dimensionMappings data))
  (when-some [data (lookup-entry config id :measure-name-column)]
    (. builder measureNameColumn data))
  (when-some [data (lookup-entry config id :mixed-measure-mappings)]
    (. builder mixedMeasureMappings data))
  (when-some [data (lookup-entry config id :multi-measure-mappings)]
    (. builder multiMeasureMappings data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :time-column)]
    (. builder timeColumn data))
  (.build builder))


(defn cfn-scheduled-query-timestream-configuration-property-builder
  "Creates a  `CfnScheduledQuery$TimestreamConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduled-query-timestream-configuration-property-builder (new CfnScheduledQuery$TimestreamConfigurationProperty$Builder) id config))


(defn build-cfn-table-builder
  "The build-cfn-table-builder function updates a CfnTable$Builder instance using the provided configuration.
  The function takes the CfnTable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `magneticStoreWriteProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:magnetic-store-write-properties` |
| `retentionProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:retention-properties` |
| `schema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTable$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :magnetic-store-write-properties)]
    (. builder magneticStoreWriteProperties data))
  (when-some [data (lookup-entry config id :retention-properties)]
    (. builder retentionProperties data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-table-builder
  "Creates a  `CfnTable$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-table-builder (CfnTable$Builder/create scope (name id)) id config))


(defn build-cfn-table-magnetic-store-rejected-data-location-property-builder
  "The build-cfn-table-magnetic-store-rejected-data-location-property-builder function updates a CfnTable$MagneticStoreRejectedDataLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$MagneticStoreRejectedDataLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-configuration` |
"
  [^CfnTable$MagneticStoreRejectedDataLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (.build builder))


(defn cfn-table-magnetic-store-rejected-data-location-property-builder
  "Creates a  `CfnTable$MagneticStoreRejectedDataLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-table-magnetic-store-rejected-data-location-property-builder (new CfnTable$MagneticStoreRejectedDataLocationProperty$Builder) id config))


(defn build-cfn-table-magnetic-store-write-properties-property-builder
  "The build-cfn-table-magnetic-store-write-properties-property-builder function updates a CfnTable$MagneticStoreWritePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$MagneticStoreWritePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableMagneticStoreWrites` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-magnetic-store-writes` |
| `magneticStoreRejectedDataLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:magnetic-store-rejected-data-location` |
"
  [^CfnTable$MagneticStoreWritePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enable-magnetic-store-writes)]
    (. builder enableMagneticStoreWrites data))
  (when-some [data (lookup-entry config id :magnetic-store-rejected-data-location)]
    (. builder magneticStoreRejectedDataLocation data))
  (.build builder))


(defn cfn-table-magnetic-store-write-properties-property-builder
  "Creates a  `CfnTable$MagneticStoreWritePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-table-magnetic-store-write-properties-property-builder (new CfnTable$MagneticStoreWritePropertiesProperty$Builder) id config))


(defn build-cfn-table-partition-key-property-builder
  "The build-cfn-table-partition-key-property-builder function updates a CfnTable$PartitionKeyProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$PartitionKeyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforcementInRecord` | java.lang.String | [[cdk.support/lookup-entry]] | `:enforcement-in-record` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTable$PartitionKeyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enforcement-in-record)]
    (. builder enforcementInRecord data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-table-partition-key-property-builder
  "Creates a  `CfnTable$PartitionKeyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-table-partition-key-property-builder (new CfnTable$PartitionKeyProperty$Builder) id config))


(defn build-cfn-table-props-builder
  "The build-cfn-table-props-builder function updates a CfnTableProps$Builder instance using the provided configuration.
  The function takes the CfnTableProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `magneticStoreWriteProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:magnetic-store-write-properties` |
| `retentionProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:retention-properties` |
| `schema` | software.amazon.awscdk.services.timestream.CfnTable$SchemaProperty | [[cdk.support/lookup-entry]] | `:schema` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTableProps$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :magnetic-store-write-properties)]
    (. builder magneticStoreWriteProperties data))
  (when-some [data (lookup-entry config id :retention-properties)]
    (. builder retentionProperties data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-table-props-builder
  "Creates a  `CfnTableProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-table-props-builder (new CfnTableProps$Builder) id config))


(defn build-cfn-table-retention-properties-property-builder
  "The build-cfn-table-retention-properties-property-builder function updates a CfnTable$RetentionPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$RetentionPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `magneticStoreRetentionPeriodInDays` | java.lang.String | [[cdk.support/lookup-entry]] | `:magnetic-store-retention-period-in-days` |
| `memoryStoreRetentionPeriodInHours` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory-store-retention-period-in-hours` |
"
  [^CfnTable$RetentionPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :magnetic-store-retention-period-in-days)]
    (. builder magneticStoreRetentionPeriodInDays data))
  (when-some [data (lookup-entry config id :memory-store-retention-period-in-hours)]
    (. builder memoryStoreRetentionPeriodInHours data))
  (.build builder))


(defn cfn-table-retention-properties-property-builder
  "Creates a  `CfnTable$RetentionPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-table-retention-properties-property-builder (new CfnTable$RetentionPropertiesProperty$Builder) id config))


(defn build-cfn-table-s3-configuration-property-builder
  "The build-cfn-table-s3-configuration-property-builder function updates a CfnTable$S3ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$S3ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `encryptionOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-option` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
"
  [^CfnTable$S3ConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :encryption-option)]
    (. builder encryptionOption data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :object-key-prefix)]
    (. builder objectKeyPrefix data))
  (.build builder))


(defn cfn-table-s3-configuration-property-builder
  "Creates a  `CfnTable$S3ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-table-s3-configuration-property-builder (new CfnTable$S3ConfigurationProperty$Builder) id config))


(defn build-cfn-table-schema-property-builder
  "The build-cfn-table-schema-property-builder function updates a CfnTable$SchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$SchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compositePartitionKey` | java.util.List | [[cdk.support/lookup-entry]] | `:composite-partition-key` |
"
  [^CfnTable$SchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :composite-partition-key)]
    (. builder compositePartitionKey data))
  (.build builder))


(defn cfn-table-schema-property-builder
  "Creates a  `CfnTable$SchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-table-schema-property-builder (new CfnTable$SchemaProperty$Builder) id config))