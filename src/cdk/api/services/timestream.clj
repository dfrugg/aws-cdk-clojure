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


(defn cfn-database-builder
  "The cfn-database-builder function buildes out new instances of 
CfnDatabase$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatabase$Builder/create stack id)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-database-props-builder
  "The cfn-database-props-builder function buildes out new instances of 
CfnDatabaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatabaseProps$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-influx-db-instance-builder
  "The cfn-influx-db-instance-builder function buildes out new instances of 
CfnInfluxDBInstance$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |"
  [stack id config]
  (let [builder (CfnInfluxDBInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :db-instance-type)]
      (. builder dbInstanceType data))
    (when-let [data (lookup-entry config id :db-parameter-group-identifier)]
      (. builder dbParameterGroupIdentifier data))
    (when-let [data (lookup-entry config id :db-storage-type)]
      (. builder dbStorageType data))
    (when-let [data (lookup-entry config id :deployment-type)]
      (. builder deploymentType data))
    (when-let [data (lookup-entry config id :log-delivery-configuration)]
      (. builder logDeliveryConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :organization)]
      (. builder organization data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (when-let [data (lookup-entry config id :vpc-subnet-ids)]
      (. builder vpcSubnetIds data))
    (.build builder)))


(defn cfn-influx-db-instance-log-delivery-configuration-property-builder
  "The cfn-influx-db-instance-log-delivery-configuration-property-builder function buildes out new instances of 
CfnInfluxDBInstance$LogDeliveryConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-configuration` |"
  [stack id config]
  (let [builder (CfnInfluxDBInstance$LogDeliveryConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (.build builder)))


(defn cfn-influx-db-instance-props-builder
  "The cfn-influx-db-instance-props-builder function buildes out new instances of 
CfnInfluxDBInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |"
  [stack id config]
  (let [builder (CfnInfluxDBInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :db-instance-type)]
      (. builder dbInstanceType data))
    (when-let [data (lookup-entry config id :db-parameter-group-identifier)]
      (. builder dbParameterGroupIdentifier data))
    (when-let [data (lookup-entry config id :db-storage-type)]
      (. builder dbStorageType data))
    (when-let [data (lookup-entry config id :deployment-type)]
      (. builder deploymentType data))
    (when-let [data (lookup-entry config id :log-delivery-configuration)]
      (. builder logDeliveryConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :organization)]
      (. builder organization data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (when-let [data (lookup-entry config id :vpc-subnet-ids)]
      (. builder vpcSubnetIds data))
    (.build builder)))


(defn cfn-influx-db-instance-s3-configuration-property-builder
  "The cfn-influx-db-instance-s3-configuration-property-builder function buildes out new instances of 
CfnInfluxDBInstance$S3ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnInfluxDBInstance$S3ConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-scheduled-query-builder
  "The cfn-scheduled-query-builder function buildes out new instances of 
CfnScheduledQuery$Builder using the provided configuration.  Each field is set as follows:

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
| `targetConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-configuration` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :error-report-configuration)]
      (. builder errorReportConfiguration data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :notification-configuration)]
      (. builder notificationConfiguration data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :schedule-configuration)]
      (. builder scheduleConfiguration data))
    (when-let [data (lookup-entry config id :scheduled-query-execution-role-arn)]
      (. builder scheduledQueryExecutionRoleArn data))
    (when-let [data (lookup-entry config id :scheduled-query-name)]
      (. builder scheduledQueryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-configuration)]
      (. builder targetConfiguration data))
    (.build builder)))


(defn cfn-scheduled-query-dimension-mapping-property-builder
  "The cfn-scheduled-query-dimension-mapping-property-builder function buildes out new instances of 
CfnScheduledQuery$DimensionMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionValueType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-value-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$DimensionMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimension-value-type)]
      (. builder dimensionValueType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-scheduled-query-error-report-configuration-property-builder
  "The cfn-scheduled-query-error-report-configuration-property-builder function buildes out new instances of 
CfnScheduledQuery$ErrorReportConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Configuration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$S3ConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$ErrorReportConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (.build builder)))


(defn cfn-scheduled-query-mixed-measure-mapping-property-builder
  "The cfn-scheduled-query-mixed-measure-mapping-property-builder function buildes out new instances of 
CfnScheduledQuery$MixedMeasureMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `measureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:measure-name` |
| `measureValueType` | java.lang.String | [[cdk.support/lookup-entry]] | `:measure-value-type` |
| `multiMeasureAttributeMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:multi-measure-attribute-mappings` |
| `sourceColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-column` |
| `targetMeasureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-measure-name` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$MixedMeasureMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :measure-name)]
      (. builder measureName data))
    (when-let [data (lookup-entry config id :measure-value-type)]
      (. builder measureValueType data))
    (when-let [data (lookup-entry config id :multi-measure-attribute-mappings)]
      (. builder multiMeasureAttributeMappings data))
    (when-let [data (lookup-entry config id :source-column)]
      (. builder sourceColumn data))
    (when-let [data (lookup-entry config id :target-measure-name)]
      (. builder targetMeasureName data))
    (.build builder)))


(defn cfn-scheduled-query-multi-measure-attribute-mapping-property-builder
  "The cfn-scheduled-query-multi-measure-attribute-mapping-property-builder function buildes out new instances of 
CfnScheduledQuery$MultiMeasureAttributeMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `measureValueType` | java.lang.String | [[cdk.support/lookup-entry]] | `:measure-value-type` |
| `sourceColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-column` |
| `targetMultiMeasureAttributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-multi-measure-attribute-name` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$MultiMeasureAttributeMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :measure-value-type)]
      (. builder measureValueType data))
    (when-let [data (lookup-entry config id :source-column)]
      (. builder sourceColumn data))
    (when-let [data (lookup-entry config id :target-multi-measure-attribute-name)]
      (. builder targetMultiMeasureAttributeName data))
    (.build builder)))


(defn cfn-scheduled-query-multi-measure-mappings-property-builder
  "The cfn-scheduled-query-multi-measure-mappings-property-builder function buildes out new instances of 
CfnScheduledQuery$MultiMeasureMappingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multiMeasureAttributeMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:multi-measure-attribute-mappings` |
| `targetMultiMeasureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-multi-measure-name` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$MultiMeasureMappingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :multi-measure-attribute-mappings)]
      (. builder multiMeasureAttributeMappings data))
    (when-let [data (lookup-entry config id :target-multi-measure-name)]
      (. builder targetMultiMeasureName data))
    (.build builder)))


