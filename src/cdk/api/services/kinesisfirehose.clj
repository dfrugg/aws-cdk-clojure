(ns cdk.api.services.kinesisfirehose
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kinesisfirehose package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kinesisfirehose CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty$Builder
                                                            CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$AmazonOpenSearchServerlessRetryOptionsProperty$Builder
                                                            CfnDeliveryStream$AmazonopensearchserviceBufferingHintsProperty$Builder
                                                            CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty$Builder
                                                            CfnDeliveryStream$AuthenticationConfigurationProperty$Builder
                                                            CfnDeliveryStream$BufferingHintsProperty$Builder
                                                            CfnDeliveryStream$Builder
                                                            CfnDeliveryStream$CloudWatchLoggingOptionsProperty$Builder
                                                            CfnDeliveryStream$CopyCommandProperty$Builder
                                                            CfnDeliveryStream$DataFormatConversionConfigurationProperty$Builder
                                                            CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty$Builder
                                                            CfnDeliveryStream$DeserializerProperty$Builder
                                                            CfnDeliveryStream$DocumentIdOptionsProperty$Builder
                                                            CfnDeliveryStream$DynamicPartitioningConfigurationProperty$Builder
                                                            CfnDeliveryStream$ElasticsearchBufferingHintsProperty$Builder
                                                            CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$ElasticsearchRetryOptionsProperty$Builder
                                                            CfnDeliveryStream$EncryptionConfigurationProperty$Builder
                                                            CfnDeliveryStream$ExtendedS3DestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$HiveJsonSerDeProperty$Builder
                                                            CfnDeliveryStream$HttpEndpointCommonAttributeProperty$Builder
                                                            CfnDeliveryStream$HttpEndpointConfigurationProperty$Builder
                                                            CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$HttpEndpointRequestConfigurationProperty$Builder
                                                            CfnDeliveryStream$InputFormatConfigurationProperty$Builder
                                                            CfnDeliveryStream$KMSEncryptionConfigProperty$Builder
                                                            CfnDeliveryStream$KinesisStreamSourceConfigurationProperty$Builder
                                                            CfnDeliveryStream$MSKSourceConfigurationProperty$Builder
                                                            CfnDeliveryStream$OpenXJsonSerDeProperty$Builder
                                                            CfnDeliveryStream$OrcSerDeProperty$Builder
                                                            CfnDeliveryStream$OutputFormatConfigurationProperty$Builder
                                                            CfnDeliveryStream$ParquetSerDeProperty$Builder
                                                            CfnDeliveryStream$ProcessingConfigurationProperty$Builder
                                                            CfnDeliveryStream$ProcessorParameterProperty$Builder
                                                            CfnDeliveryStream$ProcessorProperty$Builder
                                                            CfnDeliveryStream$RedshiftDestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$RedshiftRetryOptionsProperty$Builder
                                                            CfnDeliveryStream$RetryOptionsProperty$Builder
                                                            CfnDeliveryStream$S3DestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$SchemaConfigurationProperty$Builder
                                                            CfnDeliveryStream$SerializerProperty$Builder
                                                            CfnDeliveryStream$SnowflakeDestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$SnowflakeRetryOptionsProperty$Builder
                                                            CfnDeliveryStream$SnowflakeRoleConfigurationProperty$Builder
                                                            CfnDeliveryStream$SnowflakeVpcConfigurationProperty$Builder
                                                            CfnDeliveryStream$SplunkBufferingHintsProperty$Builder
                                                            CfnDeliveryStream$SplunkDestinationConfigurationProperty$Builder
                                                            CfnDeliveryStream$SplunkRetryOptionsProperty$Builder
                                                            CfnDeliveryStream$VpcConfigurationProperty$Builder
                                                            CfnDeliveryStreamProps$Builder]))


(defn cfn-delivery-stream-amazon-open-search-serverless-buffering-hints-property-builder
  "The cfn-delivery-stream-amazon-open-search-serverless-buffering-hints-property-builder function buildes out new instances of 
CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :interval-in-seconds)]
      (. builder intervalInSeconds data))
    (when-let [data (lookup-entry config id :size-in-m-bs)]
      (. builder sizeInMBs data))
    (.build builder)))


