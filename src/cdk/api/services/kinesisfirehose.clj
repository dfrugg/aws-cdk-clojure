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


(defn cfn-delivery-stream-amazon-open-search-serverless-buffering-hints-property-builder>
  "The cfn-delivery-stream-amazon-open-search-serverless-buffering-hints-property-builder> function updates a CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |
"
  [^CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interval-in-seconds)]
    (. builder intervalInSeconds data))
  (when-some [data (lookup-entry config id :size-in-m-bs)]
    (. builder sizeInMBs data))
  (.build builder))


(defn cfn-delivery-stream-amazon-open-search-serverless-buffering-hints-property-builder
  "Creates a  `CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-amazon-open-search-serverless-buffering-hints-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-amazon-open-search-serverless-buffering-hints-property-builder> (new CfnDeliveryStream$AmazonOpenSearchServerlessBufferingHintsProperty$Builder) id config))


(defn cfn-delivery-stream-amazon-open-search-serverless-destination-configuration-property-builder>
  "The cfn-delivery-stream-amazon-open-search-serverless-destination-configuration-property-builder> function updates a CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :buffering-hints)]
    (. builder bufferingHints data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :collection-endpoint)]
    (. builder collectionEndpoint data))
  (when-some [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-some [data (lookup-entry config id :processing-configuration)]
    (. builder processingConfiguration data))
  (when-some [data (lookup-entry config id :retry-options)]
    (. builder retryOptions data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-backup-mode)]
    (. builder s3BackupMode data))
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (when-some [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-delivery-stream-amazon-open-search-serverless-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-amazon-open-search-serverless-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-amazon-open-search-serverless-destination-configuration-property-builder> (new CfnDeliveryStream$AmazonOpenSearchServerlessDestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-amazon-open-search-serverless-retry-options-property-builder>
  "The cfn-delivery-stream-amazon-open-search-serverless-retry-options-property-builder> function updates a CfnDeliveryStream$AmazonOpenSearchServerlessRetryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$AmazonOpenSearchServerlessRetryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
"
  [^CfnDeliveryStream$AmazonOpenSearchServerlessRetryOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (.build builder))


(defn cfn-delivery-stream-amazon-open-search-serverless-retry-options-property-builder
  "Creates a  `CfnDeliveryStream$AmazonOpenSearchServerlessRetryOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-amazon-open-search-serverless-retry-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-amazon-open-search-serverless-retry-options-property-builder> (new CfnDeliveryStream$AmazonOpenSearchServerlessRetryOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-amazonopensearchservice-buffering-hints-property-builder>
  "The cfn-delivery-stream-amazonopensearchservice-buffering-hints-property-builder> function updates a CfnDeliveryStream$AmazonopensearchserviceBufferingHintsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$AmazonopensearchserviceBufferingHintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |
"
  [^CfnDeliveryStream$AmazonopensearchserviceBufferingHintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interval-in-seconds)]
    (. builder intervalInSeconds data))
  (when-some [data (lookup-entry config id :size-in-m-bs)]
    (. builder sizeInMBs data))
  (.build builder))


(defn cfn-delivery-stream-amazonopensearchservice-buffering-hints-property-builder
  "Creates a  `CfnDeliveryStream$AmazonopensearchserviceBufferingHintsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-amazonopensearchservice-buffering-hints-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-amazonopensearchservice-buffering-hints-property-builder> (new CfnDeliveryStream$AmazonopensearchserviceBufferingHintsProperty$Builder) id config))


(defn cfn-delivery-stream-amazonopensearchservice-destination-configuration-property-builder>
  "The cfn-delivery-stream-amazonopensearchservice-destination-configuration-property-builder> function updates a CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :buffering-hints)]
    (. builder bufferingHints data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :cluster-endpoint)]
    (. builder clusterEndpoint data))
  (when-some [data (lookup-entry config id :document-id-options)]
    (. builder documentIdOptions data))
  (when-some [data (lookup-entry config id :domain-arn)]
    (. builder domainArn data))
  (when-some [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-some [data (lookup-entry config id :index-rotation-period)]
    (. builder indexRotationPeriod data))
  (when-some [data (lookup-entry config id :processing-configuration)]
    (. builder processingConfiguration data))
  (when-some [data (lookup-entry config id :retry-options)]
    (. builder retryOptions data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-backup-mode)]
    (. builder s3BackupMode data))
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-delivery-stream-amazonopensearchservice-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-amazonopensearchservice-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-amazonopensearchservice-destination-configuration-property-builder> (new CfnDeliveryStream$AmazonopensearchserviceDestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-amazonopensearchservice-retry-options-property-builder>
  "The cfn-delivery-stream-amazonopensearchservice-retry-options-property-builder> function updates a CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
"
  [^CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (.build builder))


(defn cfn-delivery-stream-amazonopensearchservice-retry-options-property-builder
  "Creates a  `CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-amazonopensearchservice-retry-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-amazonopensearchservice-retry-options-property-builder> (new CfnDeliveryStream$AmazonopensearchserviceRetryOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-authentication-configuration-property-builder>
  "The cfn-delivery-stream-authentication-configuration-property-builder> function updates a CfnDeliveryStream$AuthenticationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$AuthenticationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectivity` | java.lang.String | [[cdk.support/lookup-entry]] | `:connectivity` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDeliveryStream$AuthenticationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connectivity)]
    (. builder connectivity data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-delivery-stream-authentication-configuration-property-builder
  "Creates a  `CfnDeliveryStream$AuthenticationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-authentication-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-authentication-configuration-property-builder> (new CfnDeliveryStream$AuthenticationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-buffering-hints-property-builder>
  "The cfn-delivery-stream-buffering-hints-property-builder> function updates a CfnDeliveryStream$BufferingHintsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$BufferingHintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |
"
  [^CfnDeliveryStream$BufferingHintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interval-in-seconds)]
    (. builder intervalInSeconds data))
  (when-some [data (lookup-entry config id :size-in-m-bs)]
    (. builder sizeInMBs data))
  (.build builder))


(defn cfn-delivery-stream-buffering-hints-property-builder
  "Creates a  `CfnDeliveryStream$BufferingHintsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-buffering-hints-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-buffering-hints-property-builder> (new CfnDeliveryStream$BufferingHintsProperty$Builder) id config))


(defn cfn-delivery-stream-builder>
  "The cfn-delivery-stream-builder> function updates a CfnDeliveryStream$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeliveryStream$Builder builder id config]
  (when-some [data (lookup-entry config id :amazon-open-search-serverless-destination-configuration)]
    (. builder amazonOpenSearchServerlessDestinationConfiguration data))
  (when-some [data (lookup-entry config id :amazonopensearchservice-destination-configuration)]
    (. builder amazonopensearchserviceDestinationConfiguration data))
  (when-some [data (lookup-entry config id :delivery-stream-encryption-configuration-input)]
    (. builder deliveryStreamEncryptionConfigurationInput data))
  (when-some [data (lookup-entry config id :delivery-stream-name)]
    (. builder deliveryStreamName data))
  (when-some [data (lookup-entry config id :delivery-stream-type)]
    (. builder deliveryStreamType data))
  (when-some [data (lookup-entry config id :elasticsearch-destination-configuration)]
    (. builder elasticsearchDestinationConfiguration data))
  (when-some [data (lookup-entry config id :extended-s3-destination-configuration)]
    (. builder extendedS3DestinationConfiguration data))
  (when-some [data (lookup-entry config id :http-endpoint-destination-configuration)]
    (. builder httpEndpointDestinationConfiguration data))
  (when-some [data (lookup-entry config id :kinesis-stream-source-configuration)]
    (. builder kinesisStreamSourceConfiguration data))
  (when-some [data (lookup-entry config id :msk-source-configuration)]
    (. builder mskSourceConfiguration data))
  (when-some [data (lookup-entry config id :redshift-destination-configuration)]
    (. builder redshiftDestinationConfiguration data))
  (when-some [data (lookup-entry config id :s3-destination-configuration)]
    (. builder s3DestinationConfiguration data))
  (when-some [data (lookup-entry config id :snowflake-destination-configuration)]
    (. builder snowflakeDestinationConfiguration data))
  (when-some [data (lookup-entry config id :splunk-destination-configuration)]
    (. builder splunkDestinationConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-delivery-stream-builder
  "Creates a  `CfnDeliveryStream$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-delivery-stream-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-delivery-stream-builder> (CfnDeliveryStream$Builder/create scope (name id)) id config))


(defn cfn-delivery-stream-cloud-watch-logging-options-property-builder>
  "The cfn-delivery-stream-cloud-watch-logging-options-property-builder> function updates a CfnDeliveryStream$CloudWatchLoggingOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$CloudWatchLoggingOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
"
  [^CfnDeliveryStream$CloudWatchLoggingOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-stream-name)]
    (. builder logStreamName data))
  (.build builder))


(defn cfn-delivery-stream-cloud-watch-logging-options-property-builder
  "Creates a  `CfnDeliveryStream$CloudWatchLoggingOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-cloud-watch-logging-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-cloud-watch-logging-options-property-builder> (new CfnDeliveryStream$CloudWatchLoggingOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-copy-command-property-builder>
  "The cfn-delivery-stream-copy-command-property-builder> function updates a CfnDeliveryStream$CopyCommandProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$CopyCommandProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyOptions` | java.lang.String | [[cdk.support/lookup-entry]] | `:copy-options` |
| `dataTableColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-table-columns` |
| `dataTableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-table-name` |
"
  [^CfnDeliveryStream$CopyCommandProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :copy-options)]
    (. builder copyOptions data))
  (when-some [data (lookup-entry config id :data-table-columns)]
    (. builder dataTableColumns data))
  (when-some [data (lookup-entry config id :data-table-name)]
    (. builder dataTableName data))
  (.build builder))


(defn cfn-delivery-stream-copy-command-property-builder
  "Creates a  `CfnDeliveryStream$CopyCommandProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-copy-command-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-copy-command-property-builder> (new CfnDeliveryStream$CopyCommandProperty$Builder) id config))


(defn cfn-delivery-stream-data-format-conversion-configuration-property-builder>
  "The cfn-delivery-stream-data-format-conversion-configuration-property-builder> function updates a CfnDeliveryStream$DataFormatConversionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$DataFormatConversionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `inputFormatConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$InputFormatConfigurationProperty | [[cdk.support/lookup-entry]] | `:input-format-configuration` |
| `outputFormatConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-format-configuration` |
| `schemaConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$SchemaConfigurationProperty | [[cdk.support/lookup-entry]] | `:schema-configuration` |
"
  [^CfnDeliveryStream$DataFormatConversionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :input-format-configuration)]
    (. builder inputFormatConfiguration data))
  (when-some [data (lookup-entry config id :output-format-configuration)]
    (. builder outputFormatConfiguration data))
  (when-some [data (lookup-entry config id :schema-configuration)]
    (. builder schemaConfiguration data))
  (.build builder))


(defn cfn-delivery-stream-data-format-conversion-configuration-property-builder
  "Creates a  `CfnDeliveryStream$DataFormatConversionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-data-format-conversion-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-data-format-conversion-configuration-property-builder> (new CfnDeliveryStream$DataFormatConversionConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-delivery-stream-encryption-configuration-input-property-builder>
  "The cfn-delivery-stream-delivery-stream-encryption-configuration-input-property-builder> function updates a CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
"
  [^CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (when-some [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (.build builder))


(defn cfn-delivery-stream-delivery-stream-encryption-configuration-input-property-builder
  "Creates a  `CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-delivery-stream-encryption-configuration-input-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-delivery-stream-encryption-configuration-input-property-builder> (new CfnDeliveryStream$DeliveryStreamEncryptionConfigurationInputProperty$Builder) id config))


(defn cfn-delivery-stream-deserializer-property-builder>
  "The cfn-delivery-stream-deserializer-property-builder> function updates a CfnDeliveryStream$DeserializerProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$DeserializerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hiveJsonSerDe` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$HiveJsonSerDeProperty | [[cdk.support/lookup-entry]] | `:hive-json-ser-de` |
| `openXJsonSerDe` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:open-x-json-ser-de` |
"
  [^CfnDeliveryStream$DeserializerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hive-json-ser-de)]
    (. builder hiveJsonSerDe data))
  (when-some [data (lookup-entry config id :open-x-json-ser-de)]
    (. builder openXJsonSerDe data))
  (.build builder))


(defn cfn-delivery-stream-deserializer-property-builder
  "Creates a  `CfnDeliveryStream$DeserializerProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-deserializer-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-deserializer-property-builder> (new CfnDeliveryStream$DeserializerProperty$Builder) id config))


(defn cfn-delivery-stream-document-id-options-property-builder>
  "The cfn-delivery-stream-document-id-options-property-builder> function updates a CfnDeliveryStream$DocumentIdOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$DocumentIdOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultDocumentIdFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-document-id-format` |
"
  [^CfnDeliveryStream$DocumentIdOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :default-document-id-format)]
    (. builder defaultDocumentIdFormat data))
  (.build builder))


(defn cfn-delivery-stream-document-id-options-property-builder
  "Creates a  `CfnDeliveryStream$DocumentIdOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-document-id-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-document-id-options-property-builder> (new CfnDeliveryStream$DocumentIdOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-dynamic-partitioning-configuration-property-builder>
  "The cfn-delivery-stream-dynamic-partitioning-configuration-property-builder> function updates a CfnDeliveryStream$DynamicPartitioningConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$DynamicPartitioningConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `retryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-options` |
"
  [^CfnDeliveryStream$DynamicPartitioningConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :retry-options)]
    (. builder retryOptions data))
  (.build builder))


(defn cfn-delivery-stream-dynamic-partitioning-configuration-property-builder
  "Creates a  `CfnDeliveryStream$DynamicPartitioningConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-dynamic-partitioning-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-dynamic-partitioning-configuration-property-builder> (new CfnDeliveryStream$DynamicPartitioningConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-elasticsearch-buffering-hints-property-builder>
  "The cfn-delivery-stream-elasticsearch-buffering-hints-property-builder> function updates a CfnDeliveryStream$ElasticsearchBufferingHintsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$ElasticsearchBufferingHintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |
"
  [^CfnDeliveryStream$ElasticsearchBufferingHintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interval-in-seconds)]
    (. builder intervalInSeconds data))
  (when-some [data (lookup-entry config id :size-in-m-bs)]
    (. builder sizeInMBs data))
  (.build builder))


