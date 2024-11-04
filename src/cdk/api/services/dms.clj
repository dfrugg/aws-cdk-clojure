(ns cdk.api.services.dms
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.dms package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.dms CfnCertificate$Builder
                                                CfnCertificateProps$Builder
                                                CfnDataProvider$Builder
                                                CfnDataProviderProps$Builder
                                                CfnEndpoint$Builder
                                                CfnEndpoint$DocDbSettingsProperty$Builder
                                                CfnEndpoint$DynamoDbSettingsProperty$Builder
                                                CfnEndpoint$ElasticsearchSettingsProperty$Builder
                                                CfnEndpoint$GcpMySQLSettingsProperty$Builder
                                                CfnEndpoint$IbmDb2SettingsProperty$Builder
                                                CfnEndpoint$KafkaSettingsProperty$Builder
                                                CfnEndpoint$KinesisSettingsProperty$Builder
                                                CfnEndpoint$MicrosoftSqlServerSettingsProperty$Builder
                                                CfnEndpoint$MongoDbSettingsProperty$Builder
                                                CfnEndpoint$MySqlSettingsProperty$Builder
                                                CfnEndpoint$NeptuneSettingsProperty$Builder
                                                CfnEndpoint$OracleSettingsProperty$Builder
                                                CfnEndpoint$PostgreSqlSettingsProperty$Builder
                                                CfnEndpoint$RedisSettingsProperty$Builder
                                                CfnEndpoint$RedshiftSettingsProperty$Builder
                                                CfnEndpoint$S3SettingsProperty$Builder
                                                CfnEndpoint$SybaseSettingsProperty$Builder
                                                CfnEndpointProps$Builder
                                                CfnEventSubscription$Builder
                                                CfnEventSubscriptionProps$Builder
                                                CfnInstanceProfile$Builder
                                                CfnInstanceProfileProps$Builder
                                                CfnMigrationProject$Builder
                                                CfnMigrationProject$DataProviderDescriptorProperty$Builder
                                                CfnMigrationProject$SchemaConversionApplicationAttributesProperty$Builder
                                                CfnMigrationProjectProps$Builder
                                                CfnReplicationConfig$Builder
                                                CfnReplicationConfig$ComputeConfigProperty$Builder
                                                CfnReplicationConfigProps$Builder
                                                CfnReplicationInstance$Builder
                                                CfnReplicationInstanceProps$Builder
                                                CfnReplicationSubnetGroup$Builder
                                                CfnReplicationSubnetGroupProps$Builder
                                                CfnReplicationTask$Builder
                                                CfnReplicationTaskProps$Builder]))


(defn cfn-certificate-builder
  "The cfn-certificate-builder function buildes out new instances of 
CfnCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-identifier` |
| `certificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-pem` |
| `certificateWallet` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-wallet` |"
  [stack id config]
  (let [builder (CfnCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-identifier)]
      (. builder certificateIdentifier data))
    (when-let [data (lookup-entry config id :certificate-pem)]
      (. builder certificatePem data))
    (when-let [data (lookup-entry config id :certificate-wallet)]
      (. builder certificateWallet data))
    (.build builder)))


(defn cfn-certificate-props-builder
  "The cfn-certificate-props-builder function buildes out new instances of 
CfnCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-identifier` |
| `certificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-pem` |
| `certificateWallet` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-wallet` |"
  [stack id config]
  (let [builder (CfnCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-identifier)]
      (. builder certificateIdentifier data))
    (when-let [data (lookup-entry config id :certificate-pem)]
      (. builder certificatePem data))
    (when-let [data (lookup-entry config id :certificate-wallet)]
      (. builder certificateWallet data))
    (.build builder)))


(defn cfn-data-provider-builder
  "The cfn-data-provider-builder function buildes out new instances of 
CfnDataProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProviderIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-provider-identifier` |
| `dataProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-provider-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `exactSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exact-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-provider-identifier)]
      (. builder dataProviderIdentifier data))
    (when-let [data (lookup-entry config id :data-provider-name)]
      (. builder dataProviderName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :exact-settings)]
      (. builder exactSettings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-data-provider-props-builder
  "The cfn-data-provider-props-builder function buildes out new instances of 
CfnDataProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProviderIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-provider-identifier` |
| `dataProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-provider-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `exactSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exact-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :data-provider-identifier)]
      (. builder dataProviderIdentifier data))
    (when-let [data (lookup-entry config id :data-provider-name)]
      (. builder dataProviderName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :exact-settings)]
      (. builder exactSettings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-endpoint-builder
  "The cfn-endpoint-builder function buildes out new instances of 
CfnEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `docDbSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$DocDbSettingsProperty | [[cdk.support/lookup-entry]] | `:doc-db-settings` |
| `dynamoDbSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$DynamoDbSettingsProperty | [[cdk.support/lookup-entry]] | `:dynamo-db-settings` |
| `elasticsearchSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$ElasticsearchSettingsProperty | [[cdk.support/lookup-entry]] | `:elasticsearch-settings` |
| `endpointIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-identifier` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `engineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-name` |
| `extraConnectionAttributes` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-connection-attributes` |
| `gcpMySqlSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gcp-my-sql-settings` |
| `ibmDb2Settings` | software.amazon.awscdk.services.dms.CfnEndpoint$IbmDb2SettingsProperty | [[cdk.support/lookup-entry]] | `:ibm-db2-settings` |
| `kafkaSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$KafkaSettingsProperty | [[cdk.support/lookup-entry]] | `:kafka-settings` |
| `kinesisSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-settings` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `microsoftSqlServerSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:microsoft-sql-server-settings` |
| `mongoDbSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$MongoDbSettingsProperty | [[cdk.support/lookup-entry]] | `:mongo-db-settings` |
| `mySqlSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:my-sql-settings` |
| `neptuneSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$NeptuneSettingsProperty | [[cdk.support/lookup-entry]] | `:neptune-settings` |
| `oracleSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$OracleSettingsProperty | [[cdk.support/lookup-entry]] | `:oracle-settings` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `postgreSqlSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:postgre-sql-settings` |
| `redisSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redis-settings` |
| `redshiftSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$RedshiftSettingsProperty | [[cdk.support/lookup-entry]] | `:redshift-settings` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `s3Settings` | software.amazon.awscdk.services.dms.CfnEndpoint$S3SettingsProperty | [[cdk.support/lookup-entry]] | `:s3-settings` |
| `serverName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name` |
| `sslMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-mode` |
| `sybaseSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$SybaseSettingsProperty | [[cdk.support/lookup-entry]] | `:sybase-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :doc-db-settings)]
      (. builder docDbSettings data))
    (when-let [data (lookup-entry config id :dynamo-db-settings)]
      (. builder dynamoDbSettings data))
    (when-let [data (lookup-entry config id :elasticsearch-settings)]
      (. builder elasticsearchSettings data))
    (when-let [data (lookup-entry config id :endpoint-identifier)]
      (. builder endpointIdentifier data))
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :engine-name)]
      (. builder engineName data))
    (when-let [data (lookup-entry config id :extra-connection-attributes)]
      (. builder extraConnectionAttributes data))
    (when-let [data (lookup-entry config id :gcp-my-sql-settings)]
      (. builder gcpMySqlSettings data))
    (when-let [data (lookup-entry config id :ibm-db2-settings)]
      (. builder ibmDb2Settings data))
    (when-let [data (lookup-entry config id :kafka-settings)]
      (. builder kafkaSettings data))
    (when-let [data (lookup-entry config id :kinesis-settings)]
      (. builder kinesisSettings data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :microsoft-sql-server-settings)]
      (. builder microsoftSqlServerSettings data))
    (when-let [data (lookup-entry config id :mongo-db-settings)]
      (. builder mongoDbSettings data))
    (when-let [data (lookup-entry config id :my-sql-settings)]
      (. builder mySqlSettings data))
    (when-let [data (lookup-entry config id :neptune-settings)]
      (. builder neptuneSettings data))
    (when-let [data (lookup-entry config id :oracle-settings)]
      (. builder oracleSettings data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :postgre-sql-settings)]
      (. builder postgreSqlSettings data))
    (when-let [data (lookup-entry config id :redis-settings)]
      (. builder redisSettings data))
    (when-let [data (lookup-entry config id :redshift-settings)]
      (. builder redshiftSettings data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :s3-settings)]
      (. builder s3Settings data))
    (when-let [data (lookup-entry config id :server-name)]
      (. builder serverName data))
    (when-let [data (lookup-entry config id :ssl-mode)]
      (. builder sslMode data))
    (when-let [data (lookup-entry config id :sybase-settings)]
      (. builder sybaseSettings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-endpoint-doc-db-settings-property-builder
  "The cfn-endpoint-doc-db-settings-property-builder function buildes out new instances of 
CfnEndpoint$DocDbSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `docsToInvestigate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:docs-to-investigate` |
| `extractDocId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:extract-doc-id` |
| `nestingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:nesting-level` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |"
  [stack id config]
  (let [builder (CfnEndpoint$DocDbSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :docs-to-investigate)]
      (. builder docsToInvestigate data))
    (when-let [data (lookup-entry config id :extract-doc-id)]
      (. builder extractDocId data))
    (when-let [data (lookup-entry config id :nesting-level)]
      (. builder nestingLevel data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (.build builder)))


(defn cfn-endpoint-dynamo-db-settings-property-builder
  "The cfn-endpoint-dynamo-db-settings-property-builder function buildes out new instances of 
CfnEndpoint$DynamoDbSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-access-role-arn` |"
  [stack id config]
  (let [builder (CfnEndpoint$DynamoDbSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :service-access-role-arn)]
      (. builder serviceAccessRoleArn data))
    (.build builder)))