(defn cfn-delivery-stream-amazon-open-search-serverless-destination-configuration-property-builder
  "The cfn-delivery-stream-amazon-open-search-serverless-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bufferingHints` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty | [[cdk.support/lookup-entry]] | `:buffering-hints` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `collectionEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-endpoint` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `processingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processing-configuration` |
| `retryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-options` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |
| `s3Configuration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :buffering-hints)]
      (. builder bufferingHints data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :collection-endpoint)]
      (. builder collectionEndpoint data))
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :processing-configuration)]
      (. builder processingConfiguration data))
    (when-let [data (lookup-entry config id :retry-options)]
      (. builder retryOptions data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-backup-mode)]
      (. builder s3BackupMode data))
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-delivery-stream-amazon-open-search-serverless-retry-options-property-builder
  "The cfn-delivery-stream-amazon-open-search-serverless-retry-options-property-builder function buildes out new instances of 
CfnDeliveryStream$AmazonOpenSearchServerlessRetryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$AmazonOpenSearchServerlessRetryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (.build builder)))


(defn cfn-delivery-stream-amazonopensearchservice-buffering-hints-property-builder
  "The cfn-delivery-stream-amazonopensearchservice-buffering-hints-property-builder function buildes out new instances of 
CfnDeliveryStream$AmazonopensearchserviceBufferingHintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$AmazonopensearchserviceBufferingHintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :interval-in-seconds)]
      (. builder intervalInSeconds data))
    (when-let [data (lookup-entry config id :size-in-m-bs)]
      (. builder sizeInMBs data))
    (.build builder)))


(defn cfn-delivery-stream-amazonopensearchservice-destination-configuration-property-builder
  "The cfn-delivery-stream-amazonopensearchservice-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bufferingHints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:buffering-hints` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$CloudWatchLoggingOptionsProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `clusterEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint` |
| `documentIdOptions` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$DocumentIdOptionsProperty | [[cdk.support/lookup-entry]] | `:document-id-options` |
| `domainArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-arn` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `indexRotationPeriod` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-rotation-period` |
| `processingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processing-configuration` |
| `retryOptions` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty | [[cdk.support/lookup-entry]] | `:retry-options` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |
| `s3Configuration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :buffering-hints)]
      (. builder bufferingHints data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :cluster-endpoint)]
      (. builder clusterEndpoint data))
    (when-let [data (lookup-entry config id :document-id-options)]
      (. builder documentIdOptions data))
    (when-let [data (lookup-entry config id :domain-arn)]
      (. builder domainArn data))
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :index-rotation-period)]
      (. builder indexRotationPeriod data))
    (when-let [data (lookup-entry config id :processing-configuration)]
      (. builder processingConfiguration data))
    (when-let [data (lookup-entry config id :retry-options)]
      (. builder retryOptions data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-backup-mode)]
      (. builder s3BackupMode data))
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-delivery-stream-amazonopensearchservice-retry-options-property-builder
  "The cfn-delivery-stream-amazonopensearchservice-retry-options-property-builder function buildes out new instances of 
CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (.build builder)))


(defn cfn-delivery-stream-authentication-configuration-property-builder
  "The cfn-delivery-stream-authentication-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$AuthenticationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectivity` | java.lang.String | [[cdk.support/lookup-entry]] | `:connectivity` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$AuthenticationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :connectivity)]
      (. builder connectivity data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-delivery-stream-buffering-hints-property-builder
  "The cfn-delivery-stream-buffering-hints-property-builder function buildes out new instances of 
CfnDeliveryStream$BufferingHintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$BufferingHintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :interval-in-seconds)]
      (. builder intervalInSeconds data))
    (when-let [data (lookup-entry config id :size-in-m-bs)]
      (. builder sizeInMBs data))
    (.build builder)))