(defn cfn-delivery-stream-elasticsearch-buffering-hints-property-builder
  "Creates a  `CfnDeliveryStream$ElasticsearchBufferingHintsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-elasticsearch-buffering-hints-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-elasticsearch-buffering-hints-property-builder> (new CfnDeliveryStream$ElasticsearchBufferingHintsProperty$Builder) id config))


(defn cfn-delivery-stream-elasticsearch-destination-configuration-property-builder>
  "The cfn-delivery-stream-elasticsearch-destination-configuration-property-builder> function updates a CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfiguration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :buffering-hints)]
    (. builder bufferingHints data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :cluster-endpoint)]
    (. builder clusterEndpoint data))
  (when-some [data (lookup-entry config id :document-id-options)]
    (. builder documentIdOptions data))
  (when-some [data (lookup-entry config id :domain-arn)]
    (. builder domainArn data))
  (when-some [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-some [data (lookup-entry config id :index-rotation-period)]
    (. builder indexRotationPeriod data))
  (when-some [data (lookup-entry config id :processing-configuration)]
    (. builder processingConfiguration data))
  (when-some [data (lookup-entry config id :retry-options)]
    (. builder retryOptions data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-backup-mode)]
    (. builder s3BackupMode data))
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-delivery-stream-elasticsearch-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-elasticsearch-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-elasticsearch-destination-configuration-property-builder> (new CfnDeliveryStream$ElasticsearchDestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-elasticsearch-retry-options-property-builder>
  "The cfn-delivery-stream-elasticsearch-retry-options-property-builder> function updates a CfnDeliveryStream$ElasticsearchRetryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$ElasticsearchRetryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
"
  [^CfnDeliveryStream$ElasticsearchRetryOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (.build builder))


(defn cfn-delivery-stream-elasticsearch-retry-options-property-builder
  "Creates a  `CfnDeliveryStream$ElasticsearchRetryOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-elasticsearch-retry-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-elasticsearch-retry-options-property-builder> (new CfnDeliveryStream$ElasticsearchRetryOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-encryption-configuration-property-builder>
  "The cfn-delivery-stream-encryption-configuration-property-builder> function updates a CfnDeliveryStream$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsEncryptionConfig` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$KMSEncryptionConfigProperty | [[cdk.support/lookup-entry]] | `:kms-encryption-config` |
| `noEncryptionConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-encryption-config` |
"
  [^CfnDeliveryStream$EncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-encryption-config)]
    (. builder kmsEncryptionConfig data))
  (when-some [data (lookup-entry config id :no-encryption-config)]
    (. builder noEncryptionConfig data))
  (.build builder))