(defn cfn-endpoint-elasticsearch-settings-property-builder
  "The cfn-endpoint-elasticsearch-settings-property-builder function buildes out new instances of 
CfnEndpoint$ElasticsearchSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-uri` |
| `errorRetryDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-retry-duration` |
| `fullLoadErrorPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:full-load-error-percentage` |
| `serviceAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-access-role-arn` |"
  [stack id config]
  (let [builder (CfnEndpoint$ElasticsearchSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-uri)]
      (. builder endpointUri data))
    (when-let [data (lookup-entry config id :error-retry-duration)]
      (. builder errorRetryDuration data))
    (when-let [data (lookup-entry config id :full-load-error-percentage)]
      (. builder fullLoadErrorPercentage data))
    (when-let [data (lookup-entry config id :service-access-role-arn)]
      (. builder serviceAccessRoleArn data))
    (.build builder)))


(defn cfn-endpoint-gcp-my-sql-settings-property-builder
  "The cfn-endpoint-gcp-my-sql-settings-property-builder function buildes out new instances of 
CfnEndpoint$GcpMySQLSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterConnectScript` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-connect-script` |
| `cleanSourceMetadataOnMismatch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:clean-source-metadata-on-mismatch` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `eventsPollInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:events-poll-interval` |
| `maxFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file-size` |
| `parallelLoadThreads` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallel-load-threads` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |
| `serverName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name` |
| `serverTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-timezone` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnEndpoint$GcpMySQLSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :after-connect-script)]
      (. builder afterConnectScript data))
    (when-let [data (lookup-entry config id :clean-source-metadata-on-mismatch)]
      (. builder cleanSourceMetadataOnMismatch data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :events-poll-interval)]
      (. builder eventsPollInterval data))
    (when-let [data (lookup-entry config id :max-file-size)]
      (. builder maxFileSize data))
    (when-let [data (lookup-entry config id :parallel-load-threads)]
      (. builder parallelLoadThreads data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (when-let [data (lookup-entry config id :server-name)]
      (. builder serverName data))
    (when-let [data (lookup-entry config id :server-timezone)]
      (. builder serverTimezone data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-endpoint-ibm-db2-settings-property-builder
  "The cfn-endpoint-ibm-db2-settings-property-builder function buildes out new instances of 
CfnEndpoint$IbmDb2SettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentLsn` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-lsn` |
| `keepCsvFiles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:keep-csv-files` |
| `loadTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:load-timeout` |
| `maxFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file-size` |
| `maxKBytesPerRead` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-k-bytes-per-read` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |
| `setDataCaptureChanges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:set-data-capture-changes` |
| `writeBufferSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-buffer-size` |"
  [stack id config]
  (let [builder (CfnEndpoint$IbmDb2SettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :current-lsn)]
      (. builder currentLsn data))
    (when-let [data (lookup-entry config id :keep-csv-files)]
      (. builder keepCsvFiles data))
    (when-let [data (lookup-entry config id :load-timeout)]
      (. builder loadTimeout data))
    (when-let [data (lookup-entry config id :max-file-size)]
      (. builder maxFileSize data))
    (when-let [data (lookup-entry config id :max-k-bytes-per-read)]
      (. builder maxKBytesPerRead data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (when-let [data (lookup-entry config id :set-data-capture-changes)]
      (. builder setDataCaptureChanges data))
    (when-let [data (lookup-entry config id :write-buffer-size)]
      (. builder writeBufferSize data))
    (.build builder)))


(defn cfn-endpoint-kafka-settings-property-builder
  "The cfn-endpoint-kafka-settings-property-builder function buildes out new instances of 
CfnEndpoint$KafkaSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `broker` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker` |
| `includeControlDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-control-details` |
| `includeNullAndEmpty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-null-and-empty` |
| `includePartitionValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-partition-value` |
| `includeTableAlterOperations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-table-alter-operations` |
| `includeTransactionDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-transaction-details` |
| `messageFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-format` |
| `messageMaxBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-max-bytes` |
| `noHexPrefix` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-hex-prefix` |
| `partitionIncludeSchemaTable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partition-include-schema-table` |
| `saslPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:sasl-password` |
| `saslUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sasl-user-name` |
| `securityProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-protocol` |
| `sslCaCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-ca-certificate-arn` |
| `sslClientCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-client-certificate-arn` |
| `sslClientKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-client-key-arn` |
| `sslClientKeyPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-client-key-password` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (CfnEndpoint$KafkaSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :broker)]
      (. builder broker data))
    (when-let [data (lookup-entry config id :include-control-details)]
      (. builder includeControlDetails data))
    (when-let [data (lookup-entry config id :include-null-and-empty)]
      (. builder includeNullAndEmpty data))
    (when-let [data (lookup-entry config id :include-partition-value)]
      (. builder includePartitionValue data))
    (when-let [data (lookup-entry config id :include-table-alter-operations)]
      (. builder includeTableAlterOperations data))
    (when-let [data (lookup-entry config id :include-transaction-details)]
      (. builder includeTransactionDetails data))
    (when-let [data (lookup-entry config id :message-format)]
      (. builder messageFormat data))
    (when-let [data (lookup-entry config id :message-max-bytes)]
      (. builder messageMaxBytes data))
    (when-let [data (lookup-entry config id :no-hex-prefix)]
      (. builder noHexPrefix data))
    (when-let [data (lookup-entry config id :partition-include-schema-table)]
      (. builder partitionIncludeSchemaTable data))
    (when-let [data (lookup-entry config id :sasl-password)]
      (. builder saslPassword data))
    (when-let [data (lookup-entry config id :sasl-user-name)]
      (. builder saslUserName data))
    (when-let [data (lookup-entry config id :security-protocol)]
      (. builder securityProtocol data))
    (when-let [data (lookup-entry config id :ssl-ca-certificate-arn)]
      (. builder sslCaCertificateArn data))
    (when-let [data (lookup-entry config id :ssl-client-certificate-arn)]
      (. builder sslClientCertificateArn data))
    (when-let [data (lookup-entry config id :ssl-client-key-arn)]
      (. builder sslClientKeyArn data))
    (when-let [data (lookup-entry config id :ssl-client-key-password)]
      (. builder sslClientKeyPassword data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn cfn-endpoint-kinesis-settings-property-builder
  "The cfn-endpoint-kinesis-settings-property-builder function buildes out new instances of 
CfnEndpoint$KinesisSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeControlDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-control-details` |
| `includeNullAndEmpty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-null-and-empty` |
| `includePartitionValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-partition-value` |
| `includeTableAlterOperations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-table-alter-operations` |
| `includeTransactionDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-transaction-details` |
| `messageFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-format` |
| `noHexPrefix` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-hex-prefix` |
| `partitionIncludeSchemaTable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:partition-include-schema-table` |
| `serviceAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-access-role-arn` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (CfnEndpoint$KinesisSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :include-control-details)]
      (. builder includeControlDetails data))
    (when-let [data (lookup-entry config id :include-null-and-empty)]
      (. builder includeNullAndEmpty data))
    (when-let [data (lookup-entry config id :include-partition-value)]
      (. builder includePartitionValue data))
    (when-let [data (lookup-entry config id :include-table-alter-operations)]
      (. builder includeTableAlterOperations data))
    (when-let [data (lookup-entry config id :include-transaction-details)]
      (. builder includeTransactionDetails data))
    (when-let [data (lookup-entry config id :message-format)]
      (. builder messageFormat data))
    (when-let [data (lookup-entry config id :no-hex-prefix)]
      (. builder noHexPrefix data))
    (when-let [data (lookup-entry config id :partition-include-schema-table)]
      (. builder partitionIncludeSchemaTable data))
    (when-let [data (lookup-entry config id :service-access-role-arn)]
      (. builder serviceAccessRoleArn data))
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn cfn-endpoint-microsoft-sql-server-settings-property-builder
  "The cfn-endpoint-microsoft-sql-server-settings-property-builder function buildes out new instances of 
CfnEndpoint$MicrosoftSqlServerSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bcpPacketSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bcp-packet-size` |
| `controlTablesFileGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-tables-file-group` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `forceLobLookup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-lob-lookup` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `querySingleAlwaysOnNode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-single-always-on-node` |
| `readBackupOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:read-backup-only` |
| `safeguardPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:safeguard-policy` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |
| `serverName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name` |
| `tlogAccessMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:tlog-access-mode` |
| `trimSpaceInChar` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trim-space-in-char` |
| `useBcpFullLoad` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-bcp-full-load` |
| `useThirdPartyBackupDevice` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-third-party-backup-device` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnEndpoint$MicrosoftSqlServerSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :bcp-packet-size)]
      (. builder bcpPacketSize data))
    (when-let [data (lookup-entry config id :control-tables-file-group)]
      (. builder controlTablesFileGroup data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :force-lob-lookup)]
      (. builder forceLobLookup data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :query-single-always-on-node)]
      (. builder querySingleAlwaysOnNode data))
    (when-let [data (lookup-entry config id :read-backup-only)]
      (. builder readBackupOnly data))
    (when-let [data (lookup-entry config id :safeguard-policy)]
      (. builder safeguardPolicy data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (when-let [data (lookup-entry config id :server-name)]
      (. builder serverName data))
    (when-let [data (lookup-entry config id :tlog-access-mode)]
      (. builder tlogAccessMode data))
    (when-let [data (lookup-entry config id :trim-space-in-char)]
      (. builder trimSpaceInChar data))
    (when-let [data (lookup-entry config id :use-bcp-full-load)]
      (. builder useBcpFullLoad data))
    (when-let [data (lookup-entry config id :use-third-party-backup-device)]
      (. builder useThirdPartyBackupDevice data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-endpoint-mongo-db-settings-property-builder
  "The cfn-endpoint-mongo-db-settings-property-builder function buildes out new instances of 
CfnEndpoint$MongoDbSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authMechanism` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-mechanism` |
| `authSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-source` |
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `docsToInvestigate` | java.lang.String | [[cdk.support/lookup-entry]] | `:docs-to-investigate` |
| `extractDocId` | java.lang.String | [[cdk.support/lookup-entry]] | `:extract-doc-id` |
| `nestingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:nesting-level` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |
| `serverName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnEndpoint$MongoDbSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth-mechanism)]
      (. builder authMechanism data))
    (when-let [data (lookup-entry config id :auth-source)]
      (. builder authSource data))
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :docs-to-investigate)]
      (. builder docsToInvestigate data))
    (when-let [data (lookup-entry config id :extract-doc-id)]
      (. builder extractDocId data))
    (when-let [data (lookup-entry config id :nesting-level)]
      (. builder nestingLevel data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (when-let [data (lookup-entry config id :server-name)]
      (. builder serverName data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-endpoint-my-sql-settings-property-builder
  "The cfn-endpoint-my-sql-settings-property-builder function buildes out new instances of 
CfnEndpoint$MySqlSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterConnectScript` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-connect-script` |
| `cleanSourceMetadataOnMismatch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:clean-source-metadata-on-mismatch` |
| `eventsPollInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:events-poll-interval` |
| `maxFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file-size` |
| `parallelLoadThreads` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallel-load-threads` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |
| `serverTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-timezone` |
| `targetDbType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-db-type` |"
  [stack id config]
  (let [builder (CfnEndpoint$MySqlSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :after-connect-script)]
      (. builder afterConnectScript data))
    (when-let [data (lookup-entry config id :clean-source-metadata-on-mismatch)]
      (. builder cleanSourceMetadataOnMismatch data))
    (when-let [data (lookup-entry config id :events-poll-interval)]
      (. builder eventsPollInterval data))
    (when-let [data (lookup-entry config id :max-file-size)]
      (. builder maxFileSize data))
    (when-let [data (lookup-entry config id :parallel-load-threads)]
      (. builder parallelLoadThreads data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (when-let [data (lookup-entry config id :server-timezone)]
      (. builder serverTimezone data))
    (when-let [data (lookup-entry config id :target-db-type)]
      (. builder targetDbType data))
    (.build builder)))


(defn cfn-endpoint-neptune-settings-property-builder
  "The cfn-endpoint-neptune-settings-property-builder function buildes out new instances of 
CfnEndpoint$NeptuneSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorRetryDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-retry-duration` |
| `iamAuthEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-auth-enabled` |
| `maxFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file-size` |
| `maxRetryCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retry-count` |
| `s3BucketFolder` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-folder` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `serviceAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-access-role-arn` |"
  [stack id config]
  (let [builder (CfnEndpoint$NeptuneSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :error-retry-duration)]
      (. builder errorRetryDuration data))
    (when-let [data (lookup-entry config id :iam-auth-enabled)]
      (. builder iamAuthEnabled data))
    (when-let [data (lookup-entry config id :max-file-size)]
      (. builder maxFileSize data))
    (when-let [data (lookup-entry config id :max-retry-count)]
      (. builder maxRetryCount data))
    (when-let [data (lookup-entry config id :s3-bucket-folder)]
      (. builder s3BucketFolder data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :service-access-role-arn)]
      (. builder serviceAccessRoleArn data))
    (.build builder)))


(defn cfn-endpoint-oracle-settings-property-builder
  "The cfn-endpoint-oracle-settings-property-builder function buildes out new instances of 
CfnEndpoint$OracleSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessAlternateDirectly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:access-alternate-directly` |
| `addSupplementalLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-supplemental-logging` |
| `additionalArchivedLogDestId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:additional-archived-log-dest-id` |
| `allowSelectNestedTables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-select-nested-tables` |
| `archivedLogDestId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:archived-log-dest-id` |
| `archivedLogsOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:archived-logs-only` |
| `asmPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:asm-password` |
| `asmServer` | java.lang.String | [[cdk.support/lookup-entry]] | `:asm-server` |
| `asmUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:asm-user` |
| `charLengthSemantics` | java.lang.String | [[cdk.support/lookup-entry]] | `:char-length-semantics` |
| `directPathNoLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:direct-path-no-log` |
| `directPathParallelLoad` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:direct-path-parallel-load` |
| `enableHomogenousTablespace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-homogenous-tablespace` |
| `extraArchivedLogDestIds` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-archived-log-dest-ids` |
| `failTasksOnLobTruncation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-tasks-on-lob-truncation` |
| `numberDatatypeScale` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-datatype-scale` |
| `oraclePathPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:oracle-path-prefix` |
| `parallelAsmReadThreads` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallel-asm-read-threads` |
| `readAheadBlocks` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-ahead-blocks` |
| `readTableSpaceName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-table-space-name` |
| `replacePathPrefix` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-path-prefix` |
| `retryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-interval` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerOracleAsmAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-oracle-asm-access-role-arn` |
| `secretsManagerOracleAsmSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-oracle-asm-secret-id` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |
| `securityDbEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-db-encryption` |
| `securityDbEncryptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-db-encryption-name` |
| `spatialDataOptionToGeoJsonFunctionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:spatial-data-option-to-geo-json-function-name` |
| `standbyDelayTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:standby-delay-time` |
| `useAlternateFolderForOnline` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-alternate-folder-for-online` |
| `useBFile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-b-file` |
| `useDirectPathFullLoad` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-direct-path-full-load` |
| `useLogminerReader` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-logminer-reader` |
| `usePathPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:use-path-prefix` |"
  [stack id config]
  (let [builder (CfnEndpoint$OracleSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-alternate-directly)]
      (. builder accessAlternateDirectly data))
    (when-let [data (lookup-entry config id :add-supplemental-logging)]
      (. builder addSupplementalLogging data))
    (when-let [data (lookup-entry config id :additional-archived-log-dest-id)]
      (. builder additionalArchivedLogDestId data))
    (when-let [data (lookup-entry config id :allow-select-nested-tables)]
      (. builder allowSelectNestedTables data))
    (when-let [data (lookup-entry config id :archived-log-dest-id)]
      (. builder archivedLogDestId data))
    (when-let [data (lookup-entry config id :archived-logs-only)]
      (. builder archivedLogsOnly data))
    (when-let [data (lookup-entry config id :asm-password)]
      (. builder asmPassword data))
    (when-let [data (lookup-entry config id :asm-server)]
      (. builder asmServer data))
    (when-let [data (lookup-entry config id :asm-user)]
      (. builder asmUser data))
    (when-let [data (lookup-entry config id :char-length-semantics)]
      (. builder charLengthSemantics data))
    (when-let [data (lookup-entry config id :direct-path-no-log)]
      (. builder directPathNoLog data))
    (when-let [data (lookup-entry config id :direct-path-parallel-load)]
      (. builder directPathParallelLoad data))
    (when-let [data (lookup-entry config id :enable-homogenous-tablespace)]
      (. builder enableHomogenousTablespace data))
    (when-let [data (lookup-entry config id :extra-archived-log-dest-ids)]
      (. builder extraArchivedLogDestIds data))
    (when-let [data (lookup-entry config id :fail-tasks-on-lob-truncation)]
      (. builder failTasksOnLobTruncation data))
    (when-let [data (lookup-entry config id :number-datatype-scale)]
      (. builder numberDatatypeScale data))
    (when-let [data (lookup-entry config id :oracle-path-prefix)]
      (. builder oraclePathPrefix data))
    (when-let [data (lookup-entry config id :parallel-asm-read-threads)]
      (. builder parallelAsmReadThreads data))
    (when-let [data (lookup-entry config id :read-ahead-blocks)]
      (. builder readAheadBlocks data))
    (when-let [data (lookup-entry config id :read-table-space-name)]
      (. builder readTableSpaceName data))
    (when-let [data (lookup-entry config id :replace-path-prefix)]
      (. builder replacePathPrefix data))
    (when-let [data (lookup-entry config id :retry-interval)]
      (. builder retryInterval data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-oracle-asm-access-role-arn)]
      (. builder secretsManagerOracleAsmAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-oracle-asm-secret-id)]
      (. builder secretsManagerOracleAsmSecretId data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (when-let [data (lookup-entry config id :security-db-encryption)]
      (. builder securityDbEncryption data))
    (when-let [data (lookup-entry config id :security-db-encryption-name)]
      (. builder securityDbEncryptionName data))
    (when-let [data (lookup-entry config id :spatial-data-option-to-geo-json-function-name)]
      (. builder spatialDataOptionToGeoJsonFunctionName data))
    (when-let [data (lookup-entry config id :standby-delay-time)]
      (. builder standbyDelayTime data))
    (when-let [data (lookup-entry config id :use-alternate-folder-for-online)]
      (. builder useAlternateFolderForOnline data))
    (when-let [data (lookup-entry config id :use-b-file)]
      (. builder useBFile data))
    (when-let [data (lookup-entry config id :use-direct-path-full-load)]
      (. builder useDirectPathFullLoad data))
    (when-let [data (lookup-entry config id :use-logminer-reader)]
      (. builder useLogminerReader data))
    (when-let [data (lookup-entry config id :use-path-prefix)]
      (. builder usePathPrefix data))
    (.build builder)))


(defn cfn-endpoint-postgre-sql-settings-property-builder
  "The cfn-endpoint-postgre-sql-settings-property-builder function buildes out new instances of 
CfnEndpoint$PostgreSqlSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterConnectScript` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-connect-script` |
| `babelfishDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:babelfish-database-name` |
| `captureDdls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:capture-ddls` |
| `databaseMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-mode` |
| `ddlArtifactsSchema` | java.lang.String | [[cdk.support/lookup-entry]] | `:ddl-artifacts-schema` |
| `executeTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:execute-timeout` |
| `failTasksOnLobTruncation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fail-tasks-on-lob-truncation` |
| `heartbeatEnable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:heartbeat-enable` |
| `heartbeatFrequency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:heartbeat-frequency` |
| `heartbeatSchema` | java.lang.String | [[cdk.support/lookup-entry]] | `:heartbeat-schema` |
| `mapBooleanAsBoolean` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-boolean-as-boolean` |
| `maxFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file-size` |
| `pluginName` | java.lang.String | [[cdk.support/lookup-entry]] | `:plugin-name` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |
| `slotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-name` |"
  [stack id config]
  (let [builder (CfnEndpoint$PostgreSqlSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :after-connect-script)]
      (. builder afterConnectScript data))
    (when-let [data (lookup-entry config id :babelfish-database-name)]
      (. builder babelfishDatabaseName data))
    (when-let [data (lookup-entry config id :capture-ddls)]
      (. builder captureDdls data))
    (when-let [data (lookup-entry config id :database-mode)]
      (. builder databaseMode data))
    (when-let [data (lookup-entry config id :ddl-artifacts-schema)]
      (. builder ddlArtifactsSchema data))
    (when-let [data (lookup-entry config id :execute-timeout)]
      (. builder executeTimeout data))
    (when-let [data (lookup-entry config id :fail-tasks-on-lob-truncation)]
      (. builder failTasksOnLobTruncation data))
    (when-let [data (lookup-entry config id :heartbeat-enable)]
      (. builder heartbeatEnable data))
    (when-let [data (lookup-entry config id :heartbeat-frequency)]
      (. builder heartbeatFrequency data))
    (when-let [data (lookup-entry config id :heartbeat-schema)]
      (. builder heartbeatSchema data))
    (when-let [data (lookup-entry config id :map-boolean-as-boolean)]
      (. builder mapBooleanAsBoolean data))
    (when-let [data (lookup-entry config id :max-file-size)]
      (. builder maxFileSize data))
    (when-let [data (lookup-entry config id :plugin-name)]
      (. builder pluginName data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (when-let [data (lookup-entry config id :slot-name)]
      (. builder slotName data))
    (.build builder)))


(defn cfn-endpoint-props-builder
  "The cfn-endpoint-props-builder function buildes out new instances of 
CfnEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `docDbSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$DocDbSettingsProperty | [[cdk.support/lookup-entry]] | `:doc-db-settings` |
| `dynamoDbSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-db-settings` |
| `elasticsearchSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$ElasticsearchSettingsProperty | [[cdk.support/lookup-entry]] | `:elasticsearch-settings` |
| `endpointIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-identifier` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `engineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-name` |
| `extraConnectionAttributes` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-connection-attributes` |
| `gcpMySqlSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gcp-my-sql-settings` |
| `ibmDb2Settings` | software.amazon.awscdk.services.dms.CfnEndpoint$IbmDb2SettingsProperty | [[cdk.support/lookup-entry]] | `:ibm-db2-settings` |
| `kafkaSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-settings` |
| `kinesisSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$KinesisSettingsProperty | [[cdk.support/lookup-entry]] | `:kinesis-settings` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `microsoftSqlServerSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$MicrosoftSqlServerSettingsProperty | [[cdk.support/lookup-entry]] | `:microsoft-sql-server-settings` |
| `mongoDbSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mongo-db-settings` |
| `mySqlSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$MySqlSettingsProperty | [[cdk.support/lookup-entry]] | `:my-sql-settings` |
| `neptuneSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$NeptuneSettingsProperty | [[cdk.support/lookup-entry]] | `:neptune-settings` |
| `oracleSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oracle-settings` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `postgreSqlSettings` | software.amazon.awscdk.services.dms.CfnEndpoint$PostgreSqlSettingsProperty | [[cdk.support/lookup-entry]] | `:postgre-sql-settings` |
| `redisSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redis-settings` |
| `redshiftSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redshift-settings` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `s3Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-settings` |
| `serverName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name` |
| `sslMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-mode` |
| `sybaseSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sybase-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :doc-db-settings)]
      (. builder docDbSettings data))
    (when-let [data (lookup-entry config id :dynamo-db-settings)]
      (. builder dynamoDbSettings data))
    (when-let [data (lookup-entry config id :elasticsearch-settings)]
      (. builder elasticsearchSettings data))
    (when-let [data (lookup-entry config id :endpoint-identifier)]
      (. builder endpointIdentifier data))
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :engine-name)]
      (. builder engineName data))
    (when-let [data (lookup-entry config id :extra-connection-attributes)]
      (. builder extraConnectionAttributes data))
    (when-let [data (lookup-entry config id :gcp-my-sql-settings)]
      (. builder gcpMySqlSettings data))
    (when-let [data (lookup-entry config id :ibm-db2-settings)]
      (. builder ibmDb2Settings data))
    (when-let [data (lookup-entry config id :kafka-settings)]
      (. builder kafkaSettings data))
    (when-let [data (lookup-entry config id :kinesis-settings)]
      (. builder kinesisSettings data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :microsoft-sql-server-settings)]
      (. builder microsoftSqlServerSettings data))
    (when-let [data (lookup-entry config id :mongo-db-settings)]
      (. builder mongoDbSettings data))
    (when-let [data (lookup-entry config id :my-sql-settings)]
      (. builder mySqlSettings data))
    (when-let [data (lookup-entry config id :neptune-settings)]
      (. builder neptuneSettings data))
    (when-let [data (lookup-entry config id :oracle-settings)]
      (. builder oracleSettings data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :postgre-sql-settings)]
      (. builder postgreSqlSettings data))
    (when-let [data (lookup-entry config id :redis-settings)]
      (. builder redisSettings data))
    (when-let [data (lookup-entry config id :redshift-settings)]
      (. builder redshiftSettings data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :s3-settings)]
      (. builder s3Settings data))
    (when-let [data (lookup-entry config id :server-name)]
      (. builder serverName data))
    (when-let [data (lookup-entry config id :ssl-mode)]
      (. builder sslMode data))
    (when-let [data (lookup-entry config id :sybase-settings)]
      (. builder sybaseSettings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-endpoint-redis-settings-property-builder
  "The cfn-endpoint-redis-settings-property-builder function buildes out new instances of 
CfnEndpoint$RedisSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-password` |
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `authUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-user-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `serverName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name` |
| `sslCaCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-ca-certificate-arn` |
| `sslSecurityProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-security-protocol` |"
  [stack id config]
  (let [builder (CfnEndpoint$RedisSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth-password)]
      (. builder authPassword data))
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :auth-user-name)]
      (. builder authUserName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :server-name)]
      (. builder serverName data))
    (when-let [data (lookup-entry config id :ssl-ca-certificate-arn)]
      (. builder sslCaCertificateArn data))
    (when-let [data (lookup-entry config id :ssl-security-protocol)]
      (. builder sslSecurityProtocol data))
    (.build builder)))


(defn cfn-endpoint-redshift-settings-property-builder
  "The cfn-endpoint-redshift-settings-property-builder function buildes out new instances of 
CfnEndpoint$RedshiftSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptAnyDate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accept-any-date` |
| `afterConnectScript` | java.lang.String | [[cdk.support/lookup-entry]] | `:after-connect-script` |
| `bucketFolder` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-folder` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `caseSensitiveNames` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:case-sensitive-names` |
| `compUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:comp-update` |
| `connectionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `dateFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-format` |
| `emptyAsNull` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:empty-as-null` |
| `encryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-mode` |
| `explicitIds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:explicit-ids` |
| `fileTransferUploadStreams` | java.lang.Number | [[cdk.support/lookup-entry]] | `:file-transfer-upload-streams` |
| `loadTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:load-timeout` |
| `mapBooleanAsBoolean` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-boolean-as-boolean` |
| `maxFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file-size` |
| `removeQuotes` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-quotes` |
| `replaceChars` | java.lang.String | [[cdk.support/lookup-entry]] | `:replace-chars` |
| `replaceInvalidChars` | java.lang.String | [[cdk.support/lookup-entry]] | `:replace-invalid-chars` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |
| `serverSideEncryptionKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-kms-key-id` |
| `serviceAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-access-role-arn` |
| `timeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-format` |
| `trimBlanks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trim-blanks` |
| `truncateColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:truncate-columns` |
| `writeBufferSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-buffer-size` |"
  [stack id config]
  (let [builder (CfnEndpoint$RedshiftSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :accept-any-date)]
      (. builder acceptAnyDate data))
    (when-let [data (lookup-entry config id :after-connect-script)]
      (. builder afterConnectScript data))
    (when-let [data (lookup-entry config id :bucket-folder)]
      (. builder bucketFolder data))
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :case-sensitive-names)]
      (. builder caseSensitiveNames data))
    (when-let [data (lookup-entry config id :comp-update)]
      (. builder compUpdate data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :date-format)]
      (. builder dateFormat data))
    (when-let [data (lookup-entry config id :empty-as-null)]
      (. builder emptyAsNull data))
    (when-let [data (lookup-entry config id :encryption-mode)]
      (. builder encryptionMode data))
    (when-let [data (lookup-entry config id :explicit-ids)]
      (. builder explicitIds data))
    (when-let [data (lookup-entry config id :file-transfer-upload-streams)]
      (. builder fileTransferUploadStreams data))
    (when-let [data (lookup-entry config id :load-timeout)]
      (. builder loadTimeout data))
    (when-let [data (lookup-entry config id :map-boolean-as-boolean)]
      (. builder mapBooleanAsBoolean data))
    (when-let [data (lookup-entry config id :max-file-size)]
      (. builder maxFileSize data))
    (when-let [data (lookup-entry config id :remove-quotes)]
      (. builder removeQuotes data))
    (when-let [data (lookup-entry config id :replace-chars)]
      (. builder replaceChars data))
    (when-let [data (lookup-entry config id :replace-invalid-chars)]
      (. builder replaceInvalidChars data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (when-let [data (lookup-entry config id :server-side-encryption-kms-key-id)]
      (. builder serverSideEncryptionKmsKeyId data))
    (when-let [data (lookup-entry config id :service-access-role-arn)]
      (. builder serviceAccessRoleArn data))
    (when-let [data (lookup-entry config id :time-format)]
      (. builder timeFormat data))
    (when-let [data (lookup-entry config id :trim-blanks)]
      (. builder trimBlanks data))
    (when-let [data (lookup-entry config id :truncate-columns)]
      (. builder truncateColumns data))
    (when-let [data (lookup-entry config id :write-buffer-size)]
      (. builder writeBufferSize data))
    (.build builder)))


