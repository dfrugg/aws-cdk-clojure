(ns cdk.api.services.lookoutmetrics
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lookoutmetrics package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lookoutmetrics CfnAlert$ActionProperty$Builder
                                                           CfnAlert$Builder
                                                           CfnAlert$LambdaConfigurationProperty$Builder
                                                           CfnAlert$SNSConfigurationProperty$Builder
                                                           CfnAlertProps$Builder
                                                           CfnAnomalyDetector$AnomalyDetectorConfigProperty$Builder
                                                           CfnAnomalyDetector$AppFlowConfigProperty$Builder
                                                           CfnAnomalyDetector$Builder
                                                           CfnAnomalyDetector$CloudwatchConfigProperty$Builder
                                                           CfnAnomalyDetector$CsvFormatDescriptorProperty$Builder
                                                           CfnAnomalyDetector$FileFormatDescriptorProperty$Builder
                                                           CfnAnomalyDetector$JsonFormatDescriptorProperty$Builder
                                                           CfnAnomalyDetector$MetricProperty$Builder
                                                           CfnAnomalyDetector$MetricSetProperty$Builder
                                                           CfnAnomalyDetector$MetricSourceProperty$Builder
                                                           CfnAnomalyDetector$RDSSourceConfigProperty$Builder
                                                           CfnAnomalyDetector$RedshiftSourceConfigProperty$Builder
                                                           CfnAnomalyDetector$S3SourceConfigProperty$Builder
                                                           CfnAnomalyDetector$TimestampColumnProperty$Builder
                                                           CfnAnomalyDetector$VpcConfigurationProperty$Builder
                                                           CfnAnomalyDetectorProps$Builder]))


(defn cfn-alert-action-property-builder
  "The cfn-alert-action-property-builder function buildes out new instances of 
CfnAlert$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-configuration` |
| `snsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns-configuration` |"
  [stack id config]
  (let [builder (CfnAlert$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-configuration)]
      (. builder lambdaConfiguration data))
    (when-let [data (lookup-entry config id :sns-configuration)]
      (. builder snsConfiguration data))
    (.build builder)))


(defn cfn-alert-builder
  "The cfn-alert-builder function buildes out new instances of 
CfnAlert$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `alertDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-description` |
| `alertName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-name` |
| `alertSensitivityThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:alert-sensitivity-threshold` |
| `anomalyDetectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-arn` |"
  [stack id config]
  (let [builder (CfnAlert$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :alert-description)]
      (. builder alertDescription data))
    (when-let [data (lookup-entry config id :alert-name)]
      (. builder alertName data))
    (when-let [data (lookup-entry config id :alert-sensitivity-threshold)]
      (. builder alertSensitivityThreshold data))
    (when-let [data (lookup-entry config id :anomaly-detector-arn)]
      (. builder anomalyDetectorArn data))
    (.build builder)))


(defn cfn-alert-lambda-configuration-property-builder
  "The cfn-alert-lambda-configuration-property-builder function buildes out new instances of 
CfnAlert$LambdaConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnAlert$LambdaConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-arn)]
      (. builder lambdaArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-alert-props-builder
  "The cfn-alert-props-builder function buildes out new instances of 
CfnAlertProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `alertDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-description` |
| `alertName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-name` |
| `alertSensitivityThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:alert-sensitivity-threshold` |
| `anomalyDetectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-arn` |"
  [stack id config]
  (let [builder (CfnAlertProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :alert-description)]
      (. builder alertDescription data))
    (when-let [data (lookup-entry config id :alert-name)]
      (. builder alertName data))
    (when-let [data (lookup-entry config id :alert-sensitivity-threshold)]
      (. builder alertSensitivityThreshold data))
    (when-let [data (lookup-entry config id :anomaly-detector-arn)]
      (. builder anomalyDetectorArn data))
    (.build builder)))


(defn cfn-alert-sns-configuration-property-builder
  "The cfn-alert-sns-configuration-property-builder function buildes out new instances of 
CfnAlert$SNSConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |"
  [stack id config]
  (let [builder (CfnAlert$SNSConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (.build builder)))


(defn cfn-anomaly-detector-anomaly-detector-config-property-builder
  "The cfn-anomaly-detector-anomaly-detector-config-property-builder function buildes out new instances of 
CfnAnomalyDetector$AnomalyDetectorConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anomalyDetectorFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-frequency` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$AnomalyDetectorConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :anomaly-detector-frequency)]
      (. builder anomalyDetectorFrequency data))
    (.build builder)))