(defn cfn-delivery-stream-encryption-configuration-property-builder
  "Creates a  `CfnDeliveryStream$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-encryption-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-encryption-configuration-property-builder> (new CfnDeliveryStream$EncryptionConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-extended-s3-destination-configuration-property-builder>
  "The cfn-delivery-stream-extended-s3-destination-configuration-property-builder> function updates a CfnDeliveryStream$ExtendedS3DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$ExtendedS3DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `s3BackupMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-backup-mode` |
"
  [^CfnDeliveryStream$ExtendedS3DestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-some [data (lookup-entry config id :buffering-hints)]
    (. builder bufferingHints data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :compression-format)]
    (. builder compressionFormat data))
  (when-some [data (lookup-entry config id :custom-time-zone)]
    (. builder customTimeZone data))
  (when-some [data (lookup-entry config id :data-format-conversion-configuration)]
    (. builder dataFormatConversionConfiguration data))
  (when-some [data (lookup-entry config id :dynamic-partitioning-configuration)]
    (. builder dynamicPartitioningConfiguration data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :error-output-prefix)]
    (. builder errorOutputPrefix data))
  (when-some [data (lookup-entry config id :file-extension)]
    (. builder fileExtension data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :processing-configuration)]
    (. builder processingConfiguration data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-backup-configuration)]
    (. builder s3BackupConfiguration data))
  (when-some [data (lookup-entry config id :s3-backup-mode)]
    (. builder s3BackupMode data))
  (.build builder))