(defn cfn-endpoint-s3-settings-property-builder
  "The cfn-endpoint-s3-settings-property-builder function buildes out new instances of 
CfnEndpoint$S3SettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addColumnName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-column-name` |
| `addTrailingPaddingCharacter` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-padding-character` |
| `bucketFolder` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-folder` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `cannedAclForObjects` | java.lang.String | [[cdk.support/lookup-entry]] | `:canned-acl-for-objects` |
| `cdcInsertsAndUpdates` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cdc-inserts-and-updates` |
| `cdcInsertsOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cdc-inserts-only` |
| `cdcMaxBatchInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cdc-max-batch-interval` |
| `cdcMinFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cdc-min-file-size` |
| `cdcPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdc-path` |
| `compressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-type` |
| `csvDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:csv-delimiter` |
| `csvNoSupValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:csv-no-sup-value` |
| `csvNullValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:csv-null-value` |
| `csvRowDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:csv-row-delimiter` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `dataPageSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-page-size` |
| `datePartitionDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-partition-delimiter` |
| `datePartitionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:date-partition-enabled` |
| `datePartitionSequence` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-partition-sequence` |
| `datePartitionTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-partition-timezone` |
| `dictPageSizeLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dict-page-size-limit` |
| `enableStatistics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-statistics` |
| `encodingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-type` |
| `encryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-mode` |
| `expectedBucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:expected-bucket-owner` |
| `externalTableDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-table-definition` |
| `glueCatalogGeneration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue-catalog-generation` |
| `ignoreHeaderRows` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ignore-header-rows` |
| `includeOpForFullLoad` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-op-for-full-load` |
| `maxFileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file-size` |
| `parquetTimestampInMillisecond` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet-timestamp-in-millisecond` |
| `parquetVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:parquet-version` |
| `preserveTransactions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-transactions` |
| `rfc4180` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rfc4180` |
| `rowGroupLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:row-group-length` |
| `serverSideEncryptionKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-kms-key-id` |
| `serviceAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-access-role-arn` |
| `timestampColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp-column-name` |
| `useCsvNoSupValue` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-csv-no-sup-value` |
| `useTaskStartTimeForFullLoadTimestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-task-start-time-for-full-load-timestamp` |"
  [stack id config]
  (let [builder (CfnEndpoint$S3SettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-column-name)]
      (. builder addColumnName data))
    (when-let [data (lookup-entry config id :add-trailing-padding-character)]
      (. builder addTrailingPaddingCharacter data))
    (when-let [data (lookup-entry config id :bucket-folder)]
      (. builder bucketFolder data))
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :canned-acl-for-objects)]
      (. builder cannedAclForObjects data))
    (when-let [data (lookup-entry config id :cdc-inserts-and-updates)]
      (. builder cdcInsertsAndUpdates data))
    (when-let [data (lookup-entry config id :cdc-inserts-only)]
      (. builder cdcInsertsOnly data))
    (when-let [data (lookup-entry config id :cdc-max-batch-interval)]
      (. builder cdcMaxBatchInterval data))
    (when-let [data (lookup-entry config id :cdc-min-file-size)]
      (. builder cdcMinFileSize data))
    (when-let [data (lookup-entry config id :cdc-path)]
      (. builder cdcPath data))
    (when-let [data (lookup-entry config id :compression-type)]
      (. builder compressionType data))
    (when-let [data (lookup-entry config id :csv-delimiter)]
      (. builder csvDelimiter data))
    (when-let [data (lookup-entry config id :csv-no-sup-value)]
      (. builder csvNoSupValue data))
    (when-let [data (lookup-entry config id :csv-null-value)]
      (. builder csvNullValue data))
    (when-let [data (lookup-entry config id :csv-row-delimiter)]
      (. builder csvRowDelimiter data))
    (when-let [data (lookup-entry config id :data-format)]
      (. builder dataFormat data))
    (when-let [data (lookup-entry config id :data-page-size)]
      (. builder dataPageSize data))
    (when-let [data (lookup-entry config id :date-partition-delimiter)]
      (. builder datePartitionDelimiter data))
    (when-let [data (lookup-entry config id :date-partition-enabled)]
      (. builder datePartitionEnabled data))
    (when-let [data (lookup-entry config id :date-partition-sequence)]
      (. builder datePartitionSequence data))
    (when-let [data (lookup-entry config id :date-partition-timezone)]
      (. builder datePartitionTimezone data))
    (when-let [data (lookup-entry config id :dict-page-size-limit)]
      (. builder dictPageSizeLimit data))
    (when-let [data (lookup-entry config id :enable-statistics)]
      (. builder enableStatistics data))
    (when-let [data (lookup-entry config id :encoding-type)]
      (. builder encodingType data))
    (when-let [data (lookup-entry config id :encryption-mode)]
      (. builder encryptionMode data))
    (when-let [data (lookup-entry config id :expected-bucket-owner)]
      (. builder expectedBucketOwner data))
    (when-let [data (lookup-entry config id :external-table-definition)]
      (. builder externalTableDefinition data))
    (when-let [data (lookup-entry config id :glue-catalog-generation)]
      (. builder glueCatalogGeneration data))
    (when-let [data (lookup-entry config id :ignore-header-rows)]
      (. builder ignoreHeaderRows data))
    (when-let [data (lookup-entry config id :include-op-for-full-load)]
      (. builder includeOpForFullLoad data))
    (when-let [data (lookup-entry config id :max-file-size)]
      (. builder maxFileSize data))
    (when-let [data (lookup-entry config id :parquet-timestamp-in-millisecond)]
      (. builder parquetTimestampInMillisecond data))
    (when-let [data (lookup-entry config id :parquet-version)]
      (. builder parquetVersion data))
    (when-let [data (lookup-entry config id :preserve-transactions)]
      (. builder preserveTransactions data))
    (when-let [data (lookup-entry config id :rfc4180)]
      (. builder rfc4180 data))
    (when-let [data (lookup-entry config id :row-group-length)]
      (. builder rowGroupLength data))
    (when-let [data (lookup-entry config id :server-side-encryption-kms-key-id)]
      (. builder serverSideEncryptionKmsKeyId data))
    (when-let [data (lookup-entry config id :service-access-role-arn)]
      (. builder serviceAccessRoleArn data))
    (when-let [data (lookup-entry config id :timestamp-column-name)]
      (. builder timestampColumnName data))
    (when-let [data (lookup-entry config id :use-csv-no-sup-value)]
      (. builder useCsvNoSupValue data))
    (when-let [data (lookup-entry config id :use-task-start-time-for-full-load-timestamp)]
      (. builder useTaskStartTimeForFullLoadTimestamp data))
    (.build builder)))