(defn cfn-delivery-stream-builder
  "The cfn-delivery-stream-builder function buildes out new instances of 
CfnDeliveryStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonOpenSearchServerlessDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:amazon-open-search-serverless-destination-configuration` |
| `amazonopensearchserviceDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:amazonopensearchservice-destination-configuration` |
| `deliveryStreamEncryptionConfigurationInput` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty | [[cdk.support/lookup-entry]] | `:delivery-stream-encryption-configuration-input` |
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
| `deliveryStreamType` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-type` |
| `elasticsearchDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:elasticsearch-destination-configuration` |
| `extendedS3DestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:extended-s3-destination-configuration` |
| `httpEndpointDestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-endpoint-destination-configuration` |
| `kinesisStreamSourceConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$KinesisStreamSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:kinesis-stream-source-configuration` |
| `mskSourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:msk-source-configuration` |
| `redshiftDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$RedshiftDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:redshift-destination-configuration` |
| `s3DestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-destination-configuration` |
| `snowflakeDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$SnowflakeDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:snowflake-destination-configuration` |
| `splunkDestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:splunk-destination-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$Builder/create stack id)]
    (when-let [data (lookup-entry config id :amazon-open-search-serverless-destination-configuration)]
      (. builder amazonOpenSearchServerlessDestinationConfiguration data))
    (when-let [data (lookup-entry config id :amazonopensearchservice-destination-configuration)]
      (. builder amazonopensearchserviceDestinationConfiguration data))
    (when-let [data (lookup-entry config id :delivery-stream-encryption-configuration-input)]
      (. builder deliveryStreamEncryptionConfigurationInput data))
    (when-let [data (lookup-entry config id :delivery-stream-name)]
      (. builder deliveryStreamName data))
    (when-let [data (lookup-entry config id :delivery-stream-type)]
      (. builder deliveryStreamType data))
    (when-let [data (lookup-entry config id :elasticsearch-destination-configuration)]
      (. builder elasticsearchDestinationConfiguration data))
    (when-let [data (lookup-entry config id :extended-s3-destination-configuration)]
      (. builder extendedS3DestinationConfiguration data))
    (when-let [data (lookup-entry config id :http-endpoint-destination-configuration)]
      (. builder httpEndpointDestinationConfiguration data))
    (when-let [data (lookup-entry config id :kinesis-stream-source-configuration)]
      (. builder kinesisStreamSourceConfiguration data))
    (when-let [data (lookup-entry config id :msk-source-configuration)]
      (. builder mskSourceConfiguration data))
    (when-let [data (lookup-entry config id :redshift-destination-configuration)]
      (. builder redshiftDestinationConfiguration data))
    (when-let [data (lookup-entry config id :s3-destination-configuration)]
      (. builder s3DestinationConfiguration data))
    (when-let [data (lookup-entry config id :snowflake-destination-configuration)]
      (. builder snowflakeDestinationConfiguration data))
    (when-let [data (lookup-entry config id :splunk-destination-configuration)]
      (. builder splunkDestinationConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-delivery-stream-cloud-watch-logging-options-property-builder
  "The cfn-delivery-stream-cloud-watch-logging-options-property-builder function buildes out new instances of 
CfnDeliveryStream$CloudWatchLoggingOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$CloudWatchLoggingOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-stream-name)]
      (. builder logStreamName data))
    (.build builder)))


(defn cfn-delivery-stream-copy-command-property-builder
  "The cfn-delivery-stream-copy-command-property-builder function buildes out new instances of 
CfnDeliveryStream$CopyCommandProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyOptions` | java.lang.String | [[cdk.support/lookup-entry]] | `:copy-options` |
| `dataTableColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-table-columns` |
| `dataTableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-table-name` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$CopyCommandProperty$Builder.)]
    (when-let [data (lookup-entry config id :copy-options)]
      (. builder copyOptions data))
    (when-let [data (lookup-entry config id :data-table-columns)]
      (. builder dataTableColumns data))
    (when-let [data (lookup-entry config id :data-table-name)]
      (. builder dataTableName data))
    (.build builder)))


(defn cfn-delivery-stream-data-format-conversion-configuration-property-builder
  "The cfn-delivery-stream-data-format-conversion-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$DataFormatConversionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `inputFormatConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$InputFormatConfigurationProperty | [[cdk.support/lookup-entry]] | `:input-format-configuration` |
| `outputFormatConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-format-configuration` |
| `schemaConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$SchemaConfigurationProperty | [[cdk.support/lookup-entry]] | `:schema-configuration` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$DataFormatConversionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :input-format-configuration)]
      (. builder inputFormatConfiguration data))
    (when-let [data (lookup-entry config id :output-format-configuration)]
      (. builder outputFormatConfiguration data))
    (when-let [data (lookup-entry config id :schema-configuration)]
      (. builder schemaConfiguration data))
    (.build builder)))


(defn cfn-delivery-stream-delivery-stream-encryption-configuration-input-property-builder
  "The cfn-delivery-stream-delivery-stream-encryption-configuration-input-property-builder function buildes out new instances of 
CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (.build builder)))


(defn cfn-delivery-stream-deserializer-property-builder
  "The cfn-delivery-stream-deserializer-property-builder function buildes out new instances of 
CfnDeliveryStream$DeserializerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hiveJsonSerDe` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$HiveJsonSerDeProperty | [[cdk.support/lookup-entry]] | `:hive-json-ser-de` |
| `openXJsonSerDe` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:open-x-json-ser-de` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$DeserializerProperty$Builder.)]
    (when-let [data (lookup-entry config id :hive-json-ser-de)]
      (. builder hiveJsonSerDe data))
    (when-let [data (lookup-entry config id :open-x-json-ser-de)]
      (. builder openXJsonSerDe data))
    (.build builder)))


(defn cfn-delivery-stream-document-id-options-property-builder
  "The cfn-delivery-stream-document-id-options-property-builder function buildes out new instances of 
CfnDeliveryStream$DocumentIdOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultDocumentIdFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-document-id-format` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$DocumentIdOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-document-id-format)]
      (. builder defaultDocumentIdFormat data))
    (.build builder)))


(defn cfn-delivery-stream-dynamic-partitioning-configuration-property-builder
  "The cfn-delivery-stream-dynamic-partitioning-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$DynamicPartitioningConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `retryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-options` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$DynamicPartitioningConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :retry-options)]
      (. builder retryOptions data))
    (.build builder)))