(defn cfn-delivery-stream-extended-s3-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$ExtendedS3DestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-extended-s3-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-extended-s3-destination-configuration-property-builder> (new CfnDeliveryStream$ExtendedS3DestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-hive-json-ser-de-property-builder>
  "The cfn-delivery-stream-hive-json-ser-de-property-builder> function updates a CfnDeliveryStream$HiveJsonSerDeProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$HiveJsonSerDeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timestampFormats` | java.util.List | [[cdk.support/lookup-entry]] | `:timestamp-formats` |
"
  [^CfnDeliveryStream$HiveJsonSerDeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :timestamp-formats)]
    (. builder timestampFormats data))
  (.build builder))


(defn cfn-delivery-stream-hive-json-ser-de-property-builder
  "Creates a  `CfnDeliveryStream$HiveJsonSerDeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-hive-json-ser-de-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-hive-json-ser-de-property-builder> (new CfnDeliveryStream$HiveJsonSerDeProperty$Builder) id config))


(defn cfn-delivery-stream-http-endpoint-common-attribute-property-builder>
  "The cfn-delivery-stream-http-endpoint-common-attribute-property-builder> function updates a CfnDeliveryStream$HttpEndpointCommonAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$HttpEndpointCommonAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `attributeValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-value` |
"
  [^CfnDeliveryStream$HttpEndpointCommonAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-name)]
    (. builder attributeName data))
  (when-some [data (lookup-entry config id :attribute-value)]
    (. builder attributeValue data))
  (.build builder))


(defn cfn-delivery-stream-http-endpoint-common-attribute-property-builder
  "Creates a  `CfnDeliveryStream$HttpEndpointCommonAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-http-endpoint-common-attribute-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-http-endpoint-common-attribute-property-builder> (new CfnDeliveryStream$HttpEndpointCommonAttributeProperty$Builder) id config))


(defn cfn-delivery-stream-http-endpoint-configuration-property-builder>
  "The cfn-delivery-stream-http-endpoint-configuration-property-builder> function updates a CfnDeliveryStream$HttpEndpointConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$HttpEndpointConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnDeliveryStream$HttpEndpointConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-key)]
    (. builder accessKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-delivery-stream-http-endpoint-configuration-property-builder
  "Creates a  `CfnDeliveryStream$HttpEndpointConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-http-endpoint-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-http-endpoint-configuration-property-builder> (new CfnDeliveryStream$HttpEndpointConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-http-endpoint-destination-configuration-property-builder>
  "The cfn-delivery-stream-http-endpoint-destination-configuration-property-builder> function updates a CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `s3Configuration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
"
  [^CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :buffering-hints)]
    (. builder bufferingHints data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :endpoint-configuration)]
    (. builder endpointConfiguration data))
  (when-some [data (lookup-entry config id :processing-configuration)]
    (. builder processingConfiguration data))
  (when-some [data (lookup-entry config id :request-configuration)]
    (. builder requestConfiguration data))
  (when-some [data (lookup-entry config id :retry-options)]
    (. builder retryOptions data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-backup-mode)]
    (. builder s3BackupMode data))
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (.build builder))


(defn cfn-delivery-stream-http-endpoint-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-http-endpoint-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-http-endpoint-destination-configuration-property-builder> (new CfnDeliveryStream$HttpEndpointDestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-http-endpoint-request-configuration-property-builder>
  "The cfn-delivery-stream-http-endpoint-request-configuration-property-builder> function updates a CfnDeliveryStream$HttpEndpointRequestConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$HttpEndpointRequestConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `commonAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:common-attributes` |
| `contentEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-encoding` |
"
  [^CfnDeliveryStream$HttpEndpointRequestConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :common-attributes)]
    (. builder commonAttributes data))
  (when-some [data (lookup-entry config id :content-encoding)]
    (. builder contentEncoding data))
  (.build builder))