(defn cfn-scheduled-query-notification-configuration-property-builder
  "The cfn-scheduled-query-notification-configuration-property-builder function buildes out new instances of 
CfnScheduledQuery$NotificationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snsConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$SnsConfigurationProperty | [[cdk.support/lookup-entry]] | `:sns-configuration` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$NotificationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sns-configuration)]
      (. builder snsConfiguration data))
    (.build builder)))


(defn cfn-scheduled-query-props-builder
  "The cfn-scheduled-query-props-builder function buildes out new instances of 
CfnScheduledQueryProps$Builder using the provided configuration.  Each field is set as follows:

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
| `targetConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$TargetConfigurationProperty | [[cdk.support/lookup-entry]] | `:target-configuration` |"
  [stack id config]
  (let [builder (CfnScheduledQueryProps$Builder.)]
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :error-report-configuration)]
      (. builder errorReportConfiguration data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :notification-configuration)]
      (. builder notificationConfiguration data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :schedule-configuration)]
      (. builder scheduleConfiguration data))
    (when-let [data (lookup-entry config id :scheduled-query-execution-role-arn)]
      (. builder scheduledQueryExecutionRoleArn data))
    (when-let [data (lookup-entry config id :scheduled-query-name)]
      (. builder scheduledQueryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-configuration)]
      (. builder targetConfiguration data))
    (.build builder)))


(defn cfn-scheduled-query-s3-configuration-property-builder
  "The cfn-scheduled-query-s3-configuration-property-builder function buildes out new instances of 
CfnScheduledQuery$S3ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `encryptionOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-option` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$S3ConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :encryption-option)]
      (. builder encryptionOption data))
    (when-let [data (lookup-entry config id :object-key-prefix)]
      (. builder objectKeyPrefix data))
    (.build builder)))


(defn cfn-scheduled-query-schedule-configuration-property-builder
  "The cfn-scheduled-query-schedule-configuration-property-builder function buildes out new instances of 
CfnScheduledQuery$ScheduleConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$ScheduleConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (.build builder)))


(defn cfn-scheduled-query-sns-configuration-property-builder
  "The cfn-scheduled-query-sns-configuration-property-builder function buildes out new instances of 
CfnScheduledQuery$SnsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$SnsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-scheduled-query-target-configuration-property-builder
  "The cfn-scheduled-query-target-configuration-property-builder function buildes out new instances of 
CfnScheduledQuery$TargetConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timestreamConfiguration` | software.amazon.awscdk.services.timestream.CfnScheduledQuery$TimestreamConfigurationProperty | [[cdk.support/lookup-entry]] | `:timestream-configuration` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$TargetConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :timestream-configuration)]
      (. builder timestreamConfiguration data))
    (.build builder)))