(defn cfn-endpoint-sybase-settings-property-builder
  "The cfn-endpoint-sybase-settings-property-builder function buildes out new instances of 
CfnEndpoint$SybaseSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |"
  [stack id config]
  (let [builder (CfnEndpoint$SybaseSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (.build builder)))


(defn cfn-event-subscription-builder
  "The cfn-event-subscription-builder function buildes out new instances of 
CfnEventSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventSubscription$Builder/create stack id)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event-categories)]
      (. builder eventCategories data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (when-let [data (lookup-entry config id :source-ids)]
      (. builder sourceIds data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (when-let [data (lookup-entry config id :subscription-name)]
      (. builder subscriptionName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-event-subscription-props-builder
  "The cfn-event-subscription-props-builder function buildes out new instances of 
CfnEventSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event-categories)]
      (. builder eventCategories data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (when-let [data (lookup-entry config id :source-ids)]
      (. builder sourceIds data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (when-let [data (lookup-entry config id :subscription-name)]
      (. builder subscriptionName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-instance-profile-builder
  "The cfn-instance-profile-builder function buildes out new instances of 
CfnInstanceProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceProfileIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-identifier` |
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `subnetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-groups` |"
  [stack id config]
  (let [builder (CfnInstanceProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-profile-identifier)]
      (. builder instanceProfileIdentifier data))
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :subnet-group-identifier)]
      (. builder subnetGroupIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-groups)]
      (. builder vpcSecurityGroups data))
    (.build builder)))


(defn cfn-instance-profile-props-builder
  "The cfn-instance-profile-props-builder function buildes out new instances of 
CfnInstanceProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceProfileIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-identifier` |
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `subnetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-groups` |"
  [stack id config]
  (let [builder (CfnInstanceProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-profile-identifier)]
      (. builder instanceProfileIdentifier data))
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :subnet-group-identifier)]
      (. builder subnetGroupIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-groups)]
      (. builder vpcSecurityGroups data))
    (.build builder)))


(defn cfn-migration-project-builder
  "The cfn-migration-project-builder function buildes out new instances of 
CfnMigrationProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-arn` |
| `instanceProfileIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-identifier` |
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `migrationProjectCreationTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:migration-project-creation-time` |
| `migrationProjectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:migration-project-identifier` |
| `migrationProjectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:migration-project-name` |
| `schemaConversionApplicationAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema-conversion-application-attributes` |
| `sourceDataProviderDescriptors` | java.util.List | [[cdk.support/lookup-entry]] | `:source-data-provider-descriptors` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetDataProviderDescriptors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-data-provider-descriptors` |
| `transformationRules` | java.lang.String | [[cdk.support/lookup-entry]] | `:transformation-rules` |"
  [stack id config]
  (let [builder (CfnMigrationProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-profile-arn)]
      (. builder instanceProfileArn data))
    (when-let [data (lookup-entry config id :instance-profile-identifier)]
      (. builder instanceProfileIdentifier data))
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :migration-project-creation-time)]
      (. builder migrationProjectCreationTime data))
    (when-let [data (lookup-entry config id :migration-project-identifier)]
      (. builder migrationProjectIdentifier data))
    (when-let [data (lookup-entry config id :migration-project-name)]
      (. builder migrationProjectName data))
    (when-let [data (lookup-entry config id :schema-conversion-application-attributes)]
      (. builder schemaConversionApplicationAttributes data))
    (when-let [data (lookup-entry config id :source-data-provider-descriptors)]
      (. builder sourceDataProviderDescriptors data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-data-provider-descriptors)]
      (. builder targetDataProviderDescriptors data))
    (when-let [data (lookup-entry config id :transformation-rules)]
      (. builder transformationRules data))
    (.build builder)))