(defn cfn-delivery-stream-elasticsearch-buffering-hints-property-builder
  "The cfn-delivery-stream-elasticsearch-buffering-hints-property-builder function buildes out new instances of 
CfnDeliveryStream$ElasticsearchBufferingHintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$ElasticsearchBufferingHintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :interval-in-seconds)]
      (. builder intervalInSeconds data))
    (when-let [data (lookup-entry config id :size-in-m-bs)]
      (. builder sizeInMBs data))
    (.build builder)))


(defn cfn-delivery-stream-elasticsearch-destination-configuration-property-builder
  "The cfn-delivery-stream-elasticsearch-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bufferingHints` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$ElasticsearchBufferingHintsProperty | [[cdk.support/lookup-entry]] | `:buffering-hints` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `clusterEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint` |
| `documentIdOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:document-id-options` |
| `domainArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-arn` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `indexRotationPeriod` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-rotation-period` |
| `processingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processing-configuration` |
| `retryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-options` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |
| `s3Configuration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `vpcConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :buffering-hints)]
      (. builder bufferingHints data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :cluster-endpoint)]
      (. builder clusterEndpoint data))
    (when-let [data (lookup-entry config id :document-id-options)]
      (. builder documentIdOptions data))
    (when-let [data (lookup-entry config id :domain-arn)]
      (. builder domainArn data))
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :index-rotation-period)]
      (. builder indexRotationPeriod data))
    (when-let [data (lookup-entry config id :processing-configuration)]
      (. builder processingConfiguration data))
    (when-let [data (lookup-entry config id :retry-options)]
      (. builder retryOptions data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-backup-mode)]
      (. builder s3BackupMode data))
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-delivery-stream-elasticsearch-retry-options-property-builder
  "The cfn-delivery-stream-elasticsearch-retry-options-property-builder function buildes out new instances of 
CfnDeliveryStream$ElasticsearchRetryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$ElasticsearchRetryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (.build builder)))


(defn cfn-delivery-stream-encryption-configuration-property-builder
  "The cfn-delivery-stream-encryption-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsEncryptionConfig` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$KMSEncryptionConfigProperty | [[cdk.support/lookup-entry]] | `:kms-encryption-config` |
| `noEncryptionConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-encryption-config` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-encryption-config)]
      (. builder kmsEncryptionConfig data))
    (when-let [data (lookup-entry config id :no-encryption-config)]
      (. builder noEncryptionConfig data))
    (.build builder)))


(defn cfn-delivery-stream-extended-s3-destination-configuration-property-builder
  "The cfn-delivery-stream-extended-s3-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$ExtendedS3DestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `bufferingHints` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$BufferingHintsProperty | [[cdk.support/lookup-entry]] | `:buffering-hints` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `compressionFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-format` |
| `customTimeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-time-zone` |
| `dataFormatConversionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-format-conversion-configuration` |
| `dynamicPartitioningConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamic-partitioning-configuration` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `errorOutputPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-output-prefix` |
| `fileExtension` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-extension` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `processingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processing-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BackupConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-backup-configuration` |
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$ExtendedS3DestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (when-let [data (lookup-entry config id :buffering-hints)]
      (. builder bufferingHints data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :compression-format)]
      (. builder compressionFormat data))
    (when-let [data (lookup-entry config id :custom-time-zone)]
      (. builder customTimeZone data))
    (when-let [data (lookup-entry config id :data-format-conversion-configuration)]
      (. builder dataFormatConversionConfiguration data))
    (when-let [data (lookup-entry config id :dynamic-partitioning-configuration)]
      (. builder dynamicPartitioningConfiguration data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :error-output-prefix)]
      (. builder errorOutputPrefix data))
    (when-let [data (lookup-entry config id :file-extension)]
      (. builder fileExtension data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :processing-configuration)]
      (. builder processingConfiguration data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-backup-configuration)]
      (. builder s3BackupConfiguration data))
    (when-let [data (lookup-entry config id :s3-backup-mode)]
      (. builder s3BackupMode data))
    (.build builder)))


(defn cfn-delivery-stream-hive-json-ser-de-property-builder
  "The cfn-delivery-stream-hive-json-ser-de-property-builder function buildes out new instances of 
CfnDeliveryStream$HiveJsonSerDeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timestampFormats` | java.util.List | [[cdk.support/lookup-entry]] | `:timestamp-formats` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$HiveJsonSerDeProperty$Builder.)]
    (when-let [data (lookup-entry config id :timestamp-formats)]
      (. builder timestampFormats data))
    (.build builder)))