(defn cfn-scheduled-query-timestream-configuration-property-builder
  "The cfn-scheduled-query-timestream-configuration-property-builder function buildes out new instances of 
CfnScheduledQuery$TimestreamConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dimensionMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimension-mappings` |
| `measureNameColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:measure-name-column` |
| `mixedMeasureMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:mixed-measure-mappings` |
| `multiMeasureMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-measure-mappings` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `timeColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-column` |"
  [stack id config]
  (let [builder (CfnScheduledQuery$TimestreamConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :dimension-mappings)]
      (. builder dimensionMappings data))
    (when-let [data (lookup-entry config id :measure-name-column)]
      (. builder measureNameColumn data))
    (when-let [data (lookup-entry config id :mixed-measure-mappings)]
      (. builder mixedMeasureMappings data))
    (when-let [data (lookup-entry config id :multi-measure-mappings)]
      (. builder multiMeasureMappings data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :time-column)]
      (. builder timeColumn data))
    (.build builder)))


(defn cfn-table-builder
  "The cfn-table-builder function buildes out new instances of 
CfnTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `magneticStoreWriteProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:magnetic-store-write-properties` |
| `retentionProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:retention-properties` |
| `schema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :magnetic-store-write-properties)]
      (. builder magneticStoreWriteProperties data))
    (when-let [data (lookup-entry config id :retention-properties)]
      (. builder retentionProperties data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-table-magnetic-store-rejected-data-location-property-builder
  "The cfn-table-magnetic-store-rejected-data-location-property-builder function buildes out new instances of 
CfnTable$MagneticStoreRejectedDataLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-configuration` |"
  [stack id config]
  (let [builder (CfnTable$MagneticStoreRejectedDataLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (.build builder)))


(defn cfn-table-magnetic-store-write-properties-property-builder
  "The cfn-table-magnetic-store-write-properties-property-builder function buildes out new instances of 
CfnTable$MagneticStoreWritePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableMagneticStoreWrites` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-magnetic-store-writes` |
| `magneticStoreRejectedDataLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:magnetic-store-rejected-data-location` |"
  [stack id config]
  (let [builder (CfnTable$MagneticStoreWritePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-magnetic-store-writes)]
      (. builder enableMagneticStoreWrites data))
    (when-let [data (lookup-entry config id :magnetic-store-rejected-data-location)]
      (. builder magneticStoreRejectedDataLocation data))
    (.build builder)))


(defn cfn-table-partition-key-property-builder
  "The cfn-table-partition-key-property-builder function buildes out new instances of 
CfnTable$PartitionKeyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforcementInRecord` | java.lang.String | [[cdk.support/lookup-entry]] | `:enforcement-in-record` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTable$PartitionKeyProperty$Builder.)]
    (when-let [data (lookup-entry config id :enforcement-in-record)]
      (. builder enforcementInRecord data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-table-props-builder
  "The cfn-table-props-builder function buildes out new instances of 
CfnTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `magneticStoreWriteProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:magnetic-store-write-properties` |
| `retentionProperties` | java.lang.Object | [[cdk.support/lookup-entry]] | `:retention-properties` |
| `schema` | software.amazon.awscdk.services.timestream.CfnTable$SchemaProperty | [[cdk.support/lookup-entry]] | `:schema` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTableProps$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :magnetic-store-write-properties)]
      (. builder magneticStoreWriteProperties data))
    (when-let [data (lookup-entry config id :retention-properties)]
      (. builder retentionProperties data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-table-retention-properties-property-builder
  "The cfn-table-retention-properties-property-builder function buildes out new instances of 
CfnTable$RetentionPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `magneticStoreRetentionPeriodInDays` | java.lang.String | [[cdk.support/lookup-entry]] | `:magnetic-store-retention-period-in-days` |
| `memoryStoreRetentionPeriodInHours` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory-store-retention-period-in-hours` |"
  [stack id config]
  (let [builder (CfnTable$RetentionPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :magnetic-store-retention-period-in-days)]
      (. builder magneticStoreRetentionPeriodInDays data))
    (when-let [data (lookup-entry config id :memory-store-retention-period-in-hours)]
      (. builder memoryStoreRetentionPeriodInHours data))
    (.build builder)))


(defn cfn-table-s3-configuration-property-builder
  "The cfn-table-s3-configuration-property-builder function buildes out new instances of 
CfnTable$S3ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `encryptionOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-option` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |"
  [stack id config]
  (let [builder (CfnTable$S3ConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :encryption-option)]
      (. builder encryptionOption data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :object-key-prefix)]
      (. builder objectKeyPrefix data))
    (.build builder)))


(defn cfn-table-schema-property-builder
  "The cfn-table-schema-property-builder function buildes out new instances of 
CfnTable$SchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compositePartitionKey` | java.util.List | [[cdk.support/lookup-entry]] | `:composite-partition-key` |"
  [stack id config]
  (let [builder (CfnTable$SchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :composite-partition-key)]
      (. builder compositePartitionKey data))
    (.build builder)))