(defn cfn-delivery-stream-http-endpoint-request-configuration-property-builder
  "Creates a  `CfnDeliveryStream$HttpEndpointRequestConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-http-endpoint-request-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-http-endpoint-request-configuration-property-builder> (new CfnDeliveryStream$HttpEndpointRequestConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-input-format-configuration-property-builder>
  "The cfn-delivery-stream-input-format-configuration-property-builder> function updates a CfnDeliveryStream$InputFormatConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$InputFormatConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deserializer` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$DeserializerProperty | [[cdk.support/lookup-entry]] | `:deserializer` |
"
  [^CfnDeliveryStream$InputFormatConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :deserializer)]
    (. builder deserializer data))
  (.build builder))


(defn cfn-delivery-stream-input-format-configuration-property-builder
  "Creates a  `CfnDeliveryStream$InputFormatConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-input-format-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-input-format-configuration-property-builder> (new CfnDeliveryStream$InputFormatConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-kinesis-stream-source-configuration-property-builder>
  "The cfn-delivery-stream-kinesis-stream-source-configuration-property-builder> function updates a CfnDeliveryStream$KinesisStreamSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$KinesisStreamSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kinesisStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kinesis-stream-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDeliveryStream$KinesisStreamSourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kinesis-stream-arn)]
    (. builder kinesisStreamArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-delivery-stream-kinesis-stream-source-configuration-property-builder
  "Creates a  `CfnDeliveryStream$KinesisStreamSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-kinesis-stream-source-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-kinesis-stream-source-configuration-property-builder> (new CfnDeliveryStream$KinesisStreamSourceConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-kms-encryption-config-property-builder>
  "The cfn-delivery-stream-kms-encryption-config-property-builder> function updates a CfnDeliveryStream$KMSEncryptionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$KMSEncryptionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awskmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:awskms-key-arn` |
"
  [^CfnDeliveryStream$KMSEncryptionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :awskms-key-arn)]
    (. builder awskmsKeyArn data))
  (.build builder))


(defn cfn-delivery-stream-kms-encryption-config-property-builder
  "Creates a  `CfnDeliveryStream$KMSEncryptionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-kms-encryption-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-kms-encryption-config-property-builder> (new CfnDeliveryStream$KMSEncryptionConfigProperty$Builder) id config))


(defn cfn-delivery-stream-msk-source-configuration-property-builder>
  "The cfn-delivery-stream-msk-source-configuration-property-builder> function updates a CfnDeliveryStream$MSKSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$MSKSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `mskClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:msk-cluster-arn` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
"
  [^CfnDeliveryStream$MSKSourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-configuration)]
    (. builder authenticationConfiguration data))
  (when-some [data (lookup-entry config id :msk-cluster-arn)]
    (. builder mskClusterArn data))
  (when-some [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (.build builder))


(defn cfn-delivery-stream-msk-source-configuration-property-builder
  "Creates a  `CfnDeliveryStream$MSKSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-msk-source-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-msk-source-configuration-property-builder> (new CfnDeliveryStream$MSKSourceConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-open-x-json-ser-de-property-builder>
  "The cfn-delivery-stream-open-x-json-ser-de-property-builder> function updates a CfnDeliveryStream$OpenXJsonSerDeProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$OpenXJsonSerDeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caseInsensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:case-insensitive` |
| `columnToJsonKeyMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-to-json-key-mappings` |
| `convertDotsInJsonKeysToUnderscores` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:convert-dots-in-json-keys-to-underscores` |
"
  [^CfnDeliveryStream$OpenXJsonSerDeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :case-insensitive)]
    (. builder caseInsensitive data))
  (when-some [data (lookup-entry config id :column-to-json-key-mappings)]
    (. builder columnToJsonKeyMappings data))
  (when-some [data (lookup-entry config id :convert-dots-in-json-keys-to-underscores)]
    (. builder convertDotsInJsonKeysToUnderscores data))
  (.build builder))


(defn cfn-delivery-stream-open-x-json-ser-de-property-builder
  "Creates a  `CfnDeliveryStream$OpenXJsonSerDeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-open-x-json-ser-de-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-open-x-json-ser-de-property-builder> (new CfnDeliveryStream$OpenXJsonSerDeProperty$Builder) id config))


(defn cfn-delivery-stream-orc-ser-de-property-builder>
  "The cfn-delivery-stream-orc-ser-de-property-builder> function updates a CfnDeliveryStream$OrcSerDeProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$OrcSerDeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `stripeSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stripe-size-bytes` |
"
  [^CfnDeliveryStream$OrcSerDeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :block-size-bytes)]
    (. builder blockSizeBytes data))
  (when-some [data (lookup-entry config id :bloom-filter-columns)]
    (. builder bloomFilterColumns data))
  (when-some [data (lookup-entry config id :bloom-filter-false-positive-probability)]
    (. builder bloomFilterFalsePositiveProbability data))
  (when-some [data (lookup-entry config id :compression)]
    (. builder compression data))
  (when-some [data (lookup-entry config id :dictionary-key-threshold)]
    (. builder dictionaryKeyThreshold data))
  (when-some [data (lookup-entry config id :enable-padding)]
    (. builder enablePadding data))
  (when-some [data (lookup-entry config id :format-version)]
    (. builder formatVersion data))
  (when-some [data (lookup-entry config id :padding-tolerance)]
    (. builder paddingTolerance data))
  (when-some [data (lookup-entry config id :row-index-stride)]
    (. builder rowIndexStride data))
  (when-some [data (lookup-entry config id :stripe-size-bytes)]
    (. builder stripeSizeBytes data))
  (.build builder))