(defn cfn-delivery-stream-http-endpoint-common-attribute-property-builder
  "The cfn-delivery-stream-http-endpoint-common-attribute-property-builder function buildes out new instances of 
CfnDeliveryStream$HttpEndpointCommonAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `attributeValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-value` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$HttpEndpointCommonAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :attribute-value)]
      (. builder attributeValue data))
    (.build builder)))


(defn cfn-delivery-stream-http-endpoint-configuration-property-builder
  "The cfn-delivery-stream-http-endpoint-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$HttpEndpointConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$HttpEndpointConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-key)]
      (. builder accessKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-delivery-stream-http-endpoint-destination-configuration-property-builder
  "The cfn-delivery-stream-http-endpoint-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bufferingHints` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$BufferingHintsProperty | [[cdk.support/lookup-entry]] | `:buffering-hints` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$CloudWatchLoggingOptionsProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `endpointConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-configuration` |
| `processingConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$ProcessingConfigurationProperty | [[cdk.support/lookup-entry]] | `:processing-configuration` |
| `requestConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-configuration` |
| `retryOptions` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$RetryOptionsProperty | [[cdk.support/lookup-entry]] | `:retry-options` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |
| `s3Configuration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :buffering-hints)]
      (. builder bufferingHints data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :endpoint-configuration)]
      (. builder endpointConfiguration data))
    (when-let [data (lookup-entry config id :processing-configuration)]
      (. builder processingConfiguration data))
    (when-let [data (lookup-entry config id :request-configuration)]
      (. builder requestConfiguration data))
    (when-let [data (lookup-entry config id :retry-options)]
      (. builder retryOptions data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-backup-mode)]
      (. builder s3BackupMode data))
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (.build builder)))


(defn cfn-delivery-stream-http-endpoint-request-configuration-property-builder
  "The cfn-delivery-stream-http-endpoint-request-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$HttpEndpointRequestConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `commonAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:common-attributes` |
| `contentEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-encoding` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$HttpEndpointRequestConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :common-attributes)]
      (. builder commonAttributes data))
    (when-let [data (lookup-entry config id :content-encoding)]
      (. builder contentEncoding data))
    (.build builder)))


(defn cfn-delivery-stream-input-format-configuration-property-builder
  "The cfn-delivery-stream-input-format-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$InputFormatConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deserializer` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$DeserializerProperty | [[cdk.support/lookup-entry]] | `:deserializer` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$InputFormatConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :deserializer)]
      (. builder deserializer data))
    (.build builder)))


(defn cfn-delivery-stream-kinesis-stream-source-configuration-property-builder
  "The cfn-delivery-stream-kinesis-stream-source-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$KinesisStreamSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kinesisStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kinesis-stream-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$KinesisStreamSourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kinesis-stream-arn)]
      (. builder kinesisStreamArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-delivery-stream-kms-encryption-config-property-builder
  "The cfn-delivery-stream-kms-encryption-config-property-builder function buildes out new instances of 
CfnDeliveryStream$KMSEncryptionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awskmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:awskms-key-arn` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$KMSEncryptionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :awskms-key-arn)]
      (. builder awskmsKeyArn data))
    (.build builder)))


(defn cfn-delivery-stream-msk-source-configuration-property-builder
  "The cfn-delivery-stream-msk-source-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$MSKSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `mskClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:msk-cluster-arn` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$MSKSourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-configuration)]
      (. builder authenticationConfiguration data))
    (when-let [data (lookup-entry config id :msk-cluster-arn)]
      (. builder mskClusterArn data))
    (when-let [data (lookup-entry config id :topic-name)]
      (. builder topicName data))
    (.build builder)))


(defn cfn-delivery-stream-open-x-json-ser-de-property-builder
  "The cfn-delivery-stream-open-x-json-ser-de-property-builder function buildes out new instances of 
CfnDeliveryStream$OpenXJsonSerDeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caseInsensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:case-insensitive` |
| `columnToJsonKeyMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-to-json-key-mappings` |
| `convertDotsInJsonKeysToUnderscores` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:convert-dots-in-json-keys-to-underscores` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$OpenXJsonSerDeProperty$Builder.)]
    (when-let [data (lookup-entry config id :case-insensitive)]
      (. builder caseInsensitive data))
    (when-let [data (lookup-entry config id :column-to-json-key-mappings)]
      (. builder columnToJsonKeyMappings data))
    (when-let [data (lookup-entry config id :convert-dots-in-json-keys-to-underscores)]
      (. builder convertDotsInJsonKeysToUnderscores data))
    (.build builder)))


(defn cfn-delivery-stream-orc-ser-de-property-builder
  "The cfn-delivery-stream-orc-ser-de-property-builder function buildes out new instances of 
CfnDeliveryStream$OrcSerDeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-size-bytes` |
| `bloomFilterColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:bloom-filter-columns` |
| `bloomFilterFalsePositiveProbability` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bloom-filter-false-positive-probability` |
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `dictionaryKeyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dictionary-key-threshold` |
| `enablePadding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-padding` |
| `formatVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:format-version` |
| `paddingTolerance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:padding-tolerance` |
| `rowIndexStride` | java.lang.Number | [[cdk.support/lookup-entry]] | `:row-index-stride` |
| `stripeSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stripe-size-bytes` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$OrcSerDeProperty$Builder.)]
    (when-let [data (lookup-entry config id :block-size-bytes)]
      (. builder blockSizeBytes data))
    (when-let [data (lookup-entry config id :bloom-filter-columns)]
      (. builder bloomFilterColumns data))
    (when-let [data (lookup-entry config id :bloom-filter-false-positive-probability)]
      (. builder bloomFilterFalsePositiveProbability data))
    (when-let [data (lookup-entry config id :compression)]
      (. builder compression data))
    (when-let [data (lookup-entry config id :dictionary-key-threshold)]
      (. builder dictionaryKeyThreshold data))
    (when-let [data (lookup-entry config id :enable-padding)]
      (. builder enablePadding data))
    (when-let [data (lookup-entry config id :format-version)]
      (. builder formatVersion data))
    (when-let [data (lookup-entry config id :padding-tolerance)]
      (. builder paddingTolerance data))
    (when-let [data (lookup-entry config id :row-index-stride)]
      (. builder rowIndexStride data))
    (when-let [data (lookup-entry config id :stripe-size-bytes)]
      (. builder stripeSizeBytes data))
    (.build builder)))


(defn cfn-delivery-stream-output-format-configuration-property-builder
  "The cfn-delivery-stream-output-format-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$OutputFormatConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serializer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:serializer` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$OutputFormatConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :serializer)]
      (. builder serializer data))
    (.build builder)))