(defn cfn-migration-project-data-provider-descriptor-property-builder
  "The cfn-migration-project-data-provider-descriptor-property-builder function buildes out new instances of 
CfnMigrationProject$DataProviderDescriptorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-provider-arn` |
| `dataProviderIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-provider-identifier` |
| `dataProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-provider-name` |
| `secretsManagerAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-access-role-arn` |
| `secretsManagerSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-id` |"
  [stack id config]
  (let [builder (CfnMigrationProject$DataProviderDescriptorProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-provider-arn)]
      (. builder dataProviderArn data))
    (when-let [data (lookup-entry config id :data-provider-identifier)]
      (. builder dataProviderIdentifier data))
    (when-let [data (lookup-entry config id :data-provider-name)]
      (. builder dataProviderName data))
    (when-let [data (lookup-entry config id :secrets-manager-access-role-arn)]
      (. builder secretsManagerAccessRoleArn data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-id)]
      (. builder secretsManagerSecretId data))
    (.build builder)))


(defn cfn-migration-project-props-builder
  "The cfn-migration-project-props-builder function buildes out new instances of 
CfnMigrationProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-arn` |
| `instanceProfileIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-identifier` |
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `migrationProjectCreationTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:migration-project-creation-time` |
| `migrationProjectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:migration-project-identifier` |
| `migrationProjectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:migration-project-name` |
| `schemaConversionApplicationAttributes` | software.amazon.awscdk.services.dms.CfnMigrationProject$SchemaConversionApplicationAttributesProperty | [[cdk.support/lookup-entry]] | `:schema-conversion-application-attributes` |
| `sourceDataProviderDescriptors` | java.util.List | [[cdk.support/lookup-entry]] | `:source-data-provider-descriptors` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetDataProviderDescriptors` | java.util.List | [[cdk.support/lookup-entry]] | `:target-data-provider-descriptors` |
| `transformationRules` | java.lang.String | [[cdk.support/lookup-entry]] | `:transformation-rules` |"
  [stack id config]
  (let [builder (CfnMigrationProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-profile-arn)]
      (. builder instanceProfileArn data))
    (when-let [data (lookup-entry config id :instance-profile-identifier)]
      (. builder instanceProfileIdentifier data))
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :migration-project-creation-time)]
      (. builder migrationProjectCreationTime data))
    (when-let [data (lookup-entry config id :migration-project-identifier)]
      (. builder migrationProjectIdentifier data))
    (when-let [data (lookup-entry config id :migration-project-name)]
      (. builder migrationProjectName data))
    (when-let [data (lookup-entry config id :schema-conversion-application-attributes)]
      (. builder schemaConversionApplicationAttributes data))
    (when-let [data (lookup-entry config id :source-data-provider-descriptors)]
      (. builder sourceDataProviderDescriptors data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-data-provider-descriptors)]
      (. builder targetDataProviderDescriptors data))
    (when-let [data (lookup-entry config id :transformation-rules)]
      (. builder transformationRules data))
    (.build builder)))


(defn cfn-migration-project-schema-conversion-application-attributes-property-builder
  "The cfn-migration-project-schema-conversion-application-attributes-property-builder function buildes out new instances of 
CfnMigrationProject$SchemaConversionApplicationAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-path` |
| `s3BucketRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-role-arn` |"
  [stack id config]
  (let [builder (CfnMigrationProject$SchemaConversionApplicationAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket-path)]
      (. builder s3BucketPath data))
    (when-let [data (lookup-entry config id :s3-bucket-role-arn)]
      (. builder s3BucketRoleArn data))
    (.build builder)))