(defn cfn-delivery-stream-orc-ser-de-property-builder
  "Creates a  `CfnDeliveryStream$OrcSerDeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-orc-ser-de-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-orc-ser-de-property-builder> (new CfnDeliveryStream$OrcSerDeProperty$Builder) id config))


(defn cfn-delivery-stream-output-format-configuration-property-builder>
  "The cfn-delivery-stream-output-format-configuration-property-builder> function updates a CfnDeliveryStream$OutputFormatConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$OutputFormatConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serializer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:serializer` |
"
  [^CfnDeliveryStream$OutputFormatConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :serializer)]
    (. builder serializer data))
  (.build builder))


(defn cfn-delivery-stream-output-format-configuration-property-builder
  "Creates a  `CfnDeliveryStream$OutputFormatConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-output-format-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-output-format-configuration-property-builder> (new CfnDeliveryStream$OutputFormatConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-parquet-ser-de-property-builder>
  "The cfn-delivery-stream-parquet-ser-de-property-builder> function updates a CfnDeliveryStream$ParquetSerDeProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$ParquetSerDeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-size-bytes` |
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `enableDictionaryCompression` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dictionary-compression` |
| `maxPaddingBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-padding-bytes` |
| `pageSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:page-size-bytes` |
| `writerVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:writer-version` |
"
  [^CfnDeliveryStream$ParquetSerDeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :block-size-bytes)]
    (. builder blockSizeBytes data))
  (when-some [data (lookup-entry config id :compression)]
    (. builder compression data))
  (when-some [data (lookup-entry config id :enable-dictionary-compression)]
    (. builder enableDictionaryCompression data))
  (when-some [data (lookup-entry config id :max-padding-bytes)]
    (. builder maxPaddingBytes data))
  (when-some [data (lookup-entry config id :page-size-bytes)]
    (. builder pageSizeBytes data))
  (when-some [data (lookup-entry config id :writer-version)]
    (. builder writerVersion data))
  (.build builder))


(defn cfn-delivery-stream-parquet-ser-de-property-builder
  "Creates a  `CfnDeliveryStream$ParquetSerDeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-parquet-ser-de-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-parquet-ser-de-property-builder> (new CfnDeliveryStream$ParquetSerDeProperty$Builder) id config))


(defn cfn-delivery-stream-processing-configuration-property-builder>
  "The cfn-delivery-stream-processing-configuration-property-builder> function updates a CfnDeliveryStream$ProcessingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$ProcessingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `processors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processors` |
"
  [^CfnDeliveryStream$ProcessingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :processors)]
    (. builder processors data))
  (.build builder))