(defn cfn-delivery-stream-parquet-ser-de-property-builder
  "The cfn-delivery-stream-parquet-ser-de-property-builder function buildes out new instances of 
CfnDeliveryStream$ParquetSerDeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-size-bytes` |
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `enableDictionaryCompression` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dictionary-compression` |
| `maxPaddingBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-padding-bytes` |
| `pageSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:page-size-bytes` |
| `writerVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:writer-version` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$ParquetSerDeProperty$Builder.)]
    (when-let [data (lookup-entry config id :block-size-bytes)]
      (. builder blockSizeBytes data))
    (when-let [data (lookup-entry config id :compression)]
      (. builder compression data))
    (when-let [data (lookup-entry config id :enable-dictionary-compression)]
      (. builder enableDictionaryCompression data))
    (when-let [data (lookup-entry config id :max-padding-bytes)]
      (. builder maxPaddingBytes data))
    (when-let [data (lookup-entry config id :page-size-bytes)]
      (. builder pageSizeBytes data))
    (when-let [data (lookup-entry config id :writer-version)]
      (. builder writerVersion data))
    (.build builder)))


(defn cfn-delivery-stream-processing-configuration-property-builder
  "The cfn-delivery-stream-processing-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$ProcessingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `processors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processors` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$ProcessingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :processors)]
      (. builder processors data))
    (.build builder)))