(defn cfn-replication-config-builder
  "The cfn-replication-config-builder function buildes out new instances of 
CfnReplicationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-config` |
| `replicationConfigIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-config-identifier` |
| `replicationSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:replication-settings` |
| `replicationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-type` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `sourceEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-endpoint-arn` |
| `supplementalSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:supplemental-settings` |
| `tableMappings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:table-mappings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-endpoint-arn` |"
  [stack id config]
  (let [builder (CfnReplicationConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-config)]
      (. builder computeConfig data))
    (when-let [data (lookup-entry config id :replication-config-identifier)]
      (. builder replicationConfigIdentifier data))
    (when-let [data (lookup-entry config id :replication-settings)]
      (. builder replicationSettings data))
    (when-let [data (lookup-entry config id :replication-type)]
      (. builder replicationType data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :source-endpoint-arn)]
      (. builder sourceEndpointArn data))
    (when-let [data (lookup-entry config id :supplemental-settings)]
      (. builder supplementalSettings data))
    (when-let [data (lookup-entry config id :table-mappings)]
      (. builder tableMappings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-endpoint-arn)]
      (. builder targetEndpointArn data))
    (.build builder)))


(defn cfn-replication-config-compute-config-property-builder
  "The cfn-replication-config-compute-config-property-builder function buildes out new instances of 
CfnReplicationConfig$ComputeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `dnsNameServers` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name-servers` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `maxCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity-units` |
| `minCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity-units` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `replicationSubnetGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-subnet-group-id` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnReplicationConfig$ComputeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :dns-name-servers)]
      (. builder dnsNameServers data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :max-capacity-units)]
      (. builder maxCapacityUnits data))
    (when-let [data (lookup-entry config id :min-capacity-units)]
      (. builder minCapacityUnits data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :replication-subnet-group-id)]
      (. builder replicationSubnetGroupId data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-replication-config-props-builder
  "The cfn-replication-config-props-builder function buildes out new instances of 
CfnReplicationConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeConfig` | software.amazon.awscdk.services.dms.CfnReplicationConfig$ComputeConfigProperty | [[cdk.support/lookup-entry]] | `:compute-config` |
| `replicationConfigIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-config-identifier` |
| `replicationSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:replication-settings` |
| `replicationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-type` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `sourceEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-endpoint-arn` |
| `supplementalSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:supplemental-settings` |
| `tableMappings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:table-mappings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-endpoint-arn` |"
  [stack id config]
  (let [builder (CfnReplicationConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-config)]
      (. builder computeConfig data))
    (when-let [data (lookup-entry config id :replication-config-identifier)]
      (. builder replicationConfigIdentifier data))
    (when-let [data (lookup-entry config id :replication-settings)]
      (. builder replicationSettings data))
    (when-let [data (lookup-entry config id :replication-type)]
      (. builder replicationType data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :source-endpoint-arn)]
      (. builder sourceEndpointArn data))
    (when-let [data (lookup-entry config id :supplemental-settings)]
      (. builder supplementalSettings data))
    (when-let [data (lookup-entry config id :table-mappings)]
      (. builder tableMappings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-endpoint-arn)]
      (. builder targetEndpointArn data))
    (.build builder)))


(defn cfn-replication-instance-builder
  "The cfn-replication-instance-builder function buildes out new instances of 
CfnReplicationInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `multiAz` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-az` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `replicationInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-instance-class` |
| `replicationInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-instance-identifier` |
| `replicationSubnetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-subnet-group-identifier` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnReplicationInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :replication-instance-class)]
      (. builder replicationInstanceClass data))
    (when-let [data (lookup-entry config id :replication-instance-identifier)]
      (. builder replicationInstanceIdentifier data))
    (when-let [data (lookup-entry config id :replication-subnet-group-identifier)]
      (. builder replicationSubnetGroupIdentifier data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-replication-instance-props-builder
  "The cfn-replication-instance-props-builder function buildes out new instances of 
CfnReplicationInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `multiAz` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-az` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `replicationInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-instance-class` |
| `replicationInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-instance-identifier` |
| `replicationSubnetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-subnet-group-identifier` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnReplicationInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :replication-instance-class)]
      (. builder replicationInstanceClass data))
    (when-let [data (lookup-entry config id :replication-instance-identifier)]
      (. builder replicationInstanceIdentifier data))
    (when-let [data (lookup-entry config id :replication-subnet-group-identifier)]
      (. builder replicationSubnetGroupIdentifier data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-replication-subnet-group-builder
  "The cfn-replication-subnet-group-builder function buildes out new instances of 
CfnReplicationSubnetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-subnet-group-description` |
| `replicationSubnetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-subnet-group-identifier` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnReplicationSubnetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :replication-subnet-group-description)]
      (. builder replicationSubnetGroupDescription data))
    (when-let [data (lookup-entry config id :replication-subnet-group-identifier)]
      (. builder replicationSubnetGroupIdentifier data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-replication-subnet-group-props-builder
  "The cfn-replication-subnet-group-props-builder function buildes out new instances of 
CfnReplicationSubnetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-subnet-group-description` |
| `replicationSubnetGroupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-subnet-group-identifier` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnReplicationSubnetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :replication-subnet-group-description)]
      (. builder replicationSubnetGroupDescription data))
    (when-let [data (lookup-entry config id :replication-subnet-group-identifier)]
      (. builder replicationSubnetGroupIdentifier data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-replication-task-builder
  "The cfn-replication-task-builder function buildes out new instances of 
CfnReplicationTask$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cdcStartPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdc-start-position` |
| `cdcStartTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cdc-start-time` |
| `cdcStopPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdc-stop-position` |
| `migrationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:migration-type` |
| `replicationInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-instance-arn` |
| `replicationTaskIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-task-identifier` |
| `replicationTaskSettings` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-task-settings` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `sourceEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-endpoint-arn` |
| `tableMappings` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-mappings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-endpoint-arn` |
| `taskData` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-data` |"
  [stack id config]
  (let [builder (CfnReplicationTask$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cdc-start-position)]
      (. builder cdcStartPosition data))
    (when-let [data (lookup-entry config id :cdc-start-time)]
      (. builder cdcStartTime data))
    (when-let [data (lookup-entry config id :cdc-stop-position)]
      (. builder cdcStopPosition data))
    (when-let [data (lookup-entry config id :migration-type)]
      (. builder migrationType data))
    (when-let [data (lookup-entry config id :replication-instance-arn)]
      (. builder replicationInstanceArn data))
    (when-let [data (lookup-entry config id :replication-task-identifier)]
      (. builder replicationTaskIdentifier data))
    (when-let [data (lookup-entry config id :replication-task-settings)]
      (. builder replicationTaskSettings data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :source-endpoint-arn)]
      (. builder sourceEndpointArn data))
    (when-let [data (lookup-entry config id :table-mappings)]
      (. builder tableMappings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-endpoint-arn)]
      (. builder targetEndpointArn data))
    (when-let [data (lookup-entry config id :task-data)]
      (. builder taskData data))
    (.build builder)))


(defn cfn-replication-task-props-builder
  "The cfn-replication-task-props-builder function buildes out new instances of 
CfnReplicationTaskProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cdcStartPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdc-start-position` |
| `cdcStartTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cdc-start-time` |
| `cdcStopPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdc-stop-position` |
| `migrationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:migration-type` |
| `replicationInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-instance-arn` |
| `replicationTaskIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-task-identifier` |
| `replicationTaskSettings` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-task-settings` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `sourceEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-endpoint-arn` |
| `tableMappings` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-mappings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-endpoint-arn` |
| `taskData` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-data` |"
  [stack id config]
  (let [builder (CfnReplicationTaskProps$Builder.)]
    (when-let [data (lookup-entry config id :cdc-start-position)]
      (. builder cdcStartPosition data))
    (when-let [data (lookup-entry config id :cdc-start-time)]
      (. builder cdcStartTime data))
    (when-let [data (lookup-entry config id :cdc-stop-position)]
      (. builder cdcStopPosition data))
    (when-let [data (lookup-entry config id :migration-type)]
      (. builder migrationType data))
    (when-let [data (lookup-entry config id :replication-instance-arn)]
      (. builder replicationInstanceArn data))
    (when-let [data (lookup-entry config id :replication-task-identifier)]
      (. builder replicationTaskIdentifier data))
    (when-let [data (lookup-entry config id :replication-task-settings)]
      (. builder replicationTaskSettings data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :source-endpoint-arn)]
      (. builder sourceEndpointArn data))
    (when-let [data (lookup-entry config id :table-mappings)]
      (. builder tableMappings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-endpoint-arn)]
      (. builder targetEndpointArn data))
    (when-let [data (lookup-entry config id :task-data)]
      (. builder taskData data))
    (.build builder)))