(defn cfn-delivery-stream-processing-configuration-property-builder
  "Creates a  `CfnDeliveryStream$ProcessingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-processing-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-processing-configuration-property-builder> (new CfnDeliveryStream$ProcessingConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-processor-parameter-property-builder>
  "The cfn-delivery-stream-processor-parameter-property-builder> function updates a CfnDeliveryStream$ProcessorParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$ProcessorParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnDeliveryStream$ProcessorParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-delivery-stream-processor-parameter-property-builder
  "Creates a  `CfnDeliveryStream$ProcessorParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-processor-parameter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-processor-parameter-property-builder> (new CfnDeliveryStream$ProcessorParameterProperty$Builder) id config))


(defn cfn-delivery-stream-processor-property-builder>
  "The cfn-delivery-stream-processor-property-builder> function updates a CfnDeliveryStream$ProcessorProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$ProcessorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDeliveryStream$ProcessorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-delivery-stream-processor-property-builder
  "Creates a  `CfnDeliveryStream$ProcessorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-processor-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-processor-property-builder> (new CfnDeliveryStream$ProcessorProperty$Builder) id config))


(defn cfn-delivery-stream-props-builder>
  "The cfn-delivery-stream-props-builder> function updates a CfnDeliveryStreamProps$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeliveryStreamProps$Builder builder id config]
  (when-some [data (lookup-entry config id :amazon-open-search-serverless-destination-configuration)]
    (. builder amazonOpenSearchServerlessDestinationConfiguration data))
  (when-some [data (lookup-entry config id :amazonopensearchservice-destination-configuration)]
    (. builder amazonopensearchserviceDestinationConfiguration data))
  (when-some [data (lookup-entry config id :delivery-stream-encryption-configuration-input)]
    (. builder deliveryStreamEncryptionConfigurationInput data))
  (when-some [data (lookup-entry config id :delivery-stream-name)]
    (. builder deliveryStreamName data))
  (when-some [data (lookup-entry config id :delivery-stream-type)]
    (. builder deliveryStreamType data))
  (when-some [data (lookup-entry config id :elasticsearch-destination-configuration)]
    (. builder elasticsearchDestinationConfiguration data))
  (when-some [data (lookup-entry config id :extended-s3-destination-configuration)]
    (. builder extendedS3DestinationConfiguration data))
  (when-some [data (lookup-entry config id :http-endpoint-destination-configuration)]
    (. builder httpEndpointDestinationConfiguration data))
  (when-some [data (lookup-entry config id :kinesis-stream-source-configuration)]
    (. builder kinesisStreamSourceConfiguration data))
  (when-some [data (lookup-entry config id :msk-source-configuration)]
    (. builder mskSourceConfiguration data))
  (when-some [data (lookup-entry config id :redshift-destination-configuration)]
    (. builder redshiftDestinationConfiguration data))
  (when-some [data (lookup-entry config id :s3-destination-configuration)]
    (. builder s3DestinationConfiguration data))
  (when-some [data (lookup-entry config id :snowflake-destination-configuration)]
    (. builder snowflakeDestinationConfiguration data))
  (when-some [data (lookup-entry config id :splunk-destination-configuration)]
    (. builder splunkDestinationConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-delivery-stream-props-builder
  "Creates a  `CfnDeliveryStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-props-builder> (new CfnDeliveryStreamProps$Builder) id config))


(defn cfn-delivery-stream-redshift-destination-configuration-property-builder>
  "The cfn-delivery-stream-redshift-destination-configuration-property-builder> function updates a CfnDeliveryStream$RedshiftDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$RedshiftDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnDeliveryStream$RedshiftDestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :cluster-jdbcurl)]
    (. builder clusterJdbcurl data))
  (when-some [data (lookup-entry config id :copy-command)]
    (. builder copyCommand data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :processing-configuration)]
    (. builder processingConfiguration data))
  (when-some [data (lookup-entry config id :retry-options)]
    (. builder retryOptions data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-backup-configuration)]
    (. builder s3BackupConfiguration data))
  (when-some [data (lookup-entry config id :s3-backup-mode)]
    (. builder s3BackupMode data))
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-delivery-stream-redshift-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$RedshiftDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-redshift-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-redshift-destination-configuration-property-builder> (new CfnDeliveryStream$RedshiftDestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-redshift-retry-options-property-builder>
  "The cfn-delivery-stream-redshift-retry-options-property-builder> function updates a CfnDeliveryStream$RedshiftRetryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$RedshiftRetryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
"
  [^CfnDeliveryStream$RedshiftRetryOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (.build builder))


(defn cfn-delivery-stream-redshift-retry-options-property-builder
  "Creates a  `CfnDeliveryStream$RedshiftRetryOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-redshift-retry-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-redshift-retry-options-property-builder> (new CfnDeliveryStream$RedshiftRetryOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-retry-options-property-builder>
  "The cfn-delivery-stream-retry-options-property-builder> function updates a CfnDeliveryStream$RetryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$RetryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
"
  [^CfnDeliveryStream$RetryOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (.build builder))


(defn cfn-delivery-stream-retry-options-property-builder
  "Creates a  `CfnDeliveryStream$RetryOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-retry-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-retry-options-property-builder> (new CfnDeliveryStream$RetryOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-s3-destination-configuration-property-builder>
  "The cfn-delivery-stream-s3-destination-configuration-property-builder> function updates a CfnDeliveryStream$S3DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$S3DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `bufferingHints` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$BufferingHintsProperty | [[cdk.support/lookup-entry]] | `:buffering-hints` |
| `cloudWatchLoggingOptions` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$CloudWatchLoggingOptionsProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-options` |
| `compressionFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-format` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `errorOutputPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-output-prefix` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDeliveryStream$S3DestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-some [data (lookup-entry config id :buffering-hints)]
    (. builder bufferingHints data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :compression-format)]
    (. builder compressionFormat data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :error-output-prefix)]
    (. builder errorOutputPrefix data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-delivery-stream-s3-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$S3DestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-s3-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-s3-destination-configuration-property-builder> (new CfnDeliveryStream$S3DestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-schema-configuration-property-builder>
  "The cfn-delivery-stream-schema-configuration-property-builder> function updates a CfnDeliveryStream$SchemaConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SchemaConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnDeliveryStream$SchemaConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-delivery-stream-schema-configuration-property-builder
  "Creates a  `CfnDeliveryStream$SchemaConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-schema-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-schema-configuration-property-builder> (new CfnDeliveryStream$SchemaConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-serializer-property-builder>
  "The cfn-delivery-stream-serializer-property-builder> function updates a CfnDeliveryStream$SerializerProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SerializerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `orcSerDe` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$OrcSerDeProperty | [[cdk.support/lookup-entry]] | `:orc-ser-de` |
| `parquetSerDe` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet-ser-de` |
"
  [^CfnDeliveryStream$SerializerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :orc-ser-de)]
    (. builder orcSerDe data))
  (when-some [data (lookup-entry config id :parquet-ser-de)]
    (. builder parquetSerDe data))
  (.build builder))


(defn cfn-delivery-stream-serializer-property-builder
  "Creates a  `CfnDeliveryStream$SerializerProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-serializer-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-serializer-property-builder> (new CfnDeliveryStream$SerializerProperty$Builder) id config))


(defn cfn-delivery-stream-snowflake-destination-configuration-property-builder>
  "The cfn-delivery-stream-snowflake-destination-configuration-property-builder> function updates a CfnDeliveryStream$SnowflakeDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SnowflakeDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnDeliveryStream$SnowflakeDestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-url)]
    (. builder accountUrl data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :content-column-name)]
    (. builder contentColumnName data))
  (when-some [data (lookup-entry config id :data-loading-option)]
    (. builder dataLoadingOption data))
  (when-some [data (lookup-entry config id :database)]
    (. builder database data))
  (when-some [data (lookup-entry config id :key-passphrase)]
    (. builder keyPassphrase data))
  (when-some [data (lookup-entry config id :meta-data-column-name)]
    (. builder metaDataColumnName data))
  (when-some [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (when-some [data (lookup-entry config id :processing-configuration)]
    (. builder processingConfiguration data))
  (when-some [data (lookup-entry config id :retry-options)]
    (. builder retryOptions data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-backup-mode)]
    (. builder s3BackupMode data))
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :snowflake-role-configuration)]
    (. builder snowflakeRoleConfiguration data))
  (when-some [data (lookup-entry config id :snowflake-vpc-configuration)]
    (. builder snowflakeVpcConfiguration data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-delivery-stream-snowflake-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$SnowflakeDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-snowflake-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-snowflake-destination-configuration-property-builder> (new CfnDeliveryStream$SnowflakeDestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-snowflake-retry-options-property-builder>
  "The cfn-delivery-stream-snowflake-retry-options-property-builder> function updates a CfnDeliveryStream$SnowflakeRetryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SnowflakeRetryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
"
  [^CfnDeliveryStream$SnowflakeRetryOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (.build builder))


(defn cfn-delivery-stream-snowflake-retry-options-property-builder
  "Creates a  `CfnDeliveryStream$SnowflakeRetryOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-snowflake-retry-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-snowflake-retry-options-property-builder> (new CfnDeliveryStream$SnowflakeRetryOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-snowflake-role-configuration-property-builder>
  "The cfn-delivery-stream-snowflake-role-configuration-property-builder> function updates a CfnDeliveryStream$SnowflakeRoleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SnowflakeRoleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `snowflakeRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:snowflake-role` |
"
  [^CfnDeliveryStream$SnowflakeRoleConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :snowflake-role)]
    (. builder snowflakeRole data))
  (.build builder))


(defn cfn-delivery-stream-snowflake-role-configuration-property-builder
  "Creates a  `CfnDeliveryStream$SnowflakeRoleConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-snowflake-role-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-snowflake-role-configuration-property-builder> (new CfnDeliveryStream$SnowflakeRoleConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-snowflake-vpc-configuration-property-builder>
  "The cfn-delivery-stream-snowflake-vpc-configuration-property-builder> function updates a CfnDeliveryStream$SnowflakeVpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SnowflakeVpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `privateLinkVpceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-link-vpce-id` |
"
  [^CfnDeliveryStream$SnowflakeVpcConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :private-link-vpce-id)]
    (. builder privateLinkVpceId data))
  (.build builder))


(defn cfn-delivery-stream-snowflake-vpc-configuration-property-builder
  "Creates a  `CfnDeliveryStream$SnowflakeVpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-snowflake-vpc-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-snowflake-vpc-configuration-property-builder> (new CfnDeliveryStream$SnowflakeVpcConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-splunk-buffering-hints-property-builder>
  "The cfn-delivery-stream-splunk-buffering-hints-property-builder> function updates a CfnDeliveryStream$SplunkBufferingHintsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SplunkBufferingHintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-in-seconds` |
| `sizeInMBs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-m-bs` |
"
  [^CfnDeliveryStream$SplunkBufferingHintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interval-in-seconds)]
    (. builder intervalInSeconds data))
  (when-some [data (lookup-entry config id :size-in-m-bs)]
    (. builder sizeInMBs data))
  (.build builder))