(defn cfn-delivery-stream-processor-parameter-property-builder
  "The cfn-delivery-stream-processor-parameter-property-builder function buildes out new instances of 
CfnDeliveryStream$ProcessorParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$ProcessorParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-delivery-stream-processor-property-builder
  "The cfn-delivery-stream-processor-property-builder function buildes out new instances of 
CfnDeliveryStream$ProcessorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$ProcessorProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-delivery-stream-props-builder
  "The cfn-delivery-stream-props-builder function buildes out new instances of 
CfnDeliveryStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonOpenSearchServerlessDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:amazon-open-search-serverless-destination-configuration` |
| `amazonopensearchserviceDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:amazonopensearchservice-destination-configuration` |
| `deliveryStreamEncryptionConfigurationInput` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty | [[cdk.support/lookup-entry]] | `:delivery-stream-encryption-configuration-input` |
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
| `deliveryStreamType` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-type` |
| `elasticsearchDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:elasticsearch-destination-configuration` |
| `extendedS3DestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:extended-s3-destination-configuration` |
| `httpEndpointDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:http-endpoint-destination-configuration` |
| `kinesisStreamSourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-stream-source-configuration` |
| `mskSourceConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$MSKSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:msk-source-configuration` |
| `redshiftDestinationConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$RedshiftDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:redshift-destination-configuration` |
| `s3DestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-destination-configuration` |
| `snowflakeDestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snowflake-destination-configuration` |
| `splunkDestinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:splunk-destination-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeliveryStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :amazon-open-search-serverless-destination-configuration)]
      (. builder amazonOpenSearchServerlessDestinationConfiguration data))
    (when-let [data (lookup-entry config id :amazonopensearchservice-destination-configuration)]
      (. builder amazonopensearchserviceDestinationConfiguration data))
    (when-let [data (lookup-entry config id :delivery-stream-encryption-configuration-input)]
      (. builder deliveryStreamEncryptionConfigurationInput data))
    (when-let [data (lookup-entry config id :delivery-stream-name)]
      (. builder deliveryStreamName data))
    (when-let [data (lookup-entry config id :delivery-stream-type)]
      (. builder deliveryStreamType data))
    (when-let [data (lookup-entry config id :elasticsearch-destination-configuration)]
      (. builder elasticsearchDestinationConfiguration data))
    (when-let [data (lookup-entry config id :extended-s3-destination-configuration)]
      (. builder extendedS3DestinationConfiguration data))
    (when-let [data (lookup-entry config id :http-endpoint-destination-configuration)]
      (. builder httpEndpointDestinationConfiguration data))
    (when-let [data (lookup-entry config id :kinesis-stream-source-configuration)]
      (. builder kinesisStreamSourceConfiguration data))
    (when-let [data (lookup-entry config id :msk-source-configuration)]
      (. builder mskSourceConfiguration data))
    (when-let [data (lookup-entry config id :redshift-destination-configuration)]
      (. builder redshiftDestinationConfiguration data))
    (when-let [data (lookup-entry config id :s3-destination-configuration)]
      (. builder s3DestinationConfiguration data))
    (when-let [data (lookup-entry config id :snowflake-destination-configuration)]
      (. builder snowflakeDestinationConfiguration data))
    (when-let [data (lookup-entry config id :splunk-destination-configuration)]
      (. builder splunkDestinationConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-delivery-stream-redshift-destination-configuration-property-builder
  "The cfn-delivery-stream-redshift-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$RedshiftDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLoggingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `clusterJdbcurl` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-jdbcurl` |
| `copyCommand` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-command` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `processingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processing-configuration` |
| `retryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-options` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BackupConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-backup-configuration` |
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |
| `s3Configuration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$RedshiftDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :cluster-jdbcurl)]
      (. builder clusterJdbcurl data))
    (when-let [data (lookup-entry config id :copy-command)]
      (. builder copyCommand data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :processing-configuration)]
      (. builder processingConfiguration data))
    (when-let [data (lookup-entry config id :retry-options)]
      (. builder retryOptions data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-backup-configuration)]
      (. builder s3BackupConfiguration data))
    (when-let [data (lookup-entry config id :s3-backup-mode)]
      (. builder s3BackupMode data))
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-delivery-stream-redshift-retry-options-property-builder
  "The cfn-delivery-stream-redshift-retry-options-property-builder function buildes out new instances of 
CfnDeliveryStream$RedshiftRetryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$RedshiftRetryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (.build builder)))


(defn cfn-delivery-stream-retry-options-property-builder
  "The cfn-delivery-stream-retry-options-property-builder function buildes out new instances of 
CfnDeliveryStream$RetryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$RetryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (.build builder)))


(defn cfn-delivery-stream-s3-destination-configuration-property-builder
  "The cfn-delivery-stream-s3-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$S3DestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `bufferingHints` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$BufferingHintsProperty | [[cdk.support/lookup-entry]] | `:buffering-hints` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$CloudWatchLoggingOptionsProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `compressionFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-format` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `errorOutputPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-output-prefix` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$S3DestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (when-let [data (lookup-entry config id :buffering-hints)]
      (. builder bufferingHints data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :compression-format)]
      (. builder compressionFormat data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :error-output-prefix)]
      (. builder errorOutputPrefix data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-delivery-stream-schema-configuration-property-builder
  "The cfn-delivery-stream-schema-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$SchemaConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SchemaConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-delivery-stream-serializer-property-builder
  "The cfn-delivery-stream-serializer-property-builder function buildes out new instances of 
CfnDeliveryStream$SerializerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `orcSerDe` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$OrcSerDeProperty | [[cdk.support/lookup-entry]] | `:orc-ser-de` |
| `parquetSerDe` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet-ser-de` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SerializerProperty$Builder.)]
    (when-let [data (lookup-entry config id :orc-ser-de)]
      (. builder orcSerDe data))
    (when-let [data (lookup-entry config id :parquet-ser-de)]
      (. builder parquetSerDe data))
    (.build builder)))