(defn cfn-anomaly-detector-app-flow-config-property-builder
  "The cfn-anomaly-detector-app-flow-config-property-builder function buildes out new instances of 
CfnAnomalyDetector$AppFlowConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$AppFlowConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :flow-name)]
      (. builder flowName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-anomaly-detector-builder
  "The cfn-anomaly-detector-builder function buildes out new instances of 
CfnAnomalyDetector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anomalyDetectorConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:anomaly-detector-config` |
| `anomalyDetectorDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-description` |
| `anomalyDetectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `metricSetList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-set-list` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :anomaly-detector-config)]
      (. builder anomalyDetectorConfig data))
    (when-let [data (lookup-entry config id :anomaly-detector-description)]
      (. builder anomalyDetectorDescription data))
    (when-let [data (lookup-entry config id :anomaly-detector-name)]
      (. builder anomalyDetectorName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :metric-set-list)]
      (. builder metricSetList data))
    (.build builder)))


(defn cfn-anomaly-detector-cloudwatch-config-property-builder
  "The cfn-anomaly-detector-cloudwatch-config-property-builder function buildes out new instances of 
CfnAnomalyDetector$CloudwatchConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$CloudwatchConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-anomaly-detector-csv-format-descriptor-property-builder
  "The cfn-anomaly-detector-csv-format-descriptor-property-builder function buildes out new instances of 
CfnAnomalyDetector$CsvFormatDescriptorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `charset` | java.lang.String | [[cdk.support/lookup-entry]] | `:charset` |
| `containsHeader` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contains-header` |
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `fileCompression` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-compression` |
| `headerList` | java.util.List | [[cdk.support/lookup-entry]] | `:header-list` |
| `quoteSymbol` | java.lang.String | [[cdk.support/lookup-entry]] | `:quote-symbol` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$CsvFormatDescriptorProperty$Builder.)]
    (when-let [data (lookup-entry config id :charset)]
      (. builder charset data))
    (when-let [data (lookup-entry config id :contains-header)]
      (. builder containsHeader data))
    (when-let [data (lookup-entry config id :delimiter)]
      (. builder delimiter data))
    (when-let [data (lookup-entry config id :file-compression)]
      (. builder fileCompression data))
    (when-let [data (lookup-entry config id :header-list)]
      (. builder headerList data))
    (when-let [data (lookup-entry config id :quote-symbol)]
      (. builder quoteSymbol data))
    (.build builder)))


(defn cfn-anomaly-detector-file-format-descriptor-property-builder
  "The cfn-anomaly-detector-file-format-descriptor-property-builder function buildes out new instances of 
CfnAnomalyDetector$FileFormatDescriptorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvFormatDescriptor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv-format-descriptor` |
| `jsonFormatDescriptor` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$JsonFormatDescriptorProperty | [[cdk.support/lookup-entry]] | `:json-format-descriptor` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$FileFormatDescriptorProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv-format-descriptor)]
      (. builder csvFormatDescriptor data))
    (when-let [data (lookup-entry config id :json-format-descriptor)]
      (. builder jsonFormatDescriptor data))
    (.build builder)))


(defn cfn-anomaly-detector-json-format-descriptor-property-builder
  "The cfn-anomaly-detector-json-format-descriptor-property-builder function buildes out new instances of 
CfnAnomalyDetector$JsonFormatDescriptorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `charset` | java.lang.String | [[cdk.support/lookup-entry]] | `:charset` |
| `fileCompression` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-compression` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$JsonFormatDescriptorProperty$Builder.)]
    (when-let [data (lookup-entry config id :charset)]
      (. builder charset data))
    (when-let [data (lookup-entry config id :file-compression)]
      (. builder fileCompression data))
    (.build builder)))


(defn cfn-anomaly-detector-metric-property-builder
  "The cfn-anomaly-detector-metric-property-builder function buildes out new instances of 
CfnAnomalyDetector$MetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationFunction` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation-function` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$MetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :aggregation-function)]
      (. builder aggregationFunction data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-anomaly-detector-metric-set-property-builder
  "The cfn-anomaly-detector-metric-set-property-builder function buildes out new instances of 
CfnAnomalyDetector$MetricSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionList` | java.util.List | [[cdk.support/lookup-entry]] | `:dimension-list` |
| `metricList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-list` |
| `metricSetDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-set-description` |
| `metricSetFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-set-frequency` |
| `metricSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-set-name` |
| `metricSource` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$MetricSourceProperty | [[cdk.support/lookup-entry]] | `:metric-source` |
| `offset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:offset` |
| `timestampColumn` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$TimestampColumnProperty | [[cdk.support/lookup-entry]] | `:timestamp-column` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$MetricSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimension-list)]
      (. builder dimensionList data))
    (when-let [data (lookup-entry config id :metric-list)]
      (. builder metricList data))
    (when-let [data (lookup-entry config id :metric-set-description)]
      (. builder metricSetDescription data))
    (when-let [data (lookup-entry config id :metric-set-frequency)]
      (. builder metricSetFrequency data))
    (when-let [data (lookup-entry config id :metric-set-name)]
      (. builder metricSetName data))
    (when-let [data (lookup-entry config id :metric-source)]
      (. builder metricSource data))
    (when-let [data (lookup-entry config id :offset)]
      (. builder offset data))
    (when-let [data (lookup-entry config id :timestamp-column)]
      (. builder timestampColumn data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (.build builder)))


(defn cfn-anomaly-detector-metric-source-property-builder
  "The cfn-anomaly-detector-metric-source-property-builder function buildes out new instances of 
CfnAnomalyDetector$MetricSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appFlowConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-flow-config` |
| `cloudwatchConfig` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$CloudwatchConfigProperty | [[cdk.support/lookup-entry]] | `:cloudwatch-config` |
| `rdsSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rds-source-config` |
| `redshiftSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redshift-source-config` |
| `s3SourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-source-config` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$MetricSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-flow-config)]
      (. builder appFlowConfig data))
    (when-let [data (lookup-entry config id :cloudwatch-config)]
      (. builder cloudwatchConfig data))
    (when-let [data (lookup-entry config id :rds-source-config)]
      (. builder rdsSourceConfig data))
    (when-let [data (lookup-entry config id :redshift-source-config)]
      (. builder redshiftSourceConfig data))
    (when-let [data (lookup-entry config id :s3-source-config)]
      (. builder s3SourceConfig data))
    (.build builder)))