(defn cfn-delivery-stream-splunk-buffering-hints-property-builder
  "Creates a  `CfnDeliveryStream$SplunkBufferingHintsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-splunk-buffering-hints-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-splunk-buffering-hints-property-builder> (new CfnDeliveryStream$SplunkBufferingHintsProperty$Builder) id config))


(defn cfn-delivery-stream-splunk-destination-configuration-property-builder>
  "The cfn-delivery-stream-splunk-destination-configuration-property-builder> function updates a CfnDeliveryStream$SplunkDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SplunkDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `s3Configuration` | software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
"
  [^CfnDeliveryStream$SplunkDestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :buffering-hints)]
    (. builder bufferingHints data))
  (when-some [data (lookup-entry config id :cloud-watch-logging-options)]
    (. builder cloudWatchLoggingOptions data))
  (when-some [data (lookup-entry config id :hec-acknowledgment-timeout-in-seconds)]
    (. builder hecAcknowledgmentTimeoutInSeconds data))
  (when-some [data (lookup-entry config id :hec-endpoint)]
    (. builder hecEndpoint data))
  (when-some [data (lookup-entry config id :hec-endpoint-type)]
    (. builder hecEndpointType data))
  (when-some [data (lookup-entry config id :hec-token)]
    (. builder hecToken data))
  (when-some [data (lookup-entry config id :processing-configuration)]
    (. builder processingConfiguration data))
  (when-some [data (lookup-entry config id :retry-options)]
    (. builder retryOptions data))
  (when-some [data (lookup-entry config id :s3-backup-mode)]
    (. builder s3BackupMode data))
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (.build builder))


(defn cfn-delivery-stream-splunk-destination-configuration-property-builder
  "Creates a  `CfnDeliveryStream$SplunkDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-splunk-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-splunk-destination-configuration-property-builder> (new CfnDeliveryStream$SplunkDestinationConfigurationProperty$Builder) id config))


(defn cfn-delivery-stream-splunk-retry-options-property-builder>
  "The cfn-delivery-stream-splunk-retry-options-property-builder> function updates a CfnDeliveryStream$SplunkRetryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$SplunkRetryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
"
  [^CfnDeliveryStream$SplunkRetryOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (.build builder))


(defn cfn-delivery-stream-splunk-retry-options-property-builder
  "Creates a  `CfnDeliveryStream$SplunkRetryOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-splunk-retry-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-splunk-retry-options-property-builder> (new CfnDeliveryStream$SplunkRetryOptionsProperty$Builder) id config))


(defn cfn-delivery-stream-vpc-configuration-property-builder>
  "The cfn-delivery-stream-vpc-configuration-property-builder> function updates a CfnDeliveryStream$VpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryStream$VpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnDeliveryStream$VpcConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-delivery-stream-vpc-configuration-property-builder
  "Creates a  `CfnDeliveryStream$VpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-delivery-stream-vpc-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-delivery-stream-vpc-configuration-property-builder> (new CfnDeliveryStream$VpcConfigurationProperty$Builder) id config))