(defn cfn-delivery-stream-snowflake-destination-configuration-property-builder
  "The cfn-delivery-stream-snowflake-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$SnowflakeDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-url` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$CloudWatchLoggingOptionsProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `contentColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-column-name` |
| `dataLoadingOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-loading-option` |
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `keyPassphrase` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-passphrase` |
| `metaDataColumnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:meta-data-column-name` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `processingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processing-configuration` |
| `retryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-options` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |
| `s3Configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-configuration` |
| `schema` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema` |
| `snowflakeRoleConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$SnowflakeRoleConfigurationProperty | [[cdk.support/lookup-entry]] | `:snowflake-role-configuration` |
| `snowflakeVpcConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$SnowflakeVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:snowflake-vpc-configuration` |
| `table` | java.lang.String | [[cdk.support/lookup-entry]] | `:table` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SnowflakeDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-url)]
      (. builder accountUrl data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :content-column-name)]
      (. builder contentColumnName data))
    (when-let [data (lookup-entry config id :data-loading-option)]
      (. builder dataLoadingOption data))
    (when-let [data (lookup-entry config id :database)]
      (. builder database data))
    (when-let [data (lookup-entry config id :key-passphrase)]
      (. builder keyPassphrase data))
    (when-let [data (lookup-entry config id :meta-data-column-name)]
      (. builder metaDataColumnName data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :processing-configuration)]
      (. builder processingConfiguration data))
    (when-let [data (lookup-entry config id :retry-options)]
      (. builder retryOptions data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-backup-mode)]
      (. builder s3BackupMode data))
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (lookup-entry config id :snowflake-role-configuration)]
      (. builder snowflakeRoleConfiguration data))
    (when-let [data (lookup-entry config id :snowflake-vpc-configuration)]
      (. builder snowflakeVpcConfiguration data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-delivery-stream-snowflake-retry-options-property-builder
  "The cfn-delivery-stream-snowflake-retry-options-property-builder function buildes out new instances of 
CfnDeliveryStream$SnowflakeRetryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SnowflakeRetryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (.build builder)))


(defn cfn-delivery-stream-snowflake-role-configuration-property-builder
  "The cfn-delivery-stream-snowflake-role-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$SnowflakeRoleConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `snowflakeRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:snowflake-role` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SnowflakeRoleConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :snowflake-role)]
      (. builder snowflakeRole data))
    (.build builder)))


(defn cfn-delivery-stream-snowflake-vpc-configuration-property-builder
  "The cfn-delivery-stream-snowflake-vpc-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$SnowflakeVpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `privateLinkVpceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-link-vpce-id` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SnowflakeVpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :private-link-vpce-id)]
      (. builder privateLinkVpceId data))
    (.build builder)))


(defn cfn-delivery-stream-splunk-buffering-hints-property-builder
  "The cfn-delivery-stream-splunk-buffering-hints-property-builder function buildes out new instances of 
CfnDeliveryStream$SplunkBufferingHintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SplunkBufferingHintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :interval-in-seconds)]
      (. builder intervalInSeconds data))
    (when-let [data (lookup-entry config id :size-in-m-bs)]
      (. builder sizeInMBs data))
    (.build builder)))


(defn cfn-delivery-stream-splunk-destination-configuration-property-builder
  "The cfn-delivery-stream-splunk-destination-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$SplunkDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bufferingHints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:buffering-hints` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `hecAcknowledgmentTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hec-acknowledgment-timeout-in-seconds` |
| `hecEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:hec-endpoint` |
| `hecEndpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:hec-endpoint-type` |
| `hecToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:hec-token` |
| `processingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processing-configuration` |
| `retryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-options` |
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |
| `s3Configuration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SplunkDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :buffering-hints)]
      (. builder bufferingHints data))
    (when-let [data (lookup-entry config id :cloud-watch-logging-options)]
      (. builder cloudWatchLoggingOptions data))
    (when-let [data (lookup-entry config id :hec-acknowledgment-timeout-in-seconds)]
      (. builder hecAcknowledgmentTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :hec-endpoint)]
      (. builder hecEndpoint data))
    (when-let [data (lookup-entry config id :hec-endpoint-type)]
      (. builder hecEndpointType data))
    (when-let [data (lookup-entry config id :hec-token)]
      (. builder hecToken data))
    (when-let [data (lookup-entry config id :processing-configuration)]
      (. builder processingConfiguration data))
    (when-let [data (lookup-entry config id :retry-options)]
      (. builder retryOptions data))
    (when-let [data (lookup-entry config id :s3-backup-mode)]
      (. builder s3BackupMode data))
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (.build builder)))


(defn cfn-delivery-stream-splunk-retry-options-property-builder
  "The cfn-delivery-stream-splunk-retry-options-property-builder function buildes out new instances of 
CfnDeliveryStream$SplunkRetryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$SplunkRetryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (.build builder)))


(defn cfn-delivery-stream-vpc-configuration-property-builder
  "The cfn-delivery-stream-vpc-configuration-property-builder function buildes out new instances of 
CfnDeliveryStream$VpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnDeliveryStream$VpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))