(defn cfn-anomaly-detector-props-builder
  "The cfn-anomaly-detector-props-builder function buildes out new instances of 
CfnAnomalyDetectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anomalyDetectorConfig` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$AnomalyDetectorConfigProperty | [[cdk.support/lookup-entry]] | `:anomaly-detector-config` |
| `anomalyDetectorDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-description` |
| `anomalyDetectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `metricSetList` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-set-list` |"
  [stack id config]
  (let [builder (CfnAnomalyDetectorProps$Builder.)]
    (when-let [data (lookup-entry config id :anomaly-detector-config)]
      (. builder anomalyDetectorConfig data))
    (when-let [data (lookup-entry config id :anomaly-detector-description)]
      (. builder anomalyDetectorDescription data))
    (when-let [data (lookup-entry config id :anomaly-detector-name)]
      (. builder anomalyDetectorName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :metric-set-list)]
      (. builder metricSetList data))
    (.build builder)))


(defn cfn-anomaly-detector-rds-source-config-property-builder
  "The cfn-anomaly-detector-rds-source-config-property-builder function buildes out new instances of 
CfnAnomalyDetector$RDSSourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseHost` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-host` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databasePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:database-port` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$RDSSourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-host)]
      (. builder databaseHost data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :database-port)]
      (. builder databasePort data))
    (when-let [data (lookup-entry config id :db-instance-identifier)]
      (. builder dbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :secret-manager-arn)]
      (. builder secretManagerArn data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-anomaly-detector-redshift-source-config-property-builder
  "The cfn-anomaly-detector-redshift-source-config-property-builder function buildes out new instances of 
CfnAnomalyDetector$RedshiftSourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `databaseHost` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-host` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databasePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:database-port` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$RedshiftSourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :database-host)]
      (. builder databaseHost data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :database-port)]
      (. builder databasePort data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :secret-manager-arn)]
      (. builder secretManagerArn data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-anomaly-detector-s3-source-config-property-builder
  "The cfn-anomaly-detector-s3-source-config-property-builder function buildes out new instances of 
CfnAnomalyDetector$S3SourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileFormatDescriptor` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$FileFormatDescriptorProperty | [[cdk.support/lookup-entry]] | `:file-format-descriptor` |
| `historicalDataPathList` | java.util.List | [[cdk.support/lookup-entry]] | `:historical-data-path-list` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `templatedPathList` | java.util.List | [[cdk.support/lookup-entry]] | `:templated-path-list` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$S3SourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-format-descriptor)]
      (. builder fileFormatDescriptor data))
    (when-let [data (lookup-entry config id :historical-data-path-list)]
      (. builder historicalDataPathList data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :templated-path-list)]
      (. builder templatedPathList data))
    (.build builder)))


(defn cfn-anomaly-detector-timestamp-column-property-builder
  "The cfn-anomaly-detector-timestamp-column-property-builder function buildes out new instances of 
CfnAnomalyDetector$TimestampColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-format` |
| `columnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-name` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$TimestampColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :column-format)]
      (. builder columnFormat data))
    (when-let [data (lookup-entry config id :column-name)]
      (. builder columnName data))
    (.build builder)))


(defn cfn-anomaly-detector-vpc-configuration-property-builder
  "The cfn-anomaly-detector-vpc-configuration-property-builder function buildes out new instances of 
CfnAnomalyDetector$VpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-id-list` |
| `subnetIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-id-list` |"
  [stack id config]
  (let [builder (CfnAnomalyDetector$VpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-id-list)]
      (. builder securityGroupIdList data))
    (when-let [data (lookup-entry config id :subnet-id-list)]
      (. builder subnetIdList data))
    (.build